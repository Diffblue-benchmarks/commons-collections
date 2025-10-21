package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Closure;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ChainedClosureDiffblueTest {
  /**
   * Test {@link ChainedClosure#chainedClosure(Closure[])} with {@code Closure[]}.
   * <ul>
   *   <li>Then return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedClosure#chainedClosure(Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Closure[])"})
  public void testChainedClosureWithClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(closure);
    actualChainedClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
  }

  /**
   * Test {@link ChainedClosure#chainedClosure(Closure[])} with {@code Closure[]}.
   * <ul>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedClosure#chainedClosure(Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Closure[])"})
  public void testChainedClosureWithClosure_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure();
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ChainedClosure#chainedClosure(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedClosure#chainedClosure(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Collection)"})
  public void testChainedClosureWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> closure2 = mock(Closure.class);
    doNothing().when(closure2).accept(Mockito.<Object>any());

    ArrayList<Closure<? super Object>> closures = new ArrayList<>();
    closures.add(closure2);
    closures.add(closure);

    // Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    verify(closure2).accept(isA(Object.class));
    verify(closure).accept(isA(Object.class));
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(2, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
  }

  /**
   * Test {@link ChainedClosure#chainedClosure(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedClosure#chainedClosure(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Collection)"})
  public void testChainedClosureWithCollection_whenArrayList_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(new ArrayList<>());
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ChainedClosure#ChainedClosure(Closure[])}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedClosure#ChainedClosure(Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ChainedClosure.<init>(Closure[])"})
  public void testNewChainedClosure_whenClosure_thenReturnArrayLengthIsOne() {
    // Arrange and Act
    ChainedClosure<Object> actualChainedClosure = new ChainedClosure<>(mock(Closure.class));

    // Assert
    assertEquals(1, actualChainedClosure.getClosures().length);
  }

  /**
   * Test {@link ChainedClosure#ChainedClosure(Closure[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Closures is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedClosure#ChainedClosure(Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ChainedClosure.<init>(Closure[])"})
  public void testNewChainedClosure_whenNull_thenReturnClosuresIsNull() {
    // Arrange and Act
    ChainedClosure<Object> actualChainedClosure = new ChainedClosure<>(null);

    // Assert
    assertNull(actualChainedClosure.getClosures());
  }

  /**
   * Test {@link ChainedClosure#execute(Object)}.
   * <p>
   * Method under test: {@link ChainedClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ChainedClosure.execute(Object)"})
  public void testExecute() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(closure);

    // Act
    chainedClosure.execute("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link ChainedClosure#getClosures()}.
   * <p>
   * Method under test: {@link ChainedClosure#getClosures()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure[] ChainedClosure.getClosures()"})
  public void testGetClosures() {
    // Arrange
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(mock(Closure.class));

    // Act and Assert
    assertEquals(1, chainedClosure.getClosures().length);
  }
}
