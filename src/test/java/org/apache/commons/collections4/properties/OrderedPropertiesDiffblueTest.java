package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderedPropertiesDiffblueTest {
  /**
   * Test new {@link OrderedProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link OrderedProperties}
   */
  @Test
  @DisplayName("Test new OrderedProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OrderedProperties.<init>()"})
  void testNewOrderedProperties() {
    // Arrange, Act and Assert
    assertTrue((new OrderedProperties()).isEmpty());
  }

  /**
   * Test {@link OrderedProperties#compute(Object, BiFunction)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then {@link OrderedProperties} (default constructor) size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#compute(Object, BiFunction)}
   */
  @Test
  @DisplayName("Test compute(Object, BiFunction); given 'Apply'; when 'Key'; then OrderedProperties (default constructor) size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.compute(Object, BiFunction)"})
  void testCompute_givenApply_whenKey_thenOrderedPropertiesSizeIsOne() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    BiFunction<Object, Object, Object> remappingFunction = mock(BiFunction.class);
    when(remappingFunction.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Object actualComputeResult = orderedProperties.compute("Key", remappingFunction);

    // Assert
    verify(remappingFunction).apply(isA(Object.class), isNull());
    assertEquals(1, orderedProperties.size());
    assertEquals("Apply", orderedProperties.get("Key"));
    assertEquals("Apply", actualComputeResult);
  }

  /**
   * Test {@link OrderedProperties#compute(Object, BiFunction)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link BiFunction} {@link BiFunction#apply(Object, Object)} return {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#compute(Object, BiFunction)}
   */
  @Test
  @DisplayName("Test compute(Object, BiFunction); given 'null'; when BiFunction apply(Object, Object) return 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.compute(Object, BiFunction)"})
  void testCompute_givenNull_whenBiFunctionApplyReturnNull_thenReturnNull() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    BiFunction<Object, Object, Object> remappingFunction = mock(BiFunction.class);
    when(remappingFunction.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(null);

    // Act
    Object actualComputeResult = orderedProperties.compute("Key", remappingFunction);

    // Assert
    verify(remappingFunction).apply(isA(Object.class), isNull());
    assertNull(actualComputeResult);
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Test {@link OrderedProperties#computeIfAbsent(Object, Function)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then {@link OrderedProperties} (default constructor) size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#computeIfAbsent(Object, Function)}
   */
  @Test
  @DisplayName("Test computeIfAbsent(Object, Function); given 'Apply'; when 'Key'; then OrderedProperties (default constructor) size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.computeIfAbsent(Object, Function)"})
  void testComputeIfAbsent_givenApply_whenKey_thenOrderedPropertiesSizeIsOne() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    Function<Object, Object> mappingFunction = mock(Function.class);
    when(mappingFunction.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Object actualComputeIfAbsentResult = orderedProperties.computeIfAbsent("Key", mappingFunction);

    // Assert
    verify(mappingFunction).apply(isA(Object.class));
    assertEquals(1, orderedProperties.size());
    assertEquals("Apply", orderedProperties.get("Key"));
    assertEquals("Apply", actualComputeIfAbsentResult);
  }

  /**
   * Test {@link OrderedProperties#computeIfAbsent(Object, Function)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#computeIfAbsent(Object, Function)}
   */
  @Test
  @DisplayName("Test computeIfAbsent(Object, Function); given 'null'; when Function apply(Object) return 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.computeIfAbsent(Object, Function)"})
  void testComputeIfAbsent_givenNull_whenFunctionApplyReturnNull_thenReturnNull() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    Function<Object, Object> mappingFunction = mock(Function.class);
    when(mappingFunction.apply(Mockito.<Object>any())).thenReturn(null);

    // Act
    Object actualComputeIfAbsentResult = orderedProperties.computeIfAbsent("Key", mappingFunction);

    // Assert
    verify(mappingFunction).apply(isA(Object.class));
    assertNull(actualComputeIfAbsentResult);
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Test {@link OrderedProperties#entrySet()}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) forty-two is {@code Value}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given OrderedProperties (default constructor) forty-two is 'Value'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set OrderedProperties.entrySet()"})
  void testEntrySet_givenOrderedPropertiesFortyTwoIsValue_thenReturnSizeIsTwo() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put(42, "Value");
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals(2, orderedProperties.entrySet().size());
  }

  /**
   * Test {@link OrderedProperties#entrySet()}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given OrderedProperties (default constructor) 'Key' is 'Value'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set OrderedProperties.entrySet()"})
  void testEntrySet_givenOrderedPropertiesKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals(1, orderedProperties.entrySet().size());
  }

  /**
   * Test {@link OrderedProperties#entrySet()}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor).</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given OrderedProperties (default constructor); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set OrderedProperties.entrySet()"})
  void testEntrySet_givenOrderedProperties_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue((new OrderedProperties()).entrySet().isEmpty());
  }

  /**
   * Test {@link OrderedProperties#forEach(BiConsumer)}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) forty-two is {@code Value}.</li>
   *   <li>Then calls {@link BiConsumer#accept(Object, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#forEach(BiConsumer)}
   */
  @Test
  @DisplayName("Test forEach(BiConsumer); given OrderedProperties (default constructor) forty-two is 'Value'; then calls accept(Object, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OrderedProperties.forEach(BiConsumer)"})
  void testForEach_givenOrderedPropertiesFortyTwoIsValue_thenCallsAccept() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");
    orderedProperties.put(42, "Value");
    BiConsumer<Object, Object> action = mock(BiConsumer.class);
    doNothing().when(action).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    orderedProperties.forEach(action);

    // Assert
    verify(action, atLeast(1)).accept(Mockito.<Object>any(), isA(Object.class));
  }

  /**
   * Test {@link OrderedProperties#forEach(BiConsumer)}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>Then calls {@link BiConsumer#accept(Object, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#forEach(BiConsumer)}
   */
  @Test
  @DisplayName("Test forEach(BiConsumer); given OrderedProperties (default constructor) 'Key' is 'Value'; then calls accept(Object, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OrderedProperties.forEach(BiConsumer)"})
  void testForEach_givenOrderedPropertiesKeyIsValue_thenCallsAccept() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");
    BiConsumer<Object, Object> action = mock(BiConsumer.class);
    doNothing().when(action).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    orderedProperties.forEach(action);

    // Assert
    verify(action).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link OrderedProperties#keySet()}.
   * <p>
   * Method under test: {@link OrderedProperties#keySet()}
   */
  @Test
  @DisplayName("Test keySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set OrderedProperties.keySet()"})
  void testKeySet() {
    // Arrange, Act and Assert
    assertTrue((new OrderedProperties()).keySet().isEmpty());
  }

  /**
   * Test {@link OrderedProperties#merge(Object, Object, BiFunction)}.
   * <p>
   * Method under test: {@link OrderedProperties#merge(Object, Object, BiFunction)}
   */
  @Test
  @DisplayName("Test merge(Object, Object, BiFunction)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.merge(Object, Object, BiFunction)"})
  void testMerge() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();

    // Act
    Object actualMergeResult = orderedProperties.merge("Key", "Value", mock(BiFunction.class));

    // Assert
    assertEquals(1, orderedProperties.size());
    assertEquals("Value", orderedProperties.get("Key"));
    assertEquals("Value", actualMergeResult);
  }

  /**
   * Test {@link OrderedProperties#put(Object, Object)}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); given OrderedProperties (default constructor) 'Key' is 'Value'; when 'Key'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.put(Object, Object)"})
  void testPut_givenOrderedPropertiesKeyIsValue_whenKey_thenReturnValue() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act
    Object actualPutResult = orderedProperties.put("Key", "Value");

    // Assert
    assertEquals(1, orderedProperties.size());
    assertEquals("Value", orderedProperties.get("Key"));
    assertEquals("Value", actualPutResult);
  }

  /**
   * Test {@link OrderedProperties#put(Object, Object)}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor).</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#put(Object, Object)}
   */
  @Test
  @DisplayName("Test put(Object, Object); given OrderedProperties (default constructor); when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.put(Object, Object)"})
  void testPut_givenOrderedProperties_whenKey_thenReturnNull() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();

    // Act
    Object actualPutResult = orderedProperties.put("Key", "Value");

    // Assert
    assertEquals(1, orderedProperties.size());
    assertEquals("Value", orderedProperties.get("Key"));
    assertNull(actualPutResult);
  }

  /**
   * Test {@link OrderedProperties#putIfAbsent(Object, Object)}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#putIfAbsent(Object, Object)}
   */
  @Test
  @DisplayName("Test putIfAbsent(Object, Object); given OrderedProperties (default constructor) 'Key' is 'Value'; when 'Key'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.putIfAbsent(Object, Object)"})
  void testPutIfAbsent_givenOrderedPropertiesKeyIsValue_whenKey_thenReturnValue() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act
    Object actualPutIfAbsentResult = orderedProperties.putIfAbsent("Key", "Value");

    // Assert
    assertEquals(1, orderedProperties.size());
    assertEquals("Value", orderedProperties.get("Key"));
    assertEquals("Value", actualPutIfAbsentResult);
  }

  /**
   * Test {@link OrderedProperties#putIfAbsent(Object, Object)}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor).</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#putIfAbsent(Object, Object)}
   */
  @Test
  @DisplayName("Test putIfAbsent(Object, Object); given OrderedProperties (default constructor); when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.putIfAbsent(Object, Object)"})
  void testPutIfAbsent_givenOrderedProperties_whenKey_thenReturnNull() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();

    // Act
    Object actualPutIfAbsentResult = orderedProperties.putIfAbsent("Key", "Value");

    // Assert
    assertEquals(1, orderedProperties.size());
    assertEquals("Value", orderedProperties.get("Key"));
    assertNull(actualPutIfAbsentResult);
  }

  /**
   * Test {@link OrderedProperties#remove(Object, Object)} with {@code key}, {@code value}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#remove(Object, Object)}
   */
  @Test
  @DisplayName("Test remove(Object, Object) with 'key', 'value'; given OrderedProperties (default constructor) 'Key' is 'Value'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean OrderedProperties.remove(Object, Object)"})
  void testRemoveWithKeyValue_givenOrderedPropertiesKeyIsValue_thenReturnTrue() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act
    boolean actualRemoveResult = orderedProperties.remove("Key", "Value");

    // Assert
    assertTrue(orderedProperties.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link OrderedProperties#remove(Object, Object)} with {@code key}, {@code value}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#remove(Object, Object)}
   */
  @Test
  @DisplayName("Test remove(Object, Object) with 'key', 'value'; given OrderedProperties (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean OrderedProperties.remove(Object, Object)"})
  void testRemoveWithKeyValue_givenOrderedProperties_thenReturnFalse() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();

    // Act and Assert
    assertFalse(orderedProperties.remove("Key", "Value"));
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Test {@link OrderedProperties#remove(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'key'; given OrderedProperties (default constructor) 'Key' is 'Value'; when 'Key'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.remove(Object)"})
  void testRemoveWithKey_givenOrderedPropertiesKeyIsValue_whenKey_thenReturnValue() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals("Value", orderedProperties.remove("Key"));
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Test {@link OrderedProperties#remove(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor).</li>
   *   <li>When {@code Key}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'key'; given OrderedProperties (default constructor); when 'Key'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object OrderedProperties.remove(Object)"})
  void testRemoveWithKey_givenOrderedProperties_whenKey_thenReturnNull() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();

    // Act and Assert
    assertNull(orderedProperties.remove("Key"));
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Test {@link OrderedProperties#toString()}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) forty-two is {@code Value}.</li>
   *   <li>Then return {@code {42=Value, Key=Value}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#toString()}
   */
  @Test
  @DisplayName("Test toString(); given OrderedProperties (default constructor) forty-two is 'Value'; then return '{42=Value, Key=Value}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String OrderedProperties.toString()"})
  void testToString_givenOrderedPropertiesFortyTwoIsValue_thenReturn42ValueKeyValue() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put(42, "Value");
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals("{42=Value, Key=Value}", orderedProperties.toString());
  }

  /**
   * Test {@link OrderedProperties#toString()}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor) {@code Key} is {@code Value}.</li>
   *   <li>Then return {@code {Key=Value}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#toString()}
   */
  @Test
  @DisplayName("Test toString(); given OrderedProperties (default constructor) 'Key' is 'Value'; then return '{Key=Value}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String OrderedProperties.toString()"})
  void testToString_givenOrderedPropertiesKeyIsValue_thenReturnKeyValue() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals("{Key=Value}", orderedProperties.toString());
  }

  /**
   * Test {@link OrderedProperties#toString()}.
   * <ul>
   *   <li>Given {@link OrderedProperties} (default constructor).</li>
   *   <li>Then return {@code {}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OrderedProperties#toString()}
   */
  @Test
  @DisplayName("Test toString(); given OrderedProperties (default constructor); then return '{}'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String OrderedProperties.toString()"})
  void testToString_givenOrderedProperties_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertEquals("{}", (new OrderedProperties()).toString());
  }
}
