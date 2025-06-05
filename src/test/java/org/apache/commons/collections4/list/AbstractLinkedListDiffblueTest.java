package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList;
import org.apache.commons.collections4.list.AbstractLinkedList.Node;
import org.apache.commons.collections4.list.CursorableLinkedList.Cursor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractLinkedListDiffblueTest {
  /**
   * Test {@link AbstractLinkedList#add(int, Object)} with {@code index}, {@code value}.
   * <ul>
   *   <li>Then {@link CursorableLinkedList#CursorableLinkedList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#add(int, Object)}
   */
  @Test
  @DisplayName("Test add(int, Object) with 'index', 'value'; then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.add(int, Object)"})
  void testAddWithIndexValue_thenCursorableLinkedListSizeIsOne() {
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
  @DisplayName("Test add(int, Object) with 'index', 'value'; then CursorableLinkedList() size is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.add(int, Object)"})
  void testAddWithIndexValue_thenCursorableLinkedListSizeIsThree() {
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
  @DisplayName("Test add(int, Object) with 'index', 'value'; then CursorableLinkedList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.add(int, Object)"})
  void testAddWithIndexValue_thenCursorableLinkedListSizeIsTwo() {
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
  @DisplayName("Test add(Object) with 'value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.add(Object)"})
  void testAddWithValue() {
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
  @DisplayName("Test addAll(Collection) with 'coll'; given '42'; when ArrayList() add '42'; then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(Collection)"})
  void testAddAllWithColl_given42_whenArrayListAdd42_thenCursorableLinkedListSizeIsOne() {
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
  @DisplayName("Test addAll(Collection) with 'coll'; given '42'; when ArrayList() add '42'; then CursorableLinkedList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(Collection)"})
  void testAddAllWithColl_given42_whenArrayListAdd42_thenCursorableLinkedListSizeIsTwo() {
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
  @DisplayName("Test addAll(Collection) with 'coll'; when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(Collection)"})
  void testAddAllWithColl_whenArrayList_thenReturnTrue() {
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
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; given CursorableLinkedList(); when zero; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_givenCursorableLinkedList_whenZero_thenReturnTrue() {
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
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; then CursorableLinkedList() size is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_thenCursorableLinkedListSizeIsThree() {
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
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; then CursorableLinkedList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_thenCursorableLinkedListSizeIsTwo() {
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
  @DisplayName("Test addAll(int, Collection) with 'index', 'coll'; when zero; then CursorableLinkedList() first is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addAll(int, Collection)"})
  void testAddAllWithIndexColl_whenZero_thenCursorableLinkedListFirstIs42() {
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
  @DisplayName("Test addFirst(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addFirst(Object)"})
  void testAddFirst() {
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
  @DisplayName("Test addLast(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.addLast(Object)"})
  void testAddLast() {
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
  @DisplayName("Test addNode(Node, Node); when Node(); then Node() NextNode Value is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.addNode(Node, Node)"})
  void testAddNode_whenNode_thenNodeNextNodeValueIsNull() {
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
  @DisplayName("Test addNodeAfter(Node, Object); when Node(); then Node() NextNode Value is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.addNodeAfter(Node, Object)"})
  void testAddNodeAfter_whenNode_thenNodeNextNodeValueIsValue() {
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
  @DisplayName("Test addNodeBefore(Node, Object); when Node(); then Node() NextNode Value is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.addNodeBefore(Node, Object)"})
  void testAddNodeBefore_whenNode_thenNodeNextNodeValueIsValue() {
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
  @DisplayName("Test clear(); given CursorableLinkedList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.clear()"})
  void testClear_givenCursorableLinkedList() {
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
  @DisplayName("Test clear(); given CursorableLinkedList() add 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.clear()"})
  void testClear_givenCursorableLinkedListAddValue() {
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
  @DisplayName("Test clear(); given CursorableLinkedList() add 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.clear()"})
  void testClear_givenCursorableLinkedListAddValue2() {
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
  @DisplayName("Test contains(Object); given CursorableLinkedList() add forty-two; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.contains(Object)"})
  void testContains_givenCursorableLinkedListAddFortyTwo_thenReturnFalse() {
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
  @DisplayName("Test contains(Object); given CursorableLinkedList() add 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.contains(Object)"})
  void testContains_givenCursorableLinkedListAddValue_thenReturnTrue() {
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
  @DisplayName("Test contains(Object); given CursorableLinkedList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.contains(Object)"})
  void testContains_givenCursorableLinkedList_thenReturnFalse() {
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
  @DisplayName("Test containsAll(Collection); given CursorableLinkedList() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  void testContainsAll_givenCursorableLinkedListAdd42_whenArrayListAdd42_thenReturnTrue() {
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
  @DisplayName("Test containsAll(Collection); given CursorableLinkedList() add 'Value'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  void testContainsAll_givenCursorableLinkedListAddValue_thenReturnFalse() {
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
  @DisplayName("Test containsAll(Collection); given CursorableLinkedList(); when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  void testContainsAll_givenCursorableLinkedList_whenArrayListAdd42_thenReturnFalse() {
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
  @DisplayName("Test containsAll(Collection); given CursorableLinkedList(); when ArrayList() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  void testContainsAll_givenCursorableLinkedList_whenArrayListAdd42_thenReturnFalse2() {
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
  @DisplayName("Test containsAll(Collection); given CursorableLinkedList(); when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.containsAll(Collection)"})
  void testContainsAll_givenCursorableLinkedList_whenArrayList_thenReturnTrue() {
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
  @DisplayName("Test createHeaderNode()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.createHeaderNode()"})
  void testCreateHeaderNode() {
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
  @DisplayName("Test createNode(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.createNode(Object)"})
  void testCreateNode() {
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
  @DisplayName("Test doReadObject(ObjectInputStream); given 'Object'; then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenObject_thenCursorableLinkedListSizeIsOne() throws IOException, ClassNotFoundException {
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
  @DisplayName("Test doReadObject(ObjectInputStream); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.doReadObject(ObjectInputStream)"})
  void testDoReadObject_thenThrowNoSuchElementException() throws IOException, ClassNotFoundException {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
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
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
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
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add(new CursorableLinkedList<>());
    LinkedListIterator<Object> iterator = mock(LinkedListIterator.class);
    when(iterator.hasNext()).thenReturn(true);
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(iterator);
    LinkedSubList<Object> objectList2 = mock(LinkedSubList.class);
    when(objectList2.size()).thenReturn(0);
    when(objectList2.listIterator()).thenReturn(abstractListIteratorDecorator);

    CursorableLinkedList<Object> objectList3 = new CursorableLinkedList<>();
    objectList3.add(objectList2);

    // Act and Assert
    assertNotEquals(objectList, objectList3);
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
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
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
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.equals(Object)", "int AbstractLinkedList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
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
  @DisplayName("Test get(int); given CursorableLinkedList() add 'Value'; when zero; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.get(int)"})
  void testGet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue() {
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
  @DisplayName("Test get(int); given CursorableLinkedList() add 'Value'; when zero; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.get(int)"})
  void testGet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue2() {
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
  @DisplayName("Test getFirst(); given CursorableLinkedList() add 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.getFirst()"})
  void testGetFirst_givenCursorableLinkedListAddValue_thenReturnValue() {
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
  @DisplayName("Test getFirst(); given CursorableLinkedList(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.getFirst()"})
  void testGetFirst_givenCursorableLinkedList_thenThrowNoSuchElementException() {
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
  @DisplayName("Test getLast(); given CursorableLinkedList() add 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.getLast()"})
  void testGetLast_givenCursorableLinkedListAddValue_thenReturnValue() {
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
  @DisplayName("Test getLast(); given CursorableLinkedList(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.getLast()"})
  void testGetLast_givenCursorableLinkedList_thenThrowNoSuchElementException() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectList.getLast());
  }

  /**
   * Test {@link AbstractLinkedList#getNode(int, boolean)}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>When {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#getNode(int, boolean)}
   */
  @Test
  @DisplayName("Test getNode(int, boolean); given CursorableLinkedList() add 'Value'; when 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  void testGetNode_givenCursorableLinkedListAddValue_whenFalse() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Node<Object> actualNode = objectList.getNode(1, false);

    // Assert
    assertSame(actualNode, actualNode.getPreviousNode().getNextNode());
    assertSame(actualNode, actualNode.getNextNode().getPreviousNode());
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
  @DisplayName("Test getNode(int, boolean); then return CursorableLinkedList() header")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  void testGetNode_thenReturnCursorableLinkedListHeader() throws IndexOutOfBoundsException {
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
  @DisplayName("Test getNode(int, boolean); then return NextNode NextNode Value is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  void testGetNode_thenReturnNextNodeNextNodeValueIsValue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test getNode(int, boolean); then return PreviousNode PreviousNode is NextNode")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  void testGetNode_thenReturnPreviousNodePreviousNodeIsNextNode() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Node<Object> actualNode = objectList.getNode(1, true);

    // Assert
    Node<Object> previousNode = actualNode.getPreviousNode();
    assertSame(actualNode, previousNode.getNextNode());
    Node<Object> nextNode = actualNode.getNextNode();
    assertSame(nextNode, previousNode.getPreviousNode());
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
  @DisplayName("Test getNode(int, boolean); when zero; then return NextNode NextNode is PreviousNode")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node AbstractLinkedList.getNode(int, boolean)"})
  void testGetNode_whenZero_thenReturnNextNodeNextNodeIsPreviousNode() throws IndexOutOfBoundsException {
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
  @DisplayName("Test indexOf(Object); given CursorableLinkedList() add forty-two; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.indexOf(Object)"})
  void testIndexOf_givenCursorableLinkedListAddFortyTwo_thenReturnMinusOne() {
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
  @DisplayName("Test indexOf(Object); given CursorableLinkedList() add 'Value'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.indexOf(Object)"})
  void testIndexOf_givenCursorableLinkedListAddValue_thenReturnZero() {
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
  @DisplayName("Test indexOf(Object); given CursorableLinkedList(); then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.indexOf(Object)"})
  void testIndexOf_givenCursorableLinkedList_thenReturnMinusOne() {
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
  @DisplayName("Test isEmpty(); given CursorableLinkedList() add 'Value'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.isEmpty()"})
  void testIsEmpty_givenCursorableLinkedListAddValue_thenReturnFalse() {
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
  @DisplayName("Test isEmpty(); given CursorableLinkedList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.isEmpty()"})
  void testIsEmpty_givenCursorableLinkedList_thenReturnTrue() {
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
  @DisplayName("Test isEqualValue(Object, Object); when forty-two; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenFortyTwo_thenReturnTrue() {
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
  @DisplayName("Test isEqualValue(Object, Object); when 'Value1'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenValue1_thenReturnFalse() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.isEqualValue("Value1", "Value2"));
  }

  /**
   * Test {@link AbstractLinkedList#iterator()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#iterator()}
   */
  @Test
  @DisplayName("Test iterator(); given CursorableLinkedList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  void testIterator_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertFalse(actualIteratorResult.hasNext());
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
  @DisplayName("Test iterator(); given NodeCachingLinkedList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  void testIterator_givenNodeCachingLinkedList() {
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
  @DisplayName("Test iterator(); given NodeCachingLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  void testIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue() {
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
  @DisplayName("Test iterator(); given NodeCachingLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractLinkedList.iterator()"})
  void testIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue2() {
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
  @DisplayName("Test lastIndexOf(Object); given CursorableLinkedList() add forty-two; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.lastIndexOf(Object)"})
  void testLastIndexOf_givenCursorableLinkedListAddFortyTwo_thenReturnMinusOne() {
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
  @DisplayName("Test lastIndexOf(Object); given CursorableLinkedList() add 'Value'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.lastIndexOf(Object)"})
  void testLastIndexOf_givenCursorableLinkedListAddValue_thenReturnZero() {
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
  @DisplayName("Test lastIndexOf(Object); given CursorableLinkedList(); then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.lastIndexOf(Object)"})
  void testLastIndexOf_givenCursorableLinkedList_thenReturnMinusOne() {
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
  @DisplayName("Test LinkedListIterator getLastNodeReturned(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node LinkedListIterator.getLastNodeReturned()"})
  void testLinkedListIteratorGetLastNodeReturned_thenThrowIllegalStateException()
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
  @DisplayName("Test LinkedListIterator hasNext(); given CursorableLinkedList() add 'Value'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  void testLinkedListIteratorHasNext_givenCursorableLinkedListAddValue_thenReturnFalse()
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
  @DisplayName("Test LinkedListIterator hasNext(); given CursorableLinkedList() add 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  void testLinkedListIteratorHasNext_givenCursorableLinkedListAddValue_thenReturnTrue()
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
  @DisplayName("Test LinkedListIterator hasPrevious(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasPrevious()"})
  void testLinkedListIteratorHasPrevious_thenReturnFalse() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator hasPrevious(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasPrevious()"})
  void testLinkedListIteratorHasPrevious_thenReturnTrue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator new LinkedListIterator(AbstractLinkedList, int); given 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  void testLinkedListIteratorNewLinkedListIterator_givenValue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator new LinkedListIterator(AbstractLinkedList, int); given 'Value'; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  void testLinkedListIteratorNewLinkedListIterator_givenValue_thenReturnNextIsValue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator new LinkedListIterator(AbstractLinkedList, int); when zero; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  void testLinkedListIteratorNewLinkedListIterator_whenZero_thenReturnNextIsValue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator new LinkedListIterator(AbstractLinkedList, int); when zero; then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedList, int)"})
  void testLinkedListIteratorNewLinkedListIterator_whenZero_thenReturnNotHasNext() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator next(); given CursorableLinkedList() add 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  void testLinkedListIteratorNext_givenCursorableLinkedListAddValue_thenReturnValue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator next(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  void testLinkedListIteratorNext_thenThrowNoSuchElementException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  void testLinkedListIteratorPrevious() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previous()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  void testLinkedListIteratorPrevious2() {
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
  @DisplayName("Test LinkedListIterator previousIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LinkedListIterator.previousIndex()"})
  void testLinkedListIteratorPreviousIndex() {
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
  @DisplayName("Test LinkedListIterator previousIndex(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LinkedListIterator.previousIndex()"})
  void testLinkedListIteratorPreviousIndex_thenReturnZero() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previous(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  void testLinkedListIteratorPrevious_thenThrowNoSuchElementException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator remove(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.remove()"})
  void testLinkedListIteratorRemove_thenThrowIllegalStateException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator set(Object); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.set(Object)"})
  void testLinkedListIteratorSet_thenThrowIllegalStateException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedSubList new LinkedSubList(AbstractLinkedList, int, int); given 'Value'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedSubList.<init>(AbstractLinkedList, int, int)"})
  void testLinkedSubListNewLinkedSubList_givenValue_thenReturnEmpty() {
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
  @DisplayName("Test LinkedSubList new LinkedSubList(AbstractLinkedList, int, int); given 'Value'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedSubList.<init>(AbstractLinkedList, int, int)"})
  void testLinkedSubListNewLinkedSubList_givenValue_thenReturnEmpty2() {
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
  @DisplayName("Test LinkedSubList new LinkedSubList(AbstractLinkedList, int, int); when zero; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedSubList.<init>(AbstractLinkedList, int, int)"})
  void testLinkedSubListNewLinkedSubList_whenZero_thenThrowIllegalArgumentException() {
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
  @DisplayName("Test listIterator(int) with 'int'; given CursorableLinkedList(); when zero; then return Cursor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  void testListIteratorWithInt_givenCursorableLinkedList_whenZero_thenReturnCursor() {
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
  @DisplayName("Test listIterator(int) with 'int'; given NodeCachingLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  void testListIteratorWithInt_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue() {
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
  @DisplayName("Test listIterator(int) with 'int'; then return LinkedListIterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  void testListIteratorWithInt_thenReturnLinkedListIterator() {
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
  @DisplayName("Test listIterator(int) with 'int'; when zero; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator(int)"})
  void testListIteratorWithInt_whenZero_thenReturnNextIsValue() {
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
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return {@link Cursor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  @DisplayName("Test listIterator(); given CursorableLinkedList(); then return Cursor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  void testListIterator_givenCursorableLinkedList_thenReturnCursor() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
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
  @DisplayName("Test listIterator(); given NodeCachingLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  void testListIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue() {
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
  @DisplayName("Test listIterator(); given NodeCachingLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  void testListIterator_givenNodeCachingLinkedListAddValue_thenReturnNextIsValue2() {
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
   * Test {@link AbstractLinkedList#listIterator()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()}.</li>
   *   <li>Then return {@link LinkedListIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#listIterator()}
   */
  @Test
  @DisplayName("Test listIterator(); given NodeCachingLinkedList(); then return LinkedListIterator")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListIterator AbstractLinkedList.listIterator()"})
  void testListIterator_givenNodeCachingLinkedList_thenReturnLinkedListIterator() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof LinkedListIterator);
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
  @DisplayName("Test Node getters and setters; when Node()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Node.<init>(Object)", "void Node.<init>(Node, Node, Object)", "Node Node.getNextNode()",
      "Node Node.getPreviousNode()", "Object Node.getValue()", "void Node.setNextNode(Node)",
      "void Node.setPreviousNode(Node)", "void Node.setValue(Object)"})
  void testNodeGettersAndSetters_whenNode() {
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
  @DisplayName("Test Node getters and setters; when 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Node.<init>(Object)", "void Node.<init>(Node, Node, Object)", "Node Node.getNextNode()",
      "Node Node.getPreviousNode()", "Object Node.getValue()", "void Node.setNextNode(Node)",
      "void Node.setPreviousNode(Node)", "void Node.setValue(Object)"})
  void testNodeGettersAndSetters_whenValue() {
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
  @DisplayName("Test Node new Node()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Node.<init>()"})
  void testNodeNewNode() {
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
  @DisplayName("Test remove(int) with 'index'; then CursorableLinkedList() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.remove(int)"})
  void testRemoveWithIndex_thenCursorableLinkedListEmpty() {
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
  @DisplayName("Test remove(int) with 'index'; then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.remove(int)"})
  void testRemoveWithIndex_thenCursorableLinkedListSizeIsOne() {
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
  @DisplayName("Test remove(Object) with 'value'; given CursorableLinkedList() add 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.remove(Object)"})
  void testRemoveWithValue_givenCursorableLinkedListAddValue_thenReturnTrue() {
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
  @DisplayName("Test remove(Object) with 'value'; given CursorableLinkedList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.remove(Object)"})
  void testRemoveWithValue_givenCursorableLinkedList_thenReturnFalse() {
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
  @DisplayName("Test remove(Object) with 'value'; then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.remove(Object)"})
  void testRemoveWithValue_thenCursorableLinkedListSizeIsOne() {
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
  @DisplayName("Test removeAll(Collection); given CursorableLinkedList() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  void testRemoveAll_givenCursorableLinkedListAdd42_whenArrayListAdd42_thenReturnTrue() {
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
  @DisplayName("Test removeAll(Collection); given CursorableLinkedList(); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  void testRemoveAll_givenCursorableLinkedList_whenArrayList() {
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
  @DisplayName("Test removeAll(Collection); given CursorableLinkedList(); when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  void testRemoveAll_givenCursorableLinkedList_whenArrayListAdd42() {
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
  @DisplayName("Test removeAll(Collection); given CursorableLinkedList(); when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  void testRemoveAll_givenCursorableLinkedList_whenArrayListAdd422() {
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
  @DisplayName("Test removeAll(Collection); then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  void testRemoveAll_thenCursorableLinkedListSizeIsOne() {
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
  @DisplayName("Test removeAll(Collection); then CursorableLinkedList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.removeAll(Collection)"})
  void testRemoveAll_thenCursorableLinkedListSizeIsTwo() {
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
  @DisplayName("Test removeAllNodes(); given CursorableLinkedList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.removeAllNodes()"})
  void testRemoveAllNodes_givenCursorableLinkedList() {
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
  @DisplayName("Test removeAllNodes(); given CursorableLinkedList() add 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.removeAllNodes()"})
  void testRemoveAllNodes_givenCursorableLinkedListAddValue() {
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
  @DisplayName("Test removeAllNodes(); given CursorableLinkedList() add 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.removeAllNodes()"})
  void testRemoveAllNodes_givenCursorableLinkedListAddValue2() {
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
  @DisplayName("Test removeFirst(); given CursorableLinkedList() add 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.removeFirst()"})
  void testRemoveFirst_givenCursorableLinkedListAddValue_thenReturnValue() {
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
  @DisplayName("Test removeFirst(); given CursorableLinkedList(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.removeFirst()"})
  void testRemoveFirst_givenCursorableLinkedList_thenThrowNoSuchElementException() {
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
  @DisplayName("Test removeLast(); given CursorableLinkedList() add 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.removeLast()"})
  void testRemoveLast_givenCursorableLinkedListAddValue_thenReturnValue() {
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
  @DisplayName("Test removeLast(); given CursorableLinkedList(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.removeLast()"})
  void testRemoveLast_givenCursorableLinkedList_thenThrowNoSuchElementException() {
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
  @DisplayName("Test retainAll(Collection); given CursorableLinkedList() add '42'; then CursorableLinkedList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  void testRetainAll_givenCursorableLinkedListAdd42_thenCursorableLinkedListSizeIsOne() {
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
  @DisplayName("Test retainAll(Collection); given CursorableLinkedList() add 'Value'; when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  void testRetainAll_givenCursorableLinkedListAddValue_whenArrayList_thenReturnTrue() {
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
  @DisplayName("Test retainAll(Collection); given CursorableLinkedList() add 'Value'; when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  void testRetainAll_givenCursorableLinkedListAddValue_whenArrayList_thenReturnTrue2() {
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
  @DisplayName("Test retainAll(Collection); given CursorableLinkedList(); then ArrayList() is CursorableLinkedList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  void testRetainAll_givenCursorableLinkedList_thenArrayListIsCursorableLinkedList() {
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
  @DisplayName("Test retainAll(Collection); given CursorableLinkedList(); then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  void testRetainAll_givenCursorableLinkedList_thenArrayListSizeIsOne() {
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
  @DisplayName("Test retainAll(Collection); given CursorableLinkedList(); then ArrayList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLinkedList.retainAll(Collection)"})
  void testRetainAll_givenCursorableLinkedList_thenArrayListSizeIsTwo() {
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
  @DisplayName("Test set(int, Object); given CursorableLinkedList() add 'Value'; when zero; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.set(int, Object)"})
  void testSet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue() {
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
  @DisplayName("Test set(int, Object); given CursorableLinkedList() add 'Value'; when zero; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLinkedList.set(int, Object)"})
  void testSet_givenCursorableLinkedListAddValue_whenZero_thenReturnValue2() {
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
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractLinkedList.size()"})
  void testSize() {
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
  @DisplayName("Test subList(int, int); given CursorableLinkedList() add 'Value'; when one; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.List AbstractLinkedList.subList(int, int)"})
  void testSubList_givenCursorableLinkedListAddValue_whenOne_thenReturnEmpty() {
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
  @DisplayName("Test toArray(Object[]) with 'Object[]'; given CursorableLinkedList() add 'Value'; then first element is 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractLinkedList.toArray(Object[])"})
  void testToArrayWithObject_givenCursorableLinkedListAddValue_thenFirstElementIsArray() {
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
   * Test {@link AbstractLinkedList#toArray()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return first element is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given CursorableLinkedList() add 'Value'; then return first element is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractLinkedList.toArray()"})
  void testToArray_givenCursorableLinkedListAddValue_thenReturnFirstElementIsValue() {
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
   * Test {@link AbstractLinkedList#toArray()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedList#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given CursorableLinkedList(); then return array length is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractLinkedList.toArray()"})
  void testToArray_givenCursorableLinkedList_thenReturnArrayLengthIsZero() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertEquals(0, objectList.toArray().length);
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
  @DisplayName("Test toString(); given CursorableLinkedList() add 'Value'; then return '[Value]'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AbstractLinkedList.toString()"})
  void testToString_givenCursorableLinkedListAddValue_thenReturnValue() {
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
  @DisplayName("Test toString(); given CursorableLinkedList() add 'Value'; then return '[Value, Value]'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AbstractLinkedList.toString()"})
  void testToString_givenCursorableLinkedListAddValue_thenReturnValueValue() {
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
  @DisplayName("Test toString(); then return '[]'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AbstractLinkedList.toString()"})
  void testToString_thenReturnLeftSquareBracketRightSquareBracket() {
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
  @DisplayName("Test updateNode(Node, Object); when Node(); then Node() Value is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLinkedList.updateNode(Node, Object)"})
  void testUpdateNode_whenNode_thenNodeValueIsValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.updateNode(node, "Value");

    // Assert
    assertEquals("Value", node.getValue());
  }
}
