package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class AllPredicateDiffblueTest {
  /**
   * Method under test: {@link AllPredicate#AllPredicate(Predicate[])}
   */
  @Test
  public void testNewAllPredicate() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AndPredicate<? super Object> andPredicate = new AndPredicate<>(predicate1, new UniquePredicate<>());

    // Act
    AllPredicate<Object> actualAllPredicate = new AllPredicate<>(andPredicate);

    // Assert
    Predicate<? super Object>[] predicates = actualAllPredicate.getPredicates();
    assertEquals(1, predicates.length);
    Predicate<? super Object>[] predicateArray = actualAllPredicate.iPredicates;
    assertEquals(1, predicateArray.length);
    assertSame(andPredicate, predicates[0]);
    assertSame(andPredicate, predicateArray[0]);
  }
}
