package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class SynchronizedCollectionDiffblueTest {
  /**
   * Method under test:
   * {@link SynchronizedCollection#synchronizedCollection(Collection)}
   */
  @Test
  public void testSynchronizedCollection() {
    // Arrange and Act
    SynchronizedCollection<Object> actualSynchronizedCollectionResult = SynchronizedCollection
        .synchronizedCollection(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollectionResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedCollection#synchronizedCollection(Collection)}
   */
  @Test
  public void testSynchronizedCollection2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    SynchronizedCollection<Object> actualSynchronizedCollectionResult = SynchronizedCollection
        .synchronizedCollection(coll);

    // Assert
    assertEquals(1, actualSynchronizedCollectionResult.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedCollection#SynchronizedCollection(Collection)}
   */
  @Test
  public void testNewSynchronizedCollection() {
    // Arrange and Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedCollection#SynchronizedCollection(Collection)}
   */
  @Test
  public void testNewSynchronizedCollection2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(collection);

    // Assert
    assertEquals(1, actualSynchronizedCollection.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedCollection#SynchronizedCollection(Collection, Object)}
   */
  @Test
  public void testNewSynchronizedCollection3() {
    // Arrange and Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(new ArrayList<>(),
        "Lock");

    // Assert
    assertTrue(actualSynchronizedCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedCollection#SynchronizedCollection(Collection, Object)}
   */
  @Test
  public void testNewSynchronizedCollection4() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(collection, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedCollection.size());
  }

  /**
   * Method under test: {@link SynchronizedCollection#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    SynchronizedCollection<Object> synchronizedCollectionResult = SynchronizedCollection
        .synchronizedCollection(new ArrayList<>());

    // Act and Assert
    assertEquals("[]", synchronizedCollectionResult.toString());
  }
}
