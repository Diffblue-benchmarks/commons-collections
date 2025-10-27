package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LinkedMapDiffblueTest {
  /**
   * Method under test: {@link LinkedMap#asList()}
   */
  @Test
  public void testAsList() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.asList().isEmpty());
  }

  /**
   * Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(1));
  }

  /**
   * Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  public void testGet2() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(0));
  }

  /**
   * Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  public void testGetValue() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.getValue(1));
  }

  /**
   * Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  public void testGetValue2() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.getValue(0));
  }

  /**
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  public void testIndexOf2() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(0, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  public void testIndexOf3() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(4, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link LinkedMap.LinkedMapList#LinkedMapList(LinkedMap)}
   */
  @Test
  public void testLinkedMapListNewLinkedMapList() {
    // Arrange and Act
    LinkedMap.LinkedMapList<Object> actualObjectList = new LinkedMap.LinkedMapList<>(new LinkedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(0);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(3, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertNull(actualRemoveResult);
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  public void testRemove5() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    AbstractLinkedMap.LinkEntry<Object, Object> linkEntry = new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    objectObjectMap.addMapping(1, 2, linkEntry, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(0));
    assertEquals(2, objectObjectMap.size());
    Object expectedGetResult = linkEntry.key;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  public void testRemove6() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(4, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertNull(actualRemoveResult);
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Method under test: {@link LinkedMap#LinkedMap()}
   */
  @Test
  public void testNewLinkedMap() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LinkedMap#LinkedMap(int)}
   */
  @Test
  public void testNewLinkedMap2() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LinkedMap#LinkedMap(int, float)}
   */
  @Test
  public void testNewLinkedMap3() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
