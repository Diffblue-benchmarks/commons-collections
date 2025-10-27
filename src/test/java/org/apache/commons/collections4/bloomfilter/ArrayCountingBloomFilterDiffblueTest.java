package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.function.IntPredicate;
import org.junit.Test;

public class ArrayCountingBloomFilterDiffblueTest {
  /**
   * Method under test: {@link ArrayCountingBloomFilter#add(CellExtractor)}
   */
  @Test
  public void testAdd() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.add(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link ArrayCountingBloomFilter#asIndexArray()}
   */
  @Test
  public void testAsIndexArray() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).asIndexArray().length);
  }

  /**
   * Method under test: {@link ArrayCountingBloomFilter#cardinality()}
   */
  @Test
  public void testCardinality() {
    // Arrange, Act and Assert
    assertEquals(0, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).cardinality());
  }

  /**
   * Method under test: {@link ArrayCountingBloomFilter#characteristics()}
   */
  @Test
  public void testCharacteristics() {
    // Arrange, Act and Assert
    assertEquals(1, (new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).characteristics());
  }

  /**
   * Method under test: {@link ArrayCountingBloomFilter#copy()}
   */
  @Test
  public void testCopy() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    ArrayCountingBloomFilter actualCopyResult = (new ArrayCountingBloomFilter(shape)).copy();

    // Assert
    assertEquals(1, actualCopyResult.characteristics());
    assertFalse(actualCopyResult.isFull());
    assertTrue(actualCopyResult.isValid());
    assertEquals(Integer.MAX_VALUE, actualCopyResult.getMaxCell());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Method under test:
   * {@link ArrayCountingBloomFilter#getMaxInsert(CellExtractor)}
   */
  @Test
  public void testGetMaxInsert() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertEquals(Integer.MAX_VALUE, arrayCountingBloomFilter
        .getMaxInsert((CellExtractor) new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link ArrayCountingBloomFilter#isValid()}
   */
  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).isValid());
  }

  /**
   * Method under test:
   * {@link ArrayCountingBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  public void testProcessIndices() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.processIndices(new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))));
  }

  /**
   * Method under test: {@link ArrayCountingBloomFilter#subtract(CellExtractor)}
   */
  @Test
  public void testSubtract() {
    // Arrange
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10));

    // Act and Assert
    assertTrue(arrayCountingBloomFilter.subtract(new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ArrayCountingBloomFilter#getMaxCell()}
   *   <li>{@link ArrayCountingBloomFilter#getShape()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    // Act
    int actualMaxCell = arrayCountingBloomFilter.getMaxCell();

    // Assert
    assertEquals(Integer.MAX_VALUE, actualMaxCell);
    assertSame(shape, arrayCountingBloomFilter.getShape());
  }

  /**
   * Method under test:
   * {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)}
   */
  @Test
  public void testNewArrayCountingBloomFilter() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    ArrayCountingBloomFilter actualArrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    // Assert
    assertEquals(1, actualArrayCountingBloomFilter.characteristics());
    assertFalse(actualArrayCountingBloomFilter.isFull());
    assertTrue(actualArrayCountingBloomFilter.isValid());
    assertEquals(Integer.MAX_VALUE, actualArrayCountingBloomFilter.getMaxCell());
    assertSame(shape, actualArrayCountingBloomFilter.getShape());
  }
}
