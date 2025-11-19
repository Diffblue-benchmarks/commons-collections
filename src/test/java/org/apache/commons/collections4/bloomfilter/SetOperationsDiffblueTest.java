package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.LongPredicate;
import org.apache.commons.collections4.bloomfilter.DefaultBloomFilterTest.SparseDefaultBloomFilter;
import org.apache.commons.collections4.bloomfilter.LayeredBloomFilterTest.NumberedBloomFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SetOperationsDiffblueTest {
  /**
   * Test {@link SetOperations#andCardinality(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#andCardinality(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test andCardinality(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SetOperations.andCardinality(BitMapExtractor, BitMapExtractor)"})
  void testAndCardinality() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    int actualAndCardinalityResult =
        SetOperations.andCardinality(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(0, actualAndCardinalityResult);
  }

  /**
   * Test {@link SetOperations#cardinality(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <p>Method under test: {@link SetOperations#cardinality(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test cardinality(BitMapExtractor) with 'bitMapExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SetOperations.cardinality(BitMapExtractor)"})
  void testCardinalityWithBitMapExtractor() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    int actualCardinalityResult = SetOperations.cardinality(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link SetOperations#cosineDistance(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#cosineDistance(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test cosineDistance(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineDistance(BitMapExtractor, BitMapExtractor)"})
  void testCosineDistance() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    double actualCosineDistanceResult =
        SetOperations.cosineDistance(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(1.0d, actualCosineDistanceResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BitMapExtractor, BitMapExtractor)} with {@code
   * BitMapExtractor}, {@code BitMapExtractor}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test cosineSimilarity(BitMapExtractor, BitMapExtractor) with 'BitMapExtractor', 'BitMapExtractor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BitMapExtractor, BitMapExtractor)"})
  void testCosineSimilarityWithBitMapExtractorBitMapExtractor() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SparseDefaultBloomFilter first = new SparseDefaultBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter first = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter3() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    SparseBloomFilter first = new SparseBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter4() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new SparseDefaultBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter5() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new NumberedBloomFilter(shape2, 42, 1));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter6() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new SparseBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter7() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    SparseDefaultBloomFilter first = new SparseDefaultBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter8() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter first = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new SparseDefaultBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter9() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    NumberedBloomFilter first = new NumberedBloomFilter(shape, 42, 1);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new SparseBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName("Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter10() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromNP(1000, 0.25d);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new SparseDefaultBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)} with {@code BloomFilter},
   * {@code BloomFilter}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  @DisplayName(
      "Test cosineSimilarity(BloomFilter, BloomFilter) with 'BloomFilter', 'BloomFilter'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.cosineSimilarity(BloomFilter, BloomFilter)"})
  void testCosineSimilarityWithBloomFilterBloomFilter_thenReturnZero() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(shape);
    Shape shape2 = Shape.fromKM(19088743, 10);

    // Act
    double actualCosineSimilarityResult =
        SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(shape2));

    // Assert
    assertEquals(0.0d, actualCosineSimilarityResult);
  }

  /**
   * Test {@link SetOperations#hammingDistance(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#hammingDistance(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test hammingDistance(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SetOperations.hammingDistance(BitMapExtractor, BitMapExtractor)"})
  void testHammingDistance() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    int actualHammingDistanceResult =
        SetOperations.hammingDistance(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(0, actualHammingDistanceResult);
  }

  /**
   * Test {@link SetOperations#jaccardDistance(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#jaccardDistance(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test jaccardDistance(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.jaccardDistance(BitMapExtractor, BitMapExtractor)"})
  void testJaccardDistance() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    double actualJaccardDistanceResult =
        SetOperations.jaccardDistance(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(1.0d, actualJaccardDistanceResult);
  }

  /**
   * Test {@link SetOperations#jaccardSimilarity(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#jaccardSimilarity(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test jaccardSimilarity(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SetOperations.jaccardSimilarity(BitMapExtractor, BitMapExtractor)"})
  void testJaccardSimilarity() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    double actualJaccardSimilarityResult =
        SetOperations.jaccardSimilarity(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(0.0d, actualJaccardSimilarityResult);
  }

  /**
   * Test {@link SetOperations#orCardinality(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#orCardinality(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test orCardinality(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SetOperations.orCardinality(BitMapExtractor, BitMapExtractor)"})
  void testOrCardinality() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    int actualOrCardinalityResult = SetOperations.orCardinality(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(0, actualOrCardinalityResult);
  }

  /**
   * Test {@link SetOperations#xorCardinality(BitMapExtractor, BitMapExtractor)}.
   *
   * <p>Method under test: {@link SetOperations#xorCardinality(BitMapExtractor, BitMapExtractor)}
   */
  @Test
  @DisplayName("Test xorCardinality(BitMapExtractor, BitMapExtractor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SetOperations.xorCardinality(BitMapExtractor, BitMapExtractor)"})
  void testXorCardinality() {
    // Arrange
    BitMapExtractor first = mock(BitMapExtractor.class);
    when(first.processBitMapPairs(Mockito.<BitMapExtractor>any(), Mockito.<LongBiPredicate>any()))
        .thenReturn(true);

    // Act
    int actualXorCardinalityResult =
        SetOperations.xorCardinality(first, mock(BitMapExtractor.class));

    // Assert
    verify(first).processBitMapPairs(isA(BitMapExtractor.class), isA(LongBiPredicate.class));
    assertEquals(0, actualXorCardinalityResult);
  }
}
