package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
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
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.commons.collections4.iterators.EnumerationIterator;
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
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.apache.commons.collections4.iterators.SingletonIterator;
import org.apache.commons.collections4.iterators.SingletonListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IteratorUtilsDiffblueTest {
  /**
   * Method under test: {@link IteratorUtils#arrayIterator(Object[], int)}
   */
  @Test
  public void testArrayIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualArrayIteratorResult = IteratorUtils.arrayIterator(new Object[]{"Array"}, 1);

    // Assert
    assertTrue(actualArrayIteratorResult instanceof ObjectArrayIterator);
    assertFalse(actualArrayIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#arrayIterator(Object[], int, int)}
   */
  @Test
  public void testArrayIterator2() {
    // Arrange and Act
    ResettableIterator<Object> actualArrayIteratorResult = IteratorUtils
        .arrayIterator(new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertTrue(actualArrayIteratorResult instanceof ObjectArrayIterator);
    assertEquals("Array", actualArrayIteratorResult.next());
    assertEquals("Array", actualArrayIteratorResult.next());
    assertFalse(actualArrayIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#arrayListIterator(Object[], int)}
   */
  @Test
  public void testArrayListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualArrayListIteratorResult = IteratorUtils
        .arrayListIterator(new Object[]{"Array"}, 1);

    // Assert
    assertTrue(actualArrayListIteratorResult instanceof ObjectArrayListIterator);
    assertFalse(actualArrayListIteratorResult.hasNext());
  }

  /**
   * Method under test:
   * {@link IteratorUtils#arrayListIterator(Object[], int, int)}
   */
  @Test
  public void testArrayListIterator2() {
    // Arrange and Act
    ResettableListIterator<Object> actualArrayListIteratorResult = IteratorUtils
        .arrayListIterator(new Object[]{"Array", "Array", "Array"}, 1, 3);

    // Assert
    assertTrue(actualArrayListIteratorResult instanceof ObjectArrayListIterator);
    assertEquals("Array", actualArrayListIteratorResult.next());
    assertEquals("Array", actualArrayListIteratorResult.next());
    assertFalse(actualArrayListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#asEnumeration(Iterator)}
   */
  @Test
  public void testAsEnumeration() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    Enumeration<Object> actualAsEnumerationResult = IteratorUtils.asEnumeration(iterator);

    // Assert
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    Iterator<?> iterator2 = ((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator();
    assertFalse(iterator2.hasNext());
    assertSame(iterator, iterator2);
  }

  /**
   * Method under test: {@link IteratorUtils#asIterable(Iterator)}
   */
  @Test
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
   * Method under test: {@link IteratorUtils#asIterator(Enumeration)}
   */
  @Test
  public void testAsIterator() {
    // Arrange and Act
    Iterator<Object> actualAsIteratorResult = IteratorUtils.asIterator(new StringTokenizer("foo"));

    // Assert
    assertTrue(actualAsIteratorResult instanceof EnumerationIterator);
    assertEquals("foo", actualAsIteratorResult.next());
    assertFalse(actualAsIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  public void testAsIterator2() {
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
   * Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  public void testAsIterator3() {
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
   * Method under test: {@link IteratorUtils#asIterator(Enumeration, Collection)}
   */
  @Test
  public void testAsIterator4() {
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
   * Method under test: {@link IteratorUtils#asMultipleUseIterable(Iterator)}
   */
  @Test
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
   * Method under test: {@link IteratorUtils#boundedIterator(Iterator, long)}
   */
  @Test
  public void testBoundedIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    BoundedIterator<Object> actualBoundedIteratorResult = IteratorUtils.boundedIterator(objectList.iterator(), 1L);

    // Assert
    assertFalse(actualBoundedIteratorResult.hasNext());
  }

  /**
   * Method under test:
   * {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  public void testBoundedIterator2() {
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
   * Method under test:
   * {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  public void testBoundedIterator3() {
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
   * Method under test:
   * {@link IteratorUtils#boundedIterator(Iterator, long, long)}
   */
  @Test
  public void testBoundedIterator4() {
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
   * Method under test: {@link IteratorUtils#chainedIterator(Collection)}
   */
  @Test
  public void testChainedIterator() {
    // Arrange and Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(new ArrayList<>());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#chainedIterator(Collection)}
   */
  @Test
  public void testChainedIterator2() {
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
   * Method under test: {@link IteratorUtils#chainedIterator(Iterator)}
   */
  @Test
  public void testChainedIterator3() {
    // Arrange
    ArrayList<Iterator<?>> iteratorList = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(iteratorList.iterator());

    // Assert
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#chainedIterator(Iterator, Iterator)}
   */
  @Test
  public void testChainedIterator4() {
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
   * Method under test: {@link IteratorUtils#chainedIterator(Iterator[])}
   */
  @Test
  public void testChainedIterator5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualChainedIteratorResult = IteratorUtils.chainedIterator(objectList.iterator());

    // Assert
    assertTrue(actualChainedIteratorResult instanceof IteratorChain);
    assertFalse(actualChainedIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains2() {
    // Arrange, Act and Assert
    assertFalse(IteratorUtils.contains(null, null));
  }

  /**
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains3() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains4() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains5() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains6() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains7() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains8() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains9() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains10() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains11() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act
    boolean actualContainsResult = IteratorUtils.contains(iterator, null);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualContainsResult);
  }

  /**
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains12() {
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains13() {
    // Arrange
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
   * Method under test: {@link IteratorUtils#contains(Iterator, Object)}
   */
  @Test
  public void testContains14() {
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
   * Method under test: {@link IteratorUtils#emptyIterator()}
   */
  @Test
  public void testEmptyIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualEmptyIteratorResult = IteratorUtils.emptyIterator();

    // Assert
    assertTrue(actualEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#emptyListIterator()}
   */
  @Test
  public void testEmptyListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualEmptyListIteratorResult = IteratorUtils.emptyListIterator();

    // Assert
    assertTrue(actualEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualEmptyListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#emptyMapIterator()}
   */
  @Test
  public void testEmptyMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualEmptyMapIteratorResult = IteratorUtils.emptyMapIterator();

    // Assert
    assertTrue(actualEmptyMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualEmptyMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#emptyOrderedIterator()}
   */
  @Test
  public void testEmptyOrderedIterator() {
    // Arrange and Act
    OrderedIterator<Object> actualEmptyOrderedIteratorResult = IteratorUtils.emptyOrderedIterator();

    // Assert
    assertTrue(actualEmptyOrderedIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualEmptyOrderedIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#emptyOrderedMapIterator()}
   */
  @Test
  public void testEmptyOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualEmptyOrderedMapIteratorResult = IteratorUtils.emptyOrderedMapIterator();

    // Assert
    assertTrue(actualEmptyOrderedMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualEmptyOrderedMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#first(Iterator)}
   */
  @Test
  public void testFirst() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", IteratorUtils.first(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#get(Iterator, int)}
   */
  @Test
  public void testGet() {
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
   * Method under test: {@link IteratorUtils#get(Iterator, int, IntFunction)}
   */
  @Test
  public void testGet2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", IteratorUtils.get(iterator, 1, null));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator("Obj");

    // Assert
    assertTrue(actualIterator instanceof SingletonIterator);
    assertEquals("Obj", actualIterator.next());
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator2() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(null);

    // Assert
    assertTrue(actualIterator instanceof EmptyIterator);
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator3() {
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
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator4() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new ArrayList<>());

    // Assert
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator5() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new StringTokenizer("iterator"));

    // Assert
    assertTrue(actualIterator instanceof EnumerationIterator);
    assertEquals("iterator", actualIterator.next());
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator6() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new HashMap<>());

    // Assert
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#getIterator(Object)}
   */
  @Test
  public void testGetIterator7() {
    // Arrange and Act
    Iterator<?> actualIterator = IteratorUtils.getIterator(new IIOMetadataNode("iterator"));

    // Assert
    assertTrue(actualIterator instanceof NodeListIterator);
    assertFalse(actualIterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(objectList.iterator()));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(null));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertFalse(IteratorUtils.isEmpty(objectList.iterator()));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty4() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(new CollatingIterator<>()));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty6() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty7() {
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
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty8() {
    // Arrange, Act and Assert
    assertTrue(IteratorUtils.isEmpty(new IteratorChain<>()));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty9() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty10() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertTrue(IteratorUtils.isEmpty(iterator));
  }

  /**
   * Method under test: {@link IteratorUtils#isEmpty(Iterator)}
   */
  @Test
  public void testIsEmpty11() {
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
   * Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  public void testLoopingIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualLoopingIteratorResult = IteratorUtils.loopingIterator(new ArrayList<>());

    // Assert
    assertTrue(actualLoopingIteratorResult instanceof LoopingIterator);
    assertFalse(actualLoopingIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  public void testLoopingIterator2() {
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
   * Method under test: {@link IteratorUtils#loopingIterator(Collection)}
   */
  @Test
  public void testLoopingIterator3() {
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
   * Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  public void testLoopingListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualLoopingListIteratorResult = IteratorUtils
        .loopingListIterator(new ArrayList<>());

    // Assert
    assertTrue(actualLoopingListIteratorResult instanceof LoopingListIterator);
    assertFalse(actualLoopingListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  public void testLoopingListIterator2() {
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
   * Method under test: {@link IteratorUtils#loopingListIterator(List)}
   */
  @Test
  public void testLoopingListIterator3() {
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
   * Method under test: {@link IteratorUtils#nodeListIterator(Node)}
   */
  @Test
  public void testNodeListIterator() {
    // Arrange, Act and Assert
    assertFalse(IteratorUtils.nodeListIterator((Node) new IIOMetadataNode("foo")).hasNext());
    assertFalse(IteratorUtils.nodeListIterator((NodeList) new IIOMetadataNode("foo")).hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#peekingIterator(Iterator)}
   */
  @Test
  public void testPeekingIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualPeekingIteratorResult = IteratorUtils.peekingIterator(objectList.iterator());

    // Assert
    assertTrue(actualPeekingIteratorResult instanceof PeekingIterator);
    assertFalse(actualPeekingIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#peekingIterator(Iterator)}
   */
  @Test
  public void testPeekingIterator2() {
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
   * Method under test: {@link IteratorUtils#pushbackIterator(Iterator)}
   */
  @Test
  public void testPushbackIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Iterator<Object> actualPushbackIteratorResult = IteratorUtils.pushbackIterator(objectList.iterator());

    // Assert
    assertTrue(actualPushbackIteratorResult instanceof PushbackIterator);
    assertFalse(actualPushbackIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#pushbackIterator(Iterator)}
   */
  @Test
  public void testPushbackIterator2() {
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
   * Method under test: {@link IteratorUtils#singletonIterator(Object)}
   */
  @Test
  public void testSingletonIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualSingletonIteratorResult = IteratorUtils.singletonIterator("Object");

    // Assert
    assertTrue(actualSingletonIteratorResult instanceof SingletonIterator);
    assertEquals("Object", actualSingletonIteratorResult.next());
    assertFalse(actualSingletonIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#singletonListIterator(Object)}
   */
  @Test
  public void testSingletonListIterator() {
    // Arrange and Act
    ListIterator<Object> actualSingletonListIteratorResult = IteratorUtils.singletonListIterator("Object");

    // Assert
    assertTrue(actualSingletonListIteratorResult instanceof SingletonListIterator);
    assertEquals("Object", actualSingletonListIteratorResult.next());
    assertFalse(actualSingletonListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize2() {
    // Arrange, Act and Assert
    assertEquals(0, IteratorUtils.size(null));
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(1, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize4() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize6() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize7() {
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
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize8() {
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
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize9() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize10() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals(0, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize11() {
    // Arrange
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
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize12() {
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
   * Method under test: {@link IteratorUtils#size(Iterator)}
   */
  @Test
  public void testSize13() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<?> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals(1, IteratorUtils.size(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  public void testSkippingIterator() {
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
   * Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  public void testSkippingIterator2() {
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
   * Method under test: {@link IteratorUtils#skippingIterator(Iterator, long)}
   */
  @Test
  public void testSkippingIterator3() {
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
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  public void testStream() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(new ArrayList<>());

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  public void testStream2() {
    // Arrange and Act
    Stream<Object> actualStreamResult = IteratorUtils.stream((Iterable<Object>) null);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  public void testStream3() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(iterable);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Method under test: {@link IteratorUtils#stream(Iterable)}
   */
  @Test
  public void testStream4() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act
    Stream<Object> actualStreamResult = IteratorUtils.stream(iterable);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Method under test: {@link IteratorUtils#toArray(Iterator)}
   */
  @Test
  public void testToArray() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals(0, IteratorUtils.toArray(iterator).length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toArray(Iterator)}
   */
  @Test
  public void testToArray2() {
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
   * Method under test: {@link IteratorUtils#toArray(Iterator, Class)}
   */
  @Test
  public void testToArray3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, IteratorUtils.toArray(iterator, arrayClass).length);
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toArray(Iterator, Class)}
   */
  @Test
  public void testToArray4() {
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
   * Method under test: {@link IteratorUtils#toList(Iterator)}
   */
  @Test
  public void testToList() {
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
   * Method under test: {@link IteratorUtils#toList(Iterator)}
   */
  @Test
  public void testToList2() {
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
   * Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  public void testToList3() {
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
   * Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  public void testToList4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IteratorUtils.toList(objectList.iterator(), 0));
  }

  /**
   * Method under test: {@link IteratorUtils#toList(Iterator, int)}
   */
  @Test
  public void testToList5() {
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
   * Method under test: {@link IteratorUtils#toListIterator(Iterator)}
   */
  @Test
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
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  public void testToSet() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  public void testToSet2() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  public void testToSet3() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  public void testToSet4() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator)}
   */
  @Test
  public void testToSet5() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  public void testToSet6() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  public void testToSet7() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IteratorUtils.toSet(objectList.iterator(), 0));
  }

  /**
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  public void testToSet8() {
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
   * Method under test: {@link IteratorUtils#toSet(Iterator, int)}
   */
  @Test
  public void testToSet9() {
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
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString2() {
    // Arrange, Act and Assert
    assertEquals("[]", IteratorUtils.toString(null));
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("[42]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString4() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString6() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString7() {
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
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString8() {
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
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString9() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString10() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertEquals("[]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString11() {
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
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString12() {
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
   * Method under test: {@link IteratorUtils#toString(Iterator)}
   */
  @Test
  public void testToString13() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertEquals("[42]", IteratorUtils.toString(iterator));
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#unmodifiableIterator(Iterator)}
   */
  @Test
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
   * Method under test:
   * {@link IteratorUtils#unmodifiableListIterator(ListIterator)}
   */
  @Test
  public void testUnmodifiableListIterator() {
    // Arrange and Act
    ListIterator<Object> actualUnmodifiableListIteratorResult = IteratorUtils
        .unmodifiableListIterator(new AbstractListIteratorDecorator<>(new FilterListIterator<>()));

    // Assert
    assertTrue(actualUnmodifiableListIteratorResult instanceof UnmodifiableListIterator);
    assertFalse(actualUnmodifiableListIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#unmodifiableMapIterator(MapIterator)}
   */
  @Test
  public void testUnmodifiableMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualUnmodifiableMapIteratorResult = IteratorUtils
        .unmodifiableMapIterator(new AbstractMapIteratorDecorator<>(new EntrySetMapIterator<>(new HashMap<>())));

    // Assert
    assertTrue(actualUnmodifiableMapIteratorResult instanceof UnmodifiableMapIterator);
    assertFalse(actualUnmodifiableMapIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IteratorUtils#zippingIterator(Iterator, Iterator)}
   */
  @Test
  public void testZippingIterator() {
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
   * Method under test:
   * {@link IteratorUtils#zippingIterator(Iterator, Iterator, Iterator)}
   */
  @Test
  public void testZippingIterator2() {
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
   * Method under test: {@link IteratorUtils#zippingIterator(Iterator[])}
   */
  @Test
  public void testZippingIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ZippingIterator<Object> actualZippingIteratorResult = IteratorUtils.zippingIterator(objectList.iterator());

    // Assert
    assertFalse(actualZippingIteratorResult.hasNext());
  }
}
