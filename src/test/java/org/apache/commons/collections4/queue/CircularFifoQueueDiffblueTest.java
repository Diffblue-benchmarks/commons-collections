package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import org.junit.Test;

public class CircularFifoQueueDiffblueTest {
  /**
   * Method under test: {@link CircularFifoQueue#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act
    boolean actualAddResult = circularFifoQueue.add("Element");

    // Assert
    assertEquals(1, circularFifoQueue.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link CircularFifoQueue#add(Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act
    boolean actualAddResult = circularFifoQueue.add("Element");

    // Assert
    assertEquals(2, circularFifoQueue.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link CircularFifoQueue#element()}
   */
  @Test
  public void testElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.element());
  }

  /**
   * Method under test: {@link CircularFifoQueue#element()}
   */
  @Test
  public void testElement2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.element());
  }

  /**
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(1));
  }

  /**
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  public void testGet2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(1));
  }

  /**
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  public void testGet3() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.get(1));
  }

  /**
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  public void testGet4() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(-1));
  }

  /**
   * Method under test: {@link CircularFifoQueue#isAtFullCapacity()}
   */
  @Test
  public void testIsAtFullCapacity() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.isAtFullCapacity());
  }

  /**
   * Method under test: {@link CircularFifoQueue#isAtFullCapacity()}
   */
  @Test
  public void testIsAtFullCapacity2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertFalse(circularFifoQueue.isAtFullCapacity());
  }

  /**
   * Method under test: {@link CircularFifoQueue#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertFalse(circularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#isFull()}
   */
  @Test
  public void testIsFull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.isFull());
  }

  /**
   * Method under test: {@link CircularFifoQueue#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.iterator().hasNext());
  }

  /**
   * Method under test: {@link CircularFifoQueue#maxSize()}
   */
  @Test
  public void testMaxSize() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertEquals(Integer.SIZE, circularFifoQueue.maxSize());
  }

  /**
   * Method under test: {@link CircularFifoQueue#offer(Object)}
   */
  @Test
  public void testOffer() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act
    boolean actualOfferResult = circularFifoQueue.offer("Element");

    // Assert
    assertEquals(1, circularFifoQueue.size());
    assertTrue(actualOfferResult);
  }

  /**
   * Method under test: {@link CircularFifoQueue#offer(Object)}
   */
  @Test
  public void testOffer2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act
    boolean actualOfferResult = circularFifoQueue.offer("Element");

    // Assert
    assertEquals(2, circularFifoQueue.size());
    assertTrue(actualOfferResult);
  }

  /**
   * Method under test: {@link CircularFifoQueue#peek()}
   */
  @Test
  public void testPeek() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertNull(circularFifoQueue.peek());
  }

  /**
   * Method under test: {@link CircularFifoQueue#peek()}
   */
  @Test
  public void testPeek2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.peek());
  }

  /**
   * Method under test: {@link CircularFifoQueue#poll()}
   */
  @Test
  public void testPoll() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertNull(circularFifoQueue.poll());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#poll()}
   */
  @Test
  public void testPoll2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.poll());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.remove());
  }

  /**
   * Method under test: {@link CircularFifoQueue#remove()}
   */
  @Test
  public void testRemove2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.remove());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertEquals(0, circularFifoQueue.size());
  }

  /**
   * Method under test: {@link CircularFifoQueue#size()}
   */
  @Test
  public void testSize2() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals(1, circularFifoQueue.size());
  }

  /**
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue()}
   */
  @Test
  public void testNewCircularFifoQueue() {
    // Arrange and Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>();

    // Assert
    assertTrue(actualCircularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(int)}
   */
  @Test
  public void testNewCircularFifoQueue2() {
    // Arrange and Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(3);

    // Assert
    assertTrue(actualCircularFifoQueue.isEmpty());
  }

  /**
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(int)}
   */
  @Test
  public void testNewCircularFifoQueue3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue<>(0));
  }

  /**
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  public void testNewCircularFifoQueue4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue<>(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  public void testNewCircularFifoQueue5() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(coll);

    // Assert
    assertEquals(1, actualCircularFifoQueue.size());
  }

  /**
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  public void testNewCircularFifoQueue6() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(coll);

    // Assert
    assertEquals(2, actualCircularFifoQueue.size());
  }
}
