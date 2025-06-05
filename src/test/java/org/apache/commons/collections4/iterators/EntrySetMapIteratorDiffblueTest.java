package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EntrySetMapIteratorDiffblueTest {
  /**
   * Test {@link EntrySetMapIterator#EntrySetMapIterator(Map)}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#EntrySetMapIterator(Map)}
   */
  @Test
  @DisplayName("Test new EntrySetMapIterator(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EntrySetMapIterator.<init>(Map)"})
  void testNewEntrySetMapIterator() {
    // Arrange and Act
    EntrySetMapIterator<Object, Object> actualEntrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Assert
    assertFalse(actualEntrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#getKey()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test getKey()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EntrySetMapIterator.getKey()"})
  void testGetKey() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getKey());
  }

  /**
   * Test {@link EntrySetMapIterator#getValue()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EntrySetMapIterator.getValue()"})
  void testGetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getValue());
  }

  /**
   * Test {@link EntrySetMapIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given HashMap() '42' is '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EntrySetMapIterator.hasNext()"})
  void testHasNext_givenHashMap42Is42_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertTrue(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EntrySetMapIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#next()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetMapIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given HashMap() '42' is '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EntrySetMapIterator.next()"})
  void testNext_givenHashMap42Is42_thenReturn42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertEquals("42", entrySetMapIterator.next());
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#remove()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EntrySetMapIterator.remove()"})
  void testRemove() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.remove());
  }

  /**
   * Test {@link EntrySetMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EntrySetMapIterator.setValue(Object)"})
  void testSetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.setValue("Value"));
  }

  /**
   * Test {@link EntrySetMapIterator#toString()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String EntrySetMapIterator.toString()"})
  void testToString() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", entrySetMapIterator.toString());
  }
}
