package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import org.apache.commons.collections4.bloomfilter.IndexFilter.ArrayTracker;
import org.apache.commons.collections4.bloomfilter.IndexFilter.BitMapTracker;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IndexFilterDiffblueTest {
  /**
   * Test ArrayTracker {@link ArrayTracker#ArrayTracker(Shape)}.
   * <ul>
   *   <li>Then return test ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayTracker#ArrayTracker(Shape)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayTracker.<init>(Shape)"})
  public void testArrayTrackerNewArrayTracker_thenReturnTestTen() {
    // Arrange, Act and Assert
    assertTrue((new ArrayTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Test ArrayTracker {@link ArrayTracker#test(int)}.
   * <ul>
   *   <li>Given {@link ArrayTracker#ArrayTracker(Shape)} with shape is fromKM {@code 19088743} and ten test one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayTracker#test(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ArrayTracker.test(int)"})
  public void testArrayTrackerTest_givenArrayTrackerWithShapeIsFromKM19088743AndTenTestOne() {
    // Arrange
    ArrayTracker arrayTracker = new ArrayTracker(Shape.fromKM(19088743, 10));
    arrayTracker.test(1);

    // Act and Assert
    assertTrue(arrayTracker.test(0));
  }

  /**
   * Test ArrayTracker {@link ArrayTracker#test(int)}.
   * <ul>
   *   <li>Given {@link ArrayTracker#ArrayTracker(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   *   <li>When ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayTracker#test(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ArrayTracker.test(int)"})
  public void testArrayTrackerTest_givenArrayTrackerWithShapeIsFromKM19088743AndTen_whenTen() {
    // Arrange, Act and Assert
    assertTrue((new ArrayTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Test ArrayTracker {@link ArrayTracker#test(int)}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayTracker#test(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ArrayTracker.test(int)"})
  public void testArrayTrackerTest_thenReturnFalse() {
    // Arrange
    ArrayTracker arrayTracker = new ArrayTracker(Shape.fromKM(19088743, 10));
    arrayTracker.test(0);

    // Act and Assert
    assertFalse(arrayTracker.test(0));
  }

  /**
   * Test BitMapTracker {@link BitMapTracker#BitMapTracker(Shape)}.
   * <ul>
   *   <li>Then return test ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapTracker#BitMapTracker(Shape)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BitMapTracker.<init>(Shape)"})
  public void testBitMapTrackerNewBitMapTracker_thenReturnTestTen() {
    // Arrange, Act and Assert
    assertTrue((new BitMapTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Test BitMapTracker {@link BitMapTracker#test(int)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BitMapTracker#test(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BitMapTracker.test(int)"})
  public void testBitMapTrackerTest_whenTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new BitMapTracker(Shape.fromKM(19088743, 10))).test(10));
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link IntPredicate} {@link IntPredicate#test(int)} return {@code false}.</li>
   *   <li>Then return not test one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  public void testCreate_givenFalse_whenIntPredicateTestReturnFalse_thenReturnNotTestOne() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    IntPredicate consumer = mock(IntPredicate.class);
    when(consumer.test(anyInt())).thenReturn(false);

    // Act
    boolean actualTestResult = IndexFilter.create(shape, consumer).test(1);

    // Assert
    verify(consumer).test(eq(1));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When fromKM {@code 19088743} and ten.</li>
   *   <li>Then return test one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  public void testCreate_givenTrue_whenFromKM19088743AndTen_thenReturnTestOne() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    IntPredicate consumer = mock(IntPredicate.class);
    when(consumer.test(anyInt())).thenReturn(true);

    // Act
    boolean actualTestResult = IndexFilter.create(shape, consumer).test(1);

    // Assert
    verify(consumer).test(eq(1));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When fromKM one and ten.</li>
   *   <li>Then return test one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  public void testCreate_givenTrue_whenFromKMOneAndTen_thenReturnTestOne() {
    // Arrange
    Shape shape = Shape.fromKM(1, 10);
    IntPredicate consumer = mock(IntPredicate.class);
    when(consumer.test(anyInt())).thenReturn(true);

    // Act
    boolean actualTestResult = IndexFilter.create(shape, consumer).test(1);

    // Assert
    verify(consumer).test(eq(1));
    assertTrue(actualTestResult);
  }
}
