package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.FilterListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.Node;
import org.apache.commons.collections4.list.SetUniqueList.SetListIterator;
import org.apache.commons.collections4.list.SetUniqueList.SetListListIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SetUniqueListDiffblueTest {
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
  @DisplayName("Test SetListIterator new SetListIterator(Iterator, Set); given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListIterator.<init>(Iterator, Set)"})
  void testSetListIteratorNewSetListIterator_given42_whenHashSetAdd42() {
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
  @DisplayName("Test SetListIterator new SetListIterator(Iterator, Set); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListIterator.<init>(Iterator, Set)"})
  void testSetListIteratorNewSetListIterator_givenTwo_whenHashSetAddTwo() {
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
  @DisplayName("Test SetListIterator new SetListIterator(Iterator, Set); when HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListIterator.<init>(Iterator, Set)"})
  void testSetListIteratorNewSetListIterator_whenHashSet() {
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
  @DisplayName("Test SetListIterator next(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object SetListIterator.next()"})
  void testSetListIteratorNext_givenArrayListAdd42_thenReturn42() {
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
  @DisplayName("Test SetListListIterator add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  void testSetListListIteratorAdd() throws IndexOutOfBoundsException {
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
   * Test SetListListIterator {@link SetListListIterator#add(Object)}.
   * <p>
   * Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test SetListListIterator add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  void testSetListListIteratorAdd2() throws IndexOutOfBoundsException {
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
   * <p>
   * Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test SetListListIterator add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  void testSetListListIteratorAdd3() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(
        mock(PredicatedList.class).new PredicatedListIterator(new LinkedListIterator(parent, 1)));
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act
    setListListIterator.add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#add(Object)}.
   * <p>
   * Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test SetListListIterator add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  void testSetListListIteratorAdd4() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(
        mock(PredicatedList.class).new PredicatedListIterator(
            mock(PredicatedList.class).new PredicatedListIterator(new LinkedListIterator(parent, 1))));
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
  @DisplayName("Test SetListListIterator new SetListListIterator(ListIterator, Set); given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  void testSetListListIteratorNewSetListListIterator_given42_whenHashSetAdd42() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetListListIterator<Object> actualSetListListIterator = new SetListListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#SetListListIterator(ListIterator, Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @DisplayName("Test SetListListIterator new SetListListIterator(ListIterator, Set); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  void testSetListListIteratorNewSetListListIterator_givenTwo_whenHashSetAddTwo() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    SetListListIterator<Object> actualSetListListIterator = new SetListListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#SetListListIterator(ListIterator, Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @DisplayName("Test SetListListIterator new SetListListIterator(ListIterator, Set); when HashSet(); then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  void testSetListListIteratorNewSetListListIterator_whenHashSet_thenReturnNotHasNext() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    // Act
    SetListListIterator<Object> actualSetListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
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
  @DisplayName("Test SetListListIterator next(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object SetListListIterator.next()"})
  void testSetListListIteratorNext_thenReturnNull() throws IndexOutOfBoundsException {
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
  @DisplayName("Test SetListListIterator previous(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object SetListListIterator.previous()"})
  void testSetListListIteratorPrevious_thenReturnNull() throws IndexOutOfBoundsException {
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
  @DisplayName("Test SetListListIterator remove(); then calls remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.remove()"})
  void testSetListListIteratorRemove_thenCallsRemove() {
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
  @DisplayName("Test SetListListIterator set(Object); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetListListIterator.set(Object)"})
  void testSetListListIteratorSet_thenThrowUnsupportedOperationException() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());
    SetListListIterator<Object> setListListIterator = new SetListListIterator<>(it, new HashSet<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> setListListIterator.set("Object"));
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
  @DisplayName("Test setUniqueList(List); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  void testSetUniqueList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
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
  @DisplayName("Test setUniqueList(List); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  void testSetUniqueList_given42_whenArrayListAdd42_thenArrayListSizeIsOne2() {
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
  @DisplayName("Test setUniqueList(List); given two; when ArrayList() add two; then ArrayList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  void testSetUniqueList_givenTwo_whenArrayListAddTwo_thenArrayListSizeIsTwo() {
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
  @DisplayName("Test setUniqueList(List); when ArrayList(); then ArrayList() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetUniqueList SetUniqueList.setUniqueList(List)"})
  void testSetUniqueList_whenArrayList_thenArrayListEmpty() {
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
  @DisplayName("Test new SetUniqueList(List, Set); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_given42_whenArrayListAdd42() {
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
  @DisplayName("Test new SetUniqueList(List, Set); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_given42_whenArrayListAdd422() {
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
  @DisplayName("Test new SetUniqueList(List, Set); given '42'; when HashSet() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_given42_whenHashSetAdd42() {
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
  @DisplayName("Test new SetUniqueList(List, Set); given two; when HashSet() add two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_givenTwo_whenHashSetAddTwo() {
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
  @DisplayName("Test new SetUniqueList(List, Set); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, new HashSet<>()));
  }
}
