package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.FluentIterable;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedMultiValuedMapDiffblueTest {
  /**
   * Test {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer,
   * Transformer)}.
   *
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap,
   * Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(MultiValuedMap, Transformer, Transformer); then ArrayListValuedHashMap() Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedMultiValuedMap TransformedMultiValuedMap.transformedMap(MultiValuedMap, Transformer, Transformer)"
  })
  void testTransformedMap_thenArrayListValuedHashMapMapSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult =
        TransformedMultiValuedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    Map<Object, List<Object>> map2 = map.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("Apply");
    assertEquals(1, getResult.size());
    assertEquals("Apply", getResult.get(0));
    assertEquals(1, actualTransformedMapResult.size());
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer,
   * Transformer)}.
   *
   * <ul>
   *   <li>Then {@link HashSetValuedHashMap#HashSetValuedHashMap()} Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap,
   * Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(MultiValuedMap, Transformer, Transformer); then HashSetValuedHashMap() Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedMultiValuedMap TransformedMultiValuedMap.transformedMap(MultiValuedMap, Transformer, Transformer)"
  })
  void testTransformedMap_thenHashSetValuedHashMapMapSizeIsOne() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult =
        TransformedMultiValuedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    Map<Object, Set<Object>> map2 = map.getMap();
    assertEquals(1, map2.size());
    assertEquals(1, map2.get("Apply").size());
    assertEquals(1, actualTransformedMapResult.size());
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer,
   * Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap,
   * Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(MultiValuedMap, Transformer, Transformer); when ArrayListValuedHashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedMultiValuedMap TransformedMultiValuedMap.transformedMap(MultiValuedMap, Transformer, Transformer)"
  })
  void testTransformedMap_whenArrayListValuedHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer,
   * Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap,
   * Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(MultiValuedMap, Transformer, Transformer); when HashSetValuedHashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedMultiValuedMap TransformedMultiValuedMap.transformedMap(MultiValuedMap, Transformer, Transformer)"
  })
  void testTransformedMap_whenHashSetValuedHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new HashSetValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformingMap(MultiValuedMap, Transformer,
   * Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformingMap(MultiValuedMap,
   * Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingMap(MultiValuedMap, Transformer, Transformer); when ArrayListValuedHashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedMultiValuedMap TransformedMultiValuedMap.transformingMap(MultiValuedMap, Transformer, Transformer)"
  })
  void testTransformingMap_whenArrayListValuedHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    TransformedMultiValuedMap<Object, Object> actualTransformingMapResult =
        TransformedMultiValuedMap.transformingMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(0, actualTransformingMapResult.size());
  }

  /**
   * Test {@link TransformedMultiValuedMap#TransformedMultiValuedMap(MultiValuedMap, Transformer,
   * Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TransformedMultiValuedMap#TransformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedMultiValuedMap(MultiValuedMap, Transformer, Transformer); when ArrayListValuedHashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TransformedMultiValuedMap.<init>(MultiValuedMap, Transformer, Transformer)"
  })
  void testNewTransformedMultiValuedMap_whenArrayListValuedHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(0, actualTransformedMultiValuedMap.size());
  }

  /**
   * Test {@link TransformedMultiValuedMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.put(Object, Object)"})
  void testPut() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(new ArrayListValuedHashMap<>(), null, null);

    // Act
    boolean actualPutResult = transformedMultiValuedMap.put("Key", "Value");

    // Assert
    assertEquals(1, transformedMultiValuedMap.size());
    assertTrue(actualPutResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.put(Object, Object)"})
  void testPut2() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMultiValuedMap.put("Key", "Value");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMultiValuedMap.size());
    assertTrue(actualPutResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.put(Object, Object)"})
  void testPut3() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new HashSetValuedHashMap<>(), keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMultiValuedMap.put("Key", "Value");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMultiValuedMap.size());
    assertTrue(actualPutResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.put(Object, Object)"})
  void testPut4() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ChainedTransformer<? super Object> valueTransformer = new ChainedTransformer<>(transformer);

    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMultiValuedMap.put("Key", "Value");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, transformedMultiValuedMap.size());
    assertTrue(actualPutResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.put(Object, Object)"})
  void testPut5() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(transformer);

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMultiValuedMap.put("Key", "Value");

    // Assert
    verify(transformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMultiValuedMap.size());
    assertTrue(actualPutResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.put(Object, Object)"})
  void testPut_thenReturnFalse() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new HashSetValuedHashMap<>(), keyTransformer, valueTransformer);
    transformedMultiValuedMap.put("Key", "Value");

    // Act
    boolean actualPutResult = transformedMultiValuedMap.put("Key", "Value");

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    verify(valueTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, transformedMultiValuedMap.size());
    assertFalse(actualPutResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Map)} with {@code Map}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(new HashMap<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Map)} with {@code Map}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap2() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Map)} with {@code Map}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap3() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new HashSetValuedHashMap<>(), keyTransformer, valueTransformer);

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'; given HashSetValuedHashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap_givenHashSetValuedHashMapKeyIsValue() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(map, keyTransformer, valueTransformer);

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put("Key", "Value");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map2);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    verify(valueTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   *
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'; when ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap_whenArrayListValuedHashMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(new ArrayListValuedHashMap<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   *
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'; when HashSetValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap_whenHashSetValuedHashMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(new HashSetValuedHashMap<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code
   * Iterable}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", new ArrayList<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code
   * Iterable}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    FluentIterable<?> values = FluentIterable.empty();

    // Act
    boolean actualPutAllResult = transformedMultiValuedMap.putAll("Key", values);

    // Assert
    assertEquals(0, transformedMultiValuedMap.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code
   * Iterable}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable3() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", values);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code
   * Iterable}.
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable4() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new HashSetValuedHashMap<>(), keyTransformer, valueTransformer);

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", values);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code
   * Iterable}.
   *
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test putAll(Object, Iterable) with 'Object', 'Iterable'; given HashSetValuedHashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable_givenHashSetValuedHashMapKeyIsValue() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(map, keyTransformer, valueTransformer);

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", values);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    verify(valueTransformer, atLeast(1)).apply(Mockito.<Object>any());
    assertEquals(1, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformKey(Object)}
   */
  @Test
  @DisplayName(
      "Test transformKey(Object); given Transformer apply(Object) return 'Apply'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMultiValuedMap.transformKey(Object)"})
  void testTransformKey_givenTransformerApplyReturnApply_thenReturnApply() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), keyTransformer, mock(Transformer.class));

    // Act
    Object actualTransformKeyResult = transformedMultiValuedMap.transformKey("Object");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformKeyResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformKey(Object)}.
   *
   * <ul>
   *   <li>Then return {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformKey(Object)}
   */
  @Test
  @DisplayName("Test transformKey(Object); then return 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMultiValuedMap.transformKey(Object)"})
  void testTransformKey_thenReturnObject() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), null, mock(Transformer.class));

    // Act and Assert
    assertEquals("Object", transformedMultiValuedMap.transformKey("Object"));
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformValue(Object)}
   */
  @Test
  @DisplayName(
      "Test transformValue(Object); given Transformer apply(Object) return 'Apply'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMultiValuedMap.transformValue(Object)"})
  void testTransformValue_givenTransformerApplyReturnApply_thenReturnApply() {
    // Arrange
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), valueTransformer);

    // Act
    Object actualTransformValueResult = transformedMultiValuedMap.transformValue("Object");

    // Assert
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformValueResult);
  }

  /**
   * Test {@link TransformedMultiValuedMap#transformValue(Object)}.
   *
   * <ul>
   *   <li>Then return {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMultiValuedMap#transformValue(Object)}
   */
  @Test
  @DisplayName("Test transformValue(Object); then return 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMultiValuedMap.transformValue(Object)"})
  void testTransformValue_thenReturnObject() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMultiValuedMap =
        new TransformedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), null);

    // Act and Assert
    assertEquals("Object", transformedMultiValuedMap.transformValue("Object"));
  }
}
