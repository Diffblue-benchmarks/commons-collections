package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class NodeListIteratorDiffblueTest {
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
  @DisplayName("Test new NodeListIterator(Node); when IIOMetadataNode(String) with 'foo'; then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NodeListIterator.<init>(Node)"})
  void testNewNodeListIterator_whenIIOMetadataNodeWithFoo_thenReturnNotHasNext() {
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
  @DisplayName("Test new NodeListIterator(NodeList); when IIOMetadataNode(String) with 'foo'; then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NodeListIterator.<init>(NodeList)"})
  void testNewNodeListIterator_whenIIOMetadataNodeWithFoo_thenReturnNotHasNext2() {
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
  @DisplayName("Test hasNext(); given IIOMetadataNode(String) with 'foo'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean NodeListIterator.hasNext()"})
  void testHasNext_givenIIOMetadataNodeWithFoo_thenReturnFalse() {
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
  @DisplayName("Test hasNext(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean NodeListIterator.hasNext()"})
  void testHasNext_thenReturnTrue() {
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
  @DisplayName("Test next(); given IIOMetadataNode(String) with 'foo'; then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node NodeListIterator.next()"})
  void testNext_givenIIOMetadataNodeWithFoo_thenThrowNoSuchElementException() {
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
  @DisplayName("Test next(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node NodeListIterator.next()"})
  void testNext_thenReturnNull() {
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
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void NodeListIterator.remove()"})
  void testRemove() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> (new NodeListIterator((Node) new IIOMetadataNode("foo"))).remove());
  }
}
