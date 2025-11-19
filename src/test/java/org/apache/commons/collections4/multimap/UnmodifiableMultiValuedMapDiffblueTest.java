package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableMultiValuedMapDiffblueTest {
  /**
   * Test {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   *   <li>{@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   * </ul>
   */
  @Test
  @DisplayName("Test unmodifiableMultiValuedMap(MultiValuedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnmodifiableMultiValuedMap UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(MultiValuedMap)"
  })
  void testUnmodifiableMultiValuedMap() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    UnmodifiableMultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);

    // Assert
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}.
   *
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableMultiValuedMap(MultiValuedMap); when ArrayListValuedHashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnmodifiableMultiValuedMap UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(MultiValuedMap)"
  })
  void testUnmodifiableMultiValuedMap_whenArrayListValuedHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    UnmodifiableMultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Assert
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#asMap()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  @DisplayName("Test asMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map UnmodifiableMultiValuedMap.asMap()"})
  void testAsMap() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#asMap()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  @DisplayName("Test asMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map UnmodifiableMultiValuedMap.asMap()"})
  void testAsMap2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#asMap()}.
   *
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map UnmodifiableMultiValuedMap.asMap()"})
  void testAsMap_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#clear()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#clear()}
   */
  @Test
  @DisplayName("Test clear()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableMultiValuedMap.clear()"})
  void testClear() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.clear());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#entries()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  @DisplayName("Test entries()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.entries()"})
  void testEntries() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#entries()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  @DisplayName("Test entries()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.entries()"})
  void testEntries2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#entries()}.
   *
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  @DisplayName("Test entries(); given unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.entries()"})
  void testEntries_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#get(Object)}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.get(Object)"})
  void testGet() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keys()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  @DisplayName("Test keys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet UnmodifiableMultiValuedMap.keys()"})
  void testKeys() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keys()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  @DisplayName("Test keys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet UnmodifiableMultiValuedMap.keys()"})
  void testKeys2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keys()}.
   *
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  @DisplayName("Test keys(); given unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet UnmodifiableMultiValuedMap.keys()"})
  void testKeys_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keySet()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set UnmodifiableMultiValuedMap.keySet()"})
  void testKeySet() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keySet()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set UnmodifiableMultiValuedMap.keySet()"})
  void testKeySet2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keySet()}.
   *
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set UnmodifiableMultiValuedMap.keySet()"})
  void testKeySet_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#mapIterator()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator UnmodifiableMultiValuedMap.mapIterator()"})
  void testMapIterator() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);

    // Act
    MapIterator<Object, Object> actualMapIteratorResult =
        unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#mapIterator()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator UnmodifiableMultiValuedMap.mapIterator()"})
  void testMapIterator2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map3);

    // Act
    MapIterator<Object, Object> actualMapIteratorResult =
        unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator UnmodifiableMultiValuedMap.mapIterator()"})
  void testMapIterator_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    MapIterator<Object, Object> actualMapIteratorResult =
        unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.put(Object, Object)"})
  void testPut() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.put("Key", "Value"));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#putAll(Map)} with {@code Map}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll(new HashMap<>()));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll(new ArrayListValuedHashMap<>()));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code
   * Iterable}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll("Key", new ArrayList<>()));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#remove(Object)}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.remove(Object)"})
  void testRemove() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.remove("Key"));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#removeMapping(Object, Object)}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  @DisplayName("Test removeMapping(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.removeMapping(Object, Object)"})
  void testRemoveMapping() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.removeMapping("Key", "Item"));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#values()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.values()"})
  void testValues() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map =
        TransformedMultiValuedMap.transformedMap(
            new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#values()}.
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.values()"})
  void testValues2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 =
        TransformedMultiValuedMap.transformedMap(
            map, mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#values()}.
   *
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  @DisplayName("Test values(); given unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.values()"})
  void testValues_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult =
        UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }
}
