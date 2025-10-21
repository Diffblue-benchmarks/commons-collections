package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.ComparatorPredicate.Criterion;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ComparatorPredicateDiffblueTest {
  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new IllegalStateException("foo"));

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.EQUAL);

    // Assert
    assertThrows(IllegalStateException.class, () -> actualComparatorPredicateResult.evaluate("42"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>Given {@link DefaultEquator#HASHCODE_NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_givenHashcode_null() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(DefaultEquator.HASHCODE_NULL);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.LESS);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>Given {@link DefaultEquator#HASHCODE_NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_givenHashcode_null2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(DefaultEquator.HASHCODE_NULL);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.GREATER_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>Given zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_givenZero() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@code GREATER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_givenZero_whenGreater() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.GREATER);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@code LESS_OR_EQUAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_givenZero_whenLessOrEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.LESS_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>When {@code EQUAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_whenEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>When {@code GREATER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_whenGreater() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.GREATER);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>When {@code GREATER_OR_EQUAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_whenGreaterOrEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.GREATER_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>When {@code LESS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_whenLess() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.LESS);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)} with {@code object}, {@code comparator}, {@code criterion}.
   * <ul>
   *   <li>When {@code LESS_OR_EQUAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator, Criterion)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator, Criterion)"})
  public void testComparatorPredicateWithObjectComparatorCriterion_whenLessOrEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator,
        Criterion.LESS_OR_EQUAL);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object}, {@code comparator}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  public void testComparatorPredicateWithObjectComparator_givenOne_thenReturnNotEvaluate42() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(actualComparatorPredicateResult.evaluate("Object"));
    assertFalse(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object}, {@code comparator}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  public void testComparatorPredicateWithObjectComparator_givenZero_thenReturnEvaluate42() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator);
    boolean actualEvaluateResult = actualComparatorPredicateResult.evaluate("42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualComparatorPredicateResult instanceof ComparatorPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(actualComparatorPredicateResult.evaluate("Object"));
    assertTrue(actualComparatorPredicateResult.test("Target"));
  }

  /**
   * Test {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)} with {@code object}, {@code comparator}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#comparatorPredicate(Object, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate ComparatorPredicate.comparatorPredicate(Object, Comparator)"})
  public void testComparatorPredicateWithObjectComparator_thenThrowIllegalStateException() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new IllegalStateException("foo"));

    // Act
    Predicate<Object> actualComparatorPredicateResult = ComparatorPredicate.comparatorPredicate("Object", comparator);

    // Assert
    assertThrows(IllegalStateException.class, () -> actualComparatorPredicateResult.evaluate("42"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator,
        Criterion.GREATER_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator,
        Criterion.LESS_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest3() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator,
        Criterion.LESS_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link DefaultEquator#HASHCODE_NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorCompareReturnHashcode_null_thenReturnFalse() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(DefaultEquator.HASHCODE_NULL);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator,
        Criterion.GREATER_OR_EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link DefaultEquator#HASHCODE_NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorCompareReturnHashcode_null_thenReturnTrue() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(DefaultEquator.HASHCODE_NULL);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator, Criterion.LESS);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return zero.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorCompareReturnZero_thenReturnTrue() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with {@code Object} and {@link Comparator} and criterion is {@code EQUAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsEqual() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with {@code Object} and {@link Comparator} and criterion is {@code GREATER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsGreater() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator,
        Criterion.GREATER);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with {@code Object} and {@link Comparator} and criterion is {@code GREATER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsGreater2() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(0);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator,
        Criterion.GREATER);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link ComparatorPredicate#ComparatorPredicate(Object, Comparator, Criterion)} with {@code Object} and {@link Comparator} and criterion is {@code LESS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_givenComparatorPredicateWithObjectAndComparatorAndCriterionIsLess() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator, Criterion.LESS);

    // Act
    boolean actualTestResult = comparatorPredicate.test("Target");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link ComparatorPredicate#test(Object)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ComparatorPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ComparatorPredicate.test(Object)"})
  public void testTest_thenThrowIllegalStateException() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new IllegalStateException("foo"));
    ComparatorPredicate<Object> comparatorPredicate = new ComparatorPredicate<>("Object", comparator, Criterion.EQUAL);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> comparatorPredicate.test("Target"));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
  }
}
