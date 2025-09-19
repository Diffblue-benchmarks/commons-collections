package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Closure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ChainedClosureDiffblueTest {
  /**
   * Test {@link ChainedClosure#chainedClosure(Closure[])} with {@code Closure[]}.
   *
   * <ul>
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedClosure#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_thenReturnNOPClosure() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[] {};

    // Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
    assertEquals(0, closures.length);
  }

  /**
   * Test {@link ChainedClosure#chainedClosure(Closure[])} with {@code Closure[]}.
   *
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedClosure#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName(
      "Test chainedClosure(Closure[]) with 'Closure[]'; when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosureAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    // Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
    assertEquals(1, closures.length);
  }

  /**
   * Test {@link ChainedClosure#chainedClosure(Closure[])} with {@code Closure[]}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedClosure#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName(
      "Test chainedClosure(Closure[]) with 'Closure[]'; when Closure; then return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    // Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(closures);

    // Assert
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
    assertEquals(1, closures.length);
  }

  /**
   * Test {@link ChainedClosure#chainedClosure(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedClosure#chainedClosure(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedClosure(Collection) with 'Collection'; when ArrayList(); then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ChainedClosure.chainedClosure(Collection)"})
  void testChainedClosureWithCollection_whenArrayList_thenReturnNOPClosure() {
    // Arrange
    ArrayList<Closure<? super Object>> closures = new ArrayList<>();

    // Act
    Closure<Object> actualChainedClosureResult = ChainedClosure.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
    assertTrue(closures.isEmpty());
  }

  /**
   * Test {@link ChainedClosure#ChainedClosure(Closure[])}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link ChainedClosure#ChainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test new ChainedClosure(Closure[]); when Closure; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChainedClosure.<init>(Closure[])"})
  void testNewChainedClosure_whenClosure_thenReturnArrayLengthIsOne() {
    // Arrange and Act
    ChainedClosure<Object> actualChainedClosure = new ChainedClosure<>(mock(Closure.class));

    // Assert
    assertEquals(1, actualChainedClosure.getClosures().length);
  }

  /**
   * Test {@link ChainedClosure#ChainedClosure(Closure[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Closures is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ChainedClosure#ChainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test new ChainedClosure(Closure[]); when 'null'; then return Closures is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChainedClosure.<init>(Closure[])"})
  void testNewChainedClosure_whenNull_thenReturnClosuresIsNull() {
    // Arrange and Act
    ChainedClosure<Object> actualChainedClosure = new ChainedClosure<>(null);

    // Assert
    assertNull(actualChainedClosure.getClosures());
  }

  /**
   * Test {@link ChainedClosure#execute(Object)}.
   *
   * <p>Method under test: {@link ChainedClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChainedClosure.execute(Object)"})
  void testExecute() {
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
   *
   * <p>Method under test: {@link ChainedClosure#getClosures()}
   */
  @Test
  @DisplayName("Test getClosures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure[] ChainedClosure.getClosures()"})
  void testGetClosures() {
    // Arrange
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(mock(Closure.class));

    // Act and Assert
    assertEquals(1, chainedClosure.getClosures().length);
  }
}
