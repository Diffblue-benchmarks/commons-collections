package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class WhileClosureDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link WhileClosure#WhileClosure(Predicate, Closure, boolean)}
   *   <li>{@link WhileClosure#getClosure()}
   *   <li>{@link WhileClosure#getPredicate()}
   *   <li>{@link WhileClosure#isDoLoop()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ChainedClosure<? super Object> closure = new ChainedClosure<>(new ForClosure<>(3, null));

    // Act
    WhileClosure<Object> actualWhileClosure = new WhileClosure<>(predicate, closure, true);
    Closure<? super Object> actualClosure = actualWhileClosure.getClosure();
    Predicate<? super Object> actualPredicate = actualWhileClosure.getPredicate();

    // Assert
    assertTrue(actualWhileClosure.isDoLoop());
    assertSame(predicate, actualPredicate);
    assertSame(closure, actualClosure);
  }
}
