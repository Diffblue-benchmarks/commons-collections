package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class IndexExtractorDiffblueTest {
  /**
   * Test {@link IndexExtractor#fromBitMapExtractor(BitMapExtractor)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not processIndices {@link IntPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#fromBitMapExtractor(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromBitMapExtractor(BitMapExtractor)"})
  public void testFromBitMapExtractor_givenFalse_thenReturnNotProcessIndicesIntPredicate() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(false);

    // Act
    IndexExtractor actualFromBitMapExtractorResult = IndexExtractor.fromBitMapExtractor(bitMapExtractor);
    boolean actualProcessIndicesResult = actualFromBitMapExtractorResult.processIndices(mock(IntPredicate.class));

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertFalse(actualProcessIndicesResult);
    assertArrayEquals(new int[]{}, actualFromBitMapExtractorResult.asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#fromBitMapExtractor(BitMapExtractor)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return processIndices {@link IntPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#fromBitMapExtractor(BitMapExtractor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromBitMapExtractor(BitMapExtractor)"})
  public void testFromBitMapExtractor_givenTrue_thenReturnProcessIndicesIntPredicate() {
    // Arrange
    BitMapExtractor bitMapExtractor = mock(BitMapExtractor.class);
    when(bitMapExtractor.processBitMaps(Mockito.<LongPredicate>any())).thenReturn(true);

    // Act
    IndexExtractor actualFromBitMapExtractorResult = IndexExtractor.fromBitMapExtractor(bitMapExtractor);
    boolean actualProcessIndicesResult = actualFromBitMapExtractorResult.processIndices(mock(IntPredicate.class));

    // Assert
    verify(bitMapExtractor).processBitMaps(isA(LongPredicate.class));
    assertTrue(actualProcessIndicesResult);
    assertArrayEquals(new int[]{}, actualFromBitMapExtractorResult.asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#fromIndexArray(int[])}.
   * <ul>
   *   <li>Then return not processIndices {@link IntPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#fromIndexArray(int[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromIndexArray(int[])"})
  public void testFromIndexArray_thenReturnNotProcessIndicesIntPredicate() {
    // Arrange and Act
    IndexExtractor actualFromIndexArrayResult = IndexExtractor.fromIndexArray(42, 1, 42, 1);
    IntPredicate intPredicate = mock(IntPredicate.class);
    when(intPredicate.test(anyInt())).thenReturn(false);
    boolean actualProcessIndicesResult = actualFromIndexArrayResult.processIndices(intPredicate);

    // Assert
    verify(intPredicate).test(eq(42));
    assertFalse(actualProcessIndicesResult);
    assertArrayEquals(new int[]{42, 1, 42, 1}, actualFromIndexArrayResult.asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#fromIndexArray(int[])}.
   * <ul>
   *   <li>Then return processIndices {@link IntPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#fromIndexArray(int[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromIndexArray(int[])"})
  public void testFromIndexArray_thenReturnProcessIndicesIntPredicate() {
    // Arrange and Act
    IndexExtractor actualFromIndexArrayResult = IndexExtractor.fromIndexArray(42, 1, 42, 1);
    IntPredicate intPredicate = mock(IntPredicate.class);
    when(intPredicate.test(anyInt())).thenReturn(true);
    boolean actualProcessIndicesResult = actualFromIndexArrayResult.processIndices(intPredicate);

    // Assert
    verify(intPredicate, atLeast(1)).test(anyInt());
    assertTrue(actualProcessIndicesResult);
    assertArrayEquals(new int[]{42, 1, 42, 1}, actualFromIndexArrayResult.asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#asIndexArray()}.
   * <ul>
   *   <li>Given {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromKM {@code 19088743} and ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#asIndexArray()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] IndexExtractor.asIndexArray()"})
  public void testAsIndexArray_givenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{}, (new SimpleBloomFilter(Shape.fromKM(19088743, 10))).asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#asIndexArray()}.
   * <ul>
   *   <li>Given {@link SimpleBloomFilter#SimpleBloomFilter(Shape)} with shape is fromNP one thousand and {@code 0.25}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#asIndexArray()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] IndexExtractor.asIndexArray()"})
  public void testAsIndexArray_givenSimpleBloomFilterWithShapeIsFromNPOneThousandAnd025() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{}, (new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))).asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#uniqueIndices()}.
   * <p>
   * Method under test: {@link IndexExtractor#uniqueIndices()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IndexExtractor IndexExtractor.uniqueIndices()"})
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
