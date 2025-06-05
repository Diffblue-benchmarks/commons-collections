package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConstantTransformerDiffblueTest {
  /**
   * Test {@link ConstantTransformer#constantTransformer(Object)}.
   * <ul>
   *   <li>Then return transform {@code 42} is {@code Constant To Return}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTransformer#constantTransformer(Object)}
   */
  @Test
  @DisplayName("Test constantTransformer(Object); then return transform '42' is 'Constant To Return'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer ConstantTransformer.constantTransformer(Object)"})
  void testConstantTransformer_thenReturnTransform42IsConstantToReturn() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult = ConstantTransformer
        .constantTransformer("Constant To Return");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertEquals("Constant To Return", actualConstantTransformerResult.transform("42"));
    assertEquals("Constant To Return",
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link ConstantTransformer#constantTransformer(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return transform {@code 42} is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTransformer#constantTransformer(Object)}
   */
  @Test
  @DisplayName("Test constantTransformer(Object); when 'null'; then return transform '42' is 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer ConstantTransformer.constantTransformer(Object)"})
  void testConstantTransformer_whenNull_thenReturnTransform42IsNull() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult = ConstantTransformer.constantTransformer(null);

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertNull(actualConstantTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Test {@link ConstantTransformer#nullTransformer()}.
   * <p>
   * Method under test: {@link ConstantTransformer#nullTransformer()}
   */
  @Test
  @DisplayName("Test nullTransformer()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Transformer ConstantTransformer.nullTransformer()"})
  void testNullTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNullTransformerResult = ConstantTransformer.nullTransformer();

    // Assert
    assertTrue(actualNullTransformerResult instanceof ConstantTransformer);
    assertNull(actualNullTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualNullTransformerResult).getConstant());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantTransformer#ConstantTransformer(Object)}
   *   <li>{@link ConstantTransformer#getConstant()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ConstantTransformer.<init>(Object)", "Object ConstantTransformer.getConstant()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ConstantTransformer<Object, Object> actualConstantTransformer = new ConstantTransformer<>("Constant To Return");

    // Assert
    assertEquals("Constant To Return", actualConstantTransformer.getConstant());
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}, and {@link ConstantTransformer#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantTransformer#equals(Object)}
   *   <li>{@link ConstantTransformer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");
    ConstantTransformer<Object, Object> constantTransformer2 = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals(constantTransformer, constantTransformer2);
    int expectedHashCodeResult = constantTransformer.hashCode();
    assertEquals(expectedHashCodeResult, constantTransformer2.hashCode());
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}, and {@link ConstantTransformer#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantTransformer#equals(Object)}
   *   <li>{@link ConstantTransformer#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals(constantTransformer, constantTransformer);
    int expectedHashCodeResult = constantTransformer.hashCode();
    assertEquals(expectedHashCodeResult, constantTransformer.hashCode());
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>(1);

    // Act and Assert
    assertNotEquals(constantTransformer, new ConstantTransformer<>("Constant To Return"));
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, new ConstantTransformer<>(new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, null);
  }

  /**
   * Test {@link ConstantTransformer#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, "Different type to ConstantTransformer");
  }

  /**
   * Test {@link ConstantTransformer#transform(Object)}.
   * <p>
   * Method under test: {@link ConstantTransformer#transform(Object)}
   */
  @Test
  @DisplayName("Test transform(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ConstantTransformer.transform(Object)"})
  void testTransform() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantTransformer.transform("Input"));
  }
}
