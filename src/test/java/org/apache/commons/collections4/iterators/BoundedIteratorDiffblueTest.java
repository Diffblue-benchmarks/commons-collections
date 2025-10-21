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

public class BoundedIteratorDiffblueTest {
  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  public void testNewBoundedIterator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  public void testNewBoundedIterator_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new BoundedIterator<>(objectList.iterator(), 0L, -1L));

  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  public void testNewBoundedIterator_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new BoundedIterator<>(objectList.iterator(), -1L, 0L));

  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  public void testNewBoundedIterator_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#BoundedIterator(Iterator, long, long)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#BoundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BoundedIterator.<init>(Iterator, long, long)"})
  public void testNewBoundedIterator_whenZero_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIterator = new BoundedIterator<>(iterator, 0L, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#hasNext()}.
   * <p>
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BoundedIterator.hasNext()"})
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 0L);

    // Act and Assert
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BoundedIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertTrue(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BoundedIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BoundedIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals("42", boundedIterator.next());
    assertFalse(boundedIterator.hasNext());
  }

  /**
   * Test {@link BoundedIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoundedIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BoundedIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 0L);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> boundedIterator.next());
  }

  /**
   * Test {@link BoundedIterator#remove()}.
   * <p>
   * Method under test: {@link BoundedIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BoundedIterator.remove()"})
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIterator = new BoundedIterator<>(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> boundedIterator.remove());
  }
}
