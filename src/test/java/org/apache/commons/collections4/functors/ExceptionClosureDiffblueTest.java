package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.FunctorException;
import org.junit.Test;

public class ExceptionClosureDiffblueTest {
  /**
   * Method under test: {@link ExceptionClosure#exceptionClosure()}
   */
  @Test
  public void testExceptionClosure() {
    // Arrange and Act
    Closure<Object> actualExceptionClosureResult = ExceptionClosure.exceptionClosure();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionClosureResult.execute("42"));
  }
}
