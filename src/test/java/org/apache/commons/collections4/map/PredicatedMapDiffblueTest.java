package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given '42'; when HashMap() '42' is NULL; then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_given42_whenHashMap42IsNull_thenReturnMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", AbstractHashedMap.NULL);
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMap<Object, Object> actualPredicatedMapResult = PredicatedMap.predicatedMap(map, keyPredicate,
        valuePredicate);

    // Assert
    verify(keyPredicate, atLeast(1)).test(Mockito.<Object>any());
    verify(valuePredicate, atLeast(1)).test(isA(Object.class));
    assertEquals(actualPredicatedMapResult.map, actualPredicatedMapResult);
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> PredicatedMap.predicatedMap(map, keyPredicate, mock(Predicate.class)));
    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
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
    assertThrows(IllegalArgumentException.class, () -> PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given IllegalArgumentException(String) with 'map'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_givenIllegalArgumentExceptionWithMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("map"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate));
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return map")
  @Tag("MaintainedByDiffblue")
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
    PredicatedMap<Object, Object> actualPredicatedMapResult = PredicatedMap.predicatedMap(map, keyPredicate,
        valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    assertEquals(actualPredicatedMapResult.map, actualPredicatedMapResult);
  }

  /**
   * Test {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedMap(Map, Predicate, Predicate); when HashMap(); then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  void testPredicatedMap_whenHashMap_thenReturnMap() {
    // Arrange and Act
    PredicatedMap<Object, Object> actualPredicatedMapResult = PredicatedMap.predicatedMap(new HashMap<>(),
        mock(Predicate.class), mock(Predicate.class));

    // Assert
    assertEquals(actualPredicatedMapResult.map, actualPredicatedMapResult);
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); given '42'; when HashMap() '42' is NULL; then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_given42_whenHashMap42IsNull_thenReturnMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", AbstractHashedMap.NULL);
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedMap<Object, Object> actualObjectObjectMap = new PredicatedMap<>(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate, atLeast(1)).test(Mockito.<Object>any());
    verify(valuePredicate, atLeast(1)).test(isA(Object.class));
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedMap<>(map, keyPredicate, mock(Predicate.class)));

    verify(keyPredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
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
    assertThrows(IllegalArgumentException.class, () -> new PredicatedMap<>(map, keyPredicate, valuePredicate));

    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); given IllegalArgumentException(String) with 'map'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_givenIllegalArgumentExceptionWithMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("map"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedMap<>(map, keyPredicate, valuePredicate));

    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return map")
  @Tag("MaintainedByDiffblue")
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
    PredicatedMap<Object, Object> actualObjectObjectMap = new PredicatedMap<>(map, keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedMap(Map, Predicate, Predicate); when HashMap(); then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  void testNewPredicatedMap_whenHashMap_thenReturnMap() {
    // Arrange and Act
    PredicatedMap<Object, Object> actualObjectObjectMap = new PredicatedMap<>(new HashMap<>(), mock(Predicate.class),
        mock(Predicate.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
