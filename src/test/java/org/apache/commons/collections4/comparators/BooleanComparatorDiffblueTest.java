package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BooleanComparatorDiffblueTest {
  /**
   * Method under test: {@link BooleanComparator#booleanComparator(boolean)}
   */
  @Test
  public void testBooleanComparator() {
    // Arrange, Act and Assert
    assertTrue(BooleanComparator.booleanComparator(true).sortsTrueFirst());
    assertFalse(BooleanComparator.booleanComparator(false).sortsTrueFirst());
  }

  /**
   * Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  public void testCompare() {
    // Arrange, Act and Assert
    assertEquals(0, BooleanComparator.getFalseFirstComparator().compare(true, true));
    assertEquals(-1, BooleanComparator.getFalseFirstComparator().compare(false, true));
    assertEquals(1, BooleanComparator.getFalseFirstComparator().compare(true, false));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();
    BooleanComparator falseFirstComparator2 = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(falseFirstComparator, falseFirstComparator2);
    int expectedHashCodeResult = falseFirstComparator.hashCode();
    assertEquals(expectedHashCodeResult, falseFirstComparator2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    BooleanComparator booleanComparator = new BooleanComparator();
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(booleanComparator, falseFirstComparator);
    int expectedHashCodeResult = booleanComparator.hashCode();
    assertEquals(expectedHashCodeResult, falseFirstComparator.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(falseFirstComparator, falseFirstComparator);
    int expectedHashCodeResult = falseFirstComparator.hashCode();
    assertEquals(expectedHashCodeResult, falseFirstComparator.hashCode());
  }

  /**
   * Method under test: {@link BooleanComparator#sortsTrueFirst()}
   */
  @Test
  public void testSortsTrueFirst() {
    // Arrange, Act and Assert
    assertFalse(BooleanComparator.getFalseFirstComparator().sortsTrueFirst());
    assertTrue(BooleanComparator.getTrueFirstComparator().sortsTrueFirst());
  }

  /**
   * Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    BooleanComparator trueFirstComparator = BooleanComparator.getTrueFirstComparator();

    // Act and Assert
    assertNotEquals(trueFirstComparator, BooleanComparator.getFalseFirstComparator());
  }

  /**
   * Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanComparator.getFalseFirstComparator(), null);
  }

  /**
   * Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanComparator.getFalseFirstComparator(), "Different type to BooleanComparator");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#BooleanComparator()}
   *   <li>{@link BooleanComparator#getFalseFirstComparator()}
   *   <li>{@link BooleanComparator#getTrueFirstComparator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    BooleanComparator actualBooleanComparator = new BooleanComparator();
    BooleanComparator actualFalseFirstComparator = actualBooleanComparator.getFalseFirstComparator();
    actualBooleanComparator.getTrueFirstComparator();

    // Assert
    assertEquals(actualBooleanComparator, actualFalseFirstComparator);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#BooleanComparator(boolean)}
   *   <li>{@link BooleanComparator#getFalseFirstComparator()}
   *   <li>{@link BooleanComparator#getTrueFirstComparator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange and Act
    BooleanComparator actualBooleanComparator = new BooleanComparator(true);
    actualBooleanComparator.getFalseFirstComparator();

    // Assert
    assertEquals(actualBooleanComparator, actualBooleanComparator.getTrueFirstComparator());
  }
}
