package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FunctorExceptionDiffblueTest {
  /**
   * Test {@link FunctorException#FunctorException()}.
   *
   * <ul>
   *   <li>Then return Message is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FunctorException#FunctorException()}
   */
  @Test
  @DisplayName("Test new FunctorException(); then return Message is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FunctorException.<init>()",
    "void FunctorException.<init>(String)",
    "void FunctorException.<init>(String, Throwable)",
    "void FunctorException.<init>(Throwable)"
  })
  void testNewFunctorException_thenReturnMessageIsNull() {
    // Arrange and Act
    FunctorException actualFunctorException = new FunctorException();

    // Assert
    assertNull(actualFunctorException.getMessage());
    assertNull(actualFunctorException.getCause());
    assertEquals(0, actualFunctorException.getSuppressed().length);
  }

  /**
   * Test {@link FunctorException#FunctorException(String)}.
   *
   * <ul>
   *   <li>When {@code Msg}.
   *   <li>Then return Message is {@code Msg}.
   * </ul>
   *
   * <p>Method under test: {@link FunctorException#FunctorException(String)}
   */
  @Test
  @DisplayName("Test new FunctorException(String); when 'Msg'; then return Message is 'Msg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FunctorException.<init>()",
    "void FunctorException.<init>(String)",
    "void FunctorException.<init>(String, Throwable)",
    "void FunctorException.<init>(Throwable)"
  })
  void testNewFunctorException_whenMsg_thenReturnMessageIsMsg() {
    // Arrange and Act
    FunctorException actualFunctorException = new FunctorException("Msg");

    // Assert
    assertEquals("Msg", actualFunctorException.getMessage());
    assertNull(actualFunctorException.getCause());
    assertEquals(0, actualFunctorException.getSuppressed().length);
  }

  /**
   * Test {@link FunctorException#FunctorException(String, Throwable)}.
   *
   * <ul>
   *   <li>When {@code Msg}.
   *   <li>Then return Message is {@code Msg}.
   * </ul>
   *
   * <p>Method under test: {@link FunctorException#FunctorException(String, Throwable)}
   */
  @Test
  @DisplayName(
      "Test new FunctorException(String, Throwable); when 'Msg'; then return Message is 'Msg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FunctorException.<init>()",
    "void FunctorException.<init>(String)",
    "void FunctorException.<init>(String, Throwable)",
    "void FunctorException.<init>(Throwable)"
  })
  void testNewFunctorException_whenMsg_thenReturnMessageIsMsg2() {
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
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link FunctorException#FunctorException(Throwable)}
   */
  @Test
  @DisplayName(
      "Test new FunctorException(Throwable); when Throwable(); then return Message is 'java.lang.Throwable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FunctorException.<init>()",
    "void FunctorException.<init>(String)",
    "void FunctorException.<init>(String, Throwable)",
    "void FunctorException.<init>(Throwable)"
  })
  void testNewFunctorException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
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
