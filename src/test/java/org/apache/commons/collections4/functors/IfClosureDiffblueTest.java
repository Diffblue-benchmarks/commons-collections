package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IfClosureDiffblueTest {
  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> trueClosure2 = new IfClosure<>(predicate2, trueClosure);

    // Act
    Closure<Object> actualIfClosureResult = IfClosure.ifClosure(predicate, trueClosure2);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure3 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure3 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> falseClosure =
        ((IfClosure<Object>) actualIfClosureResult).getFalseClosure();
    assertTrue(falseClosure instanceof NOPClosure);
    assertSame(trueClosure2, trueClosure3);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
    assertSame(falseClosure, ((IfClosure<? super Object>) trueClosure3).getFalseClosure());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> trueClosure =
        new IfClosure<>(predicate2, mock(Closure.class), falseClosure);

    // Act
    Closure<Object> actualIfClosureResult = IfClosure.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(closure);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        IfClosure.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ChainedClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, ((ChainedClosure<? super Object>) trueClosure2).getClosures().length);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> trueClosure = mock(Closure.class);

    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualIfClosureResult =
        IfClosure.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenReturnTrueClosureIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> trueClosure = mock(Closure.class);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        IfClosure.ifClosure(predicate, trueClosure, falseClosure);

    // Assert
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenReturnTrueClosureIsClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        IfClosure.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link IfClosure}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then TrueClosure return IfClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenTrueClosureReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> trueClosure2 = new IfClosure<>(predicate2, trueClosure);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        IfClosure.ifClosure(predicate, trueClosure2, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure3 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure3 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) trueClosure3).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure2, trueClosure3);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link IfClosure}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then TrueClosure return IfClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenTrueClosureReturnIfClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<? super Object> trueClosure = new IfClosure<>(predicate2, mock(Closure.class));
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        IfClosure.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) trueClosure2).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> trueClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = IfClosure.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; given 'true'; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_givenTrue_thenReturnTrueClosureIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualIfClosureResult = IfClosure.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; then TrueClosure return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnChainedClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(closure);

    // Act
    Closure<Object> actualIfClosureResult = IfClosure.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ChainedClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, ((ChainedClosure<? super Object>) trueClosure2).getClosures().length);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link IfClosure#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure IfClosure.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_whenPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> trueClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = IfClosure.ifClosure(predicate, trueClosure);

    // Assert
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IfClosure#IfClosure(Predicate, Closure, Closure)}
   *   <li>{@link IfClosure#getFalseClosure()}
   *   <li>{@link IfClosure#getPredicate()}
   *   <li>{@link IfClosure#getTrueClosure()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IfClosure.<init>(Predicate, Closure, Closure)",
    "Closure IfClosure.getFalseClosure()",
    "Predicate IfClosure.getPredicate()",
    "Closure IfClosure.getTrueClosure()"
  })
  void testGettersAndSetters() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> trueClosure = mock(Closure.class);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    IfClosure<Object> actualIfClosure = new IfClosure<>(predicate, trueClosure, falseClosure);
    Closure<? super Object> actualFalseClosure = actualIfClosure.getFalseClosure();
    Predicate<? super Object> actualPredicate = actualIfClosure.getPredicate();

    // Assert
    assertSame(falseClosure, actualFalseClosure);
    assertSame(trueClosure, actualIfClosure.getTrueClosure());
    assertSame(predicate, actualPredicate);
  }

  /**
   * Test {@link IfClosure#IfClosure(Predicate, Closure)}.
   *
   * <p>Method under test: {@link IfClosure#IfClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test new IfClosure(Predicate, Closure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IfClosure.<init>(Predicate, Closure)"})
  void testNewIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> trueClosure = mock(Closure.class);

    // Act
    IfClosure<Object> actualIfClosure = new IfClosure<>(predicate, trueClosure);

    // Assert
    assertTrue(actualIfClosure.getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, actualIfClosure.getTrueClosure());
    assertSame(predicate, actualIfClosure.getPredicate());
  }

  /**
   * Test {@link IfClosure#execute(Object)}.
   *
   * <p>Method under test: {@link IfClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IfClosure.execute(Object)"})
  void testExecute() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    IfClosure<Object> ifClosure = new IfClosure<>(predicate, mock(Closure.class), falseClosure);

    // Act
    ifClosure.execute("Input");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IfClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link ChainedClosure#ChainedClosure(Closure[])} with closures is {@link Closure}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given ChainedClosure(Closure[]) with closures is Closure; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IfClosure.execute(Object)"})
  void testExecute_givenChainedClosureWithClosuresIsClosure_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(closure);

    IfClosure<Object> ifClosure = new IfClosure<>(predicate, trueClosure);

    // Act
    ifClosure.execute(42);

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IfClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link IfClosure#IfClosure(Predicate, Closure)} with {@link Predicate} and
   *       trueClosure is {@link Closure}.
   *   <li>When {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given IfClosure(Predicate, Closure) with Predicate and trueClosure is Closure; when 'Input'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IfClosure.execute(Object)"})
  void testExecute_givenIfClosureWithPredicateAndTrueClosureIsClosure_whenInput() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    IfClosure<Object> ifClosure = new IfClosure<>(predicate, trueClosure);

    // Act
    ifClosure.execute("Input");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IfClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link IfClosure#IfClosure(Predicate, Closure)} with {@link Predicate} and
   *       trueClosure is {@link IfClosure#IfClosure(Predicate, Closure)}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given IfClosure(Predicate, Closure) with Predicate and trueClosure is IfClosure(Predicate, Closure); then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IfClosure.execute(Object)"})
  void testExecute_givenIfClosureWithPredicateAndTrueClosureIsIfClosure_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> trueClosure2 = new IfClosure<>(predicate2, trueClosure);

    IfClosure<Object> ifClosure = new IfClosure<>(predicate, trueClosure2);

    // Act
    ifClosure.execute(42);

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
  }

  /**
   * Test {@link IfClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>When forty-two.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link IfClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given Predicate test(Object) return 'false'; when forty-two; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IfClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnFalse_whenFortyTwo_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<Object> ifClosure = new IfClosure<>(predicate, mock(Closure.class));

    // Act
    ifClosure.execute(42);

    // Assert
    verify(predicate).test(isA(Object.class));
  }
}
