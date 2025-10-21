package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FixedSizeSortedMapDiffblueTest {
  /**
   * Test {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link FixedSizeSortedMap#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FixedSizeSortedMap FixedSizeSortedMap.fixedSizeSortedMap(SortedMap)"})
  public void testFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualFixedSizeSortedMapResult = FixedSizeSortedMap
        .fixedSizeSortedMap(new TreeMap<>());

    // Assert
    assertEquals(actualFixedSizeSortedMapResult.map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}.
   * <p>
   * Method under test: {@link FixedSizeSortedMap#FixedSizeSortedMap(SortedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedSizeSortedMap.<init>(SortedMap)"})
  public void testNewFixedSizeSortedMap() {
    // Arrange and Act
    FixedSizeSortedMap<Object, Object> actualObjectObjectMap = new FixedSizeSortedMap<>(new TreeMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link FixedSizeSortedMap#isFull()}.
   * <p>
   * Method under test: {@link FixedSizeSortedMap#isFull()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedSizeSortedMap.isFull()"})
  public void testIsFull() {
    // Arrange
    FixedSizeSortedMap<Object, Object> fixedSizeSortedMapResult = FixedSizeSortedMap
        .fixedSizeSortedMap(new TreeMap<>());

    // Act and Assert
    assertTrue(fixedSizeSortedMapResult.isFull());
  }
}
