package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.NoSuchElementException;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NodeListIteratorDiffblueTest {
  /**
   * Method under test: {@link NodeListIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange, Act and Assert
    assertFalse((new NodeListIterator((Node) new IIOMetadataNode("foo"))).hasNext());
  }

  /**
   * Method under test: {@link NodeListIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    IIOMetadataNode node = new IIOMetadataNode("foo");
    IIOMetadataNode iioMetadataNode = new IIOMetadataNode("foo");
    node.insertBefore(iioMetadataNode, new IIOMetadataNode("foo"));

    // Act and Assert
    assertTrue((new NodeListIterator((Node) node)).hasNext());
  }

  /**
   * Method under test: {@link NodeListIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> (new NodeListIterator((Node) new IIOMetadataNode("foo"))).next());
  }

  /**
   * Method under test: {@link NodeListIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    IIOMetadataNode node = new IIOMetadataNode("foo");
    IIOMetadataNode iioMetadataNode = new IIOMetadataNode("underlying nodeList has no more elements");
    node.insertBefore(iioMetadataNode, new IIOMetadataNode("underlying nodeList has no more elements"));
    NodeListIterator nodeListIterator = new NodeListIterator((Node) node);

    // Act and Assert
    assertNull(nodeListIterator.next());
    assertFalse(nodeListIterator.hasNext());
  }

  /**
   * Method under test: {@link NodeListIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> (new NodeListIterator((Node) new IIOMetadataNode("foo"))).remove());
  }

  /**
   * Method under test: {@link NodeListIterator#NodeListIterator(Node)}
   */
  @Test
  public void testNewNodeListIterator() {
    // Arrange, Act and Assert
    assertFalse((new NodeListIterator((Node) new IIOMetadataNode("foo"))).hasNext());
    assertFalse((new NodeListIterator((NodeList) new IIOMetadataNode("foo"))).hasNext());
  }
}
