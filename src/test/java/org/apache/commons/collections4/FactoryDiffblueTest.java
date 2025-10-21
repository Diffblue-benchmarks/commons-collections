package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FactoryDiffblueTest {
  /**
   * Test {@link Factory#get()}.
   * <p>
   * Method under test: {@link Factory#get()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Factory.get()"})
  public void testGet() {
    // Arrange
    ConstantFactory<Object> constantFactory = new ConstantFactory<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantFactory.get());
  }
}
