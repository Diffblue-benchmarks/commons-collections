package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.awt.Component;
import java.awt.Component.BaselineResizeBehavior;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement;
import org.apache.commons.collections4.bidimap.TreeBidiMap.Node;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TreeBidiMapDiffblueTest {
  /**
   * Test DataElement {@link DataElement#toString()}.
   * <p>
   * Method under test: {@link DataElement#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String DataElement.toString()"})
  public void testDataElementToString() {
    // Arrange, Act and Assert
    assertEquals("key", DataElement.valueOf("KEY").toString());
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap()}.
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>()"})
  public void testNewTreeBidiMap() {
    // Arrange and Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Assert
    assertTrue(actualBaselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>Given {@code OTHER}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code OTHER} is {@code OTHER}.</li>
   *   <li>Then return size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_givenOther_whenHashMapOtherIsOther_thenReturnSizeIsFour() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(
        map);

    // Assert
    assertEquals(4, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(BaselineResizeBehavior.OTHER,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>Then return {@code CONSTANT_DESCENT} is {@code OTHER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_thenReturnConstantDescentIsOther() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(
        map);

    // Assert
    assertEquals(3, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.OTHER,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>Then return {@code OTHER} is {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_thenReturnOtherIsConstantAscent() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(
        map);

    // Assert
    assertEquals(3, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CENTER_OFFSET} is {@code CENTER_OFFSET}.</li>
   *   <li>Then return size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_whenHashMapCenterOffsetIsCenterOffset_thenReturnSizeIsThree() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(
        map);

    // Assert
    assertEquals(3, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CONSTANT_ASCENT} is {@code CONSTANT_ASCENT}.</li>
   *   <li>Then return {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_whenHashMapConstantAscentIsConstantAscent_thenReturnHashMap() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(map, new TreeBidiMap<>(map));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CONSTANT_DESCENT} is {@code CONSTANT_DESCENT}.</li>
   *   <li>Then return {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_whenHashMapConstantDescentIsConstantDescent_thenReturnHashMap() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(map, new TreeBidiMap<>(map));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code OTHER} is {@code CENTER_OFFSET}.</li>
   *   <li>Then return {@code OTHER} is {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_whenHashMapOtherIsCenterOffset_thenReturnOtherIsCenterOffset() {
    // Arrange
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(
        map);

    // Assert
    assertEquals(3, actualBaselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        actualBaselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#TreeBidiMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#TreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.<init>(Map)"})
  public void testNewTreeBidiMap_whenHashMap_thenReturnEmpty() {
    // Arrange and Act
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> actualBaselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>(
        new HashMap<>());

    // Assert
    assertTrue(actualBaselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#containsKey(Object)}.
   * <p>
   * Method under test: {@link TreeBidiMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.containsKey(Object)"})
  public void testContainsKey() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertFalse(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey("Key"));
  }

  /**
   * Test {@link TreeBidiMap#containsValue(Object)}.
   * <p>
   * Method under test: {@link TreeBidiMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.containsValue(Object)"})
  public void testContainsValue() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertFalse(baselineResizeBehaviorBaselineResizeBehaviorMap.containsValue("Value"));
  }

  /**
   * Test {@link TreeBidiMap#entrySet()}.
   * <p>
   * Method under test: {@link TreeBidiMap#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set TreeBidiMap.entrySet()"})
  public void testEntrySet() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.entrySet().isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}, and {@link TreeBidiMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();

    // Act and Assert
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap2.hashCode());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}, and {@link TreeBidiMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap2.hashCode());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}, and {@link TreeBidiMap#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#equals(Object)}
   *   <li>{@link TreeBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap);
    int expectedHashCodeResult = baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode();
    assertEquals(expectedHashCodeResult, baselineResizeBehaviorBaselineResizeBehaviorMap.hashCode());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, new TreeBidiMap<>());
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap2 = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap2.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, baselineResizeBehaviorBaselineResizeBehaviorMap2);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, null);
  }

  /**
   * Test {@link TreeBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.equals(Object)", "int TreeBidiMap.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNotEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, "Different type to TreeBidiMap");
  }

  /**
   * Test {@link TreeBidiMap#firstKey()}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code CONSTANT_DESCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.firstKey()"})
  public void testFirstKey_givenTreeBidiMapConstantDescentIsConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, baselineResizeBehaviorBaselineResizeBehaviorMap.firstKey());
  }

  /**
   * Test {@link TreeBidiMap#firstKey()}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.firstKey()"})
  public void testFirstKey_givenTreeBidiMap_thenThrowNoSuchElementException() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> baselineResizeBehaviorBaselineResizeBehaviorMap.firstKey());
  }

  /**
   * Test {@link TreeBidiMap#firstKey()}.
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.firstKey()"})
  public void testFirstKey_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, baselineResizeBehaviorBaselineResizeBehaviorMap.firstKey());
  }

  /**
   * Test {@link TreeBidiMap#get(Object)}.
   * <p>
   * Method under test: {@link TreeBidiMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.get(Object)"})
  public void testGet() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.get("Key"));
  }

  /**
   * Test {@link TreeBidiMap#getKey(Object)}.
   * <p>
   * Method under test: {@link TreeBidiMap#getKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.getKey(Object)"})
  public void testGetKey() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.getKey("Value"));
  }

  /**
   * Test {@link TreeBidiMap#inverseBidiMap()}.
   * <p>
   * Method under test: {@link TreeBidiMap#inverseBidiMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.OrderedBidiMap TreeBidiMap.inverseBidiMap()"})
  public void testInverseBidiMap() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.inverseBidiMap().isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_ASCENT} is {@code CONSTANT_ASCENT}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.isEmpty()"})
  public void testIsEmpty_givenTreeBidiMapConstantAscentIsConstantAscent_thenReturnFalse() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertFalse(baselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBidiMap.isEmpty()"})
  public void testIsEmpty_givenTreeBidiMap_thenReturnTrue() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#keySet()}.
   * <p>
   * Method under test: {@link TreeBidiMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set TreeBidiMap.keySet()"})
  public void testKeySet() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.keySet().isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#lastKey()}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code CENTER_OFFSET}.</li>
   *   <li>Then return {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.lastKey()"})
  public void testLastKey_givenTreeBidiMapCenterOffsetIsCenterOffset_thenReturnCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET, baselineResizeBehaviorBaselineResizeBehaviorMap.lastKey());
  }

  /**
   * Test {@link TreeBidiMap#lastKey()}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.lastKey()"})
  public void testLastKey_givenTreeBidiMap_thenThrowNoSuchElementException() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> baselineResizeBehaviorBaselineResizeBehaviorMap.lastKey());
  }

  /**
   * Test {@link TreeBidiMap#lastKey()}.
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.lastKey()"})
  public void testLastKey_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, baselineResizeBehaviorBaselineResizeBehaviorMap.lastKey());
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>When {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  public void testNextKeyWithBaselineResizeBehavior_givenTreeBidiMap_whenConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then return {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  public void testNextKeyWithBaselineResizeBehavior_thenReturnCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then return {@code CONSTANT_DESCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  public void testNextKeyWithBaselineResizeBehavior_thenReturnConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>When {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  public void testNextKeyWithBaselineResizeBehavior_whenCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>When {@code CONSTANT_ASCENT}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  public void testNextKeyWithBaselineResizeBehavior_whenConstantAscent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#nextKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>When {@code CONSTANT_DESCENT}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#nextKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.nextKey(Comparable)"})
  public void testNextKeyWithBaselineResizeBehavior_whenConstantDescent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.nextKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test Node {@link Node#equals(Object)}, and {@link Node#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Node#equals(Object)}
   *   <li>{@link Node#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node2 = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(node, node2);
    int expectedHashCodeResult = node.hashCode();
    assertEquals(expectedHashCodeResult, node2.hashCode());
  }

  /**
   * Test Node {@link Node#equals(Object)}, and {@link Node#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Node#equals(Object)}
   *   <li>{@link Node#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(node, node);
    int expectedHashCodeResult = node.hashCode();
    assertEquals(expectedHashCodeResult, node.hashCode());
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Node#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Node#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act and Assert
    assertNotEquals(node, new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Node#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, new SimpleEntry<>("42", "42"));
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Node#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, null);
  }

  /**
   * Test Node {@link Node#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Node#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Node.equals(Object)", "int Node.hashCode()"})
  public void testNodeEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNotEquals(node, "Different type to Node");
  }

  /**
   * Test Node {@link Node#getKey()}.
   * <p>
   * Method under test: {@link Node#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable Node.getKey()"})
  public void testNodeGetKey() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, node.getKey());
  }

  /**
   * Test Node {@link Node#getValue()}.
   * <p>
   * Method under test: {@link Node#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable Node.getValue()"})
  public void testNodeGetValue() {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, node.getValue());
  }

  /**
   * Test Node {@link Node#Node(Comparable, Comparable)}.
   * <p>
   * Method under test: {@link Node#Node(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Node.<init>(Comparable, Comparable)"})
  public void testNodeNewNode() {
    // Arrange and Act
    Node<BaselineResizeBehavior, BaselineResizeBehavior> actualNode = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualNode.getKey());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualNode.getValue());
  }

  /**
   * Test Node {@link Node#setValue(Comparable)} with {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link Node#setValue(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable Node.setValue(Comparable)"})
  public void testNodeSetValueWithBaselineResizeBehavior() throws UnsupportedOperationException {
    // Arrange
    Node<BaselineResizeBehavior, BaselineResizeBehavior> node = new Node<>(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> node.setValue(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  public void testPreviousKeyWithBaselineResizeBehavior() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>When {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  public void testPreviousKeyWithBaselineResizeBehavior_givenTreeBidiMap_whenConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  public void testPreviousKeyWithBaselineResizeBehavior_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then return {@code CONSTANT_DESCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  public void testPreviousKeyWithBaselineResizeBehavior_thenReturnConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>When {@code CONSTANT_ASCENT}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  public void testPreviousKeyWithBaselineResizeBehavior_whenConstantAscent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#previousKey(Comparable)} with {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>When {@code CONSTANT_DESCENT}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#previousKey(Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.previousKey(Comparable)"})
  public void testPreviousKeyWithBaselineResizeBehavior_whenConstantDescent_thenReturnNull() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.previousKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior3() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualPutResult);
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior4() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior5() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CENTER_OFFSET);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior6() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualPutResult);
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior7() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.OTHER);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CENTER_OFFSET);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior8() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior9() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.OTHER,
        BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior10() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior11() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CENTER_OFFSET);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT, actualPutResult);
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_givenTreeBidiMap() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then return {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_thenReturnConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_thenTreeBidiMapSizeIsOne() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    BaselineResizeBehavior actualPutResult = baselineResizeBehaviorBaselineResizeBehaviorMap
        .put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT, actualPutResult);
  }

  /**
   * Test {@link TreeBidiMap#put(Comparable, Comparable)} with {@code BaselineResizeBehavior}, {@code BaselineResizeBehavior}.
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#put(Comparable, Comparable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.put(Comparable, Comparable)"})
  public void testPutWithBaselineResizeBehaviorBaselineResizeBehavior_thenTreeBidiMapSizeIsOne2() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMapCenterOffsetIsConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CONSTANT_ASCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code OTHER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMapCenterOffsetIsOther() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.OTHER);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(4, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_ASCENT} is {@code CONSTANT_DESCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMapConstantAscentIsConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_ASCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMapConstantDescentIsCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CENTER_OFFSET);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code CONSTANT_DESCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMapConstantDescentIsConstantDescent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMap_thenTreeBidiMapSizeIsOne() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(1, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link TreeBidiMap#TreeBidiMap()}.</li>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link HashMap#HashMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_givenTreeBidiMap_whenHashMap_thenHashMapEmpty() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert that nothing has changed
    assertTrue(map.isEmpty());
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.isEmpty());
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_thenTreeBidiMapCenterOffsetIsCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_DESCENT} is {@code OTHER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_thenTreeBidiMapConstantDescentIsOther() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.OTHER,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CENTER_OFFSET} is {@code OTHER}.</li>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code CENTER_OFFSET} is {@code OTHER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_whenHashMapCenterOffsetIsOther_thenTreeBidiMapCenterOffsetIsOther() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CENTER_OFFSET,
        BaselineResizeBehavior.CONSTANT_ASCENT);
    baselineResizeBehaviorBaselineResizeBehaviorMap.put(BaselineResizeBehavior.CONSTANT_DESCENT,
        BaselineResizeBehavior.CONSTANT_DESCENT);

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(4, map.size());
    assertEquals(4, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.OTHER,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CONSTANT_ASCENT} is {@code OTHER}.</li>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code CONSTANT_ASCENT} is {@code OTHER}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_whenHashMapConstantAscentIsOther_thenTreeBidiMapConstantAscentIsOther() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.OTHER);
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(4, map.size());
    assertEquals(4, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.OTHER,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code CONSTANT_DESCENT} is {@code CONSTANT_DESCENT}.</li>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_whenHashMapConstantDescentIsConstantDescent_thenTreeBidiMapSizeIsTwo() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(2, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertEquals(baselineResizeBehaviorBaselineResizeBehaviorMap, map);
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code OTHER} is {@code CENTER_OFFSET}.</li>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code OTHER} is {@code CENTER_OFFSET}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_whenHashMapOtherIsCenterOffset_thenTreeBidiMapOtherIsCenterOffset() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.CONSTANT_ASCENT, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertEquals(BaselineResizeBehavior.CONSTANT_DESCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_ASCENT));
  }

  /**
   * Test {@link TreeBidiMap#putAll(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code OTHER} is {@code CONSTANT_ASCENT}.</li>
   *   <li>Then {@link TreeBidiMap#TreeBidiMap()} {@code OTHER} is {@code CONSTANT_ASCENT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBidiMap.putAll(Map)"})
  public void testPutAll_whenHashMapOtherIsConstantAscent_thenTreeBidiMapOtherIsConstantAscent() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    HashMap<BaselineResizeBehavior, BaselineResizeBehavior> map = new HashMap<>();
    map.put(BaselineResizeBehavior.CENTER_OFFSET, BaselineResizeBehavior.CENTER_OFFSET);
    map.put(BaselineResizeBehavior.CONSTANT_DESCENT, BaselineResizeBehavior.CONSTANT_DESCENT);
    map.put(BaselineResizeBehavior.OTHER, BaselineResizeBehavior.CONSTANT_ASCENT);

    // Act
    baselineResizeBehaviorBaselineResizeBehaviorMap.putAll(map);

    // Assert
    assertEquals(3, map.size());
    assertEquals(3, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
    assertEquals(BaselineResizeBehavior.CENTER_OFFSET,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.CENTER_OFFSET));
    assertEquals(BaselineResizeBehavior.CONSTANT_ASCENT,
        baselineResizeBehaviorBaselineResizeBehaviorMap.get(BaselineResizeBehavior.OTHER));
    assertTrue(map.containsKey(BaselineResizeBehavior.CENTER_OFFSET));
    assertTrue(map.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
    assertTrue(map.containsKey(BaselineResizeBehavior.OTHER));
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.containsKey(BaselineResizeBehavior.CONSTANT_DESCENT));
  }

  /**
   * Test {@link TreeBidiMap#remove(Object)} with {@code Object}.
   * <p>
   * Method under test: {@link TreeBidiMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.remove(Object)"})
  public void testRemoveWithObject() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.remove("Key"));
  }

  /**
   * Test {@link TreeBidiMap#removeValue(Object)}.
   * <p>
   * Method under test: {@link TreeBidiMap#removeValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparable TreeBidiMap.removeValue(Object)"})
  public void testRemoveValue() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertNull(baselineResizeBehaviorBaselineResizeBehaviorMap.removeValue("Value"));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TreeBidiMap#toString()}
   *   <li>{@link TreeBidiMap#size()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeBidiMap.size()", "String TreeBidiMap.toString()"})
  public void testGettersAndSetters() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act
    String actualToStringResult = baselineResizeBehaviorBaselineResizeBehaviorMap.toString();

    // Assert
    assertEquals("{}", actualToStringResult);
    assertEquals(0, baselineResizeBehaviorBaselineResizeBehaviorMap.size());
  }

  /**
   * Test {@link TreeBidiMap#values()}.
   * <p>
   * Method under test: {@link TreeBidiMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set TreeBidiMap.values()"})
  public void testValues() {
    // Arrange
    TreeBidiMap<BaselineResizeBehavior, BaselineResizeBehavior> baselineResizeBehaviorBaselineResizeBehaviorMap = new TreeBidiMap<>();

    // Act and Assert
    assertTrue(baselineResizeBehaviorBaselineResizeBehaviorMap.values().isEmpty());
  }
}
