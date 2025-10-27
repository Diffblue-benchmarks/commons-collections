package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.Test;

public class AbstractSetValuedMapDiffblueTest {
  /**
   * Method under test: {@link AbstractSetValuedMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.get("Key").isEmpty());
  }

  /**
   * Method under test: {@link AbstractSetValuedMap#getMap()}
   */
  @Test
  public void testGetMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
  }

  /**
   * Method under test: {@link AbstractSetValuedMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act
    Set<Object> actualRemoveResult = hashSetValuedHashMap.remove("Key");

    // Assert
    assertEquals(0, hashSetValuedHashMap.size());
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualRemoveResult.isEmpty());
    assertTrue(hashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractSetValuedMap#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();
    hashSetValuedHashMap.put("Key", "Value");

    // Act
    Set<Object> actualRemoveResult = hashSetValuedHashMap.remove("Key");

    // Assert
    assertEquals(0, hashSetValuedHashMap.size());
    assertEquals(1, actualRemoveResult.size());
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
    assertTrue(hashSetValuedHashMap.isEmpty());
  }

  /**
   * Method under test: {@link AbstractSetValuedMap#wrappedCollection(Object)}
   */
  @Test
  public void testWrappedCollection() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.wrappedCollection("Key").isEmpty());
  }
}
