package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;

public class AbstractLinkedMapDiffblueTest {
  /**
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue3() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue4() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue5() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue6() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap#createEntry(AbstractHashedMap.HashEntry, int, Object, Object)}
   */
  @Test
  public void testCreateEntry() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    AbstractHashedMap.HashEntry<Object, Object> next = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractLinkedMap.LinkEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualCreateEntryResult.next, actualCreateEntryResult);
    Object expectedValue = actualCreateEntryResult.key;
    assertSame(expectedValue, next.getValue());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#createKeySetIterator()}
   */
  @Test
  public void testCreateKeySetIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof AbstractLinkedMap.KeySetIterator);
    assertNull(actualCreateKeySetIteratorResult.next());
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap#entryAfter(AbstractLinkedMap.LinkEntry)}
   */
  @Test
  public void testEntryAfter() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.entryAfter(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap#entryBefore(AbstractLinkedMap.LinkEntry)}
   */
  @Test
  public void testEntryBefore() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.entryBefore(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap.EntrySetIterator#EntrySetIterator(AbstractLinkedMap)}
   */
  @Test
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange and Act
    AbstractLinkedMap.EntrySetIterator<Object, Object> actualEntrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.EntrySetIterator#next()}
   */
  @Test
  public void testEntrySetIteratorNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        parent);

    // Act
    Map.Entry<Object, Object> actualNextResult = entrySetIterator.next();

    // Assert
    assertFalse(entrySetIterator.hasNext());
    assertSame(entrySetIterator.last, actualNextResult);
  }

  /**
   * Method under test: {@link AbstractLinkedMap#firstKey()}
   */
  @Test
  public void testFirstKey() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.firstKey());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#firstKey()}
   */
  @Test
  public void testFirstKey2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.firstKey());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  public void testGetEntry() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getEntry(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  public void testGetEntry2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getEntry(null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  public void testGetEntry3() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.getEntry(AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  public void testGetEntry4() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        Integer.MIN_VALUE, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.getEntry(AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap.KeySetIterator#KeySetIterator(AbstractLinkedMap)}
   */
  @Test
  public void testKeySetIteratorNewKeySetIterator() {
    // Arrange and Act
    AbstractLinkedMap.KeySetIterator<Object> actualKeySetIterator = new AbstractLinkedMap.KeySetIterator<>(
        new LRUMap<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.KeySetIterator#next()}
   */
  @Test
  public void testKeySetIteratorNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractLinkedMap.KeySetIterator<Object> keySetIterator = new AbstractLinkedMap.KeySetIterator<>(parent);

    // Act and Assert
    assertNull(keySetIterator.next());
    assertFalse(keySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#lastKey()}
   */
  @Test
  public void testLastKey() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.lastKey());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#lastKey()}
   */
  @Test
  public void testLastKey2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.lastKey());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap.LinkEntry#LinkEntry(AbstractHashedMap.HashEntry, int, Object, Object)}
   */
  @Test
  public void testLinkEntryNewLinkEntry() {
    // Arrange and Act
    AbstractLinkedMap.LinkEntry<Object, Object> actualLinkEntry = new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualLinkEntry.next, actualLinkEntry);
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#currentEntry()}
   */
  @Test
  public void testLinkIteratorCurrentEntry() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertNull(entrySetIterator.currentEntry());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#hasNext()}
   */
  @Test
  public void testLinkIteratorHasNext() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#hasNext()}
   */
  @Test
  public void testLinkIteratorHasNext2() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        parent);

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#hasPrevious()}
   */
  @Test
  public void testLinkIteratorHasPrevious() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasPrevious());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#nextEntry()}
   */
  @Test
  public void testLinkIteratorNextEntry() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.nextEntry());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#nextEntry()}
   */
  @Test
  public void testLinkIteratorNextEntry2() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        parent);

    // Act
    AbstractLinkedMap.LinkEntry<Object, Object> actualNextEntryResult = entrySetIterator.nextEntry();

    // Assert
    assertFalse(entrySetIterator.hasNext());
    assertSame(entrySetIterator.last, actualNextEntryResult);
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#previousEntry()}
   */
  @Test
  public void testLinkIteratorPreviousEntry() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.previousEntry());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#remove()}
   */
  @Test
  public void testLinkIteratorRemove() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkIterator#toString()}
   */
  @Test
  public void testLinkIteratorToString() {
    // Arrange
    AbstractLinkedMap.EntrySetIterator<Object, Object> entrySetIterator = new AbstractLinkedMap.EntrySetIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertEquals("Iterator[]", entrySetIterator.toString());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkMapIterator#getKey()}
   */
  @Test
  public void testLinkMapIteratorGetKey() {
    // Arrange
    AbstractLinkedMap.LinkMapIterator<Object, Object> linkMapIterator = new AbstractLinkedMap.LinkMapIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.getKey());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkMapIterator#getValue()}
   */
  @Test
  public void testLinkMapIteratorGetValue() {
    // Arrange
    AbstractLinkedMap.LinkMapIterator<Object, Object> linkMapIterator = new AbstractLinkedMap.LinkMapIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.getValue());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap.LinkMapIterator#LinkMapIterator(AbstractLinkedMap)}
   */
  @Test
  public void testLinkMapIteratorNewLinkMapIterator() {
    // Arrange and Act
    AbstractLinkedMap.LinkMapIterator<Object, Object> actualLinkMapIterator = new AbstractLinkedMap.LinkMapIterator<>(
        new LRUMap<>());

    // Assert
    assertFalse(actualLinkMapIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkMapIterator#next()}
   */
  @Test
  public void testLinkMapIteratorNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractLinkedMap.LinkMapIterator<Object, Object> linkMapIterator = new AbstractLinkedMap.LinkMapIterator<>(parent);

    // Act and Assert
    assertNull(linkMapIterator.next());
    assertFalse(linkMapIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.LinkMapIterator#setValue(Object)}
   */
  @Test
  public void testLinkMapIteratorSetValue() {
    // Arrange
    AbstractLinkedMap.LinkMapIterator<Object, Object> linkMapIterator = new AbstractLinkedMap.LinkMapIterator<>(
        new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof AbstractLinkedMap.LinkMapIterator);
    assertNull(actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey3() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey4() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(null));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey5() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey6() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        Integer.MIN_VALUE, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link AbstractLinkedMap.ValuesIterator#ValuesIterator(AbstractLinkedMap)}
   */
  @Test
  public void testValuesIteratorNewValuesIterator() {
    // Arrange and Act
    AbstractLinkedMap.ValuesIterator<Object> actualValuesIterator = new AbstractLinkedMap.ValuesIterator<>(
        new LRUMap<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedMap.ValuesIterator#next()}
   */
  @Test
  public void testValuesIteratorNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractLinkedMap.ValuesIterator<Object> valuesIterator = new AbstractLinkedMap.ValuesIterator<>(parent);

    // Act
    Object actualNextResult = valuesIterator.next();

    // Assert
    assertFalse(valuesIterator.hasNext());
    assertSame(parent.NULL, actualNextResult);
  }
}
