package org.apache.commons.collections4.functors;

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
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicateTransformerDiffblueTest {
  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not transform {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  public void testPredicateTransformer_givenFalse_thenReturnNotTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult = PredicateTransformer
        .predicateTransformer(predicate);
    Boolean actualTransformResult = actualPredicateTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualPredicateTransformerResult instanceof PredicateTransformer);
    assertFalse(actualTransformResult);
    assertSame(predicate, ((PredicateTransformer<Object>) actualPredicateTransformerResult).getPredicate());
  }

  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return transform {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  public void testPredicateTransformer_givenTrue_thenReturnTransform42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult = PredicateTransformer
        .predicateTransformer(predicate);
    Boolean actualTransformResult = actualPredicateTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualPredicateTransformerResult instanceof PredicateTransformer);
    assertTrue(actualTransformResult);
    assertSame(predicate, ((PredicateTransformer<Object>) actualPredicateTransformerResult).getPredicate());
  }

  /**
   * Test {@link PredicateTransformer#predicateTransformer(Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateTransformer#predicateTransformer(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer PredicateTransformer.predicateTransformer(Predicate)"})
  public void testPredicateTransformer_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act
    Transformer<Object, Boolean> actualPredicateTransformerResult = PredicateTransformer
        .predicateTransformer(predicate);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualPredicateTransformerResult.transform("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PredicateTransformer#PredicateTransformer(Predicate)}
   *   <li>{@link PredicateTransformer#getPredicate()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicateTransformer.<init>(Predicate)", "Predicate PredicateTransformer.getPredicate()"})
  public void testGettersAndSetters() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    PredicateTransformer<Object> actualPredicateTransformer = new PredicateTransformer<>(predicate);

    // Assert
    assertSame(predicate, actualPredicateTransformer.getPredicate());
  }

  /**
   * Test {@link PredicateTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Boolean PredicateTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestReturnFalse_thenReturnFalse() {
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
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Boolean PredicateTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestReturnTrue_thenReturnTrue() {
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
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicateTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Boolean PredicateTransformer.transform(Object)"})
  public void testTransform_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));
    PredicateTransformer<Object> predicateTransformer = new PredicateTransformer<>(predicate);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> predicateTransformer.transform("Input"));
    verify(predicate).test(isA(Object.class));
  }
}
