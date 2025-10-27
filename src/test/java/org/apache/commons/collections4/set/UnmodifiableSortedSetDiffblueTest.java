package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.Test;

public class UnmodifiableSortedSetDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  public void testUnmodifiableSortedSet() {
    // Arrange and Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = UnmodifiableSortedSet.unmodifiableSortedSet(new TreeSet<>());

    // Assert
    assertTrue(actualUnmodifiableSortedSetResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  public void testUnmodifiableSortedSet2() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(1, actualUnmodifiableSortedSetResult.size());
  }

  /**
   * Method under test:
   * {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  public void testUnmodifiableSortedSet3() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }
}
