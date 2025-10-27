package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.junit.Test;

public class AbstractMultiValuedMapDecoratorDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractMultiValuedMapDecorator#containsMapping(Object, Object)}
   */
  @Test
  public void testContainsMapping() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertFalse(transformedMapResult.containsMapping("Key", "Value"));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#decorated()}
   */
  @Test
  public void testDecorated() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertSame(map, transformedMapResult.decorated());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ArrayListValuedHashMap<Object, Object> map2 = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 = TransformedMultiValuedMap.transformedMap(map2,
        keyTransformer2, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult2);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map, keyTransformer,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map2,
        keyTransformer2, new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ArrayListValuedHashMap<Object, Object> map3 = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer3 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 = TransformedMultiValuedMap.transformedMap(map3,
        keyTransformer3, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult2);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ArrayListValuedHashMap<Object, Object> map2 = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> map3 = TransformedMultiValuedMap.transformedMap(map2, keyTransformer2,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));
    ChainedTransformer<? super Object> keyTransformer3 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 = TransformedMultiValuedMap.transformedMap(map3,
        keyTransformer3, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult2);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual4() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));
    UnmodifiableMultiValuedMap<Object, Object> map2 = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    ChainedTransformer<? super Object> keyTransformer2 = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult2 = TransformedMultiValuedMap.transformedMap(map2,
        keyTransformer2, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult2);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual5() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));
    UnmodifiableMultiValuedMap<Object, Object> unmodifiableMultiValuedMapResult = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act and Assert
    assertEquals(transformedMapResult, unmodifiableMultiValuedMapResult);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, unmodifiableMultiValuedMapResult.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMapDecorator#equals(Object)}
   *   <li>{@link AbstractMultiValuedMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertEquals(transformedMapResult, transformedMapResult);
    int expectedHashCodeResult = transformedMapResult.hashCode();
    assertEquals(expectedHashCodeResult, transformedMapResult.hashCode());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#keys()}
   */
  @Test
  public void testKeys() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertTrue(transformedMapResult.keys().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#keys()}
   */
  @Test
  public void testKeys2() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertTrue(transformedMapResult.keys().isEmpty());
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertNotEquals(transformedMapResult, 1);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertNotEquals(transformedMapResult, null);
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Act and Assert
    assertNotEquals(transformedMapResult, "Different type to AbstractMultiValuedMapDecorator");
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMapDecorator#putAll(Object, Iterable)}
   */
  @Test
  public void testPutAll() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertFalse(transformedMapResult.putAll("Key", new ArrayList<>()));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#putAll(Map)}
   */
  @Test
  public void testPutAll2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertFalse(transformedMapResult.putAll(new HashMap<>()));
  }

  /**
   * Method under test: {@link AbstractMultiValuedMapDecorator#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act
    Collection<Object> actualRemoveResult = transformedMapResult.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertTrue(actualRemoveResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractMultiValuedMapDecorator#removeMapping(Object, Object)}
   */
  @Test
  public void testRemoveMapping() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    ChainedTransformer<? super Object> keyTransformer = new ChainedTransformer<>(null);
    TransformedMultiValuedMap<Object, Object> transformedMapResult = TransformedMultiValuedMap.transformedMap(map,
        keyTransformer, new ChainedTransformer<>(null));

    // Act and Assert
    assertFalse(transformedMapResult.removeMapping("Key", "Item"));
  }
}
