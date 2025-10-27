package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Bag;
import org.junit.Test;

public class SynchronizedBagDiffblueTest {
  /**
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  public void testNewSynchronizedBag() {
    // Arrange and Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(new HashBag<>());

    // Assert
    assertTrue(actualSynchronizedBag.isEmpty());
  }

  /**
   * Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  public void testSynchronizedBag() {
    // Arrange and Act
    SynchronizedBag<Object> actualSynchronizedBagResult = SynchronizedBag.synchronizedBag(new HashBag<>());

    // Assert
    assertTrue(actualSynchronizedBagResult.isEmpty());
  }

  /**
   * Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  public void testSynchronizedBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBagResult = SynchronizedBag.synchronizedBag(bag);

    // Assert
    assertEquals(1, actualSynchronizedBagResult.size());
  }

  /**
   * Method under test: {@link SynchronizedBag#synchronizedBag(Bag)}
   */
  @Test
  public void testSynchronizedBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBagResult = SynchronizedBag.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  public void testNewSynchronizedBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag);

    // Assert
    assertEquals(1, actualSynchronizedBag.size());
  }

  /**
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag)}
   */
  @Test
  public void testNewSynchronizedBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag));
  }

  /**
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  public void testNewSynchronizedBag4() {
    // Arrange and Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(new HashBag<>(), "Lock");

    // Assert
    assertTrue(actualSynchronizedBag.isEmpty());
  }

  /**
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  public void testNewSynchronizedBag5() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    SynchronizedBag<Object> actualSynchronizedBag = new SynchronizedBag<>(bag, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedBag.size());
  }

  /**
   * Method under test: {@link SynchronizedBag#SynchronizedBag(Bag, Object)}
   */
  @Test
  public void testNewSynchronizedBag6() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new SynchronizedBag<>(bag, "Lock"));
  }
}
