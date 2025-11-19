package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PeekingIteratorDiffblueTest {
  @Mock private Iterator<?> iterator;

  @InjectMocks private PeekingIterator<Object> peekingIterator;

  /**
   * Test {@link PeekingIterator#peekingIterator(Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#peekingIterator(Iterator)}
   */
  @Test
  @DisplayName("Test peekingIterator(Iterator); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PeekingIterator PeekingIterator.peekingIterator(Iterator)"})
  void testPeekingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#peekingIterator(Iterator)}.
   *
   * <ul>
   *   <li>When peekingIterator {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   * </ul>
   */
  @Test
  @DisplayName("Test peekingIterator(Iterator); when peekingIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PeekingIterator PeekingIterator.peekingIterator(Iterator)"})
  void testPeekingIterator_whenPeekingIteratorArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<?> iterator = PeekingIterator.peekingIterator(objectList.iterator());

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult = PeekingIterator.peekingIterator(iterator);

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#PeekingIterator(Iterator)}.
   *
   * <p>Method under test: {@link PeekingIterator#PeekingIterator(Iterator)}
   */
  @Test
  @DisplayName("Test new PeekingIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PeekingIterator.<init>(Iterator)"})
  void testNewPeekingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIterator = new PeekingIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIterator.hasNext());
  }

  /**
   * Test {@link PeekingIterator#element()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#element()}
   */
  @Test
  @DisplayName("Test element(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PeekingIterator.element()"})
  void testElement_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.element());
  }

  /**
   * Test {@link PeekingIterator#element()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#element()}
   */
  @Test
  @DisplayName("Test element(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PeekingIterator.element()"})
  void testElement_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.element());
  }

  /**
   * Test {@link PeekingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PeekingIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertTrue(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given peekingIterator {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given peekingIterator ArrayList() iterator; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PeekingIterator.hasNext()"})
  void testHasNext_givenPeekingIteratorArrayListIterator_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PeekingIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.next());
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#next()}.
   *
   * <ul>
   *   <li>Given peekingIterator {@link ArrayList#ArrayList()} iterator.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given peekingIterator ArrayList() iterator; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PeekingIterator.next()"})
  void testNext_givenPeekingIteratorArrayListIterator_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.next());
  }

  /**
   * Test {@link PeekingIterator#peek()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  @DisplayName("Test peek(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PeekingIterator.peek()"})
  void testPeek_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.peek());
  }

  /**
   * Test {@link PeekingIterator#peek()}.
   *
   * <ul>
   *   <li>Given peekingIterator {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  @DisplayName("Test peek(); given peekingIterator ArrayList() iterator; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object PeekingIterator.peek()"})
  void testPeek_givenPeekingIteratorArrayListIterator_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult =
        PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertNull(peekingIteratorResult.peek());
  }

  /**
   * Test {@link PeekingIterator#remove()}.
   *
   * <ul>
   *   <li>Given {@link Iterator} {@link Iterator#remove()} does nothing.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given Iterator remove() does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PeekingIterator.remove()"})
  void testRemove_givenIteratorRemoveDoesNothing() {
    // Arrange
    doNothing().when(iterator).remove();

    // Act
    peekingIterator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link PeekingIterator#remove()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link PeekingIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PeekingIterator.remove()"})
  void testRemove_thenThrowNoSuchElementException() {
    // Arrange
    doThrow(new NoSuchElementException()).when(iterator).remove();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIterator.remove());
    verify(iterator).remove();
  }
}
