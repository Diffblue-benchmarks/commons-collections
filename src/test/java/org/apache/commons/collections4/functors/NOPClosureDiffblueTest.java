package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NOPClosureDiffblueTest {
  /**
   * Test {@link NOPClosure#nopClosure()}.
   * <p>
   * Method under test: {@link NOPClosure#nopClosure()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Closure NOPClosure.nopClosure()"})
  public void testNopClosure() {
    // Arrange and Act
    Closure<Object> actualNopClosureResult = NOPClosure.nopClosure();
    actualNopClosureResult.execute("42");

    // Assert
    assertTrue(actualNopClosureResult instanceof NOPClosure);
  }
}
