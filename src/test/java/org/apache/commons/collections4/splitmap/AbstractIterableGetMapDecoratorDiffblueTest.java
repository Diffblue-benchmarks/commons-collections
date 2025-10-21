package org.apache.commons.collections4.splitmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractIterableGetMapDecoratorDiffblueTest {
  /**
   * Test {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator()}.
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractIterableGetMapDecorator.<init>()",
      "java.lang.String AbstractIterableGetMapDecorator.toString()"})
  public void testNewAbstractIterableGetMapDecorator() {
    // Arrange and Act
    AbstractIterableGetMapDecorator<Object, Object> actualAbstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>();

    // Assert
    assertNull(actualAbstractIterableGetMapDecorator.map);
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsKey(Object)"})
  public void testContainsKey_givenHashMap42Is42_when42_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        map);

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.containsKey("42"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsKey(Object)}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsKey(Object)"})
  public void testContainsKey_thenReturnFalse() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertFalse(abstractIterableGetMapDecorator.containsKey("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsValue(Object)"})
  public void testContainsValue_givenHashMap42Is42_when42_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        map);

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.containsValue("42"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#containsValue(Object)}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.containsValue(Object)"})
  public void testContainsValue_thenReturnFalse() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertFalse(abstractIterableGetMapDecorator.containsValue("Value"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#decorated()}.
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#decorated()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Map AbstractIterableGetMapDecorator.decorated()"})
  public void testDecorated() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertNull(abstractIterableGetMapDecorator.decorated());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#entrySet()}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractIterableGetMapDecorator.entrySet()"})
  public void testEntrySet_thenReturnEmpty() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.entrySet().isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.equals(Object)",
      "int AbstractIterableGetMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertNotEquals(abstractIterableGetMapDecorator, new AbstractIterableGetMapDecorator<>());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then throw exception.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.equals(Object)",
      "int AbstractIterableGetMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenThrowException() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertThrows(NullPointerException.class, () -> abstractIterableGetMapDecorator.equals(null));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.equals(Object)",
      "int AbstractIterableGetMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertEquals(abstractIterableGetMapDecorator, abstractIterableGetMapDecorator);
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then throw exception.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.equals(Object)",
      "int AbstractIterableGetMapDecorator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenThrowException() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>();

    // Act and Assert
    assertThrows(NullPointerException.class,
        () -> abstractIterableGetMapDecorator.equals("Different type to AbstractIterableGetMapDecorator"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#get(Object)}.
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with map is {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractIterableGetMapDecorator.get(Object)"})
  public void testGet_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnNull() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertNull(abstractIterableGetMapDecorator.get("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#isEmpty()}.
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with map is {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.isEmpty()"})
  public void testIsEmpty_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnTrue() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#isEmpty()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractIterableGetMapDecorator.isEmpty()"})
  public void testIsEmpty_givenHashMap42Is42_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        map);

    // Act and Assert
    assertFalse(abstractIterableGetMapDecorator.isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#keySet()}.
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with map is {@link HashMap#HashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractIterableGetMapDecorator.keySet()"})
  public void testKeySet_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnEmpty() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.keySet().isEmpty());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#mapIterator()}.
   * <ul>
   *   <li>Then return {@link EntrySetToMapIteratorAdapter}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#mapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator AbstractIterableGetMapDecorator.mapIterator()"})
  public void testMapIterator_thenReturnEntrySetToMapIteratorAdapter() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act
    MapIterator<Object, Object> actualMapIteratorResult = abstractIterableGetMapDecorator.mapIterator();

    // Assert
    assertTrue(actualMapIteratorResult instanceof EntrySetToMapIteratorAdapter);
    assertFalse(actualMapIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#remove(Object)}.
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with map is {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractIterableGetMapDecorator.remove(Object)"})
  public void testRemove_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnNull() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertNull(abstractIterableGetMapDecorator.remove("Key"));
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#size()}.
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with map is {@link HashMap#HashMap()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractIterableGetMapDecorator.size()"})
  public void testSize_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnZero() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertEquals(0, abstractIterableGetMapDecorator.size());
  }

  /**
   * Test {@link AbstractIterableGetMapDecorator#values()}.
   * <ul>
   *   <li>Given {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator(Map)} with map is {@link HashMap#HashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractIterableGetMapDecorator#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection AbstractIterableGetMapDecorator.values()"})
  public void testValues_givenAbstractIterableGetMapDecoratorWithMapIsHashMap_thenReturnEmpty() {
    // Arrange
    AbstractIterableGetMapDecorator<Object, Object> abstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>(
        new HashMap<>());

    // Act and Assert
    assertTrue(abstractIterableGetMapDecorator.values().isEmpty());
  }
}
