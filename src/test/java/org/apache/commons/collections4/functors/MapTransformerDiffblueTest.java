package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MapTransformerDiffblueTest {
  /**
   * Test {@link MapTransformer#mapTransformer(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@link MapTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapTransformer#mapTransformer(Map)}
   */
  @Test
  @DisplayName("Test mapTransformer(Map); when HashMap(); then return MapTransformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer MapTransformer.mapTransformer(Map)"})
  void testMapTransformer_whenHashMap_thenReturnMapTransformer() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(map);

    // Assert
    assertTrue(actualMapTransformerResult instanceof MapTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertTrue(map.isEmpty());
    assertTrue(((MapTransformer<Object, Object>) actualMapTransformerResult).getMap().isEmpty());
  }

  /**
   * Test {@link MapTransformer#mapTransformer(Map)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapTransformer#mapTransformer(Map)}
   */
  @Test
  @DisplayName("Test mapTransformer(Map); when 'null'; then return ConstantTransformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer MapTransformer.mapTransformer(Map)"})
  void testMapTransformer_whenNull_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(null);

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
    assertNull(null);
  }

  /**
   * Test {@link MapTransformer#mapTransformer(Map)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link ConstantTransformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapTransformer#mapTransformer(Map)}
   */
  @Test
  @DisplayName("Test mapTransformer(Map); when 'null'; then return ConstantTransformer")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer MapTransformer.mapTransformer(Map)"})
  void testMapTransformer_whenNull_thenReturnConstantTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(null);

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
    assertNull(null);
  }
}
