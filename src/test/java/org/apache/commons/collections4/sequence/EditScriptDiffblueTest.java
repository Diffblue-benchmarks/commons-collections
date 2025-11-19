package org.apache.commons.collections4.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EditScriptDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link EditScript}
   *   <li>{@link EditScript#getLCSLength()}
   *   <li>{@link EditScript#getModifications()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EditScript.<init>()",
    "int EditScript.getLCSLength()",
    "int EditScript.getModifications()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    EditScript<Object> actualEditScript = new EditScript<>();
    int actualLCSLength = actualEditScript.getLCSLength();

    // Assert
    assertEquals(0, actualLCSLength);
    assertEquals(0, actualEditScript.getModifications());
  }

  /**
   * Test {@link EditScript#append(DeleteCommand)} with {@code DeleteCommand}.
   *
   * <p>Method under test: {@link EditScript#append(DeleteCommand)}
   */
  @Test
  @DisplayName("Test append(DeleteCommand) with 'DeleteCommand'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EditScript.append(DeleteCommand)"})
  void testAppendWithDeleteCommand() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new DeleteCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getModifications());
  }

  /**
   * Test {@link EditScript#append(InsertCommand)} with {@code InsertCommand}.
   *
   * <p>Method under test: {@link EditScript#append(InsertCommand)}
   */
  @Test
  @DisplayName("Test append(InsertCommand) with 'InsertCommand'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EditScript.append(InsertCommand)"})
  void testAppendWithInsertCommand() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new InsertCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getModifications());
  }

  /**
   * Test {@link EditScript#append(KeepCommand)} with {@code KeepCommand}.
   *
   * <p>Method under test: {@link EditScript#append(KeepCommand)}
   */
  @Test
  @DisplayName("Test append(KeepCommand) with 'KeepCommand'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EditScript.append(KeepCommand)"})
  void testAppendWithKeepCommand() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new KeepCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getLCSLength());
  }

  /**
   * Test {@link EditScript#visit(CommandVisitor)}.
   *
   * <ul>
   *   <li>Given {@link DeleteCommand} {@link DeleteCommand#accept(CommandVisitor)} does nothing.
   *   <li>Then calls {@link DeleteCommand#accept(CommandVisitor)}.
   * </ul>
   *
   * <p>Method under test: {@link EditScript#visit(CommandVisitor)}
   */
  @Test
  @DisplayName(
      "Test visit(CommandVisitor); given DeleteCommand accept(CommandVisitor) does nothing; then calls accept(CommandVisitor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void EditScript.visit(CommandVisitor)"})
  void testVisit_givenDeleteCommandAcceptDoesNothing_thenCallsAccept() {
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
