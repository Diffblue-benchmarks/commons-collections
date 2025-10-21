package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SingletonListIteratorDiffblueTest {
  /**
   * Test {@link SingletonListIterator#SingletonListIterator(Object)}.
   * <p>
   * Method under test: {@link SingletonListIterator#SingletonListIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonListIterator.<init>(Object)"})
  public void testNewSingletonListIterator() {
    // Arrange and Act
    SingletonListIterator<Object> actualSingletonListIterator = new SingletonListIterator<>("Object");

    // Assert
    assertEquals("Object", actualSingletonListIterator.next());
    assertFalse(actualSingletonListIterator.hasNext());
  }

  /**
   * Test {@link SingletonListIterator#add(Object)}.
   * <p>
   * Method under test: {@link SingletonListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonListIterator.add(Object)"})
  public void testAdd() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonListIterator.add("Obj"));
  }

  /**
   * Test {@link SingletonListIterator#hasNext()}.
   * <p>
   * Method under test: {@link SingletonListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonListIterator.hasNext()"})
  public void testHasNext() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertTrue(singletonListIterator.hasNext());
  }

  /**
   * Test {@link SingletonListIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link SingletonListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonListIterator.hasPrevious()"})
  public void testHasPrevious() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertFalse(singletonListIterator.hasPrevious());
  }

  /**
   * Test {@link SingletonListIterator#next()}.
   * <p>
   * Method under test: {@link SingletonListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonListIterator.next()"})
  public void testNext() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals("Object", singletonListIterator.next());
    assertFalse(singletonListIterator.hasNext());
  }

  /**
   * Test {@link SingletonListIterator#nextIndex()}.
   * <p>
   * Method under test: {@link SingletonListIterator#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SingletonListIterator.nextIndex()"})
  public void testNextIndex() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals(0, singletonListIterator.nextIndex());
  }

  /**
   * Test {@link SingletonListIterator#previous()}.
   * <p>
   * Method under test: {@link SingletonListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonListIterator.previous()"})
  public void testPrevious() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> singletonListIterator.previous());
  }

  /**
   * Test {@link SingletonListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link SingletonListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SingletonListIterator.previousIndex()"})
  public void testPreviousIndex() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertEquals(-1, singletonListIterator.previousIndex());
  }

  /**
   * Test {@link SingletonListIterator#remove()}.
   * <p>
   * Method under test: {@link SingletonListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonListIterator.remove()"})
  public void testRemove() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonListIterator.remove());
  }

  /**
   * Test {@link SingletonListIterator#set(Object)}.
   * <p>
   * Method under test: {@link SingletonListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonListIterator.set(Object)"})
  public void testSet() {
    // Arrange
    SingletonListIterator<Object> singletonListIterator = new SingletonListIterator<>("Object");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonListIterator.set("Object"));
  }
}
