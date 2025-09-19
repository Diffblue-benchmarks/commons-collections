package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.map.StaticBucketMap.BaseIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StaticBucketMapDiffblueTest {
  /**
   * Test BaseIterator {@link BaseIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test BaseIterator hasNext(); given StaticBucketMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseIterator.hasNext()"})
  void testBaseIteratorHasNext_givenStaticBucketMapNullIsNull_thenReturnTrue() {
    // Arrange
    StaticBucketMap staticBucketMap = new StaticBucketMap();
    staticBucketMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(staticBucketMap.new BaseIterator().hasNext());
  }

  /**
   * Test BaseIterator {@link BaseIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIterator#hasNext()}
   */
  @Test
  @DisplayName("Test BaseIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BaseIterator.hasNext()"})
  void testBaseIteratorHasNext_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new StaticBucketMap().new BaseIterator().hasNext());
  }

  /**
   * Test BaseIterator {@link BaseIterator#nextEntry()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIterator#nextEntry()}
   */
  @Test
  @DisplayName("Test BaseIterator nextEntry(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map.Entry BaseIterator.nextEntry()"})
  void testBaseIteratorNextEntry_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> new StaticBucketMap().new BaseIterator().nextEntry());
  }

  /**
   * Test BaseIterator {@link BaseIterator#remove()}.
   *
   * <p>Method under test: {@link BaseIterator#remove()}
   */
  @Test
  @DisplayName("Test BaseIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseIterator.remove()"})
  void testBaseIteratorRemove() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class, () -> new StaticBucketMap().new BaseIterator().remove());
  }

  /**
   * Test {@link StaticBucketMap#StaticBucketMap()}.
   *
   * <p>Method under test: {@link StaticBucketMap#StaticBucketMap()}
   */
  @Test
  @DisplayName("Test new StaticBucketMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StaticBucketMap.<init>()"})
  void testNewStaticBucketMap() {
    // Arrange and Act
    StaticBucketMap<Object, Object> actualObjectObjectMap = new StaticBucketMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#StaticBucketMap(int)}.
   *
   * <p>Method under test: {@link StaticBucketMap#StaticBucketMap(int)}
   */
  @Test
  @DisplayName("Test new StaticBucketMap(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StaticBucketMap.<init>(int)"})
  void testNewStaticBucketMap2() {
    // Arrange and Act
    StaticBucketMap<Object, Object> actualObjectObjectMap = new StaticBucketMap<>(10);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#atomic(Runnable)} with {@code runnable}.
   *
   * <p>Method under test: {@link StaticBucketMap#atomic(Runnable)}
   */
  @Test
  @DisplayName("Test atomic(Runnable) with 'runnable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StaticBucketMap.atomic(Runnable)"})
  void testAtomicWithRunnable() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    Runnable runnable = mock(Runnable.class);
    doNothing().when(runnable).run();

    // Act
    objectObjectMap.atomic(runnable);

    // Assert
    verify(runnable).run();
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given StaticBucketMap() NULL is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  void testContainsKey_givenStaticBucketMapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given StaticBucketMap(); when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  void testContainsKey_givenStaticBucketMap_whenNull_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given StaticBucketMap(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  void testContainsKey_givenStaticBucketMap_whenNull_thenReturnFalse2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@code object-key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given StaticBucketMap(); when 'object-key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  void testContainsKey_givenStaticBucketMap_whenObjectKey_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey("object-key"));
  }

  /**
   * Test {@link StaticBucketMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is
   *       forty-two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given StaticBucketMap() NULL is forty-two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsValue(Object)"})
  void testContainsValue_givenStaticBucketMapNullIsFortyTwo_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  @DisplayName(
      "Test containsValue(Object); given StaticBucketMap() NULL is NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsValue(Object)"})
  void testContainsValue_givenStaticBucketMapNullIsNull_thenReturnTrue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsValue(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given StaticBucketMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.containsValue(Object)"})
  void testContainsValue_givenStaticBucketMap_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#entrySet()}.
   *
   * <p>Method under test: {@link StaticBucketMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set StaticBucketMap.entrySet()"})
  void testEntrySet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}, and {@link StaticBucketMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}, and {@link StaticBucketMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    assertEquals(objectObjectMap.hashCode(), objectObjectMap2.hashCode());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}, and {@link StaticBucketMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new StaticBucketMap<>());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put("object-key", AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to StaticBucketMap");
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object); given StaticBucketMap() NULL is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  void testGet_givenStaticBucketMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given StaticBucketMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  void testGet_givenStaticBucketMap_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given StaticBucketMap(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  void testGet_givenStaticBucketMap_whenNull_thenReturnNull2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@code object-key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given StaticBucketMap(); when 'object-key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  void testGet_givenStaticBucketMap_whenObjectKey_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get("object-key"));
  }

  /**
   * Test {@link StaticBucketMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given StaticBucketMap() NULL is NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.isEmpty()"})
  void testIsEmpty_givenStaticBucketMapNullIsNull_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given StaticBucketMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StaticBucketMap.isEmpty()"})
  void testIsEmpty_givenStaticBucketMap_thenReturnTrue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#keySet()}.
   *
   * <p>Method under test: {@link StaticBucketMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set StaticBucketMap.keySet()"})
  void testKeySet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'Object'; given StaticBucketMap() NULL is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  void testRemoveWithObject_givenStaticBucketMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualRemoveResult = objectObjectMap.remove(object);

    // Assert
    assertTrue(objectObjectMap.isEmpty());
    assertSame(object, actualRemoveResult);
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'Object'; given StaticBucketMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  void testRemoveWithObject_givenStaticBucketMap_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'Object'; given StaticBucketMap(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  void testRemoveWithObject_givenStaticBucketMap_whenNull_thenReturnNull2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.
   *   <li>When {@code object-key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'Object'; given StaticBucketMap(); when 'object-key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  void testRemoveWithObject_givenStaticBucketMap_whenObjectKey_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove("object-key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#size()}.
   *
   * <p>Method under test: {@link StaticBucketMap#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int StaticBucketMap.size()"})
  void testSize() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link StaticBucketMap#values()}.
   *
   * <p>Method under test: {@link StaticBucketMap#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection StaticBucketMap.values()"})
  void testValues() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
