package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class BloomFilterDiffblueTest {
  /**
   * Method under test: {@link BloomFilter#contains(BloomFilter)}
   */
  @Test
  public void testContains() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(
        arrayCountingBloomFilter.contains((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertFalse(arrayCountingBloomFilter.contains(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains3() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 1));

    // Act and Assert
    assertFalse(arrayCountingBloomFilter.contains(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains4() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertFalse(arrayCountingBloomFilter.contains(new ArrayHasher(42, 1, 42, 1)));
  }

  /**
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains5() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertFalse(arrayCountingBloomFilter.contains(new IncrementingHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link BloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains6() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d));

    // Act and Assert
    assertFalse(arrayCountingBloomFilter.contains(new AbstractBloomFilterTest.BadHasher(42)));
  }

  /**
   * Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  public void testEstimateIntersection() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0,
        arrayCountingBloomFilter.estimateIntersection(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link BloomFilter#estimateIntersection(BloomFilter)}
   */
  @Test
  public void testEstimateIntersection2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0, arrayCountingBloomFilter
        .estimateIntersection(new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link BloomFilter#estimateN()}
   */
  @Test
  public void testEstimateN() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).estimateN());
  }

  /**
   * Method under test: {@link BloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  public void testEstimateUnion() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0, arrayCountingBloomFilter.estimateUnion(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link BloomFilter#estimateUnion(BloomFilter)}
   */
  @Test
  public void testEstimateUnion2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0, arrayCountingBloomFilter
        .estimateUnion(new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link BloomFilter#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).isEmpty());
  }

  /**
   * Method under test: {@link BloomFilter#isFull()}
   */
  @Test
  public void testIsFull() {
    // Arrange, Act and Assert
    assertFalse((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).isFull());
  }

  /**
   * Method under test: {@link BloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge() {
    // Arrange
    Shape shape = Shape.fromKM(10, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act
    boolean actualMergeResult = fixedResult.merge(new EnhancedDoubleHasher(1L, 1L));

    // Assert
    assertEquals(5, fixedResult.cardinality());
    assertTrue(actualMergeResult);
  }
}
