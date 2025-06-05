package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.IntPredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IndexExtractorDiffblueTest {
  /**
   * Test {@link IndexExtractor#fromBitMapExtractor(BitMapExtractor)}.
   * <ul>
   *   <li>When {@link BitMapExtractor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexExtractor#fromBitMapExtractor(BitMapExtractor)}
   */
  @Test
  @DisplayName("Test fromBitMapExtractor(BitMapExtractor); when BitMapExtractor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromBitMapExtractor(BitMapExtractor)"})
  void testFromBitMapExtractor_whenBitMapExtractor() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{}, IndexExtractor.fromBitMapExtractor(mock(BitMapExtractor.class)).asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#fromIndexArray(int[])}.
   * <p>
   * Method under test: {@link IndexExtractor#fromIndexArray(int[])}
   */
  @Test
  @DisplayName("Test fromIndexArray(int[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromIndexArray(int[])"})
  void testFromIndexArray() {
    // Arrange
    int[] values = new int[]{42, 1, 42, 1};

    // Act and Assert
    assertArrayEquals(new int[]{42, 1, 42, 1}, IndexExtractor.fromIndexArray(values).asIndexArray());
    assertArrayEquals(new int[]{42, 1, 42, 1}, values);
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
  @DisplayName("Test fromIndexArray(int[]); then return not processIndices IntPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromIndexArray(int[])"})
  void testFromIndexArray_thenReturnNotProcessIndicesIntPredicate() {
    // Arrange
    int[] values = new int[]{42, 1, 42, 1};

    // Act
    IndexExtractor actualFromIndexArrayResult = IndexExtractor.fromIndexArray(values);
    IntPredicate intPredicate = mock(IntPredicate.class);
    when(intPredicate.test(anyInt())).thenReturn(false);
    boolean actualProcessIndicesResult = actualFromIndexArrayResult.processIndices(intPredicate);

    // Assert
    verify(intPredicate).test(eq(42));
    assertFalse(actualProcessIndicesResult);
    assertArrayEquals(new int[]{42, 1, 42, 1}, actualFromIndexArrayResult.asIndexArray());
    assertArrayEquals(new int[]{42, 1, 42, 1}, values);
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
  @DisplayName("Test fromIndexArray(int[]); then return processIndices IntPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor IndexExtractor.fromIndexArray(int[])"})
  void testFromIndexArray_thenReturnProcessIndicesIntPredicate() {
    // Arrange
    int[] values = new int[]{42, 1, 42, 1};

    // Act
    IndexExtractor actualFromIndexArrayResult = IndexExtractor.fromIndexArray(values);
    IntPredicate intPredicate = mock(IntPredicate.class);
    when(intPredicate.test(anyInt())).thenReturn(true);
    boolean actualProcessIndicesResult = actualFromIndexArrayResult.processIndices(intPredicate);

    // Assert
    verify(intPredicate, atLeast(1)).test(anyInt());
    assertTrue(actualProcessIndicesResult);
    assertArrayEquals(new int[]{42, 1, 42, 1}, actualFromIndexArrayResult.asIndexArray());
    assertArrayEquals(new int[]{42, 1, 42, 1}, values);
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
  @DisplayName("Test asIndexArray(); given SimpleBloomFilter(Shape) with shape is fromKM '19088743' and ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int[] IndexExtractor.asIndexArray()"})
  void testAsIndexArray_givenSimpleBloomFilterWithShapeIsFromKM19088743AndTen() {
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
  @DisplayName("Test asIndexArray(); given SimpleBloomFilter(Shape) with shape is fromNP one thousand and '0.25'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int[] IndexExtractor.asIndexArray()"})
  void testAsIndexArray_givenSimpleBloomFilterWithShapeIsFromNPOneThousandAnd025() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{}, (new SimpleBloomFilter(Shape.fromNP(1000, 0.25d))).asIndexArray());
  }

  /**
   * Test {@link IndexExtractor#uniqueIndices()}.
   * <p>
   * Method under test: {@link IndexExtractor#uniqueIndices()}
   */
  @Test
  @DisplayName("Test uniqueIndices()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexExtractor IndexExtractor.uniqueIndices()"})
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
