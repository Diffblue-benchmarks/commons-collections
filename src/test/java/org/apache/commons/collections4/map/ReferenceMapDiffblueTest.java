package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReferenceMapDiffblueTest {
  /**
   * Test {@link ReferenceMap#ReferenceMap()}.
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap()}
   */
  @Test
  @DisplayName("Test new ReferenceMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMap.<init>()"})
  void testNewReferenceMap() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap = new ReferenceMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength)}.
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength)}
   */
  @Test
  @DisplayName("Test new ReferenceMap(ReferenceStrength, ReferenceStrength)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength)"})
  void testNewReferenceMap2() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap =
        new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, boolean)}.
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * boolean)}
   */
  @Test
  @DisplayName("Test new ReferenceMap(ReferenceStrength, ReferenceStrength, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, boolean)"})
  void testNewReferenceMap3() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap =
        new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * int, float)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  void testNewReferenceMap_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, -1, 0.0f));
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float,
   * boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"
  })
  void testNewReferenceMap_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, -1, 0.0f, true));
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * int, float)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  void testNewReferenceMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap =
        new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float,
   * boolean)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"
  })
  void testNewReferenceMap_whenThree_thenReturnEmpty2() {
    // Arrange and Act
    ReferenceMap<Object, Object> actualObjectObjectMap =
        new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * int, float)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  void testNewReferenceMap_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 0, 0.0f));
  }

  /**
   * Test {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength, int, float,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceMap#ReferenceMap(ReferenceStrength, ReferenceStrength,
   * int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new ReferenceMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReferenceMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"
  })
  void testNewReferenceMap_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ReferenceMap<>(ReferenceStrength.HARD, ReferenceStrength.HARD, 0, 0.0f, true));
  }
}
