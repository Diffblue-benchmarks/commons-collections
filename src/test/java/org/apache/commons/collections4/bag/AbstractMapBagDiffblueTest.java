package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.Bag;
import org.junit.Test;

public class AbstractMapBagDiffblueTest {
  /**
   * Method under test: {@link AbstractMapBag#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    boolean actualAddResult = hashBag.add("Object");

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#add(Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualAddResult = hashBag.add("Object");

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  public void testAdd3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    boolean actualAddResult = hashBag.add("Object", 2);

    // Assert
    assertEquals(2, hashBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  public void testAdd4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualAddResult = hashBag.add("Object", 2);

    // Assert
    assertEquals(3, hashBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  public void testAdd5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.add("Object", 0));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.addAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  public void testAddAll4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag.BagIterator#hasNext()}
   */
  @Test
  public void testBagIteratorHasNext() {
    // Arrange
    AbstractMapBag.BagIterator<Object> bagIterator = new AbstractMapBag.BagIterator<>(new HashBag<>());

    // Act and Assert
    assertFalse(bagIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapBag.BagIterator#hasNext()}
   */
  @Test
  public void testBagIteratorHasNext2() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    AbstractMapBag.BagIterator<Object> bagIterator = new AbstractMapBag.BagIterator<>(parent);

    // Act and Assert
    assertTrue(bagIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractMapBag.BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  public void testBagIteratorNewBagIterator() {
    // Arrange and Act
    AbstractMapBag.BagIterator<Object> actualBagIterator = new AbstractMapBag.BagIterator<>(new HashBag<>());

    // Assert
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractMapBag.BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  public void testBagIteratorNewBagIterator2() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");

    // Act
    AbstractMapBag.BagIterator<Object> actualBagIterator = new AbstractMapBag.BagIterator<>(parent);

    // Assert
    assertEquals("Object", actualBagIterator.next());
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractMapBag.BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  public void testBagIteratorNewBagIterator3() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    parent.add("Object");

    // Act
    AbstractMapBag.BagIterator<Object> actualBagIterator = new AbstractMapBag.BagIterator<>(parent);

    // Assert
    assertEquals("Object", actualBagIterator.next());
    assertEquals("Object", actualBagIterator.next());
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapBag.BagIterator#next()}
   */
  @Test
  public void testBagIteratorNext() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    AbstractMapBag.BagIterator<Object> bagIterator = new AbstractMapBag.BagIterator<>(parent);

    // Act and Assert
    assertEquals("Object", bagIterator.next());
    assertFalse(bagIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractMapBag.BagIterator#remove()}
   */
  @Test
  public void testBagIteratorRemove() {
    // Arrange
    AbstractMapBag.BagIterator<Object> bagIterator = new AbstractMapBag.BagIterator<>(new HashBag<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bagIterator.remove());
  }

  /**
   * Method under test: {@link AbstractMapBag#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.contains("Object"));
  }

  /**
   * Method under test: {@link AbstractMapBag#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertTrue(hashBag.contains("Object"));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  public void testContainsAll() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  public void testContainsAll2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  public void testContainsAll3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  public void testContainsAll4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(hashBag.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  public void testContainsAll5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll(new HashBag<>()));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  public void testContainsAll6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.containsAll(other));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  public void testContainsAll7() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.containsAll(other));
  }

  /**
   * Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  public void testContainsAll8() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertTrue(hashBag.containsAll(other));
  }

  /**
   * Method under test: {@link AbstractMapBag#getCount(Object)}
   */
  @Test
  public void testGetCount() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.getCount("Object"));
  }

  /**
   * Method under test: {@link AbstractMapBag#getCount(Object)}
   */
  @Test
  public void testGetCount2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertEquals(1, hashBag.getCount("Object"));
  }

  /**
   * Method under test: {@link AbstractMapBag#getMap()}
   */
  @Test
  public void testGetMap() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.getMap().isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> hashBag2 = new HashBag<>();

    // Act and Assert
    assertEquals(hashBag, hashBag2);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    // Act and Assert
    assertEquals(hashBag, hashBag2);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(hashBag, hashBag);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag.hashCode());
  }

  /**
   * Method under test: {@link AbstractMapBag#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertFalse(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    Iterator<Object> actualIteratorResult = hashBag.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof AbstractMapBag.BagIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag.MutableInteger#equals(Object)}
   *   <li>{@link AbstractMapBag.MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractMapBag.MutableInteger mutableInteger = new AbstractMapBag.MutableInteger(42);
    AbstractMapBag.MutableInteger mutableInteger2 = new AbstractMapBag.MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger2);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapBag.MutableInteger#equals(Object)}
   *   <li>{@link AbstractMapBag.MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractMapBag.MutableInteger mutableInteger = new AbstractMapBag.MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger.hashCode());
  }

  /**
   * Method under test: {@link AbstractMapBag.MutableInteger#equals(Object)}
   */
  @Test
  public void testMutableIntegerEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractMapBag.MutableInteger mutableInteger = new AbstractMapBag.MutableInteger(1);

    // Act and Assert
    assertNotEquals(mutableInteger, new AbstractMapBag.MutableInteger(42));
  }

  /**
   * Method under test: {@link AbstractMapBag.MutableInteger#equals(Object)}
   */
  @Test
  public void testMutableIntegerEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AbstractMapBag.MutableInteger(42), null);
  }

  /**
   * Method under test: {@link AbstractMapBag.MutableInteger#equals(Object)}
   */
  @Test
  public void testMutableIntegerEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AbstractMapBag.MutableInteger(42), "Different type to MutableInteger");
  }

  /**
   * Method under test: {@link AbstractMapBag#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.remove("Object"));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object");

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.remove("Object", 1));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 1);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  public void testRemove5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 1);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  public void testRemove6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 0);

    // Assert
    assertEquals(1, hashBag.size());
    assertFalse(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.removeAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.removeAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.removeAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(new ArrayList<>());

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(new ArrayList<>());

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.retainAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.retainAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  public void testRetainAll7() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll8() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll(other));
    assertTrue(other.isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll9() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    HashBag<Object> other = new HashBag<>();

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertTrue(other.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll10() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");
    HashBag<Object> other = new HashBag<>();

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertTrue(other.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll11() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(1, other.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll12() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(2, other.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll13() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(1, other.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  public void testRetainAll14() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(2, other.size());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.size());
  }

  /**
   * Method under test: {@link AbstractMapBag#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.toArray().length);
  }

  /**
   * Method under test: {@link AbstractMapBag#toArray()}
   */
  @Test
  public void testToArray2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    Object[] actualToArrayResult = hashBag.toArray();

    // Assert
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  public void testToArray3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  public void testToArray4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  public void testToArray5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertEquals("Array", array[0]);
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", actualToArrayResult[1]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals("[]", hashBag.toString());
  }

  /**
   * Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  public void testToString2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertEquals("[1:Object]", hashBag.toString());
  }

  /**
   * Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  public void testToString3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(2);
    hashBag.add("Object");

    // Act and Assert
    assertEquals("[1:2,1:Object]", hashBag.toString());
  }

  /**
   * Method under test: {@link AbstractMapBag#uniqueSet()}
   */
  @Test
  public void testUniqueSet() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.uniqueSet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertNotEquals(hashBag, new HashBag<>());
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(2);

    // Act and Assert
    assertNotEquals(hashBag, hashBag2);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    // Act and Assert
    assertNotEquals(hashBag, hashBag2);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(0);
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertNotEquals(hashBag, null);
  }

  /**
   * Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertNotEquals(hashBag, "Different type to AbstractMapBag");
  }
}
