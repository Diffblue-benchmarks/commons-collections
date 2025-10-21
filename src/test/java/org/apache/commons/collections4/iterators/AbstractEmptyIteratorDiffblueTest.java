package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractEmptyIteratorDiffblueTest {
  /**
   * Test {@link AbstractEmptyIterator#add(Object)}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractEmptyIterator.add(Object)"})
  public void testAdd() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> emptyIterator.add("Ignored"));
  }

  /**
   * Test {@link AbstractEmptyIterator#hasNext()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEmptyIterator.hasNext()"})
  public void testHasNext() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertFalse(emptyIterator.hasNext());
  }

  /**
   * Test {@link AbstractEmptyIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEmptyIterator.hasPrevious()"})
  public void testHasPrevious() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertFalse(emptyIterator.hasPrevious());
  }

  /**
   * Test {@link AbstractEmptyIterator#next()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractEmptyIterator.next()"})
  public void testNext() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> emptyIterator.next());
  }

  /**
   * Test {@link AbstractEmptyIterator#nextIndex()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractEmptyIterator.nextIndex()"})
  public void testNextIndex() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertEquals(0, emptyIterator.nextIndex());
  }

  /**
   * Test {@link AbstractEmptyIterator#previous()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractEmptyIterator.previous()"})
  public void testPrevious() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> emptyIterator.previous());
  }

  /**
   * Test {@link AbstractEmptyIterator#previousIndex()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractEmptyIterator.previousIndex()"})
  public void testPreviousIndex() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertEquals(-1, emptyIterator.previousIndex());
  }

  /**
   * Test {@link AbstractEmptyIterator#remove()}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractEmptyIterator.remove()"})
  public void testRemove() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyIterator.remove());
  }

  /**
   * Test {@link AbstractEmptyIterator#set(Object)}.
   * <p>
   * Method under test: {@link AbstractEmptyIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractEmptyIterator.set(Object)"})
  public void testSet() {
    // Arrange
    EmptyIterator<Object> emptyIterator = new EmptyIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyIterator.set("Ignored"));
  }
}
