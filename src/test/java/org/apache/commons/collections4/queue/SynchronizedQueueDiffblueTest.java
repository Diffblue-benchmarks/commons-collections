package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class SynchronizedQueueDiffblueTest {
  /**
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue)}
   */
  @Test
  public void testNewSynchronizedQueue() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(new LinkedList<>());

    // Assert
    assertTrue(actualSynchronizedQueue.isEmpty());
  }

  /**
   * Method under test: {@link SynchronizedQueue#synchronizedQueue(Queue)}
   */
  @Test
  public void testSynchronizedQueue() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueueResult = SynchronizedQueue.synchronizedQueue(new LinkedList<>());

    // Assert
    assertTrue(actualSynchronizedQueueResult.isEmpty());
  }

  /**
   * Method under test: {@link SynchronizedQueue#synchronizedQueue(Queue)}
   */
  @Test
  public void testSynchronizedQueue2() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    SynchronizedQueue<Object> actualSynchronizedQueueResult = SynchronizedQueue.synchronizedQueue(queue);

    // Assert
    assertEquals(1, actualSynchronizedQueueResult.size());
  }

  /**
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue)}
   */
  @Test
  public void testNewSynchronizedQueue2() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(queue);

    // Assert
    assertEquals(1, actualSynchronizedQueue.size());
  }

  /**
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue, Object)}
   */
  @Test
  public void testNewSynchronizedQueue3() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(new LinkedList<>(), "Lock");

    // Assert
    assertTrue(actualSynchronizedQueue.isEmpty());
  }

  /**
   * Method under test: {@link SynchronizedQueue#SynchronizedQueue(Queue, Object)}
   */
  @Test
  public void testNewSynchronizedQueue4() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(queue, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedQueue.size());
  }
}
