package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ComparatorChainDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#ComparatorChain()}
   *   <li>{@link ComparatorChain#isLocked()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ComparatorChain.<init>()", "void ComparatorChain.<init>(List, BitSet)",
      "boolean ComparatorChain.isLocked()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>();

    // Assert
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#ComparatorChain(List, BitSet)}
   *   <li>{@link ComparatorChain#isLocked()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ComparatorChain.<init>()", "void ComparatorChain.<init>(List, BitSet)",
      "boolean ComparatorChain.isLocked()"})
  public void testGettersAndSetters_whenArrayList() {
    // Arrange
    ArrayList<Comparator<Object>> list = new ArrayList<>();

    // Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(list, new BitSet(1));

    // Assert
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  public void testCompare_givenComparatorChain_thenThrowUnsupportedOperationException()
      throws UnsupportedOperationException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  public void testCompare_givenComparatorCompareReturnMinusOne_thenReturnOne() throws UnsupportedOperationException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  public void testCompare_givenComparatorCompareReturnOne_thenReturnMinusOne() throws UnsupportedOperationException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  public void testCompare_givenComparatorCompareReturnZero_thenReturnZero() throws UnsupportedOperationException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  public void testCompare_givenComparatorCompareThrowUnsupportedOperationExceptionWithFoo()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.compare(Object, Object)"})
  public void testCompare_thenComparatorChainWithComparatorAndReverseIsFalseLocked()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorChain.equals(Object)", "int ComparatorChain.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ComparatorChain.size()"})
  public void testSize() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertEquals(0, comparatorChain.size());
  }
}
