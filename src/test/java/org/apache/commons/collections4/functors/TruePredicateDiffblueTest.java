package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TruePredicateDiffblueTest {
  /**
   * Test {@link TruePredicate#truePredicate()}.
   * <p>
   * Method under test: {@link TruePredicate#truePredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TruePredicate.truePredicate()"})
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
