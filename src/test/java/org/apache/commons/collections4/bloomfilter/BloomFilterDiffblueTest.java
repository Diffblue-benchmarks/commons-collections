package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Supplier;
import org.apache.commons.collections4.bloomfilter.DefaultBloomFilterTest.SparseDefaultBloomFilter;
import org.apache.commons.collections4.bloomfilter.LayeredBloomFilterTest.NumberedBloomFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BloomFilterDiffblueTest {
  /**
   * Test {@link BloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   * <p>
   * Method under test: {@link BloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromNP(1000, 0.25d));
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
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnFalse() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnTrue() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
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
   * Test {@link BloomFilter#contains(BloomFilter)} with {@code other}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'; given 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(BloomFilter)"})
  void testContainsWithOther_givenFalse_thenReturnFalse() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(other);

    // Assert
    verify(other).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link BloomFilter#contains(BloomFilter)} with {@code other}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.contains(BloomFilter)"})
  void testContainsWithOther_thenReturnTrue() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(
        arrayCountingBloomFilter.contains((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link BloomFilter#estimateIntersection(BloomFilter)}.
   * <p>
   * Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0,
        arrayCountingBloomFilter.estimateIntersection(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link BloomFilter#estimateIntersection(BloomFilter)}.
   * <p>
   * Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0,
        arrayCountingBloomFilter.estimateIntersection(new SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link BloomFilter#estimateIntersection(BloomFilter)}.
   * <ul>
   *   <li>Then calls {@link WrappedBloomFilter#cardinality()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter); then calls cardinality()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection_thenCallsCardinality() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(10, 1));
    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.cardinality()).thenReturn(1);

    // Act
    int actualEstimateIntersectionResult = arrayCountingBloomFilter.estimateIntersection(other);

    // Assert
    verify(other).cardinality();
    assertEquals(0, actualEstimateIntersectionResult);
  }

  /**
   * Test {@link BloomFilter#estimateN()}.
   * <p>
   * Method under test: {@link BloomFilter#estimateN()}
   */
  @Test
  @DisplayName("Test estimateN()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BloomFilter.estimateN()"})
  void testEstimateN() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).estimateN());
  }

  /**
   * Test {@link BloomFilter#estimateUnion(BloomFilter)}.
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateUnion(BloomFilter); when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0, arrayCountingBloomFilter.estimateUnion(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link BloomFilter#estimateUnion(BloomFilter)}.
   * <ul>
   *   <li>When {@link SparseDefaultBloomFilter#SparseDefaultBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateUnion(BloomFilter); when SparseDefaultBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion_whenSparseDefaultBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0, arrayCountingBloomFilter.estimateUnion(new SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link BloomFilter#isEmpty()}.
   * <p>
   * Method under test: {@link BloomFilter#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.isEmpty()"})
  void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).isEmpty());
  }

  /**
   * Test {@link BloomFilter#isFull()}.
   * <p>
   * Method under test: {@link BloomFilter#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.isFull()"})
  void testIsFull() {
    // Arrange, Act and Assert
    assertFalse((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).isFull());
  }

  /**
   * Test {@link BloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Then calls {@link Supplier#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'; then calls get()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.merge(Hasher)"})
  void testMergeWithHasher_thenCallsGet() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);
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
   * <ul>
   *   <li>Then calls {@link LayerManager#getTarget()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'; then calls getTarget()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BloomFilter.merge(Hasher)"})
  void testMergeWithHasher_thenCallsGetTarget() {
    // Arrange
    LayerManager<CountingBloomFilter> layerManager = mock(LayerManager.class);
    when(layerManager.getTarget()).thenReturn(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));
    LayeredBloomFilter<CountingBloomFilter> layeredBloomFilter = new LayeredBloomFilter<>(Shape.fromKM(19088743, 10),
        layerManager);
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
   * Test {@link BloomFilter#uniqueIndices()}.
   * <p>
   * Method under test: {@link BloomFilter#uniqueIndices()}
   */
  @Test
  @DisplayName("Test uniqueIndices()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor BloomFilter.uniqueIndices()"})
  void testUniqueIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    IndexExtractor actualUniqueIndicesResult = (new SimpleBloomFilter(shape)).uniqueIndices();
    boolean actualProcessIndicesResult = actualUniqueIndicesResult.processIndices(mock(IntPredicate.class));

    // Assert
    assertTrue(actualUniqueIndicesResult instanceof SimpleBloomFilter);
    assertEquals(0, ((SimpleBloomFilter) actualUniqueIndicesResult).characteristics());
    assertFalse(((SimpleBloomFilter) actualUniqueIndicesResult).isFull());
    assertTrue(actualProcessIndicesResult);
    assertSame(shape, ((SimpleBloomFilter) actualUniqueIndicesResult).getShape());
  }
}
