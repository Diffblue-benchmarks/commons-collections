package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SwitchClosureDiffblueTest {
  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("42"));

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, null);
    predicatesAndClosures.put(mock(Predicate.class), mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'; then HashMap() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_thenHashMapSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, mock(Closure.class));
    predicatesAndClosures.put(null, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, predicatesAndClosures.size());
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'; then HashMap() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_thenHashMapSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, mock(Closure.class));
    predicatesAndClosures.put(predicate2, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals(2, predicatesAndClosures.size());
    assertTrue(((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure() instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(2, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(2, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, null);
    predicatesAndClosures.put(null, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'; when HashMap() 'null' is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_whenHashMapNullIsNull() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(null, null);
    predicatesAndClosures.put(null, mock(Closure.class));

    // Act
    SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertTrue(predicatesAndClosures.isEmpty());
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'; when HashMap(); then return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_whenHashMap_thenReturnNOPClosure() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    assertTrue(actualSwitchClosureResult instanceof NOPClosure);
    assertTrue(predicatesAndClosures.isEmpty());
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new Predicate[]{predicate},
        new Closure[]{closure}, mock(Closure.class));

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> defaultClosure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(new Predicate[]{predicate},
        new Closure[]{mock(Closure.class)}, defaultClosure);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};
    Closure<? super Object>[] closures = new Closure[]{mock(Closure.class)};
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[]{predicate};
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[]{closure};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Then array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; then array length is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenArrayLengthIsZero() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{};
    Closure<? super Object>[] closures = new Closure[]{};
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).execute(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert that nothing has changed
    verify(defaultClosure).execute(isA(Object.class));
    assertEquals(0, closures.length);
    assertEquals(0, predicates.length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code predicates}, {@code closures}, {@code defaultClosure}.
   * <ul>
   *   <li>Then return {@link SwitchClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; then return SwitchClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenReturnSwitchClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[]{mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[]{mock(Closure.class)};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicates, closures, defaultClosure);

    // Assert
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
    assertEquals(1, closures.length);
    assertEquals(1, predicates.length);
    assertSame(defaultClosure, ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   * <ul>
   *   <li>Then return array length is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test new SwitchClosure(Predicate[], Closure[], Closure); then return array length is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  void testNewSwitchClosure_thenReturnArrayLengthIsOne() {
    // Arrange
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    SwitchClosure<Object> actualSwitchClosure = new SwitchClosure<>(new Predicate[]{mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, defaultClosure);

    // Assert
    assertEquals(1, actualSwitchClosure.getClosures().length);
    assertEquals(1, actualSwitchClosure.getPredicates().length);
    assertSame(defaultClosure, actualSwitchClosure.getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then DefaultClosure return {@link NOPClosure}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName("Test new SwitchClosure(Predicate[], Closure[], Closure); when 'null'; then DefaultClosure return NOPClosure")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  void testNewSwitchClosure_whenNull_thenDefaultClosureReturnNOPClosure() {
    // Arrange and Act
    SwitchClosure<Object> actualSwitchClosure = new SwitchClosure<>(null, null, null);

    // Assert
    assertTrue(actualSwitchClosure.getDefaultClosure() instanceof NOPClosure);
    assertNull(actualSwitchClosure.getClosures());
    assertNull(actualSwitchClosure.getPredicates());
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Closure} {@link Closure#accept(Object)} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Closure accept(Object) throw IllegalArgumentException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenClosureAcceptThrowIllegalArgumentExceptionWithFoo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException("foo")).when(closure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        mock(Closure.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnFalse_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate},
        new Closure[]{mock(Closure.class)}, defaultClosure);

    // Act
    switchClosure.execute("Input");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Predicate test(Object) return 'true'; then calls accept(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnTrue_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate}, new Closure[]{closure},
        mock(Closure.class));

    // Act
    switchClosure.execute("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName("Test execute(Object); given Predicate test(Object) throw IllegalArgumentException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenPredicateTestThrowIllegalArgumentExceptionWithFoo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{predicate, mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, mock(Closure.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#getClosures()}.
   * <p>
   * Method under test: {@link SwitchClosure#getClosures()}
   */
  @Test
  @DisplayName("Test getClosures()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Closure[] SwitchClosure.getClosures()"})
  void testGetClosures() {
    // Arrange
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, mock(Closure.class));

    // Act and Assert
    assertEquals(1, switchClosure.getClosures().length);
  }

  /**
   * Test {@link SwitchClosure#getPredicates()}.
   * <p>
   * Method under test: {@link SwitchClosure#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate[] SwitchClosure.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(new Predicate[]{mock(Predicate.class)},
        new Closure[]{mock(Closure.class)}, mock(Closure.class));

    // Act and Assert
    assertEquals(1, switchClosure.getPredicates().length);
  }
}
