package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry;
import org.apache.commons.collections4.map.LinkedMap.LinkedMapList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LinkedMapDiffblueTest {
  /**
   * Test LinkedMapList {@link LinkedMapList#LinkedMapList(LinkedMap)}.
   * <p>
   * Method under test: {@link LinkedMapList#LinkedMapList(LinkedMap)}
   */
  @Test
  @DisplayName("Test LinkedMapList new LinkedMapList(LinkedMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedMapList.<init>(LinkedMap)"})
  void testLinkedMapListNewLinkedMapList() {
    // Arrange and Act
    LinkedMapList<Object> actualObjectList = new LinkedMapList<>(new LinkedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap()}.
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap()}
   */
  @Test
  @DisplayName("Test new LinkedMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedMap.<init>()"})
  void testNewLinkedMap() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap(int)}
   */
  @Test
  @DisplayName("Test new LinkedMap(int); when one; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedMap.<init>(int)"})
  void testNewLinkedMap_whenOne_thenReturnEmpty() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap(int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap(int, float)}
   */
  @Test
  @DisplayName("Test new LinkedMap(int, float); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedMap.<init>(int, float)"})
  void testNewLinkedMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap(int, float)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap(int, float)}
   */
  @Test
  @DisplayName("Test new LinkedMap(int, float); when two; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LinkedMap.<init>(int, float)"})
  void testNewLinkedMap_whenTwo_thenReturnEmpty() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(2, 1.0E-5f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#asList()}.
   * <p>
   * Method under test: {@link LinkedMap#asList()}
   */
  @Test
  @DisplayName("Test asList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.List LinkedMap.asList()"})
  void testAsList() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.asList().isEmpty());
  }

  /**
   * Test {@link LinkedMap#get(int)} with {@code index}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  @DisplayName("Test get(int) with 'index'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.get(int)"})
  void testGetWithIndex_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(1));
  }

  /**
   * Test {@link LinkedMap#get(int)} with {@code index}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  @DisplayName("Test get(int) with 'index'; when zero; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.get(int)"})
  void testGetWithIndex_whenZero_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(0));
  }

  /**
   * Test {@link LinkedMap#getValue(int)}.
   * <ul>
   *   <li>Then return {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int); then return LinkedMap() NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.getValue(int)"})
  void testGetValue_thenReturnLinkedMapNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.getValue(1));
  }

  /**
   * Test {@link LinkedMap#getValue(int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int); when zero; then return LinkedMap() NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.getValue(int)"})
  void testGetValue_whenZero_thenReturnLinkedMapNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.getValue(0));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} four is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object); given LinkedMap() four is NULL; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  void testIndexOf_givenLinkedMapFourIsNull_thenReturnMinusOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(4, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object); given LinkedMap() NULL is NULL; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  void testIndexOf_givenLinkedMapNullIsNull_thenReturnZero() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(0, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object); given LinkedMap(); then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  void testIndexOf_givenLinkedMap_thenReturnMinusOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    LinkEntry<Object, Object> linkEntry = new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    objectObjectMap.addMapping(1, 2, linkEntry, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(0));
    assertEquals(2, objectObjectMap.size());
    Object expectedGetResult = linkEntry.key;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; given LinkedMap() NULL is NULL; when one; then LinkedMap() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex_givenLinkedMapNullIsNull_whenOne_thenLinkedMapSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; given LinkedMap() NULL is NULL; when zero; then LinkedMap() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex_givenLinkedMapNullIsNull_whenZero_thenLinkedMapSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(0);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; given LinkedMap() one is NULL; when one; then LinkedMap() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex_givenLinkedMapOneIsNull_whenOne_thenLinkedMapSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; then LinkedMap() NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex_thenLinkedMapNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, -1, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(0));
    assertEquals(2, objectObjectMap.size());
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; then LinkedMap() size is four")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex_thenLinkedMapSizeIsFour() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(4, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertNull(objectObjectMap.get(null));
    assertNull(objectObjectMap.get(null));
    assertNull(actualRemoveResult);
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @DisplayName("Test remove(int) with 'index'; then LinkedMap() size is three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  void testRemoveWithIndex_thenLinkedMapSizeIsThree() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(3, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertNull(objectObjectMap.get(null));
    assertNull(actualRemoveResult);
    assertTrue(objectObjectMap.containsKey(1));
  }
}
