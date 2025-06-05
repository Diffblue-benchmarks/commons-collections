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
   * Test {@link ComparatorChain#ComparatorChain(List)}.
   * <ul>
   *   <li>Given {@link Comparator}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(List); given Comparator; then return size is one")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link Comparator}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(List); given Comparator; then return size is two")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  @DisplayName("Test new ComparatorChain(List); when ArrayList(); then return size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ComparatorChain.<init>(List)"})
  void testNewComparatorChain_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(new ArrayList<>());

    // Assert
    assertEquals(0, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   * <ul>
   *   <li>Given {@link ComparatorChain#ComparatorChain()}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); given ComparatorChain(); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorChain_thenThrowUnsupportedOperationException() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> comparatorChain.compare("O1", "O2"));
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return minus one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); given Comparator compare(Object, Object) return minus one; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareReturnMinusOne_thenReturnOne() throws UnsupportedOperationException {
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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); given Comparator compare(Object, Object) return one; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareReturnOne_thenReturnMinusOne() throws UnsupportedOperationException {
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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return zero.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); given Comparator compare(Object, Object) return zero; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareReturnZero_thenReturnZero() throws UnsupportedOperationException {
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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} throw {@link UnsupportedOperationException#UnsupportedOperationException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); given Comparator compare(Object, Object) throw UnsupportedOperationException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_givenComparatorCompareThrowUnsupportedOperationExceptionWithFoo()
      throws UnsupportedOperationException {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException("foo"));
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(comparator, true);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> comparatorChain.compare("O1", "O2"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ComparatorChain#compare(Object, Object)}.
   * <ul>
   *   <li>Then {@link ComparatorChain#ComparatorChain(Comparator, boolean)} with {@link Comparator} and reverse is {@code false} Locked.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); then ComparatorChain(Comparator, boolean) with Comparator and reverse is 'false' Locked")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  void testCompare_thenComparatorChainWithComparatorAndReverseIsFalseLocked() throws UnsupportedOperationException {
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
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#equals(Object)}
   *   <li>{@link ComparatorChain#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();
    ComparatorChain<Object> comparatorChain2 = new ComparatorChain<>();

    // Act and Assert
    assertEquals(comparatorChain, comparatorChain2);
    int expectedHashCodeResult = comparatorChain.hashCode();
    assertEquals(expectedHashCodeResult, comparatorChain2.hashCode());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}, and {@link ComparatorChain#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#equals(Object)}
   *   <li>{@link ComparatorChain#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(mock(Comparator.class), true);

    // Act and Assert
    assertNotEquals(comparatorChain, new ComparatorChain<>());
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, null);
  }

  /**
   * Test {@link ComparatorChain#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, "Different type to ComparatorChain");
  }

  /**
   * Test {@link ComparatorChain#size()}.
   * <p>
   * Method under test: {@link ComparatorChain#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ComparatorChain.size()"})
  void testSize() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertEquals(0, comparatorChain.size());
  }
}
