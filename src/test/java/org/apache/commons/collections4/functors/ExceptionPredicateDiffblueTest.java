package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class ExceptionPredicateDiffblueTest {
  /**
   * Method under test: {@link ExceptionPredicate#exceptionPredicate()}
   */
  @Test
  public void testExceptionPredicate() {
    // Arrange and Act
    Predicate<Object> actualExceptionPredicateResult = ExceptionPredicate.exceptionPredicate();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionPredicateResult.evaluate("42"));
  }
}
