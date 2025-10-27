package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.map.MultiValueMap;
import org.junit.Test;

public class IndexedCollectionDiffblueTest {
  /**
   * Method under test:
   * {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  public void testNewIndexedCollection() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    ChainedTransformer<Object> keyTransformer = new ChainedTransformer<>(new ClosureTransformer<>(null));
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        true);

    // Assert
    assertTrue(actualIndexedCollection.isEmpty());
    assertTrue(map.isEmpty());
  }

  /**
   * Method under test:
   * {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  public void testNewIndexedCollection2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    ChainedTransformer<Object> keyTransformer = new ChainedTransformer<>(
        new ConstantTransformer<>("Constant To Return"));
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        true);

    // Assert
    assertEquals(1, map.size());
    Object getResult = map.get("Constant To Return");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("42", ((List<String>) getResult).get(0));
    assertEquals(1, actualIndexedCollection.size());
  }

  /**
   * Method under test:
   * {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  public void testNewIndexedCollection3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    ChainedTransformer<Object> keyTransformer = new ChainedTransformer<>(
        new ConstantTransformer<>("Constant To Return"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true));

  }

  /**
   * Method under test:
   * {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  public void testNewIndexedCollection4() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    ChainedTransformer<Object> keyTransformer = new ChainedTransformer<>(
        new ConstantTransformer<>("Constant To Return"));
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        false);

    // Assert
    assertEquals(1, map.size());
    Object getResult = map.get("Constant To Return");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("42", ((List<String>) getResult).get(0));
    assertEquals(1, actualIndexedCollection.size());
  }

  /**
   * Method under test:
   * {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  public void testNewIndexedCollection5() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    ChainedTransformer<Object> keyTransformer = new ChainedTransformer<>(
        new ConstantTransformer<>("Constant To Return"));
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        false);

    // Assert
    assertEquals(1, map.size());
    assertEquals(2, actualIndexedCollection.size());
    assertEquals(coll, map.get("Constant To Return"));
  }
}
