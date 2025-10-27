package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;

public class SynchronizedSortedBagDiffblueTest {
  /**
   * Method under test:
   * {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  public void testNewSynchronizedSortedBag() {
    // Arrange and Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(new HashBag<>(), "Lock");

    // Assert
    assertTrue(actualSynchronizedSortedBag.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testSynchronizedSortedBag() {
    // Arrange and Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult = SynchronizedSortedBag
        .synchronizedSortedBag(new TreeBag<>());

    // Assert
    assertTrue(actualSynchronizedSortedBagResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testSynchronizedSortedBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult = SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(1, actualSynchronizedSortedBagResult.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#synchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testSynchronizedSortedBag3() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBagResult = SynchronizedSortedBag.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  public void testNewSynchronizedSortedBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(bag, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedSortedBag.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#SynchronizedSortedBag(Bag, Object)}
   */
  @Test
  public void testNewSynchronizedSortedBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag, "Lock"));
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testNewSynchronizedSortedBag4() {
    // Arrange and Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(new TreeBag<>());

    // Assert
    assertTrue(actualSynchronizedSortedBag.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testNewSynchronizedSortedBag5() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SynchronizedSortedBag<Object> actualSynchronizedSortedBag = new SynchronizedSortedBag<>(bag);

    // Assert
    assertEquals(1, actualSynchronizedSortedBag.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedSortedBag#SynchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testNewSynchronizedSortedBag6() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedSortedBag<>(bag));
  }
}
