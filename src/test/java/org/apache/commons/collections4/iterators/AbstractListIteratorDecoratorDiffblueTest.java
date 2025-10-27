package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.ListIterator;
import org.junit.Test;

public class AbstractListIteratorDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractListIteratorDecorator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new LoopingListIterator<>(new ArrayList<>()));

    // Act
    abstractListIteratorDecorator.add("Obj");

    // Assert
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertEquals("Obj", abstractListIteratorDecorator.next());
    assertTrue(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link AbstractListIteratorDecorator#nextIndex()}
   */
  @Test
  public void testNextIndex() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new EmptyListIterator<>());

    // Act and Assert
    assertEquals(0, abstractListIteratorDecorator.nextIndex());
  }

  /**
   * Method under test: {@link AbstractListIteratorDecorator#previousIndex()}
   */
  @Test
  public void testPreviousIndex() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new EmptyListIterator<>());

    // Act and Assert
    assertEquals(-1, abstractListIteratorDecorator.previousIndex());
  }

  /**
   * Method under test:
   * {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   */
  @Test
  public void testNewAbstractListIteratorDecorator() {
    // Arrange and Act
    AbstractListIteratorDecorator<Object> actualAbstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new EmptyListIterator<>());

    // Assert
    assertFalse(actualAbstractListIteratorDecorator.hasNext());
  }
}
