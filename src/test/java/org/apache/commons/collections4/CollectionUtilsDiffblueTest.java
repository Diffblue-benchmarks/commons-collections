package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.apache.commons.collections4.iterators.ObjectArrayListIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.junit.Test;

public class CollectionUtilsDiffblueTest {
  /**
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection, new ArrayList<>()));
    assertTrue(collection.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  public void testAddAll2() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  public void testAddAll3() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterable)}
   */
  @Test
  public void testAddAll4() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  public void testAddAll5() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  public void testAddAll6() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Enumeration)}
   */
  @Test
  public void testAddAll7() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection, new StringTokenizer("")));
    assertTrue(collection.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  public void testAddAll8() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  public void testAddAll9() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  public void testAddAll10() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Iterator)}
   */
  @Test
  public void testAddAll11() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  public void testAddAll12() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  public void testAddAll13() {
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
   * Method under test: {@link CollectionUtils#addAll(Collection, Object[])}
   */
  @Test
  public void testAddAll14() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addAll(collection));
    assertTrue(collection.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  public void testAddIgnoreNull() {
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
   * Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  public void testAddIgnoreNull2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.addIgnoreNull(collection, null));
    assertTrue(collection.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#addIgnoreNull(Collection, Object)}
   */
  @Test
  public void testAddIgnoreNull3() {
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
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality() {
    // Arrange, Act and Assert
    assertEquals(0, CollectionUtils.cardinality("Obj", new ArrayList<>()));
    assertEquals(0, CollectionUtils.cardinality(null, new ArrayList<>()));
    assertEquals(0, CollectionUtils.cardinality(null, new ArrayList<>()));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality("Obj", collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(null, collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality4() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);

    // Act and Assert
    assertEquals(1, CollectionUtils.cardinality(null, collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new HashBag<>());

    // Act and Assert
    assertEquals(1, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality7() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new HashBag<>());

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality8() {
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
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality9() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(new ArrayList<>());

    ArrayList<Object> collection = new ArrayList<>();
    collection.add(hashBag2);

    // Act and Assert
    assertEquals(0, CollectionUtils.cardinality(hashBag, collection));
  }

  /**
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality10() {
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
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality11() {
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
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality12() {
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
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality13() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

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
   * Method under test: {@link CollectionUtils#cardinality(Object, Iterable)}
   */
  @Test
  public void testCardinality14() {
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
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable)}
   */
  @Test
  public void testCollate() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>());

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#collate(Iterable, Iterable)}
   */
  @Test
  public void testCollate2() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();
    a.addAll(new ArrayList<>());

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>());

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#collate(Iterable, Iterable, boolean)}
   */
  @Test
  public void testCollate3() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>(), true);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#collate(Iterable, Iterable, boolean)}
   */
  @Test
  public void testCollate4() {
    // Arrange
    ArrayList<Comparable<? super Comparable>> a = new ArrayList<>();

    // Act
    List<Comparable<? super Comparable>> actualCollateResult = CollectionUtils.collate(a, new ArrayList<>(), false);

    // Assert
    assertTrue(actualCollateResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll3() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll4() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll5() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll6() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll7() {
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
   * Method under test:
   * {@link CollectionUtils#containsAll(Collection, Collection)}
   */
  @Test
  public void testContainsAll8() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.containsAll(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny2() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny3() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny4() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny5() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny6() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny7() {
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
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny8() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#containsAny(Collection, Collection)}
   */
  @Test
  public void testContainsAny9() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add(2);

    ArrayList<Object> coll2 = new ArrayList<>();
    coll2.add("42");
    coll2.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, coll2));
  }

  /**
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  public void testContainsAny10() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.containsAny(new ArrayList<>(), "Coll2"));
  }

  /**
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  public void testContainsAny11() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2"));
  }

  /**
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  public void testContainsAny12() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2"));
  }

  /**
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  public void testContainsAny13() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, "42"));
  }

  /**
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  public void testContainsAny14() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.containsAny(coll1, "Coll2", "Coll2"));
  }

  /**
   * Method under test: {@link CollectionUtils#containsAny(Collection, Object[])}
   */
  @Test
  public void testContainsAny15() {
    // Arrange
    ArrayList<Object> coll1 = new ArrayList<>();
    coll1.add("Coll2");

    // Act and Assert
    assertTrue(CollectionUtils.containsAny(coll1, "Coll2", "Coll2"));
  }

  /**
   * Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  public void testDisjunction() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualDisjunctionResult = CollectionUtils.disjunction(a, new ArrayList<>());

    // Assert
    assertTrue(actualDisjunctionResult instanceof List);
    assertTrue(actualDisjunctionResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  public void testDisjunction2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualDisjunctionResult = CollectionUtils.disjunction(a, new ArrayList<>());

    // Assert
    assertTrue(actualDisjunctionResult instanceof List);
    assertEquals(1, actualDisjunctionResult.size());
    assertEquals("42", ((List<Object>) actualDisjunctionResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#disjunction(Iterable, Iterable)}
   */
  @Test
  public void testDisjunction3() {
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
   * Method under test: {@link CollectionUtils#emptyCollection()}
   */
  @Test
  public void testEmptyCollection() {
    // Arrange and Act
    Collection<Object> actualEmptyCollectionResult = CollectionUtils.emptyCollection();

    // Assert
    assertTrue(actualEmptyCollectionResult instanceof List);
    assertTrue(actualEmptyCollectionResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  public void testEmptyIfNull() {
    // Arrange and Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  public void testEmptyIfNull2() {
    // Arrange and Act
    Collection<Object> actualEmptyIfNullResult = CollectionUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  public void testEmptyIfNull3() {
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
   * Method under test: {@link CollectionUtils#emptyIfNull(Collection)}
   */
  @Test
  public void testEmptyIfNull4() {
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
   * Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  public void testExtractSingleton() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.extractSingleton(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  public void testExtractSingleton2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.extractSingleton(collection));
  }

  /**
   * Method under test: {@link CollectionUtils#extractSingleton(Collection)}
   */
  @Test
  public void testExtractSingleton3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.extractSingleton(collection));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  public void testGet() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.get(iterable, 1));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Iterable, int)}
   */
  @Test
  public void testGet2() {
    // Arrange
    HashSet<Object> iterable = new HashSet<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.get(iterable, 0));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get("Object", 1));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet4() {
    // Arrange
    Scanner scanner = new Scanner("Unsupported object type: ");

    // Act and Assert
    assertEquals("object", CollectionUtils.get(scanner, 1));
    assertEquals("type:", scanner.next());
    assertFalse(scanner.hasNext());
  }

  /**
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet5() {
    // Arrange, Act and Assert
    assertEquals("object", CollectionUtils.get(new StringTokenizer("Unsupported object type: "), 1));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet6() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.get(objectList, 1));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet7() {
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
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet8() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals("42", CollectionUtils.get(new AbstractListIteratorDecorator<>(new LoopingListIterator<>(list)), 1));
  }

  /**
   * Method under test: {@link CollectionUtils#get(Object, int)}
   */
  @Test
  public void testGet9() {
    // Arrange
    AbstractListIteratorDecorator<Object> abstractListIteratorDecorator = new AbstractListIteratorDecorator<>(
        new ObjectArrayListIterator<>("Array", "Array"));

    // Act and Assert
    assertEquals("Array", CollectionUtils.get(abstractListIteratorDecorator, 1));
    assertFalse(abstractListIteratorDecorator.hasNext());
  }

  /**
   * Method under test: {@link CollectionUtils#get(Iterator, int)}
   */
  @Test
  public void testGet10() {
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
   * Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  public void testGetCardinalityMap() {
    // Arrange and Act
    Map<Object, Integer> actualCardinalityMap = CollectionUtils.getCardinalityMap(new ArrayList<>());

    // Assert
    assertTrue(actualCardinalityMap.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  public void testGetCardinalityMap2() {
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
   * Method under test: {@link CollectionUtils#getCardinalityMap(Iterable)}
   */
  @Test
  public void testGetCardinalityMap3() {
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
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  public void testHashCode() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  public void testHashCode2() {
    // Arrange
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(0, CollectionUtils.hashCode(null, equator));
  }

  /**
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  public void testHashCode3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(1693, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Method under test: {@link CollectionUtils#hashCode(Collection, Equator)}
   */
  @Test
  public void testHashCode4() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertEquals(54145, CollectionUtils.hashCode(collection, equator));
  }

  /**
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  public void testIntersection() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualIntersectionResult = CollectionUtils.intersection(a, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult instanceof List);
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  public void testIntersection2() {
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
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  public void testIntersection3() {
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
   * Method under test: {@link CollectionUtils#intersection(Iterable, Iterable)}
   */
  @Test
  public void testIntersection4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    Collection<Object> actualIntersectionResult = CollectionUtils.intersection(a, b);

    // Assert
    assertTrue(actualIntersectionResult instanceof List);
    assertEquals(1, actualIntersectionResult.size());
    assertEquals("42", ((List<Object>) actualIntersectionResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty(new ArrayList<>()));
    assertTrue(CollectionUtils.isEmpty(null));
  }

  /**
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEmpty(coll));
  }

  /**
   * Method under test: {@link CollectionUtils#isEmpty(Collection)}
   */
  @Test
  public void testIsEmpty3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEmpty(coll));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection5() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection6() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection7() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection8() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection9() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection10() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection11() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    ArrayList<Object> a = new ArrayList<>();
    a.add(hashBag);

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection12() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection)}
   */
  @Test
  public void testIsEqualCollection13() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(new HashBag<>());

    ArrayList<Object> b = new ArrayList<>();
    b.add(new HashMap<>());

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection14() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertTrue(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection15() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    ArrayList<Object> b = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection16() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection17() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act and Assert
    assertFalse(CollectionUtils.isEqualCollection(a, b, equator));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection18() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection19() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection20() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection21() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection22() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection23() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection24() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection25() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection26() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection27() {
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
   * Method under test:
   * {@link CollectionUtils#isEqualCollection(Collection, Collection, Equator)}
   */
  @Test
  public void testIsEqualCollection28() {
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
   * Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  public void testIsFull() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isFull(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  public void testIsFull2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isFull(collection));
  }

  /**
   * Method under test: {@link CollectionUtils#isFull(Collection)}
   */
  @Test
  public void testIsFull3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isFull(collection));
  }

  /**
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  public void testIsNotEmpty() {
    // Arrange, Act and Assert
    assertFalse(CollectionUtils.isNotEmpty(new ArrayList<>()));
    assertFalse(CollectionUtils.isNotEmpty(null));
  }

  /**
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  public void testIsNotEmpty2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isNotEmpty(coll));
  }

  /**
   * Method under test: {@link CollectionUtils#isNotEmpty(Collection)}
   */
  @Test
  public void testIsNotEmpty3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isNotEmpty(coll));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isProperSubCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection5() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isProperSubCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection6() {
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
   * Method under test:
   * {@link CollectionUtils#isProperSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsProperSubCollection7() {
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
   * Method under test:
   * {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsSubCollection() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsSubCollection2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsSubCollection3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.isSubCollection(a, new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsSubCollection4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsSubCollection5() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#isSubCollection(Collection, Collection)}
   */
  @Test
  public void testIsSubCollection6() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act and Assert
    assertTrue(CollectionUtils.isSubCollection(a, b));
  }

  /**
   * Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  public void testMaxSize() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  public void testMaxSize2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(collection));
  }

  /**
   * Method under test: {@link CollectionUtils#maxSize(Collection)}
   */
  @Test
  public void testMaxSize3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, CollectionUtils.maxSize(collection));
  }

  /**
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  public void testPermutations() {
    // Arrange and Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(new ArrayList<>());

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(1, actualPermutationsResult.size());
    assertTrue(((List<List<Object>>) actualPermutationsResult).get(0).isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  public void testPermutations2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<List<Object>> actualPermutationsResult = CollectionUtils.permutations(collection);

    // Assert
    assertTrue(actualPermutationsResult instanceof List);
    assertEquals(1, actualPermutationsResult.size());
    List<Object> getResult = ((List<List<Object>>) actualPermutationsResult).get(0);
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  public void testPermutations3() {
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
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  public void testPermutations4() {
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
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(0));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(1));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(2));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(3));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(4));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(5));
  }

  /**
   * Method under test: {@link CollectionUtils#permutations(Collection)}
   */
  @Test
  public void testPermutations5() {
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
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(0));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(1));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(18));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(19));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(2));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(20));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(21));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(22));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(23));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(3));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(4));
    assertEquals(collection, ((List<List<Object>>) actualPermutationsResult).get(5));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertEquals(1, actualRemoveAllResult.size());
    assertEquals("42", ((List<Object>) actualRemoveAllResult).get(0));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(null);
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertEquals(1, actualRemoveAllResult.size());
    assertNull(((List<Object>) actualRemoveAllResult).get(0));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll4() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new CompositeSet<>());
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll5() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new ListOrderedSet<>());
    ArrayList<Object> remove = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll6() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

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
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll7() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    remove.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll8() {
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
   * Method under test:
   * {@link CollectionUtils#removeAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRemoveAll9() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add(new ListOrderedSet<>());

    ArrayList<Object> remove = new ArrayList<>();
    remove.add(0);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove, equator);

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll10() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll11() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertEquals(1, actualRemoveAllResult.size());
    assertEquals("42", ((List<Object>) actualRemoveAllResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll12() {
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
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll13() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");

    // Act
    Collection<Object> actualRemoveAllResult = CollectionUtils.removeAll(collection, remove);

    // Assert
    assertTrue(actualRemoveAllResult instanceof List);
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll14() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

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
   * Method under test: {@link CollectionUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll15() {
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
   * Method under test: {@link CollectionUtils#removeCount(Collection, int, int)}
   */
  @Test
  public void testRemoveCount() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();

    // Act
    Collection<Object> actualRemoveCountResult = CollectionUtils.removeCount(input, 0, 0);

    // Assert
    assertTrue(actualRemoveCountResult instanceof List);
    assertTrue(input.isEmpty());
    assertTrue(actualRemoveCountResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#removeCount(Collection, int, int)}
   */
  @Test
  public void testRemoveCount2() {
    // Arrange
    ArrayList<Object> input = new ArrayList<>();
    input.add("42");
    input.add("42");

    // Act
    Collection<Object> actualRemoveCountResult = CollectionUtils.removeCount(input, 1, 1);

    // Assert
    assertTrue(actualRemoveCountResult instanceof List);
    assertEquals(1, input.size());
    assertEquals(1, actualRemoveCountResult.size());
    assertEquals("42", ((List<Object>) actualRemoveCountResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#removeRange(Collection, int, int)}
   */
  @Test
  public void testRemoveRange() {
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
   * Method under test: {@link CollectionUtils#removeRange(Collection, int, int)}
   */
  @Test
  public void testRemoveRange2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.removeRange(new ArrayList<>(), 10, 3));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> retain = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll2() {
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
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll3() {
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
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll4() {
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
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll5() {
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
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll6() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll7() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll8() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain, equator);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertEquals(1, actualRetainAllResult.size());
    assertEquals("42", ((List<Object>) actualRetainAllResult).get(0));
  }

  /**
   * Method under test:
   * {@link CollectionUtils#retainAll(Iterable, Iterable, Equator)}
   */
  @Test
  public void testRetainAll9() {
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
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll10() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll11() {
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
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll12() {
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
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll13() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll14() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    retain.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll15() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    Collection<Object> actualRetainAllResult = CollectionUtils.retainAll(collection, retain);

    // Assert
    assertTrue(actualRetainAllResult instanceof List);
    assertEquals(1, actualRetainAllResult.size());
    assertEquals("42", ((List<Object>) actualRetainAllResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  public void testSize() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.size("Object"));
    assertEquals(0, CollectionUtils.size(null));
    assertEquals(0, CollectionUtils.size(new HashMap<>()));
    assertEquals(0, CollectionUtils.size(new ArrayList<>()));
    assertEquals(0,
        CollectionUtils.size(new AbstractListIteratorDecorator<>(new LoopingListIterator<>(new ArrayList<>()))));
    assertEquals(1, CollectionUtils.size(new AbstractListIteratorDecorator<>(new ObjectArrayListIterator<>("Array"))));
  }

  /**
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  public void testSize2() {
    // Arrange
    Scanner scanner = new Scanner("Unsupported object type: ");

    // Act and Assert
    assertEquals(3, CollectionUtils.size(scanner));
    assertFalse(scanner.hasNext());
  }

  /**
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  public void testSize3() {
    // Arrange
    StringTokenizer stringTokenizer = new StringTokenizer("Unsupported object type: ");

    // Act and Assert
    assertEquals(3, CollectionUtils.size(stringTokenizer));
    assertFalse(stringTokenizer.hasMoreElements());
  }

  /**
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  public void testSize4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertEquals(0,
        CollectionUtils.size(new AbstractListIteratorDecorator<>(new ListIteratorWrapper<>(objectList.iterator()))));
  }

  /**
   * Method under test: {@link CollectionUtils#size(Object)}
   */
  @Test
  public void testSize5() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals(1,
        CollectionUtils.size(new AbstractListIteratorDecorator<>(new ListIteratorWrapper<>(objectList.iterator()))));
  }

  /**
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  public void testSizeIsEmpty() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CollectionUtils.sizeIsEmpty("Object"));
    assertTrue(CollectionUtils.sizeIsEmpty(null));
    assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList<>()));
    assertTrue(CollectionUtils.sizeIsEmpty(new HashMap<>()));
    assertFalse(CollectionUtils.sizeIsEmpty(new Scanner("Unsupported object type: ")));
    assertFalse(CollectionUtils.sizeIsEmpty(new StringTokenizer("Unsupported object type: ")));
    assertTrue(
        CollectionUtils.sizeIsEmpty(new StringTokenizer("Unsupported object type: ", "Unsupported object type: ")));
    assertTrue(CollectionUtils.sizeIsEmpty(new Scanner("")));
    assertTrue(
        CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new LoopingListIterator<>(new ArrayList<>()))));
    assertFalse(
        CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new ObjectArrayListIterator<>("Array"))));
    assertTrue(CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new ObjectArrayListIterator<>())));
  }

  /**
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  public void testSizeIsEmpty2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertTrue(CollectionUtils
        .sizeIsEmpty(new AbstractListIteratorDecorator<>(new ListIteratorWrapper<>(objectList.iterator()))));
  }

  /**
   * Method under test: {@link CollectionUtils#sizeIsEmpty(Object)}
   */
  @Test
  public void testSizeIsEmpty3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertFalse(CollectionUtils.sizeIsEmpty(new AbstractListIteratorDecorator<>(new LoopingListIterator<>(list))));
  }

  /**
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  public void testSubtract() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>());

    // Assert
    assertTrue(actualSubtractResult instanceof List);
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  public void testSubtract2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, new ArrayList<>());

    // Assert
    assertTrue(actualSubtractResult instanceof List);
    assertEquals(1, actualSubtractResult.size());
    assertEquals("42", ((List<Object>) actualSubtractResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  public void testSubtract3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    Collection<Object> actualSubtractResult = CollectionUtils.subtract(a, b);

    // Assert
    assertTrue(actualSubtractResult instanceof List);
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  public void testSubtract4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

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
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  public void testSubtract5() {
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
   * Method under test: {@link CollectionUtils#subtract(Iterable, Iterable)}
   */
  @Test
  public void testSubtract6() {
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
   * Method under test: {@link CollectionUtils#synchronizedCollection(Collection)}
   */
  @Test
  public void testSynchronizedCollection() {
    // Arrange and Act
    Collection<Object> actualSynchronizedCollectionResult = CollectionUtils.synchronizedCollection(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollectionResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#synchronizedCollection(Collection)}
   */
  @Test
  public void testSynchronizedCollection2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualSynchronizedCollectionResult = CollectionUtils.synchronizedCollection(collection);

    // Assert
    assertEquals(1, actualSynchronizedCollectionResult.size());
  }

  /**
   * Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  public void testUnion() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Collection<Object> actualUnionResult = CollectionUtils.union(a, new ArrayList<>());

    // Assert
    assertTrue(actualUnionResult instanceof List);
    assertTrue(actualUnionResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  public void testUnion2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    Collection<Object> actualUnionResult = CollectionUtils.union(a, new ArrayList<>());

    // Assert
    assertTrue(actualUnionResult instanceof List);
    assertEquals(1, actualUnionResult.size());
    assertEquals("42", ((List<Object>) actualUnionResult).get(0));
  }

  /**
   * Method under test: {@link CollectionUtils#union(Iterable, Iterable)}
   */
  @Test
  public void testUnion3() {
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
   * Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  public void testUnmodifiableCollection() {
    // Arrange and Act
    Collection<Object> actualUnmodifiableCollectionResult = CollectionUtils.unmodifiableCollection(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableCollectionResult.isEmpty());
  }

  /**
   * Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  public void testUnmodifiableCollection2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = CollectionUtils.unmodifiableCollection(collection);

    // Assert
    assertEquals(1, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Method under test: {@link CollectionUtils#unmodifiableCollection(Collection)}
   */
  @Test
  public void testUnmodifiableCollection3() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = CollectionUtils.unmodifiableCollection(collection);

    // Assert
    assertEquals(2, actualUnmodifiableCollectionResult.size());
  }
}
