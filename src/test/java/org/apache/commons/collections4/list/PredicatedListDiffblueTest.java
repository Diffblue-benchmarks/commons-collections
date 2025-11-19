package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedListDiffblueTest {
  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedList(List, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> PredicatedList.predicatedList(list, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualPredicatedListResult =
        PredicatedList.predicatedList(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualPredicatedListResult =
        PredicatedList.predicatedList(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedList(List, Predicate); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    PredicatedList<Object> actualPredicatedListResult =
        PredicatedList.predicatedList(list, mock(Predicate.class));

    // Assert
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedList(List, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedList<>(list, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedList(List, Predicate); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, mock(Predicate.class));

    // Assert
    assertEquals(list, actualObjectList);
  }
}
