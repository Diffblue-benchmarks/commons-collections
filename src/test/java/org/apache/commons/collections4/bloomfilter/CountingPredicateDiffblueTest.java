package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.BiPredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CountingPredicateDiffblueTest {
  /**
   * Test {@link CountingPredicate#processRemaining()}.
   *
   * <ul>
   *   <li>Given {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CountingPredicate#processRemaining()}
   */
  @Test
  @DisplayName(
      "Test processRemaining(); given BiPredicate test(Object, Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingPredicate.processRemaining()"})
  void testProcessRemaining_givenBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(false);
    Object[] ary = new Object[] {"Ary"};

    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(ary, func);

    // Act
    boolean actualProcessRemainingResult = countingPredicate.processRemaining();

    // Assert
    verify(func).test(isA(Object.class), isNull());
    assertFalse(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingPredicate#processRemaining()}.
   *
   * <ul>
   *   <li>Given {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CountingPredicate#processRemaining()}
   */
  @Test
  @DisplayName(
      "Test processRemaining(); given BiPredicate test(Object, Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingPredicate.processRemaining()"})
  void testProcessRemaining_givenBiPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);
    Object[] ary = new Object[] {"Ary"};

    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(ary, func);

    // Act
    boolean actualProcessRemainingResult = countingPredicate.processRemaining();

    // Assert
    verify(func).test(isA(Object.class), isNull());
    assertTrue(actualProcessRemainingResult);
  }

  /**
   * Test {@link CountingPredicate#test(Object)}.
   *
   * <p>Method under test: {@link CountingPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingPredicate.test(Object)"})
  void testTest() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);
    Object[] ary = new Object[] {"Ary"};

    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(ary, func);

    // Act
    boolean actualTestResult = countingPredicate.test("Other");

    // Assert
    verify(func).test(isA(Object.class), isA(Object.class));
    assertTrue(countingPredicate.processRemaining());
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link CountingPredicate#test(Object)}.
   *
   * <p>Method under test: {@link CountingPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingPredicate.test(Object)"})
  void testTest2() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);
    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(new Object[] {}, func);

    // Act
    boolean actualTestResult = countingPredicate.test("Other");

    // Assert
    verify(func).test(isNull(), isA(Object.class));
    assertTrue(countingPredicate.processRemaining());
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link CountingPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CountingPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given BiPredicate test(Object, Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CountingPredicate.test(Object)"})
  void testTest_givenBiPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    BiPredicate<Object, Object> func = mock(BiPredicate.class);
    when(func.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(false);
    Object[] ary = new Object[] {"Ary"};

    CountingPredicate<Object> countingPredicate = new CountingPredicate<>(ary, func);

    // Act
    boolean actualTestResult = countingPredicate.test("Other");

    // Assert
    verify(func).test(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
    assertTrue(countingPredicate.processRemaining());
  }
}
