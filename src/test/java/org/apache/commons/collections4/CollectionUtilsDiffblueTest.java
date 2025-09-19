package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CollectionUtilsDiffblueTest {
  /**
   * Test {@link CollectionUtils#addAll(Collection, Object[])} with {@code collection}, {@code
   * elements}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Object[]) with 'collection', 'elements'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Object[])"})
  void testAddAllWithCollectionElements_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Object[])} with {@code collection}, {@code
   * elements}.
   *
   * <ul>
   *   <li>When {@code Elements} and {@code Elements}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Object[]) with 'collection', 'elements'; when 'Elements' and 'Elements'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Object[])"})
  void testAddAllWithCollectionElements_whenElementsAndElements_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, "Elements", "Elements");

    // Assert
    assertEquals(2, collection.size());
    assertEquals("Elements", collection.get(0));
    assertEquals("Elements", collection.get(1));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Object[])} with {@code collection}, {@code
   * elements}.
   *
   * <ul>
   *   <li>When {@code Elements}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Object[]) with 'collection', 'elements'; when 'Elements'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Object[])"})
  void testAddAllWithCollectionElements_whenElements_thenArrayListSizeIsOne() {
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
   * Test {@link CollectionUtils#addAll(Collection, Enumeration)} with {@code collection}, {@code
   * enumeration}.
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  @DisplayName("Test addAll(Collection, Enumeration) with 'collection', 'enumeration'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Enumeration)"})
  void testAddAllWithCollectionEnumeration() {
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
   * Test {@link CollectionUtils#addAll(Collection, Enumeration)} with {@code collection}, {@code
   * enumeration}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Enumeration) with 'collection', 'enumeration'; given '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Enumeration)"})
  void testAddAllWithCollectionEnumeration_given42_thenArrayListSizeIsTwo() {
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
   * Test {@link CollectionUtils#addAll(Collection, Enumeration)} with {@code collection}, {@code
   * enumeration}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Enumeration) with 'collection', 'enumeration'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Enumeration)"})
  void testAddAllWithCollectionEnumeration_thenArrayListSizeIsOne() {
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
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code
   * iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterable) with 'collection', 'iterable'; given '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  void testAddAllWithCollectionIterable_given42_thenArrayListSizeIsOne() {
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
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code
   * iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterable) with 'collection', 'iterable'; given '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  void testAddAllWithCollectionIterable_given42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    boolean actualAddAllResult = CollectionUtils.addAll(collection, iterable);

    // Assert
    assertEquals(2, collection.size());
    assertEquals("42", collection.get(0));
    assertEquals("42", collection.get(1));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterable)} with {@code collection}, {@code
   * iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterable) with 'collection', 'iterable'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterable)"})
  void testAddAllWithCollectionIterable_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection, new ArrayList<>()));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code
   * iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterator) with 'collection', 'iterator'; given '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  void testAddAllWithCollectionIterator_given42_thenArrayListSizeIsOne() {
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
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code
   * iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterator) with 'collection', 'iterator'; given '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  void testAddAllWithCollectionIterator_given42_thenArrayListSizeIsTwo() {
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
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code
   * iterator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterator) with 'collection', 'iterator'; given '42'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  void testAddAllWithCollectionIterator_given42_whenArrayList_thenReturnTrue() {
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
   * Test {@link CollectionUtils#addAll(Collection, Iterator)} with {@code collection}, {@code
   * iterator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection, Iterator) with 'collection', 'iterator'; when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addAll(Collection, Iterator)"})
  void testAddAllWithCollectionIterator_whenArrayList_thenArrayListEmpty() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  @DisplayName(
      "Test addIgnoreNull(Collection, Object); given '42'; when ArrayList() add '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addIgnoreNull(Collection, Object)"})
  void testAddIgnoreNull_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  @DisplayName(
      "Test addIgnoreNull(Collection, Object); when ArrayList(); then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addIgnoreNull(Collection, Object)"})
  void testAddIgnoreNull_whenArrayList_thenArrayListSizeIsOne() {
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
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  @DisplayName("Test addIgnoreNull(Collection, Object); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.addIgnoreNull(Collection, Object)"})
  void testAddIgnoreNull_whenNull_thenReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addIgnoreNull(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given '42'; when ArrayList() add '42'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_given42_whenArrayListAdd42_thenReturnZero() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName("Test cardinality(Object, Iterable); given '42'; when HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_given42_whenHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code Obj}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName("Test cardinality(Object, Iterable); given '42'; when 'Obj'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_given42_whenObj_thenReturnZero() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality("Obj", collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code null}.
   *   <li>When {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given HashBag() add 'null'; when HashBag() add HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenHashBagAddNull_whenHashBagAddHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag3);

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag2, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given HashBag() add 'Object'; when HashBag() add HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenHashBagAddObject_whenHashBagAddHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag3);

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag2, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add two.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given HashBag() add two; when HashBag() add 'Object'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenHashBagAddTwo_whenHashBagAddObject_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(2);

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag2);

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add zero.
   *   <li>When {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given HashBag() add zero; when HashBag() add HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenHashBagAddZero_whenHashBagAddHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(0);
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag3);

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag2, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given HashBag(); when HashBag() add HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenHashBag_whenHashBagAddHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag2);

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given HashBag(); when HashBag(); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenHashBag_whenHashBag_thenReturnOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new HashBag<>());

    // Act and Assert
    assertEquals(1, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given 'null'; when ArrayList() add 'null'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenNull_whenArrayListAddNull_thenReturnOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);

    // Act and Assert
    assertEquals(1, CollectionUtils.cardinality(null, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given 'Object'; when HashBag() add 'Object'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenObject_whenHashBagAddObject_thenReturnOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag2);

    // Act and Assert
    assertEquals(1, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName(
      "Test cardinality(Object, Iterable); given 'Object'; when HashBag() add 'Object'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_givenObject_whenHashBagAddObject_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new HashBag<>());

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName("Test cardinality(Object, Iterable); when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName("Test cardinality(Object, Iterable); when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_whenArrayList_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#cardinality(Object, Iterable)}.
   *
   * <ul>
   *   <li>When {@code Obj}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  @DisplayName("Test cardinality(Object, Iterable); when 'Obj'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.cardinality(Object, Iterable)"})
  void testCardinality_whenObj_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality("Obj", new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b},
   * {@code c}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator) with 'a', 'b', 'c'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  void testCollateWithABC_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(a, new ArrayList<>(), mock(Comparator.class));

    // Assert
    assertEquals(a, actualCollateResult);
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b},
   * {@code c}.
   *
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator) with 'a', 'b', 'c'; given INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  void testCollateWithABC_givenIndex_not_found() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    Comparator<Object> c = mock(Comparator.class);
    when(c.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    // Act
    List<Object> actualCollateResult = CollectionUtils.collate(a, b, c);

    // Assert
    verify(c).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b},
   * {@code c}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator) with 'a', 'b', 'c'; given one; when Comparator compare(Object, Object) return one; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  void testCollateWithABC_givenOne_whenComparatorCompareReturnOne_thenReturnSizeIsTwo() {
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
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator)} with {@code a}, {@code b},
   * {@code c}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator) with 'a', 'b', 'c'; when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator)"})
  void testCollateWithABC_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(a, new ArrayList<>(), mock(Comparator.class));

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, boolean)} with {@code a}, {@code b},
   * {@code includeDuplicates}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, boolean) with 'a', 'b', 'includeDuplicates'; when 'false'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, boolean)"})
  void testCollateWithABIncludeDuplicates_whenFalse_thenReturnEmpty() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult =
        CollectionUtils.collate(a, new ArrayList<>(), false);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, boolean)} with {@code a}, {@code b},
   * {@code includeDuplicates}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, boolean) with 'a', 'b', 'includeDuplicates'; when 'true'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, boolean)"})
  void testCollateWithABIncludeDuplicates_whenTrue_thenReturnEmpty() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult =
        CollectionUtils.collate(a, new ArrayList<>(), true);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable)} with {@code a}, {@code b}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable) with 'a', 'b'; when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable)"})
  void testCollateWithAB_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult =
        CollectionUtils.collate(a, new ArrayList<>());

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenReturn(CollectionUtils.INDEX_NOT_FOUND);

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, iterableB, comparator, true);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates2() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add(2);

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, iterableB, comparator, false);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(1));
    assertEquals(2, ((Integer) actualCollateResult.get(0)).intValue());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <ul>
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, new ArrayList<>(), mock(Comparator.class), true);

    // Assert
    assertEquals(iterableA, actualCollateResult);
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <ul>
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, iterableB, comparator, false);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(iterableA, actualCollateResult);
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, new ArrayList<>(), mock(Comparator.class), true);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, new ArrayList<>(), mock(Comparator.class), false);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)} with {@code
   * iterableA}, {@code iterableB}, {@code comparator}, {@code includeDuplicates}.
   *
   * <ul>
   *   <li>Then return first is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collate(Iterable, Iterable, Comparator, boolean)}
   */
  @Test
  @DisplayName(
      "Test collate(Iterable, Iterable, Comparator, boolean) with 'iterableA', 'iterableB', 'comparator', 'includeDuplicates'; then return first is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CollectionUtils.collate(Iterable, Iterable, Comparator, boolean)"})
  void testCollateWithIterableAIterableBComparatorIncludeDuplicates_thenReturnFirstIs42() {
    // Arrange
    ArrayList<Object> iterableA = new ArrayList<>();
    iterableA.add("42");

    ArrayList<Object> iterableB = new ArrayList<>();
    iterableB.add("42");

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    List<Object> actualCollateResult =
        CollectionUtils.collate(iterableA, iterableB, comparator, true);

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualCollateResult.size());
    assertEquals("42", actualCollateResult.get(0));
    assertEquals("42", actualCollateResult.get(1));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName("Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(inputCollection.iterator()).thenReturn(boundedIteratorResult);

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName("Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer2() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(iteratorChain);

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName("Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(iteratorChain);

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName("Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    filterIterator.addTo(new ArrayList<>());

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(filterIterator);

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(inputCollection.iterator()).thenReturn(boundedIteratorResult);
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection2() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(iteratorChain);
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(iteratorChain);
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_givenCollatingIterator() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(new CollatingIterator<>());
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; given IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_givenIteratorChain() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(new IteratorChain<>());
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Given {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; given 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_givenNull() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(null);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, null, new ArrayList<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(2, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(0));
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_whenNull() {
    // Arrange and Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect((Iterable<?>) null, null, new ArrayList<>());

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_whenNull2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, null, new ArrayList<>());

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer, Collection)} with {@code
   * inputCollection}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer, Collection) with 'inputCollection', 'transformer', 'outputCollection'; when Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer, Collection)"})
  void testCollectWithInputCollectionTransformerOutputCollection_whenTransformer() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Transformer<Object, Object> transformer = mock(Transformer.class);

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, transformer, new ArrayList<>());

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; given '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_given42_thenReturnSizeIsOne() {
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
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; given ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_givenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iteratorChain = new IteratorChain<>();
    iteratorChain.addIterator(iterator);

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(iteratorChain);

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection, transformer);

    // Assert
    verify(inputCollection).iterator();
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(1, actualCollectResult.size());
    assertEquals("Apply", ((List<Object>) actualCollectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_givenCollatingIterator() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; given IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_givenIteratorChain() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(new IteratorChain<>());

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>Given {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; given 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_givenNull() {
    // Arrange
    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(null);

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection, null);

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputCollection, mock(Transformer.class));

    // Assert
    assertEquals(inputCollection, actualCollectResult);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualCollectResult = CollectionUtils.collect(inputCollection, null);

    // Assert
    assertEquals(inputCollection, actualCollectResult);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterable, Transformer)} with {@code inputCollection},
   * {@code transformer}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterable, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterable, Transformer) with 'inputCollection', 'transformer'; when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterable, Transformer)"})
  void testCollectWithInputCollectionTransformer_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualCollectResult = CollectionUtils.collect((Iterable<Object>) null, null);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code
   * inputIterator}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer, Collection) with 'inputIterator', 'transformer', 'outputCollection'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  void testCollectWithInputIteratorTransformerOutputCollection_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> inputIterator = objectList.iterator();

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputIterator, transformer, objectList2);

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
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code
   * inputIterator}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer, Collection) with 'inputIterator', 'transformer', 'outputCollection'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  void testCollectWithInputIteratorTransformerOutputCollection_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    Iterator<Object> inputIterator = objectList.iterator();

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputIterator, transformer, objectList2);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualCollectResult instanceof List);
    assertEquals(2, objectList2.size());
    assertEquals("Apply", objectList2.get(1));
    assertEquals(2, actualCollectResult.size());
    assertEquals("Apply", ((List<? super Object>) actualCollectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code
   * inputIterator}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer, Collection) with 'inputIterator', 'transformer', 'outputCollection'; when 'null'; then ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  void testCollectWithInputIteratorTransformerOutputCollection_whenNull_thenArrayList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputIterator, null, objectList2);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
    assertEquals(objectList, objectList2);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code
   * inputIterator}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer, Collection) with 'inputIterator', 'transformer', 'outputCollection'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  void testCollectWithInputIteratorTransformerOutputCollection_whenNull_thenNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect((Iterator<?>) null, null, objectList);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertNull(null);
    assertTrue(objectList.isEmpty());
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer, Collection)} with {@code
   * inputIterator}, {@code transformer}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer, Collection)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer, Collection) with 'inputIterator', 'transformer', 'outputCollection'; when Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer, Collection)"})
  void testCollectWithInputIteratorTransformerOutputCollection_whenTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();
    Transformer<Object, Object> transformer = mock(Transformer.class);
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<? super Object> actualCollectResult =
        CollectionUtils.collect(inputIterator, transformer, objectList2);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
    assertEquals(objectList, objectList2);
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer) with 'inputIterator', 'transformer'; given 'Apply'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  void testCollectWithInputIteratorTransformer_givenApply_thenReturnSizeIsOne() {
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
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer) with 'inputIterator', 'transformer'; when 'null'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  void testCollectWithInputIteratorTransformer_whenNull_thenNotArrayListIteratorHasNext() {
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
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer) with 'inputIterator', 'transformer'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  void testCollectWithInputIteratorTransformer_whenNull_thenNull() {
    // Arrange and Act
    Collection<Object> actualCollectResult = CollectionUtils.collect((Iterator<Object>) null, null);

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertNull(null);
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#collect(Iterator, Transformer)} with {@code inputIterator}, {@code
   * transformer}.
   *
   * <ul>
   *   <li>When {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#collect(Iterator, Transformer)}
   */
  @Test
  @DisplayName(
      "Test collect(Iterator, Transformer) with 'inputIterator', 'transformer'; when Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.collect(Iterator, Transformer)"})
  void testCollectWithInputIteratorTransformer_whenTransformer() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> inputIterator = objectList.iterator();

    // Act
    Collection<Object> actualCollectResult =
        CollectionUtils.collect(inputIterator, mock(Transformer.class));

    // Assert
    assertTrue(actualCollectResult instanceof List);
    assertFalse(inputIterator.hasNext());
    assertTrue(actualCollectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_given42_whenArrayListAdd42_thenReturnTrue3() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection, Collection); given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection, Collection); given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_given42_whenArrayList_thenReturnFalse2() {
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
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection, Collection); given two; when ArrayList() add two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add(2);

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAll(Collection, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection, Collection); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAll(Collection, Collection)"})
  void testContainsAll_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_given42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_given42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_given42_whenArrayList_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_given42_whenArrayList_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_given42_whenArrayList_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given two; when ArrayList() add two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_givenTwo_whenArrayListAddTwo() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; given two; when ArrayList() add two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_givenTwo_whenArrayListAddTwo2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add(2);
    coll2.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Collection)} with {@code Collection},
   * {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Collection) with 'Collection', 'Collection'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Collection)"})
  void testContainsAnyWithCollectionCollection_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Object[]) with 'Collection', 'Object[]'; given '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  void testContainsAnyWithCollectionObject_given42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, "42"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code Coll2} and {@code Coll2}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Object[]) with 'Collection', 'Object[]'; given '42'; when 'Coll2' and 'Coll2'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  void testContainsAnyWithCollectionObject_given42_whenColl2AndColl2_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act
    boolean actualContainsAnyResult = CollectionUtils.containsAny(coll1, "Coll2", "Coll2");

    // Assert
    assertFalse(actualContainsAnyResult);
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code Coll2}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Object[]) with 'Collection', 'Object[]'; given '42'; when 'Coll2'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  void testContainsAnyWithCollectionObject_given42_whenColl2_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code Coll2}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Object[]) with 'Collection', 'Object[]'; given '42'; when 'Coll2'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  void testContainsAnyWithCollectionObject_given42_whenColl2_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>Given {@code Coll2}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code Coll2}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Object[]) with 'Collection', 'Object[]'; given 'Coll2'; when ArrayList() add 'Coll2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  void testContainsAnyWithCollectionObject_givenColl2_whenArrayListAddColl2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("Coll2");

    // Act
    boolean actualContainsAnyResult = CollectionUtils.containsAny(coll1, "Coll2", "Coll2");

    // Assert
    assertTrue(actualContainsAnyResult);
  }

  /**
   * Test {@link CollectionUtils#containsAny(Collection, Object[])} with {@code Collection}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  @DisplayName(
      "Test containsAny(Collection, Object[]) with 'Collection', 'Object[]'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.containsAny(Collection, Object[])"})
  void testContainsAnyWithCollectionObject_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.containsAny(new ArrayList<>(), "Coll2"));
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test countMatches(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_givenFalse_whenPredicateTestReturnFalse_thenCallsTest() {
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
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test countMatches(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_givenTrue_whenPredicateTestReturnTrue_thenReturnOne() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test countMatches(Iterable, Predicate); when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.countMatches(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test countMatches(Iterable, Predicate); when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.countMatches(null, null));
  }

  /**
   * Test {@link CollectionUtils#countMatches(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#countMatches(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test countMatches(Iterable, Predicate); when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.countMatches(Iterable, Predicate)"})
  void testCountMatches_whenNull_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.countMatches(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#disjunction(Iterable, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test disjunction(Iterable, Iterable); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.disjunction(Iterable, Iterable)"})
  void testDisjunction_given42_whenArrayListAdd42() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test disjunction(Iterable, Iterable); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.disjunction(Iterable, Iterable)"})
  void testDisjunction_given42_whenArrayListAdd422() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test disjunction(Iterable, Iterable); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.disjunction(Iterable, Iterable)"})
  void testDisjunction_whenArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualDisjunctionResult = CollectionUtils.disjunction(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualDisjunctionResult);
  }

  /**
   * Test {@link CollectionUtils#emptyCollection()}.
   *
   * <p>Method under test: {@link CollectionUtils#emptyCollection()}
   */
  @Test
  @DisplayName("Test emptyCollection()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.emptyCollection()"})
  void testEmptyCollection() {
    // Arrange and Act
    Collection<Object> actualEmptyCollectionResult = CollectionUtils.emptyCollection();

    // Assert
    assertTrue(actualEmptyCollectionResult instanceof List);
    assertTrue(actualEmptyCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#emptyIfNull(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @DisplayName(
      "Test emptyIfNull(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  void testEmptyIfNull_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @DisplayName(
      "Test emptyIfNull(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  void testEmptyIfNull_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  void testEmptyIfNull_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#emptyIfNull(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  @DisplayName("Test emptyIfNull(Collection); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.emptyIfNull(Collection)"})
  void testEmptyIfNull_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test exists(Iterable, Predicate); given CollatingIterator(); when Iterable iterator() return CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_givenCollatingIterator_whenIterableIteratorReturnCollatingIterator() {
    // Arrange
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test exists(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_givenFalse_whenPredicateTestReturnFalse_thenCallsTest() {
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
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test exists(Iterable, Predicate); given 'null'; when Iterable iterator() return 'null'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_givenNull_whenIterableIteratorReturnNull_thenCallsIterator() {
    // Arrange
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(null);

    // Act
    boolean actualExistsResult = CollectionUtils.exists(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertFalse(actualExistsResult);
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test exists(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test exists(Iterable, Predicate); when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.exists(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test exists(Iterable, Predicate); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.exists(null, null));
  }

  /**
   * Test {@link CollectionUtils#exists(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#exists(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test exists(Iterable, Predicate); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.exists(Iterable, Predicate)"})
  void testExists_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.exists(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#extractSingleton(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  @DisplayName("Test extractSingleton(Collection); given '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.extractSingleton(Collection)"})
  void testExtractSingleton_given42_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CollectionUtils.extractSingleton(collection));
  }

  /**
   * Test {@link CollectionUtils#extractSingleton(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  @DisplayName(
      "Test extractSingleton(Collection); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.extractSingleton(Collection)"})
  void testExtractSingleton_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.extractSingleton(collection));
  }

  /**
   * Test {@link CollectionUtils#extractSingleton(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  @DisplayName(
      "Test extractSingleton(Collection); when ArrayList(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.extractSingleton(Collection)"})
  void testExtractSingleton_whenArrayList_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CollectionUtils.extractSingleton(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test filter(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  void testFilter_givenFalse_whenPredicateTestReturnFalse_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test filter(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  void testFilter_givenTrue_whenPredicateTestReturnTrue_thenArrayListSizeIsOne() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test filter(Iterable, Predicate); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  void testFilter_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filter(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test filter(Iterable, Predicate); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  void testFilter_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(CollectionUtils.filter(null, null));
  }

  /**
   * Test {@link CollectionUtils#filter(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filter(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test filter(Iterable, Predicate); when Predicate; then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filter(Iterable, Predicate)"})
  void testFilter_whenPredicate_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filter(collection, mock(Predicate.class)));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test filterInverse(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  void testFilterInverse_givenFalse_whenPredicateTestReturnFalse_thenArrayListSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test filterInverse(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  void testFilterInverse_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test filterInverse(Iterable, Predicate); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  void testFilterInverse_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filterInverse(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test filterInverse(Iterable, Predicate); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  void testFilterInverse_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertFalse(CollectionUtils.filterInverse(null, null));
  }

  /**
   * Test {@link CollectionUtils#filterInverse(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#filterInverse(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test filterInverse(Iterable, Predicate); when Predicate; then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.filterInverse(Iterable, Predicate)"})
  void testFilterInverse_whenPredicate_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.filterInverse(collection, mock(Predicate.class)));
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given CollatingIterator(); when Iterable iterator() return CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_givenCollatingIterator_whenIterableIteratorReturnCollatingIterator() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    Object actualFindResult = CollectionUtils.find(collection, mock(Predicate.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given 'false'; when Predicate test(Object) return 'false'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_givenFalse_whenPredicateTestReturnFalse_thenCallsTest() {
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
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given 'null'; when Iterable iterator() return 'null'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_givenNull_whenIterableIteratorReturnNull_thenCallsIterator() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(null);

    // Act
    Object actualFindResult = CollectionUtils.find(collection, mock(Predicate.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualFindResult);
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test find(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_givenTrue_whenPredicateTestReturnTrue_thenReturn42() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test find(Iterable, Predicate); when ArrayList(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.find(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test find(Iterable, Predicate); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.find(null, null));
  }

  /**
   * Test {@link CollectionUtils#find(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#find(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test find(Iterable, Predicate); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.find(Iterable, Predicate)"})
  void testFind_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.find(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(collection.iterator()).thenReturn(boundedIteratorResult);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure2() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(iteratorChain);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(iteratorChain);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    FilterIterator<Object> filterIterator =
        new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    filterIterator.addTo(new ArrayList<>());

    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(filterIterator);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given '42'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_given42_thenCallsAccept() {
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
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.forAllButLastDo(collection, mock(Closure.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_givenArrayListAdd42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorChain<Object> iteratorChain = new IteratorChain<>();
    iteratorChain.addIterator(iterator);

    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(iteratorChain);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertEquals("42", actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_givenArrayListAdd422() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(boundedIteratorResult);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertEquals("42", actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_givenCollatingIterator() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_givenIteratorChain() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(new IteratorChain<>());

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName("Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; given 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_givenNull() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(null);

    // Act
    Object actualForAllButLastDoResult =
        CollectionUtils.forAllButLastDo(collection, mock(Closure.class));

    // Assert
    verify(collection).iterator();
    assertNull(actualForAllButLastDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; when ArrayList(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_whenArrayList_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo(new ArrayList<>(), mock(Closure.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo((Iterable<Object>) null, null));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterable, Closure) with 'collection', 'closure'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterable, Closure)"})
  void testForAllButLastDoWithCollectionClosure_whenNull_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo((Iterable<Object>) null, mock(Closure.class)));
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterator, Closure) with 'iterator', 'closure'; given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  void testForAllButLastDoWithIteratorClosure_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertEquals("42", CollectionUtils.forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterator, Closure) with 'iterator', 'closure'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  void testForAllButLastDoWithIteratorClosure_thenCallsAccept() {
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
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterator, Closure) with 'iterator', 'closure'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  void testForAllButLastDoWithIteratorClosure_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act and Assert
    assertNull(CollectionUtils.forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterator, Closure) with 'iterator', 'closure'; then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  void testForAllButLastDoWithIteratorClosure_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    // Act and Assert
    assertNull(CollectionUtils.forAllButLastDo(iterator, mock(Closure.class)));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterator, Closure) with 'iterator', 'closure'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  void testForAllButLastDoWithIteratorClosure_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo((Iterator<Object>) null, null));
    assertNull(null);
  }

  /**
   * Test {@link CollectionUtils#forAllButLastDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllButLastDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllButLastDo(Iterator, Closure) with 'iterator', 'closure'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.forAllButLastDo(Iterator, Closure)"})
  void testForAllButLastDoWithIteratorClosure_whenNull_thenNull2() {
    // Arrange, Act and Assert
    assertNull(CollectionUtils.forAllButLastDo((Iterator<Object>) null, mock(Closure.class)));
    assertNull(null);
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_givenCollatingIterator() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(new CollatingIterator<>());

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(collection, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(collection).iterator();
    verify(closure).execute(isA(Object.class));
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@link IfClosure}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; given 'false'; then return IfClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_givenFalse_thenReturnIfClosure() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    IfClosure<? super Object> ifClosure = new IfClosure<>(predicate, mock(Closure.class));

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(collection, ifClosure);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualForAllDoResult instanceof IfClosure);
    assertEquals(1, collection.size());
    assertTrue(
        ((IfClosure<? super Object>) actualForAllDoResult).getFalseClosure() instanceof NOPClosure);
    assertEquals("42", collection.get(0));
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; given 'null'; when Iterable iterator() return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_givenNull_whenIterableIteratorReturnNull() {
    // Arrange
    Iterable<Object> collection = mock(Iterable.class);
    when(collection.iterator()).thenReturn(null);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(collection, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(collection).iterator();
    verify(closure).execute(isA(Object.class));
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then return {@link ChainedClosure}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; then return ChainedClosure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_thenReturnChainedClosure() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    ChainedClosure<? super Object> chainedClosure = new ChainedClosure<>(closure);

    // Act
    Closure<? super Object> actualForAllDoResult =
        CollectionUtils.forAllDo(collection, chainedClosure);

    // Assert
    verify(closure).accept(isA(Object.class));
    assertTrue(actualForAllDoResult instanceof ChainedClosure);
    assertEquals(1, collection.size());
    assertEquals("42", collection.get(0));
    assertEquals(1, chainedClosure.getClosures().length);
    assertEquals(1, ((ChainedClosure<? super Object>) actualForAllDoResult).getClosures().length);
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    CollectionUtils.forAllDo(collection, mock(Closure.class));

    // Assert that nothing has changed
    assertTrue(collection.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_whenClosureAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(collection, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).accept(isA(Object.class));
    verify(closure).execute(isA(Object.class));
    assertEquals(1, collection.size());
    assertEquals("42", collection.get(0));
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then empty toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; when empty; then empty toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_whenEmpty_thenEmptyToListEmpty() {
    // Arrange
    FluentIterable<Object> collection = FluentIterable.empty();

    // Act
    CollectionUtils.forAllDo(collection, mock(Closure.class));

    // Assert that nothing has changed
    assertTrue(collection.toList().isEmpty());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_whenNull_thenNull() {
    // Arrange and Act
    CollectionUtils.forAllDo((Iterable<Object>) null, mock(Closure.class));

    // Assert that nothing has changed
    assertNull(null);
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterable, Closure)} with {@code collection}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterable, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterable, Closure) with 'collection', 'closure'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterable, Closure)"})
  void testForAllDoWithCollectionClosure_whenNull_thenReturnNull() {
    // Arrange and Act
    Closure<? super Object> actualForAllDoResult =
        CollectionUtils.forAllDo((Iterable<Object>) null, null);

    // Assert
    assertNull(null);
    assertNull(null);
    assertNull(actualForAllDoResult);
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName("Test forAllDo(Iterator, Closure) with 'iterator', 'closure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> iterator = IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName("Test forAllDo(Iterator, Closure) with 'iterator', 'closure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iterator = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator.addIterator(objectList2.iterator());

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; given '42'; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_given42_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName("Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; given INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_givenIndex_not_found() {
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

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator3, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator3.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; given one; when Comparator compare(Object, Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_givenOne_whenComparatorCompareReturnOne() {
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

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator3, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(comp).compare(isA(Object.class), isA(Object.class));
    verify(closure, atLeast(1)).accept(isA(Object.class));
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator3.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_thenNotCollatingIteratorHasNext() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_thenNotCollatingIteratorHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();
    iterator2.addIterator(iterator);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator2, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; then not CollatingIterator() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_thenNotCollatingIteratorHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> iterator2 = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    iterator2.addIterator(objectList2.iterator());
    iterator2.addIterator(iterator);

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator2, closure);
    actualForAllDoResult.execute("42");

    // Assert
    verify(closure).accept(isA(Object.class));
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator2.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then not {@link ArrayList#ArrayList()} iterator hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; when Closure; then not ArrayList() iterator hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_whenClosure_thenNotArrayListIteratorHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    CollectionUtils.forAllDo(iterator, mock(Closure.class));

    // Assert that nothing has changed
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link Closure}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; when Closure; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_whenClosure_thenNull() {
    // Arrange and Act
    CollectionUtils.forAllDo((Iterator<Object>) null, mock(Closure.class));

    // Assert that nothing has changed
    assertNull(null);
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; when CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_whenCollatingIterator() {
    // Arrange
    CollatingIterator<Object> iterator = new CollatingIterator<>();

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; when IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_whenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iterator.addIterator(objectList.iterator());

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@link IteratorChain#IteratorChain()}.
   *   <li>Then not {@link IteratorChain#IteratorChain()} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; when IteratorChain(); then not IteratorChain() hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_whenIteratorChain_thenNotIteratorChainHasNext() {
    // Arrange
    IteratorChain<Object> iterator = new IteratorChain<>();

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).execute(Mockito.<Object>any());

    // Act
    Closure<? super Object> actualForAllDoResult = CollectionUtils.forAllDo(iterator, closure);
    actualForAllDoResult.execute("42");

    // Assert that nothing has changed
    verify(closure).execute(isA(Object.class));
    assertFalse(iterator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#forAllDo(Iterator, Closure)} with {@code iterator}, {@code
   * closure}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#forAllDo(Iterator, Closure)}
   */
  @Test
  @DisplayName(
      "Test forAllDo(Iterator, Closure) with 'iterator', 'closure'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Closure CollectionUtils.forAllDo(Iterator, Closure)"})
  void testForAllDoWithIteratorClosure_whenNull_thenReturnNull() {
    // Arrange and Act
    Closure<? super Object> actualForAllDoResult =
        CollectionUtils.forAllDo((Iterator<Object>) null, null);

    // Assert
    assertNull(null);
    assertNull(null);
    assertNull(actualForAllDoResult);
  }

  /**
   * Test {@link CollectionUtils#get(Iterable, int)} with {@code iterable}, {@code index}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName(
      "Test get(Iterable, int) with 'iterable', 'index'; given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Iterable, int)"})
  void testGetWithIterableIndex_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.get(iterable, 1));
  }

  /**
   * Test {@link CollectionUtils#get(Iterable, int)} with {@code iterable}, {@code index}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName(
      "Test get(Iterable, int) with 'iterable', 'index'; given ArrayList() add '42'; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Iterable, int)"})
  void testGetWithIterableIndex_givenArrayListAdd42_thenCallsIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    Iterable<Object> iterable = mock(Iterable.class);
    when(iterable.iterator()).thenReturn(objectList.iterator());

    // Act
    Object actualGetResult = CollectionUtils.get(iterable, 1);

    // Assert
    verify(iterable).iterator();
    assertEquals("42", actualGetResult);
  }

  /**
   * Test {@link CollectionUtils#get(Iterable, int)} with {@code iterable}, {@code index}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When zero.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  @DisplayName(
      "Test get(Iterable, int) with 'iterable', 'index'; given ArrayList() add '42'; when zero; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Iterable, int)"})
  void testGetWithIterableIndex_givenArrayListAdd42_whenZero_thenCallsIterator() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Iterator, int)}
   */
  @Test
  @DisplayName(
      "Test get(Iterator, int) with 'iterator', 'index'; given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Iterator, int)"})
  void testGetWithIteratorIndex_given42_whenArrayListAdd42_thenReturn42() {
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
   *
   * <p>Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @DisplayName("Test get(Object, int) with 'object', 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  void testGetWithObjectIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ListIteratorWrapper<Object> iterator = new ListIteratorWrapper<>(objectList.iterator());
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator =
        new AbstractListIteratorDecorator<>(iterator);

    // Act and Assert
    assertEquals("42", CollectionUtils.get(abstractListIteratorDecorator, 0));
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @DisplayName(
      "Test get(Object, int) with 'object', 'index'; given '42'; when ArrayList() add '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  void testGetWithObjectIndex_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @DisplayName(
      "Test get(Object, int) with 'object', 'index'; given '42'; when HashMap() '42' is '42'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  void testGetWithObjectIndex_given42_whenHashMap42Is42_thenHashMapSizeIsOne() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put("42", "42");

    // Act
    CollectionUtils.get(objectObjectMap, 0);

    // Assert that nothing has changed
    assertEquals(1, objectObjectMap.size());
    assertTrue(objectObjectMap.containsKey("42"));
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   *
   * <ul>
   *   <li>Then {@link Scanner#Scanner(String)} with {@code Unsupported object type:} next is {@code
   *       type:}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @DisplayName(
      "Test get(Object, int) with 'object', 'index'; then Scanner(String) with 'Unsupported object type:' next is 'type:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  void testGetWithObjectIndex_thenScannerWithUnsupportedObjectTypeNextIsType() {
    // Arrange
    Scanner scanner = new Scanner("Unsupported object type: ");

    // Act and Assert
    assertEquals("object", CollectionUtils.get(scanner, 1));
    assertEquals("type:", scanner.next());
    assertFalse(scanner.hasNext());
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @DisplayName(
      "Test get(Object, int) with 'object', 'index'; when 'Object'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  void testGetWithObjectIndex_whenObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get("Object", 1));
  }

  /**
   * Test {@link CollectionUtils#get(Object, int)} with {@code object}, {@code index}.
   *
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code Unsupported object
   *       type:}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  @DisplayName(
      "Test get(Object, int) with 'object', 'index'; when StringTokenizer(String) with 'Unsupported object type:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CollectionUtils.get(Object, int)"})
  void testGetWithObjectIndex_whenStringTokenizerWithUnsupportedObjectType() {
    // Arrange, Act and Assert
    assertEquals(
        "object", CollectionUtils.get(new StringTokenizer("Unsupported object type: "), 1));
  }

  /**
   * Test {@link CollectionUtils#getCardinalityMap(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42} intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  @DisplayName(
      "Test getCardinalityMap(Iterable); given '42'; when ArrayList() add '42'; then return '42' intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CollectionUtils.getCardinalityMap(Iterable)"})
  void testGetCardinalityMap_given42_whenArrayListAdd42_thenReturn42IntValueIsOne() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42} intValue is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  @DisplayName(
      "Test getCardinalityMap(Iterable); given '42'; when ArrayList() add '42'; then return '42' intValue is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CollectionUtils.getCardinalityMap(Iterable)"})
  void testGetCardinalityMap_given42_whenArrayListAdd42_thenReturn42IntValueIsTwo() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  @DisplayName("Test getCardinalityMap(Iterable); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CollectionUtils.getCardinalityMap(Iterable)"})
  void testGetCardinalityMap_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Map<Object, Integer> actualCardinalityMap =
        CollectionUtils.getCardinalityMap(new ArrayList<>());

    // Assert
    assertTrue(actualCardinalityMap.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code
   * Equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 1693}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @DisplayName(
      "Test hashCode(Collection, Equator) with 'Collection', 'Equator'; given '42'; when ArrayList() add '42'; then return '1693'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  void testHashCodeWithCollectionEquator_given42_whenArrayListAdd42_thenReturn1693() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1693, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code
   * Equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 54145}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @DisplayName(
      "Test hashCode(Collection, Equator) with 'Collection', 'Equator'; given '42'; when ArrayList() add '42'; then return '54145'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  void testHashCodeWithCollectionEquator_given42_whenArrayListAdd42_thenReturn54145() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(54145, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code
   * Equator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @DisplayName(
      "Test hashCode(Collection, Equator) with 'Collection', 'Equator'; when ArrayList(); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  void testHashCodeWithCollectionEquator_whenArrayList_thenReturnOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Test {@link CollectionUtils#hashCode(Collection, Equator)} with {@code Collection}, {@code
   * Equator}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  @DisplayName(
      "Test hashCode(Collection, Equator) with 'Collection', 'Equator'; when 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.hashCode(Collection, Equator)"})
  void testHashCodeWithCollectionEquator_whenNull_thenReturnZero() {
    // Arrange
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(0, CollectionUtils.hashCode(null, equator));
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test intersection(Iterable, Iterable); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  void testIntersection_given42_whenArrayListAdd42_thenReturnArrayList() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test intersection(Iterable, Iterable); given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  void testIntersection_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualIntersectionResult =
        CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult instanceof List);
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test intersection(Iterable, Iterable); given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  void testIntersection_given42_whenArrayListAdd42_thenReturnList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act
    Collection<Object> actualIntersectionResult =
        CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult instanceof List);
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#intersection(Iterable, Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test intersection(Iterable, Iterable); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.intersection(Iterable, Iterable)"})
  void testIntersection_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualIntersectionResult =
        CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualIntersectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @DisplayName(
      "Test isEmpty(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  void testIsEmpty_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @DisplayName("Test isEmpty(Collection); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  void testIsEmpty_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEmpty(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  @DisplayName("Test isEmpty(Collection); when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEmpty(Collection)"})
  void testIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty(null));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertTrue(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_given42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertTrue(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_given42_whenArrayList_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given HashBag() add 'null'; when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenHashBagAddNull_whenArrayListAddHashBag() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayList<Object> b = new ArrayList<>();
    b.add(hashBag);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given HashBag() add 'Object'; when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenHashBagAddObject_whenArrayListAddHashBag() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> b = new ArrayList<>();
    b.add(hashBag);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given HashBag() add one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenHashBagAddOne_thenReturnTrue() {
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

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertTrue(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add one.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given HashBag() add one; when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenHashBagAddOne_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(1);

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashBag<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given HashBag(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenHashBag_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashBag<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertTrue(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given HashBag(); when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenHashBag_whenArrayListAddHashBag() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashBag<>());
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(null);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; given two; when ArrayList() add two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertFalse(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)} with {@code a},
   * {@code b}, {@code equator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection,
   * Equator)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection, Equator) with 'a', 'b', 'equator'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection, Equator)"})
  void testIsEqualCollectionWithABEquator_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    boolean actualIsEqualCollectionResult = CollectionUtils.isEqualCollection(a, b, equator);

    // Assert
    assertTrue(actualIsEqualCollectionResult);
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given HashBag() add HashBag(); when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_givenHashBagAddHashBag_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given HashBag() add 'null'; when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_givenHashBagAddNull_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given HashBag() add 'Object'; when ArrayList() add HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_givenHashBagAddObject_whenArrayListAddHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given HashBag(); when ArrayList() add HashBag(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_givenHashBag_whenArrayListAddHashBag_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashBag#HashBag()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given HashBag(); when ArrayList() add HashBag(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_givenHashBag_whenArrayListAddHashBag_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link HashMap#HashMap()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; given HashMap(); when ArrayList() add HashMap(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_givenHashMap_whenArrayListAddHashMap_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashMap<>());

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isEqualCollection(Collection, Collection)} with {@code a}, {@code
   * b}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isEqualCollection(Collection, Collection) with 'a', 'b'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isEqualCollection(Collection, Collection)"})
  void testIsEqualCollectionWithAB_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isFull(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  @DisplayName("Test isFull(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isFull(Collection)"})
  void testIsFull_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isFull(collection));
  }

  /**
   * Test {@link CollectionUtils#isFull(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  @DisplayName("Test isFull(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isFull(Collection)"})
  void testIsFull_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isFull(collection));
  }

  /**
   * Test {@link CollectionUtils#isFull(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  @DisplayName("Test isFull(Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isFull(Collection)"})
  void testIsFull_whenArrayList() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isFull(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @DisplayName(
      "Test isNotEmpty(Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  void testIsNotEmpty_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isNotEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @DisplayName(
      "Test isNotEmpty(Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  void testIsNotEmpty_given42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isNotEmpty(coll));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @DisplayName("Test isNotEmpty(Collection); when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  void testIsNotEmpty_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isNotEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isNotEmpty(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  @DisplayName("Test isNotEmpty(Collection); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isNotEmpty(Collection)"})
  void testIsNotEmpty_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isNotEmpty(null));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_given42_whenArrayListAdd42_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_given42_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); given '42'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_given42_whenArrayList_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); given '42'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_given42_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isProperSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); given '42'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_given42_whenArrayList_thenReturnTrue2() {
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
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); given two; when ArrayList() add two; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isProperSubCollection(Collection, Collection); when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isProperSubCollection(Collection, Collection)"})
  void testIsProperSubCollection_whenArrayList_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isSubCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  void testIsSubCollection_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isSubCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  void testIsSubCollection_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isSubCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  void testIsSubCollection_given42_whenArrayListAdd42_thenReturnTrue() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isSubCollection(Collection, Collection); given '42'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  void testIsSubCollection_given42_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Test {@link CollectionUtils#isSubCollection(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test isSubCollection(Collection, Collection); given '42'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  void testIsSubCollection_given42_whenArrayList_thenReturnTrue2() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test isSubCollection(Collection, Collection); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.isSubCollection(Collection, Collection)"})
  void testIsSubCollection_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll() {
    // Arrange
    Iterable<Object> input = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    BoundedIterator<Object> boundedIteratorResult =
        IteratorUtils.boundedIterator(objectList.iterator(), 1L, 1L);
    when(input.iterator()).thenReturn(boundedIteratorResult);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    IteratorChain<Object> iteratorChain = new IteratorChain<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    iteratorChain.addIterator(objectList2.iterator());

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(iteratorChain);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_given42_whenArrayListAdd42_thenReturnFalse() {
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
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate); given CollatingIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenCollatingIterator() {
    // Arrange
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(new CollatingIterator<>());

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given CollatingIterator() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenCollatingIteratorAddIteratorArrayListIterator() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(collatingIterator);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given CollatingIterator() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenCollatingIteratorAddIteratorArrayListIterator2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(collatingIterator);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()} addIterator {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given CollatingIterator() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenCollatingIteratorAddIteratorArrayListIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    collatingIterator.addIterator(objectList2.iterator());
    collatingIterator.addIterator(iterator);

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(collatingIterator);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(input).iterator();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return {@link
   *       CollectionUtils#INDEX_NOT_FOUND}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given Comparator compare(Object, Object) return INDEX_NOT_FOUND; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenComparatorCompareReturnIndex_not_found_thenCallsCompare() {
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

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(collatingIterator);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(input).iterator();
    verify(comp).compare(isA(Object.class), isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given Comparator compare(Object, Object) return one; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(collatingIterator);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(input).iterator();
    verify(comp).compare(isA(Object.class), isA(Object.class));
    verify(predicate).test(isA(Object.class));
    assertFalse(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given Comparator compare(Object, Object) return one; when Predicate test(Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenComparatorCompareReturnOne_whenPredicateTestReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();

    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(collatingIterator);

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, predicate);

    // Assert
    verify(input).iterator();
    verify(comp).compare(isA(Object.class), isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()} addIterator {@link ArrayList#ArrayList()}
   *       iterator.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given IteratorChain() addIterator ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenIteratorChainAddIteratorArrayListIterator() {
    // Arrange
    IteratorChain<Object> iteratorChain = new IteratorChain<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorChain.addIterator(objectList.iterator());

    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(iteratorChain);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IteratorChain#IteratorChain()}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@link
   *       IteratorChain#IteratorChain()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given IteratorChain(); when Iterable iterator() return IteratorChain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenIteratorChain_whenIterableIteratorReturnIteratorChain() {
    // Arrange
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(new IteratorChain<>());

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Iterable} {@link Iterable#iterator()} return {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given 'null'; when Iterable iterator() return 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenNull_whenIterableIteratorReturnNull_thenReturnTrue() {
    // Arrange
    Iterable<Object> input = mock(Iterable.class);
    when(input.iterator()).thenReturn(null);

    // Act
    boolean actualMatchesAllResult = CollectionUtils.matchesAll(input, mock(Predicate.class));

    // Assert
    verify(input).iterator();
    assertTrue(actualMatchesAllResult);
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test matchesAll(Iterable, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.matchesAll(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.matchesAll(null, null));
  }

  /**
   * Test {@link CollectionUtils#matchesAll(Iterable, Predicate)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#matchesAll(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test matchesAll(Iterable, Predicate); when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.matchesAll(Iterable, Predicate)"})
  void testMatchesAll_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.matchesAll(null, mock(Predicate.class)));
  }

  /**
   * Test {@link CollectionUtils#maxSize(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  @DisplayName("Test maxSize(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.maxSize(Collection)"})
  void testMaxSize_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(collection));
  }

  /**
   * Test {@link CollectionUtils#maxSize(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  @DisplayName("Test maxSize(Collection); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.maxSize(Collection)"})
  void testMaxSize_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(collection));
  }

  /**
   * Test {@link CollectionUtils#maxSize(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  @DisplayName("Test maxSize(Collection); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.maxSize(Collection)"})
  void testMaxSize_whenArrayList() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#permutations(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @DisplayName(
      "Test permutations(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @DisplayName(
      "Test permutations(Collection); given '42'; when ArrayList() add '42'; then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsSix() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is twenty-four.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @DisplayName(
      "Test permutations(Collection); given '42'; when ArrayList() add '42'; then return size is twenty-four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsTwentyFour() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @DisplayName(
      "Test permutations(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  void testPermutations_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return first Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  @DisplayName("Test permutations(Collection); when ArrayList(); then return first Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.permutations(Collection)"})
  void testPermutations_whenArrayList_thenReturnFirstEmpty() {
    // Arrange and Act
    Collection<List<Object>> actualPermutationsResult =
        CollectionUtils.permutations(new ArrayList<>());

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(1, actualPermutationsResult.size());
    assertTrue(((List<List<Object>>) actualPermutationsResult).get(0).isEmpty());
  }

  /**
   * Test {@link CollectionUtils#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); given 'true'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.predicatedCollection(Collection, Predicate)"})
  void testPredicatedCollection_givenTrue_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualPredicatedCollectionResult =
        CollectionUtils.predicatedCollection(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); given 'true'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.predicatedCollection(Collection, Predicate)"})
  void testPredicatedCollection_givenTrue_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualPredicatedCollectionResult =
        CollectionUtils.predicatedCollection(collection, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.predicatedCollection(Collection, Predicate)"})
  void testPredicatedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualPredicatedCollectionResult =
        CollectionUtils.predicatedCollection(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; given '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_given42_thenReturnList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_given42_whenArrayListAdd423() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; given INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_givenIndex_not_found() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);

    ArrayList<Object> remove = new ArrayList<>();
    remove.add(CollectionUtils.INDEX_NOT_FOUND);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code remove}, {@code equator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Iterable, Iterable, Equator) with 'collection', 'remove', 'equator'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Iterable, Iterable, Equator)"})
  void testRemoveAllWithCollectionRemoveEquator_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code
   * remove}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection, Collection) with 'collection', 'remove'; given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  void testRemoveAllWithCollectionRemove_given42_whenArrayListAdd42_thenReturnList() {
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
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code
   * remove}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection, Collection) with 'collection', 'remove'; given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  void testRemoveAllWithCollectionRemove_given42_whenArrayListAdd42_thenReturnList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    remove.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code
   * remove}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection, Collection) with 'collection', 'remove'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  void testRemoveAllWithCollectionRemove_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code
   * remove}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection, Collection) with 'collection', 'remove'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  void testRemoveAllWithCollectionRemove_given42_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeAll(Collection, Collection)} with {@code collection}, {@code
   * remove}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection, Collection) with 'collection', 'remove'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeAll(Collection, Collection)"})
  void testRemoveAllWithCollectionRemove_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    Collection<Object> actualRemoveAllResult =
        CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link CollectionUtils#removeCount(Collection, int, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeCount(Collection, int, int)}
   */
  @Test
  @DisplayName(
      "Test removeCount(Collection, int, int); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeCount(Collection, int, int)"})
  void testRemoveCount_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
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
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeCount(Collection, int, int)}
   */
  @Test
  @DisplayName("Test removeCount(Collection, int, int); when zero; then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeCount(Collection, int, int)"})
  void testRemoveCount_whenZero_thenArrayListEmpty() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeRange(Collection, int, int)}
   */
  @Test
  @DisplayName(
      "Test removeRange(Collection, int, int); given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeRange(Collection, int, int)"})
  void testRemoveRange_given42_whenArrayListAdd42_thenReturnList() {
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
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#removeRange(Collection, int, int)}
   */
  @Test
  @DisplayName(
      "Test removeRange(Collection, int, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.removeRange(Collection, int, int)"})
  void testRemoveRange_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CollectionUtils.removeRange(new ArrayList<>(), 1, 0));
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; given '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_given42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; given '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_given42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; given '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_given42_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; given '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_given42_thenReturnList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@link CollectionUtils#INDEX_NOT_FOUND}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; given INDEX_NOT_FOUND")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_givenIndex_not_found() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);

    ArrayList<Object> retain = new ArrayList<>();
    retain.add(CollectionUtils.INDEX_NOT_FOUND);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_givenNull_whenArrayListAddNull() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)} with {@code collection},
   * {@code retain}, {@code equator}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Iterable, Iterable, Equator) with 'collection', 'retain', 'equator'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Iterable, Iterable, Equator)"})
  void testRetainAllWithCollectionRetainEquator_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code
   * retain}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection, Collection) with 'collection', 'retain'; given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  void testRetainAllWithCollectionRetain_given42_whenArrayListAdd42_thenReturnArrayList() {
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
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code
   * retain}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection, Collection) with 'collection', 'retain'; given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  void testRetainAllWithCollectionRetain_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code
   * retain}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection, Collection) with 'collection', 'retain'; given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  void testRetainAllWithCollectionRetain_given42_whenArrayListAdd42_thenReturnList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code
   * retain}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection, Collection) with 'collection', 'retain'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  void testRetainAllWithCollectionRetain_given42_whenArrayList_thenReturnArrayList() {
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
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code
   * retain}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection, Collection) with 'collection', 'retain'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  void testRetainAllWithCollectionRetain_given42_whenArrayList_thenReturnArrayList2() {
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
   * Test {@link CollectionUtils#retainAll(Collection, Collection)} with {@code collection}, {@code
   * retain}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection, Collection) with 'collection', 'retain'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.retainAll(Collection, Collection)"})
  void testRetainAllWithCollectionRetain_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    Collection<Object> actualRetainAllResult =
        CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test select(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<? super Object> predicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate);

    // Assert
    verify(inputCollection).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test select(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new EqualPredicate<>("Test", equator));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test select(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new NonePredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test select(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    NonePredicate<? super Object> predicate3 =
        new NonePredicate<>(predicate, predicate2, mock(Predicate.class));

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, predicate3);

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Predicate<Object> predicate = mock(Predicate.class);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, objectList, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(null, null, objectList, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection3() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, null, objectList, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection4() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, objectList, new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection5() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, objectList, new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection6() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, objectList, new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}, {@code rejectedCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection, Collection) with 'inputCollection', 'predicate', 'outputCollection', 'rejectedCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Collection CollectionUtils.select(Iterable, Predicate, Collection, Collection)"
  })
  void testSelectWithInputCollectionPredicateOutputCollectionRejectedCollection7() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, objectList, new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(2, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  void testSelectWithInputCollectionPredicateOutputCollection_givenFalse() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  void testSelectWithInputCollectionPredicateOutputCollection_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  void testSelectWithInputCollectionPredicateOutputCollection_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(2, actualSelectResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(0));
    assertEquals("42", ((List<? super Object>) actualSelectResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  void testSelectWithInputCollectionPredicateOutputCollection_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(null, null, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  void testSelectWithInputCollectionPredicateOutputCollection_whenNull_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, null, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate, Collection)"})
  void testSelectWithInputCollectionPredicateOutputCollection_whenPredicate() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Collection<? super Object> actualSelectResult =
        CollectionUtils.select(inputCollection, predicate, new ArrayList<>());

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; given '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_given42_thenReturnArrayList() {
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
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; given '42'; when ArrayList() add '42'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_given42_whenArrayListAdd42_thenCallsTest() {
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
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; given 'false'; when NotPredicate(Predicate) with Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_givenFalse_whenNotPredicateWithPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new NotPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; given 'true'; when NotPredicate(Predicate) with Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_givenTrue_whenNotPredicateWithPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new NotPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link AllPredicate#AllPredicate(Predicate[])} with predicates is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when AllPredicate(Predicate[]) with predicates is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenAllPredicateWithPredicatesIsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new AllPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])} with predicates is {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when AnyPredicate(Predicate[]) with predicates is Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenAnyPredicateWithPredicatesIsPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new AnyPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when AnyPredicate(Predicate[]); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenAnyPredicate_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new AnyPredicate<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, mock(Predicate.class));

    // Assert
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectResult = CollectionUtils.select(inputCollection, null);

    // Assert
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when EqualPredicate(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenEqualPredicateWithObject() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new EqualPredicate<>("Object"));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link IdentityPredicate#IdentityPredicate(Object)} with {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when IdentityPredicate(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenIdentityPredicateWithObject() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new IdentityPredicate<>("Object"));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link Iterable}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when Iterable; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenIterable_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualSelectResult = CollectionUtils.select(mock(Iterable.class), null);

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when 'java.lang.Object'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenJavaLangObject_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());
    Class<Object> type = Object.class;

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new InstanceofPredicate(type));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when NonePredicate(Predicate[]); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenNonePredicate_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectResult =
        CollectionUtils.select(inputCollection, new NonePredicate<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectResult instanceof List);
    assertEquals(1, actualSelectResult.size());
    assertEquals("42", ((List<Object>) actualSelectResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#select(Iterable, Predicate)} with {@code inputCollection}, {@code
   * predicate}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#select(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test select(Iterable, Predicate) with 'inputCollection', 'predicate'; when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.select(Iterable, Predicate)"})
  void testSelectWithInputCollectionPredicate_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualSelectResult = CollectionUtils.select(null, null);

    // Assert
    assertTrue(actualSelectResult instanceof List);
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new AllPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate1 = mock(Predicate.class);
    when(predicate1.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    AndPredicate<? super Object> predicate = new AndPredicate<>(predicate1, predicate2);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(inputCollection).iterator();
    verify(predicate1).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new AnyPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());
    DefaultEquator<Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new EqualPredicate<>("Test", equator));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new NonePredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName("Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate6() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.test(Mockito.<Object>any())).thenReturn(true);

    NonePredicate<? super Object> predicate3 =
        new NonePredicate<>(predicate, predicate2, mock(Predicate.class));

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate3);

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    verify(predicate2).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  void testSelectRejectedWithInputCollectionPredicateOutputCollection() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<? super Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate, new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  void testSelectRejectedWithInputCollectionPredicateOutputCollection2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<? super Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate, new ArrayList<>());

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(2, actualSelectRejectedResult.size());
    assertEquals("42", ((List<? super Object>) actualSelectRejectedResult).get(0));
    assertEquals("42", ((List<? super Object>) actualSelectRejectedResult).get(1));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>Given {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; given 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  void testSelectRejectedWithInputCollectionPredicateOutputCollection_givenTrue() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<? super Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate, new ArrayList<>());

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  void testSelectRejectedWithInputCollectionPredicateOutputCollection_whenNull() {
    // Arrange and Act
    Collection<? super Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(null, null, new ArrayList<>());

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  void testSelectRejectedWithInputCollectionPredicateOutputCollection_whenNull2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<? super Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, null, new ArrayList<>());

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)} with {@code
   * inputCollection}, {@code predicate}, {@code outputCollection}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate, Collection) with 'inputCollection', 'predicate', 'outputCollection'; when Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate, Collection)"})
  void testSelectRejectedWithInputCollectionPredicateOutputCollection_whenPredicate() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    Predicate<Object> predicate = mock(Predicate.class);

    // Act
    Collection<? super Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate, new ArrayList<>());

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; given '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_given42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link AnyPredicate#AnyPredicate(Predicate[])}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when AnyPredicate(Predicate[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenAnyPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new AnyPredicate<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, mock(Predicate.class));

    // Assert
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, null);

    // Assert
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link EqualPredicate#EqualPredicate(Object)} with {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when EqualPredicate(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenEqualPredicateWithObject() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new EqualPredicate<>("Object"));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link IdentityPredicate#IdentityPredicate(Object)} with {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when IdentityPredicate(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenIdentityPredicateWithObject() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new IdentityPredicate<>("Object"));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link Iterable}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when Iterable; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenIterable_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(mock(Iterable.class), null);

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when 'java.lang.Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenJavaLangObject() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());
    Class<Object> type = Object.class;

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new InstanceofPredicate(type));

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link NonePredicate#NonePredicate(Predicate[])}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when NonePredicate(Predicate[]); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenNonePredicate_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new NonePredicate<>());

    // Assert
    verify(inputCollection).iterator();
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when NotPredicate(Predicate) with Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenNotPredicateWithPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new NotPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertEquals(1, actualSelectRejectedResult.size());
    assertEquals("42", ((List<Object>) actualSelectRejectedResult).get(0));
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when NotPredicate(Predicate) with Predicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenNotPredicateWithPredicate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    Iterable<Object> inputCollection = mock(Iterable.class);
    when(inputCollection.iterator()).thenReturn(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Collection<Object> actualSelectRejectedResult =
        CollectionUtils.selectRejected(inputCollection, new NotPredicate<>(predicate));

    // Assert
    verify(inputCollection).iterator();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#selectRejected(Iterable, Predicate)} with {@code inputCollection},
   * {@code predicate}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#selectRejected(Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test selectRejected(Iterable, Predicate) with 'inputCollection', 'predicate'; when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.selectRejected(Iterable, Predicate)"})
  void testSelectRejectedWithInputCollectionPredicate_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualSelectRejectedResult = CollectionUtils.selectRejected(null, null);

    // Assert
    assertTrue(actualSelectRejectedResult instanceof List);
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   *
   * <ul>
   *   <li>Then not {@link Scanner#Scanner(String)} with {@code Unsupported object type:} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @DisplayName(
      "Test size(Object); then not Scanner(String) with 'Unsupported object type:' hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  void testSize_thenNotScannerWithUnsupportedObjectTypeHasNext() {
    // Arrange
    Scanner scanner = new Scanner("Unsupported object type: ");

    // Act and Assert
    assertEquals(3, CollectionUtils.size(scanner));
    assertFalse(scanner.hasNext());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   *
   * <ul>
   *   <li>Then not {@link StringTokenizer#StringTokenizer(String)} with {@code Unsupported object
   *       type:} hasMoreElements.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @DisplayName(
      "Test size(Object); then not StringTokenizer(String) with 'Unsupported object type:' hasMoreElements")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  void testSize_thenNotStringTokenizerWithUnsupportedObjectTypeHasMoreElements() {
    // Arrange
    StringTokenizer stringTokenizer = new StringTokenizer("Unsupported object type: ");

    // Act and Assert
    assertEquals(3, CollectionUtils.size(stringTokenizer));
    assertFalse(stringTokenizer.hasMoreElements());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @DisplayName("Test size(Object); when ArrayList(); then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  void testSize_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertEquals(0, CollectionUtils.size(objectList));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @DisplayName("Test size(Object); when HashMap(); then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  void testSize_whenHashMap_thenHashMapEmpty() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();

    // Act and Assert
    assertEquals(0, CollectionUtils.size(objectObjectMap));
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @DisplayName("Test size(Object); when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  void testSize_whenNull_thenNull() {
    // Arrange, Act and Assert
    assertNull(null);
    assertEquals(0, CollectionUtils.size(null));
  }

  /**
   * Test {@link CollectionUtils#size(Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  @DisplayName("Test size(Object); when 'Object'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CollectionUtils.size(Object)"})
  void testSize_whenObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.size("Object"));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName("Test sizeIsEmpty(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        CollectionUtils.sizeIsEmpty(
            new StringTokenizer("Unsupported object type: ", "Unsupported object type: ")));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName("Test sizeIsEmpty(Object); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList<>()));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName("Test sizeIsEmpty(Object); when HashMap(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty_whenHashMap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(new HashMap<>()));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName("Test sizeIsEmpty(Object); when 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.sizeIsEmpty(null));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName("Test sizeIsEmpty(Object); when 'Object'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty_whenObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.sizeIsEmpty("Object"));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <ul>
   *   <li>When {@link Scanner#Scanner(String)} with {@code Unsupported object type:}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName(
      "Test sizeIsEmpty(Object); when Scanner(String) with 'Unsupported object type:'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty_whenScannerWithUnsupportedObjectType_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.sizeIsEmpty(new Scanner("Unsupported object type: ")));
  }

  /**
   * Test {@link CollectionUtils#sizeIsEmpty(Object)}.
   *
   * <ul>
   *   <li>When {@link StringTokenizer#StringTokenizer(String)} with {@code Unsupported object
   *       type:}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  @DisplayName(
      "Test sizeIsEmpty(Object); when StringTokenizer(String) with 'Unsupported object type:'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CollectionUtils.sizeIsEmpty(Object)"})
  void testSizeIsEmpty_whenStringTokenizerWithUnsupportedObjectType_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.sizeIsEmpty(new StringTokenizer("Unsupported object type: ")));
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; given '42'; when Predicate; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_given42_whenPredicate_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualSubtractResult =
        CollectionUtils.subtract(a, new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; given 'false'; when Predicate test(Object) return 'false'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_givenFalse_whenPredicateTestReturnFalse_thenReturnArrayList() {
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
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; given 'true'; when Predicate test(Object) return 'true'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList() {
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
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; given 'true'; when Predicate test(Object) return 'true'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList2() {
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
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; given 'true'; when Predicate test(Object) return 'true'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnList() {
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
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; given 'true'; when Predicate test(Object) return 'true'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_givenTrue_whenPredicateTestReturnTrue_thenReturnList2() {
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
   * Test {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)} with {@code a}, {@code b},
   * {@code p}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable, Predicate)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable, Predicate) with 'a', 'b', 'p'; when Predicate; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable, Predicate)"})
  void testSubtractWithABP_whenPredicate_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualSubtractResult =
        CollectionUtils.subtract(a, new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#subtract(Iterable, Iterable)} with {@code a}, {@code b}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  void testSubtractWithAB_given42_whenArrayListAdd42_thenReturnList() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable) with 'a', 'b'; given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  void testSubtractWithAB_given42_whenArrayListAdd42_thenReturnList2() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable) with 'a', 'b'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  void testSubtractWithAB_given42_whenArrayList_thenReturnArrayList() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable) with 'a', 'b'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  void testSubtractWithAB_given42_whenArrayList_thenReturnArrayList2() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable) with 'a', 'b'; given '42'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  void testSubtractWithAB_given42_whenArrayList_thenReturnArrayList3() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  @DisplayName(
      "Test subtract(Iterable, Iterable) with 'a', 'b'; when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.subtract(Iterable, Iterable)"})
  void testSubtractWithAB_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualSubtractResult);
  }

  /**
   * Test {@link CollectionUtils#synchronizedCollection(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#synchronizedCollection(Collection)}
   */
  @Test
  @DisplayName(
      "Test synchronizedCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.synchronizedCollection(Collection)"})
  void testSynchronizedCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualSynchronizedCollectionResult =
        CollectionUtils.synchronizedCollection(collection);

    // Assert
    assertEquals(1, actualSynchronizedCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#synchronizedCollection(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#synchronizedCollection(Collection)}
   */
  @Test
  @DisplayName("Test synchronizedCollection(Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.synchronizedCollection(Collection)"})
  void testSynchronizedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualSynchronizedCollectionResult =
        CollectionUtils.synchronizedCollection(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#transform(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#transform(Collection, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transform(Collection, Transformer); given 'Apply'; when Transformer apply(Object) return 'Apply'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionUtils.transform(Collection, Transformer)"})
  void testTransform_givenApply_whenTransformerApplyReturnApply_thenArrayListSizeIsOne() {
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
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#transform(Collection, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transform(Collection, Transformer); given 'Apply'; when Transformer apply(Object) return 'Apply'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CollectionUtils.transform(Collection, Transformer)"})
  void testTransform_givenApply_whenTransformerApplyReturnApply_thenArrayListSizeIsTwo() {
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
   * Test {@link CollectionUtils#transformingCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#transformingCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.transformingCollection(Collection, Transformer)"})
  void testTransformingCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualTransformingCollectionResult =
        CollectionUtils.transformingCollection(collection, mock(Transformer.class));

    // Assert
    assertEquals(1, actualTransformingCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#transformingCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#transformingCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.transformingCollection(Collection, Transformer)"})
  void testTransformingCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualTransformingCollectionResult =
        CollectionUtils.transformingCollection(collection, mock(Transformer.class));

    // Assert
    assertEquals(2, actualTransformingCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#transformingCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#transformingCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.transformingCollection(Collection, Transformer)"})
  void testTransformingCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualTransformingCollectionResult =
        CollectionUtils.transformingCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformingCollectionResult.isEmpty());
  }

  /**
   * Test {@link CollectionUtils#union(Iterable, Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test union(Iterable, Iterable); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.union(Iterable, Iterable)"})
  void testUnion_given42_whenArrayListAdd42() {
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test union(Iterable, Iterable); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.union(Iterable, Iterable)"})
  void testUnion_given42_whenArrayListAdd422() {
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  @DisplayName("Test union(Iterable, Iterable); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.union(Iterable, Iterable)"})
  void testUnion_whenArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualUnionResult = CollectionUtils.union(a, new ArrayList<>());

    // Assert
    assertEquals(a, actualUnionResult);
  }

  /**
   * Test {@link CollectionUtils#unmodifiableCollection(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.unmodifiableCollection(Collection)"})
  void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult =
        CollectionUtils.unmodifiableCollection(collection);

    // Assert
    assertEquals(1, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#unmodifiableCollection(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableCollection(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.unmodifiableCollection(Collection)"})
  void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult =
        CollectionUtils.unmodifiableCollection(collection);

    // Assert
    assertEquals(2, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link CollectionUtils#unmodifiableCollection(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableCollection(Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection CollectionUtils.unmodifiableCollection(Collection)"})
  void testUnmodifiableCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualUnmodifiableCollectionResult =
        CollectionUtils.unmodifiableCollection(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableCollectionResult.isEmpty());
  }
}
