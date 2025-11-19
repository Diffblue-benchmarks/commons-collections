package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConstantTransformerDiffblueTest {
  /**
   * Test {@link ConstantTransformer#constantTransformer(Object)}.
   *
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Constant To Return}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantTransformer#constantTransformer(Object)}
   */
  @Test
  @DisplayName(
      "Test constantTransformer(Object); then return transform '42' is 'Constant To Return'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ConstantTransformer.constantTransformer(Object)"})
  void testConstantTransformer_thenReturnTransform42IsConstantToReturn() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult =
        ConstantTransformer.constantTransformer("Constant To Return");
    Object actualTransformResult = actualConstantTransformerResult.transform("42");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertEquals("Constant To Return", actualTransformResult);
    assertEquals(
        "Constant To Return",
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link ConstantTransformer#constantTransformer(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return transform {@code 42} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantTransformer#constantTransformer(Object)}
   */
  @Test
  @DisplayName(
      "Test constantTransformer(Object); when 'null'; then return transform '42' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ConstantTransformer.constantTransformer(Object)"})
  void testConstantTransformer_whenNull_thenReturnTransform42IsNull() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult =
        ConstantTransformer.constantTransformer(null);
    Object actualTransformResult = actualConstantTransformerResult.transform("42");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link ConstantTransformer#nullTransformer()}.
   *
   * <p>Method under test: {@link ConstantTransformer#nullTransformer()}
   */
  @Test
  @DisplayName("Test nullTransformer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Transformer ConstantTransformer.nullTransformer()"})
  void testNullTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNullTransformerResult = ConstantTransformer.nullTransformer();
    Object actualTransformResult = actualNullTransformerResult.transform("42");

    // Assert
    assertTrue(actualNullTransformerResult instanceof ConstantTransformer);
    assertNull(actualTransformResult);
    assertNull(((ConstantTransformer<Object, Object>) actualNullTransformerResult).getConstant());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantTransformer#ConstantTransformer(Object)}
   *   <li>{@link ConstantTransformer#getConstant()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ConstantTransformer.<init>(Object)",
    "Object ConstantTransformer.getConstant()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ConstantTransformer<Object, Object> actualConstantTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Assert
    assertEquals("Constant To Return", actualConstantTransformer.getConstant());
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}, and {@link ConstantTransformer#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantTransformer#equals(Object)}
   *   <li>{@link ConstantTransformer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantTransformer.equals(Object)",
    "int ConstantTransformer.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer =
        new ConstantTransformer<>("Constant To Return");
    ConstantTransformer<Object, Object> constantTransformer2 =
        new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals(constantTransformer, constantTransformer2);
    assertEquals(constantTransformer.hashCode(), constantTransformer2.hashCode());
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}, and {@link ConstantTransformer#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantTransformer#equals(Object)}
   *   <li>{@link ConstantTransformer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantTransformer.equals(Object)",
    "int ConstantTransformer.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals(constantTransformer, constantTransformer);
    int expectedHashCodeResult = constantTransformer.hashCode();
    assertEquals(expectedHashCodeResult, constantTransformer.hashCode());
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantTransformer.equals(Object)",
    "int ConstantTransformer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>(1);

    // Act and Assert
    assertNotEquals(constantTransformer, new ConstantTransformer<>("Constant To Return"));
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantTransformer.equals(Object)",
    "int ConstantTransformer.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(
        constantTransformer,
        new ConstantTransformer<>(new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantTransformer.equals(Object)",
    "int ConstantTransformer.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, null);
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantTransformer.equals(Object)",
    "int ConstantTransformer.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, "Different type to ConstantTransformer");
  }

  /**
   * Test {@link ConstantTransformer#transform(Object)}.
   *
   * <p>Method under test: {@link ConstantTransformer#transform(Object)}
   */
  @Test
  @DisplayName("Test transform(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ConstantTransformer.transform(Object)"})
  void testTransform() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer =
        new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantTransformer.transform("Input"));
  }
}
