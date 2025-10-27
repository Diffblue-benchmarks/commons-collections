package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.junit.Test;

public class BagUtilsDiffblueTest {
  /**
   * Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  public void testCollectionBag() {
    // Arrange and Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(new HashBag<>());

    // Assert
    assertTrue(actualCollectionBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  public void testCollectionBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(bag);

    // Assert
    assertEquals(1, actualCollectionBagResult.size());
  }

  /**
   * Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  public void testCollectionBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Method under test: {@link BagUtils#emptyBag()}
   */
  @Test
  public void testEmptyBag() {
    // Arrange and Act
    Bag<Object> actualEmptyBagResult = BagUtils.emptyBag();

    // Assert
    assertTrue(actualEmptyBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#emptySortedBag()}
   */
  @Test
  public void testEmptySortedBag() {
    // Arrange and Act
    SortedBag<Object> actualEmptySortedBagResult = BagUtils.emptySortedBag();

    // Assert
    assertTrue(actualEmptySortedBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  public void testSynchronizedBag() {
    // Arrange and Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(new HashBag<>());

    // Assert
    assertTrue(actualSynchronizedBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  public void testSynchronizedBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(bag);

    // Assert
    assertEquals(1, actualSynchronizedBagResult.size());
  }

  /**
   * Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  public void testSynchronizedBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testSynchronizedSortedBag() {
    // Arrange and Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(new TreeBag<>());

    // Assert
    assertTrue(actualSynchronizedSortedBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testSynchronizedSortedBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(bag);

    // Assert
    assertEquals(1, actualSynchronizedSortedBagResult.size());
  }

  /**
   * Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  public void testSynchronizedSortedBag3() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  public void testUnmodifiableBag() {
    // Arrange and Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(new HashBag<>());

    // Assert
    assertTrue(actualUnmodifiableBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  public void testUnmodifiableBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(bag);

    // Assert
    assertEquals(1, actualUnmodifiableBagResult.size());
  }

  /**
   * Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  public void testUnmodifiableBag3() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  public void testUnmodifiableSortedBag() {
    // Arrange and Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(new TreeBag<>());

    // Assert
    assertTrue(actualUnmodifiableSortedBagResult.isEmpty());
  }

  /**
   * Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  public void testUnmodifiableSortedBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(1, actualUnmodifiableSortedBagResult.size());
  }

  /**
   * Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  public void testUnmodifiableSortedBag3() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }
}
