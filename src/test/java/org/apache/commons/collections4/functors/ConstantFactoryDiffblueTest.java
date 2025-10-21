package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Factory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ConstantFactoryDiffblueTest {
  /**
   * Test {@link ConstantFactory#constantFactory(Object)}.
   * <p>
   * Method under test: {@link ConstantFactory#constantFactory(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Factory ConstantFactory.constantFactory(Object)"})
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
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConstantFactory#ConstantFactory(Object)}
   *   <li>{@link ConstantFactory#getConstant()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ConstantFactory.<init>(Object)", "Object ConstantFactory.getConstant()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    ConstantFactory<Object> actualConstantFactory = new ConstantFactory<>("Constant To Return");

    // Assert
    assertEquals("Constant To Return", actualConstantFactory.getConstant());
  }

  /**
   * Test {@link ConstantFactory#create()}.
   * <p>
   * Method under test: {@link ConstantFactory#create()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ConstantFactory.create()"})
  public void testCreate() {
    // Arrange
    ConstantFactory<Object> constantFactory = new ConstantFactory<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantFactory.create());
  }
}
