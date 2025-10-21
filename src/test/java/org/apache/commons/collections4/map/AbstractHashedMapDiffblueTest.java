package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import org.apache.commons.collections4.map.AbstractHashedMap.EntrySet;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractHashedMap.KeySet;
import org.apache.commons.collections4.map.AbstractHashedMap.Values;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry;
import org.apache.commons.collections4.map.Flat3Map.FlatMapEntry;
import org.apache.commons.collections4.map.IdentityMap.IdentityEntry;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractHashedMapDiffblueTest {
  /**
   * Test EntrySet {@link EntrySet#EntrySet(AbstractHashedMap)}.
   * <p>
   * Method under test: {@link EntrySet#EntrySet(AbstractHashedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySet.<init>(AbstractHashedMap)"})
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object, Object> actualObjectSet = new EntrySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap#AbstractHashedMap()}
   *   <li>{@link AbstractHashedMap#init()}
   *   <li>{@link AbstractHashedMap#size()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>()", "void AbstractHashedMap.init()",
      "int AbstractHashedMap.size()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>();
    actualObjectObjectMap.init();

    // Assert
    assertEquals(0, actualObjectObjectMap.size());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}, and {@link HashEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link HashEntry#equals(Object)}
   *   <li>{@link HashEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry2 = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(hashEntry, hashEntry2);
    int expectedHashCodeResult = hashEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry2.hashCode());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}, and {@link HashEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link HashEntry#equals(Object)}
   *   <li>{@link HashEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    IdentityEntry<Object, Object> identityEntry = new IdentityEntry<>(
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(identityEntry, hashEntry);
    int expectedHashCodeResult = identityEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry.hashCode());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}, and {@link HashEntry#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link HashEntry#equals(Object)}
   *   <li>{@link HashEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(hashEntry, hashEntry);
    int expectedHashCodeResult = hashEntry.hashCode();
    assertEquals(expectedHashCodeResult, hashEntry.hashCode());
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, 1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertNotEquals(hashEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Act and Assert
    assertNotEquals(hashEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReferenceIdentityMap<Object, Object> parent = new ReferenceIdentityMap<>();
    ReferenceEntry<Object, Object> referenceEntry = new ReferenceEntry<>(parent,
        new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(referenceEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, new FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, null);
  }

  /**
   * Test HashEntry {@link HashEntry#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean HashEntry.equals(Object)", "int HashEntry.hashCode()"})
  public void testHashEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(hashEntry, "Different type to HashEntry");
  }

  /**
   * Test HashEntry {@link HashEntry#getKey()}.
   * <ul>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object HashEntry.getKey()"})
  public void testHashEntryGetKey_thenReturnKey() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, "Key", AbstractHashedMap.NULL);

    // Act
    Object actualKey = hashEntry.getKey();

    // Assert
    assertEquals("Key", actualKey);
    assertSame(hashEntry.key, actualKey);
  }

  /**
   * Test HashEntry {@link HashEntry#getKey()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object HashEntry.getKey()"})
  public void testHashEntryGetKey_thenReturnNull() {
    // Arrange
    HashEntry<Object, Object> hashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(hashEntry.getKey());
  }

  /**
   * Test HashEntry getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link HashEntry#HashEntry(HashEntry, int, Object, Object)}
   *   <li>{@link HashEntry#setValue(Object)}
   *   <li>{@link HashEntry#toString()}
   *   <li>{@link HashEntry#getValue()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashEntry.<init>(HashEntry, int, Object, Object)", "Object HashEntry.getValue()",
      "Object HashEntry.setValue(Object)", "java.lang.String HashEntry.toString()"})
  public void testHashEntryGettersAndSetters() {
    // Arrange and Act
    HashEntry<Object, Object> actualHashEntry = new HashEntry<>(null, 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;
    Object actualSetValueResult = actualHashEntry.setValue(object);
    actualHashEntry.toString();

    // Assert
    assertSame(object, actualHashEntry.getValue());
    assertSame(object, actualSetValueResult);
  }

  /**
   * Test KeySet {@link KeySet#KeySet(AbstractHashedMap)}.
   * <p>
   * Method under test: {@link KeySet#KeySet(AbstractHashedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySet.<init>(AbstractHashedMap)"})
  public void testKeySetNewKeySet() {
    // Arrange and Act
    KeySet<Object> actualObjectSet = new KeySet<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int)"})
  public void testNewAbstractHashedMap_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(-1));
  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int, float)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int, float)"})
  public void testNewAbstractHashedMap_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(-1, 0.0f));

  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int, float)}.
   * <ul>
   *   <li>When {@link Float#NaN}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int, float)"})
  public void testNewAbstractHashedMap_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(1, Float.NaN));

  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int)"})
  public void testNewAbstractHashedMap_whenOne_thenReturnEmpty() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int, float, int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int, float, int)"})
  public void testNewAbstractHashedMap_whenOne_thenReturnEmpty2() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1, 10.0f, 1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int, float)"})
  public void testNewAbstractHashedMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    AbstractHashedMap<Object, Object> actualObjectObjectMap = new AbstractHashedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#AbstractHashedMap(int, float)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#AbstractHashedMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.<init>(int, float)"})
  public void testNewAbstractHashedMap_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new AbstractHashedMap<>(0, 0.0f));

  }

  /**
   * Test {@link AbstractHashedMap#calculateNewCapacity(int)}.
   * <ul>
   *   <li>When {@code 1073741824}.</li>
   *   <li>Then return {@code 1073741824}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateNewCapacity(int)"})
  public void testCalculateNewCapacity_when1073741824_thenReturn1073741824() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1073741824, objectObjectMap.calculateNewCapacity(1073741824));
  }

  /**
   * Test {@link AbstractHashedMap#calculateNewCapacity(int)}.
   * <ul>
   *   <li>When {@code 1073741825}.</li>
   *   <li>Then return {@code 1073741824}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateNewCapacity(int)"})
  public void testCalculateNewCapacity_when1073741825_thenReturn1073741824() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1073741824, objectObjectMap.calculateNewCapacity(1073741825));
  }

  /**
   * Test {@link AbstractHashedMap#calculateNewCapacity(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateNewCapacity(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateNewCapacity(int)"})
  public void testCalculateNewCapacity_whenOne_thenReturnOne() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(1, objectObjectMap.calculateNewCapacity(1));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then return minus ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  public void testCalculateThreshold_whenMinusOne_thenReturnMinusTen() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(-10, objectObjectMap.calculateThreshold(-1, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  public void testCalculateThreshold_whenOne_thenReturnTen() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(10, objectObjectMap.calculateThreshold(1, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return thirty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  public void testCalculateThreshold_whenThree_thenReturnThirty() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(30, objectObjectMap.calculateThreshold(3, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#calculateThreshold(int, float)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#calculateThreshold(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.calculateThreshold(int, float)"})
  public void testCalculateThreshold_whenZero_thenReturnZero() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.calculateThreshold(0, 10.0f));
  }

  /**
   * Test {@link AbstractHashedMap#clone()}.
   * <p>
   * Method under test: {@link AbstractHashedMap#clone()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"AbstractHashedMap AbstractHashedMap.clone()"})
  public void testClone() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectObjectMap.clone());
  }

  /**
   * Test {@link AbstractHashedMap#convertKey(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link AbstractHashedMap#AbstractHashedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#convertKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractHashedMap.convertKey(Object)"})
  public void testConvertKey_whenNull_thenReturnAbstractHashedMapNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.convertKey(null));
  }

  /**
   * Test {@link AbstractHashedMap#convertKey(Object)}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#convertKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractHashedMap.convertKey(Object)"})
  public void testConvertKey_whenNull_thenReturnNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.convertKey(object));
  }

  /**
   * Test {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}.
   * <p>
   * Method under test: {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"HashEntry AbstractHashedMap.createEntry(HashEntry, int, Object, Object)"})
  public void testCreateEntry() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> next = new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    HashEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next, 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualCreateEntryResult.next, actualCreateEntryResult);
    Object expectedValue = actualCreateEntryResult.key;
    assertSame(expectedValue, next.getValue());
  }

  /**
   * Test {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"HashEntry AbstractHashedMap.createEntry(HashEntry, int, Object, Object)"})
  public void testCreateEntry_whenNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> next = new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    HashEntry<Object, Object> actualCreateEntryResult = objectObjectMap.createEntry(next, 19088743, null,
        AbstractHashedMap.NULL);

    // Assert
    assertEquals(actualCreateEntryResult.next, actualCreateEntryResult);
    Object expectedValue = actualCreateEntryResult.key;
    assertSame(expectedValue, next.getValue());
  }

  /**
   * Test {@link AbstractHashedMap#destroyEntry(HashEntry)}.
   * <p>
   * Method under test: {@link AbstractHashedMap#destroyEntry(HashEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.destroyEntry(HashEntry)"})
  public void testDestroyEntry() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry = new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act
    objectObjectMap.destroyEntry(entry);

    // Assert
    assertNull(entry.getValue());
    assertNull(entry.key);
    assertNull(entry.next);
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@code 0.5}.</li>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readFloat()} return {@code 0.5}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_given05_whenObjectInputStreamReadFloatReturn05()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(0.5f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given nine.</li>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenNine_whenObjectInputStreamReadIntReturnNine()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(9);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>Then {@link AbstractHashedMap#AbstractHashedMap()} {@code null} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenNull_thenAbstractHashedMapNullIsNull() throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(null);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then {@link AbstractHashedMap#AbstractHashedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenOne_thenAbstractHashedMapNull() throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenTwo_whenObjectInputStreamReadIntReturnTwo()
      throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(0.5f);
    when(in.readInt()).thenReturn(2);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractHashedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractHashedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_thenThrowIllegalArgumentException() throws IOException, ClassNotFoundException {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IllegalArgumentException("foo"));
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.doReadObject(in));
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link AbstractHashedMap#entryHashCode(HashEntry)}.
   * <ul>
   *   <li>Then return {@code 19088743}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#entryHashCode(HashEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.entryHashCode(HashEntry)"})
  public void testEntryHashCode_thenReturn19088743() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(19088743, objectObjectMap.entryHashCode(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Test {@link AbstractHashedMap#entryKey(HashEntry)}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#entryKey(HashEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractHashedMap.entryKey(HashEntry)"})
  public void testEntryKey_thenReturnNull() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNull(objectObjectMap
        .entryKey(new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Test {@link AbstractHashedMap#entryNext(HashEntry)}.
   * <p>
   * Method under test: {@link AbstractHashedMap#entryNext(HashEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"HashEntry AbstractHashedMap.entryNext(HashEntry)"})
  public void testEntryNext() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry = new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(entry.next, objectObjectMap.entryNext(entry));
  }

  /**
   * Test {@link AbstractHashedMap#entrySet()}.
   * <p>
   * Method under test: {@link AbstractHashedMap#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractHashedMap.entrySet()"})
  public void testEntrySet() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#entryValue(HashEntry)}.
   * <p>
   * Method under test: {@link AbstractHashedMap#entryValue(HashEntry)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractHashedMap.entryValue(HashEntry)"})
  public void testEntryValue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    HashEntry<Object, Object> entry = new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL,
        AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(entry.key, objectObjectMap.entryValue(entry));
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}, and {@link AbstractHashedMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap#equals(Object)}
   *   <li>{@link AbstractHashedMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.equals(Object)", "int AbstractHashedMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();
    AbstractHashedMap<Object, Object> objectObjectMap2 = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}, and {@link AbstractHashedMap#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractHashedMap#equals(Object)}
   *   <li>{@link AbstractHashedMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.equals(Object)", "int AbstractHashedMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.equals(Object)", "int AbstractHashedMap.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link AbstractHashedMap#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.equals(Object)", "int AbstractHashedMap.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractHashedMap");
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   * <ul>
   *   <li>When {@code 19088743}.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  public void testHashIndex_when19088743_thenReturnTwo() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(2, objectObjectMap.hashIndex(19088743, 3));
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  public void testHashIndex_whenOne_thenReturnZero() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashIndex(1, 3));
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  public void testHashIndex_whenThree_thenReturnTwo() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(2, objectObjectMap.hashIndex(3, 3));
  }

  /**
   * Test {@link AbstractHashedMap#hashIndex(int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#hashIndex(int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractHashedMap.hashIndex(int, int)"})
  public void testHashIndex_whenZero_thenReturnZero() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.hashIndex(0, 3));
  }

  /**
   * Test {@link AbstractHashedMap#isEmpty()}.
   * <p>
   * Method under test: {@link AbstractHashedMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.isEmpty()"})
  public void testIsEmpty() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#isEqualKey(Object, Object)}.
   * <ul>
   *   <li>When four.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#isEqualKey(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualKey(Object, Object)"})
  public void testIsEqualKey_whenFour_thenReturnFalse() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualKey(4, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#isEqualKey(Object, Object)}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#isEqualKey(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualKey(Object, Object)"})
  public void testIsEqualKey_whenNull_thenReturnTrue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualKey(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#isEqualValue(Object, Object)}.
   * <ul>
   *   <li>When forty-two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#isEqualValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualValue(Object, Object)"})
  public void testIsEqualValue_whenFortyTwo_thenReturnFalse() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isEqualValue(42, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#isEqualValue(Object, Object)}.
   * <ul>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractHashedMap#isEqualValue(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractHashedMap.isEqualValue(Object, Object)"})
  public void testIsEqualValue_whenNull_thenReturnTrue() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEqualValue(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractHashedMap#keySet()}.
   * <p>
   * Method under test: {@link AbstractHashedMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractHashedMap.keySet()"})
  public void testKeySet() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractHashedMap#toString()}.
   * <p>
   * Method under test: {@link AbstractHashedMap#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractHashedMap.toString()"})
  public void testToString() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link AbstractHashedMap#values()}.
   * <p>
   * Method under test: {@link AbstractHashedMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection AbstractHashedMap.values()"})
  public void testValues() {
    // Arrange
    AbstractHashedMap<Object, Object> objectObjectMap = new AbstractHashedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test Values {@link Values#Values(AbstractHashedMap)}.
   * <p>
   * Method under test: {@link Values#Values(AbstractHashedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Values.<init>(AbstractHashedMap)"})
  public void testValuesNewValues() {
    // Arrange and Act
    Values<Object> actualValues = new Values<>(new AbstractHashedMap<>());

    // Assert
    assertTrue(actualValues.isEmpty());
  }
}
