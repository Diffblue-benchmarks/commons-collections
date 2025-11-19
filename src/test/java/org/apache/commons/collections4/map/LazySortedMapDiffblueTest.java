package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LazySortedMapDiffblueTest {
  /**
   * Test {@link LazySortedMap#lazySortedMap(SortedMap, Factory)} with {@code SortedMap}, {@code
   * Factory}.
   *
   * <ul>
   *   <li>When {@link Factory}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazySortedMap#lazySortedMap(SortedMap, Factory)}
   */
  @Test
  @DisplayName(
      "Test lazySortedMap(SortedMap, Factory) with 'SortedMap', 'Factory'; when Factory; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LazySortedMap LazySortedMap.lazySortedMap(SortedMap, Factory)"})
  void testLazySortedMapWithSortedMapFactory_whenFactory_thenReturnMap() {
    // Arrange and Act
    LazySortedMap<Object, Object> actualLazySortedMapResult =
        LazySortedMap.lazySortedMap(new TreeMap<>(), mock(Factory.class));

    // Assert
    Map<Object, Object> expectedLazySortedMapResult = actualLazySortedMapResult.map;
    assertEquals(expectedLazySortedMapResult, actualLazySortedMapResult);
  }

  /**
   * Test {@link LazySortedMap#lazySortedMap(SortedMap, Transformer)} with {@code SortedMap}, {@code
   * Transformer}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazySortedMap#lazySortedMap(SortedMap, Transformer)}
   */
  @Test
  @DisplayName(
      "Test lazySortedMap(SortedMap, Transformer) with 'SortedMap', 'Transformer'; when Transformer; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LazySortedMap LazySortedMap.lazySortedMap(SortedMap, Transformer)"})
  void testLazySortedMapWithSortedMapTransformer_whenTransformer_thenReturnMap() {
    // Arrange and Act
    LazySortedMap<Object, Object> actualLazySortedMapResult =
        LazySortedMap.lazySortedMap(new TreeMap<>(), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedLazySortedMapResult = actualLazySortedMapResult.map;
    assertEquals(expectedLazySortedMapResult, actualLazySortedMapResult);
  }

  /**
   * Test {@link LazySortedMap#LazySortedMap(SortedMap, Factory)}.
   *
   * <ul>
   *   <li>When {@link Factory}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazySortedMap#LazySortedMap(SortedMap, Factory)}
   */
  @Test
  @DisplayName("Test new LazySortedMap(SortedMap, Factory); when Factory; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LazySortedMap.<init>(SortedMap, Factory)"})
  void testNewLazySortedMap_whenFactory_thenReturnMap() {
    // Arrange and Act
    LazySortedMap<Object, Object> actualObjectObjectMap =
        new LazySortedMap<>(new TreeMap<>(), mock(Factory.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link LazySortedMap#LazySortedMap(SortedMap, Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link LazySortedMap#LazySortedMap(SortedMap, Transformer)}
   */
  @Test
  @DisplayName("Test new LazySortedMap(SortedMap, Transformer); when Transformer; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LazySortedMap.<init>(SortedMap, Transformer)"})
  void testNewLazySortedMap_whenTransformer_thenReturnMap() {
    // Arrange and Act
    LazySortedMap<Object, Object> actualObjectObjectMap =
        new LazySortedMap<>(new TreeMap<>(), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }
}
