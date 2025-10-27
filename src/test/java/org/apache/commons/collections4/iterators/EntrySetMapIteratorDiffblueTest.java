package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class EntrySetMapIteratorDiffblueTest {
  /**
   * Method under test: {@link EntrySetMapIterator#getKey()}
   */
  @Test
  public void testGetKey() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getKey());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getValue());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertTrue(entrySetMapIterator.hasNext());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertEquals("42", entrySetMapIterator.next());
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.remove());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.setValue("Value"));
  }

  /**
   * Method under test: {@link EntrySetMapIterator#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", entrySetMapIterator.toString());
  }

  /**
   * Method under test: {@link EntrySetMapIterator#EntrySetMapIterator(Map)}
   */
  @Test
  public void testNewEntrySetMapIterator() {
    // Arrange and Act
    EntrySetMapIterator<Object, Object> actualEntrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Assert
    assertFalse(actualEntrySetMapIterator.hasNext());
  }
}
