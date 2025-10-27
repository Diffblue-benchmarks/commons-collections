package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class PassiveExpiringMapDiffblueTest {
  /**
   * Method under test:
   * {@link PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy#expirationTime(Object, Object)}
   */
  @Test
  public void testConstantTimeToLiveExpirationPolicyExpirationTime() {
    // Arrange
    PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Object> constantTimeToLiveExpirationPolicy = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(
        -1L);

    // Act and Assert
    assertEquals(-1L,
        constantTimeToLiveExpirationPolicy.expirationTime(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test:
   * {@link PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy#ConstantTimeToLiveExpirationPolicy(long, TimeUnit)}
   */
  @Test
  public void testConstantTimeToLiveExpirationPolicyNewConstantTimeToLiveExpirationPolicy() {
    // Arrange and Act
    PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Object> actualConstantTimeToLiveExpirationPolicy = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(
        Long.MIN_VALUE, TimeUnit.NANOSECONDS);

    // Assert
    assertEquals(-1L,
        actualConstantTimeToLiveExpirationPolicy.expirationTime(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#containsKey(Object)}
   */
  @Test
  public void testContainsKey2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#containsValue(Object)}
   */
  @Test
  public void testContainsValue2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#entrySet()}
   */
  @Test
  public void testEntrySet2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.entrySet().size());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#get(Object)}
   */
  @Test
  public void testGet() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#get(Object)}
   */
  @Test
  public void testGet2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#keySet()}
   */
  @Test
  public void testKeySet2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.keySet().size());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
  }

  /**
   * Method under test: {@link PassiveExpiringMap#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#size()}
   */
  @Test
  public void testSize2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#values()}
   */
  @Test
  public void testValues() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#values()}
   */
  @Test
  public void testValues2() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.values().size());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap()}
   */
  @Test
  public void testNewPassiveExpiringMap() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(long)}
   */
  @Test
  public void testNewPassiveExpiringMap2() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(long, Map)}
   */
  @Test
  public void testNewPassiveExpiringMap3() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L, new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link PassiveExpiringMap#PassiveExpiringMap(long, TimeUnit)}
   */
  @Test
  public void testNewPassiveExpiringMap4() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L, TimeUnit.NANOSECONDS);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link PassiveExpiringMap#PassiveExpiringMap(long, TimeUnit, Map)}
   */
  @Test
  public void testNewPassiveExpiringMap5() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L, TimeUnit.NANOSECONDS,
        new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(Map)}
   */
  @Test
  public void testNewPassiveExpiringMap6() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link PassiveExpiringMap#PassiveExpiringMap(PassiveExpiringMap.ExpirationPolicy)}
   */
  @Test
  public void testNewPassiveExpiringMap7() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(
        new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(10L));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Method under test:
   * {@link PassiveExpiringMap#PassiveExpiringMap(PassiveExpiringMap.ExpirationPolicy, Map)}
   */
  @Test
  public void testNewPassiveExpiringMap8() {
    // Arrange
    PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Object, Object> expiringPolicy = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(
        10L);

    // Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(expiringPolicy,
        new HashMap<>());

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
