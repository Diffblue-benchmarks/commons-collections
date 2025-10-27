package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class OrPredicateDiffblueTest {
  /**
   * Method under test: {@link OrPredicate#OrPredicate(Predicate, Predicate)}
   */
  @Test
  public void testNewOrPredicate() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate12 = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    UniquePredicate<Object> predicate13 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate2 = new AllPredicate<>(
        new AndPredicate<>(predicate13, new UniquePredicate<>()));

    // Act
    OrPredicate<Object> actualOrPredicate = new OrPredicate<>(predicate12, predicate2);

    // Assert
    Predicate<? super Object>[] predicates = actualOrPredicate.getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate12, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }
}
