package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PeekingIteratorDiffblueTest {
  /**
   * Test {@link PeekingIterator#peekingIterator(Iterator)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#peekingIterator(Iterator)}
   */
  @Test
  @DisplayName("Test peekingIterator(Iterator); when ArrayList() iterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PeekingIterator PeekingIterator.peekingIterator(Iterator)"})
  void testPeekingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    PeekingIterator<Object> actualPeekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Assert
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#peekingIterator(Iterator)}.
   * <ul>
   *   <li>When peekingIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   *   <li>{@link PeekingIterator#peekingIterator(Iterator)}
   * </ul>
   */
  @Test
  @DisplayName("Test peekingIterator(Iterator); when peekingIterator ArrayList() iterator")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link PeekingIterator#PeekingIterator(Iterator)}
   */
  @Test
  @DisplayName("Test new PeekingIterator(Iterator)")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#element()}
   */
  @Test
  @DisplayName("Test element(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PeekingIterator.element()"})
  void testElement_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.element());
  }

  /**
   * Test {@link PeekingIterator#element()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#element()}
   */
  @Test
  @DisplayName("Test element(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PeekingIterator.element()"})
  void testElement_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.element());
  }

  /**
   * Test {@link PeekingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PeekingIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertTrue(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PeekingIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PeekingIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.next());
    assertFalse(peekingIteratorResult.hasNext());
  }

  /**
   * Test {@link PeekingIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PeekingIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> peekingIteratorResult.next());
  }

  /**
   * Test {@link PeekingIterator#peek()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  @DisplayName("Test peek(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PeekingIterator.peek()"})
  void testPeek_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertEquals("42", peekingIteratorResult.peek());
  }

  /**
   * Test {@link PeekingIterator#peek()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PeekingIterator#peek()}
   */
  @Test
  @DisplayName("Test peek(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PeekingIterator.peek()"})
  void testPeek_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<Object> peekingIteratorResult = PeekingIterator.peekingIterator(objectList.iterator());

    // Act and Assert
    assertNull(peekingIteratorResult.peek());
  }
}
