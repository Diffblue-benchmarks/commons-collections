package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class StaticBucketMapDiffblueTest {
  /**
   * Test {@link StaticBucketMap#StaticBucketMap()}.
   * <p>
   * Method under test: {@link StaticBucketMap#StaticBucketMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void StaticBucketMap.<init>()"})
  public void testNewStaticBucketMap() {
    // Arrange and Act
    StaticBucketMap<Object, Object> actualObjectObjectMap = new StaticBucketMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#StaticBucketMap(int)}.
   * <p>
   * Method under test: {@link StaticBucketMap#StaticBucketMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void StaticBucketMap.<init>(int)"})
  public void testNewStaticBucketMap2() {
    // Arrange and Act
    StaticBucketMap<Object, Object> actualObjectObjectMap = new StaticBucketMap<>(10);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#atomic(Runnable)} with {@code runnable}.
   * <p>
   * Method under test: {@link StaticBucketMap#atomic(Runnable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void StaticBucketMap.atomic(Runnable)"})
  public void testAtomicWithRunnable() {
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
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  public void testContainsKey_givenStaticBucketMapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} two hundred fifty-five is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  public void testContainsKey_givenStaticBucketMapTwoHundredFiftyFiveIsNull_whenNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(255, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  public void testContainsKey_givenStaticBucketMap_whenKey_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey("Key"));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  public void testContainsKey_givenStaticBucketMap_whenNull_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsKey(Object)"})
  public void testContainsKey_givenStaticBucketMap_whenNull_thenReturnFalse2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link StaticBucketMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is forty-two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsValue(Object)"})
  public void testContainsValue_givenStaticBucketMapNullIsFortyTwo_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsValue(Object)"})
  public void testContainsValue_givenStaticBucketMapNullIsNull_thenReturnTrue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.containsValue(Object)"})
  public void testContainsValue_givenStaticBucketMap_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#entrySet()}.
   * <p>
   * Method under test: {@link StaticBucketMap#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set StaticBucketMap.entrySet()"})
  public void testEntrySet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}, and {@link StaticBucketMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}, and {@link StaticBucketMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}, and {@link StaticBucketMap#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StaticBucketMap#equals(Object)}
   *   <li>{@link StaticBucketMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new StaticBucketMap<>());
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
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
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    StaticBucketMap<Object, Object> objectObjectMap2 = new StaticBucketMap<>();
    objectObjectMap2.put(255, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link StaticBucketMap#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.equals(Object)", "int StaticBucketMap.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to StaticBucketMap");
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  public void testGet_givenStaticBucketMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} two hundred fifty-five is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  public void testGet_givenStaticBucketMapTwoHundredFiftyFiveIsNull_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(255, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  public void testGet_givenStaticBucketMap_whenKey_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get("Key"));
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  public void testGet_givenStaticBucketMap_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link StaticBucketMap#get(Object)}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.get(Object)"})
  public void testGet_givenStaticBucketMap_whenNull_thenReturnNull2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link StaticBucketMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.isEmpty()"})
  public void testIsEmpty_givenStaticBucketMapNullIsNull_thenReturnFalse() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean StaticBucketMap.isEmpty()"})
  public void testIsEmpty_givenStaticBucketMap_thenReturnTrue() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#keySet()}.
   * <p>
   * Method under test: {@link StaticBucketMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set StaticBucketMap.keySet()"})
  public void testKeySet() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  public void testRemoveWithObject_givenStaticBucketMapNullIsNull_whenNull_thenReturnNull() {
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
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  public void testRemoveWithObject_givenStaticBucketMap_whenKey_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  public void testRemoveWithObject_givenStaticBucketMap_whenNull_thenReturnNull() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link StaticBucketMap#StaticBucketMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  public void testRemoveWithObject_givenStaticBucketMap_whenNull_thenReturnNull2() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove(null));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link StaticBucketMap#remove(Object)} with {@code Object}.
   * <ul>
   *   <li>Then {@link StaticBucketMap#StaticBucketMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link StaticBucketMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object StaticBucketMap.remove(Object)"})
  public void testRemoveWithObject_thenStaticBucketMapSizeIsOne() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();
    objectObjectMap.put(255, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(AbstractHashedMap.NULL));
    assertEquals(1, objectObjectMap.size());
    assertTrue(objectObjectMap.containsKey(255));
  }

  /**
   * Test {@link StaticBucketMap#size()}.
   * <p>
   * Method under test: {@link StaticBucketMap#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int StaticBucketMap.size()"})
  public void testSize() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link StaticBucketMap#values()}.
   * <p>
   * Method under test: {@link StaticBucketMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection StaticBucketMap.values()"})
  public void testValues() {
    // Arrange
    StaticBucketMap<Object, Object> objectObjectMap = new StaticBucketMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }
}
