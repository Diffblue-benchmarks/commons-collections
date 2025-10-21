package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry;
import org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractBitwiseTrieDiffblueTest {
  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}, and {@link BasicEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BasicEntry#equals(Object)}
   *   <li>{@link BasicEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);
    TrieEntry<Object, Object> trieEntry2 = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals(trieEntry, trieEntry2);
    int expectedHashCodeResult = trieEntry.hashCode();
    assertEquals(expectedHashCodeResult, trieEntry2.hashCode());
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}, and {@link BasicEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BasicEntry#equals(Object)}
   *   <li>{@link BasicEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);
    DefaultMapEntry<Object, Object> defaultMapEntry = new DefaultMapEntry<>("Key", "Value");

    // Act and Assert
    assertEquals(trieEntry, defaultMapEntry);
    int expectedHashCodeResult = trieEntry.hashCode();
    assertEquals(expectedHashCodeResult, defaultMapEntry.hashCode());
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}, and {@link BasicEntry#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BasicEntry#equals(Object)}
   *   <li>{@link BasicEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals(trieEntry, trieEntry);
    int expectedHashCodeResult = trieEntry.hashCode();
    assertEquals(expectedHashCodeResult, trieEntry.hashCode());
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>(1, "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, new TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>(new TrieEntry<>("Key", "Value", 1), "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, new TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", 42, 1);

    // Act and Assert
    assertNotEquals(trieEntry, new TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", new TrieEntry<>("Key", "Value", 1), 1);

    // Act and Assert
    assertNotEquals(trieEntry, new TrieEntry<>("Key", "Value", 1));
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, new SimpleEntry<>("42", "42"));
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, null);
  }

  /**
   * Test BasicEntry {@link BasicEntry#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasicEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BasicEntry.equals(Object)", "int BasicEntry.hashCode()"})
  public void testBasicEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNotEquals(trieEntry, "Different type to BasicEntry");
  }

  /**
   * Test BasicEntry {@link BasicEntry#getKey()}.
   * <p>
   * Method under test: {@link BasicEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BasicEntry.getKey()"})
  public void testBasicEntryGetKey() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act
    Object actualKey = trieEntry.getKey();

    // Assert
    assertEquals("Key", actualKey);
    assertSame(trieEntry.key, actualKey);
  }

  /**
   * Test BasicEntry {@link BasicEntry#getValue()}.
   * <p>
   * Method under test: {@link BasicEntry#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BasicEntry.getValue()"})
  public void testBasicEntryGetValue() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act
    Object actualValue = trieEntry.getValue();

    // Assert
    assertEquals("Value", actualValue);
    assertSame(trieEntry.value, actualValue);
  }

  /**
   * Test BasicEntry {@link BasicEntry#setKeyValue(Object, Object)}.
   * <p>
   * Method under test: {@link BasicEntry#setKeyValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BasicEntry.setKeyValue(Object, Object)"})
  public void testBasicEntrySetKeyValue() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Value", trieEntry.setKeyValue("Key", "Value"));
  }

  /**
   * Test BasicEntry {@link BasicEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link BasicEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BasicEntry.setValue(Object)"})
  public void testBasicEntrySetValue() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Value", trieEntry.setValue("Value"));
  }

  /**
   * Test BasicEntry {@link BasicEntry#toString()}.
   * <p>
   * Method under test: {@link BasicEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String BasicEntry.toString()"})
  public void testBasicEntryToString() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Entry(key=Key [1], value=Value, parent=null, left=Key [1], right=null, predecessor=Key [1])",
        trieEntry.toString());
  }

  /**
   * Test {@link AbstractBitwiseTrie#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.compare(Object, Object)"})
  public void testCompare_when42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(AbstractBitwiseTrie.compare("42", "42"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#compare(Object, Object)}.
   * <ul>
   *   <li>When four.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.compare(Object, Object)"})
  public void testCompare_whenFour_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(AbstractBitwiseTrie.compare(4, "42"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#bitIndex(Object, Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return twelve.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#bitIndex(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractBitwiseTrie.bitIndex(Object, Object)"})
  public void testBitIndex_whenKey_thenReturnTwelve() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(12, objectMap.bitIndex("Key", "Found Key"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#bitIndex(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link KeyAnalyzer#NULL_BIT_KEY}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#bitIndex(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractBitwiseTrie.bitIndex(Object, Object)"})
  public void testBitIndex_whenNull_thenReturnNull_bit_key() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, objectMap.bitIndex(null, null));
  }

  /**
   * Test {@link AbstractBitwiseTrie#bitsPerElement()}.
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#bitsPerElement()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractBitwiseTrie.bitsPerElement()"})
  public void testBitsPerElement() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(Short.SIZE, objectMap.bitsPerElement());
  }

  /**
   * Test {@link AbstractBitwiseTrie#castKey(Object)}.
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#castKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractBitwiseTrie.castKey(Object)"})
  public void testCastKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals("Key", objectMap.castKey("Key"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#compareKeys(Object, Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.compareKeys(Object, Object)"})
  public void testCompareKeys_whenKey_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.compareKeys("Key", "Other"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#compareKeys(Object, Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.compareKeys(Object, Object)"})
  public void testCompareKeys_whenKey_thenReturnFalse2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.compareKeys("Key", null));
  }

  /**
   * Test {@link AbstractBitwiseTrie#compareKeys(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.compareKeys(Object, Object)"})
  public void testCompareKeys_whenNull_thenReturnTrue() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.compareKeys(null, null));
  }

  /**
   * Test {@link AbstractBitwiseTrie#compareKeys(Object, Object)}.
   * <ul>
   *   <li>When {@code Other}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#compareKeys(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.compareKeys(Object, Object)"})
  public void testCompareKeys_whenOther_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.compareKeys(null, "Other"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#getKeyAnalyzer()}.
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#getKeyAnalyzer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"KeyAnalyzer AbstractBitwiseTrie.getKeyAnalyzer()"})
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
   * Test {@link AbstractBitwiseTrie#isBitSet(Object, int, int)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#isBitSet(Object, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.isBitSet(Object, int, int)"})
  public void testIsBitSet_whenKey_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.isBitSet("Key", 1, 3));
  }

  /**
   * Test {@link AbstractBitwiseTrie#isBitSet(Object, int, int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#isBitSet(Object, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBitwiseTrie.isBitSet(Object, int, int)"})
  public void testIsBitSet_whenNull_thenReturnFalse() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.isBitSet(null, 1, 3));
  }

  /**
   * Test {@link AbstractBitwiseTrie#lengthInBits(Object)}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return forty-eight.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#lengthInBits(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractBitwiseTrie.lengthInBits(Object)"})
  public void testLengthInBits_whenKey_thenReturnFortyEight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(48, objectMap.lengthInBits("Key"));
  }

  /**
   * Test {@link AbstractBitwiseTrie#lengthInBits(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#lengthInBits(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractBitwiseTrie.lengthInBits(Object)"})
  public void testLengthInBits_whenNull_thenReturnZero() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals(0, objectMap.lengthInBits(null));
  }

  /**
   * Test {@link AbstractBitwiseTrie#toString()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Trie[} is {@code Value}.</li>
   *   <li>Then return a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String AbstractBitwiseTrie.toString()"})
  public void testToString_givenPatriciaTrieTrieIsValue_thenReturnAString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Trie[", "Value");

    // Act and Assert
    assertEquals(
        "Trie[1]={\n" + "  Entry(key=Trie[ [9], value=Value, parent=ROOT, left=ROOT, right=Trie[ [9], predecessor=Trie["
            + " [9])\n" + "}\n",
        objectMap.toString());
  }

  /**
   * Test {@link AbstractBitwiseTrie#toString()}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then return {@code Trie[0]={ }}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBitwiseTrie#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String AbstractBitwiseTrie.toString()"})
  public void testToString_givenPatriciaTrie_thenReturnTrie0() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertEquals("Trie[0]={\n}\n", objectMap.toString());
  }
}
