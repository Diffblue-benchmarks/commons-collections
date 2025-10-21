package org.apache.commons.collections4.bloomfilter;

import static org.mockito.ArgumentMatchers.isA;
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

public class WrappedBloomFilterDiffblueTest {
  /**
   * Test {@link WrappedBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#contains(BitMapExtractor)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BitMapExtractor)"})
  public void testContainsWithBitMapExtractor_givenWrappedBloomFilterContainsReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.contains(Mockito.<BitMapExtractor>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.contains(mock(BitMapExtractor.class));

    // Assert
    verify(wrappedBloomFilter).contains(isA(BitMapExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#contains(BitMapExtractor)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(BitMapExtractor)"})
  public void testContainsWithBitMapExtractor_givenWrappedBloomFilterContainsReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.contains(Mockito.<BitMapExtractor>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.contains(mock(BitMapExtractor.class));

    // Assert
    verify(wrappedBloomFilter).contains(isA(BitMapExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#contains(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#contains(Hasher)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#contains(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(Hasher)"})
  public void testContainsWithHasher_givenWrappedBloomFilterContainsReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.contains(Mockito.<Hasher>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.contains(mock(Hasher.class));

    // Assert
    verify(wrappedBloomFilter).contains(isA(Hasher.class));
  }

  /**
   * Test {@link WrappedBloomFilter#contains(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#contains(Hasher)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#contains(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(Hasher)"})
  public void testContainsWithHasher_givenWrappedBloomFilterContainsReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.contains(Mockito.<Hasher>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.contains(mock(Hasher.class));

    // Assert
    verify(wrappedBloomFilter).contains(isA(Hasher.class));
  }

  /**
   * Test {@link WrappedBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#contains(IndexExtractor)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_givenWrappedBloomFilterContainsReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.contains(Mockito.<IndexExtractor>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.contains(mock(IndexExtractor.class));

    // Assert
    verify(wrappedBloomFilter).contains(isA(IndexExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#contains(IndexExtractor)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.contains(IndexExtractor)"})
  public void testContainsWithIndexExtractor_givenWrappedBloomFilterContainsReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.contains(Mockito.<IndexExtractor>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.contains(mock(IndexExtractor.class));

    // Assert
    verify(wrappedBloomFilter).contains(isA(IndexExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#isFull()}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#isFull()} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#isFull()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.isFull()"})
  public void testIsFull_givenWrappedBloomFilterIsFullReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.isFull()).thenReturn(false);

    // Act
    wrappedBloomFilter.isFull();

    // Assert
    verify(wrappedBloomFilter).isFull();
  }

  /**
   * Test {@link WrappedBloomFilter#isFull()}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#isFull()} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#isFull()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.isFull()"})
  public void testIsFull_givenWrappedBloomFilterIsFullReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.isFull()).thenReturn(true);

    // Act
    wrappedBloomFilter.isFull();

    // Assert
    verify(wrappedBloomFilter).isFull();
  }

  /**
   * Test {@link WrappedBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#merge(BitMapExtractor)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_givenWrappedBloomFilterMergeReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.merge(Mockito.<BitMapExtractor>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.merge(mock(BitMapExtractor.class));

    // Assert
    verify(wrappedBloomFilter).merge(isA(BitMapExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#merge(BitMapExtractor)} with {@code bitMapExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#merge(BitMapExtractor)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#merge(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(BitMapExtractor)"})
  public void testMergeWithBitMapExtractor_givenWrappedBloomFilterMergeReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.merge(Mockito.<BitMapExtractor>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.merge(mock(BitMapExtractor.class));

    // Assert
    verify(wrappedBloomFilter).merge(isA(BitMapExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#merge(Hasher)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#merge(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(Hasher)"})
  public void testMergeWithHasher_givenWrappedBloomFilterMergeReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.merge(Mockito.<Hasher>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.merge(mock(Hasher.class));

    // Assert
    verify(wrappedBloomFilter).merge(isA(Hasher.class));
  }

  /**
   * Test {@link WrappedBloomFilter#merge(Hasher)} with {@code hasher}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#merge(Hasher)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#merge(Hasher)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(Hasher)"})
  public void testMergeWithHasher_givenWrappedBloomFilterMergeReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.merge(Mockito.<Hasher>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.merge(mock(Hasher.class));

    // Assert
    verify(wrappedBloomFilter).merge(isA(Hasher.class));
  }

  /**
   * Test {@link WrappedBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#merge(IndexExtractor)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_givenWrappedBloomFilterMergeReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.merge(Mockito.<IndexExtractor>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.merge(mock(IndexExtractor.class));

    // Assert
    verify(wrappedBloomFilter).merge(isA(IndexExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#merge(IndexExtractor)} with {@code indexExtractor}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#merge(IndexExtractor)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#merge(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.merge(IndexExtractor)"})
  public void testMergeWithIndexExtractor_givenWrappedBloomFilterMergeReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.merge(Mockito.<IndexExtractor>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.merge(mock(IndexExtractor.class));

    // Assert
    verify(wrappedBloomFilter).merge(isA(IndexExtractor.class));
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  public void testProcessBitMapPairs_givenWrappedBloomFilterProcessBitMapPairsReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(false);

    // Act
    wrappedBloomFilter.processBitMapPairs(mock(BitMapExtractor.class), mock(LongBiPredicate.class));

    // Assert
    verify(wrappedBloomFilter).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#processBitMapPairs(BitMapExtractor, LongBiPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.processBitMapPairs(BitMapExtractor, LongBiPredicate)"})
  public void testProcessBitMapPairs_givenWrappedBloomFilterProcessBitMapPairsReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    wrappedBloomFilter.processBitMapPairs(mock(BitMapExtractor.class), mock(LongBiPredicate.class));

    // Assert
    verify(wrappedBloomFilter).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#processBitMaps(LongPredicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenWrappedBloomFilterProcessBitMapsReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.processBitMaps(mock(LongPredicate.class));

    // Assert
    verify(wrappedBloomFilter).processBitMaps(isA(LongPredicate.class));
  }

  /**
   * Test {@link WrappedBloomFilter#processBitMaps(LongPredicate)}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#processBitMaps(LongPredicate)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.processBitMaps(LongPredicate)"})
  public void testProcessBitMaps_givenWrappedBloomFilterProcessBitMapsReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.processBitMaps(mock(LongPredicate.class));

    // Assert
    verify(wrappedBloomFilter).processBitMaps(isA(LongPredicate.class));
  }

  /**
   * Test {@link WrappedBloomFilter#processIndices(IntPredicate)}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#processIndices(IntPredicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.processIndices(IntPredicate)"})
  public void testProcessIndices_givenWrappedBloomFilterProcessIndicesReturnFalse() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    // Act
    wrappedBloomFilter.processIndices(mock(IntPredicate.class));

    // Assert
    verify(wrappedBloomFilter).processIndices(isA(IntPredicate.class));
  }

  /**
   * Test {@link WrappedBloomFilter#processIndices(IntPredicate)}.
   * <ul>
   *   <li>Given {@link WrappedBloomFilter} {@link WrappedBloomFilter#processIndices(IntPredicate)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link WrappedBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean WrappedBloomFilter.processIndices(IntPredicate)"})
  public void testProcessIndices_givenWrappedBloomFilterProcessIndicesReturnTrue() {
    // Arrange
    WrappedBloomFilter<NumberedBloomFilter, SimpleBloomFilter> wrappedBloomFilter = mock(WrappedBloomFilter.class);
    when(wrappedBloomFilter.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    wrappedBloomFilter.processIndices(mock(IntPredicate.class));

    // Assert
    verify(wrappedBloomFilter).processIndices(isA(IntPredicate.class));
  }
}
