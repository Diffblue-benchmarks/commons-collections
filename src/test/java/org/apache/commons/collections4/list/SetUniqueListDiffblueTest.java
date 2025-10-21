package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.Node;
import org.apache.commons.collections4.list.SetUniqueList.SetListIterator;
import org.apache.commons.collections4.list.SetUniqueList.SetListListIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class SetUniqueListDiffblueTest {
  /**
   * Test SetListIterator {@link SetListIterator#SetListIterator(Iterator, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListIterator.<init>(Iterator, Set)"})
  public void testSetListIteratorNewSetListIterator_given42_whenHashSetAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> it = objectList.iterator();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetListIterator<Object> actualSetListIterator = new SetListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListIterator.hasNext());
  }

  /**
   * Test SetListIterator {@link SetListIterator#SetListIterator(Iterator, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListIterator.<init>(Iterator, Set)"})
  public void testSetListIteratorNewSetListIterator_givenTwo_whenHashSetAddTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> it = objectList.iterator();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    SetListIterator<Object> actualSetListIterator = new SetListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListIterator.hasNext());
  }

  /**
   * Test SetListIterator {@link SetListIterator#SetListIterator(Iterator, Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListIterator.<init>(Iterator, Set)"})
  public void testSetListIteratorNewSetListIterator_whenHashSet() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> it = objectList.iterator();

    // Act
    SetListIterator<Object> actualSetListIterator = new SetListIterator<>(it, new HashSet<>());

    // Assert
    assertFalse(actualSetListIterator.hasNext());
  }

  /**
   * Test SetListIterator {@link SetListIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SetListIterator.next()"})
  public void testSetListIteratorNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> it = objectList.iterator();
    SetListIterator<Object> setListIterator = new SetListIterator<>(it, new HashSet<>());

    // Act and Assert
    assertEquals("42", setListIterator.next());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#add(Object)}.
   * <p>
   * Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  public void testSetListListIteratorAdd() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));

    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());
    setListListIterator.add("Object");

    // Act
    setListListIterator.add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#add(Object)}.
   * <ul>
   *   <li>Then calls {@link AbstractLinkedListJava21#addNodeBefore(Node, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  public void testSetListListIteratorAdd_thenCallsAddNodeBefore() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act
    setListListIterator.add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#SetListListIterator(ListIterator, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  public void testSetListListIteratorNewSetListListIterator_given42_whenHashSetAdd42()
      throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetListListIterator<Object> actualSetListListIterator = new SetListListIterator<>(it, set);

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertTrue(actualSetListListIterator.hasNext());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#SetListListIterator(ListIterator, Set)}.
   * <ul>
   *   <li>Given {@link Node#Node()}.</li>
   *   <li>Then return next is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  public void testSetListListIteratorNewSetListListIterator_givenNode_thenReturnNextIsNull()
      throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));

    // Act
    SetListListIterator<Object> actualSetListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertNull(actualSetListListIterator.next());
    assertTrue(actualSetListListIterator.hasNext());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#next()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SetListListIterator.next()"})
  public void testSetListListIteratorNext_thenReturnNull() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act
    Object actualNextResult = setListListIterator.next();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualNextResult);
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#previous()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SetListListIterator.previous()"})
  public void testSetListListIteratorPrevious_thenReturnNull() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act
    Object actualPreviousResult = setListListIterator.previous();

    // Assert
    verify(parent).getNode(eq(1), eq(true));
    assertNull(actualPreviousResult);
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#remove()}.
   * <ul>
   *   <li>Then calls {@link AbstractLinkedList.LinkedListIterator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListListIterator.remove()"})
  public void testSetListListIteratorRemove_thenCallsRemove() {
    // Arrange
    AbstractLinkedList.LinkedListIterator<Object> iterator = mock(AbstractLinkedList.LinkedListIterator.class);
    doNothing().when(iterator).remove();
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(iterator);
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act
    setListListIterator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#set(Object)}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetListListIterator.set(Object)"})
  public void testSetListListIteratorSet_thenThrowUnsupportedOperationException() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21<Object> parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node<>());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> setListListIterator.set("Object"));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test {@link SetUniqueList#setUniqueList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  public void testSetUniqueList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(list, actualSetUniqueListResult);
  }

  /**
   * Test {@link SetUniqueList#setUniqueList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  public void testSetUniqueList_given42_whenArrayListAdd42_thenArrayListSizeIsOne2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(list, actualSetUniqueListResult);
  }

  /**
   * Test {@link SetUniqueList#setUniqueList(List)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  public void testSetUniqueList_givenTwo_whenArrayListAddTwo_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add(2);
    list.add("42");

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertEquals(2, list.size());
    assertEquals(list, actualSetUniqueListResult);
  }

  /**
   * Test {@link SetUniqueList#setUniqueList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  public void testSetUniqueList_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertTrue(list.isEmpty());
    assertEquals(list, actualSetUniqueListResult);
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  public void testNewSetUniqueList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, new HashSet<>()));
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  public void testNewSetUniqueList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, new HashSet<>()));
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  public void testNewSetUniqueList_given42_whenHashSetAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, set));
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  public void testNewSetUniqueList_givenTwo_whenHashSetAddTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, set));
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  public void testNewSetUniqueList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, new HashSet<>()));
  }
}
