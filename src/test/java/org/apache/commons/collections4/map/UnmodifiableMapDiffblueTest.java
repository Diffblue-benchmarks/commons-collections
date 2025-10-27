package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class UnmodifiableMapDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableMap#unmodifiableMap(Map)}
   */
  @Test
  public void testUnmodifiableMap() {
    // Arrange and Act
    Map<Object, Object> actualUnmodifiableMapResult = UnmodifiableMap.unmodifiableMap(new HashMap<>());

    // Assert
    assertTrue(actualUnmodifiableMapResult.isEmpty());
  }
}
