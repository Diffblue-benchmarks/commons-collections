package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TransformedQueueDiffblueTest {
  /**
   * Test {@link TransformedQueue#transformedQueue(Queue, Transformer)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedQueue#transformedQueue(Queue, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedQueue TransformedQueue.transformedQueue(Queue, Transformer)"})
  public void testTransformedQueue_whenLinkedList_thenLinkedListEmpty() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    TransformedQueue<Object> actualTransformedQueueResult = TransformedQueue.transformedQueue(queue,
        mock(Transformer.class));

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualTransformedQueueResult.isEmpty());
  }

  /**
   * Test {@link TransformedQueue#transformingQueue(Queue, Transformer)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedQueue#transformingQueue(Queue, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedQueue TransformedQueue.transformingQueue(Queue, Transformer)"})
  public void testTransformingQueue_whenLinkedList_thenLinkedListEmpty() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    TransformedQueue<Object> actualTransformingQueueResult = TransformedQueue.transformingQueue(queue,
        mock(Transformer.class));

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualTransformingQueueResult.isEmpty());
  }

  /**
   * Test {@link TransformedQueue#TransformedQueue(Queue, Transformer)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedQueue#TransformedQueue(Queue, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedQueue.<init>(Queue, Transformer)"})
  public void testNewTransformedQueue_whenLinkedList_thenLinkedListEmpty() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    TransformedQueue<Object> actualTransformedQueue = new TransformedQueue<>(queue, mock(Transformer.class));

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualTransformedQueue.isEmpty());
  }
}
