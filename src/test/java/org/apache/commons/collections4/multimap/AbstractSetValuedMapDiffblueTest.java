package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractSetValuedMapDiffblueTest {
  /**
   * Test {@link AbstractSetValuedMap#get(Object)}.
   *
   * <p>Method under test: {@link AbstractSetValuedMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set AbstractSetValuedMap.get(Object)"})
  void testGet() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.get("Key").isEmpty());
  }

  /**
   * Test {@link AbstractSetValuedMap#getMap()}.
   *
   * <p>Method under test: {@link AbstractSetValuedMap#getMap()}
   */
  @Test
  @DisplayName("Test getMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map AbstractSetValuedMap.getMap()"})
  void testGetMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractSetValuedMap#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractSetValuedMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given HashSetValuedHashMap() 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set AbstractSetValuedMap.remove(Object)"})
  void testRemove_givenHashSetValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
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
   * Test {@link AbstractSetValuedMap#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractSetValuedMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given HashSetValuedHashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set AbstractSetValuedMap.remove(Object)"})
  void testRemove_givenHashSetValuedHashMap_thenReturnEmpty() {
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
   * Test {@link AbstractSetValuedMap#wrappedCollection(Object)}.
   *
   * <p>Method under test: {@link AbstractSetValuedMap#wrappedCollection(Object)}
   */
  @Test
  @DisplayName("Test wrappedCollection(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set AbstractSetValuedMap.wrappedCollection(Object)"})
  void testWrappedCollection() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.wrappedCollection("Key").isEmpty());
  }
}
