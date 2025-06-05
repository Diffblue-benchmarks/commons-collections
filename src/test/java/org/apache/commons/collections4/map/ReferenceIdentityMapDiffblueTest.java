package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap()}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>()"})
  void testNewReferenceIdentityMap() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength)}.
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength)}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength)"})
  void testNewReferenceIdentityMap2() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, boolean)}.
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, boolean)}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, boolean)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, boolean)"})
  void testNewReferenceIdentityMap3() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float)}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  void testNewReferenceIdentityMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float, boolean)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float, boolean)}
   */
  @Test
  @DisplayName("Test new ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float, boolean); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"})
  void testNewReferenceIdentityMap_whenTen_thenReturnEmpty2() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#hashEntry(Object, Object)}.
   * <p>
   * Method under test: {@link ReferenceIdentityMap#hashEntry(Object, Object)}
   */
  @Test
  @DisplayName("Test hashEntry(Object, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ReferenceIdentityMap.hashEntry(Object, Object)"})
  void testHashEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashEntry(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualKey(Object, Object)}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#isEqualKey(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualKey(Object, Object); when NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualKey(Object, Object)"})
  void testIsEqualKey_whenNull_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualKey(Object, Object)}.
   * <ul>
   *   <li>When {@link PhantomReference#PhantomReference(Object, ReferenceQueue)} with {@link AbstractHashedMap#NULL} and {@link ReferenceQueue} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#isEqualKey(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualKey(Object, Object); when PhantomReference(Object, ReferenceQueue) with NULL and ReferenceQueue (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualKey(Object, Object)"})
  void testIsEqualKey_whenPhantomReferenceWithNullAndReferenceQueue_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(AbstractHashedMap.NULL,
        new PhantomReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>())));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualValue(Object, Object)}.
   * <ul>
   *   <li>When forty-two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#isEqualValue(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualValue(Object, Object); when forty-two; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenFortyTwo_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(42, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link ReferenceIdentityMap#isEqualValue(Object, Object)}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#isEqualValue(Object, Object)}
   */
  @Test
  @DisplayName("Test isEqualValue(Object, Object); when NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualValue(Object, Object)"})
  void testIsEqualValue_whenNull_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }
}
