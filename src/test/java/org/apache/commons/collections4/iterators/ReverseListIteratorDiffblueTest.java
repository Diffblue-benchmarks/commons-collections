package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReverseListIteratorDiffblueTest {
  /**
   * Test {@link ReverseListIterator#ReverseListIterator(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  @DisplayName(
      "Test new ReverseListIterator(List); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.<init>(List)"})
  void testNewReverseListIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ReverseListIterator<Object> actualReverseListIterator = new ReverseListIterator<>(list);

    // Assert
    assertEquals("42", actualReverseListIterator.next());
    assertFalse(actualReverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#ReverseListIterator(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  @DisplayName(
      "Test new ReverseListIterator(List); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.<init>(List)"})
  void testNewReverseListIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ReverseListIterator<Object> actualReverseListIterator = new ReverseListIterator<>(list);

    // Assert
    assertEquals("42", actualReverseListIterator.next());
    assertEquals("42", actualReverseListIterator.next());
    assertFalse(actualReverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#ReverseListIterator(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  @DisplayName("Test new ReverseListIterator(List); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.<init>(List)"})
  void testNewReverseListIterator_whenArrayList() {
    // Arrange and Act
    ReverseListIterator<Object> actualReverseListIterator =
        new ReverseListIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualReverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given ReverseListIterator(List) with list is ArrayList(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.add(Object)"})
  void testAdd_givenReverseListIteratorWithListIsArrayList_thenDoesNotThrow() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> reverseListIterator.add("Obj"));
  }

  /**
   * Test {@link ReverseListIterator#add(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.add(Object)"})
  void testAdd_thenThrowIllegalStateException() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.add("Obj"));
  }

  /**
   * Test {@link ReverseListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReverseListIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(list);

    // Act and Assert
    assertTrue(reverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReverseListIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#hasPrevious()}.
   *
   * <ul>
   *   <li>Given {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link
   *       ArrayList#ArrayList()} add {@code Obj}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#hasPrevious()}
   */
  @Test
  @DisplayName(
      "Test hasPrevious(); given ReverseListIterator(List) with list is ArrayList() add 'Obj'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReverseListIterator.hasPrevious()"})
  void testHasPrevious_givenReverseListIteratorWithListIsArrayListAddObj_thenReturnTrue() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertTrue(reverseListIterator.hasPrevious());
  }

  /**
   * Test {@link ReverseListIterator#hasPrevious()}.
   *
   * <ul>
   *   <li>Given {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#hasPrevious()}
   */
  @Test
  @DisplayName(
      "Test hasPrevious(); given ReverseListIterator(List) with list is ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReverseListIterator.hasPrevious()"})
  void testHasPrevious_givenReverseListIteratorWithListIsArrayList_thenReturnFalse() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(reverseListIterator.hasPrevious());
  }

  /**
   * Test {@link ReverseListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReverseListIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(list);

    // Act and Assert
    assertEquals("42", reverseListIterator.next());
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#nextIndex()}.
   *
   * <p>Method under test: {@link ReverseListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ReverseListIterator.nextIndex()"})
  void testNextIndex() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(-1, reverseListIterator.nextIndex());
  }

  /**
   * Test {@link ReverseListIterator#previous()}.
   *
   * <ul>
   *   <li>Then {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link
   *       ArrayList#ArrayList()} next is {@code Obj}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#previous()}
   */
  @Test
  @DisplayName(
      "Test previous(); then ReverseListIterator(List) with list is ArrayList() next is 'Obj'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReverseListIterator.previous()"})
  void testPrevious_thenReverseListIteratorWithListIsArrayListNextIsObj() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act
    Object actualPreviousResult = reverseListIterator.previous();

    // Assert
    assertEquals("Obj", reverseListIterator.next());
    assertEquals("Obj", actualPreviousResult);
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#previousIndex()}.
   *
   * <p>Method under test: {@link ReverseListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ReverseListIterator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, reverseListIterator.previousIndex());
  }

  /**
   * Test {@link ReverseListIterator#remove()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.remove()"})
  void testRemove_thenThrowIllegalStateException() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.remove());
  }

  /**
   * Test {@link ReverseListIterator#set(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ReverseListIterator#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReverseListIterator.set(Object)"})
  void testSet_thenThrowIllegalStateException() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.set("Obj"));
  }
}
