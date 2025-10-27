package org.apache.commons.collections4;

import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.junit.Test;

public class SplitMapUtilsDiffblueTest {
  /**
   * Method under test: {@link SplitMapUtils#readableMap(Get)}
   */
  @Test
  public void testReadableMap() {
    // Arrange and Act
    IterableMap<Object, Object> actualReadableMapResult = SplitMapUtils.readableMap(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualReadableMapResult.isEmpty());
  }

  /**
   * Method under test: {@link SplitMapUtils#writableMap(Put)}
   */
  @Test
  public void testWritableMap() {
    // Arrange and Act
    Map<Object, Object> actualWritableMapResult = SplitMapUtils.writableMap(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualWritableMapResult.isEmpty());
  }
}
