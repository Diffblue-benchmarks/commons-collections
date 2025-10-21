package org.apache.commons.collections4.map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EntrySetToMapIteratorAdapterDiffblueTest {
  /**
   * Test {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetToMapIteratorAdapter.<init>(Set)"})
  public void testNewEntrySetToMapIteratorAdapter_whenHashSet() {
    // Arrange and Act
    EntrySetToMapIteratorAdapter<Object, Object> actualEntrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Assert
    assertFalse(actualEntrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#current()}.
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#current()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Entry EntrySetToMapIteratorAdapter.current()"})
  public void testCurrent() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.current());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#getKey()}.
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.getKey()"})
  public void testGetKey() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.getKey());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#getValue()}.
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.getValue()"})
  public void testGetValue() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.getValue());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#hasNext()}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link SimpleEntry#SimpleEntry(Object, Object)} with {@link AbstractHashedMap#NULL} and {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntrySetToMapIteratorAdapter.hasNext()"})
  public void testHasNext_givenHashSetAddSimpleEntryWithNullAndNull_thenReturnTrue() {
    // Arrange
    HashSet<Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        entrySet);

    // Act and Assert
    assertTrue(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntrySetToMapIteratorAdapter.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertFalse(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#next()}.
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code null}.</li>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.next()"})
  public void testNext_givenHashSetAddNull_thenThrowIllegalStateException() {
    // Arrange
    HashSet<Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(null);
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        entrySet);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.next());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#next()}.
   * <ul>
   *   <li>Then not {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)} with entrySet is {@link HashSet#HashSet()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.next()"})
  public void testNext_thenNotEntrySetToMapIteratorAdapterWithEntrySetIsHashSetHasNext() {
    // Arrange
    HashSet<Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        entrySet);

    // Act
    entrySetToMapIteratorAdapter.next();

    // Assert
    assertFalse(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Test {@link EntrySetToMapIteratorAdapter#setValue(Object)}.
   * <p>
   * Method under test: {@link EntrySetToMapIteratorAdapter#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetToMapIteratorAdapter.setValue(Object)"})
  public void testSetValue() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.setValue(AbstractHashedMap.NULL));
  }
}
