package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnmodifiableBidiMapDiffblueTest {
  @Mock private BidiMap<?, ?> bidiMap;

  @InjectMocks private UnmodifiableBidiMap<Object, Object> unmodifiableBidiMap;

  /**
   * Test {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}.
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}
   */
  @Test
  @DisplayName("Test unmodifiableBidiMap(BidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BidiMap UnmodifiableBidiMap.unmodifiableBidiMap(BidiMap)"})
  void testUnmodifiableBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> map = new DualHashBidiMap<>();

    // Act
    BidiMap<Object, Object> actualUnmodifiableBidiMapResult =
        UnmodifiableBidiMap.unmodifiableBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableBidiMapResult);
  }

  /**
   * Test {@link UnmodifiableBidiMap#clear()}.
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#clear()}
   */
  @Test
  @DisplayName("Test clear()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableBidiMap.clear()"})
  void testClear() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableBidiMap.clear());
  }

  /**
   * Test {@link UnmodifiableBidiMap#inverseBidiMap()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BidiMap UnmodifiableBidiMap.inverseBidiMap()"})
  void testInverseBidiMap_thenReturnEmpty() {
    // Arrange
    org.mockito.Mockito.<BidiMap<?, ?>>when(bidiMap.inverseBidiMap())
        .thenReturn(new DualHashBidiMap<>());

    // Act
    BidiMap<Object, Object> actualInverseBidiMapResult = unmodifiableBidiMap.inverseBidiMap();

    // Assert
    verify(bidiMap).inverseBidiMap();
    assertTrue(actualInverseBidiMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableBidiMap#inverseBidiMap()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BidiMap UnmodifiableBidiMap.inverseBidiMap()"})
  void testInverseBidiMap_thenThrowUnsupportedOperationException() {
    // Arrange
    org.mockito.Mockito.<BidiMap<?, ?>>when(bidiMap.inverseBidiMap())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableBidiMap.inverseBidiMap());
    verify(bidiMap).inverseBidiMap();
  }

  /**
   * Test {@link UnmodifiableBidiMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link BidiMap} {@link BidiMap#keySet()} return {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given BidiMap keySet() return HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set UnmodifiableBidiMap.keySet()"})
  void testKeySet_givenBidiMapKeySetReturnHashSet_thenReturnEmpty() {
    // Arrange
    org.mockito.Mockito.<Set<?>>when(bidiMap.keySet()).thenReturn(new HashSet<>());

    // Act
    Set<Object> actualKeySetResult = unmodifiableBidiMap.keySet();

    // Assert
    verify(bidiMap).keySet();
    assertTrue(actualKeySetResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return UnmodifiableMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator UnmodifiableBidiMap.mapIterator()"})
  void testMapIterator_thenReturnUnmodifiableMapIterator() {
    // Arrange
    org.mockito.Mockito.<MapIterator<?, ?>>when(bidiMap.mapIterator())
        .thenReturn(new BidiMapIterator<>(new DualHashBidiMap<>()));

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = unmodifiableBidiMap.mapIterator();

    // Assert
    verify(bidiMap).mapIterator();
    assertTrue(actualMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator UnmodifiableBidiMap.mapIterator()"})
  void testMapIterator_thenThrowUnsupportedOperationException() {
    // Arrange
    org.mockito.Mockito.<MapIterator<?, ?>>when(bidiMap.mapIterator())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableBidiMap.mapIterator());
    verify(bidiMap).mapIterator();
  }

  /**
   * Test {@link UnmodifiableBidiMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableBidiMap.put(Object, Object)"})
  void testPut() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableBidiMap.put("Key", "Value"));
  }

  /**
   * Test {@link UnmodifiableBidiMap#putAll(Map)}.
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableBidiMap.putAll(Map)"})
  void testPutAll() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableBidiMap.putAll(new HashMap<>()));
  }

  /**
   * Test {@link UnmodifiableBidiMap#remove(Object)} with {@code Object}.
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableBidiMap.remove(Object)"})
  void testRemoveWithObject() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableBidiMap.remove("Key"));
  }

  /**
   * Test {@link UnmodifiableBidiMap#removeValue(Object)}.
   *
   * <p>Method under test: {@link UnmodifiableBidiMap#removeValue(Object)}
   */
  @Test
  @DisplayName("Test removeValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableBidiMap.removeValue(Object)"})
  void testRemoveValue() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableBidiMap.removeValue("Value"));
  }
}
