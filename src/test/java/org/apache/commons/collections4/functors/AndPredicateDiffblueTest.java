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

class AndPredicateDiffblueTest {
  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate422() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then array length is two.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<? super Object> predicate22 = new AndPredicate<>(predicate12, predicate2);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate22);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate12).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    assertEquals(2, predicate22.getPredicates().length);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate22, predicates[1]);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return second element is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); when Predicate; then return second element is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_whenPredicate_thenReturnSecondElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);

    // Assert
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Predicate, Predicate)}.
   *
   * <p>Method under test: {@link AndPredicate#AndPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new AndPredicate(Predicate, Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AndPredicate.<init>(Predicate, Predicate)"})
  void testNewAndPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    AndPredicate<Object> actualAndPredicate = new AndPredicate<>(predicate1, predicate2);

    // Assert
    Predicate<? super Object>[] predicates = actualAndPredicate.getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#getPredicates()}.
   *
   * <p>Method under test: {@link AndPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] AndPredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    AndPredicate<Object> andPredicate =
        new AndPredicate<>(mock(Predicate.class), mock(Predicate.class));

    // Act and Assert
    assertEquals(2, andPredicate.getPredicates().length);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link
   *       Predicate} and predicate2 is {@link AndPredicate#AndPredicate(Predicate, Predicate)}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given AndPredicate(Predicate, Predicate) with predicate1 is Predicate and predicate2 is AndPredicate(Predicate, Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  void testTest_givenAndPredicateWithPredicate1IsPredicateAndPredicate2IsAndPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<? super Object> predicate22 = new AndPredicate<>(predicate12, predicate2);

    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, predicate22);

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate12).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, mock(Predicate.class));

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
