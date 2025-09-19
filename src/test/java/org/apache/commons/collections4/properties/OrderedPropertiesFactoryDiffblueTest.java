package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OrderedPropertiesFactoryDiffblueTest {
  /**
   * Test {@link OrderedPropertiesFactory#createProperties()}.
   *
   * <p>Method under test: {@link OrderedPropertiesFactory#createProperties()}
   */
  @Test
  @DisplayName("Test createProperties()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.collections4.properties.OrderedProperties OrderedPropertiesFactory.createProperties()"
  })
  void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(OrderedPropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
