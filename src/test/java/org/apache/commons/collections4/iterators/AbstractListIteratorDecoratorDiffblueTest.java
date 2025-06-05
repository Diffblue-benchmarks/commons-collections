package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractListIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractListIteratorDecorator#add(Object)}.
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractListIteratorDecorator.add(Object)"})
  void testAdd() {
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
   * Test {@link AbstractListIteratorDecorator#remove()}.
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayIterator#remove()} does nothing.</li>
   *   <li>Then calls {@link ArrayIterator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given ArrayListIterator remove() does nothing; then calls remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractListIteratorDecorator.remove()"})
  void testRemove_givenArrayListIteratorRemoveDoesNothing_thenCallsRemove() {
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
   * Test {@link AbstractListIteratorDecorator#remove()}.
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayIterator#remove()} does nothing.</li>
   *   <li>Then calls {@link ArrayIterator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListIteratorDecorator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given ArrayListIterator remove() does nothing; then calls remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractListIteratorDecorator.remove()"})
  void testRemove_givenArrayListIteratorRemoveDoesNothing_thenCallsRemove2() {
    // Arrange
    ArrayListIterator<Object> iterator = mock(ArrayListIterator.class);
    doNothing().when(iterator).remove();
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new AbstractListIteratorDecorator<>(iterator));

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
  @DisplayName("Test set(Object); given ArrayListIterator set(Object) does nothing; then calls set(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractListIteratorDecorator.set(Object)"})
  void testSet_givenArrayListIteratorSetDoesNothing_thenCallsSet() {
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
