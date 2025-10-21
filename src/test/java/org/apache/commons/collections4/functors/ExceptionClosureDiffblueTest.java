package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.FunctorException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExceptionClosureDiffblueTest {
  /**
   * Test {@link ExceptionClosure#exceptionClosure()}.
   * <p>
   * Method under test: {@link ExceptionClosure#exceptionClosure()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ExceptionClosure.exceptionClosure()"})
  public void testExceptionClosure() {
    // Arrange and Act
    Closure<Object> actualExceptionClosureResult = ExceptionClosure.exceptionClosure();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionClosureResult.execute("42"));
  }
}
