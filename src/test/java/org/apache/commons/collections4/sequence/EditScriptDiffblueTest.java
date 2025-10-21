package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class EditScriptDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link EditScript}
   *   <li>{@link EditScript#getLCSLength()}
   *   <li>{@link EditScript#getModifications()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EditScript.<init>()", "int EditScript.getLCSLength()", "int EditScript.getModifications()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    EditScript<Object> actualEditScript = new EditScript<>();
    int actualLCSLength = actualEditScript.getLCSLength();

    // Assert
    assertEquals(0, actualLCSLength);
    assertEquals(0, actualEditScript.getModifications());
  }

  /**
   * Test {@link EditScript#append(DeleteCommand)} with {@code DeleteCommand}.
   * <p>
   * Method under test: {@link EditScript#append(DeleteCommand)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EditScript.append(DeleteCommand)"})
  public void testAppendWithDeleteCommand() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new DeleteCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getModifications());
  }

  /**
   * Test {@link EditScript#append(InsertCommand)} with {@code InsertCommand}.
   * <p>
   * Method under test: {@link EditScript#append(InsertCommand)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EditScript.append(InsertCommand)"})
  public void testAppendWithInsertCommand() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new InsertCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getModifications());
  }

  /**
   * Test {@link EditScript#append(KeepCommand)} with {@code KeepCommand}.
   * <p>
   * Method under test: {@link EditScript#append(KeepCommand)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EditScript.append(KeepCommand)"})
  public void testAppendWithKeepCommand() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new KeepCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getLCSLength());
  }

  /**
   * Test {@link EditScript#visit(CommandVisitor)}.
   * <ul>
   *   <li>Given {@link DeleteCommand} {@link DeleteCommand#accept(CommandVisitor)} does nothing.</li>
   *   <li>Then calls {@link DeleteCommand#accept(CommandVisitor)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditScript#visit(CommandVisitor)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EditScript.visit(CommandVisitor)"})
  public void testVisit_givenDeleteCommandAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    DeleteCommand<Object> command = mock(DeleteCommand.class);
    doNothing().when(command).accept(Mockito.<CommandVisitor<Object>>any());

    EditScript<Object> editScript = new EditScript<>();
    editScript.append(command);

    // Act
    editScript.visit(new ReplacementsFinder<>(mock(ReplacementsHandler.class)));

    // Assert
    verify(command).accept(isA(CommandVisitor.class));
  }
}
