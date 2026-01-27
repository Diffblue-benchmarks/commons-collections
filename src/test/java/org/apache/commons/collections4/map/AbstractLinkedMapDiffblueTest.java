package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.EntrySetIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.KeySetIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.ValuesIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractLinkedMapDiffblueTest {
  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given LRUMap() NULL is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  void testContainsValue_givenLRUMapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given LRUMap(); when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  void testContainsValue_givenLRUMap_whenNull_thenReturnFalse() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given ObjectInputStream readObject() return '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  void testContainsValue_givenObjectInputStreamReadObjectReturn42_thenReturnFalse()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("42");
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    boolean actualContainsValueResult = objectObjectMap.containsValue(AbstractHashedMap.NULL);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code 42}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given ObjectInputStream readObject() return '42'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  void testContainsValue_givenObjectInputStreamReadObjectReturn42_whenNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("42");
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    boolean actualContainsValueResult = objectObjectMap.containsValue(null);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code
   *       null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given ObjectInputStream readObject() return 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  void testContainsValue_givenObjectInputStreamReadObjectReturnNull_thenReturnTrue()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(null);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    boolean actualContainsValueResult = objectObjectMap.containsValue(null);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link AbstractLinkedMap#createEntry(HashEntry, int, Object, Object)}.
   *
   * <p>Method under test: {@link AbstractLinkedMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @DisplayName("Test createEntry(HashEntry, int, Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.createEntry(HashEntry, int, Object, Object)"})
  void testCreateEntry() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualCreateEntryResult =
        objectObjectMap.createEntry(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    HashEntry<Object, Object> expectedCreateEntryResult = actualCreateEntryResult.next;
    assertEquals(expectedCreateEntryResult, actualCreateEntryResult);
    assertSame(actualCreateEntryResult.key, next.getValue());
  }

  /**
   * Test {@link AbstractLinkedMap#createEntrySetIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link EntrySetIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#createEntrySetIterator()}
   */
  @Test
  @DisplayName(
      "Test createEntrySetIterator(); given LRUMap() NULL is NULL; then return EntrySetIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createEntrySetIterator()"})
  void testCreateEntrySetIterator_givenLRUMapNullIsNull_thenReturnEntrySetIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Iterator<Entry<Object, Object>> actualCreateEntrySetIteratorResult =
        objectObjectMap.createEntrySetIterator();

    // Assert
    LinkEntry expectedNextResult = ((LinkIterator) actualCreateEntrySetIteratorResult).next;
    assertTrue(actualCreateEntrySetIteratorResult instanceof EntrySetIterator);
    Entry<Object, Object> actualNextResult = actualCreateEntrySetIteratorResult.next();
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
    assertSame(expectedNextResult, actualNextResult);
  }

  /**
   * Test {@link AbstractLinkedMap#createEntrySetIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then return {@link EmptyOrderedIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#createEntrySetIterator()}
   */
  @Test
  @DisplayName("Test createEntrySetIterator(); given LRUMap(); then return EmptyOrderedIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createEntrySetIterator()"})
  void testCreateEntrySetIterator_givenLRUMap_thenReturnEmptyOrderedIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    Iterator<Entry<Object, Object>> actualCreateEntrySetIteratorResult =
        objectObjectMap.createEntrySetIterator();

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
    assertSame(
        ((EmptyOrderedIterator) actualCreateEntrySetIteratorResult).INSTANCE,
        actualCreateEntrySetIteratorResult);
  }

  /**
   * Test {@link AbstractLinkedMap#createKeySetIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link KeySetIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#createKeySetIterator()}
   */
  @Test
  @DisplayName(
      "Test createKeySetIterator(); given LRUMap() NULL is NULL; then return KeySetIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createKeySetIterator()"})
  void testCreateKeySetIterator_givenLRUMapNullIsNull_thenReturnKeySetIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof KeySetIterator);
    assertNull(actualCreateKeySetIteratorResult.next());
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedMap#createKeySetIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then return {@link EmptyOrderedIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#createKeySetIterator()}
   */
  @Test
  @DisplayName("Test createKeySetIterator(); given LRUMap(); then return EmptyOrderedIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createKeySetIterator()"})
  void testCreateKeySetIterator_givenLRUMap_thenReturnEmptyOrderedIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
    assertSame(
        ((EmptyOrderedIterator) actualCreateKeySetIteratorResult).INSTANCE,
        actualCreateKeySetIteratorResult);
  }

  /**
   * Test {@link AbstractLinkedMap#createValuesIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link ValuesIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#createValuesIterator()}
   */
  @Test
  @DisplayName(
      "Test createValuesIterator(); given LRUMap() NULL is NULL; then return ValuesIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createValuesIterator()"})
  void testCreateValuesIterator_givenLRUMapNullIsNull_thenReturnValuesIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator();

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof ValuesIterator);
    Object actualNextResult = actualCreateValuesIteratorResult.next();
    assertFalse(actualCreateValuesIteratorResult.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }

  /**
   * Test {@link AbstractLinkedMap#createValuesIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then return {@link EmptyOrderedIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#createValuesIterator()}
   */
  @Test
  @DisplayName("Test createValuesIterator(); given LRUMap(); then return EmptyOrderedIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createValuesIterator()"})
  void testCreateValuesIterator_givenLRUMap_thenReturnEmptyOrderedIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator();

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
    assertSame(
        ((EmptyOrderedIterator) actualCreateValuesIteratorResult).INSTANCE,
        actualCreateValuesIteratorResult);
  }

  /**
   * Test {@link AbstractLinkedMap#entryAfter(LinkEntry)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#entryAfter(LinkEntry)}
   */
  @Test
  @DisplayName("Test entryAfter(LinkEntry); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.entryAfter(LinkEntry)"})
  void testEntryAfter_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> entry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualEntryAfterResult = objectObjectMap.entryAfter(entry);

    // Assert
    assertNull(actualEntryAfterResult);
  }

  /**
   * Test {@link AbstractLinkedMap#entryBefore(LinkEntry)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#entryBefore(LinkEntry)}
   */
  @Test
  @DisplayName("Test entryBefore(LinkEntry); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.entryBefore(LinkEntry)"})
  void testEntryBefore_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> entry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualEntryBeforeResult = objectObjectMap.entryBefore(entry);

    // Assert
    assertNull(actualEntryBeforeResult);
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)}.
   *
   * <p>Method under test: {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)}
   */
  @Test
  @DisplayName("Test EntrySetIterator new EntrySetIterator(AbstractLinkedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetIterator.<init>(AbstractLinkedMap)"})
  void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange and Act
    EntrySetIterator<Object, Object> actualEntrySetIterator =
        new EntrySetIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)} with parent is
   *       {@link LRUMap#LRUMap()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @DisplayName(
      "Test EntrySetIterator next(); then not EntrySetIterator(AbstractLinkedMap) with parent is LRUMap() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry EntrySetIterator.next()"})
  void testEntrySetIteratorNext_thenNotEntrySetIteratorWithParentIsLRUMapHasNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act
    Entry<Object, Object> actualNextResult = entrySetIterator.next();

    // Assert
    assertFalse(entrySetIterator.hasNext());
    assertSame(entrySetIterator.last, actualNextResult);
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
  @MethodsUnderTest({"Entry EntrySetIterator.next()"})
  void testEntrySetIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.next());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#previous()}.
   *
   * <p>Method under test: {@link EntrySetIterator#previous()}
   */
  @Test
  @DisplayName("Test EntrySetIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry EntrySetIterator.previous()"})
  void testEntrySetIteratorPrevious() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.previous());
  }

  /**
   * Test {@link AbstractLinkedMap#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given LRUMap() NULL is NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.firstKey()"})
  void testFirstKey_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.firstKey());
  }

  /**
   * Test {@link AbstractLinkedMap#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given LRUMap(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.firstKey()"})
  void testFirstKey_givenLRUMap_thenThrowNoSuchElementException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.firstKey());
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   *
   * <p>Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object) with 'key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  void testGetEntryWithKey() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> linkEntry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualEntry = objectObjectMap.getEntry(linkEntry);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualEntry);
    assertEquals(1, objectObjectMap.size());
    assertSame(linkEntry.key, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return Value is {@link HashEntry#key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test getEntry(Object) with 'key'; given LRUMap() NULL is NULL; when NULL; then return Value is key")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  void testGetEntryWithKey_givenLRUMapNullIsNull_whenNull_thenReturnValueIsKey() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualEntry = objectObjectMap.getEntry(AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    LinkEntry<Object, Object> linkEntry = actualEntry.after;
    assertSame(actualEntry, linkEntry.after);
    LinkEntry<Object, Object> linkEntry2 = actualEntry.before;
    assertSame(actualEntry, linkEntry2.after);
    assertSame(actualEntry, linkEntry.before);
    assertSame(actualEntry, linkEntry2.before);
    Object object = actualEntry.key;
    assertSame(object, actualEntry.getValue());
    assertSame(object, objectObjectMap.get(null));
    assertSame(object, linkEntry.key);
    assertSame(object, linkEntry2.key);
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object) with 'key'; given LRUMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  void testGetEntryWithKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getEntry(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then {@link LRUMap#LRUMap()} {@code null} is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object) with 'key'; when 'Key'; then LRUMap() 'null' is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  void testGetEntryWithKey_whenKey_thenLRUMapNullIsNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    LinkEntry<Object, Object> actualEntry = objectObjectMap.getEntry("Key");

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualEntry);
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Value is {@link HashEntry#key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object) with 'key'; when 'null'; then return Value is key")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  void testGetEntryWithKey_whenNull_thenReturnValueIsKey()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    LinkEntry<Object, Object> actualEntry = objectObjectMap.getEntry(null);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    LinkEntry<Object, Object> linkEntry = actualEntry.after;
    assertSame(actualEntry, linkEntry.after);
    LinkEntry<Object, Object> linkEntry2 = actualEntry.before;
    assertSame(actualEntry, linkEntry2.after);
    assertSame(actualEntry, linkEntry.before);
    assertSame(actualEntry, linkEntry2.before);
    Object object = actualEntry.key;
    assertSame(object, actualEntry.getValue());
    assertSame(object, objectObjectMap.get(null));
    assertSame(object, linkEntry.key);
    assertSame(object, linkEntry2.key);
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#KeySetIterator(AbstractLinkedMap)}.
   *
   * <p>Method under test: {@link KeySetIterator#KeySetIterator(AbstractLinkedMap)}
   */
  @Test
  @DisplayName("Test KeySetIterator new KeySetIterator(AbstractLinkedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeySetIterator.<init>(AbstractLinkedMap)"})
  void testKeySetIteratorNewKeySetIterator() {
    // Arrange and Act
    KeySetIterator<Object> actualKeySetIterator = new KeySetIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @DisplayName("Test KeySetIterator next(); given LRUMap() NULL is NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  void testKeySetIteratorNext_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(parent);

    // Act and Assert
    assertNull(keySetIterator.next());
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
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> keySetIterator.next());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#previous()}.
   *
   * <p>Method under test: {@link KeySetIterator#previous()}
   */
  @Test
  @DisplayName("Test KeySetIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object KeySetIterator.previous()"})
  void testKeySetIteratorPrevious() {
    // Arrange
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> keySetIterator.previous());
  }

  /**
   * Test {@link AbstractLinkedMap#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given LRUMap() NULL is NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.lastKey()"})
  void testLastKey_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.lastKey());
  }

  /**
   * Test {@link AbstractLinkedMap#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given LRUMap(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.lastKey()"})
  void testLastKey_givenLRUMap_thenThrowNoSuchElementException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.lastKey());
  }

  /**
   * Test LinkEntry {@link LinkEntry#LinkEntry(HashEntry, int, Object, Object)}.
   *
   * <p>Method under test: {@link LinkEntry#LinkEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @DisplayName("Test LinkEntry new LinkEntry(HashEntry, int, Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkEntry.<init>(HashEntry, int, Object, Object)"})
  void testLinkEntryNewLinkEntry() {
    // Arrange
    HashEntry<Object, Object> next =
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualLinkEntry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    HashEntry<Object, Object> expectedLinkEntry = actualLinkEntry.next;
    assertEquals(expectedLinkEntry, actualLinkEntry);
  }

  /**
   * Test LinkIterator {@link LinkIterator#currentEntry()}.
   *
   * <p>Method under test: {@link LinkIterator#currentEntry()}
   */
  @Test
  @DisplayName("Test LinkIterator currentEntry()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry LinkIterator.currentEntry()"})
  void testLinkIteratorCurrentEntry() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertNull(entrySetIterator.currentEntry());
  }

  /**
   * Test LinkIterator {@link LinkIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LinkIterator#hasNext()}
   */
  @Test
  @DisplayName("Test LinkIterator hasNext(); given LRUMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkIterator.hasNext()"})
  void testLinkIteratorHasNext_givenLRUMapNullIsNull_thenReturnTrue() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Test LinkIterator {@link LinkIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LinkIterator#hasNext()}
   */
  @Test
  @DisplayName("Test LinkIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkIterator.hasNext()"})
  void testLinkIteratorHasNext_thenReturnFalse() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test LinkIterator {@link LinkIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link LinkIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test LinkIterator hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkIterator.hasPrevious()"})
  void testLinkIteratorHasPrevious() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasPrevious());
  }

  /**
   * Test LinkIterator {@link LinkIterator#nextEntry()}.
   *
   * <ul>
   *   <li>Then not {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)} with parent is
   *       {@link LRUMap#LRUMap()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link LinkIterator#nextEntry()}
   */
  @Test
  @DisplayName(
      "Test LinkIterator nextEntry(); then not EntrySetIterator(AbstractLinkedMap) with parent is LRUMap() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry LinkIterator.nextEntry()"})
  void testLinkIteratorNextEntry_thenNotEntrySetIteratorWithParentIsLRUMapHasNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act
    LinkEntry<Object, Object> actualNextEntryResult = entrySetIterator.nextEntry();

    // Assert
    assertFalse(entrySetIterator.hasNext());
    assertSame(entrySetIterator.last, actualNextEntryResult);
  }

  /**
   * Test LinkIterator {@link LinkIterator#nextEntry()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link LinkIterator#nextEntry()}
   */
  @Test
  @DisplayName("Test LinkIterator nextEntry(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry LinkIterator.nextEntry()"})
  void testLinkIteratorNextEntry_thenThrowNoSuchElementException() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.nextEntry());
  }

  /**
   * Test LinkIterator {@link LinkIterator#previousEntry()}.
   *
   * <p>Method under test: {@link LinkIterator#previousEntry()}
   */
  @Test
  @DisplayName("Test LinkIterator previousEntry()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkEntry LinkIterator.previousEntry()"})
  void testLinkIteratorPreviousEntry() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.previousEntry());
  }

  /**
   * Test LinkIterator {@link LinkIterator#remove()}.
   *
   * <p>Method under test: {@link LinkIterator#remove()}
   */
  @Test
  @DisplayName("Test LinkIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkIterator.remove()"})
  void testLinkIteratorRemove() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test LinkIterator {@link LinkIterator#toString()}.
   *
   * <p>Method under test: {@link LinkIterator#toString()}
   */
  @Test
  @DisplayName("Test LinkIterator toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String LinkIterator.toString()"})
  void testLinkIteratorToString() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertEquals("Iterator[]", entrySetIterator.toString());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#getKey()}.
   *
   * <p>Method under test: {@link LinkMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test LinkMapIterator getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkMapIterator.getKey()"})
  void testLinkMapIteratorGetKey() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.getKey());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#getValue()}.
   *
   * <p>Method under test: {@link LinkMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test LinkMapIterator getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkMapIterator.getValue()"})
  void testLinkMapIteratorGetValue() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.getValue());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#LinkMapIterator(AbstractLinkedMap)}.
   *
   * <p>Method under test: {@link LinkMapIterator#LinkMapIterator(AbstractLinkedMap)}
   */
  @Test
  @DisplayName("Test LinkMapIterator new LinkMapIterator(AbstractLinkedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkMapIterator.<init>(AbstractLinkedMap)"})
  void testLinkMapIteratorNewLinkMapIterator() {
    // Arrange and Act
    LinkMapIterator<Object, Object> actualLinkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualLinkMapIterator.hasNext());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LinkMapIterator#next()}
   */
  @Test
  @DisplayName("Test LinkMapIterator next(); given LRUMap() NULL is NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkMapIterator.next()"})
  void testLinkMapIteratorNext_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(parent);

    // Act and Assert
    assertNull(linkMapIterator.next());
    assertFalse(linkMapIterator.hasNext());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link LinkMapIterator#next()}
   */
  @Test
  @DisplayName("Test LinkMapIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkMapIterator.next()"})
  void testLinkMapIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkMapIterator.next());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#previous()}.
   *
   * <p>Method under test: {@link LinkMapIterator#previous()}
   */
  @Test
  @DisplayName("Test LinkMapIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkMapIterator.previous()"})
  void testLinkMapIteratorPrevious() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> linkMapIterator.previous());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link LinkMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test LinkMapIterator setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkMapIterator.setValue(Object)"})
  void testLinkMapIteratorSetValue() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(
        IllegalStateException.class, () -> linkMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link LinkMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given LRUMap() NULL is NULL; then return LinkMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator AbstractLinkedMap.mapIterator()"})
  void testMapIterator_givenLRUMapNullIsNull_thenReturnLinkMapIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof LinkMapIterator);
    assertNull(actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractLinkedMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then return {@link EmptyOrderedMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given LRUMap(); then return EmptyOrderedMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator AbstractLinkedMap.mapIterator()"})
  void testMapIterator_givenLRUMap_thenReturnEmptyOrderedMapIterator() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    OrderedMapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(
        ((EmptyOrderedMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   *
   * <p>Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  void testNextKey() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> linkEntry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualNextKeyResult = objectObjectMap.nextKey(linkEntry);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualNextKeyResult);
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given LRUMap() NULL is NULL; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  void testNextKey_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @DisplayName("Test nextKey(Object); given LRUMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  void testNextKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return one.
   *   <li>When {@code Key}.
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Object); given ObjectInputStream readInt() return one; when 'Key'; then calls readFloat()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  void testNextKey_givenObjectInputStreamReadIntReturnOne_whenKey_thenCallsReadFloat()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualNextKeyResult = objectObjectMap.nextKey("Key");

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualNextKeyResult);
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return one.
   *   <li>When {@code null}.
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @DisplayName(
      "Test nextKey(Object); given ObjectInputStream readInt() return one; when 'null'; then calls readFloat()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  void testNextKey_givenObjectInputStreamReadIntReturnOne_whenNull_thenCallsReadFloat()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualNextKeyResult = objectObjectMap.nextKey(null);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualNextKeyResult);
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   *
   * <p>Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  void testPreviousKey() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   *
   * <p>Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  void testPreviousKey2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given LRUMap() NULL is NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  void testPreviousKey_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given LRUMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  void testPreviousKey_givenLRUMap_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#ValuesIterator(AbstractLinkedMap)}.
   *
   * <p>Method under test: {@link ValuesIterator#ValuesIterator(AbstractLinkedMap)}
   */
  @Test
  @DisplayName("Test ValuesIterator new ValuesIterator(AbstractLinkedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValuesIterator.<init>(AbstractLinkedMap)"})
  void testValuesIteratorNewValuesIterator() {
    // Arrange and Act
    ValuesIterator<Object> actualValuesIterator = new ValuesIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link ValuesIterator#ValuesIterator(AbstractLinkedMap)} with parent is {@link
   *       LRUMap#LRUMap()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @DisplayName(
      "Test ValuesIterator next(); then not ValuesIterator(AbstractLinkedMap) with parent is LRUMap() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  void testValuesIteratorNext_thenNotValuesIteratorWithParentIsLRUMapHasNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(parent);

    // Act
    Object actualNextResult = valuesIterator.next();

    // Assert
    assertFalse(valuesIterator.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
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
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> valuesIterator.next());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#previous()}.
   *
   * <p>Method under test: {@link ValuesIterator#previous()}
   */
  @Test
  @DisplayName("Test ValuesIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ValuesIterator.previous()"})
  void testValuesIteratorPrevious() {
    // Arrange
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> valuesIterator.previous());
  }
}
