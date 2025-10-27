package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class QueueUtilsDiffblueTest {
  /**
   * Method under test: {@link QueueUtils#emptyQueue()}
   */
  @Test
  public void testEmptyQueue() {
    // Arrange and Act
    Queue<Object> actualEmptyQueueResult = QueueUtils.emptyQueue();

    // Assert
    assertTrue(actualEmptyQueueResult.isEmpty());
  }

  /**
   * Method under test: {@link QueueUtils#synchronizedQueue(Queue)}
   */
  @Test
  public void testSynchronizedQueue() {
    // Arrange and Act
    Queue<Object> actualSynchronizedQueueResult = QueueUtils.synchronizedQueue(new LinkedList<>());

    // Assert
    assertTrue(actualSynchronizedQueueResult.isEmpty());
  }

  /**
   * Method under test: {@link QueueUtils#synchronizedQueue(Queue)}
   */
  @Test
  public void testSynchronizedQueue2() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualSynchronizedQueueResult = QueueUtils.synchronizedQueue(queue);

    // Assert
    assertEquals(1, actualSynchronizedQueueResult.size());
  }

  /**
   * Method under test: {@link QueueUtils#unmodifiableQueue(Queue)}
   */
  @Test
  public void testUnmodifiableQueue() {
    // Arrange and Act
    Queue<Object> actualUnmodifiableQueueResult = QueueUtils.unmodifiableQueue(new LinkedList<>());

    // Assert
    assertTrue(actualUnmodifiableQueueResult.isEmpty());
  }

  /**
   * Method under test: {@link QueueUtils#unmodifiableQueue(Queue)}
   */
  @Test
  public void testUnmodifiableQueue2() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = QueueUtils.unmodifiableQueue(queue);

    // Assert
    assertEquals(1, actualUnmodifiableQueueResult.size());
  }

  /**
   * Method under test: {@link QueueUtils#unmodifiableQueue(Queue)}
   */
  @Test
  public void testUnmodifiableQueue3() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = QueueUtils.unmodifiableQueue(queue);

    // Assert
    assertEquals(2, actualUnmodifiableQueueResult.size());
  }
}
