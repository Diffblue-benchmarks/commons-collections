package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class GrowthListDiffblueTest {
  /**
   * Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  public void testGrowthList() {
    // Arrange and Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(new ArrayList<>());

    // Assert
    assertTrue(actualGrowthListResult.isEmpty());
  }

  /**
   * Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  public void testGrowthList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(1, actualGrowthListResult.size());
    assertEquals("42", actualGrowthListResult.get(0));
  }

  /**
   * Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  public void testGrowthList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(list, actualGrowthListResult);
  }

  /**
   * Method under test: {@link GrowthList#add(int, Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    objectList.add(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Element", objectList.get(1));
    assertNull(objectList.get(0));
  }

  /**
   * Method under test: {@link GrowthList#add(int, Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act
    objectList.add(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Element", objectList.get(1));
    assertEquals("Object", objectList.get(0));
  }

  /**
   * Method under test: {@link GrowthList#addAll(int, Collection)}
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
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, new ArrayList<>());

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Object", objectList.get(0));
    assertFalse(actualAddAllResult);
  }

  /**
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(1));
    assertNull(objectList.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll4() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertNull(objectList.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link GrowthList#set(int, Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    Object actualSetResult = objectList.set(1, "Element");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Element", objectList.get(1));
    assertNull(objectList.get(0));
    assertNull(actualSetResult);
  }

  /**
   * Method under test: {@link GrowthList#GrowthList()}
   */
  @Test
  public void testNewGrowthList() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link GrowthList#GrowthList(int)}
   */
  @Test
  public void testNewGrowthList2() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>(1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  public void testNewGrowthList3() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  public void testNewGrowthList4() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    GrowthList<Object> actualObjectList = new GrowthList<>(list);

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  public void testNewGrowthList5() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new GrowthList<>(list));
  }
}
