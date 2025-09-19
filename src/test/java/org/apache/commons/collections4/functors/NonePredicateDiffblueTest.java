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

class NonePredicateDiffblueTest {
  /**
   * Test {@link NonePredicate#nonePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Collection) with 'Collection'; when ArrayList() add Predicate; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Collection)"})
  void testNonePredicateWithCollection_whenArrayListAddPredicate_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(mock(Predicate.class));
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);

    // Assert
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(2, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Collection)"})
  void testNonePredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualEvaluateResult);
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Collection)"})
  void testNonePredicateWithCollection_whenArrayList_thenReturnTruePredicate2() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Predicate[]) with 'Predicate[]'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, predicates.length);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Predicate[]) with 'Predicate[]'; given 'true'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, predicates.length);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test nonePredicate(Predicate[]) with 'Predicate[]'; then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertEquals(0, predicates.length);
    assertTrue(actualEvaluateResult);
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NonePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Predicate[]) with 'Predicate[]'; when Predicate; then return NonePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_whenPredicate_thenReturnNonePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);

    // Assert
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, predicates.length);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).iPredicates.length);
  }

  /**
   * Test {@link NonePredicate#NonePredicate(Predicate[])}.
   *
   * <p>Method under test: {@link NonePredicate#NonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test new NonePredicate(Predicate[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NonePredicate.<init>(Predicate[])"})
  void testNewNonePredicate() {
    // Arrange and Act
    NonePredicate<Object> actualNonePredicate = new NonePredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualNonePredicate.getPredicates().length);
    assertEquals(1, actualNonePredicate.iPredicates.length);
  }

  /**
   * Test {@link NonePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link
   *       Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given NonePredicate(Predicate[]) with predicates is Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  void testTest_givenNonePredicateWithPredicatesIsPredicate_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NonePredicate<Object> nonePredicate = new NonePredicate<>(predicate);

    // Act
    boolean actualTestResult = nonePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link NonePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link NonePredicate#NonePredicate(Predicate[])}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given NonePredicate(Predicate[]); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  void testTest_givenNonePredicate_thenReturnTrue() {
    // Arrange
    NonePredicate<Object> nonePredicate = new NonePredicate<>();

    // Act and Assert
    assertTrue(nonePredicate.test("Object"));
  }

  /**
   * Test {@link NonePredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    NonePredicate<Object> nonePredicate =
        new NonePredicate<>(predicate, predicate2, mock(Predicate.class));

    // Act
    boolean actualTestResult = nonePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualTestResult);
  }
}
