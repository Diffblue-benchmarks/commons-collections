package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StringValueTransformerDiffblueTest {
  /**
   * Test {@link StringValueTransformer#stringValueTransformer()}.
   *
   * <p>Method under test: {@link StringValueTransformer#stringValueTransformer()}
   */
  @Test
  @DisplayName("Test stringValueTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer StringValueTransformer.stringValueTransformer()"})
  void testStringValueTransformer() {
    // Arrange and Act
    Transformer<Object, String> actualStringValueTransformerResult =
        StringValueTransformer.stringValueTransformer();
    String actualTransformResult = actualStringValueTransformerResult.transform("42");

    // Assert
    assertTrue(actualStringValueTransformerResult instanceof StringValueTransformer);
    assertEquals("42", actualStringValueTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualStringValueTransformerResult.transform("Input"));
  }
}
