package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExceptionFactoryDiffblueTest {
  /**
   * Test {@link ExceptionFactory#exceptionFactory()}.
   * <p>
   * Method under test: {@link ExceptionFactory#exceptionFactory()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory ExceptionFactory.exceptionFactory()"})
  public void testExceptionFactory() {
    // Arrange and Act
    Factory<Object> actualExceptionFactoryResult = ExceptionFactory.exceptionFactory();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionFactoryResult.create());
  }
}
