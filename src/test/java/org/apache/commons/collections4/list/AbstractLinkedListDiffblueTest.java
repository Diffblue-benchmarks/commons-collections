package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList;
import org.apache.commons.collections4.list.AbstractLinkedList.Node;
import org.apache.commons.collections4.list.CursorableLinkedList.Cursor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractLinkedListDiffblueTest {
  /**
   * Test {@link AbstractLinkedList#add(int, Object)} with {@code index}, {@code value}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.add(int, Object)"})
  public void testAddWithIndexValue_thenCursorableLinkedListSizeIsOne() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.add(0, "Value");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Test {@link AbstractLinkedList#add(int, Object)} with {@code index}, {@code value}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.add(int, Object)"})
  public void testAddWithIndexValue_thenCursorableLinkedListSizeIsThree() {
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
   * Test {@link AbstractLinkedList#add(int, Object)} with {@code index}, {@code value}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.add(int, Object)"})
  public void testAddWithIndexValue_thenCursorableLinkedListSizeIsTwo() {
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
   * Test {@link AbstractLinkedList#add(Object)} with {@code value}.
   * <p>
   * Method under test: {@link AbstractLinkedList#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.add(Object)"})
  public void testAddWithValue() {
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
   * Test {@link AbstractLinkedList#addAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(Collection)"})
  public void testAddAllWithColl_given42_whenArrayListAdd42_thenCursorableLinkedListSizeIsOne() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    objectList.addAll(coll);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractLinkedList#addAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(Collection)"})
  public void testAddAllWithColl_given42_whenArrayListAdd42_thenCursorableLinkedListSizeIsTwo() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    objectList.addAll(coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractLinkedList#addAll(Collection)} with {@code coll}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(Collection)"})
  public void testAddAllWithColl_whenArrayList_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertTrue(objectList.addAll(coll));
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractLinkedList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_givenCursorableLinkedList_whenZero_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.addAll(0, new ArrayList<>()));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_thenCursorableLinkedListSizeIsThree() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    objectList.addAll(1, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("Value", objectList.get(2));
  }

  /**
   * Test {@link AbstractLinkedList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_thenCursorableLinkedListSizeIsTwo() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    objectList.addAll(1, coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(1));
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Test {@link AbstractLinkedList#addAll(int, Collection)} with {@code index}, {@code coll}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} first is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addAll(int, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  public void testAddAllWithIndexColl_whenZero_thenCursorableLinkedListFirstIs42() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    objectList.addAll(0, coll);

    // Assert
    assertEquals(3, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("Value", objectList.get(1));
    assertEquals("Value", objectList.get(2));
  }

  /**
   * Test {@link AbstractLinkedList#addFirst(Object)}.
   * <p>
   * Method under test: {@link AbstractLinkedList#addFirst(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addFirst(Object)"})
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
   * Test {@link AbstractLinkedList#addLast(Object)}.
   * <p>
   * Method under test: {@link AbstractLinkedList#addLast(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.addLast(Object)"})
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
   * Test {@link AbstractLinkedList#addNode(Node, Node)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} NextNode Value is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addNode(Node, Node)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.addNode(Node, Node)"})
  public void testAddNode_whenNode_thenNodeNextNodeValueIsNull() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    Node<Object> nodeToInsert = new Node<>();
    Node<Object> insertBeforeNode = new Node<>();

    // Act
    objectList.addNode(nodeToInsert, insertBeforeNode);

    // Assert
    Node<Object> nextNode = nodeToInsert.getNextNode();
    assertNull(nextNode.getValue());
    assertSame(nodeToInsert, nextNode.getNextNode());
    assertSame(insertBeforeNode, nodeToInsert.getPreviousNode());
    assertSame(nodeToInsert, nextNode.getPreviousNode());
  }

  /**
   * Test {@link AbstractLinkedList#addNodeAfter(Node, Object)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} NextNode Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addNodeAfter(Node, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.addNodeAfter(Node, Object)"})
  public void testAddNodeAfter_whenNode_thenNodeNextNodeValueIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.addNodeAfter(node, "Value");

    // Assert
    Node<Object> nextNode = node.getNextNode();
    assertEquals("Value", nextNode.getValue());
    assertSame(node, nextNode.getNextNode());
    assertSame(node, nextNode.getPreviousNode());
  }

  /**
   * Test {@link AbstractLinkedList#addNodeBefore(Node, Object)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} NextNode Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#addNodeBefore(Node, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.addNodeBefore(Node, Object)"})
  public void testAddNodeBefore_whenNode_thenNodeNextNodeValueIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.addNodeBefore(node, "Value");

    // Assert
    Node<Object> nextNode = node.getNextNode();
    assertEquals("Value", nextNode.getValue());
    assertSame(node, nextNode.getNextNode());
    assertSame(node, nextNode.getPreviousNode());
  }

  /**
   * Test {@link AbstractLinkedList#clear()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.clear()"})
  public void testClear_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.clear();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#clear()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.clear()"})
  public void testClear_givenCursorableLinkedListAddValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.clear();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#clear()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#clear()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.clear()"})
  public void testClear_givenCursorableLinkedListAddValue2() {
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
   * Test {@link AbstractLinkedList#contains(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add forty-two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.contains(Object)"})
  public void testContains_givenCursorableLinkedListAddFortyTwo_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act and Assert
    assertFalse(objectList.contains("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#contains(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.contains(Object)"})
  public void testContains_givenCursorableLinkedListAddValue_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertTrue(objectList.contains("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#contains(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.contains(Object)"})
  public void testContains_givenCursorableLinkedList_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.contains("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  public void testContainsAll_givenCursorableLinkedListAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(objectList.containsAll(coll));
  }

  /**
   * Test {@link AbstractLinkedList#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  public void testContainsAll_givenCursorableLinkedListAddValue_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Test {@link AbstractLinkedList#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  public void testContainsAll_givenCursorableLinkedList_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Test {@link AbstractLinkedList#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  public void testContainsAll_givenCursorableLinkedList_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Test {@link AbstractLinkedList#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  public void testContainsAll_givenCursorableLinkedList_whenArrayList_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link AbstractLinkedList#createHeaderNode()}.
   * <p>
   * Method under test: {@link AbstractLinkedList#createHeaderNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node AbstractLinkedList.createHeaderNode()"})
  public void testCreateHeaderNode() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    Node<Object> actualCreateHeaderNodeResult = objectList.createHeaderNode();

    // Assert
    assertNull(actualCreateHeaderNodeResult.getValue());
    assertSame(actualCreateHeaderNodeResult, actualCreateHeaderNodeResult.getNextNode());
    assertSame(actualCreateHeaderNodeResult, actualCreateHeaderNodeResult.getPreviousNode());
  }

  /**
   * Test {@link AbstractLinkedList#createNode(Object)}.
   * <p>
   * Method under test: {@link AbstractLinkedList#createNode(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node AbstractLinkedList.createNode(Object)"})
  public void testCreateNode() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    Node<Object> actualCreateNodeResult = objectList.createNode("Value");

    // Assert
    assertEquals("Value", actualCreateNodeResult.getValue());
    assertNull(actualCreateNodeResult.getNextNode());
    assertNull(actualCreateNodeResult.getPreviousNode());
  }

  /**
   * Test {@link AbstractLinkedList#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenObject_thenCursorableLinkedListSizeIsOne()
      throws IOException, ClassNotFoundException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    ObjectInputStream inputStream = mock(ObjectInputStream.class);
    when(inputStream.readObject()).thenReturn("Object");
    when(inputStream.readInt()).thenReturn(1);

    // Act
    objectList.doReadObject(inputStream);

    // Assert
    verify(inputStream).readInt();
    verify(inputStream).readObject();
    assertEquals(1, objectList.size());
    assertEquals("Object", objectList.get(0));
  }

  /**
   * Test {@link AbstractLinkedList#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_thenThrowNoSuchElementException() throws IOException, ClassNotFoundException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    ObjectInputStream inputStream = mock(ObjectInputStream.class);
    when(inputStream.readObject()).thenThrow(new NoSuchElementException("nodeToInsert"));
    when(inputStream.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.doReadObject(inputStream));
    verify(inputStream).readInt();
    verify(inputStream).readObject();
  }

  /**
   * Test {@link AbstractLinkedList#equals(Object)}, and {@link AbstractLinkedList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
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
   * Test {@link AbstractLinkedList#equals(Object)}, and {@link AbstractLinkedList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
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
   * Test {@link AbstractLinkedList#equals(Object)}, and {@link AbstractLinkedList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
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
   * Test {@link AbstractLinkedList#equals(Object)}, and {@link AbstractLinkedList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedList#equals(Object)}
   *   <li>{@link AbstractLinkedList#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(objectList, objectList);
    int expectedHashCodeResult = objectList.hashCode();
    assertEquals(expectedHashCodeResult, objectList.hashCode());
  }

  /**
   * Test {@link AbstractLinkedList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertNotEquals(objectList, new CursorableLinkedList<>());
  }

  /**
   * Test {@link AbstractLinkedList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
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
   * Test {@link AbstractLinkedList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
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
   * Test {@link AbstractLinkedList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertNotEquals(objectList, null);
  }

  /**
   * Test {@link AbstractLinkedList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertNotEquals(objectList, "Different type to AbstractLinkedList");
  }

  /**
   * Test {@link AbstractLinkedList#get(int)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.get(int)"})
  public void testGet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Test {@link AbstractLinkedList#get(int)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.get(int)"})
  public void testGet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.get(0));
  }

  /**
   * Test {@link AbstractLinkedList#getFirst()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getFirst()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.getFirst()"})
  public void testGetFirst_givenCursorableLinkedListAddValue_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.getFirst());
  }

  /**
   * Test {@link AbstractLinkedList#getFirst()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getFirst()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.getFirst()"})
  public void testGetFirst_givenCursorableLinkedList_thenThrowNoSuchElementException() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.getFirst());
  }

  /**
   * Test {@link AbstractLinkedList#getLast()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getLast()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.getLast()"})
  public void testGetLast_givenCursorableLinkedListAddValue_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.getLast());
  }

  /**
   * Test {@link AbstractLinkedList#getLast()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getLast()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.getLast()"})
  public void testGetLast_givenCursorableLinkedList_thenThrowNoSuchElementException() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.getLast());
  }

  /**
   * Test {@link AbstractLinkedList#getNode(int, boolean)}.
   * <ul>
   *   <li>Then return {@link CursorableLinkedList#CursorableLinkedList()} {@link AbstractLinkedList#header}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  public void testGetNode_thenReturnCursorableLinkedListHeader() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertSame(objectList.header, objectList.getNode(1, true));
  }

  /**
   * Test {@link AbstractLinkedList#getNode(int, boolean)}.
   * <ul>
   *   <li>Then return NextNode NextNode Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  public void testGetNode_thenReturnNextNodeNextNodeValueIsValue() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Node<Object> actualNode = objectList.getNode(1, true);

    // Assert
    Node<Object> nextNode = actualNode.getNextNode().getNextNode();
    assertEquals("Value", nextNode.getValue());
    assertNull(actualNode.getPreviousNode().getPreviousNode().getValue());
    Node<Object> expectedNextNode = objectList.header;
    assertSame(expectedNextNode, nextNode.getNextNode());
  }

  /**
   * Test {@link AbstractLinkedList#getNode(int, boolean)}.
   * <ul>
   *   <li>Then return PreviousNode PreviousNode is NextNode.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  public void testGetNode_thenReturnPreviousNodePreviousNodeIsNextNode() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Node<Object> actualNode = objectList.getNode(1, true);

    // Assert
    Node<Object> nextNode = actualNode.getNextNode();
    assertSame(nextNode, actualNode.getPreviousNode().getPreviousNode());
    assertSame(objectList.header, nextNode);
  }

  /**
   * Test {@link AbstractLinkedList#getNode(int, boolean)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return NextNode NextNode is PreviousNode.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  public void testGetNode_whenZero_thenReturnNextNodeNextNodeIsPreviousNode() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Node<Object> actualNode = objectList.getNode(0, true);

    // Assert
    Node<Object> nextNode = actualNode.getNextNode();
    assertSame(actualNode, nextNode.getPreviousNode());
    Node<Object> previousNode = actualNode.getPreviousNode();
    assertSame(previousNode, nextNode.getNextNode());
    assertSame(objectList.header, previousNode);
  }

  /**
   * Test {@link AbstractLinkedList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add forty-two.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.indexOf(Object)"})
  public void testIndexOf_givenCursorableLinkedListAddFortyTwo_thenReturnMinusOne() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.indexOf(Object)"})
  public void testIndexOf_givenCursorableLinkedListAddValue_thenReturnZero() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals(0, objectList.indexOf("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.indexOf(Object)"})
  public void testIndexOf_givenCursorableLinkedList_thenReturnMinusOne() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(-1, objectList.indexOf("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#isEmpty()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.isEmpty()"})
  public void testIsEmpty_givenCursorableLinkedListAddValue_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertFalse(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#isEmpty()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.isEmpty()"})
  public void testIsEmpty_givenCursorableLinkedList_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#isEqualValue(Object, Object)}.
   * <ul>
   *   <li>When forty-two.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#isEqualValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.isEqualValue(Object, Object)"})
  public void testIsEqualValue_whenFortyTwo_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertTrue(objectList.isEqualValue(42, 42));
  }

  /**
   * Test {@link AbstractLinkedList#isEqualValue(Object, Object)}.
   * <ul>
   *   <li>When {@code Value1}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#isEqualValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.isEqualValue(Object, Object)"})
  public void testIsEqualValue_whenValue1_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.isEqualValue("Value1", "Value2"));
  }

  /**
   * Test {@link AbstractLinkedList#iterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  public void testIterator_givenNodeCachingLinkedList() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#iterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  public void testIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#iterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  public void testIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#lastIndexOf(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add forty-two.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#lastIndexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.lastIndexOf(Object)"})
  public void testLastIndexOf_givenCursorableLinkedListAddFortyTwo_thenReturnMinusOne() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(42);

    // Act and Assert
    assertEquals(-1, objectList.lastIndexOf("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#lastIndexOf(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#lastIndexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.lastIndexOf(Object)"})
  public void testLastIndexOf_givenCursorableLinkedListAddValue_thenReturnZero() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals(0, objectList.lastIndexOf("Value"));
  }

  /**
   * Test {@link AbstractLinkedList#lastIndexOf(Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#lastIndexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.lastIndexOf(Object)"})
  public void testLastIndexOf_givenCursorableLinkedList_thenReturnMinusOne() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(-1, objectList.lastIndexOf("Value"));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#getLastNodeReturned()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#getLastNodeReturned()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node LinkedListIterator.getLastNodeReturned()"})
  public void testLinkedListIteratorGetLastNodeReturned_thenThrowIllegalStateException()
      throws IllegalStateException, IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.getLastNodeReturned());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  public void testLinkedListIteratorHasNext_givenCursorableLinkedListAddValue_thenReturnFalse()
      throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertFalse(linkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  public void testLinkedListIteratorHasNext_givenCursorableLinkedListAddValue_thenReturnTrue()
      throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertTrue(linkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#hasPrevious()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkedListIterator.hasPrevious()"})
  public void testLinkedListIteratorHasPrevious_thenReturnFalse() throws IndexOutOfBoundsException {
    // Arrange
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(new CursorableLinkedList<>(), 0);

    // Act and Assert
    assertFalse(linkedListIterator.hasPrevious());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#hasPrevious()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkedListIterator.hasPrevious()"})
  public void testLinkedListIteratorHasPrevious_thenReturnTrue() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertTrue(linkedListIterator.hasPrevious());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}.
   * <ul>
   *   <li>Given {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  public void testLinkedListIteratorNewLinkedListIterator_givenValue() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");

    // Act
    LinkedListIterator<Object> actualLinkedListIterator = new LinkedListIterator<>(parent, 1);

    // Assert
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}.
   * <ul>
   *   <li>Given {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  public void testLinkedListIteratorNewLinkedListIterator_givenValue_thenReturnNextIsValue()
      throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    LinkedListIterator<Object> actualLinkedListIterator = new LinkedListIterator<>(parent, 1);

    // Assert
    assertEquals("Value", actualLinkedListIterator.next());
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  public void testLinkedListIteratorNewLinkedListIterator_whenZero_thenReturnNextIsValue()
      throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    LinkedListIterator<Object> actualLinkedListIterator = new LinkedListIterator<>(parent, 0);

    // Assert
    assertEquals("Value", actualLinkedListIterator.next());
    assertEquals("Value", actualLinkedListIterator.next());
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#LinkedListIterator(AbstractLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  public void testLinkedListIteratorNewLinkedListIterator_whenZero_thenReturnNotHasNext()
      throws IndexOutOfBoundsException {
    // Arrange and Act
    LinkedListIterator<Object> actualLinkedListIterator = new LinkedListIterator<>(new CursorableLinkedList<>(), 0);

    // Assert
    assertFalse(actualLinkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#next()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  public void testLinkedListIteratorNext_givenCursorableLinkedListAddValue_thenReturnValue()
      throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertEquals("Value", linkedListIterator.next());
    assertFalse(linkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  public void testLinkedListIteratorNext_thenThrowNoSuchElementException() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkedListIterator.next());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previous()}.
   * <p>
   * Method under test: {@link LinkedListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  public void testLinkedListIteratorPrevious() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    Object actualPreviousResult = linkedListIterator.previous();

    // Assert
    assertEquals("Value", linkedListIterator.next());
    assertEquals("Value", actualPreviousResult);
    assertFalse(linkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previous()}.
   * <p>
   * Method under test: {@link LinkedListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  public void testLinkedListIteratorPrevious2() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    Cursor<Object> cursor = new Cursor<>(parent, 1);

    // Act
    Object actualPreviousResult = cursor.previous();

    // Assert
    assertEquals("Value", cursor.next());
    assertEquals("Value", actualPreviousResult);
    assertFalse(cursor.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link LinkedListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LinkedListIterator.previousIndex()"})
  public void testLinkedListIteratorPreviousIndex() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    Cursor<Object> cursor = new Cursor<>(parent, 1);

    // Act and Assert
    assertEquals(0, cursor.previousIndex());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previousIndex()}.
   * <ul>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LinkedListIterator.previousIndex()"})
  public void testLinkedListIteratorPreviousIndex_thenReturnZero() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertEquals(0, linkedListIterator.previousIndex());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previous()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  public void testLinkedListIteratorPrevious_thenThrowNoSuchElementException() throws IndexOutOfBoundsException {
    // Arrange
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(new CursorableLinkedList<>(), 0);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkedListIterator.previous());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#remove()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.remove()"})
  public void testLinkedListIteratorRemove_thenThrowIllegalStateException() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.remove());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#set(Object)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.set(Object)"})
  public void testLinkedListIteratorSet_thenThrowIllegalStateException() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.set("Value"));
  }

  /**
   * Test LinkedSubList {@link LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}.
   * <ul>
   *   <li>Given {@code Value}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedSubList.<init>(AbstractLinkedList, int, int)"})
  public void testLinkedSubListNewLinkedSubList_givenValue_thenReturnEmpty() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");

    // Act
    LinkedSubList<Object> actualObjectList = new LinkedSubList<>(parent, 1, 1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test LinkedSubList {@link LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}.
   * <ul>
   *   <li>Given {@code Value}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedSubList.<init>(AbstractLinkedList, int, int)"})
  public void testLinkedSubListNewLinkedSubList_givenValue_thenReturnEmpty2() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    LinkedSubList<Object> actualObjectList = new LinkedSubList<>(parent, 1, 1);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test LinkedSubList {@link LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedSubList#LinkedSubList(AbstractLinkedList, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedSubList.<init>(AbstractLinkedList, int, int)"})
  public void testLinkedSubListNewLinkedSubList_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LinkedSubList<>(new CursorableLinkedList<>(), 1, 0));

  }

  /**
   * Test {@link AbstractLinkedList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@link Cursor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_givenCursorableLinkedList_whenZero_thenReturnCursor() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>Then return {@link LinkedListIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_thenReturnLinkedListIterator() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(1);

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#listIterator(int)} with {@code int}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_whenZero_thenReturnNextIsValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#listIterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  public void testListIterator_givenNodeCachingLinkedList() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#listIterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  public void testListIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedList#listIterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  public void testListIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test Node getters and setters.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Node#Node(Node, Node, Object)}
   *   <li>{@link Node#setNextNode(Node)}
   *   <li>{@link Node#setPreviousNode(Node)}
   *   <li>{@link Node#setValue(Object)}
   *   <li>{@link Node#getNextNode()}
   *   <li>{@link Node#getPreviousNode()}
   *   <li>{@link Node#getValue()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Node.<init>(Object)", "void Node.<init>(Node, Node, Object)", "Node Node.getNextNode()",
      "Node Node.getPreviousNode()", "Object Node.getValue()", "void Node.setNextNode(Node)",
      "void Node.setPreviousNode(Node)", "void Node.setValue(Object)"})
  public void testNodeGettersAndSetters_whenNode() {
    // Arrange
    Node<Object> previous = new Node<>();

    // Act
    Node<Object> actualNode = new Node<>(previous, new Node<>(), "Value");
    Node<Object> next = new Node<>();
    actualNode.setNextNode(next);
    Node<Object> previous2 = new Node<>();
    actualNode.setPreviousNode(previous2);
    actualNode.setValue("Value");
    Node<Object> actualNextNode = actualNode.getNextNode();
    Node<Object> actualPreviousNode = actualNode.getPreviousNode();

    // Assert
    assertEquals("Value", actualNode.getValue());
    assertSame(next, actualNextNode);
    assertSame(previous2, actualPreviousNode);
  }

  /**
   * Test Node getters and setters.
   * <ul>
   *   <li>When {@code Value}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Node#Node(Object)}
   *   <li>{@link Node#setNextNode(Node)}
   *   <li>{@link Node#setPreviousNode(Node)}
   *   <li>{@link Node#setValue(Object)}
   *   <li>{@link Node#getNextNode()}
   *   <li>{@link Node#getPreviousNode()}
   *   <li>{@link Node#getValue()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Node.<init>(Object)", "void Node.<init>(Node, Node, Object)", "Node Node.getNextNode()",
      "Node Node.getPreviousNode()", "Object Node.getValue()", "void Node.setNextNode(Node)",
      "void Node.setPreviousNode(Node)", "void Node.setValue(Object)"})
  public void testNodeGettersAndSetters_whenValue() {
    // Arrange and Act
    Node<Object> actualNode = new Node<>("Value");
    Node<Object> next = new Node<>();
    actualNode.setNextNode(next);
    Node<Object> previous = new Node<>();
    actualNode.setPreviousNode(previous);
    actualNode.setValue("Value");
    Node<Object> actualNextNode = actualNode.getNextNode();
    Node<Object> actualPreviousNode = actualNode.getPreviousNode();

    // Assert
    assertEquals("Value", actualNode.getValue());
    assertSame(next, actualNextNode);
    assertSame(previous, actualPreviousNode);
  }

  /**
   * Test Node {@link Node#Node()}.
   * <p>
   * Method under test: {@link Node#Node()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Node.<init>()"})
  public void testNodeNewNode() {
    // Arrange and Act
    Node<Object> actualNode = new Node<>();

    // Assert
    assertNull(actualNode.getValue());
    assertSame(actualNode, actualNode.getNextNode());
    assertSame(actualNode, actualNode.getPreviousNode());
  }

  /**
   * Test {@link AbstractLinkedList#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.remove(int)"})
  public void testRemoveWithIndex_thenCursorableLinkedListEmpty() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.remove(0));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.remove(int)"})
  public void testRemoveWithIndex_thenCursorableLinkedListSizeIsOne() {
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
   * Test {@link AbstractLinkedList#remove(Object)} with {@code value}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.remove(Object)"})
  public void testRemoveWithValue_givenCursorableLinkedListAddValue_thenReturnTrue() {
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
   * Test {@link AbstractLinkedList#remove(Object)} with {@code value}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.remove(Object)"})
  public void testRemoveWithValue_givenCursorableLinkedList_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.remove("Value"));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#remove(Object)} with {@code value}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.remove(Object)"})
  public void testRemoveWithValue_thenCursorableLinkedListSizeIsOne() {
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
   * Test {@link AbstractLinkedList#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  public void testRemoveAll_givenCursorableLinkedListAdd42_whenArrayListAdd42_thenReturnTrue() {
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
   * Test {@link AbstractLinkedList#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  public void testRemoveAll_givenCursorableLinkedList_whenArrayList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.removeAll(new ArrayList<>()));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  public void testRemoveAll_givenCursorableLinkedList_whenArrayListAdd42() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  public void testRemoveAll_givenCursorableLinkedList_whenArrayListAdd422() {
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
   * Test {@link AbstractLinkedList#removeAll(Collection)}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  public void testRemoveAll_thenCursorableLinkedListSizeIsOne() {
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
   * Test {@link AbstractLinkedList#removeAll(Collection)}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  public void testRemoveAll_thenCursorableLinkedListSizeIsTwo() {
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
   * Test {@link AbstractLinkedList#removeAllNodes()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.removeAllNodes();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#removeAllNodes()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenCursorableLinkedListAddValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#removeAllNodes()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenCursorableLinkedListAddValue2() {
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
   * Test {@link AbstractLinkedList#removeFirst()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeFirst()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.removeFirst()"})
  public void testRemoveFirst_givenCursorableLinkedListAddValue_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.removeFirst());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#removeFirst()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeFirst()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.removeFirst()"})
  public void testRemoveFirst_givenCursorableLinkedList_thenThrowNoSuchElementException() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.removeFirst());
  }

  /**
   * Test {@link AbstractLinkedList#removeLast()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeLast()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.removeLast()"})
  public void testRemoveLast_givenCursorableLinkedListAddValue_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.removeLast());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#removeLast()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#removeLast()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.removeLast()"})
  public void testRemoveLast_givenCursorableLinkedList_thenThrowNoSuchElementException() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.removeLast());
  }

  /**
   * Test {@link AbstractLinkedList#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code 42}.</li>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  public void testRetainAll_givenCursorableLinkedListAdd42_thenCursorableLinkedListSizeIsOne() {
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
   * Test {@link AbstractLinkedList#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  public void testRetainAll_givenCursorableLinkedListAddValue_whenArrayList_thenReturnTrue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRetainAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractLinkedList#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  public void testRetainAll_givenCursorableLinkedListAddValue_whenArrayList_thenReturnTrue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRetainAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractLinkedList#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} is {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  public void testRetainAll_givenCursorableLinkedList_thenArrayListIsCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.retainAll(coll));
    assertTrue(objectList.isEmpty());
    assertEquals(objectList, coll);
  }

  /**
   * Test {@link AbstractLinkedList#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  public void testRetainAll_givenCursorableLinkedList_thenArrayListSizeIsOne() {
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
   * Test {@link AbstractLinkedList#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  public void testRetainAll_givenCursorableLinkedList_thenArrayListSizeIsTwo() {
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
   * Test {@link AbstractLinkedList#set(int, Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#set(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.set(int, Object)"})
  public void testSet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.set(0, "Value"));
  }

  /**
   * Test {@link AbstractLinkedList#set(int, Object)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#set(int, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedList.set(int, Object)"})
  public void testSet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act and Assert
    assertEquals("Value", objectList.set(0, "Value"));
  }

  /**
   * Test {@link AbstractLinkedList#size()}.
   * <p>
   * Method under test: {@link AbstractLinkedList#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractLinkedList.size()"})
  public void testSize() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(0, objectList.size());
  }

  /**
   * Test {@link AbstractLinkedList#subList(int, int)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#subList(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.List AbstractLinkedList.subList(int, int)"})
  public void testSubList_givenCursorableLinkedListAddValue_whenOne_thenReturnEmpty() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertTrue(objectList.subList(1, 1).isEmpty());
  }

  /**
   * Test {@link AbstractLinkedList#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then first element is {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#toArray(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] AbstractLinkedList.toArray(Object[])"})
  public void testToArrayWithObject_givenCursorableLinkedListAddValue_thenFirstElementIsArray() {
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
   * Test {@link AbstractLinkedList#toString()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code [Value]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractLinkedList.toString()"})
  public void testToString_givenCursorableLinkedListAddValue_thenReturnValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act and Assert
    assertEquals("[Value]", objectList.toString());
  }

  /**
   * Test {@link AbstractLinkedList#toString()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return {@code [Value, Value]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractLinkedList.toString()"})
  public void testToString_givenCursorableLinkedListAddValue_thenReturnValueValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act and Assert
    assertEquals("[Value, Value]", objectList.toString());
  }

  /**
   * Test {@link AbstractLinkedList#toString()}.
   * <ul>
   *   <li>Then return {@code []}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractLinkedList.toString()"})
  public void testToString_thenReturnLeftSquareBracketRightSquareBracket() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals("[]", objectList.toString());
  }

  /**
   * Test {@link AbstractLinkedList#updateNode(Node, Object)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#updateNode(Node, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractLinkedList.updateNode(Node, Object)"})
  public void testUpdateNode_whenNode_thenNodeValueIsValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.updateNode(node, "Value");

    // Assert
    assertEquals("Value", node.getValue());
  }
}
