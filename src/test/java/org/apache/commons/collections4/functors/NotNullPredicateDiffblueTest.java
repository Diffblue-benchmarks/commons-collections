package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NotNullPredicateDiffblueTest {
  /**
   * Test {@link NotNullPredicate#notNullPredicate()}.
   * <ul>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotNullPredicate#notNullPredicate()}
   */
  @Test
  @DisplayName("Test notNullPredicate(); then return evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NotNullPredicate.notNullPredicate()"})
  void testNotNullPredicate_thenReturnEvaluate42() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = NotNullPredicate.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertTrue(actualNotNullPredicateResult.evaluate("42"));
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }

  /**
   * Test {@link NotNullPredicate#notNullPredicate()}.
   * <ul>
   *   <li>Then return not evaluate {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotNullPredicate#notNullPredicate()}
   */
  @Test
  @DisplayName("Test notNullPredicate(); then return not evaluate 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NotNullPredicate.notNullPredicate()"})
  void testNotNullPredicate_thenReturnNotEvaluateNull() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = NotNullPredicate.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertFalse(actualNotNullPredicateResult.evaluate(null));
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }
}
