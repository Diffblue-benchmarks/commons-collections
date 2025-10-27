package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.KeyValue;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.junit.Test;

public class SingletonMapDiffblueTest {
  /**
   * Method under test: {@link SingletonMap#clear()}
   */
  @Test
  public void testClear() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.clear());
  }

  /**
   * Method under test: {@link SingletonMap#clone()}
   */
  @Test
  public void testClone() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act
    SingletonMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(1, actualCloneResult.size());
    assertNull(actualCloneResult.get(null));
  }

  /**
   * Method under test: {@link SingletonMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    objectObjectMap.setValue(AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.entrySet().size());
  }

  /**
   * Method under test: {@link SingletonMap#firstKey()}
   */
  @Test
  public void testFirstKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.firstKey());
  }

  /**
   * Method under test: {@link SingletonMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonMap#equals(Object)}
   *   <li>{@link SingletonMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    SingletonMap<Object, Object> objectObjectMap2 = new SingletonMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonMap#equals(Object)}
   *   <li>{@link SingletonMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Method under test: {@link SingletonMap#isEqualKey(Object)}
   */
  @Test
  public void testIsEqualKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#isEqualValue(Object)}
   */
  @Test
  public void testIsEqualValue() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#isEqualValue(Object)}
   */
  @Test
  public void testIsEqualValue2() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    objectObjectMap.setValue(AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.keySet().size());
  }

  /**
   * Method under test: {@link SingletonMap#lastKey()}
   */
  @Test
  public void testLastKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.lastKey());
  }

  /**
   * Method under test: {@link SingletonMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof SingletonMap.SingletonMapIterator);
    assertNull(actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link SingletonMap#maxSize()}
   */
  @Test
  public void testMaxSize() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.maxSize());
  }

  /**
   * Method under test: {@link SingletonMap#nextKey(Object)}
   */
  @Test
  public void testNextKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#put(Object, Object)}
   */
  @Test
  public void testPut() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(1, objectObjectMap.size());
    assertTrue(map.isEmpty());
  }

  /**
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  public void testPutAll2() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.putAll(map));
  }

  /**
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  public void testPutAll3() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(null, AbstractHashedMap.NULL);

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, map.size());
    assertEquals(1, objectObjectMap.size());
    assertTrue(map.containsKey(null));
    Object expectedGetResult = map.get(null);
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  public void testPutAll4() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.putAll(map));
  }

  /**
   * Method under test: {@link SingletonMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.remove(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#getKey()}
   */
  @Test
  public void testSingletonMapIteratorGetKey() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonMapIterator.getKey());
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#getValue()}
   */
  @Test
  public void testSingletonMapIteratorGetValue() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonMapIterator.getValue());
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#hasPrevious()}
   */
  @Test
  public void testSingletonMapIteratorHasPrevious() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertFalse(singletonMapIterator.hasPrevious());
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#next()}
   */
  @Test
  public void testSingletonMapIteratorNext() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertNull(singletonMapIterator.next());
    assertFalse(singletonMapIterator.hasNext());
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#previous()}
   */
  @Test
  public void testSingletonMapIteratorPrevious() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> singletonMapIterator.previous());
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#remove()}
   */
  @Test
  public void testSingletonMapIteratorRemove() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonMapIterator.remove());
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#setValue(Object)}
   */
  @Test
  public void testSingletonMapIteratorSetValue() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link SingletonMap.SingletonMapIterator#toString()}
   */
  @Test
  public void testSingletonMapIteratorToString() {
    // Arrange
    SingletonMap.SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMap.SingletonMapIterator<>(
        new SingletonMap<>());

    // Act and Assert
    assertEquals("Iterator[]", singletonMapIterator.toString());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonMap.SingletonValues#SingletonValues(SingletonMap)}
   *   <li>{@link SingletonMap.SingletonValues#isEmpty()}
   *   <li>{@link SingletonMap.SingletonValues#size()}
   * </ul>
   */
  @Test
  public void testSingletonValuesGettersAndSetters() {
    // Arrange and Act
    SingletonMap.SingletonValues<Object> actualObjectSet = new SingletonMap.SingletonValues<>(new SingletonMap<>());
    boolean actualIsEmptyResult = actualObjectSet.isEmpty();

    // Assert
    assertEquals(1, actualObjectSet.size());
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Method under test: {@link SingletonMap#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals("{null=null}", objectObjectMap.toString());
  }

  /**
   * Method under test: {@link SingletonMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act
    Collection<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult instanceof Set);
    assertEquals(1, actualValuesResult.size());
  }

  /**
   * Method under test: {@link SingletonMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    objectObjectMap.setValue(AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new SingletonMap<>());
  }

  /**
   * Method under test: {@link SingletonMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Method under test: {@link SingletonMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to SingletonMap");
  }

  /**
   * Method under test: {@link SingletonMap#SingletonMap(KeyValue)}
   */
  @Test
  public void testNewSingletonMap() {
    // Arrange and Act
    SingletonMap<Object, Object> actualObjectObjectMap = new SingletonMap<>(new DefaultKeyValue<>());

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertNull(actualObjectObjectMap.get(null));
  }

  /**
   * Method under test: {@link SingletonMap#SingletonMap(KeyValue)}
   */
  @Test
  public void testNewSingletonMap2() {
    // Arrange and Act
    SingletonMap<Object, Object> actualObjectObjectMap = new SingletonMap<>(
        (KeyValue<Object, Object>) new SingletonMap<>());

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertNull(actualObjectObjectMap.get(null));
  }
}
