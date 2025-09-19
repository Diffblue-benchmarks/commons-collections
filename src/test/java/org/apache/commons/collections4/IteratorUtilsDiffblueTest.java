package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator;
import org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.EnumerationIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.FilterListIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import org.apache.commons.collections4.iterators.ObjectArrayListIterator;
import org.apache.commons.collections4.iterators.ObjectGraphIterator;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.apache.commons.collections4.iterators.SingletonIterator;
import org.apache.commons.collections4.iterators.SingletonListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.TransformIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class IteratorUtilsDiffblueTest {
  /**
   * Test {@link IteratorUtils#arrayIterator(Object[], int, int)} with {@code Object[]}, {@code
   * int}, {@code int}.
   *
   * <ul>
   *   <li>Then return {@link ObjectArrayIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#arrayIterator(Object[], int, int)}
   */
  @Test
  @DisplayName(
      "Test arrayIterator(Object[], int, int) with 'Object[]', 'int', 'int'; then return ObjectArrayIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.arrayIterator(Object[], int, int)"})
  void testArrayIteratorWithObjectIntInt_thenReturnObjectArrayIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualArrayIteratorResult =
        IteratorUtils.arrayIterator(new Object[] {"Array"}, 1, 1);

    // Assert
    assertTrue(actualArrayIteratorResult instanceof ObjectArrayIterator);
    assertFalse(actualArrayIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#arrayIterator(Object[], int)} with {@code Object[]}, {@code int}.
   *
   * <ul>
   *   <li>Then return {@link ObjectArrayIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#arrayIterator(Object[], int)}
   */
  @Test
  @DisplayName(
      "Test arrayIterator(Object[], int) with 'Object[]', 'int'; then return ObjectArrayIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.arrayIterator(Object[], int)"})
  void testArrayIteratorWithObjectInt_thenReturnObjectArrayIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualArrayIteratorResult =
        IteratorUtils.arrayIterator(new Object[] {"Array"}, 1);

    // Assert
    assertTrue(actualArrayIteratorResult instanceof ObjectArrayIterator);
    assertFalse(actualArrayIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#arrayListIterator(Object[], int, int)} with {@code Object[]}, {@code
   * int}, {@code int}.
   *
   * <ul>
   *   <li>Then return {@link ObjectArrayListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#arrayListIterator(Object[], int, int)}
   */
  @Test
  @DisplayName(
      "Test arrayListIterator(Object[], int, int) with 'Object[]', 'int', 'int'; then return ObjectArrayListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.arrayListIterator(Object[], int, int)"})
  void testArrayListIteratorWithObjectIntInt_thenReturnObjectArrayListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualArrayListIteratorResult =
        IteratorUtils.arrayListIterator(new Object[] {"Array"}, 1, 1);

    // Assert
    assertTrue(actualArrayListIteratorResult instanceof ObjectArrayListIterator);
    assertFalse(actualArrayListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#arrayListIterator(Object[], int)} with {@code Object[]}, {@code int}.
   *
   * <ul>
   *   <li>Then return {@link ObjectArrayListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#arrayListIterator(Object[], int)}
   */
  @Test
  @DisplayName(
      "Test arrayListIterator(Object[], int) with 'Object[]', 'int'; then return ObjectArrayListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.arrayListIterator(Object[], int)"})
  void testArrayListIteratorWithObjectInt_thenReturnObjectArrayListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualArrayListIteratorResult =
        IteratorUtils.arrayListIterator(new Object[] {"Array"}, 1);

    // Assert
    assertTrue(actualArrayListIteratorResult instanceof ObjectArrayListIterator);
    assertFalse(actualArrayListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asEnumeration(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#asEnumeration(Iterator)}
   */
  @Test
  @DisplayName("Test asEnumeration(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Enumeration IteratorUtils.asEnumeration(Iterator)"})
  void testAsEnumeration() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Enumeration<Object> actualAsEnumerationResult =
        IteratorUtils.asEnumeration(objectList.iterator());

    // Assert
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator().hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterable(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#asIterable(Iterator)}
   */
  @Test
  @DisplayName("Test asIterable(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IteratorUtils.asIterable(Iterator)"})
  void testAsIterable() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterable<Object> actualAsIterableResult = IteratorUtils.asIterable(objectList.iterator());
    Iterator<Object> actualIteratorResult = actualAsIterableResult.iterator();

    // Assert
    assertTrue(actualAsIterableResult instanceof IteratorIterable);
    Iterator<Object> iteratorResult = actualAsIterableResult.iterator();
    assertFalse(iteratorResult.hasNext());
    assertSame(iteratorResult, actualIteratorResult);
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration, Collection)} with {@code enumeration}, {@code
   * removeCollection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  @DisplayName(
      "Test asIterator(Enumeration, Collection) with 'enumeration', 'removeCollection'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration, Collection)"})
  void testAsIteratorWithEnumerationRemoveCollection_given42_whenArrayListAdd42() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    ArrayList<Object> removeCollection = new ArrayList<>();
    removeCollection.add("42");

    // Act
    Iterator<Object> actualAsIteratorResult =
        IteratorUtils.asIterator(enumeration, removeCollection);

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration, Collection)} with {@code enumeration}, {@code
   * removeCollection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  @DisplayName(
      "Test asIterator(Enumeration, Collection) with 'enumeration', 'removeCollection'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration, Collection)"})
  void testAsIteratorWithEnumerationRemoveCollection_given42_whenArrayListAdd422() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    ArrayList<Object> removeCollection = new ArrayList<>();
    removeCollection.add("42");
    removeCollection.add("42");

    // Act
    Iterator<Object> actualAsIteratorResult =
        IteratorUtils.asIterator(enumeration, removeCollection);

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration, Collection)} with {@code enumeration}, {@code
   * removeCollection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  @DisplayName(
      "Test asIterator(Enumeration, Collection) with 'enumeration', 'removeCollection'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration, Collection)"})
  void testAsIteratorWithEnumerationRemoveCollection_whenArrayList() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    Iterator<Object> actualAsIteratorResult =
        IteratorUtils.asIterator(enumeration, new ArrayList<>());

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration)} with {@code enumeration}.
   *
   * <ul>
   *   <li>Then return {@link EnumerationIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#asIterator(Enumeration)}
   */
  @Test
  @DisplayName("Test asIterator(Enumeration) with 'enumeration'; then return EnumerationIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration)"})
  void testAsIteratorWithEnumeration_thenReturnEnumerationIterator() {
    // Arrange and Act
    Iterator<Object> actualAsIteratorResult = IteratorUtils.asIterator(new StringTokenizer("foo"));

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asMultipleUseIterable(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#asMultipleUseIterable(Iterator)}
   */
  @Test
  @DisplayName("Test asMultipleUseIterable(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable IteratorUtils.asMultipleUseIterable(Iterator)"})
  void testAsMultipleUseIterable() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterable<Object> actualAsMultipleUseIterableResult =
        IteratorUtils.asMultipleUseIterable(objectList.iterator());
    Iterator<Object> actualIteratorResult = actualAsMultipleUseIterableResult.iterator();

    // Assert
    assertTrue(actualAsMultipleUseIterableResult instanceof IteratorIterable);
    Iterator<Object> iteratorResult = actualAsMultipleUseIterableResult.iterator();
    assertFalse(iteratorResult.hasNext());
    assertSame(iteratorResult, actualIteratorResult);
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long)} with {@code iterator}, {@code max}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#boundedIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test boundedIterator(Iterator, long) with 'iterator', 'max'; when one; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long)"})
  void testBoundedIteratorWithIteratorMax_whenOne_thenReturnNotHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L);

    // Assert
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long, long)} with {@code iterator}, {@code
   * offset}, {@code max}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName(
      "Test boundedIterator(Iterator, long, long) with 'iterator', 'offset', 'max'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long, long)"})
  void testBoundedIteratorWithIteratorOffsetMax_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult =
        IteratorUtils.boundedIterator(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long, long)} with {@code iterator}, {@code
   * offset}, {@code max}.
   *
   * <ul>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName(
      "Test boundedIterator(Iterator, long, long) with 'iterator', 'offset', 'max'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long, long)"})
  void testBoundedIteratorWithIteratorOffsetMax_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult =
        IteratorUtils.boundedIterator(iterator, 0L, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long, long)} with {@code iterator}, {@code
   * offset}, {@code max}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  @DisplayName(
      "Test boundedIterator(Iterator, long, long) with 'iterator', 'offset', 'max'; when one; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long, long)"})
  void testBoundedIteratorWithIteratorOffsetMax_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult =
        IteratorUtils.boundedIterator(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#chainedIterator(Collection)}
   */
  @Test
  @DisplayName("Test chainedIterator(Collection) with 'Collection'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Collection)"})
  void testChainedIteratorWithCollection_whenArrayList() {
    // Arrange and Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(new ArrayList<>());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#chainedIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test chainedIterator(Collection) with 'Collection'; when ArrayList() add ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Collection)"})
  void testChainedIteratorWithCollection_whenArrayListAddArrayListIterator() {
    // Arrange
    ArrayList<Iterator<?>> iterators = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterators.add(objectList2.iterator());

    // Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(iterators);

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Iterator)} with {@code Iterator}.
   *
   * <p>Method under test: {@link IteratorUtils#chainedIterator(Iterator)}
   */
  @Test
  @DisplayName("Test chainedIterator(Iterator) with 'Iterator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Iterator)"})
  void testChainedIteratorWithIterator() {
    // Arrange
    ArrayList<Iterator<?>> iteratorList = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult =
        IteratorUtils.chainedIterator(iteratorList.iterator());

    // Assert
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Iterator[])} with {@code Iterator[]}.
   *
   * <p>Method under test: {@link IteratorUtils#chainedIterator(Iterator[])}
   */
  @Test
  @DisplayName("Test chainedIterator(Iterator[]) with 'Iterator[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Iterator[])"})
  void testChainedIteratorWithIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult =
        IteratorUtils.chainedIterator(objectList.iterator());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Iterator, Iterator)} with {@code Iterator}, {@code
   * Iterator}.
   *
   * <p>Method under test: {@link IteratorUtils#chainedIterator(Iterator, Iterator)}
   */
  @Test
  @DisplayName("Test chainedIterator(Iterator, Iterator) with 'Iterator', 'Iterator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Iterator, Iterator)"})
  void testChainedIteratorWithIteratorIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator1 = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult =
        IteratorUtils.chainedIterator(iterator1, objectList2.iterator());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Collection)} with {@code Comparator},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Collection)}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Collection) with 'Comparator', 'Collection'; given ArrayList() iterator; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Collection)"})
  void testCollatedIteratorWithComparatorCollection_givenArrayListIterator_whenNull() {
    // Arrange
    LinkedHashSet<Iterator<?>> iterators = new LinkedHashSet<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    // Act
    Iterator<Object> actualCollatedIteratorResult = IteratorUtils.collatedIterator(null, iterators);

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Collection)} with {@code Comparator},
   * {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Collection)}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Collection) with 'Comparator', 'Collection'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Collection)"})
  void testCollatedIteratorWithComparatorCollection_whenArrayList() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);

    // Act
    Iterator<Object> actualCollatedIteratorResult =
        IteratorUtils.collatedIterator(comparator, new ArrayList<>());

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Collection)} with {@code Comparator},
   * {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Collection)}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Collection) with 'Comparator', 'Collection'; when ArrayList() add ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Collection)"})
  void testCollatedIteratorWithComparatorCollection_whenArrayListAddArrayListIterator() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);

    ArrayList<Iterator<?>> iterators = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterators.add(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterators.add(objectList2.iterator());

    // Act
    Iterator<Object> actualCollatedIteratorResult =
        IteratorUtils.collatedIterator(comparator, iterators);

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Iterator, Iterator)} with {@code
   * Comparator}, {@code Iterator}, {@code Iterator}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Iterator, Iterator)}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Iterator, Iterator) with 'Comparator', 'Iterator', 'Iterator'; when Comparator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Iterator, Iterator)"})
  void testCollatedIteratorWithComparatorIteratorIterator_whenComparator() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator1 = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Iterator<Object> actualCollatedIteratorResult =
        IteratorUtils.collatedIterator(comparator, iterator1, objectList2.iterator());

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Iterator, Iterator)} with {@code
   * Comparator}, {@code Iterator}, {@code Iterator}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Iterator, Iterator)}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Iterator, Iterator) with 'Comparator', 'Iterator', 'Iterator'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Iterator, Iterator)"})
  void testCollatedIteratorWithComparatorIteratorIterator_whenNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator1 = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Iterator<Object> actualCollatedIteratorResult =
        IteratorUtils.collatedIterator(null, iterator1, objectList2.iterator());

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Iterator[])} with {@code Comparator},
   * {@code Iterator[]}.
   *
   * <ul>
   *   <li>Then return {@link CollatingIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Iterator[])}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Iterator[]) with 'Comparator', 'Iterator[]'; then return CollatingIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Iterator[])"})
  void testCollatedIteratorWithComparatorIterator_thenReturnCollatingIterator() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCollatedIteratorResult =
        IteratorUtils.collatedIterator(comparator, objectList.iterator());

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#collatedIterator(Comparator, Iterator[])} with {@code Comparator},
   * {@code Iterator[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link CollatingIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#collatedIterator(Comparator, Iterator[])}
   */
  @Test
  @DisplayName(
      "Test collatedIterator(Comparator, Iterator[]) with 'Comparator', 'Iterator[]'; when 'null'; then return CollatingIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.collatedIterator(Comparator, Iterator[])"})
  void testCollatedIteratorWithComparatorIterator_whenNull_thenReturnCollatingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualCollatedIteratorResult =
        IteratorUtils.collatedIterator(null, objectList.iterator());

    // Assert
    assertTrue(actualCollatedIteratorResult instanceof CollatingIterator);
    assertFalse(actualCollatedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterator, Object); given '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_given42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, "42");

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); given '42'; when ArrayList() add '42'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_given42_whenArrayListAdd42_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code Object}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); given '42'; when 'Object'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_given42_whenObject_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, "Object");

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link
   *       CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); given INDEX_NOT_FOUND; when Comparator compare(Object, Object) return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_givenIndex_not_found_whenComparatorCompareReturnIndex_not_found() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>(comp);
    iterator3.addIterator(iterator2);
    iterator3.addIterator(iterator);

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator3, null);

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertFalse(iterator3.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); given 'null'; when ArrayList() add 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_givenNull_whenArrayListAddNull_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(null);
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); given one; when Comparator compare(Object, Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_givenOne_whenComparatorCompareReturnOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>(comp);
    iterator3.addIterator(iterator2);
    iterator3.addIterator(iterator);

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator3, null);

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertFalse(iterator3.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterator, Object); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterator, Object); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_thenNotCollatingIteratorHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();
    iterator2.addIterator(iterator);

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator2, null);

    // Assert
    assertFalse(iterator2.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterator, Object); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_thenNotCollatingIteratorHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator2.addIterator(objectList2.iterator());
    iterator2.addIterator(iterator);

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator2, null);

    // Assert
    assertFalse(iterator2.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>Then not {@link IteratorChain#IteratorChain(Iterator[])} with iteratorQueue is {@link
   *       ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); then not IteratorChain(Iterator[]) with iteratorQueue is ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_thenNotIteratorChainWithIteratorQueueIsArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iterator = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); when CollatingIterator(); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_whenCollatingIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_whenIteratorChainAddIteratorArrayListIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iterator2 = new IteratorChain<>();
    iterator2.addIterator(iterator);

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator2, null);

    // Assert
    assertFalse(iterator2.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.
   *   <li>Then not {@link IteratorChain#IteratorChain()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); when IteratorChain(); then not IteratorChain() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_whenIteratorChain_thenNotIteratorChainHasNext() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName("Test contains(Iterator, Object); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(IteratorUtils.contains(null, null));
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Iterator, Object); when 'Object'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  void testContains_whenObject_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, "Object");

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#emptyIterator()}.
   *
   * <p>Method under test: {@link IteratorUtils#emptyIterator()}
   */
  @Test
  @DisplayName("Test emptyIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.emptyIterator()"})
  void testEmptyIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualEmptyIteratorResult = IteratorUtils.emptyIterator();

    // Assert
    assertTrue(actualEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyListIterator()}.
   *
   * <p>Method under test: {@link IteratorUtils#emptyListIterator()}
   */
  @Test
  @DisplayName("Test emptyListIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.emptyListIterator()"})
  void testEmptyListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualEmptyListIteratorResult =
        IteratorUtils.emptyListIterator();

    // Assert
    assertTrue(actualEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualEmptyListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyMapIterator()}.
   *
   * <p>Method under test: {@link IteratorUtils#emptyMapIterator()}
   */
  @Test
  @DisplayName("Test emptyMapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator IteratorUtils.emptyMapIterator()"})
  void testEmptyMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualEmptyMapIteratorResult = IteratorUtils.emptyMapIterator();

    // Assert
    assertTrue(actualEmptyMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualEmptyMapIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyOrderedIterator()}.
   *
   * <p>Method under test: {@link IteratorUtils#emptyOrderedIterator()}
   */
  @Test
  @DisplayName("Test emptyOrderedIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedIterator IteratorUtils.emptyOrderedIterator()"})
  void testEmptyOrderedIterator() {
    // Arrange and Act
    OrderedIterator<Object> actualEmptyOrderedIteratorResult = IteratorUtils.emptyOrderedIterator();

    // Assert
    assertTrue(actualEmptyOrderedIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualEmptyOrderedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyOrderedMapIterator()}.
   *
   * <p>Method under test: {@link IteratorUtils#emptyOrderedMapIterator()}
   */
  @Test
  @DisplayName("Test emptyOrderedMapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OrderedMapIterator IteratorUtils.emptyOrderedMapIterator()"})
  void testEmptyOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualEmptyOrderedMapIteratorResult =
        IteratorUtils.emptyOrderedMapIterator();

    // Assert
    assertTrue(actualEmptyOrderedMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualEmptyOrderedMapIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#filteredIterator(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link FilterIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#filteredIterator(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test filteredIterator(Iterator, Predicate); when Predicate; then return FilterIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.filteredIterator(Iterator, Predicate)"})
  void testFilteredIterator_whenPredicate_thenReturnFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualFilteredIteratorResult =
        IteratorUtils.filteredIterator(objectList.iterator(), mock(Predicate.class));

    // Assert
    assertTrue(actualFilteredIteratorResult instanceof FilterIterator);
    assertFalse(actualFilteredIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#filteredListIterator(ListIterator, Predicate)}.
   *
   * <ul>
   *   <li>Then return {@link FilterListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#filteredListIterator(ListIterator, Predicate)}
   */
  @Test
  @DisplayName("Test filteredListIterator(ListIterator, Predicate); then return FilterListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator IteratorUtils.filteredListIterator(ListIterator, Predicate)"})
  void testFilteredListIterator_thenReturnFilterListIterator() {
    // Arrange and Act
    ListIterator<Object> actualFilteredListIteratorResult =
        IteratorUtils.filteredListIterator(
            new AbstractListIteratorDecorator<>(new FilterListIterator<>()), mock(Predicate.class));

    // Assert
    assertTrue(actualFilteredListIteratorResult instanceof FilterListIterator);
    assertFalse(actualFilteredListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterator, Predicate) with 'iterator', 'predicate'; given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  void testFindWithIteratorPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = IteratorUtils.find(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertNull(actualFindResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterator, Predicate) with 'iterator', 'predicate'; given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  void testFindWithIteratorPredicate_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.find(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterator, Predicate) with 'iterator', 'predicate'; given 'true'; when Predicate test(Object) return 'true'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  void testFindWithIteratorPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = IteratorUtils.find(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualFindResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterator, Predicate) with 'iterator', 'predicate'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  void testFindWithIteratorPredicate_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(IteratorUtils.find(null, mock(Predicate.class)));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterator, Predicate) with 'iterator', 'predicate'; when Predicate; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  void testFindWithIteratorPredicate_whenPredicate_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertNull(IteratorUtils.find(iterator, mock(Predicate.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#first(Iterator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#first(Iterator)}
   */
  @Test
  @DisplayName("Test first(Iterator); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.first(Iterator)"})
  void testFirst_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", IteratorUtils.first(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEach(Iterator, Closure)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Iterator, Closure); given '42'; when Closure accept(Object) does nothing; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  void testForEach_given42_whenClosureAcceptDoesNothing_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    IteratorUtils.forEach(iterator, closure);

    // Assert
    verify(closure).accept(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEach(Iterator, Closure)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Iterator, Closure); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  void testForEach_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Closure<Object> closure = mock(Closure.class);
    doThrow(new RuntimeException()).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.forEach(iterator, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#forEach(Iterator, Closure)}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEach(Iterator, Closure); when Closure; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  void testForEach_whenClosure_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    IteratorUtils.forEach(iterator, mock(Closure.class));

    // Assert that nothing has changed
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEach(Iterator, Closure)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @DisplayName("Test forEach(Iterator, Closure); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  void testForEach_whenNull_thenNull() {
    // Arrange and Act
    IteratorUtils.forEach(null, mock(Closure.class));

    // Assert that nothing has changed
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEachButLast(Iterator, Closure); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  void testForEachButLast_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", IteratorUtils.forEachButLast(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEachButLast(Iterator, Closure); given '42'; when Closure accept(Object) does nothing; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  void testForEachButLast_given42_whenClosureAcceptDoesNothing_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Object actualForEachButLastResult = IteratorUtils.forEachButLast(iterator, closure);

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals("42", actualForEachButLastResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forEachButLast(Iterator, Closure); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  void testForEachButLast_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Closure<Object> closure = mock(Closure.class);
    doThrow(new RuntimeException()).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.forEachButLast(iterator, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @DisplayName("Test forEachButLast(Iterator, Closure); when Closure; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  void testForEachButLast_whenClosure_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertNull(IteratorUtils.forEachButLast(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @DisplayName("Test forEachButLast(Iterator, Closure); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  void testForEachButLast_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(IteratorUtils.forEachButLast(null, mock(Closure.class)));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code
   * index}, {@code defaultSupplier}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test get(Iterator, int, IntFunction) with 'iterator', 'index', 'defaultSupplier'; given '42'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  void testGetWithIteratorIndexDefaultSupplier_given42_thenReturnApply() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IntFunction<Object> defaultSupplier = mock(IntFunction.class);
    when(defaultSupplier.apply(anyInt())).thenReturn("Apply");

    // Act
    Object actualGetResult = IteratorUtils.get(iterator, 1, defaultSupplier);

    // Assert
    verify(defaultSupplier).apply(0);
    assertEquals("Apply", actualGetResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code
   * index}, {@code defaultSupplier}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test get(Iterator, int, IntFunction) with 'iterator', 'index', 'defaultSupplier'; given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  void testGetWithIteratorIndexDefaultSupplier_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", IteratorUtils.get(iterator, 1, mock(IntFunction.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code
   * index}, {@code defaultSupplier}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test get(Iterator, int, IntFunction) with 'iterator', 'index', 'defaultSupplier'; given 'Apply'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  void testGetWithIteratorIndexDefaultSupplier_givenApply_thenReturnApply() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    IntFunction<Object> defaultSupplier = mock(IntFunction.class);
    when(defaultSupplier.apply(anyInt())).thenReturn("Apply");

    // Act
    Object actualGetResult = IteratorUtils.get(iterator, 1, defaultSupplier);

    // Assert
    verify(defaultSupplier).apply(1);
    assertEquals("Apply", actualGetResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code
   * index}, {@code defaultSupplier}.
   *
   * <ul>
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test get(Iterator, int, IntFunction) with 'iterator', 'index', 'defaultSupplier'; then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  void testGetWithIteratorIndexDefaultSupplier_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    IntFunction<Object> defaultSupplier = mock(IntFunction.class);
    when(defaultSupplier.apply(anyInt())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.get(iterator, 1, defaultSupplier));
    verify(defaultSupplier).apply(1);
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int)} with {@code iterator}, {@code index}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#get(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test get(Iterator, int) with 'iterator', 'index'; given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int)"})
  void testGetWithIteratorIndex_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", IteratorUtils.get(iterator, 1));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName("Test getIterator(Object); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(objectList);

    // Assert
    assertFalse(actualIterator.hasNext());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName("Test getIterator(Object); when HashMap(); then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenHashMap_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();

    // Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(objectObjectMap);

    // Assert
    assertFalse(actualIterator.hasNext());
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode()}.
   *   <li>Then return {@link NodeListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName("Test getIterator(Object); when IIOMetadataNode(); then return NodeListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenIIOMetadataNode_thenReturnNodeListIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new IIOMetadataNode());

    // Assert
    assertTrue(actualIterator instanceof NodeListIterator);
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link EmptyIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName("Test getIterator(Object); when 'null'; then return EmptyIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenNull_thenReturnEmptyIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(null);

    // Assert
    assertTrue(actualIterator instanceof EmptyIterator);
    assertNull(null);
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@code Obj}.
   *   <li>Then return {@link SingletonIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName("Test getIterator(Object); when 'Obj'; then return SingletonIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenObj_thenReturnSingletonIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator("Obj");

    // Assert
    assertTrue(actualIterator instanceof SingletonIterator);
    assertEquals("Obj", actualIterator.next());
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@link Scanner#Scanner(String)} with {@code iterator}.
   *   <li>Then return {@link Scanner}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName(
      "Test getIterator(Object); when Scanner(String) with 'iterator'; then return Scanner")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenScannerWithIterator_thenReturnScanner() {
    // Arrange
    Scanner scanner = new Scanner("iterator");

    // Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(scanner);

    // Assert
    assertTrue(actualIterator instanceof Scanner);
    assertEquals("iterator", actualIterator.next());
    assertFalse(actualIterator.hasNext());
    assertFalse(scanner.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   *
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code iterator}.
   *   <li>Then return {@link EnumerationIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @DisplayName(
      "Test getIterator(Object); when StringTokenizer(String) with 'iterator'; then return EnumerationIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  void testGetIterator_whenStringTokenizerWithIterator_thenReturnEnumerationIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new StringTokenizer("iterator"));

    // Assert
    assertTrue(actualIterator instanceof EnumerationIterator);
    assertEquals("iterator", actualIterator.next());
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterator, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  void testIndexOf_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    int actualIndexOfResult = IteratorUtils.indexOf(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(iterator.hasNext());
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterator, Predicate); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  void testIndexOf_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.indexOf(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterator, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  void testIndexOf_givenTrue_whenPredicateTestReturnTrue_thenReturnZero() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    int actualIndexOfResult = IteratorUtils.indexOf(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(0, actualIndexOfResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @DisplayName("Test indexOf(Iterator, Predicate); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  void testIndexOf_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertEquals(
        CollectionUtils.INDEX_NOT_FOUND, IteratorUtils.indexOf(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test indexOf(Iterator, Predicate); when Predicate; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  void testIndexOf_whenPredicate_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    int actualIndexOfResult = IteratorUtils.indexOf(iterator, mock(Predicate.class));

    // Assert
    assertFalse(iterator.hasNext());
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iterator = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(IteratorUtils.isEmpty(objectList.iterator()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); given ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_givenArrayList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    FilterIterator<Object> iterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    iterator.addTo(new ArrayList<>());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); given ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_givenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertFalse(IteratorUtils.isEmpty(iterator2));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterator); given ArrayList() add '42'; when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_givenArrayListAdd42_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iterator2 = new IteratorChain<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertFalse(IteratorUtils.isEmpty(iterator2));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Iterator); given ArrayList() iterator; when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_givenArrayListIterator_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); when ArrayList() iterator; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_whenArrayListIterator_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(objectList.iterator()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); when CollatingIterator() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_whenCollatingIteratorAddIteratorArrayListIterator() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); when CollatingIterator(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_whenCollatingIterator_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(new CollatingIterator<>()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); when IteratorChain(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_whenIteratorChain_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(new IteratorChain<>()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @DisplayName("Test isEmpty(Iterator); when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(null));
  }

  /**
   * Test {@link IteratorUtils#loopingIterator(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test loopingIterator(Collection); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.loopingIterator(Collection)"})
  void testLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    ResettableIterator<Object> actualLoopingIteratorResult =
        IteratorUtils.loopingIterator(collection);

    // Assert
    assertTrue(actualLoopingIteratorResult instanceof LoopingIterator);
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertTrue(actualLoopingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#loopingIterator(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  @DisplayName(
      "Test loopingIterator(Collection); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.loopingIterator(Collection)"})
  void testLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    ResettableIterator<Object> actualLoopingIteratorResult =
        IteratorUtils.loopingIterator(collection);

    // Assert
    assertTrue(actualLoopingIteratorResult instanceof LoopingIterator);
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertEquals("42", actualLoopingIteratorResult.next());
    assertTrue(actualLoopingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#loopingIterator(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  @DisplayName("Test loopingIterator(Collection); when ArrayList(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.loopingIterator(Collection)"})
  void testLoopingIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    ResettableIterator<Object> actualLoopingIteratorResult =
        IteratorUtils.loopingIterator(new ArrayList<>());

    // Assert
    assertTrue(actualLoopingIteratorResult instanceof LoopingIterator);
    assertFalse(actualLoopingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#loopingListIterator(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  @DisplayName(
      "Test loopingListIterator(List); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.loopingListIterator(List)"})
  void testLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ResettableListIterator<Object> actualLoopingListIteratorResult =
        IteratorUtils.loopingListIterator(list);

    // Assert
    assertTrue(actualLoopingListIteratorResult instanceof LoopingListIterator);
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertTrue(actualLoopingListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#loopingListIterator(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return next is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  @DisplayName(
      "Test loopingListIterator(List); given '42'; when ArrayList() add '42'; then return next is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.loopingListIterator(List)"})
  void testLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ResettableListIterator<Object> actualLoopingListIteratorResult =
        IteratorUtils.loopingListIterator(list);

    // Assert
    assertTrue(actualLoopingListIteratorResult instanceof LoopingListIterator);
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertEquals("42", actualLoopingListIteratorResult.next());
    assertTrue(actualLoopingListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#loopingListIterator(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  @DisplayName("Test loopingListIterator(List); when ArrayList(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.loopingListIterator(List)"})
  void testLoopingListIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    ResettableListIterator<Object> actualLoopingListIteratorResult =
        IteratorUtils.loopingListIterator(new ArrayList<>());

    // Assert
    assertTrue(actualLoopingListIteratorResult instanceof LoopingListIterator);
    assertFalse(actualLoopingListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterator, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  void testMatchesAll_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = IteratorUtils.matchesAll(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(iterator.hasNext());
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterator, Predicate); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  void testMatchesAll_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.matchesAll(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterator, Predicate); given 'true'; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  void testMatchesAll_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = IteratorUtils.matchesAll(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(iterator.hasNext());
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterator, Predicate); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  void testMatchesAll_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertTrue(IteratorUtils.matchesAll(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterator, Predicate); when Predicate; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  void testMatchesAll_whenPredicate_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualMatchesAllResult = IteratorUtils.matchesAll(iterator, mock(Predicate.class));

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterator, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  void testMatchesAny_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAnyResult = IteratorUtils.matchesAny(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(iterator.hasNext());
    assertFalse(actualMatchesAnyResult);
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterator, Predicate); given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  void testMatchesAny_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.matchesAny(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterator, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  void testMatchesAny_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAnyResult = IteratorUtils.matchesAny(iterator, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(iterator.hasNext());
    assertTrue(actualMatchesAnyResult);
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAny(Iterator, Predicate); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  void testMatchesAny_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(IteratorUtils.matchesAny(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAny(Iterator, Predicate); when Predicate; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  void testMatchesAny_whenPredicate_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualMatchesAnyResult = IteratorUtils.matchesAny(iterator, mock(Predicate.class));

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualMatchesAnyResult);
  }

  /**
   * Test {@link IteratorUtils#nodeListIterator(NodeList)} with {@code nodeList}.
   *
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#nodeListIterator(NodeList)}
   */
  @Test
  @DisplayName(
      "Test nodeListIterator(NodeList) with 'nodeList'; when IIOMetadataNode(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodeListIterator IteratorUtils.nodeListIterator(NodeList)"})
  void testNodeListIteratorWithNodeList_whenIIOMetadataNode_thenReturnNotHasNext() {
    // Arrange and Act
    NodeListIterator actualNodeListIteratorResult =
        IteratorUtils.nodeListIterator((NodeList) new IIOMetadataNode());

    // Assert
    assertFalse(actualNodeListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#nodeListIterator(Node)} with {@code node}.
   *
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode()}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#nodeListIterator(Node)}
   */
  @Test
  @DisplayName(
      "Test nodeListIterator(Node) with 'node'; when IIOMetadataNode(); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodeListIterator IteratorUtils.nodeListIterator(Node)"})
  void testNodeListIteratorWithNode_whenIIOMetadataNode_thenReturnNotHasNext() {
    // Arrange and Act
    NodeListIterator actualNodeListIteratorResult =
        IteratorUtils.nodeListIterator((Node) new IIOMetadataNode());

    // Assert
    assertFalse(actualNodeListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#objectGraphIterator(Object, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#objectGraphIterator(Object, Transformer)}
   */
  @Test
  @DisplayName("Test objectGraphIterator(Object, Transformer); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.objectGraphIterator(Object, Transformer)"})
  void testObjectGraphIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualObjectGraphIteratorResult =
        IteratorUtils.objectGraphIterator(objectList.iterator(), mock(Transformer.class));

    // Assert
    assertTrue(actualObjectGraphIteratorResult instanceof ObjectGraphIterator);
    assertFalse(actualObjectGraphIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#objectGraphIterator(Object, Transformer)}.
   *
   * <ul>
   *   <li>When {@code Root}.
   *   <li>Then return next is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#objectGraphIterator(Object, Transformer)}
   */
  @Test
  @DisplayName(
      "Test objectGraphIterator(Object, Transformer); when 'Root'; then return next is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.objectGraphIterator(Object, Transformer)"})
  void testObjectGraphIterator_whenRoot_thenReturnNextIsNull() {
    // Arrange and Act
    Iterator<Object> actualObjectGraphIteratorResult =
        IteratorUtils.objectGraphIterator("Root", mock(Transformer.class));

    // Assert
    assertTrue(actualObjectGraphIteratorResult instanceof ObjectGraphIterator);
    assertNull(actualObjectGraphIteratorResult.next());
    assertFalse(actualObjectGraphIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#peekingIterator(Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#peekingIterator(Iterator)}
   */
  @Test
  @DisplayName("Test peekingIterator(Iterator); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.peekingIterator(Iterator)"})
  void testPeekingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualPeekingIteratorResult =
        IteratorUtils.peekingIterator(objectList.iterator());

    // Assert
    assertTrue(actualPeekingIteratorResult instanceof PeekingIterator);
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#peekingIterator(Iterator)}.
   *
   * <ul>
   *   <li>When peekingIterator {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#peekingIterator(Iterator)}
   */
  @Test
  @DisplayName("Test peekingIterator(Iterator); when peekingIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.peekingIterator(Iterator)"})
  void testPeekingIterator_whenPeekingIteratorArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PeekingIterator<?> iterator = PeekingIterator.peekingIterator(objectList.iterator());

    // Act
    Iterator<Object> actualPeekingIteratorResult = IteratorUtils.peekingIterator(iterator);

    // Assert
    assertTrue(actualPeekingIteratorResult instanceof PeekingIterator);
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#pushbackIterator(Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#pushbackIterator(Iterator)}
   */
  @Test
  @DisplayName("Test pushbackIterator(Iterator); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.pushbackIterator(Iterator)"})
  void testPushbackIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualPushbackIteratorResult =
        IteratorUtils.pushbackIterator(objectList.iterator());

    // Assert
    assertTrue(actualPushbackIteratorResult instanceof PushbackIterator);
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#pushbackIterator(Iterator)}.
   *
   * <ul>
   *   <li>When pushbackIterator {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#pushbackIterator(Iterator)}
   */
  @Test
  @DisplayName("Test pushbackIterator(Iterator); when pushbackIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.pushbackIterator(Iterator)"})
  void testPushbackIterator_whenPushbackIteratorArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    PushbackIterator<?> iterator = PushbackIterator.pushbackIterator(objectList.iterator());

    // Act
    Iterator<Object> actualPushbackIteratorResult = IteratorUtils.pushbackIterator(iterator);

    // Assert
    assertTrue(actualPushbackIteratorResult instanceof PushbackIterator);
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#singletonIterator(Object)}.
   *
   * <p>Method under test: {@link IteratorUtils#singletonIterator(Object)}
   */
  @Test
  @DisplayName("Test singletonIterator(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResettableIterator IteratorUtils.singletonIterator(Object)"})
  void testSingletonIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualSingletonIteratorResult =
        IteratorUtils.singletonIterator("Object");

    // Assert
    assertTrue(actualSingletonIteratorResult instanceof SingletonIterator);
    assertEquals("Object", actualSingletonIteratorResult.next());
    assertFalse(actualSingletonIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#singletonListIterator(Object)}.
   *
   * <p>Method under test: {@link IteratorUtils#singletonListIterator(Object)}
   */
  @Test
  @DisplayName("Test singletonListIterator(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator IteratorUtils.singletonListIterator(Object)"})
  void testSingletonListIterator() {
    // Arrange and Act
    ListIterator<Object> actualSingletonListIteratorResult =
        IteratorUtils.singletonListIterator("Object");

    // Assert
    assertTrue(actualSingletonListIteratorResult instanceof SingletonListIterator);
    assertEquals("Object", actualSingletonListIteratorResult.next());
    assertFalse(actualSingletonListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName("Test size(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); given '42'; when ArrayList() add '42'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_given42_whenArrayListAdd42_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(1, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link
   *       CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); given INDEX_NOT_FOUND; when Comparator compare(Object, Object) return INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_givenIndex_not_found_whenComparatorCompareReturnIndex_not_found() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>(comp);
    iterator3.addIterator(iterator2);
    iterator3.addIterator(iterator);

    // Act
    int actualSizeResult = IteratorUtils.size(iterator3);

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualSizeResult);
    assertFalse(iterator3.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); given one; when Comparator compare(Object, Object) return one; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_givenOne_whenComparatorCompareReturnOne_thenReturnTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>(comp);
    iterator3.addIterator(iterator2);
    iterator3.addIterator(iterator);

    // Act
    int actualSizeResult = IteratorUtils.size(iterator3);

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualSizeResult);
    assertFalse(iterator3.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName("Test size(Iterator); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>Then not {@link IteratorChain#IteratorChain(Iterator[])} with iteratorQueue is {@link
   *       ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); then not IteratorChain(Iterator[]) with iteratorQueue is ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_thenNotIteratorChainWithIteratorQueueIsArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iterator = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); when ArrayList() iterator; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenArrayListIterator_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); when CollatingIterator() addIterator ArrayList() iterator; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenCollatingIteratorAddIteratorArrayListIterator_thenReturnOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals(1, IteratorUtils.size(iterator2));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); when CollatingIterator() addIterator ArrayList() iterator; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenCollatingIteratorAddIteratorArrayListIterator_thenReturnOne2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator2.addIterator(objectList2.iterator());
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals(1, IteratorUtils.size(iterator2));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName(
      "Test size(Iterator); when CollatingIterator(); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenCollatingIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName("Test size(Iterator); when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName("Test size(Iterator); when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenIteratorChainAddIteratorArrayListIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iterator2 = new IteratorChain<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals(1, IteratorUtils.size(iterator2));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.
   *   <li>Then not {@link IteratorChain#IteratorChain()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName("Test size(Iterator); when IteratorChain(); then not IteratorChain() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenIteratorChain_thenNotIteratorChainHasNext() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @DisplayName("Test size(Iterator); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  void testSize_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertEquals(0, IteratorUtils.size(null));
  }

  /**
   * Test {@link IteratorUtils#skippingIterator(Iterator, long)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test skippingIterator(Iterator, long); given '42'; when ArrayList() add '42'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SkippingIterator IteratorUtils.skippingIterator(Iterator, long)"})
  void testSkippingIterator_given42_whenArrayListAdd42_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIteratorResult =
        IteratorUtils.skippingIterator(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#skippingIterator(Iterator, long)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test skippingIterator(Iterator, long); when one; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SkippingIterator IteratorUtils.skippingIterator(Iterator, long)"})
  void testSkippingIterator_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIteratorResult =
        IteratorUtils.skippingIterator(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#skippingIterator(Iterator, long)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  @DisplayName(
      "Test skippingIterator(Iterator, long); when zero; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SkippingIterator IteratorUtils.skippingIterator(Iterator, long)"})
  void testSkippingIterator_whenZero_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIteratorResult =
        IteratorUtils.skippingIterator(iterator, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @DisplayName(
      "Test stream(Iterable) with 'iterable'; given RuntimeException(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  void testStreamWithIterable_givenRuntimeException_thenThrowRuntimeException() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.spliterator()).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.stream(iterable));
    verify(iterable).spliterator();
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @DisplayName(
      "Test stream(Iterable) with 'iterable'; when ArrayList(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  void testStreamWithIterable_whenArrayList_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(new ArrayList<>());

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @DisplayName(
      "Test stream(Iterable) with 'iterable'; when empty; then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  void testStreamWithIterable_whenEmpty_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(iterable);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()} append {@code
   *       Elements}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @DisplayName(
      "Test stream(Iterable) with 'iterable'; when FluentIterable with iterable is ArrayList() append 'Elements'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  void testStreamWithIterable_whenFluentIterableWithIterableIsArrayListAppendElements() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    iterable.append("Elements");

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(iterable);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @DisplayName(
      "Test stream(Iterable) with 'iterable'; when 'null'; then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  void testStreamWithIterable_whenNull_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream((Iterable<Object>) null);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterator)}
   */
  @Test
  @DisplayName("Test stream(Iterator) with 'iterator'; when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterator)"})
  void testStreamWithIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(objectList.iterator());

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#stream(Iterator)}
   */
  @Test
  @DisplayName("Test stream(Iterator) with 'iterator'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterator)"})
  void testStreamWithIterator_whenNull() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream((Iterator<Object>) null);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#toArray(Iterator, Class)} with {@code iterator}, {@code arrayClass}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return first element is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toArray(Iterator, Class)}
   */
  @Test
  @DisplayName(
      "Test toArray(Iterator, Class) with 'iterator', 'arrayClass'; given '42'; then return first element is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator, Class)"})
  void testToArrayWithIteratorArrayClass_given42_thenReturnFirstElementIs42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Class<Object> arrayClass = Object.class;

    // Act
    Object[] actualToArrayResult = IteratorUtils.toArray(iterator, arrayClass);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toArray(Iterator, Class)} with {@code iterator}, {@code arrayClass}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toArray(Iterator, Class)}
   */
  @Test
  @DisplayName(
      "Test toArray(Iterator, Class) with 'iterator', 'arrayClass'; when 'java.lang.Object'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator, Class)"})
  void testToArrayWithIteratorArrayClass_whenJavaLangObject_thenReturnArrayLengthIsZero() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, IteratorUtils.toArray(iterator, arrayClass).length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toArray(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return first element is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toArray(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toArray(Iterator) with 'iterator'; given '42'; when ArrayList() add '42'; then return first element is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator)"})
  void testToArrayWithIterator_given42_whenArrayListAdd42_thenReturnFirstElementIs42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Object[] actualToArrayResult = IteratorUtils.toArray(iterator);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toArray(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toArray(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toArray(Iterator) with 'iterator'; when ArrayList() iterator; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator)"})
  void testToArrayWithIterator_whenArrayListIterator_thenReturnArrayLengthIsZero() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(0, IteratorUtils.toArray(iterator).length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test toList(Iterator, int) with 'iterator', 'estimatedSize'; given '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator, int)"})
  void testToListWithIteratorEstimatedSize_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    List<Object> actualToListResult = IteratorUtils.toList(iterator, 3);

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("42", actualToListResult.get(0));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test toList(Iterator, int) with 'iterator', 'estimatedSize'; when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator, int)"})
  void testToListWithIteratorEstimatedSize_whenThree_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    List<Object> actualToListResult = IteratorUtils.toList(iterator, 3);

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test toList(Iterator, int) with 'iterator', 'estimatedSize'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator, int)"})
  void testToListWithIteratorEstimatedSize_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IteratorUtils.toList(objectList.iterator(), 0));
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toList(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toList(Iterator) with 'iterator'; given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator)"})
  void testToListWithIterator_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    List<Object> actualToListResult = IteratorUtils.toList(iterator);

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("42", actualToListResult.get(0));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toList(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toList(Iterator) with 'iterator'; when ArrayList() iterator; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator)"})
  void testToListWithIterator_whenArrayListIterator_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    List<Object> actualToListResult = IteratorUtils.toList(iterator);

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Test {@link IteratorUtils#toListIterator(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#toListIterator(Iterator)}
   */
  @Test
  @DisplayName("Test toListIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator IteratorUtils.toListIterator(Iterator)"})
  void testToListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ListIterator<Object> actualToListIteratorResult =
        IteratorUtils.toListIterator(objectList.iterator());

    // Assert
    assertTrue(actualToListIteratorResult instanceof ListIteratorWrapper);
    assertFalse(actualToListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test toSet(Iterator, int) with 'iterator', 'estimatedSize'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  void testToSetWithIteratorEstimatedSize_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator, 3);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @DisplayName("Test toSet(Iterator, int) with 'iterator', 'estimatedSize'; given CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  void testToSetWithIteratorEstimatedSize_givenCompositeSet() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(new CompositeSet<>());
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator, 3);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test toSet(Iterator, int) with 'iterator', 'estimatedSize'; when three; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  void testToSetWithIteratorEstimatedSize_whenThree_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator, 3);

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualToSetResult.isEmpty());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test toSet(Iterator, int) with 'iterator', 'estimatedSize'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  void testToSetWithIteratorEstimatedSize_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IteratorUtils.toSet(objectList.iterator(), 0));
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toSet(Iterator) with 'iterator'; given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  void testToSetWithIterator_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @DisplayName("Test toSet(Iterator) with 'iterator'; given CompositeSet() addComposited HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  void testToSetWithIterator_givenCompositeSetAddCompositedHashSet() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(objectSet);
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toSet(Iterator) with 'iterator'; given CompositeSet(); when ArrayList() add CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  void testToSetWithIterator_givenCompositeSet_whenArrayListAddCompositeSet() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(new CompositeSet<>());
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toSet(Iterator) with 'iterator'; given HashSet() add '42'; when ArrayList() add CompositeSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  void testToSetWithIterator_givenHashSetAdd42_whenArrayListAddCompositeSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(objectSet);
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator);

    // Assert
    assertEquals(1, actualToSetResult.size());
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @DisplayName("Test toSet(Iterator) with 'iterator'; when ArrayList() iterator; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  void testToSetWithIterator_whenArrayListIterator_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Set<Object> actualToSetResult = IteratorUtils.toSet(iterator);

    // Assert
    assertFalse(iterator.hasNext());
    assertTrue(actualToSetResult.isEmpty());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code
   * transformer}.
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @DisplayName("Test toString(Iterator, Transformer) with 'iterator', 'transformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  void testToStringWithIteratorTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator, mock(Transformer.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code
   * iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer, String, String, String) with 'iterator', 'transformer', 'delimiter', 'prefix', 'suffix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IteratorUtils.toString(Iterator, Transformer, String, String, String)"
  })
  void testToStringWithIteratorTransformerDelimiterPrefixSuffix() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    String actualToStringResult =
        IteratorUtils.toString(iterator, transformer, "Delimiter", "Prefix", "Suffix");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("PrefixApplySuffix", actualToStringResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code
   * iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer, String, String, String) with 'iterator', 'transformer', 'delimiter', 'prefix', 'suffix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IteratorUtils.toString(Iterator, Transformer, String, String, String)"
  })
  void testToStringWithIteratorTransformerDelimiterPrefixSuffix2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () -> IteratorUtils.toString(iterator, transformer, "Delimiter", "Prefix", "Suffix"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code
   * iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <ul>
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer, String, String, String) with 'iterator', 'transformer', 'delimiter', 'prefix', 'suffix'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IteratorUtils.toString(Iterator, Transformer, String, String, String)"
  })
  void testToStringWithIteratorTransformerDelimiterPrefixSuffix_thenNull() {
    // Arrange and Act
    String actualToStringResult =
        IteratorUtils.toString(null, mock(Transformer.class), "Delimiter", "Prefix", "Suffix");

    // Assert
    assertEquals("PrefixSuffix", actualToStringResult);
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code
   * iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   *
   * <ul>
   *   <li>Then return {@code PrefixSuffix}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String,
   * String)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer, String, String, String) with 'iterator', 'transformer', 'delimiter', 'prefix', 'suffix'; then return 'PrefixSuffix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IteratorUtils.toString(Iterator, Transformer, String, String, String)"
  })
  void testToStringWithIteratorTransformerDelimiterPrefixSuffix_thenReturnPrefixSuffix() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    String actualToStringResult =
        IteratorUtils.toString(iterator, mock(Transformer.class), "Delimiter", "Prefix", "Suffix");

    // Assert
    assertEquals("PrefixSuffix", actualToStringResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return {@code [Apply]}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer) with 'iterator', 'transformer'; given 'Apply'; then return '[Apply]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  void testToStringWithIteratorTransformer_givenApply_thenReturnApply() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    String actualToStringResult = IteratorUtils.toString(iterator, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("[Apply]", actualToStringResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer) with 'iterator', 'transformer'; then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  void testToStringWithIteratorTransformer_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new RuntimeException());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.toString(iterator, transformer));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator, Transformer) with 'iterator', 'transformer'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  void testToStringWithIteratorTransformer_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertEquals("[]", IteratorUtils.toString(null, mock(Transformer.class)));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code [42]}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator) with 'iterator'; given '42'; when ArrayList() add '42'; then return '[42]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  void testToStringWithIterator_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[42]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator) with 'iterator'; when ArrayList() iterator; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  void testToStringWithIterator_whenArrayListIterator_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @DisplayName(
      "Test toString(Iterator) with 'iterator'; when CollatingIterator(); then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  void testToStringWithIterator_whenCollatingIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @DisplayName("Test toString(Iterator) with 'iterator'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  void testToStringWithIterator_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertEquals("[]", IteratorUtils.toString(null));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#transformedIterator(Iterator, Transformer)}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   *   <li>Then return {@link TransformIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#transformedIterator(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedIterator(Iterator, Transformer); when Transformer; then return TransformIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.transformedIterator(Iterator, Transformer)"})
  void testTransformedIterator_whenTransformer_thenReturnTransformIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualTransformedIteratorResult =
        IteratorUtils.transformedIterator(objectList.iterator(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedIteratorResult instanceof TransformIterator);
    assertFalse(actualTransformedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#unmodifiableIterator(Iterator)}.
   *
   * <p>Method under test: {@link IteratorUtils#unmodifiableIterator(Iterator)}
   */
  @Test
  @DisplayName("Test unmodifiableIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator IteratorUtils.unmodifiableIterator(Iterator)"})
  void testUnmodifiableIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualUnmodifiableIteratorResult =
        IteratorUtils.unmodifiableIterator(objectList.iterator());

    // Assert
    assertTrue(actualUnmodifiableIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualUnmodifiableIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#unmodifiableListIterator(ListIterator)}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableListIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#unmodifiableListIterator(ListIterator)}
   */
  @Test
  @DisplayName("Test unmodifiableListIterator(ListIterator); then return UnmodifiableListIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ListIterator IteratorUtils.unmodifiableListIterator(ListIterator)"})
  void testUnmodifiableListIterator_thenReturnUnmodifiableListIterator() {
    // Arrange and Act
    ListIterator<Object> actualUnmodifiableListIteratorResult =
        IteratorUtils.unmodifiableListIterator(
            new AbstractListIteratorDecorator<>(new FilterListIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableListIteratorResult instanceof UnmodifiableListIterator);
    assertFalse(actualUnmodifiableListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#unmodifiableMapIterator(MapIterator)}.
   *
   * <ul>
   *   <li>Then return {@link UnmodifiableMapIterator}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorUtils#unmodifiableMapIterator(MapIterator)}
   */
  @Test
  @DisplayName("Test unmodifiableMapIterator(MapIterator); then return UnmodifiableMapIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator IteratorUtils.unmodifiableMapIterator(MapIterator)"})
  void testUnmodifiableMapIterator_thenReturnUnmodifiableMapIterator() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        new AbstractOrderedMapIteratorDecorator<>(mock(OrderedMapIterator.class));

    // Act
    MapIterator<Object, Object> actualUnmodifiableMapIteratorResult =
        IteratorUtils.unmodifiableMapIterator(new AbstractMapIteratorDecorator<>(iterator));

    // Assert
    assertTrue(actualUnmodifiableMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualUnmodifiableMapIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#zippingIterator(Iterator, Iterator)} with {@code a}, {@code b}.
   *
   * <p>Method under test: {@link IteratorUtils#zippingIterator(Iterator, Iterator)}
   */
  @Test
  @DisplayName("Test zippingIterator(Iterator, Iterator) with 'a', 'b'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ZippingIterator IteratorUtils.zippingIterator(Iterator, Iterator)"})
  void testZippingIteratorWithAB() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult =
        IteratorUtils.zippingIterator(a, objectList2.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#zippingIterator(Iterator, Iterator, Iterator)} with {@code a}, {@code
   * b}, {@code c}.
   *
   * <p>Method under test: {@link IteratorUtils#zippingIterator(Iterator, Iterator, Iterator)}
   */
  @Test
  @DisplayName("Test zippingIterator(Iterator, Iterator, Iterator) with 'a', 'b', 'c'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ZippingIterator IteratorUtils.zippingIterator(Iterator, Iterator, Iterator)"})
  void testZippingIteratorWithABC() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> b = objectList2.iterator();

    ArrayList<Object> objectList3 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult =
        IteratorUtils.zippingIterator(a, b, objectList3.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#zippingIterator(Iterator[])} with {@code iterators}.
   *
   * <p>Method under test: {@link IteratorUtils#zippingIterator(Iterator[])}
   */
  @Test
  @DisplayName("Test zippingIterator(Iterator[]) with 'iterators'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ZippingIterator IteratorUtils.zippingIterator(Iterator[])"})
  void testZippingIteratorWithIterators() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult =
        IteratorUtils.zippingIterator(objectList.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }
}
