package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FixedSizeMapDiffblueTest {
  /**
   * Test {@link FixedSizeMap#fixedSizeMap(Map)}.
   * <p>
   * Method under test: {@link FixedSizeMap#fixedSizeMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"FixedSizeMap FixedSizeMap.fixedSizeMap(Map)"})
  public void testFixedSizeMap() {
    // Arrange and Act
    FixedSizeMap<Object, Object> actualFixedSizeMapResult = FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Assert
    assertEquals(actualFixedSizeMapResult.map, actualFixedSizeMapResult);
  }

  /**
   * Test {@link FixedSizeMap#FixedSizeMap(Map)}.
   * <p>
   * Method under test: {@link FixedSizeMap#FixedSizeMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FixedSizeMap.<init>(Map)"})
  public void testNewFixedSizeMap() {
    // Arrange and Act
    FixedSizeMap<Object, Object> actualObjectObjectMap = new FixedSizeMap<>(new HashMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link FixedSizeMap#isFull()}.
   * <p>
   * Method under test: {@link FixedSizeMap#isFull()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FixedSizeMap.isFull()"})
  public void testIsFull() {
    // Arrange
    FixedSizeMap<Object, Object> fixedSizeMapResult = FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Act and Assert
    assertTrue(fixedSizeMapResult.isFull());
  }
}
