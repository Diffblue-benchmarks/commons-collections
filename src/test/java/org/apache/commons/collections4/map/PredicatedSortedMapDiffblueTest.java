package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeMap#TreeMap()} {@code 42} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSortedMap(SortedMap, Predicate, Predicate); given '42'; when TreeMap() '42' is NULL; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"})
  void testPredicatedSortedMap_given42_whenTreeMap42IsNull_thenCallsTest() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedMap<Object, Object> actualPredicatedSortedMapResult = PredicatedSortedMap.predicatedSortedMap(map,
        keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    assertEquals(actualPredicatedSortedMapResult.map, actualPredicatedSortedMapResult);
  }

  /**
   * Test {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeMap#TreeMap()} {@code foo} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSortedMap(SortedMap, Predicate, Predicate); given 'foo'; when TreeMap() 'foo' is NULL; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"})
  void testPredicatedSortedMap_givenFoo_whenTreeMapFooIsNull_thenCallsTest() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("foo", AbstractHashedMap.NULL);
    map.put("42", AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedMap<Object, Object> actualPredicatedSortedMapResult = PredicatedSortedMap.predicatedSortedMap(map,
        keyPredicate, valuePredicate);

    // Assert
    verify(keyPredicate, atLeast(1)).test(Mockito.<Object>any());
    verify(valuePredicate, atLeast(1)).test(isA(Object.class));
    assertEquals(actualPredicatedSortedMapResult.map, actualPredicatedSortedMapResult);
  }

  /**
   * Test {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedMap#predicatedSortedMap(SortedMap, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedSortedMap(SortedMap, Predicate, Predicate); when TreeMap(); then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedSortedMap PredicatedSortedMap.predicatedSortedMap(SortedMap, Predicate, Predicate)"})
  void testPredicatedSortedMap_whenTreeMap_thenReturnMap() {
    // Arrange and Act
    PredicatedSortedMap<Object, Object> actualPredicatedSortedMapResult = PredicatedSortedMap
        .predicatedSortedMap(new TreeMap<>(), mock(Predicate.class), mock(Predicate.class));

    // Assert
    assertEquals(actualPredicatedSortedMapResult.map, actualPredicatedSortedMapResult);
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeMap#TreeMap()} {@code 42} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); given '42'; when TreeMap() '42' is NULL; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_given42_whenTreeMap42IsNull_thenCallsTest() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("42", AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedMap<Object, Object> actualObjectObjectMap = new PredicatedSortedMap<>(map, keyPredicate,
        valuePredicate);

    // Assert
    verify(keyPredicate).test(isA(Object.class));
    verify(valuePredicate).test(isA(Object.class));
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeMap#TreeMap()} {@code foo} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); given 'foo'; when TreeMap() 'foo' is NULL; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_givenFoo_whenTreeMapFooIsNull_thenCallsTest() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.put("foo", AbstractHashedMap.NULL);
    map.put("42", AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedMap<Object, Object> actualObjectObjectMap = new PredicatedSortedMap<>(map, keyPredicate,
        valuePredicate);

    // Assert
    verify(keyPredicate, atLeast(1)).test(Mockito.<Object>any());
    verify(valuePredicate, atLeast(1)).test(isA(Object.class));
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}.
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedMap#PredicatedSortedMap(SortedMap, Predicate, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedSortedMap(SortedMap, Predicate, Predicate); when TreeMap(); then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedSortedMap.<init>(SortedMap, Predicate, Predicate)"})
  void testNewPredicatedSortedMap_whenTreeMap_thenReturnMap() {
    // Arrange and Act
    PredicatedSortedMap<Object, Object> actualObjectObjectMap = new PredicatedSortedMap<>(new TreeMap<>(),
        mock(Predicate.class), mock(Predicate.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
