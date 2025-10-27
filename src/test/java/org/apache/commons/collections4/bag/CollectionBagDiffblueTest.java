package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Bag;
import org.junit.Test;

public class CollectionBagDiffblueTest {
  /**
   * Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  public void testCollectionBag() {
    // Arrange and Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(new HashBag<>());

    // Assert
    assertTrue(actualCollectionBagResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  public void testCollectionBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(bag);

    // Assert
    assertEquals(1, actualCollectionBagResult.size());
  }

  /**
   * Method under test: {@link CollectionBag#collectionBag(Bag)}
   */
  @Test
  public void testCollectionBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = CollectionBag.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  public void testNewCollectionBag() {
    // Arrange and Act
    CollectionBag<Object> actualCollectionBag = new CollectionBag<>(new HashBag<>());

    // Assert
    assertTrue(actualCollectionBag.isEmpty());
  }

  /**
   * Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  public void testNewCollectionBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    CollectionBag<Object> actualCollectionBag = new CollectionBag<>(bag);

    // Assert
    assertEquals(1, actualCollectionBag.size());
  }

  /**
   * Method under test: {@link CollectionBag#CollectionBag(Bag)}
   */
  @Test
  public void testNewCollectionBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new CollectionBag<>(bag));
  }
}
