package org.apache.commons.collections4;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ClosureDiffblueTest {
  /**
   * Test {@link Closure#accept(Object)}.
   * <p>
   * Method under test: {@link Closure#accept(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Closure.accept(Object)"})
  public void testAccept() {
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
