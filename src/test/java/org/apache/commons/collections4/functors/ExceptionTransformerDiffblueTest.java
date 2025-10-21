package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExceptionTransformerDiffblueTest {
  /**
   * Test {@link ExceptionTransformer#exceptionTransformer()}.
   * <p>
   * Method under test: {@link ExceptionTransformer#exceptionTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ExceptionTransformer.exceptionTransformer()"})
  public void testExceptionTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualExceptionTransformerResult = ExceptionTransformer.exceptionTransformer();

    // Assert
    assertThrows(FunctorException.class, () -> actualExceptionTransformerResult.transform("42"));
  }
}
