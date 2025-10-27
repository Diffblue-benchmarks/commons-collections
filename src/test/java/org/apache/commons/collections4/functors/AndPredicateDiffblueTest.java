package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class AndPredicateDiffblueTest {
  /**
   * Method under test: {@link AndPredicate#AndPredicate(Predicate, Predicate)}
   */
  @Test
  public void testNewAndPredicate() {
    // Arrange
    AllPredicate<? super Object> predicate1 = new AllPredicate<>(new UniquePredicate<>());
    AllPredicate<? super Object> predicate2 = new AllPredicate<>(new UniquePredicate<>());

    // Act
    AndPredicate<Object> actualAndPredicate = new AndPredicate<>(predicate1, predicate2);

    // Assert
    Predicate<? super Object>[] predicates = actualAndPredicate.getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }
}
