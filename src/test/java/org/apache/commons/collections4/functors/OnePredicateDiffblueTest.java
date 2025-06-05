package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Collection)}
   */
  @Test
  @DisplayName("Test onePredicate(Collection) with 'Collection'; when ArrayList() add Predicate; then ArrayList() size is two")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Collection)}
   */
  @Test
  @DisplayName("Test onePredicate(Collection) with 'Collection'; when ArrayList(); then return array length is zero")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; then return FalsePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{};

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);

    // Assert
    assertTrue(actualOnePredicateResult instanceof FalsePredicate);
    assertEquals(0, predicates.length);
    assertFalse(actualOnePredicateResult.evaluate("42"));
    assertFalse(actualOnePredicateResult.evaluate("Object"));
    assertFalse(actualOnePredicateResult.test("Object"));
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return not evaluate two.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; then return not evaluate two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_thenReturnNotEvaluateTwo() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{};

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
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'; then calls evaluate(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};

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
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateEvaluateReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};

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
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate, predicate2};

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
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link OnePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'true'; then return OnePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnOnePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate, predicate2};

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
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test onePredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  void testOnePredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{mock(Predicate.class)};

    // Act
    OnePredicate.onePredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link OnePredicate#OnePredicate(Predicate[])}.
   * <p>
   * Method under test: {@link OnePredicate#OnePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test new OnePredicate(Predicate[])")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    OnePredicate<Object> onePredicate = new OnePredicate<>(predicate);

    // Act
    boolean actualTestResult = onePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
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
}
