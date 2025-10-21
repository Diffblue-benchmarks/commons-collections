package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.Node;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractLinkedListJava21DiffblueTest {
  /**
   * Test LinkedListIterator {@link LinkedListIterator#add(Object)}.
   * <p>
   * Method under test: {@link LinkedListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.add(Object)"})
  public void testLinkedListIteratorAdd() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    linkedListIterator.add("Obj");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#add(Object)}.
   * <ul>
   *   <li>Then throw {@link ConcurrentModificationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.add(Object)"})
  public void testLinkedListIteratorAdd_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());

    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);
    linkedListIterator.add("Obj");

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> linkedListIterator.add("Obj"));
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#checkModCount()}.
   * <p>
   * Method under test: {@link LinkedListIterator#checkModCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.checkModCount()"})
  public void testLinkedListIteratorCheckModCount() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    linkedListIterator.checkModCount();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#checkModCount()}.
   * <ul>
   *   <li>Then throw {@link ConcurrentModificationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#checkModCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.checkModCount()"})
  public void testLinkedListIteratorCheckModCount_thenThrowConcurrentModificationException()
      throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());

    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);
    linkedListIterator.add("Obj");

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> linkedListIterator.checkModCount());
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#getLastNodeReturned()}.
   * <p>
   * Method under test: {@link LinkedListIterator#getLastNodeReturned()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Node LinkedListIterator.getLastNodeReturned()"})
  public void testLinkedListIteratorGetLastNodeReturned() throws IllegalStateException, IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.getLastNodeReturned());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  public void testLinkedListIteratorHasNext_thenReturnFalse() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(null);
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    boolean actualHasNextResult = linkedListIterator.hasNext();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertFalse(actualHasNextResult);
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  public void testLinkedListIteratorHasNext_thenReturnTrue() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    boolean actualHasNextResult = linkedListIterator.hasNext();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertTrue(actualHasNextResult);
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
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>("Value"));
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    boolean actualHasPreviousResult = linkedListIterator.hasPrevious();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertFalse(actualHasPreviousResult);
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
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    boolean actualHasPreviousResult = linkedListIterator.hasPrevious();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertTrue(actualHasPreviousResult);
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#LinkedListIterator(AbstractLinkedListJava21, int)}.
   * <p>
   * Method under test: {@link LinkedListIterator#LinkedListIterator(AbstractLinkedListJava21, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedListJava21, int)"})
  public void testLinkedListIteratorNewLinkedListIterator() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenThrow(new ConcurrentModificationException("foo"));

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> new LinkedListIterator<>(parent, 1));

    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#LinkedListIterator(AbstractLinkedListJava21, int)}.
   * <ul>
   *   <li>Given {@link Node#Node()}.</li>
   *   <li>Then return next is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#LinkedListIterator(AbstractLinkedListJava21, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedListJava21, int)"})
  public void testLinkedListIteratorNewLinkedListIterator_givenNode_thenReturnNextIsNull()
      throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());

    // Act
    LinkedListIterator<Object> actualLinkedListIterator = new LinkedListIterator<>(parent, 1);

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertNull(actualLinkedListIterator.next());
    assertTrue(actualLinkedListIterator.hasNext());
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#next()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  public void testLinkedListIteratorNext_thenReturnNull() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    Object actualNextResult = linkedListIterator.next();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualNextResult);
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#next()}.
   * <ul>
   *   <li>Then throw {@link ConcurrentModificationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  public void testLinkedListIteratorNext_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());

    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);
    linkedListIterator.add("Obj");

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> linkedListIterator.next());
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
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
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(null);
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkedListIterator.next());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previousIndex()}.
   * <p>
   * Method under test: {@link LinkedListIterator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LinkedListIterator.previousIndex()"})
  public void testLinkedListIteratorPreviousIndex() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    int actualPreviousIndexResult = linkedListIterator.previousIndex();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertEquals(0, actualPreviousIndexResult);
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previous()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  public void testLinkedListIteratorPrevious_thenReturnNull() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act
    Object actualPreviousResult = linkedListIterator.previous();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualPreviousResult);
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#previous()}.
   * <ul>
   *   <li>Then throw {@link ConcurrentModificationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  public void testLinkedListIteratorPrevious_thenThrowConcurrentModificationException()
      throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());

    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);
    linkedListIterator.add("Obj");

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> linkedListIterator.previous());
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
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
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>("Value"));
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkedListIterator.previous());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#remove()}.
   * <ul>
   *   <li>Then throw {@link ConcurrentModificationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.remove()"})
  public void testLinkedListIteratorRemove_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());

    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);
    linkedListIterator.add("Obj");

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> linkedListIterator.remove());
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
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
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.remove());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test LinkedListIterator {@link LinkedListIterator#set(Object)}.
   * <ul>
   *   <li>Then throw {@link ConcurrentModificationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedListIterator.set(Object)"})
  public void testLinkedListIteratorSet_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());

    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);
    linkedListIterator.add("Obj");

    // Act and Assert
    assertThrows(ConcurrentModificationException.class, () -> linkedListIterator.set("Obj"));
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
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
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    LinkedListIterator<Object> linkedListIterator = new LinkedListIterator<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkedListIterator.set("Obj"));
    verify(parent).getNode(eq(1), eq(true));
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
}
