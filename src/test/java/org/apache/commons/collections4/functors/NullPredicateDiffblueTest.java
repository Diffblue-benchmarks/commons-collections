package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NullPredicateDiffblueTest {
  /**
   * Test {@link NullPredicate#nullPredicate()}.
   * <ul>
   *   <li>Then return evaluate {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullPredicate#nullPredicate()}
   */
  @Test
  @DisplayName("Test nullPredicate(); then return evaluate 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NullPredicate.nullPredicate()"})
  void testNullPredicate_thenReturnEvaluateNull() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = NullPredicate.nullPredicate();
    boolean actualEvaluateResult = actualNullPredicateResult.evaluate(null);

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link NullPredicate#nullPredicate()}.
   * <ul>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullPredicate#nullPredicate()}
   */
  @Test
  @DisplayName("Test nullPredicate(); then return not evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NullPredicate.nullPredicate()"})
  void testNullPredicate_thenReturnNotEvaluate42() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = NullPredicate.nullPredicate();

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualNullPredicateResult.evaluate("42"));
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
  }
}
