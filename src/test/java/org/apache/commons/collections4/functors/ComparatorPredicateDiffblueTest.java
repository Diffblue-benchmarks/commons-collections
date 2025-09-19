package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.ComparatorPredicate.Criterion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ComparatorPredicateDiffblueTest {
  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.EQUAL);

    // Assert
    assertThrows(IllegalStateException.class, () -> actualComparatorPredicateResult.evaluate("42"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>Given {@link DefaultEquator#HASHCODE_NULL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; given HASHCODE_NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_givenHashcode_null() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(DefaultEquator.HASHCODE_NULL);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.LESS);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>Given {@link DefaultEquator#HASHCODE_NULL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; given HASHCODE_NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_givenHashcode_null2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(DefaultEquator.HASHCODE_NULL);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.GREATER_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>Given zero.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; given zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_givenZero() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@code GREATER}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; given zero; when 'GREATER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_givenZero_whenGreater() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.GREATER);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@code LESS_OR_EQUAL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; given zero; when 'LESS_OR_EQUAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_givenZero_whenLessOrEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.LESS_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; when Comparator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_whenComparator() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", mock(Comparator.class), Criterion.EQUAL);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>When {@code EQUAL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; when 'EQUAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_whenEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>When {@code GREATER}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; when 'GREATER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_whenGreater() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.GREATER);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>When {@code GREATER_OR_EQUAL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; when 'GREATER_OR_EQUAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_whenGreaterOrEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.GREATER_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>When {@code LESS}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; when 'LESS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_whenLess() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.LESS);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code
   * object}, {@code comparator}, {@code criterion}.
   *
   * <ul>
   *   <li>When {@code LESS_OR_EQUAL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator,
   * Criterion)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator, Criterion) with 'object', 'comparator', 'criterion'; when 'LESS_OR_EQUAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"
  })
  void testComparatorPredicateWithObjectComparatorCriterion_whenLessOrEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator, Criterion.LESS_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object},
   * {@code comparator}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator) with 'object', 'comparator'; given one; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  void testComparatorPredicateWithObjectComparator_givenOne_thenReturnNotEvaluate42() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object},
   * {@code comparator}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator) with 'object', 'comparator'; given zero; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  void testComparatorPredicateWithObjectComparator_givenZero_thenReturnEvaluate42() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object},
   * {@code comparator}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator) with 'object', 'comparator'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  void testComparatorPredicateWithObjectComparator_thenThrowIllegalStateException() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", comparator);

    // Assert
    assertThrows(IllegalStateException.class, () -> actualComparatorPredicateResult.evaluate("42"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object},
   * {@code comparator}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @DisplayName(
      "Test comparatorPredicate(Object, Comparator) with 'object', 'comparator'; when Comparator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  void testComparatorPredicateWithObjectComparator_whenComparator() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult =
        ComparatorPredicate.comparatorPredicate("Object", mock(Comparator.class));

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.GREATER_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.LESS_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest3() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.LESS_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link
   *       DefaultEquator#HASHCODE_NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Comparator compare(Object, Object) return HASHCODE_NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorCompareReturnHashcode_null_thenReturnFalse() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(DefaultEquator.HASHCODE_NULL);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.GREATER_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link
   *       DefaultEquator#HASHCODE_NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Comparator compare(Object, Object) return HASHCODE_NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorCompareReturnHashcode_null_thenReturnTrue() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(DefaultEquator.HASHCODE_NULL);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.LESS);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return zero.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Comparator compare(Object, Object) return zero; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorCompareReturnZero_thenReturnTrue() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with
   *       {@code Object} and {@link Comparator} and criterion is {@code EQUAL}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given ComparatorPredicate(Object, Comparator, Criterion) with 'Object' and Comparator and criterion is 'EQUAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with
   *       {@code Object} and {@link Comparator} and criterion is {@code GREATER}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given ComparatorPredicate(Object, Comparator, Criterion) with 'Object' and Comparator and criterion is 'GREATER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsGreater() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.GREATER);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with
   *       {@code Object} and {@link Comparator} and criterion is {@code GREATER}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given ComparatorPredicate(Object, Comparator, Criterion) with 'Object' and Comparator and criterion is 'GREATER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsGreater2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.GREATER);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with
   *       {@code Object} and {@link Comparator} and criterion is {@code LESS}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given ComparatorPredicate(Object, Comparator, Criterion) with 'Object' and Comparator and criterion is 'LESS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsLess() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.LESS);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  void testTest_thenThrowIllegalStateException() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());
    ComparatorPredicate<Object> comparatorPredicate =
        new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> comparatorPredicate.test("Target"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }
}
