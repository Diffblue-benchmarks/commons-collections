package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class CompositeMapDiffblueTest {
  /**
   * Method under test: {@link CompositeMap#addComposited(Map)}
   */
  @Test
  public void testAddComposited() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.addComposited(map2));
  }

  /**
   * Method under test: {@link CompositeMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey3() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue3() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  public void testEntrySet2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  public void testEntrySet3() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  public void testEntrySet4() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  public void testEntrySet5() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertEquals(1, objectObjectMap.entrySet().size());
  }

  /**
   * Method under test: {@link CompositeMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#get(Object)}
   */
  @Test
  public void testGet2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#get(Object)}
   */
  @Test
  public void testGet3() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeMap#equals(Object)}
   *   <li>{@link CompositeMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    CompositeMap<Object, Object> objectObjectMap2 = new CompositeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeMap#equals(Object)}
   *   <li>{@link CompositeMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    CompositeMap<Object, Object> objectObjectMap2 = new CompositeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeMap#equals(Object)}
   *   <li>{@link CompositeMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Method under test: {@link CompositeMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#isEmpty()}
   */
  @Test
  public void testIsEmpty2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#isEmpty()}
   */
  @Test
  public void testIsEmpty3() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  public void testKeySet2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  public void testKeySet3() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  public void testKeySet4() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  public void testKeySet5() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertEquals(1, objectObjectMap.keySet().size());
  }

  /**
   * Method under test: {@link CompositeMap#put(Object, Object)}
   */
  @Test
  public void testPut() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link CompositeMap#putAll(Map)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.putAll(new HashMap<>()));
  }

  /**
   * Method under test: {@link CompositeMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#remove(Object)}
   */
  @Test
  public void testRemove2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#remove(Object)}
   */
  @Test
  public void testRemove3() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveResult);
  }

  /**
   * Method under test: {@link CompositeMap#removeComposited(Map)}
   */
  @Test
  public void testRemoveComposited() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeComposited(new HashMap<>()));
  }

  /**
   * Method under test: {@link CompositeMap#removeComposited(Map)}
   */
  @Test
  public void testRemoveComposited2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    Map<Object, Object> actualRemoveCompositedResult = objectObjectMap.removeComposited(map);

    // Assert
    assertTrue(actualRemoveCompositedResult.isEmpty());
    assertSame(map, actualRemoveCompositedResult);
  }

  /**
   * Method under test: {@link CompositeMap#removeComposited(Map)}
   */
  @Test
  public void testRemoveComposited3() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertNull(objectObjectMap.removeComposited(new HashMap<>()));
  }

  /**
   * Method under test: {@link CompositeMap#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Method under test: {@link CompositeMap#size()}
   */
  @Test
  public void testSize2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Method under test: {@link CompositeMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#values()}
   */
  @Test
  public void testValues2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Method under test: {@link CompositeMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertNotEquals(objectObjectMap, new CompositeMap<>());
  }

  /**
   * Method under test: {@link CompositeMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Method under test: {@link CompositeMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to CompositeMap");
  }

  /**
   * Method under test: {@link CompositeMap#CompositeMap()}
   */
  @Test
  public void testNewCompositeMap() {
    // Arrange and Act
    CompositeMap<Object, Object> actualObjectObjectMap = new CompositeMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
