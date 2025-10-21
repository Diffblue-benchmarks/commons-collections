package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBidiMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableSortedBidiMapDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}.
   * <p>
   * Method under test: {@link UnmodifiableSortedBidiMap#unmodifiableSortedBidiMap(SortedBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBidiMap UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(SortedBidiMap)"})
  public void testUnmodifiableSortedBidiMap() {
    // Arrange
    DualTreeBidiMap<Object, Object> map = new DualTreeBidiMap<>();

    // Act
    SortedBidiMap<Object, Object> actualUnmodifiableSortedBidiMapResult = UnmodifiableSortedBidiMap
        .unmodifiableSortedBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableSortedBidiMapResult);
  }
}
