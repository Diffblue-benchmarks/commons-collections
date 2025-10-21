package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformerClosureDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure TransformerClosure.transformerClosure(Transformer)"})
  public void testTransformerClosure_givenApply_thenReturnTransformer() {
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
   *   <li>Then Transformer return {@link ClosureTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformerClosure#transformerClosure(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure TransformerClosure.transformerClosure(Transformer)"})
  public void testTransformerClosure_thenTransformerReturnClosureTransformer() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ClosureTransformer<? super Object> transformer = new ClosureTransformer<>(closure);

    // Act
    Closure<Object> actualTransformerClosureResult = TransformerClosure.transformerClosure(transformer);
    actualTransformerClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    Transformer<? super Object, ?> transformer2 = ((TransformerClosure<Object>) actualTransformerClosureResult)
        .getTransformer();
    assertTrue(transformer2 instanceof ClosureTransformer);
    assertTrue(actualTransformerClosureResult instanceof TransformerClosure);
    assertSame(transformer, transformer2);
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure TransformerClosure.transformerClosure(Transformer)"})
  public void testTransformerClosure_whenNull_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualTransformerClosureResult = TransformerClosure.transformerClosure(null);
    actualTransformerClosureResult.execute("42");

    // Assert
    assertTrue(actualTransformerClosureResult instanceof NOPClosure);
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformerClosure.<init>(Transformer)", "Transformer TransformerClosure.getTransformer()"})
  public void testGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformerClosure.execute(Object)"})
  public void testExecute() {
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
