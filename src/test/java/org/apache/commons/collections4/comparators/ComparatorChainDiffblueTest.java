package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class ComparatorChainDiffblueTest {
  /**
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  public void testCompare() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> comparatorChain.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  public void testCompare2() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(new ComparatorChain<>(), true);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> comparatorChain.compare("O1", "O2"));
  }

  /**
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  public void testCompare3() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(new NullComparator<>(), true);

    // Act and Assert
    assertEquals(1, comparatorChain.compare("O1", "O2"));
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  public void testCompare4() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(new NullComparator<>(), false);

    // Act and Assert
    assertEquals(-1, comparatorChain.compare("O1", "O2"));
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  public void testCompare5() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(new NullComparator<>(), true);

    // Act and Assert
    assertEquals(-1, comparatorChain.compare("org.apache.commons.collections4.comparators.ComparatorChain", "O2"));
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Method under test: {@link ComparatorChain#compare(Object, Object)}
   */
  @Test
  public void testCompare6() throws UnsupportedOperationException {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>(new NullComparator<>(), true);

    // Act and Assert
    assertEquals(0, comparatorChain.compare("org.apache.commons.collections4.comparators.ComparatorChain",
        "org.apache.commons.collections4.comparators.ComparatorChain"));
    assertTrue(comparatorChain.isLocked());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#equals(Object)}
   *   <li>{@link ComparatorChain#hashCode()}
   * </ul>
   */
  @Test
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
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#equals(Object)}
   *   <li>{@link ComparatorChain#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertEquals(comparatorChain, comparatorChain);
    int expectedHashCodeResult = comparatorChain.hashCode();
    assertEquals(expectedHashCodeResult, comparatorChain.hashCode());
  }

  /**
   * Method under test: {@link ComparatorChain#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertEquals(0, comparatorChain.size());
  }

  /**
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, 1);
  }

  /**
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();
    comparatorChain.setReverseSort(1);

    // Act and Assert
    assertNotEquals(comparatorChain, new ComparatorChain<>());
  }

  /**
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();
    comparatorChain.addComparator(new ComparatorChain<>());

    // Act and Assert
    assertNotEquals(comparatorChain, new ComparatorChain<>());
  }

  /**
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, null);
  }

  /**
   * Method under test: {@link ComparatorChain#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ComparatorChain<Object> comparatorChain = new ComparatorChain<>();

    // Act and Assert
    assertNotEquals(comparatorChain, "Different type to ComparatorChain");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#ComparatorChain()}
   *   <li>{@link ComparatorChain#isLocked()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>();

    // Assert
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ComparatorChain#ComparatorChain(List, BitSet)}
   *   <li>{@link ComparatorChain#isLocked()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange
    ArrayList<Comparator<Object>> list = new ArrayList<>();

    // Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(list, new BitSet(1));

    // Assert
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  public void testNewComparatorChain() {
    // Arrange and Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(new ArrayList<>());

    // Assert
    assertEquals(0, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  public void testNewComparatorChain2() {
    // Arrange
    ArrayList<Comparator<Object>> list = new ArrayList<>();
    list.add(new ComparatorChain<>());

    // Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(list);

    // Assert
    assertEquals(1, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }

  /**
   * Method under test: {@link ComparatorChain#ComparatorChain(List)}
   */
  @Test
  public void testNewComparatorChain3() {
    // Arrange
    ArrayList<Comparator<Object>> list = new ArrayList<>();
    list.add(new ComparatorChain<>());
    list.add(new ComparatorChain<>());

    // Act
    ComparatorChain<Object> actualComparatorChain = new ComparatorChain<>(list);

    // Assert
    assertEquals(2, actualComparatorChain.size());
    assertFalse(actualComparatorChain.isLocked());
  }
}
