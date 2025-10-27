package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class AbstractLinkedListJava21DiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLinkedListJava21.Node#Node(Object)}
   *   <li>
   * {@link AbstractLinkedListJava21.Node#setNextNode(AbstractLinkedListJava21.Node)}
   *   <li>
   * {@link AbstractLinkedListJava21.Node#setPreviousNode(AbstractLinkedListJava21.Node)}
   *   <li>{@link AbstractLinkedListJava21.Node#setValue(Object)}
   *   <li>{@link AbstractLinkedListJava21.Node#getNextNode()}
   *   <li>{@link AbstractLinkedListJava21.Node#getPreviousNode()}
   *   <li>{@link AbstractLinkedListJava21.Node#getValue()}
   * </ul>
   */
  @Test
  public void testNodeGettersAndSetters() {
    // Arrange and Act
    AbstractLinkedListJava21.Node<Object> actualNode = new AbstractLinkedListJava21.Node<>("Value");
    AbstractLinkedListJava21.Node<Object> next = new AbstractLinkedListJava21.Node<>();
    actualNode.setNextNode(next);
    AbstractLinkedListJava21.Node<Object> previous = new AbstractLinkedListJava21.Node<>();
    actualNode.setPreviousNode(previous);
    actualNode.setValue("Value");
    AbstractLinkedListJava21.Node<Object> actualNextNode = actualNode.getNextNode();
    AbstractLinkedListJava21.Node<Object> actualPreviousNode = actualNode.getPreviousNode();

    // Assert that nothing has changed
    assertEquals("Value", actualNode.getValue());
    assertSame(next, actualNextNode);
    assertSame(previous, actualPreviousNode);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link AbstractLinkedListJava21.Node#Node(AbstractLinkedListJava21.Node, AbstractLinkedListJava21.Node, Object)}
   *   <li>
   * {@link AbstractLinkedListJava21.Node#setNextNode(AbstractLinkedListJava21.Node)}
   *   <li>
   * {@link AbstractLinkedListJava21.Node#setPreviousNode(AbstractLinkedListJava21.Node)}
   *   <li>{@link AbstractLinkedListJava21.Node#setValue(Object)}
   *   <li>{@link AbstractLinkedListJava21.Node#getNextNode()}
   *   <li>{@link AbstractLinkedListJava21.Node#getPreviousNode()}
   *   <li>{@link AbstractLinkedListJava21.Node#getValue()}
   * </ul>
   */
  @Test
  public void testNodeGettersAndSetters2() {
    // Arrange
    AbstractLinkedListJava21.Node<Object> previous = new AbstractLinkedListJava21.Node<>();

    // Act
    AbstractLinkedListJava21.Node<Object> actualNode = new AbstractLinkedListJava21.Node<>(previous,
        new AbstractLinkedListJava21.Node<>(), "Value");
    AbstractLinkedListJava21.Node<Object> next = new AbstractLinkedListJava21.Node<>();
    actualNode.setNextNode(next);
    AbstractLinkedListJava21.Node<Object> previous2 = new AbstractLinkedListJava21.Node<>();
    actualNode.setPreviousNode(previous2);
    actualNode.setValue("Value");
    AbstractLinkedListJava21.Node<Object> actualNextNode = actualNode.getNextNode();
    AbstractLinkedListJava21.Node<Object> actualPreviousNode = actualNode.getPreviousNode();

    // Assert that nothing has changed
    assertEquals("Value", actualNode.getValue());
    assertSame(next, actualNextNode);
    assertSame(previous2, actualPreviousNode);
  }

  /**
   * Method under test: {@link AbstractLinkedListJava21.Node#Node()}
   */
  @Test
  public void testNodeNewNode() {
    // Arrange and Act
    AbstractLinkedListJava21.Node<Object> actualNode = new AbstractLinkedListJava21.Node<>();

    // Assert
    assertNull(actualNode.getValue());
    assertSame(actualNode, actualNode.getNextNode());
    assertSame(actualNode, actualNode.getPreviousNode());
  }
}
