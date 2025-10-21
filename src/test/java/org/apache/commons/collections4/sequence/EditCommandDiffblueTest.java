package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EditCommandDiffblueTest {
  /**
   * Test {@link EditCommand#getObject()}.
   * <p>
   * Method under test: {@link EditCommand#getObject()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EditCommand.getObject()"})
  public void testGetObject() {
    // Arrange
    DeleteCommand<Object> deleteCommand = new DeleteCommand<>("Object");

    // Act and Assert
    assertEquals("Object", deleteCommand.getObject());
  }
}
