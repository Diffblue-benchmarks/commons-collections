package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.KeyValue;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.apache.commons.collections4.map.SingletonMap.SingletonMapIterator;
import org.apache.commons.collections4.map.SingletonMap.SingletonValues;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SingletonMapDiffblueTest {
  /**
   * Test {@link SingletonMap#SingletonMap(Map)}.
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#SingletonMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.<init>(Map)"})
  public void testNewSingletonMap_givenNull_whenHashMapNullIsNull_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(map, new SingletonMap<>(map));
  }

  /**
   * Test {@link SingletonMap#SingletonMap(KeyValue)}.
   * <ul>
   *   <li>When {@link DefaultKeyValue#DefaultKeyValue()}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#SingletonMap(KeyValue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.<init>(KeyValue)"})
  public void testNewSingletonMap_whenDefaultKeyValue_thenReturnSizeIsOne() {
    // Arrange and Act
    SingletonMap<Object, Object> actualObjectObjectMap = new SingletonMap<>(new DefaultKeyValue<>());

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertNull(actualObjectObjectMap.get(null));
  }

  /**
   * Test {@link SingletonMap#SingletonMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#SingletonMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.<init>(Map)"})
  public void testNewSingletonMap_whenHashMap_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new SingletonMap<>(new HashMap<>()));
  }

  /**
   * Test {@link SingletonMap#SingletonMap(KeyValue)}.
   * <ul>
   *   <li>When {@link SingletonMap#SingletonMap()}.</li>
   *   <li>Then return {@link SingletonMap#SingletonMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#SingletonMap(KeyValue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.<init>(KeyValue)"})
  public void testNewSingletonMap_whenSingletonMap_thenReturnSingletonMap() {
    // Arrange
    SingletonMap<Object, Object> keyValue = new SingletonMap<>();

    // Act and Assert
    assertEquals(keyValue, new SingletonMap<>((KeyValue<Object, Object>) keyValue));
  }

  /**
   * Test {@link SingletonMap#clear()}.
   * <p>
   * Method under test: {@link SingletonMap#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.clear()"})
  public void testClear() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.clear());
  }

  /**
   * Test {@link SingletonMap#clone()}.
   * <p>
   * Method under test: {@link SingletonMap#clone()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SingletonMap SingletonMap.clone()"})
  public void testClone() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.clone());
  }

  /**
   * Test {@link SingletonMap#containsKey(Object)}.
   * <p>
   * Method under test: {@link SingletonMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.containsKey(Object)"})
  public void testContainsKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link SingletonMap#SingletonMap()} Value is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.containsValue(Object)"})
  public void testContainsValue_givenSingletonMapValueIsNull_thenReturnTrue() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    objectObjectMap.setValue(AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link SingletonMap#SingletonMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.containsValue(Object)"})
  public void testContainsValue_givenSingletonMap_thenReturnFalse() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#entrySet()}.
   * <p>
   * Method under test: {@link SingletonMap#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SingletonMap.entrySet()"})
  public void testEntrySet() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.entrySet().size());
  }

  /**
   * Test {@link SingletonMap#equals(Object)}, and {@link SingletonMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonMap#equals(Object)}
   *   <li>{@link SingletonMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.equals(Object)", "int SingletonMap.hashCode()"})
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
   * Test {@link SingletonMap#equals(Object)}, and {@link SingletonMap#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonMap#equals(Object)}
   *   <li>{@link SingletonMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.equals(Object)", "int SingletonMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link SingletonMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.equals(Object)", "int SingletonMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    objectObjectMap.setValue(AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new SingletonMap<>());
  }

  /**
   * Test {@link SingletonMap#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.equals(Object)", "int SingletonMap.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link SingletonMap#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.equals(Object)", "int SingletonMap.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to SingletonMap");
  }

  /**
   * Test {@link SingletonMap#firstKey()}.
   * <p>
   * Method under test: {@link SingletonMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.firstKey()"})
  public void testFirstKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.firstKey());
  }

  /**
   * Test {@link SingletonMap#get(Object)}.
   * <p>
   * Method under test: {@link SingletonMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.get(Object)"})
  public void testGet() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#isEqualKey(Object)}.
   * <p>
   * Method under test: {@link SingletonMap#isEqualKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.isEqualKey(Object)"})
  public void testIsEqualKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#isEqualValue(Object)}.
   * <ul>
   *   <li>Given {@link SingletonMap#SingletonMap()} Value is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#isEqualValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.isEqualValue(Object)"})
  public void testIsEqualValue_givenSingletonMapValueIsNull_thenReturnTrue() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    objectObjectMap.setValue(AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#isEqualValue(Object)}.
   * <ul>
   *   <li>Given {@link SingletonMap#SingletonMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#isEqualValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMap.isEqualValue(Object)"})
  public void testIsEqualValue_givenSingletonMap_thenReturnFalse() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#keySet()}.
   * <p>
   * Method under test: {@link SingletonMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set SingletonMap.keySet()"})
  public void testKeySet() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.keySet().size());
  }

  /**
   * Test {@link SingletonMap#lastKey()}.
   * <p>
   * Method under test: {@link SingletonMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.lastKey()"})
  public void testLastKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.lastKey());
  }

  /**
   * Test {@link SingletonMap#mapIterator()}.
   * <p>
   * Method under test: {@link SingletonMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator SingletonMap.mapIterator()"})
  public void testMapIterator() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof SingletonMapIterator);
    assertNull(actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link SingletonMap#maxSize()}.
   * <p>
   * Method under test: {@link SingletonMap#maxSize()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int SingletonMap.maxSize()"})
  public void testMaxSize() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.maxSize());
  }

  /**
   * Test {@link SingletonMap#nextKey(Object)}.
   * <p>
   * Method under test: {@link SingletonMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.nextKey(Object)"})
  public void testNextKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#previousKey(Object)}.
   * <p>
   * Method under test: {@link SingletonMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.previousKey(Object)"})
  public void testPreviousKey() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#put(Object, Object)}.
   * <p>
   * Method under test: {@link SingletonMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.put(Object, Object)"})
  public void testPut() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link SingletonMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then {@link HashMap#HashMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.putAll(Map)"})
  public void testPutAll_givenNull_whenHashMapNullIsNull_thenHashMapSizeIsOne() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(null, AbstractHashedMap.NULL);

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, map.size());
    assertTrue(map.containsKey(null));
  }

  /**
   * Test {@link SingletonMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.putAll(Map)"})
  public void testPutAll_givenNull_whenHashMapNullIsNull_thenThrowIllegalArgumentException() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.putAll(map));
  }

  /**
   * Test {@link SingletonMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.putAll(Map)"})
  public void testPutAll_givenNull_whenHashMapNullIsNull_thenThrowIllegalArgumentException2() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.putAll(map));
  }

  /**
   * Test {@link SingletonMap#putAll(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link HashMap#HashMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMap.putAll(Map)"})
  public void testPutAll_whenHashMap_thenHashMapEmpty() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertTrue(map.isEmpty());
  }

  /**
   * Test {@link SingletonMap#remove(Object)} with {@code Object}.
   * <p>
   * Method under test: {@link SingletonMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMap.remove(Object)"})
  public void testRemoveWithObject() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.remove(AbstractHashedMap.NULL));
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#getKey()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMapIterator.getKey()"})
  public void testSingletonMapIteratorGetKey() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonMapIterator.getKey());
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#getValue()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMapIterator.getValue()"})
  public void testSingletonMapIteratorGetValue() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonMapIterator.getValue());
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonMapIterator.hasPrevious()"})
  public void testSingletonMapIteratorHasPrevious() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertFalse(singletonMapIterator.hasPrevious());
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#next()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMapIterator.next()"})
  public void testSingletonMapIteratorNext() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertNull(singletonMapIterator.next());
    assertFalse(singletonMapIterator.hasNext());
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#previous()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMapIterator.previous()"})
  public void testSingletonMapIteratorPrevious() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> singletonMapIterator.previous());
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#remove()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonMapIterator.remove()"})
  public void testSingletonMapIteratorRemove() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonMapIterator.remove());
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link SingletonMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonMapIterator.setValue(Object)"})
  public void testSingletonMapIteratorSetValue() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test SingletonMapIterator {@link SingletonMapIterator#toString()}.
   * <p>
   * Method under test: {@link SingletonMapIterator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String SingletonMapIterator.toString()"})
  public void testSingletonMapIteratorToString() {
    // Arrange
    SingletonMapIterator<Object, Object> singletonMapIterator = new SingletonMapIterator<>(new SingletonMap<>());

    // Act and Assert
    assertEquals("Iterator[]", singletonMapIterator.toString());
  }

  /**
   * Test SingletonValues getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonValues#SingletonValues(SingletonMap)}
   *   <li>{@link SingletonValues#isEmpty()}
   *   <li>{@link SingletonValues#size()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonValues.<init>(SingletonMap)", "boolean SingletonValues.isEmpty()",
      "int SingletonValues.size()"})
  public void testSingletonValuesGettersAndSetters() {
    // Arrange and Act
    SingletonValues<Object> actualObjectSet = new SingletonValues<>(new SingletonMap<>());
    boolean actualIsEmptyResult = actualObjectSet.isEmpty();

    // Assert
    assertEquals(1, actualObjectSet.size());
    assertFalse(actualIsEmptyResult);
  }

  /**
   * Test {@link SingletonMap#toString()}.
   * <p>
   * Method under test: {@link SingletonMap#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String SingletonMap.toString()"})
  public void testToString() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act and Assert
    assertEquals("{null=null}", objectObjectMap.toString());
  }

  /**
   * Test {@link SingletonMap#values()}.
   * <p>
   * Method under test: {@link SingletonMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection SingletonMap.values()"})
  public void testValues() {
    // Arrange
    SingletonMap<Object, Object> objectObjectMap = new SingletonMap<>();

    // Act
    Collection<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult instanceof Set);
    assertEquals(1, actualValuesResult.size());
  }
}
