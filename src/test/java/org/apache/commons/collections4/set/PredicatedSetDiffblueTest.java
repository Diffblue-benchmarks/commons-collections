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
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedSetDiffblueTest {
  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSet(Set, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PredicatedSet.predicatedSet(set, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSet(Set, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_givenTrue_whenPredicateTestReturnTrue_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualPredicatedSetResult = PredicatedSet.predicatedSet(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSet(Set, Predicate); given two; when HashSet() add two; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    set.add(2);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualPredicatedSetResult = PredicatedSet.predicatedSet(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link PredicatedSet#predicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#predicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSet(Set, Predicate); when HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedSet PredicatedSet.predicatedSet(Set, Predicate)"})
  void testPredicatedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    PredicatedSet<Object> actualPredicatedSetResult =
        PredicatedSet.predicatedSet(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualPredicatedSetResult);
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSet(Set, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  void testNewPredicatedSet_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedSet<>(set, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSet(Set, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  void testNewPredicatedSet_givenTrue_whenPredicateTestReturnTrue_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualObjectSet = new PredicatedSet<>(set, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link HashSet#HashSet()} add two.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSet(Set, Predicate); given two; when HashSet() add two; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  void testNewPredicatedSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");
    set.add(2);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSet<Object> actualObjectSet = new PredicatedSet<>(set, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(set, actualObjectSet);
  }

  /**
   * Test {@link PredicatedSet#PredicatedSet(Set, Predicate)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSet#PredicatedSet(Set, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSet(Set, Predicate); when HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSet.<init>(Set, Predicate)"})
  void testNewPredicatedSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act
    PredicatedSet<Object> actualObjectSet = new PredicatedSet<>(set, mock(Predicate.class));

    // Assert
    assertEquals(set, actualObjectSet);
  }
}
