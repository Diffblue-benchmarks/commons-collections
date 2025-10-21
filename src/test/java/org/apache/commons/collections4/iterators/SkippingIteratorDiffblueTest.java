package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SkippingIteratorDiffblueTest {
  /**
   * Test {@link SkippingIterator#SkippingIterator(Iterator, long)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  public void testNewSkippingIterator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIterator = new SkippingIterator<>(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIterator.hasNext());
  }

  /**
   * Test {@link SkippingIterator#SkippingIterator(Iterator, long)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  public void testNewSkippingIterator_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new SkippingIterator<>(objectList.iterator(), -1L));

  }

  /**
   * Test {@link SkippingIterator#SkippingIterator(Iterator, long)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  public void testNewSkippingIterator_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIterator = new SkippingIterator<>(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIterator.hasNext());
  }

  /**
   * Test {@link SkippingIterator#SkippingIterator(Iterator, long)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  public void testNewSkippingIterator_whenZero_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIterator = new SkippingIterator<>(iterator, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIterator.hasNext());
  }

  /**
   * Test {@link SkippingIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SkippingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SkippingIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertEquals("42", skippingIterator.next());
  }

  /**
   * Test {@link SkippingIterator#remove()}.
   * <p>
   * Method under test: {@link SkippingIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SkippingIterator.remove()"})
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> skippingIterator.remove());
  }
}
