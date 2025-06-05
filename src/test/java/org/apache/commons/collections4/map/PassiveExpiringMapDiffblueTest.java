package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy;
import org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PassiveExpiringMapDiffblueTest {
  /**
   * Test ConstantTimeToLiveExpirationPolicy {@link ConstantTimeToLiveExpirationPolicy#expirationTime(Object, Object)}.
   * <ul>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTimeToLiveExpirationPolicy#expirationTime(Object, Object)}
   */
  @Test
  @DisplayName("Test ConstantTimeToLiveExpirationPolicy expirationTime(Object, Object); then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long ConstantTimeToLiveExpirationPolicy.expirationTime(Object, Object)"})
  void testConstantTimeToLiveExpirationPolicyExpirationTime_thenReturnMinusOne() {
    // Arrange
    ConstantTimeToLiveExpirationPolicy<Object, Object> constantTimeToLiveExpirationPolicy = new ConstantTimeToLiveExpirationPolicy<>(
        -1L);

    // Act and Assert
    assertEquals(-1L,
        constantTimeToLiveExpirationPolicy.expirationTime(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test ConstantTimeToLiveExpirationPolicy {@link ConstantTimeToLiveExpirationPolicy#ConstantTimeToLiveExpirationPolicy(long, TimeUnit)}.
   * <p>
   * Method under test: {@link ConstantTimeToLiveExpirationPolicy#ConstantTimeToLiveExpirationPolicy(long, TimeUnit)}
   */
  @Test
  @DisplayName("Test ConstantTimeToLiveExpirationPolicy new ConstantTimeToLiveExpirationPolicy(long, TimeUnit)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ConstantTimeToLiveExpirationPolicy.<init>(long, TimeUnit)"})
  void testConstantTimeToLiveExpirationPolicyNewConstantTimeToLiveExpirationPolicy() {
    // Arrange and Act
    ConstantTimeToLiveExpirationPolicy<Object, Object> actualConstantTimeToLiveExpirationPolicy = new ConstantTimeToLiveExpirationPolicy<>(
        Long.MIN_VALUE, TimeUnit.NANOSECONDS);

    // Assert
    assertEquals(-1L,
        actualConstantTimeToLiveExpirationPolicy.expirationTime(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap()}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap()}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>()"})
  void testNewPassiveExpiringMap() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(long)}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(long)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(long)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long)"})
  void testNewPassiveExpiringMap2() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(long, Map)}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(long, Map)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(long, Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long, Map)"})
  void testNewPassiveExpiringMap3() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L, new HashMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(long, TimeUnit)}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(long, TimeUnit)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(long, TimeUnit)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long, TimeUnit)"})
  void testNewPassiveExpiringMap4() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L, TimeUnit.NANOSECONDS);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(long, TimeUnit, Map)}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(long, TimeUnit, Map)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(long, TimeUnit, Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long, TimeUnit, Map)"})
  void testNewPassiveExpiringMap5() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(10L, TimeUnit.NANOSECONDS,
        new HashMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(Map)}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(Map)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(Map)"})
  void testNewPassiveExpiringMap6() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(new HashMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(ExpirationPolicy)}.
   * <ul>
   *   <li>When {@link ExpirationPolicy}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(ExpirationPolicy)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(ExpirationPolicy); when ExpirationPolicy; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(ExpirationPolicy)"})
  void testNewPassiveExpiringMap_whenExpirationPolicy_thenReturnEmpty() {
    // Arrange and Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(mock(ExpirationPolicy.class));

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#PassiveExpiringMap(ExpirationPolicy, Map)}.
   * <ul>
   *   <li>When {@link ExpirationPolicy}.</li>
   *   <li>Then return {@link AbstractMapDecorator#map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#PassiveExpiringMap(ExpirationPolicy, Map)}
   */
  @Test
  @DisplayName("Test new PassiveExpiringMap(ExpirationPolicy, Map); when ExpirationPolicy; then return map")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(ExpirationPolicy, Map)"})
  void testNewPassiveExpiringMap_whenExpirationPolicy_thenReturnMap() {
    // Arrange
    ExpirationPolicy<Object, Object> expiringPolicy = mock(ExpirationPolicy.class);

    // Act
    PassiveExpiringMap<Object, Object> actualObjectObjectMap = new PassiveExpiringMap<>(expiringPolicy,
        new HashMap<>());

    // Assert
    assertEquals(actualObjectObjectMap.map, actualObjectObjectMap);
  }

  /**
   * Test {@link PassiveExpiringMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PassiveExpiringMap() NULL is NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsKey(Object)"})
  void testContainsKey_givenPassiveExpiringMapNullIsNull_thenReturnTrue() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#containsKey(Object)}
   */
  @Test
  @DisplayName("Test containsKey(Object); given PassiveExpiringMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsKey(Object)"})
  void testContainsKey_givenPassiveExpiringMap_thenReturnFalse() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given PassiveExpiringMap() NULL is NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsValue(Object)"})
  void testContainsValue_givenPassiveExpiringMapNullIsNull_thenReturnTrue() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#containsValue(Object)}
   */
  @Test
  @DisplayName("Test containsValue(Object); given PassiveExpiringMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsValue(Object)"})
  void testContainsValue_givenPassiveExpiringMap_thenReturnFalse() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#entrySet()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given PassiveExpiringMap() NULL is NULL; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.entrySet()"})
  void testEntrySet_givenPassiveExpiringMapNullIsNull_thenReturnSizeIsOne() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.entrySet().size());
  }

  /**
   * Test {@link PassiveExpiringMap#entrySet()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given PassiveExpiringMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.entrySet()"})
  void testEntrySet_givenPassiveExpiringMap_thenReturnEmpty() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#get(Object)}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PassiveExpiringMap() NULL is NULL; then return NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PassiveExpiringMap.get(Object)"})
  void testGet_givenPassiveExpiringMapNullIsNull_thenReturnNull() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Test {@link PassiveExpiringMap#get(Object)}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given PassiveExpiringMap(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PassiveExpiringMap.get(Object)"})
  void testGet_givenPassiveExpiringMap_thenReturnNull() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given PassiveExpiringMap() NULL is NULL; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PassiveExpiringMap.isEmpty()"})
  void testIsEmpty_givenPassiveExpiringMapNullIsNull_thenReturnFalse() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given PassiveExpiringMap(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PassiveExpiringMap.isEmpty()"})
  void testIsEmpty_givenPassiveExpiringMap_thenReturnTrue() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#keySet()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given PassiveExpiringMap() NULL is NULL; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.keySet()"})
  void testKeySet_givenPassiveExpiringMapNullIsNull_thenReturnSizeIsOne() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.keySet().size());
  }

  /**
   * Test {@link PassiveExpiringMap#keySet()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet(); given PassiveExpiringMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.keySet()"})
  void testKeySet_givenPassiveExpiringMap_thenReturnEmpty() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link PassiveExpiringMap#remove(Object)} with {@code Object}.
   * <p>
   * Method under test: {@link PassiveExpiringMap#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object PassiveExpiringMap.remove(Object)"})
  void testRemoveWithObject() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link PassiveExpiringMap#size()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#size()}
   */
  @Test
  @DisplayName("Test size(); given PassiveExpiringMap() NULL is NULL; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int PassiveExpiringMap.size()"})
  void testSize_givenPassiveExpiringMapNullIsNull_thenReturnOne() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.size());
  }

  /**
   * Test {@link PassiveExpiringMap#size()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#size()}
   */
  @Test
  @DisplayName("Test size(); given PassiveExpiringMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int PassiveExpiringMap.size()"})
  void testSize_givenPassiveExpiringMap_thenReturnZero() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link PassiveExpiringMap#values()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#values()}
   */
  @Test
  @DisplayName("Test values(); given PassiveExpiringMap() NULL is NULL; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Collection PassiveExpiringMap.values()"})
  void testValues_givenPassiveExpiringMapNullIsNull_thenReturnSizeIsOne() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(1, objectObjectMap.values().size());
  }

  /**
   * Test {@link PassiveExpiringMap#values()}.
   * <ul>
   *   <li>Given {@link PassiveExpiringMap#PassiveExpiringMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PassiveExpiringMap#values()}
   */
  @Test
  @DisplayName("Test values(); given PassiveExpiringMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Collection PassiveExpiringMap.values()"})
  void testValues_givenPassiveExpiringMap_thenReturnEmpty() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
