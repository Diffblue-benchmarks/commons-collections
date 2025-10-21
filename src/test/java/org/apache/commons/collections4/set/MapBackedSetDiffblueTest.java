package org.apache.commons.collections4.set;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MapBackedSetDiffblueTest {
  /**
   * Test {@link MapBackedSet#mapBackedSet(Map)} with {@code map}.
   * <p>
   * Method under test: {@link MapBackedSet#mapBackedSet(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapBackedSet MapBackedSet.mapBackedSet(Map)"})
  public void testMapBackedSetWithMap() {
    // Arrange and Act
    MapBackedSet<Object, Object> actualMapBackedSetResult = MapBackedSet.mapBackedSet(new HashMap<>());

    // Assert
    assertTrue(actualMapBackedSetResult.isEmpty());
  }

  /**
   * Test {@link MapBackedSet#mapBackedSet(Map, Object)} with {@code map}, {@code dummyValue}.
   * <p>
   * Method under test: {@link MapBackedSet#mapBackedSet(Map, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapBackedSet MapBackedSet.mapBackedSet(Map, Object)"})
  public void testMapBackedSetWithMapDummyValue() {
    // Arrange and Act
    MapBackedSet<Object, Object> actualMapBackedSetResult = MapBackedSet.mapBackedSet(new HashMap<>(), "Dummy Value");

    // Assert
    assertTrue(actualMapBackedSetResult.isEmpty());
  }
}
