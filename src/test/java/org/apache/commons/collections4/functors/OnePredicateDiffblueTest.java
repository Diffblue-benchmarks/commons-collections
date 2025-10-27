package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class OnePredicateDiffblueTest {
  /**
   * Method under test: {@link OnePredicate#OnePredicate(Predicate[])}
   */
  @Test
  public void testNewOnePredicate() {
    // Arrange
    AllPredicate<? super Object> allPredicate = new AllPredicate<>(new UniquePredicate<>());

    // Act
    OnePredicate<Object> actualOnePredicate = new OnePredicate<>(allPredicate);

    // Assert
    Predicate<? super Object>[] predicates = actualOnePredicate.getPredicates();
    assertEquals(1, predicates.length);
    Predicate<? super Object>[] predicateArray = actualOnePredicate.iPredicates;
    assertEquals(1, predicateArray.length);
    assertSame(allPredicate, predicates[0]);
    assertSame(allPredicate, predicateArray[0]);
  }
}
