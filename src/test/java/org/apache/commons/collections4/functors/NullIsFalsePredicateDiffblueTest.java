package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NullIsFalsePredicateDiffblueTest {
  /**
   * Method under test:
   * {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)}
   */
  @Test
  public void testNewNullIsFalsePredicate() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act
    NullIsFalsePredicate<Object> actualNullIsFalsePredicate = new NullIsFalsePredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsFalsePredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }
}
