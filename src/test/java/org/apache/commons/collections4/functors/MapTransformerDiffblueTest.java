package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class MapTransformerDiffblueTest {
  /**
   * Method under test: {@link MapTransformer#mapTransformer(Map)}
   */
  @Test
  public void testMapTransformer() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(map);

    // Assert
    assertTrue(actualMapTransformerResult instanceof MapTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    Map<? super Object, ?> map2 = ((MapTransformer<Object, Object>) actualMapTransformerResult).getMap();
    assertTrue(map2.isEmpty());
    assertSame(map, map2);
  }

  /**
   * Method under test: {@link MapTransformer#mapTransformer(Map)}
   */
  @Test
  public void testMapTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = MapTransformer.mapTransformer(null);

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
  }
}
