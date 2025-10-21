package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CountingLongPredicateDiffblueTest {
  /**
   * Test {@link CountingLongPredicate#processRemaining()}.
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingLongPredicate#processRemaining()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingLongPredicate.processRemaining()"})
  public void testProcessRemaining_givenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);

    // Act
    boolean actualProcessRemainingResult = (new CountingLongPredicate(new long[]{1L, 0L, 1L, 0L}, func))
        .processRemaining();

    // Assert
    verify(func).test(eq(1L), eq(0L));
    assertFalse(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingLongPredicate#processRemaining()}.
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingLongPredicate#processRemaining()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingLongPredicate.processRemaining()"})
  public void testProcessRemaining_givenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualProcessRemainingResult = (new CountingLongPredicate(new long[]{1L, 0L, 1L, 0L}, func))
        .processRemaining();

    // Assert
    verify(func, atLeast(1)).test(anyLong(), eq(0L));
    assertTrue(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingLongPredicate#test(long)}.
   * <p>
   * Method under test: {@link CountingLongPredicate#test(long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingLongPredicate.test(long)"})
  public void testTest() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualTestResult = (new CountingLongPredicate(new long[]{}, func)).test(1L);

    // Assert
    verify(func).test(eq(0L), eq(1L));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link CountingLongPredicate#test(long)}.
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingLongPredicate#test(long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingLongPredicate.test(long)"})
  public void testTest_givenLongBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(false);

    // Act
    boolean actualTestResult = (new CountingLongPredicate(new long[]{1L, 0L, 1L, 0L}, func)).test(1L);

    // Assert
    verify(func).test(eq(1L), eq(1L));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link CountingLongPredicate#test(long)}.
   * <ul>
   *   <li>Given {@link LongBiPredicate} {@link LongBiPredicate#test(long, long)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingLongPredicate#test(long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingLongPredicate.test(long)"})
  public void testTest_givenLongBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    LongBiPredicate func = mock(LongBiPredicate.class);
    when(func.test(anyLong(), anyLong())).thenReturn(true);

    // Act
    boolean actualTestResult = (new CountingLongPredicate(new long[]{1L, 0L, 1L, 0L}, func)).test(1L);

    // Assert
    verify(func).test(eq(1L), eq(1L));
    assertTrue(actualTestResult);
  }
}
