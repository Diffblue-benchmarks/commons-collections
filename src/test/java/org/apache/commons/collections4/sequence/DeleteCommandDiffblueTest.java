package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DeleteCommandDiffblueTest {
  /**
   * Test {@link DeleteCommand#DeleteCommand(Object)}.
   * <p>
   * Method under test: {@link DeleteCommand#DeleteCommand(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DeleteCommand.<init>(Object)"})
  public void testNewDeleteCommand() {
    // Arrange and Act
    DeleteCommand<Object> actualDeleteCommand = new DeleteCommand<>("Object");

    // Assert
    assertEquals("Object", actualDeleteCommand.getObject());
  }
}
