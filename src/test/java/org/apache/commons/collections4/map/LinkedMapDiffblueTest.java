package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.LinkedMap.LinkedMapList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LinkedMapDiffblueTest {
  /**
   * Test LinkedMapList {@link LinkedMapList#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMapList#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test LinkedMapList contains(Object); given LinkedMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedMapList.contains(Object)"})
  void testLinkedMapListContains_givenLinkedMapNullIsNull_thenReturnTrue() {
    // Arrange
    LinkedMap<Object, Object> parent = new LinkedMap<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkedMapList<Object> objectList = new LinkedMapList<>(parent);

    // Act and Assert
    assertTrue(objectList.contains(AbstractHashedMap.NULL));
  }

  /**
   * Test LinkedMapList {@link LinkedMapList#contains(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMapList#contains(Object)}
   */
  @Test
  @DisplayName("Test LinkedMapList contains(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedMapList.contains(Object)"})
  void testLinkedMapListContains_thenReturnFalse() {
    // Arrange
    LinkedMapList<Object> objectList = new LinkedMapList<>(new LinkedMap<>());

    // Act and Assert
    assertFalse(objectList.contains(AbstractHashedMap.NULL));
  }

  /**
   * Test LinkedMapList {@link LinkedMapList#LinkedMapList(LinkedMap)}.
   *
   * <p>Method under test: {@link LinkedMapList#LinkedMapList(LinkedMap)}
   */
  @Test
  @DisplayName("Test LinkedMapList new LinkedMapList(LinkedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedMapList.<init>(LinkedMap)"})
  void testLinkedMapListNewLinkedMapList() {
    // Arrange and Act
    LinkedMapList<Object> actualObjectList = new LinkedMapList<>(new LinkedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap()}.
   *
   * <p>Method under test: {@link LinkedMap#LinkedMap()}
   */
  @Test
  @DisplayName("Test new LinkedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedMap.<init>()"})
  void testNewLinkedMap() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#asList()}.
   *
   * <p>Method under test: {@link LinkedMap#asList()}
   */
  @Test
  @DisplayName("Test asList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List LinkedMap.asList()"})
  void testAsList() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.asList().isEmpty());
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    LinkedMap<Object, Object> objectObjectMap2 = new LinkedMap<>();
    objectObjectMap2.put(objectObjectMap, AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap2.clone();

    // Assert
    assertEquals(objectObjectMap2, actualCloneResult);
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone2() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, new AbstractHashedMap<>(), AbstractHashedMap.NULL);
    objectObjectMap.put(new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.clone().size());
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone3() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.addMapping(1, 2, new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    LinkedMap<Object, Object> objectObjectMap2 = new LinkedMap<>();
    objectObjectMap2.put(objectObjectMap, AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap2.clone();

    // Assert
    assertEquals(objectObjectMap2, actualCloneResult);
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#AbstractHashedMap()} is
   *       {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link LinkedMap#LinkedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName(
      "Test clone(); given LinkedMap() AbstractHashedMap() is NULL; then return LinkedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_givenLinkedMapAbstractHashedMapIsNull_thenReturnLinkedMap() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link LRUMap#LRUMap()} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link LinkedMap#LinkedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given LinkedMap() LRUMap() is NULL; then return LinkedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_givenLinkedMapLRUMapIsNull_thenReturnLinkedMap() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(new LRUMap<>(), AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given LinkedMap() NULL is NULL; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_givenLinkedMapNullIsNull_thenReturnSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(1, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given LinkedMap() NULL is NULL; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_givenLinkedMapNullIsNull_thenReturnSizeIsOne2() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(1, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()}.
   *   <li>Then return {@link LinkedMap#LinkedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); given LinkedMap(); then return LinkedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_givenLinkedMap_thenReturnLinkedMap() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_thenReturnSizeIsTwo() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link LinkedMap#clone()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#clone()}
   */
  @Test
  @DisplayName("Test clone(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LinkedMap LinkedMap.clone()"})
  void testClone_thenReturnSizeIsTwo2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    LinkedMap<Object, Object> objectObjectMap2 = new LinkedMap<>();
    objectObjectMap2.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap2.put(objectObjectMap, AbstractHashedMap.NULL);

    // Act
    LinkedMap<Object, Object> actualCloneResult = objectObjectMap2.clone();

    // Assert
    assertEquals(2, actualCloneResult.size());
    assertSame(AbstractHashedMap.NULL, actualCloneResult.get(null));
  }

  /**
   * Test {@link LinkedMap#get(int)} with {@code index}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  @DisplayName("Test get(int) with 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkedMap.get(int)"})
  void testGetWithIndex_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(1));
  }

  /**
   * Test {@link LinkedMap#get(int)} with {@code index}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  @DisplayName("Test get(int) with 'index'; when zero; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkedMap.get(int)"})
  void testGetWithIndex_whenZero_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(0));
  }

  /**
   * Test {@link LinkedMap#getValue(int)}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int); then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkedMap.getValue(int)"})
  void testGetValue_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(AbstractHashedMap.NULL, objectObjectMap.getValue(1));
  }

  /**
   * Test {@link LinkedMap#getValue(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int); when zero; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LinkedMap.getValue(int)"})
  void testGetValue_whenZero_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(AbstractHashedMap.NULL, objectObjectMap.getValue(0));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} four is {@link AbstractHashedMap#NULL}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object); given LinkedMap() four is NULL; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object); given LinkedMap() NULL is NULL; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @DisplayName("Test indexOf(Object); given LinkedMap(); then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  void testIndexOf_givenLinkedMap_thenReturnMinusOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }
}
