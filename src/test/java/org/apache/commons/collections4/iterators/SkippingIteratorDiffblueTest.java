package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;

public class SkippingIteratorDiffblueTest {
  /**
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  public void testNewSkippingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIterator = new SkippingIterator<>(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIterator.hasNext());
  }

  /**
   * Method under test: {@link SkippingIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertEquals("42", skippingIterator.next());
  }

  /**
   * Method under test: {@link SkippingIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> skippingIterator.remove());
  }

  /**
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  public void testNewSkippingIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIterator = new SkippingIterator<>(iterator, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIterator.hasNext());
  }

  /**
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  public void testNewSkippingIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new SkippingIterator<>(objectList.iterator(), -1L));

  }

  /**
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  public void testNewSkippingIterator4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIterator = new SkippingIterator<>(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIterator.hasNext());
  }
}
