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
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedPredicateDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TransformedPredicate.transformedPredicate(Transformer, Predicate)"})
  public void testTransformedPredicate_givenFalse_thenReturnNotEvaluate42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate TransformedPredicate.transformedPredicate(Transformer, Predicate)"})
  public void testTransformedPredicate_givenTrue_thenReturnEvaluate42() {
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
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransformedPredicate#TransformedPredicate(Transformer, Predicate)}
   *   <li>{@link TransformedPredicate#getTransformer()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedPredicate.<init>(Transformer, Predicate)",
      "Transformer TransformedPredicate.getTransformer()"})
  public void testGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Predicate[] TransformedPredicate.getPredicates()"})
  public void testGetPredicates() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformedPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnFalse_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TransformedPredicate.test(Object)"})
  public void testTest_givenPredicateTestReturnTrue_thenReturnTrue() {
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
