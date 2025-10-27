package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OrderedPropertiesFactoryDiffblueTest {
  /**
   * Method under test: {@link OrderedPropertiesFactory#createProperties()}
   */
  @Test
  public void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(OrderedPropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
