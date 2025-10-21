package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.collection.PredicatedCollection.Builder;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedCollectionDiffblueTest {
  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then notNullBuilder createPredicatedQueue size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  public void testBuilderAddAll_given42_thenNotNullBuilderCreatePredicatedQueueSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    notNullBuilderResult.addAll(items);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedQueue().size());
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, notNullBuilderResult.createPredicatedMultiSet().size());
    assertEquals(items, notNullBuilderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then notNullBuilder createPredicatedQueue size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  public void testBuilderAddAll_given42_thenNotNullBuilderCreatePredicatedQueueSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");
    items.add("42");

    // Act
    notNullBuilderResult.addAll(items);

    // Assert
    assertEquals(2, notNullBuilderResult.createPredicatedQueue().size());
    assertEquals(2, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(2, notNullBuilderResult.createPredicatedMultiSet().size());
    assertEquals(items, notNullBuilderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  public void testBuilderAddAll_givenNull_whenArrayListAddNull() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> items = new ArrayList<>();
    items.add(null);

    // Act
    notNullBuilderResult.addAll(items);

    // Assert that nothing has changed
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then notNullBuilder createPredicatedBag Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  public void testBuilderAddAll_whenArrayList_thenNotNullBuilderCreatePredicatedBagEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act
    notNullBuilderResult.addAll(new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then notNullBuilder createPredicatedBag Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  public void testBuilderAddAll_whenNull_thenNotNullBuilderCreatePredicatedBagEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act
    notNullBuilderResult.addAll(null);

    // Assert that nothing has changed
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#add(Object)}.
   * <ul>
   *   <li>Then builder {@link Predicate} createPredicatedBag Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.add(Object)"})
  public void testBuilderAdd_thenBuilderPredicateCreatePredicatedBagEmpty() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Builder<Object> builderResult = PredicatedCollection.builder(predicate);

    // Act
    Builder<Object> actualAddResult = builderResult.add("Item");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(builderResult.createPredicatedBag().isEmpty());
    assertTrue(builderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(builderResult.createPredicatedQueue().isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test Builder {@link Builder#add(Object)}.
   * <ul>
   *   <li>Then notNullBuilder createPredicatedList size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Builder Builder.add(Object)"})
  public void testBuilderAdd_thenNotNullBuilderCreatePredicatedListSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act
    Builder<Object> actualAddResult = notNullBuilderResult.add("Item");

    // Assert
    List<Object> createPredicatedListResult = notNullBuilderResult.createPredicatedList();
    assertEquals(1, createPredicatedListResult.size());
    assertEquals("Item", createPredicatedListResult.get(0));
    assertEquals(1, notNullBuilderResult.createPredicatedQueue().size());
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(1, notNullBuilderResult.createPredicatedMultiSet().size());
    assertSame(notNullBuilderResult, actualAddResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(new HashBag<>());

    HashBag<Object> bag = new HashBag<>();
    bag.add(0);

    // Act
    notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(2, bag.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag2() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(0);
    notNullBuilderResult.add(new HashBag<>());

    HashBag<Object> bag = new HashBag<>();
    bag.add(0);

    // Act
    notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(2, notNullBuilderResult.createPredicatedBag().size());
    assertEquals(3, bag.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code null}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_givenHashBagAddNull_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(hashBag);
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, bag.size());
    assertEquals(bag, notNullBuilderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_givenHashBagAddObject_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(hashBag);
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, bag.size());
    assertEquals(bag, notNullBuilderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Given notNullBuilder add {@code Item}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_givenNotNullBuilderAddItem() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, bag.size());
    assertEquals(bag, notNullBuilderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then {@link HashBag#HashBag()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_givenNotNullBuilder_thenHashBagEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertTrue(bag.isEmpty());
    assertEquals(bag, notNullBuilderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Then {@link HashBag#HashBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_thenHashBagSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add(new HashBag<>());
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = notNullBuilderResult.createPredicatedBag(bag);

    // Assert
    assertEquals(1, bag.size());
    assertEquals(bag, notNullBuilderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Then {@link HashBag#HashBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_thenHashBagSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
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
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   * <ul>
   *   <li>Then notNullBuilder createPredicatedBag Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  public void testBuilderCreatePredicatedBagWithBag_thenNotNullBuilderCreatePredicatedBagEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    notNullBuilderResult.createPredicatedBag(bag);

    // Assert that nothing has changed
    assertEquals(1, bag.size());
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag()}.
   * <ul>
   *   <li>Given notNullBuilder add {@code Item}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag()"})
  public void testBuilderCreatePredicatedBag_givenNotNullBuilderAddItem_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedBag().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag()}.
   * <ul>
   *   <li>Given notNullBuilder add {@code Item}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag()"})
  public void testBuilderCreatePredicatedBag_givenNotNullBuilderAddItem_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(2, notNullBuilderResult.createPredicatedBag().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag()}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag Builder.createPredicatedBag()"})
  public void testBuilderCreatePredicatedBag_givenNotNullBuilder_thenReturnEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedBag().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} first is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  public void testBuilderCreatePredicatedListWithList_given42_thenArrayListFirstIs42() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    notNullBuilderResult.createPredicatedList(list);

    // Assert that nothing has changed
    assertEquals(1, list.size());
    assertEquals("42", list.get(0));
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then {@link ArrayList#ArrayList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  public void testBuilderCreatePredicatedListWithList_givenNotNullBuilder_thenArrayListEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertTrue(list.isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
    assertTrue(actualCreatePredicatedListResult.isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  public void testBuilderCreatePredicatedListWithList_thenArrayListSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    ArrayList<Object> list = new ArrayList<>();

    // Act
    notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertEquals(1, list.size());
    assertEquals("Item", list.get(0));
    assertEquals(list, notNullBuilderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  public void testBuilderCreatePredicatedListWithList_thenArrayListSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");
    ArrayList<Object> list = new ArrayList<>();

    // Act
    notNullBuilderResult.createPredicatedList(list);

    // Assert
    assertEquals(2, list.size());
    assertEquals("Item", list.get(0));
    assertEquals("Item", list.get(1));
    assertEquals(list, notNullBuilderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList()}.
   * <ul>
   *   <li>Given notNullBuilder add {@code Item}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List Builder.createPredicatedList()"})
  public void testBuilderCreatePredicatedList_givenNotNullBuilderAddItem_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act
    List<Object> actualCreatePredicatedListResult = notNullBuilderResult.createPredicatedList();

    // Assert
    assertEquals(1, actualCreatePredicatedListResult.size());
    assertEquals("Item", actualCreatePredicatedListResult.get(0));
  }

  /**
   * Test Builder {@link Builder#createPredicatedList()}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List Builder.createPredicatedList()"})
  public void testBuilderCreatePredicatedList_givenNotNullBuilder_thenReturnEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   * <p>
   * Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  public void testBuilderCreatePredicatedMultiSetWithMultiSet() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert that nothing has changed
    assertEquals(1, multiset.size());
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   * <ul>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  public void testBuilderCreatePredicatedMultiSetWithMultiSet_thenHashMultiSetEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult = notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertTrue(multiset.isEmpty());
    assertEquals(multiset, notNullBuilderResult.createPredicatedMultiSet());
    assertEquals(multiset, actualCreatePredicatedMultiSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   * <ul>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  public void testBuilderCreatePredicatedMultiSetWithMultiSet_thenHashMultiSetSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult = notNullBuilderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertEquals(1, multiset.size());
    assertEquals(multiset, notNullBuilderResult.createPredicatedMultiSet());
    assertEquals(multiset, actualCreatePredicatedMultiSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   * <ul>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  public void testBuilderCreatePredicatedMultiSetWithMultiSet_thenHashMultiSetSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
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
   * Test Builder {@link Builder#createPredicatedMultiSet()}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedMultiSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet()"})
  public void testBuilderCreatePredicatedMultiSet_givenNotNullBuilder_thenReturnEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedMultiSet().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet()}.
   * <ul>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedMultiSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet()"})
  public void testBuilderCreatePredicatedMultiSet_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedMultiSet().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  public void testBuilderCreatePredicatedQueueWithQueue_given42_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertEquals(1, queue.size());
    assertEquals(1, actualCreatePredicatedQueueResult.size());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  public void testBuilderCreatePredicatedQueueWithQueue_thenLinkedListEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualCreatePredicatedQueueResult.isEmpty());
    assertTrue(notNullBuilderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} first is {@code Item}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  public void testBuilderCreatePredicatedQueueWithQueue_thenLinkedListFirstIsItem() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertEquals(1, queue.size());
    assertEquals("Item", queue.get(0));
    assertEquals(queue, notNullBuilderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  public void testBuilderCreatePredicatedQueueWithQueue_thenLinkedListSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    notNullBuilderResult.add("Item");
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = notNullBuilderResult.createPredicatedQueue(queue);

    // Assert
    assertEquals(2, queue.size());
    assertEquals("Item", queue.get(1));
    assertEquals(2, actualCreatePredicatedQueueResult.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue()}.
   * <ul>
   *   <li>Given notNullBuilder add {@code Item}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedQueue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue()"})
  public void testBuilderCreatePredicatedQueue_givenNotNullBuilderAddItem_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedQueue().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue()}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedQueue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue()"})
  public void testBuilderCreatePredicatedQueue_givenNotNullBuilder_thenReturnEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedQueue().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  public void testBuilderCreatePredicatedSetWithSet_given42_whenHashSetAdd42() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertEquals(1, set.size());
    assertEquals(set, actualCreatePredicatedSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then {@link HashSet#HashSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  public void testBuilderCreatePredicatedSetWithSet_givenNotNullBuilder_thenHashSetEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertTrue(set.isEmpty());
    assertTrue(actualCreatePredicatedSetResult.isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   * <ul>
   *   <li>Then {@link HashSet#HashSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  public void testBuilderCreatePredicatedSetWithSet_thenHashSetSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = notNullBuilderResult.createPredicatedSet(set);

    // Assert
    assertEquals(1, set.size());
    assertEquals(set, actualCreatePredicatedSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   * <ul>
   *   <li>Then {@link HashSet#HashSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  public void testBuilderCreatePredicatedSetWithSet_thenHashSetSizeIsTwo() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
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
   * Test Builder {@link Builder#createPredicatedSet()}.
   * <ul>
   *   <li>Given notNullBuilder add {@code Item}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set Builder.createPredicatedSet()"})
  public void testBuilderCreatePredicatedSet_givenNotNullBuilderAddItem_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();
    notNullBuilderResult.add("Item");

    // Act and Assert
    assertEquals(1, notNullBuilderResult.createPredicatedSet().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet()}.
   * <ul>
   *   <li>Given notNullBuilder.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#createPredicatedSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set Builder.createPredicatedSet()"})
  public void testBuilderCreatePredicatedSet_givenNotNullBuilder_thenReturnEmpty() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.createPredicatedSet().isEmpty());
  }

  /**
   * Test Builder {@link Builder#Builder(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return createPredicatedBag Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link Builder#Builder(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Builder.<init>(Predicate)"})
  public void testBuilderNewBuilder_whenPredicate_thenReturnCreatePredicatedBagEmpty() {
    // Arrange and Act
    Builder<Object> actualBuilder = new Builder<>(mock(Predicate.class));

    // Assert
    assertTrue(actualBuilder.createPredicatedBag().isEmpty());
    assertTrue(actualBuilder.createPredicatedMultiSet().isEmpty());
    assertTrue(actualBuilder.createPredicatedQueue().isEmpty());
    assertTrue(actualBuilder.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#rejectedElements()}.
   * <p>
   * Method under test: {@link Builder#rejectedElements()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection Builder.rejectedElements()"})
  public void testBuilderRejectedElements() {
    // Arrange
    Builder<Object> notNullBuilderResult = PredicatedCollection.notNullBuilder();

    // Act and Assert
    assertTrue(notNullBuilderResult.rejectedElements().isEmpty());
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PredicatedCollection.predicatedCollection(coll, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code collection}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_givenIllegalArgumentExceptionWithCollection() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("collection"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PredicatedCollection.predicatedCollection(coll, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_givenTrue_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollectionResult = PredicatedCollection.predicatedCollection(coll,
        predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_givenTrue_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollectionResult = PredicatedCollection.predicatedCollection(coll,
        predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"})
  public void testPredicatedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedCollection<Object> actualPredicatedCollectionResult = PredicatedCollection
        .predicatedCollection(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedCollectionResult.isEmpty());
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  public void testNewPredicatedCollection_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedCollection<>(collection, predicate));

    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code collection}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  public void testNewPredicatedCollection_givenIllegalArgumentExceptionWithCollection() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("collection"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new PredicatedCollection<>(collection, predicate));

    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  public void testNewPredicatedCollection_givenTrue_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollection = new PredicatedCollection<>(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedCollection.size());
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  public void testNewPredicatedCollection_givenTrue_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollection = new PredicatedCollection<>(collection, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedCollection.size());
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  public void testNewPredicatedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedCollection<Object> actualPredicatedCollection = new PredicatedCollection<>(new ArrayList<>(),
        mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedCollection.isEmpty());
  }
}
