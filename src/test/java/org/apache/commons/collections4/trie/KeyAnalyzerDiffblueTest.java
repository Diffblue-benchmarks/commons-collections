package org.apache.commons.collections4.trie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class KeyAnalyzerDiffblueTest {
  /**
   * Test {@link KeyAnalyzer#isEqualBitKey(int)}.
   *
   * <ul>
   *   <li>When {@link KeyAnalyzer#EQUAL_BIT_KEY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isEqualBitKey(int)}
   */
  @Test
  @DisplayName("Test isEqualBitKey(int); when EQUAL_BIT_KEY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isEqualBitKey(int)"})
  void testIsEqualBitKey_whenEqual_bit_key_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isEqualBitKey(KeyAnalyzer.EQUAL_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isEqualBitKey(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isEqualBitKey(int)}
   */
  @Test
  @DisplayName("Test isEqualBitKey(int); when one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isEqualBitKey(int)"})
  void testIsEqualBitKey_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isEqualBitKey(1));
  }

  /**
   * Test {@link KeyAnalyzer#isNullBitKey(int)}.
   *
   * <ul>
   *   <li>When {@link KeyAnalyzer#NULL_BIT_KEY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isNullBitKey(int)}
   */
  @Test
  @DisplayName("Test isNullBitKey(int); when NULL_BIT_KEY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isNullBitKey(int)"})
  void testIsNullBitKey_whenNull_bit_key_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isNullBitKey(KeyAnalyzer.NULL_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isNullBitKey(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isNullBitKey(int)}
   */
  @Test
  @DisplayName("Test isNullBitKey(int); when one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isNullBitKey(int)"})
  void testIsNullBitKey_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isNullBitKey(1));
  }

  /**
   * Test {@link KeyAnalyzer#isOutOfBoundsIndex(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isOutOfBoundsIndex(int)}
   */
  @Test
  @DisplayName("Test isOutOfBoundsIndex(int); when one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isOutOfBoundsIndex(int)"})
  void testIsOutOfBoundsIndex_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isOutOfBoundsIndex(1));
  }

  /**
   * Test {@link KeyAnalyzer#isOutOfBoundsIndex(int)}.
   *
   * <ul>
   *   <li>When {@link KeyAnalyzer#OUT_OF_BOUNDS_BIT_KEY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isOutOfBoundsIndex(int)}
   */
  @Test
  @DisplayName("Test isOutOfBoundsIndex(int); when OUT_OF_BOUNDS_BIT_KEY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isOutOfBoundsIndex(int)"})
  void testIsOutOfBoundsIndex_whenOut_of_bounds_bit_key_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isOutOfBoundsIndex(KeyAnalyzer.OUT_OF_BOUNDS_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isValidBitIndex(int)}.
   *
   * <ul>
   *   <li>When {@link KeyAnalyzer#NULL_BIT_KEY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isValidBitIndex(int)}
   */
  @Test
  @DisplayName("Test isValidBitIndex(int); when NULL_BIT_KEY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isValidBitIndex(int)"})
  void testIsValidBitIndex_whenNull_bit_key_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KeyAnalyzer.isValidBitIndex(KeyAnalyzer.NULL_BIT_KEY));
  }

  /**
   * Test {@link KeyAnalyzer#isValidBitIndex(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#isValidBitIndex(int)}
   */
  @Test
  @DisplayName("Test isValidBitIndex(int); when one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyAnalyzer.isValidBitIndex(int)"})
  void testIsValidBitIndex_whenOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KeyAnalyzer.isValidBitIndex(1));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  void testCompare_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, StringKeyAnalyzer.INSTANCE.compare(null, null));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code O1}.
   *   <li>Then return {@link KeyAnalyzer#NULL_BIT_KEY}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'O1'; then return NULL_BIT_KEY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  void testCompare_whenO1_thenReturnNull_bit_key() {
    // Arrange, Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, StringKeyAnalyzer.INSTANCE.compare("O1", "O2"));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code O1}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'O1'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  void testCompare_whenO1_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, StringKeyAnalyzer.INSTANCE.compare("O1", null));
  }

  /**
   * Test {@link KeyAnalyzer#compare(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code O2}.
   *   <li>Then return {@link KeyAnalyzer#NULL_BIT_KEY}.
   * </ul>
   *
   * <p>Method under test: {@link KeyAnalyzer#compare(Object, Object)}
   */
  @Test
  @DisplayName("Test compare(Object, Object); when 'O2'; then return NULL_BIT_KEY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int KeyAnalyzer.compare(Object, Object)"})
  void testCompare_whenO2_thenReturnNull_bit_key() {
    // Arrange, Act and Assert
    assertEquals(KeyAnalyzer.NULL_BIT_KEY, StringKeyAnalyzer.INSTANCE.compare(null, "O2"));
  }
}
