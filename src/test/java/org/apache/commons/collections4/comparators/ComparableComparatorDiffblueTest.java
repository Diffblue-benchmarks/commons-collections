package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ComparableComparatorDiffblueTest {
  /**
   * Test {@link ComparableComparator#equals(Object)}, and {@link ComparableComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ComparableComparator.equals(Object)",
    "int ComparableComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult =
        ComparableComparator.comparableComparator();
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult2 =
        ComparableComparator.comparableComparator();

    // Act and Assert
    assertEquals(comparableComparatorResult, comparableComparatorResult2);
    assertEquals(comparableComparatorResult.hashCode(), comparableComparatorResult2.hashCode());
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}, and {@link ComparableComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ComparableComparator.equals(Object)",
    "int ComparableComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparator =
        new ComparableComparator<>();
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult =
        ComparableComparator.comparableComparator();

    // Act and Assert
    assertEquals(comparableComparator, comparableComparatorResult);
    assertEquals(comparableComparator.hashCode(), comparableComparatorResult.hashCode());
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}, and {@link ComparableComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ComparableComparator.equals(Object)",
    "int ComparableComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult =
        ComparableComparator.comparableComparator();

    // Act and Assert
    assertEquals(comparableComparatorResult, comparableComparatorResult);
    int expectedHashCodeResult = comparableComparatorResult.hashCode();
    assertEquals(expectedHashCodeResult, comparableComparatorResult.hashCode());
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ComparableComparator.equals(Object)",
    "int ComparableComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult =
        ComparableComparator.comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, 1);
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ComparableComparator.equals(Object)",
    "int ComparableComparator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult =
        ComparableComparator.comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, null);
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ComparableComparator.equals(Object)",
    "int ComparableComparator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult =
        ComparableComparator.comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, "Different type to ComparableComparator");
  }
}
