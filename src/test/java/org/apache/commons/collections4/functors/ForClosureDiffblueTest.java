package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
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

class ForClosureDiffblueTest {
  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_givenFalse_whenPredicateTestReturnFalse() {
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
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then Closure return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); given 'true'; when Predicate test(Object) return 'true'; then Closure return IfClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_givenTrue_whenPredicateTestReturnTrue_thenClosureReturnIfClosure() {
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
  @DisplayName("Test forClosure(int, Closure); then Closure return ForClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_thenClosureReturnForClosure() {
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
    assertEquals(3, closure2.getCount());
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
  @DisplayName("Test forClosure(int, Closure); when Closure accept(Object) does nothing; then return Closure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_whenClosureAcceptDoesNothing_thenReturnClosure() {
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
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when Closure; then return Closure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_whenClosure_thenReturnClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);

    // Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(3, closure);

    // Assert
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ForClosure#forClosure(int, Closure)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when one; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_whenOne_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(1, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
    assertNull(null);
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
  @DisplayName("Test forClosure(int, Closure); when zero; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ForClosure.forClosure(int, Closure)"})
  void testForClosure_whenZero_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ForClosure.forClosure(0, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
    assertNull(null);
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
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ForClosure.<init>(int, Closure)", "Closure ForClosure.getClosure()",
      "int ForClosure.getCount()"})
  void testGettersAndSetters() {
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
   * <ul>
   *   <li>Given {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ForClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ForClosure.execute(Object)"})
  void testExecute_givenClosureAcceptDoesNothing_thenCallsAccept() {
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
