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
import org.apache.commons.collections4.OrderedBidiMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnmodifiableOrderedBidiMapDiffblueTest {
  @Mock private OrderedBidiMap<?, ?> orderedBidiMap;

  @InjectMocks private UnmodifiableOrderedBidiMap<Object, Object> unmodifiableOrderedBidiMap;

  /**
   * Test {@link UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}.
   *
   * <p>Method under test: {@link
   * UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}
   */
  @Test
  @DisplayName("Test unmodifiableOrderedBidiMap(OrderedBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OrderedBidiMap UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(OrderedBidiMap)"
  })
  void testUnmodifiableOrderedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> map = new DualTreeBidiMap<>();

    // Act
    OrderedBidiMap<Object, Object> actualUnmodifiableOrderedBidiMapResult =
        UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableOrderedBidiMapResult);
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#clear()}.
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#clear()}
   */
  @Test
  @DisplayName("Test clear()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableOrderedBidiMap.clear()"})
  void testClear() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableOrderedBidiMap.clear());
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#inverseBidiMap()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedBidiMap UnmodifiableOrderedBidiMap.inverseBidiMap()"})
  void testInverseBidiMap_thenReturnEmpty() {
    // Arrange
    org.mockito.Mockito.<OrderedBidiMap<?, ?>>when(orderedBidiMap.inverseBidiMap())
        .thenReturn(new DualTreeBidiMap<>());

    // Act
    OrderedBidiMap<Object, Object> actualInverseBidiMapResult =
        unmodifiableOrderedBidiMap.inverseBidiMap();

    // Assert
    verify(orderedBidiMap).inverseBidiMap();
    assertTrue(actualInverseBidiMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#inverseBidiMap()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedBidiMap UnmodifiableOrderedBidiMap.inverseBidiMap()"})
  void testInverseBidiMap_thenThrowUnsupportedOperationException() {
    // Arrange
    org.mockito.Mockito.<OrderedBidiMap<?, ?>>when(orderedBidiMap.inverseBidiMap())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableOrderedBidiMap.inverseBidiMap());
    verify(orderedBidiMap).inverseBidiMap();
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#inverseOrderedBidiMap()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#inverseOrderedBidiMap()}
   */
  @Test
  @DisplayName("Test inverseOrderedBidiMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedBidiMap UnmodifiableOrderedBidiMap.inverseOrderedBidiMap()"})
  void testInverseOrderedBidiMap_thenReturnEmpty() {
    // Arrange
    org.mockito.Mockito.<OrderedBidiMap<?, ?>>when(orderedBidiMap.inverseBidiMap())
        .thenReturn(new DualTreeBidiMap<>());

    // Act
    OrderedBidiMap<Object, Object> actualInverseOrderedBidiMapResult =
        unmodifiableOrderedBidiMap.inverseOrderedBidiMap();

    // Assert
    verify(orderedBidiMap).inverseBidiMap();
    assertTrue(actualInverseOrderedBidiMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#inverseOrderedBidiMap()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#inverseOrderedBidiMap()}
   */
  @Test
  @DisplayName("Test inverseOrderedBidiMap(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedBidiMap UnmodifiableOrderedBidiMap.inverseOrderedBidiMap()"})
  void testInverseOrderedBidiMap_thenThrowUnsupportedOperationException() {
    // Arrange
    org.mockito.Mockito.<OrderedBidiMap<?, ?>>when(orderedBidiMap.inverseBidiMap())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableOrderedBidiMap.inverseOrderedBidiMap());
    verify(orderedBidiMap).inverseBidiMap();
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link OrderedBidiMap} {@link OrderedBidiMap#keySet()} return {@link
   *       HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given OrderedBidiMap keySet() return HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set UnmodifiableOrderedBidiMap.keySet()"})
  void testKeySet_givenOrderedBidiMapKeySetReturnHashSet_thenReturnEmpty() {
    // Arrange
    org.mockito.Mockito.<Set<?>>when(orderedBidiMap.keySet()).thenReturn(new HashSet<>());

    // Act
    Set<Object> actualKeySetResult = unmodifiableOrderedBidiMap.keySet();

    // Assert
    verify(orderedBidiMap).keySet();
    assertTrue(actualKeySetResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableOrderedMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return UnmodifiableOrderedMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator UnmodifiableOrderedBidiMap.mapIterator()"})
  void testMapIterator_thenReturnUnmodifiableOrderedMapIterator() {
    // Arrange
    org.mockito.Mockito.<OrderedMapIterator<?, ?>>when(orderedBidiMap.mapIterator())
        .thenReturn(new BidiOrderedMapIterator<>(new DualHashBidiMap<>()));

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult =
        unmodifiableOrderedBidiMap.mapIterator();

    // Assert
    verify(orderedBidiMap).mapIterator();
    assertTrue(actualMapIteratorResult instanceof UnmodifiableOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator UnmodifiableOrderedBidiMap.mapIterator()"})
  void testMapIterator_thenThrowUnsupportedOperationException() {
    // Arrange
    org.mockito.Mockito.<OrderedMapIterator<?, ?>>when(orderedBidiMap.mapIterator())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableOrderedBidiMap.mapIterator());
    verify(orderedBidiMap).mapIterator();
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableOrderedBidiMap.put(Object, Object)"})
  void testPut() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableOrderedBidiMap.put("Key", "Value"));
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#putAll(Map)}.
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableOrderedBidiMap.putAll(Map)"})
  void testPutAll() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableOrderedBidiMap.putAll(new HashMap<>()));
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#remove(Object)} with {@code Object}.
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableOrderedBidiMap.remove(Object)"})
  void testRemoveWithObject() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableOrderedBidiMap.remove("Key"));
  }

  /**
   * Test {@link UnmodifiableOrderedBidiMap#removeValue(Object)}.
   *
   * <p>Method under test: {@link UnmodifiableOrderedBidiMap#removeValue(Object)}
   */
  @Test
  @DisplayName("Test removeValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableOrderedBidiMap.removeValue(Object)"})
  void testRemoveValue() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableOrderedBidiMap.removeValue("Value"));
  }
}
