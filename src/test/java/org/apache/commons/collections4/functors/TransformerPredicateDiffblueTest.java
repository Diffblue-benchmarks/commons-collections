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
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformerPredicateDiffblueTest {
  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   * <p>
   * Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  public void testTransformerPredicate() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any()))
        .thenThrow(new FunctorException("Transformer must return an instanceof Boolean, it was a null object"));

    // Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate.transformerPredicate(transformer);

    // Assert
    assertThrows(FunctorException.class, () -> actualTransformerPredicateResult.evaluate("42"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  public void testTransformerPredicate_givenFalse_thenReturnNotEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate.transformerPredicate(transformer);
    boolean actualEvaluateResult = actualTransformerPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertFalse(actualEvaluateResult);
    assertSame(transformer, ((TransformerPredicate<Object>) actualTransformerPredicateResult).getTransformer());
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  public void testTransformerPredicate_givenNull_whenTransformerApplyReturnNull() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(null);

    // Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate.transformerPredicate(transformer);

    // Assert
    assertThrows(FunctorException.class, () -> actualTransformerPredicateResult.evaluate("42"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#transformerPredicate(Transformer)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TransformerPredicate.transformerPredicate(Transformer)"})
  public void testTransformerPredicate_givenTrue_thenReturnEvaluate42() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate.transformerPredicate(transformer);
    boolean actualEvaluateResult = actualTransformerPredicateResult.evaluate("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertTrue(actualEvaluateResult);
    assertSame(transformer, ((TransformerPredicate<Object>) actualTransformerPredicateResult).getTransformer());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransformerPredicate#TransformerPredicate(Transformer)}
   *   <li>{@link TransformerPredicate#getTransformer()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformerPredicate.<init>(Transformer)",
      "Transformer TransformerPredicate.getTransformer()"})
  public void testGettersAndSetters() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);

    // Act
    TransformerPredicate<Object> actualTransformerPredicate = new TransformerPredicate<>(transformer);

    // Assert
    assertSame(transformer, actualTransformerPredicate.getTransformer());
  }

  /**
   * Test {@link TransformerPredicate#test(Object)}.
   * <p>
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  public void testTest() {
    // Arrange
    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any()))
        .thenThrow(new FunctorException("Transformer must return an instanceof Boolean, it was a null object"));
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(transformer);

    // Act and Assert
    assertThrows(FunctorException.class, () -> transformerPredicate.test("Object"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link TransformerPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  public void testTest_givenTransformerApplyReturnFalse_thenReturnFalse() {
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
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code null}.</li>
   *   <li>Then throw {@link FunctorException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  public void testTest_givenTransformerApplyReturnNull_thenThrowFunctorException() {
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
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformerPredicate.test(Object)"})
  public void testTest_givenTransformerApplyReturnTrue_thenReturnTrue() {
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
