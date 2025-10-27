package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class HashMultiSetDiffblueTest {
  /**
   * Method under test: {@link HashMultiSet#HashMultiSet()}
   */
  @Test
  public void testNewHashMultiSet() {
    // Arrange and Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>();

    // Assert
    assertTrue(actualHashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link HashMultiSet#HashMultiSet(Collection)}
   */
  @Test
  public void testNewHashMultiSet2() {
    // Arrange and Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>(new ArrayList<>());

    // Assert
    assertTrue(actualHashMultiSet.isEmpty());
  }

  /**
   * Method under test: {@link HashMultiSet#HashMultiSet(Collection)}
   */
  @Test
  public void testNewHashMultiSet3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>(coll);

    // Assert
    assertEquals(1, actualHashMultiSet.size());
  }

  /**
   * Method under test: {@link HashMultiSet#HashMultiSet(Collection)}
   */
  @Test
  public void testNewHashMultiSet4() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    HashMultiSet<Object> actualHashMultiSet = new HashMultiSet<>(coll);

    // Assert
    assertEquals(2, actualHashMultiSet.size());
  }
}
