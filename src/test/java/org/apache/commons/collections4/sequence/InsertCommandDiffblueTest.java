package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InsertCommandDiffblueTest {
  /**
   * Method under test: {@link InsertCommand#InsertCommand(Object)}
   */
  @Test
  public void testNewInsertCommand() {
    // Arrange and Act
    InsertCommand<Object> actualInsertCommand = new InsertCommand<>("Object");

    // Assert
    assertEquals("Object", actualInsertCommand.getObject());
  }
}
