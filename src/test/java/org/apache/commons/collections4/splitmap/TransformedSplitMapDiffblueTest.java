package org.apache.commons.collections4.splitmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.junit.Test;

public class TransformedSplitMapDiffblueTest {
  /**
   * Method under test: {@link TransformedSplitMap#transformMap(Map)}
   */
  @Test
  public void testTransformMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap.transformingMap(map,
        keyTransformer, new ChainedTransformer<>(null));
    HashMap<Object, Object> map2 = new HashMap<>();

    // Act
    Map<Object, Object> actualTransformMapResult = transformingMapResult.transformMap(map2);

    // Assert
    assertTrue(actualTransformMapResult.isEmpty());
    assertSame(map2, actualTransformMapResult);
  }

  /**
   * Method under test: {@link TransformedSplitMap#transformMap(Map)}
   */
  @Test
  public void testTransformMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>();
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap.transformingMap(map,
        keyTransformer, new ChainedTransformer<>());

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put("42", "42");

    // Act
    Map<Object, Object> actualTransformMapResult = transformingMapResult.transformMap(map2);

    // Assert
    assertEquals(1, actualTransformMapResult.size());
    assertEquals("42", actualTransformMapResult.get("42"));
  }
}
