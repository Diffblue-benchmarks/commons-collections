package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PropertiesFactoryDiffblueTest {
  /**
   * Test {@link PropertiesFactory#createProperties()}.
   * <p>
   * Method under test: {@link PropertiesFactory#createProperties()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Properties PropertiesFactory.createProperties()"})
  public void testCreateProperties() {
    // Arrange, Act and Assert
    assertTrue(PropertiesFactory.INSTANCE.createProperties().isEmpty());
  }
}
