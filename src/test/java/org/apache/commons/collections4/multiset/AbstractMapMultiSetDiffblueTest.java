package org.apache.commons.collections4.multiset;

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
import org.apache.commons.collections4.MultiSet;
import org.junit.Test;

public class AbstractMapMultiSetDiffblueTest {
  /**
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  public void testAdd() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.add("Object", 2));
    assertEquals(2, hashMultiSet.size());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.setMap(new HashMap<>());

    // Act and Assert
    assertEquals(0, hashMultiSet.add("Object", 0));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  public void testAdd3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.setMap(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.add("Object", -1));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  public void testAdd4() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.add("Object", 2));
    assertEquals(3, hashMultiSet.size());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.contains("Object"));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertTrue(hashMultiSet.contains("Object"));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#createEntrySetIterator()}
   */
  @Test
  public void testCreateEntrySetIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act
    Iterator<MultiSet.Entry<Object>> actualCreateEntrySetIteratorResult = hashMultiSet.createEntrySetIterator();

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof AbstractMapMultiSet.EntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#createUniqueSetIterator()}
   */
  @Test
  public void testCreateUniqueSetIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act
    Iterator<Object> actualCreateUniqueSetIteratorResult = hashMultiSet.createUniqueSetIterator();

    // Assert
    assertTrue(actualCreateUniqueSetIteratorResult instanceof AbstractMapMultiSet.UniqueSetIterator);
    assertFalse(actualCreateUniqueSetIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.EntrySetIterator#hasNext()}
   */
  @Test
  public void testEntrySetIteratorHasNext() {
    // Arrange
    ArrayList<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> entryList = new ArrayList<>();
    Iterator<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> decorated = entryList.iterator();
    AbstractMapMultiSet.EntrySetIterator<Object> entrySetIterator = new AbstractMapMultiSet.EntrySetIterator<>(
        decorated, new HashMultiSet<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.EntrySetIterator#hasNext()}
   */
  @Test
  public void testEntrySetIteratorHasNext2() {
    // Arrange
    ArrayList<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> entryList = new ArrayList<>();
    entryList.add(new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));
    Iterator<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> decorated = entryList.iterator();
    AbstractMapMultiSet.EntrySetIterator<Object> entrySetIterator = new AbstractMapMultiSet.EntrySetIterator<>(
        decorated, new HashMultiSet<>());

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractMapMultiSet.EntrySetIterator#EntrySetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange
    ArrayList<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> entryList = new ArrayList<>();
    Iterator<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> decorated = entryList.iterator();

    // Act
    AbstractMapMultiSet.EntrySetIterator<Object> actualEntrySetIterator = new AbstractMapMultiSet.EntrySetIterator<>(
        decorated, new HashMultiSet<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.EntrySetIterator#next()}
   */
  @Test
  public void testEntrySetIteratorNext() {
    // Arrange
    ArrayList<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> entryList = new ArrayList<>();
    entryList.add(new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));
    Iterator<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> decorated = entryList.iterator();
    AbstractMapMultiSet.EntrySetIterator<Object> entrySetIterator = new AbstractMapMultiSet.EntrySetIterator<>(
        decorated, new HashMultiSet<>());

    // Act
    MultiSet.Entry<Object> actualNextResult = entrySetIterator.next();

    // Assert
    assertFalse(entrySetIterator.hasNext());
    assertSame(entrySetIterator.last, actualNextResult);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.EntrySetIterator#remove()}
   */
  @Test
  public void testEntrySetIteratorRemove() {
    // Arrange
    ArrayList<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> entryList = new ArrayList<>();
    Iterator<Map.Entry<Object, AbstractMapMultiSet.MutableInteger>> decorated = entryList.iterator();
    AbstractMapMultiSet.EntrySetIterator<Object> entrySetIterator = new AbstractMapMultiSet.EntrySetIterator<>(
        decorated, new HashMultiSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#getCount(Object)}
   */
  @Test
  public void testGetCount() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.getCount("Object"));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#getCount(Object)}
   */
  @Test
  public void testGetCount2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.getCount("Object"));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#getMap()}
   */
  @Test
  public void testGetMap() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.getMap().isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet#equals(Object)}
   *   <li>{@link AbstractMapMultiSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet2);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet#equals(Object)}
   *   <li>{@link AbstractMapMultiSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add("Object");

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet2);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet#equals(Object)}
   *   <li>{@link AbstractMapMultiSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet.hashCode());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertFalse(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.iterator().hasNext());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.MultiSetEntry#getCount()}
   */
  @Test
  public void testMultiSetEntryGetCount() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertEquals(42, multiSetEntry.getCount());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.MultiSetEntry#getElement()}
   */
  @Test
  public void testMultiSetEntryGetElement() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertEquals("42", multiSetEntry.getElement());
  }

  /**
   * Method under test:
   * {@link AbstractMapMultiSet.MultiSetEntry#MultiSetEntry(Map.Entry)}
   */
  @Test
  public void testMultiSetEntryNewMultiSetEntry() {
    // Arrange and Act
    AbstractMapMultiSet.MultiSetEntry<Object> actualMultiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Assert
    assertEquals("42", actualMultiSetEntry.getElement());
    assertEquals(42, actualMultiSetEntry.getCount());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet.MutableInteger#equals(Object)}
   *   <li>{@link AbstractMapMultiSet.MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractMapMultiSet.MutableInteger mutableInteger = new AbstractMapMultiSet.MutableInteger(42);
    AbstractMapMultiSet.MutableInteger mutableInteger2 = new AbstractMapMultiSet.MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger2);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet.MutableInteger#equals(Object)}
   *   <li>{@link AbstractMapMultiSet.MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractMapMultiSet.MutableInteger mutableInteger = new AbstractMapMultiSet.MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger.hashCode());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.MutableInteger#equals(Object)}
   */
  @Test
  public void testMutableIntegerEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractMapMultiSet.MutableInteger mutableInteger = new AbstractMapMultiSet.MutableInteger(1);

    // Act and Assert
    assertNotEquals(mutableInteger, new AbstractMapMultiSet.MutableInteger(42));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.MutableInteger#equals(Object)}
   */
  @Test
  public void testMutableIntegerEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AbstractMapMultiSet.MutableInteger(42), null);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.MutableInteger#equals(Object)}
   */
  @Test
  public void testMutableIntegerEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AbstractMapMultiSet.MutableInteger(42), "Different type to MutableInteger");
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.remove("Object", 1));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.setMap(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.remove("Object", -1));
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.remove("Object", 1));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");
    hashMultiSet.add("Object");

