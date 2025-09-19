package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ListIteratorWrapperDiffblueTest {
  /**
   * Test {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)}
   */
  @Test
  @DisplayName("Test new ListIteratorWrapper(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListIteratorWrapper.<init>(Iterator)"})
  void testNewListIteratorWrapper() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ListIteratorWrapper<Object> actualListIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Assert
    assertFalse(actualListIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#add(Object)}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListIteratorWrapper.add(Object)"})
  void testAdd() throws UnsupportedOperationException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> listIteratorWrapper.add("Obj"));
  }

  /**
   * Test {@link ListIteratorWrapper#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ListIteratorWrapper#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertTrue(listIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ListIteratorWrapper#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertFalse(listIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#hasPrevious()}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertFalse(listIteratorWrapper.hasPrevious());
  }

  /**
   * Test {@link ListIteratorWrapper#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ListIteratorWrapper#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ListIteratorWrapper.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", listIteratorWrapper.next());
    assertFalse(listIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#nextIndex()}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ListIteratorWrapper.nextIndex()"})
  void testNextIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals(0, listIteratorWrapper.nextIndex());
  }

  /**
   * Test {@link ListIteratorWrapper#previous()}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#previous()}
   */
  @Test
  @DisplayName("Test previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ListIteratorWrapper.previous()"})
  void testPrevious() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> listIteratorWrapper.previous());
  }

  /**
   * Test {@link ListIteratorWrapper#previousIndex()}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ListIteratorWrapper.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals(-1, listIteratorWrapper.previousIndex());
  }

  /**
   * Test {@link ListIteratorWrapper#remove()}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListIteratorWrapper.remove()"})
  void testRemove() throws IllegalStateException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
  }

  /**
   * Test {@link ListIteratorWrapper#set(Object)}.
   *
   * <p>Method under test: {@link ListIteratorWrapper#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListIteratorWrapper.set(Object)"})
  void testSet() throws UnsupportedOperationException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper =
        new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> listIteratorWrapper.set("Obj"));
  }
}
