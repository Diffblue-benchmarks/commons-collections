package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ObjectArrayIteratorDiffblueTest {
  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}.
   *
   * <p>Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}
   */
  @Test
  @DisplayName("Test new ObjectArrayIterator(Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[])"})
  void testNewObjectArrayIterator() {
    // Arrange and Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayIterator.next());
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int)}
   */
  @Test
  @DisplayName(
      "Test new ObjectArrayIterator(Object[], int); when array of Object with 'Array'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[], int)"})
  void testNewObjectArrayIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext() {
    // Arrange
    Object[] array = new Object[] {"Array"};

    // Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>(array, 1);

    // Assert
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}
   */
  @Test
  @DisplayName(
      "Test new ObjectArrayIterator(Object[], int, int); when array of Object with 'Array'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext2() {
    // Arrange
    Object[] array = new Object[] {"Array"};

    // Act
    ObjectArrayIterator<Object> actualObjectArrayIterator = new ObjectArrayIterator<>(array, 1, 1);

    // Assert
    assertFalse(actualObjectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#ObjectArrayIterator(Object[], int, int)}
   */
  @Test
  @DisplayName(
      "Test new ObjectArrayIterator(Object[], int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayIterator_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    Object[] array = new Object[] {"Array"};

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ObjectArrayIterator<>(array, 1, 0));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjectArrayIterator#reset()}
   *   <li>{@link ObjectArrayIterator#getArray()}
   *   <li>{@link ObjectArrayIterator#getEndIndex()}
   *   <li>{@link ObjectArrayIterator#getStartIndex()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object[] ObjectArrayIterator.getArray()",
    "int ObjectArrayIterator.getEndIndex()",
    "int ObjectArrayIterator.getStartIndex()",
    "void ObjectArrayIterator.reset()"
  })
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
   *
   * <ul>
   *   <li>Given {@link ObjectArrayIterator#ObjectArrayIterator(Object[])} with {@code Array}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given ObjectArrayIterator(Object[]) with 'Array'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectArrayIterator.hasNext()"})
  void testHasNext_givenObjectArrayIteratorWithArray_thenReturnTrue() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertTrue(objectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectArrayIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    Object[] array = new Object[] {"Array"};
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>(array, 1);

    // Act and Assert
    assertFalse(objectArrayIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ObjectArrayIterator#ObjectArrayIterator(Object[])}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given ObjectArrayIterator(Object[]); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectArrayIterator.next()"})
  void testNext_givenObjectArrayIterator_thenThrowNoSuchElementException() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayIterator.next());
  }

  /**
   * Test {@link ObjectArrayIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link ObjectArrayIterator#ObjectArrayIterator(Object[])} with {@code Array}
   *       hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then not ObjectArrayIterator(Object[]) with 'Array' hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Then not {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])} with {@code
   *       Array} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then not ObjectArrayListIterator(Object[]) with 'Array' hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectArrayIterator.next()"})
  void testNext_thenNotObjectArrayListIteratorWithArrayHasNext() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayIterator#remove()}.
   *
   * <p>Method under test: {@link ObjectArrayIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayIterator.remove()"})
  void testRemove() {
    // Arrange
    ObjectArrayIterator<Object> objectArrayIterator = new ObjectArrayIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayIterator.remove());
  }
}
