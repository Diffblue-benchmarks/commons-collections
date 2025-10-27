package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BitMapsDiffblueTest {
  /**
   * Method under test: {@link BitMaps#contains(long[], int)}
   */
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertFalse(BitMaps.contains(new long[]{1L, 0L, 1L, 0L}, 1));
    assertTrue(BitMaps.contains(new long[]{6L, 0L, 1L, 0L}, 1));
  }

  /**
   * Method under test: {@link BitMaps#getLongBit(int)}
   */
  @Test
  public void testGetLongBit() {
    // Arrange, Act and Assert
    assertEquals(2L, BitMaps.getLongBit(1));
  }

  /**
   * Method under test: {@link BitMaps#getLongIndex(int)}
   */
  @Test
  public void testGetLongIndex() {
    // Arrange, Act and Assert
    assertEquals(0, BitMaps.getLongIndex(1));
  }

  /**
   * Method under test: {@link BitMaps#mod(long, int)}
   */
  @Test
  public void testMod() {
    // Arrange, Act and Assert
    assertEquals(1, BitMaps.mod(1L, 3));
    assertEquals(2, BitMaps.mod(2L, 3));
    assertEquals(0, BitMaps.mod(3L, 3));
    assertEquals(1, BitMaps.mod(4L, 3));
  }

  /**
   * Method under test: {@link BitMaps#newBitMap(int)}
   */
  @Test
  public void testNewBitMap() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, BitMaps.newBitMap(10));
    assertArrayEquals(new long[]{0L}, BitMaps.newBitMap(Shape.fromKM(19088743, 10)));
  }

  /**
   * Method under test: {@link BitMaps#numberOfBitMaps(int)}
   */
  @Test
  public void testNumberOfBitMaps() {
    // Arrange, Act and Assert
    assertEquals(1, BitMaps.numberOfBitMaps(10));
    assertEquals(1, BitMaps.numberOfBitMaps(Shape.fromKM(19088743, 10)));
  }

  /**
   * Method under test: {@link BitMaps#set(long[], int)}
   */
  @Test
  public void testSet() {
    // Arrange
    long[] bitMaps = new long[]{1L, 0L, 1L, 0L};

    // Act
    BitMaps.set(bitMaps, 1);

    // Assert
    assertEquals(3L, bitMaps[0]);
    assertEquals(4, bitMaps.length);
  }
}
