package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FilterIteratorDiffblueTest {
  /**
   * Test {@link FilterIterator#FilterIterator(Iterator)}.
   *
   * <p>Method under test: {@link FilterIterator#FilterIterator(Iterator)}
   */
  @Test
  @DisplayName("Test new FilterIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterIterator.<init>(Iterator)"})
  void testNewFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator = new FilterIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }

  /**
   * Test {@link FilterIterator#FilterIterator(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#FilterIterator(Iterator, Predicate)}
   */
  @Test
  @DisplayName("Test new FilterIterator(Iterator, Predicate); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterIterator.<init>(Iterator, Predicate)"})
  void testNewFilterIterator_whenNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator = new FilterIterator<>(objectList.iterator(), null);

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }

  /**
   * Test {@link FilterIterator#FilterIterator(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#FilterIterator(Iterator, Predicate)}
   */
  @Test
  @DisplayName("Test new FilterIterator(Iterator, Predicate); when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterIterator.<init>(Iterator, Predicate)"})
  void testNewFilterIterator_whenPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FilterIterator#getIterator()}
   *   <li>{@link FilterIterator#getPredicate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Iterator FilterIterator.getIterator()",
    "Predicate FilterIterator.getPredicate()"
  })
  void testGettersAndSetters() {
    // Arrange
    FilterIterator<Object> filterIterator = new FilterIterator<>();

    // Act
    Iterator<?> actualIterator = filterIterator.getIterator();

    // Assert
    assertTrue(filterIterator.getPredicate() instanceof TruePredicate);
    assertNull(actualIterator);
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  void testHasNext_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act
    boolean actualHasNextResult = filterIterator.hasNext();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualHasNextResult);
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  void testHasNext_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act
    boolean actualHasNextResult = filterIterator.hasNext();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualHasNextResult);
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));

    // Act and Assert
    assertFalse(filterIterator.hasNext());
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  void testHasNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new NoSuchElementException());

    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.hasNext());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given Predicate test(Object) return 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterIterator.next()"})
  void testNext_givenPredicateTestReturnFalse_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Predicate test(Object) return 'true'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterIterator.next()"})
  void testNext_givenPredicateTestReturnTrue_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act
    Object actualNextResult = filterIterator.next();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualNextResult);
  }

  /**
   * Test {@link FilterIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       NoSuchElementException#NoSuchElementException()}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Predicate test(Object) throw NoSuchElementException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterIterator.next()"})
  void testNext_givenPredicateTestThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new NoSuchElementException());

    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link FilterIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FilterIterator.next()"})
  void testNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
  }

  /**
   * Test {@link FilterIterator#setIterator(Iterator)}.
   *
   * <p>Method under test: {@link FilterIterator#setIterator(Iterator)}
   */
  @Test
  @DisplayName("Test setIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FilterIterator.setIterator(Iterator)"})
  void testSetIterator() {
    // Arrange
    FilterIterator<Object> filterIterator = new FilterIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    filterIterator.setIterator(objectList.iterator());

    // Assert
    assertFalse(filterIterator.hasNext());
  }
}
