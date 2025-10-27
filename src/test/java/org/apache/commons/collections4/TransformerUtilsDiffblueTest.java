package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.functors.CloneTransformer;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.InstantiateTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.NOPTransformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.junit.Test;

public class TransformerUtilsDiffblueTest {
  /**
   * Method under test: {@link TransformerUtils#asTransformer(Factory)}
   */
  @Test
  public void testAsTransformer() {
    // Arrange
    ConstantFactory<Object> factory = new ConstantFactory<>("Constant To Return");

    // Act
    Transformer<Object, Object> actualAsTransformerResult = TransformerUtils.asTransformer(factory);

    // Assert
    assertTrue(actualAsTransformerResult instanceof FactoryTransformer);
    assertEquals("Constant To Return", actualAsTransformerResult.transform("42"));
    assertSame(factory, ((FactoryTransformer<Object, Object>) actualAsTransformerResult).getFactory());
  }

  /**
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform("42");

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
  }

  /**
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    actualCloneTransformerResult.transform(1);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
  }

  /**
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer3() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(null);

    // Assert
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertNull(actualTransformResult);
  }

  /**
   * Method under test: {@link TransformerUtils#cloneTransformer()}
   */
  @Test
  public void testCloneTransformer4() {
    // Arrange and Act
    Transformer<Object, Object> actualCloneTransformerResult = TransformerUtils.cloneTransformer();
    Object actualTransformResult = actualCloneTransformerResult.transform(new ArrayList<>());

    // Assert
    assertTrue(actualTransformResult instanceof List);
    assertTrue(actualCloneTransformerResult instanceof CloneTransformer);
    assertEquals("42", actualCloneTransformerResult.apply("42"));
    assertEquals("Input", actualCloneTransformerResult.transform("Input"));
    assertTrue(((List<Object>) actualTransformResult).isEmpty());
  }

  /**
   * Method under test: {@link TransformerUtils#constantTransformer(Object)}
   */
  @Test
  public void testConstantTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualConstantTransformerResult = TransformerUtils
        .constantTransformer("Constant To Return");

    // Assert
    assertTrue(actualConstantTransformerResult instanceof ConstantTransformer);
    assertEquals("Constant To Return", actualConstantTransformerResult.transform("42"));
    assertEquals("Constant To Return",
        ((ConstantTransformer<Object, Object>) actualConstantTransformerResult).getConstant());
  }

  /**
   * Method under test: {@link TransformerUtils#instantiateTransformer()}
   */
  @Test
  public void testInstantiateTransformer() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = TransformerUtils.instantiateTransformer();
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Method under test:
   * {@link TransformerUtils#instantiateTransformer(Class[], Object[])}
   */
  @Test
  public void testInstantiateTransformer2() {
    // Arrange and Act
    Transformer<Class<?>, Object> actualInstantiateTransformerResult = TransformerUtils.instantiateTransformer(null,
        null);
    Class<Object> forNameResult = Object.class;
    actualInstantiateTransformerResult.transform(forNameResult);

    // Assert
    assertTrue(actualInstantiateTransformerResult instanceof InstantiateTransformer);
  }

  /**
   * Method under test: {@link TransformerUtils#mapTransformer(Map)}
   */
  @Test
  public void testMapTransformer() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    Transformer<Object, Object> actualMapTransformerResult = TransformerUtils.mapTransformer(map);

    // Assert
    assertTrue(actualMapTransformerResult instanceof MapTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    Map<? super Object, ?> map2 = ((MapTransformer<Object, Object>) actualMapTransformerResult).getMap();
    assertTrue(map2.isEmpty());
    assertSame(map, map2);
  }

  /**
   * Method under test: {@link TransformerUtils#mapTransformer(Map)}
   */
  @Test
  public void testMapTransformer2() {
    // Arrange and Act
    Transformer<Object, Object> actualMapTransformerResult = TransformerUtils.mapTransformer(null);

    // Assert
    assertTrue(actualMapTransformerResult instanceof ConstantTransformer);
    assertNull(actualMapTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualMapTransformerResult).getConstant());
  }

  /**
   * Method under test: {@link TransformerUtils#nopTransformer()}
   */
  @Test
  public void testNopTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNopTransformerResult = TransformerUtils.nopTransformer();
    Object actualTransformResult = actualNopTransformerResult.transform("42");

    // Assert
    assertTrue(actualNopTransformerResult instanceof NOPTransformer);
    assertEquals("42", actualNopTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualNopTransformerResult.transform("Input"));
  }

  /**
   * Method under test: {@link TransformerUtils#nullTransformer()}
   */
  @Test
  public void testNullTransformer() {
    // Arrange and Act
    Transformer<Object, Object> actualNullTransformerResult = TransformerUtils.nullTransformer();

    // Assert
    assertTrue(actualNullTransformerResult instanceof ConstantTransformer);
    assertNull(actualNullTransformerResult.transform("42"));
    assertNull(((ConstantTransformer<Object, Object>) actualNullTransformerResult).getConstant());
  }

  /**
   * Method under test: {@link TransformerUtils#stringValueTransformer()}
   */
  @Test
  public void testStringValueTransformer() {
    // Arrange and Act
    Transformer<Object, String> actualStringValueTransformerResult = TransformerUtils.stringValueTransformer();
    String actualTransformResult = actualStringValueTransformerResult.transform("42");

    // Assert
    assertTrue(actualStringValueTransformerResult instanceof StringValueTransformer);
    assertEquals("42", actualStringValueTransformerResult.apply("42"));
    assertEquals("42", actualTransformResult);
    assertEquals("Input", actualStringValueTransformerResult.transform("Input"));
  }
}
