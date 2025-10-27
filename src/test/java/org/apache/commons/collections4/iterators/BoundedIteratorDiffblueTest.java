package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class BoundedIteratorDiffblueTest {
  /**
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertTrue(boundedIterator.hasNext());
  }

  /**
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  public void testHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 0L);

    // Act and Assert
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Method under test: {@link BoundedIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals("42", boundedIterator.next());
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Method under test: {@link BoundedIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 0L);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> boundedIterator.next());
  }

  /**
   * Method under test: {@link BoundedIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> boundedIterator.remove());
  }

  /**
   * Method under test:
   * {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  public void testNewBoundedIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  public void testNewBoundedIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 0L, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  public void testNewBoundedIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new BoundedIterator<>(objectList.iterator(), 0L, -1L));

  }

  /**
   * Method under test:
   * {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  public void testNewBoundedIterator4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new BoundedIterator<>(objectList.iterator(), -1L, 0L));

  }

  /**
   * Method under test:
   * {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  public void testNewBoundedIterator5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }
}
