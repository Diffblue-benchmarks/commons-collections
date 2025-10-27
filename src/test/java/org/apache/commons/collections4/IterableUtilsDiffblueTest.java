package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.ReverseListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.UniqueFilterIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.apache.commons.collections4.set.CompositeSet;
import org.junit.Test;

public class IterableUtilsDiffblueTest {
  /**
   * Method under test: {@link IterableUtils#boundedIterable(Iterable, long)}
   */
  @Test
  public void testBoundedIterable() {
    // Arrange and Act
    Iterable<Object> actualBoundedIterableResult = IterableUtils.boundedIterable(new ArrayList<>(), 3L);
    Iterator<Object> actualIteratorResult = actualBoundedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof BoundedIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#chainedIterable(Iterable, Iterable)}
   */
  @Test
  public void testChainedIterable() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(a, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Method under test:
   * {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable)}
   */
  @Test
  public void testChainedIterable2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(a, b, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Method under test:
   * {@link IterableUtils#chainedIterable(Iterable, Iterable, Iterable, Iterable)}
   */
  @Test
  public void testChainedIterable3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    ArrayList<Object> b = new ArrayList<>();
    ArrayList<Object> c = new ArrayList<>();

    // Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(a, b, c, new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#chainedIterable(Iterable[])}
   */
  @Test
  public void testChainedIterable4() {
    // Arrange and Act
    Iterable<Object> actualChainedIterableResult = IterableUtils.chainedIterable(new ArrayList<>());

    // Assert
    assertFalse(actualChainedIterableResult.iterator().hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#collatedIterable(Iterable, Iterable)}
   */
  @Test
  public void testCollatedIterable() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualCollatedIterableResult = IterableUtils.collatedIterable(a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualCollatedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof CollatingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertFalse(IterableUtils.contains(new ArrayList<>(), "Object"));
    assertFalse(IterableUtils.contains(null, null));
    assertFalse(IterableUtils.contains(null, "Object"));
  }

  /**
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertTrue(IterableUtils.contains(iterable, "42"));
  }

  /**
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  public void testContains3() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act and Assert
    assertFalse(IterableUtils.contains(iterable, 2));
  }

  /**
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  public void testContains4() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    iterable.append("Elements");

    // Act and Assert
    assertFalse(IterableUtils.contains(iterable, 2));
  }

  /**
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  public void testContains5() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> iterable2 = FluentIterable.of((Iterable<Object>) iterable);
    iterable2.append("Elements");

    // Act and Assert
    assertFalse(IterableUtils.contains(iterable2, 2));
  }

  /**
   * Method under test: {@link IterableUtils#contains(Iterable, Object)}
   */
  @Test
  public void testContains6() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(2);
    FluentIterable<Object> iterable2 = FluentIterable.of((Iterable<Object>) iterable);
    iterable2.append("Elements");

    // Act and Assert
    assertTrue(IterableUtils.contains(iterable2, 2));
  }

  /**
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  public void testDuplicateList() {
    // Arrange and Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  public void testDuplicateList2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(iterable);

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  public void testDuplicateList3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(iterable);

    // Assert
    assertEquals(1, actualDuplicateListResult.size());
    assertEquals("42", actualDuplicateListResult.get(0));
  }

  /**
   * Method under test: {@link IterableUtils#duplicateList(Iterable)}
   */
  @Test
  public void testDuplicateList4() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new CompositeSet<>());

    // Act
    List<Object> actualDuplicateListResult = IterableUtils.duplicateList(iterable);

    // Assert
    assertTrue(actualDuplicateListResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  public void testDuplicateSequencedSet() {
    // Arrange and Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  public void testDuplicateSequencedSet2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(iterable);

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  public void testDuplicateSequencedSet3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(iterable);

    // Assert
    assertEquals(1, actualDuplicateSequencedSetResult.size());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSequencedSet(Iterable)}
   */
  @Test
  public void testDuplicateSequencedSet4() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new CompositeSet<>());

    // Act
    Set<Object> actualDuplicateSequencedSetResult = IterableUtils.duplicateSequencedSet(iterable);

    // Assert
    assertTrue(actualDuplicateSequencedSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  public void testDuplicateSet() {
    // Arrange and Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  public void testDuplicateSet2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable);

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  public void testDuplicateSet3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable);

    // Assert
    assertEquals(1, actualDuplicateSetResult.size());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable)}
   */
  @Test
  public void testDuplicateSet4() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new CompositeSet<>());

    // Act
    Set<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable);

