package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Test;

public class AbstractPatriciaTrieDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#isValidUplink(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testIsValidUplink() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> next = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertTrue(AbstractPatriciaTrie.isValidUplink(next, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#isValidUplink(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testIsValidUplink2() {
    // Arrange, Act and Assert
    assertFalse(AbstractPatriciaTrie.isValidUplink(null, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#isValidUplink(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testIsValidUplink3() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> next = new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertFalse(AbstractPatriciaTrie.isValidUplink(next, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#isValidUplink(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testIsValidUplink4() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> next = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(AbstractPatriciaTrie.isValidUplink(next, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 0)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#addEntry(AbstractPatriciaTrie.TrieEntry, int)}
   */
  @Test
  public void testAddEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> entry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualAddEntryResult = objectMap.addEntry(entry, 3);

    // Assert
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry = entry.parent;
    assertNull(trieEntry.getValue());
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry2 = entry.right;
    assertNull(trieEntry2.getValue());
    assertNull(trieEntry.getKey());
    assertNull(trieEntry2.getKey());
    assertNull(trieEntry.parent);
    assertNull(trieEntry2.parent);
    assertNull(trieEntry.right);
    assertNull(trieEntry2.right);
    assertFalse(trieEntry.isExternalNode());
    assertFalse(trieEntry2.isExternalNode());
    assertTrue(trieEntry.isEmpty());
    assertTrue(trieEntry2.isEmpty());
    assertTrue(trieEntry.isInternalNode());
    assertTrue(trieEntry2.isInternalNode());
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry.bitIndex);
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, trieEntry2.bitIndex);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry3 = actualAddEntryResult.predecessor;
    assertSame(trieEntry3, actualAddEntryResult);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry4 = entry.left;
    assertSame(trieEntry3, trieEntry4.left);
    assertSame(trieEntry3, trieEntry.left);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry5 = entry.predecessor;
    assertSame(trieEntry3, trieEntry5.left);
    assertSame(trieEntry3, trieEntry2.left);
    assertSame(trieEntry3, trieEntry4.predecessor);
    assertSame(trieEntry3, trieEntry.predecessor);
    assertSame(trieEntry3, trieEntry5.predecessor);
    assertSame(trieEntry3, trieEntry2.predecessor);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry6 = actualAddEntryResult.right;
    assertSame(trieEntry6, trieEntry4.parent);
    assertSame(trieEntry6, trieEntry5.parent);
    assertSame(trieEntry6, trieEntry4.right);
    assertSame(trieEntry6, trieEntry5.right);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#addEntry(AbstractPatriciaTrie.TrieEntry, int)}
   */
  @Test
  public void testAddEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);
    AbstractPatriciaTrie.TrieEntry<String, Object> entry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualAddEntryResult = objectMap.addEntry(entry, 3);

    // Assert
    assertEquals(actualAddEntryResult.right, entry);
    assertSame(actualAddEntryResult.predecessor, actualAddEntryResult);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#addEntry(AbstractPatriciaTrie.TrieEntry, int)}
   */
  @Test
  public void testAddEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 0), 3);
    AbstractPatriciaTrie.TrieEntry<String, Object> entry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualAddEntryResult = objectMap.addEntry(entry, 3);

    // Assert
    assertEquals(actualAddEntryResult.right, entry);
    assertSame(actualAddEntryResult.predecessor, actualAddEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertSame(actualCeilingEntryResult.predecessor, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "42");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertNull(objectMap.ceilingEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry6() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.ceilingEntry(null));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry7() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("42");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry8() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry9() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("42", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertSame(actualCeilingEntryResult.right, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry10() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", KeyAnalyzer.NULL_BIT_KEY), 3);
    objectMap.put("42", "Value");
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("42", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry("Key");

    // Assert
    assertSame(actualCeilingEntryResult.predecessor, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#ceilingEntry(Object)}
   */
  @Test
  public void testCeilingEntry11() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualCeilingEntryResult = objectMap.ceilingEntry(null);

    // Assert
    assertSame(actualCeilingEntryResult.predecessor, actualCeilingEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#comparator()}
   */
  @Test
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
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.containsKey("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertFalse(objectMap.containsKey("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  public void testContainsKey3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("42", "Value", 1), 3);

    // Act and Assert
    assertTrue(objectMap.containsKey("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  public void testContainsKey4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertTrue(objectMap.containsKey("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#containsKey(Object)}
   */
  @Test
  public void testContainsKey5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.containsKey(null));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#firstEntry()}
   */
  @Test
  public void testFirstEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.firstEntry());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#firstEntry()}
   */
  @Test
  public void testFirstEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualFirstEntryResult = objectMap.firstEntry();

    // Assert
    assertSame(actualFirstEntryResult.right, actualFirstEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#firstKey()}
   */
  @Test
  public void testFirstKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectMap.firstKey());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#firstKey()}
   */
  @Test
  public void testFirstKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectMap.firstKey());
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#followLeft(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testFollowLeft() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> node = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualFollowLeftResult = objectMap.followLeft(node);

    // Assert
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry = actualFollowLeftResult.predecessor;
    assertSame(trieEntry, actualFollowLeftResult);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry2 = node.left;
    assertSame(trieEntry, trieEntry2.left);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry3 = node.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#followRight(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testFollowRight() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.followRight(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.get("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  public void testGet2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.get("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  public void testGet3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("42", "Value", 1), 3);

    // Act and Assert
    assertEquals("Value", objectMap.get("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  public void testGet4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertEquals("Value", objectMap.get("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#get(Object)}
   */
  @Test
  public void testGet5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.get(null));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  public void testGetEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.getEntry("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  public void testGetEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.getEntry("42"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  public void testGetEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("42", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualEntry = objectMap.getEntry("42");

    // Assert
    assertSame(actualEntry.predecessor, actualEntry);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  public void testGetEntry4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualEntry = objectMap.getEntry("42");

    // Assert
    assertSame(actualEntry.right, actualEntry);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#getEntry(Object)}
   */
  @Test
  public void testGetEntry5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.getEntry(null));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}
   */
  @Test
  public void testGetNearestEntryForKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNearestEntryForKey = objectMap.getNearestEntryForKey("Key", 3);

    // Assert
    assertSame(actualNearestEntryForKey.predecessor, actualNearestEntryForKey);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#getNearestEntryForKey(Object, int)}
   */
  @Test
  public void testGetNearestEntryForKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNearestEntryForKey = objectMap.getNearestEntryForKey("Key", 3);

    // Assert
    assertSame(actualNearestEntryForKey.predecessor, actualNearestEntryForKey);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#headMap(Object)}
   */
  @Test
  public void testHeadMap() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.headMap("To Key").isEmpty());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 2);
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertSame(actualHigherEntryResult.predecessor, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertSame(actualHigherEntryResult.right, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry6() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.putIfAbsent("foo", "42");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertSame(actualHigherEntryResult.right, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry7() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry8() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", Short.SIZE), 2);
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertSame(actualHigherEntryResult.predecessor, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry9() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");

    // Act and Assert
    assertNull(objectMap.higherEntry("Key"));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry10() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.higherEntry(null));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry11() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 2);
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry("Key");

    // Assert
    assertSame(actualHigherEntryResult.predecessor, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry12() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry(null);

    // Assert
    assertSame(actualHigherEntryResult.predecessor, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#higherEntry(Object)}
   */
  @Test
  public void testHigherEntry13() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("Key", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualHigherEntryResult = objectMap.higherEntry(null);

    // Assert
    assertSame(actualHigherEntryResult.right, actualHigherEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  public void testLastEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.lastEntry());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  public void testLastEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> entry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    objectMap.addEntry(entry, 3);

    // Act and Assert
    assertSame(entry.right, objectMap.lastEntry());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#lastEntry()}
   */
  @Test
  public void testLastEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualLastEntryResult = objectMap.lastEntry();

    // Assert
    assertSame(actualLastEntryResult.right, actualLastEntryResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  public void testLastKey() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectMap.lastKey());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  public void testLastKey2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertNull(objectMap.lastKey());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#lastKey()}
   */
  @Test
  public void testLastKey3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("42", "Value");
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);

    // Act and Assert
    assertEquals("42", objectMap.lastKey());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertFalse(objectMap.mapIterator().hasNext());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#mapIterator()}
   */
  @Test
  public void testMapIterator2() {
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
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntry(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntry(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntry2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntry(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntry3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntry(null));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntry(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntry4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    assertSame(actualNextEntryResult.predecessor, actualNextEntryResult);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntry(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntry5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);
    objectMap.incrementSize();

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNextEntryResult = objectMap.nextEntry(null);

    // Assert
    assertSame(actualNextEntryResult.predecessor, actualNextEntryResult);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryImpl(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryImpl() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> start = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    AbstractPatriciaTrie.TrieEntry<String, Object> previous = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNextEntryImplResult = objectMap.nextEntryImpl(start, previous,
        new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));

    // Assert
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry = actualNextEntryImplResult.predecessor;
    assertSame(trieEntry, actualNextEntryImplResult);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry2 = start.left;
    assertSame(trieEntry, trieEntry2.left);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry3 = start.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryImpl(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryImpl2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> start = new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1);

    AbstractPatriciaTrie.TrieEntry<String, Object> previous = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryImpl(start, previous, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry = previous.predecessor;
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry2 = previous.left;
    assertSame(trieEntry, trieEntry2.left);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry3 = previous.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryImpl(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryImpl3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> start = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNextEntryImplResult = objectMap.nextEntryImpl(start, null,
        new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));

    // Assert
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry = actualNextEntryImplResult.predecessor;
    assertSame(trieEntry, actualNextEntryImplResult);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry2 = start.left;
    assertSame(trieEntry, trieEntry2.left);
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry3 = start.predecessor;
    assertSame(trieEntry, trieEntry3.left);
    assertSame(trieEntry, trieEntry2.predecessor);
    assertSame(trieEntry, trieEntry3.predecessor);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryInSubtree(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryInSubtree() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> node = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(node, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryInSubtree(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryInSubtree2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    AbstractPatriciaTrie.TrieEntry<String, Object> node = new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(node, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryInSubtree(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryInSubtree3() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.nextEntryInSubtree(null, new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryInSubtree(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryInSubtree4() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.put("", "Value");

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null,
        new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1));

    // Assert
    assertSame(actualNextEntryInSubtreeResult.predecessor, actualNextEntryInSubtreeResult);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#nextEntryInSubtree(AbstractPatriciaTrie.TrieEntry, AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testNextEntryInSubtree5() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();
    objectMap.addEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1), 3);
    objectMap.incrementSize();
    AbstractPatriciaTrie.TrieEntry<String, Object> parentOfSubtree = new AbstractPatriciaTrie.TrieEntry<>("Key",
        "Value", 1);

    // Act
    AbstractPatriciaTrie.TrieEntry<String, Object> actualNextEntryInSubtreeResult = objectMap.nextEntryInSubtree(null,
        parentOfSubtree);

    // Assert
    AbstractPatriciaTrie.TrieEntry<String, Object> trieEntry = actualNextEntryInSubtreeResult.predecessor;
    assertEquals(trieEntry, parentOfSubtree);
    assertSame(trieEntry, actualNextEntryInSubtreeResult);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#prefixMap(Object)}
   */
  @Test
  public void testPrefixMap() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertTrue(objectMap.prefixMap("Key").isEmpty());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie#prefixMap(Object)}
   */
  @Test
  public void testPrefixMap2() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act
    SortedMap<String, Object> actualPrefixMapResult = objectMap.prefixMap("");

    // Assert
    assertTrue(actualPrefixMapResult.isEmpty());
    assertSame(objectMap, actualPrefixMapResult);
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie#previousEntry(AbstractPatriciaTrie.TrieEntry)}
   */
  @Test
  public void testPreviousEntry() {
    // Arrange
    PatriciaTrie<Object> objectMap = new PatriciaTrie<>();

    // Act and Assert
    assertNull(objectMap.previousEntry(new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1)));
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie.TrieEntry#isEmpty()}
   */
  @Test
  public void testTrieEntryIsEmpty() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(trieEntry.isEmpty());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie.TrieEntry#isEmpty()}
   */
  @Test
  public void testTrieEntryIsEmpty2() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>(null, "Value", 1);

    // Act and Assert
    assertTrue(trieEntry.isEmpty());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie.TrieEntry#isExternalNode()}
   */
  @Test
  public void testTrieEntryIsExternalNode() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertTrue(trieEntry.isExternalNode());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie.TrieEntry#isInternalNode()}
   */
  @Test
  public void testTrieEntryIsInternalNode() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertFalse(trieEntry.isInternalNode());
  }

  /**
   * Method under test:
   * {@link AbstractPatriciaTrie.TrieEntry#TrieEntry(Object, Object, int)}
   */
  @Test
  public void testTrieEntryNewTrieEntry() {
    // Arrange and Act
    AbstractPatriciaTrie.TrieEntry<Object, Object> actualTrieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key",
        "Value", 1);

    // Assert
    assertEquals("Key", actualTrieEntry.getKey());
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = actualTrieEntry.left;
    assertEquals("Key", trieEntry.getKey());
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry2 = actualTrieEntry.predecessor;
    assertEquals("Key", trieEntry2.getKey());
    assertEquals("Value", actualTrieEntry.getValue());
    assertEquals("Value", trieEntry.getValue());
    assertEquals("Value", trieEntry2.getValue());
    assertNull(actualTrieEntry.parent);
    assertNull(trieEntry.parent);
    assertNull(trieEntry2.parent);
    assertNull(actualTrieEntry.right);
    assertNull(trieEntry.right);
    assertNull(trieEntry2.right);
    assertEquals(1, actualTrieEntry.bitIndex);
    assertEquals(1, trieEntry.bitIndex);
    assertEquals(1, trieEntry2.bitIndex);
    assertFalse(actualTrieEntry.isEmpty());
    assertFalse(trieEntry.isEmpty());
    assertFalse(trieEntry2.isEmpty());
    assertFalse(actualTrieEntry.isInternalNode());
    assertFalse(trieEntry.isInternalNode());
    assertFalse(trieEntry2.isInternalNode());
    assertTrue(actualTrieEntry.isExternalNode());
    assertTrue(trieEntry.isExternalNode());
    assertTrue(trieEntry2.isExternalNode());
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry3 = actualTrieEntry.predecessor;
    assertSame(trieEntry3, trieEntry.left);
    assertSame(trieEntry3, trieEntry2.left);
    assertSame(trieEntry3, trieEntry.predecessor);
    assertSame(trieEntry3, trieEntry2.predecessor);
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie.TrieEntry#toString()}
   */
  @Test
  public void testTrieEntryToString() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value", 1);

    // Act and Assert
    assertEquals("Entry(key=Key [1], value=Value, parent=null, left=Key [1], right=null, predecessor=Key [1])",
        trieEntry.toString());
  }

  /**
   * Method under test: {@link AbstractPatriciaTrie.TrieEntry#toString()}
   */
  @Test
  public void testTrieEntryToString2() {
    // Arrange
    AbstractPatriciaTrie.TrieEntry<Object, Object> trieEntry = new AbstractPatriciaTrie.TrieEntry<>("Key", "Value",
        KeyAnalyzer.NULL_BIT_KEY);

    // Act and Assert
    assertEquals("RootEntry(key=Key [-1], value=Value, parent=null, left=ROOT, right=null, predecessor=ROOT)",
        trieEntry.toString());
  }
}
