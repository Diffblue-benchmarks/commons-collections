package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EnhancedDoubleHasherDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link EnhancedDoubleHasher#getIncrement()}
   *   <li>{@link EnhancedDoubleHasher#getInitial()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    EnhancedDoubleHasher enhancedDoubleHasher = new EnhancedDoubleHasher(1L, 1L);

    // Act
    long actualIncrement = enhancedDoubleHasher.getIncrement();

    // Assert
    assertEquals(1L, actualIncrement);
    assertEquals(1L, enhancedDoubleHasher.getInitial());
  }
}
