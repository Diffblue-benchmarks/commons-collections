package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedSortedMapDiffblueTest {
  /**
   * Test {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer, Transformer)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return one.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedMap(SortedMap, Transformer, Transformer); given one; when Transformer apply(Object) return one; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedMap TransformedSortedMap.transformedSortedMap(SortedMap, Transformer, Transformer)"
  })
  void testTransformedSortedMap_givenOne_whenTransformerApplyReturnOne_thenCallsApply() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(1);

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedSortedMap<Object, Object> actualTransformedSortedMapResult =
        TransformedSortedMap.transformedSortedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    Map<Object, Object> expectedTransformedSortedMapResult = actualTransformedSortedMapResult.map;
    assertEquals(expectedTransformedSortedMapResult, actualTransformedSortedMapResult);
  }

  /**
   * Test {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedSortedMap(SortedMap, Transformer, Transformer); when TreeMap(); then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedMap TransformedSortedMap.transformedSortedMap(SortedMap, Transformer, Transformer)"
  })
  void testTransformedSortedMap_whenTreeMap_thenReturnMap() {
    // Arrange and Act
    TransformedSortedMap<Object, Object> actualTransformedSortedMapResult =
        TransformedSortedMap.transformedSortedMap(
            new TreeMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedTransformedSortedMapResult = actualTransformedSortedMapResult.map;
    assertEquals(expectedTransformedSortedMapResult, actualTransformedSortedMapResult);
  }

  /**
   * Test {@link TransformedSortedMap#transformingSortedMap(SortedMap, Transformer, Transformer)}.
   *
   * <p>Method under test: {@link TransformedSortedMap#transformingSortedMap(SortedMap, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName("Test transformingSortedMap(SortedMap, Transformer, Transformer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedSortedMap TransformedSortedMap.transformingSortedMap(SortedMap, Transformer, Transformer)"
  })
  void testTransformingSortedMap() {
    // Arrange and Act
    TransformedSortedMap<Object, Object> actualTransformingSortedMapResult =
        TransformedSortedMap.transformingSortedMap(
            new TreeMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedTransformingSortedMapResult = actualTransformingSortedMapResult.map;
    assertEquals(expectedTransformingSortedMapResult, actualTransformingSortedMapResult);
  }

  /**
   * Test {@link TransformedSortedMap#TransformedSortedMap(SortedMap, Transformer, Transformer)}.
   *
   * <p>Method under test: {@link TransformedSortedMap#TransformedSortedMap(SortedMap, Transformer,
   * Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedSortedMap(SortedMap, Transformer, Transformer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedSortedMap.<init>(SortedMap, Transformer, Transformer)"})
  void testNewTransformedSortedMap() {
    // Arrange and Act
    TransformedSortedMap<Object, Object> actualObjectObjectMap =
        new TransformedSortedMap<>(
            new TreeMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }
}
