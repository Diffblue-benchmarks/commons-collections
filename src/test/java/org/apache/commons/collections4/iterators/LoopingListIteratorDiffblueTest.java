package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoopingListIteratorDiffblueTest {
  /**
   * Test {@link LoopingListIterator#LoopingListIterator(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#LoopingListIterator(List)}
   */
  @Test
  @DisplayName("Test new LoopingListIterator(List); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LoopingListIterator.<init>(List)"})
  void testNewLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    LoopingListIterator<Object> actualLoopingListIterator = new LoopingListIterator<>(list);

    // Assert
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertTrue(actualLoopingListIterator.hasNext());
  }

  /**
   * Test {@link LoopingListIterator#LoopingListIterator(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#LoopingListIterator(List)}
   */
  @Test
  @DisplayName("Test new LoopingListIterator(List); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LoopingListIterator.<init>(List)"})
  void testNewLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    LoopingListIterator<Object> actualLoopingListIterator = new LoopingListIterator<>(list);

    // Assert
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertEquals("42", actualLoopingListIterator.next());
    assertTrue(actualLoopingListIterator.hasNext());
  }

  /**
   * Test {@link LoopingListIterator#LoopingListIterator(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#LoopingListIterator(List)}
   */
  @Test
  @DisplayName("Test new LoopingListIterator(List); when ArrayList(); then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LoopingListIterator.<init>(List)"})
  void testNewLoopingListIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    LoopingListIterator<Object> actualLoopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingListIterator.hasNext());
  }

  /**
   * Test {@link LoopingListIterator#add(Object)}.
   * <p>
   * Method under test: {@link LoopingListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LoopingListIterator.add(Object)"})
  void testAdd() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act
    loopingListIterator.add("Obj");

    // Assert
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertEquals("Obj", loopingListIterator.next());
    assertTrue(loopingListIterator.hasNext());
  }

  /**
   * Test {@link LoopingListIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LoopingListIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertTrue(loopingListIterator.hasNext());
  }

  /**
   * Test {@link LoopingListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LoopingListIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingListIterator.hasNext());
  }

  /**
   * Test {@link LoopingListIterator#hasPrevious()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LoopingListIterator.hasPrevious()"})
  void testHasPrevious_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertTrue(loopingListIterator.hasPrevious());
  }

  /**
   * Test {@link LoopingListIterator#hasPrevious()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LoopingListIterator.hasPrevious()"})
  void testHasPrevious_thenReturnFalse() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(loopingListIterator.hasPrevious());
  }

  /**
   * Test {@link LoopingListIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LoopingListIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals("42", loopingListIterator.next());
  }

  /**
   * Test {@link LoopingListIterator#next()}.
   * <ul>
   *   <li>Given {@link LoopingListIterator#LoopingListIterator(List)} with list is {@link ArrayList#ArrayList()} add {@code Obj}.</li>
   *   <li>Then return {@code Obj}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given LoopingListIterator(List) with list is ArrayList() add 'Obj'; then return 'Obj'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LoopingListIterator.next()"})
  void testNext_givenLoopingListIteratorWithListIsArrayListAddObj_thenReturnObj() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals("Obj", loopingListIterator.next());
  }

  /**
   * Test {@link LoopingListIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LoopingListIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.next());
  }

  /**
   * Test {@link LoopingListIterator#nextIndex()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex(); given ArrayList() add '42'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.nextIndex()"})
  void testNextIndex_givenArrayListAdd42_thenReturnZero() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals(0, loopingListIterator.nextIndex());
  }

  /**
   * Test {@link LoopingListIterator#nextIndex()}.
   * <ul>
   *   <li>Given {@link LoopingListIterator#LoopingListIterator(List)} with list is {@link ArrayList#ArrayList()} add {@code Obj}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex(); given LoopingListIterator(List) with list is ArrayList() add 'Obj'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.nextIndex()"})
  void testNextIndex_givenLoopingListIteratorWithListIsArrayListAddObj_thenReturnZero() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals(0, loopingListIterator.nextIndex());
  }

  /**
   * Test {@link LoopingListIterator#nextIndex()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.nextIndex()"})
  void testNextIndex_thenThrowNoSuchElementException() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.nextIndex());
  }

  /**
   * Test {@link LoopingListIterator#previous()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LoopingListIterator.previous()"})
  void testPrevious_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals("42", loopingListIterator.previous());
  }

  /**
   * Test {@link LoopingListIterator#previous()}.
   * <ul>
   *   <li>Given {@link LoopingListIterator#LoopingListIterator(List)} with list is {@link ArrayList#ArrayList()} add {@code Obj}.</li>
   *   <li>Then return {@code Obj}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous(); given LoopingListIterator(List) with list is ArrayList() add 'Obj'; then return 'Obj'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LoopingListIterator.previous()"})
  void testPrevious_givenLoopingListIteratorWithListIsArrayListAddObj_thenReturnObj() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals("Obj", loopingListIterator.previous());
  }

  /**
   * Test {@link LoopingListIterator#previous()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LoopingListIterator.previous()"})
  void testPrevious_thenThrowNoSuchElementException() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.previous());
  }

  /**
   * Test {@link LoopingListIterator#previousIndex()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex(); given ArrayList() add '42'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.previousIndex()"})
  void testPreviousIndex_givenArrayListAdd42_thenReturnZero() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(list);

    // Act and Assert
    assertEquals(0, loopingListIterator.previousIndex());
  }

  /**
   * Test {@link LoopingListIterator#previousIndex()}.
   * <ul>
   *   <li>Given {@link LoopingListIterator#LoopingListIterator(List)} with list is {@link ArrayList#ArrayList()} add {@code Obj}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex(); given LoopingListIterator(List) with list is ArrayList() add 'Obj'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.previousIndex()"})
  void testPreviousIndex_givenLoopingListIteratorWithListIsArrayListAddObj() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());
    loopingListIterator.add("Obj");

    // Act and Assert
    assertEquals(0, loopingListIterator.previousIndex());
  }

  /**
   * Test {@link LoopingListIterator#previousIndex()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LoopingListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.previousIndex()"})
  void testPreviousIndex_thenThrowNoSuchElementException() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> loopingListIterator.previousIndex());
  }

  /**
   * Test {@link LoopingListIterator#size()}.
   * <p>
   * Method under test: {@link LoopingListIterator#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LoopingListIterator.size()"})
  void testSize() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, loopingListIterator.size());
  }
}
