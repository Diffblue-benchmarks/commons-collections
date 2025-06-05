package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultEquatorDiffblueTest {
  /**
   * Test {@link DefaultEquator#defaultEquator()}.
   * <p>
   * Method under test: {@link DefaultEquator#defaultEquator()}
   */
  @Test
  @DisplayName("Test defaultEquator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"DefaultEquator DefaultEquator.defaultEquator()"})
  void testDefaultEquator() {
    // Arrange and Act
    DefaultEquator<Object> actualDefaultEquatorResult = DefaultEquator.defaultEquator();

    // Assert
    assertEquals(1662, actualDefaultEquatorResult.hash("42"));
  }

  /**
   * Test {@link DefaultEquator#equate(Object, Object)}.
   * <ul>
   *   <li>When forty-two.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultEquator#equate(Object, Object)}
   */
  @Test
  @DisplayName("Test equate(Object, Object); when forty-two; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DefaultEquator.equate(Object, Object)"})
  void testEquate_whenFortyTwo_thenReturnTrue() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(defaultEquatorResult.equate(42, 42));
  }

  /**
   * Test {@link DefaultEquator#equate(Object, Object)}.
   * <ul>
   *   <li>When {@code O1}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultEquator#equate(Object, Object)}
   */
  @Test
  @DisplayName("Test equate(Object, Object); when 'O1'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean DefaultEquator.equate(Object, Object)"})
  void testEquate_whenO1_thenReturnFalse() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(defaultEquatorResult.equate("O1", "O2"));
  }

  /**
   * Test {@link DefaultEquator#hash(Object)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code 1662}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultEquator#hash(Object)}
   */
  @Test
  @DisplayName("Test hash(Object); when '42'; then return '1662'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int DefaultEquator.hash(Object)"})
  void testHash_when42_thenReturn1662() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1662, defaultEquatorResult.hash("42"));
  }

  /**
   * Test {@link DefaultEquator#hash(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link DefaultEquator#HASHCODE_NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link DefaultEquator#hash(Object)}
   */
  @Test
  @DisplayName("Test hash(Object); when 'null'; then return HASHCODE_NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int DefaultEquator.hash(Object)"})
  void testHash_whenNull_thenReturnHashcode_null() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(DefaultEquator.HASHCODE_NULL, defaultEquatorResult.hash(null));
  }
}
