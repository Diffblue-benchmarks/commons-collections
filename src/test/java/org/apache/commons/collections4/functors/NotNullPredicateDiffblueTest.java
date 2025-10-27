package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NotNullPredicateDiffblueTest {
  /**
   * Method under test: {@link NotNullPredicate#notNullPredicate()}
   */
  @Test
  public void testNotNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = NotNullPredicate.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertTrue(actualNotNullPredicateResult.evaluate("42"));
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link NotNullPredicate#notNullPredicate()}
   */
  @Test
  public void testNotNullPredicate2() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = NotNullPredicate.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertFalse(actualNotNullPredicateResult.evaluate(null));
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }
}
