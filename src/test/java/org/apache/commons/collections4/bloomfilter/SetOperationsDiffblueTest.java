package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SetOperationsDiffblueTest {
  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity() {
    // Arrange
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))),
        0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity2() {
    // Arrange
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))),
        0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity3() {
    // Arrange
    DefaultBloomFilterTest.SparseDefaultBloomFilter first = new DefaultBloomFilterTest.SparseDefaultBloomFilter(
        Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))),
        0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity4() {
    // Arrange
    SimpleBloomFilter first = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))),
        0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity5() {
    // Arrange
    SparseBloomFilter first = new SparseBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))),
        0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity6() {
    // Arrange
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new ArrayCountingBloomFilter(Shape.fromNP(1000, 0.25d))),
        0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity7() {
    // Arrange
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first,
        new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))), 0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity8() {
    // Arrange
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new SimpleBloomFilter(Shape.fromKM(19088743, 10))), 0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity9() {
    // Arrange
    ArrayCountingBloomFilter first = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new SparseBloomFilter(Shape.fromKM(19088743, 10))), 0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity10() {
    // Arrange
    SimpleBloomFilter first = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first,
        new DefaultBloomFilterTest.SparseDefaultBloomFilter(Shape.fromKM(19088743, 10))), 0.0);
  }

  /**
   * Method under test:
   * {@link SetOperations#cosineSimilarity(BloomFilter, BloomFilter)}
   */
  @Test
  public void testCosineSimilarity11() {
    // Arrange
    SimpleBloomFilter first = new SimpleBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(0.0d, SetOperations.cosineSimilarity(first, new SparseBloomFilter(Shape.fromKM(19088743, 10))), 0.0);
  }
}
