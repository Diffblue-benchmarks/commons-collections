package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClosureTransformerDiffblueTest {
  /**
   * Test {@link ClosureTransformer#closureTransformer(Closure)}.
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then return transform {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureTransformer#closureTransformer(Closure)}
   */
  @Test
  @DisplayName("Test closureTransformer(Closure); when Closure accept(Object) does nothing; then return transform '42' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer ClosureTransformer.closureTransformer(Closure)"})
  void testClosureTransformer_whenClosureAcceptDoesNothing_thenReturnTransform42Is42() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Transformer<Object, Object> actualClosureTransformerResult = ClosureTransformer.closureTransformer(closure);
    Object actualTransformResult = actualClosureTransformerResult.transform("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualClosureTransformerResult instanceof ClosureTransformer);
    assertEquals("42", actualTransformResult);
    assertSame(closure, ((ClosureTransformer<Object>) actualClosureTransformerResult).getClosure());
  }

  /**
   * Test {@link ClosureTransformer#closureTransformer(Closure)}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link ClosureTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureTransformer#closureTransformer(Closure)}
   */
  @Test
  @DisplayName("Test closureTransformer(Closure); when Closure; then return ClosureTransformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer ClosureTransformer.closureTransformer(Closure)"})
  void testClosureTransformer_whenClosure_thenReturnClosureTransformer() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);

    // Act
    Transformer<Object, Object> actualClosureTransformerResult = ClosureTransformer.closureTransformer(closure);

    // Assert
    assertTrue(actualClosureTransformerResult instanceof ClosureTransformer);
    assertSame(closure, ((ClosureTransformer<Object>) actualClosureTransformerResult).getClosure());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ClosureTransformer#ClosureTransformer(Closure)}
   *   <li>{@link ClosureTransformer#getClosure()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ClosureTransformer.<init>(Closure)", "Closure ClosureTransformer.getClosure()"})
  void testGettersAndSetters() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);

    // Act
    ClosureTransformer<Object> actualClosureTransformer = new ClosureTransformer<>(closure);

    // Assert
    assertSame(closure, actualClosureTransformer.getClosure());
  }

  /**
   * Test {@link ClosureTransformer#transform(Object)}.
   * <p>
   * Method under test: {@link ClosureTransformer#transform(Object)}
   */
  @Test
  @DisplayName("Test transform(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ClosureTransformer.transform(Object)"})
  void testTransform() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ClosureTransformer<Object> closureTransformer = new ClosureTransformer<>(closure);

    // Act
    Object actualTransformResult = closureTransformer.transform("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals("Input", actualTransformResult);
  }
}
