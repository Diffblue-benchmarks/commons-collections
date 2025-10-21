package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ListIteratorWrapperDiffblueTest {
  /**
   * Test {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)}.
   * <p>
   * Method under test: {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListIteratorWrapper.<init>(Iterator)"})
  public void testNewListIteratorWrapper() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasNext()"})
  public void testHasNext_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListIteratorWrapper.hasPrevious()"})
  public void testHasPrevious() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListIteratorWrapper.nextIndex()"})
  public void testNextIndex() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListIteratorWrapper.previous()"})
  public void testPrevious() throws NoSuchElementException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListIteratorWrapper.previousIndex()"})
  public void testPreviousIndex() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListIteratorWrapper.remove()"})
  public void testRemove() throws IllegalStateException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ListIteratorWrapper<Object> listIteratorWrapper = new ListIteratorWrapper<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
  }
}
