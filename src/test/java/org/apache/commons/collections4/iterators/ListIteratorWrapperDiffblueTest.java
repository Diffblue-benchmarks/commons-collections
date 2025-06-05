package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
   * <p>
   * Method under test: {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)}
   */
  @Test
  @DisplayName("Test new ListIteratorWrapper(Iterator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListIteratorWrapper.<init>(Iterator)"})
  void testNewListIteratorWrapper() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ListIteratorWrapper<Object> actualListIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Assert
    assertFalse(actualListIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListIteratorWrapper#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertTrue(listIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListIteratorWrapper#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertFalse(listIteratorWrapper.hasNext());
  }

  /**
   * Test {@link ListIteratorWrapper#hasPrevious()}.
   * <p>
   * Method under test: {@link ListIteratorWrapper#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertFalse(listIteratorWrapper.hasPrevious());
  }

  /**
   * Test {@link ListIteratorWrapper#nextIndex()}.
   * <p>
   * Method under test: {@link ListIteratorWrapper#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ListIteratorWrapper.nextIndex()"})
  void testNextIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals(0, listIteratorWrapper.nextIndex());
  }

  /**
   * Test {@link ListIteratorWrapper#previous()}.
   * <p>
   * Method under test: {@link ListIteratorWrapper#previous()}
   */
  @Test
  @DisplayName("Test previous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListIteratorWrapper.previous()"})
  void testPrevious() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> listIteratorWrapper.previous());
  }

  /**
   * Test {@link ListIteratorWrapper#previousIndex()}.
   * <p>
   * Method under test: {@link ListIteratorWrapper#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ListIteratorWrapper.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertEquals(-1, listIteratorWrapper.previousIndex());
  }

  /**
   * Test {@link ListIteratorWrapper#remove()}.
   * <p>
   * Method under test: {@link ListIteratorWrapper#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListIteratorWrapper.remove()"})
  void testRemove() throws IllegalStateException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
  }
}
