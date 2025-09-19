package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TruePredicateDiffblueTest {
  /**
   * Test {@link TruePredicate#truePredicate()}.
   *
   * <p>Method under test: {@link TruePredicate#truePredicate()}
   */
  @Test
  @DisplayName("Test truePredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TruePredicate.truePredicate()"})
  void testTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualTruePredicateResult = TruePredicate.truePredicate();
    boolean actualEvaluateResult = actualTruePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualTruePredicateResult instanceof TruePredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualTruePredicateResult.evaluate("Object"));
    assertTrue(actualTruePredicateResult.test("Object"));
  }
}
