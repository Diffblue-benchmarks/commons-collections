package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class ComparableComparatorDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult2 = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertEquals(comparableComparatorResult, comparableComparatorResult2);
    int expectedHashCodeResult = comparableComparatorResult.hashCode();
    assertEquals(expectedHashCodeResult, comparableComparatorResult2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparator = new ComparableComparator<>();
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertEquals(comparableComparator, comparableComparatorResult);
    int expectedHashCodeResult = comparableComparator.hashCode();
    assertEquals(expectedHashCodeResult, comparableComparatorResult.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertEquals(comparableComparatorResult, comparableComparatorResult);
    int expectedHashCodeResult = comparableComparatorResult.hashCode();
    assertEquals(expectedHashCodeResult, comparableComparatorResult.hashCode());
  }

  /**
   * Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, 1);
  }

  /**
   * Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, null);
  }

  /**
   * Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, "Different type to ComparableComparator");
  }
}
