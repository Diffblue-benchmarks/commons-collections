package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractReferenceMapDiffblueTest {
  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   * <p>
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(new WeakReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>()), AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given ReferenceIdentityMap() NULL is NULL; when NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey_givenReferenceIdentityMapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given ReferenceIdentityMap(); when NULL; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey_givenReferenceIdentityMap_whenNull_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given ReferenceIdentityMap(); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey_givenReferenceIdentityMap_whenNull_thenReturnFalse2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }
}
