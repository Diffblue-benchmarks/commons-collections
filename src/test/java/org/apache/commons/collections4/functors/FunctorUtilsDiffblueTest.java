package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FunctorUtilsDiffblueTest {
  /**
   * Test {@link FunctorUtils#coerce(Predicate)} with {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not test {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FunctorUtils#coerce(Predicate)}
   */
  @Test
  @DisplayName("Test coerce(Predicate) with 'predicate'; given 'false'; then return not test '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate FunctorUtils.coerce(Predicate)"})
  void testCoerceWithPredicate_givenFalse_thenReturnNotTest42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualCoerceResult = FunctorUtils.coerce(predicate);
    boolean actualTestResult = actualCoerceResult.test("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link FunctorUtils#coerce(Predicate)} with {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return test {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FunctorUtils#coerce(Predicate)}
   */
  @Test
  @DisplayName(
      "Test coerce(Predicate) with 'predicate'; given 'true'; when Predicate test(Object) return 'true'; then return test '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate FunctorUtils.coerce(Predicate)"})
  void testCoerceWithPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnTest42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualCoerceResult = FunctorUtils.coerce(predicate);
    boolean actualTestResult = actualCoerceResult.test("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link FunctorUtils#copy(Consumer[])} with {@code consumers}.
   *
   * <ul>
   *   <li>When {@link Consumer}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link FunctorUtils#copy(Consumer[])}
   */
  @Test
  @DisplayName(
      "Test copy(Consumer[]) with 'consumers'; when Consumer; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer[] FunctorUtils.copy(Consumer[])"})
  void testCopyWithConsumers_whenConsumer_thenReturnArrayLengthIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, FunctorUtils.copy(mock(Consumer.class)).length);
  }

  /**
   * Test {@link FunctorUtils#copy(Predicate[])} with {@code predicates}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link FunctorUtils#copy(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test copy(Predicate[]) with 'predicates'; when Predicate; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] FunctorUtils.copy(Predicate[])"})
  void testCopyWithPredicates_whenPredicate_thenReturnArrayLengthIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, FunctorUtils.copy(mock(Predicate.class)).length);
  }

  /**
   * Test {@link FunctorUtils#copy(Function[])} with {@code transformers}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link FunctorUtils#copy(Function[])}
   */
  @Test
  @DisplayName(
      "Test copy(Function[]) with 'transformers'; when Function; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function[] FunctorUtils.copy(Function[])"})
  void testCopyWithTransformers_whenFunction_thenReturnArrayLengthIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, FunctorUtils.copy(mock(Function.class)).length);
  }

  /**
   * Test {@link FunctorUtils#validate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctorUtils#validate(Collection)}
   */
  @Test
  @DisplayName(
      "Test validate(Collection) with 'Collection'; when ArrayList(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.collections4.Predicate[] FunctorUtils.validate(Collection)"
  })
  void testValidateWithCollection_whenArrayList_thenReturnArrayLengthIsZero() {
    // Arrange and Act
    org.apache.commons.collections4.Predicate<? super Object>[] actualValidateResult =
        FunctorUtils.validate(new ArrayList<>());

    // Assert
    assertEquals(0, actualValidateResult.length);
  }
}
