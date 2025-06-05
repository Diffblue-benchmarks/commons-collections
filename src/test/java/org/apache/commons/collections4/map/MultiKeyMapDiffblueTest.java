package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MultiKeyMapDiffblueTest {
  /**
   * Test {@link MultiKeyMap#MultiKeyMap()}.
   * <p>
   * Method under test: {@link MultiKeyMap#MultiKeyMap()}
   */
  @Test
  @DisplayName("Test new MultiKeyMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiKeyMap.<init>()"})
  void testNewMultiKeyMap() {
    // Arrange and Act
    MultiKeyMap<Object, Object> actualObjectObjectMap = new MultiKeyMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
