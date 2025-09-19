package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.FunctorException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExceptionClosureDiffblueTest {
  /**
   * Test {@link ExceptionClosure#exceptionClosure()}.
   *
   * <p>Method under test: {@link ExceptionClosure#exceptionClosure()}
   */
  @Test
  @DisplayName("Test exceptionClosure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ExceptionClosure.exceptionClosure()"})
  void testExceptionClosure() {
    // Arrange and Act
    Closure<Object> actualExceptionClosureResult = ExceptionClosure.exceptionClosure();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionClosureResult.execute("42"));
  }
}
