package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Factory;
import org.junit.Test;

public class InstantiateFactoryDiffblueTest {
  /**
   * Method under test:
   * {@link InstantiateFactory#instantiateFactory(Class, Class[], Object[])}
   */
  @Test
  public void testInstantiateFactory() {
    // Arrange
    Class<Object> classToInstantiate = Object.class;

    // Act
    Factory<Object> actualInstantiateFactoryResult = InstantiateFactory.instantiateFactory(classToInstantiate, null,
        null);
    actualInstantiateFactoryResult.create();

    // Assert
    assertTrue(actualInstantiateFactoryResult instanceof InstantiateFactory);
  }
}
