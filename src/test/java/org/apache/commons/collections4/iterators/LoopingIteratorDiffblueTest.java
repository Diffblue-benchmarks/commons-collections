package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import org.junit.Test;

public class LoopingIteratorDiffblueTest {
  /**
   * Method under test: {@link LoopingIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(collection);

    // Act and Assert
    assertTrue(loopingIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingIterator.next());
  }

  /**
   * Method under test: {@link LoopingIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(collection);

    // Act and Assert
    assertEquals("42", loopingIterator.next());
  }

  /**
   * Method under test: {@link LoopingIterator#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    LoopingIterator<Object> loopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, loopingIterator.size());
  }

  /**
   * Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  public void testNewLoopingIterator() {
    // Arrange and Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  public void testNewLoopingIterator2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(collection);

    // Assert
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertTrue(actualLoopingIterator.hasNext());
  }

  /**
   * Method under test: {@link LoopingIterator#LoopingIterator(Collection)}
   */
  @Test
  public void testNewLoopingIterator3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    LoopingIterator<Object> actualLoopingIterator = new LoopingIterator<>(collection);

    // Assert
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertEquals("42", actualLoopingIterator.next());
    assertTrue(actualLoopingIterator.hasNext());
  }
}
