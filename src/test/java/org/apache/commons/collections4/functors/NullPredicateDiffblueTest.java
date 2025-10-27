package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NullPredicateDiffblueTest {
  /**
   * Method under test: {@link NullPredicate#nullPredicate()}
   */
  @Test
  public void testNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = NullPredicate.nullPredicate();

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualNullPredicateResult.evaluate("42"));
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link NullPredicate#nullPredicate()}
   */
  @Test
  public void testNullPredicate2() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = NullPredicate.nullPredicate();
    boolean actualEvaluateResult = actualNullPredicateResult.evaluate(null);

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
    assertTrue(actualEvaluateResult);
  }
}
