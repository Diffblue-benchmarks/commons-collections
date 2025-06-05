package org.apache.commons.collections4;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClosureDiffblueTest {
  /**
   * Test {@link Closure#accept(Object)}.
   * <p>
   * Method under test: {@link Closure#accept(Object)}
   */
  @Test
  @DisplayName("Test accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Closure.accept(Object)"})
  void testAccept() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<Object> transformerClosure = new TransformerClosure<>(transformer);

    // Act
    transformerClosure.accept("Input");

    // Assert
    verify(transformer).apply(isA(Object.class));
  }
}
