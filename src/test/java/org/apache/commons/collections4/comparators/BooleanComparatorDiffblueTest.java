package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BooleanComparatorDiffblueTest {
  /**
   * Test {@link BooleanComparator#booleanComparator(boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return not sortsTrueFirst.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#booleanComparator(boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BooleanComparator BooleanComparator.booleanComparator(boolean)"})
  public void testBooleanComparator_whenFalse_thenReturnNotSortsTrueFirst() {
    // Arrange, Act and Assert
    assertFalse(BooleanComparator.booleanComparator(false).sortsTrueFirst());
  }

  /**
   * Test {@link BooleanComparator#booleanComparator(boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return sortsTrueFirst.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#booleanComparator(boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BooleanComparator BooleanComparator.booleanComparator(boolean)"})
  public void testBooleanComparator_whenTrue_thenReturnSortsTrueFirst() {
    // Arrange, Act and Assert
    assertTrue(BooleanComparator.booleanComparator(true).sortsTrueFirst());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#BooleanComparator()}
   *   <li>{@link BooleanComparator#getFalseFirstComparator()}
   *   <li>{@link BooleanComparator#getTrueFirstComparator()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BooleanComparator.<init>()", "void BooleanComparator.<init>(boolean)",
      "BooleanComparator BooleanComparator.getFalseFirstComparator()",
      "BooleanComparator BooleanComparator.getTrueFirstComparator()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    BooleanComparator actualBooleanComparator = new BooleanComparator();
    BooleanComparator actualFalseFirstComparator = actualBooleanComparator.getFalseFirstComparator();
    actualBooleanComparator.getTrueFirstComparator();

    // Assert
    assertEquals(actualBooleanComparator, actualFalseFirstComparator);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code true}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#BooleanComparator(boolean)}
   *   <li>{@link BooleanComparator#getFalseFirstComparator()}
   *   <li>{@link BooleanComparator#getTrueFirstComparator()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BooleanComparator.<init>()", "void BooleanComparator.<init>(boolean)",
      "BooleanComparator BooleanComparator.getFalseFirstComparator()",
      "BooleanComparator BooleanComparator.getTrueFirstComparator()"})
  public void testGettersAndSetters_whenTrue() {
    // Arrange and Act
    BooleanComparator actualBooleanComparator = new BooleanComparator(true);
    actualBooleanComparator.getFalseFirstComparator();

    // Assert
    assertEquals(actualBooleanComparator, actualBooleanComparator.getTrueFirstComparator());
  }

  /**
   * Test {@link BooleanComparator#compare(Boolean, Boolean)} with {@code Boolean}, {@code Boolean}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int BooleanComparator.compare(Boolean, Boolean)"})
  public void testCompareWithBooleanBoolean_whenFalse_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, BooleanComparator.getFalseFirstComparator().compare(false, true));
  }

  /**
   * Test {@link BooleanComparator#compare(Boolean, Boolean)} with {@code Boolean}, {@code Boolean}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int BooleanComparator.compare(Boolean, Boolean)"})
  public void testCompareWithBooleanBoolean_whenFalse_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, BooleanComparator.getFalseFirstComparator().compare(true, false));
  }

  /**
   * Test {@link BooleanComparator#compare(Boolean, Boolean)} with {@code Boolean}, {@code Boolean}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int BooleanComparator.compare(Boolean, Boolean)"})
  public void testCompareWithBooleanBoolean_whenTrue_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, BooleanComparator.getFalseFirstComparator().compare(true, true));
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}, and {@link BooleanComparator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.equals(Object)", "int BooleanComparator.hashCode()"})
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
   * Test {@link BooleanComparator#equals(Object)}, and {@link BooleanComparator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.equals(Object)", "int BooleanComparator.hashCode()"})
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
   * Test {@link BooleanComparator#equals(Object)}, and {@link BooleanComparator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.equals(Object)", "int BooleanComparator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(falseFirstComparator, falseFirstComparator);
    int expectedHashCodeResult = falseFirstComparator.hashCode();
    assertEquals(expectedHashCodeResult, falseFirstComparator.hashCode());
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.equals(Object)", "int BooleanComparator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    BooleanComparator trueFirstComparator = BooleanComparator.getTrueFirstComparator();

    // Act and Assert
    assertNotEquals(trueFirstComparator, BooleanComparator.getFalseFirstComparator());
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.equals(Object)", "int BooleanComparator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanComparator.getFalseFirstComparator(), null);
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.equals(Object)", "int BooleanComparator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanComparator.getFalseFirstComparator(), "Different type to BooleanComparator");
  }

  /**
   * Test {@link BooleanComparator#sortsTrueFirst()}.
   * <ul>
   *   <li>Given FalseFirstComparator.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#sortsTrueFirst()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.sortsTrueFirst()"})
  public void testSortsTrueFirst_givenFalseFirstComparator_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BooleanComparator.getFalseFirstComparator().sortsTrueFirst());
  }

  /**
   * Test {@link BooleanComparator#sortsTrueFirst()}.
   * <ul>
   *   <li>Given TrueFirstComparator.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BooleanComparator#sortsTrueFirst()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BooleanComparator.sortsTrueFirst()"})
  public void testSortsTrueFirst_givenTrueFirstComparator_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BooleanComparator.getTrueFirstComparator().sortsTrueFirst());
  }
}
