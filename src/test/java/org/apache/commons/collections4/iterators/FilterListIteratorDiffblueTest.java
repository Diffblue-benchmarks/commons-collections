package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FilterListIteratorDiffblueTest {
  /**
   * Test {@link FilterListIterator#add(Object)}.
   *
   * <p>Method under test: {@link FilterListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterListIterator.add(Object)"})
  void testAdd() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.add("42"));
  }

  /**
   * Test {@link FilterListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   *       with iterator is {@link EmptyListIterator#EmptyListIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given AbstractListIteratorDecorator(ListIterator) with iterator is EmptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasNext()"})
  void testHasNext_givenAbstractListIteratorDecoratorWithIteratorIsEmptyListIterator() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()), mock(Predicate.class));

    // Act and Assert
    assertFalse(filterListIterator.hasNext());
  }

  /**
   * Test {@link FilterListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator(ListIterator, Predicate)} with
   *       iterator is {@link FilterListIterator#FilterListIterator()} and {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given FilterListIterator(ListIterator, Predicate) with iterator is FilterListIterator() and Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasNext()"})
  void testHasNext_givenFilterListIteratorWithIteratorIsFilterListIteratorAndPredicate() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new FilterListIterator<>(), mock(Predicate.class));

    // Act and Assert
    assertFalse(filterListIterator.hasNext());
  }

  /**
   * Test {@link FilterListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given FilterListIterator(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasNext()"})
  void testHasNext_givenFilterListIterator_thenReturnFalse() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertFalse(filterListIterator.hasNext());
  }

  /**
   * Test {@link FilterListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasNext()"})
  void testHasNext_givenPredicateTestReturnFalse_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new SingletonListIterator<>("Object"), mock(Predicate.class));
    filterListIterator.setPredicate(predicate);

    // Act
    boolean actualHasNextResult = filterListIterator.hasNext();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualHasNextResult);
  }

  /**
   * Test {@link FilterListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasNext()"})
  void testHasNext_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new SingletonListIterator<>("Object"), predicate);

    // Act
    boolean actualHasNextResult = filterListIterator.hasNext();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualHasNextResult);
  }

  /**
   * Test {@link FilterListIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasNext()"})
  void testHasNext_thenThrowUnsupportedOperationException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new UnsupportedOperationException());
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new SingletonListIterator<>("Object"), predicate);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.hasNext());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterListIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link FilterListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasPrevious()"})
  void testHasPrevious() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()), mock(Predicate.class));

    // Act and Assert
    assertFalse(filterListIterator.hasPrevious());
  }

  /**
   * Test {@link FilterListIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link FilterListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasPrevious()"})
  void testHasPrevious2() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new FilterListIterator<>(), mock(Predicate.class));

    // Act and Assert
    assertFalse(filterListIterator.hasPrevious());
  }

  /**
   * Test {@link FilterListIterator#hasPrevious()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious(); given FilterListIterator(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasPrevious()"})
  void testHasPrevious_givenFilterListIterator_thenReturnFalse() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertFalse(filterListIterator.hasPrevious());
  }

  /**
   * Test {@link FilterListIterator#hasPrevious()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious(); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasPrevious()"})
  void testHasPrevious_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<?> iterator = new LoopingListIterator<>(list);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    FilterListIterator<Object> filterListIterator = new FilterListIterator<>(iterator, predicate);

    // Act
    boolean actualHasPreviousResult = filterListIterator.hasPrevious();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualHasPreviousResult);
  }

  /**
   * Test {@link FilterListIterator#hasPrevious()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test hasPrevious(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterListIterator.hasPrevious()"})
  void testHasPrevious_thenThrowUnsupportedOperationException() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<?> iterator = new LoopingListIterator<>(list);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new UnsupportedOperationException());

    FilterListIterator<Object> filterListIterator = new FilterListIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.hasPrevious());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   *       with iterator is {@link EmptyListIterator#EmptyListIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given AbstractListIteratorDecorator(ListIterator) with iterator is EmptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.next()"})
  void testNext_givenAbstractListIteratorDecoratorWithIteratorIsEmptyListIterator() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()), mock(Predicate.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.next());
  }

  /**
   * Test {@link FilterListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator(ListIterator, Predicate)} with
   *       iterator is {@link FilterListIterator#FilterListIterator()} and {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given FilterListIterator(ListIterator, Predicate) with iterator is FilterListIterator() and Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.next()"})
  void testNext_givenFilterListIteratorWithIteratorIsFilterListIteratorAndPredicate() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new FilterListIterator<>(), mock(Predicate.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.next());
  }

  /**
   * Test {@link FilterListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given FilterListIterator(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.next()"})
  void testNext_givenFilterListIterator_thenThrowNoSuchElementException() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.next());
  }

  /**
   * Test {@link FilterListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.next()"})
  void testNext_givenPredicateTestReturnFalse_thenCallsTest() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new SingletonListIterator<>("Object"), mock(Predicate.class));
    filterListIterator.setPredicate(predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.next());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterListIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Predicate test(Object) return 'true'; then return 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.next()"})
  void testNext_givenPredicateTestReturnTrue_thenReturnObject() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new SingletonListIterator<>("Object"), predicate);

    // Act
    Object actualNextResult = filterListIterator.next();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("Object", actualNextResult);
    assertFalse(filterListIterator.hasNext());
  }

  /**
   * Test {@link FilterListIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.next()"})
  void testNext_thenThrowUnsupportedOperationException() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new UnsupportedOperationException());
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new SingletonListIterator<>("Object"), predicate);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.next());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterListIterator#previous()}.
   *
   * <ul>
   *   <li>Given {@link AbstractListIteratorDecorator#AbstractListIteratorDecorator(ListIterator)}
   *       with iterator is {@link EmptyListIterator#EmptyListIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#previous()}
   */
  @Test
  @DisplayName(
      "Test previous(); given AbstractListIteratorDecorator(ListIterator) with iterator is EmptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.previous()"})
  void testPrevious_givenAbstractListIteratorDecoratorWithIteratorIsEmptyListIterator() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(
            new AbstractListIteratorDecorator<>(new EmptyListIterator<>()), mock(Predicate.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.previous());
  }

  /**
   * Test {@link FilterListIterator#previous()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator(ListIterator, Predicate)} with
   *       iterator is {@link FilterListIterator#FilterListIterator()} and {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#previous()}
   */
  @Test
  @DisplayName(
      "Test previous(); given FilterListIterator(ListIterator, Predicate) with iterator is FilterListIterator() and Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.previous()"})
  void testPrevious_givenFilterListIteratorWithIteratorIsFilterListIteratorAndPredicate() {
    // Arrange
    FilterListIterator<Object> filterListIterator =
        new FilterListIterator<>(new FilterListIterator<>(), mock(Predicate.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.previous());
  }

  /**
   * Test {@link FilterListIterator#previous()}.
   *
   * <ul>
   *   <li>Given {@link FilterListIterator#FilterListIterator()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous(); given FilterListIterator(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.previous()"})
  void testPrevious_givenFilterListIterator_thenThrowNoSuchElementException() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterListIterator.previous());
  }

  /**
   * Test {@link FilterListIterator#previous()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous(); given Predicate test(Object) return 'true'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.previous()"})
  void testPrevious_givenPredicateTestReturnTrue_thenReturn42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<?> iterator = new LoopingListIterator<>(list);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    FilterListIterator<Object> filterListIterator = new FilterListIterator<>(iterator, predicate);

    // Act
    Object actualPreviousResult = filterListIterator.previous();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualPreviousResult);
  }

  /**
   * Test {@link FilterListIterator#previous()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterListIterator#previous()}
   */
  @Test
  @DisplayName("Test previous(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterListIterator.previous()"})
  void testPrevious_thenThrowUnsupportedOperationException() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    LoopingListIterator<?> iterator = new LoopingListIterator<>(list);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new UnsupportedOperationException());

    FilterListIterator<Object> filterListIterator = new FilterListIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.previous());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterListIterator#previousIndex()}.
   *
   * <p>Method under test: {@link FilterListIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test previousIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FilterListIterator.previousIndex()"})
  void testPreviousIndex() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertEquals(-1, filterListIterator.previousIndex());
  }

  /**
   * Test {@link FilterListIterator#remove()}.
   *
   * <p>Method under test: {@link FilterListIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterListIterator.remove()"})
  void testRemove() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.remove());
  }

  /**
   * Test {@link FilterListIterator#set(Object)}.
   *
   * <p>Method under test: {@link FilterListIterator#set(Object)}
   */
  @Test
  @DisplayName("Test set(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterListIterator.set(Object)"})
  void testSet() {
    // Arrange
    FilterListIterator<Object> filterListIterator = new FilterListIterator<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> filterListIterator.set("Ignored"));
  }
}
