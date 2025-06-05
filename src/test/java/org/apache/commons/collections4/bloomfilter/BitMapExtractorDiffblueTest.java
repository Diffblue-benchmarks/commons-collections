package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BitMapExtractorDiffblueTest {
  /**
   * Test {@link BitMapExtractor#fromBitMapArray(long[])}.
   * <p>
   * Method under test: {@link BitMapExtractor#fromBitMapArray(long[])}
   */
  @Test
  @DisplayName("Test fromBitMapArray(long[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BitMapExtractor BitMapExtractor.fromBitMapArray(long[])"})
  void testFromBitMapArray() {
    // Arrange
    long[] bitMaps = new long[]{1L, -1L, 1L, -1L};

    // Act and Assert
    assertArrayEquals(new long[]{1L, -1L, 1L, -1L}, BitMapExtractor.fromBitMapArray(bitMaps).asBitMapArray());
    assertArrayEquals(new long[]{1L, -1L, 1L, -1L}, bitMaps);
  }

  /**
   * Test {@link BitMapExtractor#fromBitMapArray(long[])}.
   * <ul>
   *   <li>Then return not processBitMaps {@link LongPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#fromBitMapArray(long[])}
   */
  @Test
  @DisplayName("Test fromBitMapArray(long[]); then return not processBitMaps LongPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BitMapExtractor BitMapExtractor.fromBitMapArray(long[])"})
  void testFromBitMapArray_thenReturnNotProcessBitMapsLongPredicate() {
    // Arrange
    long[] bitMaps = new long[]{1L, -1L, 1L, -1L};

    // Act
    BitMapExtractor actualFromBitMapArrayResult = BitMapExtractor.fromBitMapArray(bitMaps);
    LongPredicate longPredicate = mock(LongPredicate.class);
    when(longPredicate.test(anyLong())).thenReturn(false);
    boolean actualProcessBitMapsResult = actualFromBitMapArrayResult.processBitMaps(longPredicate);

    // Assert
    verify(longPredicate).test(eq(1L));
    assertFalse(actualProcessBitMapsResult);
    assertArrayEquals(new long[]{1L, -1L, 1L, -1L}, actualFromBitMapArrayResult.asBitMapArray());
    assertArrayEquals(new long[]{1L, -1L, 1L, -1L}, bitMaps);
  }

  /**
   * Test {@link BitMapExtractor#fromBitMapArray(long[])}.
   * <ul>
   *   <li>Then return processBitMaps {@link LongPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#fromBitMapArray(long[])}
   */
  @Test
  @DisplayName("Test fromBitMapArray(long[]); then return processBitMaps LongPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BitMapExtractor BitMapExtractor.fromBitMapArray(long[])"})
  void testFromBitMapArray_thenReturnProcessBitMapsLongPredicate() {
    // Arrange
    long[] bitMaps = new long[]{1L, -1L, 1L, -1L};

    // Act
    BitMapExtractor actualFromBitMapArrayResult = BitMapExtractor.fromBitMapArray(bitMaps);
    LongPredicate longPredicate = mock(LongPredicate.class);
    when(longPredicate.test(anyLong())).thenReturn(true);
    boolean actualProcessBitMapsResult = actualFromBitMapArrayResult.processBitMaps(longPredicate);

    // Assert
    verify(longPredicate, atLeast(1)).test(anyLong());
    assertTrue(actualProcessBitMapsResult);
    assertArrayEquals(new long[]{1L, -1L, 1L, -1L}, actualFromBitMapArrayResult.asBitMapArray());
    assertArrayEquals(new long[]{1L, -1L, 1L, -1L}, bitMaps);
  }

  /**
   * Test {@link BitMapExtractor#fromIndexExtractor(IndexExtractor, int)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return not processBitMaps {@link LongPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#fromIndexExtractor(IndexExtractor, int)}
   */
  @Test
  @DisplayName("Test fromIndexExtractor(IndexExtractor, int); when ten; then return not processBitMaps LongPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BitMapExtractor BitMapExtractor.fromIndexExtractor(IndexExtractor, int)"})
  void testFromIndexExtractor_whenTen_thenReturnNotProcessBitMapsLongPredicate() {
    // Arrange
    IndexExtractor extractor = mock(IndexExtractor.class);
    when(extractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    BitMapExtractor actualFromIndexExtractorResult = BitMapExtractor.fromIndexExtractor(extractor, 10);
    LongPredicate longPredicate = mock(LongPredicate.class);
    when(longPredicate.test(anyLong())).thenReturn(false);
    boolean actualProcessBitMapsResult = actualFromIndexExtractorResult.processBitMaps(longPredicate);

    // Assert
    verify(longPredicate).test(eq(0L));
    verify(extractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualProcessBitMapsResult);
    assertArrayEquals(new long[]{0L}, actualFromIndexExtractorResult.asBitMapArray());
  }

  /**
   * Test {@link BitMapExtractor#fromIndexExtractor(IndexExtractor, int)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return processBitMaps {@link LongPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#fromIndexExtractor(IndexExtractor, int)}
   */
  @Test
  @DisplayName("Test fromIndexExtractor(IndexExtractor, int); when ten; then return processBitMaps LongPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BitMapExtractor BitMapExtractor.fromIndexExtractor(IndexExtractor, int)"})
  void testFromIndexExtractor_whenTen_thenReturnProcessBitMapsLongPredicate() {
    // Arrange
    IndexExtractor extractor = mock(IndexExtractor.class);
    when(extractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    BitMapExtractor actualFromIndexExtractorResult = BitMapExtractor.fromIndexExtractor(extractor, 10);
    LongPredicate longPredicate = mock(LongPredicate.class);
    when(longPredicate.test(anyLong())).thenReturn(true);
    boolean actualProcessBitMapsResult = actualFromIndexExtractorResult.processBitMaps(longPredicate);

    // Assert
    verify(longPredicate).test(eq(0L));
    verify(extractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualProcessBitMapsResult);
    assertArrayEquals(new long[]{0L}, actualFromIndexExtractorResult.asBitMapArray());
  }

  /**
   * Test {@link BitMapExtractor#asBitMapArray()}.
   * <ul>
   *   <li>Then return array of {@code long} with zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#asBitMapArray()}
   */
  @Test
  @DisplayName("Test asBitMapArray(); then return array of long with zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long[] BitMapExtractor.asBitMapArray()"})
  void testAsBitMapArray_thenReturnArrayOfLongWithZero() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).asBitMapArray());
  }

  /**
   * Test {@link BitMapExtractor#asBitMapArray()}.
   * <ul>
   *   <li>Then return array of {@code long} with zero and zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#asBitMapArray()}
   */
  @Test
  @DisplayName("Test asBitMapArray(); then return array of long with zero and zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long[] BitMapExtractor.asBitMapArray()"})
  void testAsBitMapArray_thenReturnArrayOfLongWithZeroAndZero() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new long[]{0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L},
        (new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d))).asBitMapArray());
  }

  /**
   * Test {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <p>
   * Method under test: {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @DisplayName("Test processBitMapPairs(BitMapExtractor, LongBiPredicate)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BitMapExtractor.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  void testProcessBitMapPairs() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapPairsResult = arrayCountingBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func, atLeast(1)).test(eq(0L), eq(0L));
    assertTrue(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>When {@link BitMapExtractor} {@link BitMapExtractor#processBitMaps(LongPredicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @DisplayName("Test processBitMapPairs(BitMapExtractor, LongBiPredicate); when BitMapExtractor processBitMaps(LongPredicate) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BitMapExtractor.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  void testProcessBitMapPairs_whenBitMapExtractorProcessBitMapsReturnFalse() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult = arrayCountingBloomFilter.processBitMapPairs(other,
        mock(LongBiPredicate.class));

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>When {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @DisplayName("Test processBitMapPairs(BitMapExtractor, LongBiPredicate); when LongBiPredicate test(long, long) return 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BitMapExtractor.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  void testProcessBitMapPairs_whenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult = arrayCountingBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(eq(0L), eq(0L));
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>When {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapExtractor#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @DisplayName("Test processBitMapPairs(BitMapExtractor, LongBiPredicate); when LongBiPredicate test(long, long) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BitMapExtractor.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  void testProcessBitMapPairs_whenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapPairsResult = arrayCountingBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(eq(0L), eq(0L));
    assertTrue(actualProcessBitMapPairsResult);
  }
}
