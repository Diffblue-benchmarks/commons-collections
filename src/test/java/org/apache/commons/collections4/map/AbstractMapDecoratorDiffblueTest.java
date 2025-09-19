package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractMapDecoratorDiffblueTest {
  /**
   * Test {@link AbstractMapDecorator#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given ListOrderedMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapDecorator.containsKey(Object)"})
  void testContainsKey_givenListOrderedMapNullIsNull_thenReturnTrue() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given ListOrderedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapDecorator.containsKey(Object)"})
  void testContainsKey_givenListOrderedMap_thenReturnFalse() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given ListOrderedMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapDecorator.containsValue(Object)"})
  void testContainsValue_givenListOrderedMapNullIsNull_thenReturnTrue() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given ListOrderedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapDecorator.containsValue(Object)"})
  void testContainsValue_givenListOrderedMap_thenReturnFalse() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#decorated()}.
   *
   * <p>Method under test: {@link AbstractMapDecorator#decorated()}
   */
  @Test
  @DisplayName("Test decorated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map AbstractMapDecorator.decorated()"})
  void testDecorated() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.decorated().isEmpty());
  }

  /**
   * Test {@link AbstractMapDecorator#entrySet()}.
   *
   * <p>Method under test: {@link AbstractMapDecorator#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractMapDecorator.entrySet()"})
  void testEntrySet() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractMapDecorator#equals(Object)}, and {@link AbstractMapDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMapDecorator#equals(Object)}
   *   <li>{@link AbstractMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMapDecorator.equals(Object)",
    "int AbstractMapDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    ListOrderedMap<Object, Object> objectObjectMap2 = new ListOrderedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractMapDecorator#equals(Object)}, and {@link AbstractMapDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMapDecorator#equals(Object)}
   *   <li>{@link AbstractMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMapDecorator.equals(Object)",
    "int AbstractMapDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ListOrderedMap<Object, Object> objectObjectMap2 = new ListOrderedMap<>();
    objectObjectMap2.put(0, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractMapDecorator#equals(Object)}, and {@link AbstractMapDecorator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMapDecorator#equals(Object)}
   *   <li>{@link AbstractMapDecorator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMapDecorator.equals(Object)",
    "int AbstractMapDecorator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link AbstractMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMapDecorator.equals(Object)",
    "int AbstractMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new ListOrderedMap<>());
  }

  /**
   * Test {@link AbstractMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMapDecorator.equals(Object)",
    "int AbstractMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link AbstractMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractMapDecorator.equals(Object)",
    "int AbstractMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractMapDecorator");
  }

  /**
   * Test {@link AbstractMapDecorator#get(Object)}.
   *
   * <p>Method under test: {@link AbstractMapDecorator#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapDecorator.get(Object)"})
  void testGet() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ListOrderedMap() NULL is NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapDecorator.isEmpty()"})
  void testIsEmpty_givenListOrderedMapNullIsNull_thenReturnFalse() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractMapDecorator#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ListOrderedMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapDecorator.isEmpty()"})
  void testIsEmpty_givenListOrderedMap_thenReturnTrue() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractMapDecorator#keySet()}.
   *
   * <p>Method under test: {@link AbstractMapDecorator#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractMapDecorator.keySet()"})
  void testKeySet() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMapDecorator#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'; given ListOrderedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapDecorator.remove(Object)"})
  void testRemoveWithObject_givenListOrderedMap() {
    // Arrange
    ListOrderedMap<MultiKey<?>, Object> multiKeyObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertNull(multiKeyObjectMap.remove(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#MultiKeyMap()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'; given MultiKeyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapDecorator.remove(Object)"})
  void testRemoveWithObject_givenMultiKeyMap() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractMapDecorator#size()}.
   *
   * <p>Method under test: {@link AbstractMapDecorator#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractMapDecorator.size()"})
  void testSize() {
    // Arrange
    ListOrderedMap<Object, Object> objectObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link AbstractMapDecorator#toString()}.
   *
   * <ul>
   *   <li>Given {@link ListOrderedMap#ListOrderedMap()}.
   *   <li>Then return {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#toString()}
   */
  @Test
  @DisplayName("Test toString(); given ListOrderedMap(); then return '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMapDecorator.toString()"})
  void testToString_givenListOrderedMap_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange
    ListOrderedMap<MultiKey<?>, Object> multiKeyObjectMap = new ListOrderedMap<>();

    // Act and Assert
    assertEquals("{}", multiKeyObjectMap.toString());
  }

  /**
   * Test {@link AbstractMapDecorator#toString()}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#MultiKeyMap()}.
   *   <li>Then return {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapDecorator#toString()}
   */
  @Test
  @DisplayName("Test toString(); given MultiKeyMap(); then return '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMapDecorator.toString()"})
  void testToString_givenMultiKeyMap_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link AbstractMapDecorator#values()}.
   *
   * <p>Method under test: {@link AbstractMapDecorator#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection AbstractMapDecorator.values()"})
  void testValues() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
