package org.apache.commons.collections4.keyvalue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultMapEntryDiffblueTest {
  /**
   * Test {@link DefaultMapEntry#DefaultMapEntry(Object, Object)}.
   *
   * <p>Method under test: {@link DefaultMapEntry#DefaultMapEntry(Object, Object)}
   */
  @Test
  @DisplayName("Test new DefaultMapEntry(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultMapEntry.<init>(Object, Object)"})
  void testNewDefaultMapEntry() {
    // Arrange and Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Assert
    assertEquals("Key", actualDefaultMapEntry.getKey());
    assertEquals("Value", actualDefaultMapEntry.getValue());
  }

  /**
   * Test {@link DefaultMapEntry#DefaultMapEntry(Entry)}.
   *
   * <p>Method under test: {@link DefaultMapEntry#DefaultMapEntry(Entry)}
   */
  @Test
  @DisplayName("Test new DefaultMapEntry(Entry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultMapEntry.<init>(Entry)"})
  void testNewDefaultMapEntry2() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("Key", "Value");

    // Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry = new DefaultMapEntry<>(entry);

    // Assert
    assertEquals(entry, actualDefaultMapEntry);
  }

  /**
   * Test {@link DefaultMapEntry#DefaultMapEntry(KeyValue)}.
   *
   * <p>Method under test: {@link DefaultMapEntry#DefaultMapEntry(KeyValue)}
   */
  @Test
  @DisplayName("Test new DefaultMapEntry(KeyValue)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultMapEntry.<init>(KeyValue)"})
  void testNewDefaultMapEntry3() {
    // Arrange and Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry =
        new DefaultMapEntry<>(new DefaultKeyValue<>());

    // Assert
    assertNull(actualDefaultMapEntry.getKey());
    assertNull(actualDefaultMapEntry.getValue());
  }
}
