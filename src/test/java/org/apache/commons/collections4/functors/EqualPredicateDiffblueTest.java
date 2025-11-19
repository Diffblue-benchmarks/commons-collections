package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EqualPredicateDiffblueTest {
  /**
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code
   * equator}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test equalPredicate(Object, Equator) with 'object', 'equator'; when '42'; then return Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  void testEqualPredicateWithObjectEquator_when42_thenReturnValueIs42() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("42", equator);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("42", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code
   * equator}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NullPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test equalPredicate(Object, Equator) with 'object', 'equator'; when 'null'; then return NullPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  void testEqualPredicateWithObjectEquator_whenNull_thenReturnNullPredicate() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate(null, equator);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code
   * equator}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return Value is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test equalPredicate(Object, Equator) with 'object', 'equator'; when 'Object'; then return Value is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  void testEqualPredicateWithObjectEquator_whenObject_thenReturnValueIsObject() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("Object", equator);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code
   * equator}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return Value is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @DisplayName(
      "Test equalPredicate(Object, Equator) with 'object', 'equator'; when 'Object'; then return Value is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  void testEqualPredicateWithObjectEquator_whenObject_thenReturnValueIsObject2() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("Object", null);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object)} with {@code object}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object) with 'object'; when '42'; then return Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  void testEqualPredicateWithObject_when42_thenReturnValueIs42() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("42");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("42", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object)} with {@code object}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NullPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object) with 'object'; when 'null'; then return NullPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  void testEqualPredicateWithObject_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate(null);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertNull(null);
    assertFalse(actualEvaluateResult);
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object)} with {@code object}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NullPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @DisplayName("Test equalPredicate(Object) with 'object'; when 'null'; then return NullPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  void testEqualPredicateWithObject_whenNull_thenReturnNullPredicate2() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate(null);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertNull(null);
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object)} with {@code object}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return Value is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @DisplayName(
      "Test equalPredicate(Object) with 'object'; when 'Object'; then return Value is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  void testEqualPredicateWithObject_whenObject_thenReturnValueIsObject() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("Object");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return Value is {@code Object}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EqualPredicate#EqualPredicate(Object)}
   *   <li>{@link EqualPredicate#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'Object'; then return Value is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EqualPredicate.<init>(Object)",
    "void EqualPredicate.<init>(Object, Equator)",
    "Object EqualPredicate.getValue()"
  })
  void testGettersAndSetters_whenObject_thenReturnValueIsObject() {
    // Arrange and Act
    EqualPredicate<Object> actualEqualPredicate = new EqualPredicate<>("Object");

    // Assert
    assertEquals("Object", actualEqualPredicate.getValue());
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code Test}.
   *   <li>Then return Value is {@code Test}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EqualPredicate#EqualPredicate(Object, Equator)}
   *   <li>{@link EqualPredicate#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when 'Test'; then return Value is 'Test'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EqualPredicate.<init>(Object)",
    "void EqualPredicate.<init>(Object, Equator)",
    "Object EqualPredicate.getValue()"
  })
  void testGettersAndSetters_whenTest_thenReturnValueIsTest() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    EqualPredicate<Object> actualEqualPredicate = new EqualPredicate<>("Test", equator);

    // Assert
    assertEquals("Test", actualEqualPredicate.getValue());
  }

  /**
   * Test {@link EqualPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given EqualPredicate(Object) with 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EqualPredicate.test(Object)"})
  void testTest_givenEqualPredicateWithObject_thenReturnTrue() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Object");

    // Act and Assert
    assertTrue(equalPredicate.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and
   *       equator is defaultEquator.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given EqualPredicate(Object, Equator) with 'Test' and equator is defaultEquator; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EqualPredicate.test(Object)"})
  void testTest_givenEqualPredicateWithTestAndEquatorIsDefaultEquator_thenReturnFalse() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", equator);

    // Act and Assert
    assertFalse(equalPredicate.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and
   *       equator is {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given EqualPredicate(Object, Equator) with 'Test' and equator is 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EqualPredicate.test(Object)"})
  void testTest_givenEqualPredicateWithTestAndEquatorIsNull_thenReturnFalse() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", null);

    // Act and Assert
    assertFalse(equalPredicate.test("Object"));
  }
}
