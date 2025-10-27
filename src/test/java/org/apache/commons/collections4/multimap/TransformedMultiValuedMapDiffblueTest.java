package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.junit.Test;

public class TransformedMultiValuedMapDiffblueTest {
  /**
   * Method under test:
   * {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Method under test:
   * {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap2() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Method under test:
   * {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult = TransformedMultiValuedMap
        .transformedMap(map2, keyTransformer2, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertEquals(0, map2.size());
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Method under test:
   * {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap4() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult = TransformedMultiValuedMap
        .transformedMap(map2, keyTransformer2, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertEquals(0, map2.size());
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Method under test:
   * {@link TransformedMultiValuedMap#transformedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  public void testTransformedMap5() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map3 = TransformedMultiValuedMap.transformedMap(map2, keyTransformer2,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ChainedTransformer<? super Object> keyTransformer3 = new ChainedTransformer<>(new ClosureTransformer<>(null));

    // Act
    TransformedMultiValuedMap<Object, Object> actualTransformedMapResult = TransformedMultiValuedMap
        .transformedMap(map3, keyTransformer3, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertEquals(0, map3.size());
    assertEquals(0, actualTransformedMapResult.size());
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", new ArrayList<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>());

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", values);

    // Assert
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll3() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>());

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", values);

    // Assert
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll4() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "42");
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>());

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll("Key", values);

    // Assert
    assertEquals(1, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll5() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(new HashMap<>());

    // Assert
    assertEquals(0, transformedMapResult.size());
    assertFalse(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll6() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>());

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put("42", "42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map2);

    // Assert
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll7() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        new ChainedTransformer<>(), null);

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put("42", "42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map2);

    // Assert
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(Map)}
   */
  @Test
  public void testPutAll8() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>();
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>());

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put("42", "42");

    // Act
    boolean actualPutAllResult = transformedMapResult.putAll(map2);

    // Assert
    assertEquals(1, transformedMapResult.size());
    assertTrue(actualPutAllResult);
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  public void testPutAll9() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertFalse(transformedMapResult.putAll(new ArrayListValuedHashMap<>()));
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  public void testPutAll10() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertFalse(transformedMapResult.putAll(new HashSetValuedHashMap<>()));
  }

  /**
   * Method under test: {@link TransformedMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  public void testPutAll11() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));
    UnmodifiableMultiValuedMap<?, ?> map2 = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertFalse(transformedMapResult.putAll(map2));
  }
}
