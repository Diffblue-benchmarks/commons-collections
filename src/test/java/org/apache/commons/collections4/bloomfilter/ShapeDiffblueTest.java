package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ShapeDiffblueTest {
  /**
   * Test {@link Shape#fromKM(int, int)}.
   *
   * <ul>
   *   <li>When {@code 19088743}.
   *   <li>Then return NumberOfBits is ten.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromKM(int, int)}
   */
  @Test
  @DisplayName("Test fromKM(int, int); when '19088743'; then return NumberOfBits is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromKM(int, int)"})
  void testFromKM_when19088743_thenReturnNumberOfBitsIsTen() {
    // Arrange and Act
    Shape actualFromKMResult = Shape.fromKM(19088743, 10);

    // Assert
    assertEquals(10, actualFromKMResult.getNumberOfBits());
    assertEquals(19088743, actualFromKMResult.getNumberOfHashFunctions());
  }

  /**
   * Test {@link Shape#fromKM(int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromKM(int, int)}
   */
  @Test
  @DisplayName("Test fromKM(int, int); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromKM(int, int)"})
  void testFromKM_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromKM(1, 0));
  }

  /**
   * Test {@link Shape#fromKM(int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromKM(int, int)}
   */
  @Test
  @DisplayName("Test fromKM(int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromKM(int, int)"})
  void testFromKM_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromKM(0, 1));
  }

  /**
   * Test {@link Shape#fromNM(int, int)}.
   *
   * <ul>
   *   <li>When one thousand.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNM(int, int)}
   */
  @Test
  @DisplayName("Test fromNM(int, int); when one thousand; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNM(int, int)"})
  void testFromNM_whenOneThousand_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNM(1000, 10));
  }

  /**
   * Test {@link Shape#fromNM(int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return NumberOfBits is one.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNM(int, int)}
   */
  @Test
  @DisplayName("Test fromNM(int, int); when one; then return NumberOfBits is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNM(int, int)"})
  void testFromNM_whenOne_thenReturnNumberOfBitsIsOne() {
    // Arrange and Act
    Shape actualFromNMResult = Shape.fromNM(1, 1);

    // Assert
    assertEquals(1, actualFromNMResult.getNumberOfBits());
    assertEquals(1, actualFromNMResult.getNumberOfHashFunctions());
  }

  /**
   * Test {@link Shape#fromNM(int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNM(int, int)}
   */
  @Test
  @DisplayName("Test fromNM(int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNM(int, int)"})
  void testFromNM_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNM(1, 0));
  }

  /**
   * Test {@link Shape#fromNM(int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNM(int, int)}
   */
  @Test
  @DisplayName("Test fromNM(int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNM(int, int)"})
  void testFromNM_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNM(0, 1));
  }

  /**
   * Test {@link Shape#fromNMK(int, int, int)}.
   *
   * <ul>
   *   <li>When one thousand.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  @DisplayName(
      "Test fromNMK(int, int, int); when one thousand; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNMK(int, int, int)"})
  void testFromNMK_whenOneThousand_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(1000, 10, 19088743));
  }

  /**
   * Test {@link Shape#fromNMK(int, int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return NumberOfBits is one.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  @DisplayName("Test fromNMK(int, int, int); when one; then return NumberOfBits is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNMK(int, int, int)"})
  void testFromNMK_whenOne_thenReturnNumberOfBitsIsOne() {
    // Arrange and Act
    Shape actualFromNMKResult = Shape.fromNMK(1, 1, 1);

    // Assert
    assertEquals(1, actualFromNMKResult.getNumberOfBits());
    assertEquals(1, actualFromNMKResult.getNumberOfHashFunctions());
  }

  /**
   * Test {@link Shape#fromNMK(int, int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  @DisplayName("Test fromNMK(int, int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNMK(int, int, int)"})
  void testFromNMK_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(1, 1, 0));
  }

  /**
   * Test {@link Shape#fromNMK(int, int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  @DisplayName("Test fromNMK(int, int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNMK(int, int, int)"})
  void testFromNMK_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(1, 0, 1));
  }

  /**
   * Test {@link Shape#fromNMK(int, int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  @DisplayName("Test fromNMK(int, int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNMK(int, int, int)"})
  void testFromNMK_whenZero_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(0, 1, 1));
  }

  /**
   * Test {@link Shape#fromNP(int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.25}.
   *   <li>Then return NumberOfHashFunctions is two.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  @DisplayName("Test fromNP(int, double); when '0.25'; then return NumberOfHashFunctions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNP(int, double)"})
  void testFromNP_when025_thenReturnNumberOfHashFunctionsIsTwo() {
    // Arrange and Act
    Shape actualFromNPResult = Shape.fromNP(1000, 0.25d);

    // Assert
    assertEquals(2, actualFromNPResult.getNumberOfHashFunctions());
    assertEquals(2886, actualFromNPResult.getNumberOfBits());
  }

  /**
   * Test {@link Shape#fromNP(int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  @DisplayName(
      "Test fromNP(int, double); when '0.9999999999999999'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNP(int, double)"})
  void testFromNP_when09999999999999999_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(1000, 0.9999999999999999d));
  }

  /**
   * Test {@link Shape#fromNP(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  @DisplayName("Test fromNP(int, double); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNP(int, double)"})
  void testFromNP_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(1, 0.0d));
  }

  /**
   * Test {@link Shape#fromNP(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  @DisplayName("Test fromNP(int, double); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNP(int, double)"})
  void testFromNP_whenOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(1, 1.0d));
  }

  /**
   * Test {@link Shape#fromNP(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  @DisplayName("Test fromNP(int, double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromNP(int, double)"})
  void testFromNP_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(0, 0.0d));
  }

  /**
   * Test {@link Shape#fromPMK(double, int, int)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return NumberOfBits is one.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  @DisplayName("Test fromPMK(double, int, int); when '1.0E-10'; then return NumberOfBits is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromPMK(double, int, int)"})
  void testFromPMK_when10e10_thenReturnNumberOfBitsIsOne() {
    // Arrange and Act
    Shape actualFromPMKResult = Shape.fromPMK(1.0E-10d, 1, 1);

    // Assert
    assertEquals(1, actualFromPMKResult.getNumberOfBits());
    assertEquals(1, actualFromPMKResult.getNumberOfHashFunctions());
  }

  /**
   * Test {@link Shape#fromPMK(double, int, int)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  @DisplayName(
      "Test fromPMK(double, int, int); when '1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromPMK(double, int, int)"})
  void testFromPMK_when10e10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(1.0E-10d, 1, 0));
  }

  /**
   * Test {@link Shape#fromPMK(double, int, int)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  @DisplayName(
      "Test fromPMK(double, int, int); when '1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromPMK(double, int, int)"})
  void testFromPMK_when10e10_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(1.0E-10d, 0, 1));
  }

  /**
   * Test {@link Shape#fromPMK(double, int, int)}.
   *
   * <ul>
   *   <li>When {@code 0.25}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  @DisplayName("Test fromPMK(double, int, int); when '0.25'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromPMK(double, int, int)"})
  void testFromPMK_when025_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(0.25d, 10, 19088743));
  }

  /**
   * Test {@link Shape#fromPMK(double, int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  @DisplayName("Test fromPMK(double, int, int); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromPMK(double, int, int)"})
  void testFromPMK_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(1.0d, 1, 1));
  }

  /**
   * Test {@link Shape#fromPMK(double, int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  @DisplayName("Test fromPMK(double, int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape Shape.fromPMK(double, int, int)"})
  void testFromPMK_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(0.0d, 1, 1));
  }

  /**
   * Test {@link Shape#equals(Object)}, and {@link Shape#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Shape#equals(Object)}
   *   <li>{@link Shape#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.equals(Object)", "int Shape.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);
    Shape fromKMResult2 = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(fromKMResult, fromKMResult2);
    assertEquals(fromKMResult.hashCode(), fromKMResult2.hashCode());
  }

  /**
   * Test {@link Shape#equals(Object)}, and {@link Shape#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Shape#equals(Object)}
   *   <li>{@link Shape#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.equals(Object)", "int Shape.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(fromKMResult, fromKMResult);
    int expectedHashCodeResult = fromKMResult.hashCode();
    assertEquals(expectedHashCodeResult, fromKMResult.hashCode());
  }

  /**
   * Test {@link Shape#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Shape#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.equals(Object)", "int Shape.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Shape fromNPResult = Shape.fromNP(1000, 0.25d);

    // Act and Assert
    assertNotEquals(fromNPResult, Shape.fromKM(19088743, 10));
  }

  /**
   * Test {@link Shape#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Shape#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.equals(Object)", "int Shape.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(10, 10);

    // Act and Assert
    assertNotEquals(fromKMResult, Shape.fromKM(19088743, 10));
  }

  /**
   * Test {@link Shape#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Shape#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.equals(Object)", "int Shape.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertNotEquals(fromKMResult, null);
  }

  /**
   * Test {@link Shape#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Shape#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.equals(Object)", "int Shape.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertNotEquals(fromKMResult, "Different type to Shape");
  }

  /**
   * Test {@link Shape#estimateMaxN()}.
   *
   * <p>Method under test: {@link Shape#estimateMaxN()}
   */
  @Test
  @DisplayName("Test estimateMaxN()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Shape.estimateMaxN()"})
  void testEstimateMaxN() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(3.631182946723864E-7d, fromKMResult.estimateMaxN());
  }

  /**
   * Test {@link Shape#estimateN(int)}.
   *
   * <p>Method under test: {@link Shape#estimateN(int)}
   */
  @Test
  @DisplayName("Test estimateN(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Shape.estimateN(int)"})
  void testEstimateN() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(5.519510407669395E-8d, fromKMResult.estimateN(1));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Shape#toString()}
   *   <li>{@link Shape#getNumberOfBits()}
   *   <li>{@link Shape#getNumberOfHashFunctions()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int Shape.getNumberOfBits()",
    "int Shape.getNumberOfHashFunctions()",
    "String Shape.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act
    String actualToStringResult = fromKMResult.toString();
    int actualNumberOfBits = fromKMResult.getNumberOfBits();

    // Assert
    assertEquals("Shape[k=19088743 m=10]", actualToStringResult);
    assertEquals(10, actualNumberOfBits);
    assertEquals(19088743, fromKMResult.getNumberOfHashFunctions());
  }

  /**
   * Test {@link Shape#getProbability(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#getProbability(int)}
   */
  @Test
  @DisplayName("Test getProbability(int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Shape.getProbability(int)"})
  void testGetProbability_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fromKMResult.getProbability(-1));
  }

  /**
   * Test {@link Shape#getProbability(int)}.
   *
   * <ul>
   *   <li>When one thousand.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Shape#getProbability(int)}
   */
  @Test
  @DisplayName("Test getProbability(int); when one thousand; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Shape.getProbability(int)"})
  void testGetProbability_whenOneThousand_thenReturnOne() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(1.0d, fromKMResult.getProbability(1000));
  }

  /**
   * Test {@link Shape#getProbability(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Shape#getProbability(int)}
   */
  @Test
  @DisplayName("Test getProbability(int); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Shape.getProbability(int)"})
  void testGetProbability_whenZero_thenReturnZero() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0.0d, fromKMResult.getProbability(0));
  }

  /**
   * Test {@link Shape#isSparse(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#isSparse(int)}
   */
  @Test
  @DisplayName("Test isSparse(int); when one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.isSparse(int)"})
  void testIsSparse_whenOne_thenReturnTrue() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(fromKMResult.isSparse(1));
  }

  /**
   * Test {@link Shape#isSparse(int)}.
   *
   * <ul>
   *   <li>When six.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Shape#isSparse(int)}
   */
  @Test
  @DisplayName("Test isSparse(int); when six; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Shape.isSparse(int)"})
  void testIsSparse_whenSix_thenReturnFalse() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertFalse(fromKMResult.isSparse(6));
  }
}
