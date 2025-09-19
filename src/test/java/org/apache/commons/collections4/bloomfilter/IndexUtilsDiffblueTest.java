package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IndexUtilsDiffblueTest {
  /**
   * Test {@link IndexUtils#ensureCapacityForAdd(int[], int)}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with one and minus one.
   * </ul>
   *
   * <p>Method under test: {@link IndexUtils#ensureCapacityForAdd(int[], int)}
   */
  @Test
  @DisplayName(
      "Test ensureCapacityForAdd(int[], int); then return array of int with one and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] IndexUtils.ensureCapacityForAdd(int[], int)"})
  void testEnsureCapacityForAdd_thenReturnArrayOfIntWithOneAndMinusOne() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new int[] {1, -1, 1, -1}, IndexUtils.ensureCapacityForAdd(new int[] {1, -1, 1, -1}, 1));
  }

  /**
   * Test {@link IndexUtils#ensureCapacityForAdd(int[], int)}.
   *
   * <ul>
   *   <li>When empty array of {@code int}.
   *   <li>Then return array of {@code int} with zero and zero.
   * </ul>
   *
   * <p>Method under test: {@link IndexUtils#ensureCapacityForAdd(int[], int)}
   */
  @Test
  @DisplayName(
      "Test ensureCapacityForAdd(int[], int); when empty array of int; then return array of int with zero and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] IndexUtils.ensureCapacityForAdd(int[], int)"})
  void testEnsureCapacityForAdd_whenEmptyArrayOfInt_thenReturnArrayOfIntWithZeroAndZero() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {0, 0}, IndexUtils.ensureCapacityForAdd(new int[] {}, 1));
  }
}
