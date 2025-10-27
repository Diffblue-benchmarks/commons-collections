package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.NoSuchElementException;
import org.junit.Test;

public class ObjectArrayIteratorDiffblueTest {
  /**
   * Method under test: {@link ObjectArrayIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertTrue(objectArrayIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectArrayIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>();

    // Act and Assert
    assertFalse(objectArrayIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayIterator.next());
    assertFalse(objectArrayIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayIterator.next());
  }

  /**
   * Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  public void testNext3() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Method under test: {@link ObjectArrayIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayIterator.remove());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ObjectArrayIterator#reset()}
   *   <li>{@link ObjectArrayIterator#getArray()}
   *   <li>{@link ObjectArrayIterator#getEndIndex()}
   *   <li>{@link ObjectArrayIterator#getStartIndex()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act
    objectArrayIterator.reset();
    Object[] actualArray = objectArrayIterator.getArray();
    int actualEndIndex = objectArrayIterator.getEndIndex();

    // Assert that nothing has changed
    assertEquals("Array", actualArray[0]);
    assertEquals(0, objectArrayIterator.getStartIndex());
    assertEquals(1, actualEndIndex);
    assertEquals(1, actualArray.length);
  }

  /**
   * Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}
   */
  @Test
  public void testNewObjectArrayIterator() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayIterator.next());
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int)}
   */
  @Test
  public void testNewObjectArrayIterator2() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>(new Object[]{"Array"}, 1);

    // Assert
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}
   */
  @Test
  public void testNewObjectArrayIterator3() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>(
        new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertEquals("Array", actualObjectArrayIterator.next());
    assertEquals("Array", actualObjectArrayIterator.next());
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}
   */
  @Test
  public void testNewObjectArrayIterator4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ObjectArrayIterator<>(new Object[]{"Array"}, 1, 0));

  }
}
