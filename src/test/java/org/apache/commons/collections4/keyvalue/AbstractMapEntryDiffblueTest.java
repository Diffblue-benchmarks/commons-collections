package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractMapEntryDiffblueTest {
  /**
   * Test {@link AbstractMapEntry#equals(Object)}, and {@link AbstractMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapEntry#equals(Object)}
   *   <li>{@link AbstractMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
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
   * Test {@link AbstractMapEntry#equals(Object)}, and {@link AbstractMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapEntry#equals(Object)}
   *   <li>{@link AbstractMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals(defaultMapEntry, defaultMapEntry);
    int expectedHashCodeResult = defaultMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, defaultMapEntry.hashCode());
  }

  /**
   * Test {@link AbstractMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>(1, "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Test {@link AbstractMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>(new DefaultMapEntry<>("Key", "Value"),
        "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Test {@link AbstractMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", 42);

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Test {@link AbstractMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key",
        new DefaultMapEntry<>("Key", "Value"));

    // Act and Assert
    assertNotEquals(defaultMapEntry, new DefaultMapEntry<>("Key", "Value"));
  }

  /**
   * Test {@link AbstractMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, null);
  }

  /**
   * Test {@link AbstractMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapEntry.equals(Object)", "int AbstractMapEntry.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertNotEquals(defaultMapEntry, "Different type to AbstractMapEntry");
  }

  /**
   * Test {@link AbstractMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link AbstractMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapEntry.setValue(Object)"})
  public void testSetValue() {
    // Arrange
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals("Value", defaultMapEntry.setValue("Value"));
  }
}
