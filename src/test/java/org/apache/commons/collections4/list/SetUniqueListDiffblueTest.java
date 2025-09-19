package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.FilterListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator;
import org.apache.commons.collections4.list.SetUniqueList.SetListIterator;
import org.apache.commons.collections4.list.SetUniqueList.SetListListIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SetUniqueListDiffblueTest {
  /**
   * Test SetListIterator {@link SetListIterator#SetListIterator(Iterator, Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  @DisplayName(
      "Test SetListIterator new SetListIterator(Iterator, Set); given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   * </ul>
   *
   * <p>Method under test: {@link SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  @DisplayName(
      "Test SetListIterator new SetListIterator(Iterator, Set); given two; when HashSet() add two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  @DisplayName("Test SetListIterator new SetListIterator(Iterator, Set); when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SetListIterator#next()}
   */
  @Test
  @DisplayName("Test SetListIterator next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <p>Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test SetListListIterator add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  void testSetListListIteratorAdd() {
    // Arrange
    LinkedListIterator<Object> iterator = mock(LinkedListIterator.class);
    doNothing().when(iterator).add(Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(iterator);

    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it, new HashSet<>());
    setListListIterator.add("Object");

    // Act
    setListListIterator.add("Object");

    // Assert
    verify(iterator).add(isA(Object.class));
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link LinkedListIterator} {@link LinkedListIterator#add(Object)} does nothing.
   *   <li>Then calls {@link LinkedListIterator#add(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#add(Object)}
   */
  @Test
  @DisplayName(
      "Test SetListListIterator add(Object); given LinkedListIterator add(Object) does nothing; then calls add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.add(Object)"})
  void testSetListListIteratorAdd_givenLinkedListIteratorAddDoesNothing_thenCallsAdd() {
    // Arrange
    LinkedListIterator<Object> iterator = mock(LinkedListIterator.class);
    doNothing().when(iterator).add(Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(iterator);
    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it, new HashSet<>());

    // Act
    setListListIterator.add("Object");

    // Assert
    verify(iterator).add(isA(Object.class));
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#SetListListIterator(ListIterator, Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @DisplayName(
      "Test SetListListIterator new SetListListIterator(ListIterator, Set); given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  void testSetListListIteratorNewSetListListIterator_given42_whenHashSetAdd42() {
    // Arrange
    AbstractListIteratorDecorator<Object> it =
        new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetListListIterator<Object> actualSetListListIterator = new SetListListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#SetListListIterator(ListIterator, Set)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @DisplayName(
      "Test SetListListIterator new SetListListIterator(ListIterator, Set); given two; when HashSet() add two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  void testSetListListIteratorNewSetListListIterator_givenTwo_whenHashSetAddTwo() {
    // Arrange
    AbstractListIteratorDecorator<Object> it =
        new AbstractListIteratorDecorator<>(new FilterListIterator<>());

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
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  @DisplayName(
      "Test SetListListIterator new SetListListIterator(ListIterator, Set); when HashSet(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.<init>(ListIterator, Set)"})
  void testSetListListIteratorNewSetListListIterator_whenHashSet_thenReturnNotHasNext() {
    // Arrange
    AbstractListIteratorDecorator<Object> it =
        new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    // Act
    SetListListIterator<Object> actualSetListListIterator =
        new SetListListIterator<>(it, new HashSet<>());

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link LinkedListIterator} {@link LinkedListIterator#next()} return {@code Next}.
   *   <li>Then return {@code Next}.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#next()}
   */
  @Test
  @DisplayName(
      "Test SetListListIterator next(); given LinkedListIterator next() return 'Next'; then return 'Next'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SetListListIterator.next()"})
  void testSetListListIteratorNext_givenLinkedListIteratorNextReturnNext_thenReturnNext() {
    // Arrange
    LinkedListIterator<Object> iterator = mock(LinkedListIterator.class);
    when(iterator.next()).thenReturn("Next");
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(iterator);
    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it, new HashSet<>());

    // Act
    Object actualNextResult = setListListIterator.next();

    // Assert
    verify(iterator).next();
    assertEquals("Next", actualNextResult);
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#previous()}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#previous()}
   */
  @Test
  @DisplayName("Test SetListListIterator previous(); then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SetListListIterator.previous()"})
  void testSetListListIteratorPrevious_thenReturnValue() throws IndexOutOfBoundsException {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    AbstractListIteratorDecorator<Object> it =
        new AbstractListIteratorDecorator<>(new LinkedListIterator<>(parent, 1));
    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it, new HashSet<>());

    // Act and Assert
    assertEquals("Value", setListListIterator.previous());
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#remove()}.
   *
   * <p>Method under test: {@link SetListListIterator#remove()}
   */
  @Test
  @DisplayName("Test SetListListIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.remove()"})
  void testSetListListIteratorRemove() {
    // Arrange
    LinkedListIterator<Object> iterator = mock(LinkedListIterator.class);
    doNothing().when(iterator).remove();
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(iterator);
    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it, new HashSet<>());

    // Act
    setListListIterator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#remove()}.
   *
   * <p>Method under test: {@link SetListListIterator#remove()}
   */
  @Test
  @DisplayName("Test SetListListIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.remove()"})
  void testSetListListIteratorRemove2() {
    // Arrange
    LinkedListIterator<Object> it = mock(LinkedListIterator.class);
    doNothing().when(it).remove();
    SetListListIterator<Object> it2 = new SetListListIterator<>(it, new HashSet<>());
    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it2, new HashSet<>());

    // Act
    setListListIterator.remove();

    // Assert
    verify(it).remove();
  }

  /**
   * Test SetListListIterator {@link SetListListIterator#set(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link SetListListIterator#set(Object)}
   */
  @Test
  @DisplayName("Test SetListListIterator set(Object); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetListListIterator.set(Object)"})
  void testSetListListIteratorSet_thenThrowUnsupportedOperationException() {
    // Arrange
    AbstractListIteratorDecorator<Object> it =
        new AbstractListIteratorDecorator<>(new FilterListIterator<>());
    SetListListIterator<Object> setListListIterator =
        new SetListListIterator<>(it, new HashSet<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> setListListIterator.set("Object"));
  }

  /**
   * Test {@link SetUniqueList#setUniqueList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @DisplayName(
      "Test setUniqueList(List); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @DisplayName(
      "Test setUniqueList(List); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @DisplayName(
      "Test setUniqueList(List); given two; when ArrayList() add two; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  @DisplayName("Test setUniqueList(List); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @DisplayName("Test new SetUniqueList(List, Set); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, new HashSet<>());

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @DisplayName("Test new SetUniqueList(List, Set); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, new HashSet<>());

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @DisplayName("Test new SetUniqueList(List, Set); given '42'; when HashSet() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_given42_whenHashSetAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, set);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @DisplayName("Test new SetUniqueList(List, Set); given two; when HashSet() add two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_givenTwo_whenHashSetAddTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, set);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link SetUniqueList#SetUniqueList(List, Set)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  @DisplayName("Test new SetUniqueList(List, Set); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SetUniqueList.<init>(List, Set)"})
  void testNewSetUniqueList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, new HashSet<>());

    // Assert
    assertEquals(list, actualObjectList);
  }
}
