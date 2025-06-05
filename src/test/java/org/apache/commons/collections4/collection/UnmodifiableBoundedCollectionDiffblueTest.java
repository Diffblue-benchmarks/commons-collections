package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableBoundedCollectionDiffblueTest {
  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code Element}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  @DisplayName("Test unmodifiableBoundedCollection(BoundedCollection) with 'coll'; given 'Element'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(BoundedCollection)"})
  void testUnmodifiableBoundedCollectionWithColl_givenElement_thenReturnSizeIsOne() {
    // Arrange
    CircularFifoQueue<Object> coll = new CircularFifoQueue<>();
    coll.add("Element");

    // Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) coll);

    // Assert
    assertEquals(1, actualUnmodifiableBoundedCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code Element}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  @DisplayName("Test unmodifiableBoundedCollection(BoundedCollection) with 'coll'; given 'Element'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(BoundedCollection)"})
  void testUnmodifiableBoundedCollectionWithColl_givenElement_thenReturnSizeIsTwo() {
    // Arrange
    CircularFifoQueue<Object> coll = new CircularFifoQueue<>();
    coll.add("Element");
    coll.add("Element");

    // Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) coll);

    // Assert
    assertEquals(2, actualUnmodifiableBoundedCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)} with {@code coll}.
   * <ul>
   *   <li>When {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  @DisplayName("Test unmodifiableBoundedCollection(BoundedCollection) with 'coll'; when CircularFifoQueue(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(BoundedCollection)"})
  void testUnmodifiableBoundedCollectionWithColl_whenCircularFifoQueue_thenReturnEmpty() {
    // Arrange and Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) new CircularFifoQueue<>());

    // Assert
    assertTrue(actualUnmodifiableBoundedCollectionResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)} with {@code collection}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableBoundedCollection(Collection) with 'collection'; given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(Collection)"})
  void testUnmodifiableBoundedCollectionWithCollection_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection));
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)} with {@code collection}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableBoundedCollection(Collection) with 'collection'; given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(Collection)"})
  void testUnmodifiableBoundedCollectionWithCollection_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection));
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)} with {@code collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableBoundedCollection(Collection) with 'collection'; when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(Collection)"})
  void testUnmodifiableBoundedCollectionWithCollection_whenArrayList() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(new ArrayList<>()));
  }
}
