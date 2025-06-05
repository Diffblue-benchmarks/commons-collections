package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedPredicateDiffblueTest {
  /**
   * Test {@link TransformedPredicate#transformedPredicate(Transformer, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedPredicate#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @DisplayName("Test transformedPredicate(Transformer, Predicate); given 'false'; then return not evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate TransformedPredicate.transformedPredicate(Transformer, Predicate)"})
  void testTransformedPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualTransformedPredicateResult = TransformedPredicate.transformedPredicate(transformer,
        predicate);
    boolean actualEvaluateResult = actualTransformedPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates = ((TransformedPredicate<Object>) actualTransformedPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertFalse(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
    assertSame(transformer, ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link TransformedPredicate#transformedPredicate(Transformer, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedPredicate#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @DisplayName("Test transformedPredicate(Transformer, Predicate); given 'true'; then return evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate TransformedPredicate.transformedPredicate(Transformer, Predicate)"})
  void testTransformedPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualTransformedPredicateResult = TransformedPredicate.transformedPredicate(transformer,
        predicate);
    boolean actualEvaluateResult = actualTransformedPredicateResult.evaluate("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates = ((TransformedPredicate<Object>) actualTransformedPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertTrue(actualEvaluateResult);
    assertSame(predicate, predicates[0]);
    assertSame(transformer, ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test {@link TransformedPredicate#transformedPredicate(Transformer, Predicate)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedPredicate#transformedPredicate(Transformer, Predicate)}
   */
  @Test
  @DisplayName("Test transformedPredicate(Transformer, Predicate); when Transformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate TransformedPredicate.transformedPredicate(Transformer, Predicate)"})
  void testTransformedPredicate_whenTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Predicate<Object> actualTransformedPredicateResult = TransformedPredicate.transformedPredicate(transformer,
        predicate);

    // Assert
    assertTrue(actualTransformedPredicateResult instanceof TransformedPredicate);
    Predicate<? super Object>[] predicates = ((TransformedPredicate<Object>) actualTransformedPredicateResult)
        .getPredicates();
    assertEquals(1, predicates.length);
    assertSame(predicate, predicates[0]);
    assertSame(transformer, ((TransformedPredicate<Object>) actualTransformedPredicateResult).getTransformer());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransformedPredicate#TransformedPredicate(Transformer, Predicate)}
   *   <li>{@link TransformedPredicate#getTransformer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedPredicate.<init>(Transformer, Predicate)",
      "Transformer TransformedPredicate.getTransformer()"})
  void testGettersAndSetters() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    TransformedPredicate<Object> actualTransformedPredicate = new TransformedPredicate<>(transformer,
        mock(Predicate.class));

    // Assert
    assertSame(transformer, actualTransformedPredicate.getTransformer());
  }

  /**
   * Test {@link TransformedPredicate#getPredicates()}.
   * <p>
   * Method under test: {@link TransformedPredicate#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate[] TransformedPredicate.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    TransformedPredicate<Object> transformedPredicate = new TransformedPredicate<>(mock(Transformer.class),
        mock(Predicate.class));

    // Act and Assert
    assertEquals(1, transformedPredicate.getPredicates().length);
  }

  /**
   * Test {@link TransformedPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformedPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    TransformedPredicate<Object> transformedPredicate = new TransformedPredicate<>(transformer, predicate);

    // Act
    boolean actualTestResult = transformedPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link TransformedPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TransformedPredicate.test(Object)"})
  void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    TransformedPredicate<Object> transformedPredicate = new TransformedPredicate<>(transformer, predicate);

    // Act
    boolean actualTestResult = transformedPredicate.test("Object");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTestResult);
  }
}
