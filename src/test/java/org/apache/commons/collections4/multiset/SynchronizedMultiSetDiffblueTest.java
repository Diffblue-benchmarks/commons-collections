package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.MultiSet;
import org.junit.Test;

public class SynchronizedMultiSetDiffblueTest {
  /**
   * Method under test:
   * {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testNewSynchronizedMultiSet() {
    // Arrange and Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSet = new SynchronizedMultiSet<>(new HashMultiSet<>());

    // Assert
    assertTrue(actualSynchronizedMultiSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testSynchronizedMultiSet() {
    // Arrange and Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSetResult = SynchronizedMultiSet
        .synchronizedMultiSet(new HashMultiSet<>());

    // Assert
    assertTrue(actualSynchronizedMultiSetResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testSynchronizedMultiSet2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSetResult = SynchronizedMultiSet.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(1, actualSynchronizedMultiSetResult.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#synchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testSynchronizedMultiSet3() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSetResult = SynchronizedMultiSet.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testNewSynchronizedMultiSet2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSet = new SynchronizedMultiSet<>(multiset);

    // Assert
    assertEquals(1, actualSynchronizedMultiSet.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testNewSynchronizedMultiSet3() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset));
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}
   */
  @Test
  public void testNewSynchronizedMultiSet4() {
    // Arrange and Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSet = new SynchronizedMultiSet<>(new HashMultiSet<>(), "Lock");

    // Assert
    assertTrue(actualSynchronizedMultiSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}
   */
  @Test
  public void testNewSynchronizedMultiSet5() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    SynchronizedMultiSet<Object> actualSynchronizedMultiSet = new SynchronizedMultiSet<>(multiset, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedMultiSet.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet#SynchronizedMultiSet(MultiSet, Object)}
   */
  @Test
  public void testNewSynchronizedMultiSet6() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act and Assert
    assertEquals(multiset, new SynchronizedMultiSet<>(multiset, "Lock"));
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet.SynchronizedSet#SynchronizedSet(Set, Object)}
   */
  @Test
  public void testSynchronizedSetNewSynchronizedSet() {
    // Arrange and Act
    SynchronizedMultiSet.SynchronizedSet<Object> actualObjectSet = new SynchronizedMultiSet.SynchronizedSet<>(
        new HashSet<>(), "Lock");

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet.SynchronizedSet#SynchronizedSet(Set, Object)}
   */
  @Test
  public void testSynchronizedSetNewSynchronizedSet2() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SynchronizedMultiSet.SynchronizedSet<Object> actualObjectSet = new SynchronizedMultiSet.SynchronizedSet<>(set,
        "Lock");

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Method under test:
   * {@link SynchronizedMultiSet.SynchronizedSet#SynchronizedSet(Set, Object)}
   */
  @Test
  public void testSynchronizedSetNewSynchronizedSet3() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new SynchronizedMultiSet.SynchronizedSet<>(set, "Lock"));
  }
}
