package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.junit.Test;

public class UnmodifiableNavigableSetDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  public void testUnmodifiableNavigableSet() {
    // Arrange and Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult = UnmodifiableNavigableSet
        .unmodifiableNavigableSet(new TreeSet<>());

    // Assert
    assertTrue(actualUnmodifiableNavigableSetResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  public void testUnmodifiableNavigableSet2() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult = UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(1, actualUnmodifiableNavigableSetResult.size());
  }

  /**
   * Method under test:
   * {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  public void testUnmodifiableNavigableSet3() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult = UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }
}
