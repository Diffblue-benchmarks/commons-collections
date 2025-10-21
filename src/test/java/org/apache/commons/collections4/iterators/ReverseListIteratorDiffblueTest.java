package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ReverseListIteratorDiffblueTest {
  /**
   * Test {@link ReverseListIterator#ReverseListIterator(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseListIterator.<init>(List)"})
  public void testNewReverseListIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseListIterator.<init>(List)"})
  public void testNewReverseListIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#ReverseListIterator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseListIterator.<init>(List)"})
  public void testNewReverseListIterator_whenArrayList() {
    // Arrange and Act
    ReverseListIterator<Object> actualReverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Assert
    assertFalse(actualReverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#add(Object)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseListIterator.add(Object)"})
  public void testAdd_thenThrowIllegalStateException() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.add("Obj"));
  }

  /**
   * Test {@link ReverseListIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReverseListIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(list);

    // Act and Assert
    assertTrue(reverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReverseListIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(reverseListIterator.hasNext());
  }

  /**
   * Test {@link ReverseListIterator#hasPrevious()}.
   * <ul>
   *   <li>Given {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link ArrayList#ArrayList()} add {@code Obj}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReverseListIterator.hasPrevious()"})
  public void testHasPrevious_givenReverseListIteratorWithListIsArrayListAddObj_thenReturnTrue() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertTrue(reverseListIterator.hasPrevious());
  }

  /**
   * Test {@link ReverseListIterator#hasPrevious()}.
   * <ul>
   *   <li>Given {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReverseListIterator.hasPrevious()"})
  public void testHasPrevious_givenReverseListIteratorWithListIsArrayList_thenReturnFalse() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertFalse(reverseListIterator.hasPrevious());
  }

  /**
   * Test {@link ReverseListIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ReverseListIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
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
   * <p>
   * Method under test: {@link ReverseListIterator#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ReverseListIterator.nextIndex()"})
  public void testNextIndex() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(-1, reverseListIterator.nextIndex());
  }

  /**
   * Test {@link ReverseListIterator#previous()}.
   * <ul>
   *   <li>Then {@link ReverseListIterator#ReverseListIterator(List)} with list is {@link ArrayList#ArrayList()} next is {@code Obj}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ReverseListIterator.previous()"})
  public void testPrevious_thenReverseListIteratorWithListIsArrayListNextIsObj() {
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
   * <p>
   * Method under test: {@link ReverseListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ReverseListIterator.previousIndex()"})
  public void testPreviousIndex() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());

    // Act and Assert
    assertEquals(0, reverseListIterator.previousIndex());
  }

  /**
   * Test {@link ReverseListIterator#remove()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseListIterator.remove()"})
  public void testRemove_thenThrowIllegalStateException() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.remove());
  }

  /**
   * Test {@link ReverseListIterator#set(Object)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseListIterator.set(Object)"})
  public void testSet_thenThrowIllegalStateException() {
    // Arrange
    ReverseListIterator<Object> reverseListIterator = new ReverseListIterator<>(new ArrayList<>());
    reverseListIterator.add("Obj");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> reverseListIterator.set("Obj"));
  }
}
