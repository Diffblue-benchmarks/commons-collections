package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.junit.Test;

public class UnmodifiableMapEntryDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Object, Object)}
   */
  @Test
  public void testNewUnmodifiableMapEntry() {
    // Arrange and Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry = new UnmodifiableMapEntry<>("Key", "Value");

    // Assert
    assertEquals("Key", actualUnmodifiableMapEntry.getKey());
    assertEquals("Value", actualUnmodifiableMapEntry.getValue());
  }

  /**
   * Method under test: {@link UnmodifiableMapEntry#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    UnmodifiableMapEntry<Object, Object> unmodifiableMapEntry = new UnmodifiableMapEntry<>("Key", "Value");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMapEntry.setValue("Value"));
  }

  /**
   * Method under test:
   * {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Map.Entry)}
   */
  @Test
  public void testNewUnmodifiableMapEntry2() {
    // Arrange
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    // Act and Assert
    assertEquals(entry, new UnmodifiableMapEntry<>(entry));
  }

  /**
   * Method under test:
   * {@link UnmodifiableMapEntry#UnmodifiableMapEntry(KeyValue)}
   */
  @Test
  public void testNewUnmodifiableMapEntry3() {
    // Arrange and Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry = new UnmodifiableMapEntry<>(
        new DefaultKeyValue<>());

    // Assert
    assertNull(actualUnmodifiableMapEntry.getKey());
    assertNull(actualUnmodifiableMapEntry.getValue());
  }
}
