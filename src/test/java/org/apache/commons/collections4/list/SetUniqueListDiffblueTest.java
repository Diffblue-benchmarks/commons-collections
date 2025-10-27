package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.FilterListIterator;
import org.junit.Test;

public class SetUniqueListDiffblueTest {
  /**
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  public void testNewSetUniqueList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, new HashSet<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link SetUniqueList.SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  public void testSetListIteratorNewSetListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> it = objectList.iterator();

    // Act
    SetUniqueList.SetListIterator<Object> actualSetListIterator = new SetUniqueList.SetListIterator<>(it,
        new HashSet<>());

    // Assert
    assertFalse(actualSetListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link SetUniqueList.SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  public void testSetListIteratorNewSetListIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> it = objectList.iterator();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetUniqueList.SetListIterator<Object> actualSetListIterator = new SetUniqueList.SetListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link SetUniqueList.SetListIterator#SetListIterator(Iterator, Set)}
   */
  @Test
  public void testSetListIteratorNewSetListIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> it = objectList.iterator();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    SetUniqueList.SetListIterator<Object> actualSetListIterator = new SetUniqueList.SetListIterator<>(it, set);

    // Assert
    assertFalse(actualSetListIterator.hasNext());
  }

  /**
   * Method under test: {@link SetUniqueList.SetListIterator#next()}
   */
  @Test
  public void testSetListIteratorNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> it = objectList.iterator();
    SetUniqueList.SetListIterator<Object> setListIterator = new SetUniqueList.SetListIterator<>(it, new HashSet<>());

    // Act and Assert
    assertEquals("42", setListIterator.next());
  }

  /**
   * Method under test:
   * {@link SetUniqueList.SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  public void testSetListListIteratorNewSetListListIterator() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    // Act
    SetUniqueList.SetListListIterator<Object> actualSetListListIterator = new SetUniqueList.SetListListIterator<>(it,
        new HashSet<>());

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link SetUniqueList.SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  public void testSetListListIteratorNewSetListListIterator2() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetUniqueList.SetListListIterator<Object> actualSetListListIterator = new SetUniqueList.SetListListIterator<>(it,
        set);

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Method under test:
   * {@link SetUniqueList.SetListListIterator#SetListListIterator(ListIterator, Set)}
   */
  @Test
  public void testSetListListIteratorNewSetListListIterator3() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    SetUniqueList.SetListListIterator<Object> actualSetListListIterator = new SetUniqueList.SetListListIterator<>(it,
        set);

    // Assert
    assertFalse(actualSetListListIterator.hasNext());
  }

  /**
   * Method under test: {@link SetUniqueList.SetListListIterator#set(Object)}
   */
  @Test
  public void testSetListListIteratorSet() {
    // Arrange
    AbstractListIteratorDecorator<Object> it = new AbstractListIteratorDecorator<>(new FilterListIterator<>());
    SetUniqueList.SetListListIterator<Object> setListListIterator = new SetUniqueList.SetListListIterator<>(it,
        new HashSet<>());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> setListListIterator.set("Object"));
  }

  /**
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  public void testSetUniqueList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertTrue(list.isEmpty());
    assertTrue(actualSetUniqueListResult.isEmpty());
  }

  /**
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  public void testSetUniqueList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(1, actualSetUniqueListResult.size());
    assertEquals("42", actualSetUniqueListResult.get(0));
  }

  /**
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  public void testSetUniqueList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    SetUniqueList<Object> actualSetUniqueListResult = SetUniqueList.setUniqueList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals(1, actualSetUniqueListResult.size());
    assertEquals("42", actualSetUniqueListResult.get(0));
  }

  /**
   * Method under test: {@link SetUniqueList#setUniqueList(List)}
   */
  @Test
  public void testSetUniqueList4() {
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
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  public void testNewSetUniqueList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, new HashSet<>());

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  public void testNewSetUniqueList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new SetUniqueList<>(list, new HashSet<>()));
  }

  /**
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  public void testNewSetUniqueList4() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, set);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link SetUniqueList#SetUniqueList(List, Set)}
   */
  @Test
  public void testNewSetUniqueList5() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    SetUniqueList<Object> actualObjectList = new SetUniqueList<>(list, set);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }
}
