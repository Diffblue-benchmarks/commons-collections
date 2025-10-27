package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EditScriptDiffblueTest {
  /**
   * Method under test: {@link EditScript#append(DeleteCommand)}
   */
  @Test
  public void testAppend() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new DeleteCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getModifications());
  }

  /**
   * Method under test: {@link EditScript#append(InsertCommand)}
   */
  @Test
  public void testAppend2() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new InsertCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getModifications());
  }

  /**
   * Method under test: {@link EditScript#append(KeepCommand)}
   */
  @Test
  public void testAppend3() {
    // Arrange
    EditScript<Object> editScript = new EditScript<>();

    // Act
    editScript.append(new KeepCommand<>("Object"));

    // Assert
    assertEquals(1, editScript.getLCSLength());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link EditScript}
   *   <li>{@link EditScript#getLCSLength()}
   *   <li>{@link EditScript#getModifications()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    EditScript<Object> actualEditScript = new EditScript<>();
    int actualLCSLength = actualEditScript.getLCSLength();

    // Assert
    assertEquals(0, actualLCSLength);
    assertEquals(0, actualEditScript.getModifications());
  }
}
