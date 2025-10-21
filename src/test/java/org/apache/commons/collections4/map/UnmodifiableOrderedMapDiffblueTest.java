package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableOrderedMapDiffblueTest {
  /**
   * Test {@link UnmodifiableOrderedMap#unmodifiableOrderedMap(OrderedMap)}.
   * <p>
   * Method under test: {@link UnmodifiableOrderedMap#unmodifiableOrderedMap(OrderedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMap UnmodifiableOrderedMap.unmodifiableOrderedMap(OrderedMap)"})
  public void testUnmodifiableOrderedMap() {
    // Arrange and Act
    OrderedMap<Object, Object> actualUnmodifiableOrderedMapResult = UnmodifiableOrderedMap
        .unmodifiableOrderedMap(new DualTreeBidiMap<>());

    // Assert
    assertEquals(((AbstractMapDecorator<?, ?>) actualUnmodifiableOrderedMapResult).map,
        actualUnmodifiableOrderedMapResult);
  }
}
