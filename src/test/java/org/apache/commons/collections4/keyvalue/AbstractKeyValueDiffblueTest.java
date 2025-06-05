package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractKeyValueDiffblueTest {
  /**
   * Test {@link AbstractKeyValue#getKey()}.
   * <p>
   * Method under test: {@link AbstractKeyValue#getKey()}
   */
  @Test
  @DisplayName("Test getKey()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractKeyValue.getKey()"})
  void testGetKey() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNull(defaultKeyValue.getKey());
  }

  /**
   * Test {@link AbstractKeyValue#getValue()}.
   * <p>
   * Method under test: {@link AbstractKeyValue#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractKeyValue.getValue()"})
  void testGetValue() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNull(defaultKeyValue.getValue());
  }

  /**
   * Test {@link AbstractKeyValue#setKey(Object)}.
   * <p>
   * Method under test: {@link AbstractKeyValue#setKey(Object)}
   */
  @Test
  @DisplayName("Test setKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractKeyValue.setKey(Object)"})
  void testSetKey() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals("Key", defaultMapEntry.setKey("Key"));
  }

  /**
   * Test {@link AbstractKeyValue#setValue(Object)}.
   * <p>
   * Method under test: {@link AbstractKeyValue#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractKeyValue.setValue(Object)"})
  void testSetValue() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act
    Object actualSetValueResult = defaultKeyValue.setValue("Value");

    // Assert
    Entry<Object, Object> toMapEntryResult = defaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("Value", toMapEntryResult.getValue());
    assertEquals("Value", defaultKeyValue.getValue());
    assertNull(actualSetValueResult);
  }

  /**
   * Test {@link AbstractKeyValue#toString()}.
   * <p>
   * Method under test: {@link AbstractKeyValue#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AbstractKeyValue.toString()"})
  void testToString() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals("null=null", defaultKeyValue.toString());
  }
}
