package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformerDiffblueTest {
  /**
   * Test {@link Transformer#apply(Object)}.
   * <p>
   * Method under test: {@link Transformer#apply(Object)}
   */
  @Test
  @DisplayName("Test apply(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object Transformer.apply(Object)"})
  void testApply() {
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
