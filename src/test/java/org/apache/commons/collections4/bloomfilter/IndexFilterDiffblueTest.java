package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import org.apache.commons.collections4.bloomfilter.IndexFilter.ArrayTracker;
import org.apache.commons.collections4.bloomfilter.IndexFilter.BitMapTracker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IndexFilterDiffblueTest {
  /**
   * Test ArrayTracker {@link ArrayTracker#ArrayTracker(Shape)}.
   *
   * <ul>
   *   <li>When fromKM {@code 19088743} and ten.
   *   <li>Then return test ten.
   * </ul>
   *
   * <p>Method under test: {@link ArrayTracker#ArrayTracker(Shape)}
   */
  @Test
  @DisplayName(
      "Test ArrayTracker new ArrayTracker(Shape); when fromKM '19088743' and ten; then return test ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayTracker.<init>(Shape)"})
  void testArrayTrackerNewArrayTracker_whenFromKM19088743AndTen_thenReturnTestTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayTracker(shape).test(10));
  }

  /**
   * Test ArrayTracker {@link ArrayTracker#test(int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayTracker#ArrayTracker(Shape)} with shape is fromKM {@code 19088743} and
   *       ten test one.
   * </ul>
   *
   * <p>Method under test: {@link ArrayTracker#test(int)}
   */
  @Test
  @DisplayName(
      "Test ArrayTracker test(int); given ArrayTracker(Shape) with shape is fromKM '19088743' and ten test one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayTracker.test(int)"})
  void testArrayTrackerTest_givenArrayTrackerWithShapeIsFromKM19088743AndTenTestOne() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    ArrayTracker arrayTracker = new ArrayTracker(shape);
    arrayTracker.test(1);

    // Act and Assert
    assertTrue(arrayTracker.test(0));
  }

  /**
   * Test ArrayTracker {@link ArrayTracker#test(int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayTracker#ArrayTracker(Shape)} with shape is fromKM {@code 19088743} and
   *       ten.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link ArrayTracker#test(int)}
   */
  @Test
  @DisplayName(
      "Test ArrayTracker test(int); given ArrayTracker(Shape) with shape is fromKM '19088743' and ten; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayTracker.test(int)"})
  void testArrayTrackerTest_givenArrayTrackerWithShapeIsFromKM19088743AndTen_whenTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayTracker(shape).test(10));
  }

  /**
   * Test ArrayTracker {@link ArrayTracker#test(int)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayTracker#test(int)}
   */
  @Test
  @DisplayName("Test ArrayTracker test(int); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayTracker.test(int)"})
  void testArrayTrackerTest_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    ArrayTracker arrayTracker = new ArrayTracker(shape);
    arrayTracker.test(0);

    // Act and Assert
    assertFalse(arrayTracker.test(0));
  }

  /**
   * Test BitMapTracker {@link BitMapTracker#BitMapTracker(Shape)}.
   *
   * <ul>
   *   <li>When fromKM {@code 19088743} and ten.
   *   <li>Then return test ten.
   * </ul>
   *
   * <p>Method under test: {@link BitMapTracker#BitMapTracker(Shape)}
   */
  @Test
  @DisplayName(
      "Test BitMapTracker new BitMapTracker(Shape); when fromKM '19088743' and ten; then return test ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BitMapTracker.<init>(Shape)"})
  void testBitMapTrackerNewBitMapTracker_whenFromKM19088743AndTen_thenReturnTestTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new BitMapTracker(shape).test(10));
  }

  /**
   * Test BitMapTracker {@link BitMapTracker#test(int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BitMapTracker#test(int)}
   */
  @Test
  @DisplayName("Test BitMapTracker test(int); when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BitMapTracker.test(int)"})
  void testBitMapTrackerTest_whenTen_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new BitMapTracker(shape).test(10));
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link IntPredicate} {@link IntPredicate#test(int)} return {@code false}.
   *   <li>Then return not test one.
   * </ul>
   *
   * <p>Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @DisplayName(
      "Test create(Shape, IntPredicate); given 'false'; when IntPredicate test(int) return 'false'; then return not test one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  void testCreate_givenFalse_whenIntPredicateTestReturnFalse_thenReturnNotTestOne() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    IntPredicate consumer = mock(IntPredicate.class);
    when(consumer.test(anyInt())).thenReturn(false);

    // Act
    boolean actualTestResult = IndexFilter.create(shape, consumer).test(1);

    // Assert
    verify(consumer).test(1);
    assertEquals(10, shape.getNumberOfBits());
    assertEquals(19088743, shape.getNumberOfHashFunctions());
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When fromKM {@code 19088743} and ten.
   *   <li>Then return test one.
   * </ul>
   *
   * <p>Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @DisplayName(
      "Test create(Shape, IntPredicate); given 'true'; when fromKM '19088743' and ten; then return test one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  void testCreate_givenTrue_whenFromKM19088743AndTen_thenReturnTestOne() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    IntPredicate consumer = mock(IntPredicate.class);
    when(consumer.test(anyInt())).thenReturn(true);

    // Act
    boolean actualTestResult = IndexFilter.create(shape, consumer).test(1);

    // Assert
    verify(consumer).test(1);
    assertEquals(10, shape.getNumberOfBits());
    assertEquals(19088743, shape.getNumberOfHashFunctions());
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   *
   * <ul>
   *   <li>When fromKM one and ten.
   *   <li>Then fromKM one and ten NumberOfHashFunctions is one.
   * </ul>
   *
   * <p>Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @DisplayName(
      "Test create(Shape, IntPredicate); when fromKM one and ten; then fromKM one and ten NumberOfHashFunctions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  void testCreate_whenFromKMOneAndTen_thenFromKMOneAndTenNumberOfHashFunctionsIsOne() {
    // Arrange
    Shape shape = Shape.fromKM(1, 10);

    IntPredicate consumer = mock(IntPredicate.class);
    when(consumer.test(anyInt())).thenReturn(true);

    // Act
    boolean actualTestResult = IndexFilter.create(shape, consumer).test(1);

    // Assert
    verify(consumer).test(1);
    assertEquals(1, shape.getNumberOfHashFunctions());
    assertEquals(10, shape.getNumberOfBits());
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link IndexFilter#create(Shape, IntPredicate)}.
   *
   * <ul>
   *   <li>When {@link IntPredicate}.
   *   <li>Then fromKM {@code 19088743} and ten NumberOfBits is ten.
   * </ul>
   *
   * <p>Method under test: {@link IndexFilter#create(Shape, IntPredicate)}
   */
  @Test
  @DisplayName(
      "Test create(Shape, IntPredicate); when IntPredicate; then fromKM '19088743' and ten NumberOfBits is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntPredicate IndexFilter.create(Shape, IntPredicate)"})
  void testCreate_whenIntPredicate_thenFromKM19088743AndTenNumberOfBitsIsTen() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    IndexFilter.create(shape, mock(IntPredicate.class));

    // Assert that nothing has changed
    assertEquals(10, shape.getNumberOfBits());
    assertEquals(19088743, shape.getNumberOfHashFunctions());
  }
}
