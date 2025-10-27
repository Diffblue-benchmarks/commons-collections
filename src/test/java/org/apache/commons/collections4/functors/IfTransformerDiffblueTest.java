package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class IfTransformerDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IfTransformer#IfTransformer(Predicate, Transformer, Transformer)}
   *   <li>{@link IfTransformer#getFalseTransformer()}
   *   <li>{@link IfTransformer#getPredicate()}
   *   <li>{@link IfTransformer#getTrueTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ChainedTransformer<? super Object> trueTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    ChainedTransformer<? super Object> falseTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    IfTransformer<Object, Object> actualIfTransformer = new IfTransformer<>(predicate, trueTransformer,
        falseTransformer);
    Transformer<? super Object, ?> actualFalseTransformer = actualIfTransformer.getFalseTransformer();
    Predicate<? super Object> actualPredicate = actualIfTransformer.getPredicate();

    // Assert
    assertSame(predicate, actualPredicate);
    assertSame(falseTransformer, actualFalseTransformer);
    assertSame(trueTransformer, actualIfTransformer.getTrueTransformer());
  }
}
