package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EditCommandDiffblueTest {
  /**
   * Method under test: {@link EditCommand#getObject()}
   */
  @Test
  public void testGetObject() {
    // Arrange
    DeleteCommand<Object> deleteCommand = new DeleteCommand<>("Object");

    // Act and Assert
    assertEquals("Object", deleteCommand.getObject());
  }
}
