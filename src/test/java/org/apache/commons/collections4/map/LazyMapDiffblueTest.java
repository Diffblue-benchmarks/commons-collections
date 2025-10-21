package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LazyMapDiffblueTest {
  /**
   * Test {@link LazyMap#lazyMap(Map, Factory)} with {@code Map}, {@code Factory}.
   * <ul>
   *   <li>When {@link Factory}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyMap#lazyMap(Map, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyMap LazyMap.lazyMap(Map, Factory)"})
  public void testLazyMapWithMapFactory_whenFactory_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualLazyMapResult = LazyMap.lazyMap(new HashMap<>(), mock(Factory.class));

    // Assert
    assertEquals(actualLazyMapResult.map, actualLazyMapResult);
  }

  /**
   * Test {@link LazyMap#lazyMap(Map, Transformer)} with {@code Map}, {@code Transformer}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyMap#lazyMap(Map, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyMap LazyMap.lazyMap(Map, Transformer)"})
  public void testLazyMapWithMapTransformer_whenTransformer_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualLazyMapResult = LazyMap.lazyMap(new HashMap<>(), mock(Transformer.class));

    // Assert
    assertEquals(actualLazyMapResult.map, actualLazyMapResult);
  }

  /**
   * Test {@link LazyMap#LazyMap(Map, Factory)}.
   * <ul>
   *   <li>When {@link Factory}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyMap#LazyMap(Map, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyMap.<init>(Map, Factory)"})
  public void testNewLazyMap_whenFactory_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualObjectObjectMap = new LazyMap<>(new HashMap<>(), mock(Factory.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link LazyMap#LazyMap(Map, Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyMap#LazyMap(Map, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyMap.<init>(Map, Transformer)"})
  public void testNewLazyMap_whenTransformer_thenReturnMap() {
    // Arrange and Act
    LazyMap<Object, Object> actualObjectObjectMap = new LazyMap<>(new HashMap<>(), mock(Transformer.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
