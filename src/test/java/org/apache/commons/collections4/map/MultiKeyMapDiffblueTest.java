package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MultiKeyMapDiffblueTest {
  /**
   * Test {@link MultiKeyMap#multiKeyMap(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link MultiKeyMap#multiKeyMap(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test multiKeyMap(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiKeyMap MultiKeyMap.multiKeyMap(AbstractHashedMap)"})
  void testMultiKeyMap() {
    // Arrange and Act
    MultiKeyMap<Object, Object> actualMultiKeyMapResult =
        MultiKeyMap.multiKeyMap(new AbstractHashedMap<>());

    // Assert
    Map<MultiKey<?>, Object> expectedMultiKeyMapResult = actualMultiKeyMapResult.map;
    assertEquals(expectedMultiKeyMapResult, actualMultiKeyMapResult);
  }

  /**
   * Test {@link MultiKeyMap#MultiKeyMap()}.
   *
   * <p>Method under test: {@link MultiKeyMap#MultiKeyMap()}
   */
  @Test
  @DisplayName("Test new MultiKeyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKeyMap.<init>()"})
  void testNewMultiKeyMap() {
    // Arrange and Act
    MultiKeyMap<Object, Object> actualObjectObjectMap = new MultiKeyMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#MultiKeyMap(AbstractHashedMap)}.
   *
   * <p>Method under test: {@link MultiKeyMap#MultiKeyMap(AbstractHashedMap)}
   */
  @Test
  @DisplayName("Test new MultiKeyMap(AbstractHashedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKeyMap.<init>(AbstractHashedMap)"})
  void testNewMultiKeyMap2() {
    // Arrange and Act
    MultiKeyMap<Object, Object> actualObjectObjectMap =
        new MultiKeyMap<>(new AbstractHashedMap<>());

    // Assert
    Map<MultiKey<?>, Object> expectedObjectObjectMap = actualObjectObjectMap.map;
    assertEquals(expectedObjectObjectMap, actualObjectObjectMap);
  }

  /**
   * Test {@link MultiKeyMap#clone()}.
   *
   * <p>Method under test: {@link MultiKeyMap#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiKeyMap MultiKeyMap.clone()"})
  void testClone() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act
    MultiKeyMap<Object, Object> actualCloneResult = objectObjectMap.clone();

    // Assert
    assertEquals(objectObjectMap, actualCloneResult);
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_thenReturnTrue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnFalse4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnFalse5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenNull_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenNull_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenNull_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenNull_thenReturnFalse4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenNull_thenReturnFalse5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key5_whenNull_thenReturnFalse6() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key52() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key53() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key54() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key55() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key56() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key57() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key58() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key59() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key510() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4Key511() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_thenReturnTrue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnFalse4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenNull_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenNull_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            null, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenNull_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenNull_thenReturnFalse4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key4_whenNull_thenReturnFalse5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key42() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key43() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key44() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3Key45() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_thenReturnTrue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenAbstractHashedMap_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            new AbstractHashedMap<>(), AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenAbstractHashedMap_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, new AbstractHashedMap<>(), AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenAbstractHashedMap_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenNull_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenNull_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenNull_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenNull_thenReturnFalse4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key3_whenTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(2, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key32() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key33() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object, Object)"})
  void testContainsKeyWithKey1Key2Key34() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(
        objectObjectMap.containsKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with
   *       {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; given MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_givenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys2 = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey2 = new MultiKey<>(keys2);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(multiKey2, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object, Object) with 'key1', 'key2'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_thenReturnTrue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenAbstractHashedMap_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(new AbstractHashedMap<>(), AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when AbstractHashedMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenAbstractHashedMap_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenNull_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenNull_thenReturnFalse2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#containsKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#containsKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object, Object) with 'key1', 'key2'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.containsKey(Object, Object)"})
  void testContainsKeyWithKey1Key2_whenNull_thenReturnFalse3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#decorated()}.
   *
   * <p>Method under test: {@link MultiKeyMap#decorated()}
   */
  @Test
  @DisplayName("Test decorated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractHashedMap MultiKeyMap.decorated()"})
  void testDecorated() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act
    AbstractHashedMap<MultiKey<?>, Object> actualDecoratedResult = objectObjectMap.decorated();

    // Assert
    assertSame(objectObjectMap.map, actualDecoratedResult);
  }

  /**
   * Test {@link MultiKeyMap#decoratedHashEntry(int)}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#MultiKeyMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#decoratedHashEntry(int)}
   */
  @Test
  @DisplayName("Test decoratedHashEntry(int); given MultiKeyMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashEntry MultiKeyMap.decoratedHashEntry(int)"})
  void testDecoratedHashEntry_givenMultiKeyMap_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.decoratedHashEntry(19088743));
  }

  /**
   * Test {@link MultiKeyMap#decoratedHashIndex(int)}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#MultiKeyMap()}.
   *   <li>Then return seven.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#decoratedHashIndex(int)}
   */
  @Test
  @DisplayName("Test decoratedHashIndex(int); given MultiKeyMap(); then return seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.decoratedHashIndex(int)"})
  void testDecoratedHashIndex_givenMultiKeyMap_thenReturnSeven() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(7, objectObjectMap.decoratedHashIndex(19088743));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult =
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenAbstractHashedMap_thenReturnNull5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenMultiKeyWithKeysIsArrayOfObjectWithNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenMultiKeyWithKeysIsArrayOfObjectWithNull5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenNull_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenNull_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenNull_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenNull_thenReturnNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenNull_thenReturnNull5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key5_whenNull_thenReturnNull6() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key52() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key53() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key54() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key55() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4Key56() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult =
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenAbstractHashedMap_thenReturnNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenNull_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenNull_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            null, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenNull_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenNull_thenReturnNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key4_whenNull_thenReturnNull5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key42() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key43() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object, Object)"})
  void testGetWithKey1Key2Key3Key44() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult =
        objectObjectMap.get(AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenAbstractHashedMap_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            new AbstractHashedMap<>(), AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenAbstractHashedMap_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, new AbstractHashedMap<>(), AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenAbstractHashedMap_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenNull_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.get(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenNull_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenNull_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenNull_thenReturnNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object) with 'key1', 'key2', 'key3'; when two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key3_whenTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(2, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key32() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key33() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object, Object)"})
  void testGetWithKey1Key2Key34() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with
   *       {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; given MultiKey(Object[]) with keys is array of Object with NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_givenMultiKeyWithKeysIsArrayOfObjectWithNull_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys2 = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey2 = new MultiKey<>(keys2);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(multiKey2, object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object) with 'key1', 'key2'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(AbstractHashedMap.NULL, object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenAbstractHashedMap_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(new AbstractHashedMap<>(), AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; when AbstractHashedMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenAbstractHashedMap_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, new AbstractHashedMap<>()));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(multiKey, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object, Object) with 'key1', 'key2'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, multiKey));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object) with 'key1', 'key2'; when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenNull_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object) with 'key1', 'key2'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenNull_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#get(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#get(Object, Object)}
   */
  @Test
  @DisplayName("Test get(Object, Object) with 'key1', 'key2'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.get(Object, Object)"})
  void testGetWithKey1Key2_whenNull_thenReturnNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object, Object, Object)"})
  void testHashWithKey1Key2Key3Key4Key5_whenNull_thenReturn8130816() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816,
        objectObjectMap.hash(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object, Object, Object)"})
  void testHashWithKey1Key2Key3Key4Key5_whenNull_thenReturn81308162() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816,
        objectObjectMap.hash(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object, Object, Object)"})
  void testHashWithKey1Key2Key3Key4Key5_whenNull_thenReturn81308163() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816,
        objectObjectMap.hash(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object, Object, Object)"})
  void testHashWithKey1Key2Key3Key4Key5_whenNull_thenReturn81308164() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816,
        objectObjectMap.hash(
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object, Object, Object)"})
  void testHashWithKey1Key2Key3Key4Key5_whenNull_thenReturn81308165() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816,
        objectObjectMap.hash(
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when NULL; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object, Object)"})
  void testHashWithKey1Key2Key3Key4_whenNull_thenReturn8130816() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816,
        objectObjectMap.hash(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object)"})
  void testHashWithKey1Key2Key3_whenNull_thenReturn8130816() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816, objectObjectMap.hash(AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object)"})
  void testHashWithKey1Key2Key3_whenNull_thenReturn81308162() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816, objectObjectMap.hash(AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test hash(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object, Object)"})
  void testHashWithKey1Key2Key3_whenNull_thenReturn81308163() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(
        -8130816, objectObjectMap.hash(null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#hash(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code -8130816}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#hash(Object, Object)}
   */
  @Test
  @DisplayName("Test hash(Object, Object) with 'key1', 'key2'; when NULL; then return '-8130816'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiKeyMap.hash(Object, Object)"})
  void testHashWithKey1Key2_whenNull_thenReturn8130816() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertEquals(-8130816, objectObjectMap.hash(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object, Object, Object, Object)} with
   * {@code entry}, {@code key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test isEqualKey(HashEntry, Object, Object, Object, Object, Object) with 'entry', 'key1', 'key2', 'key3', 'key4', 'key5'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiKeyMap.isEqualKey(HashEntry, Object, Object, Object, Object, Object)"
  })
  void testIsEqualKeyWithEntryKey1Key2Key3Key4Key5_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    HashEntry<MultiKey<?>, Object> next = mock(HashEntry.class);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    HashEntry<MultiKey<?>, Object> entry =
        new HashEntry<>(next, 19088743, multiKey, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.isEqualKey(
            entry,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object, Object, Object)} with {@code
   * entry}, {@code key1}, {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test isEqualKey(HashEntry, Object, Object, Object, Object) with 'entry', 'key1', 'key2', 'key3', 'key4'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.isEqualKey(HashEntry, Object, Object, Object, Object)"})
  void testIsEqualKeyWithEntryKey1Key2Key3Key4_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    HashEntry<MultiKey<?>, Object> next = mock(HashEntry.class);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    HashEntry<MultiKey<?>, Object> entry =
        new HashEntry<>(next, 19088743, multiKey, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.isEqualKey(
            entry,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object, Object)} with {@code entry},
   * {@code key1}, {@code key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test isEqualKey(HashEntry, Object, Object, Object) with 'entry', 'key1', 'key2', 'key3'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.isEqualKey(HashEntry, Object, Object, Object)"})
  void testIsEqualKeyWithEntryKey1Key2Key3_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    HashEntry<MultiKey<?>, Object> next = mock(HashEntry.class);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    HashEntry<MultiKey<?>, Object> entry =
        new HashEntry<>(next, 19088743, multiKey, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(
        objectObjectMap.isEqualKey(
            entry, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object)} with {@code entry}, {@code
   * key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test isEqualKey(HashEntry, Object, Object) with 'entry', 'key1', 'key2'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.isEqualKey(HashEntry, Object, Object)"})
  void testIsEqualKeyWithEntryKey1Key2_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    HashEntry<MultiKey<?>, Object> next = mock(HashEntry.class);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    HashEntry<MultiKey<?>, Object> entry =
        new HashEntry<>(next, 19088743, multiKey, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(entry, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object)} with {@code entry}, {@code
   * key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#isEqualKey(HashEntry, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test isEqualKey(HashEntry, Object, Object) with 'entry', 'key1', 'key2'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.isEqualKey(HashEntry, Object, Object)"})
  void testIsEqualKeyWithEntryKey1Key2_thenReturnTrue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    HashEntry<MultiKey<?>, Object> next = mock(HashEntry.class);
    HashEntry<MultiKey<?>, Object> entry =
        new HashEntry<>(
            next,
            19088743,
            new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(entry, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link MultiKeyMap#mapIterator()}.
   *
   * <ul>
   *   <li>Then return {@link EmptyMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); then return EmptyMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator MultiKeyMap.mapIterator()"})
  void testMapIterator_thenReturnEmptyMapIterator() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act
    MapIterator<MultiKey<?>, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(((EmptyMapIterator) actualMapIteratorResult).INSTANCE, actualMapIteratorResult);
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value6() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult =
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenAbstractHashedMap() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenAbstractHashedMap2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenAbstractHashedMap3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenAbstractHashedMap4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenAbstractHashedMap5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When nine.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when nine; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNine_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            9,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when NULL; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNull_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNull_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNull_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNull_thenMultiKeyMapSizeIsOne4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNull_thenMultiKeyMapSizeIsOne5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenNull_thenMultiKeyMapSizeIsOne6() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}, {@code key5}, {@code value}.
   *
   * <ul>
   *   <li>When two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5', 'value'; when two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Key5Value_whenTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            2,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult =
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenMultiKeyWithKeysIsArrayOfObjectWithNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When nine.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when nine; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenNine_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            9,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when NULL; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenNull_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenNull_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenNull_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenNull_thenMultiKeyMapSizeIsOne4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Key4Value_whenNull_thenMultiKeyMapSizeIsOne5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsThree() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(3, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsThree2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(3, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsThree3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(3, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsTwo2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsTwo3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenMultiKeyMapSizeIsTwo4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult =
        objectObjectMap.put(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertEquals(2, objectObjectMap.size());
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When nine.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when nine; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenNine_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            9, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when NULL; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenNull_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenNull_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            null, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenNull_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenNull_thenMultiKeyMapSizeIsOne4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}, {@code value}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'value'; when two; then MultiKeyMap() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object, Object)"})
  void testPutWithKey1Key2Key3Value_whenTwo_thenMultiKeyMapSizeIsThree() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            2, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(3, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; then MultiKeyMap() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_thenMultiKeyMapSizeIsThree() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.put(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(3, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; then MultiKeyMap() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_thenMultiKeyMapSizeIsThree2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.put(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(3, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_thenMultiKeyMapSizeIsTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_thenMultiKeyMapSizeIsTwo2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.put(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_thenMultiKeyMapSizeIsTwo3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.put(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object, Object) with 'key1', 'key2', 'value'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult =
        objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new AbstractHashedMap<>(), AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; when AbstractHashedMap(); then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_whenAbstractHashedMap_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, new AbstractHashedMap<>(), AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>When nine.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; when nine; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_whenNine_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.put(9, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; when NULL; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_whenNull_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_whenNull_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.put(null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(Object, Object, Object)} with {@code key1}, {@code key2}, {@code
   * value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test put(Object, Object, Object) with 'key1', 'key2', 'value'; when 'null'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(Object, Object, Object)"})
  void testPutWithKey1Key2Value_whenNull_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.put(AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(MultiKey, Object)} with {@code key}, {@code value}.
   *
   * <p>Method under test: {@link MultiKeyMap#put(MultiKey, Object)}
   */
  @Test
  @DisplayName("Test put(MultiKey, Object) with 'key', 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(MultiKey, Object)"})
  void testPutWithKeyValue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(MultiKey, Object)} with {@code key}, {@code value}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(MultiKey, Object)}
   */
  @Test
  @DisplayName("Test put(MultiKey, Object) with 'key', 'value'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(MultiKey, Object)"})
  void testPutWithKeyValue_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#put(MultiKey, Object)} with {@code key}, {@code value}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(MultiKey, Object)}
   */
  @Test
  @DisplayName("Test put(MultiKey, Object) with 'key', 'value'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(MultiKey, Object)"})
  void testPutWithKeyValue_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualPutResult =
        objectObjectMap.put(new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualPutResult);
  }

  /**
   * Test {@link MultiKeyMap#put(MultiKey, Object)} with {@code key}, {@code value}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#put(MultiKey, Object)}
   */
  @Test
  @DisplayName(
      "Test put(MultiKey, Object) with 'key', 'value'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.put(MultiKey, Object)"})
  void testPutWithKeyValue_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.put(
            new MultiKey<>(multiKey, AbstractHashedMap.NULL), AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link MultiKey#MultiKey(Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given MultiKey(Object, Object) with key1 is NULL and key2 is NULL; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKeyMap.putAll(Map)"})
  void testPutAll_givenMultiKeyWithKey1IsNullAndKey2IsNull_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    HashMap<MultiKey<?>, Object> mapToCopy = new HashMap<>();
    mapToCopy.put(
        new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act
    objectObjectMap.putAll(mapToCopy);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals(objectObjectMap, mapToCopy);
  }

  /**
   * Test {@link MultiKeyMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#putAll(Map)}
   */
  @Test
  @DisplayName(
      "Test putAll(Map); given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKeyMap.putAll(Map)"})
  void testPutAll_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    HashMap<MultiKey<?>, Object> mapToCopy = new HashMap<>();
    mapToCopy.put(
        new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act
    objectObjectMap.putAll(mapToCopy);

    // Assert that nothing has changed
    assertEquals(1, objectObjectMap.size());
    assertEquals(objectObjectMap, mapToCopy);
  }

  /**
   * Test {@link MultiKeyMap#putAll(Map)}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKeyMap.putAll(Map)"})
  void testPutAll_thenHashMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    HashMap<MultiKey<?>, Object> mapToCopy = new HashMap<>();
    mapToCopy.put(
        new MultiKey<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act
    objectObjectMap.putAll(mapToCopy);

    // Assert
    assertEquals(1, mapToCopy.size());
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#putAll(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map); when HashMap(); then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MultiKeyMap.putAll(Map)"})
  void testPutAll_whenHashMap_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    HashMap<MultiKey<?>, Object> mapToCopy = new HashMap<>();

    // Act
    objectObjectMap.putAll(mapToCopy);

    // Assert that nothing has changed
    assertTrue(objectObjectMap.isEmpty());
    assertEquals(objectObjectMap, mapToCopy);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object) with 'key1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey1() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(AbstractHashedMap.NULL);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenAbstractHashedMap() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenAbstractHashedMap2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenAbstractHashedMap3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenAbstractHashedMap4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>());

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenMultiKeyWithKeysIsArrayOfObjectWithNull4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key4_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key42() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key43() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key44() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key45() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key46() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3Key47() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        2,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>Given {@link MultiKeyMap#put(Object, Object, Object)} with key1 is {@link
   *       AbstractHashedMap#NULL} and key2 is {@link AbstractHashedMap#NULL} and value is {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; given put(Object, Object, Object) with key1 is NULL and key2 is NULL and value is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_givenPutWithKey1IsNullAndKey2IsNullAndValueIsNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenAbstractHashedMap() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            new AbstractHashedMap<>(), AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenAbstractHashedMap2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, new AbstractHashedMap<>(), AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenAbstractHashedMap3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, new AbstractHashedMap<>());

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenMultiKeyWithKeysIsArrayOfObjectWithNull3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key3_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key32() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key33() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object, Object)} with {@code key1}, {@code key2},
   * {@code key3}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object, Object) with 'key1', 'key2', 'key3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object, Object)"})
  void testRemoveAllWithKey1Key2Key34() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then {@link AbstractHashedMap#AbstractHashedMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object) with 'key1', 'key2'; given HashMap() NULL is NULL; then AbstractHashedMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2_givenHashMapNullIsNull_thenAbstractHashedMapEmpty() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    MultiKeyMap<Object, Object> objectObjectMap2 = new MultiKeyMap<>();
    objectObjectMap2.put(
        objectObjectMap,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap3 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap2.removeAll(objectObjectMap3, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap2.size());
    assertFalse(actualRemoveAllResult);
    assertTrue(objectObjectMap3.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then {@link AbstractHashedMap#AbstractHashedMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'; then AbstractHashedMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2_thenAbstractHashedMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(objectObjectMap2, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
    assertTrue(objectObjectMap2.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2_thenReturnTrue() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object) with 'key1', 'key2'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(multiKey, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object) with 'key1', 'key2'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2_whenMultiKeyWithKeysIsArrayOfObjectWithNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(AbstractHashedMap.NULL, multiKey);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object, Object) with 'key1', 'key2'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key2_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.removeAll(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key22() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key23() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(AbstractHashedMap.NULL, new AbstractHashedMap<>());

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key24() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        new AbstractHashedMap<>(),
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(objectObjectMap2, AbstractHashedMap.NULL);

    // Assert
    assertTrue(objectObjectMap2.isEmpty());
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object, Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object, Object) with 'key1', 'key2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object, Object)"})
  void testRemoveAllWithKey1Key25() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        new HashMap<>(),
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult =
        objectObjectMap.removeAll(objectObjectMap2, AbstractHashedMap.NULL);

    // Assert
    assertTrue(objectObjectMap2.isEmpty());
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object) with 'key1'; given HashMap() NULL is NULL; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey1_givenHashMapNullIsNull_thenMultiKeyMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    MultiKeyMap<Object, Object> objectObjectMap2 = new MultiKeyMap<>();
    objectObjectMap2.put(
        objectObjectMap,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap3 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult = objectObjectMap2.removeAll(objectObjectMap3);

    // Assert
    assertEquals(1, objectObjectMap2.size());
    assertFalse(actualRemoveAllResult);
    assertTrue(objectObjectMap3.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <ul>
   *   <li>Then {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object) with 'key1'; then MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey1_thenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys2 = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey2 = new MultiKey<>(keys2);

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(multiKey2);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
    assertEquals(multiKey, multiKey2);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <ul>
   *   <li>When {@link MultiKey#MultiKey(Object[])} with keys is array of {@link Object} with {@link
   *       AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Object) with 'key1'; when MultiKey(Object[]) with keys is array of Object with NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey1_whenMultiKeyWithKeysIsArrayOfObjectWithNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(multiKey);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object) with 'key1'; when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey1_whenNull_thenReturnFalse() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.removeAll(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object) with 'key1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey12() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        1,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object) with 'key1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey13() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(objectObjectMap2);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertFalse(actualRemoveAllResult);
    assertTrue(objectObjectMap2.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object) with 'key1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey14() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        new AbstractHashedMap<>(),
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(objectObjectMap2);

    // Assert
    assertTrue(objectObjectMap2.isEmpty());
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeAll(Object)} with {@code key1}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeAll(Object)}
   */
  @Test
  @DisplayName("Test removeAll(Object) with 'key1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiKeyMap.removeAll(Object)"})
  void testRemoveAllWithKey15() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        new HashMap<>(),
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act
    boolean actualRemoveAllResult = objectObjectMap.removeAll(objectObjectMap2);

    // Assert
    assertTrue(objectObjectMap2.isEmpty());
    assertTrue(objectObjectMap.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenAbstractHashedMap5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>()));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenNull_thenMultiKeyMapEmpty2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenNull_thenMultiKeyMapEmpty3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenNull_thenMultiKeyMapEmpty4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenNull_thenMultiKeyMapEmpty5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key5_whenNull_thenMultiKeyMapEmpty6() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key52() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key53() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key54() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key55() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key56() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key57() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key58() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key59() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key510() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object, Object)} with {@code
   * key1}, {@code key2}, {@code key3}, {@code key4}, {@code key5}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object,
   * Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4', 'key5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4Key511() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            multiKey));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenAbstractHashedMap() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenAbstractHashedMap2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenAbstractHashedMap3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>(),
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when AbstractHashedMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenAbstractHashedMap4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            new AbstractHashedMap<>()));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenNull_thenMultiKeyMapEmpty2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            null, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenNull_thenMultiKeyMapEmpty3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenNull_thenMultiKeyMapEmpty4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key4_whenNull_thenMultiKeyMapEmpty5() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key42() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key43() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key44() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key45() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        multiKey,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL,
            AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key46() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key47() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key48() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)} with {@code key1},
   * {@code key2}, {@code key3}, {@code key4}.
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object, Object) with 'key1', 'key2', 'key3', 'key4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3Key49() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsOne4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(multiKey, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsTwo2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, multiKey, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenMultiKeyMapSizeIsTwo3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, multiKey));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenAbstractHashedMap_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            new AbstractHashedMap<>(), AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenAbstractHashedMap_thenMultiKeyMapEmpty2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, new AbstractHashedMap<>(), AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when AbstractHashedMap(); then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenAbstractHashedMap_thenMultiKeyMapEmpty3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, new AbstractHashedMap<>()));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(
            AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenNull_thenMultiKeyMapEmpty2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(null, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenNull_thenMultiKeyMapEmpty3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, null, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenNull_thenMultiKeyMapEmpty4() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL, null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object, Object)} with {@code key1}, {@code
   * key2}, {@code key3}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object, Object) with 'key1', 'key2', 'key3'; when two; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2Key3_whenTwo_thenMultiKeyMapSizeIsTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(2, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenMultiKeyMapSizeIsOne() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenMultiKeyMapSizeIsOne2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(multiKey, AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; then MultiKeyMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenMultiKeyMapSizeIsOne3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, multiKey));
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenMultiKeyMapSizeIsTwo() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(multiKey, AbstractHashedMap.NULL));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; then MultiKeyMap() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenMultiKeyMapSizeIsTwo2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object[] keys = new Object[] {AbstractHashedMap.NULL};
    MultiKey<Object> multiKey = new MultiKey<>(keys);

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, multiKey));
    assertEquals(2, objectObjectMap.size());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName("Test removeMultiKey(Object, Object) with 'key1', 'key2'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenReturnNull() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName("Test removeMultiKey(Object, Object) with 'key1', 'key2'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_thenReturnNull2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveMultiKeyResult =
        objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, object);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertSame(object, actualRemoveMultiKeyResult);
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; when AbstractHashedMap(); then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_whenAbstractHashedMap_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(new AbstractHashedMap<>(), AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#AbstractHashedMap()}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; when AbstractHashedMap(); then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_whenAbstractHashedMap_thenMultiKeyMapEmpty2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, new AbstractHashedMap<>()));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; when NULL; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_whenNull_thenMultiKeyMapEmpty() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_whenNull_thenMultiKeyMapEmpty2() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(null, AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link MultiKeyMap#removeMultiKey(Object, Object)} with {@code key1}, {@code key2}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link MultiKeyMap#MultiKeyMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiKeyMap#removeMultiKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test removeMultiKey(Object, Object) with 'key1', 'key2'; when 'null'; then MultiKeyMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MultiKeyMap.removeMultiKey(Object, Object)"})
  void testRemoveMultiKeyWithKey1Key2_whenNull_thenMultiKeyMapEmpty3() {
    // Arrange
    MultiKeyMap<Object, Object> objectObjectMap = new MultiKeyMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeMultiKey(AbstractHashedMap.NULL, null));
    assertTrue(objectObjectMap.isEmpty());
  }
}
