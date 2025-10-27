package org.apache.commons.collections4.trie.analyzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringKeyAnalyzerDiffblueTest {
  /**
   * Method under test:
   * {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  public void testBitIndex() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key", 2, 3, "Other", 1, 3));
    assertThrows(IllegalArgumentException.class,
        () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, 3, "Other", 1, 3));
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key",
        StringKeyAnalyzer.LENGTH, 3, "Other", StringKeyAnalyzer.LENGTH, 3));
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key",
        StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH, "Other", StringKeyAnalyzer.LENGTH, 3));
    assertEquals(11, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH,
        "Other", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH));
    assertEquals(9, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH,
        "Other", StringKeyAnalyzer.LENGTH, 0));
    assertEquals(9, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, 0, "Other",
        StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH));
    assertEquals(9, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH, null,
        StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH));
    assertEquals(-1,
        StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, 0, "Other", StringKeyAnalyzer.LENGTH, 0));
  }

  /**
   * Method under test: {@link StringKeyAnalyzer#bitsPerElement()}
   */
  @Test
  public void testBitsPerElement() {
    // Arrange, Act and Assert
    assertEquals(StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.INSTANCE.bitsPerElement());
  }

  /**
   * Method under test: {@link StringKeyAnalyzer#isBitSet(String, int, int)}
   */
  @Test
  public void testIsBitSet() {
    // Arrange, Act and Assert
    assertFalse(StringKeyAnalyzer.INSTANCE.isBitSet("Key", 1, 3));
    assertFalse(StringKeyAnalyzer.INSTANCE.isBitSet(null, 1, 3));
    assertFalse(StringKeyAnalyzer.INSTANCE.isBitSet("Key", 3, 3));
  }

  /**
   * Method under test:
   * {@link StringKeyAnalyzer#isPrefix(String, int, int, String)}
   */
  @Test
  public void testIsPrefix() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", 2, 3, "Key"));
    assertThrows(IllegalArgumentException.class,
        () -> StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", StringKeyAnalyzer.LENGTH, 3, "Key"));
    assertTrue(
        StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH, "Key"));
    assertFalse(StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", 0, StringKeyAnalyzer.LENGTH, "Key"));
  }

  /**
   * Method under test: {@link StringKeyAnalyzer#lengthInBits(String)}
   */
  @Test
  public void testLengthInBits() {
    // Arrange, Act and Assert
    assertEquals(48, StringKeyAnalyzer.INSTANCE.lengthInBits("Key"));
    assertEquals(0, StringKeyAnalyzer.INSTANCE.lengthInBits(null));
  }
}
