package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyLong;
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

class SimpleBloomFilterDiffblueTest {
  /**
   * Test {@link SimpleBloomFilter#SimpleBloomFilter(Shape)}.
   *
   * <ul>
   *   <li>Then return characteristics is zero.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#SimpleBloomFilter(Shape)}
   */
  @Test
  @DisplayName("Test new SimpleBloomFilter(Shape); then return characteristics is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SimpleBloomFilter.<init>(Shape)"})
  void testNewSimpleBloomFilter_thenReturnCharacteristicsIsZero() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SimpleBloomFilter actualSimpleBloomFilter = new SimpleBloomFilter(shape);

    // Assert
    assertEquals(0, actualSimpleBloomFilter.characteristics());
    assertFalse(actualSimpleBloomFilter.isFull());
    assertSame(shape, actualSimpleBloomFilter.getShape());
  }

  /**
   * Test {@link SimpleBloomFilter#asBitMapArray()}.
   *
   * <p>Method under test: {@link SimpleBloomFilter#asBitMapArray()}
   */
  @Test
  @DisplayName("Test asBitMapArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] SimpleBloomFilter.asBitMapArray()"})
  void testAsBitMapArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertArrayEquals(new long[] {0L}, new SimpleBloomFilter(shape).asBitMapArray());
  }

  /**
   * Test {@link SimpleBloomFilter#cardinality()}.
   *
   * <ul>
   *   <li>Given {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code
   *       19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#cardinality()}
   */
  @Test
  @DisplayName(
      "Test cardinality(); given SimpleBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SimpleBloomFilter.cardinality()"})
  void testCardinality_givenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new SimpleBloomFilter(shape).cardinality());
  }

  /**
   * Test {@link SimpleBloomFilter#cardinality()}.
   *
   * <ul>
   *   <li>Then calls {@link BitMapExtractor#processBitMaps(LongPredicate)}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#cardinality()}
   */
  @Test
  @DisplayName("Test cardinality(); then calls processBitMaps(LongPredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SimpleBloomFilter.cardinality()"})
  void testCardinality_thenCallsProcessBitMaps() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    Shape shape = Shape.fromKM(19088743, 10);

    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);
    simpleBloomFilter.merge(bitMapExtractor);

    // Act
    int actualCardinalityResult = simpleBloomFilter.cardinality();

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link SimpleBloomFilter#characteristics()}.
   *
   * <p>Method under test: {@link SimpleBloomFilter#characteristics()}
   */
  @Test
  @DisplayName("Test characteristics()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SimpleBloomFilter.characteristics()"})
  void testCharacteristics() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new SimpleBloomFilter(shape).characteristics());
  }

  /**
   * Test {@link SimpleBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = simpleBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = simpleBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.contains(indexExtractor));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#copy()}.
   *
   * <p>Method under test: {@link SimpleBloomFilter#copy()}
   */
  @Test
  @DisplayName("Test copy()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleBloomFilter SimpleBloomFilter.copy()"})
  void testCopy() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SimpleBloomFilter actualCopyResult = new SimpleBloomFilter(shape).copy();

    // Assert
    assertEquals(0, actualCopyResult.characteristics());
    assertFalse(actualCopyResult.isFull());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Test {@link SimpleBloomFilter#getShape()}.
   *
   * <p>Method under test: {@link SimpleBloomFilter#getShape()}
   */
  @Test
  @DisplayName("Test getShape()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape SimpleBloomFilter.getShape()"})
  void testGetShape() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertSame(shape, new SimpleBloomFilter(shape).getShape());
  }

  /**
   * Test {@link SimpleBloomFilter#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link BitMapExtractor} {@link BitMapExtractor#processBitMaps(LongPredicate)}
   *       return {@code true}.
   *   <li>Then calls {@link BitMapExtractor#processBitMaps(LongPredicate)}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given BitMapExtractor processBitMaps(LongPredicate) return 'true'; then calls processBitMaps(LongPredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.isEmpty()"})
  void testIsEmpty_givenBitMapExtractorProcessBitMapsReturnTrue_thenCallsProcessBitMaps() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    Shape shape = Shape.fromKM(19088743, 10);

    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);
    simpleBloomFilter.merge(bitMapExtractor);

    // Act
    boolean actualIsEmptyResult = simpleBloomFilter.isEmpty();

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link SimpleBloomFilter#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code
   *       19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given SimpleBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.isEmpty()"})
  void testIsEmpty_givenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new SimpleBloomFilter(shape).isEmpty());
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test merge(BitMapExtractor) with 'bitMapExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = simpleBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test merge(BitMapExtractor) with 'bitMapExtractor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(bitMapExtractor));
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(Hasher)"})
  void testMergeWithHasher() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IllegalArgumentException());

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(Hasher)"})
  void testMergeWithHasher_givenIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(hasher));
    verify(hasher).indices(isA(Shape.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return
   *       {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName(
      "Test merge(Hasher) with 'hasher'; given IndexExtractor processIndices(IntPredicate) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(Hasher)"})
  void testMergeWithHasher_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualMergeResult = simpleBloomFilter.merge(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SimpleBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName("Test merge(IndexExtractor) with 'indexExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = simpleBloomFilter.merge(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SimpleBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test merge(IndexExtractor) with 'indexExtractor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(indexExtractor));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName("Test merge(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.characteristics()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(other));
    verify(other).characteristics();
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then calls {@link NumberedBloomFilter#processIndices(IntPredicate)}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; given one; then calls processIndices(IntPredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_givenOne_thenCallsProcessIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IllegalArgumentException());
    when(other.characteristics()).thenReturn(1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(other));
    verify(other).characteristics();
    verify(other).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then calls {@link NumberedBloomFilter#processBitMaps(LongPredicate)}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; given 'true'; then calls processBitMaps(LongPredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_givenTrue_thenCallsProcessBitMaps() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    when(other.characteristics()).thenReturn(0);

    // Act
    boolean actualMergeResult = simpleBloomFilter.merge(other);

    // Assert
    verify(other).characteristics();
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        simpleBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor,
   * LongBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMapPairs(BitMapExtractor, LongBiPredicate); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"
  })
  void testProcessBitMapPairs_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> simpleBloomFilter.processBitMapPairs(other, mock(LongBiPredicate.class)));
    verify(other).processBitMaps(isA(LongPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   *
   * <ul>
   *   <li>When {@link BitMapExtractor} {@link BitMapExtractor#processBitMaps(LongPredicate)} return
   *       {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor,
   * LongBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMapPairs(BitMapExtractor, LongBiPredicate); when BitMapExtractor processBitMaps(LongPredicate) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"
  })
  void testProcessBitMapPairs_whenBitMapExtractorProcessBitMapsReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult =
        simpleBloomFilter.processBitMapPairs(other, mock(LongBiPredicate.class));

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   *
   * <ul>
   *   <li>When {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code
   *       false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor,
   * LongBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMapPairs(BitMapExtractor, LongBiPredicate); when LongBiPredicate test(long, long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"
  })
  void testProcessBitMapPairs_whenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult = simpleBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(0L, 0L);
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   *
   * <ul>
   *   <li>When {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code
   *       true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor,
   * LongBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMapPairs(BitMapExtractor, LongBiPredicate); when LongBiPredicate test(long, long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"
  })
  void testProcessBitMapPairs_whenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapPairsResult = simpleBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(0L, 0L);
    assertTrue(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'false'; when LongPredicate test(long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenFalse_whenLongPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = simpleBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(0L);
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'true'; when LongPredicate test(long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = simpleBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(0L);
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName("Test processBitMaps(LongPredicate); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.processBitMaps(consumer));
    verify(consumer).test(0L);
  }

  /**
   * Test {@link SimpleBloomFilter#processIndices(IntPredicate)}.
   *
   * <ul>
   *   <li>When {@link IntPredicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @DisplayName("Test processIndices(IntPredicate); when IntPredicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleBloomFilter.processIndices(IntPredicate)"})
  void testProcessIndices_whenIntPredicate_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new SimpleBloomFilter(shape).processIndices(mock(IntPredicate.class)));
  }
}
