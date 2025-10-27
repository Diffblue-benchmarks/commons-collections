package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UniquePredicateDiffblueTest {
  /**
   * Method under test: {@link UniquePredicate#test(Object)}
   */
  @Test
  public void testTest() {
    // Arrange
    UniquePredicate<Object> uniquePredicate = new UniquePredicate<>();

    // Act
    boolean actualTestResult = uniquePredicate.test("Object");

    // Assert
    assertFalse(uniquePredicate.evaluate("Object"));
    assertTrue(actualTestResult);
  }
}
