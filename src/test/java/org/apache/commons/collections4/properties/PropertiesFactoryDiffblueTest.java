package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PropertiesFactoryDiffblueTest {
  /**
   * Test {@link PropertiesFactory#createProperties()}.
   *
   * <p>Method under test: {@link PropertiesFactory#createProperties()}
   */
  @Test
  @DisplayName("Test createProperties()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Properties PropertiesFactory.createProperties()"})
  void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(PropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
