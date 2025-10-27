package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import java.util.NoSuchElementException;
import org.junit.Test;

public class AbstractEmptyIteratorDiffblueTest {
  /**
   * Method under test: {@link AbstractEmptyIterator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> emptyIterator.add("Ignored"));
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertFalse(emptyIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertFalse(emptyIterator.hasPrevious());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> emptyIterator.next());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertEquals(0, emptyIterator.nextIndex());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#previous()}
   */
  @Test
  public void testPrevious() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> emptyIterator.previous());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertEquals(-1, emptyIterator.previousIndex());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyIterator.remove());
  }

  /**
   * Method under test: {@link AbstractEmptyIterator#set(Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyIterator.set("Ignored"));
  }
}
