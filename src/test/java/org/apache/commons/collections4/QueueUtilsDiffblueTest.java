package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class QueueUtilsDiffblueTest {
  /**
   * Test {@link QueueUtils#emptyQueue()}.
   * <p>
   * Method under test: {@link QueueUtils#emptyQueue()}
   */
  @Test
  @DisplayName("Test emptyQueue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.emptyQueue()"})
  void testEmptyQueue() {
    // Arrange and Act
    Queue<Object> actualEmptyQueueResult = QueueUtils.emptyQueue();

    // Assert
    assertTrue(actualEmptyQueueResult.isEmpty());
  }

  /**
   * Test {@link QueueUtils#predicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#predicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedQueue(Queue, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.predicatedQueue(Queue, Predicate)"})
  void testPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Queue<Object> actualPredicatedQueueResult = QueueUtils.predicatedQueue(queue, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#predicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#predicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedQueue(Queue, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.predicatedQueue(Queue, Predicate)"})
  void testPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsTwo() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Queue<Object> actualPredicatedQueueResult = QueueUtils.predicatedQueue(queue, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#predicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#predicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedQueue(Queue, Predicate); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.predicatedQueue(Queue, Predicate)"})
  void testPredicatedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    Queue<Object> actualPredicatedQueueResult = QueueUtils.predicatedQueue(new LinkedList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedQueueResult.isEmpty());
  }

  /**
   * Test {@link QueueUtils#synchronizedQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#synchronizedQueue(Queue)}
   */
  @Test
  @DisplayName("Test synchronizedQueue(Queue); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.synchronizedQueue(Queue)"})
  void testSynchronizedQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualSynchronizedQueueResult = QueueUtils.synchronizedQueue(queue);

    // Assert
    assertEquals(1, actualSynchronizedQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#synchronizedQueue(Queue)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#synchronizedQueue(Queue)}
   */
  @Test
  @DisplayName("Test synchronizedQueue(Queue); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.synchronizedQueue(Queue)"})
  void testSynchronizedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    Queue<Object> actualSynchronizedQueueResult = QueueUtils.synchronizedQueue(new LinkedList<>());

    // Assert
    assertTrue(actualSynchronizedQueueResult.isEmpty());
  }

  /**
   * Test {@link QueueUtils#transformingQueue(Queue, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#transformingQueue(Queue, Transformer)}
   */
  @Test
  @DisplayName("Test transformingQueue(Queue, Transformer); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.transformingQueue(Queue, Transformer)"})
  void testTransformingQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualTransformingQueueResult = QueueUtils.transformingQueue(queue, mock(Transformer.class));

    // Assert
    assertEquals(1, actualTransformingQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#transformingQueue(Queue, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#transformingQueue(Queue, Transformer)}
   */
  @Test
  @DisplayName("Test transformingQueue(Queue, Transformer); given '42'; when LinkedList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.transformingQueue(Queue, Transformer)"})
  void testTransformingQueue_given42_whenLinkedListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");

    // Act
    Queue<Object> actualTransformingQueueResult = QueueUtils.transformingQueue(queue, mock(Transformer.class));

    // Assert
    assertEquals(2, actualTransformingQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#transformingQueue(Queue, Transformer)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#transformingQueue(Queue, Transformer)}
   */
  @Test
  @DisplayName("Test transformingQueue(Queue, Transformer); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.transformingQueue(Queue, Transformer)"})
  void testTransformingQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    Queue<Object> actualTransformingQueueResult = QueueUtils.transformingQueue(new LinkedList<>(),
        mock(Transformer.class));

    // Assert
    assertTrue(actualTransformingQueueResult.isEmpty());
  }

  /**
   * Test {@link QueueUtils#unmodifiableQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#unmodifiableQueue(Queue)}
   */
  @Test
  @DisplayName("Test unmodifiableQueue(Queue); given '42'; when LinkedList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.unmodifiableQueue(Queue)"})
  void testUnmodifiableQueue_given42_whenLinkedListAdd42_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = QueueUtils.unmodifiableQueue(queue);

    // Assert
    assertEquals(1, actualUnmodifiableQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#unmodifiableQueue(Queue)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link LinkedList#LinkedList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#unmodifiableQueue(Queue)}
   */
  @Test
  @DisplayName("Test unmodifiableQueue(Queue); given '42'; when LinkedList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.unmodifiableQueue(Queue)"})
  void testUnmodifiableQueue_given42_whenLinkedListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");

    // Act
    Queue<Object> actualUnmodifiableQueueResult = QueueUtils.unmodifiableQueue(queue);

    // Assert
    assertEquals(2, actualUnmodifiableQueueResult.size());
  }

  /**
   * Test {@link QueueUtils#unmodifiableQueue(Queue)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link QueueUtils#unmodifiableQueue(Queue)}
   */
  @Test
  @DisplayName("Test unmodifiableQueue(Queue); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Queue QueueUtils.unmodifiableQueue(Queue)"})
  void testUnmodifiableQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    Queue<Object> actualUnmodifiableQueueResult = QueueUtils.unmodifiableQueue(new LinkedList<>());

    // Assert
    assertTrue(actualUnmodifiableQueueResult.isEmpty());
  }
}
