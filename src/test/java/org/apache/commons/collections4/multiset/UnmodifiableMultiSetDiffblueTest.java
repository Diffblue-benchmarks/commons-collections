package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.MultiSet;
import org.junit.Test;

public class UnmodifiableMultiSetDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  public void testUnmodifiableMultiSet() {
    // Arrange and Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = UnmodifiableMultiSet.unmodifiableMultiSet(new HashMultiSet<>());

    // Assert
    assertTrue(actualUnmodifiableMultiSetResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  public void testUnmodifiableMultiSet2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(1, actualUnmodifiableMultiSetResult.size());
  }

  /**
   * Method under test:
   * {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  public void testUnmodifiableMultiSet3() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }
}
