package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.junit.Test;

public class DefaultMapEntryDiffblueTest {
  /**
   * Method under test: {@link DefaultMapEntry#DefaultMapEntry(Object, Object)}
   */
  @Test
  public void testNewDefaultMapEntry() {
    // Arrange and Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Assert
    assertEquals("Key", actualDefaultMapEntry.getKey());
    assertEquals("Value", actualDefaultMapEntry.getValue());
  }

  /**
   * Method under test: {@link DefaultMapEntry#DefaultMapEntry(Map.Entry)}
   */
  @Test
  public void testNewDefaultMapEntry2() {
    // Arrange
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    // Act and Assert
    assertEquals(entry, new DefaultMapEntry<>(entry));
  }

  /**
   * Method under test: {@link DefaultMapEntry#DefaultMapEntry(KeyValue)}
   */
  @Test
  public void testNewDefaultMapEntry3() {
    // Arrange and Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry = new DefaultMapEntry<>(new DefaultKeyValue<>());

    // Assert
    assertNull(actualDefaultMapEntry.getKey());
    assertNull(actualDefaultMapEntry.getValue());
  }
}
