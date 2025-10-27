package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SortedPropertiesFactoryDiffblueTest {
  /**
   * Method under test: {@link SortedPropertiesFactory#createProperties()}
   */
  @Test
  public void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(SortedPropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
