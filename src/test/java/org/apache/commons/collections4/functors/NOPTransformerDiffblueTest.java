package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NOPTransformerDiffblueTest {
  /**
   * Test {@link NOPTransformer#nopTransformer()}.
   *
   * <p>Method under test: {@link NOPTransformer#nopTransformer()}
   */
  @Test
  @DisplayName("Test nopTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer NOPTransformer.nopTransformer()"})
  void testNopTransformer() {
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
