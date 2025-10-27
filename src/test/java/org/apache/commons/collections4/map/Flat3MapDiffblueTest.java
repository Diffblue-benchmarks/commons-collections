package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.NoSuchElementException;
import org.junit.Test;

public class Flat3MapDiffblueTest {
  /**
   * Method under test: {@link Flat3Map#clone()}
   */
  @Test
  public void testClone() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.clone().isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey4() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey5() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(821021221, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey6() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey7() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey8() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(821021221, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey9() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey10() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey11() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  public void testContainsKey12() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue4() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue5() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue6() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue7() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue8() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue9() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  public void testContainsValue10() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Method under test: {@link Flat3Map#createDelegateMap()}
   */
  @Test
  public void testCreateDelegateMap() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.createDelegateMap().isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map.EntryIterator#hasNext()}
   */
  @Test
  public void testEntryIteratorHasNext() {
    // Arrange
    Flat3Map.EntrySetIterator<Object, Object> entrySetIterator = new Flat3Map.EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.EntryIterator#hasNext()}
   */
  @Test
  public void testEntryIteratorHasNext2() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.EntrySetIterator<Object, Object> entrySetIterator = new Flat3Map.EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.EntryIterator#nextEntry()}
   */
  @Test
  public void testEntryIteratorNextEntry() {
    // Arrange
    Flat3Map.EntrySetIterator<Object, Object> entrySetIterator = new Flat3Map.EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.nextEntry());
  }

  /**
   * Method under test: {@link Flat3Map.EntryIterator#nextEntry()}
   */
  @Test
  public void testEntryIteratorNextEntry2() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.EntrySetIterator<Object, Object> entrySetIterator = new Flat3Map.EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.nextEntry() instanceof Flat3Map.FlatMapEntry);
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.EntryIterator#remove()}
   */
  @Test
  public void testEntryIteratorRemove() {
    // Arrange
    Flat3Map.EntrySetIterator<Object, Object> entrySetIterator = new Flat3Map.EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Method under test: {@link Flat3Map#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test:
   * {@link Flat3Map.EntrySetIterator#EntrySetIterator(Flat3Map)}
   */
  @Test
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange and Act
    Flat3Map.EntrySetIterator<Object, Object> actualEntrySetIterator = new Flat3Map.EntrySetIterator<>(
        new Flat3Map<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.EntrySetIterator#next()}
   */
  @Test
  public void testEntrySetIteratorNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.EntrySetIterator<Object, Object> entrySetIterator = new Flat3Map.EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.next() instanceof Flat3Map.FlatMapEntry);
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.EntrySet#EntrySet(Flat3Map)}
   */
  @Test
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    Flat3Map.EntrySet<Object, Object> actualObjectSet = new Flat3Map.EntrySet<>(new Flat3Map<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map.FlatMapEntry#equals(Object)}
   *   <li>{@link Flat3Map.FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry2 = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map.FlatMapEntry#equals(Object)}
   *   <li>{@link Flat3Map.FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 2);
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry2 = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map.FlatMapEntry#equals(Object)}
   *   <li>{@link Flat3Map.FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 3);
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry2 = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map.FlatMapEntry#equals(Object)}
   *   <li>{@link Flat3Map.FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry.hashCode());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(parent, 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry,
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertNotEquals(flatMapEntry, 1);
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1), AbstractHashedMap.NULL);
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(parent, 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> flatMapEntry.equals(new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1)));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> flatMapEntry.equals(new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 0)));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry2 = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry2.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.equals(flatMapEntry2));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, null);
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#equals(Object)}
   */
  @Test
  public void testFlatMapEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, "Different type to FlatMapEntry");
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getKey()}
   */
  @Test
  public void testFlatMapEntryGetKey() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getKey()}
   */
  @Test
  public void testFlatMapEntryGetKey2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 2);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getKey()}
   */
  @Test
  public void testFlatMapEntryGetKey3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 3);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getKey()}
   */
  @Test
  public void testFlatMapEntryGetKey4() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getKey());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getKey()}
   */
  @Test
  public void testFlatMapEntryGetKey5() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getKey());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getValue()}
   */
  @Test
  public void testFlatMapEntryGetValue() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getValue()}
   */
  @Test
  public void testFlatMapEntryGetValue2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 2);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getValue()}
   */
  @Test
  public void testFlatMapEntryGetValue3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 3);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getValue()}
   */
  @Test
  public void testFlatMapEntryGetValue4() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#getValue()}
   */
  @Test
  public void testFlatMapEntryGetValue5() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#setValue(Object)}
   */
  @Test
  public void testFlatMapEntrySetValue() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#setValue(Object)}
   */
  @Test
  public void testFlatMapEntrySetValue2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 2);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#setValue(Object)}
   */
  @Test
  public void testFlatMapEntrySetValue3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 3);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#setValue(Object)}
   */
  @Test
  public void testFlatMapEntrySetValue4() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#setValue(Object)}
   */
  @Test
  public void testFlatMapEntrySetValue5() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#toString()}
   */
  @Test
  public void testFlatMapEntryToString() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#toString()}
   */
  @Test
  public void testFlatMapEntryToString2() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 2);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#toString()}
   */
  @Test
  public void testFlatMapEntryToString3() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 3);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#toString()}
   */
  @Test
  public void testFlatMapEntryToString4() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.toString());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapEntry#toString()}
   */
  @Test
  public void testFlatMapEntryToString5() {
    // Arrange
    Flat3Map.FlatMapEntry<Object, Object> flatMapEntry = new Flat3Map.FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertEquals("", flatMapEntry.toString());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#getKey()}
   */
  @Test
  public void testFlatMapIteratorGetKey() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.getKey());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#getValue()}
   */
  @Test
  public void testFlatMapIteratorGetValue() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.getValue());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#hasNext()}
   */
  @Test
  public void testFlatMapIteratorHasNext() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertFalse(flatMapIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#hasNext()}
   */
  @Test
  public void testFlatMapIteratorHasNext2() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(parent);

    // Act and Assert
    assertTrue(flatMapIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#FlatMapIterator(Flat3Map)}
   */
  @Test
  public void testFlatMapIteratorNewFlatMapIterator() {
    // Arrange and Act
    Flat3Map.FlatMapIterator<Object, Object> actualFlatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualFlatMapIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#next()}
   */
  @Test
  public void testFlatMapIteratorNext() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> flatMapIterator.next());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#next()}
   */
  @Test
  public void testFlatMapIteratorNext2() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(parent);

    // Act
    flatMapIterator.next();

    // Assert
    assertFalse(flatMapIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#remove()}
   */
  @Test
  public void testFlatMapIteratorRemove() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.remove());
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#setValue(Object)}
   */
  @Test
  public void testFlatMapIteratorSetValue() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map.FlatMapIterator#toString()}
   */
  @Test
  public void testFlatMapIteratorToString() {
    // Arrange
    Flat3Map.FlatMapIterator<Object, Object> flatMapIterator = new Flat3Map.FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertEquals("Iterator[]", flatMapIterator.toString());
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet4() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet5() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(821021221, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet6() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet7() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet8() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(821021221, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  public void testGet9() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Method under test: {@link Flat3Map#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map.KeySetIterator#KeySetIterator(Flat3Map)}
   */
  @Test
  public void testKeySetIteratorNewKeySetIterator() {
    // Arrange and Act
    Flat3Map.KeySetIterator<Object> actualKeySetIterator = new Flat3Map.KeySetIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.KeySetIterator#next()}
   */
  @Test
  public void testKeySetIteratorNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.KeySetIterator<Object> keySetIterator = new Flat3Map.KeySetIterator<>(parent);

    // Act
    keySetIterator.next();

    // Assert
    assertFalse(keySetIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.KeySet#KeySet(Flat3Map)}
   */
  @Test
  public void testKeySetNewKeySet() {
    // Arrange and Act
    Flat3Map.KeySet<Object> actualObjectSet = new Flat3Map.KeySet<>(new Flat3Map<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Method under test: {@link Flat3Map#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Method under test: {@link Flat3Map#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new Flat3Map<>());
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(821021221, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to Flat3Map");
  }

  /**
   * Method under test: {@link Flat3Map#Flat3Map()}
   */
  @Test
  public void testNewFlat3Map() {
    // Arrange and Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link Flat3Map.ValuesIterator#ValuesIterator(Flat3Map)}
   */
  @Test
  public void testValuesIteratorNewValuesIterator() {
    // Arrange and Act
    Flat3Map.ValuesIterator<Object> actualValuesIterator = new Flat3Map.ValuesIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.ValuesIterator#next()}
   */
  @Test
  public void testValuesIteratorNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Flat3Map.ValuesIterator<Object> valuesIterator = new Flat3Map.ValuesIterator<>(parent);

    // Act
    valuesIterator.next();

    // Assert
    assertFalse(valuesIterator.hasNext());
  }

  /**
   * Method under test: {@link Flat3Map.Values#Values(Flat3Map)}
   */
  @Test
  public void testValuesNewValues() {
    // Arrange and Act
    Flat3Map.Values<Object> actualValues = new Flat3Map.Values<>(new Flat3Map<>());

    // Assert
    assertTrue(actualValues.isEmpty());
  }
}
