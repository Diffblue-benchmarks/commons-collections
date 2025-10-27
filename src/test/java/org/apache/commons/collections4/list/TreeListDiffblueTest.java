package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class TreeListDiffblueTest {
  /**
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  public void testAdd() {
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
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(1, "Obj");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(2));
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  public void testAdd3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(1, "Obj");

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  public void testAdd4() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    objectList.add(0, "Obj");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Obj", objectList.get(0));
  }

  /**
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  public void testAdd5() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(2, "Obj");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("Obj", objectList.get(2));
  }

  /**
   * Method under test: {@link TreeList#add(int, Object)}
   */
  @Test
  public void testAdd6() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    objectList.add(0, "Obj");

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals("Obj", objectList.get(0));
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    ArrayList<Object> c = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.addAll(c));
    assertTrue(objectList.isEmpty());
    assertTrue(c.isEmpty());
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(1, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertTrue(actualAddAllResult);
    assertEquals(objectList, c);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll4() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertTrue(actualAddAllResult);
    assertEquals(objectList, c);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll5() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals(1, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll6() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals(1, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll7() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals(2, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll8() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals(2, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll9() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(4, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals(3, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll10() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    ArrayList<Object> c = new ArrayList<>();
    c.add("42");
    c.add("42");
    c.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(5, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals("42", objectList.get(4));
    assertEquals(3, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll11() {
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
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(6, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals("42", objectList.get(4));
    assertEquals("42", objectList.get(5));
    assertEquals(4, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#addAll(Collection)}
   */
  @Test
  public void testAddAll12() {
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
    boolean actualAddAllResult = objectList.addAll(c);

    // Assert
    assertEquals(6, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals("42", objectList.get(2));
    assertEquals("42", objectList.get(3));
    assertEquals("42", objectList.get(4));
    assertEquals("42", objectList.get(5));
    assertEquals(2, c.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  public void testContains3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  public void testContains4() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  public void testContains5() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertTrue(objectList.contains("42"));
  }

  /**
   * Method under test: {@link TreeList#contains(Object)}
   */
  @Test
  public void testContains6() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertTrue(objectList.contains("42"));
  }

  /**
   * Method under test: {@link TreeList#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.get(1));
  }

  /**
   * Method under test: {@link TreeList#get(int)}
   */
  @Test
  public void testGet2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.get(0));
  }

  /**
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  public void testIndexOf2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  public void testIndexOf3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  public void testIndexOf4() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Object"));
  }

  /**
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  public void testIndexOf5() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(0, objectList.indexOf("42"));
  }

  /**
   * Method under test: {@link TreeList#indexOf(Object)}
   */
  @Test
  public void testIndexOf6() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals(0, objectList.indexOf("42"));
  }

  /**
   * Method under test: {@link TreeList#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TreeList.TreeListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#iterator()}
   */
  @Test
  public void testIterator2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TreeList.TreeListIterator);
    assertEquals("42", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#iterator()}
   */
  @Test
  public void testIterator3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof TreeList.TreeListIterator);
    assertEquals("42", actualIteratorResult.next());
    assertEquals("42", actualIteratorResult.next());
    assertEquals("42", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator()}
   */
  @Test
  public void testListIterator() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator()}
   */
  @Test
  public void testListIterator2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertEquals("42", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator()}
   */
  @Test
  public void testListIterator3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertEquals("42", actualListIteratorResult.next());
    assertEquals("42", actualListIteratorResult.next());
    assertEquals("42", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  public void testListIterator4() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  public void testListIterator5() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertEquals("42", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  public void testListIterator6() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#listIterator(int)}
   */
  @Test
  public void testListIterator7() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof TreeList.TreeListIterator);
    assertEquals("42", actualListIteratorResult.next());
    assertEquals("42", actualListIteratorResult.next());
    assertEquals("42", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove2() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove3() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove4() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove5() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove6() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove7() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove8() {
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
   * Method under test: {@link TreeList#remove(int)}
   */
  @Test
  public void testRemove9() {
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
   * Method under test: {@link TreeList#set(int, Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualSetResult = objectList.set(1, "Obj");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", actualSetResult);
    assertEquals("Obj", objectList.get(1));
  }

  /**
   * Method under test: {@link TreeList#set(int, Object)}
   */
  @Test
  public void testSet2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualSetResult = objectList.set(0, "Obj");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("42", actualSetResult);
    assertEquals("Obj", objectList.get(0));
  }

  /**
   * Method under test: {@link TreeList#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();

    // Act and Assert
    assertEquals(0, objectList.toArray().length);
  }

  /**
   * Method under test: {@link TreeList#toArray()}
   */
  @Test
  public void testToArray2() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");

    // Act
    Object[] actualToArrayResult = objectList.toArray();

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link TreeList#toArray()}
   */
  @Test
  public void testToArray3() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    Object[] actualToArrayResult = objectList.toArray();

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("42", actualToArrayResult[1]);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link TreeList#toArray()}
   */
  @Test
  public void testToArray4() {
    // Arrange
    TreeList<Object> objectList = new TreeList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    Object[] actualToArrayResult = objectList.toArray();

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("42", actualToArrayResult[1]);
    assertEquals("42", actualToArrayResult[2]);
    assertEquals(3, actualToArrayResult.length);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TreeList#TreeList()}
   *   <li>{@link TreeList#size()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    TreeList<Object> actualObjectList = new TreeList<>();

    // Assert
    assertEquals(0, actualObjectList.size());
  }

  /**
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  public void testNewTreeList() {
    // Arrange and Act
    TreeList<Object> actualObjectList = new TreeList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  public void testNewTreeList2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    TreeList<Object> actualObjectList = new TreeList<>(coll);

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  public void testNewTreeList3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new TreeList<>(coll));
  }

  /**
   * Method under test: {@link TreeList#TreeList(Collection)}
   */
  @Test
  public void testNewTreeList4() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new TreeList<>(coll));
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#hasNext()}
   */
  @Test
  public void testTreeListIteratorHasNext() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#hasNext()}
   */
  @Test
  public void testTreeListIteratorHasNext2() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), -1);

    // Act and Assert
    assertTrue(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#hasPrevious()}
   */
  @Test
  public void testTreeListIteratorHasPrevious() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertTrue(treeListIterator.hasPrevious());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#hasPrevious()}
   */
  @Test
  public void testTreeListIteratorHasPrevious2() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 0);

    // Act and Assert
    assertFalse(treeListIterator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link TreeList.TreeListIterator#TreeListIterator(TreeList, int)}
   */
  @Test
  public void testTreeListIteratorNewTreeListIterator() {
    // Arrange and Act
    TreeList.TreeListIterator<Object> actualTreeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Assert
    assertFalse(actualTreeListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link TreeList.TreeListIterator#TreeListIterator(TreeList, int)}
   */
  @Test
  public void testTreeListIteratorNewTreeListIterator2() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");

    // Act
    TreeList.TreeListIterator<Object> actualTreeListIterator = new TreeList.TreeListIterator<>(parent, 1);

    // Assert
    assertFalse(actualTreeListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link TreeList.TreeListIterator#TreeListIterator(TreeList, int)}
   */
  @Test
  public void testTreeListIteratorNewTreeListIterator3() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");

    // Act
    TreeList.TreeListIterator<Object> actualTreeListIterator = new TreeList.TreeListIterator<>(parent, 1);

    // Assert
    assertEquals("42", actualTreeListIterator.next());
    assertFalse(actualTreeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#next()}
   */
  @Test
  public void testTreeListIteratorNext() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> treeListIterator.next());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#next()}
   */
  @Test
  public void testTreeListIteratorNext2() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(parent, 1);

    // Act and Assert
    assertEquals("42", treeListIterator.next());
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#nextIndex()}
   */
  @Test
  public void testTreeListIteratorNextIndex() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertEquals(1, treeListIterator.nextIndex());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#previous()}
   */
  @Test
  public void testTreeListIteratorPrevious() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(parent, 1);

    // Act
    Object actualPreviousResult = treeListIterator.previous();

    // Assert
    assertEquals("42", treeListIterator.next());
    assertEquals("42", actualPreviousResult);
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#previous()}
   */
  @Test
  public void testTreeListIteratorPrevious2() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(parent, 1);

    // Act
    Object actualPreviousResult = treeListIterator.previous();

    // Assert
    assertEquals("42", treeListIterator.next());
    assertEquals("42", treeListIterator.next());
    assertEquals("42", actualPreviousResult);
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#previous()}
   */
  @Test
  public void testTreeListIteratorPrevious3() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    parent.add("42");
    parent.add("42");
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(parent, 1);

    // Act
    Object actualPreviousResult = treeListIterator.previous();

    // Assert
    assertEquals("42", treeListIterator.next());
    assertEquals("42", treeListIterator.next());
    assertEquals("42", treeListIterator.next());
    assertEquals("42", actualPreviousResult);
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#previous()}
   */
  @Test
  public void testTreeListIteratorPrevious4() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(parent, 0);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> treeListIterator.previous());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#previous()}
   */
  @Test
  public void testTreeListIteratorPrevious5() {
    // Arrange
    TreeList<Object> parent = new TreeList<>();
    parent.add("42");

    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(parent, 1);
    treeListIterator.add("Obj");

    // Act
    Object actualPreviousResult = treeListIterator.previous();

    // Assert
    assertEquals("Obj", treeListIterator.next());
    assertEquals("Obj", actualPreviousResult);
    assertFalse(treeListIterator.hasNext());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#previousIndex()}
   */
  @Test
  public void testTreeListIteratorPreviousIndex() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertEquals(0, treeListIterator.previousIndex());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#remove()}
   */
  @Test
  public void testTreeListIteratorRemove() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> treeListIterator.remove());
  }

  /**
   * Method under test: {@link TreeList.TreeListIterator#set(Object)}
   */
  @Test
  public void testTreeListIteratorSet() {
    // Arrange
    TreeList.TreeListIterator<Object> treeListIterator = new TreeList.TreeListIterator<>(new TreeList<>(), 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> treeListIterator.set("Obj"));
  }
}
