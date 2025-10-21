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
import static org.mockito.Mockito.atLeast;
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

public class SparseBloomFilterDiffblueTest {
  /**
   * Test {@link SparseBloomFilter#SparseBloomFilter(Shape)}.
   * <ul>
   *   <li>When fromKM {@code 19088743} and ten.</li>
   *   <li>Then return cardinality is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#SparseBloomFilter(Shape)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SparseBloomFilter.<init>(Shape)"})
  public void testNewSparseBloomFilter_whenFromKM19088743AndTen_thenReturnCardinalityIsZero() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SparseBloomFilter actualSparseBloomFilter = new SparseBloomFilter(shape);

    // Assert
    assertEquals(0, actualSparseBloomFilter.cardinality());
    assertEquals(1, actualSparseBloomFilter.characteristics());
    assertFalse(actualSparseBloomFilter.isFull());
    assertTrue(actualSparseBloomFilter.isEmpty());
    assertSame(shape, actualSparseBloomFilter.getShape());
  }

  /**
   * Test {@link SparseBloomFilter#asBitMapArray()}.
   * <p>
   * Method under test: {@link SparseBloomFilter#asBitMapArray()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long[] SparseBloomFilter.asBitMapArray()"})
  public void testAsBitMapArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, (new SparseBloomFilter(Shape.fromKM(19088743, 10))).asBitMapArray());
  }

  /**
   * Test {@link SparseBloomFilter#cardinality()}.
   * <p>
   * Method under test: {@link SparseBloomFilter#cardinality()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SparseBloomFilter.cardinality()"})
  public void testCardinality() {
    // Arrange, Act and Assert
    assertEquals(0, (new SparseBloomFilter(Shape.fromKM(19088743, 10))).cardinality());
  }

  /**
   * Test {@link SparseBloomFilter#characteristics()}.
   * <p>
   * Method under test: {@link SparseBloomFilter#characteristics()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SparseBloomFilter.characteristics()"})
  public void testCharacteristics() {
    // Arrange, Act and Assert
    assertEquals(1, (new SparseBloomFilter(Shape.fromKM(19088743, 10))).characteristics());
  }

  /**
   * Test {@link SparseBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.contains(BitMapExtractor)"})
  public void testContainsWithBitMapExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = sparseBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link SparseBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.contains(BitMapExtractor)"})
  public void testContainsWithBitMapExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = sparseBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link SparseBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = sparseBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link SparseBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = sparseBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link SparseBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> sparseBloomFilter.contains(indexExtractor));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SparseBloomFilter#copy()}.
   * <p>
   * Method under test: {@link SparseBloomFilter#copy()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SparseBloomFilter SparseBloomFilter.copy()"})
  public void testCopy() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SparseBloomFilter actualCopyResult = (new SparseBloomFilter(shape)).copy();

    // Assert
    assertEquals(0, actualCopyResult.cardinality());
    assertEquals(1, actualCopyResult.characteristics());
    assertFalse(actualCopyResult.isFull());
    assertTrue(actualCopyResult.isEmpty());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Test {@link SparseBloomFilter#getShape()}.
   * <p>
   * Method under test: {@link SparseBloomFilter#getShape()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Shape SparseBloomFilter.getShape()"})
  public void testGetShape() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertSame(shape, (new SparseBloomFilter(shape)).getShape());
  }

  /**
   * Test {@link SparseBloomFilter#isEmpty()}.
   * <p>
   * Method under test: {@link SparseBloomFilter#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.isEmpty()"})
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new SparseBloomFilter(Shape.fromKM(19088743, 10))).isEmpty());
  }

  /**
   * Test {@link SparseBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_givenFalse() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SparseBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_givenTrue() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SparseBloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Given {@link IndexExtractor} {@link IndexExtractor#processIndices(IntPredicate)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(Hasher)"})
  public void testMergeWithHasher_givenIndexExtractorProcessIndicesReturnTrue_thenReturnTrue() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);
    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(hasher);

    // Assert
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SparseBloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(Hasher)"})
  public void testMergeWithHasher_thenThrowIllegalArgumentException() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenThrow(new IllegalArgumentException("hasher"));
    Hasher hasher = mock(Hasher.class);
    when(hasher.indices(Mockito.<Shape>any())).thenReturn(indexExtractor);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> sparseBloomFilter.merge(hasher));
    verify(hasher).indices(isA(Shape.class));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SparseBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SparseBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_thenThrowIllegalArgumentException() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any()))
        .thenThrow(new IllegalArgumentException("indexExtractor"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> sparseBloomFilter.merge(indexExtractor));
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link SparseBloomFilter#merge(BloomFilter)} with {@code other}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NumberedBloomFilter} {@link WrappedBloomFilter#processBitMaps(LongPredicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(BloomFilter)"})
  public void testMergeWithOther_givenFalse_whenNumberedBloomFilterProcessBitMapsReturnFalse() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);
    when(other.characteristics()).thenReturn(0);

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(other);

    // Assert
    verify(other).characteristics();
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SparseBloomFilter#merge(BloomFilter)} with {@code other}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then calls {@link WrappedBloomFilter#characteristics()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(BloomFilter)"})
  public void testMergeWithOther_givenTrue_thenCallsCharacteristics() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    NumberedBloomFilter other = mock(NumberedBloomFilter.class);
    when(other.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);
    when(other.characteristics()).thenReturn(0);

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(other);

    // Assert
    verify(other).characteristics();
    verify(other).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualMergeResult);
  }

  /**
   * Test {@link SparseBloomFilter#merge(BloomFilter)} with {@code other}.
   * <ul>
   *   <li>When {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.merge(BloomFilter)"})
  public void testMergeWithOther_whenArrayCountingBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Test {@link SparseBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenFalse_whenLongPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = sparseBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(eq(0L));
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SparseBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@link SparseBloomFilter#SparseBloomFilter(Shape)} with shape is fromNP one thousand and {@code 0.25}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenSparseBloomFilterWithShapeIsFromNPOneThousandAnd025() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromNP(1000, 0.25d));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = sparseBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer, atLeast(1)).test(eq(0L));
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SparseBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = sparseBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(eq(0L));
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link SparseBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_thenThrowIllegalArgumentException() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));
    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenThrow(new IllegalArgumentException("consumer"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> sparseBloomFilter.processBitMaps(consumer));
    verify(consumer).test(eq(0L));
  }

  /**
   * Test {@link SparseBloomFilter#processIndices(IntPredicate)}.
   * <ul>
   *   <li>When {@link IntPredicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SparseBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SparseBloomFilter.processIndices(IntPredicate)"})
  public void testProcessIndices_whenIntPredicate_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new SparseBloomFilter(Shape.fromKM(19088743, 10))).processIndices(mock(IntPredicate.class)));
  }
}
