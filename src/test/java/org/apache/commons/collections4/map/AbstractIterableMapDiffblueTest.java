package org.apache.commons.collections4.map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractIterableMapDiffblueTest {
  /**
   * Test {@link AbstractIterableMap#mapIterator()}.
   * <p>
   * Method under test: {@link AbstractIterableMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator AbstractIterableMap.mapIterator()"})
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
