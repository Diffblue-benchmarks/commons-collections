package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;

public class PushbackIteratorDiffblueTest {
  /**
   * Method under test: {@link PushbackIterator#pushbackIterator(Iterator)}
   */
  @Test
  public void testPushbackIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PushbackIterator<Object> actualPushbackIteratorResult = PushbackIterator.pushbackIterator(objectList.iterator());

    // Assert
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PushbackIterator#pushbackIterator(Iterator)}
   *   <li>{@link PushbackIterator#pushbackIterator(Iterator)}
   * </ul>
   */
  @Test
  public void testPushbackIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<?> iterator = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act
    PushbackIterator<Object> actualPushbackIteratorResult = PushbackIterator.pushbackIterator(iterator);

    // Assert
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PushbackIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<Object> pushbackIteratorResult = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertFalse(pushbackIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PushbackIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PushbackIterator<Object> pushbackIteratorResult = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertTrue(pushbackIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PushbackIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PushbackIterator<Object> pushbackIteratorResult = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", pushbackIteratorResult.next());
    assertFalse(pushbackIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PushbackIterator#pushback(Object)}
   */
  @Test
  public void testPushback() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<Object> pushbackIteratorResult = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act
    pushbackIteratorResult.pushback("Item");

    // Assert
    assertEquals("Item", pushbackIteratorResult.next());
    assertFalse(pushbackIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PushbackIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<Object> pushbackIteratorResult = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> pushbackIteratorResult.remove());
  }

  /**
   * Method under test: {@link PushbackIterator#PushbackIterator(Iterator)}
   */
  @Test
  public void testNewPushbackIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PushbackIterator<Object> actualPushbackIterator = new PushbackIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualPushbackIterator.hasNext());
  }
}
