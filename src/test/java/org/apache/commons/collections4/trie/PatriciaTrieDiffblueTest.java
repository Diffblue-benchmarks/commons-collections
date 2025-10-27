package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class PatriciaTrieDiffblueTest {
  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie()}
   */
  @Test
  public void testNewPatriciaTrie() {
    // Arrange and Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>();

    // Assert
    assertTrue(actualObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  public void testNewPatriciaTrie2() {
    // Arrange and Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  public void testNewPatriciaTrie3() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("keyAnalyzer", "42");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(1, actualObjectMap.size());
    assertEquals("42", actualObjectMap.get("keyAnalyzer"));
  }

  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  public void testNewPatriciaTrie4() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("key", "42");
    map.put("keyAnalyzer", "42");

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }

  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  public void testNewPatriciaTrie5() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("", "42");

    // Act
    PatriciaTrie<Object> actualObjectMap = new PatriciaTrie<>(map);

    // Assert
    assertEquals(1, actualObjectMap.size());
    assertEquals("42", actualObjectMap.get(""));
  }

  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  public void testNewPatriciaTrie6() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("42", "42");
    map.put("keyAnalyzer", "42");

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }

  /**
   * Method under test: {@link PatriciaTrie#PatriciaTrie(Map)}
   */
  @Test
  public void testNewPatriciaTrie7() {
    // Arrange
    HashMap<String, Object> map = new HashMap<>();
    map.put("42", "42");
    map.put("key", "42");

    // Act and Assert
    assertEquals(map, new PatriciaTrie<>(map));
  }
}
