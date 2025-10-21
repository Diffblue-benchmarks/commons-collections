package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FactoryTransformerDiffblueTest {
  /**
   * Test {@link FactoryTransformer#factoryTransformer(Factory)}.
   * <p>
   * Method under test: {@link FactoryTransformer#factoryTransformer(Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Transformer FactoryTransformer.factoryTransformer(Factory)"})
  public void testFactoryTransformer() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);
    when(factory.get()).thenReturn("Get");

    // Act
    Transformer<Object, Object> actualFactoryTransformerResult = FactoryTransformer.factoryTransformer(factory);
    Object actualTransformResult = actualFactoryTransformerResult.transform("42");

    // Assert
    verify(factory).get();
    assertTrue(actualFactoryTransformerResult instanceof FactoryTransformer);
    assertEquals("Get", actualTransformResult);
    assertSame(factory, ((FactoryTransformer<Object, Object>) actualFactoryTransformerResult).getFactory());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FactoryTransformer#FactoryTransformer(Factory)}
   *   <li>{@link FactoryTransformer#getFactory()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FactoryTransformer.<init>(Factory)", "Factory FactoryTransformer.getFactory()"})
  public void testGettersAndSetters() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);

    // Act
    FactoryTransformer<Object, Object> actualFactoryTransformer = new FactoryTransformer<>(factory);

    // Assert
    assertSame(factory, actualFactoryTransformer.getFactory());
  }

  /**
   * Test {@link FactoryTransformer#transform(Object)}.
   * <p>
   * Method under test: {@link FactoryTransformer#transform(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FactoryTransformer.transform(Object)"})
  public void testTransform() {
    // Arrange
    Factory<Object> factory = mock(Factory.class);
    when(factory.get()).thenReturn("Get");
    FactoryTransformer<Object, Object> factoryTransformer = new FactoryTransformer<>(factory);

    // Act
    Object actualTransformResult = factoryTransformer.transform("Input");

    // Assert
    verify(factory).get();
    assertEquals("Get", actualTransformResult);
  }
}
