package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class PredicateTransformerDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PredicateTransformer#PredicateTransformer(Predicate)}
   *   <li>{@link PredicateTransformer#getPredicate()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act
    PredicateTransformer<Object> actualPredicateTransformer = new PredicateTransformer<>(predicate);

    // Assert
    assertSame(predicate, actualPredicateTransformer.getPredicate());
  }
}
