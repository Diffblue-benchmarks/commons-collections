package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DualLinkedHashBidiMapDiffblueTest {
  /**
   * Test {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap()}.
   *
   * <p>Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap()}
   */
  @Test
  @DisplayName("Test new DualLinkedHashBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DualLinkedHashBidiMap.<init>()",
    "void DualLinkedHashBidiMap.<init>(Map, Map, BidiMap)"
  })
  void testNewDualLinkedHashBidiMap() {
    // Arrange and Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map)}.
   *
   * <p>Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map)}
   */
  @Test
  @DisplayName("Test new DualLinkedHashBidiMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualLinkedHashBidiMap.<init>(Map)"})
  void testNewDualLinkedHashBidiMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map, Map, BidiMap)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @DisplayName("Test new DualLinkedHashBidiMap(Map, Map, BidiMap); when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DualLinkedHashBidiMap.<init>()",
    "void DualLinkedHashBidiMap.<init>(Map, Map, BidiMap)"
  })
  void testNewDualLinkedHashBidiMap_whenHashMap() {
    // Arrange
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap =
        new DualLinkedHashBidiMap<>(normalMap, reverseMap, new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualLinkedHashBidiMap#createBidiMap(Map, Map, BidiMap)}.
   *
   * <p>Method under test: {@link DualLinkedHashBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @DisplayName("Test createBidiMap(Map, Map, BidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BidiMap DualLinkedHashBidiMap.createBidiMap(Map, Map, BidiMap)"})
  void testCreateBidiMap() {
    // Arrange
    DualLinkedHashBidiMap<Object, Object> objectObjectMap = new DualLinkedHashBidiMap<>();
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act
    BidiMap<Object, Object> actualCreateBidiMapResult =
        objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>());

    // Assert
    assertEquals(objectObjectMap, actualCreateBidiMapResult);
  }
}
