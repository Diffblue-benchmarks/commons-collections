package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.AbstractMapBag.BagIterator;
import org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractMapBagDiffblueTest {
  /**
   * Test {@link AbstractMapBag#add(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When two.
   *   <li>Then {@link HashBag#HashBag()} size is three.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  @DisplayName(
      "Test add(Object, int) with 'object', 'nCopies'; given HashBag() add 'Object'; when two; then HashBag() size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object, int)"})
  void testAddWithObjectNCopies_givenHashBagAddObject_whenTwo_thenHashBagSizeIsThree() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualAddResult = hashBag.add("Object", 2);

    // Assert
    assertEquals(3, hashBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#add(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When two.
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  @DisplayName(
      "Test add(Object, int) with 'object', 'nCopies'; given HashBag(); when two; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object, int)"})
  void testAddWithObjectNCopies_givenHashBag_whenTwo_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    boolean actualAddResult = hashBag.add("Object", 2);

    // Assert
    assertEquals(2, hashBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#add(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When zero.
   *   <li>Then {@link HashBag#HashBag()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#add(Object, int)}
   */
  @Test
  @DisplayName(
      "Test add(Object, int) with 'object', 'nCopies'; given HashBag(); when zero; then HashBag() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object, int)"})
  void testAddWithObjectNCopies_givenHashBag_whenZero_thenHashBagEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.add("Object", 0));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#add(Object)} with {@code object}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#add(Object)}
   */
  @Test
  @DisplayName(
      "Test add(Object) with 'object'; given HashBag() add 'Object'; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object)"})
  void testAddWithObject_givenHashBagAddObject_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualAddResult = hashBag.add("Object");

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#add(Object)} with {@code object}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then {@link HashBag#HashBag()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object) with 'object'; given HashBag(); then HashBag() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.add(Object)"})
  void testAddWithObject_givenHashBag_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    boolean actualAddResult = hashBag.add("Object");

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given HashBag() add '42'; when ArrayList() add '42'; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  void testAddAll_givenHashBagAdd42_whenArrayListAdd42_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link HashBag#HashBag()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given HashBag(); when ArrayList() add '42'; then HashBag() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  void testAddAll_givenHashBag_whenArrayListAdd42_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test addAll(Collection); given HashBag(); when ArrayList() add '42'; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  void testAddAll_givenHashBag_whenArrayListAdd42_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = hashBag.addAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link AbstractMapBag#addAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link HashBag#HashBag()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given HashBag(); when ArrayList(); then HashBag() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.addAll(Collection)"})
  void testAddAll_givenHashBag_whenArrayList_thenHashBagEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.addAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test BagIterator {@link BagIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BagIterator#hasNext()}
   */
  @Test
  @DisplayName("Test BagIterator hasNext(); given HashBag() add 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BagIterator.hasNext()"})
  void testBagIteratorHasNext_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    BagIterator<Object> bagIterator = new BagIterator<>(parent);

    // Act and Assert
    assertTrue(bagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BagIterator#hasNext()}
   */
  @Test
  @DisplayName("Test BagIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BagIterator.hasNext()"})
  void testBagIteratorHasNext_thenReturnFalse() {
    // Arrange
    BagIterator<Object> bagIterator = new BagIterator<>(new HashBag<>());

    // Act and Assert
    assertFalse(bagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#BagIterator(AbstractMapBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return next is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  @DisplayName(
      "Test BagIterator new BagIterator(AbstractMapBag); given 'Object'; then return next is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BagIterator.<init>(AbstractMapBag)"})
  void testBagIteratorNewBagIterator_givenObject_thenReturnNextIsObject() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");

    // Act
    BagIterator<Object> actualBagIterator = new BagIterator<>(parent);

    // Assert
    assertEquals("Object", actualBagIterator.next());
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#BagIterator(AbstractMapBag)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return next is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  @DisplayName(
      "Test BagIterator new BagIterator(AbstractMapBag); given 'Object'; then return next is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BagIterator.<init>(AbstractMapBag)"})
  void testBagIteratorNewBagIterator_givenObject_thenReturnNextIsObject2() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    parent.add("Object");

    // Act
    BagIterator<Object> actualBagIterator = new BagIterator<>(parent);

    // Assert
    assertEquals("Object", actualBagIterator.next());
    assertEquals("Object", actualBagIterator.next());
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#BagIterator(AbstractMapBag)}.
   *
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link BagIterator#BagIterator(AbstractMapBag)}
   */
  @Test
  @DisplayName("Test BagIterator new BagIterator(AbstractMapBag); when HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BagIterator.<init>(AbstractMapBag)"})
  void testBagIteratorNewBagIterator_whenHashBag() {
    // Arrange and Act
    BagIterator<Object> actualBagIterator = new BagIterator<>(new HashBag<>());

    // Assert
    assertFalse(actualBagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link BagIterator#next()}
   */
  @Test
  @DisplayName("Test BagIterator next(); given HashBag() add 'Object'; then return 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BagIterator.next()"})
  void testBagIteratorNext_givenHashBagAddObject_thenReturnObject() {
    // Arrange
    HashBag<Object> parent = new HashBag<>();
    parent.add("Object");
    BagIterator<Object> bagIterator = new BagIterator<>(parent);

    // Act and Assert
    assertEquals("Object", bagIterator.next());
    assertFalse(bagIterator.hasNext());
  }

  /**
   * Test BagIterator {@link BagIterator#remove()}.
   *
   * <p>Method under test: {@link BagIterator#remove()}
   */
  @Test
  @DisplayName("Test BagIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BagIterator.remove()"})
  void testBagIteratorRemove() {
    // Arrange
    BagIterator<Object> bagIterator = new BagIterator<>(new HashBag<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> bagIterator.remove());
  }

  /**
   * Test {@link AbstractMapBag#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given HashBag() add 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.contains(Object)"})
  void testContains_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertTrue(hashBag.contains("Object"));
  }

  /**
   * Test {@link AbstractMapBag#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given HashBag(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.contains(Object)"})
  void testContains_givenHashBag_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.contains("Object"));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection) with 'coll'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  void testContainsAllWithColl_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.containsAll(coll));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection) with 'coll'; given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  void testContainsAllWithColl_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.containsAll(coll));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection) with 'coll'; given HashBag() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  void testContainsAllWithColl_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertTrue(hashBag.containsAll(coll));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection) with 'coll'; given HashBag(); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  void testContainsAllWithColl_givenHashBag_whenArrayList_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Collection) with 'coll'; given HashBag(); when HashBag(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Collection)"})
  void testContainsAllWithColl_givenHashBag_whenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll((Collection<?>) new HashBag<>()));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Bag) with 'other'; given HashBag() add 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  void testContainsAllWithOther_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertTrue(hashBag.containsAll(other));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Bag) with 'other'; given HashBag(); when HashBag() add 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  void testContainsAllWithOther_givenHashBag_whenHashBagAddObject_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.containsAll(other));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Bag) with 'other'; given HashBag(); when HashBag() add 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  void testContainsAllWithOther_givenHashBag_whenHashBagAddObject_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.containsAll(other));
  }

  /**
   * Test {@link AbstractMapBag#containsAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#containsAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test containsAll(Bag) with 'other'; given HashBag(); when HashBag(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.containsAll(Bag)"})
  void testContainsAllWithOther_givenHashBag_whenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.containsAll(new HashBag<>()));
  }

  /**
   * Test {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(Map, ObjectInputStream); given 'Object'; then HashMap() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapBag.doReadObject(Map, ObjectInputStream)"})
  void testDoReadObject_givenObject_thenHashMapSizeIsOne()
      throws IOException, ClassNotFoundException {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashMap<Object, MutableInteger> map = new HashMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("Object");
    when(in.readInt()).thenReturn(1);

    // Act
    hashBag.doReadObject(map, in);

    // Assert
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
    assertEquals(1, map.size());
    assertEquals(1, hashBag.size());
    assertEquals(1, map.get("Object").value);
  }

  /**
   * Test {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(Map, ObjectInputStream); given zero; then HashMap() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapBag.doReadObject(Map, ObjectInputStream)"})
  void testDoReadObject_givenZero_thenHashMapEmpty() throws IOException, ClassNotFoundException {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashMap<Object, MutableInteger> map = new HashMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readInt()).thenReturn(0);

    // Act
    hashBag.doReadObject(map, in);

    // Assert that nothing has changed
    verify(in).readInt();
    assertTrue(map.isEmpty());
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}.
   *
   * <ul>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readInt()} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(Map, ObjectInputStream); when ObjectInputStream readInt() throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapBag.doReadObject(Map, ObjectInputStream)"})
  void testDoReadObject_whenObjectInputStreamReadIntThrowIOException()
      throws IOException, ClassNotFoundException {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashMap<Object, MutableInteger> map = new HashMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readInt()).thenThrow(new IOException());

    // Act and Assert
    assertThrows(IOException.class, () -> hashBag.doReadObject(map, in));
    verify(in).readInt();
  }

  /**
   * Test {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}.
   *
   * <ul>
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readObject()} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#doReadObject(Map, ObjectInputStream)}
   */
  @Test
  @DisplayName(
      "Test doReadObject(Map, ObjectInputStream); when ObjectInputStream readObject() throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapBag.doReadObject(Map, ObjectInputStream)"})
  void testDoReadObject_whenObjectInputStreamReadObjectThrowIOException()
      throws IOException, ClassNotFoundException {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashMap<Object, MutableInteger> map = new HashMap<>();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IOException());
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IOException.class, () -> hashBag.doReadObject(map, in));
    verify(in).readInt();
    verify(in).readObject();
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}, and {@link AbstractMapBag#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> hashBag2 = new HashBag<>();

    // Act and Assert
    assertEquals(hashBag, hashBag2);
    assertEquals(hashBag.hashCode(), hashBag2.hashCode());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}, and {@link AbstractMapBag#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    // Act and Assert
    assertEquals(hashBag, hashBag2);
    assertEquals(hashBag.hashCode(), hashBag2.hashCode());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}, and {@link AbstractMapBag#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractMapBag#equals(Object)}
   *   <li>{@link AbstractMapBag#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(hashBag, hashBag);
    int expectedHashCodeResult = hashBag.hashCode();
    assertEquals(expectedHashCodeResult, hashBag.hashCode());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertNotEquals(hashBag, new HashBag<>());
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(2);

    // Act and Assert
    assertNotEquals(hashBag, hashBag2);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add("Object");

    // Act and Assert
    assertNotEquals(hashBag, hashBag2);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(null);

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(new HashBag<>());

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(0);
    hashBag.add("Object");

    HashBag<Object> hashBag2 = new HashBag<>();
    hashBag2.add(hashBag);

    HashBag<Object> hashBag3 = new HashBag<>();
    hashBag3.add("Object");

    // Act and Assert
    assertNotEquals(hashBag2, hashBag3);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertNotEquals(hashBag, null);
  }

  /**
   * Test {@link AbstractMapBag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.equals(Object)", "int AbstractMapBag.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertNotEquals(hashBag, "Different type to AbstractMapBag");
  }

  /**
   * Test {@link AbstractMapBag#getCount(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#getCount(Object)}
   */
  @Test
  @DisplayName("Test getCount(Object); given HashBag() add 'Object'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractMapBag.getCount(Object)"})
  void testGetCount_givenHashBagAddObject_thenReturnOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertEquals(1, hashBag.getCount("Object"));
  }

  /**
   * Test {@link AbstractMapBag#getCount(Object)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#getCount(Object)}
   */
  @Test
  @DisplayName("Test getCount(Object); given HashBag(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractMapBag.getCount(Object)"})
  void testGetCount_givenHashBag_thenReturnZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.getCount("Object"));
  }

  /**
   * Test {@link AbstractMapBag#getMap()}.
   *
   * <p>Method under test: {@link AbstractMapBag#getMap()}
   */
  @Test
  @DisplayName("Test getMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map AbstractMapBag.getMap()"})
  void testGetMap() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashBag() add 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.isEmpty()"})
  void testIsEmpty_givenHashBagAddObject_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertFalse(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashBag(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.isEmpty()"})
  void testIsEmpty_givenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#iterator()}.
   *
   * <p>Method under test: {@link AbstractMapBag#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterator AbstractMapBag.iterator()"})
  void testIterator() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act
    Iterator<Object> actualIteratorResult = hashBag.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof BagIterator);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}, and {@link
   * MutableInteger#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MutableInteger#equals(Object)}
   *   <li>{@link MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test MutableInteger equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(42);
    MutableInteger mutableInteger2 = new MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger2);
    assertEquals(mutableInteger.hashCode(), mutableInteger2.hashCode());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}, and {@link
   * MutableInteger#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MutableInteger#equals(Object)}
   *   <li>{@link MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test MutableInteger equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger.hashCode());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(1);

    // Act and Assert
    assertNotEquals(mutableInteger, new MutableInteger(42));
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), null);
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test MutableInteger equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), "Different type to MutableInteger");
  }

  /**
   * Test MutableInteger {@link MutableInteger#MutableInteger(int)}.
   *
   * <p>Method under test: {@link MutableInteger#MutableInteger(int)}
   */
  @Test
  @DisplayName("Test MutableInteger new MutableInteger(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MutableInteger.<init>(int)"})
  void testMutableIntegerNewMutableInteger() {
    // Arrange, Act and Assert
    assertEquals(42, new MutableInteger(42).value);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When one.
   *   <li>Then {@link HashBag#HashBag()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @DisplayName(
      "Test remove(Object, int) with 'object', 'nCopies'; given HashBag() add 'Object'; when one; then HashBag() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  void testRemoveWithObjectNCopies_givenHashBagAddObject_whenOne_thenHashBagEmpty() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 1);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When one.
   *   <li>Then {@link HashBag#HashBag()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @DisplayName(
      "Test remove(Object, int) with 'object', 'nCopies'; given HashBag() add 'Object'; when one; then HashBag() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  void testRemoveWithObjectNCopies_givenHashBagAddObject_whenOne_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 1);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When zero.
   *   <li>Then {@link HashBag#HashBag()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @DisplayName(
      "Test remove(Object, int) with 'object', 'nCopies'; given HashBag() add 'Object'; when zero; then HashBag() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  void testRemoveWithObjectNCopies_givenHashBagAddObject_whenZero_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object", 0);

    // Assert
    assertEquals(1, hashBag.size());
    assertFalse(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object, int)} with {@code object}, {@code nCopies}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#remove(Object, int)}
   */
  @Test
  @DisplayName(
      "Test remove(Object, int) with 'object', 'nCopies'; given HashBag(); when one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object, int)"})
  void testRemoveWithObjectNCopies_givenHashBag_whenOne_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.remove("Object", 1));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#remove(Object)} with {@code object}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object) with 'object'; given HashBag() add 'Object'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object)"})
  void testRemoveWithObject_givenHashBagAddObject_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRemoveResult = hashBag.remove("Object");

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapBag#remove(Object)} with {@code object}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object) with 'object'; given HashBag(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.remove(Object)"})
  void testRemoveWithObject_givenHashBag_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.remove("Object"));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link HashBag#HashBag()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given HashBag() add '42'; when ArrayList() add '42'; then HashBag() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBagAdd42_whenArrayListAdd42_thenHashBagSizeIsOne() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertEquals(1, hashBag.size());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given HashBag() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given HashBag() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashBag.removeAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given HashBag(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBag_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.removeAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test removeAll(Collection); given HashBag(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBag_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.removeAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given HashBag(); when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBag_whenArrayList_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.removeAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#removeAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection); given HashBag(); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.removeAll(Collection)"})
  void testRemoveAll_givenHashBag_whenNull_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.removeAll(null));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag() add '42'; when ArrayList() add '42'; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBagAdd42_whenArrayListAdd42_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(coll);

    // Assert
    assertEquals(2, hashBag.size());
    assertFalse(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag() add '42'; when ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBagAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(coll);

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag() add 'Object'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBagAddObject_whenArrayList_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(new ArrayList<>());

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag() add 'Object'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBagAddObject_whenArrayList_thenReturnTrue2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(new ArrayList<>());

    // Assert
    assertTrue(hashBag.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBag_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.retainAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag(); when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBag_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashBag.retainAll(coll));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag(); when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBag_whenArrayList_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll(new ArrayList<>()));
    assertTrue(hashBag.isEmpty());
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Collection)} with {@code coll}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then {@link HashBag#HashBag()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection) with 'coll'; given HashBag(); when HashBag(); then HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Collection)"})
  void testRetainAllWithColl_givenHashBag_whenHashBag_thenHashBag() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> coll = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll((Collection<?>) coll));
    assertEquals(hashBag, coll);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Bag) with 'other'; given HashBag() add 'Object'; when HashBag(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  void testRetainAllWithOther_givenHashBagAddObject_whenHashBag_thenReturnTrue() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Bag) with 'other'; given HashBag() add 'Object'; when HashBag(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  void testRetainAllWithOther_givenHashBagAddObject_whenHashBag_thenReturnTrue2() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>When {@link HashBag#HashBag()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Bag) with 'other'; given HashBag(); when HashBag(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  void testRetainAllWithOther_givenHashBag_whenHashBag_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    HashBag<Object> other = new HashBag<>();

    // Act and Assert
    assertFalse(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then {@link HashBag#HashBag()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Bag) with 'other'; given 'Object'; when HashBag() add 'Object'; then HashBag() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  void testRetainAllWithOther_givenObject_whenHashBagAddObject_thenHashBagSizeIsTwo() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");
    other.add("Object");

    // Act
    boolean actualRetainAllResult = hashBag.retainAll(other);

    // Assert
    assertEquals(2, other.size());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Test {@link AbstractMapBag#retainAll(Bag)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#retainAll(Bag)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Bag) with 'other'; given 'Object'; when HashBag() add 'Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapBag.retainAll(Bag)"})
  void testRetainAllWithOther_givenObject_whenHashBagAddObject_thenReturnFalse() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    HashBag<Object> other = new HashBag<>();
    other.add("Object");

    // Act and Assert
    assertFalse(hashBag.retainAll(other));
    assertEquals(hashBag, other);
  }

  /**
   * Test {@link AbstractMapBag#size()}.
   *
   * <p>Method under test: {@link AbstractMapBag#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractMapBag.size()"})
  void testSize() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.size());
  }

  /**
   * Test {@link AbstractMapBag#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then first element is {@code Array}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given HashBag() add 'Object'; then first element is 'Array'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] AbstractMapBag.toArray(Object[])"})
  void testToArrayWithObject_givenHashBagAddObject_thenFirstElementIsArray() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    hashBag.add("Object");
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertEquals("Array", array[0]);
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", actualToArrayResult[1]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link AbstractMapBag#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then first element is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given HashBag() add 'Object'; then first element is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] AbstractMapBag.toArray(Object[])"})
  void testToArrayWithObject_givenHashBagAddObject_thenFirstElementIsObject() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertEquals("Object", array[0]);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Test {@link AbstractMapBag#toArray(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then first element is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toArray(Object[])}
   */
  @Test
  @DisplayName(
      "Test toArray(Object[]) with 'Object[]'; given HashBag(); then first element is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] AbstractMapBag.toArray(Object[])"})
  void testToArrayWithObject_givenHashBag_thenFirstElementIsNull() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    Object[] array = new Object[] {"Array"};

    // Act
    Object[] actualToArrayResult = hashBag.toArray(array);

    // Assert
    assertNull(array[0]);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Test {@link AbstractMapBag#toArray()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return first element is {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toArray()}
   */
  @Test
  @DisplayName(
      "Test toArray(); given HashBag() add 'Object'; then return first element is 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] AbstractMapBag.toArray()"})
  void testToArray_givenHashBagAddObject_thenReturnFirstElementIsObject() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act
    Object[] actualToArrayResult = hashBag.toArray();

    // Assert
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Test {@link AbstractMapBag#toArray()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given HashBag(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] AbstractMapBag.toArray()"})
  void testToArray_givenHashBag_thenReturnArrayLengthIsZero() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals(0, hashBag.toArray().length);
  }

  /**
   * Test {@link AbstractMapBag#toString()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add {@code Object}.
   *   <li>Then return {@code [1:Object]}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  @DisplayName("Test toString(); given HashBag() add 'Object'; then return '[1:Object]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMapBag.toString()"})
  void testToString_givenHashBagAddObject_thenReturn1Object() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add("Object");

    // Act and Assert
    assertEquals("[1:Object]", hashBag.toString());
  }

  /**
   * Test {@link AbstractMapBag#toString()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()} add two.
   *   <li>Then return {@code [1:2,1:Object]}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  @DisplayName("Test toString(); given HashBag() add two; then return '[1:2,1:Object]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMapBag.toString()"})
  void testToString_givenHashBagAddTwo_thenReturn121Object() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();
    hashBag.add(2);
    hashBag.add("Object");

    // Act and Assert
    assertEquals("[1:2,1:Object]", hashBag.toString());
  }

  /**
   * Test {@link AbstractMapBag#toString()}.
   *
   * <ul>
   *   <li>Given {@link HashBag#HashBag()}.
   *   <li>Then return {@code []}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapBag#toString()}
   */
  @Test
  @DisplayName("Test toString(); given HashBag(); then return '[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AbstractMapBag.toString()"})
  void testToString_givenHashBag_thenReturnLeftSquareBracketRightSquareBracket() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertEquals("[]", hashBag.toString());
  }

  /**
   * Test {@link AbstractMapBag#uniqueSet()}.
   *
   * <p>Method under test: {@link AbstractMapBag#uniqueSet()}
   */
  @Test
  @DisplayName("Test uniqueSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractMapBag.uniqueSet()"})
  void testUniqueSet() {
    // Arrange
    HashBag<Object> hashBag = new HashBag<>();

    // Act and Assert
    assertTrue(hashBag.uniqueSet().isEmpty());
  }
}
