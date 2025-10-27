package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.Test;

public class PredicateUtilsDiffblueTest {
  /**
   * Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  public void testEqualPredicate() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate("Value");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Value", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  public void testEqualPredicate2() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate(null);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertFalse(actualEqualPredicateResult.evaluate("42"));
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link PredicateUtils#equalPredicate(Object)}
   */
  @Test
  public void testEqualPredicate3() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = PredicateUtils.equalPredicate("42");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("42", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test: {@link PredicateUtils#falsePredicate()}
   */
  @Test
  public void testFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualFalsePredicateResult = PredicateUtils.falsePredicate();

    // Assert
    assertTrue(actualFalsePredicateResult instanceof FalsePredicate);
    assertFalse(actualFalsePredicateResult.evaluate("42"));
    assertFalse(actualFalsePredicateResult.evaluate("Object"));
    assertFalse(actualFalsePredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  public void testIdentityPredicate() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate("Value");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("Value", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  public void testIdentityPredicate2() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate(null);

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof NullPredicate);
    assertFalse(actualIdentityPredicateResult.evaluate("42"));
    assertFalse(actualIdentityPredicateResult.evaluate("Object"));
    assertFalse(actualIdentityPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link PredicateUtils#identityPredicate(Object)}
   */
  @Test
  public void testIdentityPredicate3() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = PredicateUtils.identityPredicate("42");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("42", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test: {@link PredicateUtils#instanceofPredicate(Class)}
   */
  @Test
  public void testInstanceofPredicate() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    Predicate<Object> actualInstanceofPredicateResult = PredicateUtils.instanceofPredicate(type);

    // Assert
    assertTrue(actualInstanceofPredicateResult instanceof InstanceofPredicate);
    assertTrue(actualInstanceofPredicateResult.evaluate("42"));
    Class<Object> expectedType = Object.class;
    Class<?> type2 = ((InstanceofPredicate) actualInstanceofPredicateResult).getType();
    assertEquals(expectedType, type2);
    assertSame(type, type2);
  }

  /**
   * Method under test: {@link PredicateUtils#notNullPredicate()}
   */
  @Test
  public void testNotNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNotNullPredicateResult = PredicateUtils.notNullPredicate();

    // Assert
    assertTrue(actualNotNullPredicateResult instanceof NotNullPredicate);
    assertTrue(actualNotNullPredicateResult.evaluate("42"));
    assertTrue(actualNotNullPredicateResult.evaluate("Object"));
    assertTrue(actualNotNullPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link PredicateUtils#nullPredicate()}
   */
  @Test
  public void testNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualNullPredicateResult = PredicateUtils.nullPredicate();

    // Assert
    assertTrue(actualNullPredicateResult instanceof NullPredicate);
    assertFalse(actualNullPredicateResult.evaluate("42"));
    assertFalse(actualNullPredicateResult.evaluate("Object"));
    assertFalse(actualNullPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link PredicateUtils#truePredicate()}
   */
  @Test
  public void testTruePredicate() {
    // Arrange and Act
    Predicate<Object> actualTruePredicateResult = PredicateUtils.truePredicate();

    // Assert
    assertTrue(actualTruePredicateResult instanceof TruePredicate);
    assertTrue(actualTruePredicateResult.evaluate("42"));
    assertTrue(actualTruePredicateResult.evaluate("Object"));
    assertTrue(actualTruePredicateResult.test("Object"));
  }
}
