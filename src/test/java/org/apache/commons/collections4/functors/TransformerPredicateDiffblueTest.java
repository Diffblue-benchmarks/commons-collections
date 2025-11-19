package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformerPredicateDiffblueTest {
  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   *
   * <p>Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @DisplayName("Test transformerPredicate(Transformer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  void testTransformerPredicate() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any()))
        .thenThrow(
            new FunctorException(
                "Transformer must return an instanceof Boolean, it was a null object"));

    // Act
    Predicate<Object> actualTransformerPredicateResult =
        TransformerPredicate.transformerPredicate(transformer);

    // Assert
    assertThrows(FunctorException.class, () -> actualTransformerPredicateResult.evaluate("42"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformerPredicate(Transformer); given 'false'; then return not evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  void testTransformerPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualTransformerPredicateResult =
        TransformerPredicate.transformerPredicate(transformer);
    boolean actualEvaluateResult = actualTransformerPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertFalse(actualEvaluateResult);
    assertSame(
        transformer,
        ((TransformerPredicate<Object>) actualTransformerPredicateResult).getTransformer());
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformerPredicate(Transformer); given 'null'; when Transformer apply(Object) return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  void testTransformerPredicate_givenNull_whenTransformerApplyReturnNull() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(null);

    // Act
    Predicate<Object> actualTransformerPredicateResult =
        TransformerPredicate.transformerPredicate(transformer);

    // Assert
    assertThrows(FunctorException.class, () -> actualTransformerPredicateResult.evaluate("42"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return evaluate {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @DisplayName("Test transformerPredicate(Transformer); given 'true'; then return evaluate '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  void testTransformerPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualTransformerPredicateResult =
        TransformerPredicate.transformerPredicate(transformer);
    boolean actualEvaluateResult = actualTransformerPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertTrue(actualEvaluateResult);
    assertSame(
        transformer,
        ((TransformerPredicate<Object>) actualTransformerPredicateResult).getTransformer());
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link TransformerPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformerPredicate(Transformer); when Transformer; then return TransformerPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  void testTransformerPredicate_whenTransformer_thenReturnTransformerPredicate() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);

    // Act
    Predicate<Object> actualTransformerPredicateResult =
        TransformerPredicate.transformerPredicate(transformer);

    // Assert
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertSame(
        transformer,
        ((TransformerPredicate<Object>) actualTransformerPredicateResult).getTransformer());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TransformerPredicate#TransformerPredicate(Transformer)}
   *   <li>{@link TransformerPredicate#getTransformer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TransformerPredicate.<init>(Transformer)",
    "Transformer TransformerPredicate.getTransformer()"
  })
  void testGettersAndSetters() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);

    // Act
    TransformerPredicate<Object> actualTransformerPredicate =
        new TransformerPredicate<>(transformer);

    // Assert
    assertSame(transformer, actualTransformerPredicate.getTransformer());
  }

  /**
   * Test {@link TransformerPredicate#test(Object)}.
   *
   * <p>Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  void testTest() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any()))
        .thenThrow(
            new FunctorException(
                "Transformer must return an instanceof Boolean, it was a null object"));
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(transformer);

    // Act and Assert
    assertThrows(FunctorException.class, () -> transformerPredicate.test("Object"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Transformer apply(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  void testTest_givenTransformerApplyReturnFalse_thenReturnFalse() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(false);
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(transformer);

    // Act
    boolean actualTestResult = transformerPredicate.test("Object");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link TransformerPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code null}.
   *   <li>Then throw {@link FunctorException}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Transformer apply(Object) return 'null'; then throw FunctorException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  void testTest_givenTransformerApplyReturnNull_thenThrowFunctorException() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(null);
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(transformer);

    // Act and Assert
    assertThrows(FunctorException.class, () -> transformerPredicate.test("Object"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#test(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @DisplayName(
      "Test test(Object); given Transformer apply(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  void testTest_givenTransformerApplyReturnTrue_thenReturnTrue() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(transformer);

    // Act
    boolean actualTestResult = transformerPredicate.test("Object");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
