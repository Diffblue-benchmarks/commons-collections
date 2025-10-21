package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ForClosureDiffblueTest {
  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then Closure return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  public void testForClosure_givenFalse_thenClosureReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<? super Object> closure = new IfClosure<>(predicate, mock(Closure.class));

    // Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure2 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure2 instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) closure2).getFalseClosure() instanceof NOPClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, closure2);
  }

  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  public void testForClosure_givenFalse_whenOne_thenReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(1, new IfClosure<>(predicate, mock(Closure.class)));
    actualForClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualForClosureResult).getFalseClosure() instanceof NOPClosure);
  }

  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then Closure return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  public void testForClosure_givenTrue_whenPredicateTestReturnTrue_thenClosureReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    IfClosure<? super Object> closure = new IfClosure<>(predicate, trueClosure);

    // Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(trueClosure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure2 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure2 instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) closure2).getFalseClosure() instanceof NOPClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, closure2);
  }

  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then Closure return {@link ForClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  public void testForClosure_thenClosureReturnForClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<? super Object> closure2 = new ForClosure<>(3, closure);

    // Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    Closure<? super Object> closure3 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure3 instanceof ForClosure);
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(3, ((ForClosure<? super Object>) closure3).getCount());
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then return {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  public void testForClosure_whenClosureAcceptDoesNothing_thenReturnClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  public void testForClosure_whenZero_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(0, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ForClosure#ForClosure(int, Closure)}
   *   <li>{@link ForClosure#getClosure()}
   *   <li>{@link ForClosure#getCount()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ForClosure.<init>(int, Closure)", "Closure ForClosure.getClosure()",
      "int ForClosure.getCount()"})
  public void testGettersAndSetters() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);

    // Act
    ForClosure<Object> actualForClosure = new ForClosure<>(3, closure);
    Closure<? super Object> actualClosure = actualForClosure.getClosure();

    // Assert
    assertEquals(3, actualForClosure.getCount());
    assertSame(closure, actualClosure);
  }

  /**
   * Test {@link ForClosure#execute(Object)}.
   * <p>
   * Method under test: {@link ForClosure#execute(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ForClosure.execute(Object)"})
  public void testExecute() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<Object> forClosure = new ForClosure<>(3, closure);

    // Act
    forClosure.execute("Input");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
  }
}
