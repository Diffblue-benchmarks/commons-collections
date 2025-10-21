package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DualTreeBidiMapDiffblueTest {
  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#getKey()}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiOrderedMapIterator.getKey()"})
  public void testBidiOrderedMapIteratorGetKey() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.getKey());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#getValue()}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiOrderedMapIterator.getValue()"})
  public void testBidiOrderedMapIteratorGetValue() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.getValue());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasNext()"})
  public void testBidiOrderedMapIteratorHasNext_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(parent);

    // Act and Assert
    assertTrue(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasNext()"})
  public void testBidiOrderedMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasPrevious()"})
  public void testBidiOrderedMapIteratorHasPrevious() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiOrderedMapIterator.hasPrevious());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BidiOrderedMapIterator.<init>(AbstractDualBidiMap)"})
  public void testBidiOrderedMapIteratorNewBidiOrderedMapIterator() {
    // Arrange and Act
    BidiOrderedMapIterator<Object, Object> actualBidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Assert
    assertFalse(actualBidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#next()}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiOrderedMapIterator.next()"})
  public void testBidiOrderedMapIteratorNext_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(parent);

    // Act and Assert
    assertEquals("Key", bidiOrderedMapIterator.next());
    assertFalse(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiOrderedMapIterator.setValue(Object)"})
  public void testBidiOrderedMapIteratorSetValue() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.setValue("Value"));
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#toString()}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String BidiOrderedMapIterator.toString()"})
  public void testBidiOrderedMapIteratorToString() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", bidiOrderedMapIterator.toString());
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap()}.
   * <p>
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualTreeBidiMap.<init>()"})
  public void testNewDualTreeBidiMap() {
    // Arrange and Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map, Map, BidiMap)}.
   * <p>
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map, Map, BidiMap)"})
  public void testNewDualTreeBidiMap2() {
    // Arrange
    TreeMap<Object, Object> normalMap = new TreeMap<>();
    TreeMap<Object, Object> reverseMap = new TreeMap<>();
    DualHashBidiMap<Object, Object> inverseBidiMap = new DualHashBidiMap<>();

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(normalMap, reverseMap,
        inverseBidiMap);

    // Assert
    Map<Object, Object> objectObjectMap = actualObjectObjectMap.normalMap;
    assertEquals(objectObjectMap, inverseBidiMap);
    assertEquals(objectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  public void testNewDualTreeBidiMap_given42_whenHashMap42Is42_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(map);

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertEquals("42", actualObjectObjectMap.get("42"));
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code foo} is {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  public void testNewDualTreeBidiMap_givenFoo_whenHashMapFooIs42_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("foo", "42");
    map.put("42", "42");

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(map);

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertEquals("42", actualObjectObjectMap.get("42"));
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  public void testNewDualTreeBidiMap_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act and Assert
    assertEquals(map, new DualTreeBidiMap<>(map));
  }

  /**
   * Test {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}.
   * <p>
   * Method under test: {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"DualTreeBidiMap DualTreeBidiMap.createBidiMap(Map, Map, BidiMap)"})
  public void testCreateBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    TreeMap<Object, Object> normalMap = new TreeMap<>();
    TreeMap<Object, Object> reverseMap = new TreeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()));
  }

  /**
   * Test {@link DualTreeBidiMap#firstKey()}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.firstKey()"})
  public void testFirstKey_givenDualTreeBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.firstKey());
  }

  /**
   * Test {@link DualTreeBidiMap#headMap(Object)}.
   * <ul>
   *   <li>When {@code To Key}.</li>
   *   <li>Then return {@link DualTreeBidiMap#DualTreeBidiMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#headMap(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.headMap(Object)"})
  public void testHeadMap_whenToKey_thenReturnDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.headMap("To Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#lastKey()}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.lastKey()"})
  public void testLastKey_givenDualTreeBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.lastKey());
  }

  /**
   * Test {@link DualTreeBidiMap#mapIterator()}.
   * <p>
   * Method under test: {@link DualTreeBidiMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator DualTreeBidiMap.mapIterator()"})
  public void testMapIterator() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof BidiOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link DualTreeBidiMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.nextKey(Object)"})
  public void testNextKey_givenDualTreeBidiMapKeyIsValue_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectObjectMap.nextKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.nextKey(Object)"})
  public void testNextKey_givenDualTreeBidiMap_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} IfAbsent {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  public void testPreviousKey_givenDualTreeBidiMapIfAbsent42Is42_thenReturn42() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.putIfAbsent("42", "42");
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("42", objectObjectMap.previousKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  public void testPreviousKey_givenDualTreeBidiMapKeyIsValue_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectObjectMap.previousKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  public void testPreviousKey_givenDualTreeBidiMap_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#subMap(Object, Object)}.
   * <ul>
   *   <li>When {@code From Key}.</li>
   *   <li>Then return {@link DualTreeBidiMap#DualTreeBidiMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#subMap(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.subMap(Object, Object)"})
  public void testSubMap_whenFromKey_thenReturnDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.subMap("From Key", "To Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#tailMap(Object)}.
   * <ul>
   *   <li>When {@code From Key}.</li>
   *   <li>Then return {@link DualTreeBidiMap#DualTreeBidiMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#tailMap(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.tailMap(Object)"})
  public void testTailMap_whenFromKey_thenReturnDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.tailMap("From Key"));
  }

  /**
   * Test ViewMap {@link ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}.
   * <p>
   * Method under test: {@link ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ViewMap.<init>(DualTreeBidiMap, SortedMap)"})
  public void testViewMapNewViewMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> bidi = new DualTreeBidiMap<>();

    // Act and Assert
    assertEquals(bidi, new ViewMap<>(bidi, new TreeMap<>()));
  }
}
