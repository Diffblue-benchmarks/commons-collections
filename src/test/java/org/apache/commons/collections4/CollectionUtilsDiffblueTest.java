package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
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
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.collection.AbstractCollectionDecorator;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.apache.commons.collections4.iterators.ObjectArrayListIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class CollectionUtilsDiffblueTest {
  /**
   * Test {@link CollectionUtils#addAll(Collection, Object[])} with {@code collection}, {@code elements}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Object[])"})
  public void testAddAllWithCollectionElements_given42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, "Elements");

    // Assert
    assertEquals(2, collection.size());
    assertEquals("42", collection.get(0));
    assertEquals("Elements", collection.get(1));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Object[])} with {@code collection}, {@code elements}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Object[])"})
  public void testAddAllWithCollectionElements_whenArrayList_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, "Elements");

    // Assert
    assertEquals(1, collection.size());
    assertEquals("Elements", collection.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Object[])} with {@code collection}, {@code elements}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Object[])"})
  public void testAddAllWithCollectionElements_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Enumeration)} with {@code collection}, {@code enumeration}.
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Enumeration)"})
  public void testAddAllWithCollectionEnumeration() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    StringTokenizer enumeration = new StringTokenizer("");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, enumeration);

    // Assert
    assertFalse(enumeration.hasMoreElements());
    assertFalse(actualAddAllResult);
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Enumeration)} with {@code collection}, {@code enumeration}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Enumeration)"})
  public void testAddAllWithCollectionEnumeration_given42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, enumeration);

    // Assert
    assertEquals(2, collection.size());
    assertEquals("42", collection.get(0));
    assertEquals("foo", collection.get(1));
    assertFalse(enumeration.hasMoreElements());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Enumeration)} with {@code collection}, {@code enumeration}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Enumeration)"})
  public void testAddAllWithCollectionEnumeration_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    StringTokenizer enumeration = new StringTokenizer("foo");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, enumeration);

    // Assert
    assertEquals(1, collection.size());
    assertEquals("foo", collection.get(0));
    assertFalse(enumeration.hasMoreElements());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  public void testAddAllWithCollectionIterable_given42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, new ArrayList<>());

    // Assert
    assertEquals(1, collection.size());
    assertEquals("42", collection.get(0));
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  public void testAddAllWithCollectionIterable_given42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, new ArrayList<>());

    // Assert
    assertEquals(2, collection.size());
    assertEquals("42", collection.get(0));
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code iterable}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  public void testAddAllWithCollectionIterable_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, iterable);

    // Assert
    assertEquals(1, collection.size());
    assertEquals("42", collection.get(0));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  public void testAddAllWithCollectionIterable_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection, new ArrayList<>()));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code iterator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  public void testAddAllWithCollectionIterator_given42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, iterator);

    // Assert
    assertEquals(1, collection.size());
    assertEquals("42", collection.get(0));
    assertFalse(iterator.hasNext());
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code iterator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  public void testAddAllWithCollectionIterator_given42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, iterator);

    // Assert
    assertEquals(2, collection.size());
    assertEquals("42", collection.get(0));
    assertFalse(iterator.hasNext());
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code iterator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  public void testAddAllWithCollectionIterator_given42_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, iterator);

    // Assert
    assertEquals(1, collection.size());
    assertEquals("42", collection.get(0));
    assertFalse(iterator.hasNext());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code iterator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  public void testAddAllWithCollectionIterator_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, iterator);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(actualAddAllResult);
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#addIgnoreNull(Collection, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addIgnoreNull(Collection, Object)"})
  public void testAddIgnoreNull_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    boolean actualAddIgnoreNullResult = CollectionUtils.addIgnoreNull(collection, "Object");

    // Assert
    assertEquals(2, collection.size());
    assertEquals("42", collection.get(0));
    assertEquals("Object", collection.get(1));
    assertTrue(actualAddIgnoreNullResult);
  }

  /**
   * Test {@link CollectionUtils#addIgnoreNull(Collection, Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addIgnoreNull(Collection, Object)"})
  public void testAddIgnoreNull_whenArrayList_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    boolean actualAddIgnoreNullResult = CollectionUtils.addIgnoreNull(collection, "Object");

    // Assert
    assertEquals(1, collection.size());
    assertEquals("Object", collection.get(0));
    assertTrue(actualAddIgnoreNullResult);
  }

  /**
   * Test {@link CollectionUtils#addIgnoreNull(Collection, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.addIgnoreNull(Collection, Object)"})
  public void testAddIgnoreNull_whenNull_thenReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addIgnoreNull(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_given42_whenArrayListAdd42_thenReturnZero() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_given42_whenArrayListAdd42_thenReturnZero2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_given42_whenObj_thenReturnZero() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality("Obj", collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.</li>
   *   <li>Then calls {@link PredicatedBag#getCount(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenHashBagAddObject_whenHashBagAddHashBag_thenCallsGetCount() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);
    PredicatedBag<Object> predicatedBag = mock(PredicatedBag.class);
    when(predicatedBag.getCount(Mockito.<Object>any())).thenReturn(3);
    when(predicatedBag.size()).thenReturn(1);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(predicatedBag);

    // Act
    int actualCardinalityResult = CollectionUtils.cardinality(hashBag2, collection);

    // Assert
    verify(predicatedBag).getCount(isA(Object.class));
    verify(predicatedBag).size();
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.</li>
   *   <li>Then calls {@link PredicatedBag#getCount(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenHashBag_whenHashBagAddHashBag_thenCallsGetCount() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());
    PredicatedBag<Object> predicatedBag = mock(PredicatedBag.class);
    when(predicatedBag.getCount(Mockito.<Object>any())).thenReturn(3);
    when(predicatedBag.size()).thenReturn(1);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(predicatedBag);

    // Act
    int actualCardinalityResult = CollectionUtils.cardinality(hashBag, collection);

    // Assert
    verify(predicatedBag).getCount(isA(Object.class));
    verify(predicatedBag).size();
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenNull_whenArrayListAddNull_thenReturnOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);

    // Act and Assert
    assertEquals(1, CollectionUtils.cardinality(null, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then calls {@link PredicatedBag#getCount(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenObject_whenHashBagAddObject_thenCallsGetCount() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    PredicatedBag<Object> predicatedBag = mock(PredicatedBag.class);
    when(predicatedBag.getCount(Mockito.<Object>any())).thenReturn(3);
    when(predicatedBag.size()).thenReturn(1);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(predicatedBag);

    // Act
    int actualCardinalityResult = CollectionUtils.cardinality(hashBag, collection);

    // Assert
    verify(predicatedBag).getCount(isA(Object.class));
    verify(predicatedBag).size();
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@link PredicatedBag} {@link PredicatedBag#getCount(Object)} return one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenPredicatedBagGetCountReturnOne_thenReturnOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    PredicatedBag<Object> predicatedBag = mock(PredicatedBag.class);
    when(predicatedBag.getCount(Mockito.<Object>any())).thenReturn(1);
    when(predicatedBag.size()).thenReturn(1);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(predicatedBag);

    // Act
    int actualCardinalityResult = CollectionUtils.cardinality(hashBag, collection);

    // Assert
    verify(predicatedBag).getCount(isA(Object.class));
    verify(predicatedBag).size();
    assertEquals(1, actualCardinalityResult);
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@link PredicatedBag} {@link AbstractCollectionDecorator#size()} return three.</li>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then calls {@link AbstractCollectionDecorator#size()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenPredicatedBagSizeReturnThree_whenHashBag_thenCallsSize() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    PredicatedBag<Object> predicatedBag = mock(PredicatedBag.class);
    when(predicatedBag.size()).thenReturn(3);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(predicatedBag);

    // Act
    int actualCardinalityResult = CollectionUtils.cardinality(hashBag, collection);

    // Assert
    verify(predicatedBag).size();
    assertEquals(0, actualCardinalityResult);
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>Given {@link PredicatedBag} {@link AbstractCollectionDecorator#size()} return zero.</li>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_givenPredicatedBagSizeReturnZero_whenHashBag_thenReturnOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    PredicatedBag<Object> predicatedBag = mock(PredicatedBag.class);
    when(predicatedBag.size()).thenReturn(0);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(predicatedBag);

    // Act
    int actualCardinalityResult = CollectionUtils.cardinality(hashBag, collection);

    // Assert
    verify(predicatedBag).size();
    assertEquals(1, actualCardinalityResult);
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_whenArrayList_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   * <ul>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  public void testCardinality_whenObj_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality("Obj", new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b}, {@code c}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  public void testCollateWithABC_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>(), mock(Comparator.class));

    // Assert
    assertEquals(a, actualCollateResult);
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b}, {@code c}.
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  public void testCollateWithABC_givenIndex_not_found() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    Comparator<Object> c = mock(Comparator.class);
    when(c.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(a, b, c);

    // Assert
    verify(c).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b}, {@code c}.
   * <ul>
   *   <li>Given one.</li>
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  public void testCollateWithABC_givenOne_whenComparatorCompareReturnOne_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    Comparator<Object> c = mock(Comparator.class);
    when(c.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(a, b, c);

    // Assert
    verify(c).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b}, {@code c}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  public void testCollateWithABC_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>(), mock(Comparator.class));

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, boolean)} with {@code a}, {@code b}, {@code includeDuplicates}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, boolean)"})
  public void testCollateWithABIncludeDuplicates_whenFalse_thenReturnEmpty() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>(), false);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, boolean)} with {@code a}, {@code b}, {@code includeDuplicates}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, boolean)"})
  public void testCollateWithABIncludeDuplicates_whenTrue_thenReturnEmpty() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>(), true);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable)"})
  public void testCollateWithAB_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>());

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, iterableB, comparator, true);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates2() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add(2);

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, iterableB, comparator, false);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(1));
    assertEquals(2, ((Integer) actualCollateResult.get(0)).intValue());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <ul>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, new ArrayList<>(), mock(Comparator.class),
        true);

    // Assert
    assertEquals(iterableA, actualCollateResult);
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <ul>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, iterableB, comparator, false);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(iterableA, actualCollateResult);
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, new ArrayList<>(), mock(Comparator.class),
        true);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, new ArrayList<>(), mock(Comparator.class),
        false);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   * <ul>
   *   <li>Then return first is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  public void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnFirstIs42() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(iterableA, iterableB, comparator, true);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection,
        new ChainedTransformer<>(transformer));

    // Assert
    verify(inputCollection).iterator();
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<Object>) actualCollectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code inputCollection}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  public void testCollectWithInputCollectionTransformerOutputCollection_thenReturnEmpty() {
    // Arrange and Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect((Iterable<?>) null, null,
        new ArrayList<>());

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code inputCollection}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  public void testCollectWithInputCollectionTransformerOutputCollection_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputCollection, null, new ArrayList<>());

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code inputCollection}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  public void testCollectWithInputCollectionTransformerOutputCollection_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputCollection, transformer,
        new ArrayList<>());

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code inputCollection}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  public void testCollectWithInputCollectionTransformerOutputCollection_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputCollection, transformer,
        new ArrayList<>());

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(2, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(0));
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code inputCollection}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  public void testCollectWithInputCollectionTransformerOutputCollection_whenTransformer() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputCollection, transformer,
        new ArrayList<>());

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return first is {@code Apply}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer_given42_thenReturnFirstIsApply() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<Object>) actualCollectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <ul>
   *   <li>Then return first is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer_thenReturnFirstIsNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(null);
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("foo");
    Class<Object> forNameResult = Object.class;

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection,
        new InvokerTransformer<>("Method Name", new Class[]{forNameResult}, new Object[]{"Args"}));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertNull(((List<Object>) actualCollectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection, null);

    // Assert
    assertEquals(inputCollection, actualCollectResult);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualCollectResult = CollectionUtils.collect((Iterable<Object>) null, null);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer_whenNull_thenReturnEmpty2() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection, null);

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection}, {@code transformer}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  public void testCollectWithInputCollectionTransformer_whenTransformer_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.<Object, Object>collect(inputCollection,
        mock(Transformer.class));

    // Assert
    assertEquals(inputCollection, actualCollectResult);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code inputIterator}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  public void testCollectWithInputIteratorTransformerOutputCollection_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> inputIterator = objectList.iterator();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputIterator, transformer, objectList2);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, objectList2.size());
    assertEquals("Apply", objectList2.get(0));
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(0));
    assertFalse(inputIterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code inputIterator}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  public void testCollectWithInputIteratorTransformerOutputCollection_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> inputIterator = objectList.iterator();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputIterator, transformer, objectList2);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(2, objectList2.size());
    assertEquals("Apply", objectList2.get(1));
    assertEquals(2, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code inputIterator}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  public void testCollectWithInputIteratorTransformerOutputCollection_whenNull_thenArrayList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputIterator, null, objectList2);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
    assertEquals(objectList, objectList2);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code inputIterator}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  public void testCollectWithInputIteratorTransformerOutputCollection_whenNull_thenNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect((Iterator<?>) null, null, objectList);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertNull(null);
    assertTrue(objectList.isEmpty());
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code inputIterator}, {@code transformer}, {@code outputCollection}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  public void testCollectWithInputIteratorTransformerOutputCollection_whenTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult = CollectionUtils.collect(inputIterator, transformer, objectList2);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
    assertEquals(objectList, objectList2);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code transformer}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  public void testCollectWithInputIteratorTransformer_givenApply_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> inputIterator = objectList.iterator();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputIterator, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<Object>) actualCollectResult).get(0));
    assertFalse(inputIterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code transformer}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  public void testCollectWithInputIteratorTransformer_whenNull_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputIterator, null);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code transformer}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  public void testCollectWithInputIteratorTransformer_whenNull_thenNull() {
    // Arrange and Act
    Collection<Object> actualCollectResult = CollectionUtils.collect((Iterator<Object>) null, null);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertNull(null);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code transformer}.
   * <ul>
   *   <li>When {@link Transformer}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  public void testCollectWithInputIteratorTransformer_whenTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.<Object, Object>collect(inputIterator,
        mock(Transformer.class));

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_given42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_given42_whenArrayList_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_given42_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_given42_whenArrayList_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  public void testContainsAll_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code Object[]}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  public void testContainsAnyWithCollectionObject_given42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, "42"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code Object[]}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code Coll2} and {@code Coll2}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  public void testContainsAnyWithCollectionObject_given42_whenColl2AndColl2_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2", "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code Object[]}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code Coll2}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  public void testContainsAnyWithCollectionObject_given42_whenColl2_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code Object[]}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@code Coll2}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  public void testContainsAnyWithCollectionObject_given42_whenColl2_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code Object[]}.
   * <ul>
   *   <li>Given {@code Coll2}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code Coll2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  public void testContainsAnyWithCollectionObject_givenColl2_whenArrayListAddColl2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("Coll2");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, "Coll2", "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code Object[]}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  public void testContainsAnyWithCollectionObject_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.containsAny(new ArrayList<>(), "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_givenFalse_whenPredicateTestReturnFalse_thenCallsTest() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    int actualCountMatchesResult = CollectionUtils.countMatches(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(0, actualCountMatchesResult);
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_givenTrue_whenPredicateTestReturnTrue_thenReturnOne() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    int actualCountMatchesResult = CollectionUtils.countMatches(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualCountMatchesResult);
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.countMatches(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.countMatches(null, null));
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  public void testCountMatches_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.countMatches(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#disjunction(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.disjunction(Iterable, Iterable)"})
  public void testDisjunction_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualDisjunctionResult = CollectionUtils.disjunction(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualDisjunctionResult);
  }

  /**
   * Test {@link CollectionUtils#disjunction(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.disjunction(Iterable, Iterable)"})
  public void testDisjunction_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act
    Collection<Object> actualDisjunctionResult = CollectionUtils.disjunction(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualDisjunctionResult);
  }

  /**
   * Test {@link CollectionUtils#disjunction(Iterable, Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.disjunction(Iterable, Iterable)"})
  public void testDisjunction_whenArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualDisjunctionResult = CollectionUtils.disjunction(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualDisjunctionResult);
  }

  /**
   * Test {@link CollectionUtils#emptyCollection()}.
   * <p>
   * Method under test: {@link CollectionUtils#emptyCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.emptyCollection()"})
  public void testEmptyCollection() {
    // Arrange and Act
    Collection<Object> actualEmptyCollectionResult = CollectionUtils.emptyCollection();

    // Assert
    assertTrue(actualEmptyCollectionResult instanceof List);
    assertTrue(actualEmptyCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#emptyIfNull(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  public void testEmptyIfNull_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(collection);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertEquals(1, actualEmptyIfNullResult.size());
    assertEquals("42", ((List<Object>) actualEmptyIfNullResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#emptyIfNull(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  public void testEmptyIfNull_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(collection);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertEquals(2, actualEmptyIfNullResult.size());
    assertEquals("42", ((List<Object>) actualEmptyIfNullResult).get(0));
    assertEquals("42", ((List<Object>) actualEmptyIfNullResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#emptyIfNull(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  public void testEmptyIfNull_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#emptyIfNull(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  public void testEmptyIfNull_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_given42_whenArrayListAdd42_thenCallsTest() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_givenFalse_whenAnyPredicateWithPredicatesIsPredicate_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new AnyPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_givenFalse_whenNonePredicateWithPredicatesIsPredicate_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new NonePredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_givenFalse_whenNotPredicateWithPredicate_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new NotPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_givenTrue_whenAnyPredicateWithPredicatesIsPredicate_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new AnyPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_givenTrue_whenNonePredicateWithPredicatesIsPredicate_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new NonePredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_givenTrue_whenNotPredicateWithPredicate_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new NotPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(input).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(input).iterator();
    verify(predicate1).test(isA(Object.class));
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(input).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.exists(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenEqualPredicateWithObject_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new EqualPredicate<>("Object"));

    // Assert
    verify(input).iterator();
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and equator is defaultEquator.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenEqualPredicateWithTestAndEquatorIsDefaultEquator_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new EqualPredicate<>("Test", equator));

    // Assert
    verify(input).iterator();
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link IdentityPredicate#IdentityPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenIdentityPredicateWithObject_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new IdentityPredicate<>("Object"));

    // Assert
    verify(input).iterator();
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenJavaLangObject_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Class<Object> type = Object.class;

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, new InstanceofPredicate(type));

    // Assert
    verify(input).iterator();
    assertTrue(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.exists(null, null));
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  public void testExists_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.exists(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#extractSingleton(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.extractSingleton(Collection)"})
  public void testExtractSingleton_given42_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.extractSingleton(collection));
  }

  /**
   * Test {@link CollectionUtils#extractSingleton(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.extractSingleton(Collection)"})
  public void testExtractSingleton_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.extractSingleton(collection));
  }

  /**
   * Test {@link CollectionUtils#extractSingleton(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.extractSingleton(Collection)"})
  public void testExtractSingleton_whenArrayList_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.extractSingleton(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  public void testFilter_givenFalse_whenPredicateTestReturnFalse_thenReturnTrue() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualFilterResult = CollectionUtils.filter(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(collection.isEmpty());
    assertTrue(actualFilterResult);
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  public void testFilter_givenTrue_whenPredicateTestReturnTrue_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualFilterResult = CollectionUtils.filter(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, collection.size());
    assertFalse(actualFilterResult);
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  public void testFilter_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filter(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  public void testFilter_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(CollectionUtils.filter(null, null));
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  public void testFilter_whenPredicate_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filter(collection, mock(Predicate.class)));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  public void testFilterInverse_givenFalse_whenPredicateTestReturnFalse_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualFilterInverseResult = CollectionUtils.filterInverse(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, collection.size());
    assertFalse(actualFilterInverseResult);
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  public void testFilterInverse_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualFilterInverseResult = CollectionUtils.filterInverse(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(collection.isEmpty());
    assertTrue(actualFilterInverseResult);
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  public void testFilterInverse_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filterInverse(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  public void testFilterInverse_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(CollectionUtils.filterInverse(null, null));
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  public void testFilterInverse_whenPredicate_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filterInverse(collection, mock(Predicate.class)));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_given42_whenArrayListAdd42_thenCallsTest() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_givenFalse_whenAnyPredicateWithPredicatesIsPredicate_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new AnyPredicate<>(predicate));

    // Assert
    verify(collection).iterator();
    verify(predicate).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_givenFalse_whenNonePredicateWithPredicatesIsPredicate_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new NonePredicate<>(predicate));

    // Assert
    verify(collection).iterator();
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_givenFalse_whenNotPredicateWithPredicate_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new NotPredicate<>(predicate));

    // Assert
    verify(collection).iterator();
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_givenTrue_whenAnyPredicateWithPredicatesIsPredicate_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new AnyPredicate<>(predicate));

    // Assert
    verify(collection).iterator();
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_givenTrue_whenNonePredicateWithPredicatesIsPredicate_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new NonePredicate<>(predicate));

    // Assert
    verify(collection).iterator();
    verify(predicate).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_givenTrue_whenNotPredicateWithPredicate_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new NotPredicate<>(predicate));

    // Assert
    verify(collection).iterator();
    verify(predicate).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(collection).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(collection).iterator();
    verify(predicate1).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(collection).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.find(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenEqualPredicateWithObject_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new EqualPredicate<>("Object"));

    // Assert
    verify(collection).iterator();
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and equator is defaultEquator.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenEqualPredicateWithTestAndEquatorIsDefaultEquator_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new EqualPredicate<>("Test", equator));

    // Assert
    verify(collection).iterator();
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link IdentityPredicate#IdentityPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenIdentityPredicateWithObject_thenReturnNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new IdentityPredicate<>("Object"));

    // Assert
    verify(collection).iterator();
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenJavaLangObject_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Class<Object> type = Object.class;

    // Act
    Object actualFindResult = CollectionUtils.find(collection, new InstanceofPredicate(type));

    // Assert
    verify(collection).iterator();
    assertEquals("42", actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.find(null, null));
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  public void testFind_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.find(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code closure}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  public void testForAllButLastDoWithCollectionClosure_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals("42",
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(collection, mock(Closure.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code closure}.
   * <ul>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  public void testForAllButLastDoWithCollectionClosure_thenCallsAccept() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Object actualForAllButLastDoResult = CollectionUtils.forAllButLastDo(collection, closure);

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals("42", actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code closure}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  public void testForAllButLastDoWithCollectionClosure_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(new ArrayList<>(), mock(Closure.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code closure}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  public void testForAllButLastDoWithCollectionClosure_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo((Iterable<Object>) null, null));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code closure}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  public void testForAllButLastDoWithCollectionClosure_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo((Iterable<Object>) null, mock(Closure.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure() {
    // Arrange
    new IndexOutOfBoundsException("closure");

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure2() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure3() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure4() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then calls {@link Closure#accept(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_given42_thenCallsAccept() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    Object actualForAllButLastDoResult = CollectionUtils.forAllButLastDo(iterator, closure);

    // Assert
    verify(closure).accept(isA(Object.class));
    assertEquals("42", actualForAllButLastDoResult);
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_given42_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_givenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals("42",
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator2, mock(Closure.class)));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_givenArrayListAdd422() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iterator2 = new IteratorChain<>();
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals("42",
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator2, mock(Closure.class)));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_givenArrayListAdd423() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator2.addIterator(objectList2.iterator());
    iterator2.addIterator(iterator);

    // Act and Assert
    assertEquals("42",
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator2, mock(Closure.class)));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_whenCollatingIterator() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_whenIteratorChain() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    // Act and Assert
    assertNull(CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo((Iterator<Object>) null, null));
    assertNull(null);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code closure}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  public void testForAllButLastDoWithIteratorClosure_whenNull_thenNull2() {
    // Arrange, Act and Assert
    assertNull(
        CollectionUtils.<Object, Closure<? super Object>>forAllButLastDo((Iterator<Object>) null, mock(Closure.class)));
    assertNull(null);
  }

  /**
   * Test {@link CollectionUtils#get(Iterable, int)} with {@code iterable}, {@code index}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Iterable, int)"})
  public void testGetWithIterableIndex_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.get(iterable, 1));
  }

  /**
   * Test {@link CollectionUtils#get(Iterable, int)} with {@code iterable}, {@code index}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then calls {@link Iterable#iterator()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Iterable, int)"})
  public void testGetWithIterableIndex_givenArrayListAdd42_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    Object actualGetResult = CollectionUtils.get(iterable, 0);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link CollectionUtils#get(Iterator, int)} with {@code iterator}, {@code index}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Iterator, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Iterator, int)"})
  public void testGetWithIteratorIndex_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", CollectionUtils.get(iterator, 1));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new ListIteratorWrapper<>(objectList.iterator()));

    // Act and Assert
    assertEquals("42", CollectionUtils.get(abstractListIteratorDecorator, 1));
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new LoopingListIterator<>(list));

    // Act and Assert
    assertEquals("42", CollectionUtils.get(abstractListIteratorDecorator, 1));
    assertTrue(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    Object actualGetResult = CollectionUtils.get(objectList, 1);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <ul>
   *   <li>Then return {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex_thenReturnArray() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new ObjectArrayListIterator<>("Array", "Array"));

    // Act and Assert
    assertEquals("Array", CollectionUtils.get(abstractListIteratorDecorator, 1));
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <ul>
   *   <li>Then {@link Scanner#Scanner(String)} with {@code Unsupported object type:} next is {@code type:}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex_thenScannerWithUnsupportedObjectTypeNextIsType() {
    // Arrange
    Scanner scanner = new Scanner("Unsupported object type: ");

    // Act and Assert
    assertEquals("object", CollectionUtils.get(scanner, 1));
    assertEquals("type:", scanner.next());
    assertFalse(scanner.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex_whenObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get("Object", 1));
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code Unsupported object type:}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  public void testGetWithObjectIndex_whenStringTokenizerWithUnsupportedObjectType() {
    // Arrange, Act and Assert
    assertEquals("object", CollectionUtils.get(new StringTokenizer("Unsupported object type: "), 1));
  }

  /**
   * Test {@link CollectionUtils#getCardinalityMap(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42} intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map CollectionUtils.getCardinalityMap(Iterable)"})
  public void testGetCardinalityMap_given42_whenArrayListAdd42_thenReturn42IntValueIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    Map<Object, Integer> actualCardinalityMap = CollectionUtils.getCardinalityMap(coll);

    // Assert
    assertEquals(1, actualCardinalityMap.size());
    assertEquals(1, actualCardinalityMap.get("42").intValue());
  }

  /**
   * Test {@link CollectionUtils#getCardinalityMap(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42} intValue is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map CollectionUtils.getCardinalityMap(Iterable)"})
  public void testGetCardinalityMap_given42_whenArrayListAdd42_thenReturn42IntValueIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    Map<Object, Integer> actualCardinalityMap = CollectionUtils.getCardinalityMap(coll);

    // Assert
    assertEquals(1, actualCardinalityMap.size());
    assertEquals(2, actualCardinalityMap.get("42").intValue());
  }

  /**
   * Test {@link CollectionUtils#getCardinalityMap(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map CollectionUtils.getCardinalityMap(Iterable)"})
  public void testGetCardinalityMap_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Map<Object, Integer> actualCardinalityMap = CollectionUtils.getCardinalityMap(new ArrayList<>());

    // Assert
    assertTrue(actualCardinalityMap.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code Equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 1693}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  public void testHashCodeWithCollectionEquator_given42_whenArrayListAdd42_thenReturn1693() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1693, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code Equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 54145}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  public void testHashCodeWithCollectionEquator_given42_whenArrayListAdd42_thenReturn54145() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(54145, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code Equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  public void testHashCodeWithCollectionEquator_whenArrayList_thenReturnOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code Equator}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  public void testHashCodeWithCollectionEquator_whenNull_thenReturnZero() {
    // Arrange
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(0, CollectionUtils.hashCode(null, equator));
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  public void testIntersection_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    Collection<Object> actualIntersectionResult = CollectionUtils.intersection(a, b);

    // Assert
    assertEquals(a, actualIntersectionResult);
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  public void testIntersection_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualIntersectionResult = CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult instanceof List);
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  public void testIntersection_given42_whenArrayListAdd42_thenReturnList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act
    Collection<Object> actualIntersectionResult = CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult instanceof List);
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  public void testIntersection_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualIntersectionResult = CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualIntersectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  public void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  public void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  public void testIsEmpty_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  public void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty(null));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_given42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenArrayList_whenArrayListAddArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(new ArrayList<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenHashBagAddNull_whenArrayListAddHashBag() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayList<Object> b = new ArrayList<>();
    b.add(hashBag);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenHashBagAddObject_whenArrayListAddHashBag() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> b = new ArrayList<>();
    b.add(hashBag);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenHashBagAddOne_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(1);

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(1);

    ArrayList<Object> b = new ArrayList<>();
    b.add(hashBag2);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add one.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenHashBagAddOne_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(1);

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashBag<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenHashBag_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashBag<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenHashBag_whenArrayListAddHashBag() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashBag<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(null);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a}, {@code b}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  public void testIsEqualCollectionWithABEquator_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenHashBagAddHashBag_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenHashBagAddNull_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenHashBagAddObject_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenHashBag_whenArrayListAddHashBag_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenHashBag_whenArrayListAddHashBag_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenHashMap_whenArrayListAddHashMap_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashMap<>());

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code b}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  public void testIsEqualCollectionWithAB_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isFull(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isFull(Collection)"})
  public void testIsFull_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isFull(collection));
  }

  /**
   * Test {@link CollectionUtils#isFull(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isFull(Collection)"})
  public void testIsFull_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isFull(collection));
  }

  /**
   * Test {@link CollectionUtils#isFull(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isFull(Collection)"})
  public void testIsFull_whenArrayList() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isFull(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  public void testIsNotEmpty_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isNotEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  public void testIsNotEmpty_given42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isNotEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  public void testIsNotEmpty_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isNotEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  public void testIsNotEmpty_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isNotEmpty(null));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_given42_whenArrayList_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_given42_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_given42_whenArrayList_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(2);

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  public void testIsProperSubCollection_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  public void testIsSubCollection_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  public void testIsSubCollection_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  public void testIsSubCollection_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  public void testIsSubCollection_given42_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  public void testIsSubCollection_given42_whenArrayList_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  public void testIsSubCollection_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenFalse_whenAnyPredicateWithPredicatesIsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new AnyPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenFalse_whenNonePredicateWithPredicatesIsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new NonePredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenFalse_whenNotPredicateWithPredicate_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new NotPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenTrue_whenNonePredicateWithPredicatesIsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new NonePredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_givenTrue_whenNotPredicateWithPredicate_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new NotPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(input).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(input).iterator();
    verify(predicate1).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Predicate, Predicate)} with predicate1 is {@link Predicate} and predicate2 is {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenAndPredicateWithPredicate1IsPredicateAndPredicate2IsPredicate3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new AndPredicate<>(predicate1, predicate2));

    // Assert
    verify(input).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenAnyPredicateWithPredicatesIsPredicate_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new AnyPredicate<>(predicate));

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.matchesAll(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenEqualPredicateWithObject_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new EqualPredicate<>("Object"));

    // Assert
    verify(input).iterator();
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object, Equator)} with {@code Test} and equator is defaultEquator.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenEqualPredicateWithTestAndEquatorIsDefaultEquator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new EqualPredicate<>("Test", equator));

    // Assert
    verify(input).iterator();
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@link IdentityPredicate#IdentityPredicate(Object)} with {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenIdentityPredicateWithObject_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new IdentityPredicate<>("Object"));

    // Assert
    verify(input).iterator();
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenJavaLangObject_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(objectList.iterator());
    new IndexOutOfBoundsException("predicate");
    Class<Object> type = Object.class;

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, new InstanceofPredicate(type));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.matchesAll(null, null));
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  public void testMatchesAll_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.matchesAll(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#maxSize(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.maxSize(Collection)"})
  public void testMaxSize_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(collection));
  }

  /**
   * Test {@link CollectionUtils#maxSize(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.maxSize(Collection)"})
  public void testMaxSize_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(collection));
  }

  /**
   * Test {@link CollectionUtils#maxSize(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.maxSize(Collection)"})
  public void testMaxSize_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#permutations(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  public void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(collection);

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(1, actualPermutationsResult.size());
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#permutations(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is six.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  public void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsSix() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    collection.add("42");

    // Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(collection);

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(6, actualPermutationsResult.size());
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(2));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(3));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(4));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(5));
  }

  /**
   * Test {@link CollectionUtils#permutations(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is twenty-four.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  public void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsTwentyFour() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    collection.add("42");
    collection.add("42");

    // Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(collection);

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(24, actualPermutationsResult.size());
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(18));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(19));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(20));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(21));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(22));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(23));
  }

  /**
   * Test {@link CollectionUtils#permutations(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  public void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(collection);

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(2, actualPermutationsResult.size());
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(0));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#permutations(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return first Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  public void testPermutations_whenArrayList_thenReturnFirstEmpty() {
    // Arrange and Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(new ArrayList<>());

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(1, actualPermutationsResult.size());
    assertTrue(((List<List<Object>>) actualPermutationsResult).get(0).isEmpty());
  }

  /**
   * Test {@link CollectionUtils#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_givenTrue_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualPredicatedCollectionResult = CollectionUtils.predicatedCollection(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_givenTrue_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualPredicatedCollectionResult = CollectionUtils.predicatedCollection(collection, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualPredicatedCollectionResult = CollectionUtils.predicatedCollection(new ArrayList<>(),
        mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_given42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_given42_whenArrayListAdd423() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link ArrayList#ArrayList()} add zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_givenZero_whenArrayListAddZero() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    collection.add(objectSet);

    ArrayList<Object> remove = new ArrayList<>();
    remove.add(0);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertEquals(1, actualRemoveAllResult.size());
    Object getResult = ((List<Object>) actualRemoveAllResult).get(0);
    assertTrue(getResult instanceof Set);
    assertTrue(((Set<Object>) getResult).isEmpty());
    assertSame(objectSet, getResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Then return first is {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_thenReturnFirstIsCompositeSet() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    CompositeSet<Object> objectSet = new CompositeSet<>();
    collection.add(objectSet);
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertEquals(1, actualRemoveAllResult.size());
    Object getResult = ((List<Object>) actualRemoveAllResult).get(0);
    assertTrue(getResult instanceof Set);
    assertTrue(((Set<Object>) getResult).isEmpty());
    assertSame(objectSet, getResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>Then return first is {@link ListOrderedSet#ListOrderedSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_thenReturnFirstIsListOrderedSet() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    collection.add(objectSet);
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertEquals(1, actualRemoveAllResult.size());
    Object getResult = ((List<Object>) actualRemoveAllResult).get(0);
    assertTrue(getResult instanceof Set);
    assertTrue(((Set<Object>) getResult).isEmpty());
    assertSame(objectSet, getResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection}, {@code remove}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  public void testRemoveAllWithCollectionRemoveEquator_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code remove}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  public void testRemoveAllWithCollectionRemove_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code remove}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  public void testRemoveAllWithCollectionRemove_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code remove}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  public void testRemoveAllWithCollectionRemove_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code remove}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  public void testRemoveAllWithCollectionRemove_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code remove}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  public void testRemoveAllWithCollectionRemove_given42_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    remove.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code remove}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  public void testRemoveAllWithCollectionRemove_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeCount(Collection, int, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeCount(Collection, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeCount(Collection, int, int)"})
  public void testRemoveCount_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    input.add("42");

    // Act
    Collection<Object> actualRemoveCountResult = CollectionUtils.removeCount(input, 1, 1);

    // Assert
    assertEquals(1, input.size());
    assertEquals(input, actualRemoveCountResult);
  }

  /**
   * Test {@link CollectionUtils#removeCount(Collection, int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeCount(Collection, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeCount(Collection, int, int)"})
  public void testRemoveCount_whenZero_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();

    // Act
    Collection<Object> actualRemoveCountResult = CollectionUtils.removeCount(input, 0, 0);

    // Assert
    assertTrue(input.isEmpty());
    assertEquals(input, actualRemoveCountResult);
  }

  /**
   * Test {@link CollectionUtils#removeRange(Collection, int, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeRange(Collection, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeRange(Collection, int, int)"})
  public void testRemoveRange_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    input.add("42");
    input.add("42");

    // Act
    Collection<Object> actualRemoveRangeResult = CollectionUtils.removeRange(input, 1, 3);

    // Assert
    assertTrue(actualRemoveRangeResult instanceof List);
    assertEquals(1, input.size());
    assertEquals(2, actualRemoveRangeResult.size());
    assertEquals("42", ((List<Object>) actualRemoveRangeResult).get(0));
    assertEquals("42", ((List<Object>) actualRemoveRangeResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#removeRange(Collection, int, int)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#removeRange(Collection, int, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.removeRange(Collection, int, int)"})
  public void testRemoveRange_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.removeRange(new ArrayList<>(), 10, 3));
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_given42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_given42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_given42_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@link CompositeSet#CompositeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_givenCompositeSet() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new CompositeSet<>());
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@link ListOrderedSet#ListOrderedSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_givenListOrderedSet() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new ListOrderedSet<>());
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link ArrayList#ArrayList()} add zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_givenZero_whenArrayListAddZero() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new ListOrderedSet<>());

    ArrayList<Object> retain = new ArrayList<>();
    retain.add(0);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection}, {@code retain}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  public void testRetainAllWithCollectionRetainEquator_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code retain}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  public void testRetainAllWithCollectionRetain_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code retain}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  public void testRetainAllWithCollectionRetain_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code retain}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  public void testRetainAllWithCollectionRetain_given42_whenArrayListAdd42_thenReturnList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code retain}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  public void testRetainAllWithCollectionRetain_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code retain}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  public void testRetainAllWithCollectionRetain_given42_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    retain.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code retain}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  public void testRetainAllWithCollectionRetain_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Predicate<Object> predicate = mock(Predicate.class);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate, objectList,
        new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(null, null, objectList, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection3() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, null, objectList,
        new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection4() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate, objectList,
        new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection5() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate, objectList,
        new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(2, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection6() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate, objectList,
        new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection7() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate, objectList,
        new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollection_givenFalse() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollection_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollection_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(2, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollection_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(null, null, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollection_whenNull_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, null, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  public void testSelectWithInputCollectionPredicateOutputCollection_whenPredicate() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Collection<? super Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  public void testSelectWithInputCollectionPredicate_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  public void testSelectWithInputCollectionPredicate_givenTrue_whenPredicateTestReturnTrue() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  public void testSelectWithInputCollectionPredicate_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, mock(Predicate.class));

    // Assert
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  public void testSelectWithInputCollectionPredicate_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, null);

    // Assert
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@link Iterable}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  public void testSelectWithInputCollectionPredicate_whenIterable_thenReturnList() {
    // Arrange and Act
    Collection<Object> actualSelectResult = CollectionUtils.select(mock(Iterable.class), null);

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  public void testSelectWithInputCollectionPredicate_whenNull_thenReturnList() {
    // Arrange and Act
    Collection<Object> actualSelectResult = CollectionUtils.select(null, null);

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  public void testSelectRejectedWithInputCollectionPredicateOutputCollection() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<? super Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  public void testSelectRejectedWithInputCollectionPredicateOutputCollection2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<? super Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(2, actualSelectRejectedResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectRejectedResult).get(0));
    assertEquals("42", ((List<? super Object>) actualSelectRejectedResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  public void testSelectRejectedWithInputCollectionPredicateOutputCollection_givenTrue() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<? super Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  public void testSelectRejectedWithInputCollectionPredicateOutputCollection_whenNull() {
    // Arrange and Act
    Collection<? super Object> actualSelectRejectedResult = CollectionUtils.selectRejected(null, null,
        new ArrayList<>());

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  public void testSelectRejectedWithInputCollectionPredicateOutputCollection_whenNull2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, null,
        new ArrayList<>());

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code inputCollection}, {@code predicate}, {@code outputCollection}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  public void testSelectRejectedWithInputCollectionPredicateOutputCollection_whenPredicate() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Collection<? super Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, predicate,
        new ArrayList<>());

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>Given {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  public void testSelectRejectedWithInputCollectionPredicate_givenFalse() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>Given {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  public void testSelectRejectedWithInputCollectionPredicate_givenTrue() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  public void testSelectRejectedWithInputCollectionPredicate_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection,
        mock(Predicate.class));

    // Assert
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  public void testSelectRejectedWithInputCollectionPredicate_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(inputCollection, null);

    // Assert
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@link Iterable}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  public void testSelectRejectedWithInputCollectionPredicate_whenIterable_thenReturnList() {
    // Arrange and Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(mock(Iterable.class), null);

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection}, {@code predicate}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  public void testSelectRejectedWithInputCollectionPredicate_whenNull_thenReturnList() {
    // Arrange and Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(null, null);

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new ListIteratorWrapper<>(objectList.iterator()));

    // Act and Assert
    assertEquals(0, CollectionUtils.size(abstractListIteratorDecorator));
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_given42_whenArrayListAdd42_thenReturnOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new ListIteratorWrapper<>(objectList.iterator()));

    // Act and Assert
    assertEquals(1, CollectionUtils.size(abstractListIteratorDecorator));
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>Then not {@link Scanner#Scanner(String)} with {@code Unsupported object type:} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_thenNotScannerWithUnsupportedObjectTypeHasNext() {
    // Arrange
    Scanner scanner = new Scanner("Unsupported object type: ");

    // Act and Assert
    assertEquals(3, CollectionUtils.size(scanner));
    assertFalse(scanner.hasNext());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>Then not {@link StringTokenizer#StringTokenizer(String)} with {@code Unsupported object type:} hasMoreElements.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_thenNotStringTokenizerWithUnsupportedObjectTypeHasMoreElements() {
    // Arrange
    StringTokenizer stringTokenizer = new StringTokenizer("Unsupported object type: ");

    // Act and Assert
    assertEquals(3, CollectionUtils.size(stringTokenizer));
    assertFalse(stringTokenizer.hasMoreElements());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertEquals(0, CollectionUtils.size(objectList));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then {@link HashMap#HashMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_whenHashMap_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();

    // Act and Assert
    assertEquals(0, CollectionUtils.size(objectObjectMap));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertEquals(0, CollectionUtils.size(null));
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  public void testSize_whenObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.size("Object"));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        CollectionUtils.sizeIsEmpty(new StringTokenizer("Unsupported object type: ", "Unsupported object type: ")));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty2() {
    // Arrange
    new IndexOutOfBoundsException("foo");

    // Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new ObjectArrayListIterator<>())));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    new IndexOutOfBoundsException("foo");

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new LoopingListIterator<>(list))));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenHashMap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(new HashMap<>()));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link ListIteratorWrapper#ListIteratorWrapper(Iterator)} with iterator is {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenListIteratorWrapperWithIteratorIsArrayListIterator() {
    // Arrange
    new IndexOutOfBoundsException("foo");

    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils
        .sizeIsEmpty(new AbstractListIteratorDecorator<>(new ListIteratorWrapper<>(objectList.iterator()))));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link LoopingListIterator#LoopingListIterator(List)} with list is {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenLoopingListIteratorWithListIsArrayList() {
    // Arrange
    new IndexOutOfBoundsException("foo");

    // Act and Assert
    assertTrue(
        CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new LoopingListIterator<>(new ArrayList<>()))));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(null));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link ObjectArrayListIterator#ObjectArrayListIterator(Object[])} with {@code Array}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenObjectArrayListIteratorWithArray_thenReturnFalse() {
    // Arrange
    new IndexOutOfBoundsException("foo");

    // Act and Assert
    assertFalse(
        CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new ObjectArrayListIterator<>("Array"))));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.sizeIsEmpty("Object"));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link Scanner#Scanner(String)} with empty string.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenScannerWithEmptyString_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(new Scanner("")));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link Scanner#Scanner(String)} with {@code Unsupported object type:}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenScannerWithUnsupportedObjectType_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.sizeIsEmpty(new Scanner("Unsupported object type: ")));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code Unsupported object type:}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  public void testSizeIsEmpty_whenStringTokenizerWithUnsupportedObjectType_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.sizeIsEmpty(new StringTokenizer("Unsupported object type: ")));
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_given42_whenPredicate_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_givenFalse_whenPredicateTestReturnFalse_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    Predicate<Object> p = mock(Predicate.class);
    when(p.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b, p);

    // Assert
    verify(p).test(isA(Object.class));
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    Predicate<Object> p = mock(Predicate.class);
    when(p.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b, p);

    // Assert
    verify(p).test(isA(Object.class));
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    Predicate<Object> p = mock(Predicate.class);
    when(p.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b, p);

    // Assert
    verify(p, atLeast(1)).test(isA(Object.class));
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    Predicate<Object> p = mock(Predicate.class);
    when(p.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b, p);

    // Assert
    verify(p).test(isA(Object.class));
    assertTrue(actualSubtractResult instanceof List);
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    Predicate<Object> p = mock(Predicate.class);
    when(p.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b, p);

    // Assert
    verify(p, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSubtractResult instanceof List);
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b}, {@code p}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  public void testSubtractWithABP_whenPredicate_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  public void testSubtractWithAB_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b);

    // Assert
    assertTrue(actualSubtractResult instanceof List);
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  public void testSubtractWithAB_given42_whenArrayListAdd42_thenReturnList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b);

    // Assert
    assertTrue(actualSubtractResult instanceof List);
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  public void testSubtractWithAB_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  public void testSubtractWithAB_given42_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b);

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  public void testSubtractWithAB_given42_whenArrayList_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b);

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  public void testSubtractWithAB_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#synchronizedCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#synchronizedCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.synchronizedCollection(Collection)"})
  public void testSynchronizedCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualSynchronizedCollectionResult = CollectionUtils.synchronizedCollection(collection);

    // Assert
    assertEquals(1, actualSynchronizedCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#synchronizedCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#synchronizedCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.synchronizedCollection(Collection)"})
  public void testSynchronizedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualSynchronizedCollectionResult = CollectionUtils.synchronizedCollection(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#transform(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#transform(Collection, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionUtils.transform(Collection, Transformer)"})
  public void testTransform_givenApply_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    CollectionUtils.transform(collection, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, collection.size());
    assertEquals("Apply", collection.get(0));
  }

  /**
   * Test {@link CollectionUtils#transform(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#transform(Collection, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionUtils.transform(Collection, Transformer)"})
  public void testTransform_givenApply_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    CollectionUtils.transform(collection, transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, collection.size());
    assertEquals("Apply", collection.get(0));
    assertEquals("Apply", collection.get(1));
  }

  /**
   * Test {@link CollectionUtils#transform(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then calls {@link Transformer#apply(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#transform(Collection, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollectionUtils.transform(Collection, Transformer)"})
  public void testTransform_givenApply_whenHashSetAdd42_thenCallsApply() {
    // Arrange
    HashSet<Object> collection = new HashSet<>();
    collection.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    CollectionUtils.transform(collection, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link CollectionUtils#transformingCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#transformingCollection(Collection, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.transformingCollection(Collection, Transformer)"})
  public void testTransformingCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualTransformingCollectionResult = CollectionUtils.transformingCollection(collection,
        mock(Transformer.class));

    // Assert
    assertEquals(1, actualTransformingCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#transformingCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#transformingCollection(Collection, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.transformingCollection(Collection, Transformer)"})
  public void testTransformingCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualTransformingCollectionResult = CollectionUtils.transformingCollection(collection,
        mock(Transformer.class));

    // Assert
    assertEquals(2, actualTransformingCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#transformingCollection(Collection, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#transformingCollection(Collection, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.transformingCollection(Collection, Transformer)"})
  public void testTransformingCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualTransformingCollectionResult = CollectionUtils.transformingCollection(new ArrayList<>(),
        mock(Transformer.class));

    // Assert
    assertTrue(actualTransformingCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#union(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.union(Iterable, Iterable)"})
  public void testUnion_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualUnionResult = CollectionUtils.union(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualUnionResult);
  }

  /**
   * Test {@link CollectionUtils#union(Iterable, Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.union(Iterable, Iterable)"})
  public void testUnion_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act
    Collection<Object> actualUnionResult = CollectionUtils.union(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualUnionResult);
  }

  /**
   * Test {@link CollectionUtils#union(Iterable, Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.union(Iterable, Iterable)"})
  public void testUnion_whenArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualUnionResult = CollectionUtils.union(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualUnionResult);
  }

  /**
   * Test {@link CollectionUtils#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.unmodifiableCollection(Collection)"})
  public void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = CollectionUtils.unmodifiableCollection(collection);

    // Assert
    assertEquals(1, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.unmodifiableCollection(Collection)"})
  public void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = CollectionUtils.unmodifiableCollection(collection);

    // Assert
    assertEquals(2, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CollectionUtils.unmodifiableCollection(Collection)"})
  public void testUnmodifiableCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualUnmodifiableCollectionResult = CollectionUtils.unmodifiableCollection(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableCollectionResult.isEmpty());
  }
}
