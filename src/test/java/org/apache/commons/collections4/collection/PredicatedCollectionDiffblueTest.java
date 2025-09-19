package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedCollectionDiffblueTest {
  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @DisplayName("Test Builder addAll(Collection); given Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  void testBuilderAddAll_givenPredicateTestReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Builder<Object> builderResult = PredicatedCollection.builder(predicate);

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    builderResult.addAll(items);

    // Assert that nothing has changed
    verify(predicate).test(isA(Object.class));
    assertTrue(builderResult.createPredicatedBag().isEmpty());
    assertTrue(builderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(builderResult.createPredicatedQueue().isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   *
   * <ul>
   *   <li>Then builder {@link Predicate} createPredicatedQueue size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test Builder addAll(Collection); then builder Predicate createPredicatedQueue size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  void testBuilderAddAll_thenBuilderPredicateCreatePredicatedQueueSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Builder<Object> builderResult = PredicatedCollection.builder(predicate);

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");

    // Act
    builderResult.addAll(items);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, builderResult.createPredicatedQueue().size());
    assertEquals(1, builderResult.createPredicatedBag().size());
    assertEquals(1, builderResult.createPredicatedMultiSet().size());
    assertEquals(items, builderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   *
   * <ul>
   *   <li>Then builder {@link Predicate} createPredicatedQueue size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test Builder addAll(Collection); then builder Predicate createPredicatedQueue size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  void testBuilderAddAll_thenBuilderPredicateCreatePredicatedQueueSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Builder<Object> builderResult = PredicatedCollection.builder(predicate);

    ArrayList<Object> items = new ArrayList<>();
    items.add("42");
    items.add("42");

    // Act
    builderResult.addAll(items);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, builderResult.createPredicatedQueue().size());
    assertEquals(2, builderResult.createPredicatedBag().size());
    assertEquals(2, builderResult.createPredicatedMultiSet().size());
    assertEquals(items, builderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then builder {@link Predicate} createPredicatedBag Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test Builder addAll(Collection); when ArrayList(); then builder Predicate createPredicatedBag Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  void testBuilderAddAll_whenArrayList_thenBuilderPredicateCreatePredicatedBagEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act
    builderResult.addAll(new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(builderResult.createPredicatedBag().isEmpty());
    assertTrue(builderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(builderResult.createPredicatedQueue().isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#addAll(Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then builder {@link Predicate} createPredicatedBag Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test Builder addAll(Collection); when 'null'; then builder Predicate createPredicatedBag Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.addAll(Collection)"})
  void testBuilderAddAll_whenNull_thenBuilderPredicateCreatePredicatedBagEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act
    builderResult.addAll(null);

    // Assert that nothing has changed
    assertTrue(builderResult.createPredicatedBag().isEmpty());
    assertTrue(builderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(builderResult.createPredicatedQueue().isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#add(Object)}.
   *
   * <ul>
   *   <li>Then builder {@link Predicate} createPredicatedBag Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#add(Object)}
   */
  @Test
  @DisplayName("Test Builder add(Object); then builder Predicate createPredicatedBag Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.add(Object)"})
  void testBuilderAdd_thenBuilderPredicateCreatePredicatedBagEmpty() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    Builder<Object> builderResult = PredicatedCollection.builder(predicate);

    // Act
    builderResult.add("Item");

    // Assert that nothing has changed
    verify(predicate).test(isA(Object.class));
    assertTrue(builderResult.createPredicatedBag().isEmpty());
    assertTrue(builderResult.createPredicatedMultiSet().isEmpty());
    assertTrue(builderResult.createPredicatedQueue().isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#add(Object)}.
   *
   * <ul>
   *   <li>Then builder {@link Predicate} createPredicatedList size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#add(Object)}
   */
  @Test
  @DisplayName("Test Builder add(Object); then builder Predicate createPredicatedList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.add(Object)"})
  void testBuilderAdd_thenBuilderPredicateCreatePredicatedListSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    Builder<Object> builderResult = PredicatedCollection.builder(predicate);

    // Act
    builderResult.add("Item");

    // Assert
    verify(predicate).test(isA(Object.class));
    List<Object> createPredicatedListResult = builderResult.createPredicatedList();
    assertEquals(1, createPredicatedListResult.size());
    assertEquals("Item", createPredicatedListResult.get(0));
    assertEquals(1, builderResult.createPredicatedQueue().size());
    assertEquals(1, builderResult.createPredicatedBag().size());
    assertEquals(1, builderResult.createPredicatedMultiSet().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   *
   * <p>Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedBag(Bag) with 'Bag'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  void testBuilderCreatePredicatedBagWithBag() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    builderResult.createPredicatedBag(bag);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(1, builderResult.createPredicatedBag().size());
    assertEquals(2, bag.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then {@link HashBag#HashBag()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedBag(Bag) with 'Bag'; given builder Predicate; then HashBag() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  void testBuilderCreatePredicatedBagWithBag_givenBuilderPredicate_thenHashBagEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = builderResult.createPredicatedBag(bag);

    // Assert
    assertTrue(bag.isEmpty());
    assertEquals(bag, builderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   *
   * <ul>
   *   <li>Then {@link HashBag#HashBag()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedBag(Bag) with 'Bag'; then HashBag() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  void testBuilderCreatePredicatedBagWithBag_thenHashBagSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = builderResult.createPredicatedBag(bag);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, bag.size());
    assertEquals(bag, builderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag(Bag)} with {@code Bag}.
   *
   * <ul>
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedBag(Bag)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedBag(Bag) with 'Bag'; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag(Bag)"})
  void testBuilderCreatePredicatedBagWithBag_thenHashBagSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    builderResult.add("Item");
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCreatePredicatedBagResult = builderResult.createPredicatedBag(bag);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, bag.size());
    assertEquals(bag, builderResult.createPredicatedBag());
    assertEquals(bag, actualCreatePredicatedBagResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag()}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedBag()}
   */
  @Test
  @DisplayName("Test Builder createPredicatedBag(); given builder Predicate; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag()"})
  void testBuilderCreatePredicatedBag_givenBuilderPredicate_thenReturnEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act and Assert
    assertTrue(builderResult.createPredicatedBag().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedBag()}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedBag(); given Predicate test(Object) return 'true'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag()"})
  void testBuilderCreatePredicatedBag_givenPredicateTestReturnTrue_thenReturnSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    // Act
    Bag<Object> actualCreatePredicatedBagResult = builderResult.createPredicatedBag();

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, actualCreatePredicatedBagResult.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedBag()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedBag()}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedBag(); given Predicate test(Object) return 'true'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag Builder.createPredicatedBag()"})
  void testBuilderCreatePredicatedBag_givenPredicateTestReturnTrue_thenReturnSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    builderResult.add("Item");

    // Act
    Bag<Object> actualCreatePredicatedBagResult = builderResult.createPredicatedBag();

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualCreatePredicatedBagResult.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} first is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedList(List) with 'List'; given '42'; then ArrayList() first is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  void testBuilderCreatePredicatedListWithList_given42_thenArrayListFirstIs42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    builderResult.createPredicatedList(list);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(2, list.size());
    assertEquals("42", list.get(0));
    assertEquals("Item", list.get(1));
    assertEquals(1, builderResult.createPredicatedList().size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedList(List) with 'List'; given builder Predicate; then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  void testBuilderCreatePredicatedListWithList_givenBuilderPredicate_thenArrayListEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualCreatePredicatedListResult = builderResult.createPredicatedList(list);

    // Assert
    assertTrue(list.isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
    assertTrue(actualCreatePredicatedListResult.isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedList(List) with 'List'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  void testBuilderCreatePredicatedListWithList_thenArrayListSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    ArrayList<Object> list = new ArrayList<>();

    // Act
    builderResult.createPredicatedList(list);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, list.size());
    assertEquals("Item", list.get(0));
    assertEquals(list, builderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedList(List)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedList(List) with 'List'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Builder.createPredicatedList(List)"})
  void testBuilderCreatePredicatedListWithList_thenArrayListSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    builderResult.add("Item");
    ArrayList<Object> list = new ArrayList<>();

    // Act
    builderResult.createPredicatedList(list);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, list.size());
    assertEquals("Item", list.get(0));
    assertEquals("Item", list.get(1));
    assertEquals(list, builderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList()}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedList()}
   */
  @Test
  @DisplayName("Test Builder createPredicatedList(); given builder Predicate; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Builder.createPredicatedList()"})
  void testBuilderCreatePredicatedList_givenBuilderPredicate_thenReturnEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act and Assert
    assertTrue(builderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedList()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedList()}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedList(); given Predicate test(Object) return 'true'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Builder.createPredicatedList()"})
  void testBuilderCreatePredicatedList_givenPredicateTestReturnTrue_thenReturnSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    // Act
    List<Object> actualCreatePredicatedListResult = builderResult.createPredicatedList();

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, actualCreatePredicatedListResult.size());
    assertEquals("Item", actualCreatePredicatedListResult.get(0));
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   *
   * <p>Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedMultiSet(MultiSet) with 'MultiSet'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  void testBuilderCreatePredicatedMultiSetWithMultiSet() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    builderResult.createPredicatedMultiSet(multiset);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(1, builderResult.createPredicatedMultiSet().size());
    assertEquals(2, multiset.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   *
   * <ul>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedMultiSet(MultiSet) with 'MultiSet'; then HashMultiSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  void testBuilderCreatePredicatedMultiSetWithMultiSet_thenHashMultiSetEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult =
        builderResult.createPredicatedMultiSet(multiset);

    // Assert
    assertTrue(multiset.isEmpty());
    assertEquals(multiset, builderResult.createPredicatedMultiSet());
    assertEquals(multiset, actualCreatePredicatedMultiSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   *
   * <ul>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedMultiSet(MultiSet) with 'MultiSet'; then HashMultiSet() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  void testBuilderCreatePredicatedMultiSetWithMultiSet_thenHashMultiSetSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult =
        builderResult.createPredicatedMultiSet(multiset);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, multiset.size());
    assertEquals(multiset, builderResult.createPredicatedMultiSet());
    assertEquals(multiset, actualCreatePredicatedMultiSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet(MultiSet)} with {@code MultiSet}.
   *
   * <ul>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedMultiSet(MultiSet)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedMultiSet(MultiSet) with 'MultiSet'; then HashMultiSet() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet(MultiSet)"})
  void testBuilderCreatePredicatedMultiSetWithMultiSet_thenHashMultiSetSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    builderResult.add("Item");
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult =
        builderResult.createPredicatedMultiSet(multiset);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, multiset.size());
    assertEquals(multiset, builderResult.createPredicatedMultiSet());
    assertEquals(multiset, actualCreatePredicatedMultiSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet()}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedMultiSet()}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedMultiSet(); given builder Predicate; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet()"})
  void testBuilderCreatePredicatedMultiSet_givenBuilderPredicate_thenReturnEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act and Assert
    assertTrue(builderResult.createPredicatedMultiSet().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedMultiSet()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedMultiSet()}
   */
  @Test
  @DisplayName("Test Builder createPredicatedMultiSet(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiSet Builder.createPredicatedMultiSet()"})
  void testBuilderCreatePredicatedMultiSet_thenReturnSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    // Act
    MultiSet<Object> actualCreatePredicatedMultiSetResult =
        builderResult.createPredicatedMultiSet();

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, actualCreatePredicatedMultiSetResult.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then {@link LinkedList#LinkedList()} first is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedQueue(Queue) with 'Queue'; given '42'; then LinkedList() first is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  void testBuilderCreatePredicatedQueueWithQueue_given42_thenLinkedListFirstIs42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    LinkedList<Object> queue = new LinkedList<>();
    queue.add("42");

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = builderResult.createPredicatedQueue(queue);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(2, queue.size());
    assertEquals("42", queue.get(0));
    assertEquals("Item", queue.get(1));
    assertEquals(1, builderResult.createPredicatedList().size());
    assertEquals(2, actualCreatePredicatedQueueResult.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   *
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedQueue(Queue) with 'Queue'; then LinkedList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  void testBuilderCreatePredicatedQueueWithQueue_thenLinkedListEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = builderResult.createPredicatedQueue(queue);

    // Assert
    assertTrue(queue.isEmpty());
    assertTrue(actualCreatePredicatedQueueResult.isEmpty());
    assertTrue(builderResult.createPredicatedList().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   *
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedQueue(Queue) with 'Queue'; then LinkedList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  void testBuilderCreatePredicatedQueueWithQueue_thenLinkedListSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = builderResult.createPredicatedQueue(queue);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, queue.size());
    assertEquals("Item", queue.get(0));
    assertEquals(1, actualCreatePredicatedQueueResult.size());
    assertEquals(queue, builderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue(Queue)} with {@code Queue}.
   *
   * <ul>
   *   <li>Then {@link LinkedList#LinkedList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedQueue(Queue)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedQueue(Queue) with 'Queue'; then LinkedList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue(Queue)"})
  void testBuilderCreatePredicatedQueueWithQueue_thenLinkedListSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    builderResult.add("Item");
    LinkedList<Object> queue = new LinkedList<>();

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = builderResult.createPredicatedQueue(queue);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, queue.size());
    assertEquals("Item", queue.get(0));
    assertEquals("Item", queue.get(1));
    assertEquals(2, actualCreatePredicatedQueueResult.size());
    assertEquals(queue, builderResult.createPredicatedList());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue()}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedQueue()}
   */
  @Test
  @DisplayName("Test Builder createPredicatedQueue(); given builder Predicate; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue()"})
  void testBuilderCreatePredicatedQueue_givenBuilderPredicate_thenReturnEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act and Assert
    assertTrue(builderResult.createPredicatedQueue().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedQueue()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedQueue()}
   */
  @Test
  @DisplayName("Test Builder createPredicatedQueue(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Queue Builder.createPredicatedQueue()"})
  void testBuilderCreatePredicatedQueue_thenReturnSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    // Act
    Queue<Object> actualCreatePredicatedQueueResult = builderResult.createPredicatedQueue();

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, actualCreatePredicatedQueueResult.size());
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then {@link HashSet#HashSet()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedSet(Set) with 'Set'; given builder Predicate; then HashSet() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  void testBuilderCreatePredicatedSetWithSet_givenBuilderPredicate_thenHashSetEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = builderResult.createPredicatedSet(set);

    // Assert
    assertTrue(set.isEmpty());
    assertTrue(actualCreatePredicatedSetResult.isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Then {@link HashSet#HashSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedSet(Set) with 'Set'; then HashSet() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  void testBuilderCreatePredicatedSetWithSet_thenHashSetSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");
    HashSet<Object> set = new HashSet<>();

    // Act
    Set<Object> actualCreatePredicatedSetResult = builderResult.createPredicatedSet(set);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, set.size());
    assertEquals(set, actualCreatePredicatedSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Then {@link HashSet#HashSet()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedSet(Set)}
   */
  @Test
  @DisplayName("Test Builder createPredicatedSet(Set) with 'Set'; then HashSet() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Builder.createPredicatedSet(Set)"})
  void testBuilderCreatePredicatedSetWithSet_thenHashSetSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    Set<Object> actualCreatePredicatedSetResult = builderResult.createPredicatedSet(set);

    // Assert
    verify(predicate, atLeast(1)).test(Mockito.<Object>any());
    assertEquals(2, set.size());
    assertEquals(set, actualCreatePredicatedSetResult);
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet()}.
   *
   * <ul>
   *   <li>Given builder {@link Predicate}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedSet()}
   */
  @Test
  @DisplayName("Test Builder createPredicatedSet(); given builder Predicate; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Builder.createPredicatedSet()"})
  void testBuilderCreatePredicatedSet_givenBuilderPredicate_thenReturnEmpty() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act and Assert
    assertTrue(builderResult.createPredicatedSet().isEmpty());
  }

  /**
   * Test Builder {@link Builder#createPredicatedSet()}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#createPredicatedSet()}
   */
  @Test
  @DisplayName(
      "Test Builder createPredicatedSet(); given Predicate test(Object) return 'true'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Builder.createPredicatedSet()"})
  void testBuilderCreatePredicatedSet_givenPredicateTestReturnTrue_thenReturnSizeIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Builder<Object> builderResult = PredicatedCollection.builder(predicate);
    builderResult.add("Item");

    // Act
    Set<Object> actualCreatePredicatedSetResult = builderResult.createPredicatedSet();

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(1, actualCreatePredicatedSetResult.size());
  }

  /**
   * Test Builder {@link Builder#Builder(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return createPredicatedBag Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#Builder(Predicate)}
   */
  @Test
  @DisplayName(
      "Test Builder new Builder(Predicate); when Predicate; then return createPredicatedBag Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Builder.<init>(Predicate)"})
  void testBuilderNewBuilder_whenPredicate_thenReturnCreatePredicatedBagEmpty() {
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
   *
   * <p>Method under test: {@link Builder#rejectedElements()}
   */
  @Test
  @DisplayName("Test Builder rejectedElements()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection Builder.rejectedElements()"})
  void testBuilderRejectedElements() {
    // Arrange
    Builder<Object> builderResult = PredicatedCollection.builder(mock(Predicate.class));

    // Act and Assert
    assertTrue(builderResult.rejectedElements().isEmpty());
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"
  })
  void testPredicatedCollection_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedCollection.predicatedCollection(coll, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedCollection(Collection, Predicate); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"
  })
  void testPredicatedCollection_givenIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> PredicatedCollection.predicatedCollection(coll, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); given 'true'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"
  })
  void testPredicatedCollection_givenTrue_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollectionResult =
        PredicatedCollection.predicatedCollection(coll, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); given 'true'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"
  })
  void testPredicatedCollection_givenTrue_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollectionResult =
        PredicatedCollection.predicatedCollection(coll, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedCollectionResult.size());
  }

  /**
   * Test {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#predicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedCollection(Collection, Predicate); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PredicatedCollection PredicatedCollection.predicatedCollection(Collection, Predicate)"
  })
  void testPredicatedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedCollection<Object> actualPredicatedCollectionResult =
        PredicatedCollection.predicatedCollection(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedCollectionResult.isEmpty());
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedCollection(Collection, Predicate); given 'false'; when Predicate test(Object) return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  void testNewPredicatedCollection_givenFalse_whenPredicateTestReturnFalse() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new PredicatedCollection<>(collection, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedCollection(Collection, Predicate); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  void testNewPredicatedCollection_givenIllegalArgumentException() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new PredicatedCollection<>(collection, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedCollection(Collection, Predicate); given 'true'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  void testNewPredicatedCollection_givenTrue_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollection =
        new PredicatedCollection<>(collection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(1, actualPredicatedCollection.size());
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedCollection(Collection, Predicate); given 'true'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  void testNewPredicatedCollection_givenTrue_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedCollection<Object> actualPredicatedCollection =
        new PredicatedCollection<>(collection, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(2, actualPredicatedCollection.size());
  }

  /**
   * Test {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PredicatedCollection#PredicatedCollection(Collection, Predicate)}
   */
  @Test
  @DisplayName(
      "Test new PredicatedCollection(Collection, Predicate); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PredicatedCollection.<init>(Collection, Predicate)"})
  void testNewPredicatedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    PredicatedCollection<Object> actualPredicatedCollection =
        new PredicatedCollection<>(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedCollection.isEmpty());
  }
}
