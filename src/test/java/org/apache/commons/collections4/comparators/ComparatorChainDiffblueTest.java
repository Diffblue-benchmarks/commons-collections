package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ComparatorChainDiffblueTest {
  /**
   * Test {@link ComparatorChain#ComparatorChain(Comparator)}.
   *
   * <p>Method under test: {@link ComparatorChain#ComparatorChain(Comparator)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(Comparator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.<init>(Comparator)"})
  void testNewComparatorChain() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(mock(Comparator.class));

    // Assert
    assertEquals(1, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#ComparatorChain(List)}.
   *
   * <ul>
   *   <li>Given {@link Comparator}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(List); given Comparator; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.<init>(List)"})
  void testNewComparatorChain_givenComparator_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Comparator<Object>> list = new ArrayList<>();
    list.add(mock(Comparator.class));

    // Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(list);

    // Assert
    assertEquals(1, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#ComparatorChain(List)}.
   *
   * <ul>
   *   <li>Given {@link Comparator}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(List); given Comparator; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.<init>(List)"})
  void testNewComparatorChain_givenComparator_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Comparator<Object>> list = new ArrayList<>();
    list.add(mock(Comparator.class));
    list.add(mock(Comparator.class));

    // Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(list);

    // Assert
    assertEquals(2, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#ComparatorChain(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(List); when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.<init>(List)"})
  void testNewComparatorChain_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(new ArrayList<>());

    // Assert
    assertEquals(0, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#ComparatorChain(Comparator, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#ComparatorChain(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(Comparator, boolean); when 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.<init>(Comparator, boolean)"})
  void testNewComparatorChain_whenFalse() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain =
        new ComparatorChain<>(mock(Comparator.class), false);

    // Assert
    assertEquals(1, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#ComparatorChain(Comparator, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#ComparatorChain(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(Comparator, boolean); when 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.<init>(Comparator, boolean)"})
  void testNewComparatorChain_whenTrue() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain =
        new ComparatorChain<>(mock(Comparator.class), true);

    // Assert
    assertEquals(1, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#addComparator(Comparator)} with {@code comparator}.
   *
   * <p>Method under test: {@link ComparatorChain#addComparator(Comparator)}
   */
  @Test
  @DisplayName("Test addComparator(Comparator) with 'comparator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.addComparator(Comparator)"})
  void testAddComparatorWithComparator() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act
    comparatorChain.addComparator(mock(Comparator.class));

    // Assert
    assertEquals(1, comparatorChain.size());
  }

  /**
   * Test {@link ComparatorChain#addComparator(Comparator, boolean)} with {@code comparator}, {@code
   * reverse}.
   *
   * <ul>
   *   <li>When {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#addComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test addComparator(Comparator, boolean) with 'comparator', 'reverse'; when 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.addComparator(Comparator, boolean)"})
  void testAddComparatorWithComparatorReverse_whenFalse() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act
    comparatorChain.addComparator(mock(Comparator.class), false);

    // Assert
    assertEquals(1, comparatorChain.size());
  }

  /**
   * Test {@link ComparatorChain#addComparator(Comparator, boolean)} with {@code comparator}, {@code
   * reverse}.
   *
   * <ul>
   *   <li>When {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#addComparator(Comparator, boolean)}
   */
  @Test
  @DisplayName("Test addComparator(Comparator, boolean) with 'comparator', 'reverse'; when 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComparatorChain.addComparator(Comparator, boolean)"})
  void testAddComparatorWithComparatorReverse_whenTrue() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act
    comparatorChain.addComparator(mock(Comparator.class), true);

    // Assert
    assertEquals(1, comparatorChain.size());
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link ComparatorChain#ComparatorChain()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); given ComparatorChain(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorChain_thenThrowUnsupportedOperationException()
      throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> comparatorChain.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return minus one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); given Comparator compare(Object, Object) return minus one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareReturnMinusOne_thenReturnOne()
      throws UnsupportedOperationException {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(-1);
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(comparator, true);

    // Act
    int actualCompareResult = comparatorChain.compare("O1", "O2");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCompareResult);
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); given Comparator compare(Object, Object) return one; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareReturnOne_thenReturnMinusOne()
      throws UnsupportedOperationException {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(comparator, true);

    // Act
    int actualCompareResult = comparatorChain.compare("O1", "O2");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(-1, actualCompareResult);
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); given Comparator compare(Object, Object) return zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareReturnZero_thenReturnZero()
      throws UnsupportedOperationException {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(comparator, true);

    // Act
    int actualCompareResult = comparatorChain.compare("O1", "O2");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(0, actualCompareResult);
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} throw {@link
   *       UnsupportedOperationException#UnsupportedOperationException()}.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); given Comparator compare(Object, Object) throw UnsupportedOperationException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareThrowUnsupportedOperationException()
      throws UnsupportedOperationException {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(comparator, true);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> comparatorChain.compare("O1", "O2"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   *
   * <ul>
   *   <li>Then {@link ComparatorChain#ComparatorChain(Comparator, boolean)} with {@link Comparator}
   *       and reverse is {@code false} Locked.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test compare(Object, Object); then ComparatorChain(Comparator, boolean) with Comparator and reverse is 'false' Locked")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_thenComparatorChainWithComparatorAndReverseIsFalseLocked()
      throws UnsupportedOperationException {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(comparator, false);

    // Act
    int actualCompareResult = comparatorChain.compare("O1", "O2");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCompareResult);
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}, and {@link ComparatorChain#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComparatorChain#equals(Object)}
   *   <li>{@link ComparatorChain#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();
    ComparatorChain<Object> comparatorChain2 = new ComparatorChain<>();

    // Act and Assert
    assertEquals(comparatorChain, comparatorChain2);
    assertEquals(comparatorChain.hashCode(), comparatorChain2.hashCode());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}, and {@link ComparatorChain#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComparatorChain#equals(Object)}
   *   <li>{@link ComparatorChain#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertEquals(comparatorChain, comparatorChain);
    int expectedHashCodeResult = comparatorChain.hashCode();
    assertEquals(expectedHashCodeResult, comparatorChain.hashCode());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(mock(Comparator.class), true);

    // Act and Assert
    assertNotEquals(comparatorChain, new ComparatorChain<>());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();
    comparatorChain.addComparator(mock(Comparator.class));

    // Act and Assert
    assertNotEquals(comparatorChain, new ComparatorChain<>());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(new ComparatorChain<>(), true);

    ComparatorChain<Object> comparatorChain2 = new ComparatorChain<>();
    comparatorChain2.addComparator(mock(Comparator.class), true);

    // Act and Assert
    assertNotEquals(comparatorChain, comparatorChain2);
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, null);
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, "Different type to ComparatorChain");
  }

  /**
   * Test {@link ComparatorChain#size()}.
   *
   * <p>Method under test: {@link ComparatorChain#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComparatorChain.size()"})
  void testSize() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertEquals(0, comparatorChain.size());
  }
}
