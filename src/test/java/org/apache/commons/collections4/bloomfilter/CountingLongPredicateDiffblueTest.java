package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CountingLongPredicateDiffblueTest {
  /**
   * Test {@link CountingLongPredicate#processRemaining()}.
   *
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code
   *       false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CountingLongPredicate#processRemaining()}
   */
  @Test
  @DisplayName(
      "Test processRemaining(); given LongBiPredicate test(long, long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingLongPredicate.processRemaining()"})
  void testProcessRemaining_givenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);
    CountingLongPredicate countingLongPredicate =
        new CountingLongPredicate(new long[] {1L, 0L, 1L, 0L}, func);

    // Act
    boolean actualProcessRemainingResult = countingLongPredicate.processRemaining();

    // Assert
    verify(func).test(1L, 0L);
    assertFalse(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingLongPredicate#processRemaining()}.
   *
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code
   *       true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingLongPredicate#processRemaining()}
   */
  @Test
  @DisplayName(
      "Test processRemaining(); given LongBiPredicate test(long, long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingLongPredicate.processRemaining()"})
  void testProcessRemaining_givenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);
    CountingLongPredicate countingLongPredicate =
        new CountingLongPredicate(new long[] {1L, 0L, 1L, 0L}, func);

    // Act
    boolean actualProcessRemainingResult = countingLongPredicate.processRemaining();

    // Assert
    verify(func, atLeast(1)).test(anyLong(), eq(0L));
    assertTrue(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingLongPredicate#test(long)}.
   *
   * <p>Method under test: {@link CountingLongPredicate#test(long)}
   */
  @Test
  @DisplayName("Test test(long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingLongPredicate.test(long)"})
  void testTest() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);
    CountingLongPredicate countingLongPredicate = new CountingLongPredicate(new long[] {}, func);

    // Act
    boolean actualTestResult = countingLongPredicate.test(1L);

    // Assert
    verify(func).test(0L, 1L);
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link CountingLongPredicate#test(long)}.
   *
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code
   *       false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CountingLongPredicate#test(long)}
   */
  @Test
  @DisplayName(
      "Test test(long); given LongBiPredicate test(long, long) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingLongPredicate.test(long)"})
  void testTest_givenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);
    CountingLongPredicate countingLongPredicate =
        new CountingLongPredicate(new long[] {1L, 0L, 1L, 0L}, func);

    // Act
    boolean actualTestResult = countingLongPredicate.test(1L);

    // Assert
    verify(func).test(1L, 1L);
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link CountingLongPredicate#test(long)}.
   *
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code
   *       true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingLongPredicate#test(long)}
   */
  @Test
  @DisplayName(
      "Test test(long); given LongBiPredicate test(long, long) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingLongPredicate.test(long)"})
  void testTest_givenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);
    CountingLongPredicate countingLongPredicate =
        new CountingLongPredicate(new long[] {1L, 0L, 1L, 0L}, func);

    // Act
    boolean actualTestResult = countingLongPredicate.test(1L);

    // Assert
    verify(func).test(1L, 1L);
    assertTrue(actualTestResult);
  }
}
