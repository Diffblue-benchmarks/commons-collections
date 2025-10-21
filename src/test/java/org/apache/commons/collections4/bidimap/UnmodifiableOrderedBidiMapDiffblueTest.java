package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedBidiMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableOrderedBidiMapDiffblueTest {
  /**
   * Test {@link UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}.
   * <p>
   * Method under test: {@link UnmodifiableOrderedBidiMap#unmodifiableOrderedBidiMap(OrderedBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedBidiMap UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(OrderedBidiMap)"})
  public void testUnmodifiableOrderedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> map = new DualTreeBidiMap<>();

    // Act
    OrderedBidiMap<Object, Object> actualUnmodifiableOrderedBidiMapResult = UnmodifiableOrderedBidiMap
        .unmodifiableOrderedBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableOrderedBidiMapResult);
  }
}
