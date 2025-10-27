package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class TransformerPredicateDiffblueTest {
  /**
   * Method under test:
   * {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  public void testTransformerPredicate() {
    // Arrange
    ConstantTransformer<? super Object, Boolean> transformer = new ConstantTransformer<>(true);

    // Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate.transformerPredicate(transformer);
    boolean actualEvaluateResult = actualTransformerPredicateResult.evaluate("42");

    // Assert
    Transformer<? super Object, Boolean> transformer2 = ((TransformerPredicate<Object>) actualTransformerPredicateResult)
        .getTransformer();
    assertTrue(transformer2 instanceof ConstantTransformer);
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertTrue(actualEvaluateResult);
    assertTrue(((ConstantTransformer<? super Object, Boolean>) transformer2).getConstant());
    assertSame(transformer, transformer2);
  }

  /**
   * Method under test:
   * {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  public void testTransformerPredicate2() {
    // Arrange
    ConstantTransformer<? super Object, Boolean> transformer = new ConstantTransformer<>(false);

    // Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate.transformerPredicate(transformer);
    boolean actualEvaluateResult = actualTransformerPredicateResult.evaluate("42");

    // Assert
    Transformer<? super Object, Boolean> transformer2 = ((TransformerPredicate<Object>) actualTransformerPredicateResult)
        .getTransformer();
    assertTrue(transformer2 instanceof ConstantTransformer);
    assertTrue(actualTransformerPredicateResult instanceof TransformerPredicate);
    assertFalse(actualEvaluateResult);
    assertFalse(((ConstantTransformer<? super Object, Boolean>) transformer2).getConstant());
    assertSame(transformer, transformer2);
  }

  /**
   * Method under test:
   * {@link TransformerPredicate#transformerPredicate(Transformer)}
   */
  @Test
  public void testTransformerPredicate3() {
    // Arrange and Act
    Predicate<Object> actualTransformerPredicateResult = TransformerPredicate
        .transformerPredicate(new ConstantTransformer<>(null));

    // Assert
    assertThrows(FunctorException.class, () -> actualTransformerPredicateResult.evaluate("42"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TransformerPredicate#TransformerPredicate(Transformer)}
   *   <li>{@link TransformerPredicate#getTransformer()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ConstantTransformer<? super Object, Boolean> transformer = new ConstantTransformer<>(true);

    // Act
    TransformerPredicate<Object> actualTransformerPredicate = new TransformerPredicate<>(transformer);
    Transformer<? super Object, Boolean> actualTransformer = actualTransformerPredicate.getTransformer();

    // Assert
    assertTrue(actualTransformer instanceof ConstantTransformer);
    assertSame(transformer, actualTransformer);
  }

  /**
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  public void testTest() {
    // Arrange
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(new ConstantTransformer<>(true));

    // Act and Assert
    assertTrue(transformerPredicate.test("Object"));
  }

  /**
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  public void testTest2() {
    // Arrange
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(new ConstantTransformer<>(false));

    // Act and Assert
    assertFalse(transformerPredicate.test("Object"));
  }

  /**
   * Method under test: {@link TransformerPredicate#test(Object)}
   */
  @Test
  public void testTest3() {
    // Arrange
    TransformerPredicate<Object> transformerPredicate = new TransformerPredicate<>(new ConstantTransformer<>(null));

    // Act and Assert
    assertThrows(FunctorException.class, () -> transformerPredicate.test("Object"));
  }
}
