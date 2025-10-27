package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class TransformerClosureDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TransformerClosure#TransformerClosure(Transformer)}
   *   <li>{@link TransformerClosure#getTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ChainedTransformer<? super Object> transformer = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformerClosure<Object> actualTransformerClosure = new TransformerClosure<>(transformer);

    // Assert
    assertSame(transformer, actualTransformerClosure.getTransformer());
  }
}
