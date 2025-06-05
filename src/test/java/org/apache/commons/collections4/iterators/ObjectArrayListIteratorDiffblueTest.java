package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ObjectArrayListIteratorDiffblueTest {
  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}
   */
  @Test
  @DisplayName("Test new ObjectArrayListIterator(Object[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[])"})
  void testNewObjectArrayListIterator() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}.
   * <ul>
   *   <li>Then return next is {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}
   */
  @Test
  @DisplayName("Test new ObjectArrayListIterator(Object[], int, int); then return next is 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayListIterator_thenReturnNextIsArray() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>(
        new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}
   */
  @Test
  @DisplayName("Test new ObjectArrayListIterator(Object[], int); when array of Object with 'Array'; then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int)"})
  void testNewObjectArrayListIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>(new Object[]{"Array"},
        1);

    // Assert
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#add(Object)}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayListIterator.add(Object)"})
  void testAdd() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayListIterator.add("Obj"));
  }

  /**
   * Test {@link ObjectArrayListIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ObjectArrayListIterator.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertFalse(objectArrayListIterator.hasPrevious());
  }

  /**
   * Test {@link ObjectArrayListIterator#next()}.
   * <ul>
   *   <li>Given {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])} with {@code Array}.</li>
   *   <li>Then return {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ObjectArrayListIterator(Object[]) with 'Array'; then return 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ObjectArrayListIterator.next()"})
  void testNext_givenObjectArrayListIteratorWithArray_thenReturnArray() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#next()}.
   * <ul>
   *   <li>Given {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ObjectArrayListIterator(Object[]); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ObjectArrayListIterator.next()"})
  void testNext_givenObjectArrayListIterator_thenThrowNoSuchElementException() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.next());
  }

  /**
   * Test {@link ObjectArrayListIterator#nextIndex()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ObjectArrayListIterator.nextIndex()"})
  void testNextIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(0, objectArrayListIterator.nextIndex());
  }

  /**
   * Test {@link ObjectArrayListIterator#previous()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ObjectArrayListIterator.previous()"})
  void testPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.previous());
  }

  /**
   * Test {@link ObjectArrayListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ObjectArrayListIterator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(-1, objectArrayListIterator.previousIndex());
  }

  /**
   * Test {@link ObjectArrayListIterator#set(Object)}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayListIterator.set(Object)"})
  void testSet() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectArrayListIterator.set("Obj"));
  }
}
