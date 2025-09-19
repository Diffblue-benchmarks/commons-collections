package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntry;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceEntrySetIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceKeySetIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceMapIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceValuesIterator;
import org.apache.commons.collections4.map.AbstractReferenceMap.SoftRef;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractReferenceMapDiffblueTest {
  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()} {@link AbstractHashedMap#NULL}
   *       is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given ReferenceIdentityMap() NULL is NULL; when NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given ReferenceIdentityMap(); when NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey_givenReferenceIdentityMap_whenNull_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); given ReferenceIdentityMap(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey_givenReferenceIdentityMap_whenNull_thenReturnFalse2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link AbstractReferenceMap#containsKey(Object)}.
   *
   * <ul>
   *   <li>When {@link WeakReference#WeakReference(Object, ReferenceQueue)} with {@link
   *       AbstractHashedMap#NULL} and {@link ReferenceQueue} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#containsKey(Object)}
   */
  @Test
  @DisplayName(
      "Test containsKey(Object); when WeakReference(Object, ReferenceQueue) with NULL and ReferenceQueue (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.containsKey(Object)"})
  void testContainsKey_whenWeakReferenceWithNullAndReferenceQueue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    WeakReference<Object> weakReference =
        new WeakReference<>(AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act
    boolean actualContainsKeyResult = objectObjectMap.containsKey(weakReference);

    // Assert
    assertFalse(actualContainsKeyResult);
  }

  /**
   * Test {@link AbstractReferenceMap#createEntry(HashEntry, int, Object, Object)}.
   *
   * <p>Method under test: {@link AbstractReferenceMap#createEntry(HashEntry, int, Object, Object)}
   */
  @Test
  @DisplayName("Test createEntry(HashEntry, int, Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ReferenceEntry AbstractReferenceMap.createEntry(HashEntry, int, Object, Object)"
  })
  void testCreateEntry() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    ReferenceEntry<Object, Object> actualCreateEntryResult =
        objectObjectMap.createEntry(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    HashEntry<Object, Object> hashEntry = actualCreateEntryResult.next;
    assertNull(hashEntry.getKey());
    assertEquals(19088743, actualCreateEntryResult.hashCode);
    assertEquals(19088743, hashEntry.hashCode);
    Object object = actualCreateEntryResult.key;
    assertSame(object, next.getValue());
    assertSame(object, hashEntry.getValue());
    assertSame(object, actualCreateEntryResult.getKey());
    assertSame(object, actualCreateEntryResult.getValue());
    assertSame(object, hashEntry.key);
    assertSame(next.next, hashEntry.next);
  }

  /**
   * Test {@link AbstractReferenceMap#createEntrySetIterator()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#createEntrySetIterator()}
   */
  @Test
  @DisplayName("Test createEntrySetIterator(); given ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractReferenceMap.createEntrySetIterator()"})
  void testCreateEntrySetIterator_givenReferenceIdentityMap() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Iterator<Entry<Object, Object>> actualCreateEntrySetIteratorResult =
        objectObjectMap.createEntrySetIterator();

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof ReferenceEntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractReferenceMap#createKeySetIterator()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#createKeySetIterator()}
   */
  @Test
  @DisplayName("Test createKeySetIterator(); given ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractReferenceMap.createKeySetIterator()"})
  void testCreateKeySetIterator_givenReferenceIdentityMap() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof ReferenceKeySetIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractReferenceMap#createKeySetIterator()}.
   *
   * <ul>
   *   <li>Then return next is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#createKeySetIterator()}
   */
  @Test
  @DisplayName("Test createKeySetIterator(); then return next is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractReferenceMap.createKeySetIterator()"})
  void testCreateKeySetIterator_thenReturnNextIsNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator();

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof ReferenceKeySetIterator);
    Object actualNextResult = actualCreateKeySetIteratorResult.next();
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }

  /**
   * Test {@link AbstractReferenceMap#createValuesIterator()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#createValuesIterator()}
   */
  @Test
  @DisplayName("Test createValuesIterator(); given ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractReferenceMap.createValuesIterator()"})
  void testCreateValuesIterator_givenReferenceIdentityMap() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator();

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof ReferenceValuesIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractReferenceMap#createValuesIterator()}.
   *
   * <ul>
   *   <li>Then return next is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#createValuesIterator()}
   */
  @Test
  @DisplayName("Test createValuesIterator(); then return next is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractReferenceMap.createValuesIterator()"})
  void testCreateValuesIterator_thenReturnNextIsNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator();

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof ReferenceValuesIterator);
    Object actualNextResult = actualCreateValuesIteratorResult.next();
    assertFalse(actualCreateValuesIteratorResult.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }

  /**
   * Test {@link AbstractReferenceMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then calls {@link ObjectInputStream#readBoolean()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given 'null'; then calls readBoolean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractReferenceMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenNull_thenCallsReadBoolean()
      throws IOException, ClassNotFoundException {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readBoolean()).thenReturn(true);
    when(in.readObject()).thenReturn(null);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readBoolean();
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link AbstractReferenceMap#entrySet()}.
   *
   * <p>Method under test: {@link AbstractReferenceMap#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractReferenceMap.entrySet()"})
  void testEntrySet() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractReferenceMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()} {@link AbstractHashedMap#NULL}
   *       is {@link AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object); given ReferenceIdentityMap() NULL is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractReferenceMap.get(Object)"})
  void testGet_givenReferenceIdentityMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link AbstractReferenceMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given ReferenceIdentityMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractReferenceMap.get(Object)"})
  void testGet_givenReferenceIdentityMap_whenNull_thenReturnNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link AbstractReferenceMap#get(Object)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object); given ReferenceIdentityMap(); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractReferenceMap.get(Object)"})
  void testGet_givenReferenceIdentityMap_whenNull_thenReturnNull2() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link AbstractReferenceMap#get(Object)}.
   *
   * <ul>
   *   <li>When {@link SoftRef#SoftRef(int, Object, ReferenceQueue)} with hash is {@code 19088743}
   *       and r is {@link AbstractHashedMap#NULL} and q is {@link ReferenceQueue} (default
   *       constructor).
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object); when SoftRef(int, Object, ReferenceQueue) with hash is '19088743' and r is NULL and q is ReferenceQueue (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractReferenceMap.get(Object)"})
  void testGet_whenSoftRefWithHashIs19088743AndRIsNullAndQIsReferenceQueue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    SoftRef<Object> softRef =
        new SoftRef<>(19088743, AbstractHashedMap.NULL, new ReferenceQueue<>());

    // Act
    Object actualGetResult = objectObjectMap.get(softRef);

    // Assert
    assertNull(actualGetResult);
  }

  /**
   * Test {@link AbstractReferenceMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()} {@link AbstractHashedMap#NULL}
   *       is {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ReferenceIdentityMap() NULL is NULL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.isEmpty()"})
  void testIsEmpty_givenReferenceIdentityMapNullIsNull_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractReferenceMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given ReferenceIdentityMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.isEmpty()"})
  void testIsEmpty_givenReferenceIdentityMap_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractReferenceMap#isKeyType(ReferenceStrength)}.
   *
   * <ul>
   *   <li>When {@code HARD}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#isKeyType(ReferenceStrength)}
   */
  @Test
  @DisplayName("Test isKeyType(ReferenceStrength); when 'HARD'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.isKeyType(ReferenceStrength)"})
  void testIsKeyType_whenHard_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isKeyType(ReferenceStrength.HARD));
  }

  /**
   * Test {@link AbstractReferenceMap#isKeyType(ReferenceStrength)}.
   *
   * <ul>
   *   <li>When {@code SOFT}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#isKeyType(ReferenceStrength)}
   */
  @Test
  @DisplayName("Test isKeyType(ReferenceStrength); when 'SOFT'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.isKeyType(ReferenceStrength)"})
  void testIsKeyType_whenSoft_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isKeyType(ReferenceStrength.SOFT));
  }

  /**
   * Test {@link AbstractReferenceMap#isValueType(ReferenceStrength)}.
   *
   * <ul>
   *   <li>When {@code HARD}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#isValueType(ReferenceStrength)}
   */
  @Test
  @DisplayName("Test isValueType(ReferenceStrength); when 'HARD'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.isValueType(ReferenceStrength)"})
  void testIsValueType_whenHard_thenReturnFalse() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isValueType(ReferenceStrength.HARD));
  }

  /**
   * Test {@link AbstractReferenceMap#isValueType(ReferenceStrength)}.
   *
   * <ul>
   *   <li>When {@code SOFT}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#isValueType(ReferenceStrength)}
   */
  @Test
  @DisplayName("Test isValueType(ReferenceStrength); when 'SOFT'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractReferenceMap.isValueType(ReferenceStrength)"})
  void testIsValueType_whenSoft_thenReturnTrue() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isValueType(ReferenceStrength.SOFT));
  }

  /**
   * Test {@link AbstractReferenceMap#keySet()}.
   *
   * <p>Method under test: {@link AbstractReferenceMap#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractReferenceMap.keySet()"})
  void testKeySet() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractReferenceMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#mapIterator()}
   */
  @Test
  @DisplayName("Test mapIterator(); given ReferenceIdentityMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractReferenceMap.mapIterator()"})
  void testMapIterator_givenReferenceIdentityMap() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof ReferenceMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractReferenceMap#mapIterator()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceIdentityMap#ReferenceIdentityMap()} {@link AbstractHashedMap#NULL}
   *       is {@link AbstractHashedMap#NULL}.
   *   <li>Then return next is {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractReferenceMap#mapIterator()}
   */
  @Test
  @DisplayName(
      "Test mapIterator(); given ReferenceIdentityMap() NULL is NULL; then return next is NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractReferenceMap.mapIterator()"})
  void testMapIterator_givenReferenceIdentityMapNullIsNull_thenReturnNextIsNull() {
    // Arrange
    ReferenceIdentityMap<Object, Object> objectObjectMap = new ReferenceIdentityMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof ReferenceMapIterator);
    Object actualNextResult = actualMapIteratorResult.next();
    assertFalse(actualMapIteratorResult.hasNext());
    assertSame(AbstractHashedMap.NULL, actualNextResult);
  }
}
