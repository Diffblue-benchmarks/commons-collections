package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.SortedBidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UnmodifiableSortedBidiMapDiffblueTest {
  @Mock private SortedBidiMap<Object, ?> sortedBidiMap;

  @InjectMocks private UnmodifiableSortedBidiMap<Object, Object> unmodifiableSortedBidiMap;

  /**
   * Test {@link UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}.
   *
   * <p>Method under test: {@link
   * UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBidiMap(SortedBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SortedBidiMap UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(SortedBidiMap)"
  })
  void testUnmodifiableSortedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> map = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualUnmodifiableSortedBidiMapResult =
        UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableSortedBidiMapResult);
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#clear()}.
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#clear()}
   */
  @Test
  @DisplayName("Test clear()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableSortedBidiMap.clear()"})
  void testClear() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.clear());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#headMap(Object)}.
   *
   * <ul>
   *   <li>Given {@link SortedBidiMap} {@link SortedBidiMap#headMap(Object)} return {@link
   *       TreeMap#TreeMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#headMap(Object)}
   */
  @Test
  @DisplayName(
      "Test headMap(Object); given SortedBidiMap headMap(Object) return TreeMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap UnmodifiableSortedBidiMap.headMap(Object)"})
  void testHeadMap_givenSortedBidiMapHeadMapReturnTreeMap_thenReturnEmpty() {
    // Arrange
    Mockito.<SortedMap<Object, ?>>when(sortedBidiMap.headMap(Mockito.<Object>any()))
        .thenReturn(new TreeMap<>());

    // Act
    SortedMap<Object, Object> actualHeadMapResult = unmodifiableSortedBidiMap.headMap("To Key");

    // Assert
    verify(sortedBidiMap).headMap(isA(Object.class));
    assertTrue(actualHeadMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#headMap(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#headMap(Object)}
   */
  @Test
  @DisplayName("Test headMap(Object); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap UnmodifiableSortedBidiMap.headMap(Object)"})
  void testHeadMap_thenThrowUnsupportedOperationException() {
    // Arrange
    Mockito.<SortedMap<Object, ?>>when(sortedBidiMap.headMap(Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.headMap("To Key"));
    verify(sortedBidiMap).headMap(isA(Object.class));
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#inverseBidiMap()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBidiMap UnmodifiableSortedBidiMap.inverseBidiMap()"})
  void testInverseBidiMap_thenReturnEmpty() {
    // Arrange
    Mockito.<SortedBidiMap<?, Object>>when(sortedBidiMap.inverseBidiMap())
        .thenReturn(new DualTreeBidiMap<>());

    // Act
    SortedBidiMap<Object, Object> actualInverseBidiMapResult =
        unmodifiableSortedBidiMap.inverseBidiMap();

    // Assert
    verify(sortedBidiMap).inverseBidiMap();
    assertTrue(actualInverseBidiMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#inverseBidiMap()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBidiMap UnmodifiableSortedBidiMap.inverseBidiMap()"})
  void testInverseBidiMap_thenThrowUnsupportedOperationException() {
    // Arrange
    Mockito.<SortedBidiMap<?, Object>>when(sortedBidiMap.inverseBidiMap())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.inverseBidiMap());
    verify(sortedBidiMap).inverseBidiMap();
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link SortedBidiMap} {@link SortedBidiMap#keySet()} return {@link
   *       HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given SortedBidiMap keySet() return HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set UnmodifiableSortedBidiMap.keySet()"})
  void testKeySet_givenSortedBidiMapKeySetReturnHashSet_thenReturnEmpty() {
    // Arrange
    when(sortedBidiMap.keySet()).thenReturn(new HashSet<>());

    // Act
    Set<Object> actualKeySetResult = unmodifiableSortedBidiMap.keySet();

    // Assert
    verify(sortedBidiMap).keySet();
    assertTrue(actualKeySetResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableOrderedMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return UnmodifiableOrderedMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator UnmodifiableSortedBidiMap.mapIterator()"})
  void testMapIterator_thenReturnUnmodifiableOrderedMapIterator() {
    // Arrange
    Mockito.<OrderedMapIterator<Object, ?>>when(sortedBidiMap.mapIterator())
        .thenReturn(new BidiOrderedMapIterator<>(new DualHashBidiMap<>()));

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult =
        unmodifiableSortedBidiMap.mapIterator();

    // Assert
    verify(sortedBidiMap).mapIterator();
    assertTrue(actualMapIteratorResult instanceof UnmodifiableOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator UnmodifiableSortedBidiMap.mapIterator()"})
  void testMapIterator_thenThrowUnsupportedOperationException() {
    // Arrange
    Mockito.<OrderedMapIterator<Object, ?>>when(sortedBidiMap.mapIterator())
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.mapIterator());
    verify(sortedBidiMap).mapIterator();
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#put(Object, Object)}.
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableSortedBidiMap.put(Object, Object)"})
  void testPut() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.put("Key", "Value"));
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#putAll(Map)}.
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableSortedBidiMap.putAll(Map)"})
  void testPutAll() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableSortedBidiMap.putAll(new HashMap<>()));
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#remove(Object)} with {@code Object}.
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableSortedBidiMap.remove(Object)"})
  void testRemoveWithObject() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.remove("Key"));
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#removeValue(Object)}.
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#removeValue(Object)}
   */
  @Test
  @DisplayName("Test removeValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableSortedBidiMap.removeValue(Object)"})
  void testRemoveValue() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.removeValue("Value"));
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#subMap(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link SortedBidiMap} {@link SortedBidiMap#subMap(Object, Object)} return {@link
   *       TreeMap#TreeMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#subMap(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test subMap(Object, Object); given SortedBidiMap subMap(Object, Object) return TreeMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap UnmodifiableSortedBidiMap.subMap(Object, Object)"})
  void testSubMap_givenSortedBidiMapSubMapReturnTreeMap_thenReturnEmpty() {
    // Arrange
    Mockito.<SortedMap<Object, ?>>when(
            sortedBidiMap.subMap(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(new TreeMap<>());

    // Act
    SortedMap<Object, Object> actualSubMapResult =
        unmodifiableSortedBidiMap.subMap("From Key", "To Key");

    // Assert
    verify(sortedBidiMap).subMap(isA(Object.class), isA(Object.class));
    assertTrue(actualSubMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#subMap(Object, Object)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#subMap(Object, Object)}
   */
  @Test
  @DisplayName("Test subMap(Object, Object); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap UnmodifiableSortedBidiMap.subMap(Object, Object)"})
  void testSubMap_thenThrowUnsupportedOperationException() {
    // Arrange
    Mockito.<SortedMap<Object, ?>>when(
            sortedBidiMap.subMap(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> unmodifiableSortedBidiMap.subMap("From Key", "To Key"));
    verify(sortedBidiMap).subMap(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#tailMap(Object)}.
   *
   * <ul>
   *   <li>Given {@link SortedBidiMap} {@link SortedBidiMap#tailMap(Object)} return {@link
   *       TreeMap#TreeMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#tailMap(Object)}
   */
  @Test
  @DisplayName(
      "Test tailMap(Object); given SortedBidiMap tailMap(Object) return TreeMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap UnmodifiableSortedBidiMap.tailMap(Object)"})
  void testTailMap_givenSortedBidiMapTailMapReturnTreeMap_thenReturnEmpty() {
    // Arrange
    Mockito.<SortedMap<Object, ?>>when(sortedBidiMap.tailMap(Mockito.<Object>any()))
        .thenReturn(new TreeMap<>());

    // Act
    SortedMap<Object, Object> actualTailMapResult = unmodifiableSortedBidiMap.tailMap("From Key");

    // Assert
    verify(sortedBidiMap).tailMap(isA(Object.class));
    assertTrue(actualTailMapResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableSortedBidiMap#tailMap(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableSortedBidiMap#tailMap(Object)}
   */
  @Test
  @DisplayName("Test tailMap(Object); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap UnmodifiableSortedBidiMap.tailMap(Object)"})
  void testTailMap_thenThrowUnsupportedOperationException() {
    // Arrange
    Mockito.<SortedMap<Object, ?>>when(sortedBidiMap.tailMap(Mockito.<Object>any()))
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> unmodifiableSortedBidiMap.tailMap("From Key"));
    verify(sortedBidiMap).tailMap(isA(Object.class));
  }
}
