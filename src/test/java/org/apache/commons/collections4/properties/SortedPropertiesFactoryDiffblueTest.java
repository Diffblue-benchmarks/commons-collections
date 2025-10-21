package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SortedPropertiesFactoryDiffblueTest {
  /**
   * Test {@link SortedPropertiesFactory#createProperties()}.
   * <p>
   * Method under test: {@link SortedPropertiesFactory#createProperties()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "org.apache.commons.collections4.properties.SortedProperties SortedPropertiesFactory.createProperties()"})
  public void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(SortedPropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
