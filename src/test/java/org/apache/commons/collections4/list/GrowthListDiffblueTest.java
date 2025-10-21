package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GrowthListDiffblueTest {
  /**
   * Test {@link GrowthList#growthList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"GrowthList GrowthList.growthList(List)"})
  public void testGrowthList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(list, actualGrowthListResult);
  }

  /**
   * Test {@link GrowthList#growthList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"GrowthList GrowthList.growthList(List)"})
  public void testGrowthList_given42_whenArrayListAdd422() {
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
   * Test {@link GrowthList#growthList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#growthList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"GrowthList GrowthList.growthList(List)"})
  public void testGrowthList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    GrowthList<Object> actualGrowthListResult = GrowthList.growthList(list);

    // Assert
    assertEquals(list, actualGrowthListResult);
  }

  /**
   * Test {@link GrowthList#GrowthList()}.
   * <p>
   * Method under test: {@link GrowthList#GrowthList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.<init>()"})
  public void testNewGrowthList() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link GrowthList#GrowthList(int)}.
   * <p>
   * Method under test: {@link GrowthList#GrowthList(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.<init>(int)"})
  public void testNewGrowthList2() {
    // Arrange and Act
    GrowthList<Object> actualObjectList = new GrowthList<>(1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link GrowthList#GrowthList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.<init>(List)"})
  public void testNewGrowthList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new GrowthList<>(list));
  }

  /**
   * Test {@link GrowthList#GrowthList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.<init>(List)"})
  public void testNewGrowthList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new GrowthList<>(list));
  }

  /**
   * Test {@link GrowthList#GrowthList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#GrowthList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.<init>(List)"})
  public void testNewGrowthList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new GrowthList<>(list));
  }

  /**
   * Test {@link GrowthList#add(int, Object)} with {@code index}, {@code element}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.add(int, Object)"})
  public void testAddWithIndexElement_givenGrowthListAddObject_thenGrowthListFirstIsObject() {
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
   * Test {@link GrowthList#add(int, Object)} with {@code index}, {@code element}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void GrowthList.add(int, Object)"})
  public void testAddWithIndexElement_givenGrowthList_whenOne_thenGrowthListFirstIsNull() {
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
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_given42_whenArrayListAdd42_thenGrowthListSizeIsThree() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    objectList.addAll(1, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
  }

  /**
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_given42_whenArrayListAdd42_thenGrowthListSizeIsTwo() {
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
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()} add {@code Object}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} first is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_givenGrowthListAddObject_thenGrowthListFirstIsObject() {
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
   * Test {@link GrowthList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@link GrowthList#GrowthList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean GrowthList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_givenGrowthList_whenArrayList_thenGrowthListSizeIsOne() {
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
   * Test {@link GrowthList#set(int, Object)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then {@link GrowthList#GrowthList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrowthList#set(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object GrowthList.set(int, Object)"})
  public void testSet_whenOne_thenGrowthListSizeIsTwo() {
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
}
