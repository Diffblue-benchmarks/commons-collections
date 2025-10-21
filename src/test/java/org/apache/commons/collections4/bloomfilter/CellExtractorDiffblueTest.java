package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import org.apache.commons.collections4.bloomfilter.CellExtractor.CellPredicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class CellExtractorDiffblueTest {
  /**
   * Test {@link CellExtractor#from(IndexExtractor)}.
   * <p>
   * Method under test: {@link CellExtractor#from(IndexExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"CellExtractor CellExtractor.from(IndexExtractor)"})
  public void testFrom() {
    // Arrange
    IndexExtractor indexExtractor = mock(IndexExtractor.class);
    when(indexExtractor.processIndices(Mockito.<IntPredicate>any())).thenReturn(true);

    // Act
    CellExtractor actualFromResult = CellExtractor.from(indexExtractor);
    boolean actualProcessCellsResult = actualFromResult.processCells(mock(CellPredicate.class));

    // Assert
    verify(indexExtractor).processIndices(isA(IntPredicate.class));
    assertTrue(actualProcessCellsResult);
    assertSame(actualFromResult, actualFromResult.uniqueIndices());
    assertArrayEquals(new int[]{}, actualFromResult.asIndexArray());
  }

  /**
   * Test {@link CellExtractor#processIndices(IntPredicate)}.
   * <p>
   * Method under test: {@link CellExtractor#processIndices(IntPredicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CellExtractor.processIndices(IntPredicate)"})
  public void testProcessIndices() {
    // Arrange, Act and Assert
    assertTrue((new ArrayCountingBloomFilter(Shape.fromKM(19088743, 10))).processIndices(mock(IntPredicate.class)));
  }

  /**
   * Test {@link CellExtractor#uniqueIndices()}.
   * <p>
   * Method under test: {@link CellExtractor#uniqueIndices()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IndexExtractor CellExtractor.uniqueIndices()"})
  public void testUniqueIndices() {
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
