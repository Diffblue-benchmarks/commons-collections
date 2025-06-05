package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DualTreeBidiMapDiffblueTest {
  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#getKey()}.
   * <p>
   * Method under test: {@link BidiOrderedMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator getKey()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object BidiOrderedMapIterator.getKey()"})
  void testBidiOrderedMapIteratorGetKey() {
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
  @DisplayName("Test BidiOrderedMapIterator getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object BidiOrderedMapIterator.getValue()"})
  void testBidiOrderedMapIteratorGetValue() {
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
  @DisplayName("Test BidiOrderedMapIterator hasNext(); given DualHashBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasNext()"})
  void testBidiOrderedMapIteratorHasNext_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
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
  @DisplayName("Test BidiOrderedMapIterator hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasNext()"})
  void testBidiOrderedMapIteratorHasNext_thenReturnFalse() {
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
  @DisplayName("Test BidiOrderedMapIterator hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasPrevious()"})
  void testBidiOrderedMapIteratorHasPrevious() {
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
  @DisplayName("Test BidiOrderedMapIterator new BidiOrderedMapIterator(AbstractDualBidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BidiOrderedMapIterator.<init>(AbstractDualBidiMap)"})
  void testBidiOrderedMapIteratorNewBidiOrderedMapIterator() {
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
  @DisplayName("Test BidiOrderedMapIterator next(); given DualHashBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object BidiOrderedMapIterator.next()"})
  void testBidiOrderedMapIteratorNext_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
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
  @DisplayName("Test BidiOrderedMapIterator setValue(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object BidiOrderedMapIterator.setValue(Object)"})
  void testBidiOrderedMapIteratorSetValue() {
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
  @DisplayName("Test BidiOrderedMapIterator toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String BidiOrderedMapIterator.toString()"})
  void testBidiOrderedMapIteratorToString() {
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
  @DisplayName("Test new DualTreeBidiMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualTreeBidiMap.<init>()"})
  void testNewDualTreeBidiMap() {
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
  @DisplayName("Test new DualTreeBidiMap(Map, Map, BidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map, Map, BidiMap)"})
  void testNewDualTreeBidiMap2() {
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
  @DisplayName("Test new DualTreeBidiMap(Map); given '42'; when HashMap() '42' is '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  void testNewDualTreeBidiMap_given42_whenHashMap42Is42_thenReturnSizeIsOne() {
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
  @DisplayName("Test new DualTreeBidiMap(Map); given 'foo'; when HashMap() 'foo' is '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  void testNewDualTreeBidiMap_givenFoo_whenHashMapFooIs42_thenReturnSizeIsOne() {
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
  @DisplayName("Test new DualTreeBidiMap(Map); when HashMap(); then return HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  void testNewDualTreeBidiMap_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act and Assert
    assertEquals(map, new DualTreeBidiMap<>(map));
  }

  /**
   * Test {@link DualTreeBidiMap#comparator()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#comparator()}
   */
  @Test
  @DisplayName("Test comparator(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Comparator DualTreeBidiMap.comparator()"})
  void testComparator_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.comparator());
  }

  /**
   * Test {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}.
   * <p>
   * Method under test: {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @DisplayName("Test createBidiMap(Map, Map, BidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"DualTreeBidiMap DualTreeBidiMap.createBidiMap(Map, Map, BidiMap)"})
  void testCreateBidiMap() {
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
  @DisplayName("Test firstKey(); given DualTreeBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.firstKey()"})
  void testFirstKey_givenDualTreeBidiMapKeyIsValue_thenReturnKey() {
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
  @DisplayName("Test headMap(Object); when 'To Key'; then return DualTreeBidiMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.headMap(Object)"})
  void testHeadMap_whenToKey_thenReturnDualTreeBidiMap() {
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
  @DisplayName("Test lastKey(); given DualTreeBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.lastKey()"})
  void testLastKey_givenDualTreeBidiMapKeyIsValue_thenReturnKey() {
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
  @DisplayName("Test mapIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedMapIterator DualTreeBidiMap.mapIterator()"})
  void testMapIterator() {
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
  @DisplayName("Test nextKey(Object); given DualTreeBidiMap() 'Key' is 'Value'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.nextKey(Object)"})
  void testNextKey_givenDualTreeBidiMapKeyIsValue_thenReturnNull() {
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
  @DisplayName("Test nextKey(Object); given DualTreeBidiMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.nextKey(Object)"})
  void testNextKey_givenDualTreeBidiMap_thenReturnNull() {
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
  @DisplayName("Test previousKey(Object); given DualTreeBidiMap() IfAbsent '42' is '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  void testPreviousKey_givenDualTreeBidiMapIfAbsent42Is42_thenReturn42() {
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
  @DisplayName("Test previousKey(Object); given DualTreeBidiMap() 'Key' is 'Value'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  void testPreviousKey_givenDualTreeBidiMapKeyIsValue_thenReturnNull() {
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
  @DisplayName("Test previousKey(Object); given DualTreeBidiMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  void testPreviousKey_givenDualTreeBidiMap_thenReturnNull() {
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
  @DisplayName("Test subMap(Object, Object); when 'From Key'; then return DualTreeBidiMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.subMap(Object, Object)"})
  void testSubMap_whenFromKey_thenReturnDualTreeBidiMap() {
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
  @DisplayName("Test tailMap(Object); when 'From Key'; then return DualTreeBidiMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.tailMap(Object)"})
  void testTailMap_whenFromKey_thenReturnDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.tailMap("From Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#valueComparator()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DualTreeBidiMap#valueComparator()}
   */
  @Test
  @DisplayName("Test valueComparator(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Comparator DualTreeBidiMap.valueComparator()"})
  void testValueComparator_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.valueComparator());
  }

  /**
   * Test ViewMap {@link ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}.
   * <p>
   * Method under test: {@link ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}
   */
  @Test
  @DisplayName("Test ViewMap new ViewMap(DualTreeBidiMap, SortedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ViewMap.<init>(DualTreeBidiMap, SortedMap)"})
  void testViewMapNewViewMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> bidi = new DualTreeBidiMap<>();

    // Act and Assert
    assertEquals(bidi, new ViewMap<>(bidi, new TreeMap<>()));
  }
}
