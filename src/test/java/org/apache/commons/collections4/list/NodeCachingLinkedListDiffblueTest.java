package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.list.AbstractLinkedList.Node;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NodeCachingLinkedListDiffblueTest {
  /**
   * Test {@link NodeCachingLinkedList#NodeCachingLinkedList()}.
   * <p>
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.<init>()"})
  public void testNewNodeCachingLinkedList() {
    // Arrange and Act
    NodeCachingLinkedList<Object> actualObjectList = new NodeCachingLinkedList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link NodeCachingLinkedList#NodeCachingLinkedList(int)}.
   * <p>
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.<init>(int)"})
  public void testNewNodeCachingLinkedList2() {
    // Arrange and Act
    NodeCachingLinkedList<Object> actualObjectList = new NodeCachingLinkedList<>(3);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.<init>(Collection)"})
  public void testNewNodeCachingLinkedList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new NodeCachingLinkedList<>(coll));
  }

  /**
   * Test {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.<init>(Collection)"})
  public void testNewNodeCachingLinkedList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new NodeCachingLinkedList<>(coll));
  }

  /**
   * Test {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.<init>(Collection)"})
  public void testNewNodeCachingLinkedList_whenArrayList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertEquals(coll, new NodeCachingLinkedList<>(coll));
  }

  /**
   * Test {@link NodeCachingLinkedList#addNodeToCache(Node)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} NextNode is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#addNodeToCache(Node)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.addNodeToCache(Node)"})
  public void testAddNodeToCache_whenNode_thenNodeNextNodeIsNull() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.addNodeToCache(node);

    // Assert
    assertNull(node.getNextNode());
    assertNull(node.getPreviousNode());
  }

  /**
   * Test {@link NodeCachingLinkedList#createNode(Object)}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} addNodeToCache {@link Node#Node()}.</li>
   *   <li>Then return {@link Node#Node()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#createNode(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node NodeCachingLinkedList.createNode(Object)"})
  public void testCreateNode_givenNodeCachingLinkedListAddNodeToCacheNode_thenReturnNode() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    Node<Object> node = new Node<>();
    objectList.addNodeToCache(node);

    // Act and Assert
    assertSame(node, objectList.createNode("Value"));
  }

  /**
   * Test {@link NodeCachingLinkedList#createNode(Object)}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#createNode(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node NodeCachingLinkedList.createNode(Object)"})
  public void testCreateNode_givenNodeCachingLinkedList_thenReturnValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    Node<Object> actualCreateNodeResult = objectList.createNode("Value");

    // Assert
    assertEquals("Value", actualCreateNodeResult.getValue());
    assertNull(actualCreateNodeResult.getNextNode());
    assertNull(actualCreateNodeResult.getPreviousNode());
  }

  /**
   * Test {@link NodeCachingLinkedList#getMaximumCacheSize()}.
   * <p>
   * Method under test: {@link NodeCachingLinkedList#getMaximumCacheSize()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int NodeCachingLinkedList.getMaximumCacheSize()"})
  public void testGetMaximumCacheSize() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act and Assert
    assertEquals(20, objectList.getMaximumCacheSize());
  }

  /**
   * Test {@link NodeCachingLinkedList#getNodeFromCache()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} addNodeToCache {@link Node#Node()}.</li>
   *   <li>Then return {@link Node#Node()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#getNodeFromCache()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node NodeCachingLinkedList.getNodeFromCache()"})
  public void testGetNodeFromCache_givenNodeCachingLinkedListAddNodeToCacheNode_thenReturnNode() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    Node<Object> node = new Node<>();
    objectList.addNodeToCache(node);

    // Act and Assert
    assertSame(node, objectList.getNodeFromCache());
  }

  /**
   * Test {@link NodeCachingLinkedList#getNodeFromCache()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#getNodeFromCache()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node NodeCachingLinkedList.getNodeFromCache()"})
  public void testGetNodeFromCache_givenNodeCachingLinkedList_thenReturnNull() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act and Assert
    assertNull(objectList.getNodeFromCache());
  }

  /**
   * Test {@link NodeCachingLinkedList#isCacheFull()}.
   * <p>
   * Method under test: {@link NodeCachingLinkedList#isCacheFull()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NodeCachingLinkedList.isCacheFull()"})
  public void testIsCacheFull() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act and Assert
    assertFalse(objectList.isCacheFull());
  }

  /**
   * Test {@link NodeCachingLinkedList#removeAllNodes()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenNodeCachingLinkedList() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    objectList.removeAllNodes();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link NodeCachingLinkedList#removeAllNodes()}.
   * <ul>
   *   <li>Given {@link NodeCachingLinkedList#NodeCachingLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeCachingLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeCachingLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenNodeCachingLinkedListAddValue() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }
}
