package org.apache.commons.collections4;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SplitMapUtilsDiffblueTest {
  /**
   * Test {@link SplitMapUtils#readableMap(Get)}.
   * <p>
   * Method under test: {@link SplitMapUtils#readableMap(Get)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"IterableMap SplitMapUtils.readableMap(Get)"})
  public void testReadableMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map SplitMapUtils.writableMap(Put)"})
  public void testWritableMap() {
    // Arrange and Act
    Map<Object, Object> actualWritableMapResult = SplitMapUtils.writableMap(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualWritableMapResult.isEmpty());
  }
}
