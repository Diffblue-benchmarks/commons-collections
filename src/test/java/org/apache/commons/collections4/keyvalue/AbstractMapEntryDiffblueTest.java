package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class AbstractMapEntryDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapEntry#equals(Object)}
   *   <li>{@link AbstractMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");
    DefaultMapEntry<Object, Object> defaultMapEntry2 = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals(defaultMapEntry, defaultMapEntry2);
    int expectedHashCodeResult = defaultMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, defaultMapEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapEntry#equals(Object)}
   *   <li>{@link AbstractMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals(defaultMapEntry, defaultMapEntry);
    int expectedHashCodeResult = defaultMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, defaultMapEntry.hashCode());
  }

  /**
   * Method under test: {@link AbstractMapEntry#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals("Value", defaultMapEntry.setValue("Value"));
  }

  /**
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>(1, "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>(new DefaultMapEntry<>("Key", "Value"),
        "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", 42);

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key",
        new DefaultMapEntry<>("Key", "Value"));

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, null);
  }

  /**
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, "Different type to AbstractMapEntry");
  }
}
