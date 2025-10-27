package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class NOPTransformerDiffblueTest {
  /**
   * Method under test: {@link NOPTransformer#nopTransformer()}
   */
  @Test
  public void testNopTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNopTransformerResult = NOPTransformer.nopTransformer();
    Object actualTransformResult = actualNopTransformerResult.transform("42");

    // Assert
    assertTrue(actualNopTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualNopTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualNopTransformerResult.transform("Input"));
  }
}
