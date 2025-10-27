package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class TruePredicateDiffblueTest {
  /**
   * Method under test: {@link TruePredicate#truePredicate()}
   */
  @Test
  public void testTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualTruePredicateResult = TruePredicate.truePredicate();

    // Assert
    assertTrue(actualTruePredicateResult instanceof TruePredicate);
    assertTrue(actualTruePredicateResult.evaluate("42"));
    assertTrue(actualTruePredicateResult.evaluate("Object"));
    assertTrue(actualTruePredicateResult.test("Object"));
  }
}
