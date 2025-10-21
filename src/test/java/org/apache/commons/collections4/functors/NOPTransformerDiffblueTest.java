package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NOPTransformerDiffblueTest {
  /**
   * Test {@link NOPTransformer#nopTransformer()}.
   * <p>
   * Method under test: {@link NOPTransformer#nopTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer NOPTransformer.nopTransformer()"})
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
