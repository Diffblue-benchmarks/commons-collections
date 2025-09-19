package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LazyMapDiffblueTest {
  /**
   * Test {@link LazyMap#lazyMap(Map, Factory)} with {@code Map}, {@code Factory}.
   *
   * <ul>
   *   <li>When {@link Factory}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazyMap#lazyMap(Map, Factory)}
   */
  @Test
  @DisplayName("Test lazyMap(Map, Factory) with 'Map', 'Factory'; when Factory; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LazyMap LazyMap.lazyMap(Map, Factory)"})
  void testLazyMapWithMapFactory_whenFactory_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualLazyMapResult =
        LazyMap.lazyMap(new HashMap<>(), mock(Factory.class));

    // Assert
    Map<Object, Object> expectedLazyMapResult = actualLazyMapResult.map;
    assertEquals(expectedLazyMapResult, actualLazyMapResult);
  }

  /**
   * Test {@link LazyMap#lazyMap(Map, Transformer)} with {@code Map}, {@code Transformer}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazyMap#lazyMap(Map, Transformer)}
   */
  @Test
  @DisplayName(
      "Test lazyMap(Map, Transformer) with 'Map', 'Transformer'; when Transformer; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LazyMap LazyMap.lazyMap(Map, Transformer)"})
  void testLazyMapWithMapTransformer_whenTransformer_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualLazyMapResult =
        LazyMap.lazyMap(new HashMap<>(), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedLazyMapResult = actualLazyMapResult.map;
    assertEquals(expectedLazyMapResult, actualLazyMapResult);
  }

  /**
   * Test {@link LazyMap#LazyMap(Map, Factory)}.
   *
   * <ul>
   *   <li>When {@link Factory}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazyMap#LazyMap(Map, Factory)}
   */
  @Test
  @DisplayName("Test new LazyMap(Map, Factory); when Factory; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LazyMap.<init>(Map, Factory)"})
  void testNewLazyMap_whenFactory_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualObjectObjectMap =
        new LazyMap<>(new HashMap<>(), mock(Factory.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link LazyMap#LazyMap(Map, Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazyMap#LazyMap(Map, Transformer)}
   */
  @Test
  @DisplayName("Test new LazyMap(Map, Transformer); when Transformer; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LazyMap.<init>(Map, Transformer)"})
  void testNewLazyMap_whenTransformer_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualObjectObjectMap =
        new LazyMap<>(new HashMap<>(), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }
}
