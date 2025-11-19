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

class OrPredicateDiffblueTest {
  /**
   * Test {@link OrPredicate#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test orPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OrPredicate.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOrPredicateResult = OrPredicate.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link OrPredicate#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test orPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OrPredicate.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualOrPredicateResult = OrPredicate.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link OrPredicate#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test orPredicate(Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OrPredicate.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualOrPredicateResult = OrPredicate.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link OrPredicate#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link OrPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test orPredicate(Predicate, Predicate); when Predicate; then return OrPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OrPredicate.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_whenPredicate_thenReturnOrPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualOrPredicateResult = OrPredicate.orPredicate(predicate1, predicate2);

    // Assert
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link OrPredicate#OrPredicate(Predicate, Predicate)}.
   *
   * <p>Method under test: {@link OrPredicate#OrPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new OrPredicate(Predicate, Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OrPredicate.<init>(Predicate, Predicate)"})
  void testNewOrPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    OrPredicate<Object> actualOrPredicate = new OrPredicate<>(predicate1, predicate2);

    // Assert
    Predicate<? super Object>[] predicates = actualOrPredicate.getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link OrPredicate#getPredicates()}.
   *
   * <p>Method under test: {@link OrPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] OrPredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    OrPredicate<Object> orPredicate =
        new OrPredicate<>(mock(Predicate.class), mock(Predicate.class));

    // Act and Assert
    assertEquals(2, orPredicate.getPredicates().length);
  }

  /**
   * Test {@link OrPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    OrPredicate<Object> orPredicate = new OrPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = orPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link OrPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    OrPredicate<Object> orPredicate = new OrPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = orPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link OrPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    OrPredicate<Object> orPredicate = new OrPredicate<>(predicate1, mock(Predicate.class));

    // Act
    boolean actualTestResult = orPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
