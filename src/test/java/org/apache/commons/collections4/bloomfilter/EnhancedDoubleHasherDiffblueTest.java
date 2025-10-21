package org.apache.commons.collections4.bloomfilter;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EnhancedDoubleHasherDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long EnhancedDoubleHasher.getIncrement()", "long EnhancedDoubleHasher.getInitial()"})
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
