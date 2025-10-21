package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedList.Node;
import org.apache.commons.collections4.list.CursorableLinkedList.Cursor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CursorableLinkedListDiffblueTest {
  /**
   * Test Cursor {@link Cursor#add(Object)}.
   * <ul>
   *   <li>Then {@link Cursor#Cursor(CursorableLinkedList, int)} with parent is {@link CursorableLinkedList#CursorableLinkedList()} and index is one next is {@code Obj}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cursor#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Cursor.add(Object)"})
  public void testCursorAdd_thenCursorWithParentIsCursorableLinkedListAndIndexIsOneNextIsObj() {
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
   * <ul>
   *   <li>Given {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  public void testCursorNewCursor_givenValue_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>Given {@code Value}.</li>
   *   <li>When {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  public void testCursorNewCursor_givenValue_whenCursorableLinkedListAddValue() {
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
   * <ul>
   *   <li>Given {@code Value}.</li>
   *   <li>When zero.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  public void testCursorNewCursor_givenValue_whenZero_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cursor#Cursor(CursorableLinkedList, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Cursor.<init>(CursorableLinkedList, int)"})
  public void testCursorNewCursor_whenZero_thenReturnNotHasNext() {
    // Arrange and Act
    Cursor<Object> actualCursor = new Cursor<>(new CursorableLinkedList<>(), 0);

    // Assert
    assertFalse(actualCursor.hasNext());
  }

  /**
   * Test Cursor {@link Cursor#nextIndex()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Cursor#nextIndex()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int Cursor.nextIndex()"})
  public void testCursorNextIndex_givenCursorableLinkedListAddValue_thenReturnOne() {
    // Arrange
    CursorableLinkedList<Object> parent = new CursorableLinkedList<>();
    parent.add("Value");
    Cursor<Object> cursor = new Cursor<>(parent, 1);

    // Act and Assert
    assertEquals(1, cursor.nextIndex());
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList()}.
   * <p>
   * Method under test: {@link CursorableLinkedList#CursorableLinkedList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.<init>()"})
  public void testNewCursorableLinkedList() {
    // Arrange and Act
    CursorableLinkedList<Object> actualObjectList = new CursorableLinkedList<>();

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.<init>(Collection)"})
  public void testNewCursorableLinkedList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new CursorableLinkedList<>(coll));
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.<init>(Collection)"})
  public void testNewCursorableLinkedList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertEquals(coll, new CursorableLinkedList<>(coll));
  }

  /**
   * Test {@link CursorableLinkedList#CursorableLinkedList(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#CursorableLinkedList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.<init>(Collection)"})
  public void testNewCursorableLinkedList_whenArrayList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertEquals(coll, new CursorableLinkedList<>(coll));
  }

  /**
   * Test {@link CursorableLinkedList#addNode(Node, Node)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} NextNode Value is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#addNode(Node, Node)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.addNode(Node, Node)"})
  public void testAddNode_whenNode_thenNodeNextNodeValueIsNull() {
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
   * Test {@link CursorableLinkedList#cursor(int)} with {@code int}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor(int)"})
  public void testCursorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor(int)"})
  public void testCursorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When zero.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#cursor(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor(int)"})
  public void testCursorWithInt_givenCursorableLinkedList_whenZero_thenReturnNotHasNext() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.cursor(0).hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor()"})
  public void testCursor_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act and Assert
    assertFalse(objectList.cursor().hasNext());
  }

  /**
   * Test {@link CursorableLinkedList#cursor()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor()"})
  public void testCursor_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#cursor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Cursor CursorableLinkedList.cursor()"})
  public void testCursor_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CursorableLinkedList.iterator()"})
  public void testIterator_givenCursorableLinkedList() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CursorableLinkedList.iterator()"})
  public void testIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CursorableLinkedList.iterator()"})
  public void testIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   *   <li>When zero.</li>
   *   <li>Then return {@link Cursor}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#listIterator(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator(int)"})
  public void testListIteratorWithInt_givenCursorableLinkedList_whenZero_thenReturnCursor() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator()"})
  public void testListIterator_givenCursorableLinkedList() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator()"})
  public void testListIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   *   <li>Then return next is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#listIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator CursorableLinkedList.listIterator()"})
  public void testListIterator_givenCursorableLinkedListAddValue_thenReturnNextIsValue2() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenCursorableLinkedList() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();

    // Act
    objectList.removeAllNodes();

    // Assert that nothing has changed
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link CursorableLinkedList#removeAllNodes()}.
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenCursorableLinkedListAddValue() {
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
   * <ul>
   *   <li>Given {@link CursorableLinkedList#CursorableLinkedList()} add {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#removeAllNodes()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.removeAllNodes()"})
  public void testRemoveAllNodes_givenCursorableLinkedListAddValue2() {
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
   * Test {@link CursorableLinkedList#updateNode(Node, Object)}.
   * <ul>
   *   <li>When {@link Node#Node()}.</li>
   *   <li>Then {@link Node#Node()} Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CursorableLinkedList#updateNode(Node, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CursorableLinkedList.updateNode(Node, Object)"})
  public void testUpdateNode_whenNode_thenNodeValueIsValue() {
    // Arrange
    CursorableLinkedList<Object> objectList = new CursorableLinkedList<>();
    Node<Object> node = new Node<>();

    // Act
    objectList.updateNode(node, "Value");

    // Assert
    assertEquals("Value", node.getValue());
  }
}
