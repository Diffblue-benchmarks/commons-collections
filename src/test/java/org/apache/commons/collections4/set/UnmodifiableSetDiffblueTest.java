package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class UnmodifiableSetDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableSet#unmodifiableSet(Set)}
   */
  @Test
  public void testUnmodifiableSet() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = UnmodifiableSet.unmodifiableSet(new HashSet<>());

    // Assert
    assertTrue(actualUnmodifiableSetResult.isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableSet#unmodifiableSet(Set)}
   */
  @Test
  public void testUnmodifiableSet2() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = UnmodifiableSet.unmodifiableSet(set);

    // Assert
    assertEquals(1, actualUnmodifiableSetResult.size());
  }

  /**
   * Method under test: {@link UnmodifiableSet#unmodifiableSet(Set)}
   */
  @Test
  public void testUnmodifiableSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = UnmodifiableSet.unmodifiableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSetResult);
  }
}
