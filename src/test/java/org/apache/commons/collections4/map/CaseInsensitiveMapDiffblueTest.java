package org.apache.commons.collections4.map;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CaseInsensitiveMapDiffblueTest {
  /**
   * Method under test: {@link CaseInsensitiveMap#convertKey(Object)}
   */
  @Test
  public void testConvertKey() {
    // Arrange
    CaseInsensitiveMap<Object, Object> objectObjectMap = new CaseInsensitiveMap<>();

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.convertKey(null));
  }

  /**
   * Method under test: {@link CaseInsensitiveMap#CaseInsensitiveMap()}
   */
  @Test
  public void testNewCaseInsensitiveMap() {
    // Arrange and Act
    CaseInsensitiveMap<Object, Object> actualObjectObjectMap = new CaseInsensitiveMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CaseInsensitiveMap#CaseInsensitiveMap(int)}
   */
  @Test
  public void testNewCaseInsensitiveMap2() {
    // Arrange and Act
    CaseInsensitiveMap<Object, Object> actualObjectObjectMap = new CaseInsensitiveMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link CaseInsensitiveMap#CaseInsensitiveMap(int, float)}
   */
  @Test
  public void testNewCaseInsensitiveMap3() {
    // Arrange and Act
    CaseInsensitiveMap<Object, Object> actualObjectObjectMap = new CaseInsensitiveMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
