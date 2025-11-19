package org.apache.commons.collections4.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DeleteCommandDiffblueTest {
  /**
   * Test {@link DeleteCommand#DeleteCommand(Object)}.
   *
   * <p>Method under test: {@link DeleteCommand#DeleteCommand(Object)}
   */
  @Test
  @DisplayName("Test new DeleteCommand(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DeleteCommand.<init>(Object)"})
  void testNewDeleteCommand() {
    // Arrange and Act
    DeleteCommand<Object> actualDeleteCommand = new DeleteCommand<>("Object");

    // Assert
    assertEquals("Object", actualDeleteCommand.getObject());
  }
}
