package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EnhancedDoubleHasherDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EnhancedDoubleHasher#getIncrement()}
   *   <li>{@link EnhancedDoubleHasher#getInitial()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"long EnhancedDoubleHasher.getIncrement()", "long EnhancedDoubleHasher.getInitial()"})
  void testGettersAndSetters() {
    // Arrange
    EnhancedDoubleHasher enhancedDoubleHasher = new EnhancedDoubleHasher(1L, 1L);

    // Act
    long actualIncrement = enhancedDoubleHasher.getIncrement();

    // Assert
    assertEquals(1L, actualIncrement);
    assertEquals(1L, enhancedDoubleHasher.getInitial());
  }
}
