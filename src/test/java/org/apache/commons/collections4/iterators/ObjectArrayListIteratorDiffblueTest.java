package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import java.util.NoSuchElementException;
import org.junit.Test;

public class ObjectArrayListIteratorDiffblueTest {
  /**
   * Method under test: {@link ObjectArrayListIterator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayListIterator.add("Obj"));
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertFalse(objectArrayListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.next());
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(0, objectArrayListIterator.nextIndex());
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#previous()}
   */
  @Test
  public void testPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.previous());
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(-1, objectArrayListIterator.previousIndex());
  }

  /**
   * Method under test: {@link ObjectArrayListIterator#set(Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectArrayListIterator.set("Obj"));
  }

  /**
   * Method under test:
   * {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}
   */
  @Test
  public void testNewObjectArrayListIterator() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}
   */
  @Test
  public void testNewObjectArrayListIterator2() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>(new Object[]{"Array"},
        1);

    // Assert
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}
   */
  @Test
  public void testNewObjectArrayListIterator3() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>(
        new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }
}
