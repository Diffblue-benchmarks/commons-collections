package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import org.apache.commons.collections4.bloomfilter.CellExtractor.CellPredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ArrayCountingBloomFilterDiffblueTest {
  /**
   * Test {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)}.
   *
   * <ul>
   *   <li>Then return characteristics is one.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#ArrayCountingBloomFilter(Shape)}
   */
  @Test
  @DisplayName("Test new ArrayCountingBloomFilter(Shape); then return characteristics is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayCountingBloomFilter.<init>(Shape)"})
  void testNewArrayCountingBloomFilter_thenReturnCharacteristicsIsOne() {
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

  /**
   * Test {@link ArrayCountingBloomFilter#add(CellExtractor)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#add(CellExtractor)}
   */
  @Test
  @DisplayName("Test add(CellExtractor) with 'other'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.add(CellExtractor)"})
  void testAddWithOther_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    CellExtractor other = mock(CellExtractor.class);
    when(other.processCells(Mockito.<CellPredicate>any())).thenReturn(true);

    // Act
    boolean actualAddResult = arrayCountingBloomFilter.add(other);

    // Assert
    verify(other).processCells(isA(CellPredicate.class));
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#asIndexArray()}.
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#asIndexArray()}
   */
  @Test
  @DisplayName("Test asIndexArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] ArrayCountingBloomFilter.asIndexArray()"})
  void testAsIndexArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertArrayEquals(new int[] {}, new ArrayCountingBloomFilter(shape).asIndexArray());
  }

  /**
   * Test {@link ArrayCountingBloomFilter#cardinality()}.
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#cardinality()}
   */
  @Test
  @DisplayName("Test cardinality()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayCountingBloomFilter.cardinality()"})
  void testCardinality() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(0, new ArrayCountingBloomFilter(shape).cardinality());
  }

  /**
   * Test {@link ArrayCountingBloomFilter#characteristics()}.
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#characteristics()}
   */
  @Test
  @DisplayName("Test characteristics()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayCountingBloomFilter.characteristics()"})
  void testCharacteristics() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertEquals(1, new ArrayCountingBloomFilter(shape).characteristics());
  }

  /**
   * Test {@link ArrayCountingBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#contains(BitMapExtractor)} with {@code bitMapExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#contains(BitMapExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(BitMapExtractor) with 'bitMapExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.contains(BitMapExtractor)"})
  void testContainsWithBitMapExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(bitMapExtractor);

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_givenFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(false);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#contains(IndexExtractor)} with {@code indexExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#contains(IndexExtractor)}
   */
  @Test
  @DisplayName(
      "Test contains(IndexExtractor) with 'indexExtractor'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.contains(IndexExtractor)"})
  void testContainsWithIndexExtractor_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    boolean actualContainsResult = arrayCountingBloomFilter.contains(indexExtractor);

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#copy()}.
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#copy()}
   */
  @Test
  @DisplayName("Test copy()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayCountingBloomFilter ArrayCountingBloomFilter.copy()"})
  void testCopy() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    ArrayCountingBloomFilter actualCopyResult = new ArrayCountingBloomFilter(shape).copy();

    // Assert
    assertEquals(1, actualCopyResult.characteristics());
    assertFalse(actualCopyResult.isFull());
    assertTrue(actualCopyResult.isValid());
    assertEquals(Integer.MAX_VALUE, actualCopyResult.getMaxCell());
    assertSame(shape, actualCopyResult.getShape());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ArrayCountingBloomFilter#getMaxCell()}
   *   <li>{@link ArrayCountingBloomFilter#getShape()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int ArrayCountingBloomFilter.getMaxCell()",
    "Shape ArrayCountingBloomFilter.getShape()"
  })
  void testGettersAndSetters() {
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
   * Test {@link ArrayCountingBloomFilter#getMaxInsert(CellExtractor)} with {@code cellExtractor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@link Integer#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#getMaxInsert(CellExtractor)}
   */
  @Test
  @DisplayName(
      "Test getMaxInsert(CellExtractor) with 'cellExtractor'; given 'true'; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArrayCountingBloomFilter.getMaxInsert(CellExtractor)"})
  void testGetMaxInsertWithCellExtractor_givenTrue_thenReturnMax_value() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    CellExtractor cellExtractor = mock(CellExtractor.class);
    when(cellExtractor.processCells(Mockito.<CellPredicate>any())).thenReturn(true);

    // Act
    int actualMaxInsert = arrayCountingBloomFilter.getMaxInsert(cellExtractor);

    // Assert
    verify(cellExtractor).processCells(isA(CellPredicate.class));
    assertEquals(Integer.MAX_VALUE, actualMaxInsert);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#isValid()}.
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.isValid()"})
  void testIsValid() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayCountingBloomFilter(shape).isValid());
  }

  /**
   * Test {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'false'; when LongPredicate test(long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenFalse_whenLongPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = arrayCountingBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(0L);
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'false'; when LongPredicate test(long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenFalse_whenLongPredicateTestReturnFalse_thenReturnFalse2() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(false);

    // Act
    boolean actualProcessBitMapsResult = arrayCountingBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(0L);
    assertFalse(actualProcessBitMapsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'true'; when LongPredicate test(long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = arrayCountingBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer).test(0L);
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link LongPredicate} {@link LongPredicate#test(long)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#processBitMaps(LongPredicate)}
   */
  @Test
  @DisplayName(
      "Test processBitMaps(LongPredicate); given 'true'; when LongPredicate test(long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.processBitMaps(LongPredicate)"})
  void testProcessBitMaps_givenTrue_whenLongPredicateTestReturnTrue_thenReturnTrue2() {
    // Arrange
    Shape shape = Shape.fromNP(1000, 0.25d);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    LongPredicate consumer = mock(LongPredicate.class);
    when(consumer.test(anyLong())).thenReturn(true);

    // Act
    boolean actualProcessBitMapsResult = arrayCountingBloomFilter.processBitMaps(consumer);

    // Assert
    verify(consumer, atLeast(1)).test(0L);
    assertTrue(actualProcessBitMapsResult);
  }

  /**
   * Test {@link ArrayCountingBloomFilter#processCells(CellPredicate)}.
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#processCells(CellPredicate)}
   */
  @Test
  @DisplayName("Test processCells(CellPredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.processCells(CellPredicate)"})
  void testProcessCells() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayCountingBloomFilter(shape).processCells(mock(CellPredicate.class)));
  }

  /**
   * Test {@link ArrayCountingBloomFilter#processIndices(IntPredicate)}.
   *
   * <ul>
   *   <li>When {@link IntPredicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#processIndices(IntPredicate)}
   */
  @Test
  @DisplayName("Test processIndices(IntPredicate); when IntPredicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.processIndices(IntPredicate)"})
  void testProcessIndices_whenIntPredicate_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayCountingBloomFilter(shape).processIndices(mock(IntPredicate.class)));
  }

  /**
   * Test {@link ArrayCountingBloomFilter#subtract(CellExtractor)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayCountingBloomFilter#subtract(CellExtractor)}
   */
  @Test
  @DisplayName("Test subtract(CellExtractor) with 'other'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayCountingBloomFilter.subtract(CellExtractor)"})
  void testSubtractWithOther_givenTrue_thenReturnTrue() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);

    CellExtractor other = mock(CellExtractor.class);
    when(other.processCells(Mockito.<CellPredicate>any())).thenReturn(true);

    // Act
    boolean actualSubtractResult = arrayCountingBloomFilter.subtract(other);

    // Assert
    verify(other).processCells(isA(CellPredicate.class));
    assertTrue(actualSubtractResult);
  }
}
