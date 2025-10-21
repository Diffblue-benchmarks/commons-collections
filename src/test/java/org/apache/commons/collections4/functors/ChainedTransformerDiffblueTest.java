package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ChainedTransformerDiffblueTest {
  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  public void testChainedTransformerWithCollection_thenReturnArrayLengthIsOne() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(transformer);

    // Act
    Transformer<Object, Object> actualChainedTransformerResult = ChainedTransformer.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  public void testChainedTransformerWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> transformer2 = mock(Transformer.class);
    when(transformer2.apply(Mockito.<Object>any())).thenReturn("Apply");

    ArrayList<Transformer<? super Object, ?>> transformers = new ArrayList<>();
    transformers.add(transformer2);
    transformers.add(transformer);

    // Act
    Transformer<Object, Object> actualChainedTransformerResult = ChainedTransformer.chainedTransformer(transformers);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer2).apply(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(2, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link NOPTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#chainedTransformer(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Collection)"})
  public void testChainedTransformerWithCollection_whenArrayList_thenReturnNOPTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualChainedTransformerResult = ChainedTransformer
        .chainedTransformer(new ArrayList<>());
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@link ChainedTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#chainedTransformer(Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Transformer[])"})
  public void testChainedTransformerWithTransformer_givenApply_thenReturnChainedTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Transformer<Object, Object> actualChainedTransformerResult = ChainedTransformer.chainedTransformer(transformer);
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualChainedTransformerResult instanceof ChainedTransformer);
    assertEquals("Apply", actualTransformResult);
    assertEquals(1, ((ChainedTransformer<Object>) actualChainedTransformerResult).getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#chainedTransformer(Transformer[])} with {@code Transformer[]}.
   * <ul>
   *   <li>Then return {@link NOPTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#chainedTransformer(Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ChainedTransformer.chainedTransformer(Transformer[])"})
  public void testChainedTransformerWithTransformer_thenReturnNOPTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualChainedTransformerResult = ChainedTransformer.chainedTransformer();
    Object actualTransformResult = actualChainedTransformerResult.transform("42");

    // Assert
    assertTrue(actualChainedTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualChainedTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualChainedTransformerResult.transform("Input"));
  }

  /**
   * Test {@link ChainedTransformer#ChainedTransformer(Transformer[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Transformers is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#ChainedTransformer(Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ChainedTransformer.<init>(Transformer[])"})
  public void testNewChainedTransformer_whenNull_thenReturnTransformersIsNull() {
    // Arrange and Act
    ChainedTransformer<Object> actualChainedTransformer = new ChainedTransformer<>(null);

    // Assert
    assertNull(actualChainedTransformer.getTransformers());
  }

  /**
   * Test {@link ChainedTransformer#ChainedTransformer(Transformer[])}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChainedTransformer#ChainedTransformer(Transformer[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ChainedTransformer.<init>(Transformer[])"})
  public void testNewChainedTransformer_whenTransformer_thenReturnArrayLengthIsOne() {
    // Arrange and Act
    ChainedTransformer<Object> actualChainedTransformer = new ChainedTransformer<>(mock(Transformer.class));

    // Assert
    assertEquals(1, actualChainedTransformer.getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#getTransformers()}.
   * <p>
   * Method under test: {@link ChainedTransformer#getTransformers()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer[] ChainedTransformer.getTransformers()"})
  public void testGetTransformers() {
    // Arrange
    ChainedTransformer<Object> chainedTransformer = new ChainedTransformer<>(mock(Transformer.class));

    // Act and Assert
    assertEquals(1, chainedTransformer.getTransformers().length);
  }

  /**
   * Test {@link ChainedTransformer#transform(Object)}.
   * <p>
   * Method under test: {@link ChainedTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ChainedTransformer.transform(Object)"})
  public void testTransform() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ChainedTransformer<Object> chainedTransformer = new ChainedTransformer<>(transformer);

    // Act
    Object actualTransformResult = chainedTransformer.transform("Object");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformResult);
  }
}
