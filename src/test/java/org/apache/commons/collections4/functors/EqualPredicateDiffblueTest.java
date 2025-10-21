package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EqualPredicateDiffblueTest {
  /**
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code equator}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  public void testEqualPredicateWithObjectEquator_when42_thenReturnValueIs42() {
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
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code equator}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NullPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  public void testEqualPredicateWithObjectEquator_whenNull_thenReturnNullPredicate() {
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
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code equator}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return Value is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  public void testEqualPredicateWithObjectEquator_whenObject_thenReturnValueIsObject() {
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
   * Test {@link EqualPredicate#equalPredicate(Object, Equator)} with {@code object}, {@code equator}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return Value is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object, Equator)"})
  public void testEqualPredicateWithObjectEquator_whenObject_thenReturnValueIsObject2() {
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
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  public void testEqualPredicateWithObject_when42_thenReturnValueIs42() {
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NullPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  public void testEqualPredicateWithObject_whenNull_thenReturnNullPredicate() {
    // Arrange and Act
    Predicate<Object> actualEqualPredicateResult = EqualPredicate.equalPredicate(null);

    // Assert
    assertTrue(actualEqualPredicateResult instanceof NullPredicate);
    assertFalse(actualEqualPredicateResult.evaluate("42"));
    assertFalse(actualEqualPredicateResult.evaluate("Object"));
    assertFalse(actualEqualPredicateResult.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#equalPredicate(Object)} with {@code object}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return Value is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#equalPredicate(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate EqualPredicate.equalPredicate(Object)"})
  public void testEqualPredicateWithObject_whenObject_thenReturnValueIsObject() {
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
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return Value is {@code Object}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EqualPredicate#EqualPredicate(Object)}
   *   <li>{@link EqualPredicate#getValue()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EqualPredicate.<init>(Object)", "void EqualPredicate.<init>(Object, Equator)",
      "Object EqualPredicate.getValue()"})
  public void testGettersAndSetters_whenObject_thenReturnValueIsObject() {
    // Arrange and Act
    EqualPredicate<Object> actualEqualPredicate = new EqualPredicate<>("Object");

    // Assert
    assertEquals("Object", actualEqualPredicate.getValue());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code Test}.</li>
   *   <li>Then return Value is {@code Test}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EqualPredicate#EqualPredicate(Object, Equator)}
   *   <li>{@link EqualPredicate#getValue()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EqualPredicate.<init>(Object)", "void EqualPredicate.<init>(Object, Equator)",
      "Object EqualPredicate.getValue()"})
  public void testGettersAndSetters_whenTest_thenReturnValueIsTest() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    EqualPredicate<Object> actualEqualPredicate = new EqualPredicate<>("Test", equator);

    // Assert
    assertEquals("Test", actualEqualPredicate.getValue());
  }

  /**
   * Test {@link EqualPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EqualPredicate.test(Object)"})
  public void testTest_givenEqualPredicateWithObject_thenReturnTrue() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Object");

    // Act and Assert
    assertTrue(equalPredicate.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and equator is defaultEquator.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EqualPredicate.test(Object)"})
  public void testTest_givenEqualPredicateWithTestAndEquatorIsDefaultEquator_thenReturnFalse() {
    // Arrange
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", equator);

    // Act and Assert
    assertFalse(equalPredicate.test("Object"));
  }

  /**
   * Test {@link EqualPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and equator is {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EqualPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EqualPredicate.test(Object)"})
  public void testTest_givenEqualPredicateWithTestAndEquatorIsNull_thenReturnFalse() {
    // Arrange
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", null);

    // Act and Assert
    assertFalse(equalPredicate.test("Object"));
  }
}
