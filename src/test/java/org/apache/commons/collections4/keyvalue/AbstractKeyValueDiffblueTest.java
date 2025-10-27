package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class AbstractKeyValueDiffblueTest {
  /**
   * Method under test: {@link AbstractKeyValue#getKey()}
   */
  @Test
  public void testGetKey() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNull(defaultKeyValue.getKey());
  }

  /**
   * Method under test: {@link AbstractKeyValue#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNull(defaultKeyValue.getValue());
  }

  /**
   * Method under test: {@link AbstractKeyValue#setKey(Object)}
   */
  @Test
  public void testSetKey() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals("Key", defaultMapEntry.setKey("Key"));
  }

  /**
   * Method under test: {@link AbstractKeyValue#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act
    Object actualSetValueResult = defaultKeyValue.setValue("Value");

    // Assert
    Map.Entry<Object, Object> toMapEntryResult = defaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("Value", toMapEntryResult.getValue());
    assertEquals("Value", defaultKeyValue.getValue());
    assertNull(actualSetValueResult);
  }

  /**
   * Method under test: {@link AbstractKeyValue#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals("null=null", defaultKeyValue.toString());
  }
}
