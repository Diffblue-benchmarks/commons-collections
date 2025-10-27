package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class CompositeSetDiffblueTest {
  /**
   * Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.add("Obj"));
  }

  /**
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  public void testAddComposited() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set = new HashSet<>();

    // Act
    objectSet.addComposited(set);

    // Assert
    assertTrue(set.isEmpty());
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  public void testAddComposited2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(1, set.size());
    assertEquals(1, objectSet.size());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  public void testAddComposited3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  public void testAddComposited4() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertTrue(set1.isEmpty());
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  public void testAddComposited5() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add("42");

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertEquals(1, set1.size());
    assertEquals(1, objectSet.size());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  public void testAddComposited6() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add(2);
    set1.add("42");

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set1);
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  public void testAddComposited7() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    HashSet<Object> set2 = new HashSet<>();
    set2.add("42");

    // Act
    objectSet.addComposited(set1, set2);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(set1.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  public void testAddComposited8() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    HashSet<Object> set2 = new HashSet<>();
    set2.add(2);
    set2.add("42");

    // Act
    objectSet.addComposited(set1, set2);

    // Assert
    assertEquals(2, objectSet.size());
    assertTrue(set1.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  public void testAddComposited9() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add("42");

    HashSet<Object> set2 = new HashSet<>();
    set2.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addComposited(set1, set2));
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  public void testAddComposited10() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited(new HashSet<>());

    // Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  public void testAddComposited11() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited((Set<Object>[]) null);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  public void testAddComposited12() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> objectSet2 = new HashSet<>();
    Set<Object>[] sets = new Set[]{objectSet2, new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert
    assertEquals(2, sets.length);
    Set<Object> objectSet3 = sets[0];
    assertTrue(objectSet3.isEmpty());
    assertTrue(objectSet.isEmpty());
    assertSame(objectSet2, objectSet3);
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  public void testAddComposited13() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");
    Set<Object>[] sets = new Set[]{objectSet2, new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert
    Set<Object> objectSet3 = sets[0];
    assertEquals(1, objectSet3.size());
    assertEquals(1, objectSet.size());
    assertEquals(2, sets.length);
    assertSame(objectSet2, objectSet3);
  }

  /**
   * Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  public void testAddComposited14() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    HashSet<Object> objectSet3 = new HashSet<>();
    objectSet3.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addComposited(objectSet2, objectSet3));
  }

  /**
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.contains("Obj"));
  }

  /**
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.contains("Obj"));
  }

  /**
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  public void testContains3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.contains(new CompositeSet<>()));
  }

  /**
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  public void testContains4() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(0);

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertFalse(objectSet.contains(new CompositeSet<>()));
  }

  /**
   * Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  public void testContains5() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertTrue(objectSet.contains("42"));
  }

  /**
   * Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  public void testContainsAll() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.containsAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  public void testContainsAll2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.containsAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  public void testContainsAll3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.containsAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#getSets()}
   */
  @Test
  public void testGetSets() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.getSets().isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet.hashCode());
  }

  /**
   * Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  public void testIsEmpty3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertFalse(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.remove("Obj"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.remove("Obj"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    boolean actualRemoveResult = objectSet.remove("42");

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.retainAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  public void testRetainAll3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
  }

  /**
   * Method under test: {@link CompositeSet#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.size());
  }

  /**
   * Method under test: {@link CompositeSet#size()}
   */
  @Test
  public void testSize2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertEquals(0, objectSet.size());
  }

  /**
   * Method under test: {@link CompositeSet#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.toArray().length);
  }

  /**
   * Method under test: {@link CompositeSet#toArray()}
   */
  @Test
  public void testToArray2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertEquals(0, objectSet.toArray().length);
  }

  /**
   * Method under test: {@link CompositeSet#toArray()}
   */
  @Test
  public void testToArray3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    Object[] actualToArrayResult = objectSet.toArray();

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  public void testToArray4() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  public void testToArray5() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    Object[] array = new Object[]{};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertEquals(0, actualToArrayResult.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  public void testToArray6() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  public void testToArray7() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("42", array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  public void testToArray8() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertEquals("42", actualToArrayResult[1]);
    assertEquals("Array", array[0]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  public void testToSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  public void testToSet2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  public void testToSet3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertNotEquals(objectSet, new CompositeSet<>());
  }

  /**
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, null);
  }

  /**
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, "Different type to CompositeSet");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#CompositeSet()}
   *   <li>{@link CompositeSet#setMutator(CompositeSet.SetMutator)}
   *   <li>{@link CompositeSet#getMutator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>();
    actualObjectSet.setMutator(null);
    actualObjectSet.getMutator();

    // Assert that nothing has changed
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  public void testNewCompositeSet() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  public void testNewCompositeSet2() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  public void testNewCompositeSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(set);

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  public void testNewCompositeSet4() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  public void testNewCompositeSet5() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  public void testNewCompositeSet6() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>[]) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  public void testNewCompositeSet7() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  public void testNewCompositeSet8() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  public void testNewCompositeSet9() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> new CompositeSet<>(objectSet, objectSet2));
  }
}
