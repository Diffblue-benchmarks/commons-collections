package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoopingListIteratorDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingListIterator.<init>(List)"})
  public void testNewLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingListIterator.<init>(List)"})
  public void testNewLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingListIterator.<init>(List)"})
  public void testNewLoopingListIterator_whenArrayList_thenReturnNotHasNext() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LoopingListIterator.add(Object)"})
  public void testAdd() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LoopingListIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LoopingListIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LoopingListIterator.hasPrevious()"})
  public void testHasPrevious_givenArrayListAdd42_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LoopingListIterator.hasPrevious()"})
  public void testHasPrevious_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingListIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingListIterator.next()"})
  public void testNext_givenLoopingListIteratorWithListIsArrayListAddObj_thenReturnObj() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingListIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.nextIndex()"})
  public void testNextIndex_givenArrayListAdd42_thenReturnZero() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.nextIndex()"})
  public void testNextIndex_givenLoopingListIteratorWithListIsArrayListAddObj_thenReturnZero() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.nextIndex()"})
  public void testNextIndex_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingListIterator.previous()"})
  public void testPrevious_givenArrayListAdd42_thenReturn42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingListIterator.previous()"})
  public void testPrevious_givenLoopingListIteratorWithListIsArrayListAddObj_thenReturnObj() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LoopingListIterator.previous()"})
  public void testPrevious_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.previousIndex()"})
  public void testPreviousIndex_givenArrayListAdd42_thenReturnZero() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.previousIndex()"})
  public void testPreviousIndex_givenLoopingListIteratorWithListIsArrayListAddObj() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.previousIndex()"})
  public void testPreviousIndex_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LoopingListIterator.size()"})
  public void testSize() {
    // Arrange
    LoopingListIterator<Object> loopingListIterator = new LoopingListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, loopingListIterator.size());
  }
}
