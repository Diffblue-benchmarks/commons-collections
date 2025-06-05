package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WhileClosureDiffblueTest {
  /**
   * Test {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}
   */
  @Test
  @DisplayName("Test whileClosure(Predicate, Closure, boolean); given 'false'; when Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure WhileClosure.whileClosure(Predicate, Closure, boolean)"})
  void testWhileClosure_givenFalse_whenPredicateTestReturnFalse_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualWhileClosureResult = WhileClosure.whileClosure(predicate, closure, true);
    actualWhileClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualWhileClosureResult instanceof WhileClosure);
    assertTrue(((WhileClosure<Object>) actualWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualWhileClosureResult).getPredicate());
  }

  /**
   * Test {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return not DoLoop.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}
   */
  @Test
  @DisplayName("Test whileClosure(Predicate, Closure, boolean); given 'false'; when Predicate test(Object) return 'false'; then return not DoLoop")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure WhileClosure.whileClosure(Predicate, Closure, boolean)"})
  void testWhileClosure_givenFalse_whenPredicateTestReturnFalse_thenReturnNotDoLoop() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);

    // Act
    Closure<Object> actualWhileClosureResult = WhileClosure.whileClosure(predicate, closure, false);
    actualWhileClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualWhileClosureResult instanceof WhileClosure);
    assertFalse(((WhileClosure<Object>) actualWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualWhileClosureResult).getPredicate());
  }

  /**
   * Test {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return DoLoop.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#whileClosure(Predicate, Closure, boolean)}
   */
  @Test
  @DisplayName("Test whileClosure(Predicate, Closure, boolean); when Predicate; then return DoLoop")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure WhileClosure.whileClosure(Predicate, Closure, boolean)"})
  void testWhileClosure_whenPredicate_thenReturnDoLoop() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> closure = mock(Closure.class);

    // Act
    Closure<Object> actualWhileClosureResult = WhileClosure.whileClosure(predicate, closure, true);

    // Assert
    assertTrue(actualWhileClosureResult instanceof WhileClosure);
    assertTrue(((WhileClosure<Object>) actualWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualWhileClosureResult).getPredicate());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link WhileClosure#WhileClosure(Predicate, Closure, boolean)}
   *   <li>{@link WhileClosure#getClosure()}
   *   <li>{@link WhileClosure#getPredicate()}
   *   <li>{@link WhileClosure#isDoLoop()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void WhileClosure.<init>(Predicate, Closure, boolean)", "Closure WhileClosure.getClosure()",
      "Predicate WhileClosure.getPredicate()", "boolean WhileClosure.isDoLoop()"})
  void testGettersAndSetters() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> closure = mock(Closure.class);

    // Act
    WhileClosure<Object> actualWhileClosure = new WhileClosure<>(predicate, closure, true);
    Closure<? super Object> actualClosure = actualWhileClosure.getClosure();
    Predicate<? super Object> actualPredicate = actualWhileClosure.getPredicate();

    // Assert
    assertTrue(actualWhileClosure.isDoLoop());
    assertSame(closure, actualClosure);
    assertSame(predicate, actualPredicate);
  }

  /**
   * Test {@link WhileClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void WhileClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnFalse_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    WhileClosure<Object> whileClosure = new WhileClosure<>(predicate, closure, true);

    // Act
    whileClosure.execute("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link WhileClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WhileClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void WhileClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnFalse_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    WhileClosure<Object> whileClosure = new WhileClosure<>(predicate, mock(Closure.class), false);

    // Act
    whileClosure.execute("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
  }
}
