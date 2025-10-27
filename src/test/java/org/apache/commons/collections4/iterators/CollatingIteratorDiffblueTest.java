package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class CollatingIteratorDiffblueTest {
  /**
   * Method under test: {@link CollatingIterator#getComparator()}
   */
  @Test
  public void testGetComparator() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertNull(collatingIterator.getComparator());
  }

  /**
   * Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    // Act and Assert
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  public void testHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertTrue(collatingIterator.hasNext());
  }

  /**
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  public void testNext() throws NoSuchElementException {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> collatingIterator.next());
  }

  /**
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  public void testNext2() throws NoSuchElementException {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> collatingIterator.next());
  }

  /**
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  public void testNext3() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertEquals("42", collatingIterator.next());
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  public void testNext4() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    collatingIterator.addIterator(objectList2.iterator());
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertEquals("42", collatingIterator.next());
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Method under test: {@link CollatingIterator#CollatingIterator()}
   */
  @Test
  public void testNewCollatingIterator() {
    // Arrange and Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>();

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link CollatingIterator#CollatingIterator(Comparator, Collection)}
   */
  @Test
  public void testNewCollatingIterator2() {
    // Arrange and Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>(null, new ArrayList<>());

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link CollatingIterator#CollatingIterator(Comparator, Collection)}
   */
  @Test
  public void testNewCollatingIterator3() {
    // Arrange
    ArrayList<Iterator<?>> iterators = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    // Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>(null, iterators);

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link CollatingIterator#CollatingIterator(Comparator, Collection)}
   */
  @Test
  public void testNewCollatingIterator4() {
    // Arrange
    ArrayList<Iterator<?>> iterators = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterators.add(objectList2.iterator());

    // Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>(null, iterators);

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }
}
