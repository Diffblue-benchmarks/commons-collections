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

public class OnePredicateDiffblueTest {
  /**
   * Test {@link OnePredicate#onePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Collection)"})
  public void testOnePredicateWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<? super Object>> predicates = new ArrayList<>();
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicates);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Collection)"})
  public void testOnePredicateWithCollection_whenArrayList_thenReturnArrayLengthIsZero() {
    // Arrange and Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(new ArrayList<>());
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(0, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(0, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Then return {@link FalsePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_thenReturnFalsePredicate() {
    // Arrange and Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate();

    // Assert
    assertTrue(actualOnePredicateResult instanceof FalsePredicate);
    assertFalse(actualOnePredicateResult.evaluate("42"));
    assertFalse(actualOnePredicateResult.evaluate("Object"));
    assertFalse(actualOnePredicateResult.test("Object"));
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#evaluate(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateEvaluateReturnFalse_thenCallsEvaluate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicate);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#evaluate(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateEvaluateReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.evaluate(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicate);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).evaluate(isA(Object.class));
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertTrue(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#onePredicate(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link OnePredicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#onePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate OnePredicate.onePredicate(Predicate[])"})
  public void testOnePredicateWithPredicate_whenPredicateTestReturnTrue_thenReturnOnePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOnePredicateResult = OnePredicate.onePredicate(predicate, predicate2);
    boolean actualEvaluateResult = actualOnePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualOnePredicateResult instanceof OnePredicate);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).getPredicates().length);
    assertEquals(2, ((OnePredicate<Object>) actualOnePredicateResult).iPredicates.length);
    assertFalse(actualEvaluateResult);
  }

  /**
   * Test {@link OnePredicate#OnePredicate(Predicate[])}.
   * <p>
   * Method under test: {@link OnePredicate#OnePredicate(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void OnePredicate.<init>(Predicate[])"})
  public void testNewOnePredicate() {
    // Arrange and Act
    OnePredicate<Object> actualOnePredicate = new OnePredicate<>(mock(Predicate.class));

    // Assert
    assertEquals(1, actualOnePredicate.getPredicates().length);
    assertEquals(1, actualOnePredicate.iPredicates.length);
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    OnePredicate<Object> onePredicate = new OnePredicate<>(predicate);

    // Act
    boolean actualTestResult = onePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link OnePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean OnePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    OnePredicate<Object> onePredicate = new OnePredicate<>(predicate);

    // Act
    boolean actualTestResult = onePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
