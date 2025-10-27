package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class NodeCachingLinkedListDiffblueTest {
  /**
   * Method under test:
   * {@link NodeCachingLinkedList#addNodeToCache(AbstractLinkedList.Node)}
   */
  @Test
  public void testAddNodeToCache() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();

    // Act
    objectList.addNodeToCache(node);

    // Assert
    assertNull(node.getNextNode());
    assertNull(node.getPreviousNode());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#createNode(Object)}
   */
  @Test
  public void testCreateNode() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    AbstractLinkedList.Node<Object> actualCreateNodeResult = objectList.createNode("Value");

    // Assert
    assertEquals("Value", actualCreateNodeResult.getValue());
    assertNull(actualCreateNodeResult.getNextNode());
    assertNull(actualCreateNodeResult.getPreviousNode());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#createNode(Object)}
   */
  @Test
  public void testCreateNode2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();
    objectList.addNodeToCache(node);

    // Act and Assert
    assertSame(node, objectList.createNode("Value"));
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#getMaximumCacheSize()}
   */
  @Test
  public void testGetMaximumCacheSize() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act and Assert
    assertEquals(20, objectList.getMaximumCacheSize());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#getNodeFromCache()}
   */
  @Test
  public void testGetNodeFromCache() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act and Assert
    assertNull(objectList.getNodeFromCache());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#getNodeFromCache()}
   */
  @Test
  public void testGetNodeFromCache2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    AbstractLinkedList.Node<Object> node = new AbstractLinkedList.Node<>();
    objectList.addNodeToCache(node);

    // Act and Assert
    assertSame(node, objectList.getNodeFromCache());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#isCacheFull()}
   */
  @Test
  public void testIsCacheFull() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act and Assert
    assertFalse(objectList.isCacheFull());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#removeAllNodes()}
   */
  @Test
  public void testRemoveAllNodes() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#removeAllNodes()}
   */
  @Test
  public void testRemoveAllNodes2() {
    // Arrange
    NodeCachingLinkedList<Object> objectList = new NodeCachingLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList()}
   */
  @Test
  public void testNewNodeCachingLinkedList() {
    // Arrange and Act
    NodeCachingLinkedList<Object> actualObjectList = new NodeCachingLinkedList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link NodeCachingLinkedList#NodeCachingLinkedList(int)}
   */
  @Test
  public void testNewNodeCachingLinkedList2() {
    // Arrange and Act
    NodeCachingLinkedList<Object> actualObjectList = new NodeCachingLinkedList<>(3);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}
   */
  @Test
  public void testNewNodeCachingLinkedList3() {
    // Arrange and Act
    NodeCachingLinkedList<Object> actualObjectList = new NodeCachingLinkedList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}
   */
  @Test
  public void testNewNodeCachingLinkedList4() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    NodeCachingLinkedList<Object> actualObjectList = new NodeCachingLinkedList<>(coll);

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test:
   * {@link NodeCachingLinkedList#NodeCachingLinkedList(Collection)}
   */
  @Test
  public void testNewNodeCachingLinkedList5() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new NodeCachingLinkedList<>(coll));
  }
}
