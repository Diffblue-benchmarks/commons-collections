package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableMapDiffblueTest {
  /**
   * Test {@link UnmodifiableMap#unmodifiableMap(Map)}.
   * <p>
   * Method under test: {@link UnmodifiableMap#unmodifiableMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map UnmodifiableMap.unmodifiableMap(Map)"})
  public void testUnmodifiableMap() {
    // Arrange and Act
    Map<Object, Object> actualUnmodifiableMapResult = UnmodifiableMap.unmodifiableMap(new HashMap<>());

    // Assert
    assertTrue(actualUnmodifiableMapResult.isEmpty());
  }
}
