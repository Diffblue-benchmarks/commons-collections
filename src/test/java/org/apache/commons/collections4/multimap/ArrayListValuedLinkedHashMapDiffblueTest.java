package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ArrayListValuedLinkedHashMapDiffblueTest {
  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}.
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>()"})
  public void testNewArrayListValuedLinkedHashMap() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>();

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int)}.
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(int)"})
  public void testNewArrayListValuedLinkedHashMap2() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        1);

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int, int)}.
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(int, int)"})
  public void testNewArrayListValuedLinkedHashMap3() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        1, 1);

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(Map)"})
  public void testNewArrayListValuedLinkedHashMap_given42_thenReturnMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedLinkedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, actualArrayListValuedLinkedHashMap.size());
    assertFalse(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(MultiValuedMap)"})
  public void testNewArrayListValuedLinkedHashMap_thenReturnHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(MultiValuedMap)"})
  public void testNewArrayListValuedLinkedHashMap_thenReturnMapSizeIsOne() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedLinkedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, actualArrayListValuedLinkedHashMap.size());
    assertFalse(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(MultiValuedMap)"})
  public void testNewArrayListValuedLinkedHashMap_whenArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedLinkedHashMap<>(map));
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedLinkedHashMap.<init>(Map)"})
  public void testNewArrayListValuedLinkedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    ArrayListValuedLinkedHashMap<Object, Object> actualArrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>(
        new HashMap<>());

    // Assert
    assertEquals(0, actualArrayListValuedLinkedHashMap.size());
    assertTrue(actualArrayListValuedLinkedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedLinkedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedLinkedHashMap#createCollection()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedLinkedHashMap#ArrayListValuedLinkedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedLinkedHashMap#createCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.ArrayList ArrayListValuedLinkedHashMap.createCollection()"})
  public void testCreateCollection_givenArrayListValuedLinkedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedLinkedHashMap<Object, Object> arrayListValuedLinkedHashMap = new ArrayListValuedLinkedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedLinkedHashMap.createCollection().isEmpty());
  }
}
