package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ClosureTransformerDiffblueTest {
  /**
   * Test {@link ClosureTransformer#closureTransformer(Closure)}.
   * <p>
   * Method under test: {@link ClosureTransformer#closureTransformer(Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ClosureTransformer.closureTransformer(Closure)"})
  public void testClosureTransformer() {
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
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ClosureTransformer#ClosureTransformer(Closure)}
   *   <li>{@link ClosureTransformer#getClosure()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ClosureTransformer.<init>(Closure)", "Closure ClosureTransformer.getClosure()"})
  public void testGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ClosureTransformer.transform(Object)"})
  public void testTransform() {
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
