package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.NoSuchElementException;
import org.junit.Test;

public class StaticBucketMapDiffblueTest {
  /**
   * Method under test: {@link StaticBucketMap.BaseIterator#hasNext()}
   */
  @Test
  public void testBaseIteratorHasNext() {
    // Arrange, Act and Assert
    assertFalse(((new StaticBucketMap()).new BaseIterator()).hasNext());
  }

  /**
   * Method under test: {@link StaticBucketMap.BaseIterator#hasNext()}
   */
  @Test
  public void testBaseIteratorHasNext2() {
    // Arrange
    StaticBucketMap staticBucketMap = new StaticBucketMap();
    staticBucketMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue((staticBucketMap.new BaseIterator()).hasNext());
  }

  /**
   * Method under test: {@link StaticBucketMap.BaseIterator#nextEntry()}
   */
  @Test
  public void testBaseIteratorNextEntry() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> ((new StaticBucketMap()).new BaseIterator()).nextEntry());
  }

  /**
   * Method under test: {@link StaticBucketMap.BaseIterator#remove()}
   */
  @Test
  public void testBaseIteratorRemove() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> ((new StaticBucketMap()).new BaseIterator()).remove());
  }

  /**
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey("object-key"));
  }

  /**
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey4() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link StaticBucketMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  public void testGet2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  public void testGet3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get("object-key"));
  }

  /**
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  public void testGet4() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Method under test: {@link StaticBucketMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveResult);
  }

  /**
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove("object-key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Method under test: {@link StaticBucketMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new StaticBucketMap<>());
  }

  /**
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to StaticBucketMap");
  }

  /**
   * Method under test: {@link StaticBucketMap#StaticBucketMap()}
   */
  @Test
  public void testNewStaticBucketMap() {
    // Arrange and Act
    StaticBucketMap<Object, Object> actualObjectObjectMap = new StaticBucketMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link StaticBucketMap#StaticBucketMap(int)}
   */
  @Test
  public void testNewStaticBucketMap2() {
    // Arrange and Act
    StaticBucketMap<Object, Object> actualObjectObjectMap = new StaticBucketMap<>(10);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
