package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedMapDiffblueTest {
  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       LRUMap#LRUMap()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(Map, Transformer, Transformer); given LRUMap(); when Transformer apply(Object) return LRUMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  void testTransformedMap_givenLRUMap_whenTransformerApplyReturnLRUMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(new LRUMap<>());

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult =
        TransformedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, map.size());
    Map<Object, Object> expectedTransformedMapResult = actualTransformedMapResult.map;
    assertEquals(expectedTransformedMapResult, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then {@link HashMap#HashMap()} containsKey {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(Map, Transformer, Transformer); given NULL; when HashMap() NULL is NULL; then HashMap() containsKey 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  void testTransformedMap_givenNull_whenHashMapNullIsNull_thenHashMapContainsKeyNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult =
        TransformedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertTrue(map.containsKey(null));
    Map<Object, Object> expectedTransformedMapResult = actualTransformedMapResult.map;
    assertEquals(expectedTransformedMapResult, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} one is {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link HashMap#HashMap()} containsKey {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(Map, Transformer, Transformer); given one; when HashMap() one is NULL; then HashMap() containsKey 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  void testTransformedMap_givenOne_whenHashMapOneIsNull_thenHashMapContainsKeyNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(1, AbstractHashedMap.NULL);

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult =
        TransformedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(Mockito.<Object>any());
    verify(valueTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertTrue(map.containsKey(null));
    Map<Object, Object> expectedTransformedMapResult = actualTransformedMapResult.map;
    assertEquals(expectedTransformedMapResult, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedMap(Map, Transformer, Transformer); when HashMap(); then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  void testTransformedMap_whenHashMap_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult =
        TransformedMap.transformedMap(map, mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertTrue(map.isEmpty());
    Map<Object, Object> expectedTransformedMapResult = actualTransformedMapResult.map;
    assertEquals(expectedTransformedMapResult, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformingMap(Map, Transformer, Transformer)}.
   *
   * <p>Method under test: {@link TransformedMap#transformingMap(Map, Transformer, Transformer)}
   */
  @Test
  @DisplayName("Test transformingMap(Map, Transformer, Transformer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedMap TransformedMap.transformingMap(Map, Transformer, Transformer)"
  })
  void testTransformingMap() {
    // Arrange and Act
    TransformedMap<Object, Object> actualTransformingMapResult =
        TransformedMap.transformingMap(
            new HashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedTransformingMapResult = actualTransformingMapResult.map;
    assertEquals(expectedTransformingMapResult, actualTransformingMapResult);
  }

  /**
   * Test {@link TransformedMap#TransformedMap(Map, Transformer, Transformer)}.
   *
   * <p>Method under test: {@link TransformedMap#TransformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedMap(Map, Transformer, Transformer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedMap.<init>(Map, Transformer, Transformer)"})
  void testNewTransformedMap() {
    // Arrange and Act
    TransformedMap<Object, Object> actualObjectObjectMap =
        new TransformedMap<>(new HashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link TransformedMap#isSetValueChecking()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#isSetValueChecking()}
   */
  @Test
  @DisplayName("Test isSetValueChecking(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMap.isSetValueChecking()"})
  void testIsSetValueChecking_thenReturnFalse() {
    // Arrange
    TransformedMap<Object, Object> objectObjectMap =
        new TransformedMap<>(new HashMap<>(), mock(Transformer.class), null);

    // Act and Assert
    assertFalse(objectObjectMap.isSetValueChecking());
  }

  /**
   * Test {@link TransformedMap#isSetValueChecking()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#isSetValueChecking()}
   */
  @Test
  @DisplayName("Test isSetValueChecking(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TransformedMap.isSetValueChecking()"})
  void testIsSetValueChecking_thenReturnTrue() {
    // Arrange
    TransformedMap<Object, Object> objectObjectMap =
        new TransformedMap<>(new HashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(objectObjectMap.isSetValueChecking());
  }

  /**
   * Test {@link TransformedMap#transformKey(Object)}.
   *
   * <p>Method under test: {@link TransformedMap#transformKey(Object)}
   */
  @Test
  @DisplayName("Test transformKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMap.transformKey(Object)"})
  void testTransformKey() {
    // Arrange
    TransformedMap<Object, Object> objectObjectMap =
        new TransformedMap<>(new HashMap<>(), null, mock(Transformer.class));
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualTransformKeyResult = objectObjectMap.transformKey(object);

    // Assert
    assertSame(object, actualTransformKeyResult);
  }

  /**
   * Test {@link TransformedMap#transformKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#transformKey(Object)}
   */
  @Test
  @DisplayName(
      "Test transformKey(Object); given Transformer apply(Object) return NULL; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMap.transformKey(Object)"})
  void testTransformKey_givenTransformerApplyReturnNull_thenCallsApply() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);
    TransformedMap<Object, Object> objectObjectMap =
        new TransformedMap<>(new HashMap<>(), keyTransformer, mock(Transformer.class));
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualTransformKeyResult = objectObjectMap.transformKey(object);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertSame(object, actualTransformKeyResult);
  }

  /**
   * Test {@link TransformedMap#transformValue(Object)}.
   *
   * <p>Method under test: {@link TransformedMap#transformValue(Object)}
   */
  @Test
  @DisplayName("Test transformValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMap.transformValue(Object)"})
  void testTransformValue() {
    // Arrange
    TransformedMap<Object, Object> objectObjectMap =
        new TransformedMap<>(new HashMap<>(), mock(Transformer.class), null);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualTransformValueResult = objectObjectMap.transformValue(object);

    // Assert
    assertSame(object, actualTransformValueResult);
  }

  /**
   * Test {@link TransformedMap#transformValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedMap#transformValue(Object)}
   */
  @Test
  @DisplayName(
      "Test transformValue(Object); given Transformer apply(Object) return NULL; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object TransformedMap.transformValue(Object)"})
  void testTransformValue_givenTransformerApplyReturnNull_thenCallsApply() {
    // Arrange
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);
    TransformedMap<Object, Object> objectObjectMap =
        new TransformedMap<>(new HashMap<>(), mock(Transformer.class), valueTransformer);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualTransformValueResult = objectObjectMap.transformValue(object);

    // Assert
    verify(valueTransformer).apply(isA(Object.class));
    assertSame(object, actualTransformValueResult);
  }
}
