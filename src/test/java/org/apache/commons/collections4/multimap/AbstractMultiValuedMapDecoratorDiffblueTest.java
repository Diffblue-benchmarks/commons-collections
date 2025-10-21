package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractMultiValuedMapDecoratorDiffblueTest {
  /**
   * Test {@link AbstractMultiValuedMapDecorator#asMap()}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#asMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map AbstractMultiValuedMapDecorator.asMap()"})
  public void testAsMap_thenReturnEmpty() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.asMap().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsKey(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsKey(Object)"})
  public void testContainsKey() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsKey("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsKey(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsKey(Object)"})
  public void testContainsKey2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsKey("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsMapping(Object, Object)"})
  public void testContainsMapping() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsMapping("Key", "Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsValue(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsValue(Object)"})
  public void testContainsValue() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsValue("Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#containsValue(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.containsValue(Object)"})
  public void testContainsValue2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.containsValue("Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#decorated()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#decorated()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiValuedMap AbstractMultiValuedMapDecorator.decorated()"})
  public void testDecorated() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertSame(map, transformedMapResult.decorated());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#entries()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.entries()"})
  public void testEntries() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#entries()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.entries()"})
  public void testEntries2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#entries()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.entries()"})
  public void testEntries3() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.entries().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}, and {@link AbstractMultiValuedMapDecorator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.equals(Object)",
      "int AbstractMultiValuedMapDecorator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult2);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult2.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}, and {@link AbstractMultiValuedMapDecorator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.equals(Object)",
      "int AbstractMultiValuedMapDecorator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.equals(Object)",
      "int AbstractMultiValuedMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = mock(ArrayListValuedHashMap.class);
    when(map.isEmpty()).thenReturn(true);
    when(map.size()).thenReturn(3);
    when(map.entries()).thenReturn(new ArrayList<>());
    doNothing().when(map).clear();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformedMapResult, transformedMapResult2);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.equals(Object)",
      "int AbstractMultiValuedMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformedMapResult, null);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.equals(Object)",
      "int AbstractMultiValuedMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertNotEquals(transformedMapResult, "Different type to AbstractMultiValuedMapDecorator");
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#get(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.get(Object)"})
  public void testGet() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualGetResult = transformedMapResult.get("Key");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(actualGetResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#get(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.get(Object)"})
  public void testGet2() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#get(Object)}.
   * <ul>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.get(Object)"})
  public void testGet_thenReturnList() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualGetResult = transformedMapResult.get("Key");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(actualGetResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#isEmpty()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.isEmpty()"})
  public void testIsEmpty() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#isEmpty()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.isEmpty()"})
  public void testIsEmpty_givenArrayListValuedHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, valueTransformer);

    // Act
    boolean actualIsEmptyResult = transformedMapResult.isEmpty();

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#isEmpty()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.isEmpty()"})
  public void testIsEmpty_thenReturnTrue() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keys()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet AbstractMultiValuedMapDecorator.keys()"})
  public void testKeys() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keys()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet AbstractMultiValuedMapDecorator.keys()"})
  public void testKeys2() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keys().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keySet()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMapDecorator.keySet()"})
  public void testKeySet() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keySet()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMapDecorator.keySet()"})
  public void testKeySet2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#keySet()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMapDecorator.keySet()"})
  public void testKeySet3() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#mapIterator()}.
   * <ul>
   *   <li>Then return {@link UnmodifiableMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator AbstractMultiValuedMapDecorator.mapIterator()"})
  public void testMapIterator_thenReturnUnmodifiableMapIterator() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = transformedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#put(Object, Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.put(Object, Object)"})
  public void testPut() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

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
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.put(Object, Object)"})
  public void testPut2() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, valueTransformer);

    // Act
    boolean actualPutResult = transformedMapResult.put("Key", "Value");

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    verify(valueTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertFalse(actualPutResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(Map)} with {@code Map}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(Map)"})
  public void testPutAllWithMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(new HashMap<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(Map)} with {@code Map}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(Map)"})
  public void testPutAllWithMap2() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(MultiValuedMap)"})
  public void testPutAllWithMultiValuedMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(MultiValuedMap)"})
  public void testPutAllWithMultiValuedMap2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map);

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(MultiValuedMap)"})
  public void testPutAllWithMultiValuedMap_whenArrayListValuedHashMap() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(new ArrayListValuedHashMap<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(Object, Iterable)} with {@code Object}, {@code Iterable}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(Object, Iterable)"})
  public void testPutAllWithObjectIterable() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", new ArrayList<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#putAll(Object, Iterable)} with {@code Object}, {@code Iterable}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.putAll(Object, Iterable)"})
  public void testPutAllWithObjectIterable2() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), keyTransformer, valueTransformer);

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
   * Test {@link AbstractMultiValuedMapDecorator#remove(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.remove(Object)"})
  public void testRemove() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualRemoveResult = transformedMapResult.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertTrue(actualRemoveResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#remove(Object)}.
   * <ul>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.remove(Object)"})
  public void testRemove_thenReturnList() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualRemoveResult = transformedMapResult.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertTrue(actualRemoveResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#removeMapping(Object, Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#removeMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMapDecorator.removeMapping(Object, Object)"})
  public void testRemoveMapping() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertFalse(transformedMapResult.removeMapping("Key", "Item"));
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#size()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiValuedMapDecorator.size()"})
  public void testSize() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(0, transformedMapResult.size());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#size()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiValuedMapDecorator.size()"})
  public void testSize2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals(0, transformedMapResult.size());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#toString()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMultiValuedMapDecorator.toString()"})
  public void testToString() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals("{}", transformedMapResult.toString());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#toString()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMultiValuedMapDecorator.toString()"})
  public void testToString2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertEquals("{}", transformedMapResult.toString());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#values()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.values()"})
  public void testValues() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.values().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#values()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.values()"})
  public void testValues2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.values().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMapDecorator#values()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMapDecorator#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMapDecorator.values()"})
  public void testValues3() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(transformedMapResult.values().isEmpty());
  }
}
