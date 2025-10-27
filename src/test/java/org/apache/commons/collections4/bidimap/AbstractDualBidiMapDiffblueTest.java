package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

public class AbstractDualBidiMapDiffblueTest {
  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#getKey()}
   */
  @Test
  public void testBidiMapIteratorGetKey() {
    // Arrange
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.getKey());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#getValue()}
   */
  @Test
  public void testBidiMapIteratorGetValue() {
    // Arrange
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.getValue());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#hasNext()}
   */
  @Test
  public void testBidiMapIteratorHasNext() {
    // Arrange
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiMapIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#hasNext()}
   */
  @Test
  public void testBidiMapIteratorHasNext2() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        parent);

    // Act and Assert
    assertTrue(bidiMapIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.BidiMapIterator#BidiMapIterator(AbstractDualBidiMap)}
   */
  @Test
  public void testBidiMapIteratorNewBidiMapIterator() {
    // Arrange and Act
    AbstractDualBidiMap.BidiMapIterator<Object, Object> actualBidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Assert
    assertFalse(actualBidiMapIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#next()}
   */
  @Test
  public void testBidiMapIteratorNext() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        parent);

    // Act and Assert
    assertEquals("Key", bidiMapIterator.next());
    assertFalse(bidiMapIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#remove()}
   */
  @Test
  public void testBidiMapIteratorRemove() {
    // Arrange
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.remove());
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.BidiMapIterator#setValue(Object)}
   */
  @Test
  public void testBidiMapIteratorSetValue() {
    // Arrange
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.setValue("Value"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.BidiMapIterator#toString()}
   */
  @Test
  public void testBidiMapIteratorToString() {
    // Arrange
    AbstractDualBidiMap.BidiMapIterator<Object, Object> bidiMapIterator = new AbstractDualBidiMap.BidiMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", bidiMapIterator.toString());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey("Key"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertTrue(objectObjectMap.containsKey("Key"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue("Value"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertTrue(objectObjectMap.containsValue("Value"));
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap#createEntrySetIterator(Iterator)}
   */
  @Test
  public void testCreateEntrySetIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Map.Entry<Object, Object>> entryList = new ArrayList<>();

    // Act
    Iterator<Map.Entry<Object, Object>> actualCreateEntrySetIteratorResult = objectObjectMap
        .createEntrySetIterator(entryList.iterator());

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof AbstractDualBidiMap.EntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#createKeySetIterator(Iterator)}
   */
  @Test
  public void testCreateKeySetIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator(objectList.iterator());

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof AbstractDualBidiMap.KeySetIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#createValuesIterator(Iterator)}
   */
  @Test
  public void testCreateValuesIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator(objectList.iterator());

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof AbstractDualBidiMap.ValuesIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    Set<Map.Entry<Object, Object>> actualEntrySetResult = objectObjectMap.entrySet();

    // Assert
    assertTrue(actualEntrySetResult.isEmpty());
    assertSame(objectObjectMap.entrySet, actualEntrySetResult);
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.EntrySetIterator#EntrySetIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange
    ArrayList<Map.Entry<Object, Object>> entryList = new ArrayList<>();
    Iterator<Map.Entry<Object, Object>> iterator = entryList.iterator();

    // Act
    AbstractDualBidiMap.EntrySetIterator<Object, Object> actualEntrySetIterator = new AbstractDualBidiMap.EntrySetIterator<>(
        iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.EntrySetIterator#remove()}
   */
  @Test
  public void testEntrySetIteratorRemove() {
    // Arrange
    ArrayList<Map.Entry<Object, Object>> entryList = new ArrayList<>();
    Iterator<Map.Entry<Object, Object>> iterator = entryList.iterator();
    AbstractDualBidiMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractDualBidiMap.EntrySetIterator<>(
        iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.EntrySet#EntrySet(AbstractDualBidiMap)}
   */
  @Test
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    AbstractDualBidiMap.EntrySet<Object, Object> actualObjectSet = new AbstractDualBidiMap.EntrySet<>(
        new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get("Key"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#getKey(Object)}
   */
  @Test
  public void testGetKey() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getKey("Value"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    DualHashBidiMap<Object, Object> objectObjectMap2 = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    DualHashBidiMap<Object, Object> objectObjectMap2 = new DualHashBidiMap<>();
    objectObjectMap2.put("Key", "Value");

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#inverseBidiMap()}
   */
  @Test
  public void testInverseBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    BidiMap<Object, Object> actualInverseBidiMapResult = objectObjectMap.inverseBidiMap();

    // Assert
    assertTrue(actualInverseBidiMapResult.isEmpty());
    assertSame(objectObjectMap.inverseBidiMap, actualInverseBidiMapResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    Set<Object> actualKeySetResult = objectObjectMap.keySet();

    // Assert
    assertTrue(actualKeySetResult.isEmpty());
    assertSame(objectObjectMap.keySet, actualKeySetResult);
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.KeySetIterator#KeySetIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  public void testKeySetIteratorNewKeySetIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    AbstractDualBidiMap.KeySetIterator<Object> actualKeySetIterator = new AbstractDualBidiMap.KeySetIterator<>(iterator,
        new DualHashBidiMap<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.KeySetIterator#next()}
   */
  @Test
  public void testKeySetIteratorNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    AbstractDualBidiMap.KeySetIterator<Object> keySetIterator = new AbstractDualBidiMap.KeySetIterator<>(iterator,
        new DualHashBidiMap<>());

    // Act
    Object actualNextResult = keySetIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(keySetIterator.lastKey, actualNextResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.KeySetIterator#remove()}
   */
  @Test
  public void testKeySetIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    AbstractDualBidiMap.KeySetIterator<Object> keySetIterator = new AbstractDualBidiMap.KeySetIterator<>(iterator,
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> keySetIterator.remove());
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.KeySet#KeySet(AbstractDualBidiMap)}
   */
  @Test
  public void testKeySetNewKeySet() {
    // Arrange and Act
    AbstractDualBidiMap.KeySet<Object> actualObjectSet = new AbstractDualBidiMap.KeySet<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.MapEntry#MapEntry(Map.Entry, AbstractDualBidiMap)}
   */
  @Test
  public void testMapEntryNewMapEntry() {
    // Arrange
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    // Act and Assert
    assertEquals(entry, new AbstractDualBidiMap.MapEntry<>(entry, new DualHashBidiMap<>()));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.MapEntry#setValue(Object)}
   */
  @Test
  public void testMapEntrySetValue() {
    // Arrange
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    AbstractDualBidiMap.MapEntry<Object, Object> mapEntry = new AbstractDualBidiMap.MapEntry<>(entry,
        new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    assertEquals(entry, mapEntry);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.MapEntry#setValue(Object)}
   */
  @Test
  public void testMapEntrySetValue2() {
    // Arrange
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    AbstractDualBidiMap.MapEntry<Object, Object> entry2 = new AbstractDualBidiMap.MapEntry<>(entry,
        new DualHashBidiMap<>());

    AbstractDualBidiMap.MapEntry<Object, Object> mapEntry = new AbstractDualBidiMap.MapEntry<>(entry2,
        new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    assertEquals(entry, mapEntry);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.MapEntry#setValue(Object)}
   */
  @Test
  public void testMapEntrySetValue3() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    AbstractDualBidiMap.MapEntry<Object, Object> mapEntry = new AbstractDualBidiMap.MapEntry<>(
        new AbstractMap.SimpleEntry<>("42", "42"), parent);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> mapEntry.setValue("Value"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.MapEntry#setValue(Object)}
   */
  @Test
  public void testMapEntrySetValue4() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("42", "Value");
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    AbstractDualBidiMap.MapEntry<Object, Object> mapEntry = new AbstractDualBidiMap.MapEntry<>(entry, parent);

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    assertEquals(entry, mapEntry);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof AbstractDualBidiMap.BidiMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  public void testPut() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  public void testPut2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertEquals("Value", actualPutResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  public void testPut3() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put(1, "Value");

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertTrue(map.isEmpty());
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  public void testPutAll2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(1, map.size());
    assertTrue(map.containsKey("42"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  public void testPutAll3() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(42, "42");
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(2, map.size());
    assertTrue(map.containsKey("42"));
    assertTrue(map.containsKey(42));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  public void testPutAll4() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.putIfAbsent("42", "42");

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(1, map.size());
    assertTrue(map.containsKey("42"));
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Value", objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#removeValue(Object)}
   */
  @Test
  public void testRemoveValue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeValue("Value"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#removeValue(Object)}
   */
  @Test
  public void testRemoveValue2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.removeValue("Value"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    Set<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult.isEmpty());
    assertSame(objectObjectMap.values, actualValuesResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNotEquals(objectObjectMap, new DualHashBidiMap<>());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractDualBidiMap");
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.ValuesIterator#ValuesIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  public void testValuesIteratorNewValuesIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    AbstractDualBidiMap.ValuesIterator<Object> actualValuesIterator = new AbstractDualBidiMap.ValuesIterator<>(iterator,
        new DualHashBidiMap<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.ValuesIterator#next()}
   */
  @Test
  public void testValuesIteratorNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    AbstractDualBidiMap.ValuesIterator<Object> valuesIterator = new AbstractDualBidiMap.ValuesIterator<>(iterator,
        new DualHashBidiMap<>());

    // Act
    Object actualNextResult = valuesIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(valuesIterator.lastValue, actualNextResult);
  }

  /**
   * Method under test: {@link AbstractDualBidiMap.ValuesIterator#remove()}
   */
  @Test
  public void testValuesIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    AbstractDualBidiMap.ValuesIterator<Object> valuesIterator = new AbstractDualBidiMap.ValuesIterator<>(iterator,
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> valuesIterator.remove());
  }

  /**
   * Method under test:
   * {@link AbstractDualBidiMap.Values#Values(AbstractDualBidiMap)}
   */
  @Test
  public void testValuesNewValues() {
    // Arrange and Act
    AbstractDualBidiMap.Values<Object> actualObjectSet = new AbstractDualBidiMap.Values<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
