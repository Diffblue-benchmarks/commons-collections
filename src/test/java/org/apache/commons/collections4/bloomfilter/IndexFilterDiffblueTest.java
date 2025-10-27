package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.function.IntPredicate;
import org.junit.Test;

public class IndexFilterDiffblueTest {
  /**
   * Method under test: {@link IndexFilter.ArrayTracker#ArrayTracker(Shape)}
   */
  @Test
  public void testArrayTrackerNewArrayTracker() {
    // Arrange, Act and Assert
    assertTrue((new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Method under test: {@link IndexFilter.ArrayTracker#test(int)}
   */
  @Test
  public void testArrayTrackerTest() {
    // Arrange, Act and Assert
    assertTrue((new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Method under test: {@link IndexFilter.ArrayTracker#test(int)}
   */
  @Test
  public void testArrayTrackerTest2() {
    // Arrange
    IndexFilter.ArrayTracker arrayTracker = new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10));
    arrayTracker.test(0);

    // Act and Assert
    assertFalse(arrayTracker.test(0));
  }

  /**
   * Method under test: {@link IndexFilter.ArrayTracker#test(int)}
   */
  @Test
  public void testArrayTrackerTest3() {
    // Arrange
    IndexFilter.ArrayTracker arrayTracker = new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10));
    arrayTracker.test(1);

    // Act and Assert
    assertTrue(arrayTracker.test(0));
  }

  /**
   * Method under test: {@link IndexFilter.BitMapTracker#BitMapTracker(Shape)}
   */
  @Test
  public void testBitMapTrackerNewBitMapTracker() {
    // Arrange, Act and Assert
    assertTrue((new IndexFilter.BitMapTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Method under test: {@link IndexFilter.BitMapTracker#test(int)}
   */
  @Test
  public void testBitMapTrackerTest() {
    // Arrange, Act and Assert
    assertTrue((new IndexFilter.BitMapTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  public void testCreate() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(IndexFilter.create(shape, new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10))).test(1));
  }

  /**
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  public void testCreate2() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    IndexFilter.ArrayTracker consumer = new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10));
    consumer.test(10);

    // Act and Assert
    assertTrue(IndexFilter.create(shape, consumer).test(1));
  }

  /**
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  public void testCreate3() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    IndexFilter.ArrayTracker consumer = new IndexFilter.ArrayTracker(Shape.fromKM(19088743, 10));
    consumer.test(1);

    // Act and Assert
    assertFalse(IndexFilter.create(shape, consumer).test(1));
  }

  /**
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  public void testCreate4() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    IndexFilter.BitMapTracker consumer = new IndexFilter.BitMapTracker(Shape.fromKM(19088743, 10));
    consumer.test(10);

    // Act and Assert
    assertTrue(IndexFilter.create(shape, consumer).test(1));
  }

  /**
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  public void testCreate5() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    IndexFilter.BitMapTracker consumer = new IndexFilter.BitMapTracker(Shape.fromKM(19088743, 10));
    consumer.test(1);

    // Act and Assert
    assertFalse(IndexFilter.create(shape, consumer).test(1));
  }
}
