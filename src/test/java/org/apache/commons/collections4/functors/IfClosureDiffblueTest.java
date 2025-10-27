package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class IfClosureDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IfClosure#IfClosure(Predicate, Closure, Closure)}
   *   <li>{@link IfClosure#getFalseClosure()}
   *   <li>{@link IfClosure#getPredicate()}
   *   <li>{@link IfClosure#getTrueClosure()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(new ForClosure<>(3, null));
    ChainedClosure<? super Object> falseClosure = new ChainedClosure<>(new ForClosure<>(3, null));

    // Act
    IfClosure<Object> actualIfClosure = new IfClosure<>(predicate, trueClosure, falseClosure);
    Closure<? super Object> actualFalseClosure = actualIfClosure.getFalseClosure();
    Predicate<? super Object> actualPredicate = actualIfClosure.getPredicate();

    // Assert
    assertSame(predicate, actualPredicate);
    assertSame(falseClosure, actualFalseClosure);
    assertSame(trueClosure, actualIfClosure.getTrueClosure());
  }
}
