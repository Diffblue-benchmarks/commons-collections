package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class EqualPredicateDiffblueTest {
  /**
   * Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  public void testEqualPredicate() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("Object");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  public void testEqualPredicate2() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate(null);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertFalse(actualEqualPredicateResult.evaluate("42"));
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  public void testEqualPredicate3() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("42");
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("42", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  public void testEqualPredicate4() {
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
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  public void testEqualPredicate5() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate(null, equator);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertFalse(actualEqualPredicateResult.evaluate("42"));
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  public void testEqualPredicate6() {
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
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  public void testEqualPredicate7() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate("Object", null);
    boolean actualEvaluateResult = actualEqualPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualEqualPredicateResult instanceof EqualPredicate);
    assertEquals("Object", ((EqualPredicate<Object>) actualEqualPredicateResult).getValue());
    assertFalse(actualEvaluateResult);
  }

  /**
   * Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  public void testTest() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", equator);

    // Act and Assert
    assertFalse(equalPredicate.test("Object"));
  }

  /**
   * Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  public void testTest2() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", null);

    // Act and Assert
    assertFalse(equalPredicate.test("Object"));
  }

  /**
   * Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  public void testTest3() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Object");

    // Act and Assert
    assertTrue(equalPredicate.test("Object"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EqualPredicate#EqualPredicate(Object)}
   *   <li>{@link EqualPredicate#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    EqualPredicate<Object> actualEqualPredicate = new EqualPredicate<>("Object");

    // Assert
    assertEquals("Object", actualEqualPredicate.getValue());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EqualPredicate#EqualPredicate(Object, Equator)}
   *   <li>{@link EqualPredicate#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    EqualPredicate<Object> actualEqualPredicate = new EqualPredicate<>("Test", equator);

    // Assert
    assertEquals("Test", actualEqualPredicate.getValue());
  }
}
