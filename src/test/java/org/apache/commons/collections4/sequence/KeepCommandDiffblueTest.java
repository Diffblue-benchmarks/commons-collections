package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class KeepCommandDiffblueTest {
  /**
   * Test {@link KeepCommand#KeepCommand(Object)}.
   * <p>
   * Method under test: {@link KeepCommand#KeepCommand(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeepCommand.<init>(Object)"})
  public void testNewKeepCommand() {
    // Arrange and Act
    KeepCommand<Object> actualKeepCommand = new KeepCommand<>("Object");

    // Assert
    assertEquals("Object", actualKeepCommand.getObject());
  }
}
