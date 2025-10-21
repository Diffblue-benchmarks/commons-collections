package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertArrayEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IndexUtilsDiffblueTest {
  /**
   * Test {@link IndexUtils#ensureCapacityForAdd(int[], int)}.
   * <ul>
   *   <li>Then return array of {@code int} with one and minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexUtils#ensureCapacityForAdd(int[], int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] IndexUtils.ensureCapacityForAdd(int[], int)"})
  public void testEnsureCapacityForAdd_thenReturnArrayOfIntWithOneAndMinusOne() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{1, -1, 1, -1}, IndexUtils.ensureCapacityForAdd(new int[]{1, -1, 1, -1}, 1));
  }

  /**
   * Test {@link IndexUtils#ensureCapacityForAdd(int[], int)}.
   * <ul>
   *   <li>When empty array of {@code int}.</li>
   *   <li>Then return array of {@code int} with zero and zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexUtils#ensureCapacityForAdd(int[], int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int[] IndexUtils.ensureCapacityForAdd(int[], int)"})
  public void testEnsureCapacityForAdd_whenEmptyArrayOfInt_thenReturnArrayOfIntWithZeroAndZero() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[]{0, 0}, IndexUtils.ensureCapacityForAdd(new int[]{}, 1));
  }
}
