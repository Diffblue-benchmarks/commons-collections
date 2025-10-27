package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;

public class FactoryTransformerDiffblueTest {
  /**
   * Method under test: {@link FactoryTransformer#factoryTransformer(Factory)}
   */
  @Test
  public void testFactoryTransformer() {
    // Arrange
    ConstantFactory<Object> factory = new ConstantFactory<>("Constant To Return");

    // Act
    Transformer<Object, Object> actualFactoryTransformerResult = FactoryTransformer.factoryTransformer(factory);

    // Assert
    assertTrue(actualFactoryTransformerResult instanceof FactoryTransformer);
    assertEquals("Constant To Return", actualFactoryTransformerResult.transform("42"));
    assertSame(factory, ((FactoryTransformer<Object, Object>) actualFactoryTransformerResult).getFactory());
  }

  /**
   * Method under test: {@link FactoryTransformer#transform(Object)}
   */
  @Test
  public void testTransform() {
    // Arrange
    FactoryTransformer<Object, Object> factoryTransformer = new FactoryTransformer<>(
        new ConstantFactory<>("Constant To Return"));

    // Act and Assert
    assertEquals("Constant To Return", factoryTransformer.transform("Input"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FactoryTransformer#FactoryTransformer(Factory)}
   *   <li>{@link FactoryTransformer#getFactory()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ConstantFactory<Object> factory = new ConstantFactory<>("Constant To Return");

    // Act
    FactoryTransformer<Object, Object> actualFactoryTransformer = new FactoryTransformer<>(factory);

    // Assert
    assertSame(factory, actualFactoryTransformer.getFactory());
  }
}
