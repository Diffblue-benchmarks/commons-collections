package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ReverseListIteratorDiffblueTest {
  /**
   * Method under test: {@link ReverseListIterator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.add("Obj"));
  }

  /**
   * Method under test: {@link ReverseListIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Method under test: {@link ReverseListIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(list);

    // Act and Assert
    assertTrue(reverseListIterator.hasNext());
  }

  /**
   * Method under test: {@link ReverseListIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(reverseListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link ReverseListIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious2() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertTrue(reverseListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link ReverseListIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(list);

    // Act and Assert
    assertEquals("42", reverseListIterator.next());
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Method under test: {@link ReverseListIterator#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(-1, reverseListIterator.nextIndex());
  }

  /**
   * Method under test: {@link ReverseListIterator#previous()}
   */
  @Test
  public void testPrevious() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act
    Object actualPreviousResult = reverseListIterator.previous();

    // Assert
    assertEquals("Obj", reverseListIterator.next());
    assertEquals("Obj", actualPreviousResult);
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Method under test: {@link ReverseListIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, reverseListIterator.previousIndex());
  }

  /**
   * Method under test: {@link ReverseListIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.remove());
  }

  /**
   * Method under test: {@link ReverseListIterator#set(Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.set("Obj"));
  }

  /**
   * Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  public void testNewReverseListIterator() {
    // Arrange and Act
    ReverseListIterator<Object> actualReverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualReverseListIterator.hasNext());
  }

  /**
   * Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  public void testNewReverseListIterator2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ReverseListIterator<Object> actualReverseListIterator = new ReverseListIterator<>(list);

    // Assert
    assertEquals("42", actualReverseListIterator.next());
    assertFalse(actualReverseListIterator.hasNext());
  }

  /**
   * Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  public void testNewReverseListIterator3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ReverseListIterator<Object> actualReverseListIterator = new ReverseListIterator<>(list);

    // Assert
    assertEquals("42", actualReverseListIterator.next());
    assertEquals("42", actualReverseListIterator.next());
    assertFalse(actualReverseListIterator.hasNext());
  }
}
