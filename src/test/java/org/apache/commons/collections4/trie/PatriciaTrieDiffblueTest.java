package org.apache.commons.collections4.trie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PatriciaTrieDiffblueTest {
  /**
   * Test {@link PatriciaTrie#PatriciaTrie()}.
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie()}
   */
  @Test
  @DisplayName("Test new PatriciaTrie()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>()"})
  void testNewPatriciaTrie() {
    // Arrange and Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>();

    // Assert
    assertTrue(actualObjectMap.isEmpty());
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   * <ul>
   *   <li>Given empty string.</li>
   *   <li>When {@link HashMap#HashMap()} empty string is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); given empty string; when HashMap() empty string is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenEmptyString_whenHashMapEmptyStringIs42() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("", "42");

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   * <ul>
   *   <li>Given {@code keyAnalyzer}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); given 'keyAnalyzer'; when HashMap() '42' is '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenKeyAnalyzer_whenHashMap42Is42_thenReturn42() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("42", "42");
    map.put("keyAnalyzer", "42");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(2, actualObjectMap.size());
    assertEquals("42", actualObjectMap.get("42"));
    assertEquals("42", actualObjectMap.get("keyAnalyzer"));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   * <ul>
   *   <li>Given {@code keyAnalyzer}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code keyAnalyzer} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); given 'keyAnalyzer'; when HashMap() 'keyAnalyzer' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenKeyAnalyzer_whenHashMapKeyAnalyzerIs42() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("keyAnalyzer", "42");

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   * <ul>
   *   <li>Given {@code key}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); given 'key'; when HashMap() '42' is '42'; then return HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenKey_whenHashMap42Is42_thenReturnHashMap() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("42", "42");
    map.put("key", "42");

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   * <ul>
   *   <li>Given {@code key}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code key} is {@code 42}.</li>
   *   <li>Then return {@code key} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); given 'key'; when HashMap() 'key' is '42'; then return 'key' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_givenKey_whenHashMapKeyIs42_thenReturnKeyIs42() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("key", "42");
    map.put("keyAnalyzer", "42");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(2, actualObjectMap.size());
    assertEquals("42", actualObjectMap.get("key"));
    assertEquals("42", actualObjectMap.get("keyAnalyzer"));
  }

  /**
   * Test {@link PatriciaTrie#PatriciaTrie(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link HashMap#HashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  @DisplayName("Test new PatriciaTrie(Map); when HashMap(); then return HashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PatriciaTrie.<init>(Map)"})
  void testNewPatriciaTrie_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }
}
