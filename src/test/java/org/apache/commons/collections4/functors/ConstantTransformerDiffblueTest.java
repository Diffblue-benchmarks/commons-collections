package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class ConstantTransformerDiffblueTest {
  /**
   * Method under test: {@link ConstantTransformer#constantTransformer(Object)}
   */
  @Test
  public void testConstantTransformer() {
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
   * Method under test: {@link ConstantTransformer#nullTransformer()}
   */
  @Test
  public void testNullTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNullTransformerResult = ConstantTransformer.nullTransformer();

    // Assert
    assertTrue(actualNullTransformerResult instanceof ConstantTransformer);
    assertNull(actualNullTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualNullTransformerResult).getConstant());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantTransformer#equals(Object)}
   *   <li>{@link ConstantTransformer#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");
    ConstantTransformer<Object, Object> constantTransformer2 = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals(constantTransformer, constantTransformer2);
    int expectedHashCodeResult = constantTransformer.hashCode();
    assertEquals(expectedHashCodeResult, constantTransformer2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantTransformer#equals(Object)}
   *   <li>{@link ConstantTransformer#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals(constantTransformer, constantTransformer);
    int expectedHashCodeResult = constantTransformer.hashCode();
    assertEquals(expectedHashCodeResult, constantTransformer.hashCode());
  }

  /**
   * Method under test: {@link ConstantTransformer#transform(Object)}
   */
  @Test
  public void testTransform() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantTransformer.transform("Input"));
  }

  /**
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>(1);

    // Act and Assert
    assertNotEquals(constantTransformer, new ConstantTransformer<>("Constant To Return"));
  }

  /**
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, new ConstantTransformer<>(new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, null);
  }

  /**
   * Method under test: {@link ConstantTransformer#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertNotEquals(constantTransformer, "Different type to ConstantTransformer");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantTransformer#ConstantTransformer(Object)}
   *   <li>{@link ConstantTransformer#getConstant()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    ConstantTransformer<Object, Object> actualConstantTransformer = new ConstantTransformer<>("Constant To Return");

    // Assert
    assertEquals("Constant To Return", actualConstantTransformer.getConstant());
  }
}
