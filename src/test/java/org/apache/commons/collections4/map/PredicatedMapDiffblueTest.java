package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedMapDiffblueTest {
  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedMap.predicatedMap(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedMap.predicatedMap(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} one is {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedMap(Map, Predicate, Predicate); given one; when HashMap() one is NULL; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenOne_whenHashMapOneIsNull_thenReturnMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(1, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMap<Object, Object> actualPredicatedMapResult =
        PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate, atLeast(1)).test(Mockito.<Object>any());
    verify(valuePredicate, atLeast(1)).test(isA(Object.class));
    Map<Object, Object> expectedPredicatedMapResult = actualPredicatedMapResult.map;
    assertEquals(expectedPredicatedMapResult, actualPredicatedMapResult);
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedMap(Map, Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenTrue_whenPredicateTestReturnTrue_thenReturnMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMap<Object, Object> actualPredicatedMapResult =
        PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    Map<Object, Object> expectedPredicatedMapResult = actualPredicatedMapResult.map;
    assertEquals(expectedPredicatedMapResult, actualPredicatedMapResult);
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); when HashMap(); then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_whenHashMap_thenReturnMap() {
    // Arrange and Act
    PredicatedMap<Object, Object> actualPredicatedMapResult =
        PredicatedMap.predicatedMap(new HashMap<>(), mock(Predicate.class), mock(Predicate.class));

    // Assert
    Map<Object, Object> expectedPredicatedMapResult = actualPredicatedMapResult.map;
    assertEquals(expectedPredicatedMapResult, actualPredicatedMapResult);
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new PredicatedMap<>(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenFalse_whenPredicateTestReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new PredicatedMap<>(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedMap(Map, Predicate, Predicate); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new PredicatedMap<>(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedMap(Map, Predicate, Predicate); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new PredicatedMap<>(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} one is {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedMap(Map, Predicate, Predicate); given one; when HashMap() one is NULL; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenOne_whenHashMapOneIsNull_thenReturnMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(1, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMap<Object, Object> actualObjectObjectMap =
        new PredicatedMap<>(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate, atLeast(1)).test(Mockito.<Object>any());
    verify(valuePredicate, atLeast(1)).test(isA(Object.class));
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedMap(Map, Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenTrue_whenPredicateTestReturnTrue_thenReturnMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMap<Object, Object> actualObjectObjectMap =
        new PredicatedMap<>(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link AbstractMapDecorator#map}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); when HashMap(); then return map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_whenHashMap_thenReturnMap() {
    // Arrange and Act
    PredicatedMap<Object, Object> actualObjectObjectMap =
        new PredicatedMap<>(new HashMap<>(), mock(Predicate.class), mock(Predicate.class));

    // Assert
    Map<Object, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedMap#isSetValueChecking()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#isSetValueChecking()}
   */
  @Test
  @DisplayName("Test isSetValueChecking(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PredicatedMap.isSetValueChecking()"})
  void testIsSetValueChecking_thenReturnFalse() {
    // Arrange
    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), mock(Predicate.class), null);

    // Act and Assert
    assertFalse(objectObjectMap.isSetValueChecking());
  }

  /**
   * Test {@link PredicatedMap#isSetValueChecking()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#isSetValueChecking()}
   */
  @Test
  @DisplayName("Test isSetValueChecking(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PredicatedMap.isSetValueChecking()"})
  void testIsSetValueChecking_thenReturnTrue() {
    // Arrange
    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), mock(Predicate.class), mock(Predicate.class));

    // Act and Assert
    assertTrue(objectObjectMap.isSetValueChecking());
  }

  /**
   * Test {@link PredicatedMap#validate(Object, Object)}.
   *
   * <p>Method under test: {@link PredicatedMap#validate(Object, Object)}
   */
  @Test
  @DisplayName("Test validate(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.validate(Object, Object)"})
  void testValidate() {
    // Arrange
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);
    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), null, valuePredicate);

    // Act
    objectObjectMap.validate(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#validate(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#validate(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test validate(Object, Object); given Predicate test(Object) return 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.validate(Object, Object)"})
  void testValidate_givenPredicateTestReturnFalse_thenThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);
    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), keyPredicate, mock(Predicate.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> objectObjectMap.validate(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#validate(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#validate(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test validate(Object, Object); given Predicate test(Object) return 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.validate(Object, Object)"})
  void testValidate_givenPredicateTestReturnFalse_thenThrowIllegalArgumentException2() {
    // Arrange
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(false);

    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), keyPredicate, valuePredicate);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> objectObjectMap.validate(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#validate(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#validate(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test validate(Object, Object); given Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.validate(Object, Object)"})
  void testValidate_givenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), keyPredicate, valuePredicate);

    // Act
    objectObjectMap.validate(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#validate(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#validate(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test validate(Object, Object); given Predicate test(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.validate(Object, Object)"})
  void testValidate_givenPredicateTestThrowIllegalArgumentException() {
    // Arrange
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), null, valuePredicate);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> objectObjectMap.validate(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#validate(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedMap#validate(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test validate(Object, Object); given Predicate test(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedMap.validate(Object, Object)"})
  void testValidate_givenPredicateTestThrowIllegalArgumentException2() {
    // Arrange
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    PredicatedMap<Object, Object> objectObjectMap =
        new PredicatedMap<>(new HashMap<>(), keyPredicate, mock(Predicate.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> objectObjectMap.validate(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(keyPredicate).test(isA(Object.class));
  }
}
