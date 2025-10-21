package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.EntrySetIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.KeySetIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkMapIterator;
import org.apache.commons.collections4.map.AbstractLinkedMap.ValuesIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractLinkedMapDiffblueTest {
  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  public void testContainsValue_givenLRUMapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  public void testContainsValue_givenLRUMap_whenNull_thenReturnFalse() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  public void testContainsValue_givenLRUMap_whenNull_thenReturnFalse2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link AbstractLinkedMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code 42}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  public void testContainsValue_givenObjectInputStreamReadObjectReturn42_thenCallsReadFloat()
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
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code 42}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  public void testContainsValue_givenObjectInputStreamReadObjectReturn42_thenCallsReadFloat2()
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
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractLinkedMap.containsValue(Object)"})
  public void testContainsValue_givenObjectInputStreamReadObjectReturnNull_thenReturnTrue()
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
   * <p>
   * Method under test: {@link AbstractLinkedMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.createEntry(HashEntry, int, Object, Object)"})
  public void testCreateEntry() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next = new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualCreateEntryResult.next, actualCreateEntryResult);
    Object expectedValue = actualCreateEntryResult.key;
    assertSame(expectedValue, next.getValue());
  }

  /**
   * Test {@link AbstractLinkedMap#createKeySetIterator()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link KeySetIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#createKeySetIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractLinkedMap.createKeySetIterator()"})
  public void testCreateKeySetIterator_givenLRUMapNullIsNull_thenReturnKeySetIterator() {
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
   * Test {@link AbstractLinkedMap#entryAfter(LinkEntry)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#entryAfter(LinkEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.entryAfter(LinkEntry)"})
  public void testEntryAfter_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.entryAfter(new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Test {@link AbstractLinkedMap#entryBefore(LinkEntry)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#entryBefore(LinkEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.entryBefore(LinkEntry)"})
  public void testEntryBefore_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.entryBefore(new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)}.
   * <p>
   * Method under test: {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetIterator.<init>(AbstractLinkedMap)"})
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange and Act
    EntrySetIterator<Object, Object> actualEntrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   * <ul>
   *   <li>Then not {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)} with parent is {@link LRUMap#LRUMap()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Entry EntrySetIterator.next()"})
  public void testEntrySetIteratorNext_thenNotEntrySetIteratorWithParentIsLRUMapHasNext() {
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
   * Test {@link AbstractLinkedMap#firstKey()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.firstKey()"})
  public void testFirstKey_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.firstKey());
  }

  /**
   * Test {@link AbstractLinkedMap#firstKey()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#firstKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.firstKey()"})
  public void testFirstKey_givenLRUMap_thenThrowNoSuchElementException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.firstKey());
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   * <p>
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  public void testGetEntryWithKey() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);
    LinkEntry<Object, Object> linkEntry = new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkEntry<Object, Object> actualEntry = objectObjectMap.getEntry(linkEntry);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualEntry);
    assertEquals(1, objectObjectMap.size());
    Object expectedGetResult = linkEntry.key;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  public void testGetEntryWithKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getEntry(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  public void testGetEntryWithKey_givenLRUMap_whenNull_thenReturnNull2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getEntry(null));
  }

  /**
   * Test {@link AbstractLinkedMap#getEntry(Object)} with {@code key}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#getEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry AbstractLinkedMap.getEntry(Object)"})
  public void testGetEntryWithKey_whenKey_thenLRUMapNull() throws IOException, ClassNotFoundException {
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
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#KeySetIterator(AbstractLinkedMap)}.
   * <p>
   * Method under test: {@link KeySetIterator#KeySetIterator(AbstractLinkedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySetIterator.<init>(AbstractLinkedMap)"})
  public void testKeySetIteratorNewKeySetIterator() {
    // Arrange and Act
    KeySetIterator<Object> actualKeySetIterator = new KeySetIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  public void testKeySetIteratorNext_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(parent);

    // Act and Assert
    assertNull(keySetIterator.next());
    assertFalse(keySetIterator.hasNext());
  }

  /**
   * Test {@link AbstractLinkedMap#lastKey()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.lastKey()"})
  public void testLastKey_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.lastKey());
  }

  /**
   * Test {@link AbstractLinkedMap#lastKey()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#lastKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.lastKey()"})
  public void testLastKey_givenLRUMap_thenThrowNoSuchElementException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectObjectMap.lastKey());
  }

  /**
   * Test LinkEntry {@link LinkEntry#LinkEntry(HashEntry, int, Object, Object)}.
   * <p>
   * Method under test: {@link LinkEntry#LinkEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkEntry.<init>(HashEntry, int, Object, Object)"})
  public void testLinkEntryNewLinkEntry() {
    // Arrange and Act
    LinkEntry<Object, Object> actualLinkEntry = new LinkEntry<>(
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualLinkEntry.next, actualLinkEntry);
  }

  /**
   * Test LinkIterator {@link LinkIterator#currentEntry()}.
   * <p>
   * Method under test: {@link LinkIterator#currentEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry LinkIterator.currentEntry()"})
  public void testLinkIteratorCurrentEntry() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertNull(entrySetIterator.currentEntry());
  }

  /**
   * Test LinkIterator {@link LinkIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkIterator.hasNext()"})
  public void testLinkIteratorHasNext_givenLRUMapNullIsNull_thenReturnTrue() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Test LinkIterator {@link LinkIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkIterator.hasNext()"})
  public void testLinkIteratorHasNext_thenReturnFalse() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test LinkIterator {@link LinkIterator#hasPrevious()}.
   * <p>
   * Method under test: {@link LinkIterator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LinkIterator.hasPrevious()"})
  public void testLinkIteratorHasPrevious() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasPrevious());
  }

  /**
   * Test LinkIterator {@link LinkIterator#nextEntry()}.
   * <ul>
   *   <li>Then not {@link EntrySetIterator#EntrySetIterator(AbstractLinkedMap)} with parent is {@link LRUMap#LRUMap()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkIterator#nextEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry LinkIterator.nextEntry()"})
  public void testLinkIteratorNextEntry_thenNotEntrySetIteratorWithParentIsLRUMapHasNext() {
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
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkIterator#nextEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry LinkIterator.nextEntry()"})
  public void testLinkIteratorNextEntry_thenThrowNoSuchElementException() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.nextEntry());
  }

  /**
   * Test LinkIterator {@link LinkIterator#previousEntry()}.
   * <p>
   * Method under test: {@link LinkIterator#previousEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LinkEntry LinkIterator.previousEntry()"})
  public void testLinkIteratorPreviousEntry() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.previousEntry());
  }

  /**
   * Test LinkIterator {@link LinkIterator#remove()}.
   * <p>
   * Method under test: {@link LinkIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkIterator.remove()"})
  public void testLinkIteratorRemove() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test LinkIterator {@link LinkIterator#toString()}.
   * <p>
   * Method under test: {@link LinkIterator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String LinkIterator.toString()"})
  public void testLinkIteratorToString() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new LRUMap<>());

    // Act and Assert
    assertEquals("Iterator[]", entrySetIterator.toString());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#getKey()}.
   * <p>
   * Method under test: {@link LinkMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkMapIterator.getKey()"})
  public void testLinkMapIteratorGetKey() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.getKey());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#getValue()}.
   * <p>
   * Method under test: {@link LinkMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkMapIterator.getValue()"})
  public void testLinkMapIteratorGetValue() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.getValue());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#LinkMapIterator(AbstractLinkedMap)}.
   * <p>
   * Method under test: {@link LinkMapIterator#LinkMapIterator(AbstractLinkedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkMapIterator.<init>(AbstractLinkedMap)"})
  public void testLinkMapIteratorNewLinkMapIterator() {
    // Arrange and Act
    LinkMapIterator<Object, Object> actualLinkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualLinkMapIterator.hasNext());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#next()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkMapIterator.next()"})
  public void testLinkMapIteratorNext_givenLRUMapNullIsNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(parent);

    // Act and Assert
    assertNull(linkMapIterator.next());
    assertFalse(linkMapIterator.hasNext());
  }

  /**
   * Test LinkMapIterator {@link LinkMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link LinkMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkMapIterator.setValue(Object)"})
  public void testLinkMapIteratorSetValue() {
    // Arrange
    LinkMapIterator<Object, Object> linkMapIterator = new LinkMapIterator<>(new LRUMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> linkMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#mapIterator()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link LinkMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator AbstractLinkedMap.mapIterator()"})
  public void testMapIterator_givenLRUMapNullIsNull_thenReturnLinkMapIterator() {
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
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   * <p>
   * Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  public void testNextKey() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualNextKeyResult = objectObjectMap.nextKey(new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualNextKeyResult);
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  public void testNextKey_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  public void testNextKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  public void testNextKey_givenLRUMap_whenNull_thenReturnNull2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.nextKey(null));
  }

  /**
   * Test {@link AbstractLinkedMap#nextKey(Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#nextKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.nextKey(Object)"})
  public void testNextKey_whenKey_thenCallsReadFloat() throws IOException, ClassNotFoundException {
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
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   * <p>
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  public void testPreviousKey() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   * <p>
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  public void testPreviousKey2() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualPreviousKeyResult = objectObjectMap.previousKey(new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualPreviousKeyResult);
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  public void testPreviousKey_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  public void testPreviousKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  public void testPreviousKey_givenLRUMap_whenNull_thenReturnNull2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.previousKey(null));
  }

  /**
   * Test {@link AbstractLinkedMap#previousKey(Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLinkedMap#previousKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractLinkedMap.previousKey(Object)"})
  public void testPreviousKey_whenKey_thenCallsReadFloat() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualPreviousKeyResult = objectObjectMap.previousKey("Key");

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualPreviousKeyResult);
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#ValuesIterator(AbstractLinkedMap)}.
   * <p>
   * Method under test: {@link ValuesIterator#ValuesIterator(AbstractLinkedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ValuesIterator.<init>(AbstractLinkedMap)"})
  public void testValuesIteratorNewValuesIterator() {
    // Arrange and Act
    ValuesIterator<Object> actualValuesIterator = new ValuesIterator<>(new LRUMap<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   * <ul>
   *   <li>Then not {@link ValuesIterator#ValuesIterator(AbstractLinkedMap)} with parent is {@link LRUMap#LRUMap()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  public void testValuesIteratorNext_thenNotValuesIteratorWithParentIsLRUMapHasNext() {
    // Arrange
    LRUMap<Object, Object> parent = new LRUMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(parent);

    // Act
    Object actualNextResult = valuesIterator.next();

    // Assert
    assertFalse(valuesIterator.hasNext());
    assertSame(parent.NULL, actualNextResult);
  }
}
