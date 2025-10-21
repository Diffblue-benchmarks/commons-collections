package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DualLinkedHashBidiMapDiffblueTest {
  /**
   * Test {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap()}.
   * <p>
   * Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualLinkedHashBidiMap.<init>()", "void DualLinkedHashBidiMap.<init>(Map, Map, BidiMap)"})
  public void testNewDualLinkedHashBidiMap() {
    // Arrange and Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map)}.
   * <p>
   * Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualLinkedHashBidiMap.<init>(Map)"})
  public void testNewDualLinkedHashBidiMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act and Assert
    assertEquals(map, new DualLinkedHashBidiMap<>(map));
  }

  /**
   * Test {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map, Map, BidiMap)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualLinkedHashBidiMap#DualLinkedHashBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualLinkedHashBidiMap.<init>()", "void DualLinkedHashBidiMap.<init>(Map, Map, BidiMap)"})
  public void testNewDualLinkedHashBidiMap_whenHashMap() {
    // Arrange
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act
    DualLinkedHashBidiMap<Object, Object> actualObjectObjectMap = new DualLinkedHashBidiMap<>(normalMap, reverseMap,
        new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualLinkedHashBidiMap#createBidiMap(Map, Map, BidiMap)}.
   * <p>
   * Method under test: {@link DualLinkedHashBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BidiMap DualLinkedHashBidiMap.createBidiMap(Map, Map, BidiMap)"})
  public void testCreateBidiMap() {
    // Arrange
    DualLinkedHashBidiMap<Object, Object> objectObjectMap = new DualLinkedHashBidiMap<>();
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()));
  }
}
