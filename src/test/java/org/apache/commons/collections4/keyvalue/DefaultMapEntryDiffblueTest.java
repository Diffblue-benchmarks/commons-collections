package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DefaultMapEntryDiffblueTest {
  /**
   * Test {@link DefaultMapEntry#DefaultMapEntry(Object, Object)}.
   * <p>
   * Method under test: {@link DefaultMapEntry#DefaultMapEntry(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultMapEntry.<init>(Object, Object)"})
  public void testNewDefaultMapEntry() {
    // Arrange and Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Assert
    assertEquals("Key", actualDefaultMapEntry.getKey());
    assertEquals("Value", actualDefaultMapEntry.getValue());
  }

  /**
   * Test {@link DefaultMapEntry#DefaultMapEntry(Entry)}.
   * <p>
   * Method under test: {@link DefaultMapEntry#DefaultMapEntry(Entry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultMapEntry.<init>(Entry)"})
  public void testNewDefaultMapEntry2() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    // Act and Assert
    assertEquals(entry, new DefaultMapEntry<>(entry));
  }

  /**
   * Test {@link DefaultMapEntry#DefaultMapEntry(KeyValue)}.
   * <p>
   * Method under test: {@link DefaultMapEntry#DefaultMapEntry(KeyValue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultMapEntry.<init>(KeyValue)"})
  public void testNewDefaultMapEntry3() {
    // Arrange and Act
    DefaultMapEntry<Object, Object> actualDefaultMapEntry = new DefaultMapEntry<>(new DefaultKeyValue<>());

    // Assert
    assertNull(actualDefaultMapEntry.getKey());
    assertNull(actualDefaultMapEntry.getValue());
  }
}
