package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CellExtractorDiffblueTest {
  /**
   * Test {@link CellExtractor#from(IndexExtractor)}.
   *
   * <ul>
   *   <li>When {@link IndexExtractor}.
   * </ul>
   *
   * <p>Method under test: {@link CellExtractor#from(IndexExtractor)}
   */
  @Test
  @DisplayName("Test from(IndexExtractor); when IndexExtractor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CellExtractor CellExtractor.from(IndexExtractor)"})
  void testFrom_whenIndexExtractor() {
    // Arrange and Act
    CellExtractor actualFromResult = CellExtractor.from(mock(IndexExtractor.class));

    // Assert
    IndexExtractor actualUniqueIndicesResult = actualFromResult.uniqueIndices();
    assertSame(actualFromResult, actualUniqueIndicesResult);
    assertArrayEquals(new int[] {}, actualFromResult.asIndexArray());
  }

  /**
   * Test {@link CellExtractor#processIndices(IntPredicate)}.
   *
   * <p>Method under test: {@link CellExtractor#processIndices(IntPredicate)}
   */
  @Test
  @DisplayName("Test processIndices(IntPredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CellExtractor.processIndices(IntPredicate)"})
  void testProcessIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act and Assert
    assertTrue(new ArrayCountingBloomFilter(shape).processIndices(mock(IntPredicate.class)));
  }

  /**
   * Test {@link CellExtractor#uniqueIndices()}.
   *
   * <p>Method under test: {@link CellExtractor#uniqueIndices()}
   */
  @Test
  @DisplayName("Test uniqueIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexExtractor CellExtractor.uniqueIndices()"})
  void testUniqueIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    IndexExtractor actualUniqueIndicesResult = new ArrayCountingBloomFilter(shape).uniqueIndices();
    boolean actualProcessIndicesResult =
        actualUniqueIndicesResult.processIndices(mock(IntPredicate.class));

    // Assert
    assertTrue(actualUniqueIndicesResult instanceof ArrayCountingBloomFilter);
    assertEquals(1, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).characteristics());
    assertFalse(((ArrayCountingBloomFilter) actualUniqueIndicesResult).isFull());
    assertTrue(((ArrayCountingBloomFilter) actualUniqueIndicesResult).isValid());
    assertTrue(actualProcessIndicesResult);
    assertEquals(
        Integer.MAX_VALUE, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).getMaxCell());
    assertSame(shape, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).getShape());
  }
}
