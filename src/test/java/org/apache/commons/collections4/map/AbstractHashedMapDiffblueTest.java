package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class AbstractHashedMapDiffblueTest {
  /**
   * Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  public void testCalculateNewCapacity() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.calculateNewCapacity(1));
  }

  /**
   * Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  public void testCalculateNewCapacity2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1073741824, objectObjectMap.calculateNewCapacity(1073741824));
  }

  /**
   * Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  public void testCalculateNewCapacity3() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1073741824, objectObjectMap.calculateNewCapacity(1073741825));
  }

  /**
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  public void testCalculateThreshold() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(30, objectObjectMap.calculateThreshold(3, 10.0f));
  }

  /**
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  public void testCalculateThreshold2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(10, objectObjectMap.calculateThreshold(1, 10.0f));
  }

  /**
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  public void testCalculateThreshold3() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.calculateThreshold(0, 10.0f));
  }

  /**
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  public void testCalculateThreshold4() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(-10, objectObjectMap.calculateThreshold(-1, 10.0f));
  }

  /**
   * Method under test: {@link AbstractHashedMap#clone()}
   */
  @Test
  public void testClone() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.clone());
  }

  /**
   * Method under test: {@link AbstractHashedMap#convertKey(Object)}
   */
  @Test
  public void testConvertKey() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.convertKey(object));
  }

  /**
   * Method under test: {@link AbstractHashedMap#convertKey(Object)}
   */
  @Test
  public void testConvertKey2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.convertKey(null));
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#createEntry(AbstractHashedMap.HashEntry, int, Object, Object)}
   */
  @Test
  public void testCreateEntry() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap.HashEntry<Object, Object> next = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractHashedMap.HashEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualCreateEntryResult.next, actualCreateEntryResult);
    Object expectedValue = actualCreateEntryResult.key;
    assertSame(expectedValue, next.getValue());
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#createEntry(AbstractHashedMap.HashEntry, int, Object, Object)}
   */
  @Test
  public void testCreateEntry2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap.HashEntry<Object, Object> next = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    AbstractHashedMap.HashEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next, 19088743,
        null, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualCreateEntryResult.next, actualCreateEntryResult);
    Object expectedValue = actualCreateEntryResult.key;
    assertSame(expectedValue, next.getValue());
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#destroyEntry(AbstractHashedMap.HashEntry)}
   */
  @Test
  public void testDestroyEntry() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap.HashEntry<Object, Object> entry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    objectObjectMap.destroyEntry(entry);

    // Assert
    assertNull(entry.getValue());
    assertNull(entry.key);
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#entryHashCode(AbstractHashedMap.HashEntry)}
   */
  @Test
  public void testEntryHashCode() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(19088743, objectObjectMap.entryHashCode(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#entryKey(AbstractHashedMap.HashEntry)}
   */
  @Test
  public void testEntryKey() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNull(objectObjectMap
        .entryKey(new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#entryNext(AbstractHashedMap.HashEntry)}
   */
  @Test
  public void testEntryNext() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNull(objectObjectMap
        .entryNext(new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test: {@link AbstractHashedMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    Set<Map.Entry<Object, Object>> actualEntrySetResult = objectObjectMap.entrySet();

    // Assert
    assertTrue(actualEntrySetResult.isEmpty());
    assertSame(objectObjectMap.entrySet, actualEntrySetResult);
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap.EntrySet#EntrySet(AbstractHashedMap)}
   */
  @Test
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    AbstractHashedMap.EntrySet<Object, Object> actualObjectSet = new AbstractHashedMap.EntrySet<>(
        new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#entryValue(AbstractHashedMap.HashEntry)}
   */
  @Test
  public void testEntryValue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap.HashEntry<Object, Object> entry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(entry.key, objectObjectMap.entryValue(entry));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap#equals(Object)}
   *   <li>{@link AbstractHashedMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap#equals(Object)}
   *   <li>{@link AbstractHashedMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap.HashEntry#equals(Object)}
   *   <li>{@link AbstractHashedMap.HashEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testHashEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractHashedMap.HashEntry<Object, Object> hashEntry2 = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(hashEntry, hashEntry2);
    int expectedHashCodeResult = hashEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap.HashEntry#equals(Object)}
   *   <li>{@link AbstractHashedMap.HashEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testHashEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    IdentityMap.IdentityEntry<Object, Object> identityEntry = new IdentityMap.IdentityEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(identityEntry, hashEntry);
    int expectedHashCodeResult = identityEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap.HashEntry#equals(Object)}
   *   <li>{@link AbstractHashedMap.HashEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testHashEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(hashEntry, hashEntry);
    int expectedHashCodeResult = hashEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry.hashCode());
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743, 1,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertNotEquals(hashEntry,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Act and Assert
    assertNotEquals(hashEntry,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    AbstractReferenceMap.ReferenceEntry<Object, Object> referenceEntry = new AbstractReferenceMap.ReferenceEntry<>(
        parent, new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
        19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, null);
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#equals(Object)}
   */
  @Test
  public void testHashEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, "Different type to HashEntry");
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#getKey()}
   */
  @Test
  public void testHashEntryGetKey() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(hashEntry.getKey());
  }

  /**
   * Method under test: {@link AbstractHashedMap.HashEntry#getKey()}
   */
  @Test
  public void testHashEntryGetKey2() {
    // Arrange
    AbstractHashedMap.HashEntry<Object, Object> hashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743, "Key",
        AbstractHashedMap.NULL);

    // Act
    Object actualKey = hashEntry.getKey();

    // Assert
    assertEquals("Key", actualKey);
    assertSame(hashEntry.key, actualKey);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link AbstractHashedMap.HashEntry#HashEntry(AbstractHashedMap.HashEntry, int, Object, Object)}
   *   <li>{@link AbstractHashedMap.HashEntry#setValue(Object)}
   *   <li>{@link AbstractHashedMap.HashEntry#toString()}
   *   <li>{@link AbstractHashedMap.HashEntry#getValue()}
   * </ul>
   */
  @Test
  public void testHashEntryGettersAndSetters() {
    // Arrange and Act
    AbstractHashedMap.HashEntry<Object, Object> actualHashEntry = new AbstractHashedMap.HashEntry<>(null, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;
    Object actualSetValueResult = actualHashEntry.setValue(object);
    actualHashEntry.toString();

    // Assert
    assertSame(object, actualHashEntry.getValue());
    assertSame(object, actualSetValueResult);
  }

  /**
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  public void testHashIndex() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(2, objectObjectMap.hashIndex(19088743, 3));
  }

  /**
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  public void testHashIndex2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashIndex(1, 3));
  }

  /**
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  public void testHashIndex3() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(2, objectObjectMap.hashIndex(3, 3));
  }

  /**
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  public void testHashIndex4() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashIndex(0, 3));
  }

  /**
   * Method under test: {@link AbstractHashedMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractHashedMap#isEqualKey(Object, Object)}
   */
  @Test
  public void testIsEqualKey() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap#isEqualKey(Object, Object)}
   */
  @Test
  public void testIsEqualKey2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(4, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap#isEqualValue(Object, Object)}
   */
  @Test
  public void testIsEqualValue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap#isEqualValue(Object, Object)}
   */
  @Test
  public void testIsEqualValue2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(42, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link AbstractHashedMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    Set<Object> actualKeySetResult = objectObjectMap.keySet();

    // Assert
    assertTrue(actualKeySetResult.isEmpty());
    assertSame(objectObjectMap.keySet, actualKeySetResult);
  }

  /**
   * Method under test: {@link AbstractHashedMap.KeySet#KeySet(AbstractHashedMap)}
   */
  @Test
  public void testKeySetNewKeySet() {
    // Arrange and Act
    AbstractHashedMap.KeySet<Object> actualObjectSet = new AbstractHashedMap.KeySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractHashedMap#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Method under test: {@link AbstractHashedMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    Collection<Object> actualValuesResult = objectObjectMap.values();

    // Assert
    assertTrue(actualValuesResult.isEmpty());
    assertSame(objectObjectMap.values, actualValuesResult);
  }

  /**
   * Method under test: {@link AbstractHashedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Method under test: {@link AbstractHashedMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractHashedMap");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap#AbstractHashedMap()}
   *   <li>{@link AbstractHashedMap#init()}
   *   <li>{@link AbstractHashedMap#size()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>();
    actualObjectObjectMap.init();

    // Assert that nothing has changed
    assertEquals(0, actualObjectObjectMap.size());
  }

  /**
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int)}
   */
  @Test
  public void testNewAbstractHashedMap() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int)}
   */
  @Test
  public void testNewAbstractHashedMap2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(-1));
  }

  /**
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  public void testNewAbstractHashedMap3() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  public void testNewAbstractHashedMap4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(0, 0.0f));

  }

  /**
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  public void testNewAbstractHashedMap5() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(-1, 0.0f));

  }

  /**
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  public void testNewAbstractHashedMap6() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(1, Float.NaN));

  }

  /**
   * Method under test:
   * {@link AbstractHashedMap#AbstractHashedMap(int, float, int)}
   */
  @Test
  public void testNewAbstractHashedMap7() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1, 10.0f, 1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractHashedMap.Values#Values(AbstractHashedMap)}
   */
  @Test
  public void testValuesNewValues() {
    // Arrange and Act
    AbstractHashedMap.Values<Object> actualValues = new AbstractHashedMap.Values<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualValues.isEmpty());
  }
}
