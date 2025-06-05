package org.apache.commons.collections4.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EditCommandDiffblueTest {
  /**
   * Test {@link EditCommand#getObject()}.
   * <p>
   * Method under test: {@link EditCommand#getObject()}
   */
  @Test
  @DisplayName("Test getObject()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object EditCommand.getObject()"})
  void testGetObject() {
    // Arrange
    DeleteCommand<Object> deleteCommand = new DeleteCommand<>("Object");

    // Act and Assert
    assertEquals("Object", deleteCommand.getObject());
  }
}
