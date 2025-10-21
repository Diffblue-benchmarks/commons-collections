package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IteratorUtilsDiffblueTest {
  /**
   * Test {@link IteratorUtils#asEnumeration(Iterator)}.
   * <p>
   * Method under test: {@link IteratorUtils#asEnumeration(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Enumeration IteratorUtils.asEnumeration(Iterator)"})
  public void testAsEnumeration() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Enumeration<Object> actualAsEnumerationResult = IteratorUtils.asEnumeration(objectList.iterator());

    // Assert
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator().hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterable(Iterator)}.
   * <p>
   * Method under test: {@link IteratorUtils#asIterable(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IteratorUtils.asIterable(Iterator)"})
  public void testAsIterable() {
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
   * Test {@link IteratorUtils#asIterator(Enumeration, Collection)} with {@code enumeration}, {@code removeCollection}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration, Collection)"})
  public void testAsIteratorWithEnumerationRemoveCollection_given42_whenArrayListAdd42() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    ArrayList<Object> removeCollection = new ArrayList<>();
    removeCollection.add("42");

    // Act
    Iterator<Object> actualAsIteratorResult = IteratorUtils.asIterator(enumeration, removeCollection);

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration, Collection)} with {@code enumeration}, {@code removeCollection}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration, Collection)"})
  public void testAsIteratorWithEnumerationRemoveCollection_given42_whenArrayListAdd422() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    ArrayList<Object> removeCollection = new ArrayList<>();
    removeCollection.add("42");
    removeCollection.add("42");

    // Act
    Iterator<Object> actualAsIteratorResult = IteratorUtils.asIterator(enumeration, removeCollection);

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration, Collection)} with {@code enumeration}, {@code removeCollection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration, Collection)"})
  public void testAsIteratorWithEnumerationRemoveCollection_whenArrayList() {
    // Arrange
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    Iterator<Object> actualAsIteratorResult = IteratorUtils.asIterator(enumeration, new ArrayList<>());

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asIterator(Enumeration)} with {@code enumeration}.
   * <ul>
   *   <li>Then return {@link EnumerationIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#asIterator(Enumeration)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.asIterator(Enumeration)"})
  public void testAsIteratorWithEnumeration_thenReturnEnumerationIterator() {
    // Arrange and Act
    Iterator<Object> actualAsIteratorResult = IteratorUtils.asIterator(new StringTokenizer("foo"));

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#asMultipleUseIterable(Iterator)}.
   * <p>
   * Method under test: {@link IteratorUtils#asMultipleUseIterable(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterable IteratorUtils.asMultipleUseIterable(Iterator)"})
  public void testAsMultipleUseIterable() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterable<Object> actualAsMultipleUseIterableResult = IteratorUtils.asMultipleUseIterable(objectList.iterator());
    Iterator<Object> actualIteratorResult = actualAsMultipleUseIterableResult.iterator();

    // Assert
    assertTrue(actualAsMultipleUseIterableResult instanceof IteratorIterable);
    Iterator<Object> iteratorResult = actualAsMultipleUseIterableResult.iterator();
    assertFalse(iteratorResult.hasNext());
    assertSame(iteratorResult, actualIteratorResult);
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long)} with {@code iterator}, {@code max}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#boundedIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long)"})
  public void testBoundedIteratorWithIteratorMax_whenOne_thenReturnNotHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult = IteratorUtils.boundedIterator(objectList.iterator(), 1L);

    // Assert
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long, long)} with {@code iterator}, {@code offset}, {@code max}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long, long)"})
  public void testBoundedIteratorWithIteratorOffsetMax_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult = IteratorUtils.boundedIterator(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long, long)} with {@code iterator}, {@code offset}, {@code max}.
   * <ul>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long, long)"})
  public void testBoundedIteratorWithIteratorOffsetMax_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult = IteratorUtils.boundedIterator(iterator, 0L, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#boundedIterator(Iterator, long, long)} with {@code iterator}, {@code offset}, {@code max}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedIterator IteratorUtils.boundedIterator(Iterator, long, long)"})
  public void testBoundedIteratorWithIteratorOffsetMax_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult = IteratorUtils.boundedIterator(iterator, 1L, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#chainedIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Collection)"})
  public void testChainedIteratorWithCollection_whenArrayList() {
    // Arrange and Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(new ArrayList<>());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Collection)} with {@code Collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#chainedIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Collection)"})
  public void testChainedIteratorWithCollection_whenArrayListAddArrayListIterator() {
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
   * <p>
   * Method under test: {@link IteratorUtils#chainedIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Iterator)"})
  public void testChainedIteratorWithIterator() {
    // Arrange
    ArrayList<Iterator<?>> iteratorList = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(iteratorList.iterator());

    // Assert
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Iterator[])} with {@code Iterator[]}.
   * <p>
   * Method under test: {@link IteratorUtils#chainedIterator(Iterator[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Iterator[])"})
  public void testChainedIteratorWithIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(objectList.iterator());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#chainedIterator(Iterator, Iterator)} with {@code Iterator}, {@code Iterator}.
   * <p>
   * Method under test: {@link IteratorUtils#chainedIterator(Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.chainedIterator(Iterator, Iterator)"})
  public void testChainedIteratorWithIteratorIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator1 = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(iterator1, objectList2.iterator());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_given42_when42_thenReturnTrue() {
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_given42_whenArrayListAdd42_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_given42_whenObject_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_givenArrayListAdd42_thenNotCollatingIteratorHasNext() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_givenArrayListAdd42_thenNotCollatingIteratorHasNext2() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_givenComparatorCompareReturnIndex_not_found_thenCallsCompare() {
    // Arrange
    new RuntimeException("foo");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>();
    iterator3.setComparator(comp);
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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    new RuntimeException("foo");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>();
    iterator3.setComparator(comp);
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
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_givenNull_whenArrayListAddNull_thenReturnTrue() {
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
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_thenNotCollatingIteratorHasNext() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.</li>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenCollatingIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    new RuntimeException("foo");
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenIteratorChainAddIteratorArrayListIterator2() {
    // Arrange
    new RuntimeException("foo");

    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

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
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenIteratorChainAddIteratorArrayListIterator3() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.</li>
   *   <li>Then not {@link IteratorChain#IteratorChain()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenIteratorChain_thenNotIteratorChainHasNext() {
    // Arrange
    new RuntimeException("foo");
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(IteratorUtils.contains(null, null));
  }

  /**
   * Test {@link IteratorUtils#contains(Iterator, Object)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.contains(Iterator, Object)"})
  public void testContains_whenObject_thenNotArrayListIteratorHasNext() {
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
   * <p>
   * Method under test: {@link IteratorUtils#emptyIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableIterator IteratorUtils.emptyIterator()"})
  public void testEmptyIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualEmptyIteratorResult = IteratorUtils.emptyIterator();

    // Assert
    assertTrue(actualEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyListIterator()}.
   * <p>
   * Method under test: {@link IteratorUtils#emptyListIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.emptyListIterator()"})
  public void testEmptyListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualEmptyListIteratorResult = IteratorUtils.emptyListIterator();

    // Assert
    assertTrue(actualEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualEmptyListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyMapIterator()}.
   * <p>
   * Method under test: {@link IteratorUtils#emptyMapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator IteratorUtils.emptyMapIterator()"})
  public void testEmptyMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualEmptyMapIteratorResult = IteratorUtils.emptyMapIterator();

    // Assert
    assertTrue(actualEmptyMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualEmptyMapIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyOrderedIterator()}.
   * <p>
   * Method under test: {@link IteratorUtils#emptyOrderedIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedIterator IteratorUtils.emptyOrderedIterator()"})
  public void testEmptyOrderedIterator() {
    // Arrange and Act
    OrderedIterator<Object> actualEmptyOrderedIteratorResult = IteratorUtils.emptyOrderedIterator();

    // Assert
    assertTrue(actualEmptyOrderedIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualEmptyOrderedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#emptyOrderedMapIterator()}.
   * <p>
   * Method under test: {@link IteratorUtils#emptyOrderedMapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator IteratorUtils.emptyOrderedMapIterator()"})
  public void testEmptyOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualEmptyOrderedMapIteratorResult = IteratorUtils.emptyOrderedMapIterator();

    // Assert
    assertTrue(actualEmptyOrderedMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualEmptyOrderedMapIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#filteredIterator(Iterator, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@link FilterIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#filteredIterator(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.filteredIterator(Iterator, Predicate)"})
  public void testFilteredIterator_whenPredicate_thenReturnFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualFilteredIteratorResult = IteratorUtils.filteredIterator(objectList.iterator(),
        mock(Predicate.class));

    // Assert
    assertTrue(actualFilteredIteratorResult instanceof FilterIterator);
    assertFalse(actualFilteredIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  public void testFindWithIteratorPredicate_givenFalse_whenPredicateTestReturnFalse() {
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
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  public void testFindWithIteratorPredicate_givenTrue_whenPredicateTestReturnTrue_thenReturn42() {
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
   * <ul>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  public void testFindWithIteratorPredicate_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException("predicate"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.find(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  public void testFindWithIteratorPredicate_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(IteratorUtils.find(null, mock(Predicate.class)));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#find(Iterator, Predicate)} with {@code iterator}, {@code predicate}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#find(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.find(Iterator, Predicate)"})
  public void testFindWithIteratorPredicate_whenPredicate_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertNull(IteratorUtils.find(iterator, mock(Predicate.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#first(Iterator)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#first(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.first(Iterator)"})
  public void testFirst_given42_whenArrayListAdd42_thenReturn42() {
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  public void testForEach_given42_whenClosureAcceptDoesNothing_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code closure}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  public void testForEach_givenRuntimeExceptionWithClosure_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Closure<Object> closure = mock(Closure.class);
    doThrow(new RuntimeException("closure")).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.forEach(iterator, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#forEach(Iterator, Closure)}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  public void testForEach_whenClosure_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEach(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorUtils.forEach(Iterator, Closure)"})
  public void testForEach_whenNull_thenNull() {
    // Arrange and Act
    IteratorUtils.forEach(null, mock(Closure.class));

    // Assert that nothing has changed
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  public void testForEachButLast_given42_whenArrayListAdd42_thenReturn42() {
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  public void testForEachButLast_given42_whenClosureAcceptDoesNothing_thenReturn42() {
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
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code closure}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  public void testForEachButLast_givenRuntimeExceptionWithClosure_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Closure<Object> closure = mock(Closure.class);
    doThrow(new RuntimeException("closure")).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.forEachButLast(iterator, closure));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   * <ul>
   *   <li>When {@link Closure}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  public void testForEachButLast_whenClosure_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertNull(IteratorUtils.forEachButLast(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#forEachButLast(Iterator, Closure)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#forEachButLast(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.forEachButLast(Iterator, Closure)"})
  public void testForEachButLast_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(IteratorUtils.forEachButLast(null, mock(Closure.class)));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code index}, {@code defaultSupplier}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  public void testGetWithIteratorIndexDefaultSupplier_given42_thenReturnApply() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    IntFunction<Object> defaultSupplier = mock(IntFunction.class);
    when(defaultSupplier.apply(anyInt())).thenReturn("Apply");

    // Act
    Object actualGetResult = IteratorUtils.get(iterator, 1, defaultSupplier);

    // Assert
    verify(defaultSupplier).apply(eq(0));
    assertEquals("Apply", actualGetResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code index}, {@code defaultSupplier}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  public void testGetWithIteratorIndexDefaultSupplier_given42_whenArrayListAdd42_thenReturn42() {
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
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code index}, {@code defaultSupplier}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  public void testGetWithIteratorIndexDefaultSupplier_givenApply_thenReturnApply() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    IntFunction<Object> defaultSupplier = mock(IntFunction.class);
    when(defaultSupplier.apply(anyInt())).thenReturn("Apply");

    // Act
    Object actualGetResult = IteratorUtils.get(iterator, 1, defaultSupplier);

    // Assert
    verify(defaultSupplier).apply(eq(1));
    assertEquals("Apply", actualGetResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int, IntFunction)} with {@code iterator}, {@code index}, {@code defaultSupplier}.
   * <ul>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int, IntFunction)"})
  public void testGetWithIteratorIndexDefaultSupplier_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    IntFunction<Object> defaultSupplier = mock(IntFunction.class);
    when(defaultSupplier.apply(anyInt())).thenThrow(new RuntimeException("foo"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.get(iterator, 1, defaultSupplier));
    verify(defaultSupplier).apply(eq(1));
  }

  /**
   * Test {@link IteratorUtils#get(Iterator, int)} with {@code iterator}, {@code index}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#get(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorUtils.get(Iterator, int)"})
  public void testGetWithIteratorIndex_given42_whenArrayListAdd42_thenReturn42() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenArrayList_thenArrayListEmpty() {
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
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link HashMap#HashMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenHashMap_thenHashMapEmpty() {
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
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code iterator}.</li>
   *   <li>Then return {@link NodeListIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenIIOMetadataNodeWithIterator_thenReturnNodeListIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new IIOMetadataNode("iterator"));

    // Assert
    assertTrue(actualIterator instanceof NodeListIterator);
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link EmptyIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenNull_thenReturnEmptyIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(null);

    // Assert
    assertTrue(actualIterator instanceof EmptyIterator);
    assertNull(null);
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   * <ul>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return {@link SingletonIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenObj_thenReturnSingletonIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator("Obj");

    // Assert
    assertTrue(actualIterator instanceof SingletonIterator);
    assertEquals("Obj", actualIterator.next());
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#getIterator(Object)}.
   * <ul>
   *   <li>When {@link Scanner#Scanner(String)} with {@code iterator}.</li>
   *   <li>Then return {@link Scanner}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenScannerWithIterator_thenReturnScanner() {
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
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code iterator}.</li>
   *   <li>Then return {@link EnumerationIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.getIterator(Object)"})
  public void testGetIterator_whenStringTokenizerWithIterator_thenReturnEnumerationIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new StringTokenizer("iterator"));

    // Assert
    assertTrue(actualIterator instanceof EnumerationIterator);
    assertEquals("iterator", actualIterator.next());
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  public void testIndexOf_givenFalse_whenPredicateTestReturnFalse() {
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
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code predicate}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  public void testIndexOf_givenRuntimeExceptionWithPredicate_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException("predicate"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.indexOf(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  public void testIndexOf_givenTrue_whenPredicateTestReturnTrue_thenReturnZero() {
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  public void testIndexOf_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, IteratorUtils.indexOf(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IteratorUtils#indexOf(Iterator, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#indexOf(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.indexOf(Iterator, Predicate)"})
  public void testIndexOf_whenPredicate_thenNotArrayListIteratorHasNext() {
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
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty() {
    // Arrange
    new RuntimeException("foo");

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(IteratorUtils.isEmpty(objectList.iterator()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_givenArrayListAdd42() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_givenArrayListAdd42_thenReturnFalse() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_givenArrayListIterator_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    new RuntimeException("foo");

    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_givenArrayListIterator_whenIteratorChainAddIteratorArrayListIterator2() {
    // Arrange
    new RuntimeException("foo");

    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code foo}.</li>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_givenRuntimeExceptionWithFoo_whenCollatingIterator_thenReturnTrue() {
    // Arrange
    new RuntimeException("foo");

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(new CollatingIterator<>()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code foo}.</li>
   *   <li>When {@link IteratorChain#IteratorChain()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_givenRuntimeExceptionWithFoo_whenIteratorChain_thenReturnTrue() {
    // Arrange
    new RuntimeException("foo");

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(new IteratorChain<>()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_whenArrayListIterator_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(objectList.iterator()));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_whenCollatingIteratorAddIteratorArrayListIterator() {
    // Arrange
    new RuntimeException("foo");

    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Test {@link IteratorUtils#isEmpty(Iterator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.isEmpty(Iterator)"})
  public void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(null));
  }

  /**
   * Test {@link IteratorUtils#loopingIterator(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableIterator IteratorUtils.loopingIterator(Collection)"})
  public void testLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    ResettableIterator<Object> actualLoopingIteratorResult = IteratorUtils.loopingIterator(collection);

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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableIterator IteratorUtils.loopingIterator(Collection)"})
  public void testLoopingIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    ResettableIterator<Object> actualLoopingIteratorResult = IteratorUtils.loopingIterator(collection);

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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableIterator IteratorUtils.loopingIterator(Collection)"})
  public void testLoopingIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    ResettableIterator<Object> actualLoopingIteratorResult = IteratorUtils.loopingIterator(new ArrayList<>());

    // Assert
    assertTrue(actualLoopingIteratorResult instanceof LoopingIterator);
    assertFalse(actualLoopingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#loopingListIterator(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.loopingListIterator(List)"})
  public void testLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    ResettableListIterator<Object> actualLoopingListIteratorResult = IteratorUtils.loopingListIterator(list);

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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return next is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.loopingListIterator(List)"})
  public void testLoopingListIterator_given42_whenArrayListAdd42_thenReturnNextIs422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    ResettableListIterator<Object> actualLoopingListIteratorResult = IteratorUtils.loopingListIterator(list);

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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableListIterator IteratorUtils.loopingListIterator(List)"})
  public void testLoopingListIterator_whenArrayList_thenReturnNotHasNext() {
    // Arrange and Act
    ResettableListIterator<Object> actualLoopingListIteratorResult = IteratorUtils
        .loopingListIterator(new ArrayList<>());

    // Assert
    assertTrue(actualLoopingListIteratorResult instanceof LoopingListIterator);
    assertFalse(actualLoopingListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  public void testMatchesAll_givenFalse_whenPredicateTestReturnFalse_thenReturnFalse() {
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
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code predicate}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  public void testMatchesAll_givenRuntimeExceptionWithPredicate_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException("predicate"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.matchesAll(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  public void testMatchesAll_givenTrue_whenPredicateTestReturnTrue() {
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  public void testMatchesAll_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertTrue(IteratorUtils.matchesAll(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IteratorUtils#matchesAll(Iterator, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAll(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAll(Iterator, Predicate)"})
  public void testMatchesAll_whenPredicate_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  public void testMatchesAny_givenFalse_whenPredicateTestReturnFalse() {
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
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code predicate}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  public void testMatchesAny_givenRuntimeExceptionWithPredicate_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new RuntimeException("predicate"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.matchesAny(iterator, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  public void testMatchesAny_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  public void testMatchesAny_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(IteratorUtils.matchesAny(null, mock(Predicate.class)));
  }

  /**
   * Test {@link IteratorUtils#matchesAny(Iterator, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#matchesAny(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorUtils.matchesAny(Iterator, Predicate)"})
  public void testMatchesAny_whenPredicate_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code foo}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#nodeListIterator(NodeList)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"NodeListIterator IteratorUtils.nodeListIterator(NodeList)"})
  public void testNodeListIteratorWithNodeList_whenIIOMetadataNodeWithFoo_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(IteratorUtils.nodeListIterator((NodeList) new IIOMetadataNode("foo")).hasNext());
  }

  /**
   * Test {@link IteratorUtils#nodeListIterator(Node)} with {@code node}.
   * <ul>
   *   <li>When {@link IIOMetadataNode#IIOMetadataNode(String)} with {@code foo}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#nodeListIterator(Node)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"NodeListIterator IteratorUtils.nodeListIterator(Node)"})
  public void testNodeListIteratorWithNode_whenIIOMetadataNodeWithFoo_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(IteratorUtils.nodeListIterator((Node) new IIOMetadataNode("foo")).hasNext());
  }

  /**
   * Test {@link IteratorUtils#objectGraphIterator(Object, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#objectGraphIterator(Object, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.objectGraphIterator(Object, Transformer)"})
  public void testObjectGraphIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualObjectGraphIteratorResult = IteratorUtils.objectGraphIterator(objectList.iterator(),
        mock(Transformer.class));

    // Assert
    assertTrue(actualObjectGraphIteratorResult instanceof ObjectGraphIterator);
    assertFalse(actualObjectGraphIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#objectGraphIterator(Object, Transformer)}.
   * <ul>
   *   <li>When {@code Root}.</li>
   *   <li>Then return next is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#objectGraphIterator(Object, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.objectGraphIterator(Object, Transformer)"})
  public void testObjectGraphIterator_whenRoot_thenReturnNextIsNull() {
    // Arrange and Act
    Iterator<Object> actualObjectGraphIteratorResult = IteratorUtils.objectGraphIterator("Root",
        mock(Transformer.class));

    // Assert
    assertTrue(actualObjectGraphIteratorResult instanceof ObjectGraphIterator);
    assertNull(actualObjectGraphIteratorResult.next());
    assertFalse(actualObjectGraphIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#peekingIterator(Iterator)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#peekingIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.peekingIterator(Iterator)"})
  public void testPeekingIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualPeekingIteratorResult = IteratorUtils.peekingIterator(objectList.iterator());

    // Assert
    assertTrue(actualPeekingIteratorResult instanceof PeekingIterator);
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#peekingIterator(Iterator)}.
   * <ul>
   *   <li>When peekingIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#peekingIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.peekingIterator(Iterator)"})
  public void testPeekingIterator_whenPeekingIteratorArrayListIterator() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#pushbackIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.pushbackIterator(Iterator)"})
  public void testPushbackIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualPushbackIteratorResult = IteratorUtils.pushbackIterator(objectList.iterator());

    // Assert
    assertTrue(actualPushbackIteratorResult instanceof PushbackIterator);
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#pushbackIterator(Iterator)}.
   * <ul>
   *   <li>When pushbackIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#pushbackIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.pushbackIterator(Iterator)"})
  public void testPushbackIterator_whenPushbackIteratorArrayListIterator() {
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
   * <p>
   * Method under test: {@link IteratorUtils#singletonIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableIterator IteratorUtils.singletonIterator(Object)"})
  public void testSingletonIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualSingletonIteratorResult = IteratorUtils.singletonIterator("Object");

    // Assert
    assertTrue(actualSingletonIteratorResult instanceof SingletonIterator);
    assertEquals("Object", actualSingletonIteratorResult.next());
    assertFalse(actualSingletonIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#singletonListIterator(Object)}.
   * <p>
   * Method under test: {@link IteratorUtils#singletonListIterator(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator IteratorUtils.singletonListIterator(Object)"})
  public void testSingletonListIterator() {
    // Arrange and Act
    ListIterator<Object> actualSingletonListIteratorResult = IteratorUtils.singletonListIterator("Object");

    // Assert
    assertTrue(actualSingletonListIteratorResult instanceof SingletonListIterator);
    assertEquals("Object", actualSingletonListIteratorResult.next());
    assertFalse(actualSingletonListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize() {
    // Arrange
    new RuntimeException("foo");

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_given42_whenArrayListAdd42_thenNotArrayListIteratorHasNext() {
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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_givenArrayListAdd42_thenReturnOne() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_givenArrayListAdd42_thenReturnOne2() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_givenComparatorCompareReturnIndex_not_found_thenReturnTwo() {
    // Arrange
    new RuntimeException("foo");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>();
    iterator3.setComparator(comp);
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
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_givenComparatorCompareReturnOne_thenReturnTwo() {
    // Arrange
    new RuntimeException("foo");

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>();
    iterator3.setComparator(comp);
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
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_thenNotCollatingIteratorHasNext() {
    // Arrange
    new RuntimeException("foo");

    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenArrayListIterator_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.</li>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenCollatingIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    new RuntimeException("foo");
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    new RuntimeException("foo");

    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenIteratorChainAddIteratorArrayListIterator2() {
    // Arrange
    new RuntimeException("foo");

    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenIteratorChainAddIteratorArrayListIterator_thenReturnOne() {
    // Arrange
    new RuntimeException("foo");

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
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.</li>
   *   <li>Then not {@link IteratorChain#IteratorChain()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenIteratorChain_thenNotIteratorChainHasNext() {
    // Arrange
    new RuntimeException("foo");
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#size(Iterator)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int IteratorUtils.size(Iterator)"})
  public void testSize_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertEquals(0, IteratorUtils.size(null));
  }

  /**
   * Test {@link IteratorUtils#skippingIterator(Iterator, long)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SkippingIterator IteratorUtils.skippingIterator(Iterator, long)"})
  public void testSkippingIterator_given42_whenArrayListAdd42_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIteratorResult = IteratorUtils.skippingIterator(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#skippingIterator(Iterator, long)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SkippingIterator IteratorUtils.skippingIterator(Iterator, long)"})
  public void testSkippingIterator_whenOne_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIteratorResult = IteratorUtils.skippingIterator(iterator, 1L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#skippingIterator(Iterator, long)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SkippingIterator IteratorUtils.skippingIterator(Iterator, long)"})
  public void testSkippingIterator_whenZero_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    SkippingIterator<Object> actualSkippingIteratorResult = IteratorUtils.skippingIterator(iterator, 0L);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualSkippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException(String)} with {@code foo}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  public void testStreamWithIterable_givenRuntimeExceptionWithFoo_thenThrowRuntimeException() {
    // Arrange
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.spliterator()).thenThrow(new RuntimeException("foo"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.stream(iterable));
    verify(iterable).spliterator();
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return limit five collect toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  public void testStreamWithIterable_whenArrayList_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(new ArrayList<>());

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When empty.</li>
   *   <li>Then return limit five collect toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  public void testStreamWithIterable_whenEmpty_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(iterable);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@link FluentIterable} with iterable is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  public void testStreamWithIterable_whenFluentIterableWithIterableIsArrayList() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(iterable);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#stream(Iterable)} with {@code iterable}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return limit five collect toList Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Stream IteratorUtils.stream(Iterable)"})
  public void testStreamWithIterable_whenNull_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream((Iterable<Object>) null);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IteratorUtils#toArray(Iterator, Class)} with {@code iterator}, {@code arrayClass}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return first element is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toArray(Iterator, Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator, Class)"})
  public void testToArrayWithIteratorArrayClass_given42_thenReturnFirstElementIs42() {
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
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toArray(Iterator, Class)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator, Class)"})
  public void testToArrayWithIteratorArrayClass_whenJavaLangObject_thenReturnArrayLengthIsZero() {
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
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return first element is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toArray(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator)"})
  public void testToArrayWithIterator_given42_whenArrayListAdd42_thenReturnFirstElementIs42() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toArray(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] IteratorUtils.toArray(Iterator)"})
  public void testToArrayWithIterator_whenArrayListIterator_thenReturnArrayLengthIsZero() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(0, IteratorUtils.toArray(iterator).length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator, int)"})
  public void testToListWithIteratorEstimatedSize_given42_thenReturnSizeIsOne() {
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
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator, int)"})
  public void testToListWithIteratorEstimatedSize_whenThree_thenReturnEmpty() {
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
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator, int)"})
  public void testToListWithIteratorEstimatedSize_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IteratorUtils.toList(objectList.iterator(), 0));
  }

  /**
   * Test {@link IteratorUtils#toList(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toList(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator)"})
  public void testToListWithIterator_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toList(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IteratorUtils.toList(Iterator)"})
  public void testToListWithIterator_whenArrayListIterator_thenReturnEmpty() {
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
   * <p>
   * Method under test: {@link IteratorUtils#toListIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator IteratorUtils.toListIterator(Iterator)"})
  public void testToListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ListIterator<Object> actualToListIteratorResult = IteratorUtils.toListIterator(objectList.iterator());

    // Assert
    assertTrue(actualToListIteratorResult instanceof ListIteratorWrapper);
    assertFalse(actualToListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator, int)} with {@code iterator}, {@code estimatedSize}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  public void testToSetWithIteratorEstimatedSize_given42_whenArrayListAdd42() {
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
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  public void testToSetWithIteratorEstimatedSize_givenCompositeSet() {
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
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  public void testToSetWithIteratorEstimatedSize_whenThree_thenReturnEmpty() {
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
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator, int)"})
  public void testToSetWithIteratorEstimatedSize_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IteratorUtils.toSet(objectList.iterator(), 0));
  }

  /**
   * Test {@link IteratorUtils#toSet(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  public void testToSetWithIterator_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()} addComposited {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  public void testToSetWithIterator_givenCompositeSetAddCompositedHashSet() {
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
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  public void testToSetWithIterator_givenCompositeSet_whenArrayListAddCompositeSet() {
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
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  public void testToSetWithIterator_givenHashSetAdd42_whenArrayListAddCompositeSet() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set IteratorUtils.toSet(Iterator)"})
  public void testToSetWithIterator_whenArrayListIterator_thenReturnEmpty() {
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
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code transformer}.
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  public void testToStringWithIteratorTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator, mock(Transformer.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer, String, String, String)"})
  public void testToStringWithIteratorTransformerDelimiterPrefixSuffix() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    String actualToStringResult = IteratorUtils.toString(iterator, transformer, "Delimiter", "Prefix", "Suffix");

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("PrefixApplySuffix", actualToStringResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer, String, String, String)"})
  public void testToStringWithIteratorTransformerDelimiterPrefixSuffix2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new RuntimeException("transformer"));

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> IteratorUtils.toString(iterator, transformer, "Delimiter", "Prefix", "Suffix"));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <ul>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer, String, String, String)"})
  public void testToStringWithIteratorTransformerDelimiterPrefixSuffix_thenNull() {
    // Arrange, Act and Assert
    assertEquals("PrefixSuffix",
        IteratorUtils.toString(null, mock(Transformer.class), "Delimiter", "Prefix", "Suffix"));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)} with {@code iterator}, {@code transformer}, {@code delimiter}, {@code prefix}, {@code suffix}.
   * <ul>
   *   <li>Then return {@code PrefixSuffix}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer, String, String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer, String, String, String)"})
  public void testToStringWithIteratorTransformerDelimiterPrefixSuffix_thenReturnPrefixSuffix() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("PrefixSuffix",
        IteratorUtils.toString(iterator, mock(Transformer.class), "Delimiter", "Prefix", "Suffix"));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code transformer}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return {@code [Apply]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  public void testToStringWithIteratorTransformer_givenApply_thenReturnApply() {
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
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code transformer}.
   * <ul>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  public void testToStringWithIteratorTransformer_thenThrowRuntimeException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Transformer<Object, String> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new RuntimeException(", "));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> IteratorUtils.toString(iterator, transformer));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator, Transformer)} with {@code iterator}, {@code transformer}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator, Transformer)"})
  public void testToStringWithIteratorTransformer_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertEquals("[]", IteratorUtils.toString(null, mock(Transformer.class)));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_given42_whenArrayListAdd42() {
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
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code [42]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals("[42]", IteratorUtils.toString(iterator2));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code [42]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_givenArrayListAdd42_thenReturn422() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator2.addIterator(objectList2.iterator());
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals("[42]", IteratorUtils.toString(iterator2));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_givenComparatorCompareReturnIndex_not_found() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>();
    iterator3.setComparator(comp);
    iterator3.addIterator(iterator2);
    iterator3.addIterator(iterator);

    // Act
    String actualToStringResult = IteratorUtils.toString(iterator3);

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertEquals("[42, 42]", actualToStringResult);
    assertFalse(iterator3.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return {@code [42, 42]}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_givenComparatorCompareReturnOne_thenReturn4242() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> iterator3 = new CollatingIterator<>();
    iterator3.setComparator(comp);
    iterator3.addIterator(iterator2);
    iterator3.addIterator(iterator);

    // Act
    String actualToStringResult = IteratorUtils.toString(iterator3);

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    assertEquals("[42, 42]", actualToStringResult);
    assertFalse(iterator3.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenArrayListIterator_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.</li>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenCollatingIterator_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenIteratorChainAddIteratorArrayListIterator2() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenIteratorChainAddIteratorArrayListIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iterator2 = new IteratorChain<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals("[42]", IteratorUtils.toString(iterator2));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.</li>
   *   <li>Then not {@link IteratorChain#IteratorChain()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenIteratorChain_thenNotIteratorChainHasNext() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link IteratorUtils#toString(Iterator)} with {@code iterator}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String IteratorUtils.toString(Iterator)"})
  public void testToStringWithIterator_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertEquals("[]", IteratorUtils.toString(null));
    assertNull(null);
  }

  /**
   * Test {@link IteratorUtils#transformedIterator(Iterator, Transformer)}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link TransformIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#transformedIterator(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.transformedIterator(Iterator, Transformer)"})
  public void testTransformedIterator_whenTransformer_thenReturnTransformIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualTransformedIteratorResult = IteratorUtils
        .<Object, Object>transformedIterator(objectList.iterator(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedIteratorResult instanceof TransformIterator);
    assertFalse(actualTransformedIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#unmodifiableIterator(Iterator)}.
   * <p>
   * Method under test: {@link IteratorUtils#unmodifiableIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorUtils.unmodifiableIterator(Iterator)"})
  public void testUnmodifiableIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualUnmodifiableIteratorResult = IteratorUtils.unmodifiableIterator(objectList.iterator());

    // Assert
    assertTrue(actualUnmodifiableIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualUnmodifiableIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#unmodifiableListIterator(ListIterator)}.
   * <ul>
   *   <li>Then return {@link UnmodifiableListIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#unmodifiableListIterator(ListIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator IteratorUtils.unmodifiableListIterator(ListIterator)"})
  public void testUnmodifiableListIterator_thenReturnUnmodifiableListIterator() {
    // Arrange and Act
    ListIterator<Object> actualUnmodifiableListIteratorResult = IteratorUtils
        .unmodifiableListIterator(new AbstractListIteratorDecorator<>(new FilterListIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableListIteratorResult instanceof UnmodifiableListIterator);
    assertFalse(actualUnmodifiableListIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#unmodifiableMapIterator(MapIterator)}.
   * <ul>
   *   <li>Then return {@link UnmodifiableMapIterator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorUtils#unmodifiableMapIterator(MapIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator IteratorUtils.unmodifiableMapIterator(MapIterator)"})
  public void testUnmodifiableMapIterator_thenReturnUnmodifiableMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualUnmodifiableMapIteratorResult = IteratorUtils.unmodifiableMapIterator(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(mock(OrderedMapIterator.class))));

    // Assert
    assertTrue(actualUnmodifiableMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualUnmodifiableMapIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#zippingIterator(Iterator, Iterator)} with {@code a}, {@code b}.
   * <p>
   * Method under test: {@link IteratorUtils#zippingIterator(Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ZippingIterator IteratorUtils.zippingIterator(Iterator, Iterator)"})
  public void testZippingIteratorWithAB() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult = IteratorUtils.zippingIterator(a, objectList2.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#zippingIterator(Iterator, Iterator, Iterator)} with {@code a}, {@code b}, {@code c}.
   * <p>
   * Method under test: {@link IteratorUtils#zippingIterator(Iterator, Iterator, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ZippingIterator IteratorUtils.zippingIterator(Iterator, Iterator, Iterator)"})
  public void testZippingIteratorWithABC() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> a = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> b = objectList2.iterator();

    ArrayList<Object> objectList3 = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult = IteratorUtils.zippingIterator(a, b, objectList3.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }

  /**
   * Test {@link IteratorUtils#zippingIterator(Iterator[])} with {@code iterators}.
   * <p>
   * Method under test: {@link IteratorUtils#zippingIterator(Iterator[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ZippingIterator IteratorUtils.zippingIterator(Iterator[])"})
  public void testZippingIteratorWithIterators() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult = IteratorUtils.zippingIterator(objectList.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }
}
