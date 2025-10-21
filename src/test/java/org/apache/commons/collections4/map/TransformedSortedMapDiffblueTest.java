package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedSortedMapDiffblueTest {
  /**
   * Test {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer, Transformer)}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.</li>
   *   <li>When {@link TreeMap#TreeMap()} All is {@link HashMap#HashMap()}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedSortedMap TransformedSortedMap.transformedSortedMap(SortedMap, Transformer, Transformer)"})
  public void testTransformedSortedMap_givenHashMap_whenTreeMapAllIsHashMap_thenCallsApply() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();
    map.putAll(new HashMap<>());
    map.put("42", AbstractHashedMap.NULL);
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("42");
    Transformer<Object, Object> valueTransformer = mock(Transformer.class);
    when(valueTransformer.apply(Mockito.<Object>any())).thenReturn(AbstractHashedMap.NULL);

    // Act
    TransformedSortedMap<Object, Object> actualTransformedSortedMapResult = TransformedSortedMap
        .transformedSortedMap(map, keyTransformer, valueTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    verify(valueTransformer).apply(isA(Object.class));
    assertEquals(actualTransformedSortedMapResult.map, actualTransformedSortedMapResult);
  }

  /**
   * Test {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer, Transformer)}.
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedSortedMap#transformedSortedMap(SortedMap, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedSortedMap TransformedSortedMap.transformedSortedMap(SortedMap, Transformer, Transformer)"})
  public void testTransformedSortedMap_whenTreeMap_thenReturnMap() {
    // Arrange and Act
    TransformedSortedMap<Object, Object> actualTransformedSortedMapResult = TransformedSortedMap
        .transformedSortedMap(new TreeMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(actualTransformedSortedMapResult.map, actualTransformedSortedMapResult);
  }

  /**
   * Test {@link TransformedSortedMap#transformingSortedMap(SortedMap, Transformer, Transformer)}.
   * <p>
   * Method under test: {@link TransformedSortedMap#transformingSortedMap(SortedMap, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "TransformedSortedMap TransformedSortedMap.transformingSortedMap(SortedMap, Transformer, Transformer)"})
  public void testTransformingSortedMap() {
    // Arrange and Act
    TransformedSortedMap<Object, Object> actualTransformingSortedMapResult = TransformedSortedMap
        .transformingSortedMap(new TreeMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(actualTransformingSortedMapResult.map, actualTransformingSortedMapResult);
  }

  /**
   * Test {@link TransformedSortedMap#TransformedSortedMap(SortedMap, Transformer, Transformer)}.
   * <p>
   * Method under test: {@link TransformedSortedMap#TransformedSortedMap(SortedMap, Transformer, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedSortedMap.<init>(SortedMap, Transformer, Transformer)"})
  public void testNewTransformedSortedMap() {
    // Arrange and Act
    TransformedSortedMap<Object, Object> actualObjectObjectMap = new TransformedSortedMap<>(new TreeMap<>(),
        mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }
}
