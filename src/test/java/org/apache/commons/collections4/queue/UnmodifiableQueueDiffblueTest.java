package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class UnmodifiableQueueDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableQueue#unmodifiableQueue(Queue)}
   */
  @Test
  public void testUnmodifiableQueue() {
    // Arrange and Act
    Queue<Object> actualUnmodifiableQueueResult = UnmodifiableQueue.unmodifiableQueue(new LinkedList<>());

    // Assert
    assertTrue(actualUnmodifiableQueueResult.isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableQueue#unmodifiableQueue(Queue)}
   */
  @Test
  public void testUnmodifiableQueue2() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = UnmodifiableQueue.unmodifiableQueue(queue);

    // Assert
    assertEquals(1, actualUnmodifiableQueueResult.size());
  }

  /**
   * Method under test: {@link UnmodifiableQueue#unmodifiableQueue(Queue)}
   */
  @Test
  public void testUnmodifiableQueue3() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = UnmodifiableQueue.unmodifiableQueue(queue);

    // Assert
    assertEquals(2, actualUnmodifiableQueueResult.size());
  }
}
