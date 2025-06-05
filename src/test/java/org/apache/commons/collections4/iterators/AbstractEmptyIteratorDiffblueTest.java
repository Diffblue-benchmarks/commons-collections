package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractEmptyIteratorDiffblueTest {
  /**
   * Test {@link AbstractEmptyIterator#add(Object)}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractEmptyIterator.add(Object)"})
  void testAdd() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> emptyIterator.add("Ignored"));
  }

  /**
   * Test {@link AbstractEmptyIterator#hasNext()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractEmptyIterator.hasNext()"})
  void testHasNext() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertFalse(emptyIterator.hasNext());
  }

  /**
   * Test {@link AbstractEmptyIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractEmptyIterator.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertFalse(emptyIterator.hasPrevious());
  }

  /**
   * Test {@link AbstractEmptyIterator#next()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractEmptyIterator.next()"})
  void testNext() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> emptyIterator.next());
  }

  /**
   * Test {@link AbstractEmptyIterator#nextIndex()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractEmptyIterator.nextIndex()"})
  void testNextIndex() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertEquals(0, emptyIterator.nextIndex());
  }

  /**
   * Test {@link AbstractEmptyIterator#previous()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#previous()}
   */
  @Test
  @DisplayName("Test previous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractEmptyIterator.previous()"})
  void testPrevious() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> emptyIterator.previous());
  }

  /**
   * Test {@link AbstractEmptyIterator#previousIndex()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractEmptyIterator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertEquals(-1, emptyIterator.previousIndex());
  }

  /**
   * Test {@link AbstractEmptyIterator#remove()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractEmptyIterator.remove()"})
  void testRemove() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyIterator.remove());
  }

  /**
   * Test {@link AbstractEmptyIterator#set(Object)}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractEmptyIterator.set(Object)"})
  void testSet() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyIterator.set("Ignored"));
  }
}
