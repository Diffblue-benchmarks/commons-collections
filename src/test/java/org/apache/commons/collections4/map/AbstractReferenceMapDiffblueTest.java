package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceBaseIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySet;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySetIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySet;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySetIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValues;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValuesIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.SoftRef;
import org.apache.commons.collections4.map.AbstractReferenceMap.WeakRef;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractReferenceMapDiffblueTest {
  /**
   * Test ReferenceBaseIterator {@link ReferenceBaseIterator#currentEntry()}.
   *
   * <p>Method under test: {@link ReferenceBaseIterator#currentEntry()}
   */
  @Test
  @DisplayName("Test ReferenceBaseIterator currentEntry()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceEntry ReferenceBaseIterator.currentEntry()"})
  void testReferenceBaseIteratorCurrentEntry() {
    // Arrange
    ReferenceBaseIterator<Object, Object> referenceBaseIterator =
        new ReferenceBaseIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertNull(referenceBaseIterator.currentEntry());
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}, and {@link
   * ReferenceEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReferenceEntry#equals(Object)}
   *   <li>{@link ReferenceEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next2 =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry2 =
        new ReferenceEntry<>(
            parent2, next2, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(referenceEntry, referenceEntry2);
    assertEquals(referenceEntry.hashCode(), referenceEntry2.hashCode());
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}, and {@link
   * ReferenceEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReferenceEntry#equals(Object)}
   *   <li>{@link ReferenceEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    SimpleEntry<Object, Object> simpleEntry =
        new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(referenceEntry, simpleEntry);
    assertEquals(referenceEntry.hashCode(), simpleEntry.hashCode());
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}, and {@link
   * ReferenceEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReferenceEntry#equals(Object)}
   *   <li>{@link ReferenceEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(referenceEntry, referenceEntry);
    int expectedHashCodeResult = referenceEntry.hashCode();
    assertEquals(expectedHashCodeResult, referenceEntry.hashCode());
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, 1);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
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
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, new HashEntry<>(null, 19088743, 1, AbstractHashedMap.NULL));
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, new HashEntry<>(null, 19088743, 1, null));
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(parent, next, 19088743, AbstractHashedMap.NULL, 42);
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next2 =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(
        referenceEntry,
        new ReferenceEntry<>(
            parent2, next2, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is different; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsDifferent_thenThrowException() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashEntry<Object, Object> hashEntry = mock(HashEntry.class);
    when(hashEntry.getKey()).thenThrow(new IllegalArgumentException());
    when(hashEntry.getValue()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> referenceEntry.equals(hashEntry));
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, null);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.equals(Object)", "int ReferenceEntry.hashCode()"})
  void testReferenceEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, "Different type to ReferenceEntry");
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#getKey()}.
   *
   * <p>Method under test: {@link ReferenceEntry#getKey()}
   */
  @Test
  @DisplayName("Test ReferenceEntry getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceEntry.getKey()"})
  void testReferenceEntryGetKey() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualKey = referenceEntry.getKey();

    // Assert
    assertSame(referenceEntry.key, actualKey);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#getValue()}.
   *
   * <p>Method under test: {@link ReferenceEntry#getValue()}
   */
  @Test
  @DisplayName("Test ReferenceEntry getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceEntry.getValue()"})
  void testReferenceEntryGetValue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualValue = referenceEntry.getValue();

    // Assert
    assertSame(referenceEntry.key, actualValue);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#ReferenceEntry(AbstractReferenceMap, HashEntry, int,
   * Object, Object)}.
   *
   * <p>Method under test: {@link ReferenceEntry#ReferenceEntry(AbstractReferenceMap, HashEntry,
   * int, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry new ReferenceEntry(AbstractReferenceMap, HashEntry, int, Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceEntry.<init>(AbstractReferenceMap, HashEntry, int, Object, Object)"
  })
  void testReferenceEntryNewReferenceEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    ReferenceEntry<Object, Object> actualReferenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    Object object = actualReferenceEntry.value;
    assertTrue(object instanceof SoftRef);
    HashEntry<Object, Object> hashEntry = actualReferenceEntry.next;
    assertNull(hashEntry.getKey());
    assertEquals(19088743, actualReferenceEntry.hashCode);
    assertEquals(19088743, hashEntry.hashCode);
    assertFalse(((SoftRef<Object>) object).isEnqueued());
    Object object2 = actualReferenceEntry.key;
    assertSame(object2, ((SoftRef<Object>) object).get());
    assertSame(object2, next.getValue());
    assertSame(object2, hashEntry.getValue());
    assertSame(object2, actualReferenceEntry.getKey());
    assertSame(object2, actualReferenceEntry.getValue());
    assertSame(object2, hashEntry.key);
    assertSame(next.next, hashEntry.next);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#next()}.
   *
   * <p>Method under test: {@link ReferenceEntry#next()}
   */
  @Test
  @DisplayName("Test ReferenceEntry next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceEntry ReferenceEntry.next()"})
  void testReferenceEntryNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    ReferenceIdentityMap<Object, Object> parent2 = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> next2 =
        new ReferenceEntry<>(
            parent2, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next2, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    ReferenceEntry<Object, Object> actualNextResult = referenceEntry.next();

    // Assert
    assertTrue(referenceEntry.value instanceof SoftRef);
    Object object = actualNextResult.key;
    assertSame(object, referenceEntry.getKey());
    assertSame(object, referenceEntry.getValue());
    assertSame(referenceEntry.next, actualNextResult);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#purge(Reference)}.
   *
   * <p>Method under test: {@link ReferenceEntry#purge(Reference)}
   */
  @Test
  @DisplayName("Test ReferenceEntry purge(Reference)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceEntry.purge(Reference)"})
  void testReferenceEntryPurge() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    PhantomReference<Object> ref =
        new PhantomReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act
    boolean actualPurgeResult = referenceEntry.purge(ref);

    // Assert
    assertFalse(actualPurgeResult);
  }

  /**
   * Test ReferenceEntrySetIterator {@link
   * ReferenceEntrySetIterator#ReferenceEntrySetIterator(AbstractReferenceMap)}.
   *
   * <p>Method under test: {@link
   * ReferenceEntrySetIterator#ReferenceEntrySetIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName("Test ReferenceEntrySetIterator new ReferenceEntrySetIterator(AbstractReferenceMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceEntrySetIterator.<init>(AbstractReferenceMap)"})
  void testReferenceEntrySetIteratorNewReferenceEntrySetIterator() {
    // Arrange and Act
    ReferenceEntrySetIterator<Object, Object> actualReferenceEntrySetIterator =
        new ReferenceEntrySetIterator<>(new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceEntrySetIterator.hasNext());
  }

  /**
   * Test ReferenceEntrySetIterator {@link ReferenceEntrySetIterator#next()}.
   *
   * <p>Method under test: {@link ReferenceEntrySetIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceEntrySetIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ReferenceEntrySetIterator.next()"})
  void testReferenceEntrySetIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceEntrySetIterator<Object, Object> referenceEntrySetIterator =
        new ReferenceEntrySetIterator<>(parent);

    // Act
    Entry<Object, Object> actualNextResult = referenceEntrySetIterator.next();

    // Assert
    assertFalse(referenceEntrySetIterator.hasNext());
    assertSame(referenceEntrySetIterator.current, actualNextResult);
  }

  /**
   * Test ReferenceEntrySetIterator {@link ReferenceEntrySetIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntrySetIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceEntrySetIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry ReferenceEntrySetIterator.next()"})
  void testReferenceEntrySetIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ReferenceEntrySetIterator<Object, Object> referenceEntrySetIterator =
        new ReferenceEntrySetIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> referenceEntrySetIterator.next());
  }

  /**
   * Test ReferenceEntrySet {@link ReferenceEntrySet#ReferenceEntrySet(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link ReferenceEntrySet#ReferenceEntrySet(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test ReferenceEntrySet new ReferenceEntrySet(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceEntrySet.<init>(AbstractHashedMap)"})
  void testReferenceEntrySetNewReferenceEntrySet() {
    // Arrange and Act
    ReferenceEntrySet<Object, Object> actualObjectSet =
        new ReferenceEntrySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link ReferenceEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test ReferenceEntry setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceEntry.setValue(Object)"})
  void testReferenceEntrySetValue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualSetValueResult = referenceEntry.setValue(object);

    // Assert
    assertSame(object, actualSetValueResult);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#toReference(ReferenceStrength, Object, int)}.
   *
   * <ul>
   *   <li>When {@code HARD}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#toReference(ReferenceStrength, Object, int)}
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry toReference(ReferenceStrength, Object, int); when 'HARD'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceEntry.toReference(ReferenceStrength, Object, int)"})
  void testReferenceEntryToReference_whenHard_thenReturnNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualToReferenceResult =
        referenceEntry.toReference(ReferenceStrength.HARD, object, 19088743);

    // Assert
    assertSame(object, actualToReferenceResult);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#toReference(ReferenceStrength, Object, int)}.
   *
   * <ul>
   *   <li>When {@code SOFT}.
   *   <li>Then return {@link SoftRef}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#toReference(ReferenceStrength, Object, int)}
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry toReference(ReferenceStrength, Object, int); when 'SOFT'; then return SoftRef")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceEntry.toReference(ReferenceStrength, Object, int)"})
  void testReferenceEntryToReference_whenSoft_thenReturnSoftRef() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualToReferenceResult =
        referenceEntry.toReference(ReferenceStrength.SOFT, AbstractHashedMap.NULL, 19088743);

    // Assert
    assertTrue(actualToReferenceResult instanceof SoftRef);
    assertEquals(referenceEntry.value, actualToReferenceResult);
  }

  /**
   * Test ReferenceEntry {@link ReferenceEntry#toReference(ReferenceStrength, Object, int)}.
   *
   * <ul>
   *   <li>When {@code WEAK}.
   *   <li>Then return {@link WeakRef}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceEntry#toReference(ReferenceStrength, Object, int)}
   */
  @Test
  @DisplayName(
      "Test ReferenceEntry toReference(ReferenceStrength, Object, int); when 'WEAK'; then return WeakRef")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceEntry.toReference(ReferenceStrength, Object, int)"})
  void testReferenceEntryToReference_whenWeak_thenReturnWeakRef() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ReferenceEntry<Object, Object> referenceEntry =
        new ReferenceEntry<>(
            parent, next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualToReferenceResult =
        referenceEntry.toReference(ReferenceStrength.WEAK, object, 19088743);

    // Assert
    assertTrue(actualToReferenceResult instanceof WeakRef);
    assertSame(object, ((WeakRef<Object>) actualToReferenceResult).get());
  }

  /**
   * Test ReferenceKeySetIterator {@link
   * ReferenceKeySetIterator#ReferenceKeySetIterator(AbstractReferenceMap)}.
   *
   * <ul>
   *   <li>Then return next is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ReferenceKeySetIterator#ReferenceKeySetIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName(
      "Test ReferenceKeySetIterator new ReferenceKeySetIterator(AbstractReferenceMap); then return next is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceKeySetIterator.<init>(AbstractReferenceMap)"})
  void testReferenceKeySetIteratorNewReferenceKeySetIterator_thenReturnNextIsNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    ReferenceKeySetIterator<Object> actualReferenceKeySetIterator =
        new ReferenceKeySetIterator<>(parent);

    // Assert
    Object actualNextResult = actualReferenceKeySetIterator.next();
    assertFalse(actualReferenceKeySetIterator.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }

  /**
   * Test ReferenceKeySetIterator {@link
   * ReferenceKeySetIterator#ReferenceKeySetIterator(AbstractReferenceMap)}.
   *
   * <ul>
   *   <li>When {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ReferenceKeySetIterator#ReferenceKeySetIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName(
      "Test ReferenceKeySetIterator new ReferenceKeySetIterator(AbstractReferenceMap); when ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceKeySetIterator.<init>(AbstractReferenceMap)"})
  void testReferenceKeySetIteratorNewReferenceKeySetIterator_whenReferenceIdentityMap() {
    // Arrange and Act
    ReferenceKeySetIterator<Object> actualReferenceKeySetIterator =
        new ReferenceKeySetIterator<>(new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceKeySetIterator.hasNext());
  }

  /**
   * Test ReferenceKeySetIterator {@link ReferenceKeySetIterator#next()}.
   *
   * <p>Method under test: {@link ReferenceKeySetIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceKeySetIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceKeySetIterator.next()"})
  void testReferenceKeySetIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceKeySetIterator<Object> referenceKeySetIterator = new ReferenceKeySetIterator<>(parent);

    // Act
    Object actualNextResult = referenceKeySetIterator.next();

    // Assert
    assertFalse(referenceKeySetIterator.hasNext());
    assertSame(referenceKeySetIterator.currentValue, actualNextResult);
  }

  /**
   * Test ReferenceKeySetIterator {@link ReferenceKeySetIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceKeySetIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceKeySetIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceKeySetIterator.next()"})
  void testReferenceKeySetIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ReferenceKeySetIterator<Object> referenceKeySetIterator =
        new ReferenceKeySetIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> referenceKeySetIterator.next());
  }

  /**
   * Test ReferenceKeySet {@link ReferenceKeySet#ReferenceKeySet(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link ReferenceKeySet#ReferenceKeySet(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test ReferenceKeySet new ReferenceKeySet(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceKeySet.<init>(AbstractHashedMap)"})
  void testReferenceKeySetNewReferenceKeySet() {
    // Arrange and Act
    ReferenceKeySet<Object> actualObjectSet = new ReferenceKeySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test ReferenceMapIterator {@link ReferenceMapIterator#getKey()}.
   *
   * <p>Method under test: {@link ReferenceMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test ReferenceMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceMapIterator.getKey()"})
  void testReferenceMapIteratorGetKey() {
    // Arrange
    ReferenceMapIterator<Object, Object> referenceMapIterator =
        new ReferenceMapIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> referenceMapIterator.getKey());
  }

  /**
   * Test ReferenceMapIterator {@link ReferenceMapIterator#getValue()}.
   *
   * <p>Method under test: {@link ReferenceMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test ReferenceMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceMapIterator.getValue()"})
  void testReferenceMapIteratorGetValue() {
    // Arrange
    ReferenceMapIterator<Object, Object> referenceMapIterator =
        new ReferenceMapIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> referenceMapIterator.getValue());
  }

  /**
   * Test ReferenceMapIterator {@link
   * ReferenceMapIterator#ReferenceMapIterator(AbstractReferenceMap)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>Then return next is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMapIterator#ReferenceMapIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName(
      "Test ReferenceMapIterator new ReferenceMapIterator(AbstractReferenceMap); given NULL; then return next is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMapIterator.<init>(AbstractReferenceMap)"})
  void testReferenceMapIteratorNewReferenceMapIterator_givenNull_thenReturnNextIsNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    ReferenceMapIterator<Object, Object> actualReferenceMapIterator =
        new ReferenceMapIterator<>(parent);

    // Assert
    Object actualNextResult = actualReferenceMapIterator.next();
    assertFalse(actualReferenceMapIterator.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }

  /**
   * Test ReferenceMapIterator {@link
   * ReferenceMapIterator#ReferenceMapIterator(AbstractReferenceMap)}.
   *
   * <ul>
   *   <li>When {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMapIterator#ReferenceMapIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName(
      "Test ReferenceMapIterator new ReferenceMapIterator(AbstractReferenceMap); when ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMapIterator.<init>(AbstractReferenceMap)"})
  void testReferenceMapIteratorNewReferenceMapIterator_whenReferenceIdentityMap() {
    // Arrange and Act
    ReferenceMapIterator<Object, Object> actualReferenceMapIterator =
        new ReferenceMapIterator<>(new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceMapIterator.hasNext());
  }

  /**
   * Test ReferenceMapIterator {@link ReferenceMapIterator#next()}.
   *
   * <p>Method under test: {@link ReferenceMapIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceMapIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceMapIterator.next()"})
  void testReferenceMapIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceMapIterator<Object, Object> referenceMapIterator = new ReferenceMapIterator<>(parent);

    // Act
    Object actualNextResult = referenceMapIterator.next();

    // Assert
    assertFalse(referenceMapIterator.hasNext());
    assertSame(referenceMapIterator.currentValue, actualNextResult);
  }

  /**
   * Test ReferenceMapIterator {@link ReferenceMapIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMapIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceMapIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceMapIterator.next()"})
  void testReferenceMapIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ReferenceMapIterator<Object, Object> referenceMapIterator =
        new ReferenceMapIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> referenceMapIterator.next());
  }

  /**
   * Test ReferenceMapIterator {@link ReferenceMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link ReferenceMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test ReferenceMapIterator setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceMapIterator.setValue(Object)"})
  void testReferenceMapIteratorSetValue() {
    // Arrange
    ReferenceMapIterator<Object, Object> referenceMapIterator =
        new ReferenceMapIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(
        IllegalStateException.class, () -> referenceMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test ReferenceStrength {@link ReferenceStrength#resolve(int)}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceStrength#resolve(int)}
   */
  @Test
  @DisplayName(
      "Test ReferenceStrength resolve(int); when forty-two; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceStrength ReferenceStrength.resolve(int)"})
  void testReferenceStrengthResolve_whenFortyTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ReferenceStrength.resolve(42));
  }

  /**
   * Test ReferenceStrength {@link ReferenceStrength#resolve(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code SOFT}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceStrength#resolve(int)}
   */
  @Test
  @DisplayName("Test ReferenceStrength resolve(int); when one; then return 'SOFT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceStrength ReferenceStrength.resolve(int)"})
  void testReferenceStrengthResolve_whenOne_thenReturnSoft() {
    // Arrange, Act and Assert
    assertEquals(ReferenceStrength.SOFT, ReferenceStrength.resolve(1));
  }

  /**
   * Test ReferenceStrength {@link ReferenceStrength#resolve(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code WEAK}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceStrength#resolve(int)}
   */
  @Test
  @DisplayName("Test ReferenceStrength resolve(int); when two; then return 'WEAK'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceStrength ReferenceStrength.resolve(int)"})
  void testReferenceStrengthResolve_whenTwo_thenReturnWeak() {
    // Arrange, Act and Assert
    assertEquals(ReferenceStrength.WEAK, ReferenceStrength.resolve(2));
  }

  /**
   * Test ReferenceStrength {@link ReferenceStrength#resolve(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code HARD}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceStrength#resolve(int)}
   */
  @Test
  @DisplayName("Test ReferenceStrength resolve(int); when zero; then return 'HARD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceStrength ReferenceStrength.resolve(int)"})
  void testReferenceStrengthResolve_whenZero_thenReturnHard() {
    // Arrange, Act and Assert
    assertEquals(ReferenceStrength.HARD, ReferenceStrength.resolve(0));
  }

  /**
   * Test ReferenceValuesIterator {@link
   * ReferenceValuesIterator#ReferenceValuesIterator(AbstractReferenceMap)}.
   *
   * <ul>
   *   <li>Then return next is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ReferenceValuesIterator#ReferenceValuesIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName(
      "Test ReferenceValuesIterator new ReferenceValuesIterator(AbstractReferenceMap); then return next is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceValuesIterator.<init>(AbstractReferenceMap)"})
  void testReferenceValuesIteratorNewReferenceValuesIterator_thenReturnNextIsNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    ReferenceValuesIterator<Object> actualReferenceValuesIterator =
        new ReferenceValuesIterator<>(parent);

    // Assert
    Object actualNextResult = actualReferenceValuesIterator.next();
    assertFalse(actualReferenceValuesIterator.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }

  /**
   * Test ReferenceValuesIterator {@link
   * ReferenceValuesIterator#ReferenceValuesIterator(AbstractReferenceMap)}.
   *
   * <ul>
   *   <li>When {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ReferenceValuesIterator#ReferenceValuesIterator(AbstractReferenceMap)}
   */
  @Test
  @DisplayName(
      "Test ReferenceValuesIterator new ReferenceValuesIterator(AbstractReferenceMap); when ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceValuesIterator.<init>(AbstractReferenceMap)"})
  void testReferenceValuesIteratorNewReferenceValuesIterator_whenReferenceIdentityMap() {
    // Arrange and Act
    ReferenceValuesIterator<Object> actualReferenceValuesIterator =
        new ReferenceValuesIterator<>(new ReferenceIdentityMap<>());

    // Assert
    assertFalse(actualReferenceValuesIterator.hasNext());
  }

  /**
   * Test ReferenceValuesIterator {@link ReferenceValuesIterator#next()}.
   *
   * <p>Method under test: {@link ReferenceValuesIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceValuesIterator next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceValuesIterator.next()"})
  void testReferenceValuesIteratorNext() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ReferenceValuesIterator<Object> referenceValuesIterator = new ReferenceValuesIterator<>(parent);

    // Act
    Object actualNextResult = referenceValuesIterator.next();

    // Assert
    assertFalse(referenceValuesIterator.hasNext());
    assertSame(referenceValuesIterator.currentValue, actualNextResult);
  }

  /**
   * Test ReferenceValuesIterator {@link ReferenceValuesIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceValuesIterator#next()}
   */
  @Test
  @DisplayName("Test ReferenceValuesIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceValuesIterator.next()"})
  void testReferenceValuesIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ReferenceValuesIterator<Object> referenceValuesIterator =
        new ReferenceValuesIterator<>(new ReferenceIdentityMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> referenceValuesIterator.next());
  }

  /**
   * Test ReferenceValues {@link ReferenceValues#ReferenceValues(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link ReferenceValues#ReferenceValues(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test ReferenceValues new ReferenceValues(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceValues.<init>(AbstractHashedMap)"})
  void testReferenceValuesNewReferenceValues() {
    // Arrange and Act
    ReferenceValues<Object> actualReferenceValues =
        new ReferenceValues<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualReferenceValues.isEmpty());
  }

  /**
   * Test SoftRef {@link SoftRef#equals(Object)}, and {@link SoftRef#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SoftRef#equals(Object)}
   *   <li>{@link SoftRef#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test SoftRef equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SoftRef.equals(Object)", "int SoftRef.hashCode()"})
  void testSoftRefEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SoftRef<Object> softRef =
        new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());
    SoftRef<Object> softRef2 =
        new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertEquals(softRef, softRef2);
    assertEquals(softRef.hashCode(), softRef2.hashCode());
  }

  /**
   * Test SoftRef {@link SoftRef#equals(Object)}, and {@link SoftRef#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SoftRef#equals(Object)}
   *   <li>{@link SoftRef#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test SoftRef equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SoftRef.equals(Object)", "int SoftRef.hashCode()"})
  void testSoftRefEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SoftRef<Object> softRef =
        new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertEquals(softRef, softRef);
    int expectedHashCodeResult = softRef.hashCode();
    assertEquals(expectedHashCodeResult, softRef.hashCode());
  }

  /**
   * Test SoftRef {@link SoftRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SoftRef#equals(Object)}
   */
  @Test
  @DisplayName("Test SoftRef equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SoftRef.equals(Object)", "int SoftRef.hashCode()"})
  void testSoftRefEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SoftRef<Object> softRef = new SoftRef<>(1, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(
        softRef, new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>()));
  }

  /**
   * Test SoftRef {@link SoftRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SoftRef#equals(Object)}
   */
  @Test
  @DisplayName("Test SoftRef equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SoftRef.equals(Object)", "int SoftRef.hashCode()"})
  void testSoftRefEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SoftRef<Object> softRef =
        new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(softRef, null);
  }

  /**
   * Test SoftRef {@link SoftRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SoftRef#equals(Object)}
   */
  @Test
  @DisplayName("Test SoftRef equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SoftRef.equals(Object)", "int SoftRef.hashCode()"})
  void testSoftRefEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SoftRef<Object> softRef =
        new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(softRef, "Different type to SoftRef");
  }

  /**
   * Test SoftRef {@link SoftRef#SoftRef(int, Object, ReferenceQueue)}.
   *
   * <p>Method under test: {@link SoftRef#SoftRef(int, Object, ReferenceQueue)}
   */
  @Test
  @DisplayName("Test SoftRef new SoftRef(int, Object, ReferenceQueue)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SoftRef.<init>(int, Object, ReferenceQueue)"})
  void testSoftRefNewSoftRef() {
    // Arrange
    Object object = AbstractHashedMap.NULL;

    // Act
    SoftRef<Object> actualSoftRef = new SoftRef<>(19088743, object, new ReferenceQueue<>());

    // Assert
    assertFalse(actualSoftRef.isEnqueued());
    assertSame(object, actualSoftRef.get());
  }

  /**
   * Test WeakRef {@link WeakRef#equals(Object)}, and {@link WeakRef#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link WeakRef#equals(Object)}
   *   <li>{@link WeakRef#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test WeakRef equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeakRef.equals(Object)", "int WeakRef.hashCode()"})
  void testWeakRefEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    WeakRef<Object> weakRef =
        new WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());
    WeakRef<Object> weakRef2 =
        new WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertEquals(weakRef, weakRef2);
    assertEquals(weakRef.hashCode(), weakRef2.hashCode());
  }

  /**
   * Test WeakRef {@link WeakRef#equals(Object)}, and {@link WeakRef#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link WeakRef#equals(Object)}
   *   <li>{@link WeakRef#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test WeakRef equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeakRef.equals(Object)", "int WeakRef.hashCode()"})
  void testWeakRefEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    WeakRef<Object> weakRef =
        new WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertEquals(weakRef, weakRef);
    int expectedHashCodeResult = weakRef.hashCode();
    assertEquals(expectedHashCodeResult, weakRef.hashCode());
  }

  /**
   * Test WeakRef {@link WeakRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link WeakRef#equals(Object)}
   */
  @Test
  @DisplayName("Test WeakRef equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeakRef.equals(Object)", "int WeakRef.hashCode()"})
  void testWeakRefEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    WeakRef<Object> weakRef = new WeakRef<>(1, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(
        weakRef, new WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>()));
  }

  /**
   * Test WeakRef {@link WeakRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link WeakRef#equals(Object)}
   */
  @Test
  @DisplayName("Test WeakRef equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeakRef.equals(Object)", "int WeakRef.hashCode()"})
  void testWeakRefEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    WeakRef<Object> weakRef =
        new WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(weakRef, null);
  }

  /**
   * Test WeakRef {@link WeakRef#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link WeakRef#equals(Object)}
   */
  @Test
  @DisplayName("Test WeakRef equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeakRef.equals(Object)", "int WeakRef.hashCode()"})
  void testWeakRefEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    WeakRef<Object> weakRef =
        new WeakRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertNotEquals(weakRef, "Different type to WeakRef");
  }

  /**
   * Test WeakRef {@link WeakRef#WeakRef(int, Object, ReferenceQueue)}.
   *
   * <p>Method under test: {@link WeakRef#WeakRef(int, Object, ReferenceQueue)}
   */
  @Test
  @DisplayName("Test WeakRef new WeakRef(int, Object, ReferenceQueue)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void WeakRef.<init>(int, Object, ReferenceQueue)"})
  void testWeakRefNewWeakRef() {
    // Arrange
    Object object = AbstractHashedMap.NULL;

    // Act
    WeakRef<Object> actualWeakRef = new WeakRef<>(19088743, object, new ReferenceQueue<>());

    // Assert
    assertSame(object, actualWeakRef.get());
  }
}
