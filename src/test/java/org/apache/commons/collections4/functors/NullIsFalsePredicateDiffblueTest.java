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

public class NullIsFalsePredicateDiffblueTest {
  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  public void testNullIsFalsePredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  public void testNullIsFalsePredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return not evaluate {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#nullIsFalsePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsFalsePredicate.nullIsFalsePredicate(Predicate)"})
  public void testNullIsFalsePredicate_whenPredicate_thenReturnNotEvaluateNull() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualNullIsFalsePredicateResult = NullIsFalsePredicate.nullIsFalsePredicate(predicate);
    boolean actualEvaluateResult = actualNullIsFalsePredicateResult.evaluate(null);

    // Assert
    assertTrue(actualNullIsFalsePredicateResult instanceof NullIsFalsePredicate);
    Predicate<? super Object>[] predicates = ((NullIsFalsePredicate<Object>) actualNullIsFalsePredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)}.
   * <p>
   * Method under test: {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NullIsFalsePredicate.<init>(Predicate)"})
  public void testNewNullIsFalsePredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NullIsFalsePredicate<Object> actualNullIsFalsePredicate = new NullIsFalsePredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsFalsePredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsFalsePredicate#getPredicates()}.
   * <p>
   * Method under test: {@link NullIsFalsePredicate#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] NullIsFalsePredicate.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    NullIsFalsePredicate<Object> nullIsFalsePredicate = new NullIsFalsePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, nullIsFalsePredicate.getPredicates().length);
  }

  /**
   * Test {@link NullIsFalsePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link NullIsFalsePredicate#NullIsFalsePredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsFalsePredicate.test(Object)"})
  public void testTest_givenNullIsFalsePredicateWithPredicate_whenNull_thenReturnFalse() {
    // Arrange
    NullIsFalsePredicate<Object> nullIsFalsePredicate = new NullIsFalsePredicate<>(mock(Predicate.class));

    // Act and Assert
    assertFalse(nullIsFalsePredicate.test(null));
  }

  /**
   * Test {@link NullIsFalsePredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsFalsePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsFalsePredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_whenObject_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NullIsFalsePredicate<Object> nullIsFalsePredicate = new NullIsFalsePredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsFalsePredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
