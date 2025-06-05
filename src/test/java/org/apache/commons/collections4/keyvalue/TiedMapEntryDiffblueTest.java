package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TiedMapEntryDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#TiedMapEntry(Map, Object)}
   *   <li>{@link TiedMapEntry#toString()}
   *   <li>{@link TiedMapEntry#getKey()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TiedMapEntry.<init>(Map, Object)", "Object TiedMapEntry.getKey()",
      "String TiedMapEntry.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    TiedMapEntry<Object, Object> actualTiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");
    String actualToStringResult = actualTiedMapEntry.toString();

    // Assert
    assertEquals("Key", actualTiedMapEntry.getKey());
    assertEquals("Key=null", actualToStringResult);
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}, and {@link TiedMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#equals(Object)}
   *   <li>{@link TiedMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");
    TiedMapEntry<Object, Object> tiedMapEntry2 = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertEquals(tiedMapEntry, tiedMapEntry2);
    int expectedHashCodeResult = tiedMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, tiedMapEntry2.hashCode());
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}, and {@link TiedMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TiedMapEntry#equals(Object)}
   *   <li>{@link TiedMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertEquals(tiedMapEntry, tiedMapEntry);
    int expectedHashCodeResult = tiedMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, tiedMapEntry.hashCode());
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), 1);

    // Act and Assert
    assertNotEquals(tiedMapEntry, new TiedMapEntry<>(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(map, new TiedMapEntry<>(new HashMap<>(), "Key"));

    // Act and Assert
    assertNotEquals(tiedMapEntry, new TiedMapEntry<>(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, new SimpleEntry<>("42", "42"));
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, null);
  }

  /**
   * Test {@link TiedMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link TiedMapEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TiedMapEntry.equals(Object)", "int TiedMapEntry.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNotEquals(tiedMapEntry, "Different type to TiedMapEntry");
  }

  /**
   * Test {@link TiedMapEntry#getValue()}.
   * <p>
   * Method under test: {@link TiedMapEntry#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object TiedMapEntry.getValue()"})
  void testGetValue() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act and Assert
    assertNull(tiedMapEntry.getValue());
  }

  /**
   * Test {@link TiedMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link TiedMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object TiedMapEntry.setValue(Object)"})
  void testSetValue() {
    // Arrange
    TiedMapEntry<Object, Object> tiedMapEntry = new TiedMapEntry<>(new HashMap<>(), "Key");

    // Act
    Object actualSetValueResult = tiedMapEntry.setValue("Value");

    // Assert
    assertEquals("Value", tiedMapEntry.getValue());
    assertNull(actualSetValueResult);
  }
}
