package org.apache.commons.collections4.map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class EntrySetToMapIteratorAdapterDiffblueTest {
  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#current()}
   */
  @Test
  public void testCurrent() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.current());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#getKey()}
   */
  @Test
  public void testGetKey() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.getKey());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.getValue());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertFalse(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    HashSet<Map.Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        entrySet);

    // Act and Assert
    assertTrue(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    HashSet<Map.Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(new AbstractMap.SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        entrySet);

    // Act
    entrySetToMapIteratorAdapter.next();

    // Assert
    assertFalse(entrySetToMapIteratorAdapter.hasNext());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    HashSet<Map.Entry<Object, Object>> entrySet = new HashSet<>();
    entrySet.add(null);
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        entrySet);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.next());
  }

  /**
   * Method under test: {@link EntrySetToMapIteratorAdapter#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    EntrySetToMapIteratorAdapter<Object, Object> entrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetToMapIteratorAdapter.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link EntrySetToMapIteratorAdapter#EntrySetToMapIteratorAdapter(Set)}
   */
  @Test
  public void testNewEntrySetToMapIteratorAdapter() {
    // Arrange and Act
    EntrySetToMapIteratorAdapter<Object, Object> actualEntrySetToMapIteratorAdapter = new EntrySetToMapIteratorAdapter<>(
        new HashSet<>());

    // Assert
    assertFalse(actualEntrySetToMapIteratorAdapter.hasNext());
  }
}
