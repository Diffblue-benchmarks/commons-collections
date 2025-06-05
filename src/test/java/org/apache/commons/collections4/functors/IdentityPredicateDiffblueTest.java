package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IdentityPredicateDiffblueTest {
  /**
   * Test {@link IdentityPredicate#identityPredicate(Object)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdentityPredicate#identityPredicate(Object)}
   */
  @Test
  @DisplayName("Test identityPredicate(Object); when '42'; then return Value is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate IdentityPredicate.identityPredicate(Object)"})
  void testIdentityPredicate_when42_thenReturnValueIs42() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = IdentityPredicate.identityPredicate("42");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("42", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link IdentityPredicate#identityPredicate(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NullPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdentityPredicate#identityPredicate(Object)}
   */
  @Test
  @DisplayName("Test identityPredicate(Object); when 'null'; then return NullPredicate")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate IdentityPredicate.identityPredicate(Object)"})
  void testIdentityPredicate_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = IdentityPredicate.identityPredicate(null);

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof NullPredicate);
    assertFalse(actualIdentityPredicateResult.evaluate("42"));
    assertFalse(actualIdentityPredicateResult.evaluate("Object"));
    assertFalse(actualIdentityPredicateResult.test("Object"));
  }

  /**
   * Test {@link IdentityPredicate#identityPredicate(Object)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return Value is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdentityPredicate#identityPredicate(Object)}
   */
  @Test
  @DisplayName("Test identityPredicate(Object); when 'Object'; then return Value is 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate IdentityPredicate.identityPredicate(Object)"})
  void testIdentityPredicate_whenObject_thenReturnValueIsObject() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = IdentityPredicate.identityPredicate("Object");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("Object", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link IdentityPredicate#IdentityPredicate(Object)}
   *   <li>{@link IdentityPredicate#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IdentityPredicate.<init>(Object)", "Object IdentityPredicate.getValue()"})
  void testGettersAndSetters() {
    // Arrange and Act
    IdentityPredicate<Object> actualIdentityPredicate = new IdentityPredicate<>("Object");

    // Assert
    assertEquals("Object", actualIdentityPredicate.getValue());
  }

  /**
   * Test {@link IdentityPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link IdentityPredicate#IdentityPredicate(Object)} with object is one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdentityPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given IdentityPredicate(Object) with object is one; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean IdentityPredicate.test(Object)"})
  void testTest_givenIdentityPredicateWithObjectIsOne_thenReturnFalse() {
    // Arrange
    IdentityPredicate<Object> identityPredicate = new IdentityPredicate<>(1);

    // Act and Assert
    assertFalse(identityPredicate.test("Object"));
  }

  /**
   * Test {@link IdentityPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link IdentityPredicate#IdentityPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IdentityPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given IdentityPredicate(Object) with 'Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean IdentityPredicate.test(Object)"})
  void testTest_givenIdentityPredicateWithObject_thenReturnTrue() {
    // Arrange
    IdentityPredicate<Object> identityPredicate = new IdentityPredicate<>("Object");

    // Act and Assert
    assertTrue(identityPredicate.test("Object"));
  }
}
