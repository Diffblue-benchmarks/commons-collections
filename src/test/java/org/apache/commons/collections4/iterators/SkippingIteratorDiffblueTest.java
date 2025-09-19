package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SkippingIteratorDiffblueTest {
  /**
   * Test {@link SkippingIterator#SkippingIterator(Iterator, long)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName("Test new SkippingIterator(Iterator, long); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  void testNewSkippingIterator_given42_whenArrayListAdd42() {
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
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test new SkippingIterator(Iterator, long); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  void testNewSkippingIterator_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new SkippingIterator<>(objectList.iterator(), -1L));
  }

  /**
   * Test {@link SkippingIterator#SkippingIterator(Iterator, long)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test new SkippingIterator(Iterator, long); when one; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  void testNewSkippingIterator_whenOne_thenNotArrayListIteratorHasNext() {
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
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link SkippingIterator#SkippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test new SkippingIterator(Iterator, long); when zero; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SkippingIterator.<init>(Iterator, long)"})
  void testNewSkippingIterator_whenZero_thenNotArrayListIteratorHasNext() {
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
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SkippingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SkippingIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
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
   *
   * <p>Method under test: {@link SkippingIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SkippingIterator.remove()"})
  void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> skippingIterator.remove());
  }
}
