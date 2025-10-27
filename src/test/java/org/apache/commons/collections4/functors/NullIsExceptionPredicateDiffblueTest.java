package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NullIsExceptionPredicateDiffblueTest {
  /**
   * Method under test:
   * {@link NullIsExceptionPredicate#NullIsExceptionPredicate(Predicate)}
   */
  @Test
  public void testNewNullIsExceptionPredicate() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act
    NullIsExceptionPredicate<Object> actualNullIsExceptionPredicate = new NullIsExceptionPredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsExceptionPredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }
}
