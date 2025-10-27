package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class FactoryDiffblueTest {
  /**
   * Method under test: {@link Factory#get()}
   */
  @Test
  public void testGet() {
    // Arrange
    ConstantFactory<Object> constantFactory = new ConstantFactory<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantFactory.get());
  }
}
