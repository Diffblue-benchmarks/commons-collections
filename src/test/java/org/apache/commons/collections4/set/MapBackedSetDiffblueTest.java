package org.apache.commons.collections4.set;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class MapBackedSetDiffblueTest {
  /**
   * Method under test: {@link MapBackedSet#mapBackedSet(Map)}
   */
  @Test
  public void testMapBackedSet() {
    // Arrange and Act
    MapBackedSet<Object, Object> actualMapBackedSetResult = MapBackedSet.mapBackedSet(new HashMap<>());

    // Assert
    assertTrue(actualMapBackedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link MapBackedSet#mapBackedSet(Map, Object)}
   */
  @Test
  public void testMapBackedSet2() {
    // Arrange and Act
    MapBackedSet<Object, Object> actualMapBackedSetResult = MapBackedSet.mapBackedSet(new HashMap<>(), "Dummy Value");

    // Assert
    assertTrue(actualMapBackedSetResult.isEmpty());
  }
}
