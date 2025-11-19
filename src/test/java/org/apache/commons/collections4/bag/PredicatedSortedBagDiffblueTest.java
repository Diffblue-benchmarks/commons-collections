package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedSortedBagDiffblueTest {
  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"
  })
  void testPredicatedSortedBag_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedSortedBag.predicatedSortedBag(bag, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"
  })
  void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBagResult =
        PredicatedSortedBag.predicatedSortedBag(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"
  })
  void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBagResult =
        PredicatedSortedBag.predicatedSortedBag(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"
  })
  void testPredicatedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBagResult =
        PredicatedSortedBag.predicatedSortedBag(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedBag(SortedBag, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  void testNewPredicatedSortedBag_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedSortedBag<>(bag, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedBag(SortedBag, Predicate); given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  void testNewPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBag =
        new PredicatedSortedBag<>(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBag);
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedBag(SortedBag, Predicate); given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  void testNewPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBag =
        new PredicatedSortedBag<>(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBag);
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedBag(SortedBag, Predicate); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  void testNewPredicatedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBag =
        new PredicatedSortedBag<>(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedSortedBag);
  }
}
