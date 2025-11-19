package org.apache.commons.collections4.splitmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractIterableGetMapDecoratorDiffblueTest {
  /**
   * Test {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator()}.
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator()}
   */
  @Test
  @DisplayName("Test new AbstractIterableGetMapDecorator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AbstractIterableGetMapDecorator.<init>()",
    "java.lang.String AbstractIterableGetMapDecorator.toString()"
  })
  void testNewAbstractIterableGetMapDecorator() {
    // Arrange and Act
    AbstractIterableGetMapDecorator<Object, Object> actualAbstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>();

    // Assert
    assertNull(actualAbstractIterableGetMapDecorator.map);
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given HashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsKey(Object)"})
  void testContainsKey_givenHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(map);

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.containsKey("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsKey(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsKey(Object)"})
  void testContainsKey_thenReturnFalse() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertFalse(abstractIterableGetMapDecorator.containsKey("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given HashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsValue(Object)"})
  void testContainsValue_givenHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(map);

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.containsValue("Value"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsValue(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsValue(Object)"})
  void testContainsValue_thenReturnFalse() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertFalse(abstractIterableGetMapDecorator.containsValue("Value"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#decorated()}.
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#decorated()}
   */
  @Test
  @DisplayName("Test decorated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map AbstractIterableGetMapDecorator.decorated()"})
  void testDecorated() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertNull(abstractIterableGetMapDecorator.decorated());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#entrySet()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractIterableGetMapDecorator.entrySet()"})
  void testEntrySet_thenReturnEmpty() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractIterableGetMapDecorator.equals(Object)",
    "int AbstractIterableGetMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertNotEquals(abstractIterableGetMapDecorator, new AbstractIterableGetMapDecorator<>());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractIterableGetMapDecorator.equals(Object)",
    "int AbstractIterableGetMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenThrowException() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertThrows(NullPointerException.class, () -> abstractIterableGetMapDecorator.equals(null));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractIterableGetMapDecorator.equals(Object)",
    "int AbstractIterableGetMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertEquals(abstractIterableGetMapDecorator, abstractIterableGetMapDecorator);
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractIterableGetMapDecorator.equals(Object)",
    "int AbstractIterableGetMapDecorator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenThrowException() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertThrows(
        NullPointerException.class,
        () ->
            abstractIterableGetMapDecorator.equals(
                "Different type to AbstractIterableGetMapDecorator"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with
   *       map is {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object); given AbstractIterableGetMapDecorator(Map) with map is HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractIterableGetMapDecorator.get(Object)"})
  void testGet_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnNull() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertNull(abstractIterableGetMapDecorator.get("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with
   *       map is {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given AbstractIterableGetMapDecorator(Map) with map is HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.isEmpty()"})
  void testIsEmpty_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnTrue() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.isEmpty()"})
  void testIsEmpty_givenHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(map);

    // Act and Assert
    assertFalse(abstractIterableGetMapDecorator.isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#keySet()}.
   *
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with
   *       map is {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#keySet()}
   */
  @Test
  @DisplayName(
      "Test keySet(); given AbstractIterableGetMapDecorator(Map) with map is HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractIterableGetMapDecorator.keySet()"})
  void testKeySet_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnEmpty() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#mapIterator()}.
   *
   * <ul>
   *   <li>Then return {@link EntrySetToMapIteratorAdapter}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return EntrySetToMapIteratorAdapter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractIterableGetMapDecorator.mapIterator()"})
  void testMapIterator_thenReturnEntrySetToMapIteratorAdapter() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act
    MapIterator<Object, Object> actualMapIteratorResult =
        abstractIterableGetMapDecorator.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EntrySetToMapIteratorAdapter);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with
   *       map is {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given AbstractIterableGetMapDecorator(Map) with map is HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractIterableGetMapDecorator.remove(Object)"})
  void testRemove_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnNull() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertNull(abstractIterableGetMapDecorator.remove("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#size()}.
   *
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with
   *       map is {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#size()}
   */
  @Test
  @DisplayName(
      "Test size(); given AbstractIterableGetMapDecorator(Map) with map is HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractIterableGetMapDecorator.size()"})
  void testSize_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnZero() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertEquals(0, abstractIterableGetMapDecorator.size());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#values()}.
   *
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with
   *       map is {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractIterableGetMapDecorator#values()}
   */
  @Test
  @DisplayName(
      "Test values(); given AbstractIterableGetMapDecorator(Map) with map is HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection AbstractIterableGetMapDecorator.values()"})
  void testValues_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnEmpty() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator =
        new AbstractIterableGetMapDecorator<>(new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.values().isEmpty());
  }
}
