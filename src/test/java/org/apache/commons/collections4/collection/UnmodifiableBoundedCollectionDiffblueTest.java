package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.Test;

public class UnmodifiableBoundedCollectionDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  public void testUnmodifiableBoundedCollection() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  public void testUnmodifiableBoundedCollection2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection));
  }

  /**
   * Method under test:
   * {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  public void testUnmodifiableBoundedCollection3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection));
  }

  /**
   * Method under test:
   * {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  public void testUnmodifiableBoundedCollection4() {
    // Arrange and Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) new CircularFifoQueue<>());

    // Assert
    assertTrue(actualUnmodifiableBoundedCollectionResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  public void testUnmodifiableBoundedCollection5() {
    // Arrange
    CircularFifoQueue<Object> coll = new CircularFifoQueue<>();
    coll.add("Element");

    // Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) coll);

    // Assert
    assertEquals(1, actualUnmodifiableBoundedCollectionResult.size());
  }

  /**
   * Method under test:
   * {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  public void testUnmodifiableBoundedCollection6() {
    // Arrange
    CircularFifoQueue<Object> coll = new CircularFifoQueue<>();
    coll.add("Element");
    coll.add("Element");

    // Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) coll);

    // Assert
    assertEquals(2, actualUnmodifiableBoundedCollectionResult.size());
  }
}
