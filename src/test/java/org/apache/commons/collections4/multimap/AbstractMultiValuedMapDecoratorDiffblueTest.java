package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import java.util.List;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractMultiValuedMapDecoratorDiffblueTest {
  /**
   * Test {@link AbstractMultiValuedMapDecorator#asMap()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#asMap()}
   */
  @Test
  @DisplayName("Test asMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map AbstractMultiValuedMapDecorator.asMap()"})
  void testAsMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#asMap()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#asMap()}
   */
  @Test
  @DisplayName("Test asMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map AbstractMultiValuedMapDecorator.asMap()"})
  void testAsMap2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsKey(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsKey(Object)"})
  void testContainsKey() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsKey("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsKey(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsKey(Object)"})
  void testContainsKey2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsKey("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code
   *       Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsMapping(Object, Object); given ArrayListValuedHashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsMapping(Object, Object)"})
  void testContainsMapping_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");
    TransformedMultiValuedMap<Object, Object> transformingMapResult =
        TransformedMultiValuedMap.transformingMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformingMapResult.containsMapping("Key", "Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}
   */
  @Test
  @DisplayName("Test containsMapping(Object, Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsMapping(Object, Object)"})
  void testContainsMapping_thenReturnFalse() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsMapping("Key", "Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsValue(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsValue(Object)"})
  void testContainsValue() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsValue("Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsValue(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsValue(Object)"})
  void testContainsValue2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsValue("Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#entries()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#entries()}
   */
  @Test
  @DisplayName("Test entries()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.entries()"})
  void testEntries() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}, and {@link
   * AbstractMultiValuedMapDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMultiValuedMapDecorator.equals(Object)",
    "int AbstractMultiValuedMapDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult2);
    assertEquals(transformedMapResult.hashCode(), transformedMapResult2.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}, and {@link
   * AbstractMultiValuedMapDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMultiValuedMapDecorator.equals(Object)",
    "int AbstractMultiValuedMapDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMultiValuedMapDecorator.equals(Object)",
    "int AbstractMultiValuedMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = mock(ArrayListValuedHashMap.class);
    when(map.isEmpty()).thenReturn(true);
    when(map.size()).thenReturn(3);
    when(map.entries()).thenReturn(new ArrayList<>());
    doNothing().when(map).clear();
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformedMapResult, transformedMapResult2);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMultiValuedMapDecorator.equals(Object)",
    "int AbstractMultiValuedMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformedMapResult, null);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMultiValuedMapDecorator.equals(Object)",
    "int AbstractMultiValuedMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformedMapResult, "Different type to AbstractMultiValuedMapDecorator");
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#get(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.get(Object)"})
  void testGet() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualGetResult = transformedMapResult.get("Key");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(actualGetResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#get(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.get(Object)"})
  void testGet2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualGetResult = transformedMapResult.get("Key");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(actualGetResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code
   *       Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given ArrayListValuedHashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.isEmpty()"})
  void testIsEmpty_givenArrayListValuedHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Act
    boolean actualIsEmptyResult = transformedMapResult.isEmpty();

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#isEmpty()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.isEmpty()"})
  void testIsEmpty_thenReturnTrue() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keys()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#keys()}
   */
  @Test
  @DisplayName("Test keys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.collections4.MultiSet AbstractMultiValuedMapDecorator.keys()"
  })
  void testKeys() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keys()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#keys()}
   */
  @Test
  @DisplayName("Test keys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.collections4.MultiSet AbstractMultiValuedMapDecorator.keys()"
  })
  void testKeys2() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keySet()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMapDecorator.keySet()"})
  void testKeySet() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keySet()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMapDecorator.keySet()"})
  void testKeySet2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#mapIterator()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractMultiValuedMapDecorator.mapIterator()"})
  void testMapIterator() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = transformedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(((EmptyMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#mapIterator()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractMultiValuedMapDecorator.mapIterator()"})
  void testMapIterator2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = transformedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(((EmptyMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#put(Object, Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.put(Object, Object)"})
  void testPut() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMapResult.put("Key", "Value");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#put(Object, Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.put(Object, Object)"})
  void testPut2() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(map, keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMapResult.put("Key", "Value");

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    verify(valueTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertFalse(actualPutResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)} with {@code
   * MultiValuedMap}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(MultiValuedMap)"})
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
   * Test {@link AbstractMultiValuedMapDecorator#remove(Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.remove(Object)"})
  void testRemove() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualRemoveResult = transformedMapResult.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertTrue(actualRemoveResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#removeMapping(Object, Object)}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#removeMapping(Object, Object)}
   */
  @Test
  @DisplayName("Test removeMapping(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.removeMapping(Object, Object)"})
  void testRemoveMapping() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.removeMapping("Key", "Item"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#size()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractMultiValuedMapDecorator.size()"})
  void testSize() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(0, transformedMapResult.size());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#size()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractMultiValuedMapDecorator.size()"})
  void testSize2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(0, transformedMapResult.size());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#toString()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMultiValuedMapDecorator.toString()"})
  void testToString() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals("{}", transformedMapResult.toString());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#toString()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMultiValuedMapDecorator.toString()"})
  void testToString2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals("{}", transformedMapResult.toString());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#values()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.values()"})
  void testValues() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.values().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#values()}.
   *
   * <p>Method under test: {@link AbstractMultiValuedMapDecorator#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.values()"})
  void testValues2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.values().isEmpty());
  }
}
