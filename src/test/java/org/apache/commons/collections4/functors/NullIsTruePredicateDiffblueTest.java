package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NullIsTruePredicateDiffblueTest {
  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsTruePredicate(Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        NullIsTruePredicate.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsTruePredicate(Predicate); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        NullIsTruePredicate.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsTruePredicate(Predicate); when Predicate; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_whenPredicate_thenNull() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        NullIsTruePredicate.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate(null);

    // Assert
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    assertNull(null);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NullIsTruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsTruePredicate(Predicate); when Predicate; then return NullIsTruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_whenPredicate_thenReturnNullIsTruePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        NullIsTruePredicate.nullIsTruePredicate(predicate);

    // Assert
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)}.
   *
   * <p>Method under test: {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test new NullIsTruePredicate(Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NullIsTruePredicate.<init>(Predicate)"})
  void testNewNullIsTruePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NullIsTruePredicate<Object> actualNullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsTruePredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#getPredicates()}.
   *
   * <p>Method under test: {@link NullIsTruePredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] NullIsTruePredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    NullIsTruePredicate<Object> nullIsTruePredicate =
        new NullIsTruePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, nullIsTruePredicate.getPredicates().length);
  }

  /**
   * Test {@link NullIsTruePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)} with {@link Predicate}.
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given NullIsTruePredicate(Predicate) with Predicate; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsTruePredicate.test(Object)"})
  void testTest_givenNullIsTruePredicateWithPredicate_whenNull_thenReturnTrue() {
    // Arrange
    NullIsTruePredicate<Object> nullIsTruePredicate =
        new NullIsTruePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertTrue(nullIsTruePredicate.test(null));
  }

  /**
   * Test {@link NullIsTruePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; when 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsTruePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_whenObject_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NullIsTruePredicate<Object> nullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsTruePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link NullIsTruePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsTruePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'true'; when 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsTruePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_whenObject_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NullIsTruePredicate<Object> nullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsTruePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
