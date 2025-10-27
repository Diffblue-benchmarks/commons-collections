package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import org.junit.Test;

public class ReferenceIdentityMapDiffblueTest {
  /**
   * Method under test: {@link ReferenceIdentityMap#hashEntry(Object, Object)}
   */
  @Test
  public void testHashEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashEntry(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ReferenceIdentityMap#isEqualKey(Object, Object)}
   */
  @Test
  public void testIsEqualKey() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ReferenceIdentityMap#isEqualKey(Object, Object)}
   */
  @Test
  public void testIsEqualKey2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(AbstractHashedMap.NULL,
        new PhantomReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>())));
  }

  /**
   * Method under test: {@link ReferenceIdentityMap#isEqualValue(Object, Object)}
   */
  @Test
  public void testIsEqualValue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ReferenceIdentityMap#isEqualValue(Object, Object)}
   */
  @Test
  public void testIsEqualValue2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(42, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap()}
   */
  @Test
  public void testNewReferenceIdentityMap() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceIdentityMap#ReferenceIdentityMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength)}
   */
  @Test
  public void testNewReferenceIdentityMap2() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(
        AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceIdentityMap#ReferenceIdentityMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength, int, float)}
   */
  @Test
  public void testNewReferenceIdentityMap3() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(
        AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceIdentityMap#ReferenceIdentityMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength, int, float, boolean)}
   */
  @Test
  public void testNewReferenceIdentityMap4() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(
        AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link ReferenceIdentityMap#ReferenceIdentityMap(AbstractReferenceMap.ReferenceStrength, AbstractReferenceMap.ReferenceStrength, boolean)}
   */
  @Test
  public void testNewReferenceIdentityMap5() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(
        AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
