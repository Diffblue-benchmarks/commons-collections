package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiValuedMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractMultiValuedMapDiffblueTest {
  /**
   * Test {@link AbstractMultiValuedMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsKey(Object)"})
  public void testContainsKey_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertTrue(arrayListValuedHashMap.containsKey("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsKey(Object)"})
  public void testContainsKey_givenArrayListValuedHashMap_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsKey("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#containsMapping(Object, Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is forty-two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsMapping(Object, Object)"})
  public void testContainsMapping_givenArrayListValuedHashMapKeyIsFortyTwo_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", 42);

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsMapping("Key", "Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#containsMapping(Object, Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsMapping(Object, Object)"})
  public void testContainsMapping_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertTrue(arrayListValuedHashMap.containsMapping("Key", "Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#containsMapping(Object, Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsMapping(Object, Object)"})
  public void testContainsMapping_givenArrayListValuedHashMap_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsMapping("Key", "Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsValue(Object)"})
  public void testContainsValue_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertTrue(arrayListValuedHashMap.containsValue("Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsValue(Object)"})
  public void testContainsValue_givenArrayListValuedHashMap_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertFalse(arrayListValuedHashMap.containsValue("Value"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@link IOException#IOException(String)} with {@code foo}.</li>
   *   <li>Then throw {@link IOException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMultiValuedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenIOExceptionWithFoo_thenThrowIOException()
      throws IOException, ClassNotFoundException {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IOException("foo"));
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IOException.class, () -> arrayListValuedHashMap.doReadObject(in));
    verify(in).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link AbstractMultiValuedMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMultiValuedMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_thenArrayListValuedHashMapMapSizeIsOne() throws IOException, ClassNotFoundException {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("Object");
    when(in.readInt()).thenReturn(1);

    // Act
    arrayListValuedHashMap.doReadObject(in);

    // Assert
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    List<Object> getResult = map.get("Object");
    assertEquals(1, getResult.size());
    assertEquals("Object", getResult.get(0));
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#entries()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#entries()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.entries()"})
  public void testEntries() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.entries().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#equals(Object)}, and {@link AbstractMultiValuedMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap2 = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedHashMap2);
    int expectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertEquals(expectedHashCodeResult, arrayListValuedHashMap2.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMap#equals(Object)}, and {@link AbstractMultiValuedMap#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ArrayListValuedLinkedHashMap<Object, Object> arrayListValuedLinkedHashMap = mock(
        ArrayListValuedLinkedHashMap.class);
    when(arrayListValuedLinkedHashMap.asMap()).thenReturn(new HashMap<>());

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedLinkedHashMap);
    int notExpectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertNotEquals(notExpectedHashCodeResult, arrayListValuedLinkedHashMap.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMap#equals(Object)}, and {@link AbstractMultiValuedMap#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMultiValuedMap#equals(Object)}
   *   <li>{@link AbstractMultiValuedMap#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(arrayListValuedHashMap, arrayListValuedHashMap);
    int expectedHashCodeResult = arrayListValuedHashMap.hashCode();
    assertEquals(expectedHashCodeResult, arrayListValuedHashMap.hashCode());
  }

  /**
   * Test {@link AbstractMultiValuedMap#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, new ArrayListValuedHashMap<>());
  }

  /**
   * Test {@link AbstractMultiValuedMap#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, null);
  }

  /**
   * Test {@link AbstractMultiValuedMap#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertNotEquals(arrayListValuedHashMap, "Different type to AbstractMultiValuedMap");
  }

  /**
   * Test {@link AbstractMultiValuedMap#get(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.get(Object)"})
  public void testGet() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualGetResult = arrayListValuedHashMap.get("Key");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(actualGetResult.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#getMap()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#getMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map AbstractMultiValuedMap.getMap()"})
  public void testGetMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.isEmpty()"})
  public void testIsEmpty_givenArrayListValuedHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertFalse(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#isEmpty()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.isEmpty()"})
  public void testIsEmpty_givenArrayListValuedHashMap_thenReturnTrue() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#keys()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet AbstractMultiValuedMap.keys()"})
  public void testKeys() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.keys().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#keySet()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMap.keySet()"})
  public void testKeySet() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#mapIterator()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return next is {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator AbstractMultiValuedMap.mapIterator()"})
  public void testMapIterator_givenArrayListValuedHashMapKeyIsValue_thenReturnNextIsKey() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = arrayListValuedHashMap.mapIterator();

    // Assert
    assertEquals("Key", actualMapIteratorResult.next());
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractMultiValuedMap#put(Object, Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map {@code Key} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.put(Object, Object)"})
  public void testPut_givenArrayListValuedHashMap_thenArrayListValuedHashMapMapKeySizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    arrayListValuedHashMap.put("Key", "Value");

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    List<Object> getResult = map.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#put(Object, Object)}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map {@code Key} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#put(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.put(Object, Object)"})
  public void testPut_thenArrayListValuedHashMapMapKeySizeIsTwo() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    arrayListValuedHashMap.put("Key", "Value");

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    List<Object> getResult = map.get("Key");
    assertEquals(2, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals("Value", getResult.get(1));
    assertEquals(2, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(Map)} with {@code Map}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map {@code 42} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Map)"})
  public void testPutAllWithMap_thenArrayListValuedHashMapMap42SizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    arrayListValuedHashMap.putAll(map);

    // Assert
    Map<Object, List<Object>> map2 = arrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(Map)} with {@code Map}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map {@code 42} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Map)"})
  public void testPutAllWithMap_thenArrayListValuedHashMapMap42SizeIsTwo() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("42", "Value");

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act
    arrayListValuedHashMap.putAll(map);

    // Assert
    Map<Object, List<Object>> map2 = arrayListValuedHashMap.getMap();
    assertEquals(1, map2.size());
    List<Object> getResult = map2.get("42");
    assertEquals(2, getResult.size());
    assertEquals("42", getResult.get(1));
    assertEquals(2, arrayListValuedHashMap.size());
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(Map)} with {@code Map}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Map)"})
  public void testPutAllWithMap_whenHashMap_thenArrayListValuedHashMapSizeIsZero() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(new HashMap<>());

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(MultiValuedMap)"})
  public void testPutAllWithMultiValuedMap_thenArrayListValuedHashMapSizeIsZero() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    UnmodifiableMultiValuedMap<?, ?> map = UnmodifiableMultiValuedMap
        .unmodifiableMultiValuedMap(new ArrayListValuedHashMap<>());

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
    assertEquals(arrayListValuedHashMap, map);
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(MultiValuedMap)} with {@code MultiValuedMap}.
   * <ul>
   *   <li>When {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(MultiValuedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(MultiValuedMap)"})
  public void testPutAllWithMultiValuedMap_whenArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
    assertEquals(arrayListValuedHashMap, map);
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code Iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Object, Iterable)"})
  public void testPutAllWithObjectIterable_given42_thenArrayListValuedHashMapMapSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll("Key", values);

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualPutAllResult);
    assertEquals(values, map.get("Key"));
  }

  /**
   * Test {@link AbstractMultiValuedMap#putAll(Object, Iterable)} with {@code Object}, {@code Iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#putAll(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Object, Iterable)"})
  public void testPutAllWithObjectIterable_whenArrayList_thenArrayListValuedHashMapSizeIsZero() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll("Key", new ArrayList<>());

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.remove(Object)"})
  public void testRemove_givenArrayListValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertEquals(1, actualRemoveResult.size());
    assertEquals("Value", ((List<Object>) actualRemoveResult).get(0));
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.remove(Object)"})
  public void testRemove_givenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertTrue(actualRemoveResult instanceof List);
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(actualRemoveResult.isEmpty());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#removeMapping(Object, Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.removeMapping(Object, Object)"})
  public void testRemoveMapping_givenArrayListValuedHashMap_thenReturnFalse() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    boolean actualRemoveMappingResult = arrayListValuedHashMap.removeMapping("Key", "Value");

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualRemoveMappingResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#removeMapping(Object, Object)}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} Map size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.removeMapping(Object, Object)"})
  public void testRemoveMapping_thenArrayListValuedHashMapMapSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    boolean actualRemoveMappingResult = arrayListValuedHashMap.removeMapping("Key", "Value");

    // Assert
    Map<Object, List<Object>> map = arrayListValuedHashMap.getMap();
    assertEquals(1, map.size());
    assertEquals(1, map.get("Key").size());
    assertEquals(1, arrayListValuedHashMap.size());
    assertFalse(arrayListValuedHashMap.isEmpty());
    assertTrue(actualRemoveMappingResult);
  }

  /**
   * Test {@link AbstractMultiValuedMap#removeMapping(Object, Object)}.
   * <ul>
   *   <li>Then {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} size is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#removeMapping(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.removeMapping(Object, Object)"})
  public void testRemoveMapping_thenArrayListValuedHashMapSizeIsZero() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    boolean actualRemoveMappingResult = arrayListValuedHashMap.removeMapping("Key", "Value");

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
    assertTrue(actualRemoveMappingResult);
  }

  /**
   * Test {@link AbstractMultiValuedMap#setMap(Map)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#setMap(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMultiValuedMap.setMap(Map)"})
  public void testSetMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    HashMap<Object, Collection<Object>> map = new HashMap<>();

    // Act
    arrayListValuedHashMap.setMap(map);

    // Assert
    assertSame(map, arrayListValuedHashMap.getMap());
  }

  /**
   * Test {@link AbstractMultiValuedMap#size()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiValuedMap.size()"})
  public void testSize_givenArrayListValuedHashMapKeyIsValue_thenReturnOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act and Assert
    assertEquals(1, arrayListValuedHashMap.size());
  }

  /**
   * Test {@link AbstractMultiValuedMap#size()}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiValuedMap.size()"})
  public void testSize_givenArrayListValuedHashMap_thenReturnZero() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals(0, arrayListValuedHashMap.size());
  }

  /**
   * Test {@link AbstractMultiValuedMap#toString()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMultiValuedMap.toString()"})
  public void testToString() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertEquals("{}", arrayListValuedHashMap.toString());
  }

  /**
   * Test {@link AbstractMultiValuedMap#values()}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.values()"})
  public void testValues() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.values().isEmpty());
  }

  /**
   * Test {@link AbstractMultiValuedMap#wrappedCollection(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiValuedMap#wrappedCollection(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.wrappedCollection(Object)"})
  public void testWrappedCollection() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualWrappedCollectionResult = arrayListValuedHashMap.wrappedCollection("Key");

    // Assert
    assertTrue(actualWrappedCollectionResult instanceof List);
    assertTrue(actualWrappedCollectionResult.isEmpty());
  }
}
