package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.comparators.NullComparator;
import org.junit.Test;

public class ComparatorPredicateDiffblueTest {
  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  public void testComparatorPredicate() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object",
        new NullComparator<>());

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("42"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  public void testComparatorPredicate2() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("42",
        new NullComparator<>());
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate3() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object",
        new NullComparator<>(), ComparatorPredicate.Criterion.EQUAL);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("42"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate4() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("42",
        new NullComparator<>(), ComparatorPredicate.Criterion.EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate5() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object",
        new NullComparator<>(), ComparatorPredicate.Criterion.GREATER);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate6() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object",
        new NullComparator<>(), ComparatorPredicate.Criterion.LESS);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("42"));
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate7() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object",
        new NullComparator<>(), ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.test("Target"));
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate8() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("42",
        new NullComparator<>(), ComparatorPredicate.Criterion.GREATER);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("42"));
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate9() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object",
        new NullComparator<>(), ComparatorPredicate.Criterion.LESS_OR_EQUAL);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("42"));
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate10() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("",
        new NullComparator<>(), ComparatorPredicate.Criterion.LESS);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualComparatorPredicateResult.evaluate("42"));
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate11() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("",
        new NullComparator<>(), ComparatorPredicate.Criterion.GREATER_OR_EQUAL);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualComparatorPredicateResult.evaluate("42"));
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Method under test:
   * {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, ComparatorPredicate.Criterion)}
   */
  @Test
  public void testComparatorPredicate12() {
    // Arrange and Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("42",
        new NullComparator<>(), ComparatorPredicate.Criterion.LESS_OR_EQUAL);

    // Assert
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualComparatorPredicateResult.evaluate("42"));
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", new NullComparator<>(),
        ComparatorPredicate.Criterion.EQUAL);

    // Act and Assert
    assertFalse(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest2() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", new NullComparator<>(),
        ComparatorPredicate.Criterion.GREATER);

    // Act and Assert
    assertFalse(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest3() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", new NullComparator<>(),
        ComparatorPredicate.Criterion.LESS);

    // Act and Assert
    assertTrue(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest4() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", new NullComparator<>(),
        ComparatorPredicate.Criterion.GREATER_OR_EQUAL);

    // Act and Assert
    assertFalse(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest5() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", new NullComparator<>(),
        ComparatorPredicate.Criterion.LESS_OR_EQUAL);

    // Act and Assert
    assertTrue(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest6() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("comparator", new NullComparator<>(),
        ComparatorPredicate.Criterion.GREATER);

    // Act and Assert
    assertTrue(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest7() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("comparator", new NullComparator<>(),
        ComparatorPredicate.Criterion.LESS);

    // Act and Assert
    assertFalse(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest8() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("comparator", new NullComparator<>(),
        ComparatorPredicate.Criterion.GREATER_OR_EQUAL);

    // Act and Assert
    assertTrue(comparatorPredicate.test("Target"));
  }

  /**
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  public void testTest9() {
    // Arrange
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("comparator", new NullComparator<>(),
        ComparatorPredicate.Criterion.LESS_OR_EQUAL);

    // Act and Assert
    assertFalse(comparatorPredicate.test("Target"));
  }
}
