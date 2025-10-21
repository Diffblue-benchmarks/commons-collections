package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NodeListIteratorDiffblueTest {
  /**
   * Test {@link NodeListIterator#NodeListIterator(Node)}.
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code foo}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeListIterator#NodeListIterator(Node)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeListIterator.<init>(Node)"})
  public void testNewNodeListIterator_whenIIOMetadataNodeWithFoo_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse((new NodeListIterator((Node) new IIOMetadataNode("foo"))).hasNext());
  }

  /**
   * Test {@link NodeListIterator#NodeListIterator(NodeList)}.
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code foo}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeListIterator#NodeListIterator(NodeList)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeListIterator.<init>(NodeList)"})
  public void testNewNodeListIterator_whenIIOMetadataNodeWithFoo_thenReturnNotHasNext2() {
    // Arrange, Act and Assert
    assertFalse((new NodeListIterator((NodeList) new IIOMetadataNode("foo"))).hasNext());
  }

  /**
   * Test {@link NodeListIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code foo}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NodeListIterator.hasNext()"})
  public void testHasNext_givenIIOMetadataNodeWithFoo_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new NodeListIterator((Node) new IIOMetadataNode("foo"))).hasNext());
  }

  /**
   * Test {@link NodeListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NodeListIterator.hasNext()"})
  public void testHasNext_thenReturnTrue() {
    // Arrange
    IIOMetadataNode node = new IIOMetadataNode("foo");
    IIOMetadataNode iioMetadataNode = new IIOMetadataNode("foo");
    node.insertBefore(iioMetadataNode, new IIOMetadataNode("foo"));

    // Act and Assert
    assertTrue((new NodeListIterator((Node) node)).hasNext());
  }

  /**
   * Test {@link NodeListIterator#next()}.
   * <ul>
   *   <li>Given {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code foo}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node NodeListIterator.next()"})
  public void testNext_givenIIOMetadataNodeWithFoo_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> (new NodeListIterator((Node) new IIOMetadataNode("foo"))).next());
  }

  /**
   * Test {@link NodeListIterator#next()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NodeListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node NodeListIterator.next()"})
  public void testNext_thenReturnNull() {
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
   * Test {@link NodeListIterator#remove()}.
   * <p>
   * Method under test: {@link NodeListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NodeListIterator.remove()"})
  public void testRemove() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> (new NodeListIterator((Node) new IIOMetadataNode("foo"))).remove());
  }
}
