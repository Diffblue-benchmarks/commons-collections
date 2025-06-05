package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CloneTransformerDiffblueTest {
  /**
   * Test {@link CloneTransformer#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform '42' is '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer CloneTransformer.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransform42Is42() {
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
   * Test {@link CloneTransformer#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform {@link ArrayList#ArrayList()} is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform ArrayList() is ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer CloneTransformer.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransformArrayListIsArrayList() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = CloneTransformer.cloneTransformer();
    ArrayList<Object> objectList = new ArrayList<>();
    Object actualTransformResult = actualCloneTransformerResult.transform(objectList);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertEquals(objectList, actualTransformResult);
  }

  /**
   * Test {@link CloneTransformer#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform {@code null} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform 'null' is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer CloneTransformer.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransformNullIsNull() {
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
   * Test {@link CloneTransformer#cloneTransformer()}.
   * <ul>
   *   <li>Then return transform one intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CloneTransformer#cloneTransformer()}
   */
  @Test
  @DisplayName("Test cloneTransformer(); then return transform one intValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer CloneTransformer.cloneTransformer()"})
  void testCloneTransformer_thenReturnTransformOneIntValueIsOne() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = CloneTransformer.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(1);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertEquals(1, ((Integer) actualTransformResult).intValue());
  }
}
