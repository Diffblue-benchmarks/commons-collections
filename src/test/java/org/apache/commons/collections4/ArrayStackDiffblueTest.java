package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.EmptyStackException;
import org.junit.Test;

public class ArrayStackDiffblueTest {
  /**
   * Method under test: {@link ArrayStack#empty()}
   */
  @Test
  public void testEmpty() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertTrue(objectList.empty());
  }

  /**
   * Method under test: {@link ArrayStack#empty()}
   */
  @Test
  public void testEmpty2() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.empty());
  }

  /**
   * Method under test: {@link ArrayStack#peek()}
   */
  @Test
  public void testPeek() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertThrows(EmptyStackException.class, () -> objectList.peek());
  }

  /**
   * Method under test: {@link ArrayStack#peek()}
   */
  @Test
  public void testPeek2() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.peek());
  }

  /**
   * Method under test: {@link ArrayStack#peek(int)}
   */
  @Test
  public void testPeek3() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertThrows(EmptyStackException.class, () -> objectList.peek(2));
  }

  /**
   * Method under test: {@link ArrayStack#peek(int)}
   */
  @Test
  public void testPeek4() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.peek(0));
  }

  /**
   * Method under test: {@link ArrayStack#pop()}
   */
  @Test
  public void testPop() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertThrows(EmptyStackException.class, () -> objectList.pop());
  }

  /**
   * Method under test: {@link ArrayStack#pop()}
   */
  @Test
  public void testPop2() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.pop());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link ArrayStack#push(Object)}
   */
  @Test
  public void testPush() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act
    Object actualPushResult = objectList.push("Item");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Item", objectList.get(0));
    assertEquals("Item", actualPushResult);
  }

  /**
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  public void testSearch() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, objectList.search("Object"));
  }

  /**
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  public void testSearch2() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, objectList.search("Object"));
  }

  /**
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  public void testSearch3() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("Object");

    // Act and Assert
    assertEquals(1, objectList.search("Object"));
  }

  /**
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  public void testSearch4() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, objectList.search(null));
  }

  /**
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  public void testSearch5() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add(null);

    // Act and Assert
    assertEquals(1, objectList.search(null));
  }

  /**
   * Method under test: {@link ArrayStack#ArrayStack()}
   */
  @Test
  public void testNewArrayStack() {
    // Arrange and Act
    ArrayStack<Object> actualObjectList = new ArrayStack<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link ArrayStack#ArrayStack(int)}
   */
  @Test
  public void testNewArrayStack2() {
    // Arrange and Act
    ArrayStack<Object> actualObjectList = new ArrayStack<>(3);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }
}