    // Assert
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  public void testDuplicateSet5() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  public void testDuplicateSet6() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertTrue(actualDuplicateSetResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  public void testDuplicateSet7() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertEquals(1, actualDuplicateSetResult.size());
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(0));
  }

  /**
   * Method under test: {@link IterableUtils#duplicateSet(Iterable, Collection)}
   */
  @Test
  public void testDuplicateSet8() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Collection<Object> actualDuplicateSetResult = IterableUtils.duplicateSet(iterable, new ArrayList<>());

    // Assert
    assertTrue(actualDuplicateSetResult instanceof List);
    assertEquals(2, actualDuplicateSetResult.size());
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(0));
    assertEquals("42", ((List<Object>) actualDuplicateSetResult).get(1));
  }

  /**
   * Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  public void testEmptyIfNull() {
    // Arrange and Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof List);
    assertFalse(actualEmptyIfNullResult.iterator().hasNext());
    assertTrue(((List<Object>) actualEmptyIfNullResult).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#emptyIfNull(Iterable)}
   */
  @Test
  public void testEmptyIfNull2() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act
    Iterable<Object> actualEmptyIfNullResult = IterableUtils.emptyIfNull(iterable);

    // Assert
    assertTrue(actualEmptyIfNullResult instanceof FluentIterable);
    assertFalse(actualEmptyIfNullResult.iterator().hasNext());
    assertTrue(((FluentIterable<Object>) actualEmptyIfNullResult).toList().isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#first(Iterable)}
   */
  @Test
  public void testFirst() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.first(iterable));
  }

  /**
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  public void testFrequency() {
    // Arrange, Act and Assert
    assertEquals(0, IterableUtils.frequency(new ArrayList<>(), "Obj"));
    assertEquals(0, IterableUtils.frequency(null, null));
    assertEquals(0, IterableUtils.frequency(new HashSet<>(), null));
    assertEquals(0, IterableUtils.frequency(new HashBag<>(), null));
  }

  /**
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  public void testFrequency2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, "Obj"));
  }

  /**
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  public void testFrequency3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, null));
  }

  /**
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  public void testFrequency4() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(null);

    // Act and Assert
    assertEquals(1, IterableUtils.frequency(iterable, null));
  }

  /**
   * Method under test: {@link IterableUtils#frequency(Iterable, Object)}
   */
  @Test
  public void testFrequency5() {
    // Arrange
    HashSet<Object> iterable = new HashSet<>();

    // Act and Assert
    assertEquals(0, IterableUtils.frequency(iterable, new CompositeSet<>()));
  }

  /**
   * Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  public void testGet() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.get(iterable, 1));
  }

  /**
   * Method under test: {@link IterableUtils#get(Iterable, int)}
   */
  @Test
  public void testGet2() {
    // Arrange
    HashSet<Object> iterable = new HashSet<>();
    iterable.add(2);
    iterable.add("42");

    // Act and Assert
    assertEquals("42", IterableUtils.get(iterable, 1));
  }

  /**
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue(IterableUtils.isEmpty(new ArrayList<>()));
    assertTrue(IterableUtils.isEmpty(null));
  }

  /**
   * Method under test: {@link IterableUtils#isEmpty(Iterable)}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertFalse(IterableUtils.isEmpty(iterable));
  }

  /**
   * Method under test: {@link IterableUtils#loopingIterable(Iterable)}
   */
  @Test
  public void testLoopingIterable() {
    // Arrange and Act
    Iterable<Object> actualLoopingIterableResult = IterableUtils.loopingIterable(new ArrayList<>());

    // Assert
    assertFalse(actualLoopingIterableResult.iterator().hasNext());
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    ArrayList<Object> objectList = new ArrayList<>();
    ConstantFactory<Collection<Object>> partitionFactory = new ConstantFactory<>(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    Collection<Object> getResult = actualPartitionResult.get(0);
    assertTrue(getResult instanceof List);
    assertTrue(getResult.isEmpty());
    assertSame(objectList, getResult);
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ConstantFactory<Collection<Object>> partitionFactory = new ConstantFactory<>(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(null, partitionFactory,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    Collection<Object> getResult = actualPartitionResult.get(0);
    assertTrue(getResult instanceof List);
    assertTrue(getResult.isEmpty());
    assertSame(objectList, getResult);
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    ArrayList<Object> objectList = new ArrayList<>();
    ConstantFactory<Collection<Object>> partitionFactory = new ConstantFactory<>(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    Collection<Object> getResult = actualPartitionResult.get(0);
    assertEquals(1, getResult.size());
    assertTrue(getResult instanceof List);
    assertEquals("42", ((List<Object>) getResult).get(0));
    assertSame(objectList, getResult);
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition4() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    ArrayList<Object> objectList = new ArrayList<>();
    ConstantFactory<Collection<Object>> partitionFactory = new ConstantFactory<>(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertSame(objectList, actualPartitionResult.get(0));
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition5() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable,
        new ConstantFactory<>(objectList));

    // Assert
    assertEquals(1, actualPartitionResult.size());
    Collection<Object> getResult = actualPartitionResult.get(0);
    assertTrue(getResult instanceof List);
    assertTrue(getResult.isEmpty());
    assertSame(objectList, getResult);
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition6() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(2);
    ArrayList<Object> objectList = new ArrayList<>();
    ConstantFactory<Collection<Object>> partitionFactory = new ConstantFactory<>(objectList);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory,
        new AllPredicate<>(new EqualPredicate<>("Test", equator)));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    Collection<Object> getResult = actualPartitionResult.get(0);
    assertEquals(1, getResult.size());
    assertTrue(getResult instanceof List);
    assertSame(objectList, getResult);
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Method under test:
   * {@link IterableUtils#partition(Iterable, Factory, Predicate[])}
   */
  @Test
  public void testPartition7() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(2);
    ArrayList<Object> objectList = new ArrayList<>();
    ConstantFactory<Collection<Object>> partitionFactory = new ConstantFactory<>(objectList);

    // Act
    List<Collection<Object>> actualPartitionResult = IterableUtils.partition(iterable, partitionFactory,
        new AllPredicate<>(new EqualPredicate<>("Test", null)));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    Collection<Object> getResult = actualPartitionResult.get(0);
    assertEquals(1, getResult.size());
    assertTrue(getResult instanceof List);
    assertSame(objectList, getResult);
    assertSame(objectList, actualPartitionResult.get(1));
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition8() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition9() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(null,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition10() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    List<Object> getResult = actualPartitionResult.get(0);
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    assertTrue(actualPartitionResult.get(1).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition11() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable,
        new AllPredicate<>(new UniquePredicate<>()));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    List<Object> getResult = actualPartitionResult.get(0);
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
    List<Object> getResult2 = actualPartitionResult.get(1);
    assertEquals(1, getResult2.size());
    assertEquals("42", getResult2.get(0));
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition12() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(new ArrayList<>());

    // Assert
    assertEquals(1, actualPartitionResult.size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition13() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(2);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable,
        new AllPredicate<>(new EqualPredicate<>("Test", equator)));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertEquals(1, actualPartitionResult.get(1).size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#partition(Iterable, Predicate[])}
   */
  @Test
  public void testPartition14() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(2);

    // Act
    List<List<Object>> actualPartitionResult = IterableUtils.partition(iterable,
        new AllPredicate<>(new EqualPredicate<>("Test", null)));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    assertEquals(1, actualPartitionResult.get(1).size());
    assertTrue(actualPartitionResult.get(0).isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#reversedIterable(Iterable)}
   */
  @Test
  public void testReversedIterable() {
    // Arrange and Act
    Iterable<Object> actualReversedIterableResult = IterableUtils.reversedIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualReversedIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ReverseListIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  public void testSkippingIterable() {
    // Arrange and Act
    Iterable<Object> actualSkippingIterableResult = IterableUtils.skippingIterable(new ArrayList<>(), 1L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  public void testSkippingIterable2() {
    // Arrange and Act
    Iterable<Object> actualSkippingIterableResult = IterableUtils.skippingIterable(new ArrayList<>(), 0L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#skippingIterable(Iterable, long)}
   */
  @Test
  public void testSkippingIterable3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Iterable<Object> actualSkippingIterableResult = IterableUtils.skippingIterable(iterable, 1L);
    Iterator<Object> actualIteratorResult = actualSkippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof SkippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  public void testToList() {
    // Arrange and Act
    List<Object> actualToListResult = IterableUtils.toList(new ArrayList<>());

    // Assert
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  public void testToList2() {
    // Arrange and Act
    List<Object> actualToListResult = IterableUtils.toList(null);

    // Assert
    assertTrue(actualToListResult.isEmpty());
  }

  /**
   * Method under test: {@link IterableUtils#toList(Iterable)}
   */
  @Test
  public void testToList3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    List<Object> actualToListResult = IterableUtils.toList(iterable);

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("42", actualToListResult.get(0));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("[]", IterableUtils.toString(new ArrayList<>()));
    assertEquals("[]", IterableUtils.toString(null));
    assertEquals("[]", IterableUtils.toString(null, new ConstantTransformer<>("Constant To Return")));
    assertEquals("PrefixSuffix",
        IterableUtils.toString(null, new ConstantTransformer<>("Constant To Return"), "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  public void testToString2() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("[42]", IterableUtils.toString(iterable));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  public void testToString3() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable)}
   */
  @Test
  public void testToString4() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  public void testToString5() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  public void testToString6() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("[Constant To Return]",
        IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  public void testToString7() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("[transformer]",
        IterableUtils.toString(iterable, new FactoryTransformer<>(new ConstantFactory<>("transformer"))));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  public void testToString8() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Class<String> classToInstantiate = String.class;

    // Act and Assert
    assertEquals("[]",
        IterableUtils.toString(iterable, new FactoryTransformer<>(new InstantiateFactory<>(classToInstantiate))));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  public void testToString9() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Method under test: {@link IterableUtils#toString(Iterable, Transformer)}
   */
  @Test
  public void testToString10() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals("[]", IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return")));
  }

  /**
   * Method under test:
   * {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  public void testToString11() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();

    // Act and Assert
    assertEquals("PrefixSuffix", IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return"),
        "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test:
   * {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  public void testToString12() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("PrefixConstant To ReturnSuffix", IterableUtils.toString(iterable,
        new ConstantTransformer<>("Constant To Return"), "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test:
   * {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  public void testToString13() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act and Assert
    assertEquals("PrefixtransformerSuffix", IterableUtils.toString(iterable,
        new FactoryTransformer<>(new ConstantFactory<>("transformer")), "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test:
   * {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  public void testToString14() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    Class<String> classToInstantiate = String.class;

    // Act and Assert
    assertEquals("PrefixSuffix", IterableUtils.toString(iterable,
        new FactoryTransformer<>(new InstantiateFactory<>(classToInstantiate)), "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test:
   * {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  public void testToString15() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act and Assert
    assertEquals("PrefixSuffix", IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return"),
        "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test:
   * {@link IterableUtils#toString(Iterable, Transformer, String, String, String)}
   */
  @Test
  public void testToString16() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals("PrefixSuffix", IterableUtils.toString(iterable, new ConstantTransformer<>("Constant To Return"),
        "Delimiter", "Prefix", "Suffix"));
  }

  /**
   * Method under test: {@link IterableUtils#uniqueIterable(Iterable)}
   */
  @Test
  public void testUniqueIterable() {
    // Arrange and Act
    Iterable<Object> actualUniqueIterableResult = IterableUtils.uniqueIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualUniqueIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UniqueFilterIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  public void testUnmodifiableIterable() {
    // Arrange and Act
    Iterable<Object> actualUnmodifiableIterableResult = IterableUtils.unmodifiableIterable(new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  public void testUnmodifiableIterable2() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    Iterable<Object> actualUnmodifiableIterableResult = IterableUtils.unmodifiableIterable(iterable);
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#unmodifiableIterable(Iterable)}
   */
  @Test
  public void testUnmodifiableIterable3() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    iterable.append("Elements");

    // Act
    Iterable<Object> actualUnmodifiableIterableResult = IterableUtils.unmodifiableIterable(iterable);
    Iterator<Object> actualIteratorResult = actualUnmodifiableIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof UnmodifiableIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link IterableUtils#zippingIterable(Iterable, Iterable)}
   */
  @Test
  public void testZippingIterable() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    Iterable<Object> actualZippingIterableResult = IterableUtils.zippingIterable(a, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualZippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ZippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Method under test:
   * {@link IterableUtils#zippingIterable(Iterable, Iterable[])}
   */
  @Test
  public void testZippingIterable2() {
    // Arrange
    ArrayList<Object> first = new ArrayList<>();

    // Act
    Iterable<Object> actualZippingIterableResult = IterableUtils.zippingIterable(first, new ArrayList<>());
    Iterator<Object> actualIteratorResult = actualZippingIterableResult.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof ZippingIterator);
    assertFalse(actualIteratorResult.hasNext());
  }
}
