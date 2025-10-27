package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class BloomFilterExtractorDiffblueTest {
  /**
   * Method under test:
   * {@link BloomFilterExtractor#fromBloomFilterArray(BloomFilter[])}
   */
  @Test
  public void testFromBloomFilterArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    // Act
    BloomFilterExtractor actualFromBloomFilterArrayResult = BloomFilterExtractor
        .fromBloomFilterArray(arrayCountingBloomFilter);
    boolean actualProcessBloomFiltersResult = actualFromBloomFilterArrayResult
        .processBloomFilters(new UniquePredicate<>());

    // Assert
    BloomFilter flattenResult = actualFromBloomFilterArrayResult.flatten();
    assertTrue(flattenResult instanceof SimpleBloomFilter);
    assertEquals(0, flattenResult.characteristics());
    BloomFilter[] asBloomFilterArrayResult = actualFromBloomFilterArrayResult.asBloomFilterArray();
    assertEquals(1, asBloomFilterArrayResult.length);
    assertFalse(flattenResult.isFull());
    assertTrue(actualProcessBloomFiltersResult);
    assertSame(arrayCountingBloomFilter, asBloomFilterArrayResult[0]);
    assertSame(shape, flattenResult.getShape());
  }

  /**
   * Method under test:
   * {@link BloomFilterExtractor#fromBloomFilterArray(BloomFilter[])}
   */
  @Test
  public void testFromBloomFilterArray2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    // Act
    BloomFilterExtractor actualFromBloomFilterArrayResult = BloomFilterExtractor
        .fromBloomFilterArray(arrayCountingBloomFilter);
    ArrayCountingBloomFilter arrayCountingBloomFilter2 = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    DefaultEquator<BloomFilter> equator = DefaultEquator.defaultEquator();
    boolean actualProcessBloomFiltersResult = actualFromBloomFilterArrayResult
        .processBloomFilters(new EqualPredicate<>(arrayCountingBloomFilter2, equator));

    // Assert
    BloomFilter flattenResult = actualFromBloomFilterArrayResult.flatten();
    assertTrue(flattenResult instanceof SimpleBloomFilter);
    assertEquals(0, flattenResult.characteristics());
    BloomFilter[] asBloomFilterArrayResult = actualFromBloomFilterArrayResult.asBloomFilterArray();
    assertEquals(1, asBloomFilterArrayResult.length);
    assertFalse(flattenResult.isFull());
    assertFalse(actualProcessBloomFiltersResult);
    assertSame(arrayCountingBloomFilter, asBloomFilterArrayResult[0]);
    assertSame(shape, flattenResult.getShape());
  }

  /**
   * Method under test: {@link BloomFilterExtractor#asBloomFilterArray()}
   */
  @Test
  public void testAsBloomFilterArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    Shape shape2 = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(shape2)));

    // Act
    BloomFilter[] actualAsBloomFilterArrayResult = fixedResult.asBloomFilterArray();

    // Assert
    BloomFilter bloomFilter = actualAsBloomFilterArrayResult[0];
    assertTrue(bloomFilter instanceof ArrayCountingBloomFilter);
    assertEquals(1, bloomFilter.characteristics());
    assertEquals(1, actualAsBloomFilterArrayResult.length);
    assertFalse(bloomFilter.isFull());
    assertTrue(((ArrayCountingBloomFilter) bloomFilter).isValid());
    assertEquals(Integer.MAX_VALUE, ((ArrayCountingBloomFilter) bloomFilter).getMaxCell());
    assertSame(shape2, bloomFilter.getShape());
  }
}
