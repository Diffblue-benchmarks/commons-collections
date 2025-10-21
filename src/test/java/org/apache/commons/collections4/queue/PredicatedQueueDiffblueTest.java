package org.apache.commons.collections4.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedQueueDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedQueue PredicatedQueue.predicatedQueue(Queue, Predicate)"})
  public void testPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedQueue PredicatedQueue.predicatedQueue(Queue, Predicate)"})
  public void testPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedQueue PredicatedQueue.predicatedQueue(Queue, Predicate)"})
  public void testPredicatedQueue_whenLinkedList_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedQueue.<init>(Queue, Predicate)"})
  public void testNewPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedQueue.<init>(Queue, Predicate)"})
  public void testNewPredicatedQueue_givenTrue_whenPredicateTestReturnTrue_thenReturnSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedQueue.<init>(Queue, Predicate)"})
  public void testNewPredicatedQueue_whenLinkedList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedQueue<Object> actualPredicatedQueue = new PredicatedQueue<>(new LinkedList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedQueue.isEmpty());
  }
}
