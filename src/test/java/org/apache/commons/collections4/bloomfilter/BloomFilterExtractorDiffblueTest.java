package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Supplier;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BloomFilterExtractorDiffblueTest {
  /**
   * Test {@link BloomFilterExtractor#asBloomFilterArray()}.
   * <ul>
   *   <li>Then first element return {@link ArrayCountingBloomFilter}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilterExtractor#asBloomFilterArray()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BloomFilter[] BloomFilterExtractor.asBloomFilterArray()"})
  public void testAsBloomFilterArray_thenFirstElementReturnArrayCountingBloomFilter() {
    // Arrange
    Supplier<CountingBloomFilter> supplier = mock(Supplier.class);
    Shape shape = Shape.fromKM(19088743, 10);
    when(supplier.get()).thenReturn(new ArrayCountingBloomFilter(shape));
    LayeredBloomFilter<CountingBloomFilter> fixedResult = LayeredBloomFilterTest.fixed(Shape.fromKM(19088743, 10), 2,
        supplier);

    // Act
    BloomFilter[] actualAsBloomFilterArrayResult = fixedResult.asBloomFilterArray();

    // Assert
    verify(supplier).get();
    BloomFilter bloomFilter = actualAsBloomFilterArrayResult[0];
    assertTrue(bloomFilter instanceof ArrayCountingBloomFilter);
    assertEquals(1, bloomFilter.characteristics());
    assertEquals(1, actualAsBloomFilterArrayResult.length);
    assertFalse(bloomFilter.isFull());
    assertTrue(((ArrayCountingBloomFilter) bloomFilter).isValid());
    assertEquals(Integer.MAX_VALUE, ((ArrayCountingBloomFilter) bloomFilter).getMaxCell());
    assertSame(shape, bloomFilter.getShape());
  }
}
