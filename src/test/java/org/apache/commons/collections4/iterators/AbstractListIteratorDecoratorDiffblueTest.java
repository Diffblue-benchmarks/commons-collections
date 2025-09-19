package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.ListIterator;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractListIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}.
   *
   * <ul>
   *   <li>When {@link EmptyListIterator#EmptyListIterator()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link
   * AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   */
  @Test
  @DisplayName(
      "Test new AbstractListIteratorDecorator(ListIterator); when EmptyListIterator(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractListIteratorDecorator.<init>(ListIterator)"})
  void testNewAbstractListIteratorDecorator_whenEmptyListIterator_thenReturnNotHasNext() {
    // Arrange and Act
    AbstractListIteratorDecorator<Object> actualAbstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(new EmptyListIterator<>());

    // Assert
    assertFalse(actualAbstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#add(Object)}.
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractListIteratorDecorator.add(Object)"})
  void testAdd() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(new LoopingListIterator<>(new ArrayList<>()));

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
   * Test {@link AbstractListIteratorDecorator#hasNext()}.
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractListIteratorDecorator.hasNext()"})
  void testHasNext() {
    // Arrange
    FilterListIterator<Object> iterator =
        new FilterListIterator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()), mock(Predicate.class));
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(iterator);

    // Act and Assert
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   *       with iterator is {@link EmptyListIterator#EmptyListIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given AbstractListIteratorDecorator(ListIterator) with iterator is EmptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractListIteratorDecorator.hasNext()"})
  void testHasNext_givenAbstractListIteratorDecoratorWithIteratorIsEmptyListIterator() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(new EmptyListIterator<>());

    // Act and Assert
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#hasPrevious()}.
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractListIteratorDecorator.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    FilterListIterator<Object> iterator =
        new FilterListIterator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()), mock(Predicate.class));
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(iterator);

    // Act and Assert
    assertFalse(abstractListIteratorDecorator.hasPrevious());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#hasPrevious()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractListIteratorDecorator.hasPrevious()"})
  void testHasPrevious_thenReturnFalse() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(new EmptyListIterator<>());

    // Act and Assert
    assertFalse(abstractListIteratorDecorator.hasPrevious());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#nextIndex()}.
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractListIteratorDecorator.nextIndex()"})
  void testNextIndex() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()));

    // Act and Assert
    assertEquals(0, abstractListIteratorDecorator.nextIndex());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#nextIndex()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#nextIndex()}
   */
  @Test
  @DisplayName("Test nextIndex(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractListIteratorDecorator.nextIndex()"})
  void testNextIndex_thenReturnZero() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(new EmptyListIterator<>());

    // Act and Assert
    assertEquals(0, abstractListIteratorDecorator.nextIndex());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#previousIndex()}.
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractListIteratorDecorator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()));

    // Act and Assert
    assertEquals(-1, abstractListIteratorDecorator.previousIndex());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#previousIndex()}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex(); then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractListIteratorDecorator.previousIndex()"})
  void testPreviousIndex_thenReturnMinusOne() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(new EmptyListIterator<>());

    // Act and Assert
    assertEquals(-1, abstractListIteratorDecorator.previousIndex());
  }

  /**
   * Test {@link AbstractListIteratorDecorator#remove()}.
   *
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayListIterator#remove()} does nothing.
   *   <li>Then calls {@link ArrayListIterator#remove()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given ArrayListIterator remove() does nothing; then calls remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractListIteratorDecorator.remove()"})
  void testRemove_givenArrayListIteratorRemoveDoesNothing_thenCallsRemove() {
    // Arrange
    ArrayListIterator<Object> iterator = mock(ArrayListIterator.class);
    doNothing().when(iterator).remove();
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(iterator);

    // Act
    abstractListIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractListIteratorDecorator#remove()}.
   *
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayListIterator#remove()} does nothing.
   *   <li>Then calls {@link ArrayListIterator#remove()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given ArrayListIterator remove() does nothing; then calls remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractListIteratorDecorator.remove()"})
  void testRemove_givenArrayListIteratorRemoveDoesNothing_thenCallsRemove2() {
    // Arrange
    ArrayListIterator<Object> iterator = mock(ArrayListIterator.class);
    doNothing().when(iterator).remove();
    AbstractListIteratorDecorator<Object> iterator2 = new AbstractListIteratorDecorator<>(iterator);
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(iterator2);

    // Act
    abstractListIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractListIteratorDecorator#set(Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayListIterator} {@link ArrayListIterator#set(Object)} does nothing.
   *   <li>Then calls {@link ArrayListIterator#set(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractListIteratorDecorator#set(Object)}
   */
  @Test
  @DisplayName(
      "Test set(Object); given ArrayListIterator set(Object) does nothing; then calls set(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractListIteratorDecorator.set(Object)"})
  void testSet_givenArrayListIteratorSetDoesNothing_thenCallsSet() {
    // Arrange
    ArrayListIterator<Object> iterator = mock(ArrayListIterator.class);
    doNothing().when(iterator).set(Mockito.<Object>any());
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(iterator);

    // Act
    abstractListIteratorDecorator.set("Obj");

    // Assert
    verify(iterator).set(isA(Object.class));
  }
}
