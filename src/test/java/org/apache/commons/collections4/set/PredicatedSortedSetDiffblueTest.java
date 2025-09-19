package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedSortedSetDiffblueTest {
  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code collection}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code collection}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedSet(SortedSet, Predicate); given 'collection'; when TreeSet() add 'collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"
  })
  void testPredicatedSortedSet_givenCollection_whenTreeSetAddCollection() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("collection");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualPredicatedSortedSetResult =
        PredicatedSortedSet.predicatedSortedSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedSet(SortedSet, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"
  })
  void testPredicatedSortedSet_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedSortedSet.predicatedSortedSet(set, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedSet(SortedSet, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"
  })
  void testPredicatedSortedSet_givenTrue_whenPredicateTestReturnTrue_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualPredicatedSortedSetResult =
        PredicatedSortedSet.predicatedSortedSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#predicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedSet(SortedSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedSet PredicatedSortedSet.predicatedSortedSet(SortedSet, Predicate)"
  })
  void testPredicatedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    PredicatedSortedSet<Object> actualPredicatedSortedSetResult =
        PredicatedSortedSet.predicatedSortedSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedSortedSetResult);
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code collection}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code collection}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedSet(SortedSet, Predicate); given 'collection'; when TreeSet() add 'collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_givenCollection_whenTreeSetAddCollection() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("collection");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualObjectSet = new PredicatedSortedSet<>(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedSet(SortedSet, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedSortedSet<>(set, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedSet(SortedSet, Predicate); given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedSet<Object> actualObjectSet = new PredicatedSortedSet<>(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedSet#PredicatedSortedSet(SortedSet, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedSet(SortedSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedSet.<init>(SortedSet, Predicate)"})
  void testNewPredicatedSortedSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    PredicatedSortedSet<Object> actualObjectSet =
        new PredicatedSortedSet<>(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }
}
