package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CellExtractorDiffblueTest {
  /**
   * Test {@link CellExtractor#from(IndexExtractor)}.
   * <ul>
   *   <li>When {@link IndexExtractor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CellExtractor#from(IndexExtractor)}
   */
  @Test
  @DisplayName("Test from(IndexExtractor); when IndexExtractor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"CellExtractor CellExtractor.from(IndexExtractor)"})
  void testFrom_whenIndexExtractor() {
    // Arrange and Act
    CellExtractor actualFromResult = CellExtractor.from(mock(IndexExtractor.class));

    // Assert
    assertSame(actualFromResult, actualFromResult.uniqueIndices());
    assertArrayEquals(new int[]{}, actualFromResult.asIndexArray());
  }

  /**
   * Test {@link CellExtractor#processIndices(IntPredicate)}.
   * <p>
   * Method under test: {@link CellExtractor#processIndices(IntPredicate)}
   */
  @Test
  @DisplayName("Test processIndices(IntPredicate)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CellExtractor.processIndices(IntPredicate)"})
  void testProcessIndices() {
    // Arrange, Act and Assert
    assertTrue((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).processIndices(mock(IntPredicate.class)));
  }

  /**
   * Test {@link CellExtractor#uniqueIndices()}.
   * <p>
   * Method under test: {@link CellExtractor#uniqueIndices()}
   */
  @Test
  @DisplayName("Test uniqueIndices()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor CellExtractor.uniqueIndices()"})
  void testUniqueIndices() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);

    // Act
    IndexExtractor actualUniqueIndicesResult = (new ArrayCountingBloomFilter(shape)).uniqueIndices();
    boolean actualProcessIndicesResult = actualUniqueIndicesResult.processIndices(mock(IntPredicate.class));

    // Assert
    assertTrue(actualUniqueIndicesResult instanceof ArrayCountingBloomFilter);
    assertEquals(1, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).characteristics());
    assertFalse(((ArrayCountingBloomFilter) actualUniqueIndicesResult).isFull());
    assertTrue(((ArrayCountingBloomFilter) actualUniqueIndicesResult).isValid());
    assertTrue(actualProcessIndicesResult);
    assertEquals(Integer.MAX_VALUE, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).getMaxCell());
    assertSame(shape, ((ArrayCountingBloomFilter) actualUniqueIndicesResult).getShape());
  }
}
