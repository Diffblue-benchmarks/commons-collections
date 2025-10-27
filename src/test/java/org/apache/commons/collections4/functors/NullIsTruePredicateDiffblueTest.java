package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class NullIsTruePredicateDiffblueTest {
  /**
   * Method under test: {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)}
   */
  @Test
  public void testNewNullIsTruePredicate() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));

    // Act
    NullIsTruePredicate<Object> actualNullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsTruePredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }
}
