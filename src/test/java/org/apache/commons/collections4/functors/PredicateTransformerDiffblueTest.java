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
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicateTransformerDiffblueTest {
  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not transform {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicateTransformer(Predicate); given 'false'; then return not transform '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  void testPredicateTransformer_givenFalse_thenReturnNotTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult =
        PredicateTransformer.predicateTransformer(predicate);
    Boolean actualTransformResult = actualPredicateTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualPredicateTransformerResult instanceof PredicateTransformer);
    assertFalse(actualTransformResult);
    assertSame(
        predicate,
        ((PredicateTransformer<Object>) actualPredicateTransformerResult).getPredicate());
  }

  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return transform {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @DisplayName("Test predicateTransformer(Predicate); given 'true'; then return transform '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  void testPredicateTransformer_givenTrue_thenReturnTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult =
        PredicateTransformer.predicateTransformer(predicate);
    Boolean actualTransformResult = actualPredicateTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualPredicateTransformerResult instanceof PredicateTransformer);
    assertTrue(actualTransformResult);
    assertSame(
        predicate,
        ((PredicateTransformer<Object>) actualPredicateTransformerResult).getPredicate());
  }

  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @DisplayName("Test predicateTransformer(Predicate); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  void testPredicateTransformer_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult =
        PredicateTransformer.predicateTransformer(predicate);

    // Assert
    assertThrows(
        IllegalArgumentException.class, () -> actualPredicateTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link PredicateTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicateTransformer(Predicate); when Predicate; then return PredicateTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  void testPredicateTransformer_whenPredicate_thenReturnPredicateTransformer() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult =
        PredicateTransformer.predicateTransformer(predicate);

    // Assert
    assertTrue(actualPredicateTransformerResult instanceof PredicateTransformer);
    assertSame(
        predicate,
        ((PredicateTransformer<Object>) actualPredicateTransformerResult).getPredicate());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PredicateTransformer#PredicateTransformer(Predicate)}
   *   <li>{@link PredicateTransformer#getPredicate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PredicateTransformer.<init>(Predicate)",
    "Predicate PredicateTransformer.getPredicate()"
  })
  void testGettersAndSetters() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    PredicateTransformer<Object> actualPredicateTransformer = new PredicateTransformer<>(predicate);

    // Assert
    assertSame(predicate, actualPredicateTransformer.getPredicate());
  }

  /**
   * Test {@link PredicateTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean PredicateTransformer.transform(Object)"})
  void testTransform_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    PredicateTransformer<Object> predicateTransformer = new PredicateTransformer<>(predicate);

    // Act
    Boolean actualTransformResult = predicateTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTransformResult);
  }

  /**
   * Test {@link PredicateTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#transform(Object)}
   */
  @Test
  @DisplayName(
      "Test transform(Object); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean PredicateTransformer.transform(Object)"})
  void testTransform_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    PredicateTransformer<Object> predicateTransformer = new PredicateTransformer<>(predicate);

    // Act
    Boolean actualTransformResult = predicateTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTransformResult);
  }

  /**
   * Test {@link PredicateTransformer#transform(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateTransformer#transform(Object)}
   */
  @Test
  @DisplayName("Test transform(Object); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean PredicateTransformer.transform(Object)"})
  void testTransform_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    PredicateTransformer<Object> predicateTransformer = new PredicateTransformer<>(predicate);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> predicateTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
  }
}
