package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class BagUtilsDiffblueTest {
  /**
   * Test {@link BagUtils#collectionBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.collectionBag(Bag)"})
  public void testCollectionBag_givenObject_whenHashBagAddObject() {
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.collectionBag(Bag)"})
  public void testCollectionBag_givenObject_whenHashBagAddObject2() {
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
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#collectionBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.collectionBag(Bag)"})
  public void testCollectionBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualCollectionBagResult = BagUtils.collectionBag(bag);

    // Assert
    assertEquals(bag, actualCollectionBagResult);
  }

  /**
   * Test {@link BagUtils#emptyBag()}.
   * <p>
   * Method under test: {@link BagUtils#emptyBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.emptyBag()"})
  public void testEmptyBag() {
    // Arrange and Act
    Bag<Object> actualEmptyBagResult = BagUtils.emptyBag();

    // Assert
    assertTrue(actualEmptyBagResult.isEmpty());
  }

  /**
   * Test {@link BagUtils#emptySortedBag()}.
   * <p>
   * Method under test: {@link BagUtils#emptySortedBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.emptySortedBag()"})
  public void testEmptySortedBag() {
    // Arrange and Act
    SortedBag<Object> actualEmptySortedBagResult = BagUtils.emptySortedBag();

    // Assert
    assertTrue(actualEmptySortedBagResult.isEmpty());
  }

  /**
   * Test {@link BagUtils#predicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#predicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.predicatedBag(Bag, Predicate)"})
  public void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#predicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.predicatedBag(Bag, Predicate)"})
  public void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
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
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#predicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.predicatedBag(Bag, Predicate)"})
  public void testPredicatedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualPredicatedBagResult = BagUtils.predicatedBag(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.predicatedSortedBag(SortedBag, Predicate)"})
  public void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedBag<Object> actualPredicatedSortedBagResult = BagUtils.predicatedSortedBag(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.predicatedSortedBag(SortedBag, Predicate)"})
  public void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    SortedBag<Object> actualPredicatedSortedBagResult = BagUtils.predicatedSortedBag(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.predicatedSortedBag(SortedBag, Predicate)"})
  public void testPredicatedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualPredicatedSortedBagResult = BagUtils.predicatedSortedBag(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.synchronizedBag(Bag)"})
  public void testSynchronizedBag_givenObject_whenHashBagAddObject() {
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.synchronizedBag(Bag)"})
  public void testSynchronizedBag_givenObject_whenHashBagAddObject2() {
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
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#synchronizedBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.synchronizedBag(Bag)"})
  public void testSynchronizedBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualSynchronizedBagResult = BagUtils.synchronizedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedBagResult);
  }

  /**
   * Test {@link BagUtils#synchronizedSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.synchronizedSortedBag(SortedBag)"})
  public void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject() {
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.synchronizedSortedBag(SortedBag)"})
  public void testSynchronizedSortedBag_givenObject_whenTreeBagAddObject2() {
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
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#synchronizedSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.synchronizedSortedBag(SortedBag)"})
  public void testSynchronizedSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualSynchronizedSortedBagResult = BagUtils.synchronizedSortedBag(bag);

    // Assert
    assertEquals(bag, actualSynchronizedSortedBagResult);
  }

  /**
   * Test {@link BagUtils#transformingBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#transformingBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.transformingBag(Bag, Transformer)"})
  public void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult = BagUtils.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link BagUtils#transformingBag(Bag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#transformingBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.transformingBag(Bag, Transformer)"})
  public void testTransformingBag_givenObject_whenHashBagAddObject_thenReturnHashBag2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    Bag<Object> actualTransformingBagResult = BagUtils.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link BagUtils#transformingBag(Bag, Transformer)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#transformingBag(Bag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.transformingBag(Bag, Transformer)"})
  public void testTransformingBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualTransformingBagResult = BagUtils.transformingBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingBagResult);
  }

  /**
   * Test {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.transformingSortedBag(SortedBag, Transformer)"})
  public void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualTransformingSortedBagResult = BagUtils.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.transformingSortedBag(SortedBag, Transformer)"})
  public void testTransformingSortedBag_givenObject_whenTreeBagAddObject_thenReturnTreeBag2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualTransformingSortedBagResult = BagUtils.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#transformingSortedBag(SortedBag, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.transformingSortedBag(SortedBag, Transformer)"})
  public void testTransformingSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualTransformingSortedBagResult = BagUtils.transformingSortedBag(bag, mock(Transformer.class));

    // Assert
    assertEquals(bag, actualTransformingSortedBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableBag(Bag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.unmodifiableBag(Bag)"})
  public void testUnmodifiableBag_givenObject_whenHashBagAddObject() {
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.unmodifiableBag(Bag)"})
  public void testUnmodifiableBag_givenObject_whenHashBagAddObject2() {
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
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#unmodifiableBag(Bag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Bag BagUtils.unmodifiableBag(Bag)"})
  public void testUnmodifiableBag_whenHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    Bag<Object> actualUnmodifiableBagResult = BagUtils.unmodifiableBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableBagResult);
  }

  /**
   * Test {@link BagUtils#unmodifiableSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.unmodifiableSortedBag(SortedBag)"})
  public void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject() {
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
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.unmodifiableSortedBag(SortedBag)"})
  public void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject2() {
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
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BagUtils#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag BagUtils.unmodifiableSortedBag(SortedBag)"})
  public void testUnmodifiableSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = BagUtils.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }
}
