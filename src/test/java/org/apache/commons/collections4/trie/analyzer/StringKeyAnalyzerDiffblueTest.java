package org.apache.commons.collections4.trie.analyzer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StringKeyAnalyzerDiffblueTest {
  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key",
        StringKeyAnalyzer.LENGTH, 3, "Other", StringKeyAnalyzer.LENGTH, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key",
        StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH, "Other", StringKeyAnalyzer.LENGTH, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when 'null'; then return nine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenNull_thenReturnNine() {
    // Arrange, Act and Assert
    assertEquals(9, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH, null,
        StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When one.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenOne() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, 3, "Other", 1, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When {@code Other}.</li>
   *   <li>Then return eleven.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when 'Other'; then return eleven")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenOther_thenReturnEleven() {
    // Arrange, Act and Assert
    assertEquals(11, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH,
        "Other", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When two.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenTwo() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.bitIndex("Key", 2, 3, "Other", 1, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when zero; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenZero_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1,
        StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, 0, "Other", StringKeyAnalyzer.LENGTH, 0));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when zero; then return nine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenZero_thenReturnNine() {
    // Arrange, Act and Assert
    assertEquals(9, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH,
        "Other", StringKeyAnalyzer.LENGTH, 0));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)} with {@code String}, {@code int}, {@code int}, {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitIndex(String, int, int, String, int, int)}
   */
  @Test
  @DisplayName("Test bitIndex(String, int, int, String, int, int) with 'String', 'int', 'int', 'String', 'int', 'int'; when zero; then return nine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitIndex(String, int, int, String, int, int)"})
  void testBitIndexWithStringIntIntStringIntInt_whenZero_thenReturnNine2() {
    // Arrange, Act and Assert
    assertEquals(9, StringKeyAnalyzer.INSTANCE.bitIndex("Key", StringKeyAnalyzer.LENGTH, 0, "Other",
        StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH));
  }

  /**
   * Test {@link StringKeyAnalyzer#bitsPerElement()}.
   * <p>
   * Method under test: {@link StringKeyAnalyzer#bitsPerElement()}
   */
  @Test
  @DisplayName("Test bitsPerElement()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.bitsPerElement()"})
  void testBitsPerElement() {
    // Arrange, Act and Assert
    assertEquals(StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.INSTANCE.bitsPerElement());
  }

  /**
   * Test {@link StringKeyAnalyzer#isBitSet(String, int, int)} with {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isBitSet(String, int, int)}
   */
  @Test
  @DisplayName("Test isBitSet(String, int, int) with 'String', 'int', 'int'; when 'Key'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isBitSet(String, int, int)"})
  void testIsBitSetWithStringIntInt_whenKey_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StringKeyAnalyzer.INSTANCE.isBitSet("Key", 1, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#isBitSet(String, int, int)} with {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isBitSet(String, int, int)}
   */
  @Test
  @DisplayName("Test isBitSet(String, int, int) with 'String', 'int', 'int'; when 'Key'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isBitSet(String, int, int)"})
  void testIsBitSetWithStringIntInt_whenKey_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(StringKeyAnalyzer.INSTANCE.isBitSet("Key", 3, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#isBitSet(String, int, int)} with {@code String}, {@code int}, {@code int}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isBitSet(String, int, int)}
   */
  @Test
  @DisplayName("Test isBitSet(String, int, int) with 'String', 'int', 'int'; when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isBitSet(String, int, int)"})
  void testIsBitSetWithStringIntInt_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StringKeyAnalyzer.INSTANCE.isBitSet(null, 1, 3));
  }

  /**
   * Test {@link StringKeyAnalyzer#isPrefix(String, int, int, String)} with {@code String}, {@code int}, {@code int}, {@code String}.
   * <ul>
   *   <li>When {@link StringKeyAnalyzer#LENGTH}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isPrefix(String, int, int, String)}
   */
  @Test
  @DisplayName("Test isPrefix(String, int, int, String) with 'String', 'int', 'int', 'String'; when LENGTH; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isPrefix(String, int, int, String)"})
  void testIsPrefixWithStringIntIntString_whenLength_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(
        StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", StringKeyAnalyzer.LENGTH, StringKeyAnalyzer.LENGTH, "Key"));
  }

  /**
   * Test {@link StringKeyAnalyzer#isPrefix(String, int, int, String)} with {@code String}, {@code int}, {@code int}, {@code String}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isPrefix(String, int, int, String)}
   */
  @Test
  @DisplayName("Test isPrefix(String, int, int, String) with 'String', 'int', 'int', 'String'; when three; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isPrefix(String, int, int, String)"})
  void testIsPrefixWithStringIntIntString_whenThree_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", StringKeyAnalyzer.LENGTH, 3, "Key"));
  }

  /**
   * Test {@link StringKeyAnalyzer#isPrefix(String, int, int, String)} with {@code String}, {@code int}, {@code int}, {@code String}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isPrefix(String, int, int, String)}
   */
  @Test
  @DisplayName("Test isPrefix(String, int, int, String) with 'String', 'int', 'int', 'String'; when two; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isPrefix(String, int, int, String)"})
  void testIsPrefixWithStringIntIntString_whenTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", 2, 3, "Key"));
  }

  /**
   * Test {@link StringKeyAnalyzer#isPrefix(String, int, int, String)} with {@code String}, {@code int}, {@code int}, {@code String}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#isPrefix(String, int, int, String)}
   */
  @Test
  @DisplayName("Test isPrefix(String, int, int, String) with 'String', 'int', 'int', 'String'; when zero; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean StringKeyAnalyzer.isPrefix(String, int, int, String)"})
  void testIsPrefixWithStringIntIntString_whenZero_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StringKeyAnalyzer.INSTANCE.isPrefix("Prefix", 0, StringKeyAnalyzer.LENGTH, "Key"));
  }

  /**
   * Test {@link StringKeyAnalyzer#lengthInBits(String)} with {@code String}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then return forty-eight.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#lengthInBits(String)}
   */
  @Test
  @DisplayName("Test lengthInBits(String) with 'String'; when 'Key'; then return forty-eight")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.lengthInBits(String)"})
  void testLengthInBitsWithString_whenKey_thenReturnFortyEight() {
    // Arrange, Act and Assert
    assertEquals(48, StringKeyAnalyzer.INSTANCE.lengthInBits("Key"));
  }

  /**
   * Test {@link StringKeyAnalyzer#lengthInBits(String)} with {@code String}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringKeyAnalyzer#lengthInBits(String)}
   */
  @Test
  @DisplayName("Test lengthInBits(String) with 'String'; when 'null'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int StringKeyAnalyzer.lengthInBits(String)"})
  void testLengthInBitsWithString_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, StringKeyAnalyzer.INSTANCE.lengthInBits(null));
  }
}
