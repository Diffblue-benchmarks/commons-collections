package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReferenceMapDiffblueTest {
  /**
   * Test {@link ReferenceMap#ReferenceMap()}.
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap()}
   */
  @Test
  @DisplayName("Test new ReferenceMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceMap.<init>()"})
  void testNewReferenceMap() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength)}.
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength)}
   */
  @Test
  @DisplayName("Test new ReferenceMap(ReferenceStrength, ReferenceStrength)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength)"})
  void testNewReferenceMap2() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, boolean)}.
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, boolean)}
   */
  @Test
  @DisplayName("Test new ReferenceMap(ReferenceStrength, ReferenceStrength, boolean)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, boolean)"})
  void testNewReferenceMap3() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}
   */
  @Test
  @DisplayName("Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  void testNewReferenceMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean)}
   */
  @Test
  @DisplayName("Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"})
  void testNewReferenceMap_whenTen_thenReturnEmpty2() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
