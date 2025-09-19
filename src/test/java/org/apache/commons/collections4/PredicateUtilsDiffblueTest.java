package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicateUtilsDiffblueTest {
  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Collection) with 'Collection'; given Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  void testAllPredicateWithCollection_givenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Predicate}.
   *   <li>Then return {@link AllPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Collection) with 'Collection'; given Predicate; then return AllPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  void testAllPredicateWithCollection_givenPredicate_thenReturnAllPredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(mock(Predicate.class));
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);

    // Assert
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  void testAllPredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualEvaluateResult);
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Collection)"})
  void testAllPredicateWithCollection_whenArrayList_thenReturnTruePredicate2() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<? super Object> andPredicate = new AndPredicate<>(predicate1, predicate2);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {andPredicate, predicate, predicate3};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(andPredicate, predicates2[0]);
    assertSame(andPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    AndPredicate<? super Object> andPredicate =
        new AndPredicate<>(predicate1, mock(Predicate.class));
    Predicate<? super Object>[] predicates =
        new Predicate[] {andPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(andPredicate, predicates2[0]);
    assertSame(andPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate3() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    AndPredicate<? super Object> andPredicate = new AndPredicate<>(predicate1, predicate2);
    Predicate<? super Object>[] predicates =
        new Predicate[] {andPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(andPredicate, predicates2[0]);
    assertSame(andPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link AllPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return AllPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnAllPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AllPredicate<? super Object> allPredicate = new AllPredicate<>(predicate);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {allPredicate, predicate2, predicate3};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate4 = predicates2[0];
    assertTrue(predicate4 instanceof AllPredicate);
    assertEquals(1, ((AllPredicate<? super Object>) predicate4).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(allPredicate, predicate4);
    assertSame(allPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AnyPredicate<? super Object> anyPredicate = new AnyPredicate<>(predicate);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {anyPredicate, predicate2, predicate3};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate4 = predicates2[0];
    assertTrue(predicate4 instanceof AnyPredicate);
    assertEquals(1, ((AnyPredicate<? super Object>) predicate4).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(anyPredicate, predicate4);
    assertSame(anyPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnAnyPredicate2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AnyPredicate<? super Object> anyPredicate = new AnyPredicate<>(predicate);
    Predicate<? super Object>[] predicates =
        new Predicate[] {anyPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate2 = predicates2[0];
    assertTrue(predicate2 instanceof AnyPredicate);
    assertEquals(1, ((AnyPredicate<? super Object>) predicate2).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(anyPredicate, predicate2);
    assertSame(anyPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link IdentityPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return IdentityPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnIdentityPredicate() {
    // Arrange
    IdentityPredicate<Object> identityPredicate = new IdentityPredicate<>("Object");
    Predicate<? super Object>[] predicates =
        new Predicate[] {identityPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates2[0];
    assertTrue(predicate instanceof IdentityPredicate);
    assertEquals("Object", ((IdentityPredicate<? super Object>) predicate).getValue());
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(identityPredicate, predicate);
    assertSame(identityPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link InstanceofPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return InstanceofPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnInstanceofPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Class<Object> type = Object.class;
    InstanceofPredicate instanceofPredicate = new InstanceofPredicate(type);
    Predicate<? super Object>[] predicates =
        new Predicate[] {instanceofPredicate, predicate, predicate2};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates2[0];
    assertTrue(predicate3 instanceof InstanceofPredicate);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertTrue(actualEvaluateResult);
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, ((InstanceofPredicate) predicate3).getType());
    assertSame(instanceofPredicate, predicate3);
    assertSame(instanceofPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link NonePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return NonePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnNonePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NonePredicate<? super Object> nonePredicate = new NonePredicate<>(predicate);
    Predicate<? super Object>[] predicates =
        new Predicate[] {nonePredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate2 = predicates2[0];
    assertTrue(predicate2 instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<? super Object>) predicate2).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(nonePredicate, predicate2);
    assertSame(nonePredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link NonePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return NonePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnNonePredicate2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NonePredicate<? super Object> nonePredicate = new NonePredicate<>(predicate);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates =
        new Predicate[] {nonePredicate, predicate2, predicate3};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate4 = predicates2[0];
    assertTrue(predicate4 instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<? super Object>) predicate4).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(nonePredicate, predicate4);
    assertSame(nonePredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link NotPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return NotPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnNotPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NotPredicate<? super Object> notPredicate = new NotPredicate<>(predicate);
    Predicate<? super Object>[] predicates =
        new Predicate[] {notPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate2 = predicates2[0];
    assertTrue(predicate2 instanceof NotPredicate);
    assertEquals(1, ((NotPredicate<? super Object>) predicate2).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(notPredicate, predicate2);
    assertSame(notPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element return {@link NotPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then first element return NotPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenFirstElementReturnNotPredicate2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NotPredicate<? super Object> notPredicate = new NotPredicate<>(predicate);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {notPredicate, predicate2, predicate3};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate4 = predicates2[0];
    assertTrue(predicate4 instanceof NotPredicate);
    assertEquals(1, ((NotPredicate<? super Object>) predicate4).getPredicates().length);
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(notPredicate, predicate4);
    assertSame(notPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnArrayLengthIsTwo2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return first element is {@link EqualPredicate#EqualPredicate(Object)} with {@code
   *       Object}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then return first element is EqualPredicate(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnFirstElementIsEqualPredicateWithObject() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Object");
    Predicate<? super Object>[] predicates =
        new Predicate[] {equalPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates2[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(equalPredicate, predicate);
    assertSame(equalPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return first element Value is {@code Test}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; then return first element Value is 'Test'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnFirstElementValueIsTest() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", equator);
    Predicate<? super Object>[] predicates =
        new Predicate[] {equalPredicate, mock(Predicate.class), mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 =
        ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates2[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(equalPredicate, predicate);
    assertSame(equalPredicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertEquals(0, predicates.length);
    assertTrue(actualEvaluateResult);
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAllPredicateResult = PredicateUtils.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#allPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    PredicateUtils.allPredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return second element is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); given 'false'; then return second element is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_givenFalse_thenReturnSecondElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate}.
   *   <li>Then return second element is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); given 'false'; when Predicate; then return second element is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_givenFalse_whenPredicate_thenReturnSecondElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return second element is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); given 'true'; then return second element is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_givenTrue_thenReturnSecondElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then array length is two.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<? super Object> predicate22 = new AndPredicate<>(predicate12, predicate2);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate22);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate12).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    assertEquals(2, predicate22.getPredicates().length);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate22, predicates[1]);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then {@link EqualPredicate#EqualPredicate(Object)} with {@code Object} Value is {@code
   *       Object}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); then EqualPredicate(Object) with 'Object' Value is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenEqualPredicateWithObjectValueIsObject() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    EqualPredicate<Object> predicate2 = new EqualPredicate<>("Object");

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof EqualPredicate);
    assertEquals("Object", predicate2.getValue());
    assertEquals("Object", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and equator
   *       is defaultEquator Value is {@code Test}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); then EqualPredicate(Object, Equator) with 'Test' and equator is defaultEquator Value is 'Test'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenEqualPredicateWithTestAndEquatorIsDefaultEquatorValueIsTest() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> predicate2 = new EqualPredicate<>("Test", equator);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof EqualPredicate);
    assertEquals("Test", predicate2.getValue());
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link AllPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return AllPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnAllPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AllPredicate<? super Object> predicate2 = new AllPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof AllPredicate);
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((AllPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link AllPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return AllPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnAllPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AllPredicate<? super Object> predicate2 = new AllPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof AllPredicate);
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((AllPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AnyPredicate<? super Object> predicate2 = new AnyPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof AnyPredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((AnyPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnAnyPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AnyPredicate<? super Object> predicate2 = new AnyPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof AnyPredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((AnyPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link IdentityPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); then second element return IdentityPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnIdentityPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    IdentityPredicate<Object> predicate2 = new IdentityPredicate<>("Object");

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof IdentityPredicate);
    assertEquals("Object", predicate2.getValue());
    assertEquals("Object", ((IdentityPredicate<? super Object>) predicate).getValue());
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link NonePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return NonePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnNonePredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NonePredicate<? super Object> predicate2 = new NonePredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NonePredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((NonePredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link NonePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return NonePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnNonePredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NonePredicate<? super Object> predicate2 = new NonePredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NonePredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((NonePredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link NotPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return NotPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnNotPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NotPredicate<? super Object> predicate2 = new NotPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NotPredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((NotPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Then second element return {@link NotPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test andPredicate(Predicate, Predicate); then second element return NotPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_thenSecondElementReturnNotPredicate2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NotPredicate<? super Object> predicate2 = new NotPredicate<>(predicate);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate3 = predicates[1];
    assertTrue(predicate3 instanceof NotPredicate);
    assertEquals(1, predicate2.getPredicates().length);
    assertEquals(1, ((NotPredicate<? super Object>) predicate3).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate2, predicate3);
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then second element return {@link InstanceofPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); when 'java.lang.Object'; then second element return InstanceofPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_whenJavaLangObject_thenSecondElementReturnInstanceofPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Class<Object> type = Object.class;
    InstanceofPredicate predicate2 = new InstanceofPredicate(type);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    Predicate<? super Object> predicate = predicates[1];
    assertTrue(predicate instanceof InstanceofPredicate);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, ((InstanceofPredicate) predicate).getType());
    assertSame(predicate2, predicate);
    assertSame(type, predicate2.getType());
    assertSame(predicate1, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#andPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return second element is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#andPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test andPredicate(Predicate, Predicate); when Predicate; then return second element is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.andPredicate(Predicate, Predicate)"})
  void testAndPredicate_whenPredicate_thenReturnSecondElementIsPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualAndPredicateResult =
        PredicateUtils.andPredicate(predicate1, predicate2);

    // Assert
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates =
        ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; given Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_givenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate);
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; when ArrayList() add Predicate; then return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_whenArrayListAddPredicate_thenReturnAnyPredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(mock(Predicate.class));
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);

    // Assert
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link FalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; when ArrayList(); then return FalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_whenArrayList_thenReturnFalsePredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Collection) with 'Collection'; when ArrayList(); then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Collection)"})
  void testAnyPredicateWithCollection_whenArrayList_thenReturnNotEvaluate42() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link FalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test anyPredicate(Predicate[]) with 'Predicate[]'; then return FalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertEquals(0, predicates.length);
    assertFalse(actualEvaluateResult);
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link AnyPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'true'; then return AnyPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, mock(Predicate.class)};

    // Act
    Predicate<Object> actualAnyPredicateResult = PredicateUtils.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#anyPredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#anyPredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test anyPredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.anyPredicate(Predicate[])"})
  void testAnyPredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    PredicateUtils.anyPredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link PredicateUtils#asPredicate(Transformer)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#asPredicate(Transformer)}
   */
  @Test
  @DisplayName("Test asPredicate(Transformer); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.asPredicate(Transformer)"})
  void testAsPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAsPredicateResult = PredicateUtils.asPredicate(transformer);
    boolean actualEvaluateResult = actualAsPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualAsPredicateResult instanceof TransformerPredicate);
    assertFalse(actualEvaluateResult);
    assertSame(
        transformer, ((TransformerPredicate<Object>) actualAsPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#asPredicate(Transformer)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#asPredicate(Transformer)}
   */
  @Test
  @DisplayName(
      "Test asPredicate(Transformer); given 'true'; when Transformer apply(Object) return 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.asPredicate(Transformer)"})
  void testAsPredicate_givenTrue_whenTransformerApplyReturnTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAsPredicateResult = PredicateUtils.asPredicate(transformer);
    boolean actualEvaluateResult = actualAsPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualAsPredicateResult instanceof TransformerPredicate);
    assertTrue(actualEvaluateResult);
    assertSame(
        transformer, ((TransformerPredicate<Object>) actualAsPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#asPredicate(Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link TransformerPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#asPredicate(Transformer)}
   */
  @Test
  @DisplayName("Test asPredicate(Transformer); when Transformer; then return TransformerPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.asPredicate(Transformer)"})
  void testAsPredicate_whenTransformer_thenReturnTransformerPredicate() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);

    // Act
    Predicate<Object> actualAsPredicateResult = PredicateUtils.asPredicate(transformer);

    // Assert
    assertTrue(actualAsPredicateResult instanceof TransformerPredicate);
    assertSame(
        transformer, ((TransformerPredicate<Object>) actualAsPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test eitherPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.eitherPredicate(Predicate, Predicate)"})
  void testEitherPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualEitherPredicateResult =
        PredicateUtils.eitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualEitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualEitherPredicateResult instanceof OnePredicate);
    Predicate<? super Object>[] predicates =
        ((OnePredicate<Object>) actualEitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test eitherPredicate(Predicate, Predicate); given 'true'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.eitherPredicate(Predicate, Predicate)"})
  void testEitherPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualEitherPredicateResult =
        PredicateUtils.eitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualEitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualEitherPredicateResult instanceof OnePredicate);
    Predicate<? super Object>[] predicates =
        ((OnePredicate<Object>) actualEitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#eitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test eitherPredicate(Predicate, Predicate); when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.eitherPredicate(Predicate, Predicate)"})
  void testEitherPredicate_whenPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualEitherPredicateResult =
        PredicateUtils.eitherPredicate(predicate1, predicate2);

    // Assert
    assertTrue(actualEitherPredicateResult instanceof OnePredicate);
    Predicate<? super Object>[] predicates =
        ((OnePredicate<Object>) actualEitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object); when '42'; then return Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  void testEqualPredicate_when42_thenReturnValueIs42() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate("42");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("42", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NullPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object); when 'null'; then return NullPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  void testEqualPredicate_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate(null);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertNull(null);
    assertFalse(actualEvaluateResult);
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NullPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object); when 'null'; then return NullPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  void testEqualPredicate_whenNull_thenReturnNullPredicate2() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate(null);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertNull(null);
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#equalPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object); when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.equalPredicate(Object)"})
  void testEqualPredicate_whenValue_thenReturnValue() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate("Value");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Value", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#exceptionPredicate()}.
   *
   * <ul>
   *   <li>Then return {@link ExceptionPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#exceptionPredicate()}
   */
  @Test
  @DisplayName("Test exceptionPredicate(); then return ExceptionPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.exceptionPredicate()"})
  void testExceptionPredicate_thenReturnExceptionPredicate() {
    // Arrange and Act
    Predicate<Object> actualExceptionPredicateResult = PredicateUtils.exceptionPredicate();

    // Assert
    assertTrue(actualExceptionPredicateResult instanceof ExceptionPredicate);
  }

  /**
   * Test {@link PredicateUtils#falsePredicate()}.
   *
   * <p>Method under test: {@link PredicateUtils#falsePredicate()}
   */
  @Test
  @DisplayName("Test falsePredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.falsePredicate()"})
  void testFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualFalsePredicateResult = PredicateUtils.falsePredicate();
    boolean actualEvaluateResult = actualFalsePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualFalsePredicateResult instanceof FalsePredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualFalsePredicateResult.evaluate("Object"));
    assertFalse(actualFalsePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#identityPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  @DisplayName("Test identityPredicate(Object); when '42'; then return Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.identityPredicate(Object)"})
  void testIdentityPredicate_when42_thenReturnValueIs42() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate("42");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("42", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#identityPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NullPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  @DisplayName("Test identityPredicate(Object); when 'null'; then return NullPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.identityPredicate(Object)"})
  void testIdentityPredicate_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate(null);
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof NullPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualIdentityPredicateResult.evaluate("Object"));
    assertFalse(actualIdentityPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#identityPredicate(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  @DisplayName("Test identityPredicate(Object); when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.identityPredicate(Object)"})
  void testIdentityPredicate_whenValue_thenReturnValue() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate("Value");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("Value", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#instanceofPredicate(Class)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@link InstanceofPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#instanceofPredicate(Class)}
   */
  @Test
  @DisplayName(
      "Test instanceofPredicate(Class); when 'java.lang.Object'; then return InstanceofPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.instanceofPredicate(Class)"})
  void testInstanceofPredicate_whenJavaLangObject_thenReturnInstanceofPredicate() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    Predicate<Object> actualInstanceofPredicateResult = PredicateUtils.instanceofPredicate(type);
    boolean actualEvaluateResult = actualInstanceofPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualInstanceofPredicateResult instanceof InstanceofPredicate);
    assertTrue(actualEvaluateResult);
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, ((InstanceofPredicate) actualInstanceofPredicateResult).getType());
  }

  /**
   * Test {@link PredicateUtils#invokerPredicate(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <p>Method under test: {@link PredicateUtils#invokerPredicate(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerPredicate(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.invokerPredicate(String, Class[], Object[])"})
  void testInvokerPredicateWithMethodNameParamTypesArgs() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Predicate<Object> actualInvokerPredicateResult =
        PredicateUtils.invokerPredicate(
            "Method Name", new Class[] {forNameResult}, new Object[] {"Args"});

    // Assert
    assertTrue(
        ((TransformerPredicate<Object>) actualInvokerPredicateResult).getTransformer()
            instanceof InvokerTransformer);
    assertTrue(actualInvokerPredicateResult instanceof TransformerPredicate);
  }

  /**
   * Test {@link PredicateUtils#invokerPredicate(String, Class[], Object[])} with {@code
   * methodName}, {@code paramTypes}, {@code args}.
   *
   * <p>Method under test: {@link PredicateUtils#invokerPredicate(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerPredicate(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.invokerPredicate(String, Class[], Object[])"})
  void testInvokerPredicateWithMethodNameParamTypesArgs2() {
    // Arrange and Act
    Predicate<Object> actualInvokerPredicateResult =
        PredicateUtils.invokerPredicate("Method Name", null, null);

    // Assert
    assertTrue(
        ((TransformerPredicate<Object>) actualInvokerPredicateResult).getTransformer()
            instanceof InvokerTransformer);
    assertTrue(actualInvokerPredicateResult instanceof TransformerPredicate);
  }

  /**
   * Test {@link PredicateUtils#invokerPredicate(String)} with {@code methodName}.
   *
   * <ul>
   *   <li>Then Transformer return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#invokerPredicate(String)}
   */
  @Test
  @DisplayName(
      "Test invokerPredicate(String) with 'methodName'; then Transformer return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.invokerPredicate(String)"})
  void testInvokerPredicateWithMethodName_thenTransformerReturnInvokerTransformer() {
    // Arrange and Act
    Predicate<Object> actualInvokerPredicateResult = PredicateUtils.invokerPredicate("Method Name");

    // Assert
    assertTrue(
        ((TransformerPredicate<Object>) actualInvokerPredicateResult).getTransformer()
            instanceof InvokerTransformer);
    assertTrue(actualInvokerPredicateResult instanceof TransformerPredicate);
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test neitherPredicate(Predicate, Predicate); given 'false'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  void testNeitherPredicate_givenFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNeitherPredicateResult =
        PredicateUtils.neitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualNeitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates =
        ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test neitherPredicate(Predicate, Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  void testNeitherPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNeitherPredicateResult =
        PredicateUtils.neitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualNeitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates =
        ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test neitherPredicate(Predicate, Predicate); given 'true'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  void testNeitherPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualNeitherPredicateResult =
        PredicateUtils.neitherPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualNeitherPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates =
        ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#neitherPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test neitherPredicate(Predicate, Predicate); when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.neitherPredicate(Predicate, Predicate)"})
  void testNeitherPredicate_whenPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualNeitherPredicateResult =
        PredicateUtils.neitherPredicate(predicate1, predicate2);

    // Assert
    assertTrue(actualNeitherPredicateResult instanceof NonePredicate);
    Predicate<? super Object>[] predicates =
        ((NonePredicate<Object>) actualNeitherPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nonePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Collection)"})
  void testNonePredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualEvaluateResult);
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Predicate[]) with 'Predicate[]'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Predicate[]) with 'Predicate[]'; given 'true'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link TruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test nonePredicate(Predicate[]) with 'Predicate[]'; then return TruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicates);
    boolean actualEvaluateResult = actualNonePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertEquals(0, predicates.length);
    assertTrue(actualEvaluateResult);
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#nonePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NonePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test nonePredicate(Predicate[]) with 'Predicate[]'; when Predicate; then return NonePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_whenPredicate_thenReturnNonePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    Predicate<Object> actualNonePredicateResult = PredicateUtils.nonePredicate(predicates);

    // Assert
    assertTrue(actualNonePredicateResult instanceof NonePredicate);
    assertEquals(1, ((NonePredicate<Object>) actualNonePredicateResult).getPredicates().length);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link PredicateUtils#notNullPredicate()}.
   *
   * <p>Method under test: {@link PredicateUtils#notNullPredicate()}
   */
  @Test
  @DisplayName("Test notNullPredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.notNullPredicate()"})
  void testNotNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = PredicateUtils.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#notNullPredicate()}.
   *
   * <ul>
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#notNullPredicate()}
   */
  @Test
  @DisplayName("Test notNullPredicate(); then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.notNullPredicate()"})
  void testNotNullPredicate_thenReturnEvaluate42() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = PredicateUtils.notNullPredicate();
    boolean actualEvaluateResult = actualNotNullPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#notPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#notPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test notPredicate(Predicate); given 'false'; when Predicate test(Object) return 'false'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.notPredicate(Predicate)"})
  void testNotPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNotPredicateResult = PredicateUtils.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates =
        ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#notPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#notPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test notPredicate(Predicate); given 'true'; when Predicate test(Object) return 'true'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.notPredicate(Predicate)"})
  void testNotPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNotPredicateResult = PredicateUtils.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates =
        ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#notPredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NotPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#notPredicate(Predicate)}
   */
  @Test
  @DisplayName("Test notPredicate(Predicate); when Predicate; then return NotPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.notPredicate(Predicate)"})
  void testNotPredicate_whenPredicate_thenReturnNotPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNotPredicateResult = PredicateUtils.notPredicate(predicate);

    // Assert
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates =
        ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsExceptionPredicate(Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        PredicateUtils.nullIsExceptionPredicate(predicate);
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
   * Test {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsExceptionPredicate(Predicate); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        PredicateUtils.nullIsExceptionPredicate(predicate);
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
   * Test {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NullIsExceptionPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsExceptionPredicate(Predicate); when Predicate; then return NullIsExceptionPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsExceptionPredicate(Predicate)"})
  void testNullIsExceptionPredicate_whenPredicate_thenReturnNullIsExceptionPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult =
        PredicateUtils.nullIsExceptionPredicate(predicate);

    // Assert
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsFalsePredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsFalsePredicate(Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult =
        PredicateUtils.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsFalsePredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsFalsePredicate(Predicate); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult =
        PredicateUtils.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsFalsePredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NullIsFalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsFalsePredicate(Predicate); when Predicate; then return NullIsFalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_whenPredicate_thenReturnNullIsFalsePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult =
        PredicateUtils.nullIsFalsePredicate(predicate);

    // Assert
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsTruePredicate(Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        PredicateUtils.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsTruePredicate(Predicate); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        PredicateUtils.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullIsTruePredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link NullIsTruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#nullIsTruePredicate(Predicate)}
   */
  @Test
  @DisplayName(
      "Test nullIsTruePredicate(Predicate); when Predicate; then return NullIsTruePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullIsTruePredicate(Predicate)"})
  void testNullIsTruePredicate_whenPredicate_thenReturnNullIsTruePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult =
        PredicateUtils.nullIsTruePredicate(predicate);

    // Assert
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates =
        ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link PredicateUtils#nullPredicate()}.
   *
   * <p>Method under test: {@link PredicateUtils#nullPredicate()}
   */
  @Test
  @DisplayName("Test nullPredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.nullPredicate()"})
  void testNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = PredicateUtils.nullPredicate();
    boolean actualEvaluateResult = actualNullPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Collection) with 'Collection'; when ArrayList() add Predicate; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Collection)"})
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
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Collection)}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Collection) with 'Collection'; when ArrayList(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Collection)"})
  void testOnePredicateWithCollection_whenArrayList_thenReturnArrayLengthIsZero() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(0, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertFalse(actualEvaluateResult);
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then return {@link FalsePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; then return FalsePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualOnePredicateResult instanceof FalsePredicate);
    assertEquals(0, predicates.length);
    assertFalse(actualEvaluateResult);
    assertFalse(actualOnePredicateResult.evaluate("Object"));
    assertFalse(actualOnePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#evaluate(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'; then calls evaluate(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateEvaluateReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link OnePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'true'; then return OnePredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnOnePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate, predicate2};

    // Act
    Predicate<Object> actualOnePredicateResult = PredicateUtils.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link PredicateUtils#onePredicate(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName(
      "Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    PredicateUtils.onePredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test orPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test orPredicate(Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test orPredicate(Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualOrPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#orPredicate(Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link OrPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#orPredicate(Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test orPredicate(Predicate, Predicate); when Predicate; then return OrPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.orPredicate(Predicate, Predicate)"})
  void testOrPredicate_whenPredicate_thenReturnOrPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    Predicate<Object> actualOrPredicateResult = PredicateUtils.orPredicate(predicate1, predicate2);

    // Assert
    assertTrue(actualOrPredicateResult instanceof OrPredicate);
    Predicate<? super Object>[] predicates =
        ((OrPredicate<Object>) actualOrPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @DisplayName(
      "Test transformedPredicate(Transformer, Predicate); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.transformedPredicate(Transformer, Predicate)"})
  void testTransformedPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualTransformedPredicateResult =
        PredicateUtils.transformedPredicate(transformer, predicate);
    boolean actualEvaluateResult = actualTransformedPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates =
        ((TransformedPredicate<Object>) actualTransformedPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
    assertSame(
        transformer,
        ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @DisplayName(
      "Test transformedPredicate(Transformer, Predicate); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.transformedPredicate(Transformer, Predicate)"})
  void testTransformedPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualTransformedPredicateResult =
        PredicateUtils.transformedPredicate(transformer, predicate);
    boolean actualEvaluateResult = actualTransformedPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates =
        ((TransformedPredicate<Object>) actualTransformedPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
    assertSame(
        transformer,
        ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateUtils#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @DisplayName("Test transformedPredicate(Transformer, Predicate); when Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.transformedPredicate(Transformer, Predicate)"})
  void testTransformedPredicate_whenTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualTransformedPredicateResult =
        PredicateUtils.transformedPredicate(transformer, predicate);

    // Assert
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates =
        ((TransformedPredicate<Object>) actualTransformedPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
    assertSame(
        transformer,
        ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link PredicateUtils#truePredicate()}.
   *
   * <p>Method under test: {@link PredicateUtils#truePredicate()}
   */
  @Test
  @DisplayName("Test truePredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.truePredicate()"})
  void testTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualTruePredicateResult = PredicateUtils.truePredicate();
    boolean actualEvaluateResult = actualTruePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualTruePredicateResult instanceof TruePredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualTruePredicateResult.evaluate("Object"));
    assertTrue(actualTruePredicateResult.test("Object"));
  }

  /**
   * Test {@link PredicateUtils#uniquePredicate()}.
   *
   * <p>Method under test: {@link PredicateUtils#uniquePredicate()}
   */
  @Test
  @DisplayName("Test uniquePredicate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate PredicateUtils.uniquePredicate()"})
  void testUniquePredicate() {
    // Arrange and Act
    Predicate<Object> actualUniquePredicateResult = PredicateUtils.uniquePredicate();
    boolean actualEvaluateResult = actualUniquePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualUniquePredicateResult instanceof UniquePredicate);
    assertTrue(actualUniquePredicateResult.evaluate("Object"));
    assertFalse(actualUniquePredicateResult.test("Object"));
    assertTrue(actualEvaluateResult);
  }
}
