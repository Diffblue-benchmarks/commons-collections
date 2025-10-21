package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class OrderedPropertiesFactoryDiffblueTest {
  /**
   * Test {@link OrderedPropertiesFactory#createProperties()}.
   * <p>
   * Method under test: {@link OrderedPropertiesFactory#createProperties()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "org.apache.commons.collections4.properties.OrderedProperties OrderedPropertiesFactory.createProperties()"})
  public void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(OrderedPropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
