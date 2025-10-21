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

public class ArrayListValuedHashMapDiffblueTest {
  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>()"})
  public void testNewArrayListValuedHashMap() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int)}.
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(int)"})
  public void testNewArrayListValuedHashMap2() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(1);

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int, int)}.
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(int, int)"})
  public void testNewArrayListValuedHashMap3() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(1, 1);

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(Map)"})
  public void testNewArrayListValuedHashMap_given42_whenHashMap42Is42_thenReturnMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, actualArrayListValuedHashMap.size());
    assertFalse(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(MultiValuedMap)"})
  public void testNewArrayListValuedHashMap_thenReturnHashSetValuedHashMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedHashMap<>(map));
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>Then return Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(MultiValuedMap)"})
  public void testNewArrayListValuedHashMap_thenReturnMapSizeIsOne() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(map);

    // Assert
    Map<Object, List<Object>> map2 = actualArrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, actualArrayListValuedHashMap.size());
    assertFalse(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(MultiValuedMap)"})
  public void testNewArrayListValuedHashMap_whenArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(map, new ArrayListValuedHashMap<>(map));
  }

  /**
   * Test {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#ArrayListValuedHashMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ArrayListValuedHashMap.<init>(Map)"})
  public void testNewArrayListValuedHashMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    ArrayListValuedHashMap<Object, Object> actualArrayListValuedHashMap = new ArrayListValuedHashMap<>(new HashMap<>());

    // Assert
    assertEquals(0, actualArrayListValuedHashMap.size());
    assertTrue(actualArrayListValuedHashMap.getMap().isEmpty());
    assertTrue(actualArrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link ArrayListValuedHashMap#createCollection()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayListValuedHashMap#createCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.ArrayList ArrayListValuedHashMap.createCollection()"})
  public void testCreateCollection_givenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.createCollection().isEmpty());
  }
}
