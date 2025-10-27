package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Factory;
import org.junit.Test;

public class PrototypeFactoryDiffblueTest {
  /**
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  public void testPrototypeFactory() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory("Prototype");

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof InstantiateFactory);
    assertEquals("Prototype", actualPrototypeFactoryResult.create());
    assertEquals("Prototype", actualPrototypeFactoryResult.get());
  }

  /**
   * Method under test: {@link PrototypeFactory#prototypeFactory(Object)}
   */
  @Test
  public void testPrototypeFactory2() {
    // Arrange and Act
    Factory<Object> actualPrototypeFactoryResult = PrototypeFactory.prototypeFactory(null);

    // Assert
    assertTrue(actualPrototypeFactoryResult instanceof ConstantFactory);
    assertNull(actualPrototypeFactoryResult.create());
    assertNull(actualPrototypeFactoryResult.get());
    assertNull(((ConstantFactory<Object>) actualPrototypeFactoryResult).getConstant());
  }
}
