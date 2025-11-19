package org.apache.commons.collections4.trie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PatriciaTrieDiffblueTest {
  /**
   * Test {@link PatriciaTrie#PatriciaTrie()}.
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie()}
   */
  @Test
  @DisplayName("Test new PatriciaTrie()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>()"})
  void testNewPatriciaTrie() {
    // Arrange and Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>();

    // Assert
    assertTrue(actualObjectMap.isEmpty());
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>Then return {@code 42} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName(
      "Test new PatriciaTrie(Map); given '42'; when HashMap() '42' is 'Value'; then return '42' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_given42_whenHashMap42IsValue_thenReturn42IsValue() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("42", "Value");
    map.put("keyAnalyzer", "Value");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(2, actualObjectMap.size());
    assertEquals("Value", actualObjectMap.get("42"));
    assertEquals("Value", actualObjectMap.get("keyAnalyzer"));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName(
      "Test new PatriciaTrie(Map); given '42'; when HashMap() '42' is 'Value'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_given42_whenHashMap42IsValue_thenReturnHashMap() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("42", "Value");
    map.put("key", "Value");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(map, actualObjectMap);
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link HashMap#HashMap()} empty string is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName(
      "Test new PatriciaTrie(Map); given empty string; when HashMap() empty string is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenEmptyString_whenHashMapEmptyStringIsValue() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("", "Value");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(map, actualObjectMap);
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   *
   * <ul>
   *   <li>Given {@code keyAnalyzer}.
   *   <li>When {@link HashMap#HashMap()} {@code keyAnalyzer} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName(
      "Test new PatriciaTrie(Map); given 'keyAnalyzer'; when HashMap() 'keyAnalyzer' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenKeyAnalyzer_whenHashMapKeyAnalyzerIsValue() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("keyAnalyzer", "Value");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(map, actualObjectMap);
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   *
   * <ul>
   *   <li>Given {@code key}.
   *   <li>When {@link HashMap#HashMap()} {@code key} is {@code Value}.
   *   <li>Then return {@code key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName(
      "Test new PatriciaTrie(Map); given 'key'; when HashMap() 'key' is 'Value'; then return 'key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenKey_whenHashMapKeyIsValue_thenReturnKeyIsValue() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("key", "Value");
    map.put("keyAnalyzer", "Value");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(2, actualObjectMap.size());
    assertEquals("Value", actualObjectMap.get("key"));
    assertEquals("Value", actualObjectMap.get("keyAnalyzer"));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(map, actualObjectMap);
  }
}
