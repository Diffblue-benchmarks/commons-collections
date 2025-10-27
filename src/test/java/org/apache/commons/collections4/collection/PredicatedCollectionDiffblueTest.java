package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.junit.Test;

public class PredicatedCollectionDiffblueTest {
  /**
   * Method under test: {@link PredicatedCollection.Builder#addAll(Collection)}
   */
  @Test
  public void testBuilderAddAll() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act
    PredicatedCollection.Builder<Object> actualAddAllResult = notNullBuilderResult.addAll(new ArrayList<>());

    // Assert
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
    assertSame(notNullBuilderResult, actualAddAllResult);
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#addAll(Collection)}
   */
  @Test
  public void testBuilderAddAll2() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act
    PredicatedCollection.Builder<Object> actualAddAllResult = notNullBuilderResult.addAll(null);

    // Assert
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
    assertSame(notNullBuilderResult, actualAddAllResult);
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#addAll(Collection)}
   */
  @Test
  public void testBuilderAddAll3() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    PredicatedCollection.Builder<Object> actualAddAllResult = notNullBuilderResult.addAll(items);

    // Assert
    List<Object> createPredicatedListResult = notNullBuilderResult.createPredicatedList();
    assertEquals(1, createPredicatedListResult.size());
    assertEquals("42", createPredicatedListResult.get(0));
    assertEquals(1, notNullBuilderResult.createPredicatedQueue().size());
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, notNullBuilderResult.createPredicatedMultiSet().size());
    assertSame(notNullBuilderResult, actualAddAllResult);
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#addAll(Collection)}
   */
  @Test
  public void testBuilderAddAll4() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");
    items.add("42");

    // Act
    PredicatedCollection.Builder<Object> actualAddAllResult = notNullBuilderResult.addAll(items);

    // Assert
    assertEquals(2, notNullBuilderResult.createPredicatedQueue().size());
    assertEquals(2, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(2, notNullBuilderResult.createPredicatedMultiSet().size());
    assertEquals(items, notNullBuilderResult.createPredicatedList());
    assertSame(notNullBuilderResult, actualAddAllResult);
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#addAll(Collection)}
   */
  @Test
  public void testBuilderAddAll5() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> items = new ArrayList<>();
    items.add(null);

    // Act
    PredicatedCollection.Builder<Object> actualAddAllResult = notNullBuilderResult.addAll(items);

    // Assert
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
    assertSame(notNullBuilderResult, actualAddAllResult);
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#createPredicatedBag()}
   */
  @Test
  public void testBuilderCreatePredicatedBag() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#createPredicatedBag()}
   */
  @Test
  public void testBuilderCreatePredicatedBag2() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#createPredicatedBag()}
   */
  @Test
  public void testBuilderCreatePredicatedBag3() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(2, notNullBuilderResult.createPredicatedBag().size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag4() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(actualCreatePredicatedBagResult.isEmpty());
    assertTrue(bag.isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag5() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, bag.size());
    assertEquals(1, actualCreatePredicatedBagResult.size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag6() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(2, bag.size());
    assertEquals(bag, notNullBuilderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag7() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(new HashBag<>());
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, bag.size());
    assertEquals(1, actualCreatePredicatedBagResult.size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag8() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, bag.size());
    assertEquals(1, actualCreatePredicatedBagResult.size());
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag9() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(hashBag);
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, bag.size());
    assertEquals(1, actualCreatePredicatedBagResult.size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag10() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(hashBag);
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, bag.size());
    assertEquals(1, actualCreatePredicatedBagResult.size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag11() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(new HashBag<>());

    HashBag<Object> bag = new HashBag<>();
    bag.add(0);

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(2, bag.size());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedBag(Bag)}
   */
  @Test
  public void testBuilderCreatePredicatedBag12() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(0);
    notNullBuilderResult.add(new HashBag<>());

    HashBag<Object> bag = new HashBag<>();
    bag.add(0);

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(2, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(3, bag.size());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedList()}
   */
  @Test
  public void testBuilderCreatePredicatedList() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedList()}
   */
  @Test
  public void testBuilderCreatePredicatedList2() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList();

    // Assert
    assertEquals(1, actualCreatePredicatedListResult.size());
    assertEquals("Item", actualCreatePredicatedListResult.get(0));
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedList(List)}
   */
  @Test
  public void testBuilderCreatePredicatedList3() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertTrue(list.isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
    assertTrue(actualCreatePredicatedListResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedList(List)}
   */
  @Test
  public void testBuilderCreatePredicatedList4() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals("Item", list.get(0));
    assertEquals(1, actualCreatePredicatedListResult.size());
    assertEquals("Item", actualCreatePredicatedListResult.get(0));
    assertEquals(1, notNullBuilderResult.createPredicatedList().size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedList(List)}
   */
  @Test
  public void testBuilderCreatePredicatedList5() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertEquals(2, list.size());
    assertEquals("Item", list.get(0));
    assertEquals("Item", list.get(1));
    assertEquals(list, notNullBuilderResult.createPredicatedList());
    assertEquals(list, actualCreatePredicatedListResult);
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedList(List)}
   */
  @Test
  public void testBuilderCreatePredicatedList6() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals("42", list.get(0));
    assertEquals(1, actualCreatePredicatedListResult.size());
    assertEquals("42", actualCreatePredicatedListResult.get(0));
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedMultiSet()}
   */
  @Test
  public void testBuilderCreatePredicatedMultiSet() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedMultiSet()}
   */
  @Test
  public void testBuilderCreatePredicatedMultiSet2() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedMultiSet().size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  public void testBuilderCreatePredicatedMultiSet3() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult = notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(actualCreatePredicatedMultiSetResult.isEmpty());
    assertTrue(multiset.isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  public void testBuilderCreatePredicatedMultiSet4() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult = notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedMultiSet().size());
    assertEquals(1, multiset.size());
    assertEquals(1, actualCreatePredicatedMultiSetResult.size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  public void testBuilderCreatePredicatedMultiSet5() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult = notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertEquals(2, multiset.size());
    assertEquals(multiset, notNullBuilderResult.createPredicatedMultiSet());
    assertEquals(multiset, actualCreatePredicatedMultiSetResult);
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  public void testBuilderCreatePredicatedMultiSet6() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult = notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertEquals(1, multiset.size());
    assertEquals(1, actualCreatePredicatedMultiSetResult.size());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedQueue()}
   */
  @Test
  public void testBuilderCreatePredicatedQueue() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedQueue()}
   */
  @Test
  public void testBuilderCreatePredicatedQueue2() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedQueue().size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedQueue(Queue)}
   */
  @Test
  public void testBuilderCreatePredicatedQueue3() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualCreatePredicatedQueueResult.isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedQueue(Queue)}
   */
  @Test
  public void testBuilderCreatePredicatedQueue4() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertEquals(1, queue.size());
    assertEquals("Item", queue.get(0));
    assertEquals(1, actualCreatePredicatedQueueResult.size());
    assertEquals(1, notNullBuilderResult.createPredicatedList().size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedQueue(Queue)}
   */
  @Test
  public void testBuilderCreatePredicatedQueue5() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertEquals(2, queue.size());
    assertEquals("Item", queue.get(0));
    assertEquals("Item", queue.get(1));
    assertEquals(2, actualCreatePredicatedQueueResult.size());
    assertEquals(queue, notNullBuilderResult.createPredicatedList());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedQueue(Queue)}
   */
  @Test
  public void testBuilderCreatePredicatedQueue6() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertEquals(1, queue.size());
    assertEquals("42", queue.get(0));
    assertEquals(1, actualCreatePredicatedQueueResult.size());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#createPredicatedSet()}
   */
  @Test
  public void testBuilderCreatePredicatedSet() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedSet().isEmpty());
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#createPredicatedSet()}
   */
  @Test
  public void testBuilderCreatePredicatedSet2() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedSet().size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedSet(Set)}
   */
  @Test
  public void testBuilderCreatePredicatedSet3() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertTrue(set.isEmpty());
    assertTrue(actualCreatePredicatedSetResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedSet(Set)}
   */
  @Test
  public void testBuilderCreatePredicatedSet4() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertEquals(1, set.size());
    assertEquals(1, actualCreatePredicatedSetResult.size());
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedSet(Set)}
   */
  @Test
  public void testBuilderCreatePredicatedSet5() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(42);
    notNullBuilderResult.add("Item");
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertEquals(2, set.size());
    assertEquals(set, actualCreatePredicatedSetResult);
  }

  /**
   * Method under test:
   * {@link PredicatedCollection.Builder#createPredicatedSet(Set)}
   */
  @Test
  public void testBuilderCreatePredicatedSet6() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertEquals(1, set.size());
    assertEquals(1, actualCreatePredicatedSetResult.size());
  }

  /**
   * Method under test: {@link PredicatedCollection.Builder#rejectedElements()}
   */
  @Test
  public void testBuilderRejectedElements() {
    // Arrange
    PredicatedCollection.Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.rejectedElements().isEmpty());
  }
}
