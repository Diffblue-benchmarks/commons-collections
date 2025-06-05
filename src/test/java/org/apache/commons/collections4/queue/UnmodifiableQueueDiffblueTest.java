package org.apache.commons.collections4.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableQueueDiffblueTest {
  /**
   * Test {@link UnmodifiableQueue#unmodifiableQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableQueue#unmodifiableQueue(Queue)}
   */
  @Test
  @DisplayName("Test unmodifiableQueue(Queue); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue UnmodifiableQueue.unmodifiableQueue(Queue)"})
  void testUnmodifiableQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = UnmodifiableQueue.unmodifiableQueue(queue);

    // Assert
    assertEquals(1, actualUnmodifiableQueueResult.size());
  }

  /**
   * Test {@link UnmodifiableQueue#unmodifiableQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableQueue#unmodifiableQueue(Queue)}
   */
  @Test
  @DisplayName("Test unmodifiableQueue(Queue); given '42'; when LinkedList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue UnmodifiableQueue.unmodifiableQueue(Queue)"})
  void testUnmodifiableQueue_given42_whenLinkedListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = UnmodifiableQueue.unmodifiableQueue(queue);

    // Assert
    assertEquals(2, actualUnmodifiableQueueResult.size());
  }

  /**
   * Test {@link UnmodifiableQueue#unmodifiableQueue(Queue)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableQueue#unmodifiableQueue(Queue)}
   */
  @Test
  @DisplayName("Test unmodifiableQueue(Queue); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue UnmodifiableQueue.unmodifiableQueue(Queue)"})
  void testUnmodifiableQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    Queue<Object> actualUnmodifiableQueueResult = UnmodifiableQueue.unmodifiableQueue(new LinkedList<>());

    // Assert
    assertTrue(actualUnmodifiableQueueResult.isEmpty());
  }
}
