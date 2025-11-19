package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class IteratorChainDiffblueTest {
  @Mock private Iterator<?> iterator;

  @InjectMocks private IteratorChain<Object> iteratorChain;

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IteratorChain#IteratorChain()}
   *   <li>{@link IteratorChain#isLocked()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.<init>()", "boolean IteratorChain.isLocked()"})
  void testGettersAndSetters() {
    // Arrange and Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>();

    // Assert
    assertFalse(actualIteratorChain.isLocked());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Iterator)}.
   *
   * <p>Method under test: {@link IteratorChain#IteratorChain(Iterator)}
   */
  @Test
  @DisplayName("Test new IteratorChain(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator)"})
  void testNewIteratorChain() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Iterator, Iterator)}.
   *
   * <p>Method under test: {@link IteratorChain#IteratorChain(Iterator, Iterator)}
   */
  @Test
  @DisplayName("Test new IteratorChain(Iterator, Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator, Iterator)"})
  void testNewIteratorChain2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> first = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(first, objectList2.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Iterator[])}.
   *
   * <p>Method under test: {@link IteratorChain#IteratorChain(Iterator[])}
   */
  @Test
  @DisplayName("Test new IteratorChain(Iterator[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.<init>(Iterator[])"})
  void testNewIteratorChain3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#IteratorChain(Collection)}
   */
  @Test
  @DisplayName(
      "Test new IteratorChain(Collection); given ArrayList() iterator; when ArrayList() add ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.<init>(Collection)"})
  void testNewIteratorChain_givenArrayListIterator_whenArrayListAddArrayListIterator() {
    // Arrange
    ArrayList<Iterator<?>> iteratorQueue = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorQueue.add(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorQueue.add(objectList2.iterator());

    // Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(iteratorQueue);

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#IteratorChain(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#IteratorChain(Collection)}
   */
  @Test
  @DisplayName("Test new IteratorChain(Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.<init>(Collection)"})
  void testNewIteratorChain_whenArrayList() {
    // Arrange and Act
    IteratorChain<Object> actualIteratorChain = new IteratorChain<>(new ArrayList<>());

    // Assert
    assertFalse(actualIteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   *
   * <p>Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertTrue(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain(Iterator[])} with iteratorQueue is {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given IteratorChain(Iterator[]) with iteratorQueue is ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext_givenIteratorChainWithIteratorQueueIsArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given IteratorChain(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorChain.hasNext()"})
  void testHasNext_givenIteratorChain_thenReturnFalse() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#next()}.
   *
   * <p>Method under test: {@link IteratorChain#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorChain.next()"})
  void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList2.iterator());
    iteratorChain.addIterator(iterator);

    // Act and Assert
    assertEquals("42", iteratorChain.next());
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#next()}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain(Iterator[])} with iteratorQueue is {@link
   *       ArrayList#ArrayList()} iterator.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given IteratorChain(Iterator[]) with iteratorQueue is ArrayList() iterator; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorChain.next()"})
  void testNext_givenIteratorChainWithIteratorQueueIsArrayListIterator_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", iteratorChain.next());
    assertFalse(iteratorChain.hasNext());
  }

  /**
   * Test {@link IteratorChain#remove()}.
   *
   * <ul>
   *   <li>Given {@link Iterator} {@link Iterator#hasNext()} return {@code false}.
   *   <li>Then calls {@link Iterator#hasNext()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#remove()}
   */
  @Test
  @DisplayName("Test remove(); given Iterator hasNext() return 'false'; then calls hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.remove()"})
  void testRemove_givenIteratorHasNextReturnFalse_thenCallsHasNext() {
    // Arrange
    when(iterator.hasNext()).thenReturn(false);
    doNothing().when(iterator).remove();

    // Act
    iteratorChain.remove();

    // Assert
    verify(iterator, atLeast(1)).hasNext();
    verify(iterator).remove();
  }

  /**
   * Test {@link IteratorChain#remove()}.
   *
   * <ul>
   *   <li>Given {@link Iterator} {@link Iterator#hasNext()} return {@code true}.
   *   <li>Then calls {@link Iterator#hasNext()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#remove()}
   */
  @Test
  @DisplayName("Test remove(); given Iterator hasNext() return 'true'; then calls hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.remove()"})
  void testRemove_givenIteratorHasNextReturnTrue_thenCallsHasNext() {
    // Arrange
    when(iterator.hasNext()).thenReturn(true);
    doNothing().when(iterator).remove();

    // Act
    iteratorChain.remove();

    // Assert
    verify(iterator).hasNext();
    verify(iterator).remove();
  }

  /**
   * Test {@link IteratorChain#size()}.
   *
   * <p>Method under test: {@link IteratorChain#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorChain.size()"})
  void testSize() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, iteratorChain.size());
  }

  /**
   * Test {@link IteratorChain#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Given {@link Iterator} {@link Iterator#hasNext()} return {@code false}.
   *   <li>Then calls {@link Iterator#hasNext()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#updateCurrentIterator()}
   */
  @Test
  @DisplayName(
      "Test updateCurrentIterator(); given Iterator hasNext() return 'false'; then calls hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.updateCurrentIterator()"})
  void testUpdateCurrentIterator_givenIteratorHasNextReturnFalse_thenCallsHasNext() {
    // Arrange
    when(iterator.hasNext()).thenReturn(false);

    // Act
    iteratorChain.updateCurrentIterator();

    // Assert
    verify(iterator, atLeast(1)).hasNext();
  }

  /**
   * Test {@link IteratorChain#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Given {@link Iterator} {@link Iterator#hasNext()} return {@code true}.
   *   <li>Then calls {@link Iterator#hasNext()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorChain#updateCurrentIterator()}
   */
  @Test
  @DisplayName(
      "Test updateCurrentIterator(); given Iterator hasNext() return 'true'; then calls hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorChain.updateCurrentIterator()"})
  void testUpdateCurrentIterator_givenIteratorHasNextReturnTrue_thenCallsHasNext() {
    // Arrange
    when(iterator.hasNext()).thenReturn(true);

    // Act
    iteratorChain.updateCurrentIterator();

    // Assert
    verify(iterator).hasNext();
  }
}
