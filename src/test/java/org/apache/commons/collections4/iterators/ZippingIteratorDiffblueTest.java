package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ZippingIteratorDiffblueTest {
  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator, Iterator, Iterator)}.
   *
   * <p>Method under test: {@link ZippingIterator#ZippingIterator(Iterator, Iterator, Iterator)}
   */
  @Test
  @DisplayName("Test new ZippingIterator(Iterator, Iterator, Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator, Iterator, Iterator)"})
  void testNewZippingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> b = objectList2.iterator();

    ArrayList<Object> objectList3 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator =
        new ZippingIterator<>(a, b, objectList3.iterator());

    // Assert
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator[])}.
   *
   * <p>Method under test: {@link ZippingIterator#ZippingIterator(Iterator[])}
   */
  @Test
  @DisplayName("Test new ZippingIterator(Iterator[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator[])"})
  void testNewZippingIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator = new ZippingIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}
   */
  @Test
  @DisplayName(
      "Test new ZippingIterator(Iterator, Iterator); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator, Iterator)"})
  void testNewZippingIterator_given42_whenArrayListAdd42_thenReturnNextIs42()
      throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator =
        new ZippingIterator<>(a, objectList2.iterator());

    // Assert
    assertEquals("42", actualZippingIterator.next());
    assertFalse(a.hasNext());
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#ZippingIterator(Iterator, Iterator)}
   */
  @Test
  @DisplayName("Test new ZippingIterator(Iterator, Iterator); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ZippingIterator.<init>(Iterator, Iterator)"})
  void testNewZippingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIterator =
        new ZippingIterator<>(a, objectList2.iterator());

    // Assert
    assertFalse(a.hasNext());
    assertFalse(actualZippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ZippingIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertTrue(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ZippingIterator#ZippingIterator(Iterator, Iterator)} with a is {@link
   *       ArrayList#ArrayList()} iterator and b is {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given ZippingIterator(Iterator, Iterator) with a is ArrayList() iterator and b is ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ZippingIterator.hasNext()"})
  void testHasNext_givenZippingIteratorWithAIsArrayListIteratorAndBIsArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(a, objectList2.iterator());

    // Act and Assert
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ZippingIterator#ZippingIterator(Iterator[])} with iterators is {@link
   *       ArrayList#ArrayList()} iterator.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given ZippingIterator(Iterator[]) with iterators is ArrayList() iterator; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ZippingIterator.hasNext()"})
  void testHasNext_givenZippingIteratorWithIteratorsIsArrayListIterator_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertFalse(zippingIterator.hasNext());
  }

  /**
   * Test {@link ZippingIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ZippingIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() throws NoSuchElementException {
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
   *
   * <ul>
   *   <li>Given {@link ZippingIterator#ZippingIterator(Iterator, Iterator)} with a is {@link
   *       ArrayList#ArrayList()} iterator and b is {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given ZippingIterator(Iterator, Iterator) with a is ArrayList() iterator and b is ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ZippingIterator.next()"})
  void testNext_givenZippingIteratorWithAIsArrayListIteratorAndBIsArrayListIterator()
      throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(a, objectList2.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> zippingIterator.next());
  }

  /**
   * Test {@link ZippingIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ZippingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ZippingIterator.next()"})
  void testNext_thenThrowNoSuchElementException() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> zippingIterator.next());
  }

  /**
   * Test {@link ZippingIterator#remove()}.
   *
   * <p>Method under test: {@link ZippingIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ZippingIterator.remove()"})
  void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ZippingIterator<Object> zippingIterator = new ZippingIterator<>(objectList.iterator());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> zippingIterator.remove());
  }
}
