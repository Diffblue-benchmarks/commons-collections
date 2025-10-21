package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ReferenceMapDiffblueTest {
  /**
   * Test {@link ReferenceMap#ReferenceMap()}.
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceMap.<init>()"})
  public void testNewReferenceMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength)"})
  public void testNewReferenceMap2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, boolean)"})
  public void testNewReferenceMap3() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  public void testNewReferenceMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"})
  public void testNewReferenceMap_whenThree_thenReturnEmpty2() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
