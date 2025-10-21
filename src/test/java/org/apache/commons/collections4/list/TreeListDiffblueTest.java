package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.list.TreeList.TreeListIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TreeListDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TreeList#TreeList()}
   *   <li>{@link TreeList#size()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.<init>()", "int TreeList.size()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    TreeList<Object> actualObjectList = new TreeList<>();

    // Assert
    assertEquals(0, actualObjectList.size());
  }

  /**
   * Test {@link TreeList#TreeList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.<init>(Collection)"})
  public void testNewTreeList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new TreeList<>(coll));
  }

  /**
   * Test {@link TreeList#TreeList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.<init>(Collection)"})
  public void testNewTreeList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new TreeList<>(coll));
  }

  /**
   * Test {@link TreeList#TreeList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.<init>(Collection)"})
  public void testNewTreeList_given42_whenArrayListAdd423() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new TreeList<>(coll));
  }

  /**
   * Test {@link TreeList#TreeList(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.<init>(Collection)"})
  public void testNewTreeList_whenArrayList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertEquals(coll, new TreeList<>(coll));
  }

  /**
   * Test {@link TreeList#add(int, Object)} with {@code int}, {@code Object}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.add(int, Object)"})
  public void testAddWithIntObject_givenTreeListAdd42_whenOne_thenTreeListSizeIsFour() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(1, "Obj");

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(3));
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Test {@link TreeList#add(int, Object)} with {@code int}, {@code Object}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.add(int, Object)"})
  public void testAddWithIntObject_givenTreeListAdd42_whenOne_thenTreeListSizeIsTwo() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    objectList.add(1, "Obj");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Test {@link TreeList#add(int, Object)} with {@code int}, {@code Object}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} third is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.add(int, Object)"})
  public void testAddWithIntObject_givenTreeListAdd42_whenOne_thenTreeListThirdIs42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(1, "Obj");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(2));
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Test {@link TreeList#add(int, Object)} with {@code int}, {@code Object}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When two.</li>
   *   <li>Then {@link TreeList#TreeList()} second is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.add(int, Object)"})
  public void testAddWithIntObject_givenTreeListAdd42_whenTwo_thenTreeListSecondIs42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(2, "Obj");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("Obj", objectList.get(2));
  }

  /**
   * Test {@link TreeList#add(int, Object)} with {@code int}, {@code Object}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link TreeList#TreeList()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.add(int, Object)"})
  public void testAddWithIntObject_givenTreeListAdd42_whenZero_thenTreeListSizeIsFour() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(0, "Obj");

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(3));
    assertEquals("Obj", objectList.get(0));
  }

  /**
   * Test {@link TreeList#add(int, Object)} with {@code int}, {@code Object}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link TreeList#TreeList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeList.add(int, Object)"})
  public void testAddWithIntObject_givenTreeList_whenZero_thenTreeListSizeIsOne() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    objectList.add(0, "Obj");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Obj", objectList.get(0));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(1, c.size());
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is five.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsFive() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(5, objectList.size());
    assertEquals("42", objectList.get(3));
    assertEquals("42", objectList.get(4));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsFour() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsFour2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(3));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is six.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsSix() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(6, objectList.size());
    assertEquals("42", objectList.get(4));
    assertEquals("42", objectList.get(5));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is six.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsSix2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(6, objectList.size());
    assertEquals("42", objectList.get(4));
    assertEquals("42", objectList.get(5));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsThree() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeListAdd42_thenTreeListSizeIsThree2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeList_thenTreeListSizeIsThree() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(objectList, c);
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeList_whenArrayListAdd42_thenTreeListSizeIsOne() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(objectList, c);
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link TreeList#TreeList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeList_whenArrayListAdd42_thenTreeListSizeIsTwo() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    objectList.addAll(c);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(objectList, c);
  }

  /**
   * Test {@link TreeList#addAll(Collection)} with {@code Collection}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.addAll(Collection)"})
  public void testAddAllWithCollection_givenTreeList_whenArrayList_thenReturnFalse() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    ArrayList<Object> c = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.addAll(c));
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, c);
  }

  /**
   * Test {@link TreeList#contains(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.contains(Object)"})
  public void testContains_givenTreeListAdd42_when42_thenReturnTrue() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertTrue(objectList.contains("42"));
  }

  /**
   * Test {@link TreeList#contains(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.contains(Object)"})
  public void testContains_givenTreeListAdd42_when42_thenReturnTrue2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertTrue(objectList.contains("42"));
  }

  /**
   * Test {@link TreeList#contains(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.contains(Object)"})
  public void testContains_givenTreeListAdd42_whenObject_thenReturnFalse() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Test {@link TreeList#contains(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.contains(Object)"})
  public void testContains_givenTreeListAdd42_whenObject_thenReturnFalse2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Test {@link TreeList#contains(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.contains(Object)"})
  public void testContains_givenTreeListAdd42_whenObject_thenReturnFalse3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Test {@link TreeList#contains(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeList.contains(Object)"})
  public void testContains_givenTreeList_whenObject_thenReturnFalse() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Test {@link TreeList#get(int)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.get(int)"})
  public void testGet_givenTreeListAdd42_whenOne_thenReturn42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.get(1));
  }

  /**
   * Test {@link TreeList#get(int)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.get(int)"})
  public void testGet_givenTreeListAdd42_whenZero_thenReturn42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.get(0));
  }

  /**
   * Test {@link TreeList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeList.indexOf(Object)"})
  public void testIndexOf_givenTreeListAdd42_when42_thenReturnZero() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(0, objectList.indexOf("42"));
  }

  /**
   * Test {@link TreeList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeList.indexOf(Object)"})
  public void testIndexOf_givenTreeListAdd42_when42_thenReturnZero2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals(0, objectList.indexOf("42"));
  }

  /**
   * Test {@link TreeList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeList.indexOf(Object)"})
  public void testIndexOf_givenTreeListAdd42_whenObject_thenReturnMinusOne() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Test {@link TreeList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeList.indexOf(Object)"})
  public void testIndexOf_givenTreeListAdd42_whenObject_thenReturnMinusOne2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Test {@link TreeList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeList.indexOf(Object)"})
  public void testIndexOf_givenTreeListAdd42_whenObject_thenReturnMinusOne3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Test {@link TreeList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeList.indexOf(Object)"})
  public void testIndexOf_givenTreeList_whenObject_thenReturnMinusOne() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Test {@link TreeList#iterator()}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator TreeList.iterator()"})
  public void testIterator_givenTreeList() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TreeListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#iterator()}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator TreeList.iterator()"})
  public void testIterator_givenTreeListAdd42_thenReturnNextIs42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TreeListIterator);
    assertEquals("42", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator TreeList.listIterator(int)"})
  public void testListIteratorWithInt_givenTreeListAdd42_whenOne_thenReturnNextIs42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeListIterator);
    assertEquals("42", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@link TreeListIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator TreeList.listIterator(int)"})
  public void testListIteratorWithInt_givenTreeListAdd42_whenOne_thenReturnTreeListIterator() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@link TreeListIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator TreeList.listIterator(int)"})
  public void testListIteratorWithInt_givenTreeList_whenZero_thenReturnTreeListIterator() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#listIterator()}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator TreeList.listIterator()"})
  public void testListIterator_givenTreeList() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#listIterator()}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator TreeList.listIterator()"})
  public void testListIterator_givenTreeListAdd42_thenReturnNextIs42() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeListIterator);
    assertEquals("42", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is five.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenOne_thenTreeListSizeIsFive() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(5, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenOne_thenTreeListSizeIsFour() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenOne_thenTreeListSizeIsOne() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenOne_thenTreeListSizeIsThree() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenOne_thenTreeListSizeIsTwo() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(1);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When three.</li>
   *   <li>Then {@link TreeList#TreeList()} size is five.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenThree_thenTreeListSizeIsFive() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(3);

    // Assert
    assertEquals(5, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When three.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenThree_thenTreeListSizeIsThree() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(3);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link TreeList#TreeList()} size is five.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenZero_thenTreeListSizeIsFive() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(0);

    // Assert
    assertEquals(5, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#remove(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.remove(int)"})
  public void testRemoveWithInt_givenTreeListAdd42_whenZero_thenTreeListSizeIsThree() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualRemoveResult = objectList.remove(0);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", actualRemoveResult);
  }

  /**
   * Test {@link TreeList#set(int, Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link TreeList#TreeList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#set(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.set(int, Object)"})
  public void testSet_givenTreeListAdd42_whenOne_thenTreeListSizeIsTwo() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.set(1, "Obj");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Test {@link TreeList#set(int, Object)}.
   * <ul>
   *   <li>Given {@link TreeList#TreeList()} add {@code 42}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link TreeList#TreeList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeList#set(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeList.set(int, Object)"})
  public void testSet_givenTreeListAdd42_whenZero_thenTreeListSizeIsThree() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.set(0, "Obj");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("Obj", objectList.get(0));
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeListIterator.hasNext()"})
  public void testTreeListIteratorHasNext_thenReturnFalse() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeListIterator.hasNext()"})
  public void testTreeListIteratorHasNext_thenReturnTrue() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), -1);

    // Act and Assert
    assertTrue(treeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#hasPrevious()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeListIterator.hasPrevious()"})
  public void testTreeListIteratorHasPrevious_thenReturnFalse() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 0);

    // Act and Assert
    assertFalse(treeListIterator.hasPrevious());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#hasPrevious()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeListIterator.hasPrevious()"})
  public void testTreeListIteratorHasPrevious_thenReturnTrue() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertTrue(treeListIterator.hasPrevious());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#TreeListIterator(TreeList, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#TreeListIterator(TreeList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeListIterator.<init>(TreeList, int)"})
  public void testTreeListIteratorNewTreeListIterator_given42_whenOne_thenReturnNextIs42() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");

    // Act
    TreeListIterator<Object> actualTreeListIterator = new TreeListIterator<>(parent, 1);

    // Assert
    assertEquals("42", actualTreeListIterator.next());
    assertFalse(actualTreeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#TreeListIterator(TreeList, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When one.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#TreeListIterator(TreeList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeListIterator.<init>(TreeList, int)"})
  public void testTreeListIteratorNewTreeListIterator_given42_whenOne_thenReturnNotHasNext() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");

    // Act
    TreeListIterator<Object> actualTreeListIterator = new TreeListIterator<>(parent, 1);

    // Assert
    assertFalse(actualTreeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#TreeListIterator(TreeList, int)}.
   * <ul>
   *   <li>When {@link TreeList#TreeList()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#TreeListIterator(TreeList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeListIterator.<init>(TreeList, int)"})
  public void testTreeListIteratorNewTreeListIterator_whenTreeList_thenReturnNotHasNext() {
    // Arrange and Act
    TreeListIterator<Object> actualTreeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Assert
    assertFalse(actualTreeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#nextIndex()}.
   * <p>
   * Method under test: {@link TreeListIterator#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeListIterator.nextIndex()"})
  public void testTreeListIteratorNextIndex() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertEquals(1, treeListIterator.nextIndex());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#next()}.
   * <ul>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeListIterator.next()"})
  public void testTreeListIteratorNext_thenReturn42() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(parent, 1);

    // Act and Assert
    assertEquals("42", treeListIterator.next());
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeListIterator.next()"})
  public void testTreeListIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> treeListIterator.next());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#previous()}.
   * <p>
   * Method under test: {@link TreeListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeListIterator.previous()"})
  public void testTreeListIteratorPrevious() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(parent, 1);

    // Act
    treeListIterator.previous();

    // Assert
    assertEquals("42", treeListIterator.next());
    assertEquals("42", treeListIterator.next());
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#previous()}.
   * <p>
   * Method under test: {@link TreeListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeListIterator.previous()"})
  public void testTreeListIteratorPrevious2() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");

    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(parent, 1);
    treeListIterator.add("Obj");

    // Act
    Object actualPreviousResult = treeListIterator.previous();

    // Assert
    assertEquals("Obj", treeListIterator.next());
    assertEquals("Obj", actualPreviousResult);
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link TreeListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int TreeListIterator.previousIndex()"})
  public void testTreeListIteratorPreviousIndex() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertEquals(0, treeListIterator.previousIndex());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#previous()}.
   * <ul>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeListIterator.previous()"})
  public void testTreeListIteratorPrevious_thenReturn42() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(parent, 1);

    // Act
    Object actualPreviousResult = treeListIterator.previous();

    // Assert
    assertEquals("42", treeListIterator.next());
    assertEquals("42", actualPreviousResult);
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#previous()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeListIterator.previous()"})
  public void testTreeListIteratorPrevious_thenThrowNoSuchElementException() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(parent, 0);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> treeListIterator.previous());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#remove()}.
   * <p>
   * Method under test: {@link TreeListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeListIterator.remove()"})
  public void testTreeListIteratorRemove() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> treeListIterator.remove());
  }

  /**
   * Test TreeListIterator {@link TreeListIterator#set(Object)}.
   * <p>
   * Method under test: {@link TreeListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeListIterator.set(Object)"})
  public void testTreeListIteratorSet() {
    // Arrange
    TreeListIterator<Object> treeListIterator = new TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> treeListIterator.set("Obj"));
  }
}
