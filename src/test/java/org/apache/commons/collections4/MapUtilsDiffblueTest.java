package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MapUtilsDiffblueTest {
  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenHashMap() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenNull() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#fixedSizeMap(Map)}.
   * <p>
   * Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IterableMap MapUtils.fixedSizeMap(Map)"})
  void testFixedSizeMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(map);

    // Assert
    assertEquals(map, actualFixedSizeMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SortedMap MapUtils.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(map);

    // Assert
    assertEquals(map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Function apply(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenFalse_whenFunctionApplyReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; when HashMap() '42' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenOne_whenHashMap42IsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Function apply(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenTrue_whenFunctionApplyReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenTrue_whenHashMap42IsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given zero; when HashMap() '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenZero_whenHashMap42IsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getBoolean(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_given42_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenTrue_whenHashMap42IsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenZero_whenHashMap42IsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenFalse_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBoolean(new HashMap<>(), "Key", false));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenHashMap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBoolean(new HashMap<>(), "Key", true));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBoolean(null, "Key", true));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_given42_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenOne_whenHashMap42IsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; given 'true'; when HashMap() '42' is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenTrue_whenHashMap42IsTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; given zero; when HashMap() '42' is zero; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenZero_whenHashMap42IsZero_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; when HashMap() '42' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenOne_whenHashMap42IsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenTrue_whenHashMap42IsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given zero; when HashMap() '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenZero_whenHashMap42IsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getBooleanValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(null, "Key", null));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key", null));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() '42' is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenTrue_whenHashMap42IsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() '42' is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenZero_whenHashMap42IsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenFalse_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key", false));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBooleanValue(new HashMap<>(), "Key", true));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MapUtils.getBooleanValue(null, "Key", true));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_given42_whenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenOne_whenHashMap42IsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object) with 'map', 'key'; given 'true'; when HashMap() '42' is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenTrue_whenHashMap42IsTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is zero.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object) with 'map', 'key'; given zero; when HashMap() '42' is zero; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenZero_whenHashMap42IsZero_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getBooleanValue(Map, Object) with 'map', 'key'; when HashMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenHashMap_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getByte(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals('A', MapUtils.getByte(null, (byte) 'A', new ConstantTransformer<>((byte) 'A')).byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getByte(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class))));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; when HashMap() '42' is 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_given42_whenHashMap42IsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", mock(Function.class)).byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code A}.</li>
   *   <li>Then calls {@link Factory#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; when Factory get() return 'A'; then calls get()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenA_whenFactoryGetReturnA_thenCallsGet() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A',
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then calls {@link Function#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'; then calls apply(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class)));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then return byteValue is {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then return byteValue is '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42", mock(Function.class)).byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code A}.</li>
   *   <li>Then calls {@link Function#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'A'; then calls apply(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenFunctionApplyReturnA_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(null, "Key", (Function<Object, Byte>) null));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return byteValue is {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() '42' is 'A'; then return byteValue is 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenA_whenHashMap42IsA_thenReturnByteValueIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Then return byteValue is {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; then return byteValue is '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return byteValue is {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return byteValue is 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenHashMap_thenReturnByteValueIsA() {
    // Arrange, Act and Assert
    assertEquals('A', MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A').byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return byteValue is {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when 'null'; then return byteValue is 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenNull_thenReturnByteValueIsA() {
    // Arrange, Act and Assert
    assertEquals('A', MapUtils.getByte(null, "Key", (byte) 'A').byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return byteValue is {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return byteValue is '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_given42_whenHashMap42Is42_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42").byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return byteValue is {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return byteValue is 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenA_whenHashMap42IsA_thenReturnByteValueIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42").byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getByteValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A', new ConstantTransformer<>((byte) 'A')));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class))));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given '42'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_given42_whenHashMap42IsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Byte> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Byte> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class)));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return {@code A}.</li>
   *   <li>Then calls {@link Factory#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return 'A'; then calls get()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenFactoryGetReturnA_thenCallsGet() {
    // Arrange
    Factory<Byte> factory = mock(Factory.class);
    when(factory.get()).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenFunctionApplyReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key", null));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key", null));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenA_whenHashMap42IsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'; then return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap_thenReturnA() {
    // Arrange, Act and Assert
    assertEquals('A', MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A'));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when 'null'; then return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenNull_thenReturnA() {
    // Arrange, Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, "Key", (byte) 'A'));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_given42_whenHashMap42Is42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return 'A'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenA_whenHashMap42IsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return doubleValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return doubleValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42", mock(Function.class)).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then return doubleValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then return doubleValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42", mock(Function.class)).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getDouble(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenFunctionApplyReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", mock(Function.class)).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(null, "Key", (Function<Object, Double>) null));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return doubleValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'A'; then return doubleValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Then return doubleValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; then return doubleValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return doubleValue is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when HashMap(); then return doubleValue is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenHashMap_thenReturnDoubleValueIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(new HashMap<>(), "Key", 10.0d).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return doubleValue is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when 'null'; then return doubleValue is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenNull_thenReturnDoubleValueIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(null, "Key", 10.0d).doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return doubleValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return doubleValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenA_whenHashMap42IsA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42").doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   *   <li>Then return doubleValue is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return doubleValue is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenTen_whenHashMap42IsTen_thenReturnDoubleValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42").doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return doubleValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when HashMap() '42' is '42'; then return doubleValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap42Is42_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42").doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getDoubleValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is ten; then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenHashMap42IsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key", null));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key", null));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42", 10.0d));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", 10.0d));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", 10.0d));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42", 10.0d));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenNull_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(null, "Key", 10.0d));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenTen_whenHashMap42IsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return floatValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return floatValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42", mock(Function.class)).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then return floatValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then return floatValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42", mock(Function.class)).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getFloat(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenFunctionApplyReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", mock(Function.class)).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(null, "Key", (Function<Object, Float>) null));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return floatValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'A'; then return floatValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Then return floatValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; then return floatValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return floatValue is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when HashMap(); then return floatValue is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenHashMap_thenReturnFloatValueIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(new HashMap<>(), "Key", 10.0f).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return floatValue is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when 'null'; then return floatValue is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenNull_thenReturnFloatValueIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(null, "Key", 10.0f).floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return floatValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return floatValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_given42_whenHashMap42Is42_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42").floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return floatValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return floatValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenA_whenHashMap42IsA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42").floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   *   <li>Then return floatValue is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return floatValue is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenTen_whenHashMap42IsTen_thenReturnFloatValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42").floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getFloatValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenFunctionApplyReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is ten; then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenHashMap42IsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key", null));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key", null));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42", 10.0f));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", 10.0f));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() '42' is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenTen_whenHashMap42IsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", 10.0f));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42", 10.0f));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenNull_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(null, "Key", 10.0f));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is ten.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; given ten; when HashMap() '42' is ten; then return ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenTen_whenHashMap42IsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return intValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return intValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42", mock(Function.class)).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then return intValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then return intValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_thenReturnIntValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", mock(Function.class)).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getInteger(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenFunctionApplyReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenHashMap42IsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42", mock(Function.class)).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return intValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'A'; then return intValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then return intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given one; then return intValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return intValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap(); then return intValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap_thenReturnIntValueIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42, MapUtils.getInteger(new HashMap<>(), "Key", 42).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return intValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when 'null'; then return intValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenNull_thenReturnIntValueIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42, MapUtils.getInteger(null, "Key", 42).intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return intValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return intValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_given42_whenHashMap42Is42_thenReturnIntValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return intValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return intValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenA_whenHashMap42IsA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return intValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenOne_whenHashMap42IsOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getIntValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenFunctionApplyReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is one; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenHashMap42IsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(null, "Key", null));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key", null));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given one; when HashMap() '42' is one; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenOne_whenHashMap42IsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42, MapUtils.getIntValue(new HashMap<>(), "Key", 42));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42, MapUtils.getIntValue(null, "Key", 42));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; given one; when HashMap() '42' is one; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenOne_whenHashMap42IsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(1L, MapUtils.getLong(null, 1L, new ConstantTransformer<>(1L)).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLong(null, 1L, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class))));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return longValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return longValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42", mock(Function.class)).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L,
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then calls {@link Function#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'; then calls apply(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class)));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Then return longValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then return longValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_thenReturnLongValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", mock(Function.class)).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.</li>
   *   <li>Then calls {@link Factory#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(null, 1L, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.</li>
   *   <li>Then calls {@link Function#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one; then calls apply(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenFunctionApplyReturnOne_thenCallsApply() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenKey_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(null, "Key", (Function<Object, Long>) null));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_given42_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return longValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'A'; then return longValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return longValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when HashMap(); then return longValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenHashMap_thenReturnLongValueIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42L, MapUtils.getLong(new HashMap<>(), "Key", 42L).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return longValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when 'null'; then return longValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenNull_thenReturnLongValueIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42L, MapUtils.getLong(null, "Key", 42L).longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return longValue is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return longValue is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_given42_whenHashMap42Is42_thenReturnLongValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42").longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return longValue is sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return longValue is sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenA_whenHashMap42IsA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42").longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLongValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction2() {
    // Arrange, Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L, new ConstantTransformer<>(1L)));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction3() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(factory)));
    verify(factory).get();
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class))));
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Transformer<Object, Long> falseTransformer = mock(Transformer.class);
    when(falseTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, mock(Transformer.class), falseTransformer));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(falseTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");
    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "42", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; when Predicate test(Object) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Transformer<Object, Long> trueTransformer = mock(Transformer.class);
    when(trueTransformer.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, mock(Transformer.class)));

    // Assert
    verify(predicate).test(isA(Object.class));
    verify(trueTransformer).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Factory} {@link Factory#get()} return one.</li>
   *   <li>Then calls {@link Factory#get()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Factory get() return one; then calls get()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenFactoryGetReturnOne_thenCallsGet() {
    // Arrange
    Factory<Long> factory = mock(Factory.class);
    when(factory.get()).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(factory));

    // Assert
    verify(factory).get();
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when Function apply(Object) return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenFunctionApplyReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", mock(Function.class)));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key", null));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code defaultFunction}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'Key'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenKey_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, "Key", null));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() '42' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_given42_whenHashMap42Is42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'foo'; when HashMap() '42' is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenFoo_whenHashMap42IsFoo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42L, MapUtils.getLongValue(new HashMap<>(), "Key", 42L));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42L, MapUtils.getLongValue(null, "Key", 42L));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() '42' is '42'; then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_given42_whenHashMap42Is42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code A}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code A}.</li>
   *   <li>Then return sixty-five.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() '42' is 'A'; then return sixty-five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenA_whenHashMap42IsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code foo}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; given 'foo'; when HashMap() '42' is 'foo'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenFoo_whenHashMap42IsFoo_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenHashMap() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenNull() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }
}
