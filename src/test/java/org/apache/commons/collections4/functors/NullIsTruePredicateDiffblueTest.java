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

public class NullIsTruePredicateDiffblueTest {
  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  public void testNullIsTruePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult = NullIsTruePredicate.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates = ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  public void testNullIsTruePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult = NullIsTruePredicate.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates = ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return evaluate {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsTruePredicate#nullIsTruePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsTruePredicate.nullIsTruePredicate(Predicate)"})
  public void testNullIsTruePredicate_whenPredicate_thenReturnEvaluateNull() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsTruePredicateResult = NullIsTruePredicate.nullIsTruePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsTruePredicateResult.evaluate(null);

    // Assert
    assertTrue(actualNullIsTruePredicateResult instanceof NullIsTruePredicate);
    Predicate<? super Object>[] predicates = ((NullIsTruePredicate<Object>) actualNullIsTruePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)}.
   * <p>
   * Method under test: {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NullIsTruePredicate.<init>(Predicate)"})
  public void testNewNullIsTruePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NullIsTruePredicate<Object> actualNullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsTruePredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsTruePredicate#getPredicates()}.
   * <p>
   * Method under test: {@link NullIsTruePredicate#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] NullIsTruePredicate.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    NullIsTruePredicate<Object> nullIsTruePredicate = new NullIsTruePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, nullIsTruePredicate.getPredicates().length);
  }

  /**
   * Test {@link NullIsTruePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link NullIsTruePredicate#NullIsTruePredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsTruePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsTruePredicate.test(Object)"})
  public void testTest_givenNullIsTruePredicateWithPredicate_whenNull_thenReturnTrue() {
    // Arrange
    NullIsTruePredicate<Object> nullIsTruePredicate = new NullIsTruePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertTrue(nullIsTruePredicate.test(null));
  }

  /**
   * Test {@link NullIsTruePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsTruePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsTruePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_whenObject_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NullIsTruePredicate<Object> nullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsTruePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link NullIsTruePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsTruePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsTruePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_whenObject_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NullIsTruePredicate<Object> nullIsTruePredicate = new NullIsTruePredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsTruePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
