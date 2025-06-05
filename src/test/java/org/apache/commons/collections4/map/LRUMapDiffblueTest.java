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
   * <p>
   * Method under test: {@link LRUMap#LRUMap()}
   */
  @Test
  @DisplayName("Test new LRUMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>()"})
  void testNewLRUMap() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   * <ul>
   *   <li>When {@code 1.0E-5}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float); when '1.0E-5'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  void testNewLRUMap_when10e5_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   * <ul>
   *   <li>When {@code 1.0E-5}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float, boolean); when '1.0E-5'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  void testNewLRUMap_when10e5_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f, true));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   * <ul>
   *   <li>When {@code 1073741824}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float); when '1073741824'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_when1073741824_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 1073741824, 1.0E-5f));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   * <ul>
   *   <li>When {@code 1073741824}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float, boolean); when '1073741824'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_when1073741824_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 1073741824, 1.0E-5f, true));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  void testNewLRUMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_whenTen_thenReturnEmpty2() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float, boolean); when ten; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_whenTen_thenReturnEmpty3() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float); when ten; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  void testNewLRUMap_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 3, 10.0f));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int, float, boolean); when ten; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  void testNewLRUMap_whenTen_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 3, 10.0f, true));

  }

  /**
   * Test {@link LRUMap#LRUMap(int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int); when three; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  void testNewLRUMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, float, boolean); when three; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  void testNewLRUMap_whenThree_thenReturnEmpty2() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int); when three; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  void testNewLRUMap_whenThree_thenReturnEmpty3() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, boolean)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, boolean); when three; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  void testNewLRUMap_whenThree_thenReturnEmpty4() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int); when two; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  void testNewLRUMap_whenTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 2));

  }

  /**
   * Test {@link LRUMap#LRUMap(int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int); when zero; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0));
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, int); when zero; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 0));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, boolean)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, boolean)}
   */
  @Test
  @DisplayName("Test new LRUMap(int, boolean); when zero; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  void testNewLRUMap_whenZero_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, true));

  }

  /**
   * Test {@link LRUMap#addMapping(int, int, Object, Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link LRUMap#LRUMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#addMapping(int, int, Object, Object)}
   */
  @Test
  @DisplayName("Test addMapping(int, int, Object, Object); given LRUMap(); when one; then LRUMap() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.addMapping(int, int, Object, Object)"})
  void testAddMapping_givenLRUMap_whenOne_thenLRUMapSizeIsOne() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#addMapping(int, int, Object, Object)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#addMapping(int, int, Object, Object)}
   */
  @Test
  @DisplayName("Test addMapping(int, int, Object, Object); when zero; then calls readFloat()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.addMapping(int, int, Object, Object)"})
  void testAddMapping_whenZero_thenCallsReadFloat() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    objectObjectMap.addMapping(0, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@code 0.5}.</li>
   *   <li>Then {@link LRUMap#LRUMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given '0.5'; then LRUMap() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_given05_thenLRUMapSizeIsOne() throws IOException, ClassNotFoundException {
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
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given LRUMap() NULL is NULL; then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given nine.</li>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given nine; when ObjectInputStream readInt() return nine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenNine_whenObjectInputStreamReadIntReturnNine() throws IOException, ClassNotFoundException {
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
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>Then {@link LRUMap#LRUMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given one; then LRUMap() size is one")
  @Tag("MaintainedByDiffblue")
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
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given two; when ObjectInputStream readInt() return two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenTwo_whenObjectInputStreamReadIntReturnTwo() throws IOException, ClassNotFoundException {
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
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  void testDoReadObject_thenThrowIllegalArgumentException() throws IOException, ClassNotFoundException {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IllegalArgumentException("foo"));
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
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@code 42}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doWriteObject(ObjectOutputStream)}
   */
  @Test
  @DisplayName("Test doWriteObject(ObjectOutputStream); given ObjectInputStream readObject() return '42'; then calls readFloat()")
  @Tag("MaintainedByDiffblue")
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
    objectObjectMap.doWriteObject(new ObjectOutputStream(new ByteArrayOutputStream(1)));

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   * <p>
   * Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU() throws IOException, ClassNotFoundException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn(AbstractHashedMap.NULL);
    when(in.readFloat()).thenReturn(10.0f);
    when(in.readInt()).thenReturn(1);

    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.doReadObject(in);

    // Act
    Object actualGetResult = objectObjectMap.get(new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL), true);

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'; given LRUMap() NULL is NULL; when NULL; then return NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object, true));
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'; given LRUMap(); when NULL; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL, true));
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'; given LRUMap(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_givenLRUMap_whenNull_thenReturnNull2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null, true));
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @DisplayName("Test get(Object, boolean) with 'key', 'updateToMRU'; when 'Key'; then calls readFloat()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  void testGetWithKeyUpdateToMRU_whenKey_thenCallsReadFloat() throws IOException, ClassNotFoundException {
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
   * Test {@link LRUMap#get(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object) with 'key'; given LRUMap() NULL is NULL; when NULL; then return NULL")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object) with 'key'; given LRUMap(); when NULL; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenLRUMap_whenNull_thenReturnNull() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object) with 'key'; given LRUMap(); when 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenLRUMap_whenNull_thenReturnNull2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object) with 'key'; given ObjectInputStream readObject() return NULL; then calls readFloat()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  void testGetWithKey_givenObjectInputStreamReadObjectReturnNull_thenCallsReadFloat()
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
   * Test {@link LRUMap#isFull()}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#isFull()}
   */
  @Test
  @DisplayName("Test isFull(); given LRUMap(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LRUMap.isFull()"})
  void testIsFull_givenLRUMap_thenReturnFalse() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertFalse(objectObjectMap.isFull());
  }

  /**
   * Test {@link LRUMap#isFull()}.
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readObject()} return {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#isFull()}
   */
  @Test
  @DisplayName("Test isFull(); given ObjectInputStream readObject() return NULL; then return 'true'")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link LRUMap#isScanUntilRemovable()}
   *   <li>{@link LRUMap#maxSize()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#moveToMRU(LinkEntry)}
   */
  @Test
  @DisplayName("Test moveToMRU(LinkEntry); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.moveToMRU(LinkEntry)"})
  void testMoveToMRU_thenThrowIllegalStateException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.moveToMRU(new LinkEntry<>(
            new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
            AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Test {@link LRUMap#removeLRU(LinkEntry)}.
   * <p>
   * Method under test: {@link LRUMap#removeLRU(LinkEntry)}
   */
  @Test
  @DisplayName("Test removeLRU(LinkEntry)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean LRUMap.removeLRU(LinkEntry)"})
  void testRemoveLRU() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.removeLRU(new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL)));
  }

  /**
   * Test {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}
   */
  @Test
  @DisplayName("Test reuseMapping(LinkEntry, int, int, Object, Object); given LRUMap(); then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  void testReuseMapping_givenLRUMap_thenThrowIllegalStateException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.reuseMapping(
            new LinkEntry<>(
                new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
                19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}.
   * <ul>
   *   <li>Given {@link LRUMap#LRUMap()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}
   */
  @Test
  @DisplayName("Test reuseMapping(LinkEntry, int, int, Object, Object); given LRUMap(); when 'null'; then throw IllegalStateException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  void testReuseMapping_givenLRUMap_whenNull_thenThrowIllegalStateException() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.reuseMapping(null, 19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}.
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readInt()} return one.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#reuseMapping(LinkEntry, int, int, Object, Object)}
   */
  @Test
  @DisplayName("Test reuseMapping(LinkEntry, int, int, Object, Object); given ObjectInputStream readInt() return one; then calls readFloat()")
  @Tag("MaintainedByDiffblue")
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

    // Act and Assert
    assertThrows(IllegalStateException.class,
        () -> objectObjectMap.reuseMapping(
            new LinkEntry<>(
                new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
                19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL),
            19088743, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
  }
}
