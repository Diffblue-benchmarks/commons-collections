package org.apache.commons.collections4.queue;

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
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedQueueDiffblueTest {
  /**
   * Test {@link PredicatedQueue#predicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedQueue#predicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedQueue(Queue, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedQueue PredicatedQueue.predicatedQueue(Queue, Predicate)"})
  void testPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> Queue = new LinkedList<>();
    Queue.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedQueue<Object> actualPredicatedQueueResult = PredicatedQueue.predicatedQueue(Queue, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedQueueResult.size());
  }

  /**
   * Test {@link PredicatedQueue#predicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedQueue#predicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedQueue(Queue, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedQueue PredicatedQueue.predicatedQueue(Queue, Predicate)"})
  void testPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsTwo() {
    // Arrange
    LinkedList<Object> Queue = new LinkedList<>();
    Queue.add("42");
    Queue.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedQueue<Object> actualPredicatedQueueResult = PredicatedQueue.predicatedQueue(Queue, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedQueueResult.size());
  }

  /**
   * Test {@link PredicatedQueue#predicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedQueue#predicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedQueue(Queue, Predicate); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedQueue PredicatedQueue.predicatedQueue(Queue, Predicate)"})
  void testPredicatedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedQueue<Object> actualPredicatedQueueResult = PredicatedQueue.predicatedQueue(new LinkedList<>(),
        mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedQueueResult.isEmpty());
  }

  /**
   * Test {@link PredicatedQueue#PredicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedQueue#PredicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedQueue(Queue, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedQueue.<init>(Queue, Predicate)"})
  void testNewPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsOne() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedQueue<Object> actualPredicatedQueue = new PredicatedQueue<>(queue, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedQueue.size());
  }

  /**
   * Test {@link PredicatedQueue#PredicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedQueue#PredicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedQueue(Queue, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedQueue.<init>(Queue, Predicate)"})
  void testNewPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsTwo() {
    // Arrange
    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");
    queue.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedQueue<Object> actualPredicatedQueue = new PredicatedQueue<>(queue, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedQueue.size());
  }

  /**
   * Test {@link PredicatedQueue#PredicatedQueue(Queue, Predicate)}.
   * <ul>
   *   <li>When {@link LinkedList#LinkedList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedQueue#PredicatedQueue(Queue, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedQueue(Queue, Predicate); when LinkedList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedQueue.<init>(Queue, Predicate)"})
  void testNewPredicatedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedQueue<Object> actualPredicatedQueue = new PredicatedQueue<>(new LinkedList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedQueue.isEmpty());
  }
}
