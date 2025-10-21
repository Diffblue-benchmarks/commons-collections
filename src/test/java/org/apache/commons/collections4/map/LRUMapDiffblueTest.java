package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LRUMapDiffblueTest {
  /**
   * Test {@link LRUMap#LRUMap()}.
   * <p>
   * Method under test: {@link LRUMap#LRUMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>()"})
  public void testNewLRUMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  public void testNewLRUMap_when10e5_thenThrowIllegalArgumentException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  public void testNewLRUMap_when10e5_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 1.0E-5f, true));

  }

  /**
   * Test {@link LRUMap#LRUMap(int, float, boolean)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, float, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, float, boolean)"})
  public void testNewLRUMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f, true);

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  public void testNewLRUMap_whenTen_thenReturnEmpty2() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f);

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  public void testNewLRUMap_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0, 3, 10.0f));

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  public void testNewLRUMap_whenThree_thenReturnEmpty() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, float)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, float)"})
  public void testNewLRUMap_whenThree_thenReturnEmpty2() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 10.0f);

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, int)"})
  public void testNewLRUMap_whenThree_thenReturnEmpty3() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float, boolean)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float, boolean)"})
  public void testNewLRUMap_whenThree_thenReturnEmpty4() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, 3, 10.0f, true);

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  public void testNewLRUMap_whenThree_thenReturnEmpty5() {
    // Arrange and Act
    LRUMap<Object, Object> actualObjectObjectMap = new LRUMap<>(3, true);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LRUMap#LRUMap(int, int, float)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#LRUMap(int, int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, int, float)"})
  public void testNewLRUMap_whenTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(1, 2, 1.0E-5f));

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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int)"})
  public void testNewLRUMap_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new LRUMap<>(0));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.<init>(int, boolean)"})
  public void testNewLRUMap_whenZero_thenThrowIllegalArgumentException2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.addMapping(int, int, Object, Object)"})
  public void testAddMapping_givenLRUMap_whenOne_thenLRUMapSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.addMapping(int, int, Object, Object)"})
  public void testAddMapping_whenZero_thenCallsReadFloat() throws IOException, ClassNotFoundException {
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
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readFloat()} return {@code 0.5}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#doReadObject(ObjectInputStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_given05_whenObjectInputStreamReadFloatReturn05()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenLRUMapNullIsNull_thenThrowIllegalStateException()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenNine_whenObjectInputStreamReadIntReturnNine()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenOne_thenLRUMapSizeIsOne() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenTwo_whenObjectInputStreamReadIntReturnTwo()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_thenThrowIllegalArgumentException() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.doWriteObject(ObjectOutputStream)"})
  public void testDoWriteObject_givenObjectInputStreamReadObjectReturn42_thenCallsReadFloat()
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
   * Test {@link LRUMap#get(Object)} with {@code key}.
   * <p>
   * Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  public void testGetWithKey() throws IOException, ClassNotFoundException {
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
        AbstractHashedMap.NULL, AbstractHashedMap.NULL));

    // Assert
    verify(in).readFloat();
    verify(in, atLeast(1)).readInt();
    verify(in, atLeast(1)).readObject();
    assertNull(actualGetResult);
  }

  /**
   * Test {@link LRUMap#get(Object, boolean)} with {@code key}, {@code updateToMRU}.
   * <p>
   * Method under test: {@link LRUMap#get(Object, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  public void testGetWithKeyUpdateToMRU() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  public void testGetWithKeyUpdateToMRU_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  public void testGetWithKeyUpdateToMRU_givenLRUMap_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  public void testGetWithKeyUpdateToMRU_givenLRUMap_whenNull_thenReturnNull2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object, boolean)"})
  public void testGetWithKeyUpdateToMRU_whenKey_thenCallsReadFloat() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  public void testGetWithKey_givenLRUMapNullIsNull_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  public void testGetWithKey_givenLRUMap_whenNull_thenReturnNull() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  public void testGetWithKey_givenLRUMap_whenNull_thenReturnNull2() {
    // Arrange
    LRUMap<Object, Object> objectObjectMap = new LRUMap<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link LRUMap#get(Object)} with {@code key}.
   * <ul>
   *   <li>When {@code Key}.</li>
   *   <li>Then calls {@link ObjectInputStream#readFloat()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LRUMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LRUMap.get(Object)"})
  public void testGetWithKey_whenKey_thenCallsReadFloat() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LRUMap.isFull()"})
  public void testIsFull_givenLRUMap_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LRUMap.isFull()"})
  public void testIsFull_givenObjectInputStreamReadObjectReturnNull_thenReturnTrue()
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LRUMap.isScanUntilRemovable()", "int LRUMap.maxSize()"})
  public void testGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.moveToMRU(LinkEntry)"})
  public void testMoveToMRU_thenThrowIllegalStateException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean LRUMap.removeLRU(LinkEntry)"})
  public void testRemoveLRU() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  public void testReuseMapping_givenLRUMap_thenThrowIllegalStateException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  public void testReuseMapping_givenLRUMap_whenNull_thenThrowIllegalStateException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LRUMap.reuseMapping(LinkEntry, int, int, Object, Object)"})
  public void testReuseMapping_givenObjectInputStreamReadIntReturnOne_thenCallsReadFloat()
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
