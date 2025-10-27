package org.apache.commons.collections4.set;

import static org.junit.Assert.assertTrue;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class PredicatedNavigableSetDiffblueTest {
  /**
   * Method under test:
   * {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet, Predicate)}
   */
  @Test
  public void testNewPredicatedNavigableSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act
    PredicatedNavigableSet<Object> actualObjectSet = new PredicatedNavigableSet<>(set,
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
