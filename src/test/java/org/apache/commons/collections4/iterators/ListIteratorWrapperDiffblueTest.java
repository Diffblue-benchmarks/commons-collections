package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class ListIteratorWrapperDiffblueTest {
  /**
   * Method under test: {@link ListIteratorWrapper#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertFalse(listIteratorWrapper.hasNext());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertTrue(listIteratorWrapper.hasNext());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#hasPrevious()}
   */
  @Test
  public void testHasPrevious() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertFalse(listIteratorWrapper.hasPrevious());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals(0, listIteratorWrapper.nextIndex());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#previous()}
   */
  @Test
  public void testPrevious() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> listIteratorWrapper.previous());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals(-1, listIteratorWrapper.previousIndex());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#remove()}
   */
  @Test
  public void testRemove() throws IllegalStateException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
  }

  /**
   * Method under test: {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)}
   */
  @Test
  public void testNewListIteratorWrapper() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ListIteratorWrapper<Object> actualListIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Assert
    assertFalse(actualListIteratorWrapper.hasNext());
  }
}
