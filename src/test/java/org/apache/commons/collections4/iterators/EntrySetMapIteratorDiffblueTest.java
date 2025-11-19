package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EntrySetMapIteratorDiffblueTest {
  /**
   * Test {@link EntrySetMapIterator#EntrySetMapIterator(Map)}.
   *
   * <p>Method under test: {@link EntrySetMapIterator#EntrySetMapIterator(Map)}
   */
  @Test
  @DisplayName("Test new EntrySetMapIterator(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetMapIterator.<init>(Map)"})
  void testNewEntrySetMapIterator() {
    // Arrange and Act
    EntrySetMapIterator<Object, Object> actualEntrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Assert
    assertFalse(actualEntrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#getKey()}.
   *
   * <p>Method under test: {@link EntrySetMapIterator#getKey()}
   */
  @Test
  @DisplayName("Test getKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetMapIterator.getKey()"})
  void testGetKey() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getKey());
  }

  /**
   * Test {@link EntrySetMapIterator#getValue()}.
   *
   * <p>Method under test: {@link EntrySetMapIterator#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetMapIterator.getValue()"})
  void testGetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getValue());
  }

  /**
   * Test {@link EntrySetMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given HashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySetMapIterator.hasNext()"})
  void testHasNext_givenHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertTrue(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EntrySetMapIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link EntrySetMapIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given HashMap() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetMapIterator.next()"})
  void testNext_givenHashMapKeyIsValue_thenReturnKey() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertEquals("Key", entrySetMapIterator.next());
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#remove()}.
   *
   * <p>Method under test: {@link EntrySetMapIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EntrySetMapIterator.remove()"})
  void testRemove() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.remove());
  }

  /**
   * Test {@link EntrySetMapIterator#setValue(Object)}.
   *
   * <p>Method under test: {@link EntrySetMapIterator#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object EntrySetMapIterator.setValue(Object)"})
  void testSetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.setValue("Value"));
  }

  /**
   * Test {@link EntrySetMapIterator#toString()}.
   *
   * <p>Method under test: {@link EntrySetMapIterator#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String EntrySetMapIterator.toString()"})
  void testToString() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator =
        new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", entrySetMapIterator.toString());
  }
}
