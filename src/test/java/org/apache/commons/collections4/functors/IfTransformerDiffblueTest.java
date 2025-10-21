package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
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

public class IfTransformerDiffblueTest {
  /**
   * Test {@link IfTransformer#ifTransformer(Predicate, Transformer, Transformer)} with {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IfTransformer#ifTransformer(Predicate, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer IfTransformer.ifTransformer(Predicate, Transformer, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformerFalseTransformer_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualIfTransformerResult = IfTransformer.ifTransformer(predicate, trueTransformer,
        falseTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(falseTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link IfTransformer#ifTransformer(Predicate, Transformer, Transformer)} with {@code predicate}, {@code trueTransformer}, {@code falseTransformer}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IfTransformer#ifTransformer(Predicate, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer IfTransformer.ifTransformer(Predicate, Transformer, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformerFalseTransformer_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult = IfTransformer.ifTransformer(predicate, trueTransformer,
        falseTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(falseTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link IfTransformer#ifTransformer(Predicate, Transformer)} with {@code predicate}, {@code trueTransformer}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IfTransformer#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer IfTransformer.ifTransformer(Predicate, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformer_thenReturnTransform42Is42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);

    // Act
    Transformer<Object, Object> actualIfTransformerResult = IfTransformer.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer() instanceof NOPTransformer);
    assertEquals("42", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test {@link IfTransformer#ifTransformer(Predicate, Transformer)} with {@code predicate}, {@code trueTransformer}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IfTransformer#ifTransformer(Predicate, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer IfTransformer.ifTransformer(Predicate, Transformer)"})
  public void testIfTransformerWithPredicateTrueTransformer_thenReturnTransform42IsApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualIfTransformerResult = IfTransformer.ifTransformer(predicate, trueTransformer);
    Object actualTransformResult = actualIfTransformerResult.transform("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualIfTransformerResult instanceof IfTransformer);
    assertTrue(
        ((IfTransformer<Object, Object>) actualIfTransformerResult).getFalseTransformer() instanceof NOPTransformer);
    assertEquals("Apply", actualTransformResult);
    assertSame(predicate, ((IfTransformer<Object, Object>) actualIfTransformerResult).getPredicate());
    assertSame(trueTransformer, ((IfTransformer<Object, Object>) actualIfTransformerResult).getTrueTransformer());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link IfTransformer#IfTransformer(Predicate, Transformer, Transformer)}
   *   <li>{@link IfTransformer#getFalseTransformer()}
   *   <li>{@link IfTransformer#getPredicate()}
   *   <li>{@link IfTransformer#getTrueTransformer()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IfTransformer.<init>(Predicate, Transformer, Transformer)",
      "Transformer IfTransformer.getFalseTransformer()", "Predicate IfTransformer.getPredicate()",
      "Transformer IfTransformer.getTrueTransformer()"})
  public void testGettersAndSetters() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);

    // Act
    IfTransformer<Object, Object> actualIfTransformer = new IfTransformer<>(predicate, trueTransformer,
        falseTransformer);
    Transformer<? super Object, ?> actualFalseTransformer = actualIfTransformer.getFalseTransformer();
    Predicate<? super Object> actualPredicate = actualIfTransformer.getPredicate();

    // Assert
    assertSame(predicate, actualPredicate);
    assertSame(falseTransformer, actualFalseTransformer);
    assertSame(trueTransformer, actualIfTransformer.getTrueTransformer());
  }

  /**
   * Test {@link IfTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IfTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IfTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    IfTransformer<Object, Object> ifTransformer = new IfTransformer<>(predicate, trueTransformer, falseTransformer);

    // Act
    Object actualTransformResult = ifTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }

  /**
   * Test {@link IfTransformer#transform(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IfTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IfTransformer.transform(Object)"})
  public void testTransform_givenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    IfTransformer<Object, Object> ifTransformer = new IfTransformer<>(predicate, trueTransformer,
        mock(Transformer.class));

    // Act
    Object actualTransformResult = ifTransformer.transform("Input");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }
}
