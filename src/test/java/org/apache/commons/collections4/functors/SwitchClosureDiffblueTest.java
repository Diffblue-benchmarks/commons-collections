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
import com.diffblue.cover.annotations.ManagedByDiffblue;
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
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName("Test switchClosure(Map) with 'predicatesAndClosures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();

    predicatesAndClosures.put(predicate, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>Given {@link Closure} {@link Closure#accept(Object)} does nothing.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; given Closure accept(Object) does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_givenClosureAcceptDoesNothing() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();

    predicatesAndClosures.put(predicate, closure);

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; given 'null'; when HashMap() 'null' is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_givenNull_whenHashMapNullIsClosure() {
    // Arrange
    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(null, mock(Closure.class));

    // Act
    SwitchClosure.switchClosure(predicatesAndClosures);

    // Assert
    assertTrue(predicatesAndClosures.isEmpty());
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; given Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Map)"})
  void testSwitchClosureWithPredicatesAndClosures_givenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    HashMap<Predicate<Object>, Closure<Object>> predicatesAndClosures = new HashMap<>();
    predicatesAndClosures.put(predicate, mock(Closure.class));

    // Act
    Closure<Object> actualSwitchClosureResult = SwitchClosure.switchClosure(predicatesAndClosures);
    actualSwitchClosureResult.execute("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, predicatesAndClosures.size());
    assertTrue(
        ((SwitchClosure<Object>) actualSwitchClosureResult).getDefaultClosure()
            instanceof NOPClosure);
    assertTrue(actualSwitchClosureResult instanceof SwitchClosure);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getClosures().length);
    assertEquals(1, ((SwitchClosure<Object>) actualSwitchClosureResult).getPredicates().length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Map)} with {@code predicatesAndClosures}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Map)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Map) with 'predicatesAndClosures'; when HashMap(); then return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act
    Closure<Object> actualSwitchClosureResult =
        SwitchClosure.switchClosure(
            new Predicate[] {predicate}, new Closure[] {mock(Closure.class)}, mock(Closure.class));

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
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
        SwitchClosure.switchClosure(predicates, closures, defaultClosure);
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
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Closure<Object> defaultClosure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(defaultClosure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult =
        SwitchClosure.switchClosure(
            new Predicate[] {predicate}, new Closure[] {mock(Closure.class)}, defaultClosure);

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
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
        SwitchClosure.switchClosure(predicates, closures, defaultClosure);
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
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_givenTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(closure).accept(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult =
        SwitchClosure.switchClosure(
            new Predicate[] {predicate}, new Closure[] {closure}, mock(Closure.class));

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualSwitchClosureResult.execute("42"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Then array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; then array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenArrayLengthIsZero() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {};
    Closure<? super Object>[] closures = new Closure[] {};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).execute(Mockito.<Object>any());

    // Act
    Closure<Object> actualSwitchClosureResult =
        SwitchClosure.switchClosure(predicates, closures, defaultClosure);
    actualSwitchClosureResult.execute("42");

    // Assert that nothing has changed
    verify(defaultClosure).execute(isA(Object.class));
    assertEquals(0, closures.length);
    assertEquals(0, predicates.length);
  }

  /**
   * Test {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)} with {@code
   * predicates}, {@code closures}, {@code defaultClosure}.
   *
   * <ul>
   *   <li>Then return {@link SwitchClosure}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#switchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test switchClosure(Predicate[], Closure[], Closure) with 'predicates', 'closures', 'defaultClosure'; then return SwitchClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure SwitchClosure.switchClosure(Predicate[], Closure[], Closure)"})
  void testSwitchClosureWithPredicatesClosuresDefaultClosure_thenReturnSwitchClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    Closure<Object> actualSwitchClosureResult =
        SwitchClosure.switchClosure(predicates, closures, defaultClosure);

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
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   *
   * <ul>
   *   <li>Then DefaultClosure return {@link NOPClosure}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test new SwitchClosure(Predicate[], Closure[], Closure); then DefaultClosure return NOPClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  void testNewSwitchClosure_thenDefaultClosureReturnNOPClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    // Act
    SwitchClosure<Object> actualSwitchClosure = new SwitchClosure<>(predicates, closures, null);

    // Assert
    assertTrue(actualSwitchClosure.getDefaultClosure() instanceof NOPClosure);
    assertEquals(1, actualSwitchClosure.getClosures().length);
    assertEquals(1, actualSwitchClosure.getPredicates().length);
  }

  /**
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   *
   * <ul>
   *   <li>Then return DefaultClosure is {@link Closure}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test new SwitchClosure(Predicate[], Closure[], Closure); then return DefaultClosure is Closure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  void testNewSwitchClosure_thenReturnDefaultClosureIsClosure() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    SwitchClosure<Object> actualSwitchClosure =
        new SwitchClosure<>(predicates, closures, defaultClosure);

    // Assert
    assertEquals(1, actualSwitchClosure.getClosures().length);
    assertEquals(1, actualSwitchClosure.getPredicates().length);
    assertSame(defaultClosure, actualSwitchClosure.getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Closures is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#SwitchClosure(Predicate[], Closure[], Closure)}
   */
  @Test
  @DisplayName(
      "Test new SwitchClosure(Predicate[], Closure[], Closure); when 'null'; then return Closures is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.<init>(Predicate[], Closure[], Closure)"})
  void testNewSwitchClosure_whenNull_thenReturnClosuresIsNull() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<Object> defaultClosure = mock(Closure.class);

    // Act
    SwitchClosure<Object> actualSwitchClosure =
        new SwitchClosure<>(predicates, null, defaultClosure);

    // Assert
    assertNull(actualSwitchClosure.getClosures());
    assertEquals(1, actualSwitchClosure.getPredicates().length);
    assertSame(defaultClosure, actualSwitchClosure.getDefaultClosure());
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link Closure} {@link Closure#accept(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given Closure accept(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenClosureAcceptThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> closure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    SwitchClosure<Object> switchClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link Closure} {@link Closure#accept(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given Closure accept(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenClosureAcceptThrowIllegalArgumentException2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> defaultClosure = mock(Closure.class);
    doThrow(new IllegalArgumentException()).when(defaultClosure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<Object> switchClosure = new SwitchClosure<>(predicates, closures, defaultClosure);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given Predicate test(Object) return 'false'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnFalse_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> defaultClosure = mock(Closure.class);
    doNothing().when(defaultClosure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<Object> switchClosure = new SwitchClosure<>(predicates, closures, defaultClosure);

    // Act
    switchClosure.execute("Input");

    // Assert
    verify(defaultClosure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given Predicate test(Object) return 'true'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenPredicateTestReturnTrue_thenCallsAccept() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    Closure<? super Object>[] closures = new Closure[] {closure};

    SwitchClosure<Object> switchClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act
    switchClosure.execute("Input");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#execute(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link SwitchClosure#execute(Object)}
   */
  @Test
  @DisplayName(
      "Test execute(Object); given Predicate test(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SwitchClosure.execute(Object)"})
  void testExecute_givenPredicateTestThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<Object> switchClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> switchClosure.execute("Input"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link SwitchClosure#getClosures()}.
   *
   * <p>Method under test: {@link SwitchClosure#getClosures()}
   */
  @Test
  @DisplayName("Test getClosures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure[] SwitchClosure.getClosures()"})
  void testGetClosures() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<Object> switchClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act and Assert
    assertEquals(1, switchClosure.getClosures().length);
  }

  /**
   * Test {@link SwitchClosure#getPredicates()}.
   *
   * <p>Method under test: {@link SwitchClosure#getPredicates()}
   */
  @Test
  @DisplayName("Test getPredicates()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate[] SwitchClosure.getPredicates()"})
  void testGetPredicates() {
    // Arrange
    Predicate<? super Object>[] predicates = new Predicate[] {mock(Predicate.class)};
    Closure<? super Object>[] closures = new Closure[] {mock(Closure.class)};

    SwitchClosure<Object> switchClosure =
        new SwitchClosure<>(predicates, closures, mock(Closure.class));

    // Act and Assert
    assertEquals(1, switchClosure.getPredicates().length);
  }
}
