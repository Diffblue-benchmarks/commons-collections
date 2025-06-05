package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultedMapDiffblueTest {
  /**
   * Test {@link DefaultedMap#defaultedMap(Map, Object)} with {@code map}, {@code defaultValue}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultedMap#defaultedMap(Map, Object)}
   */
  @Test
  @DisplayName("Test defaultedMap(Map, Object) with 'map', 'defaultValue'; when NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"DefaultedMap DefaultedMap.defaultedMap(Map, Object)"})
  void testDefaultedMapWithMapDefaultValue_whenNull() {
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
  @DisplayName("Test defaultedMap(Map, Object) with 'map', 'defaultValue'; when 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"DefaultedMap DefaultedMap.defaultedMap(Map, Object)"})
  void testDefaultedMapWithMapDefaultValue_whenNull2() {
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
  @DisplayName("Test new DefaultedMap(Object); when NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DefaultedMap.<init>(Object)"})
  void testNewDefaultedMap_whenNull() {
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
  @DisplayName("Test new DefaultedMap(Object); when 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DefaultedMap.<init>(Object)"})
  void testNewDefaultedMap_whenNull2() {
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
  @DisplayName("Test new DefaultedMap(Transformer); when Transformer; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DefaultedMap.<init>(Transformer)"})
  void testNewDefaultedMap_whenTransformer_thenReturnEmpty() {
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
  @DisplayName("Test new DefaultedMap(Map, Transformer); when Transformer; then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DefaultedMap.<init>(Map, Transformer)"})
  void testNewDefaultedMap_whenTransformer_thenReturnMap() {
    // Arrange and Act
    DefaultedMap<Object, Object> actualObjectObjectMap = new DefaultedMap<>(new HashMap<>(), mock(Transformer.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
