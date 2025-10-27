package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class TransformedPredicateDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TransformedPredicate#TransformedPredicate(Transformer, Predicate)}
   *   <li>{@link TransformedPredicate#getTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ChainedTransformer<? super Object> transformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act
    TransformedPredicate<Object> actualTransformedPredicate = new TransformedPredicate<>(transformer,
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));

    // Assert
    assertSame(transformer, actualTransformedPredicate.getTransformer());
  }
}
