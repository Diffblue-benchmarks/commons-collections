package org.apache.commons.collections4.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InsertCommandDiffblueTest {
  /**
   * Test {@link InsertCommand#InsertCommand(Object)}.
   * <p>
   * Method under test: {@link InsertCommand#InsertCommand(Object)}
   */
  @Test
  @DisplayName("Test new InsertCommand(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void InsertCommand.<init>(Object)"})
  void testNewInsertCommand() {
    // Arrange and Act
    InsertCommand<Object> actualInsertCommand = new InsertCommand<>("Object");

    // Assert
    assertEquals("Object", actualInsertCommand.getObject());
  }
}
