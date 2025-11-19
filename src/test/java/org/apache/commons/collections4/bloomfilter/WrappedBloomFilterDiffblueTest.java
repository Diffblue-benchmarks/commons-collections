package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
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
import org.apache.commons.collections4.bloomfilter.DefaultBloomFilterTest.SparseDefaultBloomFilter;
import org.apache.commons.collections4.bloomfilter.LayeredBloomFilterTest.NumberedBloomFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WrappedBloomFilterDiffblueTest {
  /**
   * Test {@link WrappedBloomFilter#asBitMapArray()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#asBitMapArray()}
   */
  @Test
  @DisplayName("Test asBitMapArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] WrappedBloomFilter.asBitMapArray()"})
  void testAsBitMapArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertArrayEquals(new long[] {0L}, new NumberedBloomFilter(shape, 42, 1).asBitMapArray());
  }

  /**
   * Test {@link WrappedBloomFilter#asIndexArray()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#asIndexArray()}
   */
  @Test
  @DisplayName("Test asIndexArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] WrappedBloomFilter.asIndexArray()"})
  void testAsIndexArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertArrayEquals(new int[] {}, new NumberedBloomFilter(shape, 42, 1).asIndexArray());
  }

  /**
   * Test {@link WrappedBloomFilter#cardinality()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#cardinality()}
   */
  @Test
  @DisplayName("Test cardinality()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.cardinality()"})
  void testCardinality() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new NumberedBloomFilter(shape, 42, 1).cardinality());
  }

  /**
   * Test {@link WrappedBloomFilter#characteristics()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#characteristics()}
   */
  @Test
  @DisplayName("Test characteristics()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.characteristics()"})
  void testCharacteristics() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new NumberedBloomFilter(shape, 42, 1).characteristics());
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test contains(BitMapExtractor) with 'bitMapExtractor'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(Hasher)} with {@code hasher}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(Hasher)}
   */
  @Test
  @DisplayName("Test contains(Hasher) with 'hasher'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(Hasher)"})
  void testContainsWithHasher_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = numberedBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BloomFilter)"})
  void testContainsWithOther() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualContainsResult =
        numberedBloomFilter.contains((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BloomFilter)"})
  void testContainsWithOther2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualContainsResult =
        numberedBloomFilter.contains(new SparseDefaultBloomFilter(shape2));

    // Assert
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#contains(BloomFilter)}
   */
  @Test
  @DisplayName("Test contains(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BloomFilter)"})
  void testContainsWithOther3() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualContainsResult =
        numberedBloomFilter.contains(new NumberedBloomFilter(shape2, 42, 1));

    // Assert
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#estimateIntersection(BloomFilter)}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateIntersectionResult =
        numberedBloomFilter.estimateIntersection(new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateIntersectionResult);
  }

  /**
   * Test {@link WrappedBloomFilter#estimateIntersection(BloomFilter)}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateIntersectionResult =
        numberedBloomFilter.estimateIntersection(new NumberedBloomFilter(shape2, 42, 1));

    // Assert
    assertEquals(0, actualEstimateIntersectionResult);
  }

  /**
   * Test {@link WrappedBloomFilter#estimateIntersection(BloomFilter)}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateIntersection(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateIntersection(BloomFilter)"})
  void testEstimateIntersection3() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateIntersectionResult =
        numberedBloomFilter.estimateIntersection(new SimpleBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateIntersectionResult);
  }

  /**
   * Test {@link WrappedBloomFilter#estimateN()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateN()}
   */
  @Test
  @DisplayName("Test estimateN()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateN()"})
  void testEstimateN() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new NumberedBloomFilter(shape, 42, 1).estimateN());
  }

  /**
   * Test {@link WrappedBloomFilter#estimateUnion(BloomFilter)}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateUnion(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateUnionResult =
        numberedBloomFilter.estimateUnion(new NumberedBloomFilter(shape2, 42, 1));

    // Assert
    assertEquals(0, actualEstimateUnionResult);
  }

  /**
   * Test {@link WrappedBloomFilter#estimateUnion(BloomFilter)}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName("Test estimateUnion(BloomFilter)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion2() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateUnionResult =
        numberedBloomFilter.estimateUnion(new SimpleBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateUnionResult);
  }

  /**
   * Test {@link WrappedBloomFilter#estimateUnion(BloomFilter)}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test estimateUnion(BloomFilter); when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int WrappedBloomFilter.estimateUnion(BloomFilter)"})
  void testEstimateUnion_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    int actualEstimateUnionResult =
        numberedBloomFilter.estimateUnion(new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0, actualEstimateUnionResult);
  }

  /**
   * Test {@link WrappedBloomFilter#getShape()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#getShape()}
   */
  @Test
  @DisplayName("Test getShape()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Shape WrappedBloomFilter.getShape()"})
  void testGetShape() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertSame(shape, new NumberedBloomFilter(shape, 42, 1).getShape());
  }

  /**
   * Test {@link WrappedBloomFilter#getWrapped()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#getWrapped()}
   */
  @Test
  @DisplayName("Test getWrapped()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BloomFilter WrappedBloomFilter.getWrapped()"})
  void testGetWrapped() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SimpleBloomFilter actualWrapped = new NumberedBloomFilter(shape, 42, 1).getWrapped();

    // Assert
    assertEquals(0, actualWrapped.characteristics());
    assertFalse(actualWrapped.isFull());
    assertSame(shape, actualWrapped.getShape());
  }

  /**
   * Test {@link WrappedBloomFilter#isFull()}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.isFull()"})
  void testIsFull() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertFalse(new NumberedBloomFilter(shape, 42, 1).isFull());
  }

  /**
   * Test {@link WrappedBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test merge(BitMapExtractor) with 'bitMapExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(BitMapExtractor)"})
  void testMergeWithBitMapExtractor() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = numberedBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link WrappedBloomFilter#merge(Hasher)} with {@code hasher}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#merge(Hasher)}
   */
  @Test
  @DisplayName("Test merge(Hasher) with 'hasher'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(Hasher)"})
  void testMergeWithHasher() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualMergeResult = numberedBloomFilter.merge(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link WrappedBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @DisplayName("Test merge(IndexExtractor) with 'indexExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(IndexExtractor)"})
  void testMergeWithIndexExtractor() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = numberedBloomFilter.merge(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link WrappedBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <p>Method under test: {@link WrappedBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName("Test merge(BloomFilter) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult = numberedBloomFilter.merge(new NumberedBloomFilter(shape2, 42, 1));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link WrappedBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is
   *       fromKM {@code 19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when ArrayCountingBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult =
        numberedBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link WrappedBloomFilter#merge(BloomFilter)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code
   *       19088743} and ten.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#merge(BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test merge(BloomFilter) with 'other'; when SimpleBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(BloomFilter)"})
  void testMergeWithOther_whenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    boolean actualMergeResult = numberedBloomFilter.merge(new SimpleBloomFilter(shape2));

    // Assert
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor,
   * LongBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMapPairs(BitMapExtractor, LongBiPredicate); given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WrappedBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"
  })
  void testProcessBitMapPairs_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult =
        numberedBloomFilter.processBitMapPairs(other, mock(LongBiPredicate.class));

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor,
   * LongBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMapPairs(BitMapExtractor, LongBiPredicate); given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WrappedBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"
  })
  void testProcessBitMapPairs_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapPairsResult = numberedBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(0L, 0L);
    assertTrue(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'false'; when LongPredicate test(long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenFalse_whenLongPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    LongPredicate predicate = mock(LongPredicate.class);
    when(predicate.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = numberedBloomFilter.processBitMaps(predicate);

    // Assert
    verify(predicate).test(0L);
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'true'; when LongPredicate test(long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter numberedBloomFilter = new NumberedBloomFilter(shape, 42, 1);

    LongPredicate predicate = mock(LongPredicate.class);
    when(predicate.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = numberedBloomFilter.processBitMaps(predicate);

    // Assert
    verify(predicate).test(0L);
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link WrappedBloomFilter#processIndices(IntPredicate)}.
   *
   * <ul>
   *   <li>When {@link IntPredicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WrappedBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @DisplayName("Test processIndices(IntPredicate); when IntPredicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WrappedBloomFilter.processIndices(IntPredicate)"})
  void testProcessIndices_whenIntPredicate_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new NumberedBloomFilter(shape, 42, 1).processIndices(mock(IntPredicate.class)));
  }
}
