package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NullIsFalsePredicateDiffblueTest {
  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsFalsePredicate(Predicate); given 'false'; then return not evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsFalsePredicate(Predicate); given 'true'; then return evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsFalsePredicate(Predicate); when Predicate; then 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_whenPredicate_thenNull() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate(null);

    // Assert
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    assertNull(null);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@link NullIsFalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test nullIsFalsePredicate(Predicate); when Predicate; then return NullIsFalsePredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  void testNullIsFalsePredicate_whenPredicate_thenReturnNullIsFalsePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);

    // Assert
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)}.
   * <p>
   * Method under test: {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)}
   */
  @Test
  @DisplayName("Test new NullIsFalsePredicate(Predicate)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NullIsFalsePredicate.<init>(Predicate)"})
  void testNewNullIsFalsePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NullIsFalsePredicate<Object> actualNullIsFalsePredicate = new NullIsFalsePredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsFalsePredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#getPredicates()}.
   * <p>
   * Method under test: {@link NullIsFalsePredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate[] NullIsFalsePredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    NullIsFalsePredicate<Object> nullIsFalsePredicate = new NullIsFalsePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, nullIsFalsePredicate.getPredicates().length);
  }

  /**
   * Test {@link NullIsFalsePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given NullIsFalsePredicate(Predicate) with Predicate; when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean NullIsFalsePredicate.test(Object)"})
  void testTest_givenNullIsFalsePredicateWithPredicate_whenNull_thenReturnFalse() {
    // Arrange
    NullIsFalsePredicate<Object> nullIsFalsePredicate = new NullIsFalsePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertFalse(nullIsFalsePredicate.test(null));
  }

  /**
   * Test {@link NullIsFalsePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; when 'Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean NullIsFalsePredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_whenObject_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NullIsFalsePredicate<Object> nullIsFalsePredicate = new NullIsFalsePredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsFalsePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
