package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class LayeredBloomFilterDiffblueTest {
  /**
   * Method under test: {@link LayeredBloomFilter#cardinality()}
   */
  @Test
  public void testCardinality() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertEquals(0, fixedResult.cardinality());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#characteristics()}
   */
  @Test
  public void testCharacteristics() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertEquals(0, fixedResult.characteristics());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#contains(BloomFilter)}
   */
  @Test
  public void testContains() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertTrue(fixedResult.contains((BloomFilter) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#contains(BloomFilter)}
   */
  @Test
  public void testContains2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertTrue(fixedResult.contains(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains3() {
    // Arrange
    Shape shape = Shape.fromKM(10, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertFalse(fixedResult.contains(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#contains(Hasher)}
   */
  @Test
  public void testContains4() {
    // Arrange
    Shape shape = Shape.fromKM(1, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertFalse(fixedResult.contains(new EnhancedDoubleHasher(1L, 1L)));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains5() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertTrue(fixedResult.contains((IndexExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#contains(IndexExtractor)}
   */
  @Test
  public void testContains6() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertTrue(fixedResult.contains((IndexExtractor) new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#copy()}
   */
  @Test
  public void testCopy() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualCopyResult = fixedResult.copy();

    // Assert
    assertEquals(0, actualCopyResult.cardinality());
    assertEquals(0, actualCopyResult.characteristics());
    assertEquals(1, actualCopyResult.getDepth());
    assertFalse(actualCopyResult.isFull());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#estimateN()}
   */
  @Test
  public void testEstimateN() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertEquals(0, fixedResult.estimateN());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#find(BloomFilter)}
   */
  @Test
  public void testFind() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertArrayEquals(new int[]{0},
        fixedResult.find((BloomFilter) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#find(BloomFilter)}
   */
  @Test
  public void testFind2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertArrayEquals(new int[]{0}, fixedResult.find(new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#find(Hasher)}
   */
  @Test
  public void testFind3() {
    // Arrange
    Shape shape = Shape.fromKM(10, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertEquals(0, fixedResult.find(new EnhancedDoubleHasher(1L, 1L)).length);
  }

  /**
   * Method under test: {@link LayeredBloomFilter#find(Hasher)}
   */
  @Test
  public void testFind4() {
    // Arrange
    Shape shape = Shape.fromKM(1, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertEquals(0, fixedResult.find(new EnhancedDoubleHasher(1L, 1L)).length);
  }

  /**
   * Method under test: {@link LayeredBloomFilter#find(IndexExtractor)}
   */
  @Test
  public void testFind5() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertArrayEquals(new int[]{0},
        fixedResult.find((IndexExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#find(IndexExtractor)}
   */
  @Test
  public void testFind6() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertArrayEquals(new int[]{0},
        fixedResult.find((IndexExtractor) new SimpleBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#flatten()}
   */
  @Test
  public void testFlatten() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act
    SimpleBloomFilter actualFlattenResult = fixedResult.flatten();

    // Assert
    assertEquals(0, actualFlattenResult.characteristics());
    assertFalse(actualFlattenResult.isFull());
    assertSame(shape, actualFlattenResult.getShape());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(arrayCountingBloomFilter));

    // Act and Assert
    assertSame(arrayCountingBloomFilter, fixedResult.get(0));
  }

  /**
   * Method under test: {@link LayeredBloomFilter#getDepth()}
   */
  @Test
  public void testGetDepth() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertEquals(1, fixedResult.getDepth());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act and Assert
    assertTrue(fixedResult.isEmpty());
  }

  /**
   * Method under test: {@link LayeredBloomFilter#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(shape, 2,
        new ConstantFactory<>(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));

    // Act
    fixedResult.next();

    // Assert
    assertEquals(2, fixedResult.getDepth());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link LayeredBloomFilter#LayeredBloomFilter(Shape, LayerManager)}
   *   <li>{@link LayeredBloomFilter#getShape()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    LayeredBloomFilter<CountingBloomFilter> actualLayeredBloomFilter = new LayeredBloomFilter<>(shape, null);

    // Assert
    assertSame(shape, actualLayeredBloomFilter.getShape());
  }
}
