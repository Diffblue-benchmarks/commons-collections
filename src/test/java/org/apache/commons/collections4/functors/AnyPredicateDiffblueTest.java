package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AnyPredicateDiffblueTest {
  /**
   * Test {@link AnyPredicate#anyPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return {@link AnyPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Collection)"})
  public void testAnyPredicateWithCollection_thenReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate);
    predicates.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicates);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Collection)"})
  public void testAnyPredicateWithCollection_whenArrayList_thenReturnFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(new ArrayList<>());

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualAnyPredicateResult.evaluate("42"));
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate();

    // Assert
    assertTrue(actualAnyPredicateResult instanceof FalsePredicate);
    assertFalse(actualAnyPredicateResult.evaluate("42"));
    assertFalse(actualAnyPredicateResult.evaluate("Object"));
    assertFalse(actualAnyPredicateResult.test("Object"));
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicate);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateEvaluateReturnTrue_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicate);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#anyPredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link AnyPredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#anyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate AnyPredicate.anyPredicate(Predicate[])"})
  public void testAnyPredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnAnyPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAnyPredicateResult = AnyPredicate.anyPredicate(predicate, mock(Predicate.class));
    boolean actualEvaluateResult = actualAnyPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualAnyPredicateResult instanceof AnyPredicate);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).getPredicates().length);
    assertEquals(2, ((AnyPredicate<Object>) actualAnyPredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link AnyPredicate#AnyPredicate(Predicate[])}.
   * <p>
   * Method under test: {@link AnyPredicate#AnyPredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AnyPredicate.<init>(Predicate[])"})
  public void testNewAnyPredicate() {
    // Arrange and Act
    AnyPredicate<Object> actualAnyPredicate = new AnyPredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualAnyPredicate.getPredicates().length);
    assertEquals(1, actualAnyPredicate.iPredicates.length);
  }

  /**
   * Test {@link AnyPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AnyPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    AnyPredicate<Object> anyPredicate = new AnyPredicate<>(predicate);

    // Act
    boolean actualTestResult = anyPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link AnyPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AnyPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AnyPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    AnyPredicate<Object> anyPredicate = new AnyPredicate<>(predicate);

    // Act
    boolean actualTestResult = anyPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
