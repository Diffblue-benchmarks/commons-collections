package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EntrySetToMapIteratorAdapterDiffblueTest {
  /**
   * Test {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)}
   */
  @Test
  @DisplayName("Test new EntrySetToMapIteratorAdapter(Set); when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetToMapIteratorAdapter.<init>(Set)"})
  void testNewEntrySetToMapIteratorAdapter_whenHashSet() {
    // Arrange and Act
    EntrySetToMapIteratorAdapter<Object, Object> actualEntrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(new HashSet<>());

    // Assert
    assertFalse(actualEntrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#current()}.
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#current()}
   */
  @Test
  @DisplayName("Test current()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry EntrySetToMapIteratorAdapter.current()"})
  void testCurrent() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.current());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#getKey()}.
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#getKey()}
   */
  @Test
  @DisplayName("Test getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.getKey()"})
  void testGetKey() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.getKey());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#getValue()}.
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.getValue()"})
  void testGetValue() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.getValue());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link SimpleEntry#SimpleEntry(Object, Object)} with
   *       {@link AbstractHashedMap#NULL} and {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given HashSet() add SimpleEntry(Object, Object) with NULL and NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySetToMapIteratorAdapter.hasNext()"})
  void testHasNext_givenHashSetAddSimpleEntryWithNullAndNull_thenReturnTrue() {
    // Arrange
    HashSet<Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(entrySet);

    // Act and Assert
    assertTrue(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySetToMapIteratorAdapter.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(new HashSet<>());

    // Act and Assert
    assertFalse(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#next()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code null}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#next()}
   */
  @Test
  @DisplayName("Test next(); given HashSet() add 'null'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.next()"})
  void testNext_givenHashSetAddNull_thenThrowIllegalStateException() {
    // Arrange
    HashSet<Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(null);
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(entrySet);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.next());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#next()}.
   *
   * <ul>
   *   <li>Then not {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)} with
   *       entrySet is {@link HashSet#HashSet()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#next()}
   */
  @Test
  @DisplayName(
      "Test next(); then not EntrySetToMapIteratorAdapter(Set) with entrySet is HashSet() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.next()"})
  void testNext_thenNotEntrySetToMapIteratorAdapterWithEntrySetIsHashSetHasNext() {
    // Arrange
    HashSet<Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(entrySet);

    // Act
    entrySetToMapIteratorAdapter.next();

    // Assert
    assertFalse(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#setValue(Object)}.
   *
   * <p>Method under test: {@link EntrySetToMapIteratorAdapter#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.setValue(Object)"})
  void testSetValue() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter =
        new EntrySetToMapIteratorAdapter<>(new HashSet<>());

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> entrySetToMapIteratorAdapter.setValue(AbstractHashedMap.NULL));
  }
}
