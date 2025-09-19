package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.Flat3Map.EntryIterator;
import org.apache.commons.collections4.map.Flat3Map.EntrySet;
import org.apache.commons.collections4.map.Flat3Map.EntrySetIterator;
import org.apache.commons.collections4.map.Flat3Map.FlatMapEntry;
import org.apache.commons.collections4.map.Flat3Map.FlatMapIterator;
import org.apache.commons.collections4.map.Flat3Map.KeySet;
import org.apache.commons.collections4.map.Flat3Map.KeySetIterator;
import org.apache.commons.collections4.map.Flat3Map.Values;
import org.apache.commons.collections4.map.Flat3Map.ValuesIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class Flat3MapDiffblueTest {
  /**
   * Test EntryIterator {@link EntryIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EntryIterator#hasNext()}
   */
  @Test
  @DisplayName("Test EntryIterator hasNext(); given Flat3Map() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntryIterator.hasNext()"})
  void testEntryIteratorHasNext_givenFlat3MapNullIsNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Test EntryIterator {@link EntryIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EntryIterator#hasNext()}
   */
  @Test
  @DisplayName("Test EntryIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntryIterator.hasNext()"})
  void testEntryIteratorHasNext_thenReturnFalse() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntryIterator {@link EntryIterator#nextEntry()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link FlatMapEntry}.
   * </ul>
   *
   * <p>Method under test: {@link EntryIterator#nextEntry()}
   */
  @Test
  @DisplayName(
      "Test EntryIterator nextEntry(); given Flat3Map() NULL is NULL; then return FlatMapEntry")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map.Entry EntryIterator.nextEntry()"})
  void testEntryIteratorNextEntry_givenFlat3MapNullIsNull_thenReturnFlatMapEntry() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.nextEntry() instanceof FlatMapEntry);
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntryIterator {@link EntryIterator#nextEntry()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link EntryIterator#nextEntry()}
   */
  @Test
  @DisplayName("Test EntryIterator nextEntry(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map.Entry EntryIterator.nextEntry()"})
  void testEntryIteratorNextEntry_thenThrowNoSuchElementException() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.nextEntry());
  }

  /**
   * Test EntryIterator {@link EntryIterator#remove()}.
   *
   * <p>Method under test: {@link EntryIterator#remove()}
   */
  @Test
  @DisplayName("Test EntryIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntryIterator.remove()"})
  void testEntryIteratorRemove() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(Flat3Map)}.
   *
   * <p>Method under test: {@link EntrySetIterator#EntrySetIterator(Flat3Map)}
   */
  @Test
  @DisplayName("Test EntrySetIterator new EntrySetIterator(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetIterator.<init>(Flat3Map)"})
  void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange and Act
    EntrySetIterator<Object, Object> actualEntrySetIterator =
        new EntrySetIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link FlatMapEntry}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @DisplayName(
      "Test EntrySetIterator next(); given Flat3Map() NULL is NULL; then return FlatMapEntry")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map.Entry EntrySetIterator.next()"})
  void testEntrySetIteratorNext_givenFlat3MapNullIsNull_thenReturnFlatMapEntry() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.next() instanceof FlatMapEntry);
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @DisplayName("Test EntrySetIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map.Entry EntrySetIterator.next()"})
  void testEntrySetIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.next());
  }

  /**
   * Test EntrySet {@link EntrySet#EntrySet(Flat3Map)}.
   *
   * <p>Method under test: {@link EntrySet#EntrySet(Flat3Map)}
   */
  @Test
  @DisplayName("Test EntrySet new EntrySet(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySet.<init>(Flat3Map)"})
  void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object, Object> actualObjectSet = new EntrySet<>(new Flat3Map<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    assertEquals(flatMapEntry.hashCode(), flatMapEntry2.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    assertEquals(flatMapEntry.hashCode(), flatMapEntry2.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    assertEquals(flatMapEntry.hashCode(), flatMapEntry2.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(parent, 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(
        flatMapEntry, new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(
        flatMapEntry,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertNotEquals(flatMapEntry, new FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> flatMapEntry.equals(new FlatMapEntry<>(new Flat3Map<>(), 1)));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> flatMapEntry.equals(new FlatMapEntry<>(new Flat3Map<>(), 0)));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is different; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry2.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.equals(flatMapEntry2));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, null);
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  void testFlatMapEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, "Different type to FlatMapEntry");
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   *
   * <p>Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @DisplayName("Test FlatMapEntry getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  void testFlatMapEntryGetKey() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    flatMapEntry.setRemoved(false);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   *
   * <p>Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @DisplayName("Test FlatMapEntry getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  void testFlatMapEntryGetKey2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    flatMapEntry.setRemoved(false);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   *
   * <p>Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @DisplayName("Test FlatMapEntry getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  void testFlatMapEntryGetKey3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   *
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link
   *       Flat3Map#Flat3Map()} and index is one.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry getKey(); given FlatMapEntry(Flat3Map, int) with parent is Flat3Map() and index is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  void testFlatMapEntryGetKey_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsOne() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   *
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link
   *       Flat3Map#Flat3Map()} and index is zero.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry getKey(); given FlatMapEntry(Flat3Map, int) with parent is Flat3Map() and index is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  void testFlatMapEntryGetKey_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsZero() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   *
   * <p>Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @DisplayName("Test FlatMapEntry getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  void testFlatMapEntryGetValue() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    flatMapEntry.setRemoved(false);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   *
   * <p>Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @DisplayName("Test FlatMapEntry getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  void testFlatMapEntryGetValue2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    flatMapEntry.setRemoved(false);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   *
   * <p>Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @DisplayName("Test FlatMapEntry getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  void testFlatMapEntryGetValue3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   *
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link
   *       Flat3Map#Flat3Map()} and index is one.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry getValue(); given FlatMapEntry(Flat3Map, int) with parent is Flat3Map() and index is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  void testFlatMapEntryGetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsOne() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   *
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link
   *       Flat3Map#Flat3Map()} and index is zero.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry getValue(); given FlatMapEntry(Flat3Map, int) with parent is Flat3Map() and index is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  void testFlatMapEntryGetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsZero() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  void testFlatMapEntrySetValue() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  void testFlatMapEntrySetValue2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    flatMapEntry.setRemoved(false);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  void testFlatMapEntrySetValue3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    flatMapEntry.setRemoved(false);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test FlatMapEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  void testFlatMapEntrySetValue4() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link
   *       Flat3Map#Flat3Map()} and index is zero.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry setValue(Object); given FlatMapEntry(Flat3Map, int) with parent is Flat3Map() and index is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  void testFlatMapEntrySetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsZero() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   *
   * <p>Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @DisplayName("Test FlatMapEntry toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  void testFlatMapEntryToString() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    flatMapEntry.setRemoved(false);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   *
   * <p>Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @DisplayName("Test FlatMapEntry toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  void testFlatMapEntryToString2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    flatMapEntry.setRemoved(false);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   *
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link
   *       Flat3Map#Flat3Map()} and index is one.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @DisplayName(
      "Test FlatMapEntry toString(); given FlatMapEntry(Flat3Map, int) with parent is Flat3Map() and index is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  void testFlatMapEntryToString_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsOne() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   *
   * <ul>
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @DisplayName("Test FlatMapEntry toString(); then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  void testFlatMapEntryToString_thenReturnEmptyString() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertEquals("", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @DisplayName("Test FlatMapEntry toString(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  void testFlatMapEntryToString_thenThrowIllegalStateException() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.toString());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#getKey()}.
   *
   * <p>Method under test: {@link FlatMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test FlatMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapIterator.getKey()"})
  void testFlatMapIteratorGetKey() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.getKey());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#getValue()}.
   *
   * <p>Method under test: {@link FlatMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test FlatMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapIterator.getValue()"})
  void testFlatMapIteratorGetValue() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.getValue());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test FlatMapIterator hasNext(); given Flat3Map() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapIterator.hasNext()"})
  void testFlatMapIteratorHasNext_givenFlat3MapNullIsNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(parent);

    // Act and Assert
    assertTrue(flatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test FlatMapIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FlatMapIterator.hasNext()"})
  void testFlatMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertFalse(flatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#FlatMapIterator(Flat3Map)}.
   *
   * <p>Method under test: {@link FlatMapIterator#FlatMapIterator(Flat3Map)}
   */
  @Test
  @DisplayName("Test FlatMapIterator new FlatMapIterator(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FlatMapIterator.<init>(Flat3Map)"})
  void testFlatMapIteratorNewFlatMapIterator() {
    // Arrange and Act
    FlatMapIterator<Object, Object> actualFlatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualFlatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link FlatMapIterator#FlatMapIterator(Flat3Map)} with parent is {@link
   *       Flat3Map#Flat3Map()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapIterator#next()}
   */
  @Test
  @DisplayName(
      "Test FlatMapIterator next(); then not FlatMapIterator(Flat3Map) with parent is Flat3Map() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapIterator.next()"})
  void testFlatMapIteratorNext_thenNotFlatMapIteratorWithParentIsFlat3MapHasNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(parent);

    // Act
    flatMapIterator.next();

    // Assert
    assertFalse(flatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link FlatMapIterator#next()}
   */
  @Test
  @DisplayName("Test FlatMapIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapIterator.next()"})
  void testFlatMapIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> flatMapIterator.next());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#remove()}.
   *
   * <p>Method under test: {@link FlatMapIterator#remove()}
   */
  @Test
  @DisplayName("Test FlatMapIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FlatMapIterator.remove()"})
  void testFlatMapIteratorRemove() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.remove());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link FlatMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test FlatMapIterator setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object FlatMapIterator.setValue(Object)"})
  void testFlatMapIteratorSetValue() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(
        IllegalStateException.class, () -> flatMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#toString()}.
   *
   * <p>Method under test: {@link FlatMapIterator#toString()}
   */
  @Test
  @DisplayName("Test FlatMapIterator toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String FlatMapIterator.toString()"})
  void testFlatMapIteratorToString() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertEquals("Iterator[]", flatMapIterator.toString());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#KeySetIterator(Flat3Map)}.
   *
   * <p>Method under test: {@link KeySetIterator#KeySetIterator(Flat3Map)}
   */
  @Test
  @DisplayName("Test KeySetIterator new KeySetIterator(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySetIterator.<init>(Flat3Map)"})
  void testKeySetIteratorNewKeySetIterator() {
    // Arrange and Act
    KeySetIterator<Object> actualKeySetIterator = new KeySetIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link KeySetIterator#KeySetIterator(Flat3Map)} with parent is {@link
   *       Flat3Map#Flat3Map()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @DisplayName(
      "Test KeySetIterator next(); then not KeySetIterator(Flat3Map) with parent is Flat3Map() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  void testKeySetIteratorNext_thenNotKeySetIteratorWithParentIsFlat3MapHasNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(parent);

    // Act
    keySetIterator.next();

    // Assert
    assertFalse(keySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @DisplayName("Test KeySetIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  void testKeySetIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> keySetIterator.next());
  }

  /**
   * Test KeySet {@link KeySet#KeySet(Flat3Map)}.
   *
   * <p>Method under test: {@link KeySet#KeySet(Flat3Map)}
   */
  @Test
  @DisplayName("Test KeySet new KeySet(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySet.<init>(Flat3Map)"})
  void testKeySetNewKeySet() {
    // Arrange and Act
    KeySet<Object> actualObjectSet = new KeySet<>(new Flat3Map<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link Flat3Map#Flat3Map()}.
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map()}
   */
  @Test
  @DisplayName("Test new Flat3Map()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>()"})
  void testNewFlat3Map() {
    // Arrange and Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given {@code 1148503186}.
   *   <li>When {@link HashMap#HashMap()} {@code 1148503186} is {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given '1148503186'; when HashMap() '1148503186' is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_given1148503186_whenHashMap1148503186IsNull_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(1148503186, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given NULL; when HashMap() NULL is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_givenNull_whenHashMapNullIsNull_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given 'null'; when HashMap() 'null' is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_givenNull_whenHashMapNullIsNull_thenReturnHashMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given 'null'; when HashMap() NULL is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_givenNull_whenHashMapNullIsNull_thenReturnHashMap3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@link
   *       AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} and {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given SimpleEntry(Object, Object) with SimpleEntry(Object, Object) and NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_givenSimpleEntryWithSimpleEntryAndNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(
        new SimpleEntry<>(
            new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            AbstractHashedMap.NULL),
        AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} zero is {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given zero; when HashMap() zero is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_givenZero_whenHashMapZeroIsNull_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(0, AbstractHashedMap.NULL);
    map.put(
        new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} zero is {@link AbstractHashedMap#NULL}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); given zero; when HashMap() zero is NULL; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_givenZero_whenHashMapZeroIsNull_thenReturnSizeIsThree() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(0, AbstractHashedMap.NULL);
    map.put(
        new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(3, actualObjectObjectMap.size());
    assertTrue(actualObjectObjectMap.containsKey(null));
    Object expectedGetResult = actualObjectObjectMap.get(null);
    assertSame(expectedGetResult, actualObjectObjectMap.get(0));
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractMap.SimpleEntry#SimpleEntry(Object,
   *       Object)} with {@link AbstractHashedMap#NULL} and {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); when HashMap() SimpleEntry(Object, Object) with NULL and NULL is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_whenHashMapSimpleEntryWithNullAndNullIsNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(
        new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractMap.SimpleEntry#SimpleEntry(Object,
   *       Object)} with {@link AbstractHashedMap#NULL} and {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName(
      "Test new Flat3Map(Map); when HashMap() SimpleEntry(Object, Object) with NULL and NULL is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_whenHashMapSimpleEntryWithNullAndNullIsNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    map.put(
        new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);
    map.put(null, AbstractHashedMap.NULL);

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#Flat3Map(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#Flat3Map(Map)}
   */
  @Test
  @DisplayName("Test new Flat3Map(Map); when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Flat3Map.<init>(Map)"})
  void testNewFlat3Map_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>(map);

    // Assert
    assertEquals(map, actualObjectObjectMap);
  }

  /**
   * Test {@link Flat3Map#clone()}.
   *
   * <p>Method under test: {@link Flat3Map#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Flat3Map Flat3Map.clone()"})
  void testClone() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act
    Flat3Map<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 1148503186} is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() '1148503186' is NULL; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3Map1148503186IsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1148503186, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 1148503186} is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() '1148503186' is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3Map1148503186IsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1148503186, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() NULL is NULL; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() NULL is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code null} is {@link AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() 'null' is NULL; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnTrue2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code null} is {@link AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() 'null' is NULL; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnTrue3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() one is NULL; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapOneIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() one is NULL; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapOneIsNull_whenNull_thenReturnFalse2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() one is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapOneIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given Flat3Map() one is NULL; when one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3MapOneIsNull_whenOne_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given Flat3Map(); when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3Map_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given Flat3Map(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  void testContainsKey_givenFlat3Map_whenNull_thenReturnFalse2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is forty-two.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() NULL is forty-two; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapNullIsFortyTwo_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() NULL is NULL; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() NULL is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@code null}.
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() NULL is 'null'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnTrue2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is forty-two.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() one is forty-two; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapOneIsFortyTwo_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, 42);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() one is NULL; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapOneIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() one is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapOneIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@code null}.
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given Flat3Map() one is 'null'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3MapOneIsNull_whenNull_thenReturnTrue2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given Flat3Map(); when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3Map_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given Flat3Map(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  void testContainsValue_givenFlat3Map_whenNull_thenReturnFalse2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#createDelegateMap()}.
   *
   * <p>Method under test: {@link Flat3Map#createDelegateMap()}
   */
  @Test
  @DisplayName("Test createDelegateMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractHashedMap Flat3Map.createDelegateMap()"})
  void testCreateDelegateMap() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act
    AbstractHashedMap<Object, Object> actualCreateDelegateMapResult =
        objectObjectMap.createDelegateMap();

    // Assert
    assertEquals(objectObjectMap, actualCreateDelegateMapResult);
  }

  /**
   * Test {@link Flat3Map#entrySet()}.
   *
   * <p>Method under test: {@link Flat3Map#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set Flat3Map.entrySet()"})
  void testEntrySet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new Flat3Map<>());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1148503186, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to Flat3Map");
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 1148503186} is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object); given Flat3Map() '1148503186' is NULL; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3Map1148503186IsNull_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1148503186, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 1148503186} is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object); given Flat3Map() '1148503186' is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3Map1148503186IsNull_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1148503186, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map() NULL is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3MapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map() NULL is NULL; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3MapNullIsNull_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map() one is NULL; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3MapOneIsNull_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map() one is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3MapOneIsNull_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map() one is NULL; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3MapOneIsNull_whenNull_thenReturnNull3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3Map_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given Flat3Map(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  void testGet_givenFlat3Map_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link Flat3Map#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given Flat3Map() NULL is NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.isEmpty()"})
  void testIsEmpty_givenFlat3MapNullIsNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link Flat3Map#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given Flat3Map(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Flat3Map.isEmpty()"})
  void testIsEmpty_givenFlat3Map_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link Flat3Map#keySet()}.
   *
   * <p>Method under test: {@link Flat3Map#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set Flat3Map.keySet()"})
  void testKeySet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link Flat3Map#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>Then return {@link EmptyMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given Flat3Map(); then return EmptyMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator Flat3Map.mapIterator()"})
  void testMapIterator_givenFlat3Map_thenReturnEmptyMapIterator() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(((EmptyMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link Flat3Map#size()}.
   *
   * <p>Method under test: {@link Flat3Map#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Flat3Map.size()"})
  void testSize() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link Flat3Map#toString()}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.
   *   <li>Then return {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link Flat3Map#toString()}
   */
  @Test
  @DisplayName("Test toString(); given Flat3Map(); then return '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String Flat3Map.toString()"})
  void testToString_givenFlat3Map_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link Flat3Map#values()}.
   *
   * <p>Method under test: {@link Flat3Map#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection Flat3Map.values()"})
  void testValues() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test Values {@link Values#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When forty-two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Values#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test Values contains(Object); given Flat3Map() one is NULL; when forty-two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Values.contains(Object)"})
  void testValuesContains_givenFlat3MapOneIsNull_whenFortyTwo_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    parent.put(1, AbstractHashedMap.NULL);
    Values<Object> values = new Values<>(parent);

    // Act and Assert
    assertFalse(values.contains(42));
  }

  /**
   * Test Values {@link Values#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Values#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test Values contains(Object); given Flat3Map() one is NULL; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Values.contains(Object)"})
  void testValuesContains_givenFlat3MapOneIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    parent.put(1, AbstractHashedMap.NULL);
    Values<Object> values = new Values<>(parent);

    // Act and Assert
    assertFalse(values.contains(null));
  }

  /**
   * Test Values {@link Values#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Values#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test Values contains(Object); given Flat3Map() one is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Values.contains(Object)"})
  void testValuesContains_givenFlat3MapOneIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    parent.put(1, AbstractHashedMap.NULL);
    Values<Object> values = new Values<>(parent);

    // Act and Assert
    assertTrue(values.contains(AbstractHashedMap.NULL));
  }

  /**
   * Test Values {@link Values#contains(Object)}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Values#contains(Object)}
   */
  @Test
  @DisplayName("Test Values contains(Object); when forty-two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Values.contains(Object)"})
  void testValuesContains_whenFortyTwo_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Values<Object> values = new Values<>(parent);

    // Act and Assert
    assertFalse(values.contains(42));
  }

  /**
   * Test Values {@link Values#contains(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Values#contains(Object)}
   */
  @Test
  @DisplayName("Test Values contains(Object); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Values.contains(Object)"})
  void testValuesContains_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Values<Object> values = new Values<>(parent);

    // Act and Assert
    assertFalse(values.contains(null));
  }

  /**
   * Test Values {@link Values#contains(Object)}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Values#contains(Object)}
   */
  @Test
  @DisplayName("Test Values contains(Object); when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Values.contains(Object)"})
  void testValuesContains_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Values<Object> values = new Values<>(parent);

    // Act and Assert
    assertTrue(values.contains(AbstractHashedMap.NULL));
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#ValuesIterator(Flat3Map)}.
   *
   * <p>Method under test: {@link ValuesIterator#ValuesIterator(Flat3Map)}
   */
  @Test
  @DisplayName("Test ValuesIterator new ValuesIterator(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValuesIterator.<init>(Flat3Map)"})
  void testValuesIteratorNewValuesIterator() {
    // Arrange and Act
    ValuesIterator<Object> actualValuesIterator = new ValuesIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link ValuesIterator#ValuesIterator(Flat3Map)} with parent is {@link
   *       Flat3Map#Flat3Map()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ValuesIterator next(); then not ValuesIterator(Flat3Map) with parent is Flat3Map() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  void testValuesIteratorNext_thenNotValuesIteratorWithParentIsFlat3MapHasNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(parent);

    // Act
    valuesIterator.next();

    // Assert
    assertFalse(valuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @DisplayName("Test ValuesIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  void testValuesIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> valuesIterator.next());
  }

  /**
   * Test Values {@link Values#Values(Flat3Map)}.
   *
   * <p>Method under test: {@link Values#Values(Flat3Map)}
   */
  @Test
  @DisplayName("Test Values new Values(Flat3Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Values.<init>(Flat3Map)"})
  void testValuesNewValues() {
    // Arrange and Act
    Values<Object> actualValues = new Values<>(new Flat3Map<>());

    // Assert
    assertTrue(actualValues.isEmpty());
  }
}
