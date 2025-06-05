package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractListValuedMapDiffblueTest {
  /**
   * Test {@link AbstractListValuedMap#get(Object)}.
   * <p>
   * Method under test: {@link AbstractListValuedMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List AbstractListValuedMap.get(Object)"})
  void testGet() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.get("Key").isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#getMap()}.
   * <p>
   * Method under test: {@link AbstractListValuedMap#getMap()}
   */
  @Test
  @DisplayName("Test getMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Map AbstractListValuedMap.getMap()"})
  void testGetMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListValuedMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given ArrayListValuedHashMap() 'Key' is 'Value'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List AbstractListValuedMap.remove(Object)"})
  void testRemove_givenArrayListValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertEquals(1, actualRemoveResult.size());
    assertEquals("Value", actualRemoveResult.get(0));
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListValuedMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given ArrayListValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List AbstractListValuedMap.remove(Object)"})
  void testRemove_givenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(actualRemoveResult.isEmpty());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#wrappedCollection(Object)}.
   * <p>
   * Method under test: {@link AbstractListValuedMap#wrappedCollection(Object)}
   */
  @Test
  @DisplayName("Test wrappedCollection(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List AbstractListValuedMap.wrappedCollection(Object)"})
  void testWrappedCollection() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.wrappedCollection("Key").isEmpty());
  }
}
