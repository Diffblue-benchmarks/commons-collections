package org.apache.commons.collections4.trie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractPatriciaTrieDiffblueTest {
  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test isValidUplink(TrieEntry, TrieEntry); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenNull_thenReturnFalse() {
    // Arrange
    TrieEntry<Object, Object> from = new TrieEntry<>("Key", "Value", 1);

    // Act
    boolean actualIsValidUplinkResult = AbstractPatriciaTrie.isValidUplink(null, from);

    // Assert
    assertFalse(actualIsValidUplinkResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test isValidUplink(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnTrue() {
    // Arrange
    TrieEntry<Object, Object> next = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<Object, Object> from = new TrieEntry<>("Key", "Value", 1);

    // Act
    boolean actualIsValidUplinkResult = AbstractPatriciaTrie.isValidUplink(next, from);

    // Assert
    assertTrue(actualIsValidUplinkResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test isValidUplink(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenTrieEntryWithKeyAndValueAndBitIndexIsZero_thenReturnFalse() {
    // Arrange
    TrieEntry<Object, Object> next = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<Object, Object> from = new TrieEntry<>("Key", "Value", 0);

    // Act
    boolean actualIsValidUplinkResult = AbstractPatriciaTrie.isValidUplink(next, from);

    // Assert
    assertFalse(actualIsValidUplinkResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code
   *       Value} and bitIndex is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test isValidUplink(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne() {
    // Arrange
    TrieEntry<?, ?> next = new TrieEntry<>(null, "Value", 1);
    TrieEntry<Object, Object> from = new TrieEntry<>("Key", "Value", 1);

    // Act
    boolean actualIsValidUplinkResult = AbstractPatriciaTrie.isValidUplink(next, from);

    // Assert
    assertFalse(actualIsValidUplinkResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}.
   *
   * <ul>
   *   <li>Then {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is one is {@link TrieEntry#parent}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}
   */
  @Test
  @DisplayName(
      "Test addEntry(TrieEntry, int); then TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one is parent")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.addEntry(TrieEntry, int)"})
  void testAddEntry_thenTrieEntryWithKeyAndValueAndBitIndexIsOneIsParent() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 0);
    objectMap.addEntry(entry, 3);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualAddEntryResult = objectMap.addEntry(entry2, 3);

    // Assert
    assertEquals(actualAddEntryResult.parent, entry2);
    assertSame(entry.predecessor, actualAddEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}.
   *
   * <ul>
   *   <li>Then {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is one {@link TrieEntry#parent} Value is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}
   */
  @Test
  @DisplayName(
      "Test addEntry(TrieEntry, int); then TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one parent Value is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.addEntry(TrieEntry, int)"})
  void testAddEntry_thenTrieEntryWithKeyAndValueAndBitIndexIsOneParentValueIsNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualAddEntryResult = objectMap.addEntry(entry, 3);

    // Assert
    TrieEntry<String, Object> trieEntry = entry.parent;
    assertNull(trieEntry.getValue());
    TrieEntry<String, Object> trieEntry2 = entry.right;
    assertNull(trieEntry2.getValue());
    TrieEntry<String, Object> trieEntry3 = actualAddEntryResult.right;
    assertNull(trieEntry3.getValue());
    assertNull(trieEntry.getKey());
    assertNull(trieEntry2.getKey());
    assertNull(trieEntry3.getKey());
    assertNull(trieEntry.parent);
    assertNull(trieEntry2.parent);
    assertNull(trieEntry3.parent);
    assertNull(trieEntry.right);
    assertNull(trieEntry2.right);
    assertNull(trieEntry3.right);
    assertTrue(trieEntry.isEmpty());
    assertTrue(trieEntry2.isEmpty());
    assertTrue(trieEntry3.isEmpty());
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry2.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry3.bitIndex);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = entry.parent;
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.parent;
    assertSame(trieEntry, trieEntry2.left);
    assertSame(trieEntry, actualCeilingEntryResult.right.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(entry.predecessor, trieEntry2.right);
    assertSame(entry.right, trieEntry2.parent);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>(null, "Value", 1);
    objectMap.addEntry(entry, 3);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.put("Key", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertEquals(entry.predecessor, objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.
   *   <li>Then return Key is empty string.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() empty string is 'Value'; then return Key is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieEmptyStringIsValue_thenReturnKeyIsEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry(null);

    // Assert
    assertEquals("", actualCeilingEntryResult.getKey());
    assertEquals("", actualCeilingEntryResult.left.getKey());
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.predecessor;
    assertEquals("", trieEntry.getKey());
    assertNull(actualCeilingEntryResult.parent);
    assertNull(trieEntry.parent);
    assertNull(actualCeilingEntryResult.right);
    assertNull(trieEntry.right);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, actualCeilingEntryResult.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() empty string is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieEmptyStringIsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} IfAbsent {@code foo} is {@code Value}.
   *   <li>Then return {@link TrieEntry#parent} Key is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() IfAbsent 'foo' is 'Value'; then return parent Key is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieIfAbsentFooIsValue_thenReturnParentKeyIsFoo() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "Value");
    objectMap.put("Key", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.parent;
    assertEquals("foo", trieEntry.getKey());
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.left;
    assertEquals(10, trieEntry2.bitIndex);
    TrieEntry<String, Object> expectedTrieEntry = actualCeilingEntryResult.left;
    TrieEntry<String, Object> trieEntry3 = actualCeilingEntryResult.right;
    assertSame(expectedTrieEntry, trieEntry3.right);
    TrieEntry<String, Object> trieEntry4 = trieEntry.left;
    assertSame(trieEntry4, trieEntry3.left);
    assertSame(entry.parent, trieEntry4);
    TrieEntry<String, Object> trieEntry5 = entry.right;
    assertSame(trieEntry5, trieEntry2.parent);
    assertSame(trieEntry5, trieEntry2.right);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} IfAbsent {@code foo} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return Key is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() IfAbsent 'foo' is 'Value'; when 'Key'; then return Key is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieIfAbsentFooIsValue_whenKey_thenReturnKeyIsFoo() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertEquals("foo", actualCeilingEntryResult.getKey());
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.predecessor;
    assertEquals("foo", trieEntry.getKey());
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.right;
    assertEquals("foo", trieEntry2.getKey());
    TrieEntry<String, Object> trieEntry3 = actualCeilingEntryResult.left;
    assertSame(trieEntry3, trieEntry.parent);
    assertSame(trieEntry3, trieEntry2.parent);
    assertSame(actualCeilingEntryResult.parent, trieEntry.left);
    TrieEntry<String, Object> trieEntry4 = actualCeilingEntryResult.right;
    assertSame(trieEntry4, actualCeilingEntryResult.left.left);
    assertSame(trieEntry4, actualCeilingEntryResult.parent.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>Then return {@link TrieEntry#parent} {@link TrieEntry#parent} is {@link TrieEntry#left}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() 'Key' is 'Value'; then return parent parent is left")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieKeyIsValue_thenReturnParentParentIsLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    TrieEntry<String, Object> expectedTrieEntry = actualCeilingEntryResult.left;
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.parent;
    assertSame(expectedTrieEntry, trieEntry.parent);
    TrieEntry<String, Object> expectedTrieEntry2 = actualCeilingEntryResult.parent;
    assertSame(expectedTrieEntry2, actualCeilingEntryResult.left.left);
    assertSame(entry.right, actualCeilingEntryResult.right.right);
    assertSame(actualCeilingEntryResult.right, trieEntry.right);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>Then return {@link TrieEntry#predecessor} {@link TrieEntry#parent} is {@link
   *       TrieEntry#left}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() 'Key' is 'Value'; then return predecessor parent is left")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieKeyIsValue_thenReturnPredecessorParentIsLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.left;
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.predecessor;
    assertSame(trieEntry, trieEntry2.parent);
    assertSame(trieEntry, actualCeilingEntryResult.right.parent);
    assertSame(actualCeilingEntryResult.parent, trieEntry2.left);
    TrieEntry<String, Object> trieEntry3 = actualCeilingEntryResult.right;
    assertSame(trieEntry3, actualCeilingEntryResult.left.left);
    assertSame(trieEntry3, actualCeilingEntryResult.parent.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code null}.
   *   <li>Then return {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry(null);

    // Assert
    TrieEntry<String, Object> expectedCeilingEntryResult = actualCeilingEntryResult.right;
    assertSame(expectedCeilingEntryResult, actualCeilingEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object); given PatriciaTrie(); when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.ceilingEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#left} {@link TrieEntry#right} is {@link TrieEntry#parent}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object); then return left right is parent")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_thenReturnLeftRightIsParent() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.left;
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.parent;
    assertSame(trieEntry, trieEntry2.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    TrieEntry<String, Object> trieEntry3 = actualCeilingEntryResult.parent;
    TrieEntry<String, Object> trieEntry4 = actualCeilingEntryResult.left;
    assertSame(trieEntry3, trieEntry4.right);
    TrieEntry<String, Object> trieEntry5 = actualCeilingEntryResult.predecessor;
    assertSame(trieEntry3, trieEntry5.right);
    TrieEntry<String, Object> expectedTrieEntry = actualCeilingEntryResult.predecessor;
    assertSame(expectedTrieEntry, actualCeilingEntryResult.right.left);
    TrieEntry<String, Object> trieEntry6 = actualCeilingEntryResult.right;
    assertSame(trieEntry6, trieEntry4.parent);
    assertSame(trieEntry6, trieEntry5.parent);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#right} {@link TrieEntry#predecessor} is {@link
   *       TrieEntry#left}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName("Test ceilingEntry(Object); then return right predecessor is left")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_thenReturnRightPredecessorIsLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry(null);

    // Assert
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.left;
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.parent;
    assertSame(trieEntry, trieEntry2.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    TrieEntry<String, Object> trieEntry3 = actualCeilingEntryResult.right;
    assertSame(trieEntry, trieEntry3.predecessor);
    TrieEntry<String, Object> expectedTrieEntry = actualCeilingEntryResult.parent;
    TrieEntry<String, Object> trieEntry4 = actualCeilingEntryResult.predecessor;
    assertSame(expectedTrieEntry, trieEntry4.right);
    assertSame(actualCeilingEntryResult.predecessor, trieEntry3.left);
    TrieEntry<String, Object> trieEntry5 = actualCeilingEntryResult.right;
    TrieEntry<String, Object> trieEntry6 = actualCeilingEntryResult.left;
    assertSame(trieEntry5, trieEntry6.parent);
    assertSame(trieEntry5, trieEntry4.parent);
    assertSame(trieEntry5, trieEntry6.right);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code
   *       Value} and bitIndex is {@link Short#SIZE} {@link TrieEntry#predecessor}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test ceilingEntry(Object); then return TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is SIZE predecessor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  void testCeilingEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsSizePredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", Short.SIZE);
    objectMap.addEntry(entry, 3);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#comparator()}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#comparator()}
   */
  @Test
  @DisplayName("Test comparator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparator AbstractPatriciaTrie.comparator()"})
  void testComparator() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    Comparator<? super String> actualComparatorResult = objectMap.comparator();
    int actualCompareResult = actualComparatorResult.compare("foo", "foo");

    // Assert
    assertTrue(actualComparatorResult instanceof StringKeyAnalyzer);
    assertEquals(0, actualCompareResult);
    assertEquals(Short.SIZE, ((StringKeyAnalyzer) actualComparatorResult).bitsPerElement());
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertFalse(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertTrue(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PatriciaTrie() '42' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey_givenPatriciaTrie42IsValue_thenReturnTrue() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertTrue(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PatriciaTrie(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey_givenPatriciaTrie_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#entrySet()}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractPatriciaTrie.entrySet()"})
  void testEntrySet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstEntry()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>Then return {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#firstEntry()}
   */
  @Test
  @DisplayName("Test firstEntry(); given PatriciaTrie() 'Key' is 'Value'; then return right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.firstEntry()"})
  void testFirstEntry_givenPatriciaTrieKeyIsValue_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualFirstEntryResult = objectMap.firstEntry();

    // Assert
    TrieEntry<String, Object> expectedFirstEntryResult = actualFirstEntryResult.right;
    assertSame(expectedFirstEntryResult, actualFirstEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstEntry()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#firstEntry()}
   */
  @Test
  @DisplayName("Test firstEntry(); given PatriciaTrie(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.firstEntry()"})
  void testFirstEntry_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.firstEntry());
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given PatriciaTrie() 'Key' is 'Value'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.firstKey()"})
  void testFirstKey_givenPatriciaTrieKeyIsValue_thenReturnKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectMap.firstKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstKey()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given PatriciaTrie(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.firstKey()"})
  void testFirstKey_givenPatriciaTrie_thenThrowNoSuchElementException() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectMap.firstKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#followLeft(TrieEntry)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#predecessor}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#followLeft(TrieEntry)}
   */
  @Test
  @DisplayName("Test followLeft(TrieEntry); then return predecessor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.followLeft(TrieEntry)"})
  void testFollowLeft_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualFollowLeftResult = objectMap.followLeft(node);

    // Assert
    TrieEntry<String, Object> expectedFollowLeftResult = actualFollowLeftResult.predecessor;
    assertSame(expectedFollowLeftResult, actualFollowLeftResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#followRight(TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is one.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#followRight(TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test followRight(TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.followRight(TrieEntry)"})
  void testFollowRight_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualFollowRightResult = objectMap.followRight(node);

    // Assert
    assertNull(actualFollowRightResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertEquals("Value", objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PatriciaTrie() '42' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_givenPatriciaTrie42IsValue_thenReturnValue() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertEquals("Value", objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PatriciaTrie(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("42", false, 1), 3);

    // Act and Assert
    assertFalse((Boolean) objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_thenReturnTrue() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("42", true, 1), 3);

    // Act and Assert
    assertTrue((Boolean) objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.getEntry("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>Then return {@link TrieEntry#bitIndex} is ten.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test getEntry(Object); given PatriciaTrie() '42' is 'Value'; then return bitIndex is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_givenPatriciaTrie42IsValue_thenReturnBitIndexIsTen() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act
    TrieEntry<String, Object> actualEntry = objectMap.getEntry("42");

    // Assert
    assertEquals(10, actualEntry.bitIndex);
    TrieEntry<String, Object> expectedEntry = actualEntry.right;
    assertSame(expectedEntry, actualEntry);
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object); given PatriciaTrie(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.getEntry("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#bitIndex} is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object); then return bitIndex is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_thenReturnBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualEntry = objectMap.getEntry("42");

    // Assert
    assertEquals(1, actualEntry.bitIndex);
    TrieEntry<String, Object> expectedEntry = actualEntry.left;
    assertSame(expectedEntry, actualEntry);
  }

  /**
   * Test {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}
   */
  @Test
  @DisplayName("Test getNearestEntryForKey(Object, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getNearestEntryForKey(Object, int)"})
  void testGetNearestEntryForKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.getNearestEntryForKey("Key", 3));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code Key}.
   *   <li>Then return Value is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}
   */
  @Test
  @DisplayName(
      "Test getNearestEntryForKey(Object, int); given PatriciaTrie(); when 'Key'; then return Value is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getNearestEntryForKey(Object, int)"})
  void testGetNearestEntryForKey_givenPatriciaTrie_whenKey_thenReturnValueIsNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    TrieEntry<String, Object> actualNearestEntryForKey = objectMap.getNearestEntryForKey("Key", 3);

    // Assert
    assertNull(actualNearestEntryForKey.getValue());
    assertNull(actualNearestEntryForKey.getKey());
    assertNull(actualNearestEntryForKey.parent);
    assertNull(actualNearestEntryForKey.right);
    assertTrue(actualNearestEntryForKey.isEmpty());
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, actualNearestEntryForKey.bitIndex);
  }

  /**
   * Test {@link AbstractPatriciaTrie#headMap(Object)}.
   *
   * <ul>
   *   <li>When {@code To Key}.
   *   <li>Then return {@link PatriciaTrie#PatriciaTrie()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#headMap(Object)}
   */
  @Test
  @DisplayName("Test headMap(Object); when 'To Key'; then return PatriciaTrie()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap AbstractPatriciaTrie.headMap(Object)"})
  void testHeadMap_whenToKey_thenReturnPatriciaTrie() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    SortedMap<String, Object> actualHeadMapResult = objectMap.headMap("To Key");

    // Assert
    assertEquals(objectMap, actualHeadMapResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 2);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = actualHigherEntryResult.left;
    assertSame(entry2.predecessor, trieEntry.parent);
    TrieEntry<String, Object> trieEntry2 = entry2.right;
    assertSame(trieEntry2, trieEntry.left);
    assertSame(trieEntry2, actualHigherEntryResult.predecessor.left);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>(null, "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.put("42", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 9);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@link TrieEntry#left} {@link TrieEntry#left} Key is {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return left left Key is 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnLeftLeftKeyIsKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.put("42", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = actualHigherEntryResult.left.left;
    assertEquals("Key", trieEntry.getKey());
    assertEquals("Value", trieEntry.getValue());
    assertEquals(1, trieEntry.bitIndex);
    TrieEntry<String, Object> trieEntry2 = actualHigherEntryResult.parent;
    assertEquals(9, trieEntry2.bitIndex);
    assertFalse(trieEntry.isEmpty());
    assertFalse(trieEntry.isInternalNode());
    assertTrue(trieEntry.isExternalNode());
    assertSame(actualHigherEntryResult.left, trieEntry.parent);
    TrieEntry<String, Object> trieEntry3 = actualHigherEntryResult.parent;
    assertSame(trieEntry3, trieEntry.right);
    assertSame(trieEntry3, trieEntry2.right);
    TrieEntry<String, Object> trieEntry4 = entry.predecessor;
    assertSame(trieEntry4, trieEntry.left);
    assertSame(trieEntry4, trieEntry2.parent);
    assertSame(trieEntry4, trieEntry.predecessor);
    TrieEntry<String, Object> trieEntry5 = entry.right;
    assertSame(trieEntry5, actualHigherEntryResult.right.parent);
    assertSame(trieEntry5, trieEntry2.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@link TrieEntry#parent} {@link TrieEntry#parent} is {@link TrieEntry#left}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return parent parent is left")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnParentParentIsLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    TrieEntry<String, Object> expectedTrieEntry = actualHigherEntryResult.left;
    TrieEntry<String, Object> trieEntry = actualHigherEntryResult.parent;
    assertSame(expectedTrieEntry, trieEntry.parent);
    TrieEntry<String, Object> expectedTrieEntry2 = actualHigherEntryResult.parent;
    assertSame(expectedTrieEntry2, actualHigherEntryResult.left.left);
    TrieEntry<String, Object> trieEntry2 = actualHigherEntryResult.right;
    assertSame(entry.predecessor, trieEntry2.parent);
    assertSame(entry.right, trieEntry2.right);
    assertSame(actualHigherEntryResult.right, trieEntry.right);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() empty string is 'Value'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieEmptyStringIsValue_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act and Assert
    assertNull(objectMap.higherEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() empty string is 'Value'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieEmptyStringIsValue_whenNull_thenReturnNull2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.incrementSize();
    objectMap.put("", "Value");

    // Act and Assert
    assertNull(objectMap.higherEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} IfAbsent {@code foo} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return Key is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() IfAbsent 'foo' is 'Value'; when 'Key'; then return Key is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieIfAbsentFooIsValue_whenKey_thenReturnKeyIsFoo() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "Value");

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertEquals("foo", actualHigherEntryResult.getKey());
    TrieEntry<String, Object> trieEntry = actualHigherEntryResult.predecessor;
    assertEquals("foo", trieEntry.getKey());
    TrieEntry<String, Object> trieEntry2 = actualHigherEntryResult.right;
    assertEquals("foo", trieEntry2.getKey());
    TrieEntry<String, Object> trieEntry3 = actualHigherEntryResult.left;
    assertSame(trieEntry3, trieEntry.parent);
    assertSame(trieEntry3, trieEntry2.parent);
    assertSame(actualHigherEntryResult.parent, trieEntry.left);
    TrieEntry<String, Object> trieEntry4 = actualHigherEntryResult.right;
    assertSame(trieEntry4, actualHigherEntryResult.left.left);
    assertSame(trieEntry4, actualHigherEntryResult.parent.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} incrementSize.
   *   <li>When {@code null}.
   *   <li>Then return {@link TrieEntry#left}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() incrementSize; when 'null'; then return left")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieIncrementSize_whenNull_thenReturnLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry(null);

    // Assert
    TrieEntry<String, Object> expectedHigherEntryResult = actualHigherEntryResult.left;
    assertSame(expectedHigherEntryResult, actualHigherEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code null}.
   *   <li>Then return {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry(null);

    // Assert
    TrieEntry<String, Object> expectedHigherEntryResult = actualHigherEntryResult.right;
    assertSame(expectedHigherEntryResult, actualHigherEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie(); when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code
   *       Value} and bitIndex is {@link Short#SIZE} {@link TrieEntry#predecessor}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); then return TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is SIZE predecessor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsSizePredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", Short.SIZE);
    objectMap.addEntry(entry, 2);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code 42} and
   *       {@code Value} and bitIndex is one {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); then return TrieEntry(Object, Object, int) with key is '42' and 'Value' and bitIndex is one right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnTrieEntryWithKeyIs42AndValueAndBitIndexIsOneRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 2);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("42", "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act and Assert
    assertSame(entry2.right, objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and
   *       {@code Value} and bitIndex is one {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName(
      "Test higherEntry(Object); then return TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnTrieEntryWithKeyIsNullAndValueAndBitIndexIsOneRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 2);
    TrieEntry<String, Object> entry2 = new TrieEntry<>(null, "Value", 1);
    objectMap.addEntry(entry2, 3);

    // Act and Assert
    assertSame(entry2.right, objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#keySet()}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractPatriciaTrie.keySet()"})
  void testKeySet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastEntry()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>Then return {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  @DisplayName("Test lastEntry(); given PatriciaTrie() '42' is 'Value'; then return right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  void testLastEntry_givenPatriciaTrie42IsValue_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualLastEntryResult = objectMap.lastEntry();

    // Assert
    TrieEntry<String, Object> expectedLastEntryResult = actualLastEntryResult.right;
    assertSame(expectedLastEntryResult, actualLastEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastEntry()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  @DisplayName("Test lastEntry(); given PatriciaTrie(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  void testLastEntry_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.lastEntry());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastEntry()}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code
   *       Value} and bitIndex is one {@link TrieEntry#parent}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  @DisplayName(
      "Test lastEntry(); then return TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one parent")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  void testLastEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsOneParent() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.parent, objectMap.lastEntry());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given PatriciaTrie() '42' is 'Value'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  void testLastKey_givenPatriciaTrie42IsValue_thenReturn42() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertEquals("42", objectMap.lastKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastKey()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given PatriciaTrie(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  void testLastKey_givenPatriciaTrie_thenThrowNoSuchElementException() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectMap.lastKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastKey()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  void testLastKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.lastKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>Then return next is {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#mapIterator()}
   */
  @Test
  @DisplayName(
      "Test mapIterator(); given PatriciaTrie() 'Key' is 'Value'; then return next is 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator AbstractPatriciaTrie.mapIterator()"})
  void testMapIterator_givenPatriciaTrieKeyIsValue_thenReturnNextIsKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    OrderedMapIterator<String, Object> actualMapIteratorResult = objectMap.mapIterator();

    // Assert
    assertEquals("Key", actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractPatriciaTrie#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given PatriciaTrie(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator AbstractPatriciaTrie.mapIterator()"})
  void testMapIterator_givenPatriciaTrie_thenReturnNotHasNext() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.mapIterator().hasNext());
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code null}.
   *   <li>Then return {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntry(TrieEntry); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    TrieEntry<String, Object> expectedNextEntryResult = actualNextEntryResult.right;
    assertSame(expectedNextEntryResult, actualNextEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is one.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntry(TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(node);

    // Assert
    assertNull(actualNextEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code
   *       Value} and bitIndex is one.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntry(TrieEntry); when TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>(null, "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(node);

    // Assert
    assertNull(actualNextEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry,
   * TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryImpl(TrieEntry, TrieEntry, TrieEntry); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"
  })
  void testNextEntryImpl_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>(null, "Value", 1);
    TrieEntry<String, Object> previous = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<String, Object> tree = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryImpl(start, previous, tree));
    TrieEntry<String, Object> trieEntry = start.predecessor;
    TrieEntry<String, Object> trieEntry2 = start.left;
    assertSame(trieEntry, trieEntry2.left);
    TrieEntry<String, Object> trieEntry3 = start.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>Then return {@link TrieEntry#predecessor}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry,
   * TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryImpl(TrieEntry, TrieEntry, TrieEntry); then return predecessor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"
  })
  void testNextEntryImpl_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<String, Object> previous = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<String, Object> tree = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryImplResult =
        objectMap.nextEntryImpl(start, previous, tree);

    // Assert
    TrieEntry<String, Object> trieEntry = actualNextEntryImplResult.predecessor;
    assertSame(trieEntry, actualNextEntryImplResult);
    TrieEntry<String, Object> trieEntry2 = start.left;
    assertSame(trieEntry, trieEntry2.left);
    TrieEntry<String, Object> trieEntry3 = start.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link TrieEntry#predecessor}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry,
   * TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntryImpl(TrieEntry, TrieEntry, TrieEntry); when 'null'; then return predecessor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"
  })
  void testNextEntryImpl_whenNull_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<String, Object> tree = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryImplResult =
        objectMap.nextEntryImpl(start, null, tree);

    // Assert
    TrieEntry<String, Object> trieEntry = actualNextEntryImplResult.predecessor;
    assertSame(trieEntry, actualNextEntryImplResult);
    TrieEntry<String, Object> trieEntry2 = start.left;
    assertSame(trieEntry, trieEntry2.left);
    TrieEntry<String, Object> trieEntry3 = start.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code null}.
   *   <li>Then return {@link TrieEntry#right}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntryInSubtree(TrieEntry, TrieEntry); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return right")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    TrieEntry<String, Object> parentOfSubtree = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryInSubtreeResult =
        objectMap.nextEntryInSubtree(null, parentOfSubtree);

    // Assert
    TrieEntry<String, Object> expectedNextEntryInSubtreeResult =
        actualNextEntryInSubtreeResult.right;
    assertSame(expectedNextEntryInSubtreeResult, actualNextEntryInSubtreeResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntryInSubtree(TrieEntry, TrieEntry); given PatriciaTrie(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<String, Object> parentOfSubtree = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(node, parentOfSubtree));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntryInSubtree(TrieEntry, TrieEntry); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> parentOfSubtree = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(null, parentOfSubtree));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code
   *       Value} and bitIndex is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test nextEntryInSubtree(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>(null, "Value", 1);
    TrieEntry<String, Object> parentOfSubtree = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(node, parentOfSubtree));
  }

  /**
   * Test {@link AbstractPatriciaTrie#prefixMap(Object)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#prefixMap(Object)}
   */
  @Test
  @DisplayName("Test prefixMap(Object); when empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap AbstractPatriciaTrie.prefixMap(Object)"})
  void testPrefixMap_whenEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    SortedMap<String, Object> actualPrefixMapResult = objectMap.prefixMap("");

    // Assert
    assertSame(objectMap, actualPrefixMapResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#prefixMap(Object)}.
   *
   * <ul>
   *   <li>When {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#prefixMap(Object)}
   */
  @Test
  @DisplayName("Test prefixMap(Object); when 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap AbstractPatriciaTrie.prefixMap(Object)"})
  void testPrefixMap_whenKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    SortedMap<String, Object> actualPrefixMapResult = objectMap.prefixMap("Key");

    // Assert
    assertEquals(objectMap, actualPrefixMapResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousEntry(TrieEntry)}.
   *
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value}
   *       and bitIndex is one.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousEntry(TrieEntry)}
   */
  @Test
  @DisplayName(
      "Test previousEntry(TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.previousEntry(TrieEntry)"})
  void testPreviousEntry_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualPreviousEntryResult = objectMap.previousEntry(start);

    // Assert
    assertNull(actualPreviousEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code key} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Object); given PatriciaTrie() 'key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("key", "Value");

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.put("key", "Value");

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given PatriciaTrie(); when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link TrieEntry} {@link TrieEntry#isEmpty()} return {@code false}.
   *   <li>When {@code Key}.
   *   <li>Then calls {@link TrieEntry#isEmpty()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Object); given TrieEntry isEmpty() return 'false'; when 'Key'; then calls isEmpty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenTrieEntryIsEmptyReturnFalse_whenKey_thenCallsIsEmpty() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenReturn(false);

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(entry, 3);

    // Act
    String actualPreviousKeyResult = objectMap.previousKey("Key");

    // Assert
    verify(entry).isEmpty();
    assertNull(actualPreviousKeyResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link TrieEntry} {@link TrieEntry#isEmpty()} return {@code true}.
   *   <li>When {@code Key}.
   *   <li>Then calls {@link TrieEntry#isEmpty()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName(
      "Test previousKey(Object); given TrieEntry isEmpty() return 'true'; when 'Key'; then calls isEmpty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenTrieEntryIsEmptyReturnTrue_whenKey_thenCallsIsEmpty() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenReturn(true);

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(entry, 3);

    // Act
    String actualPreviousKeyResult = objectMap.previousKey("Key");

    // Assert
    verify(entry).isEmpty();
    assertNull(actualPreviousKeyResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_thenReturnKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY);
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertEquals("Key", objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_thenThrowIllegalStateException() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenThrow(new IllegalStateException());

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectMap.previousKey("Key"));
    verify(entry).isEmpty();
  }

  /**
   * Test TrieEntry {@link TrieEntry#isEmpty()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TrieEntry#isEmpty()}
   */
  @Test
  @DisplayName("Test TrieEntry isEmpty(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TrieEntry.isEmpty()"})
  void testTrieEntryIsEmpty_thenReturnFalse() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(trieEntry.isEmpty());
  }

  /**
   * Test TrieEntry {@link TrieEntry#isEmpty()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TrieEntry#isEmpty()}
   */
  @Test
  @DisplayName("Test TrieEntry isEmpty(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TrieEntry.isEmpty()"})
  void testTrieEntryIsEmpty_thenReturnTrue() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertTrue(trieEntry.isEmpty());
  }

  /**
   * Test TrieEntry {@link TrieEntry#isExternalNode()}.
   *
   * <p>Method under test: {@link TrieEntry#isExternalNode()}
   */
  @Test
  @DisplayName("Test TrieEntry isExternalNode()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TrieEntry.isExternalNode()"})
  void testTrieEntryIsExternalNode() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertTrue(trieEntry.isExternalNode());
  }

  /**
   * Test TrieEntry {@link TrieEntry#isInternalNode()}.
   *
   * <p>Method under test: {@link TrieEntry#isInternalNode()}
   */
  @Test
  @DisplayName("Test TrieEntry isInternalNode()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TrieEntry.isInternalNode()"})
  void testTrieEntryIsInternalNode() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(trieEntry.isInternalNode());
  }

  /**
   * Test TrieEntry {@link TrieEntry#TrieEntry(Object, Object, int)}.
   *
   * <p>Method under test: {@link TrieEntry#TrieEntry(Object, Object, int)}
   */
  @Test
  @DisplayName("Test TrieEntry new TrieEntry(Object, Object, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrieEntry.<init>(Object, Object, int)"})
  void testTrieEntryNewTrieEntry() {
    // Arrange and Act
    TrieEntry<Object, Object> actualTrieEntry = new TrieEntry<>("Key", "Value", 1);

    // Assert
    assertEquals("Key", actualTrieEntry.getKey());
    assertEquals("Value", actualTrieEntry.getValue());
    assertNull(actualTrieEntry.parent);
    assertNull(actualTrieEntry.right);
    assertEquals(1, actualTrieEntry.bitIndex);
    assertFalse(actualTrieEntry.isEmpty());
    assertFalse(actualTrieEntry.isInternalNode());
    assertTrue(actualTrieEntry.isExternalNode());
  }

  /**
   * Test TrieEntry {@link TrieEntry#toString()}.
   *
   * <p>Method under test: {@link TrieEntry#toString()}
   */
  @Test
  @DisplayName("Test TrieEntry toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TrieEntry.toString()"})
  void testTrieEntryToString() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals(
        "Entry(key=Key [1], value=Value, parent=null, left=Key [1], right=null, predecessor=Key [1])",
        trieEntry.toString());
  }

  /**
   * Test TrieEntry {@link TrieEntry#toString()}.
   *
   * <p>Method under test: {@link TrieEntry#toString()}
   */
  @Test
  @DisplayName("Test TrieEntry toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TrieEntry.toString()"})
  void testTrieEntryToString2() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY);

    // Act and Assert
    assertEquals(
        "RootEntry(key=Key [-1], value=Value, parent=null, left=ROOT, right=null, predecessor=ROOT)",
        trieEntry.toString());
  }
}
