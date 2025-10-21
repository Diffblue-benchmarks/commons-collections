package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ComparableComparatorDiffblueTest {
  /**
   * Test {@link ComparableComparator#equals(Object)}, and {@link ComparableComparator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparableComparator.equals(Object)", "int ComparableComparator.hashCode()"})
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
   * Test {@link ComparableComparator#equals(Object)}, and {@link ComparableComparator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparableComparator.equals(Object)", "int ComparableComparator.hashCode()"})
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
   * Test {@link ComparableComparator#equals(Object)}, and {@link ComparableComparator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparableComparator#equals(Object)}
   *   <li>{@link ComparableComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparableComparator.equals(Object)", "int ComparableComparator.hashCode()"})
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
   * Test {@link ComparableComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparableComparator.equals(Object)", "int ComparableComparator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, 1);
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparableComparator.equals(Object)", "int ComparableComparator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, null);
  }

  /**
   * Test {@link ComparableComparator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparableComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparableComparator.equals(Object)", "int ComparableComparator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ComparableComparator<Comparable<? super Comparable>> comparableComparatorResult = ComparableComparator
        .comparableComparator();

    // Act and Assert
    assertNotEquals(comparableComparatorResult, "Different type to ComparableComparator");
  }
}
