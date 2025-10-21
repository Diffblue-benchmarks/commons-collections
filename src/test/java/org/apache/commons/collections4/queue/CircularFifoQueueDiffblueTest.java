package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CircularFifoQueueDiffblueTest {
  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue()}.
   * <p>
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CircularFifoQueue.<init>()"})
  public void testNewCircularFifoQueue() {
    // Arrange and Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>();

    // Assert
    assertTrue(actualCircularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CircularFifoQueue.<init>(Collection)"})
  public void testNewCircularFifoQueue_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(coll);

    // Assert
    assertEquals(1, actualCircularFifoQueue.size());
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CircularFifoQueue.<init>(Collection)"})
  public void testNewCircularFifoQueue_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(coll);

    // Assert
    assertEquals(2, actualCircularFifoQueue.size());
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CircularFifoQueue.<init>(Collection)"})
  public void testNewCircularFifoQueue_whenArrayList_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue<>(new ArrayList<>()));
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CircularFifoQueue.<init>(int)"})
  public void testNewCircularFifoQueue_whenThree_thenReturnEmpty() {
    // Arrange and Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(3);

    // Assert
    assertTrue(actualCircularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#CircularFifoQueue(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CircularFifoQueue.<init>(int)"})
  public void testNewCircularFifoQueue_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue<>(0));
  }

  /**
   * Test {@link CircularFifoQueue#add(Object)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.add(Object)"})
  public void testAdd_givenCircularFifoQueueAddElement_thenCircularFifoQueueSizeIsTwo() {
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
   * Test {@link CircularFifoQueue#add(Object)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.add(Object)"})
  public void testAdd_givenCircularFifoQueue_thenCircularFifoQueueSizeIsOne() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act
    boolean actualAddResult = circularFifoQueue.add("Element");

    // Assert
    assertEquals(1, circularFifoQueue.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link CircularFifoQueue#element()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then return {@code Element}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#element()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.element()"})
  public void testElement_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.element());
  }

  /**
   * Test {@link CircularFifoQueue#element()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#element()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.element()"})
  public void testElement_givenCircularFifoQueue_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.element());
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@code Element}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  public void testGet_givenCircularFifoQueueAddElement_whenOne_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.get(1));
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>When one.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  public void testGet_givenCircularFifoQueueAddElement_whenOne_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(1));
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  public void testGet_givenCircularFifoQueue_whenMinusOne_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(-1));
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>When one.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  public void testGet_givenCircularFifoQueue_whenOne_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(1));
  }

  /**
   * Test {@link CircularFifoQueue#isAtFullCapacity()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#isAtFullCapacity()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.isAtFullCapacity()"})
  public void testIsAtFullCapacity_givenCircularFifoQueue() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.isAtFullCapacity());
  }

  /**
   * Test {@link CircularFifoQueue#isAtFullCapacity()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#isAtFullCapacity()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.isAtFullCapacity()"})
  public void testIsAtFullCapacity_givenCircularFifoQueueAddElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertFalse(circularFifoQueue.isAtFullCapacity());
  }

  /**
   * Test {@link CircularFifoQueue#isEmpty()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.isEmpty()"})
  public void testIsEmpty_givenCircularFifoQueueAddElement_thenReturnFalse() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertFalse(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#isEmpty()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.isEmpty()"})
  public void testIsEmpty_givenCircularFifoQueue_thenReturnTrue() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#isFull()}.
   * <p>
   * Method under test: {@link CircularFifoQueue#isFull()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.isFull()"})
  public void testIsFull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.isFull());
  }

  /**
   * Test {@link CircularFifoQueue#iterator()}.
   * <p>
   * Method under test: {@link CircularFifoQueue#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Iterator CircularFifoQueue.iterator()"})
  public void testIterator() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.iterator().hasNext());
  }

  /**
   * Test {@link CircularFifoQueue#maxSize()}.
   * <p>
   * Method under test: {@link CircularFifoQueue#maxSize()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CircularFifoQueue.maxSize()"})
  public void testMaxSize() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertEquals(Integer.SIZE, circularFifoQueue.maxSize());
  }

  /**
   * Test {@link CircularFifoQueue#offer(Object)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#offer(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.offer(Object)"})
  public void testOffer_givenCircularFifoQueueAddElement_thenCircularFifoQueueSizeIsTwo() {
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
   * Test {@link CircularFifoQueue#offer(Object)}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#offer(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CircularFifoQueue.offer(Object)"})
  public void testOffer_givenCircularFifoQueue_thenCircularFifoQueueSizeIsOne() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act
    boolean actualOfferResult = circularFifoQueue.offer("Element");

    // Assert
    assertEquals(1, circularFifoQueue.size());
    assertTrue(actualOfferResult);
  }

  /**
   * Test {@link CircularFifoQueue#peek()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then return {@code Element}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#peek()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.peek()"})
  public void testPeek_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.peek());
  }

  /**
   * Test {@link CircularFifoQueue#peek()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#peek()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.peek()"})
  public void testPeek_givenCircularFifoQueue_thenReturnNull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertNull(circularFifoQueue.peek());
  }

  /**
   * Test {@link CircularFifoQueue#poll()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then return {@code Element}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#poll()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.poll()"})
  public void testPoll_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.poll());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#poll()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#poll()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.poll()"})
  public void testPoll_givenCircularFifoQueue_thenReturnNull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertNull(circularFifoQueue.poll());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#remove()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then return {@code Element}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.remove()"})
  public void testRemove_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.remove());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#remove()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CircularFifoQueue.remove()"})
  public void testRemove_givenCircularFifoQueue_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.remove());
  }

  /**
   * Test {@link CircularFifoQueue#size()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CircularFifoQueue.size()"})
  public void testSize_givenCircularFifoQueueAddElement_thenReturnOne() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals(1, circularFifoQueue.size());
  }

  /**
   * Test {@link CircularFifoQueue#size()}.
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CircularFifoQueue#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CircularFifoQueue.size()"})
  public void testSize_givenCircularFifoQueue_thenReturnZero() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertEquals(0, circularFifoQueue.size());
  }
}
