package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class AnyPredicateDiffblueTest {
  /**
   * Method under test: {@link AnyPredicate#AnyPredicate(Predicate[])}
   */
  @Test
  public void testNewAnyPredicate() {
    // Arrange
    AllPredicate<? super Object> allPredicate = new AllPredicate<>(new UniquePredicate<>());

    // Act
    AnyPredicate<Object> actualAnyPredicate = new AnyPredicate<>(allPredicate);

    // Assert
    Predicate<? super Object>[] predicates = actualAnyPredicate.getPredicates();
    assertEquals(1, predicates.length);
    Predicate<? super Object>[] predicateArray = actualAnyPredicate.iPredicates;
    assertEquals(1, predicateArray.length);
    assertSame(allPredicate, predicates[0]);
    assertSame(allPredicate, predicateArray[0]);
  }
}
