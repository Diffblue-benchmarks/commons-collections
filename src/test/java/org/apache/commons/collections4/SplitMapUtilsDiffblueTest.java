package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SplitMapUtilsDiffblueTest {
  /**
   * Test {@link SplitMapUtils#readableMap(Get)}.
   * <p>
   * Method under test: {@link SplitMapUtils#readableMap(Get)}
   */
  @Test
  @DisplayName("Test readableMap(Get)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IterableMap SplitMapUtils.readableMap(Get)"})
  void testReadableMap() {
    // Arrange and Act
    IterableMap<Object, Object> actualReadableMapResult = SplitMapUtils.readableMap(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualReadableMapResult.isEmpty());
  }

  /**
   * Test {@link SplitMapUtils#writableMap(Put)}.
   * <p>
   * Method under test: {@link SplitMapUtils#writableMap(Put)}
   */
  @Test
  @DisplayName("Test writableMap(Put)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map SplitMapUtils.writableMap(Put)"})
  void testWritableMap() {
    // Arrange and Act
    Map<Object, Object> actualWritableMapResult = SplitMapUtils.writableMap(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualWritableMapResult.isEmpty());
  }
}
