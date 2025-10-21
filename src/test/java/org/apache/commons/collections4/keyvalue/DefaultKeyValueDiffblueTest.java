package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DefaultKeyValueDiffblueTest {
  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue(Entry)}.
   * <p>
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue(Entry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultKeyValue.<init>(Entry)"})
  public void testNewDefaultKeyValue() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    // Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>(entry);

    // Assert
    Entry<Object, Object> toMapEntryResult = actualDefaultKeyValue.toMapEntry();
    assertTrue(toMapEntryResult instanceof DefaultMapEntry);
    assertEquals("42", actualDefaultKeyValue.getKey());
    assertEquals("42", actualDefaultKeyValue.getValue());
    assertEquals(entry, toMapEntryResult);
  }

  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue(KeyValue)}.
   * <p>
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue(KeyValue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultKeyValue.<init>(KeyValue)"})
  public void testNewDefaultKeyValue2() {
    // Arrange
    DefaultKeyValue<?, ?> pair = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(pair, new DefaultKeyValue<>(pair));
  }

  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue()}.
   * <ul>
   *   <li>Then return Key is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultKeyValue.<init>()", "void DefaultKeyValue.<init>(Object, Object)"})
  public void testNewDefaultKeyValue_thenReturnKeyIsNull() {
    // Arrange and Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>();

    // Assert
    assertNull(actualDefaultKeyValue.getKey());
    assertNull(actualDefaultKeyValue.getValue());
  }

  /**
   * Test {@link DefaultKeyValue#DefaultKeyValue(Object, Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#DefaultKeyValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultKeyValue.<init>()", "void DefaultKeyValue.<init>(Object, Object)"})
  public void testNewDefaultKeyValue_whenKey_thenReturnKey() {
    // Arrange and Act
    DefaultKeyValue<Object, Object> actualDefaultKeyValue = new DefaultKeyValue<>("Key", "Value");

    // Assert
    assertEquals("Key", actualDefaultKeyValue.getKey());
    assertEquals("Value", actualDefaultKeyValue.getValue());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}, and {@link DefaultKeyValue#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DefaultKeyValue#equals(Object)}
   *   <li>{@link DefaultKeyValue#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
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
   * Test {@link DefaultKeyValue#equals(Object)}, and {@link DefaultKeyValue#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DefaultKeyValue#equals(Object)}
   *   <li>{@link DefaultKeyValue#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertEquals(defaultKeyValue, defaultKeyValue);
    int expectedHashCodeResult = defaultKeyValue.hashCode();
    assertEquals(expectedHashCodeResult, defaultKeyValue.hashCode());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>(new SimpleEntry<>("42", "42"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();
    defaultKeyValue.setValue("Value");

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>(
        new SimpleEntry<>(new DefaultKeyValue<>(), "42"));

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();
    defaultKeyValue.setValue(new DefaultKeyValue<>());

    // Act and Assert
    assertNotEquals(defaultKeyValue, new DefaultKeyValue<>());
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNotEquals(defaultKeyValue, null);
  }

  /**
   * Test {@link DefaultKeyValue#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultKeyValue#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultKeyValue.equals(Object)", "int DefaultKeyValue.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultKeyValue<Object, Object> defaultKeyValue = new DefaultKeyValue<>();

    // Act and Assert
    assertNotEquals(defaultKeyValue, "Different type to DefaultKeyValue");
  }

  /**
   * Test {@link DefaultKeyValue#setKey(Object)}.
   * <p>
   * Method under test: {@link DefaultKeyValue#setKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DefaultKeyValue.setKey(Object)"})
  public void testSetKey() {
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
   * <p>
   * Method under test: {@link DefaultKeyValue#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object DefaultKeyValue.setValue(Object)"})
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
   * Test {@link DefaultKeyValue#toMapEntry()}.
   * <p>
   * Method under test: {@link DefaultKeyValue#toMapEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Entry DefaultKeyValue.toMapEntry()"})
  public void testToMapEntry() {
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
