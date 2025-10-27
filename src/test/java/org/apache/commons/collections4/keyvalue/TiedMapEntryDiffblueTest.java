package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class TiedMapEntryDiffblueTest {
  /**
   * Method under test: {@link TiedMapEntry#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNull(tiedMapEntry.getValue());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#equals(Object)}
   *   <li>{@link TiedMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");
    TiedMapEntry<Object, Object> tiedMapEntry2 = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertEquals(tiedMapEntry, tiedMapEntry2);
    int expectedHashCodeResult = tiedMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, tiedMapEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#equals(Object)}
   *   <li>{@link TiedMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(map, new TiedMapEntry<>(new HashMap<>(), "Key"));
    HashMap<Object, Object> map2 = new HashMap<>();
    TiedMapEntry<Object, Object> tiedMapEntry2 = new TiedMapEntry<>(map2, new TiedMapEntry<>(new HashMap<>(), "Key"));

    // Act and Assert
    assertEquals(tiedMapEntry, tiedMapEntry2);
    int expectedHashCodeResult = tiedMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, tiedMapEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#equals(Object)}
   *   <li>{@link TiedMapEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertEquals(tiedMapEntry, tiedMapEntry);
    int expectedHashCodeResult = tiedMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, tiedMapEntry.hashCode());
  }

  /**
   * Method under test: {@link TiedMapEntry#setValue(Object)}
   */
  @Test
  public void testSetValue() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act
    Object actualSetValueResult = tiedMapEntry.setValue("Value");

    // Assert
    assertEquals("Value", tiedMapEntry.getValue());
    assertNull(actualSetValueResult);
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), 1);

    // Act and Assert
    assertNotEquals(tiedMapEntry, new TiedMapEntry<>(new HashMap<>(), "Key"));
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(map, new TiedMapEntry<>(new HashMap<>(), "Key"));

    // Act and Assert
    assertNotEquals(tiedMapEntry, new TiedMapEntry<>(new HashMap<>(), "Key"));
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, new AbstractMap.SimpleEntry<>("42", "42"));
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(map, new AbstractMap.SimpleEntry<>("42", "42"));
    HashMap<Object, Object> map2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(tiedMapEntry, new TiedMapEntry<>(map2, new TiedMapEntry<>(new HashMap<>(), "Key")));
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(map, new DefaultMapEntry<>("Key", "Value"));
    HashMap<Object, Object> map2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(tiedMapEntry, new TiedMapEntry<>(map2, new TiedMapEntry<>(new HashMap<>(), "Key")));
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, null);
  }

  /**
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, "Different type to TiedMapEntry");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#TiedMapEntry(Map, Object)}
   *   <li>{@link TiedMapEntry#toString()}
   *   <li>{@link TiedMapEntry#getKey()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    TiedMapEntry<Object, Object> actualTiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");
    String actualToStringResult = actualTiedMapEntry.toString();

    // Assert
    assertEquals("Key", actualTiedMapEntry.getKey());
    assertEquals("Key=null", actualToStringResult);
  }
}
