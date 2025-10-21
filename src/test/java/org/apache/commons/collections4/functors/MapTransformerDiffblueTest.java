package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MapTransformerDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer MapTransformer.mapTransformer(Map)"})
  public void testMapTransformer_whenHashMap_thenReturnMapTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(new HashMap<>());

    // Assert
    assertTrue(actualMapTransformerResult instanceof MapTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer MapTransformer.mapTransformer(Map)"})
  public void testMapTransformer_whenNull_thenReturnConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(null);

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
  }
}
