package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformerClosureDiffblueTest {
  /**
   * Test {@link TransformerClosure#transformerClosure(Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerClosure#transformerClosure(Transformer)}
   */
  @Test
  @DisplayName("Test transformerClosure(Transformer); given 'Apply'; then return Transformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure TransformerClosure.transformerClosure(Transformer)"})
  void testTransformerClosure_givenApply_thenReturnTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Closure<Object> actualTransformerClosureResult = TransformerClosure.transformerClosure(transformer);
    actualTransformerClosureResult.execute("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualTransformerClosureResult instanceof TransformerClosure);
    assertSame(transformer, ((TransformerClosure<Object>) actualTransformerClosureResult).getTransformer());
  }

  /**
   * Test {@link TransformerClosure#transformerClosure(Transformer)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerClosure#transformerClosure(Transformer)}
   */
  @Test
  @DisplayName("Test transformerClosure(Transformer); when 'null'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure TransformerClosure.transformerClosure(Transformer)"})
  void testTransformerClosure_whenNull_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualTransformerClosureResult = TransformerClosure.transformerClosure(null);
    actualTransformerClosureResult.execute("42");

    // Assert
    assertTrue(actualTransformerClosureResult instanceof NOPClosure);
    assertNull(null);
  }

  /**
   * Test {@link TransformerClosure#transformerClosure(Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerClosure#transformerClosure(Transformer)}
   */
  @Test
  @DisplayName("Test transformerClosure(Transformer); when Transformer; then return Transformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure TransformerClosure.transformerClosure(Transformer)"})
  void testTransformerClosure_whenTransformer_thenReturnTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Closure<Object> actualTransformerClosureResult = TransformerClosure.transformerClosure(transformer);

    // Assert
    assertTrue(actualTransformerClosureResult instanceof TransformerClosure);
    assertSame(transformer, ((TransformerClosure<Object>) actualTransformerClosureResult).getTransformer());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TransformerClosure#TransformerClosure(Transformer)}
   *   <li>{@link TransformerClosure#getTransformer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformerClosure.<init>(Transformer)", "Transformer TransformerClosure.getTransformer()"})
  void testGettersAndSetters() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    TransformerClosure<Object> actualTransformerClosure = new TransformerClosure<>(transformer);

    // Assert
    assertSame(transformer, actualTransformerClosure.getTransformer());
  }

  /**
   * Test {@link TransformerClosure#execute(Object)}.
   * <p>
   * Method under test: {@link TransformerClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformerClosure.execute(Object)"})
  void testExecute() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<Object> transformerClosure = new TransformerClosure<>(transformer);

    // Act
    transformerClosure.execute("Input");

    // Assert
    verify(transformer).apply(isA(Object.class));
  }
}
