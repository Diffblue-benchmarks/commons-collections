package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SingletonListIteratorDiffblueTest {
  /**
   * Test {@link SingletonListIterator#SingletonListIterator(Object)}.
   * <p>
   * Method under test: {@link SingletonListIterator#SingletonListIterator(Object)}
   */
  @Test
  @DisplayName("Test new SingletonListIterator(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SingletonListIterator.<init>(Object)"})
  void testNewSingletonListIterator() {
    // Arrange and Act
    SingletonListIterator<Object> actualSingletonListIterator = new SingletonListIterator<>("Object");

    // Assert
    assertEquals("Object", actualSingletonListIterator.next());
    assertFalse(actualSingletonListIterator.hasNext());
  }

  /**
   * Test {@link SingletonListIterator#add(Object)}.
   * <p>
   * Method under test: {@link SingletonListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SingletonListIterator.add(Object)"})
  void testAdd() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonListIterator.add("Obj"));
  }

  /**
   * Test {@link SingletonListIterator#hasNext()}.
   * <p>
   * Method under test: {@link SingletonListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SingletonListIterator.hasNext()"})
  void testHasNext() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertTrue(singletonListIterator.hasNext());
  }

  /**
   * Test {@link SingletonListIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link SingletonListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SingletonListIterator.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertFalse(singletonListIterator.hasPrevious());
  }

  /**
   * Test {@link SingletonListIterator#next()}.
   * <p>
   * Method under test: {@link SingletonListIterator#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object SingletonListIterator.next()"})
  void testNext() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals("Object", singletonListIterator.next());
    assertFalse(singletonListIterator.hasNext());
  }

  /**
   * Test {@link SingletonListIterator#nextIndex()}.
   * <p>
   * Method under test: {@link SingletonListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SingletonListIterator.nextIndex()"})
  void testNextIndex() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals(0, singletonListIterator.nextIndex());
  }

  /**
   * Test {@link SingletonListIterator#previous()}.
   * <p>
   * Method under test: {@link SingletonListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object SingletonListIterator.previous()"})
  void testPrevious() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> singletonListIterator.previous());
  }

  /**
   * Test {@link SingletonListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link SingletonListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int SingletonListIterator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals(-1, singletonListIterator.previousIndex());
  }

  /**
   * Test {@link SingletonListIterator#remove()}.
   * <p>
   * Method under test: {@link SingletonListIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SingletonListIterator.remove()"})
  void testRemove() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonListIterator.remove());
  }

  /**
   * Test {@link SingletonListIterator#set(Object)}.
   * <p>
   * Method under test: {@link SingletonListIterator#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SingletonListIterator.set(Object)"})
  void testSet() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonListIterator.set("Object"));
  }
}
