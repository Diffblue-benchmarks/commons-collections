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
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractPatriciaTrieDiffblueTest {
  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test isValidUplink(TrieEntry, TrieEntry); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(AbstractPatriciaTrie.isValidUplink(null, new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test isValidUplink(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnTrue() {
    // Arrange
    TrieEntry<Object, Object> next = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertTrue(AbstractPatriciaTrie.isValidUplink(next, new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is zero.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test isValidUplink(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is zero; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenTrieEntryWithKeyAndValueAndBitIndexIsZero_thenReturnFalse() {
    // Arrange
    TrieEntry<Object, Object> next = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(AbstractPatriciaTrie.isValidUplink(next, new TrieEntry<>("Key", "Value", 0)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code Value} and bitIndex is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#isValidUplink(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test isValidUplink(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  void testIsValidUplink_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne() {
    // Arrange
    TrieEntry<Object, Object> next = new TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertFalse(AbstractPatriciaTrie.isValidUplink(next, new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}.
   * <ul>
   *   <li>Then {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one is {@link TrieEntry#parent}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}
   */
  @Test
  @DisplayName("Test addEntry(TrieEntry, int); then TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one is parent")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one {@link TrieEntry#parent} Value is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#addEntry(TrieEntry, int)}
   */
  @Test
  @DisplayName("Test addEntry(TrieEntry, int); then TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one parent Value is 'null'")
  @Tag("MaintainedByDiffblue")
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
   * Test {@link AbstractPatriciaTrie#comparator()}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#comparator()}
   */
  @Test
  @DisplayName("Test comparator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator AbstractPatriciaTrie.comparator()"})
  void testComparator() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    Comparator<? super String> actualComparatorResult = objectMap.comparator();

    // Assert
    assertTrue(actualComparatorResult instanceof StringKeyAnalyzer);
    assertEquals(0, actualComparatorResult.compare("foo", "foo"));
    assertEquals(Short.SIZE, ((StringKeyAnalyzer) actualComparatorResult).bitsPerElement());
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertFalse(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("42", "Value", 1), 3);

    // Act and Assert
    assertTrue(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PatriciaTrie() '42' is 'Value'; when '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey_givenPatriciaTrie42IsValue_when42_thenReturnTrue() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertTrue(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PatriciaTrie(); when '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey_givenPatriciaTrie_when42_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.containsKey("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PatriciaTrie(); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  void testContainsKey_givenPatriciaTrie_whenNull_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.containsKey(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#entrySet()}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set AbstractPatriciaTrie.entrySet()"})
  void testEntrySet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstEntry()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#firstEntry()}
   */
  @Test
  @DisplayName("Test firstEntry(); given PatriciaTrie() 'Key' is 'Value'; then return right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.firstEntry()"})
  void testFirstEntry_givenPatriciaTrieKeyIsValue_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualFirstEntryResult = objectMap.firstEntry();

    // Assert
    assertSame(actualFirstEntryResult.right, actualFirstEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstEntry()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#firstEntry()}
   */
  @Test
  @DisplayName("Test firstEntry(); given PatriciaTrie(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.firstEntry()"})
  void testFirstEntry_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.firstEntry());
  }

  /**
   * Test {@link AbstractPatriciaTrie#firstKey()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given PatriciaTrie() 'Key' is 'Value'; then return 'Key'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#firstKey()}
   */
  @Test
  @DisplayName("Test firstKey(); given PatriciaTrie(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.firstKey()"})
  void testFirstKey_givenPatriciaTrie_thenThrowNoSuchElementException() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectMap.firstKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#followLeft(TrieEntry)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#followLeft(TrieEntry)}
   */
  @Test
  @DisplayName("Test followLeft(TrieEntry); then return predecessor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.followLeft(TrieEntry)"})
  void testFollowLeft_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    TrieEntry<String, Object> actualFollowLeftResult = objectMap.followLeft(new TrieEntry<>("Key", "Value", 1));

    // Assert
    assertSame(actualFollowLeftResult.predecessor, actualFollowLeftResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#followRight(TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#followRight(TrieEntry)}
   */
  @Test
  @DisplayName("Test followRight(TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.followRight(TrieEntry)"})
  void testFollowRight_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.followRight(new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("42", "Value", 1), 3);

    // Act and Assert
    assertEquals("Value", objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PatriciaTrie() '42' is 'Value'; when '42'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_givenPatriciaTrie42IsValue_when42_thenReturnValue() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertEquals("Value", objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PatriciaTrie(); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_givenPatriciaTrie_when42_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.get("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#get(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  void testGet_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.get(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.getEntry("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@link TrieEntry#bitIndex} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object); given PatriciaTrie() '42' is 'Value'; when '42'; then return bitIndex is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_givenPatriciaTrie42IsValue_when42_thenReturnBitIndexIsTen() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act
    TrieEntry<String, Object> actualEntry = objectMap.getEntry("42");

    // Assert
    assertEquals(10, actualEntry.bitIndex);
    assertSame(actualEntry.right, actualEntry);
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object); given PatriciaTrie(); when '42'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_givenPatriciaTrie_when42_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.getEntry("42"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.getEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#getEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#bitIndex} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  @DisplayName("Test getEntry(Object); then return bitIndex is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  void testGetEntry_thenReturnBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("42", "Value", 1), 3);

    // Act
    TrieEntry<String, Object> actualEntry = objectMap.getEntry("42");

    // Assert
    assertEquals(1, actualEntry.bitIndex);
    assertSame(actualEntry.left, actualEntry);
  }

  /**
   * Test {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}
   */
  @Test
  @DisplayName("Test getNearestEntryForKey(Object, int)")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return Value is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}
   */
  @Test
  @DisplayName("Test getNearestEntryForKey(Object, int); given PatriciaTrie(); when 'Key'; then return Value is 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@code To Key}.</li>
   *   <li>Then return {@link PatriciaTrie#PatriciaTrie()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#headMap(Object)}
   */
  @Test
  @DisplayName("Test headMap(Object); when 'To Key'; then return PatriciaTrie()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.SortedMap AbstractPatriciaTrie.headMap(Object)"})
  void testHeadMap_whenToKey_thenReturnPatriciaTrie() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(objectMap, objectMap.headMap("To Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>(null, "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return Key is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return Key is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnKeyIs42() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertEquals("42", actualHigherEntryResult.getKey());
    TrieEntry<String, Object> trieEntry = actualHigherEntryResult.predecessor;
    assertEquals("42", trieEntry.getKey());
    assertEquals(10, actualHigherEntryResult.bitIndex);
    assertEquals(10, trieEntry.bitIndex);
    TrieEntry<String, Object> trieEntry2 = actualHigherEntryResult.parent;
    assertSame(actualHigherEntryResult.left, trieEntry2.parent);
    assertSame(entry.parent, trieEntry.left);
    assertSame(actualHigherEntryResult.parent, actualHigherEntryResult.left.left);
    TrieEntry<String, Object> trieEntry3 = actualHigherEntryResult.right;
    assertSame(entry.predecessor, trieEntry3.parent);
    assertSame(entry.right, trieEntry3.right);
    assertSame(actualHigherEntryResult.right, trieEntry2.right);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link TrieEntry#left}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'null'; then return left")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie42IsValue_whenNull_thenReturnLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry(null);

    // Assert
    assertSame(actualHigherEntryResult.left, actualHigherEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} IfAbsent {@code foo} is {@code 42}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() IfAbsent 'foo' is '42'; when 'Key'; then return Value is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieIfAbsentFooIs42_whenKey_thenReturnValueIs42() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "42");

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertEquals("42", actualHigherEntryResult.getValue());
    TrieEntry<String, Object> trieEntry = actualHigherEntryResult.predecessor;
    assertEquals("42", trieEntry.getValue());
    TrieEntry<String, Object> trieEntry2 = actualHigherEntryResult.right;
    assertEquals("42", trieEntry2.getValue());
    assertEquals("foo", actualHigherEntryResult.getKey());
    assertEquals("foo", trieEntry.getKey());
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@link TrieEntry#left} {@link TrieEntry#left} Key is {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return left left Key is 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieKeyIsValue_whenKey_thenReturnLeftLeftKeyIsKey() {
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
    assertSame(trieEntry5, actualHigherEntryResult.predecessor.parent);
    assertSame(trieEntry5, actualHigherEntryResult.right.parent);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry(null);

    // Assert
    assertSame(actualHigherEntryResult.right, actualHigherEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie(); when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#parent} is {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); then return parent is predecessor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnParentIsPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 2);
    TrieEntry<String, Object> entry2 = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry2, 3);

    // Act
    TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertEquals(actualHigherEntryResult.predecessor, actualHigherEntryResult.parent);
    TrieEntry<String, Object> trieEntry = entry2.parent;
    TrieEntry<String, Object> trieEntry2 = actualHigherEntryResult.left;
    assertSame(trieEntry, trieEntry2.right);
    TrieEntry<String, Object> trieEntry3 = actualHigherEntryResult.predecessor;
    assertSame(trieEntry, trieEntry3.right);
    TrieEntry<String, Object> trieEntry4 = entry2.predecessor;
    TrieEntry<String, Object> trieEntry5 = actualHigherEntryResult.right;
    assertSame(trieEntry4, trieEntry5.left);
    assertSame(trieEntry4, trieEntry2.parent);
    assertSame(entry.predecessor, trieEntry5.predecessor);
    TrieEntry<String, Object> trieEntry6 = entry2.right;
    assertSame(trieEntry6, trieEntry2.left);
    assertSame(trieEntry6, trieEntry3.left);
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is {@link Short#SIZE} {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); then return TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is SIZE predecessor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsSizePredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", Short.SIZE);

    objectMap.addEntry(entry, 2);
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code Value} and bitIndex is one {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @DisplayName("Test higherEntry(Object); then return TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  void testHigherEntry_thenReturnTrieEntryWithKeyIsNullAndValueAndBitIndexIsOneRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 2);
    TrieEntry<String, Object> entry = new TrieEntry<>(null, "Value", 1);

    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.right, objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#keySet()}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set AbstractPatriciaTrie.keySet()"})
  void testKeySet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastEntry()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>Then return {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  @DisplayName("Test lastEntry(); given PatriciaTrie() '42' is 'Value'; then return right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  void testLastEntry_givenPatriciaTrie42IsValue_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act
    TrieEntry<String, Object> actualLastEntryResult = objectMap.lastEntry();

    // Assert
    assertSame(actualLastEntryResult.right, actualLastEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastEntry()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  @DisplayName("Test lastEntry(); given PatriciaTrie(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  void testLastEntry_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.lastEntry());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastEntry()}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one {@link TrieEntry#parent}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  @DisplayName("Test lastEntry(); then return TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one parent")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given PatriciaTrie() '42' is 'Value'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  void testLastKey_givenPatriciaTrie42IsValue_thenReturn42() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertEquals("42", objectMap.lastKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastKey()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); given PatriciaTrie(); then throw NoSuchElementException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  void testLastKey_givenPatriciaTrie_thenThrowNoSuchElementException() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectMap.lastKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lastKey()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  @DisplayName("Test lastKey(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  void testLastKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.lastKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY);

    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@link TrieEntry#bitIndex} is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given PatriciaTrie() '42' is 'Value'; when 'Key'; then return bitIndex is ten")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnBitIndexIsTen() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act
    TrieEntry<String, Object> actualLowerEntryResult = objectMap.lowerEntry("Key");

    // Assert
    assertEquals(10, actualLowerEntryResult.bitIndex);
    assertSame(actualLowerEntryResult.right, actualLowerEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.</li>
   *   <li>Then return Key is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given PatriciaTrie() empty string is 'Value'; then return Key is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenPatriciaTrieEmptyStringIsValue_thenReturnKeyIsEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");
    objectMap.putIfAbsent("foo", "42");

    // Act
    TrieEntry<String, Object> actualLowerEntryResult = objectMap.lowerEntry("Key");

    // Assert
    assertEquals("", actualLowerEntryResult.getKey());
    TrieEntry<String, Object> trieEntry = actualLowerEntryResult.left;
    assertEquals("42", trieEntry.getValue());
    TrieEntry<String, Object> trieEntry2 = actualLowerEntryResult.predecessor;
    assertEquals("42", trieEntry2.getValue());
    assertEquals("foo", trieEntry.getKey());
    assertEquals("foo", trieEntry2.getKey());
    assertEquals(9, trieEntry.bitIndex);
    assertEquals(9, trieEntry2.bitIndex);
    assertSame(actualLowerEntryResult.left, trieEntry2.right);
    assertSame(actualLowerEntryResult.predecessor, trieEntry.right);
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} IfAbsent {@code foo} is {@code 42}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given PatriciaTrie() IfAbsent 'foo' is '42'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenPatriciaTrieIfAbsentFooIs42_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "42");

    // Act and Assert
    assertNull(objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given PatriciaTrie(); when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.lowerEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Given {@link TrieEntry} {@link TrieEntry#isEmpty()} return {@code true}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return Value is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); given TrieEntry isEmpty() return 'true'; when 'Key'; then return Value is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_givenTrieEntryIsEmptyReturnTrue_whenKey_thenReturnValueIsNull() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenReturn(true);

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualLowerEntryResult = objectMap.lowerEntry("Key");

    // Assert
    verify(entry).isEmpty();
    assertNull(actualLowerEntryResult.getValue());
    assertNull(actualLowerEntryResult.getKey());
    assertNull(actualLowerEntryResult.parent);
    assertNull(actualLowerEntryResult.right);
    assertFalse(actualLowerEntryResult.isExternalNode());
    assertTrue(actualLowerEntryResult.isEmpty());
    assertTrue(actualLowerEntryResult.isInternalNode());
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); then return TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsOneRight() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenReturn(true);

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry2 = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry2, 2);
    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualLowerEntryResult = objectMap.lowerEntry("Key");

    // Assert
    verify(entry).isEmpty();
    assertSame(entry2.right, actualLowerEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code 42} and {@code Value} and bitIndex is one {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); then return TrieEntry(Object, Object, int) with key is '42' and 'Value' and bitIndex is one predecessor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_thenReturnTrieEntryWithKeyIs42AndValueAndBitIndexIsOnePredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("42", "Value", 1);

    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code Value} and bitIndex is one {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); then return TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_thenReturnTrieEntryWithKeyIsNullAndValueAndBitIndexIsOneRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>(null, "Value", 1);

    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.right, objectMap.lowerEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#lowerEntry(Object)}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#lowerEntry(Object)}
   */
  @Test
  @DisplayName("Test lowerEntry(Object); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  void testLowerEntry_thenThrowIllegalStateException() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenThrow(new IllegalStateException("foo"));

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectMap.lowerEntry("Key"));
    verify(entry).isEmpty();
  }

  /**
   * Test {@link AbstractPatriciaTrie#mapIterator()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>Then return next is {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given PatriciaTrie() 'Key' is 'Value'; then return next is 'Key'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given PatriciaTrie(); then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedMapIterator AbstractPatriciaTrie.mapIterator()"})
  void testMapIterator_givenPatriciaTrie_thenReturnNotHasNext() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.mapIterator().hasNext());
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.</li>
   *   <li>Then return Key is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); given PatriciaTrie() empty string is 'Value'; then return Key is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_givenPatriciaTrieEmptyStringIsValue_thenReturnKeyIsEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    assertEquals("", actualNextEntryResult.getKey());
    assertEquals("", actualNextEntryResult.left.getKey());
    TrieEntry<String, Object> trieEntry = actualNextEntryResult.predecessor;
    assertEquals("", trieEntry.getKey());
    assertNull(actualNextEntryResult.parent);
    assertNull(trieEntry.parent);
    assertNull(actualNextEntryResult.right);
    assertNull(trieEntry.right);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, actualNextEntryResult.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link TrieEntry#bitIndex} is nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return bitIndex is nine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_givenPatriciaTrieKeyIsValue_whenNull_thenReturnBitIndexIsNine() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    assertEquals(9, actualNextEntryResult.bitIndex);
    assertSame(actualNextEntryResult.right, actualNextEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#bitIndex} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); then return bitIndex is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_thenReturnBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    assertEquals(1, actualNextEntryResult.bitIndex);
    assertSame(entry.predecessor, actualNextEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code Value} and bitIndex is one.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntry(TrieEntry); when TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  void testNextEntry_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(new TrieEntry<>(null, "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryImpl(TrieEntry, TrieEntry, TrieEntry); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"})
  void testNextEntryImpl_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>(null, "Value", 1);

    TrieEntry<String, Object> previous = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryImpl(start, previous, new TrieEntry<>("Key", "Value", 1)));
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
   * <ul>
   *   <li>Then return {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryImpl(TrieEntry, TrieEntry, TrieEntry); then return predecessor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"})
  void testNextEntryImpl_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>("Key", "Value", 1);

    TrieEntry<String, Object> previous = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryImplResult = objectMap.nextEntryImpl(start, previous,
        new TrieEntry<>("Key", "Value", 1));

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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryImpl(TrieEntry, TrieEntry, TrieEntry); when 'null'; then return predecessor")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"})
  void testNextEntryImpl_whenNull_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> start = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryImplResult = objectMap.nextEntryImpl(start, null,
        new TrieEntry<>("Key", "Value", 1));

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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryInSubtree(TrieEntry, TrieEntry); given PatriciaTrie() 'Key' is 'Value'; when 'null'; then return right")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");
    objectMap.incrementSize();

    // Act
    TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null,
        new TrieEntry<>("Key", "Value", 1));

    // Assert
    assertSame(actualNextEntryInSubtreeResult.right, actualNextEntryInSubtreeResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryInSubtree(TrieEntry, TrieEntry); given PatriciaTrie(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_givenPatriciaTrie_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(node, new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryInSubtree(TrieEntry, TrieEntry); given PatriciaTrie(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(null, new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#bitIndex} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryInSubtree(TrieEntry, TrieEntry); then return bitIndex is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_thenReturnBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);
    objectMap.incrementSize();
    TrieEntry<String, Object> parentOfSubtree = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null, parentOfSubtree);

    // Assert
    assertEquals(1, actualNextEntryInSubtreeResult.bitIndex);
    assertEquals(actualNextEntryInSubtreeResult.predecessor, parentOfSubtree);
    assertSame(entry.predecessor, actualNextEntryInSubtreeResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>Then return Key is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryInSubtree(TrieEntry, TrieEntry); then return Key is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_thenReturnKeyIsEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null,
        new TrieEntry<>("Key", "Value", 1));

    // Assert
    assertEquals("", actualNextEntryInSubtreeResult.getKey());
    assertEquals("", actualNextEntryInSubtreeResult.left.getKey());
    TrieEntry<String, Object> trieEntry = actualNextEntryInSubtreeResult.predecessor;
    assertEquals("", trieEntry.getKey());
    assertNull(actualNextEntryInSubtreeResult.parent);
    assertNull(trieEntry.parent);
    assertNull(actualNextEntryInSubtreeResult.right);
    assertNull(trieEntry.right);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, actualNextEntryInSubtreeResult.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with key is {@code null} and {@code Value} and bitIndex is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @DisplayName("Test nextEntryInSubtree(TrieEntry, TrieEntry); when TrieEntry(Object, Object, int) with key is 'null' and 'Value' and bitIndex is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  void testNextEntryInSubtree_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> node = new TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(node, new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#prefixMap(Object)}.
   * <ul>
   *   <li>When empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#prefixMap(Object)}
   */
  @Test
  @DisplayName("Test prefixMap(Object); when empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.SortedMap AbstractPatriciaTrie.prefixMap(Object)"})
  void testPrefixMap_whenEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertSame(objectMap, objectMap.prefixMap(""));
  }

  /**
   * Test {@link AbstractPatriciaTrie#prefixMap(Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#prefixMap(Object)}
   */
  @Test
  @DisplayName("Test prefixMap(Object); when 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.SortedMap AbstractPatriciaTrie.prefixMap(Object)"})
  void testPrefixMap_whenKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(objectMap, objectMap.prefixMap("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousEntry(TrieEntry)}.
   * <ul>
   *   <li>When {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousEntry(TrieEntry)}
   */
  @Test
  @DisplayName("Test previousEntry(TrieEntry); when TrieEntry(Object, Object, int) with 'Key' and 'Value' and bitIndex is one; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.previousEntry(TrieEntry)"})
  void testPreviousEntry_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.previousEntry(new TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given PatriciaTrie() 'key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given PatriciaTrie() 'Key' is 'Value'; when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given PatriciaTrie(); when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.previousKey("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#previousKey(Object)}.
   * <ul>
   *   <li>Given {@link TrieEntry} {@link TrieEntry#isEmpty()} return {@code false}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then calls {@link TrieEntry#isEmpty()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given TrieEntry isEmpty() return 'false'; when 'Key'; then calls isEmpty()")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given {@link TrieEntry} {@link TrieEntry#isEmpty()} return {@code true}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then calls {@link TrieEntry#isEmpty()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); given TrieEntry isEmpty() return 'true'; when 'Key'; then calls isEmpty()")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#previousKey(Object)}
   */
  @Test
  @DisplayName("Test previousKey(Object); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  void testPreviousKey_thenThrowIllegalStateException() {
    // Arrange
    TrieEntry<String, Object> entry = mock(TrieEntry.class);
    when(entry.isEmpty()).thenThrow(new IllegalStateException("key"));

    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectMap.previousKey("Key"));
    verify(entry).isEmpty();
  }

  /**
   * Test TrieEntry {@link TrieEntry#isEmpty()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TrieEntry#isEmpty()}
   */
  @Test
  @DisplayName("Test TrieEntry isEmpty(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TrieEntry.isEmpty()"})
  void testTrieEntryIsEmpty_thenReturnFalse() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(trieEntry.isEmpty());
  }

  /**
   * Test TrieEntry {@link TrieEntry#isEmpty()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TrieEntry#isEmpty()}
   */
  @Test
  @DisplayName("Test TrieEntry isEmpty(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TrieEntry.isEmpty()"})
  void testTrieEntryIsEmpty_thenReturnTrue() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertTrue(trieEntry.isEmpty());
  }

  /**
   * Test TrieEntry {@link TrieEntry#isExternalNode()}.
   * <p>
   * Method under test: {@link TrieEntry#isExternalNode()}
   */
  @Test
  @DisplayName("Test TrieEntry isExternalNode()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TrieEntry.isExternalNode()"})
  void testTrieEntryIsExternalNode() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertTrue(trieEntry.isExternalNode());
  }

  /**
   * Test TrieEntry {@link TrieEntry#isInternalNode()}.
   * <p>
   * Method under test: {@link TrieEntry#isInternalNode()}
   */
  @Test
  @DisplayName("Test TrieEntry isInternalNode()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TrieEntry.isInternalNode()"})
  void testTrieEntryIsInternalNode() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(trieEntry.isInternalNode());
  }

  /**
   * Test TrieEntry {@link TrieEntry#TrieEntry(Object, Object, int)}.
   * <p>
   * Method under test: {@link TrieEntry#TrieEntry(Object, Object, int)}
   */
  @Test
  @DisplayName("Test TrieEntry new TrieEntry(Object, Object, int)")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link TrieEntry#toString()}
   */
  @Test
  @DisplayName("Test TrieEntry toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String TrieEntry.toString()"})
  void testTrieEntryToString() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Entry(key=Key [1], value=Value, parent=null, left=Key [1], right=null, predecessor=Key [1])",
        trieEntry.toString());
  }

  /**
   * Test TrieEntry {@link TrieEntry#toString()}.
   * <p>
   * Method under test: {@link TrieEntry#toString()}
   */
  @Test
  @DisplayName("Test TrieEntry toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String TrieEntry.toString()"})
  void testTrieEntryToString2() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY);

    // Act and Assert
    assertEquals("RootEntry(key=Key [-1], value=Value, parent=null, left=ROOT, right=null, predecessor=ROOT)",
        trieEntry.toString());
  }
}
