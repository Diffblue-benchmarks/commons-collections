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

public class ZippingIteratorDiffblueTest {
  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator, Iterator, Iterator)}.
   * <p>
   * Method under test: {@link ZippingIterator#ZippingIterator(Iterator, Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator, Iterator, Iterator)"})
  public void testNewZippingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> b = objectList2.iterator();

    ArrayList<Object> objectList3 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(a, b, objectList3.iterator());

    // Assert
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator[])}.
   * <p>
   * Method under test: {@link ZippingIterator#ZippingIterator(Iterator[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator[])"})
  public void testNewZippingIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator, Iterator)"})
  public void testNewZippingIterator_given42_whenArrayListAdd42_thenReturnNextIs42() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(a, objectList2.iterator());

    // Assert
    assertEquals("42", actualZippingIterator.next());
    assertFalse(a.hasNext());
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator, Iterator)"})
  public void testNewZippingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(a, objectList2.iterator());

    // Assert
    assertFalse(a.hasNext());
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#hasNext()}.
   * <p>
   * Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ZippingIterator.hasNext()"})
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(iteratorResult, objectList2.iterator());

    // Act and Assert
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ZippingIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertTrue(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ZippingIterator#ZippingIterator(Iterator[])} with iterators is {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ZippingIterator.hasNext()"})
  public void testHasNext_givenZippingIteratorWithIteratorsIsArrayListIterator_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#next()}.
   * <p>
   * Method under test: {@link ZippingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ZippingIterator.next()"})
  public void testNext() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(iteratorResult, objectList2.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> zippingIterator.next());
  }

  /**
   * Test {@link ZippingIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ZippingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ZippingIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", zippingIterator.next());
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ZippingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ZippingIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> zippingIterator.next());
  }

  /**
   * Test {@link ZippingIterator#remove()}.
   * <p>
   * Method under test: {@link ZippingIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ZippingIterator.remove()"})
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> zippingIterator.remove());
  }
}
