package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ReferenceIdentityMapDiffblueTest {
  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>()"})
  public void testNewReferenceIdentityMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength)"})
  public void testNewReferenceIdentityMap2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, boolean)"})
  public void testNewReferenceIdentityMap3() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, true);

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float, boolean)"})
  public void testNewReferenceIdentityMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReferenceIdentityMap#ReferenceIdentityMap(ReferenceStrength, ReferenceStrength, int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReferenceIdentityMap.<init>(ReferenceStrength, ReferenceStrength, int, float)"})
  public void testNewReferenceIdentityMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    ReferenceIdentityMap<Object, Object> actualObjectObjectMap = new ReferenceIdentityMap<>(ReferenceStrength.HARD,
        ReferenceStrength.HARD, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link ReferenceIdentityMap#hashEntry(Object, Object)}.
   * <p>
   * Method under test: {@link ReferenceIdentityMap#hashEntry(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ReferenceIdentityMap.hashEntry(Object, Object)"})
  public void testHashEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualKey(Object, Object)"})
  public void testIsEqualKey_whenNull_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualKey(Object, Object)"})
  public void testIsEqualKey_whenPhantomReferenceWithNullAndReferenceQueue_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualValue(Object, Object)"})
  public void testIsEqualValue_whenFortyTwo_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ReferenceIdentityMap.isEqualValue(Object, Object)"})
  public void testIsEqualValue_whenNull_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }
}
