package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
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
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.LinkedListIterator;
import org.apache.commons.collections4.list.AbstractLinkedListJava21.Node;
import org.apache.commons.collections4.list.PredicatedList.PredicatedListIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedListDiffblueTest {
  /**
   * Test PredicatedListIterator {@link PredicatedListIterator#add(Object)} with {@code object}.
   * <ul>
   *   <li>Then calls {@link AbstractLinkedListJava21#addNodeBefore(Node, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test PredicatedListIterator add(Object) with 'object'; then calls addNodeBefore(Node, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedListIterator.add(Object)"})
  void testPredicatedListIteratorAddWithObject_thenCallsAddNodeBefore() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());

    // Act
    (mock(PredicatedList.class).new PredicatedListIterator(new LinkedListIterator(parent, 1))).add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test PredicatedListIterator {@link PredicatedListIterator#add(Object)} with {@code object}.
   * <ul>
   *   <li>Then calls {@link AbstractLinkedListJava21#addNodeBefore(Node, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedListIterator#add(Object)}
   */
  @Test
  @DisplayName("Test PredicatedListIterator add(Object) with 'object'; then calls addNodeBefore(Node, Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedListIterator.add(Object)"})
  void testPredicatedListIteratorAddWithObject_thenCallsAddNodeBefore2() throws IndexOutOfBoundsException {
    // Arrange
    AbstractLinkedListJava21 parent = mock(AbstractLinkedListJava21.class);
    when(parent.getNode(anyInt(), anyBoolean())).thenReturn(new Node());
    doNothing().when(parent).addNodeBefore(Mockito.<Node<Object>>any(), Mockito.<Object>any());

    // Act
    (mock(PredicatedList.class).new PredicatedListIterator(
        mock(PredicatedList.class).new PredicatedListIterator(new LinkedListIterator(parent, 1)))).add("Object");

    // Assert
    verify(parent).addNodeBefore(isA(Node.class), isA(Object.class));
    verify(parent).getNode(eq(1), eq(true));
  }

  /**
   * Test PredicatedListIterator {@link PredicatedListIterator#PredicatedListIterator(PredicatedList, ListIterator)}.
   * <ul>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedListIterator#PredicatedListIterator(PredicatedList, ListIterator)}
   */
  @Test
  @DisplayName("Test PredicatedListIterator new PredicatedListIterator(PredicatedList, ListIterator); then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedListIterator.<init>(PredicatedList, ListIterator)"})
  void testPredicatedListIteratorNewPredicatedListIterator_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse((mock(PredicatedList.class).new PredicatedListIterator(IteratorUtils.EMPTY_LIST_ITERATOR)).hasNext());
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualPredicatedListResult = PredicatedList.predicatedList(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualPredicatedListResult = PredicatedList.predicatedList(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedList(List, Predicate); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  void testPredicatedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    PredicatedList<Object> actualPredicatedListResult = PredicatedList.predicatedList(list, mock(Predicate.class));

    // Assert
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedList(List, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @DisplayName("Test new PredicatedList(List, Predicate); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  void testNewPredicatedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new PredicatedList<>(list, mock(Predicate.class)));
  }
}
