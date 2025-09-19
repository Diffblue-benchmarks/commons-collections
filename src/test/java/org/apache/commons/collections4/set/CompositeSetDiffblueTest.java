package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.set.CompositeSet.SetMutator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CompositeSetDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeSet#CompositeSet()}
   *   <li>{@link CompositeSet#setMutator(SetMutator)}
   *   <li>{@link CompositeSet#getMutator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompositeSet.<init>()",
    "SetMutator CompositeSet.getMutator()",
    "void CompositeSet.setMutator(SetMutator)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>();
    actualObjectSet.setMutator(null);

    // Assert
    assertNull(actualObjectSet.getMutator());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); given '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> new CompositeSet<>(objectSet, objectSet2));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName(
      "Test new CompositeSet(Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(set);

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName(
      "Test new CompositeSet(Set[]); given '42'; when HashSet() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName(
      "Test new CompositeSet(Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(set);

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()} and {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); when HashSet() and HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_whenHashSetAndHashSet_thenReturnEmpty() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); when HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set); when HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(set);

    // Assert
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_whenNull_thenReturnEmpty() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_whenNull_thenReturnEmpty2() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>[]) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given CompositeSet(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.add(Object)"})
  void testAdd_givenCompositeSet_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.add("Obj"));
  }

  /**
   * Test {@link CompositeSet#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link EmptySetMutator} {@link EmptySetMutator#add(CompositeSet, List, Object)}
   *       return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given EmptySetMutator add(CompositeSet, List, Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.add(Object)"})
  void testAdd_givenEmptySetMutatorAddReturnFalse_thenReturnFalse() {
    // Arrange
    EmptySetMutator<Object> mutator = mock(EmptySetMutator.class);
    when(mutator.add(
            Mockito.<CompositeSet<Object>>any(),
            Mockito.<List<Set<Object>>>any(),
            Mockito.<Object>any()))
        .thenReturn(false);

    CompositeSet<Object> objectSet = new CompositeSet<>(new HashSet<>());
    objectSet.setMutator(mutator);

    // Act
    boolean actualAddResult = objectSet.add("Obj");

    // Assert
    verify(mutator).add(isA(CompositeSet.class), isA(List.class), isA(Object.class));
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link CompositeSet#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link EmptySetMutator} {@link EmptySetMutator#add(CompositeSet, List, Object)}
   *       return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given EmptySetMutator add(CompositeSet, List, Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.add(Object)"})
  void testAdd_givenEmptySetMutatorAddReturnTrue_thenReturnTrue() {
    // Arrange
    EmptySetMutator<Object> mutator = mock(EmptySetMutator.class);
    when(mutator.add(
            Mockito.<CompositeSet<Object>>any(),
            Mockito.<List<Set<Object>>>any(),
            Mockito.<Object>any()))
        .thenReturn(true);

    CompositeSet<Object> objectSet = new CompositeSet<>(new HashSet<>());
    objectSet.setMutator(mutator);

    // Act
    boolean actualAddResult = objectSet.add("Obj");

    // Assert
    verify(mutator).add(isA(CompositeSet.class), isA(List.class), isA(Object.class));
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link CompositeSet#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link EmptySetMutator} {@link EmptySetMutator#add(CompositeSet, List, Object)}
   *       throw {@link UnsupportedOperationException#UnsupportedOperationException()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object); given EmptySetMutator add(CompositeSet, List, Object) throw UnsupportedOperationException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.add(Object)"})
  void testAdd_givenEmptySetMutatorAddThrowUnsupportedOperationException() {
    // Arrange
    EmptySetMutator<Object> mutator = mock(EmptySetMutator.class);
    when(mutator.add(
            Mockito.<CompositeSet<Object>>any(),
            Mockito.<List<Set<Object>>>any(),
            Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());

    CompositeSet<Object> objectSet = new CompositeSet<>(new HashSet<>());
    objectSet.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.add("Obj"));
    verify(mutator).add(isA(CompositeSet.class), isA(List.class), isA(Object.class));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given '42'; when ArrayList() add '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given '42'; when ArrayList() add '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given CompositeSet(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_givenCompositeSet_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link EmptySetMutator} {@link EmptySetMutator#addAll(CompositeSet, List,
   *       Collection)} return {@code false}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given EmptySetMutator addAll(CompositeSet, List, Collection) return 'false'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_givenEmptySetMutatorAddAllReturnFalse_whenArrayList_thenReturnFalse() {
    // Arrange
    EmptySetMutator<Object> mutator = mock(EmptySetMutator.class);
    when(mutator.addAll(
            Mockito.<CompositeSet<Object>>any(),
            Mockito.<List<Set<Object>>>any(),
            Mockito.<Collection<?>>any()))
        .thenReturn(false);

    CompositeSet<Object> objectSet = new CompositeSet<>(new HashSet<>());
    objectSet.setMutator(mutator);

    // Act
    boolean actualAddAllResult = objectSet.addAll(new ArrayList<>());

    // Assert
    verify(mutator).addAll(isA(CompositeSet.class), isA(List.class), isA(Collection.class));
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link EmptySetMutator} {@link EmptySetMutator#addAll(CompositeSet, List,
   *       Collection)} return {@code true}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given EmptySetMutator addAll(CompositeSet, List, Collection) return 'true'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_givenEmptySetMutatorAddAllReturnTrue_whenArrayList_thenReturnTrue() {
    // Arrange
    EmptySetMutator<Object> mutator = mock(EmptySetMutator.class);
    when(mutator.addAll(
            Mockito.<CompositeSet<Object>>any(),
            Mockito.<List<Set<Object>>>any(),
            Mockito.<Collection<?>>any()))
        .thenReturn(true);

    CompositeSet<Object> objectSet = new CompositeSet<>(new HashSet<>());
    objectSet.setMutator(mutator);

    // Act
    boolean actualAddAllResult = objectSet.addAll(new ArrayList<>());

    // Assert
    verify(mutator).addAll(isA(CompositeSet.class), isA(List.class), isA(Collection.class));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link EmptySetMutator} {@link EmptySetMutator#addAll(CompositeSet, List,
   *       Collection)} throw {@link UnsupportedOperationException#UnsupportedOperationException()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given EmptySetMutator addAll(CompositeSet, List, Collection) throw UnsupportedOperationException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_givenEmptySetMutatorAddAllThrowUnsupportedOperationException() {
    // Arrange
    EmptySetMutator<Object> mutator = mock(EmptySetMutator.class);
    when(mutator.addAll(
            Mockito.<CompositeSet<Object>>any(),
            Mockito.<List<Set<Object>>>any(),
            Mockito.<Collection<?>>any()))
        .thenThrow(new UnsupportedOperationException());

    CompositeSet<Object> objectSet = new CompositeSet<>(new HashSet<>());
    objectSet.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(new ArrayList<>()));
    verify(mutator).addAll(isA(CompositeSet.class), isA(List.class), isA(Collection.class));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; given '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add("42");

    HashSet<Object> set2 = new HashSet<>();
    set2.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addComposited(set1, set2));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; given '42'; when HashSet() add '42'; then CompositeSet() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add("42");

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; given '42'; when HashSet(); then CompositeSet() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_given42_whenHashSet_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    HashSet<Object> set2 = new HashSet<>();
    set2.add("42");

    // Act
    objectSet.addComposited(set1, set2);

    // Assert
    assertEquals(1, objectSet.size());
    assertTrue(set1.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; given two; then CompositeSet() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_givenTwo_thenCompositeSetSizeIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set1 = new HashSet<>();
    set1.add(2);
    set1.add("42");

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; given two; then CompositeSet() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_givenTwo_thenCompositeSetSizeIsTwo2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    HashSet<Object> set2 = new HashSet<>();
    set2.add(2);
    set2.add("42");

    // Act
    objectSet.addComposited(set1, set2);

    // Assert
    assertEquals(2, objectSet.size());
    assertTrue(set1.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; when HashSet(); then CompositeSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_whenHashSet_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set, Set) with 'set1', 'set2'; when 'null'; then CompositeSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_whenNull_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited(null, null);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set) with 'set'; given '42'; when HashSet() add '42'; then CompositeSet() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set) with 'set'; given two; when HashSet() add two; then CompositeSet() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_givenTwo_whenHashSetAddTwo_thenCompositeSetSizeIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set) with 'set'; when HashSet(); then CompositeSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_whenHashSet_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set = new HashSet<>();

    // Act
    objectSet.addComposited(set);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set) with 'set'; when 'null'; then CompositeSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_whenNull_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited((Set<Object>) null);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set[]) with 'sets'; given '42'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  void testAddCompositedWithSets_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    HashSet<Object> objectSet3 = new HashSet<>();
    objectSet3.add("42");

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> objectSet.addComposited(objectSet2, objectSet3));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set[]) with 'sets'; given '42'; when HashSet() add '42'; then CompositeSet() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  void testAddCompositedWithSets_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");
    Set<Object>[] sets = new Set[] {objectSet2, new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(2, sets.length);
    assertSame(objectSet2, sets[0]);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()} and {@link HashSet#HashSet()}.
   *   <li>Then array length is two.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @DisplayName(
      "Test addComposited(Set[]) with 'sets'; when HashSet() and HashSet(); then array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  void testAddCompositedWithSets_whenHashSetAndHashSet_thenArrayLengthIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> objectSet2 = new HashSet<>();
    Set<Object>[] sets = new Set[] {objectSet2, new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert that nothing has changed
    assertEquals(2, sets.length);
    assertTrue(sets[0].isEmpty());
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @DisplayName("Test addComposited(Set[]) with 'sets'; when HashSet(); then array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  void testAddCompositedWithSets_whenHashSet_thenArrayLengthIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    Set<Object>[] sets = new Set[] {new HashSet<>()};

    // Act
    objectSet.addComposited(sets);

    // Assert that nothing has changed
    assertEquals(1, sets.length);
    assertTrue(sets[0].isEmpty());
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#addComposited(Set[])} with {@code sets}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#addComposited(Set[])}
   */
  @Test
  @DisplayName("Test addComposited(Set[]) with 'sets'; when 'null'; then CompositeSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeSet.addComposited(Set[])"})
  void testAddCompositedWithSets_whenNull_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited((Set<Object>[]) null);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>When {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given CompositeSet() addComposited HashSet(); when 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  void testContains_givenCompositeSetAddCompositedHashSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.contains("Obj"));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given CompositeSet(); when 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  void testContains_givenCompositeSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.contains("Obj"));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given HashSet() add '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  void testContains_givenHashSetAdd42_when42_thenReturnTrue() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertTrue(objectSet.contains("42"));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add zero.
   *   <li>When {@link CompositeSet#CompositeSet()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given HashSet() add zero; when CompositeSet(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  void testContains_givenHashSetAddZero_whenCompositeSet_thenReturnFalse() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(0);

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertFalse(objectSet.contains(new CompositeSet<>()));
  }

  /**
   * Test {@link CompositeSet#contains(Object)}.
   *
   * <ul>
   *   <li>When {@link CompositeSet#CompositeSet()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); when CompositeSet(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.contains(Object)"})
  void testContains_whenCompositeSet_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.contains(new CompositeSet<>()));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.containsAll(coll));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.containsAll(coll));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  void testContainsAll_whenArrayList_thenReturnTrue() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#containsAll(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.containsAll(Collection)"})
  void testContainsAll_whenNull_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.containsAll(null));
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    assertEquals(objectSet.hashCode(), objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    assertEquals(objectSet.hashCode(), objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    assertEquals(objectSet.hashCode(), objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertNotEquals(objectSet, new CompositeSet<>());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, null);
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, "Different type to CompositeSet");
  }

  /**
   * Test {@link CompositeSet#getSets()}.
   *
   * <p>Method under test: {@link CompositeSet#getSets()}
   */
  @Test
  @DisplayName("Test getSets()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CompositeSet.getSets()"})
  void testGetSets() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.getSets().isEmpty());
  }

  /**
   * Test {@link CompositeSet#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CompositeSet() addComposited HashSet(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.isEmpty()"})
  void testIsEmpty_givenCompositeSetAddCompositedHashSet_thenReturnTrue() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CompositeSet(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.isEmpty()"})
  void testIsEmpty_givenCompositeSet_thenReturnTrue() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashSet() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.isEmpty()"})
  void testIsEmpty_givenHashSetAdd42_thenReturnFalse() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertFalse(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>Then return {@link IteratorChain}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#iterator()}
   */
  @Test
  @DisplayName(
      "Test iterator(); given CompositeSet() addComposited HashSet(); then return IteratorChain")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CompositeSet.iterator()"})
  void testIterator_givenCompositeSetAddCompositedHashSet_thenReturnIteratorChain() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act
    Iterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeSet#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>Then return {@link IteratorChain}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#iterator()}
   */
  @Test
  @DisplayName(
      "Test iterator(); given CompositeSet() addComposited HashSet(); then return IteratorChain")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CompositeSet.iterator()"})
  void testIterator_givenCompositeSetAddCompositedHashSet_thenReturnIteratorChain2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());

    // Act
    Iterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeSet#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>Then return {@link EmptyIterator}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#iterator()}
   */
  @Test
  @DisplayName("Test iterator(); given CompositeSet(); then return EmptyIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CompositeSet.iterator()"})
  void testIterator_givenCompositeSet_thenReturnEmptyIterator() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    Iterator<Object> actualIteratorResult = objectSet.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof EmptyIterator);
    assertFalse(actualIteratorResult.hasNext());
    assertSame(((EmptyIterator) actualIteratorResult).RESETTABLE_INSTANCE, actualIteratorResult);
  }

  /**
   * Test {@link CompositeSet#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>When {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given CompositeSet() addComposited HashSet(); when 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.remove(Object)"})
  void testRemove_givenCompositeSetAddCompositedHashSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.remove("Obj"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@code Obj}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given CompositeSet(); when 'Obj'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.remove(Object)"})
  void testRemove_givenCompositeSet_whenObj_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.remove("Obj"));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); given HashSet() add '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.remove(Object)"})
  void testRemove_givenHashSetAdd42_when42_thenReturnTrue() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    boolean actualRemoveResult = objectSet.remove("42");

    // Assert
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  void testRemoveAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  void testRemoveAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.removeAll(coll));
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  void testRemoveAll_whenArrayList() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#removeAll(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeAll(Collection)"})
  void testRemoveAll_whenNull() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeAll(null));
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); given CompositeSet() addComposited HashSet(); when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  void testRemoveIf_givenCompositeSetAddCompositedHashSet_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertFalse(objectSet.removeIf(mock(Predicate.class)));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate); given CompositeSet(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  void testRemoveIf_givenCompositeSet_whenNull_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeIf(null));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); given CompositeSet(); when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  void testRemoveIf_givenCompositeSet_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.removeIf(mock(Predicate.class)));
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.removeIf(Predicate)"})
  void testRemoveIf_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = objectSet.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    assertTrue(objectSet.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link CompositeSet#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
  }

  /**
   * Test {@link CompositeSet#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.retainAll(Collection)"})
  void testRetainAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectSet.retainAll(coll));
  }

  /**
   * Test {@link CompositeSet#retainAll(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeSet.retainAll(Collection)"})
  void testRetainAll_whenArrayList() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertFalse(objectSet.retainAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#size()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#size()}
   */
  @Test
  @DisplayName("Test size(); given CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CompositeSet.size()"})
  void testSize_givenCompositeSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.size());
  }

  /**
   * Test {@link CompositeSet#size()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#size()}
   */
  @Test
  @DisplayName("Test size(); given CompositeSet() addComposited HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CompositeSet.size()"})
  void testSize_givenCompositeSetAddCompositedHashSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertEquals(0, objectSet.size());
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>Then first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given CompositeSet(); then first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  void testToArrayWithObject_givenCompositeSet_thenFirstElementIsNull() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertNull(array[0]);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then first element is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given HashSet() add '42'; then first element is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  void testToArrayWithObject_givenHashSetAdd42_thenFirstElementIs42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertEquals("42", array[0]);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add two.
   *   <li>Then return second element is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given HashSet() add two; then return second element is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  void testToArrayWithObject_givenHashSetAddTwo_thenReturnSecondElementIs42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    Object[] actualToArrayResult = objectSet.toArray(new Object[] {"Array"});

    // Assert
    assertEquals("42", actualToArrayResult[1]);
    assertEquals(2, ((Integer) actualToArrayResult[0]).intValue());
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Then first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @DisplayName("Test toArray(Object[]) with 'Object[]'; then first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  void testToArrayWithObject_thenFirstElementIsNull() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = objectSet.toArray(array);

    // Assert
    assertNull(array[0]);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Test {@link CompositeSet#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When empty array of {@link Object}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; when empty array of Object; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray(Object[])"})
  void testToArrayWithObject_whenEmptyArrayOfObject_thenReturnArrayLengthIsZero() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.toArray(new Object[] {}).length);
  }

  /**
   * Test {@link CompositeSet#toArray()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray()}
   */
  @Test
  @DisplayName(
      "Test toArray(); given CompositeSet() addComposited HashSet(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray()"})
  void testToArray_givenCompositeSetAddCompositedHashSet_thenReturnArrayLengthIsZero() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertEquals(0, objectSet.toArray().length);
  }

  /**
   * Test {@link CompositeSet#toArray()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given CompositeSet(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray()"})
  void testToArray_givenCompositeSet_thenReturnArrayLengthIsZero() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(0, objectSet.toArray().length);
  }

  /**
   * Test {@link CompositeSet#toArray()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return first element is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given HashSet() add '42'; then return first element is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] CompositeSet.toArray()"})
  void testToArray_givenHashSetAdd42_thenReturnFirstElementIs42() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act
    Object[] actualToArrayResult = objectSet.toArray();

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Test {@link CompositeSet#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  @DisplayName("Test toSet(); given CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CompositeSet.toSet()"})
  void testToSet_givenCompositeSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Test {@link CompositeSet#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  @DisplayName("Test toSet(); given CompositeSet() addComposited HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CompositeSet.toSet()"})
  void testToSet_givenCompositeSetAddCompositedHashSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }

  /**
   * Test {@link CompositeSet#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeSet#toSet()}
   */
  @Test
  @DisplayName("Test toSet(); given CompositeSet() addComposited HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CompositeSet.toSet()"})
  void testToSet_givenCompositeSetAddCompositedHashSet2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());

    // Act and Assert
    assertTrue(objectSet.toSet().isEmpty());
  }
}
