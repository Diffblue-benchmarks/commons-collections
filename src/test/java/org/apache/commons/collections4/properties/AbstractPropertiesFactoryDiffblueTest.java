package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.properties.AbstractPropertiesFactory.PropertyFormat;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractPropertiesFactoryDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PropertyFormat PropertyFormat.toPropertyFormat(String)"})
  public void testPropertyFormatToPropertyFormat_whenFooTxt_thenReturnProperties() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PropertyFormat PropertyFormat.toPropertyFormat(String)"})
  public void testPropertyFormatToPropertyFormat_whenXml_thenReturnXml() {
    // Arrange, Act and Assert
    assertEquals(PropertyFormat.XML, PropertyFormat.toPropertyFormat(".xml"));
  }
}
