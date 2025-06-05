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

class NonePredicateDiffblueTest {
  /**
   * Test {@link NonePredicate#nonePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @DisplayName("Test nonePredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Collection)}
   */
  @Test
  @DisplayName("Test nonePredicate(Collection) with 'Collection'; when ArrayList(); then return TruePredicate")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test nonePredicate(Predicate[]) with 'Predicate[]'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};

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
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test nonePredicate(Predicate[]) with 'Predicate[]'; given 'true'; then return not evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_givenTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};

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
   * <ul>
   *   <li>Then return {@link TruePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test nonePredicate(Predicate[]) with 'Predicate[]'; then return TruePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_thenReturnTruePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{};

    // Act
    Predicate<Object> actualNonePredicateResult = NonePredicate.nonePredicate(predicates);

    // Assert
    assertTrue(actualNonePredicateResult instanceof TruePredicate);
    assertEquals(0, predicates.length);
    assertTrue(actualNonePredicateResult.evaluate("42"));
    assertTrue(actualNonePredicateResult.evaluate("Object"));
    assertTrue(actualNonePredicateResult.test("Object"));
  }

  /**
   * Test {@link NonePredicate#nonePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@link NonePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#nonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test nonePredicate(Predicate[]) with 'Predicate[]'; when Predicate; then return NonePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NonePredicate.nonePredicate(Predicate[])"})
  void testNonePredicateWithPredicate_whenPredicate_thenReturnNonePredicate() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{mock(Predicate.class)};

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
   * <p>
   * Method under test: {@link NonePredicate#NonePredicate(Predicate[])}
   */
  @Test
  @DisplayName("Test new NonePredicate(Predicate[])")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NonePredicate<Object> nonePredicate = new NonePredicate<>(predicate);

    // Act
    boolean actualTestResult = nonePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link NonePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NonePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean NonePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnFalse() {
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
}
