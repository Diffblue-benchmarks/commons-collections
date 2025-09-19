package org.apache.commons.collections4.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LRUMapDiffblueTest {
  /**
   * Test {@link LRUMap#LRUMap()}.
   *
   * <p>Method under test: {@link LRUMap#LRUMap()}
   */
  @Test
  @DisplayName("Test new LRUMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>()"})
  void testNewLRUMap() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-5}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float); when '1.0E-5'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  void testNewLRUMap_when10e5_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-5}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, float, boolean); when '1.0E-5'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  void testNewLRUMap_when10e5_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int)}.
   *
   * <ul>
   *   <li>When {@code 1073741824}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int); when '1073741824'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  void testNewLRUMap_when1073741824_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 1073741824));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   *
   * <ul>
   *   <li>When {@code 1073741824}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, int, float); when '1073741824'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_when1073741824_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 1073741824, 1.0E-5f));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1073741824}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, int, float, boolean); when '1073741824'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_when1073741824_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 1073741824, 1.0E-5f, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(-1));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(-1, 0.0f));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, float, boolean); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(-1, 0.0f, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, -1));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, int, float); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException5() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, -1, 0.0f));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, int, float, boolean); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException6() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, -1, 0.0f, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, boolean); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  void testNewLRUMap_whenMinusOne_thenThrowIllegalArgumentException7() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(-1, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  void testNewLRUMap_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 0.0f));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, float, boolean); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  void testNewLRUMap_whenOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 0.0f, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  void testNewLRUMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  void testNewLRUMap_whenThree_thenReturnEmpty2() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float, boolean); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  void testNewLRUMap_whenThree_thenReturnEmpty3() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  void testNewLRUMap_whenThree_thenReturnEmpty4() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_whenThree_thenReturnEmpty5() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float, boolean); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_whenThree_thenReturnEmpty6() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, boolean)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, boolean); when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  void testNewLRUMap_whenThree_thenReturnEmpty7() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 0, 0.0f));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName(
      "Test new LRUMap(int, int, float, boolean); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 0, 0.0f, true));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, boolean); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, true));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readFloat()} return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given '0.5'; when ObjectInputStream readFloat() return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_given05_whenObjectInputStreamReadFloatReturn05()
      throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(0.5f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given LRUMap() NULL is NULL; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenLRUMapNullIsNull_thenThrowIllegalStateException()
      throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectObjectMap.doReadObject(in));
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given nine.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return nine.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given nine; when ObjectInputStream readInt() return nine")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenNine_whenObjectInputStreamReadIntReturnNine()
      throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(9);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then {@link LRUMap#LRUMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given one; then LRUMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenOne_thenLRUMapSizeIsOne() throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return two.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); given two; when ObjectInputStream readInt() return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenTwo_whenObjectInputStreamReadIntReturnTwo()
      throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(0.5f);
    when(in.readInt()).thenReturn(2);

    // Act
    objectObjectMap.doReadObject(in);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertSame(AbstractHashedMap.NULL, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); when ObjectInputStream readInt() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_whenObjectInputStreamReadIntThrowIllegalArgumentException()
      throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readInt()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.doReadObject(in));
    verify(in).readInt();
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   *
   * <ul>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readObject()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(ObjectInputStream); when ObjectInputStream readObject() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_whenObjectInputStreamReadObjectThrowIllegalArgumentException()
      throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IllegalArgumentException());
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> objectObjectMap.doReadObject(in));
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link LRUMap#doWriteObject(ObjectOutputStream)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code 42}.
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#doWriteObject(ObjectOutputStream)}
   */
  @Test
  @DisplayName(
      "Test doWriteObject(ObjectOutputStream); given ObjectInputStream readObject() return '42'; then calls readFloat()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.doWriteObject(ObjectOutputStream)"})
  void testDoWriteObject_givenObjectInputStreamReadObjectReturn42_thenCallsReadFloat()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("42");
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    objectObjectMap.doWriteObject(new ObjectOutputStream(new ByteArrayOutputStream()));

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   *
   * <p>Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object) with 'key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> linkEntry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualGetResult = objectObjectMap.get(linkEntry);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   *
   * <p>Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> linkEntry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualGetResult = objectObjectMap.get(linkEntry, true);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test get(Object, boolean) with 'key', 'updateToMRU'; given LRUMap() NULL is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object, true);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test get(Object, boolean) with 'key', 'updateToMRU'; given LRUMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, true));
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test get(Object, boolean) with 'key', 'updateToMRU'; when 'false'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_whenFalse_thenReturnNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualGetResult = objectObjectMap.get(null, false);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertSame(AbstractHashedMap.NULL, actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test get(Object, boolean) with 'key', 'updateToMRU'; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_whenKey_thenReturnNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualGetResult = objectObjectMap.get("Key", true);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'; when 'null'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_whenNull_thenReturnNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualGetResult = objectObjectMap.get(null, true);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertSame(AbstractHashedMap.NULL, actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link
   *       AbstractHashedMap#NULL}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object) with 'key'; given LRUMap() NULL is NULL; when NULL; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act
    Object actualGetResult = objectObjectMap.get(object);

    // Assert
    assertSame(object, actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@link AbstractHashedMap#NULL}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object) with 'key'; given LRUMap(); when NULL; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return one.
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object) with 'key'; given ObjectInputStream readInt() return one; when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenObjectInputStreamReadIntReturnOne_whenKey_thenReturnNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualGetResult = objectObjectMap.get("Key");

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return one.
   *   <li>When {@code null}.
   *   <li>Then return {@link AbstractHashedMap#NULL}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName(
      "Test get(Object) with 'key'; given ObjectInputStream readInt() return one; when 'null'; then return NULL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenObjectInputStreamReadIntReturnOne_whenNull_thenReturnNull()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualGetResult = objectObjectMap.get(null);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertSame(AbstractHashedMap.NULL, actualGetResult);
  }

  /**
   * Test {@link LRUMap#isFull()}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#isFull()}
   */
  @Test
  @DisplayName("Test isFull(); given LRUMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LRUMap.isFull()"})
  void testIsFull_givenLRUMap_thenReturnFalse() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isFull());
  }

  /**
   * Test {@link LRUMap#isFull()}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@link
   *       AbstractHashedMap#NULL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#isFull()}
   */
  @Test
  @DisplayName(
      "Test isFull(); given ObjectInputStream readObject() return NULL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LRUMap.isFull()"})
  void testIsFull_givenObjectInputStreamReadObjectReturnNull_thenReturnTrue()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    boolean actualIsFullResult = objectObjectMap.isFull();

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertTrue(actualIsFullResult);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LRUMap#isScanUntilRemovable()}
   *   <li>{@link LRUMap#maxSize()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LRUMap.isScanUntilRemovable()", "int LRUMap.maxSize()"})
  void testGettersAndSetters() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    boolean actualIsScanUntilRemovableResult = objectObjectMap.isScanUntilRemovable();

    // Assert
    assertEquals(100, objectObjectMap.maxSize());
    assertFalse(actualIsScanUntilRemovableResult);
  }

  /**
   * Test {@link LRUMap#moveToMRU(LinkEntry)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#moveToMRU(LinkEntry)}
   */
  @Test
  @DisplayName("Test moveToMRU(LinkEntry); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.moveToMRU(LinkEntry)"})
  void testMoveToMRU_thenThrowIllegalStateException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> entry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectObjectMap.moveToMRU(entry));
  }

  /**
   * Test {@link LRUMap#removeLRU(LinkEntry)}.
   *
   * <p>Method under test: {@link LRUMap#removeLRU(LinkEntry)}
   */
  @Test
  @DisplayName("Test removeLRU(LinkEntry)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LRUMap.removeLRU(LinkEntry)"})
  void testRemoveLRU() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> entry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    boolean actualRemoveLRUResult = objectObjectMap.removeLRU(entry);

    // Assert
    assertTrue(actualRemoveLRUResult);
  }

  /**
   * Test {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test reuseMapping(LinkEntry, int, int, Object, Object); given LRUMap(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  void testReuseMapping_givenLRUMap_thenThrowIllegalStateException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> entry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            objectObjectMap.reuseMapping(
                entry, 19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test reuseMapping(LinkEntry, int, int, Object, Object); given LRUMap(); when 'null'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  void testReuseMapping_givenLRUMap_whenNull_thenThrowIllegalStateException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            objectObjectMap.reuseMapping(
                null, 19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return one.
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.
   * </ul>
   *
   * <p>Method under test: {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}
   */
  @Test
  @DisplayName(
      "Test reuseMapping(LinkEntry, int, int, Object, Object); given ObjectInputStream readInt() return one; then calls readFloat()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  void testReuseMapping_givenObjectInputStreamReadIntReturnOne_thenCallsReadFloat()
      throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);
    HashEntry<Object, Object> next =
        new HashEntry<>(
            mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    LinkEntry<Object, Object> entry =
        new LinkEntry<>(next, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            objectObjectMap.reuseMapping(
                entry, 19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
  }
}
