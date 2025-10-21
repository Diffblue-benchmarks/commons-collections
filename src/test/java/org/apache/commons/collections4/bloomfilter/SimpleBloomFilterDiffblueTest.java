package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import org.apache.commons.collections4.bloomfilter.LayeredBloomFilterTest.NumberedBloomFilter;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class SimpleBloomFilterDiffblueTest {
  /**
   * Test {@link SimpleBloomFilter#SimpleBloomFilter(Shape)}.
   * <ul>
   *   <li>Then return characteristics is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#SimpleBloomFilter(Shape)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SimpleBloomFilter.<init>(Shape)"})
  public void testNewSimpleBloomFilter_thenReturnCharacteristicsIsZero() {
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
   * <p>
   * Method under test: {@link SimpleBloomFilter#asBitMapArray()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long[] SimpleBloomFilter.asBitMapArray()"})
  public void testAsBitMapArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).asBitMapArray());
  }

  /**
   * Test {@link SimpleBloomFilter#cardinality()}.
   * <ul>
   *   <li>Given {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#cardinality()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SimpleBloomFilter.cardinality()"})
  public void testCardinality_givenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).cardinality());
  }

  /**
   * Test {@link SimpleBloomFilter#cardinality()}.
   * <ul>
   *   <li>Then calls {@link BitMapExtractor#processBitMaps(LongPredicate)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#cardinality()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SimpleBloomFilter.cardinality()"})
  public void testCardinality_thenCallsProcessBitMaps() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    simpleBloomFilter.merge(bitMapExtractor);

    // Act
    int actualCardinalityResult = simpleBloomFilter.cardinality();

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link SimpleBloomFilter#characteristics()}.
   * <p>
   * Method under test: {@link SimpleBloomFilter#characteristics()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SimpleBloomFilter.characteristics()"})
  public void testCharacteristics() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).characteristics());
  }

  /**
   * Test {@link SimpleBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.contains(indexExtractor));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#copy()}.
   * <p>
   * Method under test: {@link SimpleBloomFilter#copy()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SimpleBloomFilter SimpleBloomFilter.copy()"})
  public void testCopy() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SimpleBloomFilter actualCopyResult = (new SimpleBloomFilter(shape)).copy();

    // Assert
    assertEquals(0, actualCopyResult.characteristics());
    assertFalse(actualCopyResult.isFull());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Test {@link SimpleBloomFilter#getShape()}.
   * <p>
   * Method under test: {@link SimpleBloomFilter#getShape()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Shape SimpleBloomFilter.getShape()"})
  public void testGetShape() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertSame(shape, (new SimpleBloomFilter(shape)).getShape());
  }

  /**
   * Test {@link SimpleBloomFilter#isEmpty()}.
   * <ul>
   *   <li>Given {@link BitMapExtractor} {@link BitMapExtractor#processBitMaps(LongPredicate)} return {@code true}.</li>
   *   <li>Then calls {@link BitMapExtractor#processBitMaps(LongPredicate)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.isEmpty()"})
  public void testIsEmpty_givenBitMapExtractorProcessBitMapsReturnTrue_thenCallsProcessBitMaps() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    simpleBloomFilter.merge(bitMapExtractor);

    // Act
    boolean actualIsEmptyResult = simpleBloomFilter.isEmpty();

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualIsEmptyResult);
  }

  /**
   * Test {@link SimpleBloomFilter#isEmpty()}.
   * <ul>
   *   <li>Given {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.isEmpty()"})
  public void testIsEmpty_givenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange, Act and Assert
    assertTrue((new SimpleBloomFilter(Shape.fromKM(19088743, 10))).isEmpty());
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any()))
        .thenThrow(new IllegalArgumentException("bitMapExtractor"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(bitMapExtractor));
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(Hasher)"})
  public void testMergeWithHasher_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * Test {@link SimpleBloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(Hasher)"})
  public void testMergeWithHasher_thenThrowIllegalArgumentException() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenThrow(new IllegalArgumentException("hasher"));
    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IllegalArgumentException("indexExtractor"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(indexExtractor));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SimpleBloomFilter#merge(BloomFilter)} with {@code other}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>Then calls {@link WrappedBloomFilter#characteristics()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BloomFilter)"})
  public void testMergeWithOther_givenZero_thenCallsCharacteristics() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
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
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.merge(BloomFilter)"})
  public void testMergeWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>When {@link BitMapExtractor} {@link BitMapExtractor#processBitMaps(LongPredicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  public void testProcessBitMapPairs_whenBitMapExtractorProcessBitMapsReturnFalse() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult = simpleBloomFilter.processBitMapPairs(other, mock(LongBiPredicate.class));

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>When {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  public void testProcessBitMapPairs_whenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapPairsResult = simpleBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(eq(0L), eq(0L));
    assertFalse(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>When {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  public void testProcessBitMapPairs_whenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor other = mock(BitMapExtractor.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapPairsResult = simpleBloomFilter.processBitMapPairs(other, func);

    // Assert
    verify(other).processBitMaps(isA(LongPredicate.class));
    verify(func).test(eq(0L), eq(0L));
    assertTrue(actualProcessBitMapPairsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenFalse_whenLongPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = simpleBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(eq(0L));
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = simpleBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(eq(0L));
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SimpleBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_thenThrowIllegalArgumentException() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenThrow(new IllegalArgumentException("consumer"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.processBitMaps(consumer));
    verify(consumer).test(eq(0L));
  }

  /**
   * Test {@link SimpleBloomFilter#processIndices(IntPredicate)}.
   * <ul>
   *   <li>When {@link IntPredicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SimpleBloomFilter.processIndices(IntPredicate)"})
  public void testProcessIndices_whenIntPredicate_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new SimpleBloomFilter(Shape.fromKM(19088743, 10))).processIndices(mock(IntPredicate.class)));
  }
}
