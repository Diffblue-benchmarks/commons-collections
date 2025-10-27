package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Closure;
import org.junit.Test;

public class ClosureTransformerDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ClosureTransformer#ClosureTransformer(Closure)}
   *   <li>{@link ClosureTransformer#getClosure()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ChainedClosure<? super Object> closure = new ChainedClosure<>(new ForClosure<>(3, null));

    // Act
    ClosureTransformer<Object> actualClosureTransformer = new ClosureTransformer<>(closure);

    // Assert
    assertSame(closure, actualClosureTransformer.getClosure());
  }
}
