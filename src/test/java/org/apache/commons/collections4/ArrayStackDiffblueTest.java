package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.EmptyStackException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArrayStackDiffblueTest {
  /**
   * Test {@link ArrayStack#ArrayStack()}.
   * <p>
   * Method under test: {@link ArrayStack#ArrayStack()}
   */
  @Test
  @DisplayName("Test new ArrayStack()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayStack.<init>()", "void ArrayStack.<init>(int)"})
  void testNewArrayStack() {
    // Arrange and Act
    ArrayStack<Object> actualObjectList = new ArrayStack<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link ArrayStack#ArrayStack(int)}.
   * <ul>
   *   <li>When three.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#ArrayStack(int)}
   */
  @Test
  @DisplayName("Test new ArrayStack(int); when three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ArrayStack.<init>()", "void ArrayStack.<init>(int)"})
  void testNewArrayStack_whenThree() {
    // Arrange and Act
    ArrayStack<Object> actualObjectList = new ArrayStack<>(3);

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link ArrayStack#empty()}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#empty()}
   */
  @Test
  @DisplayName("Test empty(); given ArrayStack() add '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayStack.empty()"})
  void testEmpty_givenArrayStackAdd42_thenReturnFalse() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(objectList.empty());
  }

  /**
   * Test {@link ArrayStack#empty()}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#empty()}
   */
  @Test
  @DisplayName("Test empty(); given ArrayStack(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ArrayStack.empty()"})
  void testEmpty_givenArrayStack_thenReturnTrue() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertTrue(objectList.empty());
  }

  /**
   * Test {@link ArrayStack#peek(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code 42}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#peek(int)}
   */
  @Test
  @DisplayName("Test peek(int) with 'int'; given ArrayStack() add '42'; when zero; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.peek(int)"})
  void testPeekWithInt_givenArrayStackAdd42_whenZero_thenReturn42() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.peek(0));
  }

  /**
   * Test {@link ArrayStack#peek(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()}.</li>
   *   <li>When two.</li>
   *   <li>Then throw {@link EmptyStackException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#peek(int)}
   */
  @Test
  @DisplayName("Test peek(int) with 'int'; given ArrayStack(); when two; then throw EmptyStackException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.peek(int)"})
  void testPeekWithInt_givenArrayStack_whenTwo_thenThrowEmptyStackException() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertThrows(EmptyStackException.class, () -> objectList.peek(2));
  }

  /**
   * Test {@link ArrayStack#peek()}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#peek()}
   */
  @Test
  @DisplayName("Test peek(); given ArrayStack() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.peek()"})
  void testPeek_givenArrayStackAdd42_thenReturn42() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.peek());
  }

  /**
   * Test {@link ArrayStack#peek()}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()}.</li>
   *   <li>Then throw {@link EmptyStackException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#peek()}
   */
  @Test
  @DisplayName("Test peek(); given ArrayStack(); then throw EmptyStackException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.peek()"})
  void testPeek_givenArrayStack_thenThrowEmptyStackException() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertThrows(EmptyStackException.class, () -> objectList.peek());
  }

  /**
   * Test {@link ArrayStack#pop()}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#pop()}
   */
  @Test
  @DisplayName("Test pop(); given ArrayStack() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.pop()"})
  void testPop_givenArrayStackAdd42_thenReturn42() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", objectList.pop());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link ArrayStack#pop()}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()}.</li>
   *   <li>Then throw {@link EmptyStackException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#pop()}
   */
  @Test
  @DisplayName("Test pop(); given ArrayStack(); then throw EmptyStackException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.pop()"})
  void testPop_givenArrayStack_thenThrowEmptyStackException() throws EmptyStackException {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertThrows(EmptyStackException.class, () -> objectList.pop());
  }

  /**
   * Test {@link ArrayStack#push(Object)}.
   * <p>
   * Method under test: {@link ArrayStack#push(Object)}
   */
  @Test
  @DisplayName("Test push(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object ArrayStack.push(Object)"})
  void testPush() {
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
   * Test {@link ArrayStack#search(Object)}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code 42}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  @DisplayName("Test search(Object); given ArrayStack() add '42'; when 'null'; then return INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayStack.search(Object)"})
  void testSearch_givenArrayStackAdd42_whenNull_thenReturnIndex_not_found() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, objectList.search(null));
  }

  /**
   * Test {@link ArrayStack#search(Object)}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  @DisplayName("Test search(Object); given ArrayStack() add '42'; when 'Object'; then return INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayStack.search(Object)"})
  void testSearch_givenArrayStackAdd42_whenObject_thenReturnIndex_not_found() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, objectList.search("Object"));
  }

  /**
   * Test {@link ArrayStack#search(Object)}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  @DisplayName("Test search(Object); given ArrayStack() add 'null'; when 'null'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayStack.search(Object)"})
  void testSearch_givenArrayStackAddNull_whenNull_thenReturnOne() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add(null);

    // Act and Assert
    assertEquals(1, objectList.search(null));
  }

  /**
   * Test {@link ArrayStack#search(Object)}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()} add {@code Object}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  @DisplayName("Test search(Object); given ArrayStack() add 'Object'; when 'Object'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayStack.search(Object)"})
  void testSearch_givenArrayStackAddObject_whenObject_thenReturnOne() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();
    objectList.add("Object");

    // Act and Assert
    assertEquals(1, objectList.search("Object"));
  }

  /**
   * Test {@link ArrayStack#search(Object)}.
   * <ul>
   *   <li>Given {@link ArrayStack#ArrayStack()}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ArrayStack#search(Object)}
   */
  @Test
  @DisplayName("Test search(Object); given ArrayStack(); when 'Object'; then return INDEX_NOT_FOUND")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ArrayStack.search(Object)"})
  void testSearch_givenArrayStack_whenObject_thenReturnIndex_not_found() {
    // Arrange
    ArrayStack<Object> objectList = new ArrayStack<>();

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, objectList.search("Object"));
  }
}
