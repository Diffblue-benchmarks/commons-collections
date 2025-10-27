package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.junit.Test;

public class MultiMapUtilsDiffblueTest {
  /**
   * Method under test: {@link MultiMapUtils#emptyMultiValuedMap()}
   */
  @Test
  public void testEmptyMultiValuedMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualEmptyMultiValuedMapResult = MultiMapUtils.emptyMultiValuedMap();

    // Assert
    assertTrue(actualEmptyMultiValuedMapResult instanceof UnmodifiableMultiValuedMap);
    assertEquals(0, actualEmptyMultiValuedMapResult.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag() {
    // Arrange and Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsBag.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag2() {
    // Arrange and Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(null, "Key");

    // Assert
    assertNull(actualValuesAsBag);
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag3() {
    // Arrange and Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsBag.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag4() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag5() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag6() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");
    map.put("Key", "Value");

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(2, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag7() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", new HashBag<>());

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag8() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, new HashBag<>());

    // Assert
    assertTrue(actualValuesAsBag.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag9() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", hashBag);

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag10() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", hashBag);

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag11() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", hashBag);

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsBag12() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", 1);
    map.put("Key", hashBag);

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(2, actualValuesAsBag.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList() {
    // Arrange and Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList2() {
    // Arrange and Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(null, "Key");

    // Assert
    assertNull(actualValuesAsList);
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList3() {
    // Arrange and Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList4() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map2, "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList5() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map, "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList6() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map2, "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList7() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new HashSetValuedHashMap<>());

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map, "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList8() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map, unmodifiableMultiValuedMapResult);

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsList9() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new HashSetValuedHashMap<>());

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map, unmodifiableMultiValuedMapResult);

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet() {
    // Arrange and Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet2() {
    // Arrange and Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(null, "Key");

    // Assert
    assertNull(actualValuesAsSet);
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet3() {
    // Arrange and Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet4() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map2, "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet5() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map, "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet6() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map2, "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet7() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new HashSetValuedHashMap<>());

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map, "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet8() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map, unmodifiableMultiValuedMapResult);

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet9() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");
    UnmodifiableMultiValuedMap<Object, Object> map2 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map2, "Key");

    // Assert
    assertEquals(1, actualValuesAsSet.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  public void testGetValuesAsSet10() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new HashSetValuedHashMap<>());

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map, unmodifiableMultiValuedMapResult);

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Method under test: {@link MultiMapUtils#newListValuedHashMap()}
   */
  @Test
  public void testNewListValuedHashMap() {
    // Arrange and Act
    ListValuedMap<Object, Object> actualNewListValuedHashMapResult = MultiMapUtils.newListValuedHashMap();

    // Assert
    assertTrue(actualNewListValuedHashMapResult instanceof ArrayListValuedHashMap);
    assertEquals(0, actualNewListValuedHashMapResult.size());
    assertTrue(actualNewListValuedHashMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiMapUtils#newSetValuedHashMap()}
   */
  @Test
  public void testNewSetValuedHashMap() {
    // Arrange and Act
    SetValuedMap<Object, Object> actualNewSetValuedHashMapResult = MultiMapUtils.newSetValuedHashMap();

    // Assert
    assertTrue(actualNewSetValuedHashMapResult instanceof HashSetValuedHashMap);
    assertEquals(0, actualNewSetValuedHashMapResult.size());
    assertTrue(actualNewSetValuedHashMapResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  public void testUnmodifiableMultiValuedMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = MultiMapUtils
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Assert
    assertTrue(actualUnmodifiableMultiValuedMapResult instanceof UnmodifiableMultiValuedMap);
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }

  /**
   * Method under test:
   * {@link MultiMapUtils#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  public void testUnmodifiableMultiValuedMap2() {
    // Arrange
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    MultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = MultiMapUtils
        .unmodifiableMultiValuedMap(map);

    // Assert
    assertTrue(actualUnmodifiableMultiValuedMapResult instanceof UnmodifiableMultiValuedMap);
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }
}
