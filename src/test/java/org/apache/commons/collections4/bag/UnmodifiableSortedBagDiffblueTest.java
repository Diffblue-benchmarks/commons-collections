package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;

public class UnmodifiableSortedBagDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  public void testUnmodifiableSortedBag() {
    // Arrange and Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = UnmodifiableSortedBag.unmodifiableSortedBag(new TreeBag<>());

    // Assert
    assertTrue(actualUnmodifiableSortedBagResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  public void testUnmodifiableSortedBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(1, actualUnmodifiableSortedBagResult.size());
  }

  /**
   * Method under test:
   * {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  public void testUnmodifiableSortedBag3() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }
}
