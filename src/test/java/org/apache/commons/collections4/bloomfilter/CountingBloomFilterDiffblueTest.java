package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import org.apache.commons.collections4.bloomfilter.LayeredBloomFilterTest.NumberedBloomFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CountingBloomFilterDiffblueTest {
  /**
   * Test {@link CountingBloomFilter#getMaxInsert(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test getMaxInsert(BitMapExtractor) with 'bitMapExtractor'; given 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(BitMapExtractor)"})
  void testGetMaxInsertWithBitMapExtractor_givenFalse_thenReturnZero() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertEquals(0, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#getMaxInsert(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then return {@link Integer#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test getMaxInsert(BitMapExtractor) with 'bitMapExtractor'; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(BitMapExtractor)"})
  void testGetMaxInsertWithBitMapExtractor_thenReturnMax_value() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.asBitMapArray()).thenReturn(new long[] {1L, -1L, 1L, -1L});
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).asBitMapArray();
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertEquals(Integer.MAX_VALUE, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#getMaxInsert(BloomFilter)} with {@code bloomFilter}.
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  @DisplayName("Test getMaxInsert(BloomFilter) with 'bloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(BloomFilter)"})
  void testGetMaxInsertWithBloomFilter() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualMaxInsert =
        arrayCountingBloomFilter.getMaxInsert(
            (BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(Integer.MAX_VALUE, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#getMaxInsert(BloomFilter)} with {@code bloomFilter}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  @DisplayName("Test getMaxInsert(BloomFilter) with 'bloomFilter'; given 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(BloomFilter)"})
  void testGetMaxInsertWithBloomFilter_givenFalse_thenReturnZero() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    NumberedBloomFilter bloomFilter = mock(NumberedBloomFilter.class);
    when(bloomFilter.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(bloomFilter);

    // Assert
    verify(bloomFilter).processBitMaps(isA(LongPredicate.class));
    assertEquals(0, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#getMaxInsert(BloomFilter)} with {@code bloomFilter}.
   *
   * <ul>
   *   <li>Then calls {@link NumberedBloomFilter#asBitMapArray()}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  @DisplayName("Test getMaxInsert(BloomFilter) with 'bloomFilter'; then calls asBitMapArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(BloomFilter)"})
  void testGetMaxInsertWithBloomFilter_thenCallsAsBitMapArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    NumberedBloomFilter bloomFilter = mock(NumberedBloomFilter.class);
    when(bloomFilter.asBitMapArray()).thenReturn(new long[] {1L, -1L, 1L, -1L});
    when(bloomFilter.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(bloomFilter);

    // Assert
    verify(bloomFilter).asBitMapArray();
    verify(bloomFilter).processBitMaps(isA(LongPredicate.class));
    assertEquals(Integer.MAX_VALUE, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#getMaxInsert(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return {@link Integer#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(Hasher)}
   */
  @Test
  @DisplayName("Test getMaxInsert(Hasher) with 'hasher'; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(Hasher)"})
  void testGetMaxInsertWithHasher_thenReturnMax_value() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor2);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertEquals(Integer.MAX_VALUE, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#getMaxInsert(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then return {@link Integer#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#getMaxInsert(IndexExtractor)}
   */
  @Test
  @DisplayName("Test getMaxInsert(IndexExtractor) with 'indexExtractor'; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CountingBloomFilter.getMaxInsert(IndexExtractor)"})
  void testGetMaxInsertWithIndexExtractor_thenReturnMax_value() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(indexExtractor2);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertEquals(Integer.MAX_VALUE, actualMaxInsert);
  }

  /**
   * Test {@link CountingBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test merge(BitMapExtractor) with 'bitMapExtractor'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_givenFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualMergeResult = arrayCountingBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link CountingBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test merge(BitMapExtractor) with 'bitMapExtractor'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_givenTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = arrayCountingBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link CountingBloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return
   *       {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName(
      "Test merge(Hasher) with 'hasher'; given IndexExtractor processIndices(IntPredicate) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(Hasher)"})
  void testMergeWithHasher_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor2);

    // Act
    boolean actualMergeResult = arrayCountingBloomFilter.merge(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link CountingBloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(Hasher)"})
  void testMergeWithHasher_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IllegalArgumentException());

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.merge(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName("Test merge(IndexExtractor) with 'indexExtractor'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    // Act
    boolean actualMergeResult = arrayCountingBloomFilter.merge(indexExtractor2);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link CountingBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test merge(IndexExtractor) with 'indexExtractor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> arrayCountingBloomFilter.merge(indexExtractor));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Then calls {@link NumberedBloomFilter#uniqueIndices()}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName("Test merge(BloomFilter) with 'other'; then calls uniqueIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_thenCallsUniqueIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.uniqueIndices()).thenReturn(indexExtractor);

    // Act
    boolean actualMergeResult = arrayCountingBloomFilter.merge(other);

    // Assert
    verify(other).uniqueIndices();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link CountingBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        arrayCountingBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link CountingBloomFilter#remove(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test remove(BitMapExtractor) with 'bitMapExtractor'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BitMapExtractor)"})
  void testRemoveWithBitMapExtractor_givenFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualRemoveResult = arrayCountingBloomFilter.remove(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CountingBloomFilter#remove(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test remove(BitMapExtractor) with 'bitMapExtractor'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BitMapExtractor)"})
  void testRemoveWithBitMapExtractor_givenTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualRemoveResult = arrayCountingBloomFilter.remove(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CountingBloomFilter#remove(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test remove(BitMapExtractor) with 'bitMapExtractor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BitMapExtractor)"})
  void testRemoveWithBitMapExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any()))
        .thenThrow(new IndexOutOfBoundsException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(bitMapExtractor));
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
  }

  /**
   * Test {@link CountingBloomFilter#remove(Hasher)} with {@code hasher}.
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  @DisplayName("Test remove(Hasher) with 'hasher'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(Hasher)"})
  void testRemoveWithHasher() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IndexOutOfBoundsException());

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(Hasher)} with {@code hasher}.
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  @DisplayName("Test remove(Hasher) with 'hasher'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(Hasher)"})
  void testRemoveWithHasher2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IllegalArgumentException());

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(Hasher)} with {@code hasher}.
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  @DisplayName("Test remove(Hasher) with 'hasher'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(Hasher)"})
  void testRemoveWithHasher3() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IndexOutOfBoundsException());

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor2);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return
   *       {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  @DisplayName(
      "Test remove(Hasher) with 'hasher'; given IndexExtractor processIndices(IntPredicate) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(Hasher)"})
  void testRemoveWithHasher_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor2);

    // Act
    boolean actualRemoveResult = arrayCountingBloomFilter.remove(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CountingBloomFilter#remove(IndexExtractor)} with {@code indexExtractor}.
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(IndexExtractor)}
   */
  @Test
  @DisplayName("Test remove(IndexExtractor) with 'indexExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(IndexExtractor)"})
  void testRemoveWithIndexExtractor() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IndexOutOfBoundsException());

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(indexExtractor2));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test remove(IndexExtractor) with 'indexExtractor'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(IndexExtractor)"})
  void testRemoveWithIndexExtractor_givenIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(indexExtractor));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@link IndexOutOfBoundsException#IndexOutOfBoundsException()}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test remove(IndexExtractor) with 'indexExtractor'; given IndexOutOfBoundsException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(IndexExtractor)"})
  void testRemoveWithIndexExtractor_givenIndexOutOfBoundsException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IndexOutOfBoundsException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(indexExtractor));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(IndexExtractor)}
   */
  @Test
  @DisplayName("Test remove(IndexExtractor) with 'indexExtractor'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(IndexExtractor)"})
  void testRemoveWithIndexExtractor_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    // Act
    boolean actualRemoveResult = arrayCountingBloomFilter.remove(indexExtractor2);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CountingBloomFilter#remove(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  @DisplayName("Test remove(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BloomFilter)"})
  void testRemoveWithOther() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IndexOutOfBoundsException());

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.uniqueIndices()).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(other));
    verify(other).uniqueIndices();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link CountingBloomFilter#remove(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return
   *       {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test remove(BloomFilter) with 'other'; given IndexExtractor processIndices(IntPredicate) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BloomFilter)"})
  void testRemoveWithOther_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.uniqueIndices()).thenReturn(indexExtractor);

    // Act
    boolean actualRemoveResult = arrayCountingBloomFilter.remove(other);

    // Assert
    verify(other).uniqueIndices();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CountingBloomFilter#remove(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link IndexOutOfBoundsException#IndexOutOfBoundsException()}.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  @DisplayName("Test remove(BloomFilter) with 'other'; given IndexOutOfBoundsException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BloomFilter)"})
  void testRemoveWithOther_givenIndexOutOfBoundsException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.uniqueIndices()).thenThrow(new IndexOutOfBoundsException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.remove(other));
    verify(other).uniqueIndices();
  }

  /**
   * Test {@link CountingBloomFilter#remove(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test remove(BloomFilter) with 'other'; when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingBloomFilter.remove(BloomFilter)"})
  void testRemoveWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualRemoveResult =
        arrayCountingBloomFilter.remove((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CountingBloomFilter#uniqueIndices()}.
   *
   * <p>Method under test: {@link CountingBloomFilter#uniqueIndices()}
   */
  @Test
  @DisplayName("Test uniqueIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexExtractor CountingBloomFilter.uniqueIndices()"})
  void testUniqueIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    IndexExtractor actualUniqueIndicesResult = new ArrayCountingBloomFilter(shape).uniqueIndices();
    boolean actualProcessIndicesResult =
        actualUniqueIndicesResult.processIndices(mock(IntPredicate.class));

    // Assert
    assertTrue(actualUniqueIndicesResult instanceof ArrayCountingBloomFilter);
    assertEquals(1, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).characteristics());
    assertFalse(((ArrayCountingBloomFilter) actualUniqueIndicesResult).isFull());
    assertTrue(((ArrayCountingBloomFilter) actualUniqueIndicesResult).isValid());
    assertTrue(actualProcessIndicesResult);
    assertEquals(
        Integer.MAX_VALUE, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).getMaxCell());
    assertSame(shape, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).getShape());
  }
}
