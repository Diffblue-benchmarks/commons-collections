package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Supplier;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class LayeredBloomFilterDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link LayeredBloomFilter#LayeredBloomFilter(Shape, LayerManager)}
   *   <li>{@link LayeredBloomFilter#getShape()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.<init>(Shape, LayerManager)", "Shape LayeredBloomFilter.getShape()"})
  public void testGettersAndSetters() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualLayeredBloomFilter = new LayeredBloomFilter<>(shape, null);

    // Assert
    assertSame(shape, actualLayeredBloomFilter.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#cardinality()}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#cardinality()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LayeredBloomFilter.cardinality()"})
  public void testCardinality_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    int actualCardinalityResult = fixedResult.cardinality();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link LayeredBloomFilter#characteristics()}.
   * <ul>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#characteristics()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LayeredBloomFilter.characteristics()"})
  public void testCharacteristics_thenReturnZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    int actualCharacteristicsResult = fixedResult.characteristics();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualCharacteristicsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#cleanup()}.
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#cleanup()} does nothing.</li>
   *   <li>Then calls {@link LayerManager#cleanup()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#cleanup()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.cleanup()"})
  public void testCleanup_givenLayerManagerCleanupDoesNothing_thenCallsCleanup() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    doNothing().when(layerManager).cleanup();
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);

    // Act
    layeredBloomFilter.cleanup();

    // Assert
    verify(layerManager).cleanup();
  }

  /**
   * Test {@link LayeredBloomFilter#cleanup()}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#cleanup()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.cleanup()"})
  public void testCleanup_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    fixedResult.cleanup();

    // Assert
    verify(supplier).get();
  }

  /**
   * Test {@link LayeredBloomFilter#clear()}.
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#clear()} does nothing.</li>
   *   <li>Then calls {@link LayerManager#clear()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.clear()"})
  public void testClear_givenLayerManagerClearDoesNothing_thenCallsClear() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    doNothing().when(layerManager).clear();
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);

    // Act
    layeredBloomFilter.clear();

    // Assert
    verify(layerManager).clear();
  }

  /**
   * Test {@link LayeredBloomFilter#clear()}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.clear()"})
  public void testClear_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    fixedResult.clear();

    // Assert
    verify(supplier, atLeast(1)).get();
  }

  /**
   * Test {@link LayeredBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(BitMapExtractor)"})
  public void testContainsWithBitMapExtractor_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#contains(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(Hasher)"})
  public void testContainsWithHasher_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#contains(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.contains(BloomFilter)"})
  public void testContainsWithOther_thenReturnTrue() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    boolean actualContainsResult = fixedResult
        .contains((BloomFilter) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));

    // Assert
    verify(supplier).get();
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#copy()}.
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#copy()} return {@link LayerManager}.</li>
   *   <li>Then return Depth is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#copy()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LayeredBloomFilter LayeredBloomFilter.copy()"})
  public void testCopy_givenLayerManagerCopyReturnLayerManager_thenReturnDepthIsZero() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.copy()).thenReturn(mock(LayerManager.class));
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(shape, layerManager);

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
   * <ul>
   *   <li>Then return Depth is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#copy()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LayeredBloomFilter LayeredBloomFilter.copy()"})
  public void testCopy_thenReturnDepthIsOne() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2, supplier);

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualCopyResult = fixedResult.copy();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualCopyResult.cardinality());
    assertEquals(0, actualCopyResult.characteristics());
    assertEquals(1, actualCopyResult.getDepth());
    assertFalse(actualCopyResult.isFull());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#estimateN()}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#estimateN()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LayeredBloomFilter.estimateN()"})
  public void testEstimateN_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    int actualEstimateNResult = fixedResult.estimateN();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualEstimateNResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(BloomFilter)} with {@code bf}.
   * <ul>
   *   <li>Then return array of {@code int} with zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#find(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(BloomFilter)"})
  public void testFindWithBf_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    int[] actualFindResult = fixedResult.find((BloomFilter) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));

    // Assert
    verify(supplier).get();
    assertArrayEquals(new int[]{0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Then return array of {@code int} with zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#find(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(BitMapExtractor)"})
  public void testFindWithBitMapExtractor_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    int[] actualFindResult = fixedResult.find(bitMapExtractor);

    // Assert
    verify(supplier).get();
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertArrayEquals(new int[]{0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Then return array of {@code int} with zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#find(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(Hasher)"})
  public void testFindWithHasher_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
    assertArrayEquals(new int[]{0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#find(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Then return array of {@code int} with zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#find(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] LayeredBloomFilter.find(IndexExtractor)"})
  public void testFindWithIndexExtractor_thenReturnArrayOfIntWithZero() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    int[] actualFindResult = fixedResult.find(indexExtractor);

    // Assert
    verify(supplier).get();
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertArrayEquals(new int[]{0}, actualFindResult);
  }

  /**
   * Test {@link LayeredBloomFilter#flatten()}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#flatten()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SimpleBloomFilter LayeredBloomFilter.flatten()"})
  public void testFlatten_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2, supplier);

    // Act
    SimpleBloomFilter actualFlattenResult = fixedResult.flatten();

    // Assert
    verify(supplier).get();
    assertEquals(0, actualFlattenResult.characteristics());
    assertFalse(actualFlattenResult.isFull());
    assertSame(shape, actualFlattenResult.getShape());
  }

  /**
   * Test {@link LayeredBloomFilter#get(int)}.
   * <ul>
   *   <li>Then return {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BloomFilter LayeredBloomFilter.get(int)"})
  public void testGet_thenReturnArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    when(layerManager.get(anyInt())).thenReturn(arrayCountingBloomFilter);
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);

    // Act
    CountingBloomFilter actualGetResult = layeredBloomFilter.get(2);

    // Assert
    verify(layerManager).get(eq(2));
    assertSame(arrayCountingBloomFilter, actualGetResult);
  }

  /**
   * Test {@link LayeredBloomFilter#getDepth()}.
   * <ul>
   *   <li>Given {@link LayerManager} {@link LayerManager#getDepth()} return two.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#getDepth()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LayeredBloomFilter.getDepth()"})
  public void testGetDepth_givenLayerManagerGetDepthReturnTwo_thenReturnTwo() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.getDepth()).thenReturn(2);
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);

    // Act
    int actualDepth = layeredBloomFilter.getDepth();

    // Assert
    verify(layerManager).getDepth();
    assertEquals(2, actualDepth);
  }

  /**
   * Test {@link LayeredBloomFilter#getDepth()}.
   * <ul>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#getDepth()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LayeredBloomFilter.getDepth()"})
  public void testGetDepth_thenReturnOne() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    int actualDepth = fixedResult.getDepth();

    // Assert
    verify(supplier).get();
    assertEquals(1, actualDepth);
  }

  /**
   * Test {@link LayeredBloomFilter#isEmpty()}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.isEmpty()"})
  public void testIsEmpty_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    boolean actualIsEmptyResult = fixedResult.isEmpty();

    // Assert
    verify(supplier).get();
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link LayeredBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_givenFalse() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);
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
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_thenCallsGetTarget() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);
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
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_thenCallsGetTarget() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);
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
   * <p>
   * Method under test: {@link LayeredBloomFilter#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.next()"})
  public void testNext() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    fixedResult.next();

    // Assert
    verify(supplier, atLeast(1)).get();
    assertEquals(2, fixedResult.getDepth());
  }

  /**
   * Test {@link LayeredBloomFilter#next()}.
   * <p>
   * Method under test: {@link LayeredBloomFilter#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LayeredBloomFilter.next()"})
  public void testNext2() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    doNothing().when(layerManager).next();
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);

    // Act
    layeredBloomFilter.next();

    // Assert that nothing has changed
    verify(layerManager).next();
    assertEquals(0, layeredBloomFilter.getDepth());
  }

  /**
   * Test {@link LayeredBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
    LongPredicate predicate = mock(LongPredicate.class);
    when(predicate.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = fixedResult.processBitMaps(predicate);

    // Assert
    verify(predicate).test(eq(0L));
    verify(supplier).get();
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link LayeredBloomFilter#processIndices(IntPredicate)}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LayeredBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LayeredBloomFilter.processIndices(IntPredicate)"})
  public void testProcessIndices_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    boolean actualProcessIndicesResult = fixedResult.processIndices(mock(IntPredicate.class));

    // Assert
    verify(supplier).get();
    assertTrue(actualProcessIndicesResult);
  }
}
