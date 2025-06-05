package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableMapDiffblueTest {
  /**
   * Test {@link UnmodifiableMap#unmodifiableMap(Map)}.
   * <p>
   * Method under test: {@link UnmodifiableMap#unmodifiableMap(Map)}
   */
  @Test
  @DisplayName("Test unmodifiableMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map UnmodifiableMap.unmodifiableMap(Map)"})
  void testUnmodifiableMap() {
    // Arrange and Act
    Map<Object, Object> actualUnmodifiableMapResult = UnmodifiableMap.unmodifiableMap(new HashMap<>());

    // Assert
    assertTrue(actualUnmodifiableMapResult.isEmpty());
  }
}
