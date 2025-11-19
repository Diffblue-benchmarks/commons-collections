package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.hash.HashingOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MapUtilsDiffblueTest {
  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@link HashMap#HashMap()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given HashMap(); when HashMap() 'Key' is HashMap(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenHashMap_whenHashMapKeyIsHashMap_thenDoesNotThrow() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", new HashMap<>());

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", map));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@link HashMap#HashMap()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given HashMap(); when HashMap() 'Key' is HashMap(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenHashMap_whenHashMapKeyIsHashMap_thenDoesNotThrow2() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", new HashMap<>());

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", map));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), "Label", null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(5));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException2()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), null, null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(4));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException3()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, null, new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(1));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException4()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), "Label", null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(5));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException5()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), null, null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(4));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenIllegalArgumentException_thenThrowIllegalArgumentException6()
      throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, null, new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(1));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given 'null'; when HashMap() 'Key' is 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenNull_whenHashMapKeyIsNull_thenDoesNotThrow() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", null);

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", map));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code null}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given 'null'; when HashMap() 'Key' is 'null'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenNull_whenHashMapKeyIsNull_thenDoesNotThrow2() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", null);

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", map));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given 'Value'; when HashMap() 'Key' is 'Value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenValue_whenHashMapKeyIsValue_thenDoesNotThrow() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", map));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); given 'Value'; when HashMap() 'Key' is 'Value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_givenValue_whenHashMapKeyIsValue_thenDoesNotThrow2() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", map));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), "", null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException2() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, "", new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException3() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.debugPrint(new PrintStream(hashingOutputStream), "", null));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenEmptyString_thenThrowIllegalArgumentException4() throws IOException {
    // Arrange
    HashingOutputStream hashingOutputStream = mock(HashingOutputStream.class);
    doThrow(new IllegalArgumentException())
        .when(hashingOutputStream)
        .write(Mockito.<byte[]>any(), anyInt(), anyInt());
    PrintStream out = new PrintStream(hashingOutputStream);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.debugPrint(out, "", new HashMap<>()));
    verify(hashingOutputStream).write(isA(byte[].class), eq(0), eq(3));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName("Test debugPrint(PrintStream, Object, Map); when HashMap(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenHashMap_thenDoesNotThrow() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", new HashMap<>()));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName("Test debugPrint(PrintStream, Object, Map); when HashMap(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenHashMap_thenDoesNotThrow2() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, null, new HashMap<>()));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName("Test debugPrint(PrintStream, Object, Map); when HashMap(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenHashMap_thenDoesNotThrow3() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, "Label", new HashMap<>()));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName("Test debugPrint(PrintStream, Object, Map); when HashMap(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenHashMap_thenDoesNotThrow4() {
    // Arrange
    PrintStream out = new PrintStream(new ByteArrayOutputStream());

    // Act and Assert
    assertDoesNotThrow(() -> MapUtils.debugPrint(out, null, new HashMap<>()));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link PrintStream#PrintStream(OutputStream)} with {@link
   *       ByteArrayOutputStream#ByteArrayOutputStream()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when PrintStream(OutputStream) with ByteArrayOutputStream(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenPrintStreamWithByteArrayOutputStream_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> MapUtils.debugPrint(new PrintStream(new ByteArrayOutputStream()), "Label", null));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link PrintStream#PrintStream(OutputStream)} with {@link
   *       ByteArrayOutputStream#ByteArrayOutputStream()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when PrintStream(OutputStream) with ByteArrayOutputStream(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenPrintStreamWithByteArrayOutputStream_thenDoesNotThrow2() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> MapUtils.debugPrint(new PrintStream(new ByteArrayOutputStream()), null, null));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link PrintStream#PrintStream(OutputStream)} with {@link
   *       ByteArrayOutputStream#ByteArrayOutputStream()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when PrintStream(OutputStream) with ByteArrayOutputStream(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenPrintStreamWithByteArrayOutputStream_thenDoesNotThrow3() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> MapUtils.debugPrint(new PrintStream(new ByteArrayOutputStream()), "Label", null));
  }

  /**
   * Test {@link MapUtils#debugPrint(PrintStream, Object, Map)}.
   *
   * <ul>
   *   <li>When {@link PrintStream#PrintStream(OutputStream)} with {@link
   *       ByteArrayOutputStream#ByteArrayOutputStream()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#debugPrint(PrintStream, Object, Map)}
   */
  @Test
  @DisplayName(
      "Test debugPrint(PrintStream, Object, Map); when PrintStream(OutputStream) with ByteArrayOutputStream(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapUtils.debugPrint(PrintStream, Object, Map)"})
  void testDebugPrint_whenPrintStreamWithByteArrayOutputStream_thenDoesNotThrow4() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> MapUtils.debugPrint(new PrintStream(new ByteArrayOutputStream()), null, null));
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenHashMap() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenHashMap2() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(new HashMap<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenNull() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#emptyIfNull(Map)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#emptyIfNull(Map)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Map); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.emptyIfNull(Map)"})
  void testEmptyIfNull_whenNull2() {
    // Arrange and Act
    Map<Object, Object> actualEmptyIfNullResult = MapUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link MapUtils#fixedSizeMap(Map)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IterableMap MapUtils.fixedSizeMap(Map)"})
  void testFixedSizeMap() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(map);

    // Assert
    assertEquals(map, actualFixedSizeMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeMap(Map)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeMap(Map)}
   */
  @Test
  @DisplayName("Test fixedSizeMap(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IterableMap MapUtils.fixedSizeMap(Map)"})
  void testFixedSizeMap2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    // Act
    IterableMap<Object, Object> actualFixedSizeMapResult = MapUtils.fixedSizeMap(map);

    // Assert
    assertEquals(map, actualFixedSizeMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeSortedMap(SortedMap)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap MapUtils.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(map);

    // Assert
    assertEquals(map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link MapUtils#fixedSizeSortedMap(SortedMap)}.
   *
   * <p>Method under test: {@link MapUtils#fixedSizeSortedMap(SortedMap)}
   */
  @Test
  @DisplayName("Test fixedSizeSortedMap(SortedMap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedMap MapUtils.fixedSizeSortedMap(SortedMap)"})
  void testFixedSizeSortedMap2() {
    // Arrange
    TreeMap<Object, Object> map = new TreeMap<>();

    // Act
    SortedMap<Object, Object> actualFixedSizeSortedMapResult = MapUtils.fixedSizeSortedMap(map);

    // Assert
    assertEquals(map, actualFixedSizeSortedMapResult);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenKey_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", mock(Function.class));

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenKey_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", mock(Function.class));

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_givenTrue_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getBoolean(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange and Act
    Boolean actualBoolean =
        MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenNull_thenReturnNull3() {
    // Arrange and Act
    Boolean actualBoolean =
        MapUtils.getBoolean(new HashMap<>(), "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Function)"})
  void testGetBooleanWithMapKeyDefaultFunction_whenNull_thenReturnNull4() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", (Function<Object, Boolean>) null);

    // Assert
    assertNull(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() 'Key' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenOne_whenHashMapKeyIsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() 'Key' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenOne_whenHashMapKeyIsOne_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() 'Key' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenTrue_whenHashMapKeyIsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() 'Key' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenTrue_whenHashMapKeyIsTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() 'Key' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenZero_whenHashMapKeyIsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() 'Key' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_givenZero_whenHashMapKeyIsZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act
    Boolean actualBoolean = MapUtils.getBoolean(map, "Key", true);

    // Assert
    assertFalse(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenHashMap_thenReturnTrue() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenHashMap_thenReturnTrue2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenNull_thenReturnTrue() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object, Boolean)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object, Boolean)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object, Boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object, Boolean)"})
  void testGetBooleanWithMapKeyDefaultValue_whenNull_thenReturnTrue2() {
    // Arrange and Act
    Boolean actualBoolean = MapUtils.getBoolean(null, "Key", true);

    // Assert
    assertTrue(actualBoolean);
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given 'true'; when HashMap() 'Key' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenTrue_whenHashMapKeyIsTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given 'true'; when HashMap() 'Key' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenTrue_whenHashMapKeyIsTrue_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act and Assert
    assertTrue(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given zero; when HashMap() 'Key' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenZero_whenHashMapKeyIsZero_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBoolean(Map, Object) with 'map', 'key'; given zero; when HashMap() 'Key' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_givenZero_whenHashMapKeyIsZero_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act and Assert
    assertFalse(MapUtils.getBoolean(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBoolean(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBoolean(Map, Object)}
   */
  @Test
  @DisplayName("Test getBoolean(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Boolean MapUtils.getBoolean(Map, Object)"})
  void testGetBooleanWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getBoolean(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", mock(Function.class));

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", mock(Function.class));

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_givenTrue_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Boolean> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MapUtils.getBooleanValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenNull_thenReturnFalse() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenNull_thenReturnFalse2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenNull_thenReturnFalse3() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, Function)"})
  void testGetBooleanValueWithMapKeyDefaultFunction_whenNull_thenReturnFalse4() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", null);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() 'Key' is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenOne_whenHashMapKeyIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given one; when HashMap() 'Key' is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenOne_whenHashMapKeyIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() 'Key' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenTrue_whenHashMapKeyIsTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'true'; when HashMap() 'Key' is 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenTrue_whenHashMapKeyIsTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() 'Key' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenZero_whenHashMapKeyIsZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; given zero; when HashMap() 'Key' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_givenZero_whenHashMapKeyIsZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(map, "Key", true);

    // Assert
    assertFalse(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap_thenReturnTrue() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenHashMap_thenReturnTrue2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(new HashMap<>(), "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenNull_thenReturnTrue() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object, boolean)} with {@code map}, {@code key},
   * {@code defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object, boolean) with 'map', 'key', 'defaultValue'; when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object, boolean)"})
  void testGetBooleanValueWithMapKeyDefaultValue_whenNull_thenReturnTrue2() {
    // Arrange and Act
    boolean actualBooleanValue = MapUtils.getBooleanValue(null, "Key", true);

    // Assert
    assertTrue(actualBooleanValue);
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given 'true'; when HashMap() 'Key' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenTrue_whenHashMapKeyIsTrue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given 'true'; when HashMap() 'Key' is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenTrue_whenHashMapKeyIsTrue_thenReturnTrue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", true);

    // Act and Assert
    assertTrue(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given zero; when HashMap() 'Key' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenZero_whenHashMapKeyIsZero_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; given zero; when HashMap() 'Key' is zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_givenZero_whenHashMapKeyIsZero_thenReturnFalse2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 0);

    // Act and Assert
    assertFalse(MapUtils.getBooleanValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenHashMap_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenHashMap_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getBooleanValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getBooleanValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getBooleanValue(Map, Object) with 'map', 'key'; when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapUtils.getBooleanValue(Map, Object)"})
  void testGetBooleanValueWithMapKey_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(MapUtils.getBooleanValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenA_thenReturnByteValueIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenA_thenReturnByteValueIsA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByte(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenNull_thenReturnNull3() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Function)"})
  void testGetByteWithMapKeyDefaultFunction_whenNull_thenReturnNull4() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (Function<Object, Byte>) null);

    // Assert
    assertNull(actualByte);
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_given42_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_given42_thenReturnByteValueIsAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() 'Key' is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenA_whenHashMapKeyIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() 'Key' is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenA_whenHashMapKeyIsA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return byteValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given one; then return byteValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenOne_thenReturnByteValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals((byte) 1, actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return byteValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given one; then return byteValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenOne_thenReturnByteValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals((byte) 1, actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenHashMap_thenReturnByteValueIsA() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenHashMap_thenReturnByteValueIsA2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when 'null'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenNull_thenReturnByteValueIsA() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object, Byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object, Byte)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object, Byte) with 'map', 'key', 'defaultValue'; when 'null'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object, Byte)"})
  void testGetByteWithMapKeyDefaultValue_whenNull_thenReturnByteValueIsA2() {
    // Arrange and Act
    Byte actualByte = MapUtils.getByte(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_given42_whenHashMapKeyIs42_thenReturnByteValueIsAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key");

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return byteValue is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return byteValue is '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_given42_whenHashMapKeyIs42_thenReturnByteValueIsAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key");

    // Assert
    assertEquals('*', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenA_whenHashMapKeyIsA_thenReturnByteValueIsA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key");

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return byteValue is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return byteValue is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenA_whenHashMapKeyIsA_thenReturnByteValueIsA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key");

    // Assert
    assertEquals('A', actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return byteValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return byteValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnByteValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key");

    // Assert
    assertEquals((byte) 1, actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return byteValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return byteValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnByteValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Byte actualByte = MapUtils.getByte(map, "Key");

    // Assert
    assertEquals((byte) 1, actualByte.byteValue());
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByte(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getByte(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByte(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByte(Map, Object)}
   */
  @Test
  @DisplayName("Test getByte(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Byte MapUtils.getByte(Map, Object)"})
  void testGetByteWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getByte(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenA_thenReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn((byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByteValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Byte> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getByteValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenNull_thenReturnZero3() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, Function)"})
  void testGetByteValueWithMapKeyDefaultFunction_whenNull_thenReturnZero4() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", null);

    // Assert
    assertEquals((byte) 0, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_given42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals('*', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_given42_thenReturnAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals('*', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() 'Key' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenA_whenHashMapKeyIsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'A'; when HashMap() 'Key' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenA_whenHashMapKeyIsA_thenReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals((byte) 1, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals((byte) 1, actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    byte actualByteValue = MapUtils.getByteValue(map, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap_thenReturnA() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when HashMap(); then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenHashMap_thenReturnA2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(new HashMap<>(), "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when 'null'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenNull_thenReturnA() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object, byte)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object, byte)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object, byte) with 'map', 'key', 'defaultValue'; when 'null'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object, byte)"})
  void testGetByteValueWithMapKeyDefaultValue_whenNull_thenReturnA2() {
    // Arrange and Act
    byte actualByteValue = MapUtils.getByteValue(null, "Key", (byte) 'A');

    // Assert
    assertEquals('A', actualByteValue);
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnAsterisk() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return '*'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnAsterisk2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals('*', MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnA() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnA2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals('A', MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertEquals((byte) 1, MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertEquals((byte) 1, MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getByteValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getByteValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getByteValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getByteValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte MapUtils.getByteValue(Map, Object)"})
  void testGetByteValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals((byte) 0, MapUtils.getByteValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTen_thenReturnDoubleValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_givenTen_thenReturnDoubleValueIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDouble(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange and Act
    Double actualDouble =
        MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenNull_thenReturnNull3() {
    // Arrange and Act
    Double actualDouble =
        MapUtils.getDouble(new HashMap<>(), "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Function)"})
  void testGetDoubleWithMapKeyDefaultFunction_whenNull_thenReturnNull4() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", (Function<Object, Double>) null);

    // Assert
    assertNull(actualDouble);
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_given42_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_given42_thenReturnDoubleValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenA_thenReturnDoubleValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when HashMap(); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenHashMap_thenReturnDoubleValueIsTen() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when HashMap(); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenHashMap_thenReturnDoubleValueIsTen2() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when 'null'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenNull_thenReturnDoubleValueIsTen() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object, Double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object, Double)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object, Double) with 'map', 'key', 'defaultValue'; when 'null'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object, Double)"})
  void testGetDoubleWithMapKeyDefaultValue_whenNull_thenReturnDoubleValueIsTen2() {
    // Arrange and Act
    Double actualDouble = MapUtils.getDouble(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_given42_thenReturnDoubleValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key");

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return doubleValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given '42'; then return doubleValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_given42_thenReturnDoubleValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key");

    // Assert
    assertEquals(42.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenA_thenReturnDoubleValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key");

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return doubleValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'A'; then return doubleValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenA_thenReturnDoubleValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key");

    // Assert
    assertEquals(65.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnDoubleValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key");

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnDoubleValueIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act
    Double actualDouble = MapUtils.getDouble(map, "Key");

    // Assert
    assertEquals(10.0d, actualDouble.doubleValue());
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDouble(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getDouble(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDouble(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDouble(Map, Object)}
   */
  @Test
  @DisplayName("Test getDouble(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double MapUtils.getDouble(Map, Object)"})
  void testGetDoubleWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getDouble(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_givenTen_thenReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDoubleValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Double> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getDoubleValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenNull_thenReturnZero3() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, Function)"})
  void testGetDoubleValueWithMapKeyDefaultFunction_whenNull_thenReturnZero4() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", null);

    // Assert
    assertEquals(0.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_given42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(42.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_given42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(42.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(65.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(65.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    double actualDoubleValue = MapUtils.getDoubleValue(map, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(new HashMap<>(), "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenNull_thenReturnTen() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object, double)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object, double)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object, double) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object, double)"})
  void testGetDoubleValueWithMapKeyDefaultValue_whenNull_thenReturnTen2() {
    // Arrange and Act
    double actualDoubleValue = MapUtils.getDoubleValue(null, "Key", 10.0d);

    // Assert
    assertEquals(10.0d, actualDoubleValue);
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0d);

    // Act and Assert
    assertEquals(10.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getDoubleValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getDoubleValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getDoubleValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getDoubleValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MapUtils.getDoubleValue(Map, Object)"})
  void testGetDoubleValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MapUtils.getDoubleValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTen_thenReturnFloatValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_givenTen_thenReturnFloatValueIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloat(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenNull_thenReturnNull3() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Function)"})
  void testGetFloatWithMapKeyDefaultFunction_whenNull_thenReturnNull4() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", (Function<Object, Float>) null);

    // Assert
    assertNull(actualFloat);
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_given42_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_given42_thenReturnFloatValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenA_thenReturnFloatValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when HashMap(); then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenHashMap_thenReturnFloatValueIsTen() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when HashMap(); then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenHashMap_thenReturnFloatValueIsTen2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when 'null'; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenNull_thenReturnFloatValueIsTen() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object, Float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object, Float)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object, Float) with 'map', 'key', 'defaultValue'; when 'null'; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object, Float)"})
  void testGetFloatWithMapKeyDefaultValue_whenNull_thenReturnFloatValueIsTen2() {
    // Arrange and Act
    Float actualFloat = MapUtils.getFloat(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_given42_whenHashMapKeyIs42_thenReturnFloatValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key");

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return floatValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return floatValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_given42_whenHashMapKeyIs42_thenReturnFloatValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key");

    // Assert
    assertEquals(42.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenA_whenHashMapKeyIsA_thenReturnFloatValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key");

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return floatValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return floatValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenA_whenHashMapKeyIsA_thenReturnFloatValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key");

    // Assert
    assertEquals(65.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnFloatValueIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key");

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return floatValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return floatValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnFloatValueIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act
    Float actualFloat = MapUtils.getFloat(map, "Key");

    // Assert
    assertEquals(10.0f, actualFloat.floatValue());
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloat(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getFloat(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloat(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloat(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloat(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Float MapUtils.getFloat(Map, Object)"})
  void testGetFloatWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getFloat(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_givenTen_thenReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Float> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getFloatValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenNull_thenReturnZero3() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, Function)} with {@code map}, {@code key},
   * {@code defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, Function)"})
  void testGetFloatValueWithMapKeyDefaultFunction_whenNull_thenReturnZero4() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", null);

    // Assert
    assertEquals(0.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_given42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_given42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(42.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(65.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given ten; when HashMap() 'Key' is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenTen_whenHashMapKeyIsTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    float actualFloatValue = MapUtils.getFloatValue(map, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when HashMap(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenHashMap_thenReturnTen2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(new HashMap<>(), "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenNull_thenReturnTen() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object, float)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object, float)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object, float) with 'map', 'key', 'defaultValue'; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object, float)"})
  void testGetFloatValueWithMapKeyDefaultValue_whenNull_thenReturnTen2() {
    // Arrange and Act
    float actualFloatValue = MapUtils.getFloatValue(null, "Key", 10.0f);

    // Assert
    assertEquals(10.0f, actualFloatValue);
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnTen() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given ten; when HashMap() 'Key' is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenTen_whenHashMapKeyIsTen_thenReturnTen2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 10.0f);

    // Act and Assert
    assertEquals(10.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getFloatValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getFloatValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getFloatValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getFloatValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float MapUtils.getFloatValue(Map, Object)"})
  void testGetFloatValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0f, MapUtils.getFloatValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_givenOne_thenReturnIntValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getInteger(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange and Act
    Integer actualInteger =
        MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenNull_thenReturnNull3() {
    // Arrange and Act
    Integer actualInteger =
        MapUtils.getInteger(new HashMap<>(), "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Function)"})
  void testGetIntegerWithMapKeyDefaultFunction_whenNull_thenReturnNull4() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", (Function<Object, Integer>) null);

    // Assert
    assertNull(actualInteger);
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_given42_whenHashMapKeyIs42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_given42_whenHashMapKeyIs422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenA_thenReturnIntValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenOne_thenReturnIntValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap(); then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap_thenReturnIntValueIsFortyTwo() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when HashMap(); then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenHashMap_thenReturnIntValueIsFortyTwo2() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when 'null'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenNull_thenReturnIntValueIsFortyTwo() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object, Integer)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object, Integer)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object, Integer) with 'map', 'key', 'defaultValue'; when 'null'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object, Integer)"})
  void testGetIntegerWithMapKeyDefaultValue_whenNull_thenReturnIntValueIsFortyTwo2() {
    // Arrange and Act
    Integer actualInteger = MapUtils.getInteger(null, "Key", 42);

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_given42_whenHashMapKeyIs42_thenReturnIntValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key");

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_given42_whenHashMapKeyIs42_thenReturnIntValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key");

    // Assert
    assertEquals(42, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenA_whenHashMapKeyIsA_thenReturnIntValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key");

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return intValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return intValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenA_whenHashMapKeyIsA_thenReturnIntValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key");

    // Assert
    assertEquals(65, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnIntValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key");

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnIntValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    Integer actualInteger = MapUtils.getInteger(map, "Key");

    // Assert
    assertEquals(1, actualInteger.intValue());
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getInteger(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getInteger(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getInteger(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getInteger(Map, Object)}
   */
  @Test
  @DisplayName("Test getInteger(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer MapUtils.getInteger(Map, Object)"})
  void testGetIntegerWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getInteger(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_givenOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Integer> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getIntValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenNull_thenReturnZero3() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, Function)"})
  void testGetIntValueWithMapKeyDefaultFunction_whenNull_thenReturnZero4() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", null);

    // Assert
    assertEquals(0, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_given42_whenHashMapKeyIs42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_given42_whenHashMapKeyIs422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(65, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(65, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenOne_whenHashMapKeyIsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenOne_whenHashMapKeyIsOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(1, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    int actualIntValue = MapUtils.getIntValue(map, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(new HashMap<>(), "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object, int)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object, int)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object, int) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object, int)"})
  void testGetIntValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo2() {
    // Arrange and Act
    int actualIntValue = MapUtils.getIntValue(null, "Key", 42);

    // Assert
    assertEquals(42, actualIntValue);
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1);

    // Act and Assert
    assertEquals(1, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getIntValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0, MapUtils.getIntValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getIntValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getIntValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getIntValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MapUtils.getIntValue(Map, Object)"})
  void testGetIntValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, MapUtils.getIntValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenOne_thenReturnLongValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_givenOne_thenReturnLongValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLong(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLong(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenNull_thenReturnNull() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenNull_thenReturnNull2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenNull_thenReturnNull3() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Function)"})
  void testGetLongWithMapKeyDefaultFunction_whenNull_thenReturnNull4() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", (Function<Object, Long>) null);

    // Assert
    assertNull(actualLong);
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_given42_whenHashMapKeyIs42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_given42_whenHashMapKeyIs422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenA_thenReturnLongValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given one; then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenOne_thenReturnLongValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given one; then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenOne_thenReturnLongValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Long actualLong = MapUtils.getLong(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when HashMap(); then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenHashMap_thenReturnLongValueIsFortyTwo() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when HashMap(); then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenHashMap_thenReturnLongValueIsFortyTwo2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when 'null'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenNull_thenReturnLongValueIsFortyTwo() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object, Long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object, Long)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object, Long) with 'map', 'key', 'defaultValue'; when 'null'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object, Long)"})
  void testGetLongWithMapKeyDefaultValue_whenNull_thenReturnLongValueIsFortyTwo2() {
    // Arrange and Act
    Long actualLong = MapUtils.getLong(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_given42_whenHashMapKeyIs42_thenReturnLongValueIsFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "Key");

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_given42_whenHashMapKeyIs42_thenReturnLongValueIsFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    Long actualLong = MapUtils.getLong(map, "Key");

    // Assert
    assertEquals(42L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenA_whenHashMapKeyIsA_thenReturnLongValueIsSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "Key");

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return longValue is sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return longValue is sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenA_whenHashMapKeyIsA_thenReturnLongValueIsSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    Long actualLong = MapUtils.getLong(map, "Key");

    // Assert
    assertEquals(65L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnLongValueIsOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key");

    // Assert
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnLongValueIsOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act
    Long actualLong = MapUtils.getLong(map, "Key");

    // Assert
    assertEquals(1L, actualLong.longValue());
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLong(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnNull2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertNull(MapUtils.getLong(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenHashMap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when HashMap(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenHashMap_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLong(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLong(Map, Object)}
   */
  @Test
  @DisplayName("Test getLong(Map, Object) with 'map', 'key'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long MapUtils.getLong(Map, Object)"})
  void testGetLongWithMapKey_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(MapUtils.getLong(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given 'Key'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenKey_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_givenOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenReturn(1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", defaultFunction);

    // Assert
    verify(defaultFunction).apply(isA(Object.class));
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();

    Function<Object, Long> defaultFunction = mock(Function.class);
    when(defaultFunction.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MapUtils.getLongValue(map, "Key", defaultFunction));
    verify(defaultFunction).apply(isA(Object.class));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenNull_thenReturnZero() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenNull_thenReturnZero2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenNull_thenReturnZero3() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, Function)} with {@code map}, {@code key}, {@code
   * defaultFunction}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, Function)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, Function) with 'map', 'key', 'defaultFunction'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, Function)"})
  void testGetLongValueWithMapKeyDefaultFunction_whenNull_thenReturnZero4() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", null);

    // Assert
    assertEquals(0L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_given42_whenHashMapKeyIs42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given '42'; when HashMap() 'Key' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_given42_whenHashMapKeyIs422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(65L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(65L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(1L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; given 'Value'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_givenValue_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    long actualLongValue = MapUtils.getLongValue(map, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when HashMap(); then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenHashMap_thenReturnFortyTwo2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(new HashMap<>(), "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object, long)} with {@code map}, {@code key}, {@code
   * defaultValue}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object, long)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object, long) with 'map', 'key', 'defaultValue'; when 'null'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object, long)"})
  void testGetLongValueWithMapKeyDefaultValue_whenNull_thenReturnFortyTwo2() {
    // Arrange and Act
    long actualLongValue = MapUtils.getLongValue(null, "Key", 42L);

    // Assert
    assertEquals(42L, actualLongValue);
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given '42'; when HashMap() 'Key' is '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_given42_whenHashMapKeyIs42_thenReturnFortyTwo2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "42");

    // Act and Assert
    assertEquals(42L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code A}.
   *   <li>Then return sixty-five.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'A'; when HashMap() 'Key' is 'A'; then return sixty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenA_whenHashMapKeyIsA_thenReturnSixtyFive2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", (byte) 'A');

    // Act and Assert
    assertEquals(65L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnOne() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given one; when HashMap() 'Key' is one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenOne_whenHashMapKeyIsOne_thenReturnOne2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", 1L);

    // Act and Assert
    assertEquals(1L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName(
      "Test getLongValue(Map, Object) with 'map', 'key'; given 'Value'; when HashMap() 'Key' is 'Value'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_givenValue_whenHashMapKeyIsValue_thenReturnZero2() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act and Assert
    assertEquals(0L, MapUtils.getLongValue(map, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenHashMap_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when HashMap(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenHashMap_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(new HashMap<>(), "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getLongValue(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getLongValue(Map, Object)}
   */
  @Test
  @DisplayName("Test getLongValue(Map, Object) with 'map', 'key'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapUtils.getLongValue(Map, Object)"})
  void testGetLongValueWithMapKey_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0L, MapUtils.getLongValue(null, "Key"));
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenHashMap() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenHashMap2() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(new HashMap<>(), "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenNull() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }

  /**
   * Test {@link MapUtils#getMap(Map, Object)} with {@code map}, {@code key}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MapUtils#getMap(Map, Object)}
   */
  @Test
  @DisplayName("Test getMap(Map, Object) with 'map', 'key'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map MapUtils.getMap(Map, Object)"})
  void testGetMapWithMapKey_whenNull2() {
    // Arrange and Act
    Map<?, ?> actualMap = MapUtils.getMap(null, "Key");

    // Assert
    assertNull(actualMap);
  }
}
