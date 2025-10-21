package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
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
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ListOrderedMapDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetView.<init>(ListOrderedMap, List)", "java.lang.String EntrySetView.toString()"})
  public void testEntrySetViewGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySetView.<init>(ListOrderedMap)"})
  public void testKeySetViewNewKeySetView() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedIterator.<init>(ListOrderedMap, List)"})
  public void testListOrderedIteratorNewListOrderedIterator_thenNextReturnListOrderedMapEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedIterator.<init>(ListOrderedMap, List)"})
  public void testListOrderedIteratorNewListOrderedIterator_whenArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Entry ListOrderedIterator.next()"})
  public void testListOrderedIteratorNext_givenArrayListAddNull_thenReturnListOrderedMapEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListOrderedMap ListOrderedMap.listOrderedMap(Map)"})
  public void testListOrderedMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMapEntry.getValue()"})
  public void testListOrderedMapEntryGetValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedMapEntry.<init>(ListOrderedMap, Object)"})
  public void testListOrderedMapEntryNewListOrderedMapEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMapEntry.setValue(Object)"})
  public void testListOrderedMapEntrySetValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMapIterator.getKey()"})
  public void testListOrderedMapIteratorGetKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMapIterator.getValue()"})
  public void testListOrderedMapIteratorGetValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedMapIterator.hasNext()"})
  public void testListOrderedMapIteratorHasNext_givenListOrderedMapNullIsNull_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedMapIterator.hasNext()"})
  public void testListOrderedMapIteratorHasNext_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListOrderedMapIterator.hasPrevious()"})
  public void testListOrderedMapIteratorHasPrevious() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedMapIterator.<init>(ListOrderedMap)"})
  public void testListOrderedMapIteratorNewListOrderedMapIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMapIterator.next()"})
  public void testListOrderedMapIteratorNext() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedMapIterator.remove()"})
  public void testListOrderedMapIteratorRemove() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMapIterator.setValue(Object)"})
  public void testListOrderedMapIteratorSetValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListOrderedMapIterator.toString()"})
  public void testListOrderedMapIteratorToString() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedMap.<init>()"})
  public void testNewListOrderedMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ListOrderedMap.<init>(Map)"})
  public void testNewListOrderedMap2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListOrderedMap.asList()"})
  public void testAsList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set ListOrderedMap.entrySet()"})
  public void testEntrySet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.firstKey()"})
  public void testFirstKey_givenListOrderedMap_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListOrderedMap.indexOf(Object)"})
  public void testIndexOf() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListOrderedMap.keyList()"})
  public void testKeyList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set ListOrderedMap.keySet()"})
  public void testKeySet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.lastKey()"})
  public void testLastKey_givenListOrderedMap_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator ListOrderedMap.mapIterator()"})
  public void testMapIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.nextKey(Object)"})
  public void testNextKey_givenListOrderedMapNullIsNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.nextKey(Object)"})
  public void testNextKey_givenListOrderedMap_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.nextKey(Object)"})
  public void testNextKey_givenPutWithIndexIsZeroAndKeyIsNullAndValueIsNull_thenReturnKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.previousKey(Object)"})
  public void testPreviousKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.remove(int)"})
  public void testRemoveWithIndex_givenListOrderedMapNullIsNull_thenListOrderedMapEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.remove(Object)"})
  public void testRemoveWithKey_givenListOrderedMapNullIsNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.remove(Object)"})
  public void testRemoveWithKey_givenListOrderedMap_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListOrderedMap.setValue(int, Object)"})
  public void testSetValue_givenListOrderedMapNullIsNull_whenZero_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListOrderedMap.toString()"})
  public void testToString_givenListOrderedMap_thenReturnLeftCurlyBracketRightCurlyBracket() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListOrderedMap.valueList()"})
  public void testValueList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection ListOrderedMap.values()"})
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
   * Test ValuesView {@link ValuesView#ValuesView(ListOrderedMap)}.
   * <p>
   * Method under test: {@link ValuesView#ValuesView(ListOrderedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ValuesView.<init>(ListOrderedMap)"})
  public void testValuesViewNewValuesView() {
    // Arrange and Act
    ValuesView<Object> actualObjectList = new ValuesView<>(new ListOrderedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }
}
