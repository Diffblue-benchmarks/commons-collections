package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractPatriciaTrieDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  public void testIsValidUplink_whenNull_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  public void testIsValidUplink_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  public void testIsValidUplink_whenTrieEntryWithKeyAndValueAndBitIndexIsZero_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.isValidUplink(TrieEntry, TrieEntry)"})
  public void testIsValidUplink_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.addEntry(TrieEntry, int)"})
  public void testAddEntry_thenTrieEntryWithKeyAndValueAndBitIndexIsOneIsParent() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.addEntry(TrieEntry, int)"})
  public void testAddEntry_thenTrieEntryWithKeyAndValueAndBitIndexIsOneParentValueIsNull() {
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
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY);

    objectMap.addEntry(entry, 3);
    objectMap.put("42", "Value");
    objectMap.addEntry(new TrieEntry<>("42", "Value", 1), 3);

    // Act and Assert
    assertSame(entry.predecessor, objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code 42} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@link TrieEntry#parent}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnParent() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new TrieEntry<>("42", "Value", 1), 3);

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertEquals(actualCeilingEntryResult.parent, actualCeilingEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} empty string is {@code Value}.</li>
   *   <li>Then return {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrieEmptyStringIsValue_thenReturnPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry(null);

    // Assert
    assertSame(actualCeilingEntryResult.predecessor, actualCeilingEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} IfAbsent {@code foo} is {@code 42}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrieIfAbsentFooIs42_whenKey_thenReturnValueIs42() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "42");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertEquals("42", actualCeilingEntryResult.getValue());
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.predecessor;
    assertEquals("42", trieEntry.getValue());
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.right;
    assertEquals("42", trieEntry2.getValue());
    assertEquals("foo", actualCeilingEntryResult.getKey());
    assertEquals("foo", trieEntry.getKey());
    assertEquals("foo", trieEntry2.getKey());
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@link TrieEntry#predecessor} {@link TrieEntry#parent} is {@link TrieEntry#left}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrieKeyIsValue_thenReturnPredecessorParentIsLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    TrieEntry<String, Object> trieEntry = actualCeilingEntryResult.left;
    TrieEntry<String, Object> trieEntry2 = actualCeilingEntryResult.predecessor;
    assertSame(trieEntry, trieEntry2.parent);
    TrieEntry<String, Object> trieEntry3 = actualCeilingEntryResult.right;
    assertSame(trieEntry, trieEntry3.parent);
    TrieEntry<String, Object> trieEntry4 = actualCeilingEntryResult.parent;
    assertSame(trieEntry4, trieEntry2.left);
    assertSame(trieEntry4, trieEntry3.left);
    TrieEntry<String, Object> trieEntry5 = actualCeilingEntryResult.right;
    assertSame(trieEntry5, actualCeilingEntryResult.left.left);
    TrieEntry<String, Object> trieEntry6 = actualCeilingEntryResult.parent;
    assertSame(trieEntry5, trieEntry6.left);
    assertSame(trieEntry5, trieEntry6.predecessor);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrieKeyIsValue_when42_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("42");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()} {@code Key} is {@code Value}.</li>
   *   <li>When empty string.</li>
   *   <li>Then return {@link TrieEntry#right}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrieKeyIsValue_whenEmptyString_thenReturnRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.ceilingEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#ceilingEntry(Object)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#bitIndex} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.ceilingEntry(Object)"})
  public void testCeilingEntry_thenReturnBitIndexIsOne() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);

    // Act
    TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertEquals(1, actualCeilingEntryResult.bitIndex);
    assertSame(entry.predecessor, actualCeilingEntryResult);
  }

  /**
   * Test {@link AbstractPatriciaTrie#comparator()}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#comparator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator AbstractPatriciaTrie.comparator()"})
  public void testComparator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  public void testContainsKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  public void testContainsKey2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  public void testContainsKey_givenPatriciaTrie42IsValue_when42_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  public void testContainsKey_givenPatriciaTrie_when42_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractPatriciaTrie.containsKey(Object)"})
  public void testContainsKey_givenPatriciaTrie_whenNull_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractPatriciaTrie.entrySet()"})
  public void testEntrySet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.firstEntry()"})
  public void testFirstEntry_givenPatriciaTrieKeyIsValue_thenReturnRight() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.firstEntry()"})
  public void testFirstEntry_givenPatriciaTrie_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.firstKey()"})
  public void testFirstKey_givenPatriciaTrieKeyIsValue_thenReturnKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.firstKey()"})
  public void testFirstKey_givenPatriciaTrie_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.followLeft(TrieEntry)"})
  public void testFollowLeft_thenReturnPredecessor() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.followRight(TrieEntry)"})
  public void testFollowRight_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  public void testGet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  public void testGet2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  public void testGet_givenPatriciaTrie42IsValue_when42_thenReturnValue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  public void testGet_givenPatriciaTrie_when42_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.get(Object)"})
  public void testGet_givenPatriciaTrie_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  public void testGetEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  public void testGetEntry_givenPatriciaTrie42IsValue_when42_thenReturnBitIndexIsTen() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  public void testGetEntry_givenPatriciaTrie_when42_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  public void testGetEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getEntry(Object)"})
  public void testGetEntry_thenReturnBitIndexIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getNearestEntryForKey(Object, int)"})
  public void testGetNearestEntryForKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.getNearestEntryForKey(Object, int)"})
  public void testGetNearestEntryForKey_givenPatriciaTrie_whenKey_thenReturnValueIsNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.SortedMap AbstractPatriciaTrie.headMap(Object)"})
  public void testHeadMap_whenToKey_thenReturnPatriciaTrie() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Test {@link AbstractPatriciaTrie#higherEntry(Object)}.
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnKeyIs42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrie42IsValue_whenNull_thenReturnLeft() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrieIfAbsentFooIs42_whenKey_thenReturnValueIs42() {
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
    TrieEntry<String, Object> trieEntry5 = actualHigherEntryResult.parent;
    assertSame(trieEntry4, trieEntry5.left);
    assertSame(trieEntry4, trieEntry5.predecessor);
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrieKeyIsValue_whenNull_thenReturnRight() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry(null));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_thenReturnParentIsPredecessor() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsSizePredecessor() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.higherEntry(Object)"})
  public void testHigherEntry_thenReturnTrieEntryWithKeyIsNullAndValueAndBitIndexIsOneRight() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractPatriciaTrie.keySet()"})
  public void testKeySet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  public void testLastEntry_givenPatriciaTrie42IsValue_thenReturnRight() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  public void testLastEntry_givenPatriciaTrie_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lastEntry()"})
  public void testLastEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsOneParent() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  public void testLastKey_givenPatriciaTrie42IsValue_thenReturn42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  public void testLastKey_givenPatriciaTrie_thenThrowNoSuchElementException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.lastKey()"})
  public void testLastKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenPatriciaTrie42IsValue_whenKey_thenReturnBitIndexIsTen() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenPatriciaTrieEmptyStringIsValue_thenReturnKeyIsEmptyString() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenPatriciaTrieIfAbsentFooIs42_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenPatriciaTrie_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_givenTrieEntryIsEmptyReturnTrue_whenKey_thenReturnValueIsNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsOneRight() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_thenReturnTrieEntryWithKeyIs42AndValueAndBitIndexIsOnePredecessor() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_thenReturnTrieEntryWithKeyIsNullAndValueAndBitIndexIsOneRight() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.lowerEntry(Object)"})
  public void testLowerEntry_thenThrowIllegalStateException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator AbstractPatriciaTrie.mapIterator()"})
  public void testMapIterator_givenPatriciaTrieKeyIsValue_thenReturnNextIsKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator AbstractPatriciaTrie.mapIterator()"})
  public void testMapIterator_givenPatriciaTrie_thenReturnNotHasNext() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  public void testNextEntry_givenPatriciaTrieEmptyStringIsValue_thenReturnKeyIsEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    assertEquals("", actualNextEntryResult.getKey());
    TrieEntry<String, Object> trieEntry = actualNextEntryResult.left;
    assertEquals("", trieEntry.getKey());
    TrieEntry<String, Object> trieEntry2 = actualNextEntryResult.predecessor;
    assertEquals("", trieEntry2.getKey());
    assertNull(actualNextEntryResult.parent);
    assertNull(trieEntry.parent);
    assertNull(trieEntry2.parent);
    assertNull(actualNextEntryResult.right);
    assertNull(trieEntry.right);
    assertNull(trieEntry2.right);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, actualNextEntryResult.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry2.bitIndex);
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  public void testNextEntry_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(null));
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}.
   * <ul>
   *   <li>Then return {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntry(TrieEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  public void testNextEntry_thenReturnTrieEntryWithKeyAndValueAndBitIndexIsOnePredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);
    objectMap.incrementSize();

    // Act and Assert
    assertSame(entry.predecessor, objectMap.nextEntry(null));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  public void testNextEntry_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntry(TrieEntry)"})
  public void testNextEntry_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"})
  public void testNextEntryImpl_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"})
  public void testNextEntryImpl_thenReturnPredecessor() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryImpl(TrieEntry, TrieEntry, TrieEntry)"})
  public void testNextEntryImpl_whenNull_thenReturnPredecessor() {
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
   *   <li>Given {@link PatriciaTrie#PatriciaTrie()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  public void testNextEntryInSubtree_givenPatriciaTrie_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  public void testNextEntryInSubtree_givenPatriciaTrie_whenNull_thenReturnNull() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(null, new TrieEntry<>("Key", "Value", 1)));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  public void testNextEntryInSubtree_thenReturnKeyIsEmptyString() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null,
        new TrieEntry<>("Key", "Value", 1));

    // Assert
    assertEquals("", actualNextEntryInSubtreeResult.getKey());
    TrieEntry<String, Object> trieEntry = actualNextEntryInSubtreeResult.left;
    assertEquals("", trieEntry.getKey());
    TrieEntry<String, Object> trieEntry2 = actualNextEntryInSubtreeResult.predecessor;
    assertEquals("", trieEntry2.getKey());
    assertNull(actualNextEntryInSubtreeResult.parent);
    assertNull(trieEntry.parent);
    assertNull(trieEntry2.parent);
    assertNull(actualNextEntryInSubtreeResult.right);
    assertNull(trieEntry.right);
    assertNull(trieEntry2.right);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, actualNextEntryInSubtreeResult.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry2.bitIndex);
  }

  /**
   * Test {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}.
   * <ul>
   *   <li>Then {@link TrieEntry#TrieEntry(Object, Object, int)} with {@code Key} and {@code Value} and bitIndex is one is {@link TrieEntry#predecessor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractPatriciaTrie#nextEntryInSubtree(TrieEntry, TrieEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  public void testNextEntryInSubtree_thenTrieEntryWithKeyAndValueAndBitIndexIsOneIsPredecessor() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    TrieEntry<String, Object> entry = new TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);
    objectMap.incrementSize();
    TrieEntry<String, Object> parentOfSubtree = new TrieEntry<>("Key", "Value", 1);

    // Act
    TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null, parentOfSubtree);

    // Assert
    assertEquals(actualNextEntryInSubtreeResult.predecessor, parentOfSubtree);
    assertSame(entry.predecessor, actualNextEntryInSubtreeResult);
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.nextEntryInSubtree(TrieEntry, TrieEntry)"})
  public void testNextEntryInSubtree_whenTrieEntryWithKeyIsNullAndValueAndBitIndexIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.SortedMap AbstractPatriciaTrie.prefixMap(Object)"})
  public void testPrefixMap_whenEmptyString() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.SortedMap AbstractPatriciaTrie.prefixMap(Object)"})
  public void testPrefixMap_whenKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TrieEntry AbstractPatriciaTrie.previousEntry(TrieEntry)"})
  public void testPreviousEntry_whenTrieEntryWithKeyAndValueAndBitIndexIsOne_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_givenPatriciaTrieKeyIsValue_whenKey_thenReturnNull3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_givenPatriciaTrie_whenKey_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_givenTrieEntryIsEmptyReturnFalse_whenKey_thenCallsIsEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_givenTrieEntryIsEmptyReturnTrue_whenKey_thenCallsIsEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractPatriciaTrie.previousKey(Object)"})
  public void testPreviousKey_thenThrowIllegalStateException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TrieEntry.isEmpty()"})
  public void testTrieEntryIsEmpty_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TrieEntry.isEmpty()"})
  public void testTrieEntryIsEmpty_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TrieEntry.isExternalNode()"})
  public void testTrieEntryIsExternalNode() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TrieEntry.isInternalNode()"})
  public void testTrieEntryIsInternalNode() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TrieEntry.<init>(Object, Object, int)"})
  public void testTrieEntryNewTrieEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String TrieEntry.toString()"})
  public void testTrieEntryToString() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String TrieEntry.toString()"})
  public void testTrieEntryToString2() {
    // Arrange
    TrieEntry<Object, Object> trieEntry = new TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY);

    // Act and Assert
    assertEquals("RootEntry(key=Key [-1], value=Value, parent=null, left=ROOT, right=null, predecessor=ROOT)",
        trieEntry.toString());
  }
}
