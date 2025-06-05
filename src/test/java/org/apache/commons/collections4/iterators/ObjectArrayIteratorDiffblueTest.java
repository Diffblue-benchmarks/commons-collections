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

class ObjectArrayIteratorDiffblueTest {
  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}.
   * <p>
   * Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}
   */
  @Test
  @DisplayName("Test new ObjectArrayIterator(Object[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[])"})
  void testNewObjectArrayIterator() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayIterator.next());
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}.
   * <ul>
   *   <li>Then return next is {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}
   */
  @Test
  @DisplayName("Test new ObjectArrayIterator(Object[], int, int); then return next is 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayIterator_thenReturnNextIsArray() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>(
        new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertEquals("Array", actualObjectArrayIterator.next());
    assertEquals("Array", actualObjectArrayIterator.next());
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int)}
   */
  @Test
  @DisplayName("Test new ObjectArrayIterator(Object[], int); when array of Object with 'Array'; then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[], int)"})
  void testNewObjectArrayIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>(new Object[]{"Array"}, 1);

    // Assert
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}
   */
  @Test
  @DisplayName("Test new ObjectArrayIterator(Object[], int, int); when zero; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayIterator_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ObjectArrayIterator<>(new Object[]{"Array"}, 1, 0));

  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ObjectArrayIterator#reset()}
   *   <li>{@link ObjectArrayIterator#getArray()}
   *   <li>{@link ObjectArrayIterator#getEndIndex()}
   *   <li>{@link ObjectArrayIterator#getStartIndex()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] ObjectArrayIterator.getArray()", "int ObjectArrayIterator.getEndIndex()",
      "int ObjectArrayIterator.getStartIndex()", "void ObjectArrayIterator.reset()"})
  void testGettersAndSetters() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act
    objectArrayIterator.reset();
    Object[] actualArray = objectArrayIterator.getArray();
    int actualEndIndex = objectArrayIterator.getEndIndex();

    // Assert
    assertEquals("Array", actualArray[0]);
    assertEquals(0, objectArrayIterator.getStartIndex());
    assertEquals(1, actualEndIndex);
    assertEquals(1, actualArray.length);
  }

  /**
   * Test {@link ObjectArrayIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ObjectArrayIterator#ObjectArrayIterator(Object[])} with {@code Array}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ObjectArrayIterator(Object[]) with 'Array'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ObjectArrayIterator.hasNext()"})
  void testHasNext_givenObjectArrayIteratorWithArray_thenReturnTrue() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertTrue(objectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ObjectArrayIterator(Object[]); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ObjectArrayIterator.hasNext()"})
  void testHasNext_givenObjectArrayIterator_thenReturnFalse() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>();

    // Act and Assert
    assertFalse(objectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#next()}.
   * <ul>
   *   <li>Given {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ObjectArrayIterator(Object[]); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ObjectArrayIterator.next()"})
  void testNext_givenObjectArrayIterator_thenThrowNoSuchElementException() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayIterator.next());
  }

  /**
   * Test {@link ObjectArrayIterator#next()}.
   * <ul>
   *   <li>Then not {@link ObjectArrayIterator#ObjectArrayIterator(Object[])} with {@code Array} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then not ObjectArrayIterator(Object[]) with 'Array' hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ObjectArrayIterator.next()"})
  void testNext_thenNotObjectArrayIteratorWithArrayHasNext() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayIterator.next());
    assertFalse(objectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#next()}.
   * <ul>
   *   <li>Then not {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])} with {@code Array} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then not ObjectArrayListIterator(Object[]) with 'Array' hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ObjectArrayIterator.next()"})
  void testNext_thenNotObjectArrayListIteratorWithArrayHasNext() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#remove()}.
   * <p>
   * Method under test: {@link ObjectArrayIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ObjectArrayIterator.remove()"})
  void testRemove() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayIterator.remove());
  }
}
