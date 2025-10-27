package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

public class AbstractReferenceMapDiffblueTest {
  /**
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey3() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey4() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(new WeakReference<>(AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap#createEntry(AbstractHashedMap.HashEntry, int, Object, Object)}
   */
  @Test
  public void testCreateEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    AbstractHashedMap.HashEntry<Object, Object> next = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractReferenceMap.ReferenceEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next,
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = actualCreateEntryResult.next;
    assertNull(hashEntry.getKey());
    assertNull(hashEntry.next);
    assertEquals(19088743, actualCreateEntryResult.hashCode);
    assertEquals(19088743, hashEntry.hashCode);
    Object object = actualCreateEntryResult.key;
    assertSame(object, next.getValue());
    assertSame(object, hashEntry.getValue());
    assertSame(object, actualCreateEntryResult.getKey());
    assertSame(object, actualCreateEntryResult.getValue());
    assertSame(object, hashEntry.key);
  }

  /**
   * Method under test: {@link AbstractReferenceMap#createEntrySetIterator()}
   */
  @Test
  public void testCreateEntrySetIterator() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Iterator<Map.Entry<Object, Object>> actualCreateEntrySetIteratorResult = objectObjectMap.createEntrySetIterator();

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof AbstractReferenceMap.ReferenceEntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#createKeySetIterator()}
   */
  @Test
  public void testCreateKeySetIterator() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof AbstractReferenceMap.ReferenceKeySetIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#createValuesIterator()}
   */
  @Test
  public void testCreateValuesIterator() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator();

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof AbstractReferenceMap.ReferenceValuesIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Set<Map.Entry<Object, Object>> actualEntrySetResult = objectObjectMap.entrySet();

    // Assert
    assertTrue(actualEntrySetResult.isEmpty());
    assertSame(objectObjectMap.entrySet, actualEntrySetResult);
  }

  /**
   * Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  public void testGet2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  public void testGet3() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  public void testGet4() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(2053475363, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#hashEntry(Object, Object)}
   */
  @Test
  public void testHashEntry() {
    // Arrange
    ReferenceMap<Object, Object> objectObjectMap = new ReferenceMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashEntry(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#isEqualKey(Object, Object)}
   */
  @Test
  public void testIsEqualKey() {
    // Arrange
    ReferenceMap<Object, Object> objectObjectMap = new ReferenceMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#isEqualKey(Object, Object)}
   */
  @Test
  public void testIsEqualKey2() {
    // Arrange
    ReferenceMap<Object, Object> objectObjectMap = new ReferenceMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey("Key1", AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap#isKeyType(AbstractReferenceMap.ReferenceStrength)}
   */
  @Test
  public void testIsKeyType() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isKeyType(AbstractReferenceMap.ReferenceStrength.HARD));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap#isKeyType(AbstractReferenceMap.ReferenceStrength)}
   */
  @Test
  public void testIsKeyType2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isKeyType(AbstractReferenceMap.ReferenceStrength.SOFT));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap#isValueType(AbstractReferenceMap.ReferenceStrength)}
   */
  @Test
  public void testIsValueType() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isValueType(AbstractReferenceMap.ReferenceStrength.HARD));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap#isValueType(AbstractReferenceMap.ReferenceStrength)}
   */
  @Test
  public void testIsValueType2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isValueType(AbstractReferenceMap.ReferenceStrength.SOFT));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Set<Object> actualKeySetResult = objectObjectMap.keySet();

    // Assert
    assertTrue(actualKeySetResult.isEmpty());
    assertSame(objectObjectMap.keySet, actualKeySetResult);
  }

  /**
   * Method under test: {@link AbstractReferenceMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof AbstractReferenceMap.ReferenceMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceBaseIterator#currentEntry()}
   */
  @Test
  public void testReferenceBaseIteratorCurrentEntry() {
    // Arrange
    AbstractReferenceMap.ReferenceBaseIterator<Object, Object> referenceBaseIterator = new AbstractReferenceMap.ReferenceBaseIterator<>(
        new ReferenceIdentityMap<>());

    // Act and Assert
    assertNull(referenceBaseIterator.currentEntry());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceBaseIterator#remove()}
   */
  @Test
  public void testReferenceBaseIteratorRemove() {
    // Arrange
    AbstractReferenceMap.ReferenceBaseIterator<Object, Object> referenceBaseIterator = new AbstractReferenceMap.ReferenceBaseIterator<>(
        new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> referenceBaseIterator.remove());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   *   <li>{@link AbstractReferenceMap.ReferenceEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testReferenceEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry2 = new AbstractReferenceMap.ReferenceEntry<>(
        parent2, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(referenceEntry, referenceEntry2);
    int expectedHashCodeResult = referenceEntry.hashCode();
    assertEquals(expectedHashCodeResult, referenceEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   *   <li>{@link AbstractReferenceMap.ReferenceEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testReferenceEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractMap.SimpleEntry<Object, Object> simpleEntry = new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(referenceEntry, simpleEntry);
    int expectedHashCodeResult = referenceEntry.hashCode();
    assertEquals(expectedHashCodeResult, simpleEntry.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   *   <li>{@link AbstractReferenceMap.ReferenceEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testReferenceEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(referenceEntry, referenceEntry);
    int expectedHashCodeResult = referenceEntry.hashCode();
    assertEquals(expectedHashCodeResult, referenceEntry.hashCode());
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   */
  @Test
  public void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, 1, AbstractHashedMap.NULL);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNotEquals(referenceEntry,
        new AbstractReferenceMap.ReferenceEntry<>(parent2,
            new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
            AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   */
  @Test
  public void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, 42);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNotEquals(referenceEntry,
        new AbstractReferenceMap.ReferenceEntry<>(parent2,
            new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
            AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   */
  @Test
  public void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNotEquals(referenceEntry,
        new AbstractReferenceMap.ReferenceEntry<>(parent2,
            new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
            null, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   */
  @Test
  public void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNotEquals(referenceEntry,
        new AbstractReferenceMap.ReferenceEntry<>(parent2,
            new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
            AbstractHashedMap.NULL, null));
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   */
  @Test
  public void testReferenceEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, null);
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#equals(Object)}
   */
  @Test
  public void testReferenceEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, "Different type to ReferenceEntry");
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#getKey()}
   */
  @Test
  public void testReferenceEntryGetKey() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(referenceEntry.key, referenceEntry.getKey());
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceEntry#getValue()}
   */
  @Test
  public void testReferenceEntryGetValue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(referenceEntry.key, referenceEntry.getValue());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntry#ReferenceEntry(AbstractReferenceMap, AbstractHashedMap.HashEntry, int, Object, Object)}
   */
  @Test
  public void testReferenceEntryNewReferenceEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractHashedMap.HashEntry<Object, Object> next = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractReferenceMap.ReferenceEntry<Object, Object> actualReferenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = actualReferenceEntry.next;
    assertNull(hashEntry.getKey());
    assertNull(hashEntry.next);
    assertEquals(19088743, actualReferenceEntry.hashCode);
    assertEquals(19088743, hashEntry.hashCode);
    Object object = actualReferenceEntry.key;
    assertSame(object, next.getValue());
    assertSame(object, hashEntry.getValue());
    assertSame(object, actualReferenceEntry.getKey());
    assertSame(object, actualReferenceEntry.getValue());
    assertSame(object, hashEntry.key);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntry#purge(Reference)}
   */
  @Test
  public void testReferenceEntryPurge() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(referenceEntry.purge(new PhantomReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>())));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntrySetIterator#ReferenceEntrySetIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceEntrySetIteratorNewReferenceEntrySetIterator() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceEntrySetIterator<Object, Object> actualReferenceEntrySetIterator = new AbstractReferenceMap.ReferenceEntrySetIterator<>(
        new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceEntrySetIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntrySetIterator#next()}
   */
  @Test
  public void testReferenceEntrySetIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractReferenceMap.ReferenceEntrySetIterator<Object, Object> referenceEntrySetIterator = new AbstractReferenceMap.ReferenceEntrySetIterator<>(
        parent);

    // Act
    Map.Entry<Object, Object> actualNextResult = referenceEntrySetIterator.next();

    // Assert
    assertFalse(referenceEntrySetIterator.hasNext());
    assertSame(referenceEntrySetIterator.current, actualNextResult);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntrySet#ReferenceEntrySet(AbstractHashedMap)}
   */
  @Test
  public void testReferenceEntrySetNewReferenceEntrySet() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceEntrySet<Object, Object> actualObjectSet = new AbstractReferenceMap.ReferenceEntrySet<>(
        new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntry#setValue(Object)}
   */
  @Test
  public void testReferenceEntrySetValue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, referenceEntry.setValue(object));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntry#toReference(AbstractReferenceMap.ReferenceStrength, Object, int)}
   */
  @Test
  public void testReferenceEntryToReference() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, referenceEntry.toReference(AbstractReferenceMap.ReferenceStrength.HARD, object, 19088743));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntry#toReference(AbstractReferenceMap.ReferenceStrength, Object, int)}
   */
  @Test
  public void testReferenceEntryToReference2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualToReferenceResult = referenceEntry.toReference(AbstractReferenceMap.ReferenceStrength.SOFT, object,
        19088743);

    // Assert
    assertTrue(actualToReferenceResult instanceof AbstractReferenceMap.SoftRef);
    assertFalse(((AbstractReferenceMap.SoftRef<Object>) actualToReferenceResult).isEnqueued());
    assertSame(object, ((AbstractReferenceMap.SoftRef<Object>) actualToReferenceResult).get());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceEntry#toReference(AbstractReferenceMap.ReferenceStrength, Object, int)}
   */
  @Test
  public void testReferenceEntryToReference3() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualToReferenceResult = referenceEntry.toReference(AbstractReferenceMap.ReferenceStrength.WEAK, object,
        19088743);

    // Assert
    assertTrue(actualToReferenceResult instanceof AbstractReferenceMap.WeakRef);
    assertFalse(((AbstractReferenceMap.WeakRef<Object>) actualToReferenceResult).isEnqueued());
    assertSame(object, ((AbstractReferenceMap.WeakRef<Object>) actualToReferenceResult).get());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceKeySetIterator#ReferenceKeySetIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceKeySetIteratorNewReferenceKeySetIterator() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceKeySetIterator<Object> actualReferenceKeySetIterator = new AbstractReferenceMap.ReferenceKeySetIterator<>(
        new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceKeySetIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceKeySetIterator#ReferenceKeySetIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceKeySetIteratorNewReferenceKeySetIterator2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractReferenceMap.ReferenceKeySetIterator<Object> actualReferenceKeySetIterator = new AbstractReferenceMap.ReferenceKeySetIterator<>(
        parent);

    // Assert
    Object expectedNextResult = parent.NULL;
    Object actualNextResult = actualReferenceKeySetIterator.next();
    assertFalse(actualReferenceKeySetIterator.hasNext());
    assertSame(expectedNextResult, actualNextResult);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceKeySetIterator#next()}
   */
  @Test
  public void testReferenceKeySetIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractReferenceMap.ReferenceKeySetIterator<Object> referenceKeySetIterator = new AbstractReferenceMap.ReferenceKeySetIterator<>(
        parent);

    // Act
    Object actualNextResult = referenceKeySetIterator.next();

    // Assert
    assertFalse(referenceKeySetIterator.hasNext());
    assertSame(referenceKeySetIterator.currentValue, actualNextResult);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceKeySet#ReferenceKeySet(AbstractHashedMap)}
   */
  @Test
  public void testReferenceKeySetNewReferenceKeySet() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceKeySet<Object> actualObjectSet = new AbstractReferenceMap.ReferenceKeySet<>(
        new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceMapIterator#getKey()}
   */
  @Test
  public void testReferenceMapIteratorGetKey() {
    // Arrange
    AbstractReferenceMap.ReferenceMapIterator<Object, Object> referenceMapIterator = new AbstractReferenceMap.ReferenceMapIterator<>(
        new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> referenceMapIterator.getKey());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceMapIterator#getValue()}
   */
  @Test
  public void testReferenceMapIteratorGetValue() {
    // Arrange
    AbstractReferenceMap.ReferenceMapIterator<Object, Object> referenceMapIterator = new AbstractReferenceMap.ReferenceMapIterator<>(
        new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> referenceMapIterator.getValue());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceMapIterator#ReferenceMapIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceMapIteratorNewReferenceMapIterator() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceMapIterator<Object, Object> actualReferenceMapIterator = new AbstractReferenceMap.ReferenceMapIterator<>(
        new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceMapIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceMapIterator#ReferenceMapIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceMapIteratorNewReferenceMapIterator2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractReferenceMap.ReferenceMapIterator<Object, Object> actualReferenceMapIterator = new AbstractReferenceMap.ReferenceMapIterator<>(
        parent);

    // Assert
    Object expectedNextResult = parent.NULL;
    Object actualNextResult = actualReferenceMapIterator.next();
    assertFalse(actualReferenceMapIterator.hasNext());
    assertSame(expectedNextResult, actualNextResult);
  }

  /**
   * Method under test: {@link AbstractReferenceMap.ReferenceMapIterator#next()}
   */
  @Test
  public void testReferenceMapIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractReferenceMap.ReferenceMapIterator<Object, Object> referenceMapIterator = new AbstractReferenceMap.ReferenceMapIterator<>(
        parent);

    // Act
    Object actualNextResult = referenceMapIterator.next();

    // Assert
    assertFalse(referenceMapIterator.hasNext());
    assertSame(referenceMapIterator.currentValue, actualNextResult);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceMapIterator#setValue(Object)}
   */
  @Test
  public void testReferenceMapIteratorSetValue() {
    // Arrange
    AbstractReferenceMap.ReferenceMapIterator<Object, Object> referenceMapIterator = new AbstractReferenceMap.ReferenceMapIterator<>(
        new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> referenceMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceStrength#resolve(int)}
   */
  @Test
  public void testReferenceStrengthResolve() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> AbstractReferenceMap.ReferenceStrength.resolve(42));
    assertEquals(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.resolve(0));
    assertEquals(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.resolve(1));
    assertEquals(AbstractReferenceMap.ReferenceStrength.WEAK, AbstractReferenceMap.ReferenceStrength.resolve(2));
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceValuesIterator#ReferenceValuesIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceValuesIteratorNewReferenceValuesIterator() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceValuesIterator<Object> actualReferenceValuesIterator = new AbstractReferenceMap.ReferenceValuesIterator<>(
        new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceValuesIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceValuesIterator#ReferenceValuesIterator(AbstractReferenceMap)}
   */
  @Test
  public void testReferenceValuesIteratorNewReferenceValuesIterator2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractReferenceMap.ReferenceValuesIterator<Object> actualReferenceValuesIterator = new AbstractReferenceMap.ReferenceValuesIterator<>(
        parent);

    // Assert
    Object expectedNextResult = parent.NULL;
    Object actualNextResult = actualReferenceValuesIterator.next();
    assertFalse(actualReferenceValuesIterator.hasNext());
    assertSame(expectedNextResult, actualNextResult);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceValuesIterator#next()}
   */
  @Test
  public void testReferenceValuesIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractReferenceMap.ReferenceValuesIterator<Object> referenceValuesIterator = new AbstractReferenceMap.ReferenceValuesIterator<>(
        parent);

    // Act
    Object actualNextResult = referenceValuesIterator.next();

    // Assert
    assertFalse(referenceValuesIterator.hasNext());
    assertSame(referenceValuesIterator.currentValue, actualNextResult);
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.ReferenceValues#ReferenceValues(AbstractHashedMap)}
   */
  @Test
  public void testReferenceValuesNewReferenceValues() {
    // Arrange and Act
    AbstractReferenceMap.ReferenceValues<Object> actualReferenceValues = new AbstractReferenceMap.ReferenceValues<>(
        new AbstractHashedMap<>());

    // Assert
    assertTrue(actualReferenceValues.isEmpty());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractReferenceMap#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#remove(Object)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put("org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry",
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
    assertTrue(objectObjectMap.containsKey("org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry"));
  }

  /**
   * Method under test: {@link AbstractReferenceMap#remove(Object)}
   */
  @Test
  public void testRemove5() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put("org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry",
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertTrue(objectObjectMap.containsKey("org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry"));
    assertSame(object, actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractReferenceMap#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.SoftRef#equals(Object)}
   *   <li>{@link AbstractReferenceMap.SoftRef#hashCode()}
   * </ul>
   */
  @Test
  public void testSoftRefEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractReferenceMap.SoftRef<Object> softRef = new AbstractReferenceMap.SoftRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());
    AbstractReferenceMap.SoftRef<Object> softRef2 = new AbstractReferenceMap.SoftRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertEquals(softRef, softRef2);
    int expectedHashCodeResult = softRef.hashCode();
    assertEquals(expectedHashCodeResult, softRef2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.SoftRef#equals(Object)}
   *   <li>{@link AbstractReferenceMap.SoftRef#hashCode()}
   * </ul>
   */
  @Test
  public void testSoftRefEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractReferenceMap.SoftRef<Object> softRef = new AbstractReferenceMap.SoftRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertEquals(softRef, softRef);
    int expectedHashCodeResult = softRef.hashCode();
    assertEquals(expectedHashCodeResult, softRef.hashCode());
  }

  /**
   * Method under test: {@link AbstractReferenceMap.SoftRef#equals(Object)}
   */
  @Test
  public void testSoftRefEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractReferenceMap.SoftRef<Object> softRef = new AbstractReferenceMap.SoftRef<>(1, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(softRef,
        new AbstractReferenceMap.SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>()));
  }

  /**
   * Method under test: {@link AbstractReferenceMap.SoftRef#equals(Object)}
   */
  @Test
  public void testSoftRefEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractReferenceMap.SoftRef<Object> softRef = new AbstractReferenceMap.SoftRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(softRef, null);
  }

  /**
   * Method under test: {@link AbstractReferenceMap.SoftRef#equals(Object)}
   */
  @Test
  public void testSoftRefEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractReferenceMap.SoftRef<Object> softRef = new AbstractReferenceMap.SoftRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(softRef, "Different type to SoftRef");
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.SoftRef#SoftRef(int, Object, ReferenceQueue)}
   */
  @Test
  public void testSoftRefNewSoftRef() {
    // Arrange
    Object object = AbstractHashedMap.NULL;

    // Act
    AbstractReferenceMap.SoftRef<Object> actualSoftRef = new AbstractReferenceMap.SoftRef<>(19088743, object,
        new ReferenceQueue<>());

    // Assert
    assertSame(object, actualSoftRef.get());
  }

  /**
   * Method under test: {@link AbstractReferenceMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Collection<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult.isEmpty());
    assertSame(objectObjectMap.values, actualValuesResult);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.WeakRef#equals(Object)}
   *   <li>{@link AbstractReferenceMap.WeakRef#hashCode()}
   * </ul>
   */
  @Test
  public void testWeakRefEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractReferenceMap.WeakRef<Object> weakRef = new AbstractReferenceMap.WeakRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());
    AbstractReferenceMap.WeakRef<Object> weakRef2 = new AbstractReferenceMap.WeakRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertEquals(weakRef, weakRef2);
    int expectedHashCodeResult = weakRef.hashCode();
    assertEquals(expectedHashCodeResult, weakRef2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractReferenceMap.WeakRef#equals(Object)}
   *   <li>{@link AbstractReferenceMap.WeakRef#hashCode()}
   * </ul>
   */
  @Test
  public void testWeakRefEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractReferenceMap.WeakRef<Object> weakRef = new AbstractReferenceMap.WeakRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertEquals(weakRef, weakRef);
    int expectedHashCodeResult = weakRef.hashCode();
    assertEquals(expectedHashCodeResult, weakRef.hashCode());
  }

  /**
   * Method under test: {@link AbstractReferenceMap.WeakRef#equals(Object)}
   */
  @Test
  public void testWeakRefEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractReferenceMap.WeakRef<Object> weakRef = new AbstractReferenceMap.WeakRef<>(1, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(weakRef,
        new AbstractReferenceMap.WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>()));
  }

  /**
   * Method under test: {@link AbstractReferenceMap.WeakRef#equals(Object)}
   */
  @Test
  public void testWeakRefEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractReferenceMap.WeakRef<Object> weakRef = new AbstractReferenceMap.WeakRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(weakRef, null);
  }

  /**
   * Method under test: {@link AbstractReferenceMap.WeakRef#equals(Object)}
   */
  @Test
  public void testWeakRefEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractReferenceMap.WeakRef<Object> weakRef = new AbstractReferenceMap.WeakRef<>(19088743, AbstractHashedMap.NULL,
        new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(weakRef, "Different type to WeakRef");
  }

  /**
   * Method under test:
   * {@link AbstractReferenceMap.WeakRef#WeakRef(int, Object, ReferenceQueue)}
   */
  @Test
  public void testWeakRefNewWeakRef() {
    // Arrange
    Object object = AbstractHashedMap.NULL;

    // Act
    AbstractReferenceMap.WeakRef<Object> actualWeakRef = new AbstractReferenceMap.WeakRef<>(19088743, object,
        new ReferenceQueue<>());

    // Assert
    assertSame(object, actualWeakRef.get());
  }
}
