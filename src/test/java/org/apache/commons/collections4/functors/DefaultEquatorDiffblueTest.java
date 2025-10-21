package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DefaultEquatorDiffblueTest {
  /**
   * Test {@link DefaultEquator#defaultEquator()}.
   * <p>
   * Method under test: {@link DefaultEquator#defaultEquator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"DefaultEquator DefaultEquator.defaultEquator()"})
  public void testDefaultEquator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultEquator.equate(Object, Object)"})
  public void testEquate_whenFortyTwo_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DefaultEquator.equate(Object, Object)"})
  public void testEquate_whenO1_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int DefaultEquator.hash(Object)"})
  public void testHash_when42_thenReturn1662() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int DefaultEquator.hash(Object)"})
  public void testHash_whenNull_thenReturnHashcode_null() {
    // Arrange
    DefaultEquator<Object> defaultEquatorResult = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(DefaultEquator.HASHCODE_NULL, defaultEquatorResult.hash(null));
  }
}
