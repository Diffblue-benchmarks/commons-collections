package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class SwitchTransformerDiffblueTest {
  /**
   * Method under test: {@link SwitchTransformer#getDefaultTransformer()}
   */
  @Test
  public void testGetDefaultTransformer() {
    // Arrange
    ChainedTransformer<? super Object> defaultTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    SwitchTransformer<Object, Object> switchTransformer = new SwitchTransformer<>(
        new Predicate[]{new AllPredicate<>(new UniquePredicate<>())}, new Transformer[]{new ChainedTransformer<>(null)},
        defaultTransformer);

    // Act and Assert
    assertSame(defaultTransformer, switchTransformer.getDefaultTransformer());
  }
}
