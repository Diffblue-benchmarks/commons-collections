package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

class AbstractPredicateDiffblueTest {
  /**
   * Test {@link AbstractPredicate#evaluate(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPredicate#evaluate(Object)}
   */
  @Test
  @DisplayName(
      "Test evaluate(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPredicate.evaluate(Object)"})
  void testEvaluate_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AllPredicate<Object> allPredicate =
        new AllPredicate<>(predicate, mock(Predicate.class), mock(Predicate.class));

    // Act
    boolean actualEvaluateResult = allPredicate.evaluate("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AbstractPredicate#evaluate(Object)}.
   *
   * <ul>
   *   <li>Given {@link UniquePredicate} (default constructor).
   *   <li>Then not {@link UniquePredicate} (default constructor) test {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPredicate#evaluate(Object)}
   */
  @Test
  @DisplayName(
      "Test evaluate(Object); given UniquePredicate (default constructor); then not UniquePredicate (default constructor) test 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPredicate.evaluate(Object)"})
  void testEvaluate_givenUniquePredicate_thenNotUniquePredicateTestObject() {
    // Arrange
    UniquePredicate<Object> uniquePredicate = new UniquePredicate<>();

    // Act
    boolean actualEvaluateResult = uniquePredicate.evaluate("Object");

    // Assert
    assertFalse(uniquePredicate.test("Object"));
    assertTrue(actualEvaluateResult);
  }
}
