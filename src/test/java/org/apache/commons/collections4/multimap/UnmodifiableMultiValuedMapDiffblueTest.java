package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.junit.Test;

public class UnmodifiableMultiValuedMapDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  public void testUnmodifiableMultiValuedMap() {
    // Arrange and Act
    UnmodifiableMultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Assert
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   *   <li>
   * {@link UnmodifiableMultiValuedMap#unmodifiableMultiValuedMap(MultiValuedMap)}
   * </ul>
   */
  @Test
  public void testUnmodifiableMultiValuedMap2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    UnmodifiableMultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(map);

    // Assert
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#asMap()}
   */
  @Test
  public void testAsMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.asMap().isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#clear()}
   */
  @Test
  public void testClear() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.clear());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#entries()}
   */
  @Test
  public void testEntries() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.entries().isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.get("Key").isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#keys()}
   */
  @Test
  public void testKeys() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keys().isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.keySet().isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = unmodifiableMultiValuedMapResult.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#put(Object, Object)}
   */
  @Test
  public void testPut() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.put("Key", "Value"));
  }

  /**
   * Method under test:
   * {@link UnmodifiableMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll("Key", new ArrayList<>()));
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll2() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.putAll(new HashMap<>()));
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  public void testPutAll3() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.putAll(new ArrayListValuedHashMap<>()));
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMultiValuedMapResult.remove("Key"));
  }

  /**
   * Method under test:
   * {@link UnmodifiableMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  public void testRemoveMapping() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> unmodifiableMultiValuedMapResult.removeMapping("Key", "Item"));
  }

  /**
   * Method under test: {@link UnmodifiableMultiValuedMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertTrue(unmodifiableMultiValuedMapResult.values().isEmpty());
  }
}
