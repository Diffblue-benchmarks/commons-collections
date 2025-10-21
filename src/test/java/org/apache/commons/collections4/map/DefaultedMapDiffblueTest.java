package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DefaultedMapDiffblueTest {
  /**
   * Test {@link DefaultedMap#defaultedMap(Map, Object)} with {@code map}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#defaultedMap(Map, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"DefaultedMap DefaultedMap.defaultedMap(Map, Object)"})
  public void testDefaultedMapWithMapDefaultValue_whenNull() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualDefaultedMapResult = DefaultedMap.defaultedMap(new HashMap<>(),
        AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualDefaultedMapResult.map, actualDefaultedMapResult);
  }

  /**
   * Test {@link DefaultedMap#defaultedMap(Map, Object)} with {@code map}, {@code defaultValue}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#defaultedMap(Map, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"DefaultedMap DefaultedMap.defaultedMap(Map, Object)"})
  public void testDefaultedMapWithMapDefaultValue_whenNull2() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualDefaultedMapResult = DefaultedMap.defaultedMap(new HashMap<>(), (Object) null);

    // Assert
    assertEquals(actualDefaultedMapResult.map, actualDefaultedMapResult);
  }

  /**
   * Test {@link DefaultedMap#DefaultedMap(Object)}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#DefaultedMap(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultedMap.<init>(Object)"})
  public void testNewDefaultedMap_whenNull() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualObjectObjectMap = new DefaultedMap<>(AbstractHashedMap.NULL);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DefaultedMap#DefaultedMap(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#DefaultedMap(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultedMap.<init>(Object)"})
  public void testNewDefaultedMap_whenNull2() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualObjectObjectMap = new DefaultedMap<>((Object) null);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DefaultedMap#DefaultedMap(Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#DefaultedMap(Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultedMap.<init>(Transformer)"})
  public void testNewDefaultedMap_whenTransformer_thenReturnEmpty() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualObjectObjectMap = new DefaultedMap<>(mock(Transformer.class));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link DefaultedMap#DefaultedMap(Map, Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#DefaultedMap(Map, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DefaultedMap.<init>(Map, Transformer)"})
  public void testNewDefaultedMap_whenTransformer_thenReturnMap() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualObjectObjectMap = new DefaultedMap<>(new HashMap<>(), mock(Transformer.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
