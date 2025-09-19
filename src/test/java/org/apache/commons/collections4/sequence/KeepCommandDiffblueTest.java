package org.apache.commons.collections4.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class KeepCommandDiffblueTest {
  /**
   * Test {@link KeepCommand#KeepCommand(Object)}.
   *
   * <p>Method under test: {@link KeepCommand#KeepCommand(Object)}
   */
  @Test
  @DisplayName("Test new KeepCommand(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeepCommand.<init>(Object)"})
  void testNewKeepCommand() {
    // Arrange and Act
    KeepCommand<Object> actualKeepCommand = new KeepCommand<>("Object");

    // Assert
    assertEquals("Object", actualKeepCommand.getObject());
  }
}
