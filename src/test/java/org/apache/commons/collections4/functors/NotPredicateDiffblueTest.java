package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class NotPredicateDiffblueTest {
  /**
   * Test {@link NotPredicate#notPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotPredicate#notPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NotPredicate.notPredicate(Predicate)"})
  public void testNotPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNotPredicateResult = NotPredicate.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates = ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#notPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotPredicate#notPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NotPredicate.notPredicate(Predicate)"})
  public void testNotPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNotPredicateResult = NotPredicate.notPredicate(predicate);
    boolean actualEvaluateResult = actualNotPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNotPredicateResult instanceof NotPredicate);
    Predicate<? super Object>[] predicates = ((NotPredicate<Object>) actualNotPredicateResult).getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#NotPredicate(Predicate)}.
   * <p>
   * Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NotPredicate.<init>(Predicate)"})
  public void testNewNotPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NotPredicate<Object> actualNotPredicate = new NotPredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNotPredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NotPredicate#getPredicates()}.
   * <p>
   * Method under test: {@link NotPredicate#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] NotPredicate.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    NotPredicate<Object> notPredicate = new NotPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, notPredicate.getPredicates().length);
  }

  /**
   * Test {@link NotPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NotPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NotPredicate<Object> notPredicate = new NotPredicate<>(predicate);

    // Act
    boolean actualTestResult = notPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link NotPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NotPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NotPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NotPredicate<Object> notPredicate = new NotPredicate<>(predicate);

    // Act
    boolean actualTestResult = notPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }
}
