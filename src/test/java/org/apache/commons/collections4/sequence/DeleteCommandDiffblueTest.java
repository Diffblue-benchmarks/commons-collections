package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DeleteCommandDiffblueTest {
  /**
   * Method under test: {@link DeleteCommand#DeleteCommand(Object)}
   */
  @Test
  public void testNewDeleteCommand() {
    // Arrange and Act
    DeleteCommand<Object> actualDeleteCommand = new DeleteCommand<>("Object");

    // Assert
    assertEquals("Object", actualDeleteCommand.getObject());
  }
}
