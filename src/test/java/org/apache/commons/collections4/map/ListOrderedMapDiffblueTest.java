package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;

public class ListOrderedMapDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ListOrderedMap.EntrySetView#EntrySetView(ListOrderedMap, List)}
   *   <li>{@link ListOrderedMap.EntrySetView#toString()}
   * </ul>
   */
  @Test
  public void testEntrySetViewGettersAndSetters() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    // Act
    ListOrderedMap.EntrySetView<Object, Object> actualObjectSet = new ListOrderedMap.EntrySetView<>(parent,
        new ArrayList<>());

    // Assert
    assertEquals("[]", actualObjectSet.toString());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.KeySetView#KeySetView(ListOrderedMap)}
   */
  @Test
  public void testKeySetViewNewKeySetView() {
    // Arrange and Act
    ListOrderedMap.KeySetView<Object> actualObjectSet = new ListOrderedMap.KeySetView<>(new ListOrderedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}
   */
  @Test
  public void testListOrderedIteratorNewListOrderedIterator() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    // Act
    ListOrderedMap.ListOrderedIterator<Object, Object> actualListOrderedIterator = new ListOrderedMap.ListOrderedIterator<>(
        parent, new ArrayList<>());

    // Assert
    assertFalse(actualListOrderedIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}
   */
  @Test
  public void testListOrderedIteratorNewListOrderedIterator2() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    ArrayList<Object> insertOrder = new ArrayList<>();
    insertOrder.add(AbstractHashedMap.NULL);

    // Act
    ListOrderedMap.ListOrderedIterator<Object, Object> actualListOrderedIterator = new ListOrderedMap.ListOrderedIterator<>(
        parent, insertOrder);

    // Assert
    Map.Entry<Object, Object> nextResult = actualListOrderedIterator.next();
    assertTrue(nextResult instanceof ListOrderedMap.ListOrderedMapEntry);
    assertNull(nextResult.getValue());
    assertFalse(actualListOrderedIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}
   */
  @Test
  public void testListOrderedIteratorNewListOrderedIterator3() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    ArrayList<Object> insertOrder = new ArrayList<>();
    insertOrder.add(AbstractHashedMap.NULL);
    insertOrder.add(AbstractHashedMap.NULL);

    // Act
    ListOrderedMap.ListOrderedIterator<Object, Object> actualListOrderedIterator = new ListOrderedMap.ListOrderedIterator<>(
        parent, insertOrder);

    // Assert
    Map.Entry<Object, Object> nextResult = actualListOrderedIterator.next();
    assertTrue(nextResult instanceof ListOrderedMap.ListOrderedMapEntry);
    Map.Entry<Object, Object> nextResult2 = actualListOrderedIterator.next();
    assertTrue(nextResult2 instanceof ListOrderedMap.ListOrderedMapEntry);
    assertNull(nextResult.getValue());
    assertFalse(actualListOrderedIterator.hasNext());
    assertEquals(nextResult, nextResult2);
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedIterator#next()}
   */
  @Test
  public void testListOrderedIteratorNext() {
    // Arrange
    ArrayList<Object> insertOrder = new ArrayList<>();
    insertOrder.add(AbstractHashedMap.NULL);
    ListOrderedMap.ListOrderedIterator<Object, Object> listOrderedIterator = new ListOrderedMap.ListOrderedIterator<>(
        new ListOrderedMap<>(), insertOrder);

    // Act
    Map.Entry<Object, Object> actualNextResult = listOrderedIterator.next();

    // Assert
    assertTrue(actualNextResult instanceof ListOrderedMap.ListOrderedMapEntry);
    assertNull(actualNextResult.getValue());
    assertFalse(listOrderedIterator.hasNext());
  }

  /**
   * Method under test: {@link ListOrderedMap#listOrderedMap(Map)}
   */
  @Test
  public void testListOrderedMap() {
    // Arrange and Act
    ListOrderedMap<Object, Object> actualListOrderedMapResult = ListOrderedMap.listOrderedMap(new HashMap<>());

    // Assert
    assertTrue(actualListOrderedMapResult.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#asList()}
   */
  @Test
  public void testAsList() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.asList().isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#firstKey()}
   */
  @Test
  public void testFirstKey() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.firstKey());
  }

  /**
   * Method under test: {@link ListOrderedMap#indexOf(Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ListOrderedMap#keyList()}
   */
  @Test
  public void testKeyList() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keyList().isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#lastKey()}
   */
  @Test
  public void testLastKey() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.lastKey());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapEntry#getValue()}
   */
  @Test
  public void testListOrderedMapEntryGetValue() {
    // Arrange
    ListOrderedMap.ListOrderedMapEntry<Object, Object> listOrderedMapEntry = new ListOrderedMap.ListOrderedMapEntry<>(
        new ListOrderedMap<>(), AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(listOrderedMapEntry.getValue());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedMapEntry#ListOrderedMapEntry(ListOrderedMap, Object)}
   */
  @Test
  public void testListOrderedMapEntryNewListOrderedMapEntry() {
    // Arrange
    Object object = AbstractHashedMap.NULL;

    // Act
    ListOrderedMap.ListOrderedMapEntry<Object, Object> actualListOrderedMapEntry = new ListOrderedMap.ListOrderedMapEntry<>(
        new ListOrderedMap<>(), object);

    // Assert
    assertNull(actualListOrderedMapEntry.getValue());
    assertSame(object, actualListOrderedMapEntry.getKey());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedMapEntry#setValue(Object)}
   */
  @Test
  public void testListOrderedMapEntrySetValue() {
    // Arrange
    ListOrderedMap.ListOrderedMapEntry<Object, Object> listOrderedMapEntry = new ListOrderedMap.ListOrderedMapEntry<>(
        new ListOrderedMap<>(), AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(listOrderedMapEntry.setValue(object));
    assertSame(object, listOrderedMapEntry.getValue());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#getKey()}
   */
  @Test
  public void testListOrderedMapIteratorGetKey() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.getKey());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#getValue()}
   */
  @Test
  public void testListOrderedMapIteratorGetValue() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.getValue());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#hasNext()}
   */
  @Test
  public void testListOrderedMapIteratorHasNext() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertFalse(listOrderedMapIterator.hasNext());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#hasNext()}
   */
  @Test
  public void testListOrderedMapIteratorHasNext2() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        parent);

    // Act and Assert
    assertTrue(listOrderedMapIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedMapIterator#hasPrevious()}
   */
  @Test
  public void testListOrderedMapIteratorHasPrevious() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertFalse(listOrderedMapIterator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedMapIterator#ListOrderedMapIterator(ListOrderedMap)}
   */
  @Test
  public void testListOrderedMapIteratorNewListOrderedMapIterator() {
    // Arrange and Act
    ListOrderedMap.ListOrderedMapIterator<Object, Object> actualListOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Assert
    assertFalse(actualListOrderedMapIterator.hasNext());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#next()}
   */
  @Test
  public void testListOrderedMapIteratorNext() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        parent);

    // Act
    listOrderedMapIterator.next();

    // Assert
    assertFalse(listOrderedMapIterator.hasNext());
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#remove()}
   */
  @Test
  public void testListOrderedMapIteratorRemove() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.remove());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ListOrderedMapIterator#setValue(Object)}
   */
  @Test
  public void testListOrderedMapIteratorSetValue() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ListOrderedMap.ListOrderedMapIterator#toString()}
   */
  @Test
  public void testListOrderedMapIteratorToString() {
    // Arrange
    ListOrderedMap.ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMap.ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertEquals("Iterator[]", listOrderedMapIterator.toString());
  }

  /**
   * Method under test: {@link ListOrderedMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof ListOrderedMap.ListOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link ListOrderedMap#nextKey(Object)}
   */
  @Test
  public void testNextKey() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ListOrderedMap#nextKey(Object)}
   */
  @Test
  public void testNextKey2() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ListOrderedMap#nextKey(Object)}
   */
  @Test
  public void testNextKey3() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(0, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put("Key", AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals("Key", objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ListOrderedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ListOrderedMap#remove(int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    objectObjectMap.remove(0);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveResult);
  }

  /**
   * Method under test: {@link ListOrderedMap#setValue(int, Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.setValue(0, object));
  }

  /**
   * Method under test: {@link ListOrderedMap#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Method under test: {@link ListOrderedMap#valueList()}
   */
  @Test
  public void testValueList() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.valueList().isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act
    Collection<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult instanceof List);
    assertTrue(actualValuesResult.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#ListOrderedMap()}
   */
  @Test
  public void testNewListOrderedMap() {
    // Arrange and Act
    ListOrderedMap<Object, Object> actualObjectObjectMap = new ListOrderedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedMap#ListOrderedMap(Map)}
   */
  @Test
  public void testNewListOrderedMap2() {
    // Arrange and Act
    ListOrderedMap<Object, Object> actualObjectObjectMap = new ListOrderedMap<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ListOrderedMap.ValuesView#ValuesView(ListOrderedMap)}
   */
  @Test
  public void testValuesViewNewValuesView() {
    // Arrange and Act
    ListOrderedMap.ValuesView<Object> actualObjectList = new ListOrderedMap.ValuesView<>(new ListOrderedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }
}
