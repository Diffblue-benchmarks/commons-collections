package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class FalsePredicateDiffblueTest {
  /**
   * Method under test: {@link FalsePredicate#falsePredicate()}
   */
  @Test
  public void testFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualFalsePredicateResult = FalsePredicate.falsePredicate();

    // Assert
    assertTrue(actualFalsePredicateResult instanceof FalsePredicate);
    assertFalse(actualFalsePredicateResult.evaluate("42"));
    assertFalse(actualFalsePredicateResult.evaluate("Object"));
    assertFalse(actualFalsePredicateResult.test("Object"));
  }
}
