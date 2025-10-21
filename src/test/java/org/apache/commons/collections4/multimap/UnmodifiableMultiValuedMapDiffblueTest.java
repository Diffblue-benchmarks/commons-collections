package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableMultiValuedMapDiffblueTest {
  /**
   * Test {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   *   <li>{@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "UnmodifiableMultiValuedMap UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(MultiValuedMap)"})
  public void testUnmodifiableMultiValuedMap() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    UnmodifiableMultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map);

    // Assert
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "UnmodifiableMultiValuedMap UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(MultiValuedMap)"})
  public void testUnmodifiableMultiValuedMap_whenArrayListValuedHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    UnmodifiableMultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Assert
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#asMap()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map UnmodifiableMultiValuedMap.asMap()"})
  public void testAsMap() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#asMap()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map UnmodifiableMultiValuedMap.asMap()"})
  public void testAsMap2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#asMap()}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map UnmodifiableMultiValuedMap.asMap()"})
  public void testAsMap_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#clear()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UnmodifiableMultiValuedMap.clear()"})
  public void testClear() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.clear());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#entries()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.entries()"})
  public void testEntries() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#entries()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.entries()"})
  public void testEntries2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#entries()}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.entries()"})
  public void testEntries_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#get(Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.get(Object)"})
  public void testGet() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#get(Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.get(Object)"})
  public void testGet2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#get(Object)}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.get(Object)"})
  public void testGet_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keys()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet UnmodifiableMultiValuedMap.keys()"})
  public void testKeys() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keys()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet UnmodifiableMultiValuedMap.keys()"})
  public void testKeys2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keys()}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet UnmodifiableMultiValuedMap.keys()"})
  public void testKeys_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keySet()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set UnmodifiableMultiValuedMap.keySet()"})
  public void testKeySet() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keySet()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set UnmodifiableMultiValuedMap.keySet()"})
  public void testKeySet2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#keySet()}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set UnmodifiableMultiValuedMap.keySet()"})
  public void testKeySet_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#mapIterator()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator UnmodifiableMultiValuedMap.mapIterator()"})
  public void testMapIterator() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#mapIterator()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator UnmodifiableMultiValuedMap.mapIterator()"})
  public void testMapIterator2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#mapIterator()}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator UnmodifiableMultiValuedMap.mapIterator()"})
  public void testMapIterator_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#put(Object, Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.put(Object, Object)"})
  public void testPut() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.put("Key", "Value"));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#putAll(Map)} with {@code Map}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.putAll(Map)"})
  public void testPutAllWithMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.putAll(new HashMap<>()));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.putAll(MultiValuedMap)"})
  public void testPutAllWithMultiValuedMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll(new ArrayListValuedHashMap<>()));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code Iterable}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.putAll(Object, Iterable)"})
  public void testPutAllWithObjectIterable() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll("Key", new ArrayList<>()));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#remove(Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.remove(Object)"})
  public void testRemove() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.remove("Key"));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#removeMapping(Object, Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean UnmodifiableMultiValuedMap.removeMapping(Object, Object)"})
  public void testRemoveMapping() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.removeMapping("Key", "Item"));
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#values()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.values()"})
  public void testValues() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map2);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#values()}.
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.values()"})
  public void testValues2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map3 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map2);
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map3);

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }

  /**
   * Test {@link UnmodifiableMultiValuedMap#values()}.
   * <ul>
   *   <li>Given unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection UnmodifiableMultiValuedMap.values()"})
  public void testValues_givenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }
}
