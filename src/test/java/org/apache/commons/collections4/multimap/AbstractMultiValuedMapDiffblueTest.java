package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;

public class AbstractMultiValuedMapDiffblueTest {
  /**
   * Method under test: {@link AbstractMultiValuedMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsKey("Key"));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertTrue(arrayListValuedHashMap.containsKey("Key"));
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap#containsMapping(Object, Object)}
   */
  @Test
  public void testContainsMapping() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsMapping("Key", "Value"));
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap#containsMapping(Object, Object)}
   */
  @Test
  public void testContainsMapping2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertTrue(arrayListValuedHashMap.containsMapping("Key", "Value"));
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap#containsMapping(Object, Object)}
   */
  @Test
  public void testContainsMapping3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", 42);

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsMapping("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsValue("Value"));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertTrue(arrayListValuedHashMap.containsValue("Value"));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#entries()}
   */
  @Test
  public void testEntries() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.entries().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, new ArrayListValuedHashMap<>());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put(new ArrayListValuedHashMap<>(), "Value");

    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap2 = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap2.put("Key", "Value");

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, arrayListValuedHashMap2);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", new ArrayListValuedHashMap<>());

    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap2 = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap2.put("Key", "Value");

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, arrayListValuedHashMap2);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, null);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, "Different type to AbstractMultiValuedMap");
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualGetResult = arrayListValuedHashMap.get("Key");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(actualGetResult.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#getMap()}
   */
  @Test
  public void testGetMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap2 = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedHashMap2);
    int expectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertEquals(expectedHashCodeResult, arrayListValuedHashMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap2 = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap2.put("Key", "Value");

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedHashMap2);
    int expectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertEquals(expectedHashCodeResult, arrayListValuedHashMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put(new ArrayListValuedHashMap<>(), "Value");

    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap2 = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap2.put(new ArrayListValuedHashMap<>(), "Value");

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedHashMap2);
    int expectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertEquals(expectedHashCodeResult, arrayListValuedHashMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedHashMap);
    int expectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertEquals(expectedHashCodeResult, arrayListValuedHashMap.hashCode());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertFalse(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#keys()}
   */
  @Test
  public void testKeys() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.keys().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = arrayListValuedHashMap.mapIterator();

    // Assert
    assertEquals("Key", actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#put(Object, Object)}
   */
  @Test
  public void testPut() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutResult = arrayListValuedHashMap.put("Key", "Value");

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    List<Object> getResult = map.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualPutResult);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#put(Object, Object)}
   */
  @Test
  public void testPut2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    boolean actualPutResult = arrayListValuedHashMap.put("Key", "Value");

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    List<Object> getResult = map.get("Key");
    assertEquals(2, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals("Value", getResult.get(1));
    assertEquals(2, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualPutResult);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll("Key", new ArrayList<>());

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll("Key", values);

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    List<Object> getResult = map.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(new HashMap<>());

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll4() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    Map<Object, List<Object>> map2 = arrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll5() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("42", "Value");

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    Map<Object, List<Object>> map2 = arrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(2, getResult.size());
    assertEquals("42", getResult.get(1));
    assertEquals("Value", getResult.get(0));
    assertEquals(2, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  public void testPutAll6() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
    assertEquals(arrayListValuedHashMap, map);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  public void testPutAll7() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
    assertEquals(arrayListValuedHashMap, map);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(actualRemoveResult.isEmpty());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertEquals(1, actualRemoveResult.size());
    assertEquals("Value", ((List<Object>) actualRemoveResult).get(0));
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  public void testRemoveMapping() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualRemoveMappingResult = arrayListValuedHashMap.removeMapping("Key", "Value");

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualRemoveMappingResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  public void testRemoveMapping2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    boolean actualRemoveMappingResult = arrayListValuedHashMap.removeMapping("Key", "Value");

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
    assertTrue(actualRemoveMappingResult);
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  public void testRemoveMapping3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    boolean actualRemoveMappingResult = arrayListValuedHashMap.removeMapping("Key", "Value");

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    assertEquals(1, map.get("Key").size());
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualRemoveMappingResult);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#setMap(Map)}
   */
  @Test
  public void testSetMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    HashMap<Object, Collection<Object>> map = new HashMap<>();

    // Act
    arrayListValuedHashMap.setMap(map);

    // Assert
    assertSame(map, arrayListValuedHashMap.getMap());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(0, arrayListValuedHashMap.size());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#size()}
   */
  @Test
  public void testSize2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertEquals(1, arrayListValuedHashMap.size());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals("{}", arrayListValuedHashMap.toString());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.values().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMap#wrappedCollection(Object)}
   */
  @Test
  public void testWrappedCollection() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualWrappedCollectionResult = arrayListValuedHashMap.wrappedCollection("Key");

    // Assert
    assertTrue(actualWrappedCollectionResult instanceof List);
    assertTrue(actualWrappedCollectionResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMap.WrappedCollection#WrappedCollection(AbstractMultiValuedMap, Object)}
   */
  @Test
  public void testWrappedCollectionNewWrappedCollection() {
    // Arrange, Act and Assert
    assertTrue(((new ArrayListValuedHashMap()).new WrappedCollection("Key")).isEmpty());
  }
}
