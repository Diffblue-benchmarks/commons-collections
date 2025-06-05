package org.apache.commons.collections4.multimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractMultiValuedMapDiffblueTest {
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
  @DisplayName("Test containsKey(Object); given ArrayListValuedHashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsKey(Object)"})
  void testContainsKey_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
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
  @DisplayName("Test containsKey(Object); given ArrayListValuedHashMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsKey(Object)"})
  void testContainsKey_givenArrayListValuedHashMap_thenReturnFalse() {
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
  @DisplayName("Test containsMapping(Object, Object); given ArrayListValuedHashMap() 'Key' is forty-two; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsMapping(Object, Object)"})
  void testContainsMapping_givenArrayListValuedHashMapKeyIsFortyTwo_thenReturnFalse() {
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
  @DisplayName("Test containsMapping(Object, Object); given ArrayListValuedHashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsMapping(Object, Object)"})
  void testContainsMapping_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
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
  @DisplayName("Test containsMapping(Object, Object); given ArrayListValuedHashMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsMapping(Object, Object)"})
  void testContainsMapping_givenArrayListValuedHashMap_thenReturnFalse() {
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
  @DisplayName("Test containsValue(Object); given ArrayListValuedHashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsValue(Object)"})
  void testContainsValue_givenArrayListValuedHashMapKeyIsValue_thenReturnTrue() {
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
  @DisplayName("Test containsValue(Object); given ArrayListValuedHashMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.containsValue(Object)"})
  void testContainsValue_givenArrayListValuedHashMap_thenReturnFalse() {
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
  @DisplayName("Test doReadObject(ObjectInputStream); given IOException(String) with 'foo'; then throw IOException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractMultiValuedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenIOExceptionWithFoo_thenThrowIOException() throws IOException, ClassNotFoundException {
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
  @DisplayName("Test doReadObject(ObjectInputStream); then ArrayListValuedHashMap() Map size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractMultiValuedMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_thenArrayListValuedHashMapMapSizeIsOne() throws IOException, ClassNotFoundException {
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
  @DisplayName("Test entries()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.entries()"})
  void testEntries() {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
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
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
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
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.equals(Object)", "int AbstractMultiValuedMap.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
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
  @DisplayName("Test get(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.get(Object)"})
  void testGet() {
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
  @DisplayName("Test getMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map AbstractMultiValuedMap.getMap()"})
  void testGetMap() {
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
  @DisplayName("Test isEmpty(); given ArrayListValuedHashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.isEmpty()"})
  void testIsEmpty_givenArrayListValuedHashMapKeyIsValue_thenReturnFalse() {
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
  @DisplayName("Test isEmpty(); given ArrayListValuedHashMap(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.isEmpty()"})
  void testIsEmpty_givenArrayListValuedHashMap_thenReturnTrue() {
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
  @DisplayName("Test keys()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"org.apache.commons.collections4.MultiSet AbstractMultiValuedMap.keys()"})
  void testKeys() {
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
  @DisplayName("Test keySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set AbstractMultiValuedMap.keySet()"})
  void testKeySet() {
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
  @DisplayName("Test mapIterator(); given ArrayListValuedHashMap() 'Key' is 'Value'; then return next is 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MapIterator AbstractMultiValuedMap.mapIterator()"})
  void testMapIterator_givenArrayListValuedHashMapKeyIsValue_thenReturnNextIsKey() {
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
  @DisplayName("Test put(Object, Object); given ArrayListValuedHashMap(); then ArrayListValuedHashMap() Map 'Key' size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.put(Object, Object)"})
  void testPut_givenArrayListValuedHashMap_thenArrayListValuedHashMapMapKeySizeIsOne() {
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
  @DisplayName("Test put(Object, Object); then ArrayListValuedHashMap() Map 'Key' size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.put(Object, Object)"})
  void testPut_thenArrayListValuedHashMapMapKeySizeIsTwo() {
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
  @DisplayName("Test putAll(Map) with 'Map'; then ArrayListValuedHashMap() Map '42' size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap_thenArrayListValuedHashMapMap42SizeIsOne() {
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
  @DisplayName("Test putAll(Map) with 'Map'; then ArrayListValuedHashMap() Map '42' size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap_thenArrayListValuedHashMapMap42SizeIsTwo() {
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
  @DisplayName("Test putAll(Map) with 'Map'; when HashMap(); then ArrayListValuedHashMap() size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Map)"})
  void testPutAllWithMap_whenHashMap_thenArrayListValuedHashMapSizeIsZero() {
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
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'; then ArrayListValuedHashMap() size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap_thenArrayListValuedHashMapSizeIsZero() {
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
  @DisplayName("Test putAll(MultiValuedMap) with 'MultiValuedMap'; when ArrayListValuedHashMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(MultiValuedMap)"})
  void testPutAllWithMultiValuedMap_whenArrayListValuedHashMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    ArrayListValuedHashMap<?, ?> map = new ArrayListValuedHashMap<>();

    // Act
    boolean actualPutAllResult = arrayListValuedHashMap.putAll(map);

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertFalse(actualPutAllResult);
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
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
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'; given '42'; then ArrayListValuedHashMap() Map size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable_given42_thenArrayListValuedHashMapMapSizeIsOne() {
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
  @DisplayName("Test putAll(Object, Iterable) with 'Object', 'Iterable'; when ArrayList(); then ArrayListValuedHashMap() size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.putAll(Object, Iterable)"})
  void testPutAllWithObjectIterable_whenArrayList_thenArrayListValuedHashMapSizeIsZero() {
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
  @DisplayName("Test remove(Object); given ArrayListValuedHashMap() 'Key' is 'Value'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.remove(Object)"})
  void testRemove_givenArrayListValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
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
  @DisplayName("Test remove(Object); given ArrayListValuedHashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.remove(Object)"})
  void testRemove_givenArrayListValuedHashMap_thenReturnEmpty() {
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
  @DisplayName("Test removeMapping(Object, Object); given ArrayListValuedHashMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.removeMapping(Object, Object)"})
  void testRemoveMapping_givenArrayListValuedHashMap_thenReturnFalse() {
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
  @DisplayName("Test removeMapping(Object, Object); then ArrayListValuedHashMap() Map size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.removeMapping(Object, Object)"})
  void testRemoveMapping_thenArrayListValuedHashMapMapSizeIsOne() {
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
  @DisplayName("Test removeMapping(Object, Object); then ArrayListValuedHashMap() size is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMultiValuedMap.removeMapping(Object, Object)"})
  void testRemoveMapping_thenArrayListValuedHashMapSizeIsZero() {
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
  @DisplayName("Test setMap(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractMultiValuedMap.setMap(Map)"})
  void testSetMap() {
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
  @DisplayName("Test size(); given ArrayListValuedHashMap() 'Key' is 'Value'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMultiValuedMap.size()"})
  void testSize_givenArrayListValuedHashMapKeyIsValue_thenReturnOne() {
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
  @DisplayName("Test size(); given ArrayListValuedHashMap(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMultiValuedMap.size()"})
  void testSize_givenArrayListValuedHashMap_thenReturnZero() {
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
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String AbstractMultiValuedMap.toString()"})
  void testToString() {
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
  @DisplayName("Test values()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.values()"})
  void testValues() {
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
  @DisplayName("Test wrappedCollection(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection AbstractMultiValuedMap.wrappedCollection(Object)"})
  void testWrappedCollection() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualWrappedCollectionResult = arrayListValuedHashMap.wrappedCollection("Key");

    // Assert
    assertTrue(actualWrappedCollectionResult instanceof List);
    assertTrue(actualWrappedCollectionResult.isEmpty());
  }

  /**
   * Test WrappedCollection {@link WrappedCollection#WrappedCollection(AbstractMultiValuedMap, Object)}.
   * <p>
   * Method under test: {@link WrappedCollection#WrappedCollection(AbstractMultiValuedMap, Object)}
   */
  @Test
  @DisplayName("Test WrappedCollection new WrappedCollection(AbstractMultiValuedMap, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void WrappedCollection.<init>(AbstractMultiValuedMap, Object)"})
  void testWrappedCollectionNewWrappedCollection() {
    // Arrange, Act and Assert
    assertTrue(((new ArrayListValuedHashMap()).new WrappedCollection("Key")).isEmpty());
  }
}
