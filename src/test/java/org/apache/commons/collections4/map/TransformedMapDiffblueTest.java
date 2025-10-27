package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.junit.Test;

public class TransformedMapDiffblueTest {
  /**
   * Method under test:
   * {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertTrue(actualTransformedMapResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(
        new ChainedTransformer<>(new ConstantTransformer<>(AbstractHashedMap.NULL)));

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ChainedTransformer<>(new ConstantTransformer<>(AbstractHashedMap.NULL))));

    // Assert
    assertEquals(1, actualTransformedMapResult.size());
    assertTrue(actualTransformedMapResult.containsKey(null));
  }

  /**
   * Method under test:
   * {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map,
        new ChainedTransformer<>(new ChainedTransformer<>(new ConstantTransformer<>(AbstractHashedMap.NULL))), null);

    // Assert
    assertEquals(1, actualTransformedMapResult.size());
    assertTrue(actualTransformedMapResult.containsKey(null));
  }

  /**
   * Method under test:
   * {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(
        new ChainedTransformer<>(new ConstantTransformer<>(new LRUMap<>())));

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ChainedTransformer<>(new ConstantTransformer<>(AbstractHashedMap.NULL))));

    // Assert
    assertEquals(1, actualTransformedMapResult.size());
  }
}
