package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ObjectArrayListIteratorDiffblueTest {
  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[])"})
  public void testNewObjectArrayListIterator() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}.
   * <ul>
   *   <li>Then return next is {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int, int)"})
  public void testNewObjectArrayListIterator_thenReturnNextIsArray() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>(
        new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertEquals("Array", actualObjectArrayListIterator.next());
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}.
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[], int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ObjectArrayListIterator.<init>(Object[], int)"})
  public void testNewObjectArrayListIterator_whenArrayOfObjectWithArray_thenReturnNotHasNext() {
    // Arrange and Act
    ObjectArrayListIterator<Object> actualObjectArrayListIterator = new ObjectArrayListIterator<>(new Object[]{"Array"},
        1);

    // Assert
    assertFalse(actualObjectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#add(Object)}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ObjectArrayListIterator.add(Object)"})
  public void testAdd() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectArrayListIterator.add("Obj"));
  }

  /**
   * Test {@link ObjectArrayListIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ObjectArrayListIterator.hasPrevious()"})
  public void testHasPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertFalse(objectArrayListIterator.hasPrevious());
  }

  /**
   * Test {@link ObjectArrayListIterator#next()}.
   * <ul>
   *   <li>Given {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])} with {@code Array}.</li>
   *   <li>Then return {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ObjectArrayListIterator.next()"})
  public void testNext_givenObjectArrayListIteratorWithArray_thenReturnArray() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals("Array", objectArrayListIterator.next());
    assertFalse(objectArrayListIterator.hasNext());
  }

  /**
   * Test {@link ObjectArrayListIterator#next()}.
   * <ul>
   *   <li>Given {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ObjectArrayListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ObjectArrayListIterator.next()"})
  public void testNext_givenObjectArrayListIterator_thenThrowNoSuchElementException() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.next());
  }

  /**
   * Test {@link ObjectArrayListIterator#nextIndex()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ObjectArrayListIterator.nextIndex()"})
  public void testNextIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(0, objectArrayListIterator.nextIndex());
  }

  /**
   * Test {@link ObjectArrayListIterator#previous()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ObjectArrayListIterator.previous()"})
  public void testPrevious() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectArrayListIterator.previous());
  }

  /**
   * Test {@link ObjectArrayListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ObjectArrayListIterator.previousIndex()"})
  public void testPreviousIndex() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertEquals(-1, objectArrayListIterator.previousIndex());
  }

  /**
   * Test {@link ObjectArrayListIterator#set(Object)}.
   * <p>
   * Method under test: {@link ObjectArrayListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ObjectArrayListIterator.set(Object)"})
  public void testSet() {
    // Arrange
    ObjectArrayListIterator<Object> objectArrayListIterator = new ObjectArrayListIterator<>("Array");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectArrayListIterator.set("Obj"));
  }
}
