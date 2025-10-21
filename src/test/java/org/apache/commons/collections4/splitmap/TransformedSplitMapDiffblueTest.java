package org.apache.commons.collections4.splitmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.map.LRUMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedSplitMapDiffblueTest {
  /**
   * Test {@link TransformedSplitMap#checkSetValue(Object)}.
   * <p>
   * Method under test: {@link TransformedSplitMap#checkSetValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TransformedSplitMap.checkSetValue(Object)"})
  public void testCheckSetValue() {
    // Arrange
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .<Object, Object, Object, Object>transformingMap(new HashMap<>(), mock(Transformer.class), valueTransformer);

    // Act
    Object actualCheckSetValueResult = transformingMapResult.checkSetValue("Value");

    // Assert
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualCheckSetValueResult);
  }

  /**
   * Test {@link TransformedSplitMap#put(Object, Object)}.
   * <p>
   * Method under test: {@link TransformedSplitMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TransformedSplitMap.put(Object, Object)"})
  public void testPut() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .transformingMap(new HashMap<>(), keyTransformer, valueTransformer);

    // Act
    Object actualPutResult = transformingMapResult.put("Key", "Value");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    Map<Object, Object> objectObjectMap = transformingMapResult.map;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Apply", objectObjectMap.get("Apply"));
    assertNull(actualPutResult);
    assertEquals(1, transformingMapResult.size());
  }

  /**
   * Test {@link TransformedSplitMap#putAll(Map)}.
   * <p>
   * Method under test: {@link TransformedSplitMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSplitMap.putAll(Map)"})
  public void testPutAll() {
    // Arrange
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .<Object, Object, Object, Object>transformingMap(new HashMap<>(), mock(Transformer.class),
            mock(Transformer.class));

    // Act
    transformingMapResult.putAll(new HashMap<>());

    // Assert that nothing has changed
    assertEquals(0, transformingMapResult.size());
    assertTrue(transformingMapResult.map.isEmpty());
  }

  /**
   * Test {@link TransformedSplitMap#putAll(Map)}.
   * <p>
   * Method under test: {@link TransformedSplitMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSplitMap.putAll(Map)"})
  public void testPutAll2() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .transformingMap(new HashMap<>(), keyTransformer, valueTransformer);

    HashMap<Object, Object> mapToCopy = new HashMap<>();
    mapToCopy.put("42", "42");

    // Act
    transformingMapResult.putAll(mapToCopy);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    Map<Object, Object> objectObjectMap = transformingMapResult.map;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Apply", objectObjectMap.get("Apply"));
    assertEquals(1, transformingMapResult.size());
  }

  /**
   * Test {@link TransformedSplitMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link LRUMap#LRUMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSplitMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSplitMap.putAll(Map)"})
  public void testPutAll_givenTransformerApplyReturnLRUMap() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn(new LRUMap<>());
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .transformingMap(new HashMap<>(), keyTransformer, valueTransformer);

    HashMap<Object, Object> mapToCopy = new HashMap<>();
    mapToCopy.put("42", "42");

    // Act
    transformingMapResult.putAll(mapToCopy);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, transformingMapResult.map.size());
    assertEquals(1, transformingMapResult.size());
  }

  /**
   * Test {@link TransformedSplitMap#transformKey(Object)}.
   * <p>
   * Method under test: {@link TransformedSplitMap#transformKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TransformedSplitMap.transformKey(Object)"})
  public void testTransformKey() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .<Object, Object, Object, Object>transformingMap(new HashMap<>(), keyTransformer, mock(Transformer.class));

    // Act
    Object actualTransformKeyResult = transformingMapResult.transformKey("Object");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformKeyResult);
  }

  /**
   * Test {@link TransformedSplitMap#transformMap(Map)}.
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSplitMap#transformMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map TransformedSplitMap.transformMap(Map)"})
  public void testTransformMap_givenTransformerApplyReturnApply_thenReturnSizeIsOne() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .transformingMap(new HashMap<>(), keyTransformer, valueTransformer);

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    Map<Object, Object> actualTransformMapResult = transformingMapResult.transformMap(map);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(1, actualTransformMapResult.size());
    assertEquals("Apply", actualTransformMapResult.get("Apply"));
  }

  /**
   * Test {@link TransformedSplitMap#transformMap(Map)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSplitMap#transformMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map TransformedSplitMap.transformMap(Map)"})
  public void testTransformMap_whenHashMap_thenReturnEmpty() {
    // Arrange
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .<Object, Object, Object, Object>transformingMap(new HashMap<>(), mock(Transformer.class),
            mock(Transformer.class));

    // Act and Assert
    assertTrue(transformingMapResult.transformMap(new HashMap<>()).isEmpty());
  }

  /**
   * Test {@link TransformedSplitMap#transformValue(Object)}.
   * <p>
   * Method under test: {@link TransformedSplitMap#transformValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TransformedSplitMap.transformValue(Object)"})
  public void testTransformValue() {
    // Arrange
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    TransformedSplitMap<Object, Object, Object, Object> transformingMapResult = TransformedSplitMap
        .<Object, Object, Object, Object>transformingMap(new HashMap<>(), mock(Transformer.class), valueTransformer);

    // Act
    Object actualTransformValueResult = transformingMapResult.transformValue("Object");

    // Assert
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals("Apply", actualTransformValueResult);
  }
}
