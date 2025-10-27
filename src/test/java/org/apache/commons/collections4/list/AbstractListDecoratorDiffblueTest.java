package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class AbstractListDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractListDecorator#add(int, Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    objectList.add(1, "Object");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Object", objectList.get(1));
    assertNull(objectList.get(0));
  }

  /**
   * Method under test: {@link AbstractListDecorator#addAll(int, Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    boolean actualAddAllResult = objectList.addAll(1, new ArrayList<>());

    // Assert
    assertEquals(1, objectList.size());
    assertNull(objectList.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractListDecorator#decorated()}
   */
  @Test
  public void testDecorated() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertTrue(objectList.decorated().isEmpty());
  }

  /**
   * Method under test: {@link AbstractListDecorator#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    objectList.add("Object");

    // Act and Assert
    assertEquals("Object", objectList.get(1));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractListDecorator#equals(Object)}
   *   <li>{@link AbstractListDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    GrowthList<Object> objectList2 = new GrowthList<>();

    // Act and Assert
    assertEquals(objectList, objectList2);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractListDecorator#equals(Object)}
   *   <li>{@link AbstractListDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(objectList, objectList);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList.hashCode());
  }

  /**
   * Method under test: {@link AbstractListDecorator#indexOf(Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Method under test: {@link AbstractListDecorator#lastIndexOf(Object)}
   */
  @Test
  public void testLastIndexOf() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(-1, objectList.lastIndexOf("Object"));
  }

  /**
   * Method under test: {@link AbstractListDecorator#listIterator()}
   */
  @Test
  public void testListIterator() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.listIterator().hasNext());
  }

  /**
   * Method under test: {@link AbstractListDecorator#listIterator(int)}
   */
  @Test
  public void testListIterator2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertFalse(objectList.listIterator(1).hasNext());
  }

  /**
   * Method under test: {@link AbstractListDecorator#remove(int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    objectList.add("Object");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Object", actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractListDecorator#set(int, Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    Object actualSetResult = objectList.set(1, "Object");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Object", objectList.get(1));
    assertNull(objectList.get(0));
    assertNull(actualSetResult);
  }

  /**
   * Method under test: {@link AbstractListDecorator#subList(int, int)}
   */
  @Test
  public void testSubList() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertTrue(objectList.subList(1, 1).isEmpty());
  }

  /**
   * Method under test: {@link AbstractListDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertNotEquals(objectList, new GrowthList<>());
  }

  /**
   * Method under test: {@link AbstractListDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertNotEquals(objectList, null);
  }

  /**
   * Method under test: {@link AbstractListDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertNotEquals(objectList, "Different type to AbstractListDecorator");
  }
}
