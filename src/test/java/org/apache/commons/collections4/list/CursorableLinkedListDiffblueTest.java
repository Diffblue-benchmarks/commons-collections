package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList;
import org.apache.commons.collections4.list.AbstractLinkedList.Node;
import org.apache.commons.collections4.list.CursorableLinkedList.Cursor;
import org.apache.commons.collections4.list.CursorableLinkedList.SubCursor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CursorableLinkedListDiffblueTest {
  /**
   * Test Cursor {@link Cursor#add(Object)}.
   *
   * <ul>
   *   <li>Then {@link Cursor#Cursor(CursorableLinkedList, int)} with parent is {@link
   *       CursorableLinkedList#CursorableLinkedList()} and index is one next is {@code Obj}.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#add(Object)}
   */
  @Test
  @DisplayName(
      "Test Cursor add(Object); then Cursor(CursorableLinkedList, int) with parent is CursorableLinkedList() and index is one next is 'Obj'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Cursor.add(Object)"})
  void testCursorAdd_thenCursorWithParentIsCursorableLinkedListAndIndexIsOneNextIsObj() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    Cursor<Object> cursor = new Cursor<>(parent, 1);

    // Act
    cursor.add("Obj");

    // Assert
    Object nextResult = cursor.next();
    assertEquals("Obj", cursor.next());
    assertEquals("Value", nextResult);
    assertFalse(cursor.hasNext());
  }

  /**
   * Test Cursor {@link Cursor#Cursor(CursorableLinkedList, int)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @DisplayName(
      "Test Cursor new Cursor(CursorableLinkedList, int); given 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  void testCursorNewCursor_givenValue_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    Cursor<Object> actualCursor = new Cursor<>(parent, 1);

    // Assert
    assertEquals("Value", actualCursor.next());
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Test Cursor {@link Cursor#Cursor(CursorableLinkedList, int)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @DisplayName(
      "Test Cursor new Cursor(CursorableLinkedList, int); given 'Value'; when CursorableLinkedList() add 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  void testCursorNewCursor_givenValue_whenCursorableLinkedListAddValue() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");

    // Act
    Cursor<Object> actualCursor = new Cursor<>(parent, 1);

    // Assert
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Test Cursor {@link Cursor#Cursor(CursorableLinkedList, int)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When zero.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @DisplayName(
      "Test Cursor new Cursor(CursorableLinkedList, int); given 'Value'; when zero; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  void testCursorNewCursor_givenValue_whenZero_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");

    // Act
    Cursor<Object> actualCursor = new Cursor<>(parent, 0);

    // Assert
    assertEquals("Value", actualCursor.next());
    assertEquals("Value", actualCursor.next());
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Test Cursor {@link Cursor#Cursor(CursorableLinkedList, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @DisplayName(
      "Test Cursor new Cursor(CursorableLinkedList, int); when zero; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  void testCursorNewCursor_whenZero_thenReturnNotHasNext() {
    // Arrange and Act
    Cursor<Object> actualCursor = new Cursor<>(new CursorableLinkedList<>(), 0);

    // Assert
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Test Cursor {@link Cursor#nextIndex()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#nextIndex()}
   */
  @Test
  @DisplayName("Test Cursor nextIndex(); given CursorableLinkedList() add 'Value'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Cursor.nextIndex()"})
  void testCursorNextIndex_givenCursorableLinkedListAddValue_thenReturnOne() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    Cursor<Object> cursor = new Cursor<>(parent, 1);

    // Act and Assert
    assertEquals(1, cursor.nextIndex());
  }

  /**
   * Test Cursor {@link Cursor#remove()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link Cursor#remove()}
   */
  @Test
  @DisplayName("Test Cursor remove(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Cursor.remove()"})
  void testCursorRemove_thenThrowIllegalStateException() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    Cursor<Object> cursor = new Cursor<>(parent, 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> cursor.remove());
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList()}.
   *
   * <p>Method under test: {@link CursorableLinkedList#CursorableLinkedList()}
   */
  @Test
  @DisplayName("Test new CursorableLinkedList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.<init>()"})
  void testNewCursorableLinkedList() {
    // Arrange and Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  @DisplayName("Test new CursorableLinkedList(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.<init>(Collection)"})
  void testNewCursorableLinkedList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>(coll);

    // Assert
    assertEquals(coll, actualObjectList);
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  @DisplayName("Test new CursorableLinkedList(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.<init>(Collection)"})
  void testNewCursorableLinkedList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>(coll);

    // Assert
    assertEquals(coll, actualObjectList);
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  @DisplayName("Test new CursorableLinkedList(Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.<init>(Collection)"})
  void testNewCursorableLinkedList_whenArrayList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>(coll);

    // Assert
    assertEquals(coll, actualObjectList);
  }

  /**
   * Test {@link CursorableLinkedList#addNode(Node, Node)}.
   *
   * <ul>
   *   <li>When {@link Node#Node()}.
   *   <li>Then {@link Node#Node()} NextNode Value is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#addNode(Node, Node)}
   */
  @Test
  @DisplayName("Test addNode(Node, Node); when Node(); then Node() NextNode Value is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.addNode(Node, Node)"})
  void testAddNode_whenNode_thenNodeNextNodeValueIsNull() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    Node<Object> nodeToInsert = new Node<>();
    Node<Object> insertBeforeNode = new Node<>();

    // Act
    objectList.addNode(nodeToInsert, insertBeforeNode);

    // Assert
    Node<Object> nextNode = nodeToInsert.getNextNode();
    assertNull(nextNode.getValue());
    assertSame(nodeToInsert, nextNode.getNextNode());
    assertSame(insertBeforeNode, nodeToInsert.getPreviousNode());
    assertSame(nodeToInsert, nextNode.getPreviousNode());
  }

  /**
   * Test {@link CursorableLinkedList#createSubListListIterator(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link CursorableLinkedList#createSubListListIterator(LinkedSubList,
   * int)}
   */
  @Test
  @DisplayName("Test createSubListListIterator(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ListIterator CursorableLinkedList.createSubListListIterator(LinkedSubList, int)"
  })
  void testCreateSubListListIterator() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> subList = new LinkedSubList<>(parent, 1, 1);

    // Act
    ListIterator<Object> actualCreateSubListListIteratorResult =
        objectList.createSubListListIterator(subList, 1);

    // Assert
    assertTrue(actualCreateSubListListIteratorResult instanceof SubCursor);
    assertFalse(actualCreateSubListListIteratorResult.hasNext());
    assertEquals(objectList, subList);
  }

  /**
   * Test {@link CursorableLinkedList#createSubListListIterator(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link CursorableLinkedList#createSubListListIterator(LinkedSubList,
   * int)}
   */
  @Test
  @DisplayName("Test createSubListListIterator(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ListIterator CursorableLinkedList.createSubListListIterator(LinkedSubList, int)"
  })
  void testCreateSubListListIterator2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> subList = new LinkedSubList<>(parent, 1, 1);

    // Act
    ListIterator<Object> actualCreateSubListListIteratorResult =
        objectList.createSubListListIterator(subList, 1);

    // Assert
    assertTrue(actualCreateSubListListIteratorResult instanceof SubCursor);
    assertFalse(actualCreateSubListListIteratorResult.hasNext());
    assertEquals(objectList, subList);
  }

  /**
   * Test {@link CursorableLinkedList#createSubListListIterator(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link CursorableLinkedList#createSubListListIterator(LinkedSubList,
   * int)}
   */
  @Test
  @DisplayName("Test createSubListListIterator(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ListIterator CursorableLinkedList.createSubListListIterator(LinkedSubList, int)"
  })
  void testCreateSubListListIterator3() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedSubList<Object> subList = new LinkedSubList<>(parent, 0, 1);

    // Act
    objectList.createSubListListIterator(subList, 1);

    // Assert
    assertEquals(1, subList.size());
  }

  /**
   * Test {@link CursorableLinkedList#createSubListListIterator(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link CursorableLinkedList#createSubListListIterator(LinkedSubList,
   * int)}
   */
  @Test
  @DisplayName("Test createSubListListIterator(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ListIterator CursorableLinkedList.createSubListListIterator(LinkedSubList, int)"
  })
  void testCreateSubListListIterator4() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> subList = new LinkedSubList<>(parent, 1, 3);

    // Act
    ListIterator<Object> actualCreateSubListListIteratorResult =
        objectList.createSubListListIterator(subList, 1);

    // Assert
    assertTrue(actualCreateSubListListIteratorResult instanceof SubCursor);
    assertEquals(2, subList.size());
    assertEquals("Value", actualCreateSubListListIteratorResult.next());
    assertFalse(actualCreateSubListListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#createSubListListIterator(LinkedSubList, int)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When minus one.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#createSubListListIterator(LinkedSubList,
   * int)}
   */
  @Test
  @DisplayName(
      "Test createSubListListIterator(LinkedSubList, int); given 'Value'; when minus one; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ListIterator CursorableLinkedList.createSubListListIterator(LinkedSubList, int)"
  })
  void testCreateSubListListIterator_givenValue_whenMinusOne_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> subList = new LinkedSubList<>(parent, 1, 1);

    // Act
    ListIterator<Object> actualCreateSubListListIteratorResult =
        objectList.createSubListListIterator(subList, -1);

    // Assert
    assertTrue(actualCreateSubListListIteratorResult instanceof SubCursor);
    assertEquals("Value", actualCreateSubListListIteratorResult.next());
    assertFalse(actualCreateSubListListIteratorResult.hasNext());
    assertEquals(objectList, subList);
  }

  /**
   * Test {@link CursorableLinkedList#cursor(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  @DisplayName(
      "Test cursor(int) with 'int'; given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor(int)"})
  void testCursorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    Cursor<Object> actualCursorResult = objectList.cursor(0);

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  @DisplayName(
      "Test cursor(int) with 'int'; given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor(int)"})
  void testCursorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Cursor<Object> actualCursorResult = objectList.cursor(0);

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.
   *   <li>When zero.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  @DisplayName(
      "Test cursor(int) with 'int'; given CursorableLinkedList(); when zero; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor(int)"})
  void testCursorWithInt_givenCursorableLinkedList_whenZero_thenReturnNotHasNext() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.cursor(0).hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  @DisplayName("Test cursor(); given CursorableLinkedList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor()"})
  void testCursor_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.cursor().hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  @DisplayName(
      "Test cursor(); given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor()"})
  void testCursor_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    Cursor<Object> actualCursorResult = objectList.cursor();

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  @DisplayName(
      "Test cursor(); given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor()"})
  void testCursor_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Cursor<Object> actualCursorResult = objectList.cursor();

    // Assert
    assertEquals("Value", actualCursorResult.next());
    assertEquals("Value", actualCursorResult.next());
    assertFalse(actualCursorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  @DisplayName("Test iterator(); given CursorableLinkedList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CursorableLinkedList.iterator()"})
  void testIterator_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  @DisplayName(
      "Test iterator(); given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CursorableLinkedList.iterator()"})
  void testIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#iterator()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  @DisplayName(
      "Test iterator(); given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator CursorableLinkedList.iterator()"})
  void testIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    Iterator<Object> actualIteratorResult = objectList.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof LinkedListIterator);
    assertEquals("Value", actualIteratorResult.next());
    assertEquals("Value", actualIteratorResult.next());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#listIterator(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  @DisplayName(
      "Test listIterator(int) with 'int'; given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator(int)"})
  void testListIteratorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#listIterator(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  @DisplayName(
      "Test listIterator(int) with 'int'; given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator(int)"})
  void testListIteratorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#listIterator(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.
   *   <li>When zero.
   *   <li>Then return {@link Cursor}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  @DisplayName(
      "Test listIterator(int) with 'int'; given CursorableLinkedList(); when zero; then return Cursor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator(int)"})
  void testListIteratorWithInt_givenCursorableLinkedList_whenZero_thenReturnCursor() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator(0);

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#listIterator()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  @DisplayName("Test listIterator(); given CursorableLinkedList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator()"})
  void testListIterator_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#listIterator()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  @DisplayName(
      "Test listIterator(); given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator()"})
  void testListIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#listIterator()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  @DisplayName(
      "Test listIterator(); given CursorableLinkedList() add 'Value'; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator()"})
  void testListIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    ListIterator<Object> actualListIteratorResult = objectList.listIterator();

    // Assert
    assertTrue(actualListIteratorResult instanceof Cursor);
    assertEquals("Value", actualListIteratorResult.next());
    assertEquals("Value", actualListIteratorResult.next());
    assertFalse(actualListIteratorResult.hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#removeAllNodes()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  @DisplayName("Test removeAllNodes(); given CursorableLinkedList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.removeAllNodes()"})
  void testRemoveAllNodes_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.removeAllNodes();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link CursorableLinkedList#removeAllNodes()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  @DisplayName("Test removeAllNodes(); given CursorableLinkedList() add 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.removeAllNodes()"})
  void testRemoveAllNodes_givenCursorableLinkedListAddValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link CursorableLinkedList#removeAllNodes()}.
   *
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  @DisplayName("Test removeAllNodes(); given CursorableLinkedList() add 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.removeAllNodes()"})
  void testRemoveAllNodes_givenCursorableLinkedListAddValue2() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    objectList.add("Value");
    objectList.add("Value");

    // Act
    objectList.removeAllNodes();

    // Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test SubCursor {@link SubCursor#SubCursor(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link SubCursor#SubCursor(LinkedSubList, int)}
   */
  @Test
  @DisplayName("Test SubCursor new SubCursor(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SubCursor.<init>(LinkedSubList, int)"})
  void testSubCursorNewSubCursor() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> sub = new LinkedSubList<>(parent, 1, 1);

    // Act
    SubCursor<Object> actualSubCursor = new SubCursor<>(sub, 1);

    // Assert
    assertFalse(actualSubCursor.hasNext());
    assertTrue(sub.isEmpty());
  }

  /**
   * Test SubCursor {@link SubCursor#SubCursor(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link SubCursor#SubCursor(LinkedSubList, int)}
   */
  @Test
  @DisplayName("Test SubCursor new SubCursor(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SubCursor.<init>(LinkedSubList, int)"})
  void testSubCursorNewSubCursor2() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> sub = new LinkedSubList<>(parent, 1, 1);

    // Act
    SubCursor<Object> actualSubCursor = new SubCursor<>(sub, 1);

    // Assert
    assertFalse(actualSubCursor.hasNext());
    assertTrue(sub.isEmpty());
  }

  /**
   * Test SubCursor {@link SubCursor#SubCursor(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link SubCursor#SubCursor(LinkedSubList, int)}
   */
  @Test
  @DisplayName("Test SubCursor new SubCursor(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SubCursor.<init>(LinkedSubList, int)"})
  void testSubCursorNewSubCursor3() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    LinkedSubList<Object> sub = new LinkedSubList<>(parent, 0, 1);

    // Act
    new SubCursor<>(sub, 1);

    // Assert
    assertEquals(1, sub.size());
  }

  /**
   * Test SubCursor {@link SubCursor#SubCursor(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link SubCursor#SubCursor(LinkedSubList, int)}
   */
  @Test
  @DisplayName("Test SubCursor new SubCursor(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SubCursor.<init>(LinkedSubList, int)"})
  void testSubCursorNewSubCursor4() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> sub = new LinkedSubList<>(parent, 1, 3);

    // Act
    SubCursor<Object> actualSubCursor = new SubCursor<>(sub, 1);

    // Assert
    assertEquals(2, sub.size());
    assertEquals("Value", actualSubCursor.next());
    assertFalse(actualSubCursor.hasNext());
  }

  /**
   * Test SubCursor {@link SubCursor#SubCursor(LinkedSubList, int)}.
   *
   * <p>Method under test: {@link SubCursor#SubCursor(LinkedSubList, int)}
   */
  @Test
  @DisplayName("Test SubCursor new SubCursor(LinkedSubList, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SubCursor.<init>(LinkedSubList, int)"})
  void testSubCursorNewSubCursor5() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> sub = new LinkedSubList<>(parent, 0, 1);

    // Act
    SubCursor<Object> actualSubCursor = new SubCursor<>(sub, 1);

    // Assert
    assertEquals(1, sub.size());
    assertFalse(actualSubCursor.hasNext());
  }

  /**
   * Test SubCursor {@link SubCursor#SubCursor(LinkedSubList, int)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When minus one.
   *   <li>Then return next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SubCursor#SubCursor(LinkedSubList, int)}
   */
  @Test
  @DisplayName(
      "Test SubCursor new SubCursor(LinkedSubList, int); given 'Value'; when minus one; then return next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SubCursor.<init>(LinkedSubList, int)"})
  void testSubCursorNewSubCursor_givenValue_whenMinusOne_thenReturnNextIsValue() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    parent.add("Value");
    LinkedSubList<Object> sub = new LinkedSubList<>(parent, 1, 1);

    // Act
    SubCursor<Object> actualSubCursor = new SubCursor<>(sub, -1);

    // Assert
    assertEquals("Value", actualSubCursor.next());
    assertFalse(actualSubCursor.hasNext());
    assertTrue(sub.isEmpty());
  }

  /**
   * Test {@link CursorableLinkedList#updateNode(Node, Object)}.
   *
   * <ul>
   *   <li>When {@link Node#Node()}.
   *   <li>Then {@link Node#Node()} Value is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CursorableLinkedList#updateNode(Node, Object)}
   */
  @Test
  @DisplayName("Test updateNode(Node, Object); when Node(); then Node() Value is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CursorableLinkedList.updateNode(Node, Object)"})
  void testUpdateNode_whenNode_thenNodeValueIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.updateNode(node, "Value");

    // Assert
    assertEquals("Value", node.getValue());
  }
}
