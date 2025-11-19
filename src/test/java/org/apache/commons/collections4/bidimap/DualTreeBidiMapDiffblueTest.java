package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedBidiMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.SortedBidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DualTreeBidiMapDiffblueTest {
  @Mock private AbstractDualBidiMap<Object, Object> abstractDualBidiMap;

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#getKey()}.
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiOrderedMapIterator.getKey()"})
  void testBidiOrderedMapIteratorGetKey() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.getKey());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#getValue()}.
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiOrderedMapIterator.getValue()"})
  void testBidiOrderedMapIteratorGetValue() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.getValue());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test BidiOrderedMapIterator hasNext(); given DualHashBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasNext()"})
  void testBidiOrderedMapIteratorHasNext_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(parent);

    // Act and Assert
    assertTrue(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasNext()"})
  void testBidiOrderedMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BidiOrderedMapIterator.hasPrevious()"})
  void testBidiOrderedMapIteratorHasPrevious() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiOrderedMapIterator.hasPrevious());
  }

  /**
   * Test BidiOrderedMapIterator {@link
   * BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link
   * BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator new BidiOrderedMapIterator(AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BidiOrderedMapIterator.<init>(AbstractDualBidiMap)"})
  void testBidiOrderedMapIteratorNewBidiOrderedMapIterator() {
    // Arrange
    when(abstractDualBidiMap.entrySet()).thenReturn(new HashSet<>());

    // Act
    BidiOrderedMapIterator<Object, Object> actualBidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(abstractDualBidiMap);

    // Assert
    verify(abstractDualBidiMap).entrySet();
    assertFalse(actualBidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link
   * BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link
   * BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator new BidiOrderedMapIterator(AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BidiOrderedMapIterator.<init>(AbstractDualBidiMap)"})
  void testBidiOrderedMapIteratorNewBidiOrderedMapIterator2() {
    // Arrange
    when(abstractDualBidiMap.entrySet()).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(
        IllegalStateException.class, () -> new BidiOrderedMapIterator<>(abstractDualBidiMap));
    verify(abstractDualBidiMap).entrySet();
  }

  /**
   * Test BidiOrderedMapIterator {@link
   * BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}.
   *
   * <ul>
   *   <li>When {@link DualHashBidiMap#DualHashBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BidiOrderedMapIterator#BidiOrderedMapIterator(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName(
      "Test BidiOrderedMapIterator new BidiOrderedMapIterator(AbstractDualBidiMap); when DualHashBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BidiOrderedMapIterator.<init>(AbstractDualBidiMap)"})
  void testBidiOrderedMapIteratorNewBidiOrderedMapIterator_whenDualHashBidiMap() {
    // Arrange and Act
    BidiOrderedMapIterator<Object, Object> actualBidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Assert
    assertFalse(actualBidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test BidiOrderedMapIterator next(); given DualHashBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiOrderedMapIterator.next()"})
  void testBidiOrderedMapIteratorNext_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(parent);

    // Act and Assert
    assertEquals("Key", bidiOrderedMapIterator.next());
    assertFalse(bidiOrderedMapIterator.hasNext());
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiOrderedMapIterator.setValue(Object)"})
  void testBidiOrderedMapIteratorSetValue() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiOrderedMapIterator.setValue("Value"));
  }

  /**
   * Test BidiOrderedMapIterator {@link BidiOrderedMapIterator#toString()}.
   *
   * <p>Method under test: {@link BidiOrderedMapIterator#toString()}
   */
  @Test
  @DisplayName("Test BidiOrderedMapIterator toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String BidiOrderedMapIterator.toString()"})
  void testBidiOrderedMapIteratorToString() {
    // Arrange
    BidiOrderedMapIterator<Object, Object> bidiOrderedMapIterator =
        new BidiOrderedMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", bidiOrderedMapIterator.toString());
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap()}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#DualTreeBidiMap()}
   */
  @Test
  @DisplayName("Test new DualTreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualTreeBidiMap.<init>()"})
  void testNewDualTreeBidiMap() {
    // Arrange and Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Comparator, Comparator)}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Comparator, Comparator)}
   */
  @Test
  @DisplayName("Test new DualTreeBidiMap(Comparator, Comparator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Comparator, Comparator)"})
  void testNewDualTreeBidiMap2() {
    // Arrange and Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap =
        new DualTreeBidiMap<>(mock(Comparator.class), mock(Comparator.class));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map, Map, BidiMap)}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @DisplayName("Test new DualTreeBidiMap(Map, Map, BidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map, Map, BidiMap)"})
  void testNewDualTreeBidiMap3() {
    // Arrange
    TreeMap<Object, Object> normalMap = new TreeMap<>();
    TreeMap<Object, Object> reverseMap = new TreeMap<>();
    DualHashBidiMap<Object, Object> inverseBidiMap = new DualHashBidiMap<>();

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap =
        new DualTreeBidiMap<>(normalMap, reverseMap, inverseBidiMap);

    // Assert
    Map<Object, Object> objectObjectMap = actualObjectObjectMap.normalMap;
    assertEquals(objectObjectMap, inverseBidiMap);
    assertEquals(objectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new DualTreeBidiMap(Map); given '42'; when HashMap() '42' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  void testNewDualTreeBidiMap_given42_whenHashMap42IsValue_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "Value");
    map.put("Key", "Value");

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(map);

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertEquals("Value", actualObjectObjectMap.get("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  @DisplayName(
      "Test new DualTreeBidiMap(Map); given 'Key'; when HashMap() 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  void testNewDualTreeBidiMap_givenKey_whenHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(map);

    // Assert
    assertEquals(1, actualObjectObjectMap.size());
    assertEquals("Value", actualObjectObjectMap.get("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#DualTreeBidiMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#DualTreeBidiMap(Map)}
   */
  @Test
  @DisplayName("Test new DualTreeBidiMap(Map); when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DualTreeBidiMap.<init>(Map)"})
  void testNewDualTreeBidiMap_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    DualTreeBidiMap<Object, Object> actualObjectObjectMap = new DualTreeBidiMap<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link DualTreeBidiMap#comparator()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#comparator()}
   */
  @Test
  @DisplayName("Test comparator(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparator DualTreeBidiMap.comparator()"})
  void testComparator_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.comparator());
  }

  /**
   * Test {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#createBidiMap(Map, Map, BidiMap)}
   */
  @Test
  @DisplayName("Test createBidiMap(Map, Map, BidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DualTreeBidiMap DualTreeBidiMap.createBidiMap(Map, Map, BidiMap)"})
  void testCreateBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    TreeMap<Object, Object> normalMap = new TreeMap<>();
    TreeMap<Object, Object> reverseMap = new TreeMap<>();

    // Act
    DualTreeBidiMap<Object, Object> actualCreateBidiMapResult =
        objectObjectMap.createBidiMap(normalMap, reverseMap, new DualHashBidiMap<>());

    // Assert
    assertEquals(objectObjectMap, actualCreateBidiMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given DualTreeBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DualTreeBidiMap.firstKey()"})
  void testFirstKey_givenDualTreeBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.firstKey());
  }

  /**
   * Test {@link DualTreeBidiMap#headMap(Object)}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#headMap(Object)}
   */
  @Test
  @DisplayName("Test headMap(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.headMap(Object)"})
  void testHeadMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedMap<Object, Object> actualHeadMapResult = objectObjectMap.headMap("To Key");

    // Assert
    assertEquals(objectObjectMap, actualHeadMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#inverseBidiMap()}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBidiMap DualTreeBidiMap.inverseBidiMap()"})
  void testInverseBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualInverseBidiMapResult = objectObjectMap.inverseBidiMap();

    // Assert
    assertSame(objectObjectMap.inverseBidiMap, actualInverseBidiMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#inverseOrderedBidiMap()}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#inverseOrderedBidiMap()}
   */
  @Test
  @DisplayName("Test inverseOrderedBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedBidiMap DualTreeBidiMap.inverseOrderedBidiMap()"})
  void testInverseOrderedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    OrderedBidiMap<Object, Object> actualInverseOrderedBidiMapResult =
        objectObjectMap.inverseOrderedBidiMap();

    // Assert
    assertSame(objectObjectMap.inverseBidiMap, actualInverseOrderedBidiMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#inverseSortedBidiMap()}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#inverseSortedBidiMap()}
   */
  @Test
  @DisplayName("Test inverseSortedBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBidiMap DualTreeBidiMap.inverseSortedBidiMap()"})
  void testInverseSortedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualInverseSortedBidiMapResult =
        objectObjectMap.inverseSortedBidiMap();

    // Assert
    assertSame(objectObjectMap.inverseBidiMap, actualInverseSortedBidiMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given DualTreeBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DualTreeBidiMap.lastKey()"})
  void testLastKey_givenDualTreeBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.lastKey());
  }

  /**
   * Test {@link DualTreeBidiMap#mapIterator()}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator DualTreeBidiMap.mapIterator()"})
  void testMapIterator() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof BidiOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link DualTreeBidiMap#nextKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given DualTreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DualTreeBidiMap.nextKey(Object)"})
  void testNextKey_givenDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#nextKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given DualTreeBidiMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DualTreeBidiMap.nextKey(Object)"})
  void testNextKey_givenDualTreeBidiMapKeyIsValue() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectObjectMap.nextKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given DualTreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  void testPreviousKey_givenDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualTreeBidiMap#DualTreeBidiMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given DualTreeBidiMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DualTreeBidiMap.previousKey(Object)"})
  void testPreviousKey_givenDualTreeBidiMapKeyIsValue() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectObjectMap.previousKey("Key"));
  }

  /**
   * Test {@link DualTreeBidiMap#subMap(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code From Key}.
   *   <li>Then return {@link DualTreeBidiMap#DualTreeBidiMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#subMap(Object, Object)}
   */
  @Test
  @DisplayName("Test subMap(Object, Object); when 'From Key'; then return DualTreeBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.subMap(Object, Object)"})
  void testSubMap_whenFromKey_thenReturnDualTreeBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedMap<Object, Object> actualSubMapResult = objectObjectMap.subMap("From Key", "To Key");

    // Assert
    assertEquals(objectObjectMap, actualSubMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#tailMap(Object)}.
   *
   * <p>Method under test: {@link DualTreeBidiMap#tailMap(Object)}
   */
  @Test
  @DisplayName("Test tailMap(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap DualTreeBidiMap.tailMap(Object)"})
  void testTailMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act
    SortedMap<Object, Object> actualTailMapResult = objectObjectMap.tailMap("From Key");

    // Assert
    assertEquals(objectObjectMap, actualTailMapResult);
  }

  /**
   * Test {@link DualTreeBidiMap#valueComparator()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DualTreeBidiMap#valueComparator()}
   */
  @Test
  @DisplayName("Test valueComparator(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparator DualTreeBidiMap.valueComparator()"})
  void testValueComparator_thenReturnNull() {
    // Arrange
    DualTreeBidiMap<Object, Object> objectObjectMap = new DualTreeBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.valueComparator());
  }

  /**
   * Test ViewMap {@link ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}.
   *
   * <p>Method under test: {@link ViewMap#ViewMap(DualTreeBidiMap, SortedMap)}
   */
  @Test
  @DisplayName("Test ViewMap new ViewMap(DualTreeBidiMap, SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ViewMap.<init>(DualTreeBidiMap, SortedMap)"})
  void testViewMapNewViewMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> bidi = new DualTreeBidiMap<>();

    // Act
    ViewMap<Object, Object> actualObjectObjectMap = new ViewMap<>(bidi, new TreeMap<>());

    // Assert
    assertEquals(bidi, actualObjectObjectMap);
  }
}
