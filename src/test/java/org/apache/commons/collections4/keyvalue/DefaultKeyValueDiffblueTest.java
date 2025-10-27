package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.junit.Test;

public class DefaultKeyValueDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link DefaultKeyValue#equals(Object)}
   *   <li>{@link DefaultKeyValue#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();
    DefaultKeyValue<Object, Object> defaultKeyValue2 = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(defaultKeyValue, defaultKeyValue2);
    int expectedHashCodeResult = defaultKeyValue.hashCode();
    assertEquals(expectedHashCodeResult, defaultKeyValue2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link DefaultKeyValue#equals(Object)}
   *   <li>{@link DefaultKeyValue#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(defaultKeyValue, defaultKeyValue);
    int expectedHashCodeResult = defaultKeyValue.hashCode();
    assertEquals(expectedHashCodeResult, defaultKeyValue.hashCode());
  }

  /**
   * Method under test: {@link DefaultKeyValue#setKey(Object)}
   */
  @Test
  public void testSetKey() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act
    Object actualSetKeyResult = defaultKeyValue.setKey("Key");

    // Assert
    Map.Entry<Object, Object> toMapEntryResult = defaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("Key", toMapEntryResult.getKey());
    assertEquals("Key", defaultKeyValue.getKey());
    assertNull(actualSetKeyResult);
  }

  /**
   * Method under test: {@link DefaultKeyValue#setValue(Object)}
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
   * Method under test: {@link DefaultKeyValue#toMapEntry()}
   */
  @Test
  public void testToMapEntry() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act
    Map.Entry<Object, Object> actualToMapEntryResult = defaultKeyValue.toMapEntry();

    // Assert
    assertTrue(actualToMapEntryResult instanceof DefaultMapEntry);
    assertNull(actualToMapEntryResult.getKey());
    assertNull(actualToMapEntryResult.getValue());
  }

  /**
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>(new AbstractMap.SimpleEntry<>("42", "42"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();
    defaultKeyValue.setValue("Value");

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>(
        new AbstractMap.SimpleEntry<>(new DefaultKeyValue<>(), "42"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();
    defaultKeyValue.setValue(new DefaultKeyValue<>());

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNotEquals(defaultKeyValue, null);
  }

  /**
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNotEquals(defaultKeyValue, "Different type to DefaultKeyValue");
  }

  /**
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue()}
   */
  @Test
  public void testNewDefaultKeyValue() {
    // Arrange and Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>();

    // Assert
    assertNull(actualDefaultKeyValue.getKey());
    assertNull(actualDefaultKeyValue.getValue());
  }

  /**
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue(Object, Object)}
   */
  @Test
  public void testNewDefaultKeyValue2() {
    // Arrange and Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>("Key", "Value");

    // Assert
    assertEquals("Key", actualDefaultKeyValue.getKey());
    assertEquals("Value", actualDefaultKeyValue.getValue());
  }

  /**
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue(Map.Entry)}
   */
  @Test
  public void testNewDefaultKeyValue3() {
    // Arrange
    AbstractMap.SimpleEntry<Object, Object> entry = new AbstractMap.SimpleEntry<>("42", "42");

    // Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>(entry);

    // Assert
    Map.Entry<Object, Object> toMapEntryResult = actualDefaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("42", actualDefaultKeyValue.getKey());
    assertEquals("42", actualDefaultKeyValue.getValue());
    assertEquals(entry, toMapEntryResult);
  }

  /**
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue(KeyValue)}
   */
  @Test
  public void testNewDefaultKeyValue4() {
    // Arrange
    DefaultKeyValue<?, ?> pair = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(pair, new DefaultKeyValue<>(pair));
  }
}
