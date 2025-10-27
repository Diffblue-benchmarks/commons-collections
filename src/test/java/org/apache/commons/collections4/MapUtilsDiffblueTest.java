package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class MapUtilsDiffblueTest {
  /**
   * Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  public void testEmptyIfNull() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  public void testEmptyIfNull2() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  public void testEmptyIfNull3() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  public void testEmptyIfNull4() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  public void testFixedSizeMap() {
    // Arrange and Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(new HashMap<>());

    // Assert
    assertTrue(actualFixedSizeMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  public void testFixedSizeMap2() {
    // Arrange and Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(new HashMap<>());

    // Assert
    assertTrue(actualFixedSizeMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  public void testFixedSizeSortedMap() {
    // Arrange and Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(new TreeMap<>());

    // Assert
    assertTrue(actualFixedSizeSortedMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  public void testFixedSizeSortedMap2() {
    // Arrange and Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(new TreeMap<>());

    // Assert
    assertTrue(actualFixedSizeSortedMapResult.isEmpty());
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
    assertNull(MapUtils.getBoolean(null, "Key"));
    assertTrue(MapUtils.getBoolean(new HashMap<>(), "Key", true));
    assertTrue(MapUtils.getBoolean(null, "Key", true));
    assertFalse(MapUtils.getBoolean(new HashMap<>(), "Key", false));
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null));
    assertNull(MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null));
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
    assertNull(MapUtils.getBoolean(null, "Key"));
    assertTrue(MapUtils.getBoolean(new HashMap<>(), "Key", true));
    assertTrue(MapUtils.getBoolean(null, "Key", true));
    assertFalse(MapUtils.getBoolean(new HashMap<>(), "Key", false));
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null));
    assertNull(MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  public void testGetBoolean17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  public void testGetBoolean21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  public void testGetBoolean25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "42", (Function<Object, Boolean>) null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key", null));
    assertFalse(MapUtils.getBooleanValue(null, "Key", null));
    assertTrue(MapUtils.getBooleanValue(new HashMap<>(), "Key", true));
    assertTrue(MapUtils.getBooleanValue(null, "Key", true));
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key", false));
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key", null));
    assertFalse(MapUtils.getBooleanValue(null, "Key", null));
    assertTrue(MapUtils.getBooleanValue(new HashMap<>(), "Key", true));
    assertTrue(MapUtils.getBooleanValue(null, "Key", true));
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key", false));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  public void testGetBooleanValue17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  public void testGetBooleanValue21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  public void testGetBooleanValue25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "42", true));
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
    assertNull(MapUtils.getByte(null, "Key"));
    assertEquals('A', MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A').byteValue());
    assertEquals('A', MapUtils.getByte(null, "Key", (byte) 'A').byteValue());
    assertNull(MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null));
    assertNull(MapUtils.getByte(null, "Key", (Function<Object, Byte>) null));
    assertEquals('A',
        MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(new ConstantFactory<>((byte) 'A'))).byteValue());
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
    assertNull(MapUtils.getByte(null, "Key"));
    assertEquals('A', MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A').byteValue());
    assertEquals('A', MapUtils.getByte(null, "Key", (byte) 'A').byteValue());
    assertNull(MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null));
    assertNull(MapUtils.getByte(null, "Key", (Function<Object, Byte>) null));
    assertEquals('A',
        MapUtils.getByte(null, (byte) 'A', new FactoryTransformer<>(new ConstantFactory<>((byte) 'A'))).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42").byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42").byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  public void testGetByte5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  public void testGetByte6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  public void testGetByte7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42", (Function<Object, Byte>) null).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (Function<Object, Byte>) null).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42", (Function<Object, Byte>) null));
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "Key", new ConstantTransformer<>((byte) 'A')).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte12() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte13() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte14() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte15() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte16() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte17() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte18() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertNull(MapUtils.getByte(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42").byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42").byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  public void testGetByte21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  public void testGetByte22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  public void testGetByte23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  public void testGetByte24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (byte) 'A').byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByte(map, "42", (Function<Object, Byte>) null).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte26() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "42", (Function<Object, Byte>) null).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte27() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "42", (Function<Object, Byte>) null));
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte28() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('A', MapUtils.getByte(map, "Key", new ConstantTransformer<>((byte) 'A')).byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte29() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte30() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte31() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte32() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte33() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte34() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A',
        MapUtils
            .getByte(null, (byte) 'A',
                new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A')))
            .byteValue());
  }

  /**
   * Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  public void testGetByte35() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertNull(MapUtils.getByte(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
    assertEquals('A', MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A'));
    assertEquals('A', MapUtils.getByteValue(null, "Key", (byte) 'A'));
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key", null));
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key", null));
    assertEquals('A',
        MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(new ConstantFactory<>((byte) 'A'))));
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
    assertEquals('A', MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A'));
    assertEquals('A', MapUtils.getByteValue(null, "Key", (byte) 'A'));
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key", null));
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key", null));
    assertEquals('A',
        MapUtils.getByteValue(null, (byte) 'A', new FactoryTransformer<>(new ConstantFactory<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  public void testGetByteValue5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  public void testGetByteValue6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  public void testGetByteValue7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "Key", new ConstantTransformer<>((byte) 'A')));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue12() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue13() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue14() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue15() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue16() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue17() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue18() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  public void testGetByteValue21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  public void testGetByteValue22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  public void testGetByteValue23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  public void testGetByteValue24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", (byte) 'A'));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue26() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue27() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue28() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "Key", new ConstantTransformer<>((byte) 'A')));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue29() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue30() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue31() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue32() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue33() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue34() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Byte> trueTransformer = new ConstantTransformer<>((byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(null, (byte) 'A',
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>((byte) 'A'))));
  }

  /**
   * Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  public void testGetByteValue35() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
    assertNull(MapUtils.getDouble(null, "Key"));
    assertEquals(10.0d, MapUtils.getDouble(new HashMap<>(), "Key", 10.0d).doubleValue(), 0.0);
    assertEquals(10.0d, MapUtils.getDouble(null, "Key", 10.0d).doubleValue(), 0.0);
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null));
    assertNull(MapUtils.getDouble(null, "Key", (Function<Object, Double>) null));
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
    assertNull(MapUtils.getDouble(null, "Key"));
    assertEquals(10.0d, MapUtils.getDouble(new HashMap<>(), "Key", 10.0d).doubleValue(), 0.0);
    assertEquals(10.0d, MapUtils.getDouble(null, "Key", 10.0d).doubleValue(), 0.0);
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null));
    assertNull(MapUtils.getDouble(null, "Key", (Function<Object, Double>) null));
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42").doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42").doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42").doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42", (Function<Object, Double>) null).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42", (Function<Object, Double>) null).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42", (Function<Object, Double>) null));
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", (Function<Object, Double>) null).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42").doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42").doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  public void testGetDouble17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42").doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  public void testGetDouble21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", 10.0d).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDouble(map, "42", (Function<Object, Double>) null).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDouble(map, "42", (Function<Object, Double>) null).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "42", (Function<Object, Double>) null));
  }

  /**
   * Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  public void testGetDouble25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDouble(map, "42", (Function<Object, Double>) null).doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"), 0.0);
    assertEquals(10.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d), 0.0);
    assertEquals(10.0d, MapUtils.getDoubleValue(null, "Key", 10.0d), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key", null), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key", null), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"), 0.0);
    assertEquals(10.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d), 0.0);
    assertEquals(10.0d, MapUtils.getDoubleValue(null, "Key", 10.0d), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key", null), 0.0);
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  public void testGetDoubleValue17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42"), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  public void testGetDoubleValue21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", 10.0d), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  public void testGetDoubleValue25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "42", null), 0.0);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
    assertNull(MapUtils.getFloat(null, "Key"));
    assertEquals(10.0f, MapUtils.getFloat(new HashMap<>(), "Key", 10.0f).floatValue(), 0.0f);
    assertEquals(10.0f, MapUtils.getFloat(null, "Key", 10.0f).floatValue(), 0.0f);
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null));
    assertNull(MapUtils.getFloat(null, "Key", (Function<Object, Float>) null));
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
    assertNull(MapUtils.getFloat(null, "Key"));
    assertEquals(10.0f, MapUtils.getFloat(new HashMap<>(), "Key", 10.0f).floatValue(), 0.0f);
    assertEquals(10.0f, MapUtils.getFloat(null, "Key", 10.0f).floatValue(), 0.0f);
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null));
    assertNull(MapUtils.getFloat(null, "Key", (Function<Object, Float>) null));
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42").floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42").floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42").floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42", (Function<Object, Float>) null).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42", (Function<Object, Float>) null).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42", (Function<Object, Float>) null));
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", (Function<Object, Float>) null).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42").floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42").floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  public void testGetFloat17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42").floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  public void testGetFloat21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", 10.0f).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloat(map, "42", (Function<Object, Float>) null).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloat(map, "42", (Function<Object, Float>) null).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "42", (Function<Object, Float>) null));
  }

  /**
   * Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  public void testGetFloat25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloat(map, "42", (Function<Object, Float>) null).floatValue(), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"), 0.0f);
    assertEquals(10.0f, MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f), 0.0f);
    assertEquals(10.0f, MapUtils.getFloatValue(null, "Key", 10.0f), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key", null), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key", null), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"), 0.0f);
    assertEquals(10.0f, MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f), 0.0f);
    assertEquals(10.0f, MapUtils.getFloatValue(null, "Key", 10.0f), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key", null), 0.0f);
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  public void testGetFloatValue17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42"), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  public void testGetFloatValue21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", 10.0f), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  public void testGetFloatValue25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "42", null), 0.0f);
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
    assertNull(MapUtils.getInteger(null, "Key"));
    assertEquals(42, MapUtils.getInteger(new HashMap<>(), "Key", 42).intValue());
    assertEquals(42, MapUtils.getInteger(null, "Key", 42).intValue());
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null));
    assertNull(MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null));
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
    assertNull(MapUtils.getInteger(null, "Key"));
    assertEquals(42, MapUtils.getInteger(new HashMap<>(), "Key", 42).intValue());
    assertEquals(42, MapUtils.getInteger(null, "Key", 42).intValue());
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null));
    assertNull(MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null));
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", (Function<Object, Integer>) null).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42", (Function<Object, Integer>) null).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42", (Function<Object, Integer>) null).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42", (Function<Object, Integer>) null));
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42").intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  public void testGetInteger17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  public void testGetInteger21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", 42).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getInteger(map, "42", (Function<Object, Integer>) null).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getInteger(map, "42", (Function<Object, Integer>) null).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getInteger(map, "42", (Function<Object, Integer>) null).intValue());
  }

  /**
   * Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  public void testGetInteger25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "42", (Function<Object, Integer>) null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
    assertEquals(42, MapUtils.getIntValue(new HashMap<>(), "Key", 42));
    assertEquals(42, MapUtils.getIntValue(null, "Key", 42));
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key", null));
    assertEquals(0, MapUtils.getIntValue(null, "Key", null));
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
    assertEquals(42, MapUtils.getIntValue(new HashMap<>(), "Key", 42));
    assertEquals(42, MapUtils.getIntValue(null, "Key", 42));
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key", null));
    assertEquals(0, MapUtils.getIntValue(null, "Key", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue12() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue13() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue14() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue15() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue16() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  public void testGetIntValue17() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue18() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  public void testGetIntValue21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", 42));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  public void testGetIntValue25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
    assertNull(MapUtils.getLong(null, "Key"));
    assertEquals(42L, MapUtils.getLong(new HashMap<>(), "Key", 42L).longValue());
    assertEquals(42L, MapUtils.getLong(null, "Key", 42L).longValue());
    assertNull(MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null));
    assertNull(MapUtils.getLong(null, "Key", (Function<Object, Long>) null));
    assertEquals(1L, MapUtils.getLong(null, 1L, new FactoryTransformer<>(new ConstantFactory<>(1L))).longValue());
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
    assertNull(MapUtils.getLong(null, "Key"));
    assertEquals(42L, MapUtils.getLong(new HashMap<>(), "Key", 42L).longValue());
    assertEquals(42L, MapUtils.getLong(null, "Key", 42L).longValue());
    assertNull(MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null));
    assertNull(MapUtils.getLong(null, "Key", (Function<Object, Long>) null));
    assertEquals(1L, MapUtils.getLong(null, 1L, new FactoryTransformer<>(new ConstantFactory<>(1L))).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42").longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42").longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  public void testGetLong5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  public void testGetLong6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  public void testGetLong7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", (Function<Object, Long>) null).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42", (Function<Object, Long>) null).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42", (Function<Object, Long>) null));
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(1L, MapUtils.getLong(map, "Key", new ConstantTransformer<>(1L)).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong12() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong13() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong14() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong15() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong16() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong17() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong18() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertNull(MapUtils.getLong(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42").longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42").longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  public void testGetLong21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  public void testGetLong22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  public void testGetLong23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  public void testGetLong24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", 42L).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLong(map, "42", (Function<Object, Long>) null).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong26() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLong(map, "42", (Function<Object, Long>) null).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong27() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "42", (Function<Object, Long>) null));
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong28() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(1L, MapUtils.getLong(map, "Key", new ConstantTransformer<>(1L)).longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong29() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong30() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong31() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong32() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong33() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong34() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L,
        MapUtils.getLong(null, 1L, new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L)))
            .longValue());
  }

  /**
   * Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  public void testGetLong35() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertNull(MapUtils.getLong(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
    assertEquals(42L, MapUtils.getLongValue(new HashMap<>(), "Key", 42L));
    assertEquals(42L, MapUtils.getLongValue(null, "Key", 42L));
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key", null));
    assertEquals(0L, MapUtils.getLongValue(null, "Key", null));
    assertEquals(1L, MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(new ConstantFactory<>(1L))));
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
    assertEquals(42L, MapUtils.getLongValue(new HashMap<>(), "Key", 42L));
    assertEquals(42L, MapUtils.getLongValue(null, "Key", 42L));
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key", null));
    assertEquals(0L, MapUtils.getLongValue(null, "Key", null));
    assertEquals(1L, MapUtils.getLongValue(null, 1L, new FactoryTransformer<>(new ConstantFactory<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue3() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue4() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  public void testGetLongValue5() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  public void testGetLongValue6() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  public void testGetLongValue7() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue8() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue9() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue10() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue11() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(map, "Key", new ConstantTransformer<>(1L)));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue12() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue13() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue14() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue15() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue16() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue17() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue18() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue19() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue20() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  public void testGetLongValue21() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42"));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  public void testGetLongValue22() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  public void testGetLongValue23() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  public void testGetLongValue24() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", 42L));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue25() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue26() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue27() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "foo");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "42", null));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue28() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(map, "Key", new ConstantTransformer<>(1L)));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue29() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue30() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AndPredicate<>(predicate1, new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()))));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue31() {
    // Arrange
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue32() {
    // Arrange
    AllPredicate<? super Object> predicate = new AllPredicate<>(
        new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>())));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue33() {
    // Arrange
    UniquePredicate<Object> predicate = new UniquePredicate<>();
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue34() {
    // Arrange
    AnyPredicate<? super Object> predicate = new AnyPredicate<>(new AllPredicate<>(new UniquePredicate<>()));
    ConstantTransformer<? super Object, Long> trueTransformer = new ConstantTransformer<>(1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(null, 1L,
        new IfTransformer<>(predicate, trueTransformer, new ConstantTransformer<>(1L))));
  }

  /**
   * Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  public void testGetLongValue35() {
    // Arrange
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, null,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"})));
  }

  /**
   * Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  public void testGetMap() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  public void testGetMap2() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  public void testGetMap3() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  public void testGetMap4() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }
}
