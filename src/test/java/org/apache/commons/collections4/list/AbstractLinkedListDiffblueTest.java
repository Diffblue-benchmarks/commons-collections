package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class AbstractLinkedListDiffblueTest {
  /**
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.add(0, "Value");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  public void testAdd2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.add(0, "Value");

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("Value", objectList.get(0));
    assertEquals("Value", objectList.get(1));
  }

  /**
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  public void testAdd3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    objectList.add(0, "Value");

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("Value", objectList.get(0));
    assertEquals("Value", objectList.get(1));
    assertEquals("Value", objectList.get(2));
  }

  /**
   * Method under test: {@link AbstractLinkedList#add(Object)}
   */
  @Test
  public void testAdd4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    boolean actualAddResult = objectList.add("Value");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Value", objectList.get(0));
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.addAll(0, new ArrayList<>()));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("Value", objectList.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(1, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("Value", objectList.get(0));
    assertEquals("Value", objectList.get(2));
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  public void testAddAll4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(0, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("Value", objectList.get(1));
    assertEquals("Value", objectList.get(2));
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(Collection)}
   */
  @Test
  public void testAddAll5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertTrue(coll.isEmpty());
    assertTrue(actualAddAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(Collection)}
   */
  @Test
  public void testAddAll6() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(1, coll.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addAll(Collection)}
   */
  @Test
  public void testAddAll7() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertTrue(actualAddAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addFirst(Object)}
   */
  @Test
  public void testAddFirst() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    boolean actualAddFirstResult = objectList.addFirst("42");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertTrue(actualAddFirstResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#addLast(Object)}
   */
  @Test
  public void testAddLast() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    boolean actualAddLastResult = objectList.addLast("42");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertTrue(actualAddLastResult);
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList#addNode(AbstractLinkedList.Node, AbstractLinkedList.Node)}
   */
  @Test
  public void testAddNode() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    AbstractLinkedList.Node<Object> nodeToInsert = new AbstractLinkedList.Node<>();
    AbstractLinkedList.Node<Object> insertBeforeNode = new AbstractLinkedList.Node<>();

    // Act
    objectList.addNode(nodeToInsert, insertBeforeNode);

    // Assert
    assertSame(insertBeforeNode, nodeToInsert.getNextNode());
    assertSame(insertBeforeNode, nodeToInsert.getPreviousNode());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList#addNodeAfter(AbstractLinkedList.Node, Object)}
   */
  @Test
  public void testAddNodeAfter() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();

    // Act
    objectList.addNodeAfter(node, "Value");

    // Assert
    AbstractLinkedList.Node<Object> nextNode = node.getNextNode();
    assertEquals("Value", nextNode.getValue());
    assertSame(node, nextNode.getNextNode());
    assertSame(node, nextNode.getPreviousNode());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList#addNodeBefore(AbstractLinkedList.Node, Object)}
   */
  @Test
  public void testAddNodeBefore() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();

    // Act
    objectList.addNodeBefore(node, "Value");

    // Assert
    AbstractLinkedList.Node<Object> nextNode = node.getNextNode();
    assertEquals("Value", nextNode.getValue());
    assertSame(node, nextNode.getNextNode());
    assertSame(node, nextNode.getPreviousNode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#clear()}
   */
  @Test
  public void testClear() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.clear();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#clear()}
   */
  @Test
  public void testClear2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.clear();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#clear()}
   */
  @Test
  public void testClear3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    objectList.clear();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.contains("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertTrue(objectList.contains("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#contains(Object)}
   */
  @Test
  public void testContains3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act and Assert
    assertFalse(objectList.contains("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  public void testContainsAll() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.containsAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  public void testContainsAll2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  public void testContainsAll3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  public void testContainsAll4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  public void testContainsAll5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(objectList.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractLinkedList#createHeaderNode()}
   */
  @Test
  public void testCreateHeaderNode() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    AbstractLinkedList.Node<Object> actualCreateHeaderNodeResult = objectList.createHeaderNode();

    // Assert
    assertNull(actualCreateHeaderNodeResult.getValue());
    assertSame(actualCreateHeaderNodeResult, actualCreateHeaderNodeResult.getNextNode());
    assertSame(actualCreateHeaderNodeResult, actualCreateHeaderNodeResult.getPreviousNode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#createNode(Object)}
   */
  @Test
  public void testCreateNode() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    AbstractLinkedList.Node<Object> actualCreateNodeResult = objectList.createNode("Value");

    // Assert
    assertEquals("Value", actualCreateNodeResult.getValue());
    assertNull(actualCreateNodeResult.getNextNode());
    assertNull(actualCreateNodeResult.getPreviousNode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Method under test: {@link AbstractLinkedList#get(int)}
   */
  @Test
  public void testGet2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Method under test: {@link AbstractLinkedList#getFirst()}
   */
  @Test
  public void testGetFirst() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.getFirst());
  }

  /**
   * Method under test: {@link AbstractLinkedList#getFirst()}
   */
  @Test
  public void testGetFirst2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.getFirst());
  }

  /**
   * Method under test: {@link AbstractLinkedList#getLast()}
   */
  @Test
  public void testGetLast() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.getLast());
  }

  /**
   * Method under test: {@link AbstractLinkedList#getLast()}
   */
  @Test
  public void testGetLast2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.getLast());
  }

  /**
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  public void testGetNode() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertSame(objectList.header, objectList.getNode(1, true));
  }

  /**
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  public void testGetNode2() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    AbstractLinkedList.Node<Object> actualNode = objectList.getNode(1, true);

    // Assert
    assertEquals("Value", actualNode.getValue());
    AbstractLinkedList.Node<Object> previousNode = actualNode.getPreviousNode();
    assertEquals("Value", previousNode.getValue());
    assertSame(actualNode, previousNode.getNextNode());
    AbstractLinkedList.Node<Object> node = objectList.header;
    assertSame(node, actualNode.getNextNode());
    assertSame(node, previousNode.getPreviousNode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  public void testGetNode3() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    AbstractLinkedList.Node<Object> actualNode = objectList.getNode(0, true);

    // Assert
    assertEquals("Value", actualNode.getValue());
    AbstractLinkedList.Node<Object> nextNode = actualNode.getNextNode();
    assertEquals("Value", nextNode.getValue());
    assertSame(actualNode, nextNode.getPreviousNode());
    AbstractLinkedList.Node<Object> node = objectList.header;
    assertSame(node, nextNode.getNextNode());
    assertSame(node, actualNode.getPreviousNode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  public void testGetNode4() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");
    objectList.add("Value");
    objectList.add("Value");

    // Act
    AbstractLinkedList.Node<Object> actualNode = objectList.getNode(1, true);

    // Assert
    assertEquals("Value", actualNode.getValue());
    AbstractLinkedList.Node<Object> nextNode = actualNode.getNextNode();
    assertEquals("Value", nextNode.getValue());
    AbstractLinkedList.Node<Object> nextNode2 = nextNode.getNextNode();
    assertEquals("Value", nextNode2.getValue());
    AbstractLinkedList.Node<Object> previousNode = actualNode.getPreviousNode();
    assertEquals("Value", previousNode.getValue());
    assertSame(actualNode, previousNode.getNextNode());
    assertSame(actualNode, nextNode.getPreviousNode());
    AbstractLinkedList.Node<Object> node = objectList.header;
    assertSame(node, nextNode2.getNextNode());
    assertSame(node, previousNode.getPreviousNode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    CursorableLinkedList<Object> objectList2 = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(objectList, objectList2);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    CursorableLinkedList<Object> objectList2 = new CursorableLinkedList<>();
    objectList2.add("Value");

    // Act and Assert
    assertEquals(objectList, objectList2);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(new CursorableLinkedList<>());

    CursorableLinkedList<Object> objectList2 = new CursorableLinkedList<>();
    objectList2.add(new ArrayList<>());

    // Act and Assert
    assertEquals(objectList, objectList2);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(objectList, objectList);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList.hashCode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#indexOf(Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#indexOf(Object)}
   */
  @Test
  public void testIndexOf2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals(0, objectList.indexOf("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#indexOf(Object)}
   */
  @Test
  public void testIndexOf3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertFalse(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#isEqualValue(Object, Object)}
   */
  @Test
  public void testIsEqualValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.isEqualValue("Value1", "Value2"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#isEqualValue(Object, Object)}
   */
  @Test
  public void testIsEqualValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.isEqualValue(42, 42));
  }

  /**
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  public void testIterator2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  public void testIterator3() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
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
   * Method under test: {@link AbstractLinkedList#lastIndexOf(Object)}
   */
  @Test
  public void testLastIndexOf() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(-1, objectList.lastIndexOf("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#lastIndexOf(Object)}
   */
  @Test
  public void testLastIndexOf2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals(0, objectList.lastIndexOf("Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#lastIndexOf(Object)}
   */
  @Test
  public void testLastIndexOf3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act and Assert
    assertEquals(-1, objectList.lastIndexOf("Value"));
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#getLastNodeReturned()}
   */
  @Test
  public void testLinkedListIteratorGetLastNodeReturned() throws IllegalStateException, IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.getLastNodeReturned());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#hasNext()}
   */
  @Test
  public void testLinkedListIteratorHasNext() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertFalse(linkedListIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#hasNext()}
   */
  @Test
  public void testLinkedListIteratorHasNext2() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertTrue(linkedListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#hasPrevious()}
   */
  @Test
  public void testLinkedListIteratorHasPrevious() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertTrue(linkedListIterator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#hasPrevious()}
   */
  @Test
  public void testLinkedListIteratorHasPrevious2() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        new CursorableLinkedList<>(), 0);

    // Act and Assert
    assertFalse(linkedListIterator.hasPrevious());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  public void testLinkedListIteratorNewLinkedListIterator() throws IndexOutOfBoundsException {
    // Arrange and Act
    AbstractLinkedList.LinkedListIterator<Object> actualLinkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        new CursorableLinkedList<>(), 0);

    // Assert
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  public void testLinkedListIteratorNewLinkedListIterator2() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");

    // Act
    AbstractLinkedList.LinkedListIterator<Object> actualLinkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Assert
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  public void testLinkedListIteratorNewLinkedListIterator3() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    AbstractLinkedList.LinkedListIterator<Object> actualLinkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Assert
    assertEquals("Value", actualLinkedListIterator.next());
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  public void testLinkedListIteratorNewLinkedListIterator4() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    AbstractLinkedList.LinkedListIterator<Object> actualLinkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 0);

    // Assert
    assertEquals("Value", actualLinkedListIterator.next());
    assertEquals("Value", actualLinkedListIterator.next());
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  public void testLinkedListIteratorNewLinkedListIterator5() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");

    // Act
    AbstractLinkedList.LinkedListIterator<Object> actualLinkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Assert
    assertEquals("Value", actualLinkedListIterator.next());
    assertEquals("Value", actualLinkedListIterator.next());
    assertEquals("Value", actualLinkedListIterator.next());
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#next()}
   */
  @Test
  public void testLinkedListIteratorNext() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkedListIterator.next());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#next()}
   */
  @Test
  public void testLinkedListIteratorNext2() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertEquals("Value", linkedListIterator.next());
    assertFalse(linkedListIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#previous()}
   */
  @Test
  public void testLinkedListIteratorPrevious() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act
    Object actualPreviousResult = linkedListIterator.previous();

    // Assert
    assertEquals("Value", linkedListIterator.next());
    assertEquals("Value", actualPreviousResult);
    assertFalse(linkedListIterator.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#previous()}
   */
  @Test
  public void testLinkedListIteratorPrevious2() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        new CursorableLinkedList<>(), 0);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkedListIterator.previous());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#previous()}
   */
  @Test
  public void testLinkedListIteratorPrevious3() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Act
    Object actualPreviousResult = cursor.previous();

    // Assert
    assertEquals("Value", cursor.next());
    assertEquals("Value", actualPreviousResult);
    assertFalse(cursor.hasNext());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#previousIndex()}
   */
  @Test
  public void testLinkedListIteratorPreviousIndex() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertEquals(0, linkedListIterator.previousIndex());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedListIterator#previousIndex()}
   */
  @Test
  public void testLinkedListIteratorPreviousIndex2() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    CursorableLinkedList.Cursor<Object> cursor = new CursorableLinkedList.Cursor<>(parent, 1);

    // Act and Assert
    assertEquals(0, cursor.previousIndex());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#remove()}
   */
  @Test
  public void testLinkedListIteratorRemove() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.remove());
  }

  /**
   * Method under test: {@link AbstractLinkedList.LinkedListIterator#set(Object)}
   */
  @Test
  public void testLinkedListIteratorSet() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractLinkedList.LinkedListIterator<Object> linkedListIterator = new AbstractLinkedList.LinkedListIterator<>(
        parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.set("Value"));
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}
   */
  @Test
  public void testLinkedSubListNewLinkedSubList() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");

    // Act
    AbstractLinkedList.LinkedSubList<Object> actualObjectList = new AbstractLinkedList.LinkedSubList<>(parent, 1, 1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}
   */
  @Test
  public void testLinkedSubListNewLinkedSubList2() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    AbstractLinkedList.LinkedSubList<Object> actualObjectList = new AbstractLinkedList.LinkedSubList<>(parent, 1, 1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList.LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}
   */
  @Test
  public void testLinkedSubListNewLinkedSubList3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> new AbstractLinkedList.LinkedSubList<>(new CursorableLinkedList<>(), 1, 0));

  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  public void testListIterator() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  public void testListIterator2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  public void testListIterator3() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
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
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator5() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator6() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator7() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  public void testListIterator8() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof AbstractLinkedList.LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList.Node#Node(Object)}
   *   <li>{@link AbstractLinkedList.Node#setNextNode(AbstractLinkedList.Node)}
   *   <li>{@link AbstractLinkedList.Node#setPreviousNode(AbstractLinkedList.Node)}
   *   <li>{@link AbstractLinkedList.Node#setValue(Object)}
   *   <li>{@link AbstractLinkedList.Node#getNextNode()}
   *   <li>{@link AbstractLinkedList.Node#getPreviousNode()}
   *   <li>{@link AbstractLinkedList.Node#getValue()}
   * </ul>
   */
  @Test
  public void testNodeGettersAndSetters() {
    // Arrange and Act
    AbstractLinkedList.Node<Object> actualNode = new AbstractLinkedList.Node<>("Value");
    AbstractLinkedList.Node<Object> next = new AbstractLinkedList.Node<>();
    actualNode.setNextNode(next);
    AbstractLinkedList.Node<Object> previous = new AbstractLinkedList.Node<>();
    actualNode.setPreviousNode(previous);
    actualNode.setValue("Value");
    AbstractLinkedList.Node<Object> actualNextNode = actualNode.getNextNode();
    AbstractLinkedList.Node<Object> actualPreviousNode = actualNode.getPreviousNode();

    // Assert that nothing has changed
    assertEquals("Value", actualNode.getValue());
    assertSame(next, actualNextNode);
    assertSame(previous, actualPreviousNode);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link AbstractLinkedList.Node#Node(AbstractLinkedList.Node, AbstractLinkedList.Node, Object)}
   *   <li>{@link AbstractLinkedList.Node#setNextNode(AbstractLinkedList.Node)}
   *   <li>{@link AbstractLinkedList.Node#setPreviousNode(AbstractLinkedList.Node)}
   *   <li>{@link AbstractLinkedList.Node#setValue(Object)}
   *   <li>{@link AbstractLinkedList.Node#getNextNode()}
   *   <li>{@link AbstractLinkedList.Node#getPreviousNode()}
   *   <li>{@link AbstractLinkedList.Node#getValue()}
   * </ul>
   */
  @Test
  public void testNodeGettersAndSetters2() {
    // Arrange
    AbstractLinkedList.Node<Object> previous = new AbstractLinkedList.Node<>();

    // Act
    AbstractLinkedList.Node<Object> actualNode = new AbstractLinkedList.Node<>(previous,
        new AbstractLinkedList.Node<>(), "Value");
    AbstractLinkedList.Node<Object> next = new AbstractLinkedList.Node<>();
    actualNode.setNextNode(next);
    AbstractLinkedList.Node<Object> previous2 = new AbstractLinkedList.Node<>();
    actualNode.setPreviousNode(previous2);
    actualNode.setValue("Value");
    AbstractLinkedList.Node<Object> actualNextNode = actualNode.getNextNode();
    AbstractLinkedList.Node<Object> actualPreviousNode = actualNode.getPreviousNode();

    // Assert that nothing has changed
    assertEquals("Value", actualNode.getValue());
    assertSame(next, actualNextNode);
    assertSame(previous2, actualPreviousNode);
  }

  /**
   * Method under test: {@link AbstractLinkedList.Node#Node()}
   */
  @Test
  public void testNodeNewNode() {
    // Arrange and Act
    AbstractLinkedList.Node<Object> actualNode = new AbstractLinkedList.Node<>();

    // Assert
    assertNull(actualNode.getValue());
    assertSame(actualNode, actualNode.getNextNode());
    assertSame(actualNode, actualNode.getPreviousNode());
  }

  /**
   * Method under test: {@link AbstractLinkedList#remove(int)}
   */
  @Test
  public void testRemove() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.remove(0));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#remove(int)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Object actualRemoveResult = objectList.remove(0);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Value", actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#remove(Object)}
   */
  @Test
  public void testRemove3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.remove("Value"));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#remove(Object)}
   */
  @Test
  public void testRemove4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    boolean actualRemoveResult = objectList.remove("Value");

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#remove(Object)}
   */
  @Test
  public void testRemove5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act
    boolean actualRemoveResult = objectList.remove("Value");

    // Assert
    assertEquals(1, objectList.size());
    assertFalse(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.removeAll(new ArrayList<>()));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    boolean actualRemoveAllResult = objectList.removeAll(new ArrayList<>());

    // Assert
    assertEquals(1, objectList.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    boolean actualRemoveAllResult = objectList.removeAll(new ArrayList<>());

    // Assert
    assertEquals(2, objectList.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll6() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = objectList.removeAll(coll);

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertNotEquals(objectList, new CursorableLinkedList<>());
  }

  /**
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    CursorableLinkedList<Object> objectList2 = new CursorableLinkedList<>();
    objectList2.add(42);

    // Act and Assert
    assertNotEquals(objectList, objectList2);
  }

  /**
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(new CursorableLinkedList<>());

    CursorableLinkedList<Object> objectList2 = new CursorableLinkedList<>();
    objectList2.add("Value");

    // Act and Assert
    assertNotEquals(objectList, objectList2);
  }

  /**
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertNotEquals(objectList, null);
  }

  /**
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertNotEquals(objectList, "Different type to AbstractLinkedList");
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeAllNodes()}
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
   * Method under test: {@link AbstractLinkedList#removeAllNodes()}
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
   * Method under test: {@link AbstractLinkedList#removeAllNodes()}
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
   * Method under test: {@link AbstractLinkedList#removeFirst()}
   */
  @Test
  public void testRemoveFirst() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.removeFirst());
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeFirst()}
   */
  @Test
  public void testRemoveFirst2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.removeFirst());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeLast()}
   */
  @Test
  public void testRemoveLast() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.removeLast());
  }

  /**
   * Method under test: {@link AbstractLinkedList#removeLast()}
   */
  @Test
  public void testRemoveLast2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.removeLast());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.retainAll(coll));
    assertTrue(coll.isEmpty());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertTrue(coll.isEmpty());
    assertTrue(objectList.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  public void testRetainAll3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertTrue(coll.isEmpty());
    assertTrue(objectList.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  public void testRetainAll4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(1, coll.size());
    assertFalse(actualRetainAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  public void testRetainAll5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(2, coll.size());
    assertFalse(actualRetainAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  public void testRetainAll6() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals(2, coll.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#set(int, Object)}
   */
  @Test
  public void testSet() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.set(0, "Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#set(int, Object)}
   */
  @Test
  public void testSet2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.set(0, "Value"));
  }

  /**
   * Method under test: {@link AbstractLinkedList#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(0, objectList.size());
  }

  /**
   * Method under test: {@link AbstractLinkedList#subList(int, int)}
   */
  @Test
  public void testSubList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertTrue(objectList.subList(1, 1).isEmpty());
  }

  /**
   * Method under test: {@link AbstractLinkedList#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(0, objectList.toArray().length);
  }

  /**
   * Method under test: {@link AbstractLinkedList#toArray()}
   */
  @Test
  public void testToArray2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    Object[] actualToArrayResult = objectList.toArray();

    // Assert
    assertEquals("Value", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link AbstractLinkedList#toArray(Object[])}
   */
  @Test
  public void testToArray3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectList.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#toArray(Object[])}
   */
  @Test
  public void testToArray4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectList.toArray(array);

    // Assert
    assertEquals("Value", actualToArrayResult[0]);
    assertEquals("Value", array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractLinkedList#toArray(Object[])}
   */
  @Test
  public void testToArray5() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = objectList.toArray(array);

    // Assert
    assertEquals("Array", array[0]);
    assertEquals("Value", actualToArrayResult[0]);
    assertEquals("Value", actualToArrayResult[1]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link AbstractLinkedList#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals("[]", objectList.toString());
  }

  /**
   * Method under test: {@link AbstractLinkedList#toString()}
   */
  @Test
  public void testToString2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("[Value]", objectList.toString());
  }

  /**
   * Method under test: {@link AbstractLinkedList#toString()}
   */
  @Test
  public void testToString3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act and Assert
    assertEquals("[Value, Value]", objectList.toString());
  }

  /**
   * Method under test:
   * {@link AbstractLinkedList#updateNode(AbstractLinkedList.Node, Object)}
   */
  @Test
  public void testUpdateNode() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();

    // Act
    objectList.updateNode(node, "Value");

    // Assert
    assertEquals("Value", node.getValue());
  }
}
