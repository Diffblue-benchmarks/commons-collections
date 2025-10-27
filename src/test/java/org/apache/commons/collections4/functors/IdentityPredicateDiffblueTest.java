package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class IdentityPredicateDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IdentityPredicate#IdentityPredicate(Object)}
   *   <li>{@link IdentityPredicate#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    IdentityPredicate<Object> actualIdentityPredicate = new IdentityPredicate<>("Object");

    // Assert
    assertEquals("Object", actualIdentityPredicate.getValue());
  }

  /**
   * Method under test: {@link IdentityPredicate#identityPredicate(Object)}
   */
  @Test
  public void testIdentityPredicate() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = IdentityPredicate.identityPredicate("Object");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("Object", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Method under test: {@link IdentityPredicate#identityPredicate(Object)}
   */
  @Test
  public void testIdentityPredicate2() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = IdentityPredicate.identityPredicate(null);

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof NullPredicate);
    assertFalse(actualIdentityPredicateResult.evaluate("42"));
    assertFalse(actualIdentityPredicateResult.evaluate("Object"));
    assertFalse(actualIdentityPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link IdentityPredicate#identityPredicate(Object)}
   */
  @Test
  public void testIdentityPredicate3() {
    // Arrange and Act
    Predicate<Object> actualIdentityPredicateResult = IdentityPredicate.identityPredicate("42");
    boolean actualEvaluateResult = actualIdentityPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualIdentityPredicateResult instanceof IdentityPredicate);
    assertEquals("42", ((IdentityPredicate<Object>) actualIdentityPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test: {@link IdentityPredicate#test(Object)}
   */
  @Test
  public void testTest() {
    // Arrange
    IdentityPredicate<Object> identityPredicate = new IdentityPredicate<>("Object");

    // Act and Assert
    assertTrue(identityPredicate.test("Object"));
  }

  /**
   * Method under test: {@link IdentityPredicate#test(Object)}
   */
  @Test
  public void testTest2() {
    // Arrange
    IdentityPredicate<Object> identityPredicate = new IdentityPredicate<>(1);

    // Act and Assert
    assertFalse(identityPredicate.test("Object"));
  }
}
