package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedNavigableSetDiffblueTest {
  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedNavigableSet(NavigableSet, Predicate); given '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"
  })
  void testPredicatedNavigableSet_given42_thenThrowIllegalArgumentException() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedNavigableSet.predicatedNavigableSet(set, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code collection}.
   *   <li>When {@link TreeSet#TreeSet()} add {@code collection}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedNavigableSet(NavigableSet, Predicate); given 'collection'; when TreeSet() add 'collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"
  })
  void testPredicatedNavigableSet_givenCollection_whenTreeSetAddCollection() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");
    set.add("collection");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedNavigableSet.predicatedNavigableSet(set, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return {@link TreeSet#TreeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedNavigableSet#predicatedNavigableSet(NavigableSet,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedNavigableSet(NavigableSet, Predicate); when TreeSet(); then return TreeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedNavigableSet PredicatedNavigableSet.predicatedNavigableSet(NavigableSet, Predicate)"
  })
  void testPredicatedNavigableSet_whenTreeSet_thenReturnTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    PredicatedNavigableSet<Object> actualPredicatedNavigableSetResult =
        PredicatedNavigableSet.predicatedNavigableSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedNavigableSetResult);
  }

  /**
   * Test {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet, Predicate)}.
   *
   * <p>Method under test: {@link PredicatedNavigableSet#PredicatedNavigableSet(NavigableSet,
   * Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedNavigableSet(NavigableSet, Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedNavigableSet.<init>(NavigableSet, Predicate)"})
  void testNewPredicatedNavigableSet() {
    // Arrange and Act
    PredicatedNavigableSet<Object> actualObjectSet =
        new PredicatedNavigableSet<>(new TreeSet<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
