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
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class FunctorUtilsDiffblueTest {
  /**
   * Test {@link FunctorUtils#coerce(Predicate)} with {@code predicate}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not test {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorUtils#coerce(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate FunctorUtils.coerce(Predicate)"})
  public void testCoerceWithPredicate_givenFalse_thenReturnNotTest42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualCoerceResult = FunctorUtils.coerce(predicate);
    boolean actualTestResult = actualCoerceResult.test("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link FunctorUtils#coerce(Predicate)} with {@code predicate}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return test {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorUtils#coerce(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate FunctorUtils.coerce(Predicate)"})
  public void testCoerceWithPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturnTest42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualCoerceResult = FunctorUtils.coerce(predicate);
    boolean actualTestResult = actualCoerceResult.test("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link FunctorUtils#copy(Consumer[])} with {@code consumers}.
   * <ul>
   *   <li>When {@link Consumer}.</li>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorUtils#copy(Consumer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Consumer[] FunctorUtils.copy(Consumer[])"})
  public void testCopyWithConsumers_whenConsumer_thenReturnArrayLengthIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, FunctorUtils.copy(mock(Consumer.class)).length);
  }

  /**
   * Test {@link FunctorUtils#copy(Predicate[])} with {@code predicates}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorUtils#copy(Predicate[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] FunctorUtils.copy(Predicate[])"})
  public void testCopyWithPredicates_whenPredicate_thenReturnArrayLengthIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, FunctorUtils.copy(mock(Predicate.class)).length);
  }

  /**
   * Test {@link FunctorUtils#copy(Function[])} with {@code transformers}.
   * <ul>
   *   <li>When {@link Function}.</li>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorUtils#copy(Function[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Function[] FunctorUtils.copy(Function[])"})
  public void testCopyWithTransformers_whenFunction_thenReturnArrayLengthIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, FunctorUtils.copy(mock(Function.class)).length);
  }

  /**
   * Test {@link FunctorUtils#validate(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorUtils#validate(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.Predicate[] FunctorUtils.validate(Collection)"})
  public void testValidateWithCollection_whenArrayList_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(0, FunctorUtils.validate(new ArrayList<>()).length);
  }
}
