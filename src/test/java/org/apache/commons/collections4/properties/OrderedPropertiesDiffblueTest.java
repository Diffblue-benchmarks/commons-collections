package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OrderedPropertiesDiffblueTest {
  /**
   * Method under test: {@link OrderedProperties#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange, Act and Assert
    assertTrue((new OrderedProperties()).entrySet().isEmpty());
  }

  /**
   * Method under test: {@link OrderedProperties#entrySet()}
   */
  @Test
  public void testEntrySet2() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals(1, orderedProperties.entrySet().size());
  }

  /**
   * Method under test: {@link OrderedProperties#entrySet()}
   */
  @Test
  public void testEntrySet3() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put(42, "Value");
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals(2, orderedProperties.entrySet().size());
  }

  /**
   * Method under test: {@link OrderedProperties#keySet()}
   */
  @Test
  public void testKeySet() {
    // Arrange, Act and Assert
    assertTrue((new OrderedProperties()).keySet().isEmpty());
  }

  /**
   * Method under test: {@link OrderedProperties#put(Object, Object)}
   */
  @Test
  public void testPut() {
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
   * Method under test: {@link OrderedProperties#put(Object, Object)}
   */
  @Test
  public void testPut2() {
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
   * Method under test: {@link OrderedProperties#putIfAbsent(Object, Object)}
   */
  @Test
  public void testPutIfAbsent() {
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
   * Method under test: {@link OrderedProperties#putIfAbsent(Object, Object)}
   */
  @Test
  public void testPutIfAbsent2() {
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
   * Method under test: {@link OrderedProperties#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();

    // Act and Assert
    assertNull(orderedProperties.remove("Key"));
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Method under test: {@link OrderedProperties#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals("Value", orderedProperties.remove("Key"));
    assertTrue(orderedProperties.isEmpty());
  }

  /**
   * Method under test: {@link OrderedProperties#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("{}", (new OrderedProperties()).toString());
  }

  /**
   * Method under test: {@link OrderedProperties#toString()}
   */
  @Test
  public void testToString2() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals("{Key=Value}", orderedProperties.toString());
  }

  /**
   * Method under test: {@link OrderedProperties#toString()}
   */
  @Test
  public void testToString3() {
    // Arrange
    OrderedProperties orderedProperties = new OrderedProperties();
    orderedProperties.put(42, "Value");
    orderedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals("{42=Value, Key=Value}", orderedProperties.toString());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link OrderedProperties}
   */
  @Test
  public void testNewOrderedProperties() {
    // Arrange, Act and Assert
    assertTrue((new OrderedProperties()).isEmpty());
  }
}
