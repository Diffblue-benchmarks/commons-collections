package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class NullIsExceptionPredicateDiffblueTest {
  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  public void testNullIsExceptionPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult = NullIsExceptionPredicate
        .nullIsExceptionPredicate(predicate);
    boolean actualEvaluateResult = actualNullIsExceptionPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates = ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@link FunctorException#FunctorException(String)} with {@code Msg}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  public void testNullIsExceptionPredicate_givenFunctorExceptionWithMsg() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new FunctorException("Msg"));

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult = NullIsExceptionPredicate
        .nullIsExceptionPredicate(predicate);

    // Assert
    assertThrows(FunctorException.class, () -> actualNullIsExceptionPredicateResult.evaluate("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  public void testNullIsExceptionPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNullIsExceptionPredicateResult = NullIsExceptionPredicate
        .nullIsExceptionPredicate(predicate);
    boolean actualEvaluateResult = actualNullIsExceptionPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualNullIsExceptionPredicateResult instanceof NullIsExceptionPredicate);
    Predicate<? super Object>[] predicates = ((NullIsExceptionPredicate<Object>) actualNullIsExceptionPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#nullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate NullIsExceptionPredicate.nullIsExceptionPredicate(Predicate)"})
  public void testNullIsExceptionPredicate_whenPredicate_thenThrowFunctorException() {
    // Arrange and Act
    Predicate<Object> actualNullIsExceptionPredicateResult = NullIsExceptionPredicate
        .<Object>nullIsExceptionPredicate(mock(Predicate.class));

    // Assert
    assertThrows(FunctorException.class, () -> actualNullIsExceptionPredicateResult.evaluate(null));
  }

  /**
   * Test {@link NullIsExceptionPredicate#NullIsExceptionPredicate(Predicate)}.
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#NullIsExceptionPredicate(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NullIsExceptionPredicate.<init>(Predicate)"})
  public void testNewNullIsExceptionPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    NullIsExceptionPredicate<Object> actualNullIsExceptionPredicate = new NullIsExceptionPredicate<>(predicate);

    // Assert
    Predicate<? super Object>[] predicates = actualNullIsExceptionPredicate.getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
  }

  /**
   * Test {@link NullIsExceptionPredicate#getPredicates()}.
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#getPredicates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] NullIsExceptionPredicate.getPredicates()"})
  public void testGetPredicates() {
    // Arrange
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate = new NullIsExceptionPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertEquals(1, nullIsExceptionPredicate.getPredicates().length);
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_whenObject_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate = new NullIsExceptionPredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsExceptionPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_whenObject_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate = new NullIsExceptionPredicate<>(predicate);

    // Act
    boolean actualTestResult = nullIsExceptionPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link FunctorException#FunctorException(String)} with {@code Msg}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  public void testTest_givenPredicateTestThrowFunctorExceptionWithMsg() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new FunctorException("Msg"));
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate = new NullIsExceptionPredicate<>(predicate);

    // Act and Assert
    assertThrows(FunctorException.class, () -> nullIsExceptionPredicate.test("Object"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link NullIsExceptionPredicate#test(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullIsExceptionPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullIsExceptionPredicate.test(Object)"})
  public void testTest_whenNull_thenThrowFunctorException() {
    // Arrange
    NullIsExceptionPredicate<Object> nullIsExceptionPredicate = new NullIsExceptionPredicate<>(mock(Predicate.class));

    // Act and Assert
    assertThrows(FunctorException.class, () -> nullIsExceptionPredicate.test(null));
  }
}
