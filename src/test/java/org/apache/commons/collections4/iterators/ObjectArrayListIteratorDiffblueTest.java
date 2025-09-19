package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ObjectArrayListIteratorDiffblueTest {
  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}
   */
  @Test
  @DisplayName("Test new ObjectArrayListIterator(Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[])"})
  void testNewObjectArrayListIterator() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}
   */
  @Test
  @DisplayName(
      "Test new ObjectArrayListIterator(Object[], int); when array of Object with 'Array'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int)"})
  void testNewObjectArrayListIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext() {
    // Arrange
    Object[] array = new Object[] {"Array"};

    // Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator =
        new ObjectArrayListIterator<>(array, 1);

    // Assert
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new ObjectArrayListIterator(Object[], int, int); when array of Object with 'Array'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayListIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext2() {
    // Arrange
    Object[] array = new Object[] {"Array"};

    // Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator =
        new ObjectArrayListIterator<>(array, 1, 1);

    // Assert
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new ObjectArrayListIterator(Object[], int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int, int)"})
  void testNewObjectArrayListIterator_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    Object[] array = new Object[] {"Array"};

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ObjectArrayListIterator<>(array, 1, 0));
  }

  /**
   * Test {@link ObjectArrayListIterator#add(Object)}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayListIterator.add(Object)"})
  void testAdd() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayListIterator.add("Obj"));
  }

  /**
   * Test {@link ObjectArrayListIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectArrayListIterator.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertFalse(objectArrayListIterator.hasPrevious());
  }

  /**
   * Test {@link ObjectArrayListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])} with {@code
   *       Array}.
   *   <li>Then return {@code Array}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given ObjectArrayListIterator(Object[]) with 'Array'; then return 'Array'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectArrayListIterator.next()"})
  void testNext_givenObjectArrayListIteratorWithArray_thenReturnArray() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given ObjectArrayListIterator(Object[]); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectArrayListIterator.next()"})
  void testNext_givenObjectArrayListIterator_thenThrowNoSuchElementException() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.next());
  }

  /**
   * Test {@link ObjectArrayListIterator#nextIndex()}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjectArrayListIterator.nextIndex()"})
  void testNextIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(0, objectArrayListIterator.nextIndex());
  }

  /**
   * Test {@link ObjectArrayListIterator#previous()}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectArrayListIterator.previous()"})
  void testPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.previous());
  }

  /**
   * Test {@link ObjectArrayListIterator#previousIndex()}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjectArrayListIterator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(-1, objectArrayListIterator.previousIndex());
  }

  /**
   * Test {@link ObjectArrayListIterator#set(Object)}.
   *
   * <p>Method under test: {@link ObjectArrayListIterator#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectArrayListIterator.set(Object)"})
  void testSet() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator =
        new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectArrayListIterator.set("Obj"));
  }
}
