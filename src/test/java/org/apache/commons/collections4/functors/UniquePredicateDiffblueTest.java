package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UniquePredicateDiffblueTest {
  /**
   * Test {@link UniquePredicate#uniquePredicate()}.
   * <p>
   * Method under test: {@link UniquePredicate#uniquePredicate()}
   */
  @Test
  @DisplayName("Test uniquePredicate()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate UniquePredicate.uniquePredicate()"})
  void testUniquePredicate() {
    // Arrange and Act
    Predicate<Object> actualUniquePredicateResult = UniquePredicate.uniquePredicate();
    boolean actualEvaluateResult = actualUniquePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualUniquePredicateResult instanceof UniquePredicate);
    assertTrue(actualUniquePredicateResult.evaluate("Object"));
    assertFalse(actualUniquePredicateResult.test("Object"));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link UniquePredicate#test(Object)}.
   * <p>
   * Method under test: {@link UniquePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean UniquePredicate.test(Object)"})
  void testTest() {
    // Arrange
    UniquePredicate<Object> uniquePredicate = new UniquePredicate<>();

    // Act
    boolean actualTestResult = uniquePredicate.test("Object");

    // Assert
    assertFalse(uniquePredicate.evaluate("Object"));
    assertTrue(actualTestResult);
  }
}
