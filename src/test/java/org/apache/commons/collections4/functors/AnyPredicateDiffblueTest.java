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

class AnyPredicateDiffblueTest {
  /**
   * Test {@link AnyPredicate#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; given Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_givenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate);
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; when ArrayList() add Predicate; then return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_whenArrayListAddPredicate_thenReturnAnyPredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(mock(Predicate.class));
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);

    // Assert
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link FalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; when ArrayList(); then return FalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_whenArrayList_thenReturnFalsePredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; when ArrayList(); then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_whenArrayList_thenReturnNotEvaluate42() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link FalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test anyPredicate(Predicate[]) with 'Predicate[]'; then return FalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertEquals(0, predicates.length);
    assertFalse(actualEvaluateResult);
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'true'; then return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, mock(Predicate.class)};

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    AnyPredicate.anyPredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link AnyPredicate#AnyPredicate(Predicate[])}.
   *
   * <p>Method under test: {@link AnyPredicate#AnyPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test new AnyPredicate(Predicate[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AnyPredicate.<init>(Predicate[])"})
  void testNewAnyPredicate() {
    // Arrange and Act
    AnyPredicate<Object> actualAnyPredicate = new AnyPredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualAnyPredicate.getPredicates().length);
    assertEquals(1, actualAnyPredicate.iPredicates.length);
  }

  /**
   * Test {@link AnyPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link
   *       Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given AnyPredicate(Predicate[]) with predicates is Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AnyPredicate.test(Object)"})
  void testTest_givenAnyPredicateWithPredicatesIsPredicate_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AnyPredicate<Object> anyPredicate = new AnyPredicate<>(predicate);

    // Act
    boolean actualTestResult = anyPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link AnyPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link AnyPredicate#AnyPredicate(Predicate[])}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given AnyPredicate(Predicate[]); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AnyPredicate.test(Object)"})
  void testTest_givenAnyPredicate_thenReturnFalse() {
    // Arrange
    AnyPredicate<Object> anyPredicate = new AnyPredicate<>();

    // Act and Assert
    assertFalse(anyPredicate.test("Object"));
  }

  /**
   * Test {@link AnyPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AnyPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AnyPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AnyPredicate<Object> anyPredicate =
        new AnyPredicate<>(predicate, predicate2, mock(Predicate.class));

    // Act
    boolean actualTestResult = anyPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
