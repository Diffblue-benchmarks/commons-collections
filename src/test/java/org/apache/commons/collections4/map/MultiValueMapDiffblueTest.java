package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MultiValueMapDiffblueTest {
  /**
   * Test {@link MultiValueMap#multiValueMap(Map)} with {@code map}.
   * <p>
   * Method under test: {@link MultiValueMap#multiValueMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiValueMap MultiValueMap.multiValueMap(Map)"})
  public void testMultiValueMapWithMap() {
    // Arrange and Act
    MultiValueMap<Object, Object> actualMultiValueMapResult = MultiValueMap.multiValueMap(new HashMap<>());

    // Assert
    assertTrue(actualMultiValueMapResult.isEmpty());
  }

  /**
   * Test {@link MultiValueMap#multiValueMap(Map, Class)} with {@code map}, {@code collectionClass}.
   * <p>
   * Method under test: {@link MultiValueMap#multiValueMap(Map, Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiValueMap MultiValueMap.multiValueMap(Map, Class)"})
  public void testMultiValueMapWithMapCollectionClass() {
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
   * Test {@link MultiValueMap#multiValueMap(Map, Factory)} with {@code map}, {@code collectionFactory}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#multiValueMap(Map, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiValueMap MultiValueMap.multiValueMap(Map, Factory)"})
  public void testMultiValueMapWithMapCollectionFactory_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> MultiValueMap.multiValueMap(new HashMap<>(), (Factory<Collection<Object>>) null));
  }

  /**
   * Test {@link MultiValueMap#multiValueMap(Map, Factory)} with {@code map}, {@code collectionFactory}.
   * <ul>
   *   <li>When {@link Factory}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#multiValueMap(Map, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiValueMap MultiValueMap.multiValueMap(Map, Factory)"})
  public void testMultiValueMapWithMapCollectionFactory_whenFactory_thenReturnEmpty() {
    // Arrange and Act
    MultiValueMap<Object, Object> actualMultiValueMapResult = MultiValueMap.multiValueMap(new HashMap<>(),
        mock(Factory.class));

    // Assert
    assertTrue(actualMultiValueMapResult.isEmpty());
  }

  /**
   * Test {@link MultiValueMap#MultiValueMap()}.
   * <p>
   * Method under test: {@link MultiValueMap#MultiValueMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MultiValueMap.<init>()"})
  public void testNewMultiValueMap() {
    // Arrange and Act
    MultiValueMap<Object, Object> actualObjectObjectMap = new MultiValueMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiValueMap#MultiValueMap(Map, Factory)}.
   * <ul>
   *   <li>When {@link Factory}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#MultiValueMap(Map, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MultiValueMap.<init>(Map, Factory)"})
  public void testNewMultiValueMap_whenFactory_thenReturnEmpty() {
    // Arrange and Act
    MultiValueMap<Object, Object> actualObjectObjectMap = new MultiValueMap<>(new HashMap<>(), mock(Factory.class));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiValueMap#MultiValueMap(Map, Factory)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#MultiValueMap(Map, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MultiValueMap.<init>(Map, Factory)"})
  public void testNewMultiValueMap_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new MultiValueMap<>(new HashMap<>(), null));

  }

  /**
   * Test {@link MultiValueMap#containsValue(Object, Object)} with {@code key}, {@code value}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#containsValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MultiValueMap.containsValue(Object, Object)"})
  public void testContainsValueWithKeyValue_givenMultiValueMapNullIsNull_thenReturnTrue() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#containsValue(Object, Object)} with {@code key}, {@code value}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#containsValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MultiValueMap.containsValue(Object, Object)"})
  public void testContainsValueWithKeyValue_givenMultiValueMap_thenReturnFalse() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#containsValue(Object)} with {@code value}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()} {@link AbstractHashedMap#NULL} is forty-two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MultiValueMap.containsValue(Object)"})
  public void testContainsValueWithValue_givenMultiValueMapNullIsFortyTwo_thenReturnFalse() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#containsValue(Object)} with {@code value}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MultiValueMap.containsValue(Object)"})
  public void testContainsValueWithValue_givenMultiValueMapNullIsNull_thenReturnTrue() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#containsValue(Object)} with {@code value}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MultiValueMap.containsValue(Object)"})
  public void testContainsValueWithValue_givenMultiValueMap_thenReturnFalse() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#createCollection(int)}.
   * <p>
   * Method under test: {@link MultiValueMap#createCollection(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection MultiValueMap.createCollection(int)"})
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
   * Test {@link MultiValueMap#entrySet()}.
   * <p>
   * Method under test: {@link MultiValueMap#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set MultiValueMap.entrySet()"})
  public void testEntrySet() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link MultiValueMap#getCollection(Object)}.
   * <p>
   * Method under test: {@link MultiValueMap#getCollection(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection MultiValueMap.getCollection(Object)"})
  public void testGetCollection() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getCollection(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#iterator()}.
   * <p>
   * Method under test: {@link MultiValueMap#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator MultiValueMap.iterator()"})
  public void testIterator() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.iterator().hasNext());
  }

  /**
   * Test {@link MultiValueMap#iterator(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#iterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator MultiValueMap.iterator(Object)"})
  public void testIteratorWithObject_givenMultiValueMapNullIsNull_thenReturnNotHasNext() {
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
   * Test {@link MultiValueMap#size(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int MultiValueMap.size(Object)"})
  public void testSizeWithObject_givenMultiValueMapNullIsNull_thenReturnOne() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.size(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#size(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int MultiValueMap.size(Object)"})
  public void testSizeWithObject_givenMultiValueMap_thenReturnZero() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiValueMap#totalSize()}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#totalSize()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int MultiValueMap.totalSize()"})
  public void testTotalSize_givenMultiValueMapNullIsNull_thenReturnOne() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.totalSize());
  }

  /**
   * Test {@link MultiValueMap#totalSize()}.
   * <ul>
   *   <li>Given {@link MultiValueMap#MultiValueMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiValueMap#totalSize()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int MultiValueMap.totalSize()"})
  public void testTotalSize_givenMultiValueMap_thenReturnZero() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.totalSize());
  }

  /**
   * Test {@link MultiValueMap#values()}.
   * <p>
   * Method under test: {@link MultiValueMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection MultiValueMap.values()"})
  public void testValues() {
    // Arrange
    MultiValueMap<Object, Object> objectObjectMap = new MultiValueMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
