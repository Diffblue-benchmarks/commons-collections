package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.junit.Test;

public class ExceptionFactoryDiffblueTest {
  /**
   * Method under test: {@link ExceptionFactory#exceptionFactory()}
   */
  @Test
  public void testExceptionFactory() {
    // Arrange and Act
    Factory<Object> actualExceptionFactoryResult = ExceptionFactory.exceptionFactory();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionFactoryResult.create());
  }
}
