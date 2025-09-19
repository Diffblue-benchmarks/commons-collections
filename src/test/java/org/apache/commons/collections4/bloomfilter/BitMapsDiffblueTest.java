package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BitMapsDiffblueTest {
  /**
   * Test {@link BitMaps#contains(long[], int)}.
   *
   * <ul>
   *   <li>When array of {@code long} with one and zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#contains(long[], int)}
   */
  @Test
  @DisplayName(
      "Test contains(long[], int); when array of long with one and zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BitMaps.contains(long[], int)"})
  void testContains_whenArrayOfLongWithOneAndZero_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BitMaps.contains(new long[] {1L, 0L, 1L, 0L}, 1));
  }

  /**
   * Test {@link BitMaps#contains(long[], int)}.
   *
   * <ul>
   *   <li>When array of {@code long} with six and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#contains(long[], int)}
   */
  @Test
  @DisplayName(
      "Test contains(long[], int); when array of long with six and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BitMaps.contains(long[], int)"})
  void testContains_whenArrayOfLongWithSixAndOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BitMaps.contains(new long[] {6L, 1L, 6L, 1L, 6L, 1L, 6L, 1L}, 1));
  }

  /**
   * Test {@link BitMaps#getLongBit(int)}.
   *
   * <p>Method under test: {@link BitMaps#getLongBit(int)}
   */
  @Test
  @DisplayName("Test getLongBit(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long BitMaps.getLongBit(int)"})
  void testGetLongBit() {
    // Arrange, Act and Assert
    assertEquals(2L, BitMaps.getLongBit(1));
  }

  /**
   * Test {@link BitMaps#getLongIndex(int)}.
   *
   * <p>Method under test: {@link BitMaps#getLongIndex(int)}
   */
  @Test
  @DisplayName("Test getLongIndex(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.getLongIndex(int)"})
  void testGetLongIndex() {
    // Arrange, Act and Assert
    assertEquals(0, BitMaps.getLongIndex(1));
  }

  /**
   * Test {@link BitMaps#mod(long, int)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#mod(long, int)}
   */
  @Test
  @DisplayName("Test mod(long, int); when four; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.mod(long, int)"})
  void testMod_whenFour_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, BitMaps.mod(4L, 3));
  }

  /**
   * Test {@link BitMaps#mod(long, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#mod(long, int)}
   */
  @Test
  @DisplayName("Test mod(long, int); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.mod(long, int)"})
  void testMod_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, BitMaps.mod(1L, 3));
  }

  /**
   * Test {@link BitMaps#mod(long, int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#mod(long, int)}
   */
  @Test
  @DisplayName("Test mod(long, int); when three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.mod(long, int)"})
  void testMod_whenThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, BitMaps.mod(3L, 3));
  }

  /**
   * Test {@link BitMaps#mod(long, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#mod(long, int)}
   */
  @Test
  @DisplayName("Test mod(long, int); when two; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.mod(long, int)"})
  void testMod_whenTwo_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2, BitMaps.mod(2L, 3));
  }

  /**
   * Test {@link BitMaps#newBitMap(int)} with {@code numberOfBits}.
   *
   * <p>Method under test: {@link BitMaps#newBitMap(int)}
   */
  @Test
  @DisplayName("Test newBitMap(int) with 'numberOfBits'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] BitMaps.newBitMap(int)"})
  void testNewBitMapWithNumberOfBits() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {0L}, BitMaps.newBitMap(10));
  }

  /**
   * Test {@link BitMaps#newBitMap(Shape)} with {@code shape}.
   *
   * <ul>
   *   <li>When fromKM {@code 19088743} and ten.
   *   <li>Then return array of {@code long} with zero.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#newBitMap(Shape)}
   */
  @Test
  @DisplayName(
      "Test newBitMap(Shape) with 'shape'; when fromKM '19088743' and ten; then return array of long with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] BitMaps.newBitMap(Shape)"})
  void testNewBitMapWithShape_whenFromKM19088743AndTen_thenReturnArrayOfLongWithZero() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {0L}, BitMaps.newBitMap(Shape.fromKM(19088743, 10)));
  }

  /**
   * Test {@link BitMaps#numberOfBitMaps(int)} with {@code numberOfBits}.
   *
   * <p>Method under test: {@link BitMaps#numberOfBitMaps(int)}
   */
  @Test
  @DisplayName("Test numberOfBitMaps(int) with 'numberOfBits'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.numberOfBitMaps(int)"})
  void testNumberOfBitMapsWithNumberOfBits() {
    // Arrange, Act and Assert
    assertEquals(1, BitMaps.numberOfBitMaps(10));
  }

  /**
   * Test {@link BitMaps#numberOfBitMaps(Shape)} with {@code shape}.
   *
   * <ul>
   *   <li>When fromKM {@code 19088743} and ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#numberOfBitMaps(Shape)}
   */
  @Test
  @DisplayName(
      "Test numberOfBitMaps(Shape) with 'shape'; when fromKM '19088743' and ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BitMaps.numberOfBitMaps(Shape)"})
  void testNumberOfBitMapsWithShape_whenFromKM19088743AndTen_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, BitMaps.numberOfBitMaps(Shape.fromKM(19088743, 10)));
  }

  /**
   * Test {@link BitMaps#set(long[], int)}.
   *
   * <ul>
   *   <li>Then array of {@code long} with one and zero is array of {@code long} with three and
   *       zero.
   * </ul>
   *
   * <p>Method under test: {@link BitMaps#set(long[], int)}
   */
  @Test
  @DisplayName(
      "Test set(long[], int); then array of long with one and zero is array of long with three and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BitMaps.set(long[], int)"})
  void testSet_thenArrayOfLongWithOneAndZeroIsArrayOfLongWithThreeAndZero() {
    // Arrange
    long[] bitMaps = new long[] {1L, 0L, 1L, 0L};

    // Act
    BitMaps.set(bitMaps, 1);

    // Assert
    assertArrayEquals(new long[] {3L, 0L, 1L, 0L}, bitMaps);
  }
}
