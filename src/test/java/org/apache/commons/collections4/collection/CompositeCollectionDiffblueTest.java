package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
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
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CompositeCollectionDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeCollection#CompositeCollection()}
   *   <li>{@link CompositeCollection#setMutator(CollectionMutator)}
   *   <li>{@link CompositeCollection#getMutator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompositeCollection.<init>()",
    "CollectionMutator CompositeCollection.getMutator()",
    "void CompositeCollection.setMutator(CollectionMutator)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>();
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    actualCompositeCollection.setMutator(mutator);

    // Assert
    assertSame(mutator, actualCompositeCollection.getMutator());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection);

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne3() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");
    compositeCollection.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection);

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");
    compositeCollection1.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo3() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(compositeCollection1, new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection[])}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection[])}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection[]); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection[])"})
  void testNewCompositeCollection_whenArrayList_thenReturnEmpty3() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_whenNull_thenReturnEmpty() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>((Collection<Object>) null);

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_whenNull_thenReturnEmpty2() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(new ArrayList<>(), null);

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test new CompositeCollection(Collection, Collection); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_whenNull_thenReturnEmpty3() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection =
        new CompositeCollection<>(null, new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#add(CompositeCollection, List,
   *       Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given CollectionMutator add(CompositeCollection, List, Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCollectionMutatorAddReturnFalse_thenReturnFalse() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.add(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Object>any()))
        .thenReturn(false);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddResult = compositeCollection.add("Obj");

    // Assert
    verify(mutator).add(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#add(CompositeCollection, List,
   *       Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given CollectionMutator add(CompositeCollection, List, Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCollectionMutatorAddReturnTrue_thenReturnTrue() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.add(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Object>any()))
        .thenReturn(true);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddResult = compositeCollection.add("Obj");

    // Assert
    verify(mutator).add(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#add(CompositeCollection, List,
   *       Object)} throw {@link UnsupportedOperationException#UnsupportedOperationException()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given CollectionMutator add(CompositeCollection, List, Object) throw UnsupportedOperationException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCollectionMutatorAddThrowUnsupportedOperationException() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.add(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.add("Obj"));
    verify(mutator).add(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given CompositeCollection(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCompositeCollection_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.add("Obj"));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given '42'; when ArrayList() add '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(coll));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given '42'; when ArrayList() add '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(coll));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#addAll(CompositeCollection,
   *       List, Collection)} return {@code false}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given CollectionMutator addAll(CompositeCollection, List, Collection) return 'false'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCollectionMutatorAddAllReturnFalse_whenArrayList_thenReturnFalse() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.addAll(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Collection<?>>any()))
        .thenReturn(false);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddAllResult = compositeCollection.addAll(new ArrayList<>());

    // Assert
    verify(mutator).addAll(isA(CompositeCollection.class), isA(List.class), isA(Collection.class));
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#addAll(CompositeCollection,
   *       List, Collection)} return {@code true}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given CollectionMutator addAll(CompositeCollection, List, Collection) return 'true'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCollectionMutatorAddAllReturnTrue_whenArrayList_thenReturnTrue() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.addAll(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Collection<?>>any()))
        .thenReturn(true);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddAllResult = compositeCollection.addAll(new ArrayList<>());

    // Assert
    verify(mutator).addAll(isA(CompositeCollection.class), isA(List.class), isA(Collection.class));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#addAll(CompositeCollection,
   *       List, Collection)} throw {@link
   *       UnsupportedOperationException#UnsupportedOperationException()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given CollectionMutator addAll(CompositeCollection, List, Collection) throw UnsupportedOperationException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCollectionMutatorAddAllThrowUnsupportedOperationException() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.addAll(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Collection<?>>any()))
        .thenThrow(new UnsupportedOperationException());

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> compositeCollection.addAll(new ArrayList<>()));
    verify(mutator).addAll(isA(CompositeCollection.class), isA(List.class), isA(Collection.class));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given CompositeCollection(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCompositeCollection_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> compositeCollection.addAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection2_whenNull() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(new ArrayList<>(), null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection2_whenNull2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(null, new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection22() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection23() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");
    compositeCollection1.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection24() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code
   * compositeCollection1}, {@code compositeCollection2}.
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection25() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   *
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection) with 'compositeCollection'; then CompositeCollection() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_thenCompositeCollectionSizeIsOne() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection2);

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   *
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection) with 'compositeCollection'; then CompositeCollection() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_thenCompositeCollectionSizeIsTwo() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection2);

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName("Test addComposited(Collection) with 'compositeCollection'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_whenArrayList() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Collection) with 'compositeCollection'; when 'null'; then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_whenNull_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited((Collection<Object>) null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#clear()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#clear()}
   */
  @Test
  @DisplayName("Test clear(); given CompositeCollection(); then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.clear()"})
  void testClear_givenCompositeCollection_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.clear();

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#clear()}.
   *
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection(Collection[])} with
   *       compositeCollections is {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#clear()}
   */
  @Test
  @DisplayName(
      "Test clear(); then CompositeCollection(Collection[]) with compositeCollections is ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeCollection.clear()"})
  void testClear_thenCompositeCollectionWithCompositeCollectionsIsArrayListEmpty() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act
    compositeCollection2.clear();

    // Assert
    assertTrue(compositeCollection2.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given ArrayList() add ArrayList(); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.contains(Object)"})
  void testContains_givenArrayListAddArrayList_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertTrue(compositeCollection2.contains(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given ArrayList() add ArrayList(); when 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.contains(Object)"})
  void testContains_givenArrayListAddArrayList_whenObj_thenReturnFalse() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertFalse(compositeCollection2.contains("Obj"));
  }

  /**
   * Test {@link CompositeCollection#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>When {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given CompositeCollection(); when 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.contains(Object)"})
  void testContains_givenCompositeCollection_whenObj_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.contains("Obj"));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given ArrayList() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  void testContainsAll_givenArrayListAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(objectList);
    compositeCollection2.addComposited(compositeCollection);

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(compositeCollection2.containsAll(coll));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given ArrayList() add ArrayList(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  void testContainsAll_givenArrayListAddArrayList_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection2.containsAll(coll));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given ArrayList() add ArrayList(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  void testContainsAll_givenArrayListAddArrayList_whenNull_thenReturnFalse() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertFalse(compositeCollection2.containsAll(null));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given CompositeCollection(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  void testContainsAll_givenCompositeCollection_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.containsAll(coll));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given CompositeCollection(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  void testContainsAll_givenCompositeCollection_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.containsAll(coll));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given CompositeCollection(); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  void testContainsAll_givenCompositeCollection_whenArrayList_thenReturnTrue() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#getCollections()}.
   *
   * <p>Method under test: {@link CompositeCollection#getCollections()}
   */
  @Test
  @DisplayName("Test getCollections()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CompositeCollection.getCollections()"})
  void testGetCollections() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.getCollections().isEmpty());
  }

  /**
   * Test {@link CompositeCollection#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ArrayList() add ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.isEmpty()"})
  void testIsEmpty_givenArrayListAddArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertFalse(compositeCollection2.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CompositeCollection(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.isEmpty()"})
  void testIsEmpty_givenCompositeCollection_thenReturnTrue() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then return {@link EmptyIterator}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#iterator()}
   */
  @Test
  @DisplayName("Test iterator(); given CompositeCollection(); then return EmptyIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CompositeCollection.iterator()"})
  void testIterator_givenCompositeCollection_thenReturnEmptyIterator() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    Iterator<Object> actualIteratorResult = compositeCollection.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof EmptyIterator);
    assertFalse(actualIteratorResult.hasNext());
    assertSame(((EmptyIterator) actualIteratorResult).RESETTABLE_INSTANCE, actualIteratorResult);
  }

  /**
   * Test {@link CompositeCollection#iterator()}.
   *
   * <ul>
   *   <li>Then return {@link IteratorChain}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#iterator()}
   */
  @Test
  @DisplayName("Test iterator(); then return IteratorChain")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CompositeCollection.iterator()"})
  void testIterator_thenReturnIteratorChain() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Iterator<Object> actualIteratorResult = compositeCollection.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeCollection#iterator()}.
   *
   * <ul>
   *   <li>Then return {@link IteratorChain}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#iterator()}
   */
  @Test
  @DisplayName("Test iterator(); then return IteratorChain")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CompositeCollection.iterator()"})
  void testIterator_thenReturnIteratorChain2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Iterator<Object> actualIteratorResult = compositeCollection.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#remove(CompositeCollection,
   *       List, Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given CollectionMutator remove(CompositeCollection, List, Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  void testRemove_givenCollectionMutatorRemoveReturnFalse_thenReturnFalse() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.remove(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Object>any()))
        .thenReturn(false);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualRemoveResult = compositeCollection.remove("Obj");

    // Assert
    verify(mutator).remove(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertFalse(actualRemoveResult);
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#remove(CompositeCollection,
   *       List, Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given CollectionMutator remove(CompositeCollection, List, Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  void testRemove_givenCollectionMutatorRemoveReturnTrue_thenReturnTrue() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.remove(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Object>any()))
        .thenReturn(true);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualRemoveResult = compositeCollection.remove("Obj");

    // Assert
    verify(mutator).remove(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#remove(CompositeCollection,
   *       List, Object)} throw {@link
   *       UnsupportedOperationException#UnsupportedOperationException()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given CollectionMutator remove(CompositeCollection, List, Object) throw UnsupportedOperationException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  void testRemove_givenCollectionMutatorRemoveThrowUnsupportedOperationException() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.remove(
            Mockito.<CompositeCollection<Object>>any(),
            Mockito.<List<Collection<Object>>>any(),
            Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>(new ArrayList<>());
    compositeCollection.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.remove("Obj"));
    verify(mutator).remove(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given CompositeCollection(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  void testRemove_givenCompositeCollection_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.remove("Obj"));
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   *
   * <p>Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  void testRemoveAll() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = compositeCollection2.removeAll(coll);

    // Assert
    assertEquals(1, compositeCollection2.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given CompositeCollection(); then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  void testRemoveAll_givenCompositeCollection_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.removeAll(coll));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given CompositeCollection(); then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  void testRemoveAll_givenCompositeCollection_thenCompositeCollectionEmpty2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.removeAll(coll));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection(Collection[])} with
   *       compositeCollections is {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); then CompositeCollection(Collection[]) with compositeCollections is ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  void testRemoveAll_thenCompositeCollectionWithCompositeCollectionsIsArrayListEmpty() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    ArrayList<Object> coll = new ArrayList<>();
    coll.add(new ArrayList<>());

    // Act
    boolean actualRemoveAllResult = compositeCollection2.removeAll(coll);

    // Assert
    assertTrue(compositeCollection2.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); when ArrayList(); then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  void testRemoveAll_whenArrayList_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.removeAll(new ArrayList<>()));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  void testRemoveAll_whenNull() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act
    boolean actualRemoveAllResult = compositeCollection2.removeAll(null);

    // Assert
    assertEquals(1, compositeCollection2.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link CompositeCollection#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); given CompositeCollection(); when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeIf(Predicate)"})
  void testRemoveIf_givenCompositeCollection_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.removeIf(mock(Predicate.class)));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection(Collection[])} with
   *       compositeCollections is {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); then CompositeCollection(Collection[]) with compositeCollections is ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.removeIf(Predicate)"})
  void testRemoveIf_thenCompositeCollectionWithCompositeCollectionsIsArrayListEmpty() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = compositeCollection2.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    assertTrue(compositeCollection2.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   *
   * <p>Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  void testRetainAll() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act
    boolean actualRetainAllResult = compositeCollection2.retainAll(null);

    // Assert
    assertEquals(1, compositeCollection2.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection); given '42'; when ArrayList() add '42'; then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.retainAll(coll));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection); given '42'; when ArrayList() add '42'; then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42_thenCompositeCollectionEmpty2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.retainAll(coll));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection(Collection[])} with
   *       compositeCollections is {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection); then CompositeCollection(Collection[]) with compositeCollections is ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  void testRetainAll_thenCompositeCollectionWithCompositeCollectionsIsArrayListEmpty() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act
    boolean actualRetainAllResult = compositeCollection2.retainAll(new ArrayList<>());

    // Assert
    assertTrue(compositeCollection2.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); when ArrayList(); then CompositeCollection() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  void testRetainAll_whenArrayList_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.retainAll(new ArrayList<>()));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#size()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#size()}
   */
  @Test
  @DisplayName("Test size(); given ArrayList() add ArrayList(); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CompositeCollection.size()"})
  void testSize_givenArrayListAddArrayList_thenReturnOne() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add(new ArrayList<>());

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertEquals(1, compositeCollection2.size());
  }

  /**
   * Test {@link CompositeCollection#size()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#size()}
   */
  @Test
  @DisplayName("Test size(); given CompositeCollection(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CompositeCollection.size()"})
  void testSize_givenCompositeCollection_thenReturnZero() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertEquals(0, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then second element return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given ArrayList() add '42'; then second element return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeCollection.toArray(Object[])"})
  void testToArrayWithObject_givenArrayListAdd42_thenSecondElementReturnList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    ArrayList<Object> compositeCollection = new ArrayList<>();
    ArrayList<Object> objectList2 = new ArrayList<>();
    compositeCollection.add(objectList2);

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(objectList);
    compositeCollection2.addComposited(compositeCollection);
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray(array);

    // Assert
    Object object = actualToArrayResult[1];
    assertTrue(object instanceof List);
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("Array", array[0]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
    assertTrue(((List<Object>) object).isEmpty());
    assertSame(objectList2, object);
  }

  /**
   * Test {@link CompositeCollection#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then first element return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given ArrayList() add ArrayList(); then first element return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeCollection.toArray(Object[])"})
  void testToArrayWithObject_givenArrayListAddArrayList_thenFirstElementReturnList() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    ArrayList<Object> objectList = new ArrayList<>();
    compositeCollection.add(objectList);

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray(array);

    // Assert
    Object object = actualToArrayResult[0];
    assertTrue(object instanceof List);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertTrue(((List<Object>) object).isEmpty());
    assertSame(objectList, object);
    assertSame(objectList, array[0]);
  }

  /**
   * Test {@link CompositeCollection#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given CompositeCollection(); then first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeCollection.toArray(Object[])"})
  void testToArrayWithObject_givenCompositeCollection_thenFirstElementIsNull() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection.toArray(array);

    // Assert
    assertNull(array[0]);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Test {@link CompositeCollection#toArray()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then first element return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given ArrayList() add ArrayList(); then first element return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeCollection.toArray()"})
  void testToArray_givenArrayListAddArrayList_thenFirstElementReturnList() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    ArrayList<Object> objectList = new ArrayList<>();
    compositeCollection.add(objectList);

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>(new ArrayList<>());
    compositeCollection2.addComposited(compositeCollection);

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray();

    // Assert
    Object object = actualToArrayResult[0];
    assertTrue(object instanceof List);
    assertEquals(1, actualToArrayResult.length);
    assertTrue(((List<Object>) object).isEmpty());
    assertSame(objectList, object);
  }

  /**
   * Test {@link CompositeCollection#toArray()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given CompositeCollection(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeCollection.toArray()"})
  void testToArray_givenCompositeCollection_thenReturnArrayLengthIsZero() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertEquals(0, compositeCollection.toArray().length);
  }

  /**
   * Test {@link CompositeCollection#toCollection()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  @DisplayName("Test toCollection(); given ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CompositeCollection.toCollection()"})
  void testToCollection_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection2.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertEquals(1, actualToCollectionResult.size());
    assertEquals("42", ((List<Object>) actualToCollectionResult).get(0));
  }

  /**
   * Test {@link CompositeCollection#toCollection()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()} addComposited {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  @DisplayName(
      "Test toCollection(); given CompositeCollection() addComposited ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CompositeCollection.toCollection()"})
  void testToCollection_givenCompositeCollectionAddCompositedArrayList_thenReturnEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#toCollection()}.
   *
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  @DisplayName("Test toCollection(); given CompositeCollection(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CompositeCollection.toCollection()"})
  void testToCollection_givenCompositeCollection_thenReturnEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
  }
}
