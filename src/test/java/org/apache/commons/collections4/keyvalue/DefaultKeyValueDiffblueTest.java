package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultKeyValueDiffblueTest {
  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue(Entry)}.
   *
   * <p>Method under test: {@link DefaultKeyValue#DefaultKeyValue(Entry)}
   */
  @Test
  @DisplayName("Test new DefaultKeyValue(Entry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultKeyValue.<init>(Entry)"})
  void testNewDefaultKeyValue() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("Key", "Value");

    // Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>(entry);

    // Assert
    Entry<Object, Object> toMapEntryResult = actualDefaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("Key", actualDefaultKeyValue.getKey());
    assertEquals("Value", actualDefaultKeyValue.getValue());
    assertEquals(entry, toMapEntryResult);
  }

  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue(KeyValue)}.
   *
   * <p>Method under test: {@link DefaultKeyValue#DefaultKeyValue(KeyValue)}
   */
  @Test
  @DisplayName("Test new DefaultKeyValue(KeyValue)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultKeyValue.<init>(KeyValue)"})
  void testNewDefaultKeyValue2() {
    // Arrange
    DefaultKeyValue<?, ?> pair = new DefaultKeyValue<>();

    // Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>(pair);

    // Assert
    assertEquals(pair, actualDefaultKeyValue);
  }

  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue()}.
   *
   * <ul>
   *   <li>Then return Key is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#DefaultKeyValue()}
   */
  @Test
  @DisplayName("Test new DefaultKeyValue(); then return Key is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultKeyValue.<init>()",
    "void DefaultKeyValue.<init>(Object, Object)"
  })
  void testNewDefaultKeyValue_thenReturnKeyIsNull() {
    // Arrange and Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>();

    // Assert
    assertNull(actualDefaultKeyValue.getKey());
    assertNull(actualDefaultKeyValue.getValue());
  }

  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#DefaultKeyValue(Object, Object)}
   */
  @Test
  @DisplayName("Test new DefaultKeyValue(Object, Object); when 'Key'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultKeyValue.<init>()",
    "void DefaultKeyValue.<init>(Object, Object)"
  })
  void testNewDefaultKeyValue_whenKey_thenReturnKey() {
    // Arrange and Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>("Key", "Value");

    // Assert
    assertEquals("Key", actualDefaultKeyValue.getKey());
    assertEquals("Value", actualDefaultKeyValue.getValue());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}, and {@link DefaultKeyValue#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultKeyValue#equals(Object)}
   *   <li>{@link DefaultKeyValue#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();
    DefaultKeyValue<Object, Object> defaultKeyValue2 = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(defaultKeyValue, defaultKeyValue2);
    assertEquals(defaultKeyValue.hashCode(), defaultKeyValue2.hashCode());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}, and {@link DefaultKeyValue#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultKeyValue#equals(Object)}
   *   <li>{@link DefaultKeyValue#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(defaultKeyValue, defaultKeyValue);
    int expectedHashCodeResult = defaultKeyValue.hashCode();
    assertEquals(expectedHashCodeResult, defaultKeyValue.hashCode());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue =
        new DefaultKeyValue<>(new SimpleEntry<>("Key", "Value"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue =
        new DefaultKeyValue<>(new SimpleEntry<>(new DefaultKeyValue<>(), "Value"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue =
        new DefaultKeyValue<>(new SimpleEntry<>(null, "Value"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>(null, new DefaultKeyValue<>());
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>(entry);

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNotEquals(defaultKeyValue, null);
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNotEquals(defaultKeyValue, "Different type to DefaultKeyValue");
  }

  /**
   * Test {@link DefaultKeyValue#setKey(Object)}.
   *
   * <p>Method under test: {@link DefaultKeyValue#setKey(Object)}
   */
  @Test
  @DisplayName("Test setKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultKeyValue.setKey(Object)"})
  void testSetKey() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act
    Object actualSetKeyResult = defaultKeyValue.setKey("Key");

    // Assert
    Entry<Object, Object> toMapEntryResult = defaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("Key", toMapEntryResult.getKey());
    assertEquals("Key", defaultKeyValue.getKey());
    assertNull(actualSetKeyResult);
  }

  /**
   * Test {@link DefaultKeyValue#setValue(Object)}.
   *
   * <p>Method under test: {@link DefaultKeyValue#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultKeyValue.setValue(Object)"})
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
   * Test {@link DefaultKeyValue#toMapEntry()}.
   *
   * <p>Method under test: {@link DefaultKeyValue#toMapEntry()}
   */
  @Test
  @DisplayName("Test toMapEntry()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry DefaultKeyValue.toMapEntry()"})
  void testToMapEntry() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act
    Entry<Object, Object> actualToMapEntryResult = defaultKeyValue.toMapEntry();

    // Assert
    assertTrue(actualToMapEntryResult instanceof DefaultMapEntry);
    assertNull(actualToMapEntryResult.getKey());
    assertNull(actualToMapEntryResult.getValue());
  }
}
