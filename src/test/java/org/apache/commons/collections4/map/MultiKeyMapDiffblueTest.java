package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MultiKeyMapDiffblueTest {
  /**
   * Method under test: {@link MultiKeyMap#MultiKeyMap()}
   */
  @Test
  public void testNewMultiKeyMap() {
    // Arrange and Act
    MultiKeyMap<Object, Object> actualObjectObjectMap = new MultiKeyMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
