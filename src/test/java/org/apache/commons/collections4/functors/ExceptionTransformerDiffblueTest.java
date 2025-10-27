package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class ExceptionTransformerDiffblueTest {
  /**
   * Method under test: {@link ExceptionTransformer#exceptionTransformer()}
   */
  @Test
  public void testExceptionTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualExceptionTransformerResult = ExceptionTransformer.exceptionTransformer();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionTransformerResult.transform("42"));
  }
}
