package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableMapEntryDiffblueTest {
  /**
   * Test {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Object, Object)}.
   *
   * <p>Method under test: {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Object, Object)}
   */
  @Test
  @DisplayName("Test new UnmodifiableMapEntry(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableMapEntry.<init>(Object, Object)"})
  void testNewUnmodifiableMapEntry() {
    // Arrange and Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry =
        new UnmodifiableMapEntry<>("Key", "Value");

    // Assert
    assertEquals("Key", actualUnmodifiableMapEntry.getKey());
    assertEquals("Value", actualUnmodifiableMapEntry.getValue());
  }

  /**
   * Test {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Entry)}.
   *
   * <p>Method under test: {@link UnmodifiableMapEntry#UnmodifiableMapEntry(Entry)}
   */
  @Test
  @DisplayName("Test new UnmodifiableMapEntry(Entry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableMapEntry.<init>(Entry)"})
  void testNewUnmodifiableMapEntry2() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    // Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry =
        new UnmodifiableMapEntry<>(entry);

    // Assert
    assertEquals(entry, actualUnmodifiableMapEntry);
  }

  /**
   * Test {@link UnmodifiableMapEntry#UnmodifiableMapEntry(KeyValue)}.
   *
   * <p>Method under test: {@link UnmodifiableMapEntry#UnmodifiableMapEntry(KeyValue)}
   */
  @Test
  @DisplayName("Test new UnmodifiableMapEntry(KeyValue)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableMapEntry.<init>(KeyValue)"})
  void testNewUnmodifiableMapEntry3() {
    // Arrange and Act
    UnmodifiableMapEntry<Object, Object> actualUnmodifiableMapEntry =
        new UnmodifiableMapEntry<>(new DefaultKeyValue<>());

    // Assert
    assertNull(actualUnmodifiableMapEntry.getKey());
    assertNull(actualUnmodifiableMapEntry.getValue());
  }

  /**
   * Test {@link UnmodifiableMapEntry#setValue(Object)}.
   *
   * <p>Method under test: {@link UnmodifiableMapEntry#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object UnmodifiableMapEntry.setValue(Object)"})
  void testSetValue() {
    // Arrange
    UnmodifiableMapEntry<Object, Object> unmodifiableMapEntry =
        new UnmodifiableMapEntry<>("Key", "Value");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> unmodifiableMapEntry.setValue("Value"));
  }
}
