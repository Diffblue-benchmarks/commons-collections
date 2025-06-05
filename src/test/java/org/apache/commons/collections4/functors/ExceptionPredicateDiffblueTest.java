package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExceptionPredicateDiffblueTest {
  /**
   * Test {@link ExceptionPredicate#exceptionPredicate()}.
   * <p>
   * Method under test: {@link ExceptionPredicate#exceptionPredicate()}
   */
  @Test
  @DisplayName("Test exceptionPredicate()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate ExceptionPredicate.exceptionPredicate()"})
  void testExceptionPredicate() {
    // Arrange and Act
    Predicate<Object> actualExceptionPredicateResult = ExceptionPredicate.exceptionPredicate();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionPredicateResult.evaluate("42"));
  }
}
