package org.apache.commons.collections4.queue;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TransformedQueueDiffblueTest {
  /**
   * Test {@link TransformedQueue#transformedQueue(Queue, Transformer)}.
   *
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.
   *   <li>Then {@link LinkedList#LinkedList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedQueue#transformedQueue(Queue, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedQueue(Queue, Transformer); when LinkedList(); then LinkedList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedQueue TransformedQueue.transformedQueue(Queue, Transformer)"})
  void testTransformedQueue_whenLinkedList_thenLinkedListEmpty() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    TransformedQueue<Object> actualTransformedQueueResult =
        TransformedQueue.transformedQueue(queue, mock(Transformer.class));

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualTransformedQueueResult.isEmpty());
  }

  /**
   * Test {@link TransformedQueue#transformingQueue(Queue, Transformer)}.
   *
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.
   *   <li>Then {@link LinkedList#LinkedList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedQueue#transformingQueue(Queue, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingQueue(Queue, Transformer); when LinkedList(); then LinkedList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedQueue TransformedQueue.transformingQueue(Queue, Transformer)"})
  void testTransformingQueue_whenLinkedList_thenLinkedListEmpty() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    TransformedQueue<Object> actualTransformingQueueResult =
        TransformedQueue.transformingQueue(queue, mock(Transformer.class));

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualTransformingQueueResult.isEmpty());
  }

  /**
   * Test {@link TransformedQueue#TransformedQueue(Queue, Transformer)}.
   *
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.
   *   <li>Then {@link LinkedList#LinkedList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedQueue#TransformedQueue(Queue, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedQueue(Queue, Transformer); when LinkedList(); then LinkedList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedQueue.<init>(Queue, Transformer)"})
  void testNewTransformedQueue_whenLinkedList_thenLinkedListEmpty() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    TransformedQueue<Object> actualTransformedQueue =
        new TransformedQueue<>(queue, mock(Transformer.class));

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualTransformedQueue.isEmpty());
  }
}
