package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.ListIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractListIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}.
   * <ul>
   *   <li>When {@link EmptyListIterator#EmptyListIterator()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractListIteratorDecorator.<init>(ListIterator)"})
  public void testNewAbstractListIteratorDecorator_whenEmptyListIterator_thenReturnNotHasNext() {
    // Arrange and Act
    AbstractListIteratorDecorator<Object> actualAbstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new EmptyListIterator<>());

    // Assert
    assertFalse(actualAbstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#add(Object)}.
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractListIteratorDecorator.add(Object)"})
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
   * Test {@link AbstractListIteratorDecorator#nextIndex()}.
   * <ul>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractListIteratorDecorator.nextIndex()"})
  public void testNextIndex_thenReturnZero() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new EmptyListIterator<>());

    // Act and Assert
    assertEquals(0, abstractListIteratorDecorator.nextIndex());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#previousIndex()}.
   * <ul>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#previousIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractListIteratorDecorator.previousIndex()"})
  public void testPreviousIndex_thenReturnMinusOne() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new EmptyListIterator<>());

    // Act and Assert
    assertEquals(-1, abstractListIteratorDecorator.previousIndex());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#remove()}.
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayIterator#remove()} does nothing.</li>
   *   <li>Then calls {@link ArrayIterator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractListIteratorDecorator.remove()"})
  public void testRemove_givenArrayListIteratorRemoveDoesNothing_thenCallsRemove() {
    // Arrange
    ArrayListIterator<Object> iterator = mock(ArrayListIterator.class);
    doNothing().when(iterator).remove();
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(iterator);

    // Act
    abstractListIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractListIteratorDecorator#set(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayListIterator#set(Object)} does nothing.</li>
   *   <li>Then calls {@link ArrayListIterator#set(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#set(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractListIteratorDecorator.set(Object)"})
  public void testSet_givenArrayListIteratorSetDoesNothing_thenCallsSet() {
    // Arrange
    ArrayListIterator<Object> iterator = mock(ArrayListIterator.class);
    doNothing().when(iterator).set(Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(iterator);

    // Act
    abstractListIteratorDecorator.set("Obj");

    // Assert
    verify(iterator).set(isA(Object.class));
  }
}
