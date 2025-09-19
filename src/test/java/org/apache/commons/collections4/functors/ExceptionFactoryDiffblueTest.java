package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExceptionFactoryDiffblueTest {
  /**
   * Test {@link ExceptionFactory#exceptionFactory()}.
   *
   * <p>Method under test: {@link ExceptionFactory#exceptionFactory()}
   */
  @Test
  @DisplayName("Test exceptionFactory()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Factory ExceptionFactory.exceptionFactory()"})
  void testExceptionFactory() {
    // Arrange and Act
    Factory<Object> actualExceptionFactoryResult = ExceptionFactory.exceptionFactory();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionFactoryResult.create());
  }
}
