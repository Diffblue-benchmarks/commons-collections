package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Bag;
import org.junit.Test;

public class UnmodifiableBagDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  public void testUnmodifiableBag() {
    // Arrange and Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(new HashBag<>());

    // Assert
    assertTrue(actualUnmodifiableBagResult.isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  public void testUnmodifiableBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(bag);

    // Assert
    assertEquals(1, actualUnmodifiableBagResult.size());
  }

  /**
   * Method under test: {@link UnmodifiableBag#unmodifiableBag(Bag)}
   */
  @Test
  public void testUnmodifiableBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = UnmodifiableBag.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }
}
