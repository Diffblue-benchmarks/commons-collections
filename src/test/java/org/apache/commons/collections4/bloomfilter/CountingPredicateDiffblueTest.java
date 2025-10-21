package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.BiPredicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class CountingPredicateDiffblueTest {
  /**
   * Test {@link CountingPredicate#processRemaining()}.
   * <ul>
   *   <li>Given {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingPredicate#processRemaining()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingPredicate.processRemaining()"})
  public void testProcessRemaining_givenBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(false);
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[]{"Ary"}, func);

    // Act
    boolean actualProcessRemainingResult = countingPredicate.processRemaining();

    // Assert
    verify(func).test(isA(Object.class), isNull());
    assertFalse(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingPredicate#processRemaining()}.
   * <ul>
   *   <li>Given {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingPredicate#processRemaining()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingPredicate.processRemaining()"})
  public void testProcessRemaining_givenBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[]{"Ary"}, func);

    // Act
    boolean actualProcessRemainingResult = countingPredicate.processRemaining();

    // Assert
    verify(func).test(isA(Object.class), isNull());
    assertTrue(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingPredicate#test(Object)}.
   * <p>
   * Method under test: {@link CountingPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingPredicate.test(Object)"})
  public void testTest() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[]{"Ary"}, func);

    // Act
    boolean actualTestResult = countingPredicate.test("Other");

    // Assert
    verify(func).test(isA(Object.class), isA(Object.class));
    assertTrue(countingPredicate.processRemaining());
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link CountingPredicate#test(Object)}.
   * <p>
   * Method under test: {@link CountingPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingPredicate.test(Object)"})
  public void testTest2() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[]{}, func);

    // Act
    boolean actualTestResult = countingPredicate.test("Other");

    // Assert
    verify(func).test(isNull(), isA(Object.class));
    assertTrue(countingPredicate.processRemaining());
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link CountingPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CountingPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CountingPredicate.test(Object)"})
  public void testTest_givenBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(false);
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[]{"Ary"}, func);

    // Act
    boolean actualTestResult = countingPredicate.test("Other");

    // Assert
    verify(func).test(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
    assertTrue(countingPredicate.processRemaining());
  }
}
