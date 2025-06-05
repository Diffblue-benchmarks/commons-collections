package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExceptionTransformerDiffblueTest {
  /**
   * Test {@link ExceptionTransformer#exceptionTransformer()}.
   * <p>
   * Method under test: {@link ExceptionTransformer#exceptionTransformer()}
   */
  @Test
  @DisplayName("Test exceptionTransformer()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer ExceptionTransformer.exceptionTransformer()"})
  void testExceptionTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualExceptionTransformerResult = ExceptionTransformer.exceptionTransformer();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionTransformerResult.transform("42"));
  }
}
