package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;

public class CollectionSortedBagDiffblueTest {
  /**
   * Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  public void testCollectionSortedBag() {
    // Arrange and Act
    SortedBag<Object> actualCollectionSortedBagResult = CollectionSortedBag.collectionSortedBag(new TreeBag<>());

    // Assert
    assertTrue(actualCollectionSortedBagResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  public void testCollectionSortedBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualCollectionSortedBagResult = CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(1, actualCollectionSortedBagResult.size());
  }

  /**
   * Method under test: {@link CollectionSortedBag#collectionSortedBag(SortedBag)}
   */
  @Test
  public void testCollectionSortedBag3() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualCollectionSortedBagResult = CollectionSortedBag.collectionSortedBag(bag);

    // Assert
    assertEquals(bag, actualCollectionSortedBagResult);
  }

  /**
   * Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  public void testNewCollectionSortedBag() {
    // Arrange and Act
    CollectionSortedBag<Object> actualCollectionSortedBag = new CollectionSortedBag<>(new TreeBag<>());

    // Assert
    assertTrue(actualCollectionSortedBag.isEmpty());
  }

  /**
   * Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  public void testNewCollectionSortedBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    CollectionSortedBag<Object> actualCollectionSortedBag = new CollectionSortedBag<>(bag);

    // Assert
    assertEquals(1, actualCollectionSortedBag.size());
  }

  /**
   * Method under test: {@link CollectionSortedBag#CollectionSortedBag(SortedBag)}
   */
  @Test
  public void testNewCollectionSortedBag3() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act and Assert
    assertEquals(bag, new CollectionSortedBag<>(bag));
  }
}
