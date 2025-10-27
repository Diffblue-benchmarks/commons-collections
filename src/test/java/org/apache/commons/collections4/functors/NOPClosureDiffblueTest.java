package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Closure;
import org.junit.Test;

public class NOPClosureDiffblueTest {
  /**
   * Method under test: {@link NOPClosure#nopClosure()}
   */
  @Test
  public void testNopClosure() {
    // Arrange and Act
    Closure<Object> actualNopClosureResult = NOPClosure.nopClosure();
    actualNopClosureResult.execute("42");

    // Assert that nothing has changed
    assertTrue(actualNopClosureResult instanceof NOPClosure);
  }
}
