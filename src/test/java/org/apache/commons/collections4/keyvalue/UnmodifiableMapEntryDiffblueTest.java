package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableMapEntryDiffblueTest {
  /**
   * Test {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Object, Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UnmodifiableMapEntry.<init>(Object, Object)"})
  public void testNewUnmodifiableMapEntry() {
    // Arrange and Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry = new UnmodifiableMapEntry<>("Key", "Value");

    // Assert
    assertEquals("Key", actualUnmodifiableMapEntry.getKey());
    assertEquals("Value", actualUnmodifiableMapEntry.getValue());
  }

  /**
   * Test {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Entry)}.
   * <p>
   * Method under test: {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Entry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UnmodifiableMapEntry.<init>(Entry)"})
  public void testNewUnmodifiableMapEntry2() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    // Act and Assert
    assertEquals(entry, new UnmodifiableMapEntry<>(entry));
  }

  /**
   * Test {@link UnmodifiableMapEntry#UnmodifiableMapEntry(KeyValue)}.
   * <p>
   * Method under test: {@link UnmodifiableMapEntry#UnmodifiableMapEntry(KeyValue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UnmodifiableMapEntry.<init>(KeyValue)"})
  public void testNewUnmodifiableMapEntry3() {
    // Arrange and Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry = new UnmodifiableMapEntry<>(
        new DefaultKeyValue<>());

    // Assert
    assertNull(actualUnmodifiableMapEntry.getKey());
    assertNull(actualUnmodifiableMapEntry.getValue());
  }

  /**
   * Test {@link UnmodifiableMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link UnmodifiableMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object UnmodifiableMapEntry.setValue(Object)"})
  public void testSetValue() {
    // Arrange
    UnmodifiableMapEntry<Object, Object> unmodifiableMapEntry = new UnmodifiableMapEntry<>("Key", "Value");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMapEntry.setValue("Value"));
  }
}
