package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FalsePredicateDiffblueTest {
  /**
   * Test {@link FalsePredicate#falsePredicate()}.
   * <p>
   * Method under test: {@link FalsePredicate#falsePredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate FalsePredicate.falsePredicate()"})
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
