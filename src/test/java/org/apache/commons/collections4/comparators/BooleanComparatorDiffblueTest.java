package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BooleanComparatorDiffblueTest {
  /**
   * Test {@link BooleanComparator#booleanComparator(boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return not sortsTrueFirst.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#booleanComparator(boolean)}
   */
  @Test
  @DisplayName("Test booleanComparator(boolean); when 'false'; then return not sortsTrueFirst")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BooleanComparator BooleanComparator.booleanComparator(boolean)"})
  void testBooleanComparator_whenFalse_thenReturnNotSortsTrueFirst() {
    // Arrange and Act
    BooleanComparator actualBooleanComparatorResult = BooleanComparator.booleanComparator(false);

    // Assert
    assertFalse(actualBooleanComparatorResult.sortsTrueFirst());
  }

  /**
   * Test {@link BooleanComparator#booleanComparator(boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return sortsTrueFirst.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#booleanComparator(boolean)}
   */
  @Test
  @DisplayName("Test booleanComparator(boolean); when 'true'; then return sortsTrueFirst")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BooleanComparator BooleanComparator.booleanComparator(boolean)"})
  void testBooleanComparator_whenTrue_thenReturnSortsTrueFirst() {
    // Arrange and Act
    BooleanComparator actualBooleanComparatorResult = BooleanComparator.booleanComparator(true);

    // Assert
    assertTrue(actualBooleanComparatorResult.sortsTrueFirst());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanComparator#BooleanComparator()}
   *   <li>{@link BooleanComparator#getFalseFirstComparator()}
   *   <li>{@link BooleanComparator#getTrueFirstComparator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BooleanComparator.<init>()",
    "void BooleanComparator.<init>(boolean)",
    "BooleanComparator BooleanComparator.getFalseFirstComparator()",
    "BooleanComparator BooleanComparator.getTrueFirstComparator()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    BooleanComparator actualBooleanComparator = new BooleanComparator();
    BooleanComparator actualFalseFirstComparator =
        actualBooleanComparator.getFalseFirstComparator();
    actualBooleanComparator.getTrueFirstComparator();

    // Assert
    assertEquals(actualBooleanComparator, actualFalseFirstComparator);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code true}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanComparator#BooleanComparator(boolean)}
   *   <li>{@link BooleanComparator#getFalseFirstComparator()}
   *   <li>{@link BooleanComparator#getTrueFirstComparator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BooleanComparator.<init>()",
    "void BooleanComparator.<init>(boolean)",
    "BooleanComparator BooleanComparator.getFalseFirstComparator()",
    "BooleanComparator BooleanComparator.getTrueFirstComparator()"
  })
  void testGettersAndSetters_whenTrue() {
    // Arrange and Act
    BooleanComparator actualBooleanComparator = new BooleanComparator(true);
    actualBooleanComparator.getFalseFirstComparator();
    BooleanComparator actualTrueFirstComparator = actualBooleanComparator.getTrueFirstComparator();

    // Assert
    assertEquals(actualBooleanComparator, actualTrueFirstComparator);
  }

  /**
   * Test {@link BooleanComparator#compare(Boolean, Boolean)} with {@code Boolean}, {@code Boolean}.
   *
   * <ul>
   *   <li>Given FalseFirstComparator.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  @DisplayName(
      "Test compare(Boolean, Boolean) with 'Boolean', 'Boolean'; given FalseFirstComparator; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BooleanComparator.compare(Boolean, Boolean)"})
  void testCompareWithBooleanBoolean_givenFalseFirstComparator_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, BooleanComparator.getFalseFirstComparator().compare(false, true));
  }

  /**
   * Test {@link BooleanComparator#compare(Boolean, Boolean)} with {@code Boolean}, {@code Boolean}.
   *
   * <ul>
   *   <li>Given FalseFirstComparator.
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  @DisplayName(
      "Test compare(Boolean, Boolean) with 'Boolean', 'Boolean'; given FalseFirstComparator; when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BooleanComparator.compare(Boolean, Boolean)"})
  void testCompareWithBooleanBoolean_givenFalseFirstComparator_whenTrue_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, BooleanComparator.getFalseFirstComparator().compare(true, true));
  }

  /**
   * Test {@link BooleanComparator#compare(Boolean, Boolean)} with {@code Boolean}, {@code Boolean}.
   *
   * <ul>
   *   <li>Given TrueFirstComparator.
   *   <li>When {@code false}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#compare(Boolean, Boolean)}
   */
  @Test
  @DisplayName(
      "Test compare(Boolean, Boolean) with 'Boolean', 'Boolean'; given TrueFirstComparator; when 'false'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BooleanComparator.compare(Boolean, Boolean)"})
  void testCompareWithBooleanBoolean_givenTrueFirstComparator_whenFalse_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, BooleanComparator.getTrueFirstComparator().compare(false, true));
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}, and {@link BooleanComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BooleanComparator.equals(Object)",
    "int BooleanComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();
    BooleanComparator falseFirstComparator2 = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(falseFirstComparator, falseFirstComparator2);
    assertEquals(falseFirstComparator.hashCode(), falseFirstComparator2.hashCode());
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}, and {@link BooleanComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BooleanComparator.equals(Object)",
    "int BooleanComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    BooleanComparator booleanComparator = new BooleanComparator();
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(booleanComparator, falseFirstComparator);
    assertEquals(booleanComparator.hashCode(), falseFirstComparator.hashCode());
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}, and {@link BooleanComparator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanComparator#equals(Object)}
   *   <li>{@link BooleanComparator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BooleanComparator.equals(Object)",
    "int BooleanComparator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BooleanComparator falseFirstComparator = BooleanComparator.getFalseFirstComparator();

    // Act and Assert
    assertEquals(falseFirstComparator, falseFirstComparator);
    int expectedHashCodeResult = falseFirstComparator.hashCode();
    assertEquals(expectedHashCodeResult, falseFirstComparator.hashCode());
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BooleanComparator.equals(Object)",
    "int BooleanComparator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        BooleanComparator.getTrueFirstComparator(), BooleanComparator.getFalseFirstComparator());
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BooleanComparator.equals(Object)",
    "int BooleanComparator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanComparator.getFalseFirstComparator(), null);
  }

  /**
   * Test {@link BooleanComparator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BooleanComparator.equals(Object)",
    "int BooleanComparator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        BooleanComparator.getFalseFirstComparator(), "Different type to BooleanComparator");
  }

  /**
   * Test {@link BooleanComparator#sortsTrueFirst()}.
   *
   * <ul>
   *   <li>Given FalseFirstComparator.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#sortsTrueFirst()}
   */
  @Test
  @DisplayName("Test sortsTrueFirst(); given FalseFirstComparator; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BooleanComparator.sortsTrueFirst()"})
  void testSortsTrueFirst_givenFalseFirstComparator_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BooleanComparator.getFalseFirstComparator().sortsTrueFirst());
  }

  /**
   * Test {@link BooleanComparator#sortsTrueFirst()}.
   *
   * <ul>
   *   <li>Given TrueFirstComparator.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BooleanComparator#sortsTrueFirst()}
   */
  @Test
  @DisplayName("Test sortsTrueFirst(); given TrueFirstComparator; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BooleanComparator.sortsTrueFirst()"})
  void testSortsTrueFirst_givenTrueFirstComparator_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BooleanComparator.getTrueFirstComparator().sortsTrueFirst());
  }
}
