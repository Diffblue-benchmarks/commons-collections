package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class LazyMapDiffblueTest {
  /**
   * Method under test: {@link LazyMap#lazyMap(Map, Factory)}
   */
  @Test
  public void testLazyMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    LazyMap<Object, Object> actualLazyMapResult = LazyMap.lazyMap(map, new ConstantFactory<>(AbstractHashedMap.NULL));

    // Assert
    assertTrue(actualLazyMapResult.isEmpty());
  }

  /**
   * Method under test: {@link LazyMap#LazyMap(Map, Factory)}
   */
  @Test
  public void testNewLazyMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    LazyMap<Object, Object> actualObjectObjectMap = new LazyMap<>(map, new ConstantFactory<>(AbstractHashedMap.NULL));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
