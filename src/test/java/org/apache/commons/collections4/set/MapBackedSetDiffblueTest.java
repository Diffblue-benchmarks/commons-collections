package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MapBackedSetDiffblueTest {
  /**
   * Test {@link MapBackedSet#mapBackedSet(Map)} with {@code map}.
   *
   * <p>Method under test: {@link MapBackedSet#mapBackedSet(Map)}
   */
  @Test
  @DisplayName("Test mapBackedSet(Map) with 'map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapBackedSet MapBackedSet.mapBackedSet(Map)"})
  void testMapBackedSetWithMap() {
    // Arrange and Act
    MapBackedSet<Object, Object> actualMapBackedSetResult =
        MapBackedSet.mapBackedSet(new HashMap<>());

    // Assert
    assertTrue(actualMapBackedSetResult.isEmpty());
  }

  /**
   * Test {@link MapBackedSet#mapBackedSet(Map, Object)} with {@code map}, {@code dummyValue}.
   *
   * <p>Method under test: {@link MapBackedSet#mapBackedSet(Map, Object)}
   */
  @Test
  @DisplayName("Test mapBackedSet(Map, Object) with 'map', 'dummyValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapBackedSet MapBackedSet.mapBackedSet(Map, Object)"})
  void testMapBackedSetWithMapDummyValue() {
    // Arrange and Act
    MapBackedSet<Object, Object> actualMapBackedSetResult =
        MapBackedSet.mapBackedSet(new HashMap<>(), "Dummy Value");

    // Assert
    assertTrue(actualMapBackedSetResult.isEmpty());
  }
}
