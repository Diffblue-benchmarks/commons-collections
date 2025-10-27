package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NonePredicateDiffblueTest {
  /**
   * Method under test: {@link NonePredicate#NonePredicate(Predicate[])}
   */
  @Test
  public void testNewNonePredicate() {
    // Arrange
    AllPredicate<? super Object> allPredicate = new AllPredicate<>(new UniquePredicate<>());

    // Act
    NonePredicate<Object> actualNonePredicate = new NonePredicate<>(allPredicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNonePredicate.getPredicates();
    assertEquals(1, predicates.length);
    Predicate<? super Object>[] predicateArray = actualNonePredicate.iPredicates;
    assertEquals(1, predicateArray.length);
    assertSame(allPredicate, predicates[0]);
    assertSame(allPredicate, predicateArray[0]);
  }
}
