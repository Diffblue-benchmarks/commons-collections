package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.function.IntPredicate;
import org.junit.Test;

public class SparseBloomFilterDiffblueTest {
  /**
   * Method under test: {@link SparseBloomFilter#asBitMapArray()}
   */
  @Test
  public void testAsBitMapArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, (new SparseBloomFilter(Shape.fromKM(19088743, 10))).asBitMapArray());
  }

  /**
   * Method under test: {@link SparseBloomFilter#cardinality()}
   */
  @Test
  public void testCardinality() {
    // Arrange, Act and Assert
    assertEquals(0, (new SparseBloomFilter(Shape.fromKM(19088743, 10))).cardinality());
  }

  /**
   * Method under test: {@link SparseBloomFilter#characteristics()}
   */
  @Test
  public void testCharacteristics() {
    // Arrange, Act and Assert
    assertEquals(1, (new SparseBloomFilter(Shape.fromKM(19088743, 10))).characteristics());
  }

  /**
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.contains((IndexExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains2() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.contains((IndexExtractor) new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains3() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.contains((IndexExtractor) new SparseBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains4() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.contains((IndexExtractor) new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#copy()}
   */
  @Test
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
   * Method under test: {@link SparseBloomFilter#getShape()}
   */
  @Test
  public void testGetShape() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertSame(shape, (new SparseBloomFilter(shape)).getShape());
  }

  /**
   * Method under test: {@link SparseBloomFilter#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new SparseBloomFilter(Shape.fromKM(19088743, 10))).isEmpty());
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge2() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge3() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge(new SparseBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge4() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge(new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge5() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(10, 10));

    // Act
    boolean actualMergeResult = sparseBloomFilter.merge(new EnhancedDoubleHasher(1L, 1L));

    // Assert
    assertEquals(5, sparseBloomFilter.cardinality());
    assertFalse(sparseBloomFilter.isEmpty());
    assertTrue(actualMergeResult);
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge6() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> sparseBloomFilter.merge(new AbstractBloomFilterTest.BadHasher(42)));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge7() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> sparseBloomFilter.merge(new AbstractBloomFilterTest.BadHasher(-1)));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(IndexExtractor)}
   */
  @Test
  public void testMerge8() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge((IndexExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(IndexExtractor)}
   */
  @Test
  public void testMerge9() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge((IndexExtractor) new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(IndexExtractor)}
   */
  @Test
  public void testMerge10() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge((IndexExtractor) new SparseBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#merge(IndexExtractor)}
   */
  @Test
  public void testMerge11() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.merge((IndexExtractor) new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  public void testProcessIndices() {
    // Arrange
    SparseBloomFilter sparseBloomFilter = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(sparseBloomFilter.processIndices(new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SparseBloomFilter#SparseBloomFilter(Shape)}
   */
  @Test
  public void testNewSparseBloomFilter() {
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
}
