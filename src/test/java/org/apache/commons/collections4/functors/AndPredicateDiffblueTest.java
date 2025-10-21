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

public class AndPredicateDiffblueTest {
  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   * <p>
   * Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    AndPredicate<? super Object> predicate22 = new AndPredicate<>(predicate12, predicate2);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate22);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate12).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate22, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_givenFalse_whenPredicateTestReturnFalse_thenReturnNotEvaluate422() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#andPredicate(Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#andPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AndPredicate.andPredicate(Predicate, Predicate)"})
  public void testAndPredicate_whenPredicateTestReturnTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndPredicateResult = AndPredicate.andPredicate(predicate1, predicate2);
    boolean actualEvaluateResult = actualAndPredicateResult.evaluate("42");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAndPredicateResult instanceof AndPredicate);
    Predicate<? super Object>[] predicates = ((AndPredicate<Object>) actualAndPredicateResult).getPredicates();
    assertEquals(2, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Predicate, Predicate)}.
   * <p>
   * Method under test: {@link AndPredicate#AndPredicate(Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AndPredicate.<init>(Predicate, Predicate)"})
  public void testNewAndPredicate() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    Predicate<Object> predicate2 = mock(Predicate.class);

    // Act
    AndPredicate<Object> actualAndPredicate = new AndPredicate<>(predicate1, predicate2);

    // Assert
    Predicate<? super Object>[] predicates = actualAndPredicate.getPredicates();
    assertEquals(2, predicates.length);
    assertSame(predicate1, predicates[0]);
    assertSame(predicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#getPredicates()}.
   * <p>
   * Method under test: {@link AndPredicate#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] AndPredicate.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    AndPredicate<Object> andPredicate = new AndPredicate<>(mock(Predicate.class), mock(Predicate.class));

    // Act and Assert
    assertEquals(2, andPredicate.getPredicates().length);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnFalse2() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AndPredicate#test(Object)}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AndPredicate.test(Object)"})
  public void testTest_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    AndPredicate<Object> andPredicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    boolean actualTestResult = andPredicate.test("Object");

    // Assert
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
