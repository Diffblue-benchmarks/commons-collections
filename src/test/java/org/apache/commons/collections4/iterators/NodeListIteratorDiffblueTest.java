package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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
   *
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link NodeListIterator#NodeListIterator(Node)}
   */
  @Test
  @DisplayName("Test new NodeListIterator(Node); when IIOMetadataNode(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NodeListIterator.<init>(Node)"})
  void testNewNodeListIterator_whenIIOMetadataNode_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(new NodeListIterator((Node) new IIOMetadataNode()).hasNext());
  }

  /**
   * Test {@link NodeListIterator#NodeListIterator(NodeList)}.
   *
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link NodeListIterator#NodeListIterator(NodeList)}
   */
  @Test
  @DisplayName(
      "Test new NodeListIterator(NodeList); when IIOMetadataNode(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NodeListIterator.<init>(NodeList)"})
  void testNewNodeListIterator_whenIIOMetadataNode_thenReturnNotHasNext2() {
    // Arrange, Act and Assert
    assertFalse(new NodeListIterator((NodeList) new IIOMetadataNode()).hasNext());
  }

  /**
   * Test {@link NodeListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NodeListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NodeListIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new NodeListIterator((Node) new IIOMetadataNode()).hasNext());
  }

  /**
   * Test {@link NodeListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NodeListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NodeListIterator.hasNext()"})
  void testHasNext_thenReturnTrue() {
    // Arrange
    IIOMetadataNode node = new IIOMetadataNode();
    IIOMetadataNode iioMetadataNode = new IIOMetadataNode();
    node.insertBefore(iioMetadataNode, new IIOMetadataNode());

    // Act and Assert
    assertTrue(new NodeListIterator((Node) node).hasNext());
  }

  /**
   * Test {@link NodeListIterator#next()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link NodeListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node NodeListIterator.next()"})
  void testNext_thenReturnNull() {
    // Arrange
    IIOMetadataNode node = new IIOMetadataNode();
    IIOMetadataNode iioMetadataNode = new IIOMetadataNode();
    node.insertBefore(iioMetadataNode, new IIOMetadataNode());
    NodeListIterator nodeListIterator = new NodeListIterator((Node) node);

    // Act and Assert
    assertNull(nodeListIterator.next());
    assertFalse(nodeListIterator.hasNext());
  }

  /**
   * Test {@link NodeListIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link NodeListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Node NodeListIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> new NodeListIterator((Node) new IIOMetadataNode()).next());
  }

  /**
   * Test {@link NodeListIterator#remove()}.
   *
   * <p>Method under test: {@link NodeListIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NodeListIterator.remove()"})
  void testRemove() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new NodeListIterator((Node) new IIOMetadataNode()).remove());
  }
}
