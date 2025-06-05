package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SortedPropertiesFactoryDiffblueTest {
  /**
   * Test {@link SortedPropertiesFactory#createProperties()}.
   * <p>
   * Method under test: {@link SortedPropertiesFactory#createProperties()}
   */
  @Test
  @DisplayName("Test createProperties()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "org.apache.commons.collections4.properties.SortedProperties SortedPropertiesFactory.createProperties()"})
  void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(SortedPropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
