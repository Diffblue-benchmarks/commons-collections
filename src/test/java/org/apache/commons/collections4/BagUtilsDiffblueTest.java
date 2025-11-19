package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BagUtilsDiffblueTest {
  /**
   * Test {@link BagUtils#collectionBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  @DisplayName("Test collectionBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.collectionBag(Bag)"})
  void testCollectionBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link BagUtils#collectionBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  @DisplayName("Test collectionBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.collectionBag(Bag)"})
  void testCollectionBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link BagUtils#collectionBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  @DisplayName("Test collectionBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.collectionBag(Bag)"})
  void testCollectionBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link BagUtils#emptyBag()}.
   *
   * <p>Method under test: {@link BagUtils#emptyBag()}
   */
  @Test
  @DisplayName("Test emptyBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.emptyBag()"})
  void testEmptyBag() {
    // Arrange and Act
    Bag<Object> actualEmptyBagResult = BagUtils.emptyBag();

    // Assert
    assertTrue(actualEmptyBagResult.isEmpty());
  }

  /**
   * Test {@link BagUtils#emptySortedBag()}.
   *
   * <p>Method under test: {@link BagUtils#emptySortedBag()}
   */
  @Test
  @DisplayName("Test emptySortedBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.emptySortedBag()"})
  void testEmptySortedBag() {
    // Arrange and Act
    SortedBag<Object> actualEmptySortedBagResult = BagUtils.emptySortedBag();

    // Assert
    assertTrue(actualEmptySortedBagResult.isEmpty());
  }

  /**
   * Test {@link BagUtils#predicatedBag(Bag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#predicatedBag(Bag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedBag(Bag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.predicatedBag(Bag, Predicate)"})
  void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Bag<Object> actualPredicatedBagResult = BagUtils.predicatedBag(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedBag(Bag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#predicatedBag(Bag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedBag(Bag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.predicatedBag(Bag, Predicate)"})
  void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Bag<Object> actualPredicatedBagResult = BagUtils.predicatedBag(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedBag(Bag, Predicate)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#predicatedBag(Bag, Predicate)}
   */
  @Test
  @DisplayName("Test predicatedBag(Bag, Predicate); when HashBag(); then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.predicatedBag(Bag, Predicate)"})
  void testPredicatedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualPredicatedBagResult = BagUtils.predicatedBag(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.predicatedSortedBag(SortedBag, Predicate)"})
  void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedBag<Object> actualPredicatedSortedBagResult =
        BagUtils.predicatedSortedBag(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.predicatedSortedBag(SortedBag, Predicate)"})
  void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedBag<Object> actualPredicatedSortedBagResult =
        BagUtils.predicatedSortedBag(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @DisplayName(
      "Test predicatedSortedBag(SortedBag, Predicate); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.predicatedSortedBag(SortedBag, Predicate)"})
  void testPredicatedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualPredicatedSortedBagResult =
        BagUtils.predicatedSortedBag(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.synchronizedBag(Bag)"})
  void testSynchronizedBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.synchronizedBag(Bag)"})
  void testSynchronizedBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  @DisplayName("Test synchronizedBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.synchronizedBag(Bag)"})
  void testSynchronizedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test synchronizedSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.synchronizedSortedBag(SortedBag)"})
  void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test synchronizedSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.synchronizedSortedBag(SortedBag)"})
  void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test synchronizedSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.synchronizedSortedBag(SortedBag)"})
  void testSynchronizedSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#transformingBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#transformingBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.transformingBag(Bag, Transformer)"})
  void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult =
        BagUtils.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link BagUtils#transformingBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#transformingBag(Bag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingBag(Bag, Transformer); given 'Object'; when HashBag() add 'Object'; then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.transformingBag(Bag, Transformer)"})
  void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult =
        BagUtils.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link BagUtils#transformingBag(Bag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#transformingBag(Bag, Transformer)}
   */
  @Test
  @DisplayName("Test transformingBag(Bag, Transformer); when HashBag(); then return HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.transformingBag(Bag, Transformer)"})
  void testTransformingBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualTransformingBagResult =
        BagUtils.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedBag(SortedBag, Transformer); given 'Object'; when TreeBag() add 'Object'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.transformingSortedBag(SortedBag, Transformer)"})
  void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualTransformingSortedBagResult =
        BagUtils.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedBag(SortedBag, Transformer); given 'Object'; when TreeBag() add 'Object'; then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.transformingSortedBag(SortedBag, Transformer)"})
  void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualTransformingSortedBagResult =
        BagUtils.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   *   <li>Then return {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingSortedBag(SortedBag, Transformer); when TreeBag(); then return TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.transformingSortedBag(SortedBag, Transformer)"})
  void testTransformingSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualTransformingSortedBagResult =
        BagUtils.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  @DisplayName("Test unmodifiableBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.unmodifiableBag(Bag)"})
  void testUnmodifiableBag_givenObject_whenHashBagAddObject() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableBag(Bag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  @DisplayName("Test unmodifiableBag(Bag); given 'Object'; when HashBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.unmodifiableBag(Bag)"})
  void testUnmodifiableBag_givenObject_whenHashBagAddObject2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableBag(Bag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  @DisplayName("Test unmodifiableBag(Bag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Bag BagUtils.unmodifiableBag(Bag)"})
  void testUnmodifiableBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.unmodifiableSortedBag(SortedBag)"})
  void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBag(SortedBag); given 'Object'; when TreeBag() add 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.unmodifiableSortedBag(SortedBag)"})
  void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableSortedBag(SortedBag)}.
   *
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @DisplayName("Test unmodifiableSortedBag(SortedBag); when TreeBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SortedBag BagUtils.unmodifiableSortedBag(SortedBag)"})
  void testUnmodifiableSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }
}
