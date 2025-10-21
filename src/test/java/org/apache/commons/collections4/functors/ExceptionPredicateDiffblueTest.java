package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExceptionPredicateDiffblueTest {
  /**
   * Test {@link ExceptionPredicate#exceptionPredicate()}.
   * <p>
   * Method under test: {@link ExceptionPredicate#exceptionPredicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ExceptionPredicate.exceptionPredicate()"})
  public void testExceptionPredicate() {
    // Arrange and Act
    Predicate<Object> actualExceptionPredicateResult = ExceptionPredicate.exceptionPredicate();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionPredicateResult.evaluate("42"));
  }
}
