package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NullIsExceptionPredicateDiffblueTest {
  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsExceptionPredicate(Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        NullIsExceptionPredicate.nullIsExceptionPredicate(predicate);
    boolean actualEvaluateResult = actualNullIsExceptionPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link FunctorException#FunctorException(String)} with {@code Msg}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsExceptionPredicate(Predicate); given FunctorException(String) with 'Msg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_givenFunctorExceptionWithMsg() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new FunctorException("Msg"));

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        NullIsExceptionPredicate.nullIsExceptionPredicate(predicate);

    // Assert
    assertThrows(FunctorException.class, () -> actualNullIsExceptionPredicateResult.evaluate("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsExceptionPredicate(Predicate); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        NullIsExceptionPredicate.nullIsExceptionPredicate(predicate);
    boolean actualEvaluateResult = actualNullIsExceptionPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NullIsExceptionPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsExceptionPredicate(Predicate); when Predicate; then return NullIsExceptionPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_whenPredicate_thenReturnNullIsExceptionPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        NullIsExceptionPredicate.nullIsExceptionPredicate(predicate);

    // Assert
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsExceptionPredicate(Predicate); when Predicate; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_whenPredicate_thenThrowFunctorException() {
    // Arrange and Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        NullIsExceptionPredicate.nullIsExceptionPredicate(mock(Predicate.class));

    // Assert
    assertThrows(FunctorException.class, () -> actualNullIsExceptionPredicateResult.evaluate(null));
  }

  /**
   * Test {@link NullIsExceptionPredicate#NullIsExceptionPredicate(Predicate)}.
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#NullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName("Test new NullIsExceptionPredicate(Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NullIsExceptionPredicate.<init>(Predicate)"})
  void testNewNullIsExceptionPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NullIsExceptionPredicate<Object> actualNullIsExceptionPredicate =
        new NullIsExceptionPredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsExceptionPredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#getPredicates()}.
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] NullIsExceptionPredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate =
        new NullIsExceptionPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, nullIsExceptionPredicate.getPredicates().length);
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; when 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_whenObject_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate =
        new NullIsExceptionPredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsExceptionPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'true'; when 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_whenObject_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate =
        new NullIsExceptionPredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsExceptionPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       FunctorException#FunctorException(String)} with {@code Msg}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) throw FunctorException(String) with 'Msg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  void testTest_givenPredicateTestThrowFunctorExceptionWithMsg() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new FunctorException("Msg"));
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate =
        new NullIsExceptionPredicate<>(predicate);

    // Act and Assert
    assertThrows(FunctorException.class, () -> nullIsExceptionPredicate.test("Object"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); when 'null'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  void testTest_whenNull_thenThrowFunctorException() {
    // Arrange
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate =
        new NullIsExceptionPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertThrows(FunctorException.class, () -> nullIsExceptionPredicate.test(null));
  }
}
