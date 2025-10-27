package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedBidiMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.SortedBidiMap;
import org.junit.Test;

public class DualTreeBidiMapDiffblueTest {
  /**
   * Method under test: {@link DualTreeBidiMap.BidiOrderedMapIterator#getKey()}
   */
  @Test
  public void testBidiOrderedMapIteratorGetKey() {
    // Arrange
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.getKey());
  }

  /**
   * Method under test: {@link DualTreeBidiMap.BidiOrderedMapIterator#getValue()}
   */
  @Test
  public void testBidiOrderedMapIteratorGetValue() {
    // Arrange
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.getValue());
  }

  /**
   * Method under test: {@link DualTreeBidiMap.BidiOrderedMapIterator#hasNext()}
   */
  @Test
  public void testBidiOrderedMapIteratorHasNext() {
    // Arrange
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Method under test: {@link DualTreeBidiMap.BidiOrderedMapIterator#hasNext()}
   */
  @Test
  public void testBidiOrderedMapIteratorHasNext2() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        parent);

    // Act and Assert
    assertTrue(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link DualTreeBidiMap.BidiOrderedMapIterator#hasPrevious()}
   */
  @Test
  public void testBidiOrderedMapIteratorHasPrevious() {
    // Arrange
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiOrderedMapIterator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link DualTreeBidiMap.BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}
   */
  @Test
  public void testBidiOrderedMapIteratorNewBidiOrderedMapIterator() {
    // Arrange and Act
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> actualBidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Assert
    assertFalse(actualBidiOrderedMapIterator.hasNext());
  }

  /**
   * Method under test: {@link DualTreeBidiMap.BidiOrderedMapIterator#next()}
   */
  @Test
  public void testBidiOrderedMapIteratorNext() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        parent);

    // Act and Assert
    assertEquals("Key", bidiOrderedMapIterator.next());
    assertFalse(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link DualTreeBidiMap.BidiOrderedMapIterator#setValue(Object)}
   */
  @Test
  public void testBidiOrderedMapIteratorSetValue() {
    // Arrange
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.setValue("Value"));
  }

  /**
   * Method under test: {@link DualTreeBidiMap.BidiOrderedMapIterator#toString()}
   */
  @Test
  public void testBidiOrderedMapIteratorToString() {
    // Arrange
    DualTreeBidiMap.BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator = new DualTreeBidiMap.BidiOrderedMapIterator<>(
        new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", bidiOrderedMapIterator.toString());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  public void testCreateBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    TreeMap<Object, Object> normalMap = new TreeMap<>();
    TreeMap<Object, Object> reverseMap = new TreeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>()).isEmpty());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#firstKey()}
   */
  @Test
  public void testFirstKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.firstKey());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#headMap(Object)}
   */
  @Test
  public void testHeadMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.headMap("To Key").isEmpty());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#inverseBidiMap()}
   */
  @Test
  public void testInverseBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualInverseBidiMapResult = objectObjectMap.inverseBidiMap();

    // Assert
    assertTrue(actualInverseBidiMapResult.isEmpty());
    assertSame(objectObjectMap.inverseBidiMap, actualInverseBidiMapResult);
  }

  /**
   * Method under test: {@link DualTreeBidiMap#inverseOrderedBidiMap()}
   */
  @Test
  public void testInverseOrderedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    OrderedBidiMap<Object, Object> actualInverseOrderedBidiMapResult = objectObjectMap.inverseOrderedBidiMap();

    // Assert
    assertTrue(actualInverseOrderedBidiMapResult.isEmpty());
    assertSame(objectObjectMap.inverseBidiMap, actualInverseOrderedBidiMapResult);
  }

  /**
   * Method under test: {@link DualTreeBidiMap#inverseSortedBidiMap()}
   */
  @Test
  public void testInverseSortedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualInverseSortedBidiMapResult = objectObjectMap.inverseSortedBidiMap();

    // Assert
    assertTrue(actualInverseSortedBidiMapResult.isEmpty());
    assertSame(objectObjectMap.inverseBidiMap, actualInverseSortedBidiMapResult);
  }

  /**
   * Method under test: {@link DualTreeBidiMap#lastKey()}
   */
  @Test
  public void testLastKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.lastKey());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof DualTreeBidiMap.BidiOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#nextKey(Object)}
   */
  @Test
  public void testNextKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey("Key"));
  }

  /**
   * Method under test: {@link DualTreeBidiMap#nextKey(Object)}
   */
  @Test
  public void testNextKey2() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectObjectMap.nextKey("Key"));
  }

  /**
   * Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey("Key"));
  }

  /**
   * Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey2() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectObjectMap.previousKey("Key"));
  }

  /**
   * Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  public void testPreviousKey3() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.putIfAbsent("42", "42");
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("42", objectObjectMap.previousKey("Key"));
  }

  /**
   * Method under test: {@link DualTreeBidiMap#subMap(Object, Object)}
   */
  @Test
  public void testSubMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.subMap("From Key", "To Key").isEmpty());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#tailMap(Object)}
   */
  @Test
  public void testTailMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.tailMap("From Key").isEmpty());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap()}
   */
  @Test
  public void testNewDualTreeBidiMap() {
    // Arrange and Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  public void testNewDualTreeBidiMap2() {
    // Arrange and Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  public void testNewDualTreeBidiMap3() {
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
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  public void testNewDualTreeBidiMap4() {
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
   * Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map, Map, BidiMap)}
   */
  @Test
  public void testNewDualTreeBidiMap5() {
    // Arrange
    TreeMap<Object, Object> normalMap = new TreeMap<>();
    TreeMap<Object, Object> reverseMap = new TreeMap<>();
    DualHashBidiMap<Object, Object> inverseBidiMap = new DualHashBidiMap<>();

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(normalMap, reverseMap,
        inverseBidiMap);

    // Assert
    assertTrue(inverseBidiMap.isEmpty());
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link DualTreeBidiMap.ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}
   */
  @Test
  public void testViewMapNewViewMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> bidi = new DualTreeBidiMap<>();

    // Act
    DualTreeBidiMap.ViewMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap.ViewMap<>(bidi,
        new TreeMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
