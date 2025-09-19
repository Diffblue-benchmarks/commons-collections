package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedSortedMapDiffblueTest {
  /**
   * Test {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedMap(SortedMap, Predicate, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"
  })
  void testPredicatedSortedMap_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedSortedMap.predicatedSortedMap(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedMap(SortedMap, Predicate, Predicate); given 'true'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"
  })
  void testPredicatedSortedMap_givenTrue_thenThrowIllegalArgumentException() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedSortedMap.predicatedSortedMap(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedMap(SortedMap, Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"
  })
  void testPredicatedSortedMap_givenTrue_whenPredicateTestReturnTrue_thenReturnMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedMap<Object, Object> actualPredicatedSortedMapResult =
        PredicatedSortedMap.predicatedSortedMap(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    Map<Object, Object> expectedPredicatedSortedMapResult = actualPredicatedSortedMapResult.map;
    assertEquals(expectedPredicatedSortedMapResult, actualPredicatedSortedMapResult);
  }

  /**
   * Test {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedMap(SortedMap, Predicate, Predicate); when TreeMap(); then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"
  })
  void testPredicatedSortedMap_whenTreeMap_thenReturnMap() {
    // Arrange and Act
    PredicatedSortedMap<Object, Object> actualPredicatedSortedMapResult =
        PredicatedSortedMap.predicatedSortedMap(
            new TreeMap<>(), mock(Predicate.class), mock(Predicate.class));

    // Assert
    Map<Object, Object> expectedPredicatedSortedMapResult = actualPredicatedSortedMapResult.map;
    assertEquals(expectedPredicatedSortedMapResult, actualPredicatedSortedMapResult);
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); given 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_givenFalse_thenThrowIllegalArgumentException() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new PredicatedSortedMap<>(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); given 'true'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_givenTrue_thenThrowIllegalArgumentException() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new PredicatedSortedMap<>(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_givenTrue_whenPredicateTestReturnTrue_thenReturnMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedMap<Object, Object> actualObjectObjectMap =
        new PredicatedSortedMap<>(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate,
   * Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); when TreeMap(); then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_whenTreeMap_thenReturnMap() {
    // Arrange and Act
    PredicatedSortedMap<Object, Object> actualObjectObjectMap =
        new PredicatedSortedMap<>(new TreeMap<>(), mock(Predicate.class), mock(Predicate.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }
}
