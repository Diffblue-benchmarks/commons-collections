package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.CompositeMap.MapMutator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CompositeMapDiffblueTest {
  /**
   * Test {@link CompositeMap#CompositeMap()}.
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap()}
   */
  @Test
  @DisplayName("Test new CompositeMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>()"})
  void testNewCompositeMap() {
    // Arrange and Act
    CompositeMap<Object, Object> actualObjectObjectMap = new CompositeMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link CompositeMap#CompositeMap(Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap(Map, Map)}
   */
  @Test
  @DisplayName("Test new CompositeMap(Map, Map); given NULL; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>(Map, Map)"})
  void testNewCompositeMap_givenNull_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> one = new HashMap<>();
    one.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashMap<Object, Object> two = new HashMap<>();
    two.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CompositeMap<>(one, two));
  }

  /**
   * Test {@link CompositeMap#CompositeMap(Map, Map, MapMutator)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap(Map, Map, MapMutator)}
   */
  @Test
  @DisplayName(
      "Test new CompositeMap(Map, Map, MapMutator); given NULL; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>(Map, Map, MapMutator)"})
  void testNewCompositeMap_givenNull_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> one = new HashMap<>();
    one.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashMap<Object, Object> two = new HashMap<>();
    two.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new CompositeMap<>(one, two, null));
  }

  /**
   * Test {@link CompositeMap#CompositeMap(Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new CompositeMap(Map, Map); given NULL; when HashMap() NULL is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>(Map, Map)"})
  void testNewCompositeMap_givenNull_whenHashMapNullIsNull_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> one = new HashMap<>();
    one.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    CompositeMap<Object, Object> actualObjectObjectMap = new CompositeMap<>(one, new HashMap<>());

    // Assert
    assertEquals(one, actualObjectObjectMap);
  }

  /**
   * Test {@link CompositeMap#CompositeMap(Map, Map, MapMutator)}.
   *
   * <ul>
   *   <li>Given {@link AbstractHashedMap#NULL}.
   *   <li>When {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap(Map, Map, MapMutator)}
   */
  @Test
  @DisplayName(
      "Test new CompositeMap(Map, Map, MapMutator); given NULL; when HashMap() NULL is NULL; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>(Map, Map, MapMutator)"})
  void testNewCompositeMap_givenNull_whenHashMapNullIsNull_thenReturnHashMap2() {
    // Arrange
    HashMap<Object, Object> one = new HashMap<>();
    one.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    CompositeMap<Object, Object> actualObjectObjectMap =
        new CompositeMap<>(one, new HashMap<>(), null);

    // Assert
    assertEquals(one, actualObjectObjectMap);
  }

  /**
   * Test {@link CompositeMap#CompositeMap(Map, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap(Map, Map)}
   */
  @Test
  @DisplayName("Test new CompositeMap(Map, Map); when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>(Map, Map)"})
  void testNewCompositeMap_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> one = new HashMap<>();

    // Act
    CompositeMap<Object, Object> actualObjectObjectMap = new CompositeMap<>(one, new HashMap<>());

    // Assert
    assertEquals(one, actualObjectObjectMap);
  }

  /**
   * Test {@link CompositeMap#CompositeMap(Map, Map, MapMutator)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#CompositeMap(Map, Map, MapMutator)}
   */
  @Test
  @DisplayName("Test new CompositeMap(Map, Map, MapMutator); when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.<init>(Map, Map, MapMutator)"})
  void testNewCompositeMap_whenHashMap_thenReturnHashMap2() {
    // Arrange
    HashMap<Object, Object> one = new HashMap<>();

    // Act
    CompositeMap<Object, Object> actualObjectObjectMap =
        new CompositeMap<>(one, new HashMap<>(), null);

    // Assert
    assertEquals(one, actualObjectObjectMap);
  }

  /**
   * Test {@link CompositeMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given CompositeMap() addComposited HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.containsKey(Object)"})
  void testContainsKey_givenCompositeMapAddCompositedHashMap_thenReturnFalse()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given CompositeMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.containsKey(Object)"})
  void testContainsKey_givenCompositeMap_thenReturnFalse() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given HashMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.containsKey(Object)"})
  void testContainsKey_givenHashMapNullIsNull_thenReturnTrue() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given CompositeMap() addComposited HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.containsValue(Object)"})
  void testContainsValue_givenCompositeMapAddCompositedHashMap_thenReturnFalse()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given CompositeMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.containsValue(Object)"})
  void testContainsValue_givenCompositeMap_thenReturnFalse() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given HashMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.containsValue(Object)"})
  void testContainsValue_givenHashMapNullIsNull_thenReturnTrue() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.entrySet()"})
  void testEntrySet_givenCompositeMapAddCompositedHashMap_thenReturnEmpty()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.entrySet()"})
  void testEntrySet_givenCompositeMapAddCompositedHashMap_thenReturnEmpty2()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.entrySet()"})
  void testEntrySet_givenCompositeMapAddCompositedHashMap_thenReturnEmpty3()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given CompositeMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.entrySet()"})
  void testEntrySet_givenCompositeMap_thenReturnEmpty() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given HashMap() NULL is NULL; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.entrySet()"})
  void testEntrySet_givenHashMapNullIsNull_thenReturnSizeIsOne() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertEquals(1, objectObjectMap.entrySet().size());
  }

  /**
   * Test {@link CompositeMap#equals(Object)}, and {@link CompositeMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeMap#equals(Object)}
   *   <li>{@link CompositeMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.equals(Object)", "int CompositeMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    CompositeMap<Object, Object> objectObjectMap2 = new CompositeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link CompositeMap#equals(Object)}, and {@link CompositeMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeMap#equals(Object)}
   *   <li>{@link CompositeMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.equals(Object)", "int CompositeMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    CompositeMap<Object, Object> objectObjectMap2 = new CompositeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link CompositeMap#equals(Object)}, and {@link CompositeMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeMap#equals(Object)}
   *   <li>{@link CompositeMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.equals(Object)", "int CompositeMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link CompositeMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.equals(Object)", "int CompositeMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertNotEquals(objectObjectMap, new CompositeMap<>());
  }

  /**
   * Test {@link CompositeMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.equals(Object)", "int CompositeMap.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link CompositeMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.equals(Object)", "int CompositeMap.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to CompositeMap");
  }

  /**
   * Test {@link CompositeMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given CompositeMap() addComposited HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.get(Object)"})
  void testGet_givenCompositeMapAddCompositedHashMap_thenReturnNull()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given CompositeMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.get(Object)"})
  void testGet_givenCompositeMap_thenReturnNull() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given HashMap() NULL is NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.get(Object)"})
  void testGet_givenHashMapNullIsNull_thenReturnNull() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link CompositeMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CompositeMap() addComposited HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.isEmpty()"})
  void testIsEmpty_givenCompositeMapAddCompositedHashMap_thenReturnTrue()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CompositeMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given CompositeMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.isEmpty()"})
  void testIsEmpty_givenCompositeMap_thenReturnTrue() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CompositeMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashMap() NULL is NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompositeMap.isEmpty()"})
  void testIsEmpty_givenHashMapNullIsNull_thenReturnFalse() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CompositeMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.keySet()"})
  void testKeySet_givenCompositeMapAddCompositedHashMap_thenReturnEmpty()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.keySet()"})
  void testKeySet_givenCompositeMapAddCompositedHashMap_thenReturnEmpty2()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.keySet()"})
  void testKeySet_givenCompositeMapAddCompositedHashMap_thenReturnEmpty3()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given CompositeMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.keySet()"})
  void testKeySet_givenCompositeMap_thenReturnEmpty() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link CompositeMap#keySet()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given HashMap() NULL is NULL; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CompositeMap.keySet()"})
  void testKeySet_givenHashMapNullIsNull_thenReturnSizeIsOne() throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertEquals(1, objectObjectMap.keySet().size());
  }

  /**
   * Test {@link CompositeMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#put(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object); given CompositeMap(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.put(Object, Object)"})
  void testPut_givenCompositeMap_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link CompositeMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link EmptyMapMutator} {@link EmptyMapMutator#put(CompositeMap, Map[], Object,
   *       Object)} return {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#put(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object); given EmptyMapMutator put(CompositeMap, Map[], Object, Object) return NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.put(Object, Object)"})
  void testPut_givenEmptyMapMutatorPutReturnNull_thenReturnNull() {
    // Arrange
    EmptyMapMutator<Object, Object> mutator = mock(EmptyMapMutator.class);
    when(mutator.put(
            Mockito.<CompositeMap<Object, Object>>any(),
            Mockito.<Map<Object, Object>[]>any(),
            Mockito.<Object>any(),
            Mockito.<Object>any()))
        .thenReturn(AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.setMutator(mutator);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult = objectObjectMap.put(AbstractHashedMap.NULL, object);

    // Assert
    verify(mutator)
        .put(isA(CompositeMap.class), isA(Map[].class), isA(Object.class), isA(Object.class));
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link CompositeMap#put(Object, Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.put(Object, Object)"})
  void testPut_thenThrowIllegalArgumentException() {
    // Arrange
    EmptyMapMutator<Object, Object> mutator = mock(EmptyMapMutator.class);
    when(mutator.put(
            Mockito.<CompositeMap<Object, Object>>any(),
            Mockito.<Map<Object, Object>[]>any(),
            Mockito.<Object>any(),
            Mockito.<Object>any()))
        .thenThrow(new IllegalArgumentException());

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.setMutator(mutator);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(mutator)
        .put(isA(CompositeMap.class), isA(Map[].class), isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link CompositeMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); given CompositeMap(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.putAll(Map)"})
  void testPutAll_givenCompositeMap_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> objectObjectMap.putAll(new HashMap<>()));
  }

  /**
   * Test {@link CompositeMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link EmptyMapMutator} {@link EmptyMapMutator#putAll(CompositeMap, Map[], Map)}
   *       does nothing.
   *   <li>Then calls {@link EmptyMapMutator#putAll(CompositeMap, Map[], Map)}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given EmptyMapMutator putAll(CompositeMap, Map[], Map) does nothing; then calls putAll(CompositeMap, Map[], Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.putAll(Map)"})
  void testPutAll_givenEmptyMapMutatorPutAllDoesNothing_thenCallsPutAll() {
    // Arrange
    EmptyMapMutator<Object, Object> mutator = mock(EmptyMapMutator.class);
    doNothing()
        .when(mutator)
        .putAll(
            Mockito.<CompositeMap<Object, Object>>any(),
            Mockito.<Map<Object, Object>[]>any(),
            Mockito.<Map<?, ?>>any());

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.setMutator(mutator);

    // Act
    objectObjectMap.putAll(new HashMap<>());

    // Assert
    verify(mutator).putAll(isA(CompositeMap.class), isA(Map[].class), isA(Map.class));
  }

  /**
   * Test {@link CompositeMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompositeMap.putAll(Map)"})
  void testPutAll_thenThrowIllegalArgumentException() {
    // Arrange
    EmptyMapMutator<Object, Object> mutator = mock(EmptyMapMutator.class);
    doThrow(new IllegalArgumentException())
        .when(mutator)
        .putAll(
            Mockito.<CompositeMap<Object, Object>>any(),
            Mockito.<Map<Object, Object>[]>any(),
            Mockito.<Map<?, ?>>any());

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.setMutator(mutator);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.putAll(new HashMap<>()));
    verify(mutator).putAll(isA(CompositeMap.class), isA(Map[].class), isA(Map.class));
  }

  /**
   * Test {@link CompositeMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'Object'; given CompositeMap() addComposited HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.remove(Object)"})
  void testRemoveWithObject_givenCompositeMapAddCompositedHashMap_thenReturnNull()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CompositeMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'; given CompositeMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.remove(Object)"})
  void testRemoveWithObject_givenCompositeMap_thenReturnNull() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CompositeMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'; given HashMap() NULL is NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CompositeMap.remove(Object)"})
  void testRemoveWithObject_givenHashMapNullIsNull_thenReturnNull()
      throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveResult);
  }

  /**
   * Test {@link CompositeMap#removeComposited(Map)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#removeComposited(Map)}
   */
  @Test
  @DisplayName(
      "Test removeComposited(Map); given CompositeMap() addComposited HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CompositeMap.removeComposited(Map)"})
  void testRemoveComposited_givenCompositeMapAddCompositedHashMap_thenReturnEmpty()
      throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.removeComposited(new HashMap<>()).isEmpty());
  }

  /**
   * Test {@link CompositeMap#removeComposited(Map)}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#removeComposited(Map)}
   */
  @Test
  @DisplayName("Test removeComposited(Map); given CompositeMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CompositeMap.removeComposited(Map)"})
  void testRemoveComposited_givenCompositeMap_thenReturnNull() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeComposited(new HashMap<>()));
  }

  /**
   * Test {@link CompositeMap#removeComposited(Map)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#removeComposited(Map)}
   */
  @Test
  @DisplayName("Test removeComposited(Map); given HashMap() NULL is NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CompositeMap.removeComposited(Map)"})
  void testRemoveComposited_givenHashMapNullIsNull_thenReturnNull()
      throws IllegalArgumentException {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(map);

    // Act and Assert
    assertNull(objectObjectMap.removeComposited(new HashMap<>()));
  }

  /**
   * Test {@link CompositeMap#size()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#size()}
   */
  @Test
  @DisplayName("Test size(); given CompositeMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CompositeMap.size()"})
  void testSize_givenCompositeMap() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link CompositeMap#size()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#size()}
   */
  @Test
  @DisplayName("Test size(); given CompositeMap() addComposited HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CompositeMap.size()"})
  void testSize_givenCompositeMapAddCompositedHashMap() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link CompositeMap#values()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#values()}
   */
  @Test
  @DisplayName("Test values(); given CompositeMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection CompositeMap.values()"})
  void testValues_givenCompositeMap() {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test {@link CompositeMap#values()}.
   *
   * <ul>
   *   <li>Given {@link CompositeMap#CompositeMap()} addComposited {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeMap#values()}
   */
  @Test
  @DisplayName("Test values(); given CompositeMap() addComposited HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection CompositeMap.values()"})
  void testValues_givenCompositeMapAddCompositedHashMap() throws IllegalArgumentException {
    // Arrange
    CompositeMap<Object, Object> objectObjectMap = new CompositeMap<>();
    objectObjectMap.addComposited(new HashMap<>());

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
