package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UniquePredicateDiffblueTest {
  /**
   * Test {@link UniquePredicate#test(Object)}.
   * <p>
   * Method under test: {@link UniquePredicate#test(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean UniquePredicate.test(Object)"})
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
