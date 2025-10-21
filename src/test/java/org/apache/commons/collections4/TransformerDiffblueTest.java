package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformerDiffblueTest {
  /**
   * Test {@link Transformer#apply(Object)}.
   * <p>
   * Method under test: {@link Transformer#apply(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Transformer.apply(Object)"})
  public void testApply() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ClosureTransformer<Object> closureTransformer = new ClosureTransformer<>(closure);

    // Act
    Object actualApplyResult = closureTransformer.apply("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals("42", actualApplyResult);
  }
}
