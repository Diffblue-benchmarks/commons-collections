package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KeepCommandDiffblueTest {
  /**
   * Method under test: {@link KeepCommand#KeepCommand(Object)}
   */
  @Test
  public void testNewKeepCommand() {
    // Arrange and Act
    KeepCommand<Object> actualKeepCommand = new KeepCommand<>("Object");

    // Assert
    assertEquals("Object", actualKeepCommand.getObject());
  }
}
