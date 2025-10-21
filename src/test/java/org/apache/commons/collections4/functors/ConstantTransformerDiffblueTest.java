package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ConstantTransformerDiffblueTest {
  /**
   * Test {@link ConstantTransformer#constantTransformer(Object)}.
   * <p>
   * Method under test: {@link ConstantTransformer#constantTransformer(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ConstantTransformer.constantTransformer(Object)"})
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
   * Test {@link ConstantTransformer#nullTransformer()}.
   * <p>
   * Method under test: {@link ConstantTransformer#nullTransformer()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer ConstantTransformer.nullTransformer()"})
  public void testNullTransformer() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ConstantTransformer.<init>(Object)", "Object ConstantTransformer.getConstant()"})
  public void testGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ConstantTransformer.equals(Object)", "int ConstantTransformer.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ConstantTransformer.transform(Object)"})
  public void testTransform() {
    // Arrange
    ConstantTransformer<Object, Object> constantTransformer = new ConstantTransformer<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantTransformer.transform("Input"));
  }
}
