package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableSortedMapDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedMap#unmodifiableSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link UnmodifiableSortedMap#unmodifiableSortedMap(SortedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedMap UnmodifiableSortedMap.unmodifiableSortedMap(SortedMap)"})
  public void testUnmodifiableSortedMap() {
    // Arrange and Act
    SortedMap<Object, Object> actualUnmodifiableSortedMapResult = UnmodifiableSortedMap
        .unmodifiableSortedMap(new TreeMap<>());

    // Assert
    assertEquals(((AbstractMapDecorator<?, ?>) actualUnmodifiableSortedMapResult).map,
        actualUnmodifiableSortedMapResult);
  }
}
