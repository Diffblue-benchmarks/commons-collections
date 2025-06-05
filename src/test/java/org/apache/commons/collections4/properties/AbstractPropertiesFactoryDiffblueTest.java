package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.properties.AbstractPropertiesFactory.PropertyFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractPropertiesFactoryDiffblueTest {
  /**
   * Test PropertyFormat {@link PropertyFormat#toPropertyFormat(String)}.
   * <ul>
   *   <li>When {@code foo.txt}.</li>
   *   <li>Then return {@code PROPERTIES}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PropertyFormat#toPropertyFormat(String)}
   */
  @Test
  @DisplayName("Test PropertyFormat toPropertyFormat(String); when 'foo.txt'; then return 'PROPERTIES'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PropertyFormat PropertyFormat.toPropertyFormat(String)"})
  void testPropertyFormatToPropertyFormat_whenFooTxt_thenReturnProperties() {
    // Arrange, Act and Assert
    assertEquals(PropertyFormat.PROPERTIES, PropertyFormat.toPropertyFormat("foo.txt"));
  }

  /**
   * Test PropertyFormat {@link PropertyFormat#toPropertyFormat(String)}.
   * <ul>
   *   <li>When {@code .xml}.</li>
   *   <li>Then return {@code XML}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PropertyFormat#toPropertyFormat(String)}
   */
  @Test
  @DisplayName("Test PropertyFormat toPropertyFormat(String); when '.xml'; then return 'XML'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PropertyFormat PropertyFormat.toPropertyFormat(String)"})
  void testPropertyFormatToPropertyFormat_whenXml_thenReturnXml() {
    // Arrange, Act and Assert
    assertEquals(PropertyFormat.XML, PropertyFormat.toPropertyFormat(".xml"));
  }
}
