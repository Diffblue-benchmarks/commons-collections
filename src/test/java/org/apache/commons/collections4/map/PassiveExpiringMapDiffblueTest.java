package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy;
import org.apache.commons.collections4.map.PassiveExpiringMap.ExpirationPolicy;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PassiveExpiringMapDiffblueTest {
  /**
   * Test ConstantTimeToLiveExpirationPolicy {@link ConstantTimeToLiveExpirationPolicy#expirationTime(Object, Object)}.
   * <ul>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTimeToLiveExpirationPolicy#expirationTime(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ConstantTimeToLiveExpirationPolicy.expirationTime(Object, Object)"})
  public void testConstantTimeToLiveExpirationPolicyExpirationTime_thenReturnMinusOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ConstantTimeToLiveExpirationPolicy.<init>(long, TimeUnit)"})
  public void testConstantTimeToLiveExpirationPolicyNewConstantTimeToLiveExpirationPolicy() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>()"})
  public void testNewPassiveExpiringMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long)"})
  public void testNewPassiveExpiringMap2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long, Map)"})
  public void testNewPassiveExpiringMap3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long, TimeUnit)"})
  public void testNewPassiveExpiringMap4() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(long, TimeUnit, Map)"})
  public void testNewPassiveExpiringMap5() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(Map)"})
  public void testNewPassiveExpiringMap6() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(ExpirationPolicy)"})
  public void testNewPassiveExpiringMap_whenExpirationPolicy_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PassiveExpiringMap.<init>(ExpirationPolicy, Map)"})
  public void testNewPassiveExpiringMap_whenExpirationPolicy_thenReturnMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsKey(Object)"})
  public void testContainsKey_givenPassiveExpiringMapNullIsNull_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsKey(Object)"})
  public void testContainsKey_givenPassiveExpiringMap_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsValue(Object)"})
  public void testContainsValue_givenPassiveExpiringMapNullIsNull_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PassiveExpiringMap.containsValue(Object)"})
  public void testContainsValue_givenPassiveExpiringMap_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.entrySet()"})
  public void testEntrySet_givenPassiveExpiringMapNullIsNull_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.entrySet()"})
  public void testEntrySet_givenPassiveExpiringMap_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PassiveExpiringMap.get(Object)"})
  public void testGet_givenPassiveExpiringMapNullIsNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PassiveExpiringMap.get(Object)"})
  public void testGet_givenPassiveExpiringMap_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PassiveExpiringMap.isEmpty()"})
  public void testIsEmpty_givenPassiveExpiringMapNullIsNull_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean PassiveExpiringMap.isEmpty()"})
  public void testIsEmpty_givenPassiveExpiringMap_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.keySet()"})
  public void testKeySet_givenPassiveExpiringMapNullIsNull_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set PassiveExpiringMap.keySet()"})
  public void testKeySet_givenPassiveExpiringMap_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object PassiveExpiringMap.remove(Object)"})
  public void testRemoveWithObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int PassiveExpiringMap.size()"})
  public void testSize_givenPassiveExpiringMapNullIsNull_thenReturnOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int PassiveExpiringMap.size()"})
  public void testSize_givenPassiveExpiringMap_thenReturnZero() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection PassiveExpiringMap.values()"})
  public void testValues_givenPassiveExpiringMapNullIsNull_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection PassiveExpiringMap.values()"})
  public void testValues_givenPassiveExpiringMap_thenReturnEmpty() {
    // Arrange
    PassiveExpiringMap<Object, Object> objectObjectMap = new PassiveExpiringMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
