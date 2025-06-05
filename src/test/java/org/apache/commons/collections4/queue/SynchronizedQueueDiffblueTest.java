package org.apache.commons.collections4.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SynchronizedQueueDiffblueTest {
  /**
   * Test {@link SynchronizedQueue#synchronizedQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedQueue#synchronizedQueue(Queue)}
   */
  @Test
  @DisplayName("Test synchronizedQueue(Queue); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedQueue SynchronizedQueue.synchronizedQueue(Queue)"})
  void testSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    SynchronizedQueue<Object> actualSynchronizedQueueResult = SynchronizedQueue.synchronizedQueue(queue);

    // Assert
    assertEquals(1, actualSynchronizedQueueResult.size());
  }

  /**
   * Test {@link SynchronizedQueue#synchronizedQueue(Queue)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedQueue#synchronizedQueue(Queue)}
   */
  @Test
  @DisplayName("Test synchronizedQueue(Queue); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedQueue SynchronizedQueue.synchronizedQueue(Queue)"})
  void testSynchronizedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueueResult = SynchronizedQueue.synchronizedQueue(new LinkedList<>());

    // Assert
    assertTrue(actualSynchronizedQueueResult.isEmpty());
  }

  /**
   * Test {@link SynchronizedQueue#SynchronizedQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue)}
   */
  @Test
  @DisplayName("Test new SynchronizedQueue(Queue); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue)"})
  void testNewSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(queue);

    // Assert
    assertEquals(1, actualSynchronizedQueue.size());
  }

  /**
   * Test {@link SynchronizedQueue#SynchronizedQueue(Queue, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedQueue(Queue, Object); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue, Object)"})
  void testNewSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(queue, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedQueue.size());
  }

  /**
   * Test {@link SynchronizedQueue#SynchronizedQueue(Queue)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue)}
   */
  @Test
  @DisplayName("Test new SynchronizedQueue(Queue); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue)"})
  void testNewSynchronizedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(new LinkedList<>());

    // Assert
    assertTrue(actualSynchronizedQueue.isEmpty());
  }

  /**
   * Test {@link SynchronizedQueue#SynchronizedQueue(Queue, Object)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedQueue(Queue, Object); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue, Object)"})
  void testNewSynchronizedQueue_whenLinkedList_thenReturnEmpty2() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(new LinkedList<>(), "Lock");

    // Assert
    assertTrue(actualSynchronizedQueue.isEmpty());
  }
}
