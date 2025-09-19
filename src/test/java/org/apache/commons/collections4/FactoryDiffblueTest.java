package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FactoryDiffblueTest {
  /**
   * Test {@link Factory#get()}.
   *
   * <p>Method under test: {@link Factory#get()}
   */
  @Test
  @DisplayName("Test get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Factory.get()"})
  void testGet() {
    // Arrange
    ConstantFactory<Object> constantFactory = new ConstantFactory<>("Constant To Return");

    // Act and Assert
    assertEquals("Constant To Return", constantFactory.get());
  }
}
