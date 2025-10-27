package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class FixedSizeMapDiffblueTest {
  /**
   * Method under test: {@link FixedSizeMap#fixedSizeMap(Map)}
   */
  @Test
  public void testFixedSizeMap() {
    // Arrange and Act
    FixedSizeMap<Object, Object> actualFixedSizeMapResult = FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Assert
    assertTrue(actualFixedSizeMapResult.isEmpty());
  }

  /**
   * Method under test: {@link FixedSizeMap#isFull()}
   */
  @Test
  public void testIsFull() {
    // Arrange
    FixedSizeMap<Object, Object> fixedSizeMapResult = FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Act and Assert
    assertTrue(fixedSizeMapResult.isFull());
  }

  /**
   * Method under test: {@link FixedSizeMap#FixedSizeMap(Map)}
   */
  @Test
  public void testNewFixedSizeMap() {
    // Arrange and Act
    FixedSizeMap<Object, Object> actualObjectObjectMap = new FixedSizeMap<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
