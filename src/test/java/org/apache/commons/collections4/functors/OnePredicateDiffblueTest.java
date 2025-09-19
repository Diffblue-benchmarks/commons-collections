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
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OnePredicateDiffblueTest {
  /**
   * Test {@link OnePredicate#onePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Collection) with 'Collection'; when ArrayList() add Predicate; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Collection)"})
  void testOnePredicateWithCollection_whenArrayListAddPredicate_thenArrayListSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Collection) with 'Collection'; when ArrayList(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Collection)"})
  void testOnePredicateWithCollection_whenArrayList_thenReturnArrayLengthIsZero() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(0, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(0, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link FalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; then return FalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualOnePredicateResult instanceof FalsePredicate);
    assertEquals(0, predicates.length);
    assertFalse(actualEvaluateResult);
    assertFalse(actualOnePredicateResult.evaluate("Object"));
    assertFalse(actualOnePredicateResult.test("Object"));
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return not evaluate two.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; then return not evaluate two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_thenReturnNotEvaluateTwo() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate(2);

    // Assert
    assertTrue(actualOnePredicateResult instanceof FalsePredicate);
    assertEquals(0, predicates.length);
    assertFalse(actualOnePredicateResult.evaluate("Object"));
    assertFalse(actualEvaluateResult);
    assertFalse(actualOnePredicateResult.test("Object"));
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateEvaluateReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link OnePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'true'; then return OnePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnOnePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    OnePredicate.onePredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link OnePredicate#OnePredicate(Predicate[])}.
   *
   * <p>Method under test: {@link OnePredicate#OnePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test new OnePredicate(Predicate[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnePredicate.<init>(Predicate[])"})
  void testNewOnePredicate() {
    // Arrange and Act
    OnePredicate<Object> actualOnePredicate = new OnePredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualOnePredicate.getPredicates().length);
    assertEquals(1, actualOnePredicate.iPredicates.length);
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link OnePredicate#OnePredicate(Predicate[])} with predicates is {@link Predicate}
   *       and {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given OnePredicate(Predicate[]) with predicates is Predicate and Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  void testTest_givenOnePredicateWithPredicatesIsPredicateAndPredicate_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    OnePredicate<Object> onePredicate = new OnePredicate<>(predicate, predicate2);

    // Act
    boolean actualTestResult = onePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link OnePredicate#OnePredicate(Predicate[])} with predicates is {@link
   *       Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given OnePredicate(Predicate[]) with predicates is Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  void testTest_givenOnePredicateWithPredicatesIsPredicate_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    OnePredicate<Object> onePredicate = new OnePredicate<>(predicate);

    // Act
    boolean actualTestResult = onePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link OnePredicate#OnePredicate(Predicate[])}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given OnePredicate(Predicate[]); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  void testTest_givenOnePredicate_thenReturnFalse() {
    // Arrange
    OnePredicate<Object> onePredicate = new OnePredicate<>();

    // Act and Assert
    assertFalse(onePredicate.test("Object"));
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);

    OnePredicate<Object> onePredicate = new OnePredicate<>(predicate, predicate2, predicate3);

    // Act
    boolean actualTestResult = onePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertFalse(actualTestResult);
  }
}
