package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InsertCommandDiffblueTest {
  /**
   * Test {@link InsertCommand#InsertCommand(Object)}.
   * <p>
   * Method under test: {@link InsertCommand#InsertCommand(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void InsertCommand.<init>(Object)"})
  public void testNewInsertCommand() {
    // Arrange and Act
    InsertCommand<Object> actualInsertCommand = new InsertCommand<>("Object");

    // Assert
    assertEquals("Object", actualInsertCommand.getObject());
  }
}
