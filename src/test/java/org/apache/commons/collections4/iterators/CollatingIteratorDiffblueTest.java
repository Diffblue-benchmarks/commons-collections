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
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CollatingIteratorDiffblueTest {
  /**
   * Test {@link CollatingIterator#CollatingIterator()}.
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator()}
   */
  @Test
  @DisplayName("Test new CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>()"})
  void testNewCollatingIterator() {
    // Arrange and Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>();

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator)}.
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator)}
   */
  @Test
  @DisplayName("Test new CollatingIterator(Comparator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator)"})
  void testNewCollatingIterator2() {
    // Arrange and Act
    CollatingIterator<Object> actualCollatingIterator =
        new CollatingIterator<>(mock(Comparator.class));

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator, Iterator, Iterator)}.
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator, Iterator,
   * Iterator)}
   */
  @Test
  @DisplayName("Test new CollatingIterator(Comparator, Iterator, Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator, Iterator, Iterator)"})
  void testNewCollatingIterator3() {
    // Arrange
    Comparator<Object> comp = mock(Comparator.class);

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    CollatingIterator<Object> actualCollatingIterator =
        new CollatingIterator<>(comp, a, objectList2.iterator());

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator, Iterator[])}.
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator, Iterator[])}
   */
  @Test
  @DisplayName("Test new CollatingIterator(Comparator, Iterator[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator, Iterator[])"})
  void testNewCollatingIterator4() {
    // Arrange
    Comparator<Object> comp = mock(Comparator.class);

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<?>[] iterators = new Iterator[] {objectList.iterator()};

    // Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>(comp, iterators);

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator, Collection)}
   */
  @Test
  @DisplayName("Test new CollatingIterator(Comparator, Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator, Collection)"})
  void testNewCollatingIterator_whenArrayList() {
    // Arrange
    Comparator<Object> comp = mock(Comparator.class);

    // Act
    CollatingIterator<Object> actualCollatingIterator =
        new CollatingIterator<>(comp, new ArrayList<>());

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CollatingIterator(Comparator, Collection); when ArrayList() add ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator, Collection)"})
  void testNewCollatingIterator_whenArrayListAddArrayListIterator() {
    // Arrange
    Comparator<Object> comp = mock(Comparator.class);

    ArrayList<Iterator<?>> iterators = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterators.add(objectList2.iterator());

    // Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>(comp, iterators);

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator, Collection)}.
   *
   * <ul>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CollatingIterator(Comparator, Collection); when LinkedHashSet() add ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator, Collection)"})
  void testNewCollatingIterator_whenLinkedHashSetAddArrayListIterator() {
    // Arrange
    Comparator<Object> comp = mock(Comparator.class);

    LinkedHashSet<Iterator<?>> iterators = new LinkedHashSet<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    // Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>(comp, iterators);

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#CollatingIterator(Comparator, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#CollatingIterator(Comparator, int)}
   */
  @Test
  @DisplayName("Test new CollatingIterator(Comparator, int); when one; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.<init>(Comparator, int)"})
  void testNewCollatingIterator_whenOne_thenReturnNotHasNext() {
    // Arrange and Act
    CollatingIterator<Object> actualCollatingIterator =
        new CollatingIterator<>(mock(Comparator.class), 1);

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#getComparator()}.
   *
   * <p>Method under test: {@link CollatingIterator#getComparator()}
   */
  @Test
  @DisplayName("Test getComparator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparator CollatingIterator.getComparator()"})
  void testGetComparator() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertNull(collatingIterator.getComparator());
  }

  /**
   * Test {@link CollatingIterator#getIteratorIndex()}.
   *
   * <p>Method under test: {@link CollatingIterator#getIteratorIndex()}
   */
  @Test
  @DisplayName("Test getIteratorIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollatingIterator.getIteratorIndex()"})
  void testGetIteratorIndex() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> collatingIterator.getIteratorIndex());
  }

  /**
   * Test {@link CollatingIterator#getIterators()}.
   *
   * <p>Method under test: {@link CollatingIterator#getIterators()}
   */
  @Test
  @DisplayName("Test getIterators()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List CollatingIterator.getIterators()"})
  void testGetIterators() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertTrue(collatingIterator.getIterators().isEmpty());
  }

  /**
   * Test {@link CollatingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollatingIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertTrue(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given CollatingIterator() addIterator ArrayList() iterator; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollatingIterator.hasNext()"})
  void testHasNext_givenCollatingIteratorAddIteratorArrayListIterator_thenReturnFalse() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    // Act and Assert
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given CollatingIterator(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollatingIterator.hasNext()"})
  void testHasNext_givenCollatingIterator_thenReturnFalse() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given CollatingIterator(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  void testNext_givenCollatingIterator_thenThrowNoSuchElementException()
      throws NoSuchElementException {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> collatingIterator.next());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  void testNext_thenNotCollatingIteratorHasNext() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertEquals("42", collatingIterator.next());
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  void testNext_thenNotCollatingIteratorHasNext2() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    collatingIterator.addIterator(objectList2.iterator());
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertEquals("42", collatingIterator.next());
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  void testNext_thenThrowIllegalStateException() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> collatingIterator.next());
    verify(comp).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link CollatingIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @DisplayName("Test next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  void testNext_thenThrowNoSuchElementException() throws NoSuchElementException {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> collatingIterator.next());
  }

  /**
   * Test {@link CollatingIterator#remove()}.
   *
   * <p>Method under test: {@link CollatingIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollatingIterator.remove()"})
  void testRemove() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> collatingIterator.remove());
  }
}
