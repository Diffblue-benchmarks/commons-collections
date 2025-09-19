package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

class NotPredicateDiffblueTest {
  /**
   * Test {@link NotPredicate#notPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#notPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test notPredicate(Predicate); given 'false'; when Predicate test(Object) return 'false'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NotPredicate.notPredicate(Predicate)"})
  void testNotPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNotPredicateResult = NotPredicate.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates =
        ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#notPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#notPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test notPredicate(Predicate); given 'true'; when Predicate test(Object) return 'true'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NotPredicate.notPredicate(Predicate)"})
  void testNotPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNotPredicateResult = NotPredicate.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates =
        ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#notPredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NotPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#notPredicate(Predicate)}
   */
  @Test
  @DisplayName("Test notPredicate(Predicate); when Predicate; then return NotPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NotPredicate.notPredicate(Predicate)"})
  void testNotPredicate_whenPredicate_thenReturnNotPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNotPredicateResult = NotPredicate.notPredicate(predicate);

    // Assert
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates =
        ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#NotPredicate(Predicate)}.
   *
   * <p>Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  @DisplayName("Test new NotPredicate(Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NotPredicate.<init>(Predicate)"})
  void testNewNotPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NotPredicate<Object> actualNotPredicate = new NotPredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNotPredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#getPredicates()}.
   *
   * <p>Method under test: {@link NotPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] NotPredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    NotPredicate<Object> notPredicate = new NotPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, notPredicate.getPredicates().length);
  }

  /**
   * Test {@link NotPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NotPredicate<Object> notPredicate = new NotPredicate<>(predicate);

    // Act
    boolean actualTestResult = notPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link NotPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NotPredicate<Object> notPredicate = new NotPredicate<>(predicate);

    // Act
    boolean actualTestResult = notPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }
}
