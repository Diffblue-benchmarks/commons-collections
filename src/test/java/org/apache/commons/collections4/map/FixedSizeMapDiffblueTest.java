package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedSizeMapDiffblueTest {
  /**
   * Test {@link FixedSizeMap#fixedSizeMap(Map)}.
   * <p>
   * Method under test: {@link FixedSizeMap#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FixedSizeMap FixedSizeMap.fixedSizeMap(Map)"})
  void testFixedSizeMap() {
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
  @DisplayName("Test new FixedSizeMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FixedSizeMap.<init>(Map)"})
  void testNewFixedSizeMap() {
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
  @DisplayName("Test isFull()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FixedSizeMap.isFull()"})
  void testIsFull() {
    // Arrange
    FixedSizeMap<Object, Object> fixedSizeMapResult = FixedSizeMap.fixedSizeMap(new HashMap<>());

    // Act and Assert
    assertTrue(fixedSizeMapResult.isFull());
  }
}
