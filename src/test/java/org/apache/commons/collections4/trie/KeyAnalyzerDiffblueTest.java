package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class KeyAnalyzerDiffblueTest {
  /**
   * Test {@link KeyAnalyzer#isEqualBitKey(int)}.
   * <ul>
   *   <li>When {@link KeyAnalyzer#EQUAL_BIT_KEY}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isEqualBitKey(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isEqualBitKey(int)"})
  public void testIsEqualBitKey_whenEqual_bit_key_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isEqualBitKey(KeyAnalyzer.EQUAL_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isEqualBitKey(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isEqualBitKey(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isEqualBitKey(int)"})
  public void testIsEqualBitKey_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isEqualBitKey(1));
  }

  /**
   * Test {@link KeyAnalyzer#isNullBitKey(int)}.
   * <ul>
   *   <li>When {@link KeyAnalyzer#NULL_BIT_KEY}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isNullBitKey(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isNullBitKey(int)"})
  public void testIsNullBitKey_whenNull_bit_key_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isNullBitKey(KeyAnalyzer.NULL_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isNullBitKey(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isNullBitKey(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isNullBitKey(int)"})
  public void testIsNullBitKey_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isNullBitKey(1));
  }

  /**
   * Test {@link KeyAnalyzer#isOutOfBoundsIndex(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isOutOfBoundsIndex(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isOutOfBoundsIndex(int)"})
  public void testIsOutOfBoundsIndex_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isOutOfBoundsIndex(1));
  }

  /**
   * Test {@link KeyAnalyzer#isOutOfBoundsIndex(int)}.
   * <ul>
   *   <li>When {@link KeyAnalyzer#OUT_OF_BOUNDS_BIT_KEY}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isOutOfBoundsIndex(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isOutOfBoundsIndex(int)"})
  public void testIsOutOfBoundsIndex_whenOut_of_bounds_bit_key_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isOutOfBoundsIndex(KeyAnalyzer.OUT_OF_BOUNDS_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isValidBitIndex(int)}.
   * <ul>
   *   <li>When {@link KeyAnalyzer#NULL_BIT_KEY}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isValidBitIndex(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isValidBitIndex(int)"})
  public void testIsValidBitIndex_whenNull_bit_key_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isValidBitIndex(KeyAnalyzer.NULL_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isValidBitIndex(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#isValidBitIndex(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean KeyAnalyzer.isValidBitIndex(int)"})
  public void testIsValidBitIndex_whenOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isValidBitIndex(1));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  public void testCompare_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, StringKeyAnalyzer.INSTANCE.compare(null, null));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code O1}.</li>
   *   <li>Then return {@link KeyAnalyzer#NULL_BIT_KEY}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  public void testCompare_whenO1_thenReturnNull_bit_key() {
    // Arrange, Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, StringKeyAnalyzer.INSTANCE.compare("O1", "O2"));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code O1}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  public void testCompare_whenO1_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, StringKeyAnalyzer.INSTANCE.compare("O1", null));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code O2}.</li>
   *   <li>Then return {@link KeyAnalyzer#NULL_BIT_KEY}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  public void testCompare_whenO2_thenReturnNull_bit_key() {
    // Arrange, Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, StringKeyAnalyzer.INSTANCE.compare(null, "O2"));
  }
}
