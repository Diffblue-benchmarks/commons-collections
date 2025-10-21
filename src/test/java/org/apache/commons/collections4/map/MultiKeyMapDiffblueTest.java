package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MultiKeyMapDiffblueTest {
  /**
   * Test {@link MultiKeyMap#MultiKeyMap()}.
   * <p>
   * Method under test: {@link MultiKeyMap#MultiKeyMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MultiKeyMap.<init>()"})
  public void testNewMultiKeyMap() {
    // Arrange and Act
    MultiKeyMap<Object, Object> actualObjectObjectMap = new MultiKeyMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
