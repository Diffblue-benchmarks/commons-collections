package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.AbstractLinkedMap.LinkEntry;
import org.apache.commons.collections4.map.LinkedMap.LinkedMapList;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LinkedMapDiffblueTest {
  /**
   * Test LinkedMapList {@link LinkedMapList#LinkedMapList(LinkedMap)}.
   * <p>
   * Method under test: {@link LinkedMapList#LinkedMapList(LinkedMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedMapList.<init>(LinkedMap)"})
  public void testLinkedMapListNewLinkedMapList() {
    // Arrange and Act
    LinkedMapList<Object> actualObjectList = new LinkedMapList<>(new LinkedMap<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap()}.
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedMap.<init>()"})
  public void testNewLinkedMap() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedMap.<init>(int)"})
  public void testNewLinkedMap_whenOne_thenReturnEmpty() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#LinkedMap(int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#LinkedMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LinkedMap.<init>(int, float)"})
  public void testNewLinkedMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    LinkedMap<Object, Object> actualObjectObjectMap = new LinkedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link LinkedMap#asList()}.
   * <p>
   * Method under test: {@link LinkedMap#asList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.List LinkedMap.asList()"})
  public void testAsList() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertTrue(objectObjectMap.asList().isEmpty());
  }

  /**
   * Test {@link LinkedMap#get(int)} with {@code index}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.get(int)"})
  public void testGetWithIndex_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(1));
  }

  /**
   * Test {@link LinkedMap#get(int)} with {@code index}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#get(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.get(int)"})
  public void testGetWithIndex_whenZero_thenReturnNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(0));
  }

  /**
   * Test {@link LinkedMap#getValue(int)}.
   * <ul>
   *   <li>Then return {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.getValue(int)"})
  public void testGetValue_thenReturnLinkedMapNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.getValue(1));
  }

  /**
   * Test {@link LinkedMap#getValue(int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#getValue(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.getValue(int)"})
  public void testGetValue_whenZero_thenReturnLinkedMapNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertSame(objectObjectMap.NULL, objectObjectMap.getValue(0));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} four is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  public void testIndexOf_givenLinkedMapFourIsNull_thenReturnMinusOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(4, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  public void testIndexOf_givenLinkedMapNullIsNull_thenReturnZero() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(0, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LinkedMap#indexOf(Object)}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#indexOf(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int LinkedMap.indexOf(Object)"})
  public void testIndexOf_givenLinkedMap_thenReturnMinusOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();

    // Act and Assert
    assertEquals(-1, objectObjectMap.indexOf(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    LinkEntry<Object, Object> linkEntry = new LinkEntry<>(
        new HashEntry<>(mock(HashEntry.class), 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL), 19088743,
        AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    objectObjectMap.addMapping(1, 2, linkEntry, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(0));
    assertEquals(2, objectObjectMap.size());
    Object expectedGetResult = linkEntry.key;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex_givenLinkedMapNullIsNull_whenOne_thenLinkedMapSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When zero.</li>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex_givenLinkedMapNullIsNull_whenZero_thenLinkedMapSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(0);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Given {@link LinkedMap#LinkedMap()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When one.</li>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex_givenLinkedMapOneIsNull_whenOne_thenLinkedMapSizeIsOne() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(1, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertSame(objectObjectMap.NULL, actualRemoveResult);
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link LinkedMap#LinkedMap()} {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex_thenLinkedMapNull() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 2, -1, AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.remove(0));
    assertEquals(2, objectObjectMap.size());
    Object expectedGetResult = objectObjectMap.NULL;
    assertSame(expectedGetResult, objectObjectMap.get(null));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is four.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex_thenLinkedMapSizeIsFour() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(2, 1, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(4, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertNull(objectObjectMap.get(null));
    assertNull(objectObjectMap.get(null));
    assertNull(actualRemoveResult);
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Test {@link LinkedMap#remove(int)} with {@code index}.
   * <ul>
   *   <li>Then {@link LinkedMap#LinkedMap()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link LinkedMap#remove(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object LinkedMap.remove(int)"})
  public void testRemoveWithIndex_thenLinkedMapSizeIsThree() {
    // Arrange
    LinkedMap<Object, Object> objectObjectMap = new LinkedMap<>();
    objectObjectMap.addMapping(1, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.addMapping(1, 2, AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act
    Object actualRemoveResult = objectObjectMap.remove(1);

    // Assert
    assertEquals(3, objectObjectMap.size());
    assertNull(objectObjectMap.get(null));
    assertNull(objectObjectMap.get(null));
    assertNull(actualRemoveResult);
    assertTrue(objectObjectMap.containsKey(1));
  }
}
