package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.Node;
import org.apache.commons.collections4.list.TransformedList.TransformedListIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedListDiffblueTest {
  /**
   * Test TransformedListIterator {@link TransformedListIterator#add(Object)} with {@code object}.
   * <p>
   * Method under test: {@link TransformedListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test TransformedListIterator add(Object) with 'object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedListIterator.add(Object)"})
  void testTransformedListIteratorAddWithObject() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());

    // Act
    (mock(TransformedList.class).new TransformedListIterator(new LinkedListIterator(parent, 1))).add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isNull());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test TransformedListIterator {@link TransformedListIterator#add(Object)} with {@code object}.
   * <p>
   * Method under test: {@link TransformedListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test TransformedListIterator add(Object) with 'object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedListIterator.add(Object)"})
  void testTransformedListIteratorAddWithObject2() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());

    // Act
    (mock(TransformedList.class).new TransformedListIterator(
        mock(PredicatedList.class).new PredicatedListIterator(new LinkedListIterator(parent, 1)))).add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isNull());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test TransformedListIterator {@link TransformedListIterator#add(Object)} with {@code object}.
   * <p>
   * Method under test: {@link TransformedListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test TransformedListIterator add(Object) with 'object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedListIterator.add(Object)"})
  void testTransformedListIteratorAddWithObject3() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());

    // Act
    (mock(TransformedList.class).new TransformedListIterator(mock(PredicatedList.class).new PredicatedListIterator(
        mock(PredicatedList.class).new PredicatedListIterator(new LinkedListIterator(parent, 1))))).add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isNull());
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test TransformedListIterator {@link TransformedListIterator#TransformedListIterator(TransformedList, ListIterator)}.
   * <ul>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedListIterator#TransformedListIterator(TransformedList, ListIterator)}
   */
  @Test
  @DisplayName("Test TransformedListIterator new TransformedListIterator(TransformedList, ListIterator); then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedListIterator.<init>(TransformedList, ListIterator)"})
  void testTransformedListIteratorNewTransformedListIterator_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse((mock(TransformedList.class).new TransformedListIterator(IteratorUtils.EMPTY_LIST_ITERATOR)).hasNext());
  }

  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformedList(List, Transformer); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  void testTransformedList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedList<Object> actualTransformedListResult = TransformedList.transformedList(list, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, list.size());
    assertEquals("Apply", list.get(0));
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformedList(List, Transformer); given '42'; when ArrayList() add '42'; then ArrayList() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  void testTransformedList_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedList.transformedList(list, transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, list.size());
    assertEquals("Apply", list.get(0));
    assertEquals("Apply", list.get(1));
  }

  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformedList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  void testTransformedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualTransformedListResult = TransformedList.transformedList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformingList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  void testTransformingList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    TransformedList<Object> actualTransformingListResult = TransformedList.transformingList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformingList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  void testTransformingList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    TransformedList<Object> actualTransformingListResult = TransformedList.transformingList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformingList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  void testTransformingList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualTransformingListResult = TransformedList.transformingList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  void testNewTransformedList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new TransformedList<>(list, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  void testNewTransformedList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new TransformedList<>(list, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test new TransformedList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  void testNewTransformedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new TransformedList<>(list, mock(Transformer.class)));
  }
}
