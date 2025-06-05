package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
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

class AllPredicateDiffblueTest {
  /**
   * Test {@link AllPredicate#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return {@link AllPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Collection)}
   */
  @Test
  @DisplayName("Test allPredicate(Collection) with 'Collection'; then return AllPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Collection)"})
  void testAllPredicateWithCollection_thenReturnAllPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, predicates.size());
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Collection)}
   */
  @Test
  @DisplayName("Test allPredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Collection)"})
  void testAllPredicateWithCollection_whenArrayList_thenReturnTruePredicate() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualEvaluateResult);
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link AllPredicate#allPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Collection)}
   */
  @Test
  @DisplayName("Test allPredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Collection)"})
  void testAllPredicateWithCollection_whenArrayList_thenReturnTruePredicate2() {
    // Arrange
    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertTrue(predicates.isEmpty());
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return array length is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; then return array length is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnArrayLengthIsThree() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AllPredicate<? super Object> allPredicate = new AllPredicate<>(predicate);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{allPredicate, predicate2, predicate3};

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate3).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    Predicate<? super Object>[] predicates2 = ((AllPredicate<Object>) actualAllPredicateResult).getPredicates();
    assertEquals(3, predicates2.length);
    assertEquals(3, predicates.length);
    Predicate<? super Object>[] predicateArray = ((AllPredicate<Object>) actualAllPredicateResult).iPredicates;
    assertEquals(3, predicateArray.length);
    assertTrue(actualEvaluateResult);
    assertSame(allPredicate, predicates2[0]);
    assertSame(allPredicate, predicates[0]);
    assertSame(allPredicate, predicateArray[0]);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; then return array length is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate, predicate2};

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; then return TruePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{};

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);

    // Assert
    assertTrue(actualAllPredicateResult instanceof TruePredicate);
    assertEquals(0, predicates.length);
    assertTrue(actualAllPredicateResult.evaluate("42"));
    assertTrue(actualAllPredicateResult.evaluate("Object"));
    assertTrue(actualAllPredicateResult.test("Object"));
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicateEvaluateReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate evaluate(Object) return 'true'; then calls evaluate(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate, mock(Predicate.class)};

    // Act
    Predicate<Object> actualAllPredicateResult = AllPredicate.allPredicate(predicates);
    boolean actualEvaluateResult = actualAllPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAllPredicateResult instanceof AllPredicate);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).getPredicates().length);
    assertEquals(2, predicates.length);
    assertEquals(2, ((AllPredicate<Object>) actualAllPredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AllPredicate#allPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#allPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test allPredicate(Predicate[]) with 'Predicate[]'; when Predicate; then array length is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate AllPredicate.allPredicate(Predicate[])"})
  void testAllPredicateWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{mock(Predicate.class)};

    // Act
    AllPredicate.allPredicate(predicates);

    // Assert that nothing has changed
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link AllPredicate#AllPredicate(Predicate[])}.
   * <p>
   * Method under test: {@link AllPredicate#AllPredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test new AllPredicate(Predicate[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AllPredicate.<init>(Predicate[])"})
  void testNewAllPredicate() {
    // Arrange and Act
    AllPredicate<Object> actualAllPredicate = new AllPredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualAllPredicate.getPredicates().length);
    assertEquals(1, actualAllPredicate.iPredicates.length);
  }

  /**
   * Test {@link AllPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AllPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AllPredicate<Object> allPredicate = new AllPredicate<>(predicate);

    // Act
    boolean actualTestResult = allPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AllPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AllPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AllPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AllPredicate<Object> allPredicate = new AllPredicate<>(predicate);

    // Act
    boolean actualTestResult = allPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
