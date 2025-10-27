package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.NoSuchElementException;
import org.junit.Test;

public class SingletonListIteratorDiffblueTest {
  /**
   * Method under test: {@link SingletonListIterator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonListIterator.add("Obj"));
  }

  /**
   * Method under test: {@link SingletonListIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertTrue(singletonListIterator.hasNext());
  }

  /**
   * Method under test: {@link SingletonListIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertFalse(singletonListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link SingletonListIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals("Object", singletonListIterator.next());
    assertFalse(singletonListIterator.hasNext());
  }

  /**
   * Method under test: {@link SingletonListIterator#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals(0, singletonListIterator.nextIndex());
  }

  /**
   * Method under test: {@link SingletonListIterator#previous()}
   */
  @Test
  public void testPrevious() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> singletonListIterator.previous());
  }

  /**
   * Method under test: {@link SingletonListIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals(-1, singletonListIterator.previousIndex());
  }

  /**
   * Method under test: {@link SingletonListIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonListIterator.remove());
  }

  /**
   * Method under test: {@link SingletonListIterator#set(Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonListIterator.set("Object"));
  }

  /**
   * Method under test:
   * {@link SingletonListIterator#SingletonListIterator(Object)}
   */
  @Test
  public void testNewSingletonListIterator() {
    // Arrange and Act
    SingletonListIterator<Object> actualSingletonListIterator = new SingletonListIterator<>("Object");

    // Assert
    assertEquals("Object", actualSingletonListIterator.next());
    assertFalse(actualSingletonListIterator.hasNext());
  }
}
