package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.map.ListOrderedMap.EntrySetView;
import org.apache.commons.collections4.map.ListOrderedMap.KeySetView;
import org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator;
import org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry;
import org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator;
import org.apache.commons.collections4.map.ListOrderedMap.ValuesView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ListOrderedMapDiffblueTest {
  /**
   * Test EntrySetView getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EntrySetView#EntrySetView(ListOrderedMap, List)}
   *   <li>{@link EntrySetView#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test EntrySetView getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EntrySetView.<init>(ListOrderedMap, List)", "java.lang.String EntrySetView.toString()"})
  void testEntrySetViewGettersAndSetters() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    // Act
    EntrySetView<Object, Object> actualObjectSet = new EntrySetView<>(parent, new ArrayList<>());

    // Assert
    assertEquals("[]", actualObjectSet.toString());
  }

  /**
   * Test KeySetView {@link KeySetView#KeySetView(ListOrderedMap)}.
   * <p>
   * Method under test: {@link KeySetView#KeySetView(ListOrderedMap)}
   */
  @Test
  @DisplayName("Test KeySetView new KeySetView(ListOrderedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void KeySetView.<init>(ListOrderedMap)"})
  void testKeySetViewNewKeySetView() {
    // Arrange and Act
    KeySetView<Object> actualObjectSet = new KeySetView<>(new ListOrderedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test ListOrderedIterator {@link ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}.
   * <ul>
   *   <li>Then next return {@link ListOrderedMapEntry}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}
   */
  @Test
  @DisplayName("Test ListOrderedIterator new ListOrderedIterator(ListOrderedMap, List); then next return ListOrderedMapEntry")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedIterator.<init>(ListOrderedMap, List)"})
  void testListOrderedIteratorNewListOrderedIterator_thenNextReturnListOrderedMapEntry() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    ArrayList<Object> insertOrder = new ArrayList<>();
    insertOrder.add(AbstractHashedMap.NULL);

    // Act
    ListOrderedIterator<Object, Object> actualListOrderedIterator = new ListOrderedIterator<>(parent, insertOrder);

    // Assert
    Entry<Object, Object> nextResult = actualListOrderedIterator.next();
    assertTrue(nextResult instanceof ListOrderedMapEntry);
    assertNull(nextResult.getValue());
    assertFalse(actualListOrderedIterator.hasNext());
  }

  /**
   * Test ListOrderedIterator {@link ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedIterator#ListOrderedIterator(ListOrderedMap, List)}
   */
  @Test
  @DisplayName("Test ListOrderedIterator new ListOrderedIterator(ListOrderedMap, List); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedIterator.<init>(ListOrderedMap, List)"})
  void testListOrderedIteratorNewListOrderedIterator_whenArrayList() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();

    // Act
    ListOrderedIterator<Object, Object> actualListOrderedIterator = new ListOrderedIterator<>(parent,
        new ArrayList<>());

    // Assert
    assertFalse(actualListOrderedIterator.hasNext());
  }

  /**
   * Test ListOrderedIterator {@link ListOrderedIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link ListOrderedMapEntry}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedIterator#next()}
   */
  @Test
  @DisplayName("Test ListOrderedIterator next(); given ArrayList() add NULL; then return ListOrderedMapEntry")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Entry ListOrderedIterator.next()"})
  void testListOrderedIteratorNext_givenArrayListAddNull_thenReturnListOrderedMapEntry() {
    // Arrange
    ArrayList<Object> insertOrder = new ArrayList<>();
    insertOrder.add(AbstractHashedMap.NULL);
    ListOrderedIterator<Object, Object> listOrderedIterator = new ListOrderedIterator<>(new ListOrderedMap<>(),
        insertOrder);

    // Act
    Entry<Object, Object> actualNextResult = listOrderedIterator.next();

    // Assert
    assertTrue(actualNextResult instanceof ListOrderedMapEntry);
    assertNull(actualNextResult.getValue());
    assertFalse(listOrderedIterator.hasNext());
  }

  /**
   * Test {@link ListOrderedMap#listOrderedMap(Map)}.
   * <p>
   * Method under test: {@link ListOrderedMap#listOrderedMap(Map)}
   */
  @Test
  @DisplayName("Test listOrderedMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListOrderedMap ListOrderedMap.listOrderedMap(Map)"})
  void testListOrderedMap() {
    // Arrange and Act
    ListOrderedMap<Object, Object> actualListOrderedMapResult = ListOrderedMap.listOrderedMap(new HashMap<>());

    // Assert
    assertEquals(actualListOrderedMapResult.map, actualListOrderedMapResult);
  }

  /**
   * Test ListOrderedMapEntry {@link ListOrderedMapEntry#getValue()}.
   * <p>
   * Method under test: {@link ListOrderedMapEntry#getValue()}
   */
  @Test
  @DisplayName("Test ListOrderedMapEntry getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMapEntry.getValue()"})
  void testListOrderedMapEntryGetValue() {
    // Arrange
    ListOrderedMapEntry<Object, Object> listOrderedMapEntry = new ListOrderedMapEntry<>(new ListOrderedMap<>(),
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(listOrderedMapEntry.getValue());
  }

  /**
   * Test ListOrderedMapEntry {@link ListOrderedMapEntry#ListOrderedMapEntry(ListOrderedMap, Object)}.
   * <p>
   * Method under test: {@link ListOrderedMapEntry#ListOrderedMapEntry(ListOrderedMap, Object)}
   */
  @Test
  @DisplayName("Test ListOrderedMapEntry new ListOrderedMapEntry(ListOrderedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedMapEntry.<init>(ListOrderedMap, Object)"})
  void testListOrderedMapEntryNewListOrderedMapEntry() {
    // Arrange
    Object object = AbstractHashedMap.NULL;

    // Act
    ListOrderedMapEntry<Object, Object> actualListOrderedMapEntry = new ListOrderedMapEntry<>(new ListOrderedMap<>(),
        object);

    // Assert
    assertNull(actualListOrderedMapEntry.getValue());
    assertSame(object, actualListOrderedMapEntry.getKey());
  }

  /**
   * Test ListOrderedMapEntry {@link ListOrderedMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link ListOrderedMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test ListOrderedMapEntry setValue(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMapEntry.setValue(Object)"})
  void testListOrderedMapEntrySetValue() {
    // Arrange
    ListOrderedMapEntry<Object, Object> listOrderedMapEntry = new ListOrderedMapEntry<>(new ListOrderedMap<>(),
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(listOrderedMapEntry.setValue(object));
    assertSame(object, listOrderedMapEntry.getValue());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#getKey()}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator getKey()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMapIterator.getKey()"})
  void testListOrderedMapIteratorGetKey() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.getKey());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#getValue()}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMapIterator.getValue()"})
  void testListOrderedMapIteratorGetValue() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.getValue());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator hasNext(); given ListOrderedMap() NULL is NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedMapIterator.hasNext()"})
  void testListOrderedMapIteratorHasNext_givenListOrderedMapNullIsNull_thenReturnTrue() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(parent);

    // Act and Assert
    assertTrue(listOrderedMapIterator.hasNext());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedMapIterator.hasNext()"})
  void testListOrderedMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertFalse(listOrderedMapIterator.hasNext());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ListOrderedMapIterator.hasPrevious()"})
  void testListOrderedMapIteratorHasPrevious() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertFalse(listOrderedMapIterator.hasPrevious());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#ListOrderedMapIterator(ListOrderedMap)}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#ListOrderedMapIterator(ListOrderedMap)}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator new ListOrderedMapIterator(ListOrderedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedMapIterator.<init>(ListOrderedMap)"})
  void testListOrderedMapIteratorNewListOrderedMapIterator() {
    // Arrange and Act
    ListOrderedMapIterator<Object, Object> actualListOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Assert
    assertFalse(actualListOrderedMapIterator.hasNext());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#next()}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#next()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator next()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMapIterator.next()"})
  void testListOrderedMapIteratorNext() {
    // Arrange
    ListOrderedMap<Object, Object> parent = new ListOrderedMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(parent);

    // Act
    listOrderedMapIterator.next();

    // Assert
    assertFalse(listOrderedMapIterator.hasNext());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#remove()}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#remove()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedMapIterator.remove()"})
  void testListOrderedMapIteratorRemove() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.remove());
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator setValue(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMapIterator.setValue(Object)"})
  void testListOrderedMapIteratorSetValue() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> listOrderedMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test ListOrderedMapIterator {@link ListOrderedMapIterator#toString()}.
   * <p>
   * Method under test: {@link ListOrderedMapIterator#toString()}
   */
  @Test
  @DisplayName("Test ListOrderedMapIterator toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String ListOrderedMapIterator.toString()"})
  void testListOrderedMapIteratorToString() {
    // Arrange
    ListOrderedMapIterator<Object, Object> listOrderedMapIterator = new ListOrderedMapIterator<>(
        new ListOrderedMap<>());

    // Act and Assert
    assertEquals("Iterator[]", listOrderedMapIterator.toString());
  }

  /**
   * Test {@link ListOrderedMap#ListOrderedMap()}.
   * <p>
   * Method under test: {@link ListOrderedMap#ListOrderedMap()}
   */
  @Test
  @DisplayName("Test new ListOrderedMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedMap.<init>()"})
  void testNewListOrderedMap() {
    // Arrange and Act
    ListOrderedMap<Object, Object> actualObjectObjectMap = new ListOrderedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#ListOrderedMap(Map)}.
   * <p>
   * Method under test: {@link ListOrderedMap#ListOrderedMap(Map)}
   */
  @Test
  @DisplayName("Test new ListOrderedMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ListOrderedMap.<init>(Map)"})
  void testNewListOrderedMap2() {
    // Arrange and Act
    ListOrderedMap<Object, Object> actualObjectObjectMap = new ListOrderedMap<>(new HashMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link ListOrderedMap#asList()}.
   * <p>
   * Method under test: {@link ListOrderedMap#asList()}
   */
  @Test
  @DisplayName("Test asList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ListOrderedMap.asList()"})
  void testAsList() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.asList().isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#entrySet()}.
   * <p>
   * Method under test: {@link ListOrderedMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set ListOrderedMap.entrySet()"})
  void testEntrySet() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#firstKey()}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given ListOrderedMap(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.firstKey()"})
  void testFirstKey_givenListOrderedMap_thenThrowNoSuchElementException() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.firstKey());
  }

  /**
   * Test {@link ListOrderedMap#indexOf(Object)}.
   * <p>
   * Method under test: {@link ListOrderedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ListOrderedMap.indexOf(Object)"})
  void testIndexOf() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ListOrderedMap#keyList()}.
   * <p>
   * Method under test: {@link ListOrderedMap#keyList()}
   */
  @Test
  @DisplayName("Test keyList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ListOrderedMap.keyList()"})
  void testKeyList() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keyList().isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#keySet()}.
   * <p>
   * Method under test: {@link ListOrderedMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set ListOrderedMap.keySet()"})
  void testKeySet() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#lastKey()}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given ListOrderedMap(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.lastKey()"})
  void testLastKey_givenListOrderedMap_thenThrowNoSuchElementException() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.lastKey());
  }

  /**
   * Test {@link ListOrderedMap#mapIterator()}.
   * <p>
   * Method under test: {@link ListOrderedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedMapIterator ListOrderedMap.mapIterator()"})
  void testMapIterator() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof ListOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link ListOrderedMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given ListOrderedMap() NULL is NULL; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.nextKey(Object)"})
  void testNextKey_givenListOrderedMapNullIsNull_thenReturnNull() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ListOrderedMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given ListOrderedMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.nextKey(Object)"})
  void testNextKey_givenListOrderedMap_thenReturnNull() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ListOrderedMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#put(int, Object, Object)} with index is zero and key is {@link AbstractHashedMap#NULL} and value is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given put(int, Object, Object) with index is zero and key is NULL and value is NULL; then return 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.nextKey(Object)"})
  void testNextKey_givenPutWithIndexIsZeroAndKeyIsNullAndValueIsNull_thenReturnKey() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(0, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put("Key", AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals("Key", objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ListOrderedMap#previousKey(Object)}.
   * <p>
   * Method under test: {@link ListOrderedMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.previousKey(Object)"})
  void testPreviousKey() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ListOrderedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then {@link ListOrderedMap#ListOrderedMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; given ListOrderedMap() NULL is NULL; then ListOrderedMap() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.remove(int)"})
  void testRemoveWithIndex_givenListOrderedMapNullIsNull_thenListOrderedMapEmpty() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    objectObjectMap.remove(0);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#remove(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'key'; given ListOrderedMap() NULL is NULL; then return NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.remove(Object)"})
  void testRemoveWithKey_givenListOrderedMapNullIsNull_thenReturnNull() {
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
   * Test {@link ListOrderedMap#remove(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'key'; given ListOrderedMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.remove(Object)"})
  void testRemoveWithKey_givenListOrderedMap_thenReturnNull() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#setValue(int, Object)}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#setValue(int, Object)}
   */
  @Test
  @DisplayName("Test setValue(int, Object); given ListOrderedMap() NULL is NULL; when zero; then return NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ListOrderedMap.setValue(int, Object)"})
  void testSetValue_givenListOrderedMapNullIsNull_whenZero_thenReturnNull() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.setValue(0, object));
  }

  /**
   * Test {@link ListOrderedMap#toString()}.
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.</li>
   *   <li>Then return {@code {}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListOrderedMap#toString()}
   */
  @Test
  @DisplayName("Test toString(); given ListOrderedMap(); then return '{}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String ListOrderedMap.toString()"})
  void testToString_givenListOrderedMap_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link ListOrderedMap#valueList()}.
   * <p>
   * Method under test: {@link ListOrderedMap#valueList()}
   */
  @Test
  @DisplayName("Test valueList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ListOrderedMap.valueList()"})
  void testValueList() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.valueList().isEmpty());
  }

  /**
   * Test {@link ListOrderedMap#values()}.
   * <p>
   * Method under test: {@link ListOrderedMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection ListOrderedMap.values()"})
  void testValues() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act
    Collection<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult instanceof List);
    assertTrue(actualValuesResult.isEmpty());
  }

  /**
   * Test ValuesView {@link ValuesView#ValuesView(ListOrderedMap)}.
   * <p>
   * Method under test: {@link ValuesView#ValuesView(ListOrderedMap)}
   */
  @Test
  @DisplayName("Test ValuesView new ValuesView(ListOrderedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ValuesView.<init>(ListOrderedMap)"})
  void testValuesViewNewValuesView() {
    // Arrange and Act
    ValuesView<Object> actualObjectList = new ValuesView<>(new ListOrderedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }
}
