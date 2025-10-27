package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DefaultEquatorDiffblueTest {
  /**
   * Method under test: {@link DefaultEquator#defaultEquator()}
   */
  @Test
  public void testDefaultEquator() {
    // Arrange and Act
    DefaultEquator<Object> actualDefaultEquatorResult = DefaultEquator.defaultEquator();

    // Assert
    assertEquals(1662, actualDefaultEquatorResult.hash("42"));
  }

  /**
   * Method under test: {@link DefaultEquator#equate(Object, Object)}
   */
  @Test
  public void testEquate() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(defaultEquatorResult.equate("O1", "O2"));
  }

  /**
   * Method under test: {@link DefaultEquator#equate(Object, Object)}
   */
  @Test
  public void testEquate2() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(defaultEquatorResult.equate(42, 42));
  }

  /**
   * Method under test: {@link DefaultEquator#hash(Object)}
   */
  @Test
  public void testHash() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1662, defaultEquatorResult.hash("42"));
  }

  /**
   * Method under test: {@link DefaultEquator#hash(Object)}
   */
  @Test
  public void testHash2() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(DefaultEquator.HASHCODE_NULL, defaultEquatorResult.hash(null));
  }
}
