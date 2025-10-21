package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedMapDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  public void testPredicatedMap_given42_whenHashMap42IsNull_thenReturnMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  public void testPredicatedMap_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PredicatedMap.predicatedMap(map, keyPredicate, valuePredicate));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  public void testPredicatedMap_givenFalse_whenPredicateTestReturnFalse2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  public void testPredicatedMap_givenIllegalArgumentExceptionWithMap() {
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
   *   <li>Given {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#predicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  public void testPredicatedMap_givenNull_whenHashMapNullIsNull_thenReturnMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedMap PredicatedMap.predicatedMap(Map, Predicate, Predicate)"})
  public void testPredicatedMap_whenHashMap_thenReturnMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  public void testNewPredicatedMap_given42_whenHashMap42IsNull_thenReturnMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  public void testNewPredicatedMap_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Predicate<Object> keyPredicate = mock(Predicate.class);
    when(keyPredicate.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> valuePredicate = mock(Predicate.class);
    when(valuePredicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedMap<>(map, keyPredicate, valuePredicate));

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  public void testNewPredicatedMap_givenFalse_whenPredicateTestReturnFalse2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  public void testNewPredicatedMap_givenIllegalArgumentExceptionWithMap() {
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
   *   <li>Given {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedMap#PredicatedMap(Map, Predicate, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  public void testNewPredicatedMap_givenNull_whenHashMapNullIsNull_thenReturnMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedMap.<init>(Map, Predicate, Predicate)"})
  public void testNewPredicatedMap_whenHashMap_thenReturnMap() {
    // Arrange and Act
    PredicatedMap<Object, Object> actualObjectObjectMap = new PredicatedMap<>(new HashMap<>(), mock(Predicate.class),
        mock(Predicate.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
