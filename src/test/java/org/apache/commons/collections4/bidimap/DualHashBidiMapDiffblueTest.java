package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DualHashBidiMapDiffblueTest {
  /**
   * Test {@link DualHashBidiMap#DualHashBidiMap()}.
   * <p>
   * Method under test: {@link DualHashBidiMap#DualHashBidiMap()}
   */
  @Test
  @DisplayName("Test new DualHashBidiMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualHashBidiMap.<init>()", "void DualHashBidiMap.<init>(Map, Map, BidiMap)"})
  void testNewDualHashBidiMap() {
    // Arrange and Act
    DualHashBidiMap<Object, Object> actualObjectObjectMap = new DualHashBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualHashBidiMap#DualHashBidiMap(Map)}.
   * <p>
   * Method under test: {@link DualHashBidiMap#DualHashBidiMap(Map)}
   */
  @Test
  @DisplayName("Test new DualHashBidiMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualHashBidiMap.<init>(Map)"})
  void testNewDualHashBidiMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act and Assert
    assertEquals(map, new DualHashBidiMap<>(map));
  }

  /**
   * Test {@link DualHashBidiMap#DualHashBidiMap(Map, Map, BidiMap)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DualHashBidiMap#DualHashBidiMap(Map, Map, BidiMap)}
   *   <li>{@link DualHashBidiMap#DualHashBidiMap()}
   * </ul>
   */
  @Test
  @DisplayName("Test new DualHashBidiMap(Map, Map, BidiMap); when HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualHashBidiMap.<init>()", "void DualHashBidiMap.<init>(Map, Map, BidiMap)"})
  void testNewDualHashBidiMap_whenHashMap() {
    // Arrange
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act
    DualHashBidiMap<Object, Object> actualObjectObjectMap = new DualHashBidiMap<>(normalMap, reverseMap,
        new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualHashBidiMap#createBidiMap(Map, Map, BidiMap)}.
   * <p>
   * Method under test: {@link DualHashBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @DisplayName("Test createBidiMap(Map, Map, BidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BidiMap DualHashBidiMap.createBidiMap(Map, Map, BidiMap)"})
  void testCreateBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()));
  }
}
