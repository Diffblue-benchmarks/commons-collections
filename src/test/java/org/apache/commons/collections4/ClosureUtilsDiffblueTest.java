package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.WhileClosure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClosureUtilsDiffblueTest {
  /**
   * Test {@link ClosureUtils#asClosure(Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName(
      "Test asClosure(Transformer); given 'Apply'; when Transformer apply(Object) return 'Apply'; then return Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_givenApply_whenTransformerApplyReturnApply_thenReturnTransformer() {
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); when 'null'; then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_whenNull_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualAsClosureResult = ClosureUtils.asClosure(null);
    actualAsClosureResult.execute("42");

    // Assert
    assertTrue(actualAsClosureResult instanceof NOPClosure);
    assertNull(null);
  }

  /**
   * Test {@link ClosureUtils#asClosure(Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); when Transformer; then return Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_whenTransformer_thenReturnTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Closure<Object> actualAsClosureResult = ClosureUtils.asClosure(transformer);

    // Assert
    assertTrue(actualAsClosureResult instanceof TransformerClosure);
    assertSame(transformer, ((TransformerClosure<Object>) actualAsClosureResult).getTransformer());
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   *
   * <ul>
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_thenReturnNOPClosure() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[] {};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
    assertEquals(0, closures.length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   *
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName(
      "Test chainedClosure(Closure[]) with 'Closure[]'; when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosureAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
    assertEquals(1, closures.length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName(
      "Test chainedClosure(Closure[]) with 'Closure[]'; when Closure; then return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);

    // Assert
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
    assertEquals(1, closures.length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#chainedClosure(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedClosure(Collection) with 'Collection'; when ArrayList(); then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Collection)"})
  void testChainedClosureWithCollection_whenArrayList_thenReturnNOPClosure() {
    // Arrange
    ArrayList<Closure<? super Object>> closures = new ArrayList<>();

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
    assertTrue(closures.isEmpty());
  }

  /**
   * Test {@link ClosureUtils#doWhileClosure(Closure, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @DisplayName(
      "Test doWhileClosure(Closure, Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.doWhileClosure(Closure, Predicate)"})
  void testDoWhileClosure_givenFalse_whenPredicateTestReturnFalse_thenCallsAccept() {
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
   * Test {@link ClosureUtils#doWhileClosure(Closure, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return {@link WhileClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @DisplayName("Test doWhileClosure(Closure, Predicate); when Closure; then return WhileClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.doWhileClosure(Closure, Predicate)"})
  void testDoWhileClosure_whenClosure_thenReturnWhileClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Closure<Object> actualDoWhileClosureResult = ClosureUtils.doWhileClosure(closure, predicate);

    // Assert
    assertTrue(actualDoWhileClosureResult instanceof WhileClosure);
    assertTrue(((WhileClosure<Object>) actualDoWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualDoWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualDoWhileClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#exceptionClosure()}.
   *
   * <ul>
   *   <li>Then return {@link ExceptionClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#exceptionClosure()}
   */
  @Test
  @DisplayName("Test exceptionClosure(); then return ExceptionClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.exceptionClosure()"})
  void testExceptionClosure_thenReturnExceptionClosure() {
    // Arrange and Act
    Closure<Object> actualExceptionClosureResult = ClosureUtils.exceptionClosure();

    // Assert
    assertTrue(actualExceptionClosureResult instanceof ExceptionClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> closure =
        new IfClosure<>(predicate, mock(Closure.class), falseClosure);

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
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    SwitchClosure<? super Object> closure2 =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(1, closure2.getClosures().length);
    assertEquals(1, closure2.getPredicates().length);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure2, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<? super Object> closure =
        new SwitchClosure<>(predicates, closures, defaultClosure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(defaultClosure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(1, closure.getClosures().length);
    assertEquals(1, closure.getPredicates().length);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then Closure return {@link TransformerClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName(
      "Test forClosure(int, Closure); given 'Apply'; then Closure return TransformerClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_givenApply_thenClosureReturnTransformerClosure() {
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
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return {@link TransformerClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); given 'Apply'; then return TransformerClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_givenApply_thenReturnTransformerClosure() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Closure<Object> actualForClosureResult =
        ClosureUtils.forClosure(1, new TransformerClosure<>(transformer));
    actualForClosureResult.execute("42");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualForClosureResult instanceof TransformerClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then Closure FalseClosure return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure FalseClosure return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenClosureFalseClosureReturnNOPClosure() {
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
   *
   * <ul>
   *   <li>Then Closure FalseClosure return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure FalseClosure return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenClosureFalseClosureReturnNOPClosure2() {
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
   *
   * <ul>
   *   <li>Then Closure return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenClosureReturnChainedClosure() {
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
    assertEquals(1, closure2.getClosures().length);
    assertEquals(1, ((ChainedClosure<? super Object>) closure3).getClosures().length);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then Closure return {@link ForClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return ForClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenClosureReturnForClosure() {
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
    assertEquals(3, closure2.getCount());
    assertEquals(3, ((ForClosure<? super Object>) closure3).getCount());
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then Closure return {@link WhileClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return WhileClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenClosureReturnWhileClosure() {
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
    assertTrue(closure2.isDoLoop());
    assertTrue(((WhileClosure<? super Object>) closure3).isDoLoop());
    assertSame(closure2, closure3);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then not {@link WhileClosure#WhileClosure(Predicate, Closure, boolean)} with {@link
   *       Predicate} and {@link Closure} and doLoop is {@code false} DoLoop.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName(
      "Test forClosure(int, Closure); then not WhileClosure(Predicate, Closure, boolean) with Predicate and Closure and doLoop is 'false' DoLoop")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenNotWhileClosureWithPredicateAndClosureAndDoLoopIsFalseDoLoop() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    WhileClosure<? super Object> closure =
        new WhileClosure<>(predicate, mock(Closure.class), false);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof WhileClosure);
    assertFalse(closure.isDoLoop());
    assertFalse(((WhileClosure<Object>) actualForClosureResult).isDoLoop());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then return DoLoop.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then return DoLoop")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenReturnDoLoop() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    WhileClosure<? super Object> closure2 = new WhileClosure<>(predicate, closure, true);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof WhileClosure);
    assertTrue(closure2.isDoLoop());
    assertTrue(((WhileClosure<Object>) actualForClosureResult).isDoLoop());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then return {@link IfClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then return IfClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenReturnIfClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> closure = new IfClosure<>(predicate, trueClosure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof IfClosure);
    assertTrue(
        ((IfClosure<Object>) actualForClosureResult).getFalseClosure() instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>Then return {@link SwitchClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then return SwitchClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenReturnSwitchClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    SwitchClosure<? super Object> closure2 =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof SwitchClosure);
    assertEquals(1, closure2.getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualForClosureResult).getClosures().length);
    assertEquals(1, closure2.getPredicates().length);
    assertEquals(1, ((SwitchClosure<Object>) actualForClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>When {@link ChainedClosure#ChainedClosure(Closure[])} with closures is {@link Closure}.
   *   <li>Then return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName(
      "Test forClosure(int, Closure); when ChainedClosure(Closure[]) with closures is Closure; then return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_whenChainedClosureWithClosuresIsClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> closure2 = new ChainedClosure<>(closure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, closure2);
    actualForClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualForClosureResult instanceof ChainedClosure);
    assertEquals(1, closure2.getClosures().length);
    assertEquals(1, ((ChainedClosure<Object>) actualForClosureResult).getClosures().length);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when Closure; then return Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_whenClosure_thenReturnClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(3, closure);

    // Assert
    assertTrue(actualForClosureResult instanceof ForClosure);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
    assertSame(closure, ((ForClosure<Object>) actualForClosureResult).getClosure());
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when 'null'; then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_whenNull_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
    assertNull(null);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when three; then return Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_whenThree_thenReturnClosure() {
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
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when zero; then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_whenZero_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(0, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
    assertNull(null);
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure() {
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
    Closure<? super Object> trueClosure3 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure3 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> falseClosure =
        ((IfClosure<Object>) actualIfClosureResult).getFalseClosure();
    assertTrue(falseClosure instanceof NOPClosure);
    assertSame(trueClosure2, trueClosure3);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
    assertSame(falseClosure, ((IfClosure<? super Object>) trueClosure3).getFalseClosure());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> trueClosure =
        new IfClosure<>(predicate2, mock(Closure.class), falseClosure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    SwitchClosure<? super Object> trueClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, trueClosure.getPredicates().length);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<? super Object> trueClosure =
        new SwitchClosure<>(predicates, closures, defaultClosure);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, trueClosure.getPredicates().length);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure5() {
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
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof WhileClosure);
    assertTrue(trueClosure.isDoLoop());
    assertTrue(((WhileClosure<? super Object>) trueClosure2).isDoLoop());
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    WhileClosure<? super Object> trueClosure =
        new WhileClosure<>(predicate2, mock(Closure.class), false);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof WhileClosure);
    assertFalse(trueClosure.isDoLoop());
    assertFalse(((WhileClosure<? super Object>) trueClosure2).isDoLoop());
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> trueClosure = new ChainedClosure<>(closure);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ChainedClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, ((ChainedClosure<? super Object>) trueClosure2).getClosures().length);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ForClosure<? super Object> trueClosure = new ForClosure<>(3, closure);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ForClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(3, trueClosure.getCount());
    assertEquals(3, ((ForClosure<? super Object>) trueClosure2).getCount());
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    SwitchClosure<? super Object> trueClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, trueClosure.getPredicates().length);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate2};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<? super Object> trueClosure =
        new SwitchClosure<>(predicates, closures, defaultClosure);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, trueClosure.getPredicates().length);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformerClosure<? super Object> trueClosure = new TransformerClosure<>(transformer);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof TransformerClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure6() {
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
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof WhileClosure);
    assertTrue(trueClosure.isDoLoop());
    assertTrue(((WhileClosure<? super Object>) trueClosure2).isDoLoop());
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    WhileClosure<? super Object> trueClosure =
        new WhileClosure<>(predicate2, mock(Closure.class), false);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualIfClosureResult instanceof IfClosure);
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof WhileClosure);
    assertFalse(trueClosure.isDoLoop());
    assertFalse(((WhileClosure<? super Object>) trueClosure2).isDoLoop());
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenReturnTrueClosureIsClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
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
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenReturnTrueClosureIsClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> trueClosure = mock(Closure.class);

    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
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
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link IfClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then TrueClosure return IfClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenTrueClosureReturnIfClosure() {
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
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure2, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(trueClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure3 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure3 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) trueClosure3).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure2, trueClosure3);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link IfClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; then TrueClosure return IfClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_thenTrueClosureReturnIfClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<? super Object> trueClosure = new IfClosure<>(predicate2, mock(Closure.class));
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);
    actualIfClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof IfClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<? super Object>) trueClosure2).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)} with {@code predicate}, {@code
   * trueClosure}, {@code falseClosure}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure, Closure) with 'predicate', 'trueClosure', 'falseClosure'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure, Closure)"})
  void testIfClosureWithPredicateTrueClosureFalseClosure_whenPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> trueClosure = mock(Closure.class);
    Closure<Object> falseClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult =
        ClosureUtils.ifClosure(predicate, trueClosure, falseClosure);

    // Assert
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertSame(falseClosure, ((IfClosure<Object>) actualIfClosureResult).getFalseClosure());
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_thenReturnTrueClosureIsClosure() {
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
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; then TrueClosure return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnChainedClosure() {
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
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ChainedClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(1, trueClosure.getClosures().length);
    assertEquals(1, ((ChainedClosure<? super Object>) trueClosure2).getClosures().length);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link ForClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; then TrueClosure return ForClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnForClosure() {
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
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof ForClosure);
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertEquals(3, trueClosure.getCount());
    assertEquals(3, ((ForClosure<? super Object>) trueClosure2).getCount());
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>Then TrueClosure return {@link TransformerClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; then TrueClosure return TransformerClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_thenTrueClosureReturnTransformerClosure() {
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
    Closure<? super Object> trueClosure2 =
        ((IfClosure<Object>) actualIfClosureResult).getTrueClosure();
    assertTrue(trueClosure2 instanceof TransformerClosure);
    assertSame(trueClosure, trueClosure2);
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return TrueClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; when Closure; then return TrueClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_whenClosure_thenReturnTrueClosureIsClosure() {
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
   * Test {@link ClosureUtils#ifClosure(Predicate, Closure)} with {@code predicate}, {@code
   * trueClosure}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#ifClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test ifClosure(Predicate, Closure) with 'predicate', 'trueClosure'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.ifClosure(Predicate, Closure)"})
  void testIfClosureWithPredicateTrueClosure_whenPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> trueClosure = mock(Closure.class);

    // Act
    Closure<Object> actualIfClosureResult = ClosureUtils.ifClosure(predicate, trueClosure);

    // Assert
    assertTrue(actualIfClosureResult instanceof IfClosure);
    assertTrue(((IfClosure<Object>) actualIfClosureResult).getFalseClosure() instanceof NOPClosure);
    assertSame(trueClosure, ((IfClosure<Object>) actualIfClosureResult).getTrueClosure());
    assertSame(predicate, ((IfClosure<Object>) actualIfClosureResult).getPredicate());
  }

  /**
   * Test {@link ClosureUtils#invokerClosure(String, Class[], Object[])} with {@code methodName},
   * {@code paramTypes}, {@code args}.
   *
   * <p>Method under test: {@link ClosureUtils#invokerClosure(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerClosure(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.invokerClosure(String, Class[], Object[])"})
  void testInvokerClosureWithMethodNameParamTypesArgs() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act
    Closure<Object> actualInvokerClosureResult =
        ClosureUtils.invokerClosure(
            "Method Name", new Class[] {forNameResult}, new Object[] {"Args"});

    // Assert
    assertTrue(
        ((TransformerClosure<Object>) actualInvokerClosureResult).getTransformer()
            instanceof InvokerTransformer);
    assertTrue(actualInvokerClosureResult instanceof TransformerClosure);
  }

  /**
   * Test {@link ClosureUtils#invokerClosure(String, Class[], Object[])} with {@code methodName},
   * {@code paramTypes}, {@code args}.
   *
   * <p>Method under test: {@link ClosureUtils#invokerClosure(String, Class[], Object[])}
   */
  @Test
  @DisplayName(
      "Test invokerClosure(String, Class[], Object[]) with 'methodName', 'paramTypes', 'args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.invokerClosure(String, Class[], Object[])"})
  void testInvokerClosureWithMethodNameParamTypesArgs2() {
    // Arrange and Act
    Closure<Object> actualInvokerClosureResult =
        ClosureUtils.invokerClosure("Method Name", null, null);

    // Assert
    assertTrue(
        ((TransformerClosure<Object>) actualInvokerClosureResult).getTransformer()
            instanceof InvokerTransformer);
    assertTrue(actualInvokerClosureResult instanceof TransformerClosure);
  }

  /**
   * Test {@link ClosureUtils#invokerClosure(String)} with {@code methodName}.
   *
   * <ul>
   *   <li>Then Transformer return {@link InvokerTransformer}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#invokerClosure(String)}
   */
  @Test
  @DisplayName(
      "Test invokerClosure(String) with 'methodName'; then Transformer return InvokerTransformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.invokerClosure(String)"})
  void testInvokerClosureWithMethodName_thenTransformerReturnInvokerTransformer() {
    // Arrange and Act
    Closure<Object> actualInvokerClosureResult = ClosureUtils.invokerClosure("Method Name");

    // Assert
    assertTrue(
        ((TransformerClosure<Object>) actualInvokerClosureResult).getTransformer()
            instanceof InvokerTransformer);
    assertTrue(actualInvokerClosureResult instanceof TransformerClosure);
  }

  /**
   * Test {@link ClosureUtils#nopClosure()}.
   *
   * <p>Method under test: {@link ClosureUtils#nopClosure()}
   */
  @Test
  @DisplayName("Test nopClosure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.nopClosure()"})
  void testNopClosure() {
    // Arrange and Act
    Closure<Object> actualNopClosureResult = ClosureUtils.nopClosure();
    actualNopClosureResult.execute("42");

    // Assert
    assertTrue(actualNopClosureResult instanceof NOPClosure);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", equator);
    predicatesAndClosures.put(equalPredicate, mock(Closure.class));
    predicatesAndClosures.put(null, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Predicate<? super Object>[] predicates =
        ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
    assertSame(equalPredicate, predicate);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures2() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    EqualPredicate<Object> equalPredicate = new EqualPredicate<>("Test", null);
    predicatesAndClosures.put(equalPredicate, mock(Closure.class));
    predicatesAndClosures.put(null, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    Predicate<? super Object>[] predicates =
        ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals("Test", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
    assertSame(equalPredicate, predicate);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'; then HashMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_thenHashMapSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, null);
    predicatesAndClosures.put(predicate2, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals(2, predicatesAndClosures.size());
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(2, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(2, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>Then return first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; then return first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_thenReturnFirstElementIsNull() {
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
    Closure<? super Object>[] closures =
        ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures();
    assertNull(closures[0]);
    assertEquals(1, closures.length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; when HashMap() 'null' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_whenHashMapNullIsNull() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(null, null);
    predicatesAndClosures.put(null, mock(Closure.class));

    // Act
    ClosureUtils.switchClosure(predicatesAndClosures);

    // Assert
    assertTrue(predicatesAndClosures.isEmpty());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; when HashMap(); then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_whenHashMap_thenReturnNOPClosure() {
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
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult =
        ClosureUtils.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
    assertSame(
        defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult =
        ClosureUtils.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
    assertSame(
        defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Then array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; then array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenArrayLengthIsZero() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};
    Closure<? super Object>[] closures = new Closure[] {};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).execute(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult =
        ClosureUtils.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert that nothing has changed
    verify(defaultClosure).execute(isA(Object.class));
    assertEquals(0, closures.length);
    assertEquals(0, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; when Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_whenClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult =
        ClosureUtils.switchClosure(predicates, closures, defaultClosure);

    // Assert
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
    assertSame(
        defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code
   * closures}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[]) with 'predicates', 'closures'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  void testSwitchClosureWithPredicatesClosures_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicates, closures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code
   * closures}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[]) with 'predicates', 'closures'; given 'true'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  void testSwitchClosureWithPredicatesClosures_givenTrue_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicates, closures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code
   * closures}.
   *
   * <ul>
   *   <li>Then DefaultClosure return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[]) with 'predicates', 'closures'; then DefaultClosure return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  void testSwitchClosureWithPredicatesClosures_thenDefaultClosureReturnNOPClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicates, closures);

    // Assert
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchClosure(Predicate[], Closure[])} with {@code predicates}, {@code
   * closures}.
   *
   * <ul>
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchClosure(Predicate[], Closure[])}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[]) with 'predicates', 'closures'; then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchClosure(Predicate[], Closure[])"})
  void testSwitchClosureWithPredicatesClosures_thenReturnNOPClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};
    Closure<? super Object>[] closures = new Closure[] {};

    // Act
    Closure<Object> actualSwitchClosureResult = ClosureUtils.switchClosure(predicates, closures);
    actualSwitchClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchClosureResult instanceof NOPClosure);
    assertEquals(0, closures.length);
    assertEquals(0, predicates.length);
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   *
   * <ul>
   *   <li>Given {@link Closure}.
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code null}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchMapClosure(Map); given Closure; when HashMap() 'null' is 'null'; then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  void testSwitchMapClosure_givenClosure_whenHashMapNullIsNull_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put(null, null);
    objectsAndClosures.put(null, mock(Closure.class));

    // Act
    ClosureUtils.switchMapClosure(objectsAndClosures);

    // Assert
    assertTrue(objectsAndClosures.isEmpty());
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then DefaultClosure return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @DisplayName("Test switchMapClosure(Map); given one; then DefaultClosure return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  void testSwitchMapClosure_givenOne_thenDefaultClosureReturnNOPClosure() {
    // Arrange
    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put(null, null);
    objectsAndClosures.put(1, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchMapClosureResult =
        ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    assertEquals(1, objectsAndClosures.size());
    Predicate<? super Object>[] predicates =
        ((SwitchClosure<Object>) actualSwitchMapClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchMapClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchMapClosureResult instanceof SwitchClosure);
    assertEquals(1, ((Integer) ((EqualPredicate<? super Object>) predicate).getValue()).intValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchMapClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
    assertTrue(objectsAndClosures.containsKey(1));
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return first element Value intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchMapClosure(Map); given one; then return first element Value intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  void testSwitchMapClosure_givenOne_thenReturnFirstElementValueIntValueIsOne() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put(null, closure);
    objectsAndClosures.put(1, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchMapClosureResult =
        ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals(1, objectsAndClosures.size());
    Predicate<? super Object>[] predicates =
        ((SwitchClosure<Object>) actualSwitchMapClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchMapClosureResult instanceof SwitchClosure);
    assertEquals(1, ((Integer) ((EqualPredicate<? super Object>) predicate).getValue()).intValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchMapClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
    assertTrue(objectsAndClosures.containsKey(1));
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@link Closure}.
   *   <li>Then DefaultClosure return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchMapClosure(Map); when HashMap() '42' is Closure; then DefaultClosure return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  void testSwitchMapClosure_whenHashMap42IsClosure_thenDefaultClosureReturnNOPClosure() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put(null, null);
    objectsAndClosures.put("42", closure);

    // Act
    Closure<Object> actualSwitchMapClosureResult =
        ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals(1, objectsAndClosures.size());
    Predicate<? super Object>[] predicates =
        ((SwitchClosure<Object>) actualSwitchMapClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchMapClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchMapClosureResult instanceof SwitchClosure);
    assertEquals("42", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchMapClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
    assertTrue(objectsAndClosures.containsKey("42"));
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@link Closure}.
   *   <li>Then return first element Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchMapClosure(Map); when HashMap() '42' is Closure; then return first element Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  void testSwitchMapClosure_whenHashMap42IsClosure_thenReturnFirstElementValueIs42() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();
    objectsAndClosures.put(null, mock(Closure.class));
    objectsAndClosures.put("42", closure);

    // Act
    Closure<Object> actualSwitchMapClosureResult =
        ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals(1, objectsAndClosures.size());
    Predicate<? super Object>[] predicates =
        ((SwitchClosure<Object>) actualSwitchMapClosureResult).getPredicates();
    Predicate<? super Object> predicate = predicates[0];
    assertTrue(predicate instanceof EqualPredicate);
    assertTrue(actualSwitchMapClosureResult instanceof SwitchClosure);
    assertEquals("42", ((EqualPredicate<? super Object>) predicate).getValue());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchMapClosureResult).getClosures().length);
    assertEquals(1, predicates.length);
    assertTrue(objectsAndClosures.containsKey("42"));
  }

  /**
   * Test {@link ClosureUtils#switchMapClosure(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#switchMapClosure(Map)}
   */
  @Test
  @DisplayName("Test switchMapClosure(Map); when HashMap(); then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.switchMapClosure(Map)"})
  void testSwitchMapClosure_whenHashMap_thenReturnNOPClosure() {
    // Arrange
    HashMap<Object, Closure<Object>> objectsAndClosures = new HashMap<>();

    // Act
    Closure<Object> actualSwitchMapClosureResult =
        ClosureUtils.switchMapClosure(objectsAndClosures);
    actualSwitchMapClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchMapClosureResult instanceof NOPClosure);
    assertTrue(objectsAndClosures.isEmpty());
  }

  /**
   * Test {@link ClosureUtils#whileClosure(Predicate, Closure)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Closure}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#whileClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName(
      "Test whileClosure(Predicate, Closure); given 'false'; when Closure; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.whileClosure(Predicate, Closure)"})
  void testWhileClosure_givenFalse_whenClosure_thenCallsTest() {
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

  /**
   * Test {@link ClosureUtils#whileClosure(Predicate, Closure)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link WhileClosure}.
   * </ul>
   *
   * <p>Method under test: {@link ClosureUtils#whileClosure(Predicate, Closure)}
   */
  @Test
  @DisplayName("Test whileClosure(Predicate, Closure); when Predicate; then return WhileClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure ClosureUtils.whileClosure(Predicate, Closure)"})
  void testWhileClosure_whenPredicate_thenReturnWhileClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    Closure<Object> closure = mock(Closure.class);

    // Act
    Closure<Object> actualWhileClosureResult = ClosureUtils.whileClosure(predicate, closure);

    // Assert
    assertTrue(actualWhileClosureResult instanceof WhileClosure);
    assertFalse(((WhileClosure<Object>) actualWhileClosureResult).isDoLoop());
    assertSame(closure, ((WhileClosure<Object>) actualWhileClosureResult).getClosure());
    assertSame(predicate, ((WhileClosure<Object>) actualWhileClosureResult).getPredicate());
  }
}
