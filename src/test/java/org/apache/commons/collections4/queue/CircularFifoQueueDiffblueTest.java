package org.apache.commons.collections4.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CircularFifoQueueDiffblueTest {
  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue()}.
   *
   * <p>Method under test: {@link CircularFifoQueue#CircularFifoQueue()}
   */
  @Test
  @DisplayName("Test new CircularFifoQueue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircularFifoQueue.<init>()"})
  void testNewCircularFifoQueue() {
    // Arrange and Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>();

    // Assert
    assertTrue(actualCircularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  @DisplayName(
      "Test new CircularFifoQueue(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircularFifoQueue.<init>(Collection)"})
  void testNewCircularFifoQueue_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  @DisplayName(
      "Test new CircularFifoQueue(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircularFifoQueue.<init>(Collection)"})
  void testNewCircularFifoQueue_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#CircularFifoQueue(Collection)}
   */
  @Test
  @DisplayName(
      "Test new CircularFifoQueue(Collection); when ArrayList(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircularFifoQueue.<init>(Collection)"})
  void testNewCircularFifoQueue_whenArrayList_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue<>(new ArrayList<>()));
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#CircularFifoQueue(int)}
   */
  @Test
  @DisplayName("Test new CircularFifoQueue(int); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircularFifoQueue.<init>(int)"})
  void testNewCircularFifoQueue_whenThree_thenReturnEmpty() {
    // Arrange and Act
    CircularFifoQueue<Object> actualCircularFifoQueue = new CircularFifoQueue<>(3);

    // Assert
    assertTrue(actualCircularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#CircularFifoQueue(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#CircularFifoQueue(int)}
   */
  @Test
  @DisplayName("Test new CircularFifoQueue(int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CircularFifoQueue.<init>(int)"})
  void testNewCircularFifoQueue_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue<>(0));
  }

  /**
   * Test {@link CircularFifoQueue#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given CircularFifoQueue() add 'Element'; then CircularFifoQueue() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.add(Object)"})
  void testAdd_givenCircularFifoQueueAddElement_thenCircularFifoQueueSizeIsTwo() {
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
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given CircularFifoQueue(); then CircularFifoQueue() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.add(Object)"})
  void testAdd_givenCircularFifoQueue_thenCircularFifoQueueSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then return {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#element()}
   */
  @Test
  @DisplayName("Test element(); given CircularFifoQueue() add 'Element'; then return 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.element()"})
  void testElement_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.element());
  }

  /**
   * Test {@link CircularFifoQueue#element()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#element()}
   */
  @Test
  @DisplayName("Test element(); given CircularFifoQueue(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.element()"})
  void testElement_givenCircularFifoQueue_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.element());
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>When one.
   *   <li>Then return {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given CircularFifoQueue() add 'Element'; when one; then return 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  void testGet_givenCircularFifoQueueAddElement_whenOne_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.get(1));
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>When one.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given CircularFifoQueue() add 'Element'; when one; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  void testGet_givenCircularFifoQueueAddElement_whenOne_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(1));
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>When minus one.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given CircularFifoQueue(); when minus one; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  void testGet_givenCircularFifoQueue_whenMinusOne_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(-1));
  }

  /**
   * Test {@link CircularFifoQueue#get(int)}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>When one.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given CircularFifoQueue(); when one; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.get(int)"})
  void testGet_givenCircularFifoQueue_whenOne_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(1));
  }

  /**
   * Test {@link CircularFifoQueue#isAtFullCapacity()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#isAtFullCapacity()}
   */
  @Test
  @DisplayName("Test isAtFullCapacity(); given CircularFifoQueue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.isAtFullCapacity()"})
  void testIsAtFullCapacity_givenCircularFifoQueue() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.isAtFullCapacity());
  }

  /**
   * Test {@link CircularFifoQueue#isAtFullCapacity()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#isAtFullCapacity()}
   */
  @Test
  @DisplayName("Test isAtFullCapacity(); given CircularFifoQueue() add 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.isAtFullCapacity()"})
  void testIsAtFullCapacity_givenCircularFifoQueueAddElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertFalse(circularFifoQueue.isAtFullCapacity());
  }

  /**
   * Test {@link CircularFifoQueue#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CircularFifoQueue() add 'Element'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.isEmpty()"})
  void testIsEmpty_givenCircularFifoQueueAddElement_thenReturnFalse() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertFalse(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CircularFifoQueue(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.isEmpty()"})
  void testIsEmpty_givenCircularFifoQueue_thenReturnTrue() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#isFull()}.
   *
   * <p>Method under test: {@link CircularFifoQueue#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.isFull()"})
  void testIsFull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.isFull());
  }

  /**
   * Test {@link CircularFifoQueue#iterator()}.
   *
   * <p>Method under test: {@link CircularFifoQueue#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Iterator CircularFifoQueue.iterator()"})
  void testIterator() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertFalse(circularFifoQueue.iterator().hasNext());
  }

  /**
   * Test {@link CircularFifoQueue#maxSize()}.
   *
   * <p>Method under test: {@link CircularFifoQueue#maxSize()}
   */
  @Test
  @DisplayName("Test maxSize()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CircularFifoQueue.maxSize()"})
  void testMaxSize() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertEquals(Integer.SIZE, circularFifoQueue.maxSize());
  }

  /**
   * Test {@link CircularFifoQueue#offer(Object)}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#offer(Object)}
   */
  @Test
  @DisplayName(
      "Test offer(Object); given CircularFifoQueue() add 'Element'; then CircularFifoQueue() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.offer(Object)"})
  void testOffer_givenCircularFifoQueueAddElement_thenCircularFifoQueueSizeIsTwo() {
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
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then {@link CircularFifoQueue#CircularFifoQueue()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#offer(Object)}
   */
  @Test
  @DisplayName(
      "Test offer(Object); given CircularFifoQueue(); then CircularFifoQueue() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CircularFifoQueue.offer(Object)"})
  void testOffer_givenCircularFifoQueue_thenCircularFifoQueueSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then return {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#peek()}
   */
  @Test
  @DisplayName("Test peek(); given CircularFifoQueue() add 'Element'; then return 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.peek()"})
  void testPeek_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.peek());
  }

  /**
   * Test {@link CircularFifoQueue#peek()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#peek()}
   */
  @Test
  @DisplayName("Test peek(); given CircularFifoQueue(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.peek()"})
  void testPeek_givenCircularFifoQueue_thenReturnNull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertNull(circularFifoQueue.peek());
  }

  /**
   * Test {@link CircularFifoQueue#poll()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then return {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#poll()}
   */
  @Test
  @DisplayName("Test poll(); given CircularFifoQueue() add 'Element'; then return 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.poll()"})
  void testPoll_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.poll());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#poll()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#poll()}
   */
  @Test
  @DisplayName("Test poll(); given CircularFifoQueue(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.poll()"})
  void testPoll_givenCircularFifoQueue_thenReturnNull() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertNull(circularFifoQueue.poll());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#remove()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then return {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#remove()}
   */
  @Test
  @DisplayName("Test remove(); given CircularFifoQueue() add 'Element'; then return 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.remove()"})
  void testRemove_givenCircularFifoQueueAddElement_thenReturnElement() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals("Element", circularFifoQueue.remove());
    assertTrue(circularFifoQueue.isEmpty());
  }

  /**
   * Test {@link CircularFifoQueue#remove()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#remove()}
   */
  @Test
  @DisplayName("Test remove(); given CircularFifoQueue(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CircularFifoQueue.remove()"})
  void testRemove_givenCircularFifoQueue_thenThrowNoSuchElementException() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> circularFifoQueue.remove());
  }

  /**
   * Test {@link CircularFifoQueue#size()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()} add {@code Element}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#size()}
   */
  @Test
  @DisplayName("Test size(); given CircularFifoQueue() add 'Element'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CircularFifoQueue.size()"})
  void testSize_givenCircularFifoQueueAddElement_thenReturnOne() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();
    circularFifoQueue.add("Element");

    // Act and Assert
    assertEquals(1, circularFifoQueue.size());
  }

  /**
   * Test {@link CircularFifoQueue#size()}.
   *
   * <ul>
   *   <li>Given {@link CircularFifoQueue#CircularFifoQueue()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CircularFifoQueue#size()}
   */
  @Test
  @DisplayName("Test size(); given CircularFifoQueue(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CircularFifoQueue.size()"})
  void testSize_givenCircularFifoQueue_thenReturnZero() {
    // Arrange
    CircularFifoQueue<Object> circularFifoQueue = new CircularFifoQueue<>();

    // Act and Assert
    assertEquals(0, circularFifoQueue.size());
  }
}
