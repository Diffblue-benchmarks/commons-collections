package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ShapeDiffblueTest {
  /**
   * Method under test: {@link Shape#fromKM(int, int)}
   */
  @Test
  public void testFromKM() {
    // Arrange and Act
    Shape actualFromKMResult = Shape.fromKM(19088743, 10);

    // Assert
    assertEquals(10, actualFromKMResult.getNumberOfBits());
    assertEquals(19088743, actualFromKMResult.getNumberOfHashFunctions());
  }

  /**
   * Method under test: {@link Shape#fromKM(int, int)}
   */
  @Test
  public void testFromKM2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromKM(1, 0));
  }

  /**
   * Method under test: {@link Shape#fromKM(int, int)}
   */
  @Test
  public void testFromKM3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromKM(0, 1));
  }

  /**
   * Method under test: {@link Shape#fromNM(int, int)}
   */
  @Test
  public void testFromNM() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNM(1000, 10));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNM(0, 1));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNM(1, 0));
  }

  /**
   * Method under test: {@link Shape#fromNM(int, int)}
   */
  @Test
  public void testFromNM2() {
    // Arrange and Act
    Shape actualFromNMResult = Shape.fromNM(1, 1);

    // Assert
    assertEquals(1, actualFromNMResult.getNumberOfBits());
    assertEquals(1, actualFromNMResult.getNumberOfHashFunctions());
  }

  /**
   * Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  public void testFromNMK() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(1000, 10, 19088743));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(0, 1, 1));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(1, 1, 0));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNMK(1, 0, 1));
  }

  /**
   * Method under test: {@link Shape#fromNMK(int, int, int)}
   */
  @Test
  public void testFromNMK2() {
    // Arrange and Act
    Shape actualFromNMKResult = Shape.fromNMK(1, 1, 1);

    // Assert
    assertEquals(1, actualFromNMKResult.getNumberOfBits());
    assertEquals(1, actualFromNMKResult.getNumberOfHashFunctions());
  }

  /**
   * Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  public void testFromNP() {
    // Arrange and Act
    Shape actualFromNPResult = Shape.fromNP(1000, 0.25d);

    // Assert
    assertEquals(2, actualFromNPResult.getNumberOfHashFunctions());
    assertEquals(2886, actualFromNPResult.getNumberOfBits());
  }

  /**
   * Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  public void testFromNP2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(0, 0.0d));
  }

  /**
   * Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  public void testFromNP3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(1, 0.0d));
  }

  /**
   * Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  public void testFromNP4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(1, 1.0d));
  }

  /**
   * Method under test: {@link Shape#fromNP(int, double)}
   */
  @Test
  public void testFromNP5() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromNP(1000, 0.9999999999999999d));
  }

  /**
   * Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  public void testFromPMK() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(0.25d, 10, 19088743));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(0.0d, 1, 1));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(1.0E-10d, 1, 0));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(1.0E-10d, 0, 1));
    assertThrows(IllegalArgumentException.class, () -> Shape.fromPMK(1.0d, 1, 1));
  }

  /**
   * Method under test: {@link Shape#fromPMK(double, int, int)}
   */
  @Test
  public void testFromPMK2() {
    // Arrange and Act
    Shape actualFromPMKResult = Shape.fromPMK(1.0E-10d, 1, 1);

    // Assert
    assertEquals(1, actualFromPMKResult.getNumberOfBits());
    assertEquals(1, actualFromPMKResult.getNumberOfHashFunctions());
  }

  /**
   * Method under test: {@link Shape#estimateMaxN()}
   */
  @Test
  public void testEstimateMaxN() {
    // Arrange, Act and Assert
    assertEquals(3.631182946723864E-7d, Shape.fromKM(19088743, 10).estimateMaxN(), 0.0);
  }

  /**
   * Method under test: {@link Shape#estimateN(int)}
   */
  @Test
  public void testEstimateN() {
    // Arrange, Act and Assert
    assertEquals(5.519510407669395E-8d, Shape.fromKM(19088743, 10).estimateN(1), 0.0);
  }

  /**
   * Method under test: {@link Shape#getProbability(int)}
   */
  @Test
  public void testGetProbability() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Shape.fromKM(19088743, 10).getProbability(1000), 0.0);
    assertEquals(0.0d, Shape.fromKM(19088743, 10).getProbability(0), 0.0);
    assertThrows(IllegalArgumentException.class, () -> Shape.fromKM(19088743, 10).getProbability(-1));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Shape#equals(Object)}
   *   <li>{@link Shape#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);
    Shape fromKMResult2 = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(fromKMResult, fromKMResult2);
    int expectedHashCodeResult = fromKMResult.hashCode();
    assertEquals(expectedHashCodeResult, fromKMResult2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Shape#equals(Object)}
   *   <li>{@link Shape#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(fromKMResult, fromKMResult);
    int expectedHashCodeResult = fromKMResult.hashCode();
    assertEquals(expectedHashCodeResult, fromKMResult.hashCode());
  }

  /**
   * Method under test: {@link Shape#isSparse(int)}
   */
  @Test
  public void testIsSparse() {
    // Arrange, Act and Assert
    assertTrue(Shape.fromKM(19088743, 10).isSparse(1));
    assertFalse(Shape.fromKM(19088743, 10).isSparse(6));
  }

  /**
   * Method under test: {@link Shape#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(10, 10);

    // Act and Assert
    assertNotEquals(fromKMResult, Shape.fromKM(19088743, 10));
  }

  /**
   * Method under test: {@link Shape#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Shape fromKMResult = Shape.fromKM(19088743, 1);

    // Act and Assert
    assertNotEquals(fromKMResult, Shape.fromKM(19088743, 10));
  }

  /**
   * Method under test: {@link Shape#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Shape.fromKM(19088743, 10), null);
  }

  /**
   * Method under test: {@link Shape#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Shape.fromKM(19088743, 10), "Different type to Shape");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Shape#toString()}
   *   <li>{@link Shape#getNumberOfBits()}
   *   <li>{@link Shape#getNumberOfHashFunctions()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
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
}
