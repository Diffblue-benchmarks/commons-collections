package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.WhileClosure;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ClosureUtilsDiffblueTest {
  /**
   * Test {@link ClosureUtils#asClosure(Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  public void testAsClosure_givenApply_whenTransformerApplyReturnApply_thenReturnTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Closure<Object> actualAsClosureResult = ClosureUtils.asClosure(transformer);
    actualAsClosureResult.execute("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualAsClosureResult instanceof TransformerClosure);
    assertSame(transformer, ((TransformerClosure<Object>) actualAsClosureResult).getTransformer());
  }

  /**
   * Test {@link ClosureUtils#asClosure(Transformer)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  public void testAsClosure_whenNull_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualAsClosureResult = ClosureUtils.asClosure(null);
    actualAsClosureResult.execute("42");

    // Assert
    assertTrue(actualAsClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   * <ul>
   *   <li>Then return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  public void testChainedClosureWithClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closure);
    actualChainedClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   * <ul>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  public void testChainedClosureWithClosure_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure();
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Then return array length is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Collection)"})
  public void testChainedClosureWithCollection_thenReturnArrayLengthIsTwo() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> closure2 = mock(Closure.class);
    doNothing().when(closure2).accept(Mockito.<Object>any());

    ArrayList<Closure<? super Object>> closures = new ArrayList<>();
    closures.add(closure2);
    closures.add(closure);

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    verify(closure2).accept(isA(Object.class));
    verify(closure).accept(isA(Object.class));
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(2, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Collection)"})
  public void testChainedClosureWithCollection_whenArrayList_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(new ArrayList<>());
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#doWhileClosure(Closure, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.doWhileClosure(Closure, Predicate)"})
  public void testDoWhileClosure_givenFalse_thenReturnWhileClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Closure<Object> actualDoWhileClosureResult = ClosureUtils.doWhileClosure(closure, predicate);
    actualDoWhileClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualDoWhileClosureResult instanceof WhileClosure);
    assertTrue(((WhileClosure<Object>) actualDoWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualDoWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualDoWhileClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());
    IfClosure<? super Object> closure = new IfClosure<>(predicate, mock(Closure.class), falseClosure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(falseClosure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure2 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure2 instanceof IfClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, closure2);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> closure2 = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        mock(Closure.class));

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertSame(closure2, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> closure2 = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        defaultClosure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(defaultClosure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertSame(closure2, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then Closure return {@link TransformerClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_givenApply_thenClosureReturnTransformerClosure() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<? super Object> closure = new TransformerClosure<>(transformer);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure2 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure2 instanceof TransformerClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, closure2);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@link TransformerClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_givenApply_thenReturnTransformerClosure() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, new TransformerClosure<>(transformer));
    actualForClosureResult.execute("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualForClosureResult instanceof TransformerClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then Closure FalseClosure return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenClosureFalseClosureReturnNOPClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    IfClosure<? super Object> closure = new IfClosure<>(predicate, trueClosure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(trueClosure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure2 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure2 instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) closure2).getFalseClosure() instanceof NOPClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, closure2);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then Closure FalseClosure return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenClosureFalseClosureReturnNOPClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<? super Object> closure = new IfClosure<>(predicate, mock(Closure.class));

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure2 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure2 instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) closure2).getFalseClosure() instanceof NOPClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, closure2);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then Closure return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenClosureReturnChainedClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> closure2 = new ChainedClosure<>(closure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    Closure<? super Object> closure3 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure3 instanceof ChainedClosure);
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(1, ((ChainedClosure<? super Object>) closure3).getClosures().length);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then Closure return {@link ForClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenClosureReturnForClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<? super Object> closure2 = new ForClosure<>(3, closure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    Closure<? super Object> closure3 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure3 instanceof ForClosure);
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(3, ((ForClosure<? super Object>) closure3).getCount());
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then Closure return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenClosureReturnWhileClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    WhileClosure<? super Object> closure2 = new WhileClosure<>(predicate, closure, true);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    Closure<? super Object> closure3 = ((ForClosure<Object>) actualForClosureResult).getClosure();
    assertTrue(closure3 instanceof WhileClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertTrue(((WhileClosure<? super Object>) closure3).isDoLoop());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, new IfClosure<>(predicate, trueClosure));
    actualForClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualForClosureResult).getFalseClosure() instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then return {@link SwitchClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_thenReturnSwitchClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1,
        new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure}, mock(Closure.class)));
    actualForClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualForClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualForClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>When {@link ChainedClosure#ChainedClosure(Closure[])} with closures is {@link Closure}.</li>
   *   <li>Then return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_whenChainedClosureWithClosuresIsClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, new ChainedClosure<>(closure));
    actualForClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualForClosureResult).getClosures().length);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_whenThree_thenReturnClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  public void testForClosure_whenZero_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(0, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    IfClosure<? super Object> trueClosure2 = new IfClosure<>(predicate2, trueClosure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure2);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure3 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure3 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> falseClosure = ((IfClosure<Object>) actualIfClosureResult).getFalseClosure();
    assertTrue(falseClosure instanceof NOPClosure);
    assertSame(trueClosure2, trueClosure3);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
    assertSame(falseClosure, ((IfClosure<? super Object>) trueClosure3).getFalseClosure());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());
    IfClosure<? super Object> trueClosure = new IfClosure<>(predicate2, mock(Closure.class), falseClosure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> trueClosure = new SwitchClosure<>(new Predicate[]{predicate2}, new Closure[]{closure},
        mock(Closure.class));

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> trueClosure = new SwitchClosure<>(new Predicate[]{predicate2}, new Closure[]{closure},
        defaultClosure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(closure);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ChainedClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(1, ((ChainedClosure<? super Object>) trueClosure2).getClosures().length);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<? super Object> trueClosure = new ForClosure<>(3, closure);

    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ForClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(3, ((ForClosure<? super Object>) trueClosure2).getCount());
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> trueClosure = new SwitchClosure<>(new Predicate[]{predicate2}, new Closure[]{closure},
        mock(Closure.class));

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, mock(Closure.class));
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> trueClosure = new SwitchClosure<>(new Predicate[]{predicate2}, new Closure[]{closure},
        defaultClosure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, mock(Closure.class));
    actualIfClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<? super Object> trueClosure = new TransformerClosure<>(transformer);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof TransformerClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    WhileClosure<? super Object> trueClosure = new WhileClosure<>(predicate2, closure, true);

    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof WhileClosure);
    assertTrue(((WhileClosure<? super Object>) trueClosure2).isDoLoop());
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure_thenReturnTrueClosureIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure_thenReturnTrueClosureIsClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <ul>
   *   <li>Then TrueClosure return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure_thenTrueClosureReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    IfClosure<? super Object> trueClosure2 = new IfClosure<>(predicate2, trueClosure);

    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure2, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure3 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure3 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) trueClosure3).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure2, trueClosure3);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code trueClosure}, {@code falseClosure}.
   * <ul>
   *   <li>Then TrueClosure return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  public void testIfClosureWithPredicateTrueClosureFalseClosure_thenTrueClosureReturnIfClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<? super Object> trueClosure = new IfClosure<>(predicate2, mock(Closure.class));

    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) trueClosure2).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure_thenReturnTrueClosureIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <ul>
   *   <li>Then TrueClosure return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnChainedClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(closure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ChainedClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(1, ((ChainedClosure<? super Object>) trueClosure2).getClosures().length);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <ul>
   *   <li>Then TrueClosure return {@link ForClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnForClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<? super Object> trueClosure = new ForClosure<>(3, closure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ForClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(3, ((ForClosure<? super Object>) trueClosure2).getCount());
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <ul>
   *   <li>Then TrueClosure return {@link TransformerClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnTransformerClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<? super Object> trueClosure = new TransformerClosure<>(transformer);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof TransformerClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <ul>
   *   <li>Then TrueClosure return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnWhileClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    WhileClosure<? super Object> trueClosure = new WhileClosure<>(predicate2, closure, true);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    Closure<? super Object> trueClosure2 = ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof WhileClosure);
    assertTrue(((WhileClosure<? super Object>) trueClosure2).isDoLoop());
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code trueClosure}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return TrueClosure is {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  public void testIfClosureWithPredicateTrueClosure_whenClosure_thenReturnTrueClosureIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> trueClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#nopClosure()}.
   * <p>
   * Method under test: {@link ClosureUtils#nopClosure()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.nopClosure()"})
  public void testNopClosure() {
    // Arrange and Act
    Closure<Object> actualNopClosureResult = ClosureUtils.nopClosure();
    actualNopClosureResult.execute("42");

    // Assert
    assertTrue(actualNopClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    IfClosure<Object> ifClosure = new IfClosure<>(predicate2, trueClosure);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, ifClosure);
    predicatesAndClosures.put(null, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    Closure<? super Object> closure2 = closures[0];
    assertTrue(closure2 instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) closure2).getFalseClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, closures.length);
    assertSame(ifClosure, closure2);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<Object> ifClosure = new IfClosure<>(predicate2, mock(Closure.class));

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, ifClosure);
    predicatesAndClosures.put(null, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    Closure<? super Object> closure = closures[0];
    assertTrue(closure instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) closure).getFalseClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, closures.length);
    assertSame(ifClosure, closure);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());
    IfClosure<Object> ifClosure = new IfClosure<>(predicate2, mock(Closure.class), falseClosure);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, ifClosure);
    predicatesAndClosures.put(null, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    Closure<? super Object> closure2 = closures[0];
    assertTrue(closure2 instanceof IfClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, closures.length);
    assertSame(ifClosure, closure2);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate2}, new Closure[]{closure},
        mock(Closure.class));

    Closure<Object> closure2 = mock(Closure.class);
    doNothing().when(closure2).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, switchClosure);
    predicatesAndClosures.put(null, closure2);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    assertEquals(1, closures.length);
    assertSame(switchClosure, closures[0]);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<Object> transformerClosure = new TransformerClosure<>(transformer);

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, transformerClosure);
    predicatesAndClosures.put(null, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    Closure<? super Object> closure = closures[0];
    assertTrue(closure instanceof TransformerClosure);
    assertEquals(1, closures.length);
    assertSame(transformerClosure, closure);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then first element return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenFirstElementReturnChainedClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<Object> chainedClosure = new ChainedClosure<>(closure);
    Closure<Object> closure2 = mock(Closure.class);
    doNothing().when(closure2).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, chainedClosure);
    predicatesAndClosures.put(null, closure2);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    Closure<? super Object> closure3 = closures[0];
    assertTrue(closure3 instanceof ChainedClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((ChainedClosure<? super Object>) closure3).getClosures().length);
    assertEquals(1, closures.length);
    assertSame(chainedClosure, closure3);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then first element return {@link ForClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenFirstElementReturnForClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<Object> forClosure = new ForClosure<>(3, closure);

    Closure<Object> closure2 = mock(Closure.class);
    doNothing().when(closure2).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, forClosure);
    predicatesAndClosures.put(null, closure2);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    Closure<? super Object> closure3 = closures[0];
    assertTrue(closure3 instanceof ForClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, closures.length);
    assertEquals(3, ((ForClosure<? super Object>) closure3).getCount());
    assertSame(forClosure, closure3);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenHashMapSizeIsThree() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.putIfAbsent(predicate3, mock(Closure.class));
    predicatesAndClosures.put(predicate2, mock(Closure.class));
    predicatesAndClosures.put(predicate, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate3).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertEquals(3, predicatesAndClosures.size());
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(3, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(3, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenHashMapSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, null);
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    predicatesAndClosures.put(new EqualPredicate<>("Test", equator), mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(2, predicatesAndClosures.size());
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(2, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(2, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then return first element is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_thenReturnFirstElementIsNull() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, null);
    predicatesAndClosures.put(null, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, predicatesAndClosures.size());
    Closure<? super Object>[] closures = ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    assertNull(closures[0]);
    assertEquals(1, closures.length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@link Predicate} is {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_whenHashMapPredicateIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  public void testSwitchClosureWithPredicatesAndClosures_whenHashMap_thenReturnNOPClosure() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchClosureResult instanceof NOPClosure);
    assertTrue(predicatesAndClosures.isEmpty());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[], Closure)"})
  public void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[], Closure)"})
  public void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code closures}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  public void testSwitchClosureWithPredicatesClosures_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(new Predicate[]{predicate},
        new Closure[]{mock(Closure.class)});
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code closures}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  public void testSwitchClosureWithPredicatesClosures_givenTrue_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure});
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code closures}.
   * <ul>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  public void testSwitchClosureWithPredicatesClosures_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(new Predicate[]{}, new Closure[]{});
    actualSwitchClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return first element Value intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  public void testSwitchMapClosure_givenOne_thenReturnFirstElementValueIntValueIsOne() {
    // Arrange
    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put(1, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchMapClosureResult = ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    Predicate<? super Object>[] predicates = ((SwitchClosure<Object>) actualSwitchMapClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(((SwitchClosure<Object>) actualSwitchMapClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchMapClosureResult instanceof SwitchClosure);
    assertEquals(1, ((Integer) ((EqualPredicate<? super Object>) predicate).getValue()).intValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchMapClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   * <ul>
   *   <li>Then return first element Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  public void testSwitchMapClosure_thenReturnFirstElementValueIs42() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put("42", closure);

    // Act
    Closure<Object> actualSwitchMapClosureResult = ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    Predicate<? super Object>[] predicates = ((SwitchClosure<Object>) actualSwitchMapClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(((SwitchClosure<Object>) actualSwitchMapClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchMapClosureResult instanceof SwitchClosure);
    assertEquals("42", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchMapClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  public void testSwitchMapClosure_whenHashMap_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualSwitchMapClosureResult = ClosureUtils.switchMapClosure(new HashMap<>());
    actualSwitchMapClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchMapClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#whileClosure(Predicate, Closure)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#whileClosure(Predicate, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure ClosureUtils.whileClosure(Predicate, Closure)"})
  public void testWhileClosure_givenFalse_whenClosure_thenReturnWhileClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);

    // Act
    Closure<Object> actualWhileClosureResult = ClosureUtils.whileClosure(predicate, closure);
    actualWhileClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualWhileClosureResult instanceof WhileClosure);
    assertFalse(((WhileClosure<Object>) actualWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualWhileClosureResult).getPredicate());
  }
}
