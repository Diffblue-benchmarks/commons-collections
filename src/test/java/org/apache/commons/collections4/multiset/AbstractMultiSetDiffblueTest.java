package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.junit.Test;

public class AbstractMultiSetDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiSet.AbstractEntry#equals(Object)}
   *   <li>{@link AbstractMultiSet.AbstractEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testAbstractEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry2 = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertEquals(multiSetEntry, multiSetEntry2);
    int expectedHashCodeResult = multiSetEntry.hashCode();
    assertEquals(expectedHashCodeResult, multiSetEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiSet.AbstractEntry#equals(Object)}
   *   <li>{@link AbstractMultiSet.AbstractEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testAbstractEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertEquals(multiSetEntry, multiSetEntry);
    int expectedHashCodeResult = multiSetEntry.hashCode();
    assertEquals(expectedHashCodeResult, multiSetEntry.hashCode());
  }

  /**
   * Method under test: {@link AbstractMultiSet.AbstractEntry#equals(Object)}
   */
  @Test
  public void testAbstractEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>(1, new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry, new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42))));
  }

  /**
   * Method under test: {@link AbstractMultiSet.AbstractEntry#equals(Object)}
   */
  @Test
  public void testAbstractEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry2 = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>(multiSetEntry, new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry2, new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42))));
  }

  /**
   * Method under test: {@link AbstractMultiSet.AbstractEntry#equals(Object)}
   */
  @Test
  public void testAbstractEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(1)));

    // Act and Assert
    assertNotEquals(multiSetEntry, new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42))));
  }

  /**
   * Method under test: {@link AbstractMultiSet.AbstractEntry#equals(Object)}
   */
  @Test
  public void testAbstractEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry, null);
  }

  /**
   * Method under test: {@link AbstractMultiSet.AbstractEntry#equals(Object)}
   */
  @Test
  public void testAbstractEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry, "Different type to AbstractEntry");
  }

  /**
   * Method under test: {@link AbstractMultiSet.AbstractEntry#toString()}
   */
  @Test
  public void testAbstractEntryToString() {
    // Arrange
    AbstractMapMultiSet.MultiSetEntry<Object> multiSetEntry = new AbstractMapMultiSet.MultiSetEntry<>(
        new AbstractMap.SimpleEntry<>("42", new AbstractMapMultiSet.MutableInteger(42)));

    // Act and Assert
    assertEquals("42:42", multiSetEntry.toString());
  }

  /**
   * Method under test: {@link AbstractMultiSet#add(Object, int)}
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
   * Method under test: {@link AbstractMultiSet#add(Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act
    boolean actualAddResult = hashMultiSet.add("Object");

    // Assert
    assertEquals(1, hashMultiSet.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractMultiSet#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.contains("Object"));
  }

  /**
   * Method under test: {@link AbstractMultiSet#contains(Object)}
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
   * Method under test: {@link AbstractMultiSet#createEntrySet()}
   */
  @Test
  public void testCreateEntrySet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.createEntrySet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#createUniqueSet()}
   */
  @Test
  public void testCreateUniqueSet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.createUniqueSet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#createUniqueSetIterator()}
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
   * Method under test: {@link AbstractMultiSet#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.entrySet().isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractMultiSet.EntrySet#EntrySet(AbstractMultiSet)}
   */
  @Test
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    AbstractMultiSet.EntrySet<Object> actualObjectSet = new AbstractMultiSet.EntrySet<>(new HashMultiSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#getCount(Object)}
   */
  @Test
  public void testGetCount() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.getCount("Object"));
  }

  /**
   * Method under test: {@link AbstractMultiSet#equals(Object)}
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
   * Method under test: {@link AbstractMultiSet#equals(Object)}
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
   * Method under test: {@link AbstractMultiSet#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.iterator().hasNext());
  }

  /**
   * Method under test: {@link AbstractMultiSet#remove(Object, int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.remove("Object", 1));
  }

  /**
   * Method under test: {@link AbstractMultiSet#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.remove("Object"));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act
    boolean actualRemoveResult = hashMultiSet.remove("Object");

    // Assert
    assertTrue(hashMultiSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.removeAll(new ArrayList<>()));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashMultiSet.removeAll(coll));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashMultiSet.removeAll(coll));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll4() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashMultiSet.removeAll(coll);

    // Assert
    assertTrue(hashMultiSet.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll5() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashMultiSet.removeAll(coll);

    // Assert
    assertTrue(hashMultiSet.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractMultiSet#setCount(Object, int)}
   */
  @Test
  public void testSetCount() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.setCount("Object", 3));
    assertEquals(3, hashMultiSet.size());
  }

  /**
   * Method under test: {@link AbstractMultiSet#setCount(Object, int)}
   */
  @Test
  public void testSetCount2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.setCount("Object", 0));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#setCount(Object, int)}
   */
  @Test
  public void testSetCount3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.setCount("Object", -1));
  }

  /**
   * Method under test: {@link AbstractMultiSet#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.size());
  }

  /**
   * Method under test: {@link AbstractMultiSet#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals("[]", hashMultiSet.toString());
  }

  /**
   * Method under test: {@link AbstractMultiSet#uniqueSet()}
   */
  @Test
  public void testUniqueSet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.uniqueSet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiSet#equals(Object)}
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
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, null);
  }

  /**
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, "Different type to AbstractMultiSet");
  }

  /**
   * Method under test:
   * {@link AbstractMultiSet.UniqueSet#UniqueSet(AbstractMultiSet)}
   */
  @Test
  public void testUniqueSetNewUniqueSet() {
    // Arrange and Act
    AbstractMultiSet.UniqueSet<Object> actualObjectSet = new AbstractMultiSet.UniqueSet<>(new HashMultiSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
