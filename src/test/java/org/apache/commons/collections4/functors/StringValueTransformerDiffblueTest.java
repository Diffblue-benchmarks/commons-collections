package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class StringValueTransformerDiffblueTest {
  /**
   * Method under test: {@link StringValueTransformer#stringValueTransformer()}
   */
  @Test
  public void testStringValueTransformer() {
    // Arrange and Act
    Transformer<Object, String> actualStringValueTransformerResult = StringValueTransformer.stringValueTransformer();
    String actualTransformResult = actualStringValueTransformerResult.transform("42");

    // Assert
    assertTrue(actualStringValueTransformerResult instanceof StringValueTransformer);
    assertEquals("42", actualStringValueTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualStringValueTransformerResult.transform("Input"));
  }
}
