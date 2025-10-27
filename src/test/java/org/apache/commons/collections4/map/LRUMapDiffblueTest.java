package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LRUMapDiffblueTest {
  /**
   * Method under test: {@link LRUMap#addMapping(int, int, Object, Object)}
   */
  @Test
  public void testAddMapping() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link LRUMap#addMapping(int, int, Object, Object)}
   */
  @Test
  public void testAddMapping2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    objectObjectMap.addMapping(1, 19088743, null, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Method under test: {@link LRUMap#isFull()}
   */
  @Test
  public void testIsFull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isFull());
  }

  /**
   * Method under test: {@link LRUMap#moveToMRU(AbstractLinkedMap.LinkEntry)}
   */
  @Test
  public void testMoveToMRU() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.moveToMRU(new AbstractLinkedMap.LinkEntry<>(
            new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
            AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test: {@link LRUMap#removeLRU(AbstractLinkedMap.LinkEntry)}
   */
  @Test
  public void testRemoveLRU() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.removeLRU(new AbstractLinkedMap.LinkEntry<>(
        new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Method under test:
   * {@link LRUMap#reuseMapping(AbstractLinkedMap.LinkEntry, int, int, Object, Object)}
   */
  @Test
  public void testReuseMapping() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.reuseMapping(
            new AbstractLinkedMap.LinkEntry<>(
                new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
                19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link LRUMap#reuseMapping(AbstractLinkedMap.LinkEntry, int, int, Object, Object)}
   */
  @Test
  public void testReuseMapping2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.reuseMapping(null, 19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link LRUMap#reuseMapping(AbstractLinkedMap.LinkEntry, int, int, Object, Object)}
   */
  @Test
  public void testReuseMapping3() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.reuseMapping(
            new AbstractLinkedMap.LinkEntry<>(
                new AbstractHashedMap.HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
                19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link LRUMap#isScanUntilRemovable()}
   *   <li>{@link LRUMap#maxSize()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    boolean actualIsScanUntilRemovableResult = objectObjectMap.isScanUntilRemovable();

    // Assert
    assertEquals(100, objectObjectMap.maxSize());
    assertFalse(actualIsScanUntilRemovableResult);
  }

  /**
   * Method under test: {@link LRUMap#LRUMap()}
   */
  @Test
  public void testNewLRUMap() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  public void testNewLRUMap2() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  public void testNewLRUMap3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0));
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  public void testNewLRUMap4() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  public void testNewLRUMap5() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f));

  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  public void testNewLRUMap6() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  public void testNewLRUMap7() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f, true));

  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  public void testNewLRUMap8() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  public void testNewLRUMap9() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  public void testNewLRUMap10() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 2, 1.0E-5f));

  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  public void testNewLRUMap11() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 3, 10.0f));

  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  public void testNewLRUMap12() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  public void testNewLRUMap13() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  public void testNewLRUMap14() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, true));

  }
}
