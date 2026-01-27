package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.map.AbstractHashedMap.EntrySet;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractHashedMap.KeySet;
import org.apache.commons.collections4.map.AbstractHashedMap.Values;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry;
import org.apache.commons.collections4.map.IdentityMap.IdentityEntry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractHashedMapDiffblueTest {
  /**
   * Test EntrySet {@link EntrySet#EntrySet(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link EntrySet#EntrySet(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test EntrySet new EntrySet(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySet.<init>(AbstractHashedMap)"})
  void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object, Object> actualObjectSet = new EntrySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractHashedMap#AbstractHashedMap()}
   *   <li>{@link AbstractHashedMap#init()}
   *   <li>{@link AbstractHashedMap#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AbstractHashedMap.<init>()",
    "void AbstractHashedMap.init()",
    "int AbstractHashedMap.size()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>();
    actualObjectObjectMap.init();

    // Assert
    assertEquals(0, actualObjectObjectMap.size());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}, and {@link HashEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HashEntry#equals(Object)}
   *   <li>{@link HashEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test HashEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry2 =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(hashEntry, hashEntry2);
    assertEquals(hashEntry.hashCode(), hashEntry2.hashCode());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}, and {@link HashEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HashEntry#equals(Object)}
   *   <li>{@link HashEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test HashEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    IdentityEntry<Object, Object> identityEntry =
        new IdentityEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(identityEntry, hashEntry);
    assertEquals(identityEntry.hashCode(), hashEntry.hashCode());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}, and {@link HashEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HashEntry#equals(Object)}
   *   <li>{@link HashEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test HashEntry equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(hashEntry, hashEntry);
    int expectedHashCodeResult = hashEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry.hashCode());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, 1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(
        hashEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry2 =
        new HashEntry<>(null, 19088743, hashEntry, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(
        hashEntry2,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertNotEquals(
        hashEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry2 =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, hashEntry);

    // Act and Assert
    assertNotEquals(
        hashEntry2,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(
        referenceEntry,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, null);
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test HashEntry equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  void testHashEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, "Different type to HashEntry");
  }

  /**
   * Test HashEntry getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HashEntry#HashEntry(HashEntry, int, Object, Object)}
   *   <li>{@link HashEntry#setValue(Object)}
   *   <li>{@link HashEntry#toString()}
   *   <li>{@link HashEntry#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test HashEntry getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void HashEntry.<init>(HashEntry, int, Object, Object)",
    "Object HashEntry.getValue()",
    "Object HashEntry.setValue(Object)",
    "java.lang.String HashEntry.toString()"
  })
  void testHashEntryGettersAndSetters() {
    // Arrange and Act
    HashEntry<Object, Object> actualHashEntry =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;
    Object actualSetValueResult = actualHashEntry.setValue(object);
    actualHashEntry.toString();

    // Assert
    assertSame(object, actualHashEntry.getValue());
    assertSame(object, actualSetValueResult);
  }

  /**
   * Test KeySet {@link KeySet#KeySet(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link KeySet#KeySet(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test KeySet new KeySet(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySet.<init>(AbstractHashedMap)"})
  void testKeySetNewKeySet() {
    // Arrange and Act
    KeySet<Object> actualObjectSet = new KeySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int, float, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float, int)}
   */
  @Test
  @DisplayName("Test new AbstractHashedMap(int, float, int); when one; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int, float, int)"})
  void testNewAbstractHashedMap_whenOne_thenReturnEmpty() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1, 10.0f, 1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#calculateNewCapacity(int)}.
   *
   * <ul>
   *   <li>When {@code 1073741824}.
   *   <li>Then return {@code 1073741824}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  @DisplayName("Test calculateNewCapacity(int); when '1073741824'; then return '1073741824'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateNewCapacity(int)"})
  void testCalculateNewCapacity_when1073741824_thenReturn1073741824() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1073741824, objectObjectMap.calculateNewCapacity(1073741824));
  }

  /**
   * Test {@link AbstractHashedMap#calculateNewCapacity(int)}.
   *
   * <ul>
   *   <li>When {@code 1073741825}.
   *   <li>Then return {@code 1073741824}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  @DisplayName("Test calculateNewCapacity(int); when '1073741825'; then return '1073741824'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateNewCapacity(int)"})
  void testCalculateNewCapacity_when1073741825_thenReturn1073741824() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1073741824, objectObjectMap.calculateNewCapacity(1073741825));
  }

  /**
   * Test {@link AbstractHashedMap#calculateNewCapacity(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  @DisplayName("Test calculateNewCapacity(int); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateNewCapacity(int)"})
  void testCalculateNewCapacity_whenOne_thenReturnOne() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.calculateNewCapacity(1));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @DisplayName("Test calculateThreshold(int, float); when minus one; then return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  void testCalculateThreshold_whenMinusOne_thenReturnMinusTen() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(-10, objectObjectMap.calculateThreshold(-1, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @DisplayName("Test calculateThreshold(int, float); when one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  void testCalculateThreshold_whenOne_thenReturnTen() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(10, objectObjectMap.calculateThreshold(1, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return thirty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @DisplayName("Test calculateThreshold(int, float); when three; then return thirty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  void testCalculateThreshold_whenThree_thenReturnThirty() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(30, objectObjectMap.calculateThreshold(3, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @DisplayName("Test calculateThreshold(int, float); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  void testCalculateThreshold_whenZero_thenReturnZero() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.calculateThreshold(0, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#clone()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractHashedMap AbstractHashedMap.clone()"})
  void testClone() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.clone());
  }

  /**
   * Test {@link AbstractHashedMap#convertKey(Object)}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#convertKey(Object)}
   */
  @Test
  @DisplayName("Test convertKey(Object); when NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractHashedMap.convertKey(Object)"})
  void testConvertKey_whenNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualConvertKeyResult = objectObjectMap.convertKey(object);

    // Assert
    assertSame(object, actualConvertKeyResult);
  }

  /**
   * Test {@link AbstractHashedMap#convertKey(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#convertKey(Object)}
   */
  @Test
  @DisplayName("Test convertKey(Object); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractHashedMap.convertKey(Object)"})
  void testConvertKey_whenNull2() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertSame(AbstractHashedMap.NULL, objectObjectMap.convertKey(null));
  }

  /**
   * Test {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}.
   *
   * <p>Method under test: {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @DisplayName("Test createEntry(HashEntry, int, Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashEntry AbstractHashedMap.createEntry(HashEntry, int, Object, Object)"})
  void testCreateEntry() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashEntry<Object, Object> actualCreateEntryResult =
        objectObjectMap.createEntry(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    HashEntry<Object, Object> expectedCreateEntryResult = actualCreateEntryResult.next;
    assertEquals(expectedCreateEntryResult, actualCreateEntryResult);
    assertSame(actualCreateEntryResult.key, next.getValue());
  }

  /**
   * Test {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @DisplayName("Test createEntry(HashEntry, int, Object, Object); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashEntry AbstractHashedMap.createEntry(HashEntry, int, Object, Object)"})
  void testCreateEntry_whenNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashEntry<Object, Object> actualCreateEntryResult =
        objectObjectMap.createEntry(next, 19088743, null, AbstractHashedMap.NULL);

    // Assert
    HashEntry<Object, Object> expectedCreateEntryResult = actualCreateEntryResult.next;
    assertEquals(expectedCreateEntryResult, actualCreateEntryResult);
    assertSame(actualCreateEntryResult.key, next.getValue());
  }

  /**
   * Test {@link AbstractHashedMap#createEntrySetIterator()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#createEntrySetIterator()}
   */
  @Test
  @DisplayName("Test createEntrySetIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractHashedMap.createEntrySetIterator()"})
  void testCreateEntrySetIterator() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    Iterator<Entry<Object, Object>> actualCreateEntrySetIteratorResult =
        objectObjectMap.createEntrySetIterator();

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof EmptyIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
    assertSame(
        ((EmptyIterator) actualCreateEntrySetIteratorResult).RESETTABLE_INSTANCE,
        actualCreateEntrySetIteratorResult);
  }

  /**
   * Test {@link AbstractHashedMap#createKeySetIterator()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#createKeySetIterator()}
   */
  @Test
  @DisplayName("Test createKeySetIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractHashedMap.createKeySetIterator()"})
  void testCreateKeySetIterator() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof EmptyIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
    assertSame(
        ((EmptyIterator) actualCreateKeySetIteratorResult).RESETTABLE_INSTANCE,
        actualCreateKeySetIteratorResult);
  }

  /**
   * Test {@link AbstractHashedMap#createValuesIterator()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#createValuesIterator()}
   */
  @Test
  @DisplayName("Test createValuesIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractHashedMap.createValuesIterator()"})
  void testCreateValuesIterator() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator();

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof EmptyIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
    assertSame(
        ((EmptyIterator) actualCreateValuesIteratorResult).RESETTABLE_INSTANCE,
        actualCreateValuesIteratorResult);
  }

  /**
   * Test {@link AbstractHashedMap#destroyEntry(HashEntry)}.
   *
   * <p>Method under test: {@link AbstractHashedMap#destroyEntry(HashEntry)}
   */
  @Test
  @DisplayName("Test destroyEntry(HashEntry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.destroyEntry(HashEntry)"})
  void testDestroyEntry() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    objectObjectMap.destroyEntry(entry);

    // Assert
    assertNull(entry.getValue());
    assertNull(entry.key);
    assertNull(entry.next);
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readFloat()} return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given '0.5'; when ObjectInputStream readFloat() return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_given05_whenObjectInputStreamReadFloatReturn05()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(0.5f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given nine.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return nine.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given nine; when ObjectInputStream readInt() return nine")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenNine_whenObjectInputStreamReadIntReturnNine()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(9);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then {@link AbstractHashedMap#AbstractHashedMap()} {@code null} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given 'null'; then AbstractHashedMap() 'null' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenNull_thenAbstractHashedMapNullIsNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(null);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then {@link AbstractHashedMap#AbstractHashedMap()} {@code null} is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given one; then AbstractHashedMap() 'null' is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenOne_thenAbstractHashedMapNullIsNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given two; when ObjectInputStream readInt() return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenTwo_whenObjectInputStreamReadIntReturnTwo()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(0.5f);
    when(in.readInt()).thenReturn(2);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readFloat()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); when ObjectInputStream readFloat() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_whenObjectInputStreamReadFloatThrowIllegalArgumentException()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readFloat()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.doReadObject(in));
    verify(in).readFloat();
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readObject()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); when ObjectInputStream readObject() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_whenObjectInputStreamReadObjectThrowIllegalArgumentException()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IllegalArgumentException());
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.doReadObject(in));
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link AbstractHashedMap#entryHashCode(HashEntry)}.
   *
   * <ul>
   *   <li>Then return {@code 19088743}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#entryHashCode(HashEntry)}
   */
  @Test
  @DisplayName("Test entryHashCode(HashEntry); then return '19088743'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.entryHashCode(HashEntry)"})
  void testEntryHashCode_thenReturn19088743() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    int actualEntryHashCodeResult = objectObjectMap.entryHashCode(entry);

    // Assert
    assertEquals(19088743, actualEntryHashCodeResult);
  }

  /**
   * Test {@link AbstractHashedMap#entryKey(HashEntry)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#entryKey(HashEntry)}
   */
  @Test
  @DisplayName("Test entryKey(HashEntry); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractHashedMap.entryKey(HashEntry)"})
  void testEntryKey_thenReturnNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualEntryKeyResult = objectObjectMap.entryKey(entry);

    // Assert
    assertNull(actualEntryKeyResult);
  }

  /**
   * Test {@link AbstractHashedMap#entryNext(HashEntry)}.
   *
   * <p>Method under test: {@link AbstractHashedMap#entryNext(HashEntry)}
   */
  @Test
  @DisplayName("Test entryNext(HashEntry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashEntry AbstractHashedMap.entryNext(HashEntry)"})
  void testEntryNext() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    HashEntry<Object, Object> actualEntryNextResult = objectObjectMap.entryNext(entry);

    // Assert
    assertSame(entry.next, actualEntryNextResult);
  }

  /**
   * Test {@link AbstractHashedMap#entrySet()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractHashedMap.entrySet()"})
  void testEntrySet() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#entryValue(HashEntry)}.
   *
   * <p>Method under test: {@link AbstractHashedMap#entryValue(HashEntry)}
   */
  @Test
  @DisplayName("Test entryValue(HashEntry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractHashedMap.entryValue(HashEntry)"})
  void testEntryValue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualEntryValueResult = objectObjectMap.entryValue(entry);

    // Assert
    assertSame(entry.key, actualEntryValueResult);
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}, and {@link AbstractHashedMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractHashedMap#equals(Object)}
   *   <li>{@link AbstractHashedMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractHashedMap.equals(Object)",
    "int AbstractHashedMap.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}, and {@link AbstractHashedMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractHashedMap#equals(Object)}
   *   <li>{@link AbstractHashedMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractHashedMap.equals(Object)",
    "int AbstractHashedMap.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractHashedMap.equals(Object)",
    "int AbstractHashedMap.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractHashedMap.equals(Object)",
    "int AbstractHashedMap.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractHashedMap");
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   *
   * <ul>
   *   <li>When {@code 19088743}.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @DisplayName("Test hashIndex(int, int); when '19088743'; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  void testHashIndex_when19088743_thenReturnTwo() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(2, objectObjectMap.hashIndex(19088743, 3));
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @DisplayName("Test hashIndex(int, int); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  void testHashIndex_whenOne_thenReturnZero() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashIndex(1, 3));
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @DisplayName("Test hashIndex(int, int); when three; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  void testHashIndex_whenThree_thenReturnTwo() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(2, objectObjectMap.hashIndex(3, 3));
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @DisplayName("Test hashIndex(int, int); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  void testHashIndex_whenZero_thenReturnZero() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashIndex(0, 3));
  }

  /**
   * Test {@link AbstractHashedMap#isEmpty()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractHashedMap.isEmpty()"})
  void testIsEmpty() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#isEqualKey(Object, Object)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#isEqualKey(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualKey(Object, Object); when four; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualKey(Object, Object)"})
  void testIsEqualKey_whenFour_thenReturnFalse() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(4, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#isEqualKey(Object, Object)}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#isEqualKey(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualKey(Object, Object); when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualKey(Object, Object)"})
  void testIsEqualKey_whenNull_thenReturnTrue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#isEqualValue(Object, Object)}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#isEqualValue(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualValue(Object, Object); when forty-two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenFortyTwo_thenReturnFalse() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(42, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#isEqualValue(Object, Object)}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractHashedMap#isEqualValue(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualValue(Object, Object); when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenNull_thenReturnTrue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#keySet()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractHashedMap.keySet()"})
  void testKeySet() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#mapIterator()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractHashedMap.mapIterator()"})
  void testMapIterator() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(((EmptyMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link AbstractHashedMap#toString()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractHashedMap.toString()"})
  void testToString() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link AbstractHashedMap#values()}.
   *
   * <p>Method under test: {@link AbstractHashedMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection AbstractHashedMap.values()"})
  void testValues() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test Values {@link Values#Values(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link Values#Values(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test Values new Values(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Values.<init>(AbstractHashedMap)"})
  void testValuesNewValues() {
    // Arrange and Act
    Values<Object> actualValues = new Values<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualValues.isEmpty());
  }
}
