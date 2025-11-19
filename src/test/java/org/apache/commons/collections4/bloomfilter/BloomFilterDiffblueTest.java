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
import java.util.function.Supplier;
import org.apache.commons.collections4.bloomfilter.DefaultBloomFilterTest.NonSparseDefaultBloomFilter;
import org.apache.commons.collections4.bloomfilter.DefaultBloomFilterTest.SparseDefaultBloomFilter;
import org.apache.commons.collections4.bloomfilter.LayeredBloomFilterTest.NumberedBloomFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BloomFilterDiffblueTest {
  /**
   * Test {@link BloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <p>Method under test: {@link BloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = simpleBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = simpleBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = simpleBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#contains(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#contains(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#contains(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenThrowIllegalArgumentException() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> arrayCountingBloomFilter.contains(hasher));
    verify(hasher).indices(isA(Shape.class));
  }

  /**
   * Test {@link BloomFilter#contains(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.contains(BloomFilter)"})
  void testContainsWithOther_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualContainsResult =
        arrayCountingBloomFilter.contains((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#estimateIntersection(BloomFilter)}.
   *
   * <p>Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateIntersectionResult =
        arrayCountingBloomFilter.estimateIntersection(new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateIntersectionResult);
  }

  /**
   * Test {@link BloomFilter#estimateIntersection(BloomFilter)}.
   *
   * <p>Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateIntersectionResult =
        arrayCountingBloomFilter.estimateIntersection(new SparseDefaultBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateIntersectionResult);
  }

  /**
   * Test {@link BloomFilter#estimateN()}.
   *
   * <p>Method under test: {@link BloomFilter#estimateN()}
   */
  @Test
  @DisplayName("Test estimateN()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BloomFilter.estimateN()"})
  void testEstimateN() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new ArrayCountingBloomFilter(shape).estimateN());
  }

  /**
   * Test {@link BloomFilter#estimateUnion(BloomFilter)}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test estimateUnion(BloomFilter); when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateUnionResult =
        arrayCountingBloomFilter.estimateUnion(new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateUnionResult);
  }

  /**
   * Test {@link BloomFilter#estimateUnion(BloomFilter)}.
   *
   * <ul>
   *   <li>When {@link SparseDefaultBloomFilter#SparseDefaultBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test estimateUnion(BloomFilter); when SparseDefaultBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion_whenSparseDefaultBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateUnionResult =
        arrayCountingBloomFilter.estimateUnion(new SparseDefaultBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateUnionResult);
  }

  /**
   * Test {@link BloomFilter#isEmpty()}.
   *
   * <p>Method under test: {@link BloomFilter#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.isEmpty()"})
  void testIsEmpty() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayCountingBloomFilter(shape).isEmpty());
  }

  /**
   * Test {@link BloomFilter#isFull()}.
   *
   * <p>Method under test: {@link BloomFilter#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.isFull()"})
  void testIsFull() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertFalse(new ArrayCountingBloomFilter(shape).isFull());
  }

  /**
   * Test {@link BloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <p>Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(Hasher)"})
  void testMergeWithHasher() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.uniqueIndices()).thenThrow(new IllegalArgumentException());

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fixedResult.merge(hasher));
    verify(supplier).get();
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).uniqueIndices();
  }

  /**
   * Test {@link BloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(Hasher)"})
  void testMergeWithHasher_givenIllegalArgumentException() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> fixedResult.merge(hasher));
    verify(supplier).get();
    verify(hasher).indices(isA(Shape.class));
  }

  /**
   * Test {@link BloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return
   *       {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName(
      "Test merge(Hasher) with 'hasher'; given IndexExtractor processIndices(IntPredicate) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(Hasher)"})
  void testMergeWithHasher_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor2);

    // Act
    boolean actualMergeResult = fixedResult.merge(hasher);

    // Assert
    verify(supplier).get();
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link BloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'; then calls getTarget()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(Hasher)"})
  void testMergeWithHasher_thenCallsGetTarget() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    IndexExtractor indexExtractor2 = mock(IndexExtractor.class);
    when(indexExtractor2.uniqueIndices()).thenReturn(indexExtractor);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor2);

    // Act
    boolean actualMergeResult = layeredBloomFilter.merge(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link BloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link BloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName("Test merge(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(BloomFilter)"})
  void testMergeWithOther() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NonSparseDefaultBloomFilter nonSparseDefaultBloomFilter =
        new NonSparseDefaultBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        nonSparseDefaultBloomFilter.merge(new NumberedBloomFilter(shape2, 42, 1));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link BloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NonSparseDefaultBloomFilter nonSparseDefaultBloomFilter =
        new NonSparseDefaultBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        nonSparseDefaultBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link BloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link SparseBloomFilter#SparseBloomFilter(Shape)} with shape is fromKM {@code
   *       19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when SparseBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenSparseBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NonSparseDefaultBloomFilter nonSparseDefaultBloomFilter =
        new NonSparseDefaultBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult = nonSparseDefaultBloomFilter.merge(new SparseBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link BloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link SparseDefaultBloomFilter#SparseDefaultBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link BloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when SparseDefaultBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenSparseDefaultBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NonSparseDefaultBloomFilter nonSparseDefaultBloomFilter =
        new NonSparseDefaultBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        nonSparseDefaultBloomFilter.merge(new SparseDefaultBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link BloomFilter#uniqueIndices()}.
   *
   * <p>Method under test: {@link BloomFilter#uniqueIndices()}
   */
  @Test
  @DisplayName("Test uniqueIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexExtractor BloomFilter.uniqueIndices()"})
  void testUniqueIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    IndexExtractor actualUniqueIndicesResult = new SimpleBloomFilter(shape).uniqueIndices();
    boolean actualProcessIndicesResult =
        actualUniqueIndicesResult.processIndices(mock(IntPredicate.class));

    // Assert
    assertTrue(actualUniqueIndicesResult instanceof SimpleBloomFilter);
    assertEquals(0, ((SimpleBloomFilter) actualUniqueIndicesResult).characteristics());
    assertFalse(((SimpleBloomFilter) actualUniqueIndicesResult).isFull());
    assertTrue(actualProcessIndicesResult);
    assertSame(shape, ((SimpleBloomFilter) actualUniqueIndicesResult).getShape());
  }
}
