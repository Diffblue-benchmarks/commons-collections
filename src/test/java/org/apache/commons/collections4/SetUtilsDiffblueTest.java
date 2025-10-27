package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.Test;

public class SetUtilsDiffblueTest {
  /**
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  public void testDifference() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetUtils.SetView<Object> actualDifferenceResult = SetUtils.difference(setA, new HashSet<>());

    // Assert
    assertTrue(actualDifferenceResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  public void testDifference2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualDifferenceResult = SetUtils.difference(setA, new HashSet<>());

    // Assert
    assertEquals(1, actualDifferenceResult.size());
  }

  /**
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  public void testDifference3() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualDifferenceResult = SetUtils.difference(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDifferenceResult);
  }

  /**
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  public void testDifference4() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualDifferenceResult = SetUtils.difference(setA, setB);

    // Assert
    assertTrue(actualDifferenceResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#difference(Set, Set)}
   */
  @Test
  public void testDifference5() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualDifferenceResult = SetUtils.difference(setA, setB);

    // Assert
    assertTrue(actualDifferenceResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  public void testDisjunction() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetUtils.SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, new HashSet<>());

    // Assert
    assertTrue(actualDisjunctionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  public void testDisjunction2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, new HashSet<>());

    // Assert
    assertEquals(1, actualDisjunctionResult.size());
  }

  /**
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  public void testDisjunction3() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualDisjunctionResult);
  }

  /**
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  public void testDisjunction4() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, setB);

    // Assert
    assertEquals(1, actualDisjunctionResult.size());
  }

  /**
   * Method under test: {@link SetUtils#disjunction(Set, Set)}
   */
  @Test
  public void testDisjunction5() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualDisjunctionResult = SetUtils.disjunction(setA, setB);

    // Assert
    assertEquals(setB, actualDisjunctionResult);
  }

  /**
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  public void testEmptyIfNull() {
    // Arrange and Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(new HashSet<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  public void testEmptyIfNull2() {
    // Arrange and Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  public void testEmptyIfNull3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(set);

    // Assert
    assertEquals(1, actualEmptyIfNullResult.size());
  }

  /**
   * Method under test: {@link SetUtils#emptyIfNull(Set)}
   */
  @Test
  public void testEmptyIfNull4() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualEmptyIfNullResult = SetUtils.emptyIfNull(set);

    // Assert
    assertEquals(2, actualEmptyIfNullResult.size());
  }

  /**
   * Method under test: {@link SetUtils#emptySet()}
   */
  @Test
  public void testEmptySet() {
    // Arrange and Act
    Set<Object> actualEmptySetResult = SetUtils.emptySet();

    // Assert
    assertTrue(actualEmptySetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#emptySortedSet()}
   */
  @Test
  public void testEmptySortedSet() {
    // Arrange and Act
    SortedSet<Object> actualEmptySortedSetResult = SetUtils.emptySortedSet();

    // Assert
    assertTrue(actualEmptySortedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  public void testHashCodeForSet() {
    // Arrange, Act and Assert
    assertEquals(0, SetUtils.hashCodeForSet(new ArrayList<>()));
    assertEquals(0, SetUtils.hashCodeForSet(null));
  }

  /**
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  public void testHashCodeForSet2() {
    // Arrange
    LinkedHashSet<Object> set = new LinkedHashSet<>();
    set.add(null);

    // Act and Assert
    assertEquals(0, SetUtils.hashCodeForSet(set));
  }

  /**
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  public void testHashCodeForSet3() {
    // Arrange
    LinkedHashSet<Object> set = new LinkedHashSet<>();
    set.add("Set");

    // Act and Assert
    assertEquals(83010, SetUtils.hashCodeForSet(set));
  }

  /**
   * Method under test: {@link SetUtils#hashCodeForSet(Collection)}
   */
  @Test
  public void testHashCodeForSet4() {
    // Arrange
    ArrayList<Object> set = new ArrayList<>();
    set.add("42");
    set.add("42");

    // Act and Assert
    assertEquals(3324, SetUtils.hashCodeForSet(set));
  }

  /**
   * Method under test: {@link SetUtils#hashSet(Object[])}
   */
  @Test
  public void testHashSet() {
    // Arrange and Act
    HashSet<Object> actualHashSetResult = SetUtils.hashSet("Items");

    // Assert
    assertEquals(1, actualHashSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#hashSet(Object[])}
   */
  @Test
  public void testHashSet2() {
    // Arrange and Act
    HashSet<Object> actualHashSetResult = SetUtils.hashSet(null);

    // Assert
    assertNull(actualHashSetResult);
  }

  /**
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  public void testIntersection() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetUtils.SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, new HashSet<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  public void testIntersection2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, new HashSet<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  public void testIntersection3() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, new HashSet<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  public void testIntersection4() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, setB);

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#intersection(Set, Set)}
   */
  @Test
  public void testIntersection5() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualIntersectionResult = SetUtils.intersection(setA, setB);

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();

    // Act and Assert
    assertTrue(SetUtils.isEqualSet(set1, new ArrayList<>()));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet2() {
    // Arrange, Act and Assert
    assertTrue(SetUtils.isEqualSet(null, null));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet3() {
    // Arrange, Act and Assert
    assertFalse(SetUtils.isEqualSet(null, new ArrayList<>()));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet4() {
    // Arrange, Act and Assert
    assertFalse(SetUtils.isEqualSet(new ArrayList<>(), null));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet5() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();
    set1.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, new ArrayList<>()));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet6() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();
    set1.add("42");
    set1.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, new ArrayList<>()));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet7() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();

    ArrayList<Object> set2 = new ArrayList<>();
    set2.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, set2));
  }

  /**
   * Method under test: {@link SetUtils#isEqualSet(Collection, Collection)}
   */
  @Test
  public void testIsEqualSet8() {
    // Arrange
    ArrayList<Object> set1 = new ArrayList<>();

    ArrayList<Object> set2 = new ArrayList<>();
    set2.add("42");
    set2.add("42");

    // Act and Assert
    assertFalse(SetUtils.isEqualSet(set1, set2));
  }

  /**
   * Method under test: {@link SetUtils#newIdentityHashSet()}
   */
  @Test
  public void testNewIdentityHashSet() {
    // Arrange and Act
    Set<Object> actualNewIdentityHashSetResult = SetUtils.newIdentityHashSet();

    // Assert
    assertTrue(actualNewIdentityHashSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#orderedSet(Set)}
   */
  @Test
  public void testOrderedSet() {
    // Arrange and Act
    Set<Object> actualOrderedSetResult = SetUtils.orderedSet(new HashSet<>());

    // Assert
    assertTrue(actualOrderedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#orderedSet(Set)}
   */
  @Test
  public void testOrderedSet2() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualOrderedSetResult = SetUtils.orderedSet(set);

    // Assert
    assertEquals(1, actualOrderedSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#orderedSet(Set)}
   */
  @Test
  public void testOrderedSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualOrderedSetResult = SetUtils.orderedSet(set);

    // Assert
    assertEquals(set, actualOrderedSetResult);
  }

  /**
   * Method under test: {@link SetUtils#synchronizedSet(Set)}
   */
  @Test
  public void testSynchronizedSet() {
    // Arrange and Act
    Set<Object> actualSynchronizedSetResult = SetUtils.synchronizedSet(new HashSet<>());

    // Assert
    assertTrue(actualSynchronizedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#synchronizedSet(Set)}
   */
  @Test
  public void testSynchronizedSet2() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualSynchronizedSetResult = SetUtils.synchronizedSet(set);

    // Assert
    assertEquals(1, actualSynchronizedSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#synchronizedSet(Set)}
   */
  @Test
  public void testSynchronizedSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualSynchronizedSetResult = SetUtils.synchronizedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSetResult);
  }

  /**
   * Method under test: {@link SetUtils#synchronizedSortedSet(SortedSet)}
   */
  @Test
  public void testSynchronizedSortedSet() {
    // Arrange and Act
    SortedSet<Object> actualSynchronizedSortedSetResult = SetUtils.synchronizedSortedSet(new TreeSet<>());

    // Assert
    assertTrue(actualSynchronizedSortedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#synchronizedSortedSet(SortedSet)}
   */
  @Test
  public void testSynchronizedSortedSet2() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualSynchronizedSortedSetResult = SetUtils.synchronizedSortedSet(set);

    // Assert
    assertEquals(1, actualSynchronizedSortedSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#synchronizedSortedSet(SortedSet)}
   */
  @Test
  public void testSynchronizedSortedSet3() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualSynchronizedSortedSetResult = SetUtils.synchronizedSortedSet(set);

    // Assert
    assertEquals(set, actualSynchronizedSortedSetResult);
  }

  /**
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  public void testUnion() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    // Act
    SetUtils.SetView<Object> actualUnionResult = SetUtils.union(setA, new HashSet<>());

    // Assert
    assertTrue(actualUnionResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  public void testUnion2() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualUnionResult = SetUtils.union(setA, new HashSet<>());

    // Assert
    assertEquals(1, actualUnionResult.size());
  }

  /**
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  public void testUnion3() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();
    setA.add(2);
    setA.add("42");

    // Act
    SetUtils.SetView<Object> actualUnionResult = SetUtils.union(setA, new HashSet<>());

    // Assert
    assertEquals(setA, actualUnionResult);
  }

  /**
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  public void testUnion4() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualUnionResult = SetUtils.union(setA, setB);

    // Assert
    assertEquals(1, actualUnionResult.size());
  }

  /**
   * Method under test: {@link SetUtils#union(Set, Set)}
   */
  @Test
  public void testUnion5() {
    // Arrange
    HashSet<Object> setA = new HashSet<>();

    HashSet<Object> setB = new HashSet<>();
    setB.add(2);
    setB.add("42");

    // Act
    SetUtils.SetView<Object> actualUnionResult = SetUtils.union(setA, setB);

    // Assert
    assertEquals(setB, actualUnionResult);
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  public void testUnmodifiableNavigableSet() {
    // Arrange and Act
    SortedSet<Object> actualUnmodifiableNavigableSetResult = SetUtils.unmodifiableNavigableSet(new TreeSet<>());

    // Assert
    assertTrue(actualUnmodifiableNavigableSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  public void testUnmodifiableNavigableSet2() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableNavigableSetResult = SetUtils.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(1, actualUnmodifiableNavigableSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  public void testUnmodifiableNavigableSet3() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableNavigableSetResult = SetUtils.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSet(Set)}
   */
  @Test
  public void testUnmodifiableSet() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet(new HashSet<>());

    // Assert
    assertTrue(actualUnmodifiableSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSet(Set)}
   */
  @Test
  public void testUnmodifiableSet2() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet(set);

    // Assert
    assertEquals(1, actualUnmodifiableSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSet(Set)}
   */
  @Test
  public void testUnmodifiableSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSetResult);
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSet(Object[])}
   */
  @Test
  public void testUnmodifiableSet4() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet("Items");

    // Assert
    assertEquals(1, actualUnmodifiableSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSet(Object[])}
   */
  @Test
  public void testUnmodifiableSet5() {
    // Arrange and Act
    Set<Object> actualUnmodifiableSetResult = SetUtils.unmodifiableSet((Object[]) null);

    // Assert
    assertNull(actualUnmodifiableSetResult);
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  public void testUnmodifiableSortedSet() {
    // Arrange and Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(new TreeSet<>());

    // Assert
    assertTrue(actualUnmodifiableSortedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  public void testUnmodifiableSortedSet2() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(set);

    // Assert
    assertEquals(1, actualUnmodifiableSortedSetResult.size());
  }

  /**
   * Method under test: {@link SetUtils#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  public void testUnmodifiableSortedSet3() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = SetUtils.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }
}
