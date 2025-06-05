package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BloomFilterExtractorDiffblueTest {
  /**
   * Test {@link BloomFilterExtractor#fromBloomFilterArray(BloomFilter[])}.
   * <p>
   * Method under test: {@link BloomFilterExtractor#fromBloomFilterArray(BloomFilter[])}
   */
  @Test
  @DisplayName("Test fromBloomFilterArray(BloomFilter[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BloomFilterExtractor BloomFilterExtractor.fromBloomFilterArray(BloomFilter[])"})
  void testFromBloomFilterArray() {
    // Arrange
    Shape shape = Shape.fromKM(19088743, 10);
    ArrayCountingBloomFilter arrayCountingBloomFilter = new ArrayCountingBloomFilter(shape);
    BloomFilter<?>[] filters = new BloomFilter[]{arrayCountingBloomFilter};

    // Act
    BloomFilterExtractor actualFromBloomFilterArrayResult = BloomFilterExtractor.fromBloomFilterArray(filters);

    // Assert
    BloomFilter flattenResult = actualFromBloomFilterArrayResult.flatten();
    assertTrue(flattenResult instanceof SimpleBloomFilter);
    assertEquals(0, flattenResult.characteristics());
    BloomFilter[] asBloomFilterArrayResult = actualFromBloomFilterArrayResult.asBloomFilterArray();
    assertEquals(1, asBloomFilterArrayResult.length);
    assertEquals(1, filters.length);
    assertFalse(flattenResult.isFull());
    assertSame(arrayCountingBloomFilter, asBloomFilterArrayResult[0]);
    assertSame(arrayCountingBloomFilter, filters[0]);
    assertSame(shape, flattenResult.getShape());
  }

  /**
   * Test {@link BloomFilterExtractor#asBloomFilterArray()}.
   * <ul>
   *   <li>Then first element return {@link ArrayCountingBloomFilter}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BloomFilterExtractor#asBloomFilterArray()}
   */
  @Test
  @DisplayName("Test asBloomFilterArray(); then first element return ArrayCountingBloomFilter")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BloomFilter[] BloomFilterExtractor.asBloomFilterArray()"})
  void testAsBloomFilterArray_thenFirstElementReturnArrayCountingBloomFilter() {
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
