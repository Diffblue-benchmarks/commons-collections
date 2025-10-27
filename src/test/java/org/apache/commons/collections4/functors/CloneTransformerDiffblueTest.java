package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class CloneTransformerDiffblueTest {
  /**
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = CloneTransformer.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform("42");

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
  }

  /**
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = CloneTransformer.cloneTransformer();
    actualCloneTransformerResult.transform(1);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
  }

  /**
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer3() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = CloneTransformer.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(null);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertNull(actualTransformResult);
  }

  /**
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer4() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = CloneTransformer.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(new ArrayList<>());

    // Assert
    assertTrue(actualTransformResult instanceof List);
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertTrue(((List<Object>) actualTransformResult).isEmpty());
  }
}
