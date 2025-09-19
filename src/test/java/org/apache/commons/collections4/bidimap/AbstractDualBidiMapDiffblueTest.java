package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.cache.RemovalNotification;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractDualBidiMapDiffblueTest {
  /**
   * Test BidiMapIterator {@link BidiMapIterator#getKey()}.
   *
   * <p>Method under test: {@link BidiMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test BidiMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiMapIterator.getKey()"})
  void testBidiMapIteratorGetKey() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.getKey());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#getValue()}.
   *
   * <p>Method under test: {@link BidiMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test BidiMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiMapIterator.getValue()"})
  void testBidiMapIteratorGetValue() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.getValue());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BidiMapIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test BidiMapIterator hasNext(); given DualHashBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BidiMapIterator.hasNext()"})
  void testBidiMapIteratorHasNext_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(parent);

    // Act and Assert
    assertTrue(bidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BidiMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test BidiMapIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BidiMapIterator.hasNext()"})
  void testBidiMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#BidiMapIterator(AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link BidiMapIterator#BidiMapIterator(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test BidiMapIterator new BidiMapIterator(AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BidiMapIterator.<init>(AbstractDualBidiMap)"})
  void testBidiMapIteratorNewBidiMapIterator() {
    // Arrange and Act
    BidiMapIterator<Object, Object> actualBidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Assert
    assertFalse(actualBidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link BidiMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test BidiMapIterator next(); given DualHashBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiMapIterator.next()"})
  void testBidiMapIteratorNext_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(parent);

    // Act and Assert
    assertEquals("Key", bidiMapIterator.next());
    assertFalse(bidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#remove()}.
   *
   * <p>Method under test: {@link BidiMapIterator#remove()}
   */
  @Test
  @DisplayName("Test BidiMapIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BidiMapIterator.remove()"})
  void testBidiMapIteratorRemove() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.remove());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link BidiMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test BidiMapIterator setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BidiMapIterator.setValue(Object)"})
  void testBidiMapIteratorSetValue() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.setValue("Value"));
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#toString()}.
   *
   * <p>Method under test: {@link BidiMapIterator#toString()}
   */
  @Test
  @DisplayName("Test BidiMapIterator toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String BidiMapIterator.toString()"})
  void testBidiMapIteratorToString() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator =
        new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", bidiMapIterator.toString());
  }

  /**
   * Test {@link AbstractDualBidiMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given DualHashBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsKey(Object)"})
  void testContainsKey_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertTrue(objectObjectMap.containsKey("Key"));
  }

  /**
   * Test {@link AbstractDualBidiMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given DualHashBidiMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsKey(Object)"})
  void testContainsKey_givenDualHashBidiMap_thenReturnFalse() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey("Key"));
  }

  /**
   * Test {@link AbstractDualBidiMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given DualHashBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsValue(Object)"})
  void testContainsValue_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertTrue(objectObjectMap.containsValue("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given DualHashBidiMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsValue(Object)"})
  void testContainsValue_givenDualHashBidiMap_thenReturnFalse() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#createEntrySetIterator(Iterator)}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#createEntrySetIterator(Iterator)}
   */
  @Test
  @DisplayName("Test createEntrySetIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractDualBidiMap.createEntrySetIterator(Iterator)"})
  void testCreateEntrySetIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();

    // Act
    Iterator<Entry<Object, Object>> actualCreateEntrySetIteratorResult =
        objectObjectMap.createEntrySetIterator(entryList.iterator());

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof EntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#createKeySetIterator(Iterator)}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#createKeySetIterator(Iterator)}
   */
  @Test
  @DisplayName("Test createKeySetIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractDualBidiMap.createKeySetIterator(Iterator)"})
  void testCreateKeySetIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult =
        objectObjectMap.createKeySetIterator(objectList.iterator());

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof KeySetIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#createValuesIterator(Iterator)}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#createValuesIterator(Iterator)}
   */
  @Test
  @DisplayName("Test createValuesIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractDualBidiMap.createValuesIterator(Iterator)"})
  void testCreateValuesIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult =
        objectObjectMap.createValuesIterator(objectList.iterator());

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof ValuesIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#entrySet()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractDualBidiMap.entrySet()"})
  void testEntrySet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(Iterator, AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link EntrySetIterator#EntrySetIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test EntrySetIterator new EntrySetIterator(Iterator, AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetIterator.<init>(Iterator, AbstractDualBidiMap)"})
  void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange
    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();
    Iterator<Entry<Object, Object>> iterator = entryList.iterator();

    // Act
    EntrySetIterator<Object, Object> actualEntrySetIterator =
        new EntrySetIterator<>(iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   *
   * <p>Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @DisplayName("Test EntrySetIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry EntrySetIterator.next()"})
  void testEntrySetIteratorNext() {
    // Arrange
    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();
    entryList.add(new SimpleEntry<>("42", "42"));
    Iterator<Entry<Object, Object>> iterator = entryList.iterator();
    EntrySetIterator<Object, Object> entrySetIterator =
        new EntrySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act
    Entry<Object, Object> actualNextResult = entrySetIterator.next();

    // Assert
    assertSame(entrySetIterator.last, actualNextResult);
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#remove()}.
   *
   * <p>Method under test: {@link EntrySetIterator#remove()}
   */
  @Test
  @DisplayName("Test EntrySetIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetIterator.remove()"})
  void testEntrySetIteratorRemove() {
    // Arrange
    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();
    Iterator<Entry<Object, Object>> iterator = entryList.iterator();
    EntrySetIterator<Object, Object> entrySetIterator =
        new EntrySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test EntrySet {@link EntrySet#EntrySet(AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link EntrySet#EntrySet(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test EntrySet new EntrySet(AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySet.<init>(AbstractDualBidiMap)"})
  void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object, Object> actualObjectSet = new EntrySet<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test EntrySet {@link EntrySet#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} IfAbsent {@code 42} is {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySet#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test EntrySet remove(Object); given DualHashBidiMap() IfAbsent '42' is '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySet.remove(Object)"})
  void testEntrySetRemove_givenDualHashBidiMapIfAbsent42Is42_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.putIfAbsent("42", "42");
    EntrySet<Object, Object> objectSet = new EntrySet<>(parent);

    // Act
    boolean actualRemoveResult = objectSet.remove(new SimpleEntry<>("42", "42"));

    // Assert
    assertTrue(actualRemoveResult);
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test EntrySet {@link EntrySet#remove(Object)}.
   *
   * <ul>
   *   <li>Then {@link EntrySet#EntrySet(AbstractDualBidiMap)} with parent is {@link
   *       DualHashBidiMap#DualHashBidiMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link EntrySet#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test EntrySet remove(Object); then EntrySet(AbstractDualBidiMap) with parent is DualHashBidiMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySet.remove(Object)"})
  void testEntrySetRemove_thenEntrySetWithParentIsDualHashBidiMapSizeIsOne() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("42", "Value");
    EntrySet<Object, Object> objectSet = new EntrySet<>(parent);

    // Act
    boolean actualRemoveResult = objectSet.remove(new SimpleEntry<>("42", "42"));

    // Assert
    assertEquals(1, objectSet.size());
    assertFalse(actualRemoveResult);
  }

  /**
   * Test EntrySet {@link EntrySet#remove(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySet#remove(Object)}
   */
  @Test
  @DisplayName("Test EntrySet remove(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySet.remove(Object)"})
  void testEntrySetRemove_thenReturnFalse() {
    // Arrange
    EntrySet<Object, Object> objectSet = new EntrySet<>(new DualHashBidiMap<>());

    // Act
    boolean actualRemoveResult = objectSet.remove(new SimpleEntry<>("42", "42"));

    // Assert
    assertFalse(actualRemoveResult);
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}, and {@link AbstractDualBidiMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractDualBidiMap.equals(Object)",
    "int AbstractDualBidiMap.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    DualHashBidiMap<Object, Object> objectObjectMap2 = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}, and {@link AbstractDualBidiMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractDualBidiMap.equals(Object)",
    "int AbstractDualBidiMap.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    DualHashBidiMap<Object, Object> objectObjectMap2 = new DualHashBidiMap<>();
    objectObjectMap2.put("Key", "Value");

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}, and {@link AbstractDualBidiMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractDualBidiMap.equals(Object)",
    "int AbstractDualBidiMap.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractDualBidiMap.equals(Object)",
    "int AbstractDualBidiMap.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNotEquals(objectObjectMap, new DualHashBidiMap<>());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractDualBidiMap.equals(Object)",
    "int AbstractDualBidiMap.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractDualBidiMap.equals(Object)",
    "int AbstractDualBidiMap.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractDualBidiMap");
  }

  /**
   * Test {@link AbstractDualBidiMap#get(Object)}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.get(Object)"})
  void testGet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get("Key"));
  }

  /**
   * Test {@link AbstractDualBidiMap#getKey(Object)}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#getKey(Object)}
   */
  @Test
  @DisplayName("Test getKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.getKey(Object)"})
  void testGetKey() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getKey("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#inverseBidiMap()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#inverseBidiMap()}
   */
  @Test
  @DisplayName("Test inverseBidiMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BidiMap AbstractDualBidiMap.inverseBidiMap()"})
  void testInverseBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    BidiMap<Object, Object> actualInverseBidiMapResult = objectObjectMap.inverseBidiMap();

    // Assert
    assertSame(objectObjectMap.inverseBidiMap, actualInverseBidiMapResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given DualHashBidiMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractDualBidiMap.isEmpty()"})
  void testIsEmpty_givenDualHashBidiMapKeyIsValue_thenReturnFalse() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given DualHashBidiMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractDualBidiMap.isEmpty()"})
  void testIsEmpty_givenDualHashBidiMap_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#keySet()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractDualBidiMap.keySet()"})
  void testKeySet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test KeySet {@link KeySet#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KeySet#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test KeySet contains(Object); given DualHashBidiMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeySet.contains(Object)"})
  void testKeySetContains_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    KeySet<Object> objectSet = new KeySet<>(parent);

    // Act and Assert
    assertTrue(objectSet.contains("Key"));
  }

  /**
   * Test KeySet {@link KeySet#contains(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KeySet#contains(Object)}
   */
  @Test
  @DisplayName("Test KeySet contains(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeySet.contains(Object)"})
  void testKeySetContains_thenReturnFalse() {
    // Arrange
    KeySet<Object> objectSet = new KeySet<>(new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(objectSet.contains("Key"));
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#KeySetIterator(Iterator, AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link KeySetIterator#KeySetIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test KeySetIterator new KeySetIterator(Iterator, AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySetIterator.<init>(Iterator, AbstractDualBidiMap)"})
  void testKeySetIteratorNewKeySetIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    KeySetIterator<Object> actualKeySetIterator =
        new KeySetIterator<>(iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @DisplayName("Test KeySetIterator next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  void testKeySetIteratorNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act
    Object actualNextResult = keySetIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(keySetIterator.lastKey, actualNextResult);
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#remove()}.
   *
   * <p>Method under test: {@link KeySetIterator#remove()}
   */
  @Test
  @DisplayName("Test KeySetIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySetIterator.remove()"})
  void testKeySetIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> keySetIterator.remove());
  }

  /**
   * Test KeySet {@link KeySet#KeySet(AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link KeySet#KeySet(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test KeySet new KeySet(AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySet.<init>(AbstractDualBidiMap)"})
  void testKeySetNewKeySet() {
    // Arrange and Act
    KeySet<Object> actualObjectSet = new KeySet<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test MapEntry {@link MapEntry#MapEntry(Entry, AbstractDualBidiMap)}.
   *
   * <ul>
   *   <li>Then return {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code 42}
   *       and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapEntry#MapEntry(Entry, AbstractDualBidiMap)}
   */
  @Test
  @DisplayName(
      "Test MapEntry new MapEntry(Entry, AbstractDualBidiMap); then return SimpleEntry(Object, Object) with '42' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapEntry.<init>(Entry, AbstractDualBidiMap)"})
  void testMapEntryNewMapEntry_thenReturnSimpleEntryWith42And42() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    // Act
    MapEntry<Object, Object> actualMapEntry = new MapEntry<>(entry, new DualHashBidiMap<>());

    // Assert
    assertEquals(entry, actualMapEntry);
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test MapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  void testMapEntrySetValue() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");
    MapEntry<Object, Object> mapEntry = new MapEntry<>(entry, new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    AbstractDualBidiMap<Object, Object> objectObjectMap = mapEntry.parent;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("42"));
    assertEquals("Value", mapEntry.getValue());
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test MapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  void testMapEntrySetValue2() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("42", "Value");
    MapEntry<Object, Object> mapEntry = new MapEntry<>(new SimpleEntry<>("42", "42"), parent);

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    assertEquals("Value", mapEntry.getValue());
    AbstractDualBidiMap<Object, Object> objectObjectMap = mapEntry.parent;
    assertEquals(1, objectObjectMap.size());
    assertTrue(objectObjectMap.containsKey("42"));
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test MapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  void testMapEntrySetValue3() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");
    MapEntry<Object, Object> entry2 = new MapEntry<>(entry, new DualHashBidiMap<>());
    MapEntry<Object, Object> mapEntry = new MapEntry<>(entry2, new DualHashBidiMap<>());

    // Act
    mapEntry.setValue("Value");

    // Assert
    AbstractDualBidiMap<Object, Object> objectObjectMap = mapEntry.parent;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("42"));
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test MapEntry setValue(Object); given DualHashBidiMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  void testMapEntrySetValue_givenDualHashBidiMapKeyIsValue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    MapEntry<Object, Object> mapEntry = new MapEntry<>(new SimpleEntry<>("42", "42"), parent);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> mapEntry.setValue("Value"));
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   *
   * <ul>
   *   <li>Then calls {@link RemovalNotification#getKey()}.
   * </ul>
   *
   * <p>Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test MapEntry setValue(Object); then calls getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  void testMapEntrySetValue_thenCallsGetKey() {
    // Arrange
    RemovalNotification<Object, Object> entry = mock(RemovalNotification.class);
    when(entry.getKey()).thenThrow(new IllegalArgumentException());
    MapEntry<Object, Object> mapEntry = new MapEntry<>(entry, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> mapEntry.setValue("Value"));
    verify(entry).getKey();
  }

  /**
   * Test {@link AbstractDualBidiMap#mapIterator()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractDualBidiMap.mapIterator()"})
  void testMapIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof BidiMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object); given DualHashBidiMap() 'Key' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.put(Object, Object)"})
  void testPut_givenDualHashBidiMapKeyIsValue_thenReturnValue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertEquals("Value", actualPutResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} one is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object); given DualHashBidiMap() one is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.put(Object, Object)"})
  void testPut_givenDualHashBidiMapOneIsValue_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put(1, "Value");

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); given DualHashBidiMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.put(Object, Object)"})
  void testPut_givenDualHashBidiMap_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} IfAbsent {@code 42} is {@code 42}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given DualHashBidiMap() IfAbsent '42' is '42'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  void testPutAll_givenDualHashBidiMapIfAbsent42Is42_thenHashMapSizeIsOne() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.putIfAbsent("42", "42");

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(1, map.size());
    assertTrue(map.containsKey("42"));
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given DualHashBidiMap(); when HashMap() '42' is '42'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  void testPutAll_givenDualHashBidiMap_whenHashMap42Is42_thenHashMapSizeIsOne() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(1, map.size());
    assertTrue(map.containsKey("42"));
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then {@link DualHashBidiMap#DualHashBidiMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given DualHashBidiMap(); when HashMap(); then DualHashBidiMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  void testPutAll_givenDualHashBidiMap_whenHashMap_thenDualHashBidiMapEmpty() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertTrue(objectObjectMap.isEmpty());
    assertEquals(objectObjectMap, map);
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given forty-two.
   *   <li>When {@link HashMap#HashMap()} forty-two is {@code 42}.
   *   <li>Then {@link HashMap#HashMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given forty-two; when HashMap() forty-two is '42'; then HashMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  void testPutAll_givenFortyTwo_whenHashMapFortyTwoIs42_thenHashMapSizeIsTwo() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(42, "42");
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(2, map.size());
    assertTrue(map.containsKey("42"));
    assertTrue(map.containsKey(42));
  }

  /**
   * Test {@link AbstractDualBidiMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'Object'; given DualHashBidiMap() 'Key' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.remove(Object)"})
  void testRemoveWithObject_givenDualHashBidiMapKeyIsValue_thenReturnValue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Value", objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'; given DualHashBidiMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.remove(Object)"})
  void testRemoveWithObject_givenDualHashBidiMap_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#removeValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#removeValue(Object)}
   */
  @Test
  @DisplayName(
      "Test removeValue(Object); given DualHashBidiMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.removeValue(Object)"})
  void testRemoveValue_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.removeValue("Value"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#removeValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDualBidiMap#removeValue(Object)}
   */
  @Test
  @DisplayName("Test removeValue(Object); given DualHashBidiMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDualBidiMap.removeValue(Object)"})
  void testRemoveValue_givenDualHashBidiMap_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeValue("Value"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#size()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDualBidiMap.size()"})
  void testSize() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link AbstractDualBidiMap#toString()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractDualBidiMap.toString()"})
  void testToString() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link AbstractDualBidiMap#values()}.
   *
   * <p>Method under test: {@link AbstractDualBidiMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractDualBidiMap.values()"})
  void testValues() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#ValuesIterator(Iterator, AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link ValuesIterator#ValuesIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test ValuesIterator new ValuesIterator(Iterator, AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValuesIterator.<init>(Iterator, AbstractDualBidiMap)"})
  void testValuesIteratorNewValuesIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    ValuesIterator<Object> actualValuesIterator =
        new ValuesIterator<>(iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @DisplayName("Test ValuesIterator next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  void testValuesIteratorNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(iterator, new DualHashBidiMap<>());

    // Act
    Object actualNextResult = valuesIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(valuesIterator.lastValue, actualNextResult);
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#remove()}.
   *
   * <p>Method under test: {@link ValuesIterator#remove()}
   */
  @Test
  @DisplayName("Test ValuesIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValuesIterator.remove()"})
  void testValuesIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> valuesIterator.remove());
  }

  /**
   * Test Values {@link Values#Values(AbstractDualBidiMap)}.
   *
   * <p>Method under test: {@link Values#Values(AbstractDualBidiMap)}
   */
  @Test
  @DisplayName("Test Values new Values(AbstractDualBidiMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Values.<init>(AbstractDualBidiMap)"})
  void testValuesNewValues() {
    // Arrange and Act
    Values<Object> actualObjectSet = new Values<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
