package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedMapDiffblueTest {
  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then {@link HashMap#HashMap()} containsKey {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  public void testTransformedMap_given42_whenHashMap42IsNull_thenHashMapContainsKeyNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", AbstractHashedMap.NULL);
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map, keyTransformer,
        valueTransformer);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(Mockito.<Object>any());
    verify(valueTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertTrue(map.containsKey(null));
    assertEquals(actualTransformedMapResult.map, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@link LRUMap#LRUMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  public void testTransformedMap_givenLRUMap_whenTransformerApplyReturnLRUMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(new LRUMap<>());
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map, keyTransformer,
        valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertEquals(actualTransformedMapResult.map, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then {@link HashMap#HashMap()} containsKey {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  public void testTransformedMap_givenNull_whenHashMapNullIsNull_thenHashMapContainsKeyNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map, keyTransformer,
        valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertTrue(map.containsKey(null));
    assertEquals(actualTransformedMapResult.map, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link HashMap#HashMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedMap#transformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedMap TransformedMap.transformedMap(Map, Transformer, Transformer)"})
  public void testTransformedMap_whenHashMap_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    TransformedMap<Object, Object> actualTransformedMapResult = TransformedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertTrue(map.isEmpty());
    assertEquals(actualTransformedMapResult.map, actualTransformedMapResult);
  }

  /**
   * Test {@link TransformedMap#transformingMap(Map, Transformer, Transformer)}.
   * <p>
   * Method under test: {@link TransformedMap#transformingMap(Map, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedMap TransformedMap.transformingMap(Map, Transformer, Transformer)"})
  public void testTransformingMap() {
    // Arrange and Act
    TransformedMap<Object, Object> actualTransformingMapResult = TransformedMap.transformingMap(new HashMap<>(),
        mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(actualTransformingMapResult.map, actualTransformingMapResult);
  }

  /**
   * Test {@link TransformedMap#TransformedMap(Map, Transformer, Transformer)}.
   * <p>
   * Method under test: {@link TransformedMap#TransformedMap(Map, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedMap.<init>(Map, Transformer, Transformer)"})
  public void testNewTransformedMap() {
    // Arrange and Act
    TransformedMap<Object, Object> actualObjectObjectMap = new TransformedMap<>(new HashMap<>(),
        mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
