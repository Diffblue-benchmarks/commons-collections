package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertiesFactoryDiffblueTest {
  /**
   * Method under test: {@link PropertiesFactory#createProperties()}
   */
  @Test
  public void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(PropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
