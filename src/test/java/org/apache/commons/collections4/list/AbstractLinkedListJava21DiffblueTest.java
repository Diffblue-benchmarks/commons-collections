package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractLinkedListJava21DiffblueTest {
  /**
   * Test LinkedListIterator {@link LinkedListIterator#add(Object)}.
   * <p>
   * Method under test: {@link LinkedListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test LinkedListIterator add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.add(Object)"})
  void testLinkedListIteratorAdd() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator add(Object); then throw ConcurrentModificationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.add(Object)"})
  void testLinkedListIteratorAdd_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator checkModCount()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.checkModCount()"})
  void testLinkedListIteratorCheckModCount() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator checkModCount(); then throw ConcurrentModificationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.checkModCount()"})
  void testLinkedListIteratorCheckModCount_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator getLastNodeReturned()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Node LinkedListIterator.getLastNodeReturned()"})
  void testLinkedListIteratorGetLastNodeReturned() throws IllegalStateException, IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  void testLinkedListIteratorHasNext_thenReturnFalse() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator hasNext(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasNext()"})
  void testLinkedListIteratorHasNext_thenReturnTrue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator hasPrevious(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasPrevious()"})
  void testLinkedListIteratorHasPrevious_thenReturnFalse() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator hasPrevious(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LinkedListIterator.hasPrevious()"})
  void testLinkedListIteratorHasPrevious_thenReturnTrue() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator new LinkedListIterator(AbstractLinkedListJava21, int)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedListJava21, int)"})
  void testLinkedListIteratorNewLinkedListIterator() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator new LinkedListIterator(AbstractLinkedListJava21, int); given Node(); then return next is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.<init>(AbstractLinkedListJava21, int)"})
  void testLinkedListIteratorNewLinkedListIterator_givenNode_thenReturnNextIsNull() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator next(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  void testLinkedListIteratorNext_thenReturnNull() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator next(); then throw ConcurrentModificationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  void testLinkedListIteratorNext_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator next(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.next()"})
  void testLinkedListIteratorNext_thenThrowNoSuchElementException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previousIndex()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LinkedListIterator.previousIndex()"})
  void testLinkedListIteratorPreviousIndex() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previous(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  void testLinkedListIteratorPrevious_thenReturnNull() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previous(); then throw ConcurrentModificationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  void testLinkedListIteratorPrevious_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator previous(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedListIterator.previous()"})
  void testLinkedListIteratorPrevious_thenThrowNoSuchElementException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator remove(); then throw ConcurrentModificationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.remove()"})
  void testLinkedListIteratorRemove_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator remove(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.remove()"})
  void testLinkedListIteratorRemove_thenThrowIllegalStateException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator set(Object); then throw ConcurrentModificationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.set(Object)"})
  void testLinkedListIteratorSet_thenThrowConcurrentModificationException() throws IndexOutOfBoundsException {
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
  @DisplayName("Test LinkedListIterator set(Object); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedListIterator.set(Object)"})
  void testLinkedListIteratorSet_thenThrowIllegalStateException() throws IndexOutOfBoundsException {
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
}
