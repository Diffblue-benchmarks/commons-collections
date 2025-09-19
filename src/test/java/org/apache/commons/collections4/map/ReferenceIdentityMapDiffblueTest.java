package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReferenceIdentityMapDiffblueTest {
  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap()}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>()"})
  void testNewReferenceIdentityMap() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength)}.
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength)}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength)"})
  void testNewReferenceIdentityMap2() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap =
        new ReferenceIdentityMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * boolean)}.
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, boolean)}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, boolean)"
  })
  void testNewReferenceIdentityMap3() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap =
        new ReferenceIdentityMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * int, float)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, int, float)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"
  })
  void testNewReferenceIdentityMap_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ReferenceIdentityMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, -1, 0.0f));
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * int, float, boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"
  })
  void testNewReferenceIdentityMap_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new ReferenceIdentityMap<>(
                ReferenceStrength.HARD, ReferenceStrength.HARD, -1, 0.0f, true));
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * int, float)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, int, float)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"
  })
  void testNewReferenceIdentityMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap =
        new ReferenceIdentityMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * int, float, boolean)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"
  })
  void testNewReferenceIdentityMap_whenThree_thenReturnEmpty2() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap =
        new ReferenceIdentityMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * int, float)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, int, float)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"
  })
  void testNewReferenceIdentityMap_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ReferenceIdentityMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 0, 0.0f));
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength,
   * int, float, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength,
   * ReferenceStrength, int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"
  })
  void testNewReferenceIdentityMap_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new ReferenceIdentityMap<>(
                ReferenceStrength.HARD, ReferenceStrength.HARD, 0, 0.0f, true));
  }

  /**
   * Test {@link ReferenceIdentityMap#hashEntry(Object, Object)}.
   *
   * <p>Method under test: {@link ReferenceIdentityMap#hashEntry(Object, Object)}
   */
  @Test
  @DisplayName("Test hashEntry(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ReferenceIdentityMap.hashEntry(Object, Object)"})
  void testHashEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashEntry(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualKey(Object, Object)}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#isEqualKey(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualKey(Object, Object); when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualKey(Object, Object)"})
  void testIsEqualKey_whenNull_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualKey(Object, Object)}.
   *
   * <ul>
   *   <li>When {@link PhantomReference#PhantomReference(Object, ReferenceQueue)} with {@link
   *       AbstractHashedMap#NULL} and {@link ReferenceQueue} (default constructor).
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#isEqualKey(Object, Object)}
   */
  @Test
  @DisplayName(
      "Test isEqualKey(Object, Object); when PhantomReference(Object, ReferenceQueue) with NULL and ReferenceQueue (default constructor); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualKey(Object, Object)"})
  void testIsEqualKey_whenPhantomReferenceWithNullAndReferenceQueue_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    PhantomReference<Object> phantomReference =
        new PhantomReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, phantomReference));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualValue(Object, Object)}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#isEqualValue(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualValue(Object, Object); when forty-two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenFortyTwo_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(42, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualValue(Object, Object)}.
   *
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceIdentityMap#isEqualValue(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualValue(Object, Object); when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenNull_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }
}
