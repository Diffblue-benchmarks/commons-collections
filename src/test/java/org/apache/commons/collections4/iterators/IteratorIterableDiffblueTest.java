package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;

public class IteratorIterableDiffblueTest {
  /**
   * Method under test: {@link IteratorIterable#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorIterable<Object> iteratorIterable = new IteratorIterable<>(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorIterable.iterator().hasNext());
  }

  /**
   * Method under test: {@link IteratorIterable#iterator()}
   */
  @Test
  public void testIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorIterable<Object> iteratorIterable = new IteratorIterable<>(objectList.iterator(), true);

    // Act and Assert
    assertFalse(iteratorIterable.iterator().hasNext());
  }

  /**
   * Method under test: {@link IteratorIterable#IteratorIterable(Iterator)}
   */
  @Test
  public void testNewIteratorIterable() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorIterable.iterator().hasNext());
  }

  /**
   * Method under test:
   * {@link IteratorIterable#IteratorIterable(Iterator, boolean)}
   */
  @Test
  public void testNewIteratorIterable2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator(), true);

    // Assert
    assertFalse(actualIteratorIterable.iterator().hasNext());
  }

  /**
   * Method under test:
   * {@link IteratorIterable#IteratorIterable(Iterator, boolean)}
   */
  @Test
  public void testNewIteratorIterable3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator(), false);

    // Assert
    assertFalse(actualIteratorIterable.iterator().hasNext());
  }
}
