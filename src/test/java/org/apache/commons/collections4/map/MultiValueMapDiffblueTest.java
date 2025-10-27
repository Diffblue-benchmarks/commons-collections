package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class MultiValueMapDiffblueTest {
  /**
   * Method under test: {@link MultiValueMap#multiValueMap(Map)}
   */
  @Test
  public void testMultiValueMap() {
    // Arrange and Act
    MultiValueMap<Object, Object> actualMultiValueMapResult = MultiValueMap.multiValueMap(new HashMap<>());

    // Assert
    assertTrue(actualMultiValueMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#multiValueMap(Map, Class)}
   */
  @Test
  public void testMultiValueMap2() {
    // Arrange
    HashMap<Object, Collection<Object>> map = new HashMap<>();
    Class<Collection> forNameResult = Collection.class;

    // Act
    MultiValueMap<Object, Object> actualMultiValueMapResult = MultiValueMap.multiValueMap(map,
        (Class<Collection<Object>>) (Class) forNameResult);

    // Assert
    assertTrue(actualMultiValueMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#multiValueMap(Map, Factory)}
   */
  @Test
  public void testMultiValueMap3() {
    // Arrange
    HashMap<Object, Collection<Object>> map = new HashMap<>();

    // Act
    MultiValueMap<Object, Object> actualMultiValueMapResult = MultiValueMap.multiValueMap(map,
        new ConstantFactory<>(new ArrayList<>()));

    // Assert
    assertTrue(actualMultiValueMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#multiValueMap(Map, Factory)}
   */
  @Test
  public void testMultiValueMap4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> MultiValueMap.multiValueMap(new HashMap<>(), (Factory<Collection<Object>>) null));
  }

  /**
   * Method under test: {@link MultiValueMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue3() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#containsValue(Object, Object)}
   */
  @Test
  public void testContainsValue4() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#containsValue(Object, Object)}
   */
  @Test
  public void testContainsValue5() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#createCollection(int)}
   */
  @Test
  public void testCreateCollection() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act
    Collection<Object> actualCreateCollectionResult = objectObjectMap.createCollection(3);

    // Assert
    assertTrue(actualCreateCollectionResult instanceof List);
    assertTrue(actualCreateCollectionResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#getCollection(Object)}
   */
  @Test
  public void testGetCollection() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getCollection(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.iterator().hasNext());
  }

  /**
   * Method under test: {@link MultiValueMap#iterator(Object)}
   */
  @Test
  public void testIterator2() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Iterator<Object> actualIteratorResult = objectObjectMap.iterator(object);

    // Assert
    Object actualNextResult = actualIteratorResult.next();
    assertFalse(actualIteratorResult.hasNext());
    assertSame(object, actualNextResult);
  }

  /**
   * Method under test: {@link MultiValueMap#size(Object)}
   */
  @Test
  public void testSize() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#size(Object)}
   */
  @Test
  public void testSize2() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.size(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link MultiValueMap#totalSize()}
   */
  @Test
  public void testTotalSize() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.totalSize());
  }

  /**
   * Method under test: {@link MultiValueMap#totalSize()}
   */
  @Test
  public void testTotalSize2() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.totalSize());
  }

  /**
   * Method under test: {@link MultiValueMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#MultiValueMap()}
   */
  @Test
  public void testNewMultiValueMap() {
    // Arrange and Act
    MultiValueMap<Object, Object> actualObjectObjectMap = new MultiValueMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#MultiValueMap(Map, Factory)}
   */
  @Test
  public void testNewMultiValueMap2() {
    // Arrange
    HashMap<Object, Collection<Object>> map = new HashMap<>();

    // Act
    MultiValueMap<Object, Object> actualObjectObjectMap = new MultiValueMap<>(map,
        new ConstantFactory<>(new ArrayList<>()));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link MultiValueMap#MultiValueMap(Map, Factory)}
   */
  @Test
  public void testNewMultiValueMap3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new MultiValueMap<>(new HashMap<>(), null));

  }
}
