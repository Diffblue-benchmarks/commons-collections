package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Closure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NOPClosureDiffblueTest {
  /**
   * Test {@link NOPClosure#nopClosure()}.
   *
   * <p>Method under test: {@link NOPClosure#nopClosure()}
   */
  @Test
  @DisplayName("Test nopClosure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure NOPClosure.nopClosure()"})
  void testNopClosure() {
    // Arrange and Act
    Closure<Object> actualNopClosureResult = NOPClosure.nopClosure();
    actualNopClosureResult.execute("42");

    // Assert
    assertTrue(actualNopClosureResult instanceof NOPClosure);
  }
}
