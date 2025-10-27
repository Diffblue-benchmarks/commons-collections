package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.OrderedIterator;
import org.junit.Test;

public class ListOrderedSetDiffblueTest {
  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  public void testListOrderedSet() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertTrue(list.isEmpty());
    assertTrue(actualListOrderedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  public void testListOrderedSet2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(1, actualListOrderedSetResult.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  public void testListOrderedSet3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(1, actualListOrderedSetResult.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(List)}
   */
  @Test
  public void testListOrderedSet4() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add(2);
    list.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(list);

    // Assert
    assertEquals(2, list.size());
    assertEquals(2, actualListOrderedSetResult.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set)}
   */
  @Test
  public void testListOrderedSet5() {
    // Arrange and Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(new HashSet<>());

    // Assert
    assertTrue(actualListOrderedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set)}
   */
  @Test
  public void testListOrderedSet6() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set);

    // Assert
    assertEquals(1, actualListOrderedSetResult.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set)}
   */
  @Test
  public void testListOrderedSet7() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set);

    // Assert
    assertEquals(set, actualListOrderedSetResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  public void testListOrderedSet8() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    ListOrderedSet<Object> actualListOrderedSetResult = ListOrderedSet.listOrderedSet(set, new ArrayList<>());

    // Assert
    assertTrue(actualListOrderedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  public void testListOrderedSet9() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  public void testListOrderedSet10() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  public void testListOrderedSet11() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, list));
  }

  /**
   * Method under test: {@link ListOrderedSet#listOrderedSet(Set, List)}
   */
  @Test
  public void testListOrderedSet12() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListOrderedSet.listOrderedSet(set, list));
  }

  /**
   * Method under test: {@link ListOrderedSet#add(int, Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    objectSet.add(1, "Object");

    // Assert that nothing has changed
    assertEquals(1, objectSet.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#add(int, Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add(2);

    // Act
    objectSet.add(1, "Object");

    // Assert
    assertEquals(2, objectSet.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#add(Object)}
   */
  @Test
  public void testAdd3() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act
    boolean actualAddResult = objectSet.add("Object");

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#add(Object)}
   */
  @Test
  public void testAdd4() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    boolean actualAddResult = objectSet.add("Object");

    // Assert
    assertEquals(1, objectSet.size());
    assertFalse(actualAddResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#addAll(int, Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.addAll(1, new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#addAll(int, Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(1, coll);

    // Assert
    assertEquals(2, objectSet.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#addAll(Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.addAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#addAll(Collection)}
   */
  @Test
  public void testAddAll4() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(coll);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#addAll(Collection)}
   */
  @Test
  public void testAddAll5() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectSet.addAll(coll);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#asList()}
   */
  @Test
  public void testAsList() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertTrue(objectSet.asList().isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act and Assert
    assertEquals("Object", objectSet.get(0));
  }

  /**
   * Method under test: {@link ListOrderedSet#indexOf(Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(-1, objectSet.indexOf("Object"));
  }

  /**
   * Method under test: {@link ListOrderedSet#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act
    OrderedIterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ListOrderedSet.OrderedSetIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link ListOrderedSet#remove(int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act and Assert
    assertEquals("Object", objectSet.remove(0));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.remove("Object"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    boolean actualRemoveResult = objectSet.remove("Object");

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.removeAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll4() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = objectSet.removeAll(coll);

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertFalse(objectSet.retainAll(new ArrayList<>()));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act
    boolean actualRetainAllResult = objectSet.retainAll(new ArrayList<>());

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll3() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll4() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(0, objectSet.toArray().length);
  }

  /**
   * Method under test: {@link ListOrderedSet#toArray(Object[])}
   */
  @Test
  public void testToArray2() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    Object[] a = new Object[]{"42"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(a);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(a[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, a.length);
    assertSame(a, actualToArrayResult);
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet()}
   */
  @Test
  public void testNewListOrderedSet() {
    // Arrange and Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>();

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set)}
   */
  @Test
  public void testNewListOrderedSet2() {
    // Arrange and Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>(new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set)}
   */
  @Test
  public void testNewListOrderedSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>(set);

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set)}
   */
  @Test
  public void testNewListOrderedSet4() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new ListOrderedSet<>(set));
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set, List)}
   */
  @Test
  public void testNewListOrderedSet5() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>(set, new ArrayList<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set, List)}
   */
  @Test
  public void testNewListOrderedSet6() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>(set, list);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#ListOrderedSet(Set, List)}
   */
  @Test
  public void testNewListOrderedSet7() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ListOrderedSet<Object> actualObjectSet = new ListOrderedSet<>(set, list);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link ListOrderedSet#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals("[]", objectSet.toString());
  }
}