    // Act
    int actualRemoveResult = hashMultiSet.remove("Object", 1);

    // Assert
    assertEquals(1, hashMultiSet.size());
    assertEquals(2, actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  public void testRemove5() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.remove("Object", 0));
    assertEquals(1, hashMultiSet.size());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.size());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.toArray().length);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#toArray()}
   */
  @Test
  public void testToArray2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act
    Object[] actualToArrayResult = hashMultiSet.toArray();

    // Assert
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#toArray(Object[])}
   */
  @Test
  public void testToArray3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashMultiSet.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#toArray(Object[])}
   */
  @Test
  public void testToArray4() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashMultiSet.toArray(array);

    // Assert
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#toArray(Object[])}
   */
  @Test
  public void testToArray5() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");
    hashMultiSet.add("Object");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashMultiSet.toArray(array);

    // Assert
    assertEquals("Array", array[0]);
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", actualToArrayResult[1]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#uniqueElements()}
   */
  @Test
  public void testUniqueElements() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.uniqueElements());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet, new HashMultiSet<>());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(2);

    // Act and Assert
    assertNotEquals(hashMultiSet, hashMultiSet2);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(new HashMultiSet<>());

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet, hashMultiSet2);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(new HashMultiSet<>());

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(null);

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(0);
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, null);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, "Different type to AbstractMapMultiSet");
  }

  /**
   * Method under test:
   * {@link AbstractMapMultiSet.UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  public void testUniqueSetIteratorNewUniqueSetIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    AbstractMapMultiSet.UniqueSetIterator<Object> actualUniqueSetIterator = new AbstractMapMultiSet.UniqueSetIterator<>(
        iterator, new HashMultiSet<>());

    // Assert
    assertFalse(actualUniqueSetIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractMapMultiSet.UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  public void testUniqueSetIteratorNewUniqueSetIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    HashMultiSet<Object> parent = new HashMultiSet<>();
    parent.add("Object");

    // Act
    AbstractMapMultiSet.UniqueSetIterator<Object> actualUniqueSetIterator = new AbstractMapMultiSet.UniqueSetIterator<>(
        iterator, parent);

    // Assert
    assertFalse(actualUniqueSetIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractMapMultiSet.UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  public void testUniqueSetIteratorNewUniqueSetIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    HashMultiSet<Object> parent = new HashMultiSet<>();
    parent.add("Object");
    parent.add("Object");

    // Act
    AbstractMapMultiSet.UniqueSetIterator<Object> actualUniqueSetIterator = new AbstractMapMultiSet.UniqueSetIterator<>(
        iterator, parent);

    // Assert
    assertFalse(actualUniqueSetIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.UniqueSetIterator#next()}
   */
  @Test
  public void testUniqueSetIteratorNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    AbstractMapMultiSet.UniqueSetIterator<Object> uniqueSetIterator = new AbstractMapMultiSet.UniqueSetIterator<>(
        iterator, new HashMultiSet<>());

    // Act
    Object actualNextResult = uniqueSetIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(uniqueSetIterator.lastElement, actualNextResult);
  }

  /**
   * Method under test: {@link AbstractMapMultiSet.UniqueSetIterator#remove()}
   */
  @Test
  public void testUniqueSetIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    AbstractMapMultiSet.UniqueSetIterator<Object> uniqueSetIterator = new AbstractMapMultiSet.UniqueSetIterator<>(
        iterator, new HashMultiSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> uniqueSetIterator.remove());
  }
}
