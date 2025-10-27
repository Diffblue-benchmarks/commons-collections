package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;

public class LoopingListIteratorDiffblueTest {
  /**
   * Method under test: {@link LoopingListIterator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act
    loopingListIterator.add("Obj");

    // Assert
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertTrue(loopingListIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingListIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingListIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingListIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertTrue(loopingListIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingListIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link LoopingListIterator#hasPrevious()}
   */
  @Test
  public void testHasPrevious2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertTrue(loopingListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link LoopingListIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.next());
  }

  /**
   * Method under test: {@link LoopingListIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals("42", loopingListIterator.next());
  }

  /**
   * Method under test: {@link LoopingListIterator#next()}
   */
  @Test
  public void testNext3() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals("Obj", loopingListIterator.next());
  }

  /**
   * Method under test: {@link LoopingListIterator#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.nextIndex());
  }

  /**
   * Method under test: {@link LoopingListIterator#nextIndex()}
   */
  @Test
  public void testNextIndex2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals(0, loopingListIterator.nextIndex());
  }

  /**
   * Method under test: {@link LoopingListIterator#nextIndex()}
   */
  @Test
  public void testNextIndex3() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals(0, loopingListIterator.nextIndex());
  }

  /**
   * Method under test: {@link LoopingListIterator#previous()}
   */
  @Test
  public void testPrevious() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.previous());
  }

  /**
   * Method under test: {@link LoopingListIterator#previous()}
   */
  @Test
  public void testPrevious2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals("42", loopingListIterator.previous());
  }

  /**
   * Method under test: {@link LoopingListIterator#previous()}
   */
  @Test
  public void testPrevious3() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals("Obj", loopingListIterator.previous());
  }

  /**
   * Method under test: {@link LoopingListIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.previousIndex());
  }

  /**
   * Method under test: {@link LoopingListIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals(0, loopingListIterator.previousIndex());
  }

  /**
   * Method under test: {@link LoopingListIterator#previousIndex()}
   */
  @Test
  public void testPreviousIndex3() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals(0, loopingListIterator.previousIndex());
  }

  /**
   * Method under test: {@link LoopingListIterator#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, loopingListIterator.size());
  }

  /**
   * Method under test: {@link LoopingListIterator#LoopingListIterator(List)}
   */
  @Test
  public void testNewLoopingListIterator() {
    // Arrange and Act
    LoopingListIterator<Object> actualLoopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingListIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingListIterator#LoopingListIterator(List)}
   */
  @Test
  public void testNewLoopingListIterator2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    LoopingListIterator<Object> actualLoopingListIterator = new LoopingListIterator<>(list);

    // Assert
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertTrue(actualLoopingListIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingListIterator#LoopingListIterator(List)}
   */
  @Test
  public void testNewLoopingListIterator3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    LoopingListIterator<Object> actualLoopingListIterator = new LoopingListIterator<>(list);

    // Assert
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertTrue(actualLoopingListIterator.hasNext());
  }
}
