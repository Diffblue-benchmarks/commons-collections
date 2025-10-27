package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ReferenceMapDiffblueTest {
  /**
   * Method under test: {@link ReferenceMap#ReferenceMap()}
   */
  @Test
  public void testNewReferenceMap() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceMap#ReferenceMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength)}
   */
  @Test
  public void testNewReferenceMap2() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD,
        AbstractReferenceMap.ReferenceStrength.HARD);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceMap#ReferenceMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength, int, float)}
   */
  @Test
  public void testNewReferenceMap3() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD,
        AbstractReferenceMap.ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceMap#ReferenceMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength, int, float, boolean)}
   */
  @Test
  public void testNewReferenceMap4() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD,
        AbstractReferenceMap.ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceMap#ReferenceMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength, boolean)}
   */
  @Test
  public void testNewReferenceMap5() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD,
        AbstractReferenceMap.ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
