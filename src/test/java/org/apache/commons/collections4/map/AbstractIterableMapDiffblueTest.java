package org.apache.commons.collections4.map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;

public class AbstractIterableMapDiffblueTest {
  /**
   * Method under test: {@link AbstractIterableMap#mapIterator()}
   */
  @Test
  public void testMapIterator() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EntrySetToMapIteratorAdapter);
    assertFalse(actualMapIteratorResult.hasNext());
  }
}
