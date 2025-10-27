package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AbstractPropertiesFactoryDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractPropertiesFactory.PropertyFormat#toPropertyFormat(String)}
   */
  @Test
  public void testPropertyFormatToPropertyFormat() {
    // Arrange, Act and Assert
    assertEquals(AbstractPropertiesFactory.PropertyFormat.PROPERTIES,
        AbstractPropertiesFactory.PropertyFormat.toPropertyFormat("foo.txt"));
    assertEquals(AbstractPropertiesFactory.PropertyFormat.XML,
        AbstractPropertiesFactory.PropertyFormat.toPropertyFormat(".xml"));
  }
}
