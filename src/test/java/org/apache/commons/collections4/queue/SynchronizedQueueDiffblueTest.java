package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SynchronizedQueueDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedQueue SynchronizedQueue.synchronizedQueue(Queue)"})
  public void testSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SynchronizedQueue SynchronizedQueue.synchronizedQueue(Queue)"})
  public void testSynchronizedQueue_whenLinkedList_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue)"})
  public void testNewSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue, Object)"})
  public void testNewSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue)"})
  public void testNewSynchronizedQueue_whenLinkedList_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SynchronizedQueue.<init>(Queue, Object)"})
  public void testNewSynchronizedQueue_whenLinkedList_thenReturnEmpty2() {
    // Arrange and Act
    SynchronizedQueue<Object> actualSynchronizedQueue = new SynchronizedQueue<>(new LinkedList<>(), "Lock");

    // Assert
    assertTrue(actualSynchronizedQueue.isEmpty());
  }
}
