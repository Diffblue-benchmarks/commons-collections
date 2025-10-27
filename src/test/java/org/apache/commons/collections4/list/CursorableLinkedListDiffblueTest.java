package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import org.junit.Test;

public class CursorableLinkedListDiffblueTest {
  /**
   * Method under test:
   * {@link CursorableLinkedList#addNode(AbstractLinkedList.Node, AbstractLinkedList.Node)}
   */
  @Test
  public void testAddNode() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    AbstractLinkedList.Node<Object> nodeToInsert = new AbstractLinkedList.Node<>();
    AbstractLinkedList.Node<Object> insertBeforeNode = new AbstractLinkedList.Node<>();

    // Act
    objectList.addNode(nodeToInsert, insertBeforeNode);

    // Assert
    assertSame(insertBeforeNode, nodeToInsert.getNextNode());
    assertSame(insertBeforeNode, nodeToInsert.getPreviousNode());
  }

  /**
   * Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  public void testCursor() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.cursor().hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  public void testCursor2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursorResult = objectList.cursor();

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  public void testCursor3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursorResult = objectList.cursor();

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  public void testCursor4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.cursor(0).hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  public void testCursor5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursorResult = objectList.cursor(0);

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  public void testCursor6() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursorResult = objectList.cursor(0);

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList.Cursor#add(Object)}
   */
  @Test
  public void testCursorAdd() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Act
    cursor.add("Obj");

    // Assert
    Object nextResult = cursor.next();
    assertEquals("Obj", cursor.next());
    assertEquals("Value", nextResult);
    assertFalse(cursor.hasNext());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList.Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  public void testCursorNewCursor() {
    // Arrange and Act
    CursorableLinkedList.Cursor<Object> actualCursor = new CursorableLinkedList.Cursor<>(new CursorableLinkedList<>(),
        0);

    // Assert
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList.Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  public void testCursorNewCursor2() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Assert
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList.Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  public void testCursorNewCursor3() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Assert
    assertEquals("Value", actualCursor.next());
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList.Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  public void testCursorNewCursor4() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursor = new CursorableLinkedList.Cursor<>(parent, 0);

    // Assert
    assertEquals("Value", actualCursor.next());
    assertEquals("Value", actualCursor.next());
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList.Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  public void testCursorNewCursor5() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");

    // Act
    CursorableLinkedList.Cursor<Object> actualCursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Assert
    assertEquals("Value", actualCursor.next());
    assertEquals("Value", actualCursor.next());
    assertEquals("Value", actualCursor.next());
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList.Cursor#nextIndex()}
   */
  @Test
  public void testCursorNextIndex() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Act and Assert
    assertEquals(1, cursor.nextIndex());
  }

  /**
   * Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  public void testIterator2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  public void testIterator3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  public void testListIterator() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof CursorableLinkedList.Cursor);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  public void testListIterator2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof CursorableLinkedList.Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  public void testListIterator3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof CursorableLinkedList.Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof CursorableLinkedList.Cursor);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof CursorableLinkedList.Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator6() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof CursorableLinkedList.Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  public void testRemoveAllNodes() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.removeAllNodes();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  public void testRemoveAllNodes2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  public void testRemoveAllNodes3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList#updateNode(AbstractLinkedList.Node, Object)}
   */
  @Test
  public void testUpdateNode() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();

    // Act
    objectList.updateNode(node, "Value");

    // Assert
    assertEquals("Value", node.getValue());
  }

  /**
   * Method under test: {@link CursorableLinkedList#CursorableLinkedList()}
   */
  @Test
  public void testNewCursorableLinkedList() {
    // Arrange and Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  public void testNewCursorableLinkedList2() {
    // Arrange and Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  public void testNewCursorableLinkedList3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>(coll);

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test:
   * {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  public void testNewCursorableLinkedList4() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new CursorableLinkedList<>(coll));
  }
}
