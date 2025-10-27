package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NotPredicateDiffblueTest {
  /**
   * Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  public void testNewNotPredicate() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act
    NotPredicate<Object> actualNotPredicate = new NotPredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNotPredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }
}
