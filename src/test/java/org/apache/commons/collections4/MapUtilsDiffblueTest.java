package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.hash.HashingOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MapUtilsDiffblueTest {
  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), null, null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(4));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException2()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, null, new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(1));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException3()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), null, null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(4));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException4()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, null, new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(1));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), "", null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException2() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, "", new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException3() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), "", null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException4() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, "", new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenOne_thenThrowIllegalArgumentException() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), 1, null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(1));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenOne_thenThrowIllegalArgumentException2() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), 1, null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(1));
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenHashMap() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenHashMap2() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenNull() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenNull2() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#fixedSizeMap(Map)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IterableMap MapUtils.fixedSizeMap(Map)"})
  void testFixedSizeMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(map);

    // Assert
    assertEquals(map, actualFixedSizeMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeMap(Map)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IterableMap MapUtils.fixedSizeMap(Map)"})
  void testFixedSizeMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(map);

    // Assert
    assertEquals(map, actualFixedSizeMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeSortedMap(SortedMap)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap MapUtils.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(map);

    // Assert
    assertEquals(map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeSortedMap(SortedMap)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap MapUtils.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap2() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(map);

    // Assert
    assertEquals(map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBoolean(null, true, new ConstantTransformer<>(true)));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBoolean(null, true, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction9() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBoolean(null, true, new ConstantTransformer<>(true)));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction10() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBoolean(null, true, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction11() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction12() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction13() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction14() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_given42_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", mock(Function.class));

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_given42_whenHashMap42Is422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", mock(Function.class));

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code true}.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'true'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenFactoryGetReturnTrue_thenCallsGet() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code true}.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'true'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenFactoryGetReturnTrue_thenCallsGet2() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenFunctionApplyReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenFunctionApplyReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenFunctionApplyReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenFunctionApplyReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange and Act
    Boolean actualBoolean =
        MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenHashMap_thenReturnNull2() {
    // Arrange and Act
    Boolean actualBoolean =
        MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenKey_thenReturnNull2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link PredicateTransformer#PredicateTransformer(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when PredicateTransformer(Predicate) with Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenPredicateTransformerWithPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, new PredicateTransformer<>(predicate));

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link PredicateTransformer#PredicateTransformer(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when PredicateTransformer(Predicate) with Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenPredicateTransformerWithPredicate2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, new PredicateTransformer<>(predicate));

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Transformer apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenTransformerApplyReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Transformer apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenTransformerApplyReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Transformer apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenTransformerApplyReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Transformer apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenTransformerApplyReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_given42_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_given42_whenHashMap42Is42_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenTrue_whenHashMap42IsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenTrue_whenHashMap42IsTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() '42' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenZero_whenHashMap42IsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() '42' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenZero_whenHashMap42IsZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "42", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenFalse_thenReturnFalse() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(new HashMap<>(), "Key", false);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenFalse_thenReturnFalse2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(new HashMap<>(), "Key", false);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenHashMap_thenReturnTrue() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenHashMap_thenReturnTrue2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenNull_thenReturnTrue() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenNull_thenReturnTrue2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_given42_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_given42_whenHashMap42Is42_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenOne_whenHashMap42IsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenOne_whenHashMap42IsOne_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given 'true'; when HashMap() '42' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenTrue_whenHashMap42IsTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given 'true'; when HashMap() '42' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenTrue_whenHashMap42IsTrue_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given zero; when HashMap() '42' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenZero_whenHashMap42IsZero_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given zero; when HashMap() '42' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenZero_whenHashMap42IsZero_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBooleanValue(null, true, new ConstantTransformer<>(true)));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue =
        MapUtils.getBooleanValue(null, true, new PredicateTransformer<>(predicate));

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction10() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBooleanValue(null, true, new ConstantTransformer<>(true)));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction11() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction12() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction13() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction14() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue =
        MapUtils.getBooleanValue(null, true, new PredicateTransformer<>(predicate));

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction15() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction16() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_given42_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", mock(Function.class));

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_given42_whenHashMap42Is422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", mock(Function.class));

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(true);
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Boolean> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(true);
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Boolean>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(null, true, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenFactoryGetReturnTrue() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenReturn(true);

    // Act
    boolean actualBooleanValue =
        MapUtils.getBooleanValue(null, true, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenFactoryGetReturnTrue2() {
    // Arrange
    Factory<Boolean> factory = mock(Factory.class);
    when(factory.get()).thenReturn(true);

    // Act
    boolean actualBooleanValue =
        MapUtils.getBooleanValue(null, true, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenHashMap_thenReturnFalse() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenHashMap_thenReturnFalse2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenKey_thenReturnFalse() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenKey_thenReturnFalse2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Boolean> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(true);

    IfTransformer<Object, Boolean> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Boolean> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(true);
    Transformer<? super Object, ? extends Boolean>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Boolean> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, true, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenTrue_whenHashMap42IsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenTrue_whenHashMap42IsTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() '42' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenZero_whenHashMap42IsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() '42' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenZero_whenHashMap42IsZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenFalse_thenReturnFalse() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", false);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenFalse_thenReturnFalse2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", false);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "42", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap_thenReturnTrue() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap_thenReturnTrue2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenNull_thenReturnTrue() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenNull_thenReturnTrue2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_given42_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_given42_whenHashMap42Is42_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenOne_whenHashMap42IsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenOne_whenHashMap42IsOne_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given 'true'; when HashMap() '42' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenTrue_whenHashMap42IsTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given 'true'; when HashMap() '42' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenTrue_whenHashMap42IsTrue_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given zero; when HashMap() '42' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenZero_whenHashMap42IsZero_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given zero; when HashMap() '42' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenZero_whenHashMap42IsZero_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenHashMap_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenHashMap_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(
        'A', MapUtils.getByte(null, (byte) 'A', new ConstantTransformer<>((byte) 'A')).byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction6() {
    // Arrange, Act and Assert
    assertEquals(
        'A', MapUtils.getByte(null, (byte) 'A', new ConstantTransformer<>((byte) 'A')).byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_given42_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", mock(Function.class));

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_given42_thenReturnByteValueIsAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", mock(Function.class));

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link Factory} {@link Factory#get()} return {@code A}.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; when Factory get() return 'A'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenA_whenFactoryGetReturnA_thenCallsGet() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link Factory} {@link Factory#get()} return {@code A}.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; when Factory get() return 'A'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenA_whenFactoryGetReturnA_thenCallsGet2() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenFactoryGetThrowIllegalArgumentException() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenFactoryGetThrowIllegalArgumentException2() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code A}.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'A'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenFunctionApplyReturnA_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code A}.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'A'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenFunctionApplyReturnA_thenCallsApply2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenHashMap_thenReturnNull2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenKey_thenReturnNull2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() '42' is 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenA_whenHashMap42IsA_thenReturnByteValueIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() '42' is 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenA_whenHashMap42IsA_thenReturnByteValueIsA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", (byte) 'A');

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_thenReturnByteValueIsAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", (byte) 'A');

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenHashMap_thenReturnByteValueIsA() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenHashMap_thenReturnByteValueIsA2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when 'null'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenNull_thenReturnByteValueIsA() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when 'null'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenNull_thenReturnByteValueIsA2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_given42_whenHashMap42Is42_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42");

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_given42_whenHashMap42Is42_thenReturnByteValueIsAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "42");

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenA_whenHashMap42IsA_thenReturnByteValueIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "42");

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenA_whenHashMap42IsA_thenReturnByteValueIsA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "42");

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByteValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(
        'A', MapUtils.getByteValue(null, (byte) 'A', new ConstantTransformer<>((byte) 'A')));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByteValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(
        'A', MapUtils.getByteValue(null, (byte) 'A', new ConstantTransformer<>((byte) 'A')));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_given42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", mock(Function.class));

    // Assert
    assertEquals('*', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_given42_thenReturnAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", mock(Function.class));

    // Assert
    assertEquals('*', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Byte> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Byte> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Byte>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Byte> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code A}.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'A'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenFactoryGetReturnA_thenCallsGet() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenReturn((byte) 'A');

    // Act
    byte actualByteValue =
        MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code A}.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'A'; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenFactoryGetReturnA_thenCallsGet2() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenReturn((byte) 'A');

    // Act
    byte actualByteValue =
        MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenFunctionApplyReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenFunctionApplyReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenKey_thenReturnZero2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenA_whenHashMap42IsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenA_whenHashMap42IsA_thenReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo_thenReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", (byte) 'A');

    // Assert
    assertEquals('*', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", (byte) 'A');

    // Assert
    assertEquals('*', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap_thenReturnA() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap_thenReturnA2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when 'null'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenNull_thenReturnA() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when 'null'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenNull_thenReturnA2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_given42_whenHashMap42Is42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_given42_whenHashMap42Is42_thenReturnAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenA_whenHashMap42IsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenA_whenHashMap42IsA_thenReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, MapUtils.getDouble(null, 10.0d, new ConstantTransformer<>(10.0d)).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDouble(null, 10.0d, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, MapUtils.getDouble(null, 10.0d, new ConstantTransformer<>(10.0d)).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDouble(null, 10.0d, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_given42_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_given42_thenReturnDoubleValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet2() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(null, 10.0d, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenFunctionApplyReturnTen_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenFunctionApplyReturnTen_thenCallsApply2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange and Act
    Double actualDouble =
        MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenHashMap_thenReturnNull2() {
    // Arrange and Act
    Double actualDouble =
        MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenKey_thenReturnNull2() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenA_thenReturnDoubleValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_thenReturnDoubleValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", 10.0d);

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when HashMap(); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenHashMap_thenReturnDoubleValueIsTen() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when HashMap(); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenHashMap_thenReturnDoubleValueIsTen2() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when 'null'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenNull_thenReturnDoubleValueIsTen() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when 'null'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenNull_thenReturnDoubleValueIsTen2() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenA_whenHashMap42IsA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42");

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenA_whenHashMap42IsA_thenReturnDoubleValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42");

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenTen_whenHashMap42IsTen_thenReturnDoubleValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42");

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenTen_whenHashMap42IsTen_thenReturnDoubleValueIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42");

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; when HashMap() '42' is '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap42Is42_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42");

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; when HashMap() '42' is '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap42Is42_thenReturnDoubleValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42");

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDoubleValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(null, 10.0d, new ConstantTransformer<>(10.0d)));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDoubleValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(null, 10.0d, new ConstantTransformer<>(10.0d)));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Double> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0d);

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Double> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Double> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0d);
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, 10.0d, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Double> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Double>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Double> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getDoubleValue(null, 10.0d, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0d);

    // Act
    double actualDoubleValue =
        MapUtils.getDoubleValue(null, 10.0d, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet2() {
    // Arrange
    Factory<Double> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0d);

    // Act
    double actualDoubleValue =
        MapUtils.getDoubleValue(null, 10.0d, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenKey_thenReturnZero2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(65.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(65.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(42.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", 10.0d);

    // Assert
    assertEquals(42.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenNull_thenReturnTen() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenNull_thenReturnTen2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenTen_whenHashMap42IsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenTen_whenHashMap42IsTen_thenReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(
        10.0f, MapUtils.getFloat(null, 10.0f, new ConstantTransformer<>(10.0f)).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getFloat(null, 10.0f, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(
        10.0f, MapUtils.getFloat(null, 10.0f, new ConstantTransformer<>(10.0f)).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getFloat(null, 10.0f, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_given42_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_given42_thenReturnFloatValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet2() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(null, 10.0f, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenFunctionApplyReturnTen_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenFunctionApplyReturnTen_thenCallsApply2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenHashMap_thenReturnNull2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenKey_thenReturnNull2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenA_thenReturnFloatValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_thenReturnFloatValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when HashMap(); then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenHashMap_thenReturnFloatValueIsTen() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when HashMap(); then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenHashMap_thenReturnFloatValueIsTen2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when 'null'; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenNull_thenReturnFloatValueIsTen() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when 'null'; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenNull_thenReturnFloatValueIsTen2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_given42_whenHashMap42Is42_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42");

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_given42_whenHashMap42Is42_thenReturnFloatValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42");

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenA_whenHashMap42IsA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42");

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenA_whenHashMap42IsA_thenReturnFloatValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42");

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenTen_whenHashMap42IsTen_thenReturnFloatValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42");

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenTen_whenHashMap42IsTen_thenReturnFloatValueIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42");

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(null, 10.0f, new ConstantTransformer<>(10.0f)));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getFloatValue(null, 10.0f, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(null, 10.0f, new ConstantTransformer<>(10.0f)));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getFloatValue(null, 10.0f, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Float> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(10.0f);

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Float> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Float> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(10.0f);
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Float> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Float>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Float> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(null, 10.0f, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return ten.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return ten; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenFactoryGetReturnTen_thenCallsGet2() {
    // Arrange
    Factory<Float> factory = mock(Factory.class);
    when(factory.get()).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(null, 10.0f, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenKey_thenReturnZero2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenNull_thenReturnTen() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenNull_thenReturnTen2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenTen_whenHashMap42IsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenTen_whenHashMap42IsTen_thenReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(1, MapUtils.getInteger(null, 1, new ConstantTransformer<>(1)).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getInteger(null, 1, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(1, MapUtils.getInteger(null, 1, new ConstantTransformer<>(1)).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getInteger(null, 1, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_given42_thenReturnIntValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", mock(Function.class));

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_given42_thenReturnIntValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", mock(Function.class));

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet2() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(null, 1, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenFunctionApplyReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenFunctionApplyReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange and Act
    Integer actualInteger =
        MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenHashMap_thenReturnNull2() {
    // Arrange and Act
    Integer actualInteger =
        MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenKey_thenReturnNull2() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenA_thenReturnIntValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenOne_thenReturnIntValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap42Is422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap(); then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap_thenReturnIntValueIsFortyTwo() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap(); then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap_thenReturnIntValueIsFortyTwo2() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when 'null'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenNull_thenReturnIntValueIsFortyTwo() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when 'null'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenNull_thenReturnIntValueIsFortyTwo2() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_given42_whenHashMap42Is42_thenReturnIntValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42");

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_given42_whenHashMap42Is42_thenReturnIntValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42");

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenA_whenHashMap42IsA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42");

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenA_whenHashMap42IsA_thenReturnIntValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42");

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenOne_whenHashMap42IsOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42");

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenOne_whenHashMap42IsOne_thenReturnIntValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42");

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(1, MapUtils.getIntValue(null, 1, new ConstantTransformer<>(1)));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getIntValue(null, 1, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(1, MapUtils.getIntValue(null, 1, new ConstantTransformer<>(1)));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getIntValue(null, 1, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Integer> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Integer> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Integer> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1);
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Integer> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Integer>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Integer> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(null, 1, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet2() {
    // Arrange
    Factory<Integer> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(null, 1, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenFunctionApplyReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenFunctionApplyReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenKey_thenReturnZero2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(65, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(65, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenOne_whenHashMap42IsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenOne_whenHashMap42IsOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLong(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(1L, MapUtils.getLong(null, 1L, new ConstantTransformer<>(1L)).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLong(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction6() {
    // Arrange, Act and Assert
    assertEquals(1L, MapUtils.getLong(null, 1L, new ConstantTransformer<>(1L)).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_given42_thenReturnLongValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "42", mock(Function.class));

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_given42_thenReturnLongValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "42", mock(Function.class));

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet2() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFactoryGetThrowIllegalArgumentException() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getLong(null, 1L, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFactoryGetThrowIllegalArgumentException2() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getLong(null, 1L, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFunctionApplyReturnOne_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFunctionApplyReturnOne_thenCallsApply2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenHashMap_thenReturnNull2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenKey_thenReturnNull2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_given42_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_given42_whenHashMap42Is422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "42", 42L);

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenA_thenReturnLongValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "42", 42L);

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Long actualLong = MapUtils.getLong(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    Long actualLong = MapUtils.getLong(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when HashMap(); then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenHashMap_thenReturnLongValueIsFortyTwo() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when HashMap(); then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenHashMap_thenReturnLongValueIsFortyTwo2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when 'null'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenNull_thenReturnLongValueIsFortyTwo() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when 'null'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenNull_thenReturnLongValueIsFortyTwo2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_given42_whenHashMap42Is42_thenReturnLongValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "42");

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_given42_whenHashMap42Is42_thenReturnLongValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "42");

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenA_whenHashMap42IsA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "42");

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenA_whenHashMap42IsA_thenReturnLongValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "42");

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L, new ConstantTransformer<>(1L)));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction7() {
    // Arrange, Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L, new ConstantTransformer<>(1L)));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction8() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction9() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction10() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_given42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", mock(Function.class));

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> defaultTransformer = mock(Transformer.class);
    when(defaultTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers =
        new Transformer[] {mock(Transformer.class)};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, defaultTransformer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(defaultTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue5() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue6() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    IfTransformer<Object, Long> defaultFunction =
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue7() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(1L);
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, defaultFunction);

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue8() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<? super Object>[] predicates = new Predicate[] {predicate};

    Transformer<Object, Long> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    Transformer<? super Object, ? extends Long>[] transformers = new Transformer[] {transformer};

    SwitchTransformer<Object, Long> defaultFunction =
        new SwitchTransformer<>(predicates, transformers, mock(Transformer.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L, defaultFunction));
    verify(predicate).test(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.
   *   <li>Then calls {@link Factory#get()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet2() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenFunctionApplyReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenFunctionApplyReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenKey_thenReturnZero2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_given42_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_given42_whenHashMap42Is422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", 42L);

    // Assert
    assertEquals(65L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", 42L);

    // Assert
    assertEquals(65L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenHashMap() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenHashMap2() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenNull() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenNull2() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }
}
