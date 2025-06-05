package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MultiMapUtilsDiffblueTest {
  /**
   * Test {@link MultiMapUtils#emptyIfNull(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@link ArrayListValuedHashMap}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#emptyIfNull(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test emptyIfNull(MultiValuedMap); when ArrayListValuedHashMap(); then return ArrayListValuedHashMap")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MultiValuedMap MultiMapUtils.emptyIfNull(MultiValuedMap)"})
  void testEmptyIfNull_whenArrayListValuedHashMap_thenReturnArrayListValuedHashMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualEmptyIfNullResult = MultiMapUtils.emptyIfNull(new ArrayListValuedHashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof ArrayListValuedHashMap);
    assertEquals(0, actualEmptyIfNullResult.size());
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#emptyIfNull(MultiValuedMap)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link UnmodifiableMultiValuedMap}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#emptyIfNull(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test emptyIfNull(MultiValuedMap); when 'null'; then return UnmodifiableMultiValuedMap")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MultiValuedMap MultiMapUtils.emptyIfNull(MultiValuedMap)"})
  void testEmptyIfNull_whenNull_thenReturnUnmodifiableMultiValuedMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualEmptyIfNullResult = MultiMapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof UnmodifiableMultiValuedMap);
    assertEquals(0, actualEmptyIfNullResult.size());
  }

  /**
   * Test {@link MultiMapUtils#emptyMultiValuedMap()}.
   * <p>
   * Method under test: {@link MultiMapUtils#emptyMultiValuedMap()}
   */
  @Test
  @DisplayName("Test emptyMultiValuedMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MultiValuedMap MultiMapUtils.emptyMultiValuedMap()"})
  void testEmptyMultiValuedMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualEmptyMultiValuedMapResult = MultiMapUtils.emptyMultiValuedMap();

    // Assert
    assertTrue(actualEmptyMultiValuedMapResult instanceof UnmodifiableMultiValuedMap);
    assertEquals(0, actualEmptyMultiValuedMapResult.size());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(map, "Key");

    // Assert
    assertTrue(actualCollection instanceof List);
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new HashSetValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(map, "Key");

    // Assert
    assertTrue(actualCollection instanceof Set);
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection3() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<Object, Object> map2 = TransformedMultiValuedMap.transformedMap(map,
        mock(Transformer.class), mock(Transformer.class));

    // Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(map2, "Key");

    // Assert
    assertTrue(actualCollection instanceof List);
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object); when ArrayListValuedHashMap(); then return List")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection_whenArrayListValuedHashMap_thenReturnList() {
    // Arrange and Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualCollection instanceof List);
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return {@link Set}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object); when HashSetValuedHashMap(); then return Set")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection_whenHashSetValuedHashMap_thenReturnSet() {
    // Arrange and Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualCollection instanceof Set);
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection_whenNull_thenReturnNull() {
    // Arrange and Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(null, "Key");

    // Assert
    assertNull(actualCollection);
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When unmodifiableMultiValuedMap {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object); when unmodifiableMultiValuedMap ArrayListValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection_whenUnmodifiableMultiValuedMapArrayListValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(map, "Key");

    // Assert
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When unmodifiableMultiValuedMap {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getCollection(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getCollection(MultiValuedMap, Object); when unmodifiableMultiValuedMap HashSetValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection MultiMapUtils.getCollection(MultiValuedMap, Object)"})
  void testGetCollection_whenUnmodifiableMultiValuedMapHashSetValuedHashMap() {
    // Arrange
    UnmodifiableMultiValuedMap<Object, Object> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new HashSetValuedHashMap<>());

    // Act
    Collection<Object> actualCollection = MultiMapUtils.getCollection(map, "Key");

    // Assert
    assertTrue(actualCollection.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsBag(MultiValuedMap, Object); when ArrayListValuedHashMap() 'Key' is 'Value'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Bag MultiMapUtils.getValuesAsBag(MultiValuedMap, Object)"})
  void testGetValuesAsBag_whenArrayListValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> map = new ArrayListValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsBag(MultiValuedMap, Object); when ArrayListValuedHashMap() 'Key' is 'Value'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Bag MultiMapUtils.getValuesAsBag(MultiValuedMap, Object)"})
  void testGetValuesAsBag_whenArrayListValuedHashMapKeyIsValue_thenReturnSizeIsTwo() {
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
   * Test {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsBag(MultiValuedMap, Object); when ArrayListValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Bag MultiMapUtils.getValuesAsBag(MultiValuedMap, Object)"})
  void testGetValuesAsBag_whenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange and Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsBag.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsBag(MultiValuedMap, Object); when HashSetValuedHashMap() 'Key' is 'Value'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Bag MultiMapUtils.getValuesAsBag(MultiValuedMap, Object)"})
  void testGetValuesAsBag_whenHashSetValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    HashSetValuedHashMap<Object, Object> map = new HashSetValuedHashMap<>();
    map.put("Key", "Value");

    // Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(map, "Key");

    // Assert
    assertEquals(1, actualValuesAsBag.size());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsBag(MultiValuedMap, Object); when HashSetValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Bag MultiMapUtils.getValuesAsBag(MultiValuedMap, Object)"})
  void testGetValuesAsBag_whenHashSetValuedHashMap_thenReturnEmpty() {
    // Arrange and Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsBag.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsBag(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsBag(MultiValuedMap, Object); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Bag MultiMapUtils.getValuesAsBag(MultiValuedMap, Object)"})
  void testGetValuesAsBag_whenNull_thenReturnNull() {
    // Arrange and Act
    Bag<Object> actualValuesAsBag = MultiMapUtils.getValuesAsBag(null, "Key");

    // Assert
    assertNull(actualValuesAsBag);
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsList(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MultiMapUtils.getValuesAsList(MultiValuedMap, Object)"})
  void testGetValuesAsList() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map, "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsList(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MultiMapUtils.getValuesAsList(MultiValuedMap, Object)"})
  void testGetValuesAsList2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new HashSetValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(map, "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsList(MultiValuedMap, Object); when ArrayListValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MultiMapUtils.getValuesAsList(MultiValuedMap, Object)"})
  void testGetValuesAsList_whenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsList(MultiValuedMap, Object); when HashSetValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MultiMapUtils.getValuesAsList(MultiValuedMap, Object)"})
  void testGetValuesAsList_whenHashSetValuedHashMap_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsList.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsList(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsList(MultiValuedMap, Object); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List MultiMapUtils.getValuesAsList(MultiValuedMap, Object)"})
  void testGetValuesAsList_whenNull_thenReturnNull() {
    // Arrange and Act
    List<Object> actualValuesAsList = MultiMapUtils.getValuesAsList(null, "Key");

    // Assert
    assertNull(actualValuesAsList);
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsSet(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set MultiMapUtils.getValuesAsSet(MultiValuedMap, Object)"})
  void testGetValuesAsSet() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map, "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsSet(MultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set MultiMapUtils.getValuesAsSet(MultiValuedMap, Object)"})
  void testGetValuesAsSet2() {
    // Arrange
    TransformedMultiValuedMap<Object, Object> map = TransformedMultiValuedMap
        .transformedMap(new HashSetValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(map, "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsSet(MultiValuedMap, Object); when ArrayListValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set MultiMapUtils.getValuesAsSet(MultiValuedMap, Object)"})
  void testGetValuesAsSet_whenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(new ArrayListValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsSet(MultiValuedMap, Object); when HashSetValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set MultiMapUtils.getValuesAsSet(MultiValuedMap, Object)"})
  void testGetValuesAsSet_whenHashSetValuedHashMap_thenReturnEmpty() {
    // Arrange and Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(new HashSetValuedHashMap<>(), "Key");

    // Assert
    assertTrue(actualValuesAsSet.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#getValuesAsSet(MultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test getValuesAsSet(MultiValuedMap, Object); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Set MultiMapUtils.getValuesAsSet(MultiValuedMap, Object)"})
  void testGetValuesAsSet_whenNull_thenReturnNull() {
    // Arrange and Act
    Set<Object> actualValuesAsSet = MultiMapUtils.getValuesAsSet(null, "Key");

    // Assert
    assertNull(actualValuesAsSet);
  }

  /**
   * Test {@link MultiMapUtils#isEmpty(MultiValuedMap)}.
   * <p>
   * Method under test: {@link MultiMapUtils#isEmpty(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test isEmpty(MultiValuedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiMapUtils.isEmpty(MultiValuedMap)"})
  void testIsEmpty() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(MultiMapUtils.isEmpty(map));
  }

  /**
   * Test {@link MultiMapUtils#isEmpty(MultiValuedMap)}.
   * <p>
   * Method under test: {@link MultiMapUtils#isEmpty(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test isEmpty(MultiValuedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiMapUtils.isEmpty(MultiValuedMap)"})
  void testIsEmpty2() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new HashSetValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));

    // Act and Assert
    assertTrue(MultiMapUtils.isEmpty(map));
  }

  /**
   * Test {@link MultiMapUtils#isEmpty(MultiValuedMap)}.
   * <p>
   * Method under test: {@link MultiMapUtils#isEmpty(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test isEmpty(MultiValuedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiMapUtils.isEmpty(MultiValuedMap)"})
  void testIsEmpty3() {
    // Arrange
    TransformedMultiValuedMap<?, ?> map = TransformedMultiValuedMap.transformedMap(new ArrayListValuedHashMap<>(),
        mock(Transformer.class), mock(Transformer.class));
    TransformedMultiValuedMap<?, ?> map2 = TransformedMultiValuedMap.transformedMap(map, mock(Transformer.class),
        mock(Transformer.class));

    // Act and Assert
    assertTrue(MultiMapUtils.isEmpty(map2));
  }

  /**
   * Test {@link MultiMapUtils#isEmpty(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#isEmpty(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test isEmpty(MultiValuedMap); when ArrayListValuedHashMap(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiMapUtils.isEmpty(MultiValuedMap)"})
  void testIsEmpty_whenArrayListValuedHashMap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MultiMapUtils.isEmpty(new ArrayListValuedHashMap<>()));
  }

  /**
   * Test {@link MultiMapUtils#isEmpty(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#isEmpty(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test isEmpty(MultiValuedMap); when HashSetValuedHashMap(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiMapUtils.isEmpty(MultiValuedMap)"})
  void testIsEmpty_whenHashSetValuedHashMap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MultiMapUtils.isEmpty(new HashSetValuedHashMap<>()));
  }

  /**
   * Test {@link MultiMapUtils#isEmpty(MultiValuedMap)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#isEmpty(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test isEmpty(MultiValuedMap); when 'null'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MultiMapUtils.isEmpty(MultiValuedMap)"})
  void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MultiMapUtils.isEmpty(null));
  }

  /**
   * Test {@link MultiMapUtils#newListValuedHashMap()}.
   * <p>
   * Method under test: {@link MultiMapUtils#newListValuedHashMap()}
   */
  @Test
  @DisplayName("Test newListValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ListValuedMap MultiMapUtils.newListValuedHashMap()"})
  void testNewListValuedHashMap() {
    // Arrange and Act
    ListValuedMap<Object, Object> actualNewListValuedHashMapResult = MultiMapUtils.newListValuedHashMap();

    // Assert
    assertTrue(actualNewListValuedHashMapResult instanceof ArrayListValuedHashMap);
    assertEquals(0, actualNewListValuedHashMapResult.size());
    assertTrue(actualNewListValuedHashMapResult.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#newSetValuedHashMap()}.
   * <p>
   * Method under test: {@link MultiMapUtils#newSetValuedHashMap()}
   */
  @Test
  @DisplayName("Test newSetValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SetValuedMap MultiMapUtils.newSetValuedHashMap()"})
  void testNewSetValuedHashMap() {
    // Arrange and Act
    SetValuedMap<Object, Object> actualNewSetValuedHashMapResult = MultiMapUtils.newSetValuedHashMap();

    // Assert
    assertTrue(actualNewSetValuedHashMapResult instanceof HashSetValuedHashMap);
    assertEquals(0, actualNewSetValuedHashMapResult.size());
    assertTrue(actualNewSetValuedHashMapResult.isEmpty());
  }

  /**
   * Test {@link MultiMapUtils#transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)}.
   * <ul>
   *   <li>Then return {@link TransformedMultiValuedMap}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)}
   */
  @Test
  @DisplayName("Test transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer); then return TransformedMultiValuedMap")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "MultiValuedMap MultiMapUtils.transformedMultiValuedMap(MultiValuedMap, Transformer, Transformer)"})
  void testTransformedMultiValuedMap_thenReturnTransformedMultiValuedMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualTransformedMultiValuedMapResult = MultiMapUtils
        .transformedMultiValuedMap(new ArrayListValuedHashMap<>(), mock(Transformer.class), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedMultiValuedMapResult instanceof TransformedMultiValuedMap);
    assertEquals(0, actualTransformedMultiValuedMapResult.size());
  }

  /**
   * Test {@link MultiMapUtils#unmodifiableMultiValuedMap(MultiValuedMap)}.
   * <p>
   * Method under test: {@link MultiMapUtils#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test unmodifiableMultiValuedMap(MultiValuedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MultiValuedMap MultiMapUtils.unmodifiableMultiValuedMap(MultiValuedMap)"})
  void testUnmodifiableMultiValuedMap() {
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

  /**
   * Test {@link MultiMapUtils#unmodifiableMultiValuedMap(MultiValuedMap)}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiMapUtils#unmodifiableMultiValuedMap(MultiValuedMap)}
   */
  @Test
  @DisplayName("Test unmodifiableMultiValuedMap(MultiValuedMap); when ArrayListValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MultiValuedMap MultiMapUtils.unmodifiableMultiValuedMap(MultiValuedMap)"})
  void testUnmodifiableMultiValuedMap_whenArrayListValuedHashMap() {
    // Arrange and Act
    MultiValuedMap<Object, Object> actualUnmodifiableMultiValuedMapResult = MultiMapUtils
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Assert
    assertTrue(actualUnmodifiableMultiValuedMapResult instanceof UnmodifiableMultiValuedMap);
    assertEquals(0, actualUnmodifiableMultiValuedMapResult.size());
  }
}
