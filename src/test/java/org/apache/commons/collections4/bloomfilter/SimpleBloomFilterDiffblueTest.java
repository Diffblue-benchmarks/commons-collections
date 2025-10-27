package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.function.IntPredicate;
import org.junit.Test;

public class SimpleBloomFilterDiffblueTest {
  /**
   * Method under test: {@link SimpleBloomFilter#asBitMapArray()}
   */
  @Test
  public void testAsBitMapArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L}, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).asBitMapArray());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#cardinality()}
   */
  @Test
  public void testCardinality() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).cardinality());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#cardinality()}
   */
  @Test
  public void testCardinality2() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    simpleBloomFilter.merge((BitMapExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));

    // Act and Assert
    assertEquals(0, simpleBloomFilter.cardinality());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#characteristics()}
   */
  @Test
  public void testCharacteristics() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).characteristics());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.contains((IndexExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains2() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.contains((IndexExtractor) new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#copy()}
   */
  @Test
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
   * Method under test: {@link SimpleBloomFilter#getShape()}
   */
  @Test
  public void testGetShape() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertSame(shape, (new SimpleBloomFilter(shape)).getShape());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new SimpleBloomFilter(Shape.fromKM(19088743, 10))).isEmpty());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));
    simpleBloomFilter.merge((BitMapExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10)));

    // Act and Assert
    assertTrue(simpleBloomFilter.isEmpty());
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge((BloomFilter<?>) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge2() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(BloomFilter)}
   */
  @Test
  public void testMerge3() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromNP(1000, 0.25d));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge4() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(10, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge5() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 1));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> simpleBloomFilter.merge(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge6() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> simpleBloomFilter.merge(new AbstractBloomFilterTest.BadHasher(42)));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge7() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromNP(1000, 0.25d));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge(new AbstractBloomFilterTest.BadHasher(42)));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(Hasher)}
   */
  @Test
  public void testMerge8() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> simpleBloomFilter.merge(new AbstractBloomFilterTest.BadHasher(-1)));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(IndexExtractor)}
   */
  @Test
  public void testMerge9() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge((IndexExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#merge(IndexExtractor)}
   */
  @Test
  public void testMerge10() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.merge((IndexExtractor) new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  public void testProcessIndices() {
    // Arrange
    SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(simpleBloomFilter.processIndices(new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link SimpleBloomFilter#SimpleBloomFilter(Shape)}
   */
  @Test
  public void testNewSimpleBloomFilter() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    SimpleBloomFilter actualSimpleBloomFilter = new SimpleBloomFilter(shape);

    // Assert
    assertEquals(0, actualSimpleBloomFilter.characteristics());
    assertFalse(actualSimpleBloomFilter.isFull());
    assertSame(shape, actualSimpleBloomFilter.getShape());
  }
}
