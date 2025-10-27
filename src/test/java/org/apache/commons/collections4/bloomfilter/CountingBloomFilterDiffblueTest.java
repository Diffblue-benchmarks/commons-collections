package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CountingBloomFilterDiffblueTest {
  /**
   * Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  public void testGetMaxInsert() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(Integer.MAX_VALUE, arrayCountingBloomFilter
        .getMaxInsert((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  public void testGetMaxInsert2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(Integer.MAX_VALUE, arrayCountingBloomFilter
        .getMaxInsert((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  public void testGetMaxInsert3() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(Integer.MAX_VALUE, arrayCountingBloomFilter
        .getMaxInsert(new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  public void testGetMaxInsert4() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(Integer.MAX_VALUE,
        arrayCountingBloomFilter.getMaxInsert(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#getMaxInsert(BloomFilter)}
   */
  @Test
  public void testGetMaxInsert5() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(Integer.MAX_VALUE,
        arrayCountingBloomFilter.getMaxInsert(new SparseBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#getMaxInsert(Hasher)}
   */
  @Test
  public void testGetMaxInsert6() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(10, 10));

    // Act and Assert
    assertEquals(0, arrayCountingBloomFilter.getMaxInsert(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link CountingBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(
        arrayCountingBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter
        .merge(new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge3() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.merge(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge4() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.merge(new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge5() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(10, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.merge(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(
        arrayCountingBloomFilter.remove((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter
        .remove(new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.remove(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(BloomFilter)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.remove(new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))));
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  public void testRemove5() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(10, 10));

    // Act
    boolean actualRemoveResult = arrayCountingBloomFilter.remove(new EnhancedDoubleHasher(1L, 1L));

    // Assert
    assertFalse(arrayCountingBloomFilter.isValid());
    assertFalse(actualRemoveResult);
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  public void testRemove6() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 1));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> arrayCountingBloomFilter.remove(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link CountingBloomFilter#remove(Hasher)}
   */
  @Test
  public void testRemove7() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> arrayCountingBloomFilter.remove(new AbstractBloomFilterTest.BadHasher(-1)));
  }
}
