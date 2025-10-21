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

public class DualHashBidiMapDiffblueTest {
  /**
   * Test {@link DualHashBidiMap#DualHashBidiMap()}.
   * <p>
   * Method under test: {@link DualHashBidiMap#DualHashBidiMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualHashBidiMap.<init>()", "void DualHashBidiMap.<init>(Map, Map, BidiMap)"})
  public void testNewDualHashBidiMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualHashBidiMap.<init>(Map)"})
  public void testNewDualHashBidiMap2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualHashBidiMap.<init>()", "void DualHashBidiMap.<init>(Map, Map, BidiMap)"})
  public void testNewDualHashBidiMap_whenHashMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BidiMap DualHashBidiMap.createBidiMap(Map, Map, BidiMap)"})
  public void testCreateBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    HashMap<Object, Object> normalMap = new HashMap<>();
    HashMap<Object, Object> reverseMap = new HashMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()));
  }
}
