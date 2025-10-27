package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Factory;
import org.junit.Test;

public class ConstantFactoryDiffblueTest {
  /**
   * Method under test: {@link ConstantFactory#constantFactory(Object)}
   */
  @Test
  public void testConstantFactory() {
    // Arrange and Act
    Factory<Object> actualConstantFactoryResult = ConstantFactory.constantFactory("Constant To Return");

    // Assert
    assertTrue(actualConstantFactoryResult instanceof ConstantFactory);
    assertEquals("Constant To Return", actualConstantFactoryResult.create());
    assertEquals("Constant To Return", actualConstantFactoryResult.get());
    assertEquals("Constant To Return", ((ConstantFactory<Object>) actualConstantFactoryResult).getConstant());
  }

  /**
   * Method under test: {@link ConstantFactory#create()}
   */
  @Test
  public void testCreate() {
    // Arrange
    ConstantFactory<Object> constantFactory = new ConstantFactory<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantFactory.create());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantFactory#ConstantFactory(Object)}
   *   <li>{@link ConstantFactory#getConstant()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    ConstantFactory<Object> actualConstantFactory = new ConstantFactory<>("Constant To Return");

    // Assert
    assertEquals("Constant To Return", actualConstantFactory.getConstant());
  }
}
