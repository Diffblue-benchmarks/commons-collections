package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator;
import org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractDualBidiMapDiffblueTest {
  /**
   * Test BidiMapIterator {@link BidiMapIterator#getKey()}.
   * <p>
   * Method under test: {@link BidiMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiMapIterator.getKey()"})
  public void testBidiMapIteratorGetKey() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.getKey());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#getValue()}.
   * <p>
   * Method under test: {@link BidiMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiMapIterator.getValue()"})
  public void testBidiMapIteratorGetValue() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.getValue());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BidiMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BidiMapIterator.hasNext()"})
  public void testBidiMapIteratorHasNext_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(parent);

    // Act and Assert
    assertTrue(bidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BidiMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean BidiMapIterator.hasNext()"})
  public void testBidiMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertFalse(bidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#BidiMapIterator(AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link BidiMapIterator#BidiMapIterator(AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BidiMapIterator.<init>(AbstractDualBidiMap)"})
  public void testBidiMapIteratorNewBidiMapIterator() {
    // Arrange and Act
    BidiMapIterator<Object, Object> actualBidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Assert
    assertFalse(actualBidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#next()}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BidiMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiMapIterator.next()"})
  public void testBidiMapIteratorNext_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(parent);

    // Act and Assert
    assertEquals("Key", bidiMapIterator.next());
    assertFalse(bidiMapIterator.hasNext());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#remove()}.
   * <p>
   * Method under test: {@link BidiMapIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BidiMapIterator.remove()"})
  public void testBidiMapIteratorRemove() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.remove());
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link BidiMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object BidiMapIterator.setValue(Object)"})
  public void testBidiMapIteratorSetValue() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bidiMapIterator.setValue("Value"));
  }

  /**
   * Test BidiMapIterator {@link BidiMapIterator#toString()}.
   * <p>
   * Method under test: {@link BidiMapIterator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String BidiMapIterator.toString()"})
  public void testBidiMapIteratorToString() {
    // Arrange
    BidiMapIterator<Object, Object> bidiMapIterator = new BidiMapIterator<>(new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", bidiMapIterator.toString());
  }

  /**
   * Test {@link AbstractDualBidiMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsKey(Object)"})
  public void testContainsKey_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertTrue(objectObjectMap.containsKey("Key"));
  }

  /**
   * Test {@link AbstractDualBidiMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsKey(Object)"})
  public void testContainsKey_givenDualHashBidiMap_thenReturnFalse() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey("Key"));
  }

  /**
   * Test {@link AbstractDualBidiMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsValue(Object)"})
  public void testContainsValue_givenDualHashBidiMapKeyIsValue_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertTrue(objectObjectMap.containsValue("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.containsValue(Object)"})
  public void testContainsValue_givenDualHashBidiMap_thenReturnFalse() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#createEntrySetIterator(Iterator)}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#createEntrySetIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractDualBidiMap.createEntrySetIterator(Iterator)"})
  public void testCreateEntrySetIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();

    // Act
    Iterator<Entry<Object, Object>> actualCreateEntrySetIteratorResult = objectObjectMap
        .createEntrySetIterator(entryList.iterator());

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof EntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#createKeySetIterator(Iterator)}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#createKeySetIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractDualBidiMap.createKeySetIterator(Iterator)"})
  public void testCreateKeySetIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCreateKeySetIteratorResult = objectObjectMap.createKeySetIterator(objectList.iterator());

    // Assert
    assertTrue(actualCreateKeySetIteratorResult instanceof KeySetIterator);
    assertFalse(actualCreateKeySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#createValuesIterator(Iterator)}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#createValuesIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractDualBidiMap.createValuesIterator(Iterator)"})
  public void testCreateValuesIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCreateValuesIteratorResult = objectObjectMap.createValuesIterator(objectList.iterator());

    // Assert
    assertTrue(actualCreateValuesIteratorResult instanceof ValuesIterator);
    assertFalse(actualCreateValuesIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#entrySet()}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractDualBidiMap.entrySet()"})
  public void testEntrySet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(Iterator, AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link EntrySetIterator#EntrySetIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetIterator.<init>(Iterator, AbstractDualBidiMap)"})
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange
    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();
    Iterator<Entry<Object, Object>> iterator = entryList.iterator();

    // Act
    EntrySetIterator<Object, Object> actualEntrySetIterator = new EntrySetIterator<>(iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#remove()}.
   * <p>
   * Method under test: {@link EntrySetIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetIterator.remove()"})
  public void testEntrySetIteratorRemove() {
    // Arrange
    ArrayList<Entry<Object, Object>> entryList = new ArrayList<>();
    Iterator<Entry<Object, Object>> iterator = entryList.iterator();
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test EntrySet {@link EntrySet#EntrySet(AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link EntrySet#EntrySet(AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySet.<init>(AbstractDualBidiMap)"})
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object, Object> actualObjectSet = new EntrySet<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}, and {@link AbstractDualBidiMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.equals(Object)", "int AbstractDualBidiMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    DualHashBidiMap<Object, Object> objectObjectMap2 = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}, and {@link AbstractDualBidiMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.equals(Object)", "int AbstractDualBidiMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    DualHashBidiMap<Object, Object> objectObjectMap2 = new DualHashBidiMap<>();
    objectObjectMap2.put("Key", "Value");

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}, and {@link AbstractDualBidiMap#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractDualBidiMap#equals(Object)}
   *   <li>{@link AbstractDualBidiMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.equals(Object)", "int AbstractDualBidiMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.equals(Object)", "int AbstractDualBidiMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertNotEquals(objectObjectMap, new DualHashBidiMap<>());
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.equals(Object)", "int AbstractDualBidiMap.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link AbstractDualBidiMap#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.equals(Object)", "int AbstractDualBidiMap.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to AbstractDualBidiMap");
  }

  /**
   * Test {@link AbstractDualBidiMap#get(Object)}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.get(Object)"})
  public void testGet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get("Key"));
  }

  /**
   * Test {@link AbstractDualBidiMap#getKey(Object)}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#getKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.getKey(Object)"})
  public void testGetKey() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.getKey("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.isEmpty()"})
  public void testIsEmpty_givenDualHashBidiMapKeyIsValue_thenReturnFalse() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractDualBidiMap.isEmpty()"})
  public void testIsEmpty_givenDualHashBidiMap_thenReturnTrue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#keySet()}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractDualBidiMap.keySet()"})
  public void testKeySet() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#KeySetIterator(Iterator, AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link KeySetIterator#KeySetIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySetIterator.<init>(Iterator, AbstractDualBidiMap)"})
  public void testKeySetIteratorNewKeySetIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    KeySetIterator<Object> actualKeySetIterator = new KeySetIterator<>(iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  public void testKeySetIteratorNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act
    Object actualNextResult = keySetIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(keySetIterator.lastKey, actualNextResult);
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#remove()}.
   * <p>
   * Method under test: {@link KeySetIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySetIterator.remove()"})
  public void testKeySetIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> keySetIterator.remove());
  }

  /**
   * Test KeySet {@link KeySet#KeySet(AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link KeySet#KeySet(AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySet.<init>(AbstractDualBidiMap)"})
  public void testKeySetNewKeySet() {
    // Arrange and Act
    KeySet<Object> actualObjectSet = new KeySet<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test MapEntry {@link MapEntry#MapEntry(Entry, AbstractDualBidiMap)}.
   * <ul>
   *   <li>Then return {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code 42} and {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapEntry#MapEntry(Entry, AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MapEntry.<init>(Entry, AbstractDualBidiMap)"})
  public void testMapEntryNewMapEntry_thenReturnSimpleEntryWith42And42() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    // Act and Assert
    assertEquals(entry, new MapEntry<>(entry, new DualHashBidiMap<>()));
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  public void testMapEntrySetValue() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    MapEntry<Object, Object> entry2 = new MapEntry<>(entry, new DualHashBidiMap<>());

    MapEntry<Object, Object> mapEntry = new MapEntry<>(entry2, new DualHashBidiMap<>());

    // Act
    mapEntry.setValue("Value");

    // Assert
    AbstractDualBidiMap<Object, Object> objectObjectMap = mapEntry.parent;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("42"));
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code 42} is {@code Value}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  public void testMapEntrySetValue_givenDualHashBidiMap42IsValue_thenReturn42() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("42", "Value");
    MapEntry<Object, Object> mapEntry = new MapEntry<>(new SimpleEntry<>("42", "42"), parent);

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    AbstractDualBidiMap<Object, Object> objectObjectMap = mapEntry.parent;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("42"));
    assertEquals("Value", mapEntry.getValue());
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   * <ul>
   *   <li>Given {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code 42} and {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  public void testMapEntrySetValue_givenSimpleEntryWith42And42_thenReturn42() {
    // Arrange
    SimpleEntry<Object, Object> entry = new SimpleEntry<>("42", "42");

    MapEntry<Object, Object> mapEntry = new MapEntry<>(entry, new DualHashBidiMap<>());

    // Act and Assert
    assertEquals("42", mapEntry.setValue("Value"));
    AbstractDualBidiMap<Object, Object> objectObjectMap = mapEntry.parent;
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("42"));
    assertEquals("Value", mapEntry.getValue());
  }

  /**
   * Test MapEntry {@link MapEntry#setValue(Object)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object MapEntry.setValue(Object)"})
  public void testMapEntrySetValue_thenThrowIllegalArgumentException() {
    // Arrange
    DualHashBidiMap<Object, Object> parent = new DualHashBidiMap<>();
    parent.put("Key", "Value");
    MapEntry<Object, Object> mapEntry = new MapEntry<>(new SimpleEntry<>("42", "42"), parent);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> mapEntry.setValue("Value"));
  }

  /**
   * Test {@link AbstractDualBidiMap#mapIterator()}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator AbstractDualBidiMap.mapIterator()"})
  public void testMapIterator() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = objectObjectMap.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof BidiMapIterator);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractDualBidiMap#put(Object, Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.put(Object, Object)"})
  public void testPut_givenDualHashBidiMapKeyIsValue_thenReturnValue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertEquals("Value", actualPutResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#put(Object, Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} one is {@code Value}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.put(Object, Object)"})
  public void testPut_givenDualHashBidiMapOneIsValue_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put(1, "Value");

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#put(Object, Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.put(Object, Object)"})
  public void testPut_givenDualHashBidiMap_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act
    Object actualPutResult = objectObjectMap.put("Key", "Value");

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("Value", objectObjectMap.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} IfAbsent {@code 42} is {@code 42}.</li>
   *   <li>Then {@link HashMap#HashMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  public void testPutAll_givenDualHashBidiMapIfAbsent42Is42_thenHashMapSizeIsOne() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.putIfAbsent("42", "42");

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(1, map.size());
    assertTrue(map.containsKey("42"));
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then {@link HashMap#HashMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  public void testPutAll_givenDualHashBidiMap_whenHashMap42Is42_thenHashMapSizeIsOne() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(1, map.size());
    assertTrue(map.containsKey("42"));
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link DualHashBidiMap#DualHashBidiMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  public void testPutAll_givenDualHashBidiMap_whenHashMap_thenDualHashBidiMapEmpty() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    objectObjectMap.putAll(map);

    // Assert that nothing has changed
    assertTrue(objectObjectMap.isEmpty());
    assertEquals(objectObjectMap, map);
  }

  /**
   * Test {@link AbstractDualBidiMap#putAll(Map)}.
   * <ul>
   *   <li>Given forty-two.</li>
   *   <li>When {@link HashMap#HashMap()} forty-two is {@code 42}.</li>
   *   <li>Then {@link HashMap#HashMap()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractDualBidiMap.putAll(Map)"})
  public void testPutAll_givenFortyTwo_whenHashMapFortyTwoIs42_thenHashMapSizeIsTwo() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put(42, "42");
    map.put("42", "42");

    // Act
    objectObjectMap.putAll(map);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertEquals("42", objectObjectMap.get("42"));
    assertEquals(2, map.size());
    assertTrue(map.containsKey("42"));
    assertTrue(map.containsKey(42));
  }

  /**
   * Test {@link AbstractDualBidiMap#remove(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.remove(Object)"})
  public void testRemoveWithObject_givenDualHashBidiMapKeyIsValue_thenReturnValue() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Value", objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#remove(Object)} with {@code Object}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.remove(Object)"})
  public void testRemoveWithObject_givenDualHashBidiMap_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.remove("Key"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#removeValue(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#removeValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.removeValue(Object)"})
  public void testRemoveValue_givenDualHashBidiMapKeyIsValue_thenReturnKey() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();
    objectObjectMap.put("Key", "Value");

    // Act and Assert
    assertEquals("Key", objectObjectMap.removeValue("Value"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#removeValue(Object)}.
   * <ul>
   *   <li>Given {@link DualHashBidiMap#DualHashBidiMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractDualBidiMap#removeValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractDualBidiMap.removeValue(Object)"})
  public void testRemoveValue_givenDualHashBidiMap_thenReturnNull() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertNull(objectObjectMap.removeValue("Value"));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link AbstractDualBidiMap#size()}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractDualBidiMap.size()"})
  public void testSize() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link AbstractDualBidiMap#toString()}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractDualBidiMap.toString()"})
  public void testToString() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link AbstractDualBidiMap#values()}.
   * <p>
   * Method under test: {@link AbstractDualBidiMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractDualBidiMap.values()"})
  public void testValues() {
    // Arrange
    DualHashBidiMap<Object, Object> objectObjectMap = new DualHashBidiMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#ValuesIterator(Iterator, AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link ValuesIterator#ValuesIterator(Iterator, AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ValuesIterator.<init>(Iterator, AbstractDualBidiMap)"})
  public void testValuesIteratorNewValuesIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    ValuesIterator<Object> actualValuesIterator = new ValuesIterator<>(iterator, new DualHashBidiMap<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  public void testValuesIteratorNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(iterator, new DualHashBidiMap<>());

    // Act
    Object actualNextResult = valuesIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(valuesIterator.lastValue, actualNextResult);
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#remove()}.
   * <p>
   * Method under test: {@link ValuesIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ValuesIterator.remove()"})
  public void testValuesIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(iterator, new DualHashBidiMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> valuesIterator.remove());
  }

  /**
   * Test Values {@link Values#Values(AbstractDualBidiMap)}.
   * <p>
   * Method under test: {@link Values#Values(AbstractDualBidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Values.<init>(AbstractDualBidiMap)"})
  public void testValuesNewValues() {
    // Arrange and Act
    Values<Object> actualObjectSet = new Values<>(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test View {@link View#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link View} {@link View#removeAll(Collection)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link View#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean View.removeAll(Collection)"})
  public void testViewRemoveAll_givenViewRemoveAllReturnFalse() {
    // Arrange
    View<Object, Object, Entry<Object, Object>> view = mock(View.class);
    when(view.removeAll(Mockito.<Collection<Object>>any())).thenReturn(false);

    // Act
    view.removeAll(new ArrayList<>());

    // Assert
    verify(view).removeAll(isA(Collection.class));
  }

  /**
   * Test View {@link View#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link View} {@link View#removeAll(Collection)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link View#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean View.removeAll(Collection)"})
  public void testViewRemoveAll_givenViewRemoveAllReturnTrue() {
    // Arrange
    View<Object, Object, Entry<Object, Object>> view = mock(View.class);
    when(view.removeAll(Mockito.<Collection<Object>>any())).thenReturn(true);

    // Act
    view.removeAll(new ArrayList<>());

    // Assert
    verify(view).removeAll(isA(Collection.class));
  }

  /**
   * Test View {@link View#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link View} {@link View#removeIf(Predicate)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link View#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean View.removeIf(Predicate)"})
  public void testViewRemoveIf_givenViewRemoveIfReturnFalse() {
    // Arrange
    View<Object, Object, Entry<Object, Object>> view = mock(View.class);
    when(view.removeIf(Mockito.<Predicate<Entry<Object, Object>>>any())).thenReturn(false);

    // Act
    view.removeIf(mock(Predicate.class));

    // Assert
    verify(view).removeIf(isA(Predicate.class));
  }

  /**
   * Test View {@link View#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link View} {@link View#removeIf(Predicate)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link View#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean View.removeIf(Predicate)"})
  public void testViewRemoveIf_givenViewRemoveIfReturnTrue() {
    // Arrange
    View<Object, Object, Entry<Object, Object>> view = mock(View.class);
    when(view.removeIf(Mockito.<Predicate<Entry<Object, Object>>>any())).thenReturn(true);

    // Act
    view.removeIf(mock(Predicate.class));

    // Assert
    verify(view).removeIf(isA(Predicate.class));
  }

  /**
   * Test View {@link View#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link View} {@link View#retainAll(Collection)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link View#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean View.retainAll(Collection)"})
  public void testViewRetainAll_givenViewRetainAllReturnFalse() {
    // Arrange
    View<Object, Object, Entry<Object, Object>> view = mock(View.class);
    when(view.retainAll(Mockito.<Collection<Object>>any())).thenReturn(false);

    // Act
    view.retainAll(new ArrayList<>());

    // Assert
    verify(view).retainAll(isA(Collection.class));
  }

  /**
   * Test View {@link View#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@link View} {@link View#retainAll(Collection)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link View#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean View.retainAll(Collection)"})
  public void testViewRetainAll_givenViewRetainAllReturnTrue() {
    // Arrange
    View<Object, Object, Entry<Object, Object>> view = mock(View.class);
    when(view.retainAll(Mockito.<Collection<Object>>any())).thenReturn(true);

    // Act
    view.retainAll(new ArrayList<>());

    // Assert
    verify(view).retainAll(isA(Collection.class));
  }
}
