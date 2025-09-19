package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FalsePredicateDiffblueTest {
  /**
   * Test {@link FalsePredicate#falsePredicate()}.
   *
   * <p>Method under test: {@link FalsePredicate#falsePredicate()}
   */
  @Test
  @DisplayName("Test falsePredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate FalsePredicate.falsePredicate()"})
  void testFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualFalsePredicateResult = FalsePredicate.falsePredicate();
    boolean actualEvaluateResult = actualFalsePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualFalsePredicateResult instanceof FalsePredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualFalsePredicateResult.evaluate("Object"));
    assertFalse(actualFalsePredicateResult.test("Object"));
  }
}
