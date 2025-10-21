package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FunctorExceptionDiffblueTest {
  /**
   * Test {@link FunctorException#FunctorException()}.
   * <ul>
   *   <li>Then return Message is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorException#FunctorException()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FunctorException.<init>()", "void FunctorException.<init>(String)",
      "void FunctorException.<init>(String, Throwable)", "void FunctorException.<init>(Throwable)"})
  public void testNewFunctorException_thenReturnMessageIsNull() {
    // Arrange and Act
    FunctorException actualFunctorException = new FunctorException();

    // Assert
    assertNull(actualFunctorException.getMessage());
    assertNull(actualFunctorException.getCause());
    assertEquals(0, actualFunctorException.getSuppressed().length);
  }

  /**
   * Test {@link FunctorException#FunctorException(String)}.
   * <ul>
   *   <li>When {@code Msg}.</li>
   *   <li>Then return Message is {@code Msg}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorException#FunctorException(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FunctorException.<init>()", "void FunctorException.<init>(String)",
      "void FunctorException.<init>(String, Throwable)", "void FunctorException.<init>(Throwable)"})
  public void testNewFunctorException_whenMsg_thenReturnMessageIsMsg() {
    // Arrange and Act
    FunctorException actualFunctorException = new FunctorException("Msg");

    // Assert
    assertEquals("Msg", actualFunctorException.getMessage());
    assertNull(actualFunctorException.getCause());
    assertEquals(0, actualFunctorException.getSuppressed().length);
  }

  /**
   * Test {@link FunctorException#FunctorException(String, Throwable)}.
   * <ul>
   *   <li>When {@code Msg}.</li>
   *   <li>Then return Message is {@code Msg}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorException#FunctorException(String, Throwable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FunctorException.<init>()", "void FunctorException.<init>(String)",
      "void FunctorException.<init>(String, Throwable)", "void FunctorException.<init>(Throwable)"})
  public void testNewFunctorException_whenMsg_thenReturnMessageIsMsg2() {
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
   * Test {@link FunctorException#FunctorException(Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FunctorException#FunctorException(Throwable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FunctorException.<init>()", "void FunctorException.<init>(String)",
      "void FunctorException.<init>(String, Throwable)", "void FunctorException.<init>(Throwable)"})
  public void testNewFunctorException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
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
