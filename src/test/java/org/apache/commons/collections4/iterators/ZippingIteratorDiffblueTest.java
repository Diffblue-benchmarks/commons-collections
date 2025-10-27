package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class ZippingIteratorDiffblueTest {
  /**
   * Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertTrue(zippingIterator.hasNext());
  }

  /**
   * Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  public void testHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(iteratorResult, objectList2.iterator());

    // Act and Assert
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Method under test: {@link ZippingIterator#next()}
   */
  @Test
  public void testNext() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> zippingIterator.next());
  }

  /**
   * Method under test: {@link ZippingIterator#next()}
   */
  @Test
  public void testNext2() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", zippingIterator.next());
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Method under test: {@link ZippingIterator#next()}
   */
  @Test
  public void testNext3() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(iteratorResult, objectList2.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> zippingIterator.next());
  }

  /**
   * Method under test: {@link ZippingIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> zippingIterator.remove());
  }

  /**
   * Method under test:
   * {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}
   */
  @Test
  public void testNewZippingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(a, objectList2.iterator());

    // Assert
    assertFalse(a.hasNext());
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}
   */
  @Test
  public void testNewZippingIterator2() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(a, objectList2.iterator());

    // Assert
    assertEquals("42", actualZippingIterator.next());
    assertFalse(a.hasNext());
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ZippingIterator#ZippingIterator(Iterator, Iterator, Iterator)}
   */
  @Test
  public void testNewZippingIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> b = objectList2.iterator();

    ArrayList<Object> objectList3 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(a, b, objectList3.iterator());

    // Assert
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Method under test: {@link ZippingIterator#ZippingIterator(Iterator[])}
   */
  @Test
  public void testNewZippingIterator4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualZippingIterator.hasNext());
  }
}
