package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Test;

public class KeyAnalyzerDiffblueTest {
  /**
   * Method under test: {@link KeyAnalyzer#isEqualBitKey(int)}
   */
  @Test
  public void testIsEqualBitKey() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isEqualBitKey(1));
    assertTrue(KeyAnalyzer.isEqualBitKey(KeyAnalyzer.EQUAL_BIT_KEY));
  }

  /**
   * Method under test: {@link KeyAnalyzer#isNullBitKey(int)}
   */
  @Test
  public void testIsNullBitKey() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isNullBitKey(1));
    assertTrue(KeyAnalyzer.isNullBitKey(KeyAnalyzer.NULL_BIT_KEY));
  }

  /**
   * Method under test: {@link KeyAnalyzer#isOutOfBoundsIndex(int)}
   */
  @Test
  public void testIsOutOfBoundsIndex() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isOutOfBoundsIndex(1));
    assertTrue(KeyAnalyzer.isOutOfBoundsIndex(KeyAnalyzer.OUT_OF_BOUNDS_BIT_KEY));
  }

  /**
   * Method under test: {@link KeyAnalyzer#isValidBitIndex(int)}
   */
  @Test
  public void testIsValidBitIndex() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isValidBitIndex(1));
    assertFalse(KeyAnalyzer.isValidBitIndex(KeyAnalyzer.NULL_BIT_KEY));
  }

  /**
   * Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  public void testCompare() {
    // Arrange, Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, StringKeyAnalyzer.INSTANCE.compare("O1", "O2"));
    assertEquals(0, StringKeyAnalyzer.INSTANCE.compare(null, null));
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, StringKeyAnalyzer.INSTANCE.compare(null, "O2"));
    assertEquals(1, StringKeyAnalyzer.INSTANCE.compare("O1", null));
  }
}
