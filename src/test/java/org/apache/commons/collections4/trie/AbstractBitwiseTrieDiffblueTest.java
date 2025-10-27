package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Test;

public class AbstractBitwiseTrieDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   *   <li>{@link AbstractBitwiseTrie.BasicEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testBasicEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry2 = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals(trieEntry, trieEntry2);
    int expectedHashCodeResult = trieEntry.hashCode();
    assertEquals(expectedHashCodeResult, trieEntry2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   *   <li>{@link AbstractBitwiseTrie.BasicEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testBasicEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals(trieEntry, defaultMapEntry);
    int expectedHashCodeResult = trieEntry.hashCode();
    assertEquals(expectedHashCodeResult, defaultMapEntry.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   *   <li>{@link AbstractBitwiseTrie.BasicEntry#hashCode()}
   * </ul>
   */
  @Test
  public void testBasicEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals(trieEntry, trieEntry);
    int expectedHashCodeResult = trieEntry.hashCode();
    assertEquals(expectedHashCodeResult, trieEntry.hashCode());
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>(1, "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>(
        new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", 42, 1);

    // Act and Assert
    assertNotEquals(trieEntry, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key",
        new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 1);

    // Act and Assert
    assertNotEquals(trieEntry, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, new AbstractMap.SimpleEntry<>("42", "42"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, null);
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#equals(Object)}
   */
  @Test
  public void testBasicEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, "Different type to BasicEntry");
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#getKey()}
   */
  @Test
  public void testBasicEntryGetKey() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    Object actualKey = trieEntry.getKey();

    // Assert
    assertEquals("Key", actualKey);
    assertSame(trieEntry.key, actualKey);
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#getValue()}
   */
  @Test
  public void testBasicEntryGetValue() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    Object actualValue = trieEntry.getValue();

    // Assert
    assertEquals("Value", actualValue);
    assertSame(trieEntry.value, actualValue);
  }

  /**
   * Method under test:
   * {@link AbstractBitwiseTrie.BasicEntry#setKeyValue(Object, Object)}
   */
  @Test
  public void testBasicEntrySetKeyValue() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Value", trieEntry.setKeyValue("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#setValue(Object)}
   */
  @Test
  public void testBasicEntrySetValue() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Value", trieEntry.setValue("Value"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie.BasicEntry#toString()}
   */
  @Test
  public void testBasicEntryToString() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Entry(key=Key [1], value=Value, parent=null, left=Key [1], right=null, predecessor=Key [1])",
        trieEntry.toString());
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#compare(Object, Object)}
   */
  @Test
  public void testCompare() {
    // Arrange, Act and Assert
    assertTrue(AbstractBitwiseTrie.compare("42", "42"));
    assertFalse(AbstractBitwiseTrie.compare(4, "42"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#bitIndex(Object, Object)}
   */
  @Test
  public void testBitIndex() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(12, objectMap.bitIndex("Key", "Found Key"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#bitIndex(Object, Object)}
   */
  @Test
  public void testBitIndex2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, objectMap.bitIndex(null, null));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#bitsPerElement()}
   */
  @Test
  public void testBitsPerElement() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(Short.SIZE, objectMap.bitsPerElement());
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#castKey(Object)}
   */
  @Test
  public void testCastKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals("Key", objectMap.castKey("Key"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  public void testCompareKeys() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.compareKeys("Key", "Other"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  public void testCompareKeys2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.compareKeys(null, null));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  public void testCompareKeys3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.compareKeys(null, "Other"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  public void testCompareKeys4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.compareKeys("Key", null));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#getKeyAnalyzer()}
   */
  @Test
  public void testGetKeyAnalyzer() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    KeyAnalyzer<? super String> actualKeyAnalyzer = objectMap.getKeyAnalyzer();

    // Assert
    assertTrue(actualKeyAnalyzer instanceof StringKeyAnalyzer);
    assertEquals(Short.SIZE, actualKeyAnalyzer.bitsPerElement());
    assertSame(((StringKeyAnalyzer) actualKeyAnalyzer).INSTANCE, actualKeyAnalyzer);
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#isBitSet(Object, int, int)}
   */
  @Test
  public void testIsBitSet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.isBitSet("Key", 1, 3));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#isBitSet(Object, int, int)}
   */
  @Test
  public void testIsBitSet2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.isBitSet(null, 1, 3));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#lengthInBits(Object)}
   */
  @Test
  public void testLengthInBits() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(48, objectMap.lengthInBits("Key"));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#lengthInBits(Object)}
   */
  @Test
  public void testLengthInBits2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(0, objectMap.lengthInBits(null));
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals("Trie[0]={\n}\n", objectMap.toString());
  }

  /**
   * Method under test: {@link AbstractBitwiseTrie#toString()}
   */
  @Test
  public void testToString2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Trie[", "Value");

    // Act and Assert
    assertEquals(
        "Trie[1]={\n" + "  Entry(key=Trie[ [9], value=Value, parent=ROOT, left=ROOT, right=Trie[ [9], predecessor=Trie["
            + " [9])\n" + "}\n",
        objectMap.toString());
  }
}
