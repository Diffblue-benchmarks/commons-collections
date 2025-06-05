package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.IfClosure;
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
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); given 'Apply'; when Transformer apply(Object) return 'Apply'; then return Transformer")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); given 'Apply'; when Transformer apply(Object) return 'Apply'; then return Transformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_givenApply_whenTransformerApplyReturnApply_thenReturnTransformer2() {
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
  @DisplayName("Test asClosure(Transformer); when 'null'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); when 'null'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_whenNull_thenReturnNOPClosure2() {
    // Arrange and Act
    Closure<Object> actualAsClosureResult = ClosureUtils.asClosure(null);
    actualAsClosureResult.execute("42");

    // Assert
    assertTrue(actualAsClosureResult instanceof NOPClosure);
    assertNull(null);
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
  @DisplayName("Test asClosure(Transformer); when 'null'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_whenNull_thenReturnNOPClosure3() {
    // Arrange and Act
    Closure<Object> actualAsClosureResult = ClosureUtils.asClosure(null);

    // Assert
    assertTrue(actualAsClosureResult instanceof NOPClosure);
    assertNull(null);
  }

  /**
   * Test {@link ClosureUtils#asClosure(Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); when Transformer; then return Transformer")
  @Tag("MaintainedByDiffblue")
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
   * Test {@link ClosureUtils#asClosure(Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#asClosure(Transformer)}
   */
  @Test
  @DisplayName("Test asClosure(Transformer); when Transformer; then return Transformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.asClosure(Transformer)"})
  void testAsClosure_whenTransformer_thenReturnTransformer2() {
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
   * <ul>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_thenReturnNOPClosure() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[]{};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
    assertEquals(0, closures.length);
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
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_thenReturnNOPClosure2() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[]{};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);
    actualChainedClosureResult.execute("42");

    // Assert
    assertTrue(actualChainedClosureResult instanceof NOPClosure);
    assertEquals(0, closures.length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosureAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[]{closure};

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
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosureAcceptDoesNothing_thenCallsAccept2() {
    // Arrange
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[]{closure};

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
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; when Closure; then return ChainedClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosure_thenReturnChainedClosure() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[]{mock(Closure.class)};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);

    // Assert
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
    assertEquals(1, closures.length);
  }

  /**
   * Test {@link ClosureUtils#chainedClosure(Closure[])} with {@code Closure[]}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Closure[])}
   */
  @Test
  @DisplayName("Test chainedClosure(Closure[]) with 'Closure[]'; when Closure; then return ChainedClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Closure[])"})
  void testChainedClosureWithClosure_whenClosure_thenReturnChainedClosure2() {
    // Arrange
    Closure<? super Object>[] closures = new Closure[]{mock(Closure.class)};

    // Act
    Closure<Object> actualChainedClosureResult = ClosureUtils.chainedClosure(closures);

    // Assert
    assertTrue(actualChainedClosureResult instanceof ChainedClosure);
    assertEquals(1, ((ChainedClosure<Object>) actualChainedClosureResult).getClosures().length);
    assertEquals(1, closures.length);
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
  @DisplayName("Test chainedClosure(Collection) with 'Collection'; when ArrayList(); then return NOPClosure")
  @Tag("MaintainedByDiffblue")
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
   * Test {@link ClosureUtils#chainedClosure(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#chainedClosure(Collection)}
   */
  @Test
  @DisplayName("Test chainedClosure(Collection) with 'Collection'; when ArrayList(); then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.chainedClosure(Collection)"})
  void testChainedClosureWithCollection_whenArrayList_thenReturnNOPClosure2() {
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
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @DisplayName("Test doWhileClosure(Closure, Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @DisplayName("Test doWhileClosure(Closure, Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.doWhileClosure(Closure, Predicate)"})
  void testDoWhileClosure_givenFalse_whenPredicateTestReturnFalse_thenCallsAccept2() {
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
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @DisplayName("Test doWhileClosure(Closure, Predicate); when Closure; then return WhileClosure")
  @Tag("MaintainedByDiffblue")
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
   * Test {@link ClosureUtils#doWhileClosure(Closure, Predicate)}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#doWhileClosure(Closure, Predicate)}
   */
  @Test
  @DisplayName("Test doWhileClosure(Closure, Predicate); when Closure; then return WhileClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.doWhileClosure(Closure, Predicate)"})
  void testDoWhileClosure_whenClosure_thenReturnWhileClosure2() {
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
   * <ul>
   *   <li>Then return {@link ExceptionClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#exceptionClosure()}
   */
  @Test
  @DisplayName("Test exceptionClosure(); then return ExceptionClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.exceptionClosure()"})
  void testExceptionClosure_thenReturnExceptionClosure() {
    // Arrange and Act
    Closure<Object> actualExceptionClosureResult = ClosureUtils.exceptionClosure();

    // Assert
    assertTrue(actualExceptionClosureResult instanceof ExceptionClosure);
  }

  /**
   * Test {@link ClosureUtils#exceptionClosure()}.
   * <ul>
   *   <li>Then return {@link ExceptionClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#exceptionClosure()}
   */
  @Test
  @DisplayName("Test exceptionClosure(); then return ExceptionClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.exceptionClosure()"})
  void testExceptionClosure_thenReturnExceptionClosure2() {
    // Arrange and Act
    Closure<Object> actualExceptionClosureResult = ClosureUtils.exceptionClosure();

    // Assert
    assertTrue(actualExceptionClosureResult instanceof ExceptionClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> falseClosure = mock(Closure.class);
    doNothing().when(falseClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1,
        new IfClosure<>(predicate, mock(Closure.class), falseClosure));
    actualForClosureResult.execute("42");

    // Assert
    verify(falseClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof IfClosure);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure2() {
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
    assertEquals(1, closure2.getClosures().length);
    assertEquals(1, closure2.getPredicates().length);
    assertEquals(3, ((ForClosure<Object>) actualForClosureResult).getCount());
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
  @DisplayName("Test forClosure(int, Closure); given 'Apply'; then Closure return TransformerClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@link TransformerClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); given 'Apply'; then return TransformerClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_givenApply_thenReturnTransformerClosure() {
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
   *   <li>Then Closure return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return ChainedClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then Closure return {@link ForClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return ForClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then Closure return {@link IfClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return IfClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenClosureReturnIfClosure() {
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
   *   <li>Then Closure return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then Closure return WhileClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then FalseClosure return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then FalseClosure return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenFalseClosureReturnNOPClosure() {
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
   *   <li>Then FalseClosure return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then FalseClosure return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenFalseClosureReturnNOPClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1,
        new IfClosure<>(predicate, mock(Closure.class)));
    actualForClosureResult.execute("42");

    // Assert
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
  @DisplayName("Test forClosure(int, Closure); then return SwitchClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenReturnSwitchClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> closure2 = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        mock(Closure.class));

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
   * <ul>
   *   <li>Then return {@link SwitchClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then return SwitchClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenReturnSwitchClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    SwitchClosure<? super Object> closure = new SwitchClosure<>(new Predicate[]{predicate},
        new Closure[]{mock(Closure.class)}, defaultClosure);

    // Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(1, closure);
    actualForClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForClosureResult instanceof SwitchClosure);
    assertEquals(1, closure.getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualForClosureResult).getClosures().length);
    assertEquals(1, closure.getPredicates().length);
    assertEquals(1, ((SwitchClosure<Object>) actualForClosureResult).getPredicates().length);
  }

  /**
   * Test {@link ClosureUtils#forClosure(int, Closure)}.
   * <ul>
   *   <li>Then return {@link WhileClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); then return WhileClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_thenReturnWhileClosure() {
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
   * <ul>
   *   <li>When {@link ChainedClosure#ChainedClosure(Closure[])} with closures is {@link Closure}.</li>
   *   <li>Then return {@link ChainedClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when ChainedClosure(Closure[]) with closures is Closure; then return ChainedClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when Closure; then return Closure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when 'null'; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return {@link Closure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when three; then return Closure")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClosureUtils#forClosure(int, Closure)}
   */
  @Test
  @DisplayName("Test forClosure(int, Closure); when zero; then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure ClosureUtils.forClosure(int, Closure)"})
  void testForClosure_whenZero_thenReturnNOPClosure() {
    // Arrange and Act
    Closure<Object> actualForClosureResult = ClosureUtils.forClosure(0, null);
    actualForClosureResult.execute("42");

    // Assert
    assertTrue(actualForClosureResult instanceof NOPClosure);
    assertNull(null);
  }
}
