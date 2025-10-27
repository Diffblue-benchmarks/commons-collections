package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class FunctorExceptionDiffblueTest {
  /**
   * Method under test: {@link FunctorException#FunctorException()}
   */
  @Test
  public void testNewFunctorException() {
    // Arrange and Act
    FunctorException actualFunctorException = new FunctorException();

    // Assert
    assertNull(actualFunctorException.getMessage());
    assertNull(actualFunctorException.getCause());
    assertEquals(0, actualFunctorException.getSuppressed().length);
  }

  /**
   * Method under test: {@link FunctorException#FunctorException(String)}
   */
  @Test
  public void testNewFunctorException2() {
    // Arrange and Act
    FunctorException actualFunctorException = new FunctorException("Msg");

    // Assert
    assertEquals("Msg", actualFunctorException.getMessage());
    assertNull(actualFunctorException.getCause());
    assertEquals(0, actualFunctorException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link FunctorException#FunctorException(String, Throwable)}
   */
  @Test
  public void testNewFunctorException3() {
    // Arrange
    Throwable rootCause = new Throwable();

    // Act
    FunctorException actualFunctorException = new FunctorException("Msg", rootCause);

    // Assert
    assertEquals("Msg", actualFunctorException.getMessage());
    assertEquals(0, actualFunctorException.getSuppressed().length);
    assertSame(rootCause, actualFunctorException.getCause());
  }

  /**
   * Method under test: {@link FunctorException#FunctorException(Throwable)}
   */
  @Test
  public void testNewFunctorException4() {
    // Arrange
    Throwable rootCause = new Throwable();

    // Act
    FunctorException actualFunctorException = new FunctorException(rootCause);

    // Assert
    assertEquals("java.lang.Throwable", actualFunctorException.getMessage());
    assertEquals(0, actualFunctorException.getSuppressed().length);
    assertSame(rootCause, actualFunctorException.getCause());
  }
}
