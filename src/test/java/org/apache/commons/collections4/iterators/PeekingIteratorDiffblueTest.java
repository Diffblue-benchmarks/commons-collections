package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class PeekingIteratorDiffblueTest {
  /**
   * Method under test: {@link PeekingIterator#peekingIterator(Iterator)}
   */
  @Test
  public void testPeekingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   * </ul>
   */
  @Test
  public void testPeekingIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<?> iterator = PeekingIterator.peekingIterator(objectList.iterator());

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult = PeekingIterator.peekingIterator(iterator);

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PeekingIterator#element()}
   */
  @Test
  public void testElement() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.element());
  }

  /**
   * Method under test: {@link PeekingIterator#element()}
   */
  @Test
  public void testElement2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.element());
  }

  /**
   * Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertTrue(peekingIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PeekingIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.next());
  }

  /**
   * Method under test: {@link PeekingIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.next());
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  public void testPeek() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertNull(peekingIteratorResult.peek());
  }

  /**
   * Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  public void testPeek2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.peek());
  }

  /**
   * Method under test: {@link PeekingIterator#PeekingIterator(Iterator)}
   */
  @Test
  public void testNewPeekingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIterator = new PeekingIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIterator.hasNext());
  }
}
