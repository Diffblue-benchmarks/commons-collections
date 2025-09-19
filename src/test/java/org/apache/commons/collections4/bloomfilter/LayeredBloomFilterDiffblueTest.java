package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Supplier;
import org.apache.commons.collections4.bloomfilter.DefaultBloomFilterTest.NonSparseDefaultBloomFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LayeredBloomFilterDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LayeredBloomFilter#LayeredBloomFilter(Shape, LayerManager)}
   *   <li>{@link LayeredBloomFilter#getShape()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LayeredBloomFilter.<init>(Shape, LayerManager)",
    "Shape LayeredBloomFilter.getShape()"
  })
  void testGettersAndSetters() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualLayeredBloomFilter =
        new LayeredBloomFilter<>(shape, null);

    // Assert
    assertSame(shape, actualLayeredBloomFilter.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#cardinality()}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#cardinality()}
   */
  @Test
  @DisplayName("Test cardinality(); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LayeredBloomFilter.cardinality()"})
  void testCardinality_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    int actualCardinalityResult = fixedResult.cardinality();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link LayeredBloomFilter#characteristics()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#characteristics()}
   */
  @Test
  @DisplayName("Test characteristics(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LayeredBloomFilter.characteristics()"})
  void testCharacteristics_thenReturnZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    int actualCharacteristicsResult = fixedResult.characteristics();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualCharacteristicsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#cleanup()}.
   *
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#cleanup()} does nothing.
   *   <li>Then calls {@link LayerManager#cleanup()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#cleanup()}
   */
  @Test
  @DisplayName("Test cleanup(); given LayerManager cleanup() does nothing; then calls cleanup()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LayeredBloomFilter.cleanup()"})
  void testCleanup_givenLayerManagerCleanupDoesNothing_thenCallsCleanup() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    doNothing().when(layerManager).cleanup();
    Shape shape = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape, layerManager);

    // Act
    layeredBloomFilter.cleanup();

    // Assert
    verify(layerManager).cleanup();
  }

  /**
   * Test {@link LayeredBloomFilter#cleanup()}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#cleanup()}
   */
  @Test
  @DisplayName("Test cleanup(); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LayeredBloomFilter.cleanup()"})
  void testCleanup_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    fixedResult.cleanup();

    // Assert
    verify(supplier).get();
  }

  /**
   * Test {@link LayeredBloomFilter#clear()}.
   *
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#clear()} does nothing.
   *   <li>Then calls {@link LayerManager#clear()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#clear()}
   */
  @Test
  @DisplayName("Test clear(); given LayerManager clear() does nothing; then calls clear()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LayeredBloomFilter.clear()"})
  void testClear_givenLayerManagerClearDoesNothing_thenCallsClear() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    doNothing().when(layerManager).clear();
    Shape shape = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape, layerManager);

    // Act
    layeredBloomFilter.clear();

    // Assert
    verify(layerManager).clear();
  }

  /**
   * Test {@link LayeredBloomFilter#clear()}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#clear()}
   */
  @Test
  @DisplayName("Test clear(); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LayeredBloomFilter.clear()"})
  void testClear_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    fixedResult.clear();

    // Assert
    verify(supplier, atLeast(1)).get();
  }

  /**
   * Test {@link LayeredBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = fixedResult.contains(bitMapExtractor);

    // Assert
    verify(supplier).get();
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#contains(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualContainsResult = fixedResult.contains(hasher);

    // Assert
    verify(supplier).get();
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName("Test contains(IndexExtractor) with 'indexExtractor'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = fixedResult.contains(indexExtractor);

    // Assert
    verify(supplier).get();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#contains(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(BloomFilter)"})
  void testContainsWithOther_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualContainsResult =
        fixedResult.contains((BloomFilter) new ArrayCountingBloomFilter(shape2));

    // Assert
    verify(supplier).get();
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#copy()}.
   *
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#copy()} return {@link LayerManager}.
   *   <li>Then return Depth is zero.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#copy()}
   */
  @Test
  @DisplayName(
      "Test copy(); given LayerManager copy() return LayerManager; then return Depth is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LayeredBloomFilter LayeredBloomFilter.copy()"})
  void testCopy_givenLayerManagerCopyReturnLayerManager_thenReturnDepthIsZero() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.copy()).thenReturn(mock(LayerManager.class));
    Shape shape = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape, layerManager);

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualCopyResult = layeredBloomFilter.copy();

    // Assert
    verify(layerManager).copy();
    assertEquals(0, actualCopyResult.cardinality());
    assertEquals(0, actualCopyResult.characteristics());
    assertEquals(0, actualCopyResult.getDepth());
    assertFalse(actualCopyResult.isFull());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#copy()}.
   *
   * <ul>
   *   <li>Then return Depth is one.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#copy()}
   */
  @Test
  @DisplayName("Test copy(); then return Depth is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LayeredBloomFilter LayeredBloomFilter.copy()"})
  void testCopy_thenReturnDepthIsOne() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(shape2, 2, supplier);

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualCopyResult = fixedResult.copy();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualCopyResult.cardinality());
    assertEquals(0, actualCopyResult.characteristics());
    assertEquals(1, actualCopyResult.getDepth());
    assertFalse(actualCopyResult.isFull());
    assertSame(shape2, actualCopyResult.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#estimateN()}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#estimateN()}
   */
  @Test
  @DisplayName("Test estimateN(); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LayeredBloomFilter.estimateN()"})
  void testEstimateN_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    int actualEstimateNResult = fixedResult.estimateN();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualEstimateNResult);
  }

  /**
   * Test {@link LayeredBloomFilter#estimateUnion(BloomFilter)}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateUnion(BloomFilter); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LayeredBloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateUnionResult = fixedResult.estimateUnion(new ArrayCountingBloomFilter(shape2));

    // Assert
    verify(supplier).get();
    assertEquals(0, actualEstimateUnionResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(BloomFilter)} with {@code bf}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with zero.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#find(BloomFilter)}
   */
  @Test
  @DisplayName("Test find(BloomFilter) with 'bf'; then return array of int with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(BloomFilter)"})
  void testFindWithBf_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int[] actualFindResult = fixedResult.find((BloomFilter) new ArrayCountingBloomFilter(shape2));

    // Assert
    verify(supplier).get();
    assertArrayEquals(new int[] {0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with zero.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#find(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test find(BitMapExtractor) with 'bitMapExtractor'; then return array of int with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(BitMapExtractor)"})
  void testFindWithBitMapExtractor_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    int[] actualFindResult = fixedResult.find(bitMapExtractor);

    // Assert
    verify(supplier).get();
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertArrayEquals(new int[] {0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with zero.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#find(Hasher)}
   */
  @Test
  @DisplayName("Test find(Hasher) with 'hasher'; then return array of int with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(Hasher)"})
  void testFindWithHasher_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    int[] actualFindResult = fixedResult.find(hasher);

    // Assert
    verify(supplier).get();
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertArrayEquals(new int[] {0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with zero.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#find(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test find(IndexExtractor) with 'indexExtractor'; then return array of int with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(IndexExtractor)"})
  void testFindWithIndexExtractor_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    int[] actualFindResult = fixedResult.find(indexExtractor);

    // Assert
    verify(supplier).get();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertArrayEquals(new int[] {0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#flatten()}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#flatten()}
   */
  @Test
  @DisplayName("Test flatten(); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleBloomFilter LayeredBloomFilter.flatten()"})
  void testFlatten_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(shape2, 2, supplier);

    // Act
    SimpleBloomFilter actualFlattenResult = fixedResult.flatten();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualFlattenResult.characteristics());
    assertFalse(actualFlattenResult.isFull());
    assertSame(shape2, actualFlattenResult.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#get(int)}.
   *
   * <ul>
   *   <li>Then calls {@link LayerManager#get(int)}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#get(int)}
   */
  @Test
  @DisplayName("Test get(int); then calls get(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BloomFilter LayeredBloomFilter.get(int)"})
  void testGet_thenCallsGet() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    when(layerManager.get(anyInt())).thenReturn(arrayCountingBloomFilter);
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);

    // Act
    CountingBloomFilter actualGetResult = layeredBloomFilter.get(2);

    // Assert
    verify(layerManager).get(2);
    assertSame(arrayCountingBloomFilter, actualGetResult);
  }

  /**
   * Test {@link LayeredBloomFilter#get(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#get(int)}
   */
  @Test
  @DisplayName("Test get(int); when zero; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BloomFilter LayeredBloomFilter.get(int)"})
  void testGet_whenZero_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    when(supplier.get()).thenReturn(arrayCountingBloomFilter);
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    CountingBloomFilter actualGetResult = fixedResult.get(0);

    // Assert
    verify(supplier).get();
    assertSame(arrayCountingBloomFilter, actualGetResult);
  }

  /**
   * Test {@link LayeredBloomFilter#getDepth()}.
   *
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#getDepth()} return two.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#getDepth()}
   */
  @Test
  @DisplayName("Test getDepth(); given LayerManager getDepth() return two; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LayeredBloomFilter.getDepth()"})
  void testGetDepth_givenLayerManagerGetDepthReturnTwo_thenReturnTwo() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.getDepth()).thenReturn(2);
    Shape shape = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape, layerManager);

    // Act
    int actualDepth = layeredBloomFilter.getDepth();

    // Assert
    verify(layerManager).getDepth();
    assertEquals(2, actualDepth);
  }

  /**
   * Test {@link LayeredBloomFilter#getDepth()}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#getDepth()}
   */
  @Test
  @DisplayName("Test getDepth(); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LayeredBloomFilter.getDepth()"})
  void testGetDepth_thenReturnOne() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    int actualDepth = fixedResult.getDepth();

    // Assert
    verify(supplier).get();
    assertEquals(1, actualDepth);
  }

  /**
   * Test {@link LayeredBloomFilter#isEmpty()}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.isEmpty()"})
  void testIsEmpty_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    boolean actualIsEmptyResult = fixedResult.isEmpty();

    // Assert
    verify(supplier).get();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BloomFilter)} with {@code bf}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName("Test merge(BloomFilter) with 'bf'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BloomFilter)"})
  void testMergeWithBf_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        fixedResult.merge((BloomFilter) new ArrayCountingBloomFilter(shape2));

    // Assert
    verify(supplier).get();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BloomFilter)} with {@code bf}.
   *
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName("Test merge(BloomFilter) with 'bf'; then calls getTarget()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BloomFilter)"})
  void testMergeWithBf_thenCallsGetTarget() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);
    Shape shape3 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        layeredBloomFilter.merge((BloomFilter) new ArrayCountingBloomFilter(shape3));

    // Assert
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BloomFilter)} with {@code bf}.
   *
   * <ul>
   *   <li>When {@link NonSparseDefaultBloomFilter#NonSparseDefaultBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'bf'; when NonSparseDefaultBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BloomFilter)"})
  void testMergeWithBf_whenNonSparseDefaultBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);
    Shape shape3 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult = layeredBloomFilter.merge(new NonSparseDefaultBloomFilter(shape3));

    // Assert
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BloomFilter)} with {@code bf}.
   *
   * <ul>
   *   <li>When {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code
   *       19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'bf'; when SimpleBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BloomFilter)"})
  void testMergeWithBf_whenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);
    Shape shape3 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult = layeredBloomFilter.merge(new SimpleBloomFilter(shape3));

    // Assert
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test merge(BitMapExtractor) with 'bitMapExtractor'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_givenFalse() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualMergeResult = layeredBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test merge(BitMapExtractor) with 'bitMapExtractor'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = fixedResult.merge(bitMapExtractor);

    // Assert
    verify(supplier).get();
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test merge(BitMapExtractor) with 'bitMapExtractor'; then calls getTarget()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor_thenCallsGetTarget() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(shape));
    Shape shape2 = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape2, layerManager);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = layeredBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName("Test merge(IndexExtractor) with 'indexExtractor'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor_thenCallsGet() {
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

    // Act
    boolean actualMergeResult = fixedResult.merge(indexExtractor2);

    // Assert
    verify(supplier).get();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName("Test merge(IndexExtractor) with 'indexExtractor'; then calls getTarget()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor_thenCallsGetTarget() {
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

    // Act
    boolean actualMergeResult = layeredBloomFilter.merge(indexExtractor2);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    verify(indexExtractor2).uniqueIndices();
    verify(layerManager).getTarget();
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link LayeredBloomFilter#next()}.
   *
   * <p>Method under test: {@link LayeredBloomFilter#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LayeredBloomFilter.next()"})
  void testNext() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    fixedResult.next();

    // Assert
    verify(supplier, atLeast(1)).get();
    assertEquals(2, fixedResult.getDepth());
  }

  /**
   * Test {@link LayeredBloomFilter#next()}.
   *
   * <p>Method under test: {@link LayeredBloomFilter#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LayeredBloomFilter.next()"})
  void testNext2() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    doNothing().when(layerManager).next();
    Shape shape = Shape.fromKM(19088743, 10);

    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter =
        new LayeredBloomFilter<>(shape, layerManager);

    // Act
    layeredBloomFilter.next();

    // Assert that nothing has changed
    verify(layerManager).next();
    assertEquals(0, layeredBloomFilter.getDepth());
  }

  /**
   * Test {@link LayeredBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'true'; when LongPredicate test(long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    LongPredicate predicate = mock(LongPredicate.class);
    when(predicate.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = fixedResult.processBitMaps(predicate);

    // Assert
    verify(predicate).test(0L);
    verify(supplier).get();
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName("Test processBitMaps(LongPredicate); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_thenReturnFalse() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    LongPredicate predicate = mock(LongPredicate.class);
    when(predicate.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = fixedResult.processBitMaps(predicate);

    // Assert
    verify(predicate).test(0L);
    verify(supplier).get();
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#processIndices(IntPredicate)}.
   *
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.
   * </ul>
   *
   * <p>Method under test: {@link LayeredBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @DisplayName("Test processIndices(IntPredicate); then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LayeredBloomFilter.processIndices(IntPredicate)"})
  void testProcessIndices_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult =
        LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2, supplier);

    // Act
    boolean actualProcessIndicesResult = fixedResult.processIndices(mock(IntPredicate.class));

    // Assert
    verify(supplier).get();
    assertTrue(actualProcessIndicesResult);
  }
}
