package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractKeyValueDiffblueTest {
  /**
   * Test {@link AbstractKeyValue#getKey()}.
   * <p>
   * Method under test: {@link AbstractKeyValue#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractKeyValue.getKey()"})
  public void testGetKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractKeyValue.getValue()"})
  public void testGetValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractKeyValue.setKey(Object)"})
  public void testSetKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractKeyValue.setValue(Object)"})
  public void testSetValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractKeyValue.toString()"})
  public void testToString() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals("null=null", defaultKeyValue.toString());
  }
}
